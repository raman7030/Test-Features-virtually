package com.alipay.sdk.p010m.p058y;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.i */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0246i {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, "LTE"),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");


    /* JADX INFO: renamed from: a */
    public int f1169a;

    /* JADX INFO: renamed from: b */
    public String f1170b;

    EnumC0246i(int i, String str) {
        this.f1169a = i;
        this.f1170b = str;
    }

    /* JADX INFO: renamed from: b */
    public final int m1207b() {
        return this.f1169a;
    }

    /* JADX INFO: renamed from: c */
    public final String m1208c() {
        return this.f1170b;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0246i m1205a(int i) {
        for (EnumC0246i enumC0246i : values()) {
            if (enumC0246i.m1207b() == i) {
                return enumC0246i;
            }
        }
        return NONE;
    }
}
