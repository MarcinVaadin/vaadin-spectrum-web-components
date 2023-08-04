package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;

@Tag("sp-field-label")
@NpmPackage(value = "@spectrum-web-components/field-label", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/field-label/sp-field-label.js")
public class SpFieldLabel extends Component implements HasDisabledFluent<SpFieldLabel> {

    public enum SideAligned { START, END }

    // ----- for -----
    private static final PropertyDescriptor<String, String> forProperty =
            PropertyDescriptors.propertyWithDefault("for", "");

    public SpFieldLabel setFor(String _for) {
        forProperty.set(this, _for);
        return this;
    }
    public String getFor() {
        return forProperty.get(this);
    }
    // -----------------

    // ----- id -----
    private static final PropertyDescriptor<String, String> idProperty =
            PropertyDescriptors.propertyWithDefault("id", "");

    @Override
    public void setId(String _id) {
        super.setId(_id);
        idProperty.set(this, _id);
    }

//    public String getId() {
//        return idProperty.get(this);
//    }
    // -----------------

    // ----- required -----
    private static final PropertyDescriptor<Boolean, Boolean> requiredProperty =
            PropertyDescriptors.propertyWithDefault("required", false);

    public SpFieldLabel setRequired(boolean _required) {
        requiredProperty.set(this, _required);
        return this;
    }
    public boolean isRequired() {
        return requiredProperty.get(this);
    }
    // -----------------

    // ----- sideAligned -----
    private static final PropertyDescriptor<String, String> sideAlignedProperty =
            PropertyDescriptors.propertyWithDefault("sideAligned", "");

    public SpFieldLabel setSideAligned(String _sideAligned) {
        sideAlignedProperty.set(this, _sideAligned);
        return this;
    }
    public String getSideAligned() {
        return sideAlignedProperty.get(this);
    }
    // -----------------
    
    public SpFieldLabel setSideAligned(SideAligned _sideAligned) {
        assert _sideAligned != null;
        this.setSideAligned(_sideAligned.name().toLowerCase());
        return this;
    }

    public SpFieldLabel setText(String text) {
        this.getElement().setText(text);
        return this;
    }

    public String getText() {
        return this.getElement().getText();
    }



}
