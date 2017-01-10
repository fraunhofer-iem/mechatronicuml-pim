package org.muml.pim.realtimestatechart.diagram.custom.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.muml.pim.behavior.BehaviorPackage;
import org.muml.pim.realtimestatechart.RealtimeStatechart;
import org.muml.pim.realtimestatechart.Region;
import org.muml.pim.realtimestatechart.diagram.parsers.RealtimeStatechartLabelExpressionLabelParser5062;

public class CustomRTSCVariableLabelExpressionLabelParser5062 extends
		RealtimeStatechartLabelExpressionLabelParser5062 {

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		RealtimeStatechart stateChart = (RealtimeStatechart) element
				.getAdapter(EObject.class);
		return AbstractRTSCLabelParser.getStringForVariablesOperationsClocks(stateChart);
	}
	
	@Override
	public boolean isAffectingEvent(Object event, int flags) {
		if(event instanceof Notification){
			Notification notification = (Notification) event;
			if (notification.getFeature() == BehaviorPackage.Literals.VARIABLE__INITIALIZE_EXPRESSION || 
					notification.getNotifier() instanceof RealtimeStatechart) {
				return true;
			}
		}
		return super.isAffectingEvent(event, flags);
	}

}
