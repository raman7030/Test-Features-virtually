package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.C0067R;
import com.alipay.sdk.p010m.p016c0.C0091a;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p033l.EnumC0163c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p051u.C0217a;
import com.alipay.sdk.p010m.p053v.C0231b;
import com.alipay.sdk.p010m.p053v.EnumC0230a;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0248k;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AuthTask {

    /* JADX INFO: renamed from: c */
    public static final Object f225c = C0248k.class;

    /* JADX INFO: renamed from: a */
    public Activity f226a;

    /* JADX INFO: renamed from: b */
    public C0091a f227b;

    /* JADX INFO: renamed from: com.alipay.sdk.app.AuthTask$a */
    /* JADX INFO: compiled from: N673 */
    public class C0071a implements C0248k.f {
        public C0071a() {
        }

        @Override // com.alipay.sdk.p010m.p058y.C0248k.f
        /* JADX INFO: renamed from: a */
        public void mo398a() {
            AuthTask.this.m394a();
        }

        @Override // com.alipay.sdk.p010m.p058y.C0248k.f
        /* JADX INFO: renamed from: b */
        public void mo399b() {
        }
    }

    public AuthTask(Activity activity) {
        this.f226a = activity;
        C0234b.m1121c().m1124a(this.f226a);
        this.f227b = new C0091a(activity, this.f226a.getString(C0067R.string.alipay_standard_sdk_loading_go_auth));
    }

    public synchronized String auth(String str, boolean z) {
        return innerAuth(new C0233a(this.f226a, str, C0168b.f622n), str, z);
    }

    public synchronized Map authV2(String str, boolean z) {
        C0233a c0233a;
        c0233a = new C0233a(this.f226a, str, "authV2");
        return C0252o.m1237a(c0233a, innerAuth(c0233a, str, z));
    }

    /* JADX INFO: renamed from: b */
    public final C0248k.f m395b() {
        return new C0071a();
    }

    /* JADX INFO: renamed from: c */
    public final void m397c() {
        C0091a c0091a = this.f227b;
        if (c0091a != null) {
            c0091a.m493d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m394a() {
        C0091a c0091a = this.f227b;
        if (c0091a != null) {
            c0091a.m488a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m396b(Activity activity, String str, C0233a c0233a) {
        m397c();
        EnumC0163c enumC0163cM736a = null;
        try {
            try {
                List listM1076a = C0231b.m1076a(new C0217a().mo1038a(c0233a, activity, str).m1022c().optJSONObject(C0172c.f707c).optJSONObject(C0172c.f708d));
                m394a();
                for (int i = 0; i < listM1076a.size(); i++) {
                    if (((C0231b) listM1076a.get(i)).m1080a() == EnumC0230a.WapPay) {
                        String strM393a = m393a(c0233a, (C0231b) listM1076a.get(i));
                        m394a();
                        return strM393a;
                    }
                }
                m394a();
            } catch (Throwable th) {
                m394a();
                throw th;
            }
        } catch (IOException e) {
            EnumC0163c enumC0163cM736a2 = EnumC0163c.m736a(EnumC0163c.NETWORK_ERROR.m741c());
            C0167a.m753a(c0233a, C0168b.f616k, e);
            enumC0163cM736a = enumC0163cM736a2;
            m394a();
        } catch (Throwable th2) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f580C, th2);
            m394a();
        }
        if (enumC0163cM736a == null) {
            enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.FAILED.m741c());
        }
        return C0162b.m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), "");
    }

    /* JADX INFO: renamed from: a */
    public final String m392a(Activity activity, String str, C0233a c0233a) {
        String strM1095a = c0233a.m1095a(str);
        List listM862m = C0180b.m829i().m862m();
        if (!C0180b.m829i().f825g || listM862m == null) {
            listM862m = C0161a.f547d;
        }
        if (C0254q.m1268a(c0233a, (Context) this.f226a, listM862m, true)) {
            C0248k c0248k = new C0248k(activity, c0233a, m395b());
            String strM1221a = c0248k.m1221a(strM1095a, false);
            c0248k.m1222a();
            if (!TextUtils.equals(strM1221a, C0248k.f1176j) && !TextUtils.equals(strM1221a, C0248k.f1177k)) {
                return TextUtils.isEmpty(strM1221a) ? C0162b.m728a() : strM1221a;
            }
            C0167a.m749a(c0233a, C0168b.f618l, C0168b.f614i0);
            return m396b(activity, strM1095a, c0233a);
        }
        C0167a.m749a(c0233a, C0168b.f618l, C0168b.f615j0);
        return m396b(activity, strM1095a, c0233a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00be A[Catch: all -> 0x012f, DONT_GENERATE, PHI: r11
      0x00be: PHI (r11v11 java.lang.String) = (r11v2 java.lang.String), (r11v13 java.lang.String) binds: [B:17:0x00bc, B:10:0x006d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {, blocks: (B:5:0x000a, B:6:0x000d, B:9:0x0027, B:19:0x00c7, B:18:0x00be, B:22:0x00d3, B:24:0x011b, B:25:0x0124, B:26:0x012e, B:16:0x0076, B:8:0x0021, B:15:0x0073), top: B:33:0x000a, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.app.Activity, android.content.Context] */
    public synchronized String innerAuth(C0233a c0233a, String str, boolean z) {
        String strM728a;
        StringBuilder sb;
        long jElapsedRealtime;
        String string;
        String str2;
        String str3;
        StringBuilder sb2;
        String str4;
        String strM1235a;
        String str5;
        String str6;
        String strM1235a2;
        String string2;
        String str7;
        String str8;
        C0180b c0180bM829i;
        boolean zM869t;
        String str9 = "";
        synchronized (this) {
            if (z) {
                m397c();
                C0234b.m1121c().m1124a(this.f226a);
                strM728a = C0162b.m728a();
                C0161a.m726a("");
                try {
                    strM728a = m392a(this.f226a, str, c0233a);
                    sb = new StringBuilder("");
                } catch (Exception e) {
                    C0244g.m1199a(e);
                    sb = new StringBuilder("");
                } finally {
                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f601V, str9 + SystemClock.elapsedRealtime());
                    C0167a.m750a(c0233a, C0168b.f618l, C0168b.f602W, C0252o.m1235a(strM728a, C0252o.f1206a) + "|" + C0252o.m1235a(strM728a, C0252o.f1207b));
                    if (!C0180b.m829i().m869t()) {
                        C0180b.m829i().m835a(c0233a, this.f226a, false, 1);
                    }
                    m394a();
                    C0167a.m754b(this.f226a, c0233a, str, c0233a.f1098d);
                }
            } else {
                C0234b.m1121c().m1124a(this.f226a);
                strM728a = C0162b.m728a();
                C0161a.m726a("");
                strM728a = m392a(this.f226a, str, c0233a);
                sb = new StringBuilder("");
            }
            throw th;
        }
        return strM728a;
    }

    /* JADX INFO: renamed from: a */
    public final String m393a(C0233a c0233a, C0231b c0231b) {
        String[] strArrM1082c = c0231b.m1082c();
        Bundle bundle = new Bundle();
        bundle.putString("url", strArrM1082c[0]);
        Intent intent = new Intent(this.f226a, (Class<?>) H5AuthActivity.class);
        intent.putExtras(bundle);
        C0233a.a.m1119a(c0233a, intent);
        this.f226a.startActivity(intent);
        Object obj = f225c;
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException unused) {
                return C0162b.m728a();
            }
        }
        String strM734d = C0162b.m734d();
        return TextUtils.isEmpty(strM734d) ? C0162b.m728a() : strM734d;
    }
}
