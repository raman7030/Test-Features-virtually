package p067l;

import android.os.Build;
import android.webkit.WebSettings;

/* JADX INFO: renamed from: l.ᩴ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56YS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20059 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m45418(WebSettings webSettings, int i) {
        C14023 c14023 = C11188.f31064;
        if (c14023.mo11485()) {
            C15363.m35001(webSettings, i);
        } else {
            if (c14023.mo18499()) {
                m45417(webSettings).mo36006(i);
                return;
            }
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45419(WebSettings webSettings) {
        if (C11188.f31063.mo18499()) {
            m45417(webSettings).mo36007();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ */
    public static void m45420(WebSettings webSettings) {
        if (C11188.f31065.mo18499()) {
            m45417(webSettings).mo36008();
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18563 m45417(WebSettings webSettings) {
        try {
            return C4482.m9488().m46533(webSettings);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 30 && "android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                return new C15880(null);
            }
            throw e;
        }
    }
}
