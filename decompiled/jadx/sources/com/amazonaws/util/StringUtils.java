package com.amazonaws.util;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f844 = Charset.forName(a.D);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m789(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toLowerCase(Locale.ENGLISH);
    }
}
