package com.alipay.sdk.m.g;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static List a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(new l());
        a.add(new d());
        a.add(new c());
        a.add(new h());
        a.add(new k());
        a.add(new b());
        a.add(new a());
        a.add(new g());
    }

    public static final Object a(Object obj, Type type) {
        Object objA;
        for (i iVar : a) {
            if (iVar.a(com.alipay.sdk.m.h.a.a(type)) && (objA = iVar.a(obj, type)) != null) {
                return objA;
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            bVar = new org.json.alipay.a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith(com.alipay.sdk.m.y.l.d)) {
                return a((Object) strTrim, type);
            }
            bVar = new org.json.alipay.b(strTrim);
        }
        return a(bVar, type);
    }
}
