package org.vaadin.spectrum;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.utils.Placement;

@Tag("sp-popover")
@NpmPackage(value = "@spectrum-web-components/popover", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/popover/sp-popover.js")
public class SpPopover extends HtmlContainer implements HasDirFluent<SpPopover> {

    // ----- dialog -----
    private static final PropertyDescriptor<Boolean, Boolean> dialogProperty =
            PropertyDescriptors.propertyWithDefault("dialog", false);

    public SpPopover setDialog(boolean _dialog) {
        dialogProperty.set(this, _dialog);
        return this;
    }
    public boolean isDialog() {
        return dialogProperty.get(this);
    }
    // -----------------

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpPopover setOpen(boolean _open) {
        openProperty.set(this, _open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------
    
    // ----- placement -----
    private static final PropertyDescriptor<String, String> placementProperty =
            PropertyDescriptors.propertyWithDefault("placement", "none");
    
    public SpPopover setPlacement(String _placement) {
        placementProperty.set(this, _placement);
        return this;
    }
    public String getPlacement() {
        return placementProperty.get(this);
    }
    // -----------------

    // ----- tip -----
    private static final PropertyDescriptor<Boolean, Boolean> tipProperty =
            PropertyDescriptors.propertyWithDefault("tip", false);

    public SpPopover setTip(boolean _tip) {
        tipProperty.set(this, _tip);
        return this;
    }
    public boolean isTip() {
        return tipProperty.get(this);
    }
    // -----------------

    public SpPopover setPlacement(Placement _placement) {
        assert _placement != null;
        this.setPlacement(_placement.toString());
        return this;
    }

    public SpPopover open() {
        setOpen(true);
        return this;
    }


}
