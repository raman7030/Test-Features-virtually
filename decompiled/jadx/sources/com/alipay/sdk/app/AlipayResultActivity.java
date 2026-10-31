package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import l.ConcurrentMapC10942;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class AlipayResultActivity extends Activity {
    public static final ConcurrentMapC10942 a = new ConcurrentMapC10942();

    /* JADX INFO: compiled from: N673 */
    public interface a {
        void a(int i, String str, String str2);
    }

    public final void a(String str, Bundle bundle) {
        a aVar = (a) a.remove(str);
        if (aVar == null) {
            finish();
            return;
        }
        try {
            aVar.a(bundle.getInt("endCode"), bundle.getString(o.b), bundle.getString(o.c));
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
                String stringExtra = intent.getStringExtra(d.aw);
                Bundle bundleExtra = intent.getBundleExtra(o.c);
                String stringExtra2 = intent.getStringExtra("scene");
                com.alipay.sdk.m.w.a aVarA = com.alipay.sdk.m.w.a.C0028a.a(stringExtra);
                if (aVarA == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
                if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
                    a(stringExtra, bundleExtra);
                    return;
                }
                if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), com.alipay.sdk.m.w.a.D));
                        JSONObject jSONObject2 = jSONObject.getJSONObject(o.c);
                        stringExtra = jSONObject.getString(d.aw);
                        com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, "BSPUriSession", stringExtra);
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
                            com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, "BSPResEx", th);
                            com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, b.s0, th);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
                    com.alipay.sdk.m.m.a.b(this, aVarA, "", aVarA.d);
                    finish();
                    return;
                }
                try {
                    com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, b.V, "" + SystemClock.elapsedRealtime());
                    com.alipay.sdk.m.m.a.a(aVarA, b.f77909l, b.W, bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString(o.b, "-"));
                    OpenAuthTask.a(stringExtra, OpenAuthTask.OK, "OK", bundleExtra);
                } finally {
                    com.alipay.sdk.m.m.a.b(this, aVarA, "", aVarA.d);
                    finish();
                }
            } catch (Throwable th4) {
                com.alipay.sdk.m.m.a.a((com.alipay.sdk.m.w.a) null, b.f77909l, "BSPSerError", th4);
                com.alipay.sdk.m.m.a.a((com.alipay.sdk.m.w.a) null, b.f77909l, b.r0, th4);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
