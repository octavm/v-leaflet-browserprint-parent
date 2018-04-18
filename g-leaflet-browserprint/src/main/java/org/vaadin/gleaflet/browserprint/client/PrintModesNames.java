package org.vaadin.gleaflet.browserprint.client;

import com.google.gwt.core.client.JavaScriptObject;

public class PrintModesNames extends JavaScriptObject {

    protected PrintModesNames() {}

    public static native PrintModesNames create()
    /*-{
        return {};
    }-*/;

    public native final void setLandscapeName(String name)
    /*-{
        this.Landscape = name;
    }-*/;

    public native final void setPortraitName(String name)
    /*-{
        this.Portrait = name;
    }-*/;

    public native final void setAutoName(String name)
    /*-{
        this.Auto = name;
    }-*/;

    public native final void setCustomName(String name)
    /*-{
        this.Custom = name;
    }-*/;

}
