package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.slots.HasContentSlot;
import org.vaadin.spectrum.slots.HasHeaderSlot;
import org.vaadin.spectrum.utils.ComponentUtils;

@Tag("sp-banner")
@NpmPackage(value = "@spectrum-web-components/banner", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/banner/sp-banner.js")
public class SpBanner extends Component implements HasDirFluent, HasHeaderSlot,
        HasContentSlot {

    public enum Type { INFO, WARNING, ERROR }

    // ----- corner -----
    private static final PropertyDescriptor<Boolean, Boolean> cornerProperty =
            PropertyDescriptors.propertyWithDefault("corner", false);

    public SpBanner setCorner(boolean _corner) {
        cornerProperty.set(this, _corner);
        return this;
    }
    public boolean isCorner() {
        return cornerProperty.get(this);
    }
    // -----------------

    // ----- type -----
    private static final PropertyDescriptor<String, String> typeProperty =
            PropertyDescriptors.propertyWithDefault("type", Type.INFO.name().toLowerCase());

    public SpBanner setType(String _type) {
        typeProperty.set(this, _type);
        return this;
    }
    public String getType() {
        return typeProperty.get(this);
    }
    // -----------------

    public SpBanner() {

    }

    public SpBanner(String header, String content) {
        setHeader(ComponentUtils.divWrap(header));
        setContent(ComponentUtils.divWrap(content));
    }

    public SpBanner setType(Type _type) {
        assert _type != null;
        this.setType(_type.name().toLowerCase());
        return this;
    }

}
