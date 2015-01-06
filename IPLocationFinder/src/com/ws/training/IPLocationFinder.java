package com.ws.training;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Please suppy an IP address as command line argument!");
		} else {
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(args[0]);
			System.out.println(geoIP.getCountryName());
		}
	}
}
