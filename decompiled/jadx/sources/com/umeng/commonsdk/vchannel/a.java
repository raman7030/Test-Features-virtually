package com.umeng.commonsdk.vchannel;

import l.C16014;
import l.C5368;

/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a = "https://pslog.umeng.com";
    public static String b = "https://pslog.umeng.com/";
    public static String c = "explog";
    public static final String d = "analytics";
    public static final String e = "ekv";
    public static final String f = "id";
    public static final String g = "ts";
    public static final String h = "ds";
    public static final String i = "pn";
    public static String j = "";

    static {
        String strM37865 = C16014.m37865(System.currentTimeMillis(), "SUB");
        StringBuilder sbM15339 = C5368.m15339(strM37865);
        sbM15339.append(String.format("%0" + (32 - strM37865.length()) + "d", 0));
        j = sbM15339.toString();
    }
}
