package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;

@Tag("sp-underlay")
@NpmPackage(value = "@spectrum-web-components/underlay", version = "0.9.6")
@JsModule("@spectrum-web-components/underlay/sp-underlay.js")
public class SpUnderlay extends Component implements HasDirFluent<SpUnderlay> {

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpUnderlay setOpen(boolean _open) {
        openProperty.set(this, _open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

}