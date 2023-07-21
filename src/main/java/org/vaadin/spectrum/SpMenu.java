package org.vaadin.spectrum;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;

@Tag("sp-menu")
@NpmPackage(value = "@spectrum-web-components/menu", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/menu/sp-menu.js")
public class SpMenu extends HtmlContainer implements HasDirFluent<SpMenu>, HasLabelFluent<SpMenu> {

    public enum Selects {INHERIT, SINGLE, MULTIPLE};

    // ----- selects -----
    private static final PropertyDescriptor<String, String> selectsProperty =
            PropertyDescriptors.propertyWithDefault("selects", "");

    public SpMenu setSelects(String selects) {
        selectsProperty.set(this, selects);
        return this;
    }
    public String getSelects() {
        return selectsProperty.get(this);
    }
    // -----------------

    // ----- valueSeparator -----
    private static final PropertyDescriptor<String, String> valueSeparatorProperty =
            PropertyDescriptors.propertyWithDefault("valueSeparator", ",");

    public SpMenu setValueSeparator(String valueSeparator) {
        valueSeparatorProperty.set(this, valueSeparator);
        return this;
    }
    public String getValueSeparator() {
        return valueSeparatorProperty.get(this);
    }
    // -----------------

    public SpMenu setSelects(Selects selects) {
        assert selects != null;
        this.setSelects(selects.name().toLowerCase());
        return this;
    }

}
