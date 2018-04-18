package org.vaadin.addon.leaflet.browserprint.client;

public enum PrintMode {

    /**
     * Print currently visual part of the map with PrintMode page dimensions
     */
    Portrait,

    /**
     * Print currently visual part of the map with Landscape page dimensions
     */
    Landscape,

    /**
     * Track all active map layers (markers, lines, polygons, etc. ) and tries to fit them
     * in print page in PrintMode or Landscape page dimensions
     */
    Auto,

    /**
     * Allows you to select rectangle for printing, and then fit it in PrintMode or Landscape page dimensions
     */
    Custom

}
