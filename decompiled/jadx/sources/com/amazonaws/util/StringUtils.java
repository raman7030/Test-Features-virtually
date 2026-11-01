package com.amazonaws.util;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class StringUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final Charset f2004 = Charset.forName(C0233a.f1077D);

    /* JADX INFO: renamed from: ֫ */
    public static String m1954(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? "" : str.toLowerCase(Locale.ENGLISH);
    }
}
