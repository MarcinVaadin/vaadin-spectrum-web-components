package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.utils.SlotUtils;

@Tag("sp-dialog")
@NpmPackage(value = "@spectrum-web-components/dialog", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/dialog/sp-dialog.js")
public class SpDialog extends HtmlContainer implements HasDirFluent<SpDialog>, HasSizeFluent<SpDialog> {

    public enum Mode { FULLSCREEN, FULLSCREEN_TAKEOVER }

    // ----- dismissable -----
    private static final PropertyDescriptor<Boolean, Boolean> dismissableProperty =
            PropertyDescriptors.propertyWithDefault("dismissable", false);

    public SpDialog setDismissable(boolean _dismissable) {
        dismissableProperty.set(this, _dismissable);
        return this;
    }
    public boolean isDismissable() {
        return dismissableProperty.get(this);
    }
    // -----------------

    // ----- error -----
    private static final PropertyDescriptor<Boolean, Boolean> errorProperty =
            PropertyDescriptors.propertyWithDefault("error", false);

    public SpDialog setError(boolean _error) {
        errorProperty.set(this, _error);
        return this;
    }
    public boolean isError() {
        return errorProperty.get(this);
    }
    // -----------------

    // ----- mode -----
    private static final PropertyDescriptor<String, String> modeProperty =
            PropertyDescriptors.propertyWithDefault("mode", "");

    public SpDialog setMode(String _mode) {
        modeProperty.set(this, _mode);
        return this;
    }
    public String getMode() {
        return modeProperty.get(this);
    }
    // -----------------

    // ----- noDivider -----
    private static final PropertyDescriptor<Boolean, Boolean> noDividerProperty =
            PropertyDescriptors.propertyWithDefault("noDivider", false);

    public SpDialog setNoDivider(boolean _noDivider) {
        noDividerProperty.set(this, _noDivider);
        return this;
    }
    public boolean isNoDivider() {
        return noDividerProperty.get(this);
    }
    // -----------------

    public SpDialog setMode(Mode _mode) {
        assert _mode != null;
        this.setMode(_mode.name().toLowerCase());
        return this;
    }

    public SpDialog setHeading(String heading) {
        Component h2 = SpHtml.header().text(heading).asH2();
        SlotUtils.setSlot(this, "heading", h2);
        return this;
    }

    public String getHeading() {
        return SlotUtils.getChildInSlot(this, "heading").getElement().getText();
    }

    public SpDialog addButton(Component component) {
        SlotUtils.addToSlot(this, "button", component);
        return this;
    }

    public SpDialog setFooter(Component component) {
        SlotUtils.setSlot(this, "footer", component);
        return this;
    }

    public Component getFooter() {
        return SlotUtils.getChildInSlot(this, "footer");
    }

    public SpDialog setHero(Component component) {
        SlotUtils.setSlot(this, "hero", component);
        return this;
    }

    public Registration addCloseEventListener(ComponentEventListener<SpDialogCloseEvent> listener) {
        return addListener(SpDialogCloseEvent.class, listener);
    }

    @DomEvent("close")
    public static class SpDialogCloseEvent extends ComponentEvent<SpDialog> {
        public SpDialogCloseEvent(SpDialog source, boolean fromClient) {
            super(source, fromClient);
        }
    }

}
