package com.umeng.analytics.pro;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ba */
/* JADX INFO: compiled from: X45I */
/* JADX INFO: loaded from: classes.dex */
public class C0670ba {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0668az m2319a(Class cls, int i) {
        try {
            return (InterfaceC0668az) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
