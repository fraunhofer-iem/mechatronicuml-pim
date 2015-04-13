package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardDataTransferPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.storydriven.core.expressions.common.CommonExpressionsFactory;
import org.storydriven.core.expressions.common.LiteralExpression;

import de.uni_paderborn.fujaba.muml.behavior.BehaviorFactory;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.common.LanguageResource;
import de.uni_paderborn.fujaba.muml.pattern.CoordinationPattern;
import de.uni_paderborn.fujaba.muml.pattern.LegalConfiguration;

/**
 * The second page of the PatternToProtocolExportWizard. Displays all Parameter
 * Bindings and the assigned values.
 * 
 * @author sthiele2
 *
 */
public class PatternToProtocolExportWizardPage2 extends WizardDataTransferPage
		implements IWizardPage {

	Label selectionLabel;
	FormToolkit toolkit;
	PatternToProtocolExportWizardPage1 page1;
	HashMap<Parameter, Text> parameterToTextMapping;

	public PatternToProtocolExportWizardPage2(String pageName,
			FormToolkit toolkit, PatternToProtocolExportWizardPage1 page1) {
		super(pageName);
		this.toolkit = toolkit;
		this.setTitle("Set or Modify the parameter bindings");
		this.page1 = page1;

	}

	@Override
	public boolean isPageComplete() {
		return super.isPageComplete() && this.isCurrentPage();

	};

	Composite mainComp;

	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		initializeDialogUnits(parent);

		int sectionStyle = Section.TITLE_BAR | Section.CLIENT_INDENT
				| Section.EXPANDED;
		Section section = toolkit.createSection(parent, sectionStyle);
		section.setText("Bind all parameters to values");
		section.setLayout(new GridLayout());
		Composite comp = toolkit.createComposite(section);
		comp.setLayout(new GridLayout(2, false));

		comp.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
		section.setClient(comp);
		selectionLabel = toolkit.createLabel(comp, "");
		GridData gridData = new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		gridData.horizontalSpan = 2;
		selectionLabel.setLayoutData(gridData);

		mainComp = comp;
		// PatternToProtocolExportWizard wizard =
		// (PatternToProtocolExportWizard) this
		// .getWizard();
		// assume there are not more than 10 parameters
		int max = 10;
		/*
		 * for(CoordinationPattern pattern : wizard.getPatternList()) { int
		 * parametersize = pattern.getPatternParameters().size();
		 * if(parametersize > max) { max = parametersize; } }
		 */

		if (max > Integer.MIN_VALUE) {
			for (int i = 0; i < max; i++) {
				Label l = toolkit.createLabel(mainComp, "");
				l.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
						| GridData.HORIZONTAL_ALIGN_FILL
						| GridData.GRAB_HORIZONTAL));
				Text t = toolkit.createText(mainComp, "");

				t.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
						| GridData.HORIZONTAL_ALIGN_FILL
						| GridData.GRAB_HORIZONTAL));
				l.setVisible(true);
				t.setVisible(true);
			}

		}
		this.setControl(section);

	}

	public void refresh() {

		Control[] children = mainComp.getChildren();
		for (Control c : children) {
			c.setVisible(false);
		}
		CoordinationPattern p = page1.getSelectedPattern();
		if (p == null) {
			Label l = (Label) children[0];
			l.setVisible(true);
			l.setText("No pattern selected!");
			return;
		}
		LegalConfiguration lc = page1.getSelectedLegalConfiguration();
		parameterToTextMapping = new HashMap<Parameter, Text>();
		int counter = 1;
		List<Parameter> parameterList = p.getPatternParameters();
		if (parameterList.size() == 0) {
			Label l = (Label) children[0];
			l.setVisible(true);
			l.setText("The selected pattern has no paramters to bind!");
			return;
		}
		for (Parameter parameter : parameterList) {
			Label l = (Label) children[counter * 2 - 1];
			Text t = (Text) children[counter * 2];
			l.setVisible(true);
			t.setVisible(true);
			l.setText(parameter.getName() + " ["
					+ parameter.getDataType().getName() + "]:");
			t.setText("");
			parameterToTextMapping.put(parameter, t);
			counter++;
		}
		if (lc != null) {
			for (ParameterBinding binding : lc.getParameterBindings()) {
				Text t = parameterToTextMapping.get(binding.getParameter());
				if (t != null) {
					t.setText(LanguageResource.serializeEObjectSafe(
							binding.getValue(), binding));
				}

			}
		}
	}

	public ArrayList<ParameterBinding> getParameterBindings() {

		ArrayList<ParameterBinding> bindingList = new ArrayList<ParameterBinding>();
		/*
		 * LegalConfiguration lc = page1.getSelectedLegalConfiguration(); if(lc
		 * !=null){ for(ParameterBinding binding : lc.getParameterBindings()) {
		 * Text t = hm.get(binding.getParameter()); if(t!=null) {
		 * hm.remove(binding.getParameter()); bindingList.add(binding); } } }
		 */
		for (Parameter p : parameterToTextMapping.keySet()) {
			ParameterBinding binding = BehaviorFactory.eINSTANCE
					.createParameterBinding();
			binding.setParameter(p);
			LiteralExpression le = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			le.setValue(parameterToTextMapping.get(p).getText());
			binding.setValue(le);
			bindingList.add(binding);
		}
		return bindingList;
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean allowNewContainerName() {
		// TODO Auto-generated method stub
		return false;
	}
}