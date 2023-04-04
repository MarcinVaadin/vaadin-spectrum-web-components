package org.vaadin.spectrum;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasSizeFluent;
import org.vaadin.spectrum.properties.HasTextFluent;

@Tag("sp-checkbox")
@NpmPackage(value = "@spectrum-web-components/checkbox", version = "0.14.12")
@JsModule("@spectrum-web-components/checkbox/sp-checkbox.js")
public class SpCheckbox extends Component implements HasTextFluent<SpCheckbox>,
        HasSizeFluent<SpCheckbox>, ClickNotifier<SpCheckbox> {

    // ----- checked -----
    private static final PropertyDescriptor<Boolean, Boolean> checkedProperty =
            PropertyDescriptors.propertyWithDefault("checked", false);

    public SpCheckbox setChecked(boolean _checked) {
        checkedProperty.set(this, _checked);
        return this;
    }
    @Synchronize("click")
    public boolean isChecked() {
        return checkedProperty.get(this);
    }
    // -----------------

    // ----- emphasized -----
    private static final PropertyDescriptor<Boolean, Boolean> emphasizedProperty =
            PropertyDescriptors.propertyWithDefault("emphasized", false);

    public SpCheckbox setEmphasized(boolean _emphasized) {
        emphasizedProperty.set(this, _emphasized);
        return this;
    }
    public boolean isEmphasized() {
        return emphasizedProperty.get(this);
    }
    // -----------------

    // ----- indeterminate -----
    private static final PropertyDescriptor<Boolean, Boolean> indeterminateProperty =
            PropertyDescriptors.propertyWithDefault("indeterminate", false);

    public SpCheckbox setIndeterminate(boolean _indeterminate) {
        indeterminateProperty.set(this, _indeterminate);
        return this;
    }
    public boolean isIndeterminate() {
        return indeterminateProperty.get(this);
    }
    // -----------------

    // ----- invalid -----
    private static final PropertyDescriptor<Boolean, Boolean> invalidProperty =
            PropertyDescriptors.propertyWithDefault("invalid", false);

    public SpCheckbox setInvalid(boolean _invalid) {
        invalidProperty.set(this, _invalid);
        return this;
    }
    public boolean isInvalid() {
        return invalidProperty.get(this);
    }
    // -----------------

    // ----- readOnly -----
    private static final PropertyDescriptor<Boolean, Boolean> readOnlyProperty =
            PropertyDescriptors.propertyWithDefault("readOnly", false);

    public SpCheckbox setReadOnly(boolean _readOnly) {
        readOnlyProperty.set(this, _readOnly);
        return this;
    }
    public boolean isReadOnly() {
        return readOnlyProperty.get(this);
    }
    // -----------------

}
