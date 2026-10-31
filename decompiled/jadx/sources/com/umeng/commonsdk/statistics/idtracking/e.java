package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.be;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: V4QJ */
/* JADX INFO: loaded from: classes.dex */
public class e {
    public static final long a = 86400000;
    public static e b = null;
    public static final String c = "umeng_it.cache";
    public static Object j = new Object();
    public File d;
    public long f;
    public a i;
    public com.umeng.commonsdk.statistics.proto.c e = null;
    public Set h = new HashSet();
    public long g = 86400000;

    private synchronized void h() {
        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
            if (aVar.c()) {
                if (aVar.d() != null) {
                    map.put(aVar.b(), aVar.d());
                }
                if (aVar.e() != null && !aVar.e().isEmpty()) {
                    arrayList.addAll(aVar.e());
                }
            }
        }
        cVar.a(arrayList);
        cVar.a(map);
        synchronized (this) {
            this.e = cVar;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
        return this.e;
    }

    public String d() {
        return null;
    }

    public synchronized void e() {
        if (b == null) {
            return;
        }
        boolean z = false;
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
            if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                aVar.a((List) null);
                z = true;
            }
        }
        if (z) {
            this.e.b(false);
            g();
        }
    }

    public synchronized void f() {
        com.umeng.commonsdk.statistics.proto.c cVarI = i();
        if (cVarI == null) {
            return;
        }
        a(cVarI);
        ArrayList arrayList = new ArrayList(this.h.size());
        synchronized (this) {
            this.e = cVarI;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                aVar.a(this.e);
                if (!aVar.c()) {
                    arrayList.add(aVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.h.remove((com.umeng.commonsdk.statistics.idtracking.a) it.next());
            }
            h();
        }
    }

    public synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = this.e;
        if (cVar != null) {
            b(cVar);
        }
    }

    public static synchronized void a() {
        e eVar = b;
        if (eVar != null) {
            eVar.e();
            b = null;
        }
    }

    public e(Context context) {
        this.i = null;
        this.d = new File(context.getFilesDir(), c);
        a aVar = new a(context);
        this.i = aVar;
        aVar.b();
    }

    public static synchronized e a(Context context) {
        if (b == null) {
            e eVar = new e(context);
            b = eVar;
            eVar.a(new f(context));
            b.a(new b(context));
            b.a(new j(context));
            b.a(new d(context));
            b.a(new c(context));
            b.a(new g(context));
            b.a(new i());
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                b.a(new h(context));
            }
            b.f();
        }
        return b;
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.i.a(aVar.b())) {
            return this.h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.w("invalid domain: " + aVar.b());
        return false;
    }

    public void a(long j2) {
        this.g = j2;
    }

    public synchronized void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f >= this.g) {
            boolean z = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.h) {
                if (aVar.c() && aVar.a()) {
                    if (!aVar.c()) {
                        this.i.b(aVar.b());
                    }
                    z = true;
                }
            }
            if (z) {
                h();
                this.i.a();
                g();
            }
            this.f = jCurrentTimeMillis;
        }
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
        FileInputStream fileInputStream;
        synchronized (j) {
            FileInputStream fileInputStream2 = null;
            if (!this.d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.d);
                try {
                    byte[] streamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                    com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                    new ay().a(cVar, streamToByteArray);
                    HelperUtils.safeClose(fileInputStream);
                    return cVar;
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

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        Map map;
        if (cVar == null || (map = cVar.a) == null) {
            return;
        }
        if (map.containsKey(g.a) && !FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
            cVar.a.remove(g.a);
        }
        if (cVar.a.containsKey(f.a) && !FieldManager.allow(com.umeng.commonsdk.utils.d.g)) {
            cVar.a.remove(f.a);
        }
        if (cVar.a.containsKey(b.a) && !FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
            cVar.a.remove(b.a);
        }
        if (cVar.a.containsKey(i.a) && !FieldManager.allow(com.umeng.commonsdk.utils.d.j)) {
            cVar.a.remove(i.a);
        }
        if (cVar.a.containsKey(c.a) && !FieldManager.allow(com.umeng.commonsdk.utils.d.w)) {
            cVar.a.remove(c.a);
        }
        if (!cVar.a.containsKey(h.d) || FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        cVar.a.remove(h.d);
    }

    private void b(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] bArrA;
        synchronized (j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a(cVar);
                        bArrA = new be().a(cVar);
                    }
                    if (bArrA != null) {
                        HelperUtils.writeFile(this.d, bArrA);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: V4QJ */
    public class a {
        public Context a;
        public Set b = new HashSet();

        public a(Context context) {
            this.a = context;
        }

        public synchronized boolean a(String str) {
            return !this.b.contains(str);
        }

        public synchronized void b(String str) {
            this.b.add(str);
        }

        public void c(String str) {
            this.b.remove(str);
        }

        public synchronized void a() {
            if (!this.b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        public synchronized void b() {
            String[] strArrSplit;
            String string = PreferenceWrapper.getDefault(this.a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.b.add(str);
                    }
                }
            }
        }
    }
}
