package org.vaadin.spectrum;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;

@Tag("sp-button-group")
@NpmPackage(value = "@spectrum-web-components/button-group", version = SpConstants.VERSION)
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
