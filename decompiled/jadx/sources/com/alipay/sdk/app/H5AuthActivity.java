package com.alipay.sdk.app;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class H5AuthActivity extends H5PayActivity {
    @Override // com.alipay.sdk.app.H5PayActivity
    /* JADX INFO: renamed from: a */
    public void mo400a() {
        Object obj = AuthTask.f225c;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }
}
