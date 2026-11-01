package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bh */
/* JADX INFO: compiled from: E4PY */
/* JADX INFO: loaded from: classes.dex */
public class C0677bh implements Serializable {

    /* JADX INFO: renamed from: d */
    public static Map f2469d = new HashMap();

    /* JADX INFO: renamed from: a */
    public final String f2470a;

    /* JADX INFO: renamed from: b */
    public final byte f2471b;

    /* JADX INFO: renamed from: c */
    public final C0678bi f2472c;

    public C0677bh(String str, byte b, C0678bi c0678bi) {
        this.f2470a = str;
        this.f2471b = b;
        this.f2472c = c0678bi;
    }

    /* JADX INFO: renamed from: a */
    public static void m2351a(Class cls, Map map) {
        f2469d.put(cls, map);
    }

    /* JADX INFO: renamed from: a */
    public static Map m2350a(Class cls) {
        if (!f2469d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return (Map) f2469d.get(cls);
    }
}
