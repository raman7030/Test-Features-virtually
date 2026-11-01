package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.umeng.analytics.pro.C0708d;
import java.util.Iterator;
import org.json.JSONObject;
import p067l.ConcurrentMapC12768;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AlipayResultActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMapC12768 f224a = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: com.alipay.sdk.app.AlipayResultActivity$a */
    /* JADX INFO: compiled from: N673 */
    public interface InterfaceC0070a {
        /* JADX INFO: renamed from: a */
        void m390a(int i, String str, String str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m389a(String str, Bundle bundle) {
        InterfaceC0070a interfaceC0070a = (InterfaceC0070a) f224a.remove(str);
        if (interfaceC0070a == null) {
            finish();
            return;
        }
        try {
            interfaceC0070a.m390a(bundle.getInt("endCode"), bundle.getString(C0252o.f1207b), bundle.getString(C0252o.f1208c));
        } finally {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Throwable th;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                String stringExtra = intent.getStringExtra(C0708d.f2642aw);
                Bundle bundleExtra = intent.getBundleExtra(C0252o.f1208c);
                String stringExtra2 = intent.getStringExtra("scene");
                C0233a c0233aM1118a = C0233a.a.m1118a(stringExtra);
                if (c0233aM1118a == null) {
                    finish();
                    return;
                }
                C0167a.m750a(c0233aM1118a, C0168b.f618l, "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    m389a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), C0233a.f1077D));
                        JSONObject jSONObject2 = jSONObject.getJSONObject(C0252o.f1208c);
                        stringExtra = jSONObject.getString(C0708d.f2642aw);
                        C0167a.m750a(c0233aM1118a, C0168b.f618l, "BSPUriSession", stringExtra);
                        Bundle bundle2 = new Bundle();
                        try {
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle2.putString(next, jSONObject2.getString(next));
                            }
                            bundleExtra = bundle2;
                        } catch (Throwable th2) {
                            th = th2;
                            bundleExtra = bundle2;
                            C0167a.m751a(c0233aM1118a, C0168b.f618l, "BSPResEx", th);
                            C0167a.m751a(c0233aM1118a, C0168b.f618l, C0168b.f633s0, th);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    C0167a.m754b(this, c0233aM1118a, "", c0233aM1118a.f1098d);
                    finish();
                    return;
                }
                try {
                    C0167a.m750a(c0233aM1118a, C0168b.f618l, C0168b.f601V, "" + SystemClock.elapsedRealtime());
                    C0167a.m750a(c0233aM1118a, C0168b.f618l, C0168b.f602W, bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString(C0252o.f1207b, "-"));
                    OpenAuthTask.m405a(stringExtra, OpenAuthTask.f239OK, "OK", bundleExtra);
                } finally {
                    C0167a.m754b(this, c0233aM1118a, "", c0233aM1118a.f1098d);
                    finish();
                }
            } catch (Throwable th4) {
                C0167a.m751a((C0233a) null, C0168b.f618l, "BSPSerError", th4);
                C0167a.m751a((C0233a) null, C0168b.f618l, C0168b.f631r0, th4);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
