package com.alipay.sdk.p010m.p044q0;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alipay.sdk.m.q0.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0196f {

    /* JADX INFO: renamed from: a */
    public static final Pattern f917a = Pattern.compile("([\t\r\n])+");

    /* JADX INFO: renamed from: a */
    public static int m947a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            i = (i * 31) + c;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m948b(String str) {
        return str == null || str.length() <= 0;
    }
}
