package com.alipay.sdk.p010m.p040o0;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.alipay.sdk.m.o0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0183b {

    /* JADX INFO: renamed from: a */
    public static final String f866a = "IdentifierManager";

    /* JADX INFO: renamed from: b */
    public static Object f867b;

    /* JADX INFO: renamed from: c */
    public static Class f868c;

    /* JADX INFO: renamed from: d */
    public static Method f869d;

    /* JADX INFO: renamed from: e */
    public static Method f870e;

    /* JADX INFO: renamed from: f */
    public static Method f871f;

    /* JADX INFO: renamed from: g */
    public static Method f872g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f868c = cls;
            f867b = cls.newInstance();
            f869d = f868c.getMethod("getUDID", Context.class);
            f870e = f868c.getMethod("getOAID", Context.class);
            f871f = f868c.getMethod("getVAID", Context.class);
            f872g = f868c.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m895a() {
        return (f868c == null || f867b == null) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static String m896b(Context context) {
        return m894a(context, f870e);
    }

    /* JADX INFO: renamed from: c */
    public static String m897c(Context context) {
        return m894a(context, f869d);
    }

    /* JADX INFO: renamed from: d */
    public static String m898d(Context context) {
        return m894a(context, f871f);
    }

    /* JADX INFO: renamed from: a */
    public static String m893a(Context context) {
        return m894a(context, f872g);
    }

    /* JADX INFO: renamed from: a */
    public static String m894a(Context context, Method method) {
        Object obj = f867b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
