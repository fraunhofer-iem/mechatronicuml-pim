package org.muml.pim.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.core.tests.NLSUnusedMessageTest;

@RunWith(Parameterized.class)
public class PimNLSUnusedMessageTest extends NLSUnusedMessageTest {

	public PimNLSUnusedMessageTest(String pluginName) {
		super(pluginName);
	}
	
	@Parameters
	public static Collection<Object[]> getPluginIDs() {
		return new ArrayList<Object[]>(Arrays.asList(new Object[][] {
				new Object[] {"org.muml.pim.component.diagram"},
				new Object[] {"org.muml.pim.componentinstanceconfiguration.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.componentstorydiagram.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.deployment.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.messagetype.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.coordinationprotocol.diagram"},
				new Object[] {"de.uni_paderborn.fujaba.muml.realtimestatechart.diagram"}
		}));
	}
	
}
