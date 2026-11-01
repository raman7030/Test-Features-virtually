package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FieldManager {

    /* JADX INFO: renamed from: a */
    public static final String f3052a = "cfgfd";

    /* JADX INFO: renamed from: b */
    public static C0757b f3053b = C0757b.m2742b();

    /* JADX INFO: renamed from: c */
    public static boolean f3054c = false;

    /* JADX INFO: renamed from: d */
    public static Object f3055d = new Object();

    public FieldManager() {
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.config.FieldManager$a */
    public class C0755a {

        /* JADX INFO: renamed from: a */
        public static final FieldManager f3056a = new FieldManager();
    }

    /* JADX INFO: renamed from: a */
    public static FieldManager m2730a() {
        return C0755a.f3056a;
    }

    public static boolean allow(String str) {
        synchronized (f3055d) {
            if (!f3054c) {
                return false;
            }
            return C0757b.m2741a(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2731b() {
        boolean z;
        synchronized (f3055d) {
            z = f3054c;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public void m2732a(Context context) {
        String str;
        String str2 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {C0759d.a.class.getName(), C0759d.b.class.getName(), C0759d.c.class.getName(), C0759d.d.class.getName()};
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", "1001@3749699455,2130669566,262139,1983");
        synchronized (f3055d) {
            Pair pairM2729a = m2729a(strImprintProperty);
            if (((Long) pairM2729a.first).longValue() > 1000 && (str = (String) pairM2729a.second) != null && str.length() > 0) {
                str2 = str;
            }
            String[] strArrSplit = str2.split(",");
            int length = strArrSplit.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C0762g c0762g = new C0762g();
                for (int i = 0; i < length; i++) {
                    arrayList.add(c0762g);
                    ((InterfaceC0760e) arrayList.get(i)).mo2746a(strArrSplit[i], f3053b, C0759d.m2748b(strArr[i]));
                }
            }
            f3054c = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2733a(Context context, String str) {
        String str2;
        String str3 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {C0759d.a.class.getName(), C0759d.b.class.getName(), C0759d.c.class.getName(), C0759d.d.class.getName()};
        synchronized (f3055d) {
            f3053b.m2743a();
            if (str != null) {
                Pair pairM2729a = m2729a(str);
                if (((Long) pairM2729a.first).longValue() > 1000 && (str2 = (String) pairM2729a.second) != null && str2.length() > 0) {
                    str3 = str2;
                }
            }
            String[] strArrSplit = str3.split(",");
            int length = strArrSplit.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C0762g c0762g = new C0762g();
                for (int i = 0; i < length; i++) {
                    arrayList.add(c0762g);
                    ((InterfaceC0760e) arrayList.get(i)).mo2746a(strArrSplit[i], f3053b, C0759d.m2748b(strArr[i]));
                }
            }
            f3054c = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Pair m2729a(String str) {
        Pair pair = new Pair(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length >= 2) {
                try {
                    long j = Long.parseLong(strArrSplit[0]);
                    return new Pair(Long.valueOf(j), strArrSplit[1]);
                } catch (Throwable unused) {
                }
            }
        }
        return pair;
    }
}
