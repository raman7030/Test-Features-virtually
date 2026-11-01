package p067l;

import android.webkit.JavascriptInterface;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C20009 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f60825;

    /* JADX INFO: renamed from: ۧ */
    public final C7268 f60826;

    /* JADX INFO: renamed from: ܽ */
    public final String f60827 = UUID.randomUUID().toString();

    @JavascriptInterface
    @InterfaceC1080
    public synchronized void save(String str, String str2) {
        if (!this.f60825 && this.f60827.equals(str) && str2 != null && str2.length() <= 100000) {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) != '0' && str2.charAt(i) != '1') {
                    return;
                }
            }
            this.f60826.f18949 = str2;
        }
    }

    public C20009(C7268 c7268) {
        this.f60826 = c7268;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45380(C20009 c20009) {
        synchronized (c20009) {
            c20009.f60825 = true;
        }
    }
}
