package org.vaadin.spectrum;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("sp-textfield")
@NpmPackage(value = "@spectrum-web-components/textfield", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/textfield/sp-textfield.js")
public class SpTextField extends AbstractSinglePropertyField<SpTextField, String> {
    public SpTextField() {
        super("value", "", false);
    }

    @Synchronize("change")
    @Override
    public String getValue() {
        return super.getValue();
    }
}
