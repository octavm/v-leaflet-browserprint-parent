package org.vaadin.gleaflet.browserprint.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class BrowserPrintOptions extends JavaScriptObject {

    protected BrowserPrintOptions() {}

    public static native BrowserPrintOptions create()
    /*-{
        return {};
    }-*/;

    public native final void setTitle(String title)
    /*-{
        this.title = title;
    }-*/;

    public native final void setDocumentTitle(String documentTitle)
    /*-{
        this.documentTitle = documentTitle;
    }-*/;

    public native final void closePopupsOnPrint(boolean closePopupsOnPrint)
    /*-{
        this.closePopupsOnPrint = closePopupsOnPrint;
    }-*/;

    public final void setPrintModes(String... printModes) {
        JsArrayString modes = JsArrayString.createArray().cast();
        for (String m : printModes) {
            modes.push(m);
        }
        setPrintModes(modes);
    }

    public native final void setPrintModes(JsArrayString printModes)
    /*-{
        this.printModes = printModes;
    }-*/;

    public native final void setPrintModesNames(PrintModesNames printModesNames)
    /*-{
        this.printModesNames = printModesNames;
    }-*/;

    public native final void setClosePopupsOnPrint(boolean closePopupsOnPrint)
    /*-{
        this.closePopupsOnPrint = closePopupsOnPrint;
    }-*/;

    public native final void setContentSelector(String contentSelector)
    /*-{
        this.contentSelector = contentSelector;
    }-*/;

    public native final void setPagesSelector(String pagesSelector)
    /*-{
        this.pagesSelector = pagesSelector;
    }-*/;
}
