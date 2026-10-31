package l;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: renamed from: l.ۖۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes3.dex */
public final class C2493 extends AbstractC16876 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C2493 f7944 = new C2493(0);

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4049() {
        return m7989();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static WindowLayoutComponent m7989() {
        ClassLoader classLoader = C3904.class.getClassLoader();
        if (classLoader != null && C3904.m11904(C3904.f12479, classLoader)) {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
        return null;
    }
}
