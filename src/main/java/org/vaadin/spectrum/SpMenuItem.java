package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-menu-item")
@NpmPackage(value = "@spectrum-web-components/menu", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/menu/sp-menu-item.js")
public class SpMenuItem extends Component implements HasTextFluent<SpMenuItem>, HasDisabledFluent<SpMenuItem> {

    // ----- active -----
    private static final PropertyDescriptor<Boolean, Boolean> activeProperty =
            PropertyDescriptors.propertyWithDefault("active", false);

    public SpMenuItem setActive(boolean active) {
        activeProperty.set(this, active);
        return this;
    }
    public boolean isActive() {
        return activeProperty.get(this);
    }
    // -----------------

    // ----- focused -----
    private static final PropertyDescriptor<Boolean, Boolean> focusedProperty =
            PropertyDescriptors.propertyWithDefault("focused", false);

    public SpMenuItem setFocused(boolean focused) {
        focusedProperty.set(this, focused);
        return this;
    }
    public boolean isFocused() {
        return focusedProperty.get(this);
    }
    // -----------------

    // ----- hasSubmenu -----
    private static final PropertyDescriptor<Boolean, Boolean> hasSubmenuProperty =
            PropertyDescriptors.propertyWithDefault("hasSubmenu", false);

    public SpMenuItem setHasSubmenu(boolean hasSubmenu) {
        hasSubmenuProperty.set(this, hasSubmenu);
        return this;
    }
    public boolean isHasSubmenu() {
        return hasSubmenuProperty.get(this);
    }
    // -----------------

    // ----- noWrap -----
    private static final PropertyDescriptor<Boolean, Boolean> noWrapProperty =
            PropertyDescriptors.propertyWithDefault("noWrap", false);

    public SpMenuItem setNoWrap(boolean noWrap) {
        noWrapProperty.set(this, noWrap);
        return this;
    }
    public boolean isNoWrap() {
        return noWrapProperty.get(this);
    }
    // -----------------

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpMenuItem setOpen(boolean open) {
        openProperty.set(this, open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<Boolean, Boolean> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", false);

    public SpMenuItem setSelected(boolean selected) {
        selectedProperty.set(this, selected);
        return this;
    }
    public boolean isSelected() {
        return selectedProperty.get(this);
    }
    // -----------------

    // ----- value -----
    private static final PropertyDescriptor<String, String> valueProperty =
            PropertyDescriptors.propertyWithDefault("value", "");

    public SpMenuItem setValue(String value) {
        valueProperty.set(this, value);
        return this;
    }
    public String getValue() {
        return valueProperty.get(this);
    }
    // -----------------

}
