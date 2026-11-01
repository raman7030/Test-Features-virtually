package com.alipay.sdk.p010m.p016c0;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.alipay.sdk.m.c0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0093c extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final String f363c = "v1";

    /* JADX INFO: renamed from: d */
    public static final String f364d = "v2";

    /* JADX INFO: renamed from: a */
    public Activity f365a;

    /* JADX INFO: renamed from: b */
    public final String f366b;

    public AbstractC0093c(Activity activity, String str) {
        super(activity);
        this.f365a = activity;
        this.f366b = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo500a(String str);

    /* JADX INFO: renamed from: a */
    public void m501a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.f365a.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo503b();

    /* JADX INFO: renamed from: c */
    public abstract void mo504c();

    /* JADX INFO: renamed from: a */
    public boolean m502a() {
        return f363c.equals(this.f366b);
    }

    /* JADX INFO: renamed from: a */
    public static void m499a(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }
}
