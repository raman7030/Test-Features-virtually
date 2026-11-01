package com.alipay.sdk.p010m.p023g;

import com.alipay.sdk.p010m.p025h.C0137a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.alipay.C2394a;
import org.json.alipay.C2395b;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0124f {

    /* JADX INFO: renamed from: a */
    public static List f469a;

    static {
        ArrayList arrayList = new ArrayList();
        f469a = arrayList;
        arrayList.add(new C0130l());
        f469a.add(new C0122d());
        f469a.add(new C0121c());
        f469a.add(new C0126h());
        f469a.add(new C0120b());
        f469a.add(new C0119a());
        f469a.add(new C0125g());
    }

    /* JADX INFO: renamed from: a */
    public static String m665a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objM666b = m666b(obj);
        if (C0137a.m683a((Class) objM666b.getClass())) {
            return C2395b.m55447d(objM666b.toString());
        }
        if (Collection.class.isAssignableFrom(objM666b.getClass())) {
            return new C2394a((Collection) objM666b).toString();
        }
        if (Map.class.isAssignableFrom(objM666b.getClass())) {
            return new C2395b((Map) objM666b).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objM666b.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static Object m666b(Object obj) {
        Object objMo659a;
        if (obj == null) {
            return null;
        }
        for (InterfaceC0128j interfaceC0128j : f469a) {
            if (interfaceC0128j.mo661a((Class) obj.getClass()) && (objMo659a = interfaceC0128j.mo659a(obj)) != null) {
                return objMo659a;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
