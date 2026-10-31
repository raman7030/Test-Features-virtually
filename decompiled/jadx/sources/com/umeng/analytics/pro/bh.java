package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: E4PY */
/* JADX INFO: loaded from: classes.dex */
public class bh implements Serializable {
    public static Map d = new HashMap();
    public final String a;
    public final byte b;
    public final bi c;

    public bh(String str, byte b, bi biVar) {
        this.a = str;
        this.b = b;
        this.c = biVar;
    }

    public static void a(Class cls, Map map) {
        d.put(cls, map);
    }

    public static Map a(Class cls) {
        if (!d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return (Map) d.get(cls);
    }
}
