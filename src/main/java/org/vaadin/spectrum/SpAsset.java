package org.vaadin.spectrum;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;
import org.vaadin.spectrum.properties.HasLabelFluent;
import org.vaadin.spectrum.properties.HasVariantFluent;

@Tag("sp-asset")
@NpmPackage(value = "@spectrum-web-components/asset", version = "0.7.7")
@JsModule("@spectrum-web-components/asset/sp-asset.js")
public class SpAsset extends HtmlContainer implements HasDirFluent<SpAsset>, HasLabelFluent<SpAsset>,
        HasVariantFluent<SpAsset>, HasStyle {

    public enum Variant {FILE, FOLDER}

    public SpAsset setVariant(Variant _variant) {
        assert _variant != null;
        this.setVariant(_variant.name().toLowerCase());
        return this;
    }

}
