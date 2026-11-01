package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: renamed from: com.umeng.analytics.pro.p */
/* JADX INFO: compiled from: Y5CH */
/* JADX INFO: loaded from: classes.dex */
public class C0720p implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public Thread.UncaughtExceptionHandler f2932a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0724t f2933b;

    public C0720p() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f2932a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* JADX INFO: renamed from: a */
    public void m2609a(InterfaceC0724t interfaceC0724t) {
        this.f2933b = interfaceC0724t;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m2608a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2932a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f2932a.uncaughtException(thread, th);
    }

    /* JADX INFO: renamed from: a */
    private void m2608a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f2933b.mo2074a(th);
        } else {
            this.f2933b.mo2074a(null);
        }
    }
}
