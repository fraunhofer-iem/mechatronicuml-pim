package de.uni_paderborn.fujaba.muml.pattern.diagram.custom.export.wizard;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
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

public class PatternVerificationWizardPage2 extends AbstractPatternVerificationWizardPage implements ICheckStateListener {


	public PatternVerificationWizardPage2(String pageName, String pageTitle,
			String pageDescription, CoordinationPattern pattern,
			FormToolkit toolkit) {
		super(pageName, pageTitle, pageDescription, pattern, toolkit);
		// TODO Auto-generated constructor stub
	}
	HashMap<Parameter, Text> parameterToTextMapping = new HashMap<Parameter, Text>();
	


	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		initializeDialogUnits(parent);
		Composite mainComp;
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
		Label selectionLabel = toolkit
				.createLabel(comp,
						"Define the parameter bindings, if not choosen a legal configuration:");
		GridData gridData = new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		gridData.horizontalSpan = 2;
		selectionLabel.setLayoutData(gridData);

		mainComp = comp;
		
		EList<Parameter> parameterList = pattern.getPatternParameters();

		int nrOfPatterns = parameterList.size();
		
		

		for (int i = 0; i < nrOfPatterns; i++) {
			Parameter parameter = parameterList.get(i);
			Label l = toolkit.createLabel(mainComp, parameter.getName() + 
					" ["
					+ parameter.getDataType().getName() + "]:"
					
					);
			l.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
					| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
			Text t = toolkit.createText(mainComp, "");

			t.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
					| GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));
			l.setVisible(true);
			t.setVisible(true);
			parameterToTextMapping.put(parameter,t);
		}

		this.setControl(section);
	}

	


	@Override
	public void checkStateChanged(CheckStateChangedEvent event) {
		// TODO Auto-generated method stub
		if(event.getElement() instanceof LegalConfiguration)
		{
			LegalConfiguration lc = (LegalConfiguration)event.getElement();
			for(ParameterBinding binding : lc.getParameterBindings())
			{
				Text t = parameterToTextMapping.get(binding.getParameter());
				t.setText(LanguageResource.serializeEObjectSafe(
						binding.getValue(), binding));
			}
		}
		
	}
	@Override
	public boolean isPageComplete() {	
		boolean complete = super.isPageComplete();
		if(complete)
		{
			for(Text text : parameterToTextMapping.values())
			{
				complete &= text.getText() !=null && !text.getText().equals("");
			}
		}
		return complete;		
	}

	public ArrayList<ParameterBinding> getBindings()
	{
		EList<Parameter> patternParameters = pattern.getPatternParameters();
		ArrayList<ParameterBinding> bindingList = new ArrayList<ParameterBinding>();		
		for(Parameter p : patternParameters)
		{
			ParameterBinding binding  = BehaviorFactory.eINSTANCE.createParameterBinding();			
			binding.setParameter(p);
			LiteralExpression le = CommonExpressionsFactory.eINSTANCE
					.createLiteralExpression();
			le.setValue(parameterToTextMapping.get(p).getText());
			binding.setValue(le);
			bindingList.add(binding);
		}
		return bindingList;
	}

}