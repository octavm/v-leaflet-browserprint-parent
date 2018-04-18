package org.vaadin.gleaflet.browserprint.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletBrowserPrintClientBundle extends ClientBundle {

    @Source("leaflet.browser.print.min.js")
    @DoNotEmbed
    TextResource script();

}
