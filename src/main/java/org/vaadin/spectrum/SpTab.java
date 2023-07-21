package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDisabledFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;

@Tag("sp-tab")
@NpmPackage(value = "@spectrum-web-components/tabs", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/tabs/sp-tab.js")
public class SpTab extends Component implements HasLabelFluent<SpTab>, HasDisabledFluent<SpTab> {

    // ----- dir -----
    private static final PropertyDescriptor<String, String> dirProperty =
            PropertyDescriptors.propertyWithDefault("dir", "ltr");

    public SpTab setDir(String dir) {
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

    public SpTab setSelected(boolean selected) {
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

    public SpTab setValue(String value) {
        valueProperty.set(this, value);
        return this;
    }
    public String getValue() {
        return valueProperty.get(this);
    }
    // -----------------

    // ----- vertical -----
    private static final PropertyDescriptor<Boolean, Boolean> verticalProperty =
            PropertyDescriptors.propertyWithDefault("vertical", false);

    public SpTab setVertical(boolean vertical) {
        verticalProperty.set(this, vertical);
        return this;
    }
    public boolean isVertical() {
        return verticalProperty.get(this);
    }
    // -----------------

}
