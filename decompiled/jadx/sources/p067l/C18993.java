package p067l;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: l.ܿܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18993 {

    /* JADX INFO: renamed from: ֫ */
    public final C25028 f56629;

    /* JADX INFO: renamed from: ۧ */
    public String f56630;

    @JavascriptInterface
    @InterfaceC1080
    public synchronized boolean update(String str, String str2) {
        String str3;
        str3 = this.f56630;
        return str3 != null && str3.equals(str) && this.f56629.m54963(str2);
    }

    public C18993(C25028 c25028) {
        this.f56629 = c25028;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43136(C18993 c18993, String str) {
        synchronized (c18993) {
            c18993.f56630 = str;
        }
    }
}
