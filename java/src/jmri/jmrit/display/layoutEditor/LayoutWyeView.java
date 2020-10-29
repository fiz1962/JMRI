package jmri.jmrit.display.layoutEditor;

import javax.annotation.*;

/**
 * MVC View component for the LayoutWye class.
 *
 * @author Bob Jacobsen  Copyright (c) 2020
 *
 */
public class LayoutWyeView extends LayoutTurnoutView {

    /**
     * Constructor method.
     * @param wye the wye to base view on.
     */
    public LayoutWyeView(@Nonnull LayoutWye wye) {
        super(wye);
        // this.wye = wye;
    }

    // final private LayoutWye wye;

    // private final static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LayoutWyeView.class);
}
