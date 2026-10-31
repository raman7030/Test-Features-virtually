package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.alipay.sdk.m.c0.c;
import com.alipay.sdk.m.l.d;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.b;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.q;
import java.lang.ref.WeakReference;
import l.C17648;
import l.C21610;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class H5PayActivity extends Activity {
    public c a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public String h = null;
    public WeakReference i;

    public final void a(View view) {
        Context context = view.getContext();
        if (context != null && b.d(context)) {
            try {
                C17648.m41310(view, new H5PayActivity$$ExternalSyntheticLambda0(view));
            } catch (Throwable unused) {
                view.setPadding(0, b.b(context), 0, b.a(context));
            }
        }
    }

    public final void b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            g.a(th);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            d.a((a) q.a(this.i), i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c cVar = this.a;
        if (cVar == null) {
            finish();
            return;
        }
        if (cVar.a()) {
            cVar.b();
            return;
        }
        if (!cVar.b()) {
            super.onBackPressed();
        }
        com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        b();
        super.onCreate(bundle);
        try {
            a aVarA = a.C0028a.a(getIntent());
            if (aVarA == null) {
                finish();
                return;
            }
            this.i = new WeakReference(aVarA);
            if (com.alipay.sdk.m.o.b.i().A()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.b = string;
                if (!q.f(string)) {
                    finish();
                    return;
                }
                this.d = extras.getString("cookie", null);
                this.c = extras.getString(e.s, null);
                this.e = extras.getString("title", null);
                this.g = extras.getString("version", c.c);
                this.f = extras.getBoolean("backisexit", false);
                this.h = extras.getString("cashierBizData", "");
                try {
                    com.alipay.sdk.m.c0.d dVar = new com.alipay.sdk.m.c0.d(this, aVarA, this.g);
                    setContentView(dVar);
                    a(dVar);
                    dVar.a(this.e, this.c, this.f);
                    dVar.setCashierBizData(this.h);
                    dVar.a(this.b, this.d);
                    dVar.a(this.b);
                    this.a = dVar;
                } catch (Throwable th) {
                    com.alipay.sdk.m.m.a.a(aVarA, com.alipay.sdk.m.m.b.f77909l, "GetInstalledAppEx", th);
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c cVar = this.a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                com.alipay.sdk.m.m.a.a((a) q.a(this.i), com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.B, th);
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ C21610 a(View view, View view2, C21610 c21610) {
        view.setPadding(0, c21610.m48826(), 0, c21610.m48835());
        return c21610;
    }

    public void a() {
        Object obj = PayTask.h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
