package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.umeng.commonsdk.config.b */
/* JADX INFO: compiled from: 3BMH */
/* JADX INFO: loaded from: classes.dex */
public class C0757b implements InterfaceC0761f {

    /* JADX INFO: renamed from: a */
    public static Map f3057a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static Object f3058b = new Object();

    public C0757b() {
    }

    /* JADX INFO: renamed from: a */
    public void m2743a() {
        synchronized (f3058b) {
            f3057a.clear();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.b$a */
    /* JADX INFO: compiled from: 3BMH */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0757b f3059a = new C0757b();
    }

    /* JADX INFO: renamed from: b */
    public static C0757b m2742b() {
        return a.f3059a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2741a(String str) {
        if (!C0759d.m2747a(str)) {
            return false;
        }
        synchronized (f3058b) {
            if (!f3057a.containsKey(str)) {
                return true;
            }
            return ((Boolean) f3057a.get(str)).booleanValue();
        }
    }

    @Override // com.umeng.commonsdk.config.InterfaceC0761f
    /* JADX INFO: renamed from: a */
    public void mo2744a(String str, Boolean bool) {
        if (C0759d.m2747a(str)) {
            synchronized (f3058b) {
                Map map = f3057a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
