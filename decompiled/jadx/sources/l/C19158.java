package l;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.᩵֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19158 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WebkitToCompatConverterBoundaryInterface f60371;

    public C19158(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f60371 = webkitToCompatConverterBoundaryInterface;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17040 m44239(WebSettings webSettings) {
        return new C17040((WebSettingsBoundaryInterface) C16111.m38016(WebSettingsBoundaryInterface.class, this.f60371.convertSettings(webSettings)));
    }
}
