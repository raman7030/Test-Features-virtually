package p067l;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: l.᩵֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6YZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20576 {

    /* JADX INFO: renamed from: ֫ */
    public final WebkitToCompatConverterBoundaryInterface f63602;

    public C20576(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f63602 = webkitToCompatConverterBoundaryInterface;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18563 m46533(WebSettings webSettings) {
        return new C18563((WebSettingsBoundaryInterface) C17680.m40207(WebSettingsBoundaryInterface.class, this.f63602.convertSettings(webSettings)));
    }
}
