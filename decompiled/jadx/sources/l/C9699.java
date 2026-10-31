package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9699 implements InterfaceC4054 {
    @Override // l.InterfaceC4054
    /* JADX INFO: renamed from: ֫ */
    public void mo8316(C1979 c1979, C1979 c19710, Window window, View view, boolean z, boolean z2) {
        C11233.m27805(c1979, "statusBarStyle");
        C11233.m27805(c19710, "navigationBarStyle");
        C11233.m27805(window, "window");
        C11233.m27805(view, "view");
        C4948.m14388(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
