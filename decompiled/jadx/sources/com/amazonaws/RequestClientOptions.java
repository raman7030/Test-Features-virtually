package com.amazonaws;

import java.util.EnumMap;
import p067l.C24104;

/* JADX INFO: loaded from: classes.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: ֫ */
    public final EnumMap f1273 = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1362(Marker marker) {
        return (String) this.f1273.get(marker);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1363(String str) {
        Marker marker = Marker.USER_AGENT;
        EnumMap enumMap = this.f1273;
        String strM53357 = (String) enumMap.get(marker);
        if (strM53357 == null) {
            strM53357 = "";
        }
        if (!strM53357.contains(str)) {
            strM53357 = C24104.m53357(strM53357, " ", str);
        }
        enumMap.put(marker, strM53357);
    }
}
