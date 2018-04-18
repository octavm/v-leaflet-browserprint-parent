package org.vaadin.gleaflet.browserprint.client;

import org.peimari.gleaflet.client.control.Control;
import org.vaadin.gleaflet.browserprint.client.resources.LeafletBrowserPrintResourceInjector;

public class BrowserPrint extends Control {

	static {
        LeafletBrowserPrintResourceInjector.ensureInjected();
	}

	protected BrowserPrint() {}

    public static native BrowserPrint create(BrowserPrintOptions options)
	/*-{
        return new $wnd.L.control.browserPrint(options);
    }-*/;

}
