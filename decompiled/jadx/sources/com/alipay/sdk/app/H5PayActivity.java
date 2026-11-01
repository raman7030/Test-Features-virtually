package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.alipay.sdk.p010m.p016c0.AbstractC0093c;
import com.alipay.sdk.p010m.p016c0.C0094d;
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p033l.C0164d;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0239b;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.lang.ref.WeakReference;
import p067l.C1717;
import p067l.C1914;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: a */
    public AbstractC0093c f230a;

    /* JADX INFO: renamed from: b */
    public String f231b;

    /* JADX INFO: renamed from: c */
    public String f232c;

    /* JADX INFO: renamed from: d */
    public String f233d;

    /* JADX INFO: renamed from: e */
    public String f234e;

    /* JADX INFO: renamed from: f */
    public boolean f235f;

    /* JADX INFO: renamed from: g */
    public String f236g;

    /* JADX INFO: renamed from: h */
    public String f237h = null;

    /* JADX INFO: renamed from: i */
    public WeakReference f238i;

    /* JADX INFO: renamed from: a */
    public final void m402a(View view) {
        Context context = view.getContext();
        if (context != null && C0239b.m1177d(context)) {
            try {
                C1717.m43556(view, new H5PayActivity$$ExternalSyntheticLambda0(view));
            } catch (Throwable unused) {
                view.setPadding(0, C0239b.m1175b(context), 0, C0239b.m1174a(context));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m403b() {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        mo400a();
        super.finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            C0164d.m742a((C0233a) C0254q.m1252a(this.f238i), i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0093c abstractC0093c = this.f230a;
        if (abstractC0093c == null) {
            finish();
            return;
        }
        if (abstractC0093c.m502a()) {
            abstractC0093c.mo503b();
            return;
        }
        if (!abstractC0093c.mo503b()) {
            super.onBackPressed();
        }
        C0162b.m730a(C0162b.m728a());
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        m403b();
        super.onCreate(bundle);
        try {
            C0233a c0233aM1117a = C0233a.a.m1117a(getIntent());
            if (c0233aM1117a == null) {
                finish();
                return;
            }
            this.f238i = new WeakReference(c0233aM1117a);
            if (C0180b.m829i().m830A()) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f231b = string;
                if (!C0254q.m1295f(string)) {
                    finish();
                    return;
                }
                this.f233d = extras.getString("cookie", null);
                this.f232c = extras.getString(AbstractC0213e.f995s, null);
                this.f234e = extras.getString("title", null);
                this.f236g = extras.getString("version", AbstractC0093c.f363c);
                this.f235f = extras.getBoolean("backisexit", false);
                this.f237h = extras.getString("cashierBizData", "");
                try {
                    C0094d c0094d = new C0094d(this, c0233aM1117a, this.f236g);
                    setContentView(c0094d);
                    m402a(c0094d);
                    c0094d.m512a(this.f234e, this.f232c, this.f235f);
                    c0094d.setCashierBizData(this.f237h);
                    c0094d.m501a(this.f231b, this.f233d);
                    c0094d.mo500a(this.f231b);
                    this.f230a = c0094d;
                } catch (Throwable th) {
                    C0167a.m751a(c0233aM1117a, C0168b.f618l, "GetInstalledAppEx", th);
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
        AbstractC0093c abstractC0093c = this.f230a;
        if (abstractC0093c != null) {
            abstractC0093c.mo504c();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                C0167a.m751a((C0233a) C0254q.m1252a(this.f238i), C0168b.f618l, C0168b.f578B, th);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1914 m401a(View view, View view2, C1914 c1914) {
        view.setPadding(0, c1914.m51174(), 0, c1914.m51183());
        return c1914;
    }

    /* JADX INFO: renamed from: a */
    public void mo400a() {
        Object obj = PayTask.f264h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
