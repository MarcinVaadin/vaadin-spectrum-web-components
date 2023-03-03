package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-tooltip")
@NpmPackage(value = "@spectrum-web-components/tooltip", version = "0.11.13")
@JsModule("@spectrum-web-components/tooltip/sp-tooltip.js")
public class SpTooltip extends Component implements HasDirFluent<SpTooltip>, HasTextFluent<SpTooltip> {

    public enum Placement { AUTO, AUTO_START, AUTO_END, TOP, BOTTOM, RIGHT, LEFT, TOP_START, TOP_END, BOTTOM_START, BOTTOM_END, RIGHT_START, RIGHT_END, LEFT_START, LEFT_END, NONE }

    public enum Variant { INFO, POSITIVE, NEGATIVE }

    // ----- offset -----
    private static final PropertyDescriptor<Integer, Integer> offsetProperty =
            PropertyDescriptors.propertyWithDefault("offset", 6);

    public SpTooltip setOffset(Integer _offset) {
        offsetProperty.set(this, _offset);
        return this;
    }
    public Integer getOffset() {
        return offsetProperty.get(this);
    }
    // -----------------

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpTooltip setOpen(boolean _open) {
        openProperty.set(this, _open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

    // ----- placement -----
    private static final PropertyDescriptor<String, String> placementProperty =
            PropertyDescriptors.propertyWithDefault("placement", Placement.TOP.name().toLowerCase());

    public SpTooltip setPlacement(String _placement) {
        placementProperty.set(this, _placement);
        return this;
    }
    public String getPlacement() {
        return placementProperty.get(this);
    }
    // -----------------

    // ----- selfManaged -----
    private static final PropertyDescriptor<Boolean, Boolean> selfManagedProperty =
            PropertyDescriptors.propertyWithDefault("selfManaged", false);

    public SpTooltip setSelfManaged(boolean _selfManaged) {
        selfManagedProperty.set(this, _selfManaged);
        return this;
    }
    public boolean isSelfManaged() {
        return selfManagedProperty.get(this);
    }
    // -----------------

    // ----- variant -----
    private static final PropertyDescriptor<String, String> variantProperty =
            PropertyDescriptors.propertyWithDefault("variant", "");

    public SpTooltip setVariant(String _variant) {
        variantProperty.set(this, _variant);
        return this;
    }
    public String getVariant() {
        return variantProperty.get(this);
    }
    // -----------------

    public SpTooltip setPlacement(Placement _placement) {
        assert _placement != null;
        this.setPlacement(_placement.name().toLowerCase());
        return this;
    }

    // TODO icon

}
