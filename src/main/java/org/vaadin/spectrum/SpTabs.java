package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasLabelFluent;

import java.util.UUID;

@Tag("sp-tabs")
@NpmPackage(value = "@spectrum-web-components/tabs", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/tabs/sp-tabs.js")
public class SpTabs extends Component implements HasComponents, HasSize, HasLabelFluent<SpTabs> {

    // ----- auto -----
    private static final PropertyDescriptor<Boolean, Boolean> autoProperty =
            PropertyDescriptors.propertyWithDefault("auto", false);

    public SpTabs setAuto(boolean auto) {
        autoProperty.set(this, auto);
        return this;
    }
    public boolean isAuto() {
        return autoProperty.get(this);
    }
    // -----------------

    // ----- compact -----
    private static final PropertyDescriptor<Boolean, Boolean> compactProperty =
            PropertyDescriptors.propertyWithDefault("compact", false);

    public SpTabs setCompact(boolean compact) {
        compactProperty.set(this, compact);
        return this;
    }
    public boolean isCompact() {
        return compactProperty.get(this);
    }
    // -----------------

    // ----- direction -----
    private static final PropertyDescriptor<String, String> directionProperty =
            PropertyDescriptors.propertyWithDefault("direction", "horizontal");

    public SpTabs setDirection(String direction) {
        directionProperty.set(this, direction);
        return this;
    }
    public String getDirection() {
        return directionProperty.get(this);
    }
    // -----------------

    // ----- emphasized -----
    private static final PropertyDescriptor<Boolean, Boolean> emphasizedProperty =
            PropertyDescriptors.propertyWithDefault("emphasized", false);

    public SpTabs setEmphasized(boolean emphasized) {
        emphasizedProperty.set(this, emphasized);
        return this;
    }
    public boolean isEmphasized() {
        return emphasizedProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpTabs setQuiet(boolean quiet) {
        quietProperty.set(this, quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<String, String> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", "");

    public SpTabs setSelected(String selected) {
        selectedProperty.set(this, selected);
        return this;
    }

    @Synchronize("change")
    public String getSelected() {
        return selectedProperty.get(this);
    }
    // -----------------



    public void addTab(SpTab tab, SpTabPanel panel) {
        String value = UUID.randomUUID().toString();
        tab.setValue(value);
        panel.setValue(value);
        add(tab, panel);
    }

    public void selectedTab(SpTab tab) {
        setSelected(tab.getValue());
    }

}
