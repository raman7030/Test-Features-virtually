package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: 3BMH */
/* JADX INFO: loaded from: classes.dex */
public class b implements f {
    public static Map a = new HashMap();
    public static Object b = new Object();

    public b() {
    }

    public void a() {
        synchronized (b) {
            a.clear();
        }
    }

    /* JADX INFO: compiled from: 3BMH */
    public class a {
        public static final b a = new b();
    }

    public static b b() {
        return a.a;
    }

    public static boolean a(String str) {
        if (!d.a(str)) {
            return false;
        }
        synchronized (b) {
            if (!a.containsKey(str)) {
                return true;
            }
            return ((Boolean) a.get(str)).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(String str, Boolean bool) {
        if (d.a(str)) {
            synchronized (b) {
                Map map = a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
