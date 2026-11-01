package com.umeng.commonsdk.vchannel;

import p067l.C17588;
import p067l.C7470;

/* JADX INFO: renamed from: com.umeng.commonsdk.vchannel.a */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes.dex */
public class C0833a {

    /* JADX INFO: renamed from: a */
    public static String f3656a = "https://pslog.umeng.com";

    /* JADX INFO: renamed from: b */
    public static String f3657b = "https://pslog.umeng.com/";

    /* JADX INFO: renamed from: c */
    public static String f3658c = "explog";

    /* JADX INFO: renamed from: d */
    public static final String f3659d = "analytics";

    /* JADX INFO: renamed from: e */
    public static final String f3660e = "ekv";

    /* JADX INFO: renamed from: f */
    public static final String f3661f = "id";

    /* JADX INFO: renamed from: g */
    public static final String f3662g = "ts";

    /* JADX INFO: renamed from: h */
    public static final String f3663h = "ds";

    /* JADX INFO: renamed from: i */
    public static final String f3664i = "pn";

    /* JADX INFO: renamed from: j */
    public static String f3665j = "";

    static {
        String strM40051 = C17588.m40051(System.currentTimeMillis(), "SUB");
        StringBuilder sbM17248 = C7470.m17248(strM40051);
        sbM17248.append(String.format("%0" + (32 - strM40051.length()) + "d", 0));
        f3665j = sbM17248.toString();
    }
}
