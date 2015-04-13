package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.uni_paderborn.fujaba.export.operation.AbstractFujabaExportOperation;
import de.uni_paderborn.fujaba.export.operation.IFujabaExportOperation;
import de.uni_paderborn.fujaba.export.wizard.AbstractFujabaExportWizard;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.protocol.CoordinationProtocol;

public class PatternVerificationWizard extends AbstractFujabaExportWizard {

	CoordinationPattern selectedPattern;
	PatternVerificationWizardPage2 p2;
	CoordinationProtocol protocolFromSelectedPattern;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		// TODO Auto-generated method stub
		super.init(workbench, currentSelection);
		selectedPattern = (CoordinationPattern) ((View) ((EditPart) currentSelection
				.iterator().next()).getModel()).getElement();
		this.setWindowTitle("Pattern Verification Wizard");
	}

	@Override
	public String wizardGetId() {
		// TODO Auto-generated method stub
		return "de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard.PatternVerificationWizard";
	}

	@Override
	public void addPages() {
		// TODO Auto-generated method stub
		super.addPages();
		p2 = new PatternVerificationWizardPage2(
				"SelectLegalConfiguration",
				"Step 2: Manual definition of a legal configuration",
				"On this page you can alter the values of the chosen LegalConfiguration or define your own configuration. "
						+ "If your configuration is complete, press the Finish-Button in order to start the Model Checking.",
				selectedPattern, toolkit);
		PatternVerificationWizardPage1 p1 = new PatternVerificationWizardPage1(
				"DefineLegalConfiguration",
				"Step 1: Choose a Legal Configuration",
				"On this page you can select a LegalConfiguration for the parameters. The chosen configuration is used by the Uppaal Model Checking."
						+ "If you do not want to chooes a LegalConfiguraion, you can also define a configuration manually on the next page.",

				selectedPattern, toolkit, p2);

		this.addPage(p1);
		this.addPage(p2);
	}

	@Override
	public IFujabaExportOperation wizardCreateExportOperation() {
		// TODO Auto-generated method stub
		return new AbstractFujabaExportOperation() {
			@Override
			protected IStatus doExecute(IProgressMonitor progressMonitor) {
				return Status.OK_STATUS;
			}
		};
	}
	
	public CoordinationProtocol getTransformedCoordinationProtocolFromCoordinationPattern()
	{
		return this.protocolFromSelectedPattern;
	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		super.performFinish();

		//PatternToProtocolTransformation.saveInput(selectedPattern, (RootNode)selectedPattern.eContainer().eContainer(), p2.getBindings(), editingDomain);
		this.startUppaalModelChecking();
		return true;
	}

	public void startUppaalModelChecking() {
		protocolFromSelectedPattern = PatternToProtocolTransformation
				.TransformPatternToProtocolStep1(selectedPattern,
						(RootNode) selectedPattern.eContainer().eContainer(),
						p2.getBindings(), editingDomain);		
		PatternToProtocolTransformation.TransformPatternToProtocolStep2(selectedPattern, protocolFromSelectedPattern, (RootNode)protocolFromSelectedPattern.eContainer().eContainer(), editingDomain);
	}

}