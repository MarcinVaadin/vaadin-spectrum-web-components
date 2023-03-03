package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;

@Tag("sp-button-group")
@NpmPackage(value = "@spectrum-web-components/button-group", version = "0.10.7")
@JsModule("@spectrum-web-components/button-group/sp-button-group.js")
public class SpButtonGroup extends HtmlContainer implements HasDirFluent<SpButtonGroup>, HasSizeFluent<SpButtonGroup> {

    // ----- vertical -----
    private static final PropertyDescriptor<Boolean, Boolean> verticalProperty =
            PropertyDescriptors.propertyWithDefault("vertical", false);

    public SpButtonGroup setVertical(boolean vertical) {
        verticalProperty.set(this, vertical);
        return this;
    }
    public boolean isVertical() {
        return verticalProperty.get(this);
    }
    // -----------------

}
