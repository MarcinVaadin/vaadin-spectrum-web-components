package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("sp-tab-panel")
@NpmPackage(value = "@spectrum-web-components/tabs", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/tabs/sp-tab-panel.js")
public class SpTabPanel extends Component implements HasComponents {

    // ----- dir -----
    private static final PropertyDescriptor<String, String> dirProperty =
            PropertyDescriptors.propertyWithDefault("dir", "ltr");

    public SpTabPanel setDir(String dir) {
        dirProperty.set(this, dir);
        return this;
    }
    public String getDir() {
        return dirProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<Boolean, Boolean> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", false);

    public SpTabPanel setSelected(boolean selected) {
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

    public SpTabPanel setValue(String value) {
        valueProperty.set(this, value);
        return this;
    }
    public String getValue() {
        return valueProperty.get(this);
    }
    // -----------------

}
