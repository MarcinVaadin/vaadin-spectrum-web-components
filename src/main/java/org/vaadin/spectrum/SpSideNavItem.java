package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-sidenav-item")
@NpmPackage(value = "@spectrum-web-components/sidenav", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/sidenav/sp-sidenav-item.js")
public class SpSideNavItem extends Component implements HasTextFluent<SpSideNavItem> {

    // ----- label -----
    private static final PropertyDescriptor<String, String> labelProperty =
            PropertyDescriptors.propertyWithDefault("label", "");
    
    public SpSideNavItem setLabel(String _label) {
        labelProperty.set(this, _label);
        return this;
    }
    public String getLabel() {
        return labelProperty.get(this);
    }
    // -----------------
    
    // ----- href -----
    private static final PropertyDescriptor<String, String> hrefProperty =
            PropertyDescriptors.propertyWithDefault("href", "");
    
    public SpSideNavItem setHref(String _href) {
        hrefProperty.set(this, _href);
        return this;
    }
    public String getHref() {
        return hrefProperty.get(this);
    }
    // -----------------

    // ----- expanded -----
    private static final PropertyDescriptor<Boolean, Boolean> expandedProperty =
            PropertyDescriptors.propertyWithDefault("expanded", false);

    public SpSideNavItem setExpanded(boolean _expanded) {
        expandedProperty.set(this, _expanded);
        return this;
    }
    public boolean isExpanded() {
        return expandedProperty.get(this);
    }
    // -----------------

    // ----- selected -----
    private static final PropertyDescriptor<Boolean, Boolean> selectedProperty =
            PropertyDescriptors.propertyWithDefault("selected", false);

    public SpSideNavItem setSelected(boolean _selected) {
        selectedProperty.set(this, _selected);
        return this;
    }
    public boolean isSelected() {
        return selectedProperty.get(this);
    }
    // -----------------
    
    // ----- value -----
    private static final PropertyDescriptor<String, String> valueProperty =
            PropertyDescriptors.propertyWithDefault("value", "");
    
    public SpSideNavItem setValue(String _value) {
        valueProperty.set(this, _value);
        return this;
    }
    public String getValue() {
        return valueProperty.get(this);
    }
    // -----------------

    // TODO setIcon( )

}
