package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: X45I */
/* JADX INFO: loaded from: classes.dex */
public class ba {
    public static az a(Class cls, int i) {
        try {
            return (az) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
