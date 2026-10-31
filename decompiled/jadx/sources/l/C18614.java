package l;

import android.os.Build;
import android.webkit.WebSettings;

/* JADX INFO: renamed from: l.ᩴ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18614 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43153(WebSettings webSettings, int i) {
        C12263 c12263 = C9280.f28116;
        if (c12263.mo9442()) {
            C13673.m32886(webSettings, i);
        } else {
            if (c12263.mo16573()) {
                m43152(webSettings).mo33874(i);
                return;
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43154(WebSettings webSettings) {
        if (C9280.f28115.mo16573()) {
            m43152(webSettings).mo33875();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m43155(WebSettings webSettings) {
        if (C9280.f28117.mo16573()) {
            m43152(webSettings).mo33876();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17040 m43152(WebSettings webSettings) {
        try {
            return C2224.m7405().m44239(webSettings);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new C14217(null);
            }
            throw e;
        }
    }
}
