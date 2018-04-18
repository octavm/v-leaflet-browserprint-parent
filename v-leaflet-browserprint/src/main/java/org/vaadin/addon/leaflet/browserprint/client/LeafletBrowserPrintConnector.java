package org.vaadin.addon.leaflet.browserprint.client;

import com.vaadin.shared.ui.Connect;
import org.vaadin.addon.leaflet.browserprint.LBrowserPrint;
import org.vaadin.addon.leaflet.client.AbstractControlConnector;
import org.vaadin.gleaflet.browserprint.client.BrowserPrint;
import org.vaadin.gleaflet.browserprint.client.BrowserPrintOptions;
import org.vaadin.gleaflet.browserprint.client.PrintModesNames;

@Connect(LBrowserPrint.class)
public class LeafletBrowserPrintConnector extends AbstractControlConnector {

    @Override
    protected BrowserPrint createControl() {
        BrowserPrintOptions options = createOptions();
        return BrowserPrint.create(options);
    }

    protected BrowserPrintOptions createOptions() {
        BrowserPrintOptions o = BrowserPrintOptions.create();
        LeafletBrowserPrintState s = getState();

        if (s.title != null) {
            o.setTitle(s.title);
        }
        if (s.documentTitle != null) {
            o.setDocumentTitle(s.documentTitle);
        }
        if (s.printModes != null) {
            o.setPrintModes(getPrintModes(s.printModes));
        }
        PrintModesNames pmn = PrintModesNames.create();
        o.setPrintModesNames(pmn);
        if (s.portraitName != null) {
            pmn.setPortraitName(s.portraitName);
        }
        if (s.landscapeName != null) {
            pmn.setLandscapeName(s.landscapeName);
        }
        if (s.autoName != null) {
            pmn.setAutoName(s.autoName);
        }
        if (s.customName != null) {
            pmn.setCustomName(s.customName);
        }
        if (s.closePopupsOnPrint != null) {
            o.setClosePopupsOnPrint(s.closePopupsOnPrint);
        }
        if (s.contentSelector != null) {
            o.setContentSelector(s.contentSelector);
        }
        if (s.pagesSelector != null) {
            o.setPagesSelector(s.pagesSelector);
        }
        return o;
    }

    private static String[] getPrintModes(PrintMode... printModes) {
        String[] names = new String[printModes.length];
        for (int i = 0; i < printModes.length; i++) {
            names[i] = printModes[i].name();
        }
        return names;
    }

    @Override
    public LeafletBrowserPrintState getState() {
        return (LeafletBrowserPrintState) super.getState();
    }

    @Override
    protected BrowserPrint getControl() {
        return (BrowserPrint) super.getControl();
    }

}