package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;
import org.vaadin.spectrum.slots.HasIconSlot;
import org.vaadin.spectrum.slots.HasLabelSlot;
import org.vaadin.spectrum.slots.HasMenuItems;
import org.vaadin.spectrum.utils.Placement;

//@Tag("sp-action-menu")
//@NpmPackage(value = "@spectrum-web-components/action-menu", version = "0.16.0")
//@JsModule("@spectrum-web-components/action-menu/sp-action-menu.js")
public class SpActionMenu extends AbstractSinglePropertyField<SpActionMenu, String> implements HasDisabledFluent<SpActionMenu>,
        HasLabelFluent<SpActionMenu>, HasIconSlot, HasLabelSlot, HasMenuItems<SpActionMenu> {

    public SpActionMenu() {
        super("value", "", true);
    }

    // ----- focused -----
    private static final PropertyDescriptor<Boolean, Boolean> focusedProperty =
            PropertyDescriptors.propertyWithDefault("focused", false);


    public SpActionMenu setFocused(boolean _focused) {
        focusedProperty.set(this, _focused);
        return this;
    }
    public boolean isFocused() {
        return focusedProperty.get(this);
    }
    // -----------------

    // ----- icons -----
    private static final PropertyDescriptor<String, String> iconsProperty =
            PropertyDescriptors.propertyWithDefault("icons", "");

    public SpActionMenu setIcons(String _icons) {
        iconsProperty.set(this, _icons);
        return this;
    }
    public String getIcons() {
        return iconsProperty.get(this);
    }
    // -----------------

    // ----- invalid -----
    private static final PropertyDescriptor<Boolean, Boolean> invalidProperty =
            PropertyDescriptors.propertyWithDefault("invalid", false);

    public SpActionMenu setInvalid(boolean _invalid) {
        invalidProperty.set(this, _invalid);
        return this;
    }
    public boolean isInvalid() {
        return invalidProperty.get(this);
    }
    // -----------------

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpActionMenu setOpen(boolean _open) {
        openProperty.set(this, _open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

    // ----- placement -----
    private static final PropertyDescriptor<String, String> placementProperty =
            PropertyDescriptors.propertyWithDefault("placement", Placement.BOTTOM_START.toString());
    
    public SpActionMenu setPlacement(String _placement) {
        placementProperty.set(this, _placement);
        return this;
    }
    public String getPlacement() {
        return placementProperty.get(this);
    }
    // -----------------
    
    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);
    
    public SpActionMenu setQuiet(boolean _quiet) {
        quietProperty.set(this, _quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------
    
    // ----- readonly -----
    private static final PropertyDescriptor<Boolean, Boolean> readonlyProperty =
            PropertyDescriptors.propertyWithDefault("readonly", false);
    
    public SpActionMenu setReadonly(boolean _readonly) {
        readonlyProperty.set(this, _readonly);
        return this;
    }
    public boolean isReadonly() {
        return readonlyProperty.get(this);
    }
    // -----------------
    
    // ----- selects -----
    private static final PropertyDescriptor<String, String> selectsProperty =
            PropertyDescriptors.propertyWithDefault("selects", "");
    
    public SpActionMenu setSelects(String _selects) {
        selectsProperty.set(this, _selects);
        return this;
    }
    public String getSelects() {
        return selectsProperty.get(this);
    }
    // -----------------


    @Synchronize("change")
    @Override
    public String getValue() {
        return super.getValue();
    }

}
