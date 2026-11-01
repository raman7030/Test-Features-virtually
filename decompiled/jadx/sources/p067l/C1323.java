package p067l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.ۢܽ */
/* JADX INFO: compiled from: 38CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1323 implements InterfaceC1043 {
    @Override // p067l.InterfaceC1043
    /* JADX INFO: renamed from: ֫ */
    public void mo10360(C0940 c0940, C0940 c0941, Window window, View view, boolean z, boolean z2) {
        C13045.m29867(c0940, "statusBarStyle");
        C13045.m29867(c0941, "navigationBarStyle");
        C13045.m29867(window, "window");
        C13045.m29867(view, "view");
        C1087.m16291(window, false);
        window.addFlags(67108864);
        window.addFlags(134217728);
    }
}
