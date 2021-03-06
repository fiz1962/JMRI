package jmri.jmrit.display.controlPanelEditor.shape.configurexml;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * PositionablePolygonXmlTest.java
 *
 * Description: tests for the PositionablePolygonXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class PositionablePolygonXmlTest {

    @Test
    public void testCtor(){
      Assert.assertNotNull("PositionablePolygonXml constructor",new PositionablePolygonXml());
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        apps.tests.Log4JFixture.setUp();
    }

    @After
    public void tearDown() {
        apps.tests.Log4JFixture.tearDown();
    }

}

