package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;
import org.vaadin.spectrum.properties.HasSizeFluent;

@Tag("sp-icon")
@NpmPackage(value = "@spectrum-web-components/icon", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/icon/sp-icon.js")
public class SpIcon extends Component implements HasDirFluent<SpIcon>, HasLabelFluent<SpIcon>, HasSizeFluent<SpIcon>, HasStyle {

    // ----- name -----
    private static final PropertyDescriptor<String, String> nameProperty =
            PropertyDescriptors.propertyWithDefault("name", "");

    public SpIcon setName(String _name) {
        nameProperty.set(this, _name);
        return this;
    }
    public String getName() {
        return nameProperty.get(this);
    }
    // -----------------

    // ----- src -----
    private static final PropertyDescriptor<String, String> srcProperty =
            PropertyDescriptors.propertyWithDefault("src", "");

    public SpIcon setSrc(String _src) {
        srcProperty.set(this, _src);
        return this;
    }
    public String getSrc() {
        return srcProperty.get(this);
    }
    // -----------------



}
