package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;
import org.vaadin.spectrum.properties.HasLabelFluent;

@Tag("sp-action-group")
@NpmPackage(value = "@spectrum-web-components/action-group", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/action-group/sp-action-group.js")
public class SpActionGroup extends Component implements HasComponents, HasLabelFluent<SpActionGroup> {

    public enum Selects { SINGLE, MULTIPLE }

    // ----- compact -----
    private static final PropertyDescriptor<Boolean, Boolean> compactProperty =
            PropertyDescriptors.propertyWithDefault("compact", false);

    public SpActionGroup setCompact(boolean _compact) {
        compactProperty.set(this, _compact);
        return this;
    }
    public boolean isCompact() {
        return compactProperty.get(this);
    }
    // -----------------

    // ----- emphasized -----
    private static final PropertyDescriptor<Boolean, Boolean> emphasizedProperty =
            PropertyDescriptors.propertyWithDefault("emphasized", false);

    public SpActionGroup setEmphasized(boolean _emphasized) {
        emphasizedProperty.set(this, _emphasized);
        return this;
    }
    public boolean isEmphasized() {
        return emphasizedProperty.get(this);
    }
    // -----------------

    // ----- justified -----
    private static final PropertyDescriptor<Boolean, Boolean> justifiedProperty =
            PropertyDescriptors.propertyWithDefault("justified", false);

    public SpActionGroup setJustified(boolean _justified) {
        justifiedProperty.set(this, _justified);
        return this;
    }
    public boolean isJustified() {
        return justifiedProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpActionGroup setQuiet(boolean _quiet) {
        quietProperty.set(this, _quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<String, String> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", "");

    public SpActionGroup setSelected(String _selected) {
        selectedProperty.set(this, _selected);
        return this;
    }

    @Synchronize("change")
    public String getSelected() {
        return selectedProperty.get(this);
    }
    // -----------------

    // ----- selects -----
    private static final PropertyDescriptor<String, String> selectsProperty =
            PropertyDescriptors.propertyWithDefault("selects", "");

    public SpActionGroup setSelects(String _selects) {
        selectsProperty.set(this, _selects);
        return this;
    }
    public String getSelects() {
        return selectsProperty.get(this);
    }
    // -----------------

    // ----- vertical -----
    private static final PropertyDescriptor<Boolean, Boolean> verticalProperty =
            PropertyDescriptors.propertyWithDefault("vertical", false);

    public SpActionGroup setVertical(boolean _vertical) {
        verticalProperty.set(this, _vertical);
        return this;
    }
    public boolean isVertical() {
        return verticalProperty.get(this);
    }
    // -----------------

    public SpActionGroup setSelects(Selects _selects) {
        assert _selects != null;
        this.setSelects(_selects.name().toLowerCase());
        return this;
    }

    public Registration addChangeEventListener(ComponentEventListener<SpChangeEvent> listener) {
        return addListener(SpChangeEvent.class, listener);
    }

    @DomEvent("change")
    public static class SpChangeEvent extends ComponentEvent<SpActionGroup> {
        public SpChangeEvent(SpActionGroup source, boolean fromClient) {
            super(source, fromClient);
        }
    }

}