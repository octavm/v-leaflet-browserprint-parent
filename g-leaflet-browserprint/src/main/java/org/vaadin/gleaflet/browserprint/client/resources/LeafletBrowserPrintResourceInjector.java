package org.vaadin.gleaflet.browserprint.client.resources;

import com.google.gwt.core.client.GWT;
import org.peimari.gleaflet.client.resources.LeafletResourceInjector;

public class LeafletBrowserPrintResourceInjector {

	protected static LeafletBrowserPrintClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			LeafletResourceInjector.ensureInjected();
			bundle = GWT.create(LeafletBrowserPrintClientBundle.class);
			LeafletBrowserPrintResourceInjector injector = GWT.create(LeafletBrowserPrintResourceInjector.class);
			injector.injectResources();
		}
	}
	
	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		injectScript(bundle.script().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
