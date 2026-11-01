package com.umeng.p065vt.diff.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClassLoadUtil {
    public static Class findClass(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
