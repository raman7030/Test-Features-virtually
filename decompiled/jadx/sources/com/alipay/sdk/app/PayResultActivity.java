package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import p067l.C14523;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: b */
    public static final String f252b = "{\"isLogin\":\"false\"}";

    /* JADX INFO: renamed from: c */
    public static final HashMap f253c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final String f254d = "hk.alipay.wallet";

    /* JADX INFO: renamed from: e */
    public static final String f255e = "phonecashier.pay.hash";

    /* JADX INFO: renamed from: f */
    public static final String f256f = "orderSuffix";

    /* JADX INFO: renamed from: g */
    public static final String f257g = "externalPkgName";

    /* JADX INFO: renamed from: h */
    public static final String f258h = "phonecashier.pay.result";

    /* JADX INFO: renamed from: i */
    public static final String f259i = "phonecashier.pay.resultOrderHash";

    /* JADX INFO: renamed from: a */
    public C0233a f260a = null;

    /* JADX INFO: renamed from: com.alipay.sdk.app.PayResultActivity$a */
    /* JADX INFO: compiled from: N673 */
    public class RunnableC0074a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f261a;

        public RunnableC0074a(Activity activity) {
            this.f261a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f261a.finish();
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.app.PayResultActivity$b */
    /* JADX INFO: compiled from: N673 */
    public final class C0075b {

        /* JADX INFO: renamed from: a */
        public static volatile String f262a;

        /* JADX INFO: renamed from: b */
        public static volatile String f263b;
    }

    /* JADX INFO: renamed from: a */
    public static void m410a(Activity activity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + C14523.encode(str, C0233a.f1077D) + "&orderSuffix=" + C14523.encode(str2, C0233a.f1077D) + "&packageName=" + C14523.encode(str3, C0233a.f1077D) + "&externalPkgName=" + C14523.encode(str3, C0233a.f1077D)));
        } catch (UnsupportedEncodingException e) {
            C0244g.m1199a(e);
        }
        if (activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Throwable unused) {
                activity.finish();
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (!TextUtils.isEmpty(intent.getStringExtra(f256f))) {
                C0075b.f262a = intent.getStringExtra(f255e);
                String stringExtra = intent.getStringExtra(f256f);
                String stringExtra2 = intent.getStringExtra(f257g);
                C0233a c0233aM1117a = C0233a.a.m1117a(intent);
                this.f260a = c0233aM1117a;
                if (c0233aM1117a == null) {
                    finish();
                }
                m410a(this, C0075b.f262a, stringExtra, stringExtra2);
                m409a(this, 300);
                return;
            }
            if (this.f260a == null) {
                finish();
            }
            String stringExtra3 = intent.getStringExtra(f258h);
            int intExtra = intent.getIntExtra(f259i, 0);
            if (intExtra != 0 && TextUtils.equals(C0075b.f262a, String.valueOf(intExtra))) {
                if (TextUtils.isEmpty(stringExtra3)) {
                    m411a(C0075b.f262a);
                } else {
                    m412a(stringExtra3, C0075b.f262a);
                }
                C0075b.f262a = "";
                m409a(this, 300);
                return;
            }
            C0167a.m755b(this.f260a, C0168b.f618l, C0168b.f619l0, "Expected " + C0075b.f262a + ", got " + intExtra);
            m411a(C0075b.f262a);
            m409a(this, 300);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m411a(String str) {
        C0075b.f263b = C0162b.m728a();
        m413a(f253c, str);
    }

    /* JADX INFO: renamed from: a */
    public static void m412a(String str, String str2) {
        C0075b.f263b = str;
        m413a(f253c, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m409a(Activity activity, int i) {
        new Handler().postDelayed(new RunnableC0074a(activity), i);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m413a(HashMap map, String str) {
        Object obj;
        if (map == null || str == null || (obj = map.get(str)) == null) {
            return false;
        }
        synchronized (obj) {
            obj.notifyAll();
        }
        return true;
    }
}
