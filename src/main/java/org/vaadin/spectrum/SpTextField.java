package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.utils.ComponentUtils;
import org.vaadin.spectrum.utils.SlotUtils;

@Tag("sp-textfield")
@NpmPackage(value = "@spectrum-web-components/textfield", version = SpConstants.VERSION)
@JsModule("@spectrum-web-components/textfield/sp-textfield.js")
public class SpTextField extends AbstractSinglePropertyField<SpTextField, String> {
    public SpTextField() {
        super("value", "", false);
    }

    // ----- allowedKeys -----
    private static final PropertyDescriptor<String, String> allowedKeysProperty =
            PropertyDescriptors.propertyWithDefault("allowedKeys", "");

    public SpTextField setAllowedKeys(String _allowedKeys) {
        allowedKeysProperty.set(this, _allowedKeys);
        return this;
    }
    public String getAllowedKeys() {
        return allowedKeysProperty.get(this);
    }
    // -----------------

    // ----- autocomplete -----
    private static final PropertyDescriptor<Boolean, Boolean> autocompleteProperty =
            PropertyDescriptors.propertyWithDefault("autocomplete", false);

    public SpTextField setAutocomplete(boolean _autocomplete) {
        autocompleteProperty.set(this, _autocomplete);
        return this;
    }
    public boolean isAutocomplete() {
        return autocompleteProperty.get(this);
    }
    // -----------------

    // ----- grows -----
    private static final PropertyDescriptor<Boolean, Boolean> growsProperty =
            PropertyDescriptors.propertyWithDefault("grows", false);

    public SpTextField setGrows(boolean _grows) {
        growsProperty.set(this, _grows);
        return this;
    }
    public boolean isGrows() {
        return growsProperty.get(this);
    }
    // -----------------

    // ----- invalid -----
    private static final PropertyDescriptor<Boolean, Boolean> invalidProperty =
            PropertyDescriptors.propertyWithDefault("invalid", false);

    public SpTextField setInvalid(boolean _invalid) {
        invalidProperty.set(this, _invalid);
        return this;
    }
    public boolean isInvalid() {
        return invalidProperty.get(this);
    }
    // -----------------

    // ----- label -----
    private static final PropertyDescriptor<String, String> labelProperty =
            PropertyDescriptors.propertyWithDefault("label", "");

    public SpTextField setLabel(String _label) {
        labelProperty.set(this, _label);
        return this;
    }
    public String getLabel() {
        return labelProperty.get(this);
    }
    // -----------------

    // ----- maxlength -----
    private static final PropertyDescriptor<Integer, Integer> maxlengthProperty =
            PropertyDescriptors.propertyWithDefault("maxlength", -1);

    public SpTextField setMaxlength(Integer _maxlength) {
        maxlengthProperty.set(this, _maxlength);
        return this;
    }
    public Integer getMaxlength() {
        return maxlengthProperty.get(this);
    }
    // -----------------

    // ----- minlength -----
    private static final PropertyDescriptor<Integer, Integer> minlengthProperty =
            PropertyDescriptors.propertyWithDefault("minlength", -1);

    public SpTextField setMinlength(Integer _minlength) {
        minlengthProperty.set(this, _minlength);
        return this;
    }
    public Integer getMinlength() {
        return minlengthProperty.get(this);
    }
    // -----------------

    // ----- multiline -----
    private static final PropertyDescriptor<Boolean, Boolean> multilineProperty =
            PropertyDescriptors.propertyWithDefault("multiline", false);

    public SpTextField setMultiline(boolean _multiline) {
        multilineProperty.set(this, _multiline);
        return this;
    }
    public boolean isMultiline() {
        return multilineProperty.get(this);
    }
    // -----------------

    // ----- pattern -----
    private static final PropertyDescriptor<String, String> patternProperty =
            PropertyDescriptors.propertyWithDefault("pattern", "");

    public SpTextField setPattern(String _pattern) {
        patternProperty.set(this, _pattern);
        return this;
    }
    public String getPattern() {
        return patternProperty.get(this);
    }
    // -----------------

    // ----- placeholder -----
    private static final PropertyDescriptor<String, String> placeholderProperty =
            PropertyDescriptors.propertyWithDefault("placeholder", "");

    public SpTextField setPlaceholder(String _placeholder) {
        placeholderProperty.set(this, _placeholder);
        return this;
    }
    public String getPlaceholder() {
        return placeholderProperty.get(this);
    }
    // -----------------

    // ----- quiet -----
    private static final PropertyDescriptor<Boolean, Boolean> quietProperty =
            PropertyDescriptors.propertyWithDefault("quiet", false);

    public SpTextField setQuiet(boolean _quiet) {
        quietProperty.set(this, _quiet);
        return this;
    }
    public boolean isQuiet() {
        return quietProperty.get(this);
    }
    // -----------------

    // ----- readonly -----
    private static final PropertyDescriptor<Boolean, Boolean> readonlyProperty =
            PropertyDescriptors.propertyWithDefault("readonly", false);

    public SpTextField setReadonly(boolean _readonly) {
        readonlyProperty.set(this, _readonly);
        return this;
    }
    public boolean isReadonly() {
        return readonlyProperty.get(this);
    }
    // -----------------

    // ----- required -----
    private static final PropertyDescriptor<Boolean, Boolean> requiredProperty =
            PropertyDescriptors.propertyWithDefault("required", false);

    public SpTextField setRequired(boolean _required) {
        requiredProperty.set(this, _required);
        return this;
    }
    public boolean isRequired() {
        return requiredProperty.get(this);
    }
    // -----------------

    // ----- rows -----
    private static final PropertyDescriptor<Integer, Integer> rowsProperty =
            PropertyDescriptors.propertyWithDefault("rows", -1);

    public SpTextField setRows(Integer _rows) {
        rowsProperty.set(this, _rows);
        return this;
    }
    public Integer getRows() {
        return rowsProperty.get(this);
    }
    // -----------------

    // ----- valid -----
    private static final PropertyDescriptor<Boolean, Boolean> validProperty =
            PropertyDescriptors.propertyWithDefault("valid", false);

    public SpTextField setValid(boolean _valid) {
        validProperty.set(this, _valid);
        return this;
    }
    public boolean isValid() {
        return validProperty.get(this);
    }
    // -----------------

    public void setHelpText(String helpText) {
        SlotUtils.setSlot(this, "help-text", ComponentUtils.divWrap(helpText));
    }

    public void setNegativeHelpText(String helpText) {
        SlotUtils.setSlot(this, "negative-help-text", ComponentUtils.divWrap((helpText)));
    }

    @Override
    public void setReadOnly(boolean readOnly) {
        this.setReadonly(readOnly);
    }

    @Override
    public boolean isReadOnly() {
        return this.isReadonly();
    }

    @Override
    public void setRequiredIndicatorVisible(boolean requiredIndicatorVisible) {
        this.setRequired(requiredIndicatorVisible);
    }

    @Override
    public boolean isRequiredIndicatorVisible() {
        return this.isRequired();
    }

    @Synchronize("change")
    @Override
    public String getValue() {
        return super.getValue();
    }

}
