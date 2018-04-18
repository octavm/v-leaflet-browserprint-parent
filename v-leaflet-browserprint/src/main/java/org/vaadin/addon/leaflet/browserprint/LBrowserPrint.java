package org.vaadin.addon.leaflet.browserprint;

import org.vaadin.addon.leaflet.browserprint.client.PrintMode;
import org.vaadin.addon.leaflet.control.AbstractControl;
import org.vaadin.addon.leaflet.browserprint.client.LeafletBrowserPrintState;

/**
 * A Leaflet Control which allows users to print full page map directly from the browser
 */
public class LBrowserPrint extends AbstractControl {

    @Override
    protected LeafletBrowserPrintState getState() {
        return (LeafletBrowserPrintState) super.getState();
    }

    /**
     * Sets the text which appears as the tooltip of the print button
     * @param title to set. Default is "Print map"
     */
    public void setTitle(String title) {
        getState().title = title;
    }

    /**
     * Sets the text which appears as the print page title
     * @param documentTitle to set. Default is ""
     */
    public void setDocumentTitle(String documentTitle) {
        getState().documentTitle = documentTitle;
    }

    /**
     * Sets the print modes to show in the control
     * @param printModes Collection of page print actions
     */
    public void setPrintModes(PrintMode... printModes) {
        getState().printModes = printModes;
    }

    /**
     * Customize each print mode name
     */
    public void setPrintModesNames(String portrait, String landscape, String auto, String custom) {
        getState().portraitName = portrait;
        getState().landscapeName = landscape;
        getState().autoName = auto;
        getState().customName = custom;
    }

    /**
     * Indicates if we need to force popup closing for printed map
     * @param closePopupsOnPrint Boolean default is <code>true</code>
     */
    public void setClosePopupsOnPrint(Boolean closePopupsOnPrint) {
        getState().closePopupsOnPrint = closePopupsOnPrint;
    }

    /**
     * Content selector for printed map, will select and dynamically inject content on printed maps
     * @param contentSelector String. Default is "[leaflet-browser-print-content]"
     */
    public void setContentSelector(String contentSelector) {
        getState().contentSelector = contentSelector;
    }

    /**
     * Pages selector for printed map, will select and dynamically inject additional pages content on printed maps
     * @param pagesSelector String. Default is "[leaflet-browser-print-pages]"
     */
    public void setPagesSelector(String pagesSelector) {
        getState().pagesSelector = pagesSelector;
    }

}
