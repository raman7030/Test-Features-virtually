package com.amazonaws.regions;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RegionUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final Log f1569 = LogFactory.m1469("com.amazonaws.request");

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList f1570;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m1590() {
        if (System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride") != null) {
            try {
                m1591();
            } catch (FileNotFoundException e) {
                throw new RuntimeException("Couldn't find regions override file specified", e);
            }
        }
        if (f1570 == null) {
            Log log = f1569;
            if (log.mo1459()) {
                log.mo1460("Initializing the regions with default regions");
            }
            f1570 = RegionDefaults.m1585();
        }
        if (f1570 == null) {
            throw new RuntimeException("Failed to initialize the regions.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Region m1589(String str) {
        ArrayList<Region> arrayList;
        synchronized (RegionUtils.class) {
            if (f1570 == null) {
                m1590();
            }
            arrayList = f1570;
        }
        for (Region region : arrayList) {
            if (region.m1582().equals(str)) {
                return region;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1591() {
        String property = System.getProperty("com.amazonaws.regions.RegionUtils.fileOverride");
        Log log = f1569;
        if (log.mo1459()) {
            log.mo1460("Using local override of the regions file (" + property + ") to initiate regions data...");
        }
        FileInputStream fileInputStream = new FileInputStream(new File(property));
        try {
            new RegionMetadataParser();
            f1570 = RegionMetadataParser.m1588(fileInputStream);
        } catch (Exception e) {
            log.mo1464("Failed to parse regional endpoints", e);
        }
    }
}
