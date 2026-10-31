package com.amazonaws;

import java.util.EnumMap;
import l.C22870;

/* JADX INFO: loaded from: classes.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumMap f113 = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m196(Marker marker) {
        return (String) this.f113.get(marker);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m197(String str) {
        Marker marker = Marker.USER_AGENT;
        EnumMap enumMap = this.f113;
        String strM50967 = (String) enumMap.get(marker);
        if (strM50967 == null) {
            strM50967 = "";
        }
        if (!strM50967.contains(str)) {
            strM50967 = C22870.m50967(strM50967, " ", str);
        }
        enumMap.put(marker, strM50967);
    }
}
