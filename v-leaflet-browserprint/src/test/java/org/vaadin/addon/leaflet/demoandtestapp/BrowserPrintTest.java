package org.vaadin.addon.leaflet.demoandtestapp;

import com.vaadin.ui.Component;
import org.vaadin.addon.leaflet.LMap;
import org.vaadin.addon.leaflet.LMarker;
import org.vaadin.addon.leaflet.LOpenStreetMapLayer;
import org.vaadin.addon.leaflet.browserprint.LBrowserPrint;
import org.vaadin.addon.leaflet.browserprint.client.PrintMode;
import org.vaadin.addon.leaflet.shared.ControlPosition;
import org.vaadin.addonhelpers.AbstractTest;

public class BrowserPrintTest extends AbstractTest {

    @Override
    public String getDescription() {
        return "Test browser.print control";
    }

    private LMap leafletMap;

    @Override
    public Component getTestComponent() {
        leafletMap = new LMap();
        leafletMap.setCenter(60.4525, 22.301);
        leafletMap.setZoomLevel(15);
        leafletMap.addBaseLayer(new LOpenStreetMapLayer(), "OSM");

        LBrowserPrint browserPrint = new LBrowserPrint();
        browserPrint.setPosition(ControlPosition.topleft);
        browserPrint.setTitle("Print the map");
        browserPrint.setDocumentTitle("Leaflet Map");
        browserPrint.setPrintModes(PrintMode.Landscape, PrintMode.Custom);
        browserPrint.setPrintModesNames(null, "My Landscape", null, "Area Select");
        leafletMap.addControl(browserPrint);

        LMarker marker1 = new LMarker(60.4525, 22.301);
        LMarker marker2 = new LMarker(60.4535, 22.311);

        marker1.setPopup("Marker 1");
        marker1.setPopup("Marker 2");

        leafletMap.addLayer(marker1);
        leafletMap.addLayer(marker2);

		return leafletMap;
    }

    @Override
    protected void setup() {
        super.setup();
    }

}
