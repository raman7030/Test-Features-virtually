package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0667ay;
import com.umeng.analytics.pro.C0674be;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.proto.C0826c;
import com.umeng.commonsdk.utils.C0832d;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.e */
/* JADX INFO: compiled from: V4QJ */
/* JADX INFO: loaded from: classes.dex */
public class C0806e {

    /* JADX INFO: renamed from: a */
    public static final long f3418a = 86400000;

    /* JADX INFO: renamed from: b */
    public static C0806e f3419b = null;

    /* JADX INFO: renamed from: c */
    public static final String f3420c = "umeng_it.cache";

    /* JADX INFO: renamed from: j */
    public static Object f3421j = new Object();

    /* JADX INFO: renamed from: d */
    public File f3422d;

    /* JADX INFO: renamed from: f */
    public long f3424f;

    /* JADX INFO: renamed from: i */
    public a f3427i;

    /* JADX INFO: renamed from: e */
    public C0826c f3423e = null;

    /* JADX INFO: renamed from: h */
    public Set f3426h = new HashSet();

    /* JADX INFO: renamed from: g */
    public long f3425g = 86400000;

    /* JADX INFO: renamed from: h */
    private synchronized void m3072h() {
        C0826c c0826c = new C0826c();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC0802a abstractC0802a : this.f3426h) {
            if (abstractC0802a.m3063c()) {
                if (abstractC0802a.m3064d() != null) {
                    map.put(abstractC0802a.m3062b(), abstractC0802a.m3064d());
                }
                if (abstractC0802a.m3065e() != null && !abstractC0802a.m3065e().isEmpty()) {
                    arrayList.addAll(abstractC0802a.m3065e());
                }
            }
        }
        c0826c.m3197a(arrayList);
        c0826c.m3198a(map);
        synchronized (this) {
            this.f3423e = c0826c;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized C0826c m3076c() {
        return this.f3423e;
    }

    /* JADX INFO: renamed from: d */
    public String m3077d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m3078e() {
        if (f3419b == null) {
            return;
        }
        boolean z = false;
        for (AbstractC0802a abstractC0802a : this.f3426h) {
            if (abstractC0802a.m3063c() && abstractC0802a.m3065e() != null && !abstractC0802a.m3065e().isEmpty()) {
                abstractC0802a.m3060a((List) null);
                z = true;
            }
        }
        if (z) {
            this.f3423e.m3203b(false);
            m3080g();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m3079f() {
        C0826c c0826cM3073i = m3073i();
        if (c0826cM3073i == null) {
            return;
        }
        m3069a(c0826cM3073i);
        ArrayList arrayList = new ArrayList(this.f3426h.size());
        synchronized (this) {
            this.f3423e = c0826cM3073i;
            for (AbstractC0802a abstractC0802a : this.f3426h) {
                abstractC0802a.m3059a(this.f3423e);
                if (!abstractC0802a.m3063c()) {
                    arrayList.add(abstractC0802a);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f3426h.remove((AbstractC0802a) it.next());
            }
            m3072h();
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m3080g() {
        C0826c c0826c = this.f3423e;
        if (c0826c != null) {
            m3071b(c0826c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m3068a() {
        C0806e c0806e = f3419b;
        if (c0806e != null) {
            c0806e.m3078e();
            f3419b = null;
        }
    }

    public C0806e(Context context) {
        this.f3427i = null;
        this.f3422d = new File(context.getFilesDir(), f3420c);
        a aVar = new a(context);
        this.f3427i = aVar;
        aVar.m3083b();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0806e m3067a(Context context) {
        if (f3419b == null) {
            C0806e c0806e = new C0806e(context);
            f3419b = c0806e;
            c0806e.m3070a(new C0807f(context));
            f3419b.m3070a(new C0803b(context));
            f3419b.m3070a(new C0811j(context));
            f3419b.m3070a(new C0805d(context));
            f3419b.m3070a(new C0804c(context));
            f3419b.m3070a(new C0808g(context));
            f3419b.m3070a(new C0810i());
            if (FieldManager.allow(C0832d.f3593G)) {
                f3419b.m3070a(new C0809h(context));
            }
            f3419b.m3079f();
        }
        return f3419b;
    }

    /* JADX INFO: renamed from: a */
    private boolean m3070a(AbstractC0802a abstractC0802a) {
        if (this.f3427i.m3082a(abstractC0802a.m3062b())) {
            return this.f3426h.add(abstractC0802a);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.m2965w("invalid domain: " + abstractC0802a.m3062b());
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m3074a(long j) {
        this.f3425g = j;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3075b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f3424f >= this.f3425g) {
            boolean z = false;
            for (AbstractC0802a abstractC0802a : this.f3426h) {
                if (abstractC0802a.m3063c() && abstractC0802a.m3061a()) {
                    if (!abstractC0802a.m3063c()) {
                        this.f3427i.m3084b(abstractC0802a.m3062b());
                    }
                    z = true;
                }
            }
            if (z) {
                m3072h();
                this.f3427i.m3081a();
                m3080g();
            }
            this.f3424f = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: i */
    private C0826c m3073i() {
        FileInputStream fileInputStream;
        synchronized (f3421j) {
            FileInputStream fileInputStream2 = null;
            if (!this.f3422d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f3422d);
                try {
                    byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                    C0826c c0826c = new C0826c();
                    new C0667ay().m2304a(c0826c, streamToByteArray);
                    HelperUtils.safeClose(fileInputStream);
                    return c0826c;
                } catch (Exception unused) {
                    HelperUtils.safeClose(fileInputStream);
                    return null;
                } catch (Throwable th) {
                    fileInputStream2 = fileInputStream;
                    th = th;
                    HelperUtils.safeClose(fileInputStream2);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3069a(C0826c c0826c) {
        Map map;
        if (c0826c == null || (map = c0826c.f3514a) == null) {
            return;
        }
        if (map.containsKey(C0808g.f3432a) && !FieldManager.allow(C0832d.f3637h)) {
            c0826c.f3514a.remove(C0808g.f3432a);
        }
        if (c0826c.f3514a.containsKey(C0807f.f3430a) && !FieldManager.allow(C0832d.f3636g)) {
            c0826c.f3514a.remove(C0807f.f3430a);
        }
        if (c0826c.f3514a.containsKey(C0803b.f3412a) && !FieldManager.allow(C0832d.f3638i)) {
            c0826c.f3514a.remove(C0803b.f3412a);
        }
        if (c0826c.f3514a.containsKey(C0810i.f3439a) && !FieldManager.allow(C0832d.f3639j)) {
            c0826c.f3514a.remove(C0810i.f3439a);
        }
        if (c0826c.f3514a.containsKey(C0804c.f3414a) && !FieldManager.allow(C0832d.f3652w)) {
            c0826c.f3514a.remove(C0804c.f3414a);
        }
        if (!c0826c.f3514a.containsKey(C0809h.f3437d) || FieldManager.allow(C0832d.f3593G)) {
            return;
        }
        c0826c.f3514a.remove(C0809h.f3437d);
    }

    /* JADX INFO: renamed from: b */
    private void m3071b(C0826c c0826c) {
        byte[] bArrM2321a;
        synchronized (f3421j) {
            if (c0826c != null) {
                try {
                    synchronized (this) {
                        m3069a(c0826c);
                        bArrM2321a = new C0674be().m2321a(c0826c);
                    }
                    if (bArrM2321a != null) {
                        HelperUtils.writeFile(this.f3422d, bArrM2321a);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.e$a */
    /* JADX INFO: compiled from: V4QJ */
    public class a {

        /* JADX INFO: renamed from: a */
        public Context f3428a;

        /* JADX INFO: renamed from: b */
        public Set f3429b = new HashSet();

        public a(Context context) {
            this.f3428a = context;
        }

        /* JADX INFO: renamed from: a */
        public synchronized boolean m3082a(String str) {
            return !this.f3429b.contains(str);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m3084b(String str) {
            this.f3429b.add(str);
        }

        /* JADX INFO: renamed from: c */
        public void m3085c(String str) {
            this.f3429b.remove(str);
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m3081a() {
            if (!this.f3429b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = this.f3429b.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f3428a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m3083b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.f3428a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f3429b.add(str);
                    }
                }
            }
        }
    }
}
