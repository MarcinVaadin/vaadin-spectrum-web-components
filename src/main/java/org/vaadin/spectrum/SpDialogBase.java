package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDirFluent;

@Tag("sp-dialog-base")
@NpmPackage(value = "@spectrum-web-components/dialog", version = "0.11.13")
@JsModule("@spectrum-web-components/dialog/sp-dialog-base.js")
public class SpDialogBase extends Component implements HasDirFluent<SpDialogBase> {

    public enum Mode { FULLSCREEN, FULLSCREEN_TAKEOVER }

    // ----- dismissable -----
    private static final PropertyDescriptor<Boolean, Boolean> dismissableProperty =
            PropertyDescriptors.propertyWithDefault("dismissable", false);

    public SpDialogBase setDismissable(boolean _dismissable) {
        dismissableProperty.set(this, _dismissable);
        return this;
    }
    public boolean isDismissable() {
        return dismissableProperty.get(this);
    }
    // -----------------

    // ----- mode -----
    private static final PropertyDescriptor<String, String> modeProperty =
            PropertyDescriptors.propertyWithDefault("mode", "");

    public SpDialogBase setMode(String _mode) {
        modeProperty.set(this, _mode);
        return this;
    }
    public String getMode() {
        return modeProperty.get(this);
    }
    // -----------------

    // ----- open -----
    private static final PropertyDescriptor<Boolean, Boolean> openProperty =
            PropertyDescriptors.propertyWithDefault("open", false);

    public SpDialogBase setOpen(boolean _open) {
        openProperty.set(this, _open);
        return this;
    }
    public boolean isOpen() {
        return openProperty.get(this);
    }
    // -----------------

    // ----- responsive -----
    private static final PropertyDescriptor<Boolean, Boolean> responsiveProperty =
            PropertyDescriptors.propertyWithDefault("responsive", false);

    public SpDialogBase setResponsive(boolean _responsive) {
        responsiveProperty.set(this, _responsive);
        return this;
    }
    public boolean isResponsive() {
        return responsiveProperty.get(this);
    }
    // -----------------

    // ----- underlay -----
    private static final PropertyDescriptor<Boolean, Boolean> underlayProperty =
            PropertyDescriptors.propertyWithDefault("underlay", false);

    public SpDialogBase setUnderlay(boolean _underlay) {
        underlayProperty.set(this, _underlay);
        return this;
    }
    public boolean isUnderlay() {
        return underlayProperty.get(this);
    }
    // -----------------

    public SpDialogBase setMode(Mode _mode) {
        assert _mode != null;
        this.setMode(_mode.name().toLowerCase());
        return this;
    }

    public void setDialog(SpDialog dialog) {
        getElement().removeAllChildren();
        getElement().setChild(0, dialog.getElement());
    }

    public Registration addCloseEventListener(ComponentEventListener<SpDialogBaseCloseEvent> listener) {
        return addListener(SpDialogBaseCloseEvent.class, listener);
    }

    @DomEvent("close")
    public static class SpDialogBaseCloseEvent extends ComponentEvent<SpDialogBase> {
        public SpDialogBaseCloseEvent(SpDialogBase source, boolean fromClient) {
            super(source, fromClient);
        }
    }

}