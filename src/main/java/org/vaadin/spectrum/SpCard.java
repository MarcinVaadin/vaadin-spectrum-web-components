package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasVariantFluent;
import org.vaadin.spectrum.utils.ComponentUtils;
import org.vaadin.spectrum.utils.SlotUtils;

@Tag("sp-card")
@NpmPackage(value = "@spectrum-web-components/card", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/card/sp-card.js")
public class SpCard extends AbstractSinglePropertyField<SpCard, String> implements HasDirFluent, HasVariantFluent, HasSizeFluent {

    public enum Variant { STANDARD, GALLERY, QUIET }

    // ----- asset -----
    private static final PropertyDescriptor<String, String> assetProperty =
            PropertyDescriptors.propertyWithDefault("asset", "");

    public SpCard setAsset(String _asset) {
        assetProperty.set(this, _asset);
        return this;
    }
    public String getAsset() {
        return assetProperty.get(this);
    }
    // -----------------

    // ----- focused -----
    private static final PropertyDescriptor<Boolean, Boolean> focusedProperty =
            PropertyDescriptors.propertyWithDefault("focused", false);

    public SpCard setFocused(boolean _focused) {
        focusedProperty.set(this, _focused);
        return this;
    }
    public boolean isFocused() {
        return focusedProperty.get(this);
    }
    // -----------------

    // ----- heading -----
    private static final PropertyDescriptor<String, String> headingProperty =
            PropertyDescriptors.propertyWithDefault("heading", "");

    public SpCard setHeading(String _heading) {
        headingProperty.set(this, _heading);
        return this;
    }
    public String getHeading() {
        return headingProperty.get(this);
    }
    // -----------------

    // ----- horizontal -----
    private static final PropertyDescriptor<Boolean, Boolean> horizontalProperty =
            PropertyDescriptors.propertyWithDefault("horizontal", false);

    public SpCard setHorizontal(boolean _horizontal) {
        horizontalProperty.set(this, _horizontal);
        return this;
    }
    public boolean isHorizontal() {
        return horizontalProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<Boolean, Boolean> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", false);

    public SpCard setSelected(boolean _selected) {
        selectedProperty.set(this, _selected);
        return this;
    }
    public boolean isSelected() {
        return selectedProperty.get(this);
    }
    // -----------------

    // ----- subheading -----
    private static final PropertyDescriptor<String, String> subheadingProperty =
            PropertyDescriptors.propertyWithDefault("subheading", "");

    public SpCard setSubheading(String _subheading) {
        subheadingProperty.set(this, _subheading);
        return this;
    }
    public String getSubheading() {
        return subheadingProperty.get(this);
    }
    // -----------------

    // ----- toggles -----
    private static final PropertyDescriptor<Boolean, Boolean> togglesProperty =
            PropertyDescriptors.propertyWithDefault("toggles", false);

    public SpCard setToggles(boolean _toggles) {
        togglesProperty.set(this, _toggles);
        return this;
    }
    public boolean isToggles() {
        return togglesProperty.get(this);
    }
    // -----------------

    public SpCard() {
        super("value", "", false);
    }

    public SpCard(String heading) {
        this();
        setHeading(heading);
    }

    public SpCard setVariant(Variant _variant) {
        assert _variant != null;
        this.setVariant(_variant.name().toLowerCase());
        return this;
    }

    public SpCard setCoverPhoto(Component component) {
        SlotUtils.setSlot(this, "cover-photo", component);
        return this;
    }

    public SpCard setDescription(Component component) {
        SlotUtils.setSlot(this, "description", component);
        return this;
    }

    public SpCard setFooter(Component component) {
        SlotUtils.setSlot(this, "footer", component);
        return this;
    }

    public SpCard setFooter(String footer) {
        setFooter(ComponentUtils.divWrap(footer));
        return this;
    }

    public SpCard setHeading(Component component) {
        SlotUtils.setSlot(this, "heading", component);
        return this;
    }

    public SpCard setPreview(Component component) {
        SlotUtils.setSlot(this, "preview", component);
        return this;
    }

    public SpCard setSubheading(Component component) {
        SlotUtils.setSlot(this, "subheading", component);
        return this;
    }

}
