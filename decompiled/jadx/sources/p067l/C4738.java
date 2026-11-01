package p067l;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: renamed from: l.ۖۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes3.dex */
public final class C4738 extends AbstractC18408 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C4738 f10732 = new C4738(0);

    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo6293() {
        return m10037();
    }

    /* JADX INFO: renamed from: ֫ */
    public static WindowLayoutComponent m10037() {
        ClassLoader classLoader = C6079.class.getClassLoader();
        if (classLoader != null && C6079.m13840(C6079.f15287, classLoader)) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
        return null;
    }
}
