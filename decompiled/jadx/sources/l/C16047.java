package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16047 implements InterfaceC4054 {
    @Override // l.InterfaceC4054
    /* JADX INFO: renamed from: ֫ */
    public void mo8316(C1979 c1979, C1979 c19710, Window window, View view, boolean z, boolean z2) {
        C11233.m27805(c1979, "statusBarStyle");
        C11233.m27805(c19710, "navigationBarStyle");
        C11233.m27805(window, "window");
        C11233.m27805(view, "view");
        C4948.m14388(window, false);
        window.setStatusBarColor(c1979.m6492(z));
        window.setNavigationBarColor(c19710.m6492(z2));
        C12437 c12437 = new C12437(window, view);
        c12437.m30603(!z);
        c12437.m30600(!z2);
    }
}
