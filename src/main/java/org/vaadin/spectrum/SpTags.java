package org.vaadin.spectrum;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import org.vaadin.spectrum.properties.HasDirFluent;

@Tag("sp-tags")
@NpmPackage(value = "@spectrum-web-components/tags", version = "0.10.4")
@JsModule("@spectrum-web-components/tags/sp-tags.js")
public class SpTags extends Component implements
        HasDirFluent<SpTags> {

    public void add(SpTag tag) {
        getElement().appendChild(tag.getElement());
    }

}
