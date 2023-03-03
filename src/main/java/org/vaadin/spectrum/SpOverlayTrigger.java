package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.shared.SlotUtils;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasDisabledFluent;

@Tag("overlay-trigger")
@NpmPackage(value = "@spectrum-web-components/overlay", version = "0.19.1")
@JsModule("@spectrum-web-components/overlay/overlay-trigger.js")
public class SpOverlayTrigger extends Component implements HasDirFluent<SpOverlayTrigger>, HasDisabledFluent<SpOverlayTrigger>,
    ComponentEventListener<SpDialog.SpDialogCloseEvent> {

    public enum Placement { AUTO, AUTO_START, AUTO_END, TOP, BOTTOM, RIGHT, LEFT, TOP_START, TOP_END, BOTTOM_START, BOTTOM_END, RIGHT_START, RIGHT_END, LEFT_START, LEFT_END, NONE }

    public enum Type { INLINE, REPLACE, MODAL }

    // ----- offset -----
    private static final PropertyDescriptor<Integer, Integer> offsetProperty =
            PropertyDescriptors.propertyWithDefault("offset", 6);

    public SpOverlayTrigger setOffset(Integer _offset) {
        offsetProperty.set(this, _offset);
        return this;
    }
    public Integer getOffset() {
        return offsetProperty.get(this);
    }
    // -----------------

    // ----- open -----
    private static final PropertyDescriptor<String, String> openProperty =
            PropertyDescriptors.propertyWithDefault("open", "");

    public SpOverlayTrigger setOpen(String _open) {
        openProperty.set(this, _open);
        return this;
    }
    public String getOpen() {
        return openProperty.get(this);
    }
    // -----------------

    // ----- placement -----
    private static final PropertyDescriptor<String, String> placementProperty =
            PropertyDescriptors.propertyWithDefault("placement", Placement.BOTTOM.name().toLowerCase());

    public SpOverlayTrigger setPlacement(String _placement) {
        placementProperty.set(this, _placement);
        return this;
    }
    public String getPlacement() {
        return placementProperty.get(this);
    }
    // -----------------

    // ----- type -----
    private static final PropertyDescriptor<String, String> typeProperty =
            PropertyDescriptors.propertyWithDefault("type", "");

    public SpOverlayTrigger setType(String _type) {
        typeProperty.set(this, _type);
        return this;
    }
    public String getType() {
        return typeProperty.get(this);
    }
    // -----------------

    public SpOverlayTrigger setPlacement(Placement _placement) {
        assert _placement != null;
        this.setPlacement(_placement.name().toLowerCase());
        return this;
    }

    public SpOverlayTrigger setType(Type _type) {
        assert _type != null;
        this.setType(_type.name().toLowerCase());
        return this;
    }

    public SpOverlayTrigger setClickContent(Component component) {
        SlotUtils.setSlot(this, "click-content", component);
        return this;
    }

    public SpOverlayTrigger setHoverContent(Component component) {
        SlotUtils.setSlot(this, "hover-content", component);
        return this;
    }

    public SpOverlayTrigger setLongpressContent(Component component) {
        SlotUtils.setSlot(this, "longpress-content", component);
        return this;
    }

    public SpOverlayTrigger setTrigger(Component component) {
        SlotUtils.setSlot(this, "trigger", component);
        return this;
    }

    public Registration addOverlayClosedEventEventListener(ComponentEventListener<SpOverlayClosedEvent> listener) {
        return addListener(SpOverlayClosedEvent.class, listener);
    }

    @DomEvent("sp-closed")
    public static class SpOverlayClosedEvent extends ComponentEvent<SpOverlayTrigger> {
        public SpOverlayClosedEvent(SpOverlayTrigger source, boolean fromClient) {
            super(source, fromClient);
        }
    }

    public Registration addOverlayOpenedEventEventListener(ComponentEventListener<SpOverlayOpenedEvent> listener) {
        return addListener(SpOverlayOpenedEvent.class, listener);
    }

    @DomEvent("sp-opened")
    public static class SpOverlayOpenedEvent extends ComponentEvent<SpOverlayTrigger> {
        public SpOverlayOpenedEvent(SpOverlayTrigger source, boolean fromClient) {
            super(source, fromClient);
        }
    }

    public void close() {
        this.setOpen("false");
    }

    @Override
    public void onComponentEvent(SpDialog.SpDialogCloseEvent event) {
        close();
    }

}
