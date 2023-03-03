package org.vaadin.spectrum.demo;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import org.vaadin.spectrum.SpDivider;
import org.vaadin.spectrum.SpHtml;
import org.vaadin.spectrum.SpLink;
import org.vaadin.spectrum.properties.HasSizeFluent;

public class DemoView extends Div {

    public DemoView(Class<?> clazz) {
        setWidthFull();
        Span title = new Span(clazz.getAnnotation(Tag.class).value());
        Span version = new Span("v" + clazz.getAnnotation(NpmPackage.class).version());
        version.getClassNames().add("spectrum-Heading--sizeM");
        version.getStyle().set("margin-left", "20px");
        H2 header = SpHtml.header().components(title, version).serif().asH2();
        header.getStyle().set("display", "flex").set("align-items", "baseline").set("justify-content", "space-between");
        add(header);
        add(new SpDivider().setSize(HasSizeFluent.Size.L));
        String url = "https://opensource.adobe.com/spectrum-web-components/components/" + title.getText().substring(3);
        add(new Paragraph(new SpLink(url, url)));
        add(new SpDivider().setSize(HasSizeFluent.Size.M));
    }

}