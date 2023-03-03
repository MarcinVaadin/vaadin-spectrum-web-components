package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("sp-sidenav")
@NpmPackage(value = "@spectrum-web-components/sidenav", version = "0.13.9")
@JsModule("@spectrum-web-components/sidenav/sp-sidenav.js")
public class SpSideNav extends HtmlContainer {

    // ----- manageTabIndex -----
    private static final PropertyDescriptor<Boolean, Boolean> manageTabIndexProperty =
            PropertyDescriptors.propertyWithDefault("manageTabIndex", false);

    public SpSideNav setManageTabIndex(boolean _manageTabIndex) {
        manageTabIndexProperty.set(this, _manageTabIndex);
        return this;
    }
    public boolean isManageTabIndex() {
        return manageTabIndexProperty.get(this);
    }
    // -----------------

    // ----- value -----
    private static final PropertyDescriptor<String, String> valueProperty =
            PropertyDescriptors.propertyWithDefault("value", "");

    public SpSideNav setValue(String _value) {
        valueProperty.set(this, _value);
        return this;
    }
    @Synchronize("change")
    public String getValue() {
        return valueProperty.get(this);
    }
    // -----------------

}
