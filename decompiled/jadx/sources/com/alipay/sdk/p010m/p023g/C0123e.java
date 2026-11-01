package com.alipay.sdk.p010m.p023g;

import com.alipay.sdk.p010m.p025h.C0137a;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.C2394a;
import org.json.alipay.C2395b;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0123e {

    /* JADX INFO: renamed from: a */
    public static List f468a;

    static {
        ArrayList arrayList = new ArrayList();
        f468a = arrayList;
        arrayList.add(new C0130l());
        f468a.add(new C0122d());
        f468a.add(new C0121c());
        f468a.add(new C0126h());
        f468a.add(new C0129k());
        f468a.add(new C0120b());
        f468a.add(new C0119a());
        f468a.add(new C0125g());
    }

    /* JADX INFO: renamed from: a */
    public static final Object m663a(Object obj, Type type) {
        Object objMo660a;
        for (InterfaceC0127i interfaceC0127i : f468a) {
            if (interfaceC0127i.mo661a(C0137a.m682a(type)) && (objMo660a = interfaceC0127i.mo660a(obj, type)) != null) {
                return objMo660a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m664a(String str, Type type) {
        Object c2395b;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            c2395b = new C2394a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith(C0249l.f1198d)) {
                return m663a((Object) strTrim, type);
            }
            c2395b = new C2395b(strTrim);
        }
        return m663a(c2395b, type);
    }
}
