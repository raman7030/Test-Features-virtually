package p067l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ܺܽ */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C1638 implements InterfaceC1043 {
    @Override // p067l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public void mo10360(C0940 c0940, C0940 c0941, Window window, View view, boolean z, boolean z2) {
        C13045.m29867(c0940, "statusBarStyle");
        C13045.m29867(c0941, "navigationBarStyle");
        C13045.m29867(window, "window");
        C13045.m29867(view, "view");
        C1087.m16291(window, false);
        window.setStatusBarColor(c0940.m8634(z));
        window.setNavigationBarColor(c0941.m8634(z2));
        C1459 c1459 = new C1459(window, view);
        c1459.m32668(!z);
        c1459.m32665(!z2);
    }
}
