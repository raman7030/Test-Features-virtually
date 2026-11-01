package p067l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.ۖۨ */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0966 {

    /* JADX INFO: renamed from: ֫ */
    public final C1876 f10750;

    public C0966(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10750 = new C1281(view);
        } else {
            this.f10750 = new C1876(view);
        }
    }

    @Deprecated
    public C0966(WindowInsetsController windowInsetsController) {
        this.f10750 = new C1281(windowInsetsController);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10046() {
        this.f10750.mo24839();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10045() {
        this.f10750.mo24838();
    }
}
