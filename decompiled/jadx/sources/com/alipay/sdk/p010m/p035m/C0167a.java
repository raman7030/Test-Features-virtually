package com.alipay.sdk.p010m.p035m;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p043q.C0190a;
import com.alipay.sdk.p010m.p051u.C0221e;
import com.alipay.sdk.p010m.p051u.C0222f;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0250m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.alipay.sdk.m.m.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0167a {

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f565a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0233a f566b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f567c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f568d;

        public a(Context context, C0233a c0233a, String str, String str2) {
            this.f565a = context;
            this.f566b = c0233a;
            this.f567c = str;
            this.f568d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.m758a(this.f565a, this.f566b.f1108n.m788d(this.f567c), this.f568d);
            } catch (Throwable th) {
                C0244g.m1199a(th);
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$b */
    /* JADX INFO: compiled from: N673 */
    public final class b {

        /* JADX INFO: renamed from: a */
        public static final String f569a = "RecordPref";

        /* JADX INFO: renamed from: b */
        public static final String f570b = "alipay_cashier_statistic_record";

        /* JADX INFO: renamed from: a */
        public static synchronized String m758a(Context context, String str, String str2) {
            C0244g.m1201b(f569a, "stat append " + str2 + " , " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                a aVarM757a = m757a(context);
                if (aVarM757a.f571a.size() > 20) {
                    aVarM757a.f571a.clear();
                }
                aVarM757a.f571a.put(str2, str);
                m759a(context, aVarM757a);
                return str2;
            }
            return null;
        }

        /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$b$a */
        /* JADX INFO: compiled from: N673 */
        public final class a {

            /* JADX INFO: renamed from: a */
            public final LinkedHashMap f571a = new LinkedHashMap();

            public a() {
            }

            /* JADX INFO: renamed from: a */
            public String m761a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : this.f571a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                    return new JSONArray().toString();
                }
            }

            public a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.f571a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static synchronized String m760b(Context context) {
            C0244g.m1201b(f569a, "stat peek");
            if (context == null) {
                return null;
            }
            a aVarM757a = m757a(context);
            if (aVarM757a.f571a.isEmpty()) {
                return null;
            }
            try {
                return (String) ((Map.Entry) aVarM757a.f571a.entrySet().iterator().next()).getValue();
            } catch (Throwable th) {
                C0244g.m1199a(th);
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static synchronized int m756a(Context context, String str) {
            C0244g.m1201b(f569a, "stat remove " + str);
            if (context != null && !TextUtils.isEmpty(str)) {
                a aVarM757a = m757a(context);
                if (aVarM757a.f571a.isEmpty()) {
                    return 0;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : aVarM757a.f571a.entrySet()) {
                        if (str.equals(entry.getValue())) {
                            arrayList.add((String) entry.getKey());
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        aVarM757a.f571a.remove((String) it.next());
                    }
                    m759a(context, aVarM757a);
                    return arrayList.size();
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                    int size = aVarM757a.f571a.size();
                    m759a(context, new a());
                    return size;
                }
            }
            return 0;
        }

        /* JADX INFO: renamed from: a */
        public static synchronized a m757a(Context context) {
            try {
                String strM1228a = C0250m.m1228a(null, context, f570b, null);
                if (TextUtils.isEmpty(strM1228a)) {
                    return new a();
                }
                return new a(strM1228a);
            } catch (Throwable th) {
                C0244g.m1199a(th);
                return new a();
            }
        }

        /* JADX INFO: renamed from: a */
        public static synchronized void m759a(Context context, a aVar) {
            if (aVar == null) {
                try {
                    aVar = new a();
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                }
            }
            C0250m.m1231b(null, context, f570b, aVar.m761a());
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$c */
    /* JADX INFO: compiled from: N673 */
    public final class c {

        /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$c$a */
        /* JADX INFO: compiled from: N673 */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f572a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Context f573b;

            public a(String str, Context context) {
                this.f572a = str;
                this.f573b = context;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(this.f572a) || c.m766b(this.f573b, this.f572a)) {
                    for (int i = 0; i < 4; i++) {
                        String strM760b = b.m760b(this.f573b);
                        if (TextUtils.isEmpty(strM760b) || !c.m766b(this.f573b, strM760b)) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static synchronized void m763a(Context context, C0168b c0168b, String str, String str2) {
            if (context == null || c0168b == null || str == null) {
                return;
            }
            m764a(context, c0168b.m788d(str), str2);
        }

        /* JADX INFO: renamed from: a */
        public static synchronized void m762a(Context context) {
            m764a(context, null, null);
        }

        /* JADX INFO: renamed from: a */
        public static synchronized void m764a(Context context, String str, String str2) {
            if (context == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                b.m758a(context, str, str2);
            }
            new Thread(new a(str, context)).start();
        }

        /* JADX INFO: renamed from: b */
        public static synchronized boolean m766b(Context context, String str) {
            C0244g.m1201b(C0170a.f659B, "stat sub " + str);
            try {
                if ((C0180b.m829i().m853g() ? new C0221e() : new C0222f()).mo1038a((C0233a) null, context, str) == null) {
                    return false;
                }
                b.m756a(context, str);
                return true;
            } catch (Throwable th) {
                C0244g.m1199a(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$d */
    /* JADX INFO: compiled from: N673 */
    public final class d {

        /* JADX INFO: renamed from: a */
        public static final String f574a = "alipay_cashier_ap_seq_v";

        /* JADX INFO: renamed from: a */
        public static synchronized long m767a(Context context) {
            return e.m768a(context, f574a);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$e */
    /* JADX INFO: compiled from: N673 */
    public final class e {
        /* JADX INFO: renamed from: a */
        public static synchronized long m768a(Context context, String str) {
            long j;
            String strM1228a;
            try {
                strM1228a = C0250m.m1228a(null, context, str, null);
            } catch (Throwable unused) {
            }
            j = (!TextUtils.isEmpty(strM1228a) ? Long.parseLong(strM1228a) : 0L) + 1;
            try {
                C0250m.m1231b(null, context, str, Long.toString(j));
            } catch (Throwable unused2) {
            }
            return j;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.m.a$f */
    /* JADX INFO: compiled from: N673 */
    public final class f {

        /* JADX INFO: renamed from: a */
        public static final String f575a = "alipay_cashier_statistic_v";

        /* JADX INFO: renamed from: a */
        public static synchronized long m769a(Context context) {
            return e.m768a(context, f575a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m748a(Context context, C0233a c0233a, String str, String str2) {
        if (context == null || c0233a == null) {
            return;
        }
        C0244g.m1201b(C0170a.f659B, "StatisticManager stash start");
        if (C0180b.m829i().m854g(null)) {
            C0190a.m920a(new a(context, c0233a, str, str2));
        } else {
            try {
                b.m758a(context, c0233a.f1108n.m788d(str), str2);
            } catch (Throwable th) {
                C0244g.m1199a(th);
            }
        }
        C0244g.m1201b(C0170a.f659B, "StatisticManager stash finish");
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m754b(Context context, C0233a c0233a, String str, String str2) {
        if (context == null || c0233a == null) {
            return;
        }
        c.m763a(context, c0233a.f1108n, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m755b(C0233a c0233a, String str, String str2, String str3) {
        if (c0233a == null) {
            return;
        }
        c0233a.f1108n.m787c(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m747a(Context context) {
        c.m762a(context);
    }

    /* JADX INFO: renamed from: a */
    public static void m753a(C0233a c0233a, String str, Throwable th) {
        if (c0233a == null || th == null) {
            return;
        }
        c0233a.f1108n.m784a(str, th.getClass().getSimpleName(), th);
    }

    /* JADX INFO: renamed from: a */
    public static void m752a(C0233a c0233a, String str, String str2, Throwable th, String str3) {
        if (c0233a == null) {
            return;
        }
        c0233a.f1108n.m785a(str, str2, th, str3);
    }

    /* JADX INFO: renamed from: a */
    public static void m751a(C0233a c0233a, String str, String str2, Throwable th) {
        if (c0233a == null) {
            return;
        }
        c0233a.f1108n.m784a(str, str2, th);
    }

    /* JADX INFO: renamed from: a */
    public static void m750a(C0233a c0233a, String str, String str2, String str3) {
        if (c0233a == null) {
            return;
        }
        c0233a.f1108n.m783a(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static void m749a(C0233a c0233a, String str, String str2) {
        if (c0233a == null) {
            return;
        }
        c0233a.f1108n.m782a(str, str2);
    }
}
