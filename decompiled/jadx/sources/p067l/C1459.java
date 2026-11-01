package p067l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.۫ܰ */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1459 {

    /* JADX INFO: renamed from: ֫ */
    public final C1494 f40448;

    @Deprecated
    public C1459(WindowInsetsController windowInsetsController) {
        this.f40448 = new C1004(windowInsetsController, new C0966(windowInsetsController));
    }

    public C1459(Window window, View view) {
        C0966 c0966 = new C0966(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f40448 = new C1004(window, c0966);
            return;
        }
        if (i >= 26) {
            this.f40448 = new C1074(window, c0966);
        } else if (i >= 23) {
            this.f40448 = new C1844(window, c0966);
        } else {
            this.f40448 = new C1949(window, c0966);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static C1459 m32663(WindowInsetsController windowInsetsController) {
        return new C1459(windowInsetsController);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32669(int i) {
        this.f40448.mo12046(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32664(int i) {
        this.f40448.mo12041(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32666() {
        return this.f40448.mo12043();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32668(boolean z) {
        this.f40448.mo12045(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32665(boolean z) {
        this.f40448.mo12042(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32667(int i) {
        this.f40448.mo12044(i);
    }
}
