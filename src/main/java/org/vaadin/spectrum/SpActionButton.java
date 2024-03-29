package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasTextFluent;
import org.vaadin.spectrum.slots.HasIconSlot;

@Tag("sp-action-button")
@NpmPackage(value = "@spectrum-web-components/action-button", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/action-button/sp-action-button.js")
public class SpActionButton extends Component implements ClickNotifier<SpActionButton>,
        HasSizeFluent<SpActionButton>, HasTextFluent<SpActionButton>, HasIconSlot<SpActionButton>,
        HasDisabledFluent<SpActionButton> {

    public enum Type {BUTTON, SUBMIT, RESET}

    public enum Variant {WHITE, BLACK}

    // ----- active -----
    private static final PropertyDescriptor<Boolean, Boolean> activeProperty =
            PropertyDescriptors.propertyWithDefault("active", false);

    public SpActionButton setActive(boolean _active) {
        activeProperty.set(this, _active);
        return this;
    }
    public boolean isActive() {
        return activeProperty.get(this);
    }
    // -----------------

    // ----- emphasized -----
    private static final PropertyDescriptor<Boolean, Boolean> emphasizedProperty =
            PropertyDescriptors.propertyWithDefault("emphasized", false);

    public SpActionButton setEmphasized(boolean _emphasized) {
        emphasizedProperty.set(this, _emphasized);
        return this;
    }
    public boolean isEmphasized() {
        return emphasizedProperty.get(this);
    }
    // -----------------

    // ----- holdAffordance -----
    private static final PropertyDescriptor<Boolean, Boolean> holdAffordanceProperty =
            PropertyDescriptors.propertyWithDefault("holdAffordance", false);

    public SpActionButton setHoldAffordance(boolean _holdAffordance) {
        holdAffordanceProperty.set(this, _holdAffordance);
        return this;
    }
    public boolean isHoldAffordance() {
        return holdAffordanceProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpActionButton setQuiet(boolean _quiet) {
        quietProperty.set(this, _quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    // ----- role -----
    private static final PropertyDescriptor<String, String> roleProperty =
            PropertyDescriptors.propertyWithDefault("role", "button");

    public SpActionButton setRole(String _role) {
        roleProperty.set(this, _role);
        return this;
    }
    public String getRole() {
        return roleProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<Boolean, Boolean> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", false);

    public SpActionButton setSelected(boolean _selected) {
        selectedProperty.set(this, _selected);
        return this;
    }
    @Synchronize("change")
    public boolean isSelected() {
        return selectedProperty.get(this);
    }
    // -----------------

    // ----- toggles -----
    private static final PropertyDescriptor<Boolean, Boolean> togglesProperty =
            PropertyDescriptors.propertyWithDefault("toggles", false);

    public SpActionButton setToggles(boolean _toggles) {
        togglesProperty.set(this, _toggles);
        return this;
    }
    public boolean isToggles() {
        return togglesProperty.get(this);
    }
    // -----------------

    // ----- type -----
    private static final PropertyDescriptor<String, String> typeProperty =
            PropertyDescriptors.propertyWithDefault("type", "button");

    public SpActionButton setType(String _type) {
        typeProperty.set(this, _type);
        return this;
    }
    public String getType() {
        return typeProperty.get(this);
    }
    // -----------------

    // ----- value -----
    private static final PropertyDescriptor<String, String> valueProperty =
            PropertyDescriptors.propertyWithDefault("value", "");

    public SpActionButton setValue(String _value) {
        valueProperty.set(this, _value);
        return this;
    }
    public String getValue() {
        return valueProperty.get(this);
    }
    // -----------------

    // ----- variant -----
    private static final PropertyDescriptor<String, String> variantProperty =
            PropertyDescriptors.propertyWithDefault("variant", "");

    public SpActionButton setVariant(String _variant) {
        variantProperty.set(this, _variant);
        return this;
    }
    public String getVariant() {
        return variantProperty.get(this);
    }
    // -----------------

    public SpActionButton setType(Type _type) {
        assert _type != null;
        this.setType(_type.name().toLowerCase());
        return this;
    }

    public SpActionButton setVariant(Variant _variant) {
        assert _variant != null;
        this.setVariant(_variant.name().toLowerCase());
        return this;
    }

    public Registration addLongPressEventListener(ComponentEventListener<SpLongPressEvent> listener) {
        return addListener(SpLongPressEvent.class, listener);
    }

    @DomEvent("longpress")
    public static class SpLongPressEvent extends ComponentEvent<SpActionButton> {
        public SpLongPressEvent(SpActionButton source, boolean fromClient) {
            super(source, fromClient);
        }
    }

}
