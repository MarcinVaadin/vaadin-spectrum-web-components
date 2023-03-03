package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;

@Tag("sp-divider")
@NpmPackage(value = "@spectrum-web-components/divider", version = "0.6.6")
@JsModule("@spectrum-web-components/divider/sp-divider.js")
public class SpDivider extends Component implements HasDirFluent<SpDivider>,
        HasSizeFluent<SpDivider> {

    // ----- vertical -----
    private static final PropertyDescriptor<Boolean, Boolean> verticalProperty =
            PropertyDescriptors.propertyWithDefault("vertical", false);

    public SpDivider setVertical(boolean vertical) {
        verticalProperty.set(this, vertical);
        return this;
    }
    public boolean isVertical() {
        return verticalProperty.get(this);
    }
    // -----------------

}
