package jmri.jmrix.loconet.logixng;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    jmri.jmrix.loconet.logixng.configureswing.PackageTest.class,
//    jmri.jmrix.loconet.logixng.configurexml.PackageTest.class,
    AnalogActionLocoNet_OPC_PEERTest.class,
    AnalogExpressionLocoNet_OPC_PEERTest.class,
    BundleTest.class,
    StringActionLocoNet_OPC_PEERTest.class,
    StringExpressionLocoNet_OPC_PEERTest.class,
})

/**
 * Invokes complete set of tests in the jmri.jmrit.logixng.analogactions tree
 *
 * @author Daniel Bergqvist 2018
 */
public class PackageTest {
}
