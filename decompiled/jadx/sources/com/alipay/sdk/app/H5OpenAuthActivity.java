package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* JADX INFO: renamed from: j */
    public boolean f229j = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    /* JADX INFO: renamed from: a */
    public void mo400a() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public void onDestroy() {
        if (this.f229j) {
            try {
                C0233a c0233aM1117a = C0233a.a.m1117a(getIntent());
                if (c0233aM1117a != null) {
                    C0167a.m754b(this, c0233aM1117a, "", c0233aM1117a.f1098d);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        try {
            C0233a c0233aM1117a = C0233a.a.m1117a(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th) {
                String string = (intent == null || intent.getData() == null) ? "null" : intent.getData().toString();
                if (c0233aM1117a != null) {
                    C0167a.m752a(c0233aM1117a, C0168b.f618l, C0168b.f627p0, th, string);
                }
                this.f229j = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
