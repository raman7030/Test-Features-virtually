package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.R;
import com.alipay.sdk.m.l.c;
import com.alipay.sdk.m.w.b;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.k;
import com.alipay.sdk.m.y.o;
import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AuthTask {
    public static final Object c = k.class;
    public Activity a;
    public com.alipay.sdk.m.c0.a b;

    /* JADX INFO: compiled from: N673 */
    public class a implements k.f {
        public a() {
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void a() {
            AuthTask.this.a();
        }

        @Override // com.alipay.sdk.m.y.k.f
        public void b() {
        }
    }

    public AuthTask(Activity activity) {
        this.a = activity;
        b.c().a(this.a);
        this.b = new com.alipay.sdk.m.c0.a(activity, this.a.getString(R.string.alipay_standard_sdk_loading_go_auth));
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new com.alipay.sdk.m.w.a(this.a, str, com.alipay.sdk.m.m.b.n), str, z);
    }

    public synchronized Map authV2(String str, boolean z) {
        com.alipay.sdk.m.w.a aVar;
        aVar = new com.alipay.sdk.m.w.a(this.a, str, "authV2");
        return o.a(aVar, innerAuth(aVar, str, z));
    }

    public final k.f b() {
        return new a();
    }

    public final void c() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public final void a() {
        com.alipay.sdk.m.c0.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final String b(Activity activity, String str, com.alipay.sdk.m.w.a aVar) {
        c();
        c cVarA = null;
        try {
            try {
                List listA = com.alipay.sdk.m.v.b.a(new com.alipay.sdk.m.u.a().a(aVar, activity, str).c().optJSONObject(com.alipay.sdk.m.n.c.c).optJSONObject(com.alipay.sdk.m.n.c.d));
                a();
                for (int i = 0; i < listA.size(); i++) {
                    if (((com.alipay.sdk.m.v.b) listA.get(i)).a() == com.alipay.sdk.m.v.a.WapPay) {
                        String strA = a(aVar, (com.alipay.sdk.m.v.b) listA.get(i));
                        a();
                        return strA;
                    }
                }
                a();
            } catch (Throwable th) {
                a();
                throw th;
            }
        } catch (IOException e) {
            c cVarA2 = c.a(c.NETWORK_ERROR.c());
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.k, e);
            cVarA = cVarA2;
            a();
        } catch (Throwable th2) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.C, th2);
            a();
        }
        if (cVarA == null) {
            cVarA = c.a(c.FAILED.c());
        }
        return com.alipay.sdk.m.l.b.a(cVarA.c(), cVarA.b(), "");
    }

    public final String a(Activity activity, String str, com.alipay.sdk.m.w.a aVar) {
        String strA = aVar.a(str);
        List listM = com.alipay.sdk.m.o.b.i().m();
        if (!com.alipay.sdk.m.o.b.i().g || listM == null) {
            listM = com.alipay.sdk.m.l.a.d;
        }
        if (q.a(aVar, (Context) this.a, listM, true)) {
            k kVar = new k(activity, aVar, b());
            String strA2 = kVar.a(strA, false);
            kVar.a();
            if (!TextUtils.equals(strA2, k.j) && !TextUtils.equals(strA2, k.k)) {
                return TextUtils.isEmpty(strA2) ? com.alipay.sdk.m.l.b.a() : strA2;
            }
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.i0);
            return b(activity, strA, aVar);
        }
        com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.j0);
        return b(activity, strA, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00be A[Catch: all -> 0x012f, DONT_GENERATE, PHI: r11
      0x00be: PHI (r11v11 java.lang.String) = (r11v2 java.lang.String), (r11v13 java.lang.String) binds: [B:17:0x00bc, B:10:0x006d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:5:0x000a, B:6:0x000d, B:9:0x0027, B:19:0x00c7, B:18:0x00be, B:22:0x00d3, B:24:0x011b, B:25:0x0124, B:26:0x012e, B:16:0x0076, B:8:0x0021, B:15:0x0073), top: B:33:0x000a, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.app.Activity, android.content.Context] */
    public synchronized String innerAuth(com.alipay.sdk.m.w.a aVar, String str, boolean z) {
        String strA;
        StringBuilder sb;
        long jElapsedRealtime;
        String string;
        String str2;
        String str3;
        StringBuilder sb2;
        String str4;
        String strA2;
        String str5;
        String str6;
        String strA3;
        String string2;
        String str7;
        String str8;
        com.alipay.sdk.m.o.b bVarI;
        boolean zT;
        String str9 = "";
        synchronized (this) {
            if (z) {
                c();
                b.c().a(this.a);
                strA = com.alipay.sdk.m.l.b.a();
                com.alipay.sdk.m.l.a.a("");
                try {
                    strA = a(this.a, str, aVar);
                    sb = new StringBuilder("");
                } catch (Exception e) {
                    g.a(e);
                    sb = new StringBuilder("");
                } finally {
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.V, str9 + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.W, o.a(strA, o.a) + "|" + o.a(strA, o.b));
                    if (!com.alipay.sdk.m.o.b.i().t()) {
                        com.alipay.sdk.m.o.b.i().a(aVar, this.a, false, 1);
                    }
                    a();
                    com.alipay.sdk.m.m.a.b(this.a, aVar, str, aVar.d);
                }
            } else {
                b.c().a(this.a);
                strA = com.alipay.sdk.m.l.b.a();
                com.alipay.sdk.m.l.a.a("");
                strA = a(this.a, str, aVar);
                sb = new StringBuilder("");
            }
            throw th;
        }
        return strA;
    }

    public final String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.v.b bVar) {
        String[] strArrC = bVar.c();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrC[0]);
        Intent intent = new Intent(this.a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        com.alipay.sdk.m.w.a.C0028a.a(aVar, intent);
        this.a.startActivity(intent);
        Object obj = c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return com.alipay.sdk.m.l.b.a();
            }
        }
        String strD = com.alipay.sdk.m.l.b.d();
        return TextUtils.isEmpty(strD) ? com.alipay.sdk.m.l.b.a() : strD;
    }
}
