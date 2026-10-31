package l;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.۫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12437 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13142 f37431;

    @Deprecated
    public C12437(WindowInsetsController windowInsetsController) {
        this.f37431 = new C3265(windowInsetsController, new C2500(windowInsetsController));
    }

    public C12437(Window window, View view) {
        C2500 c2500 = new C2500(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f37431 = new C3265(window, c2500);
            return;
        }
        if (i >= 26) {
            this.f37431 = new C4676(window, c2500);
        } else if (i >= 23) {
            this.f37431 = new C20199(window, c2500);
        } else {
            this.f37431 = new C22315(window, c2500);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12437 m30598(WindowInsetsController windowInsetsController) {
        return new C12437(windowInsetsController);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30604(int i) {
        this.f37431.mo10013(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30599(int i) {
        this.f37431.mo10008(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30601() {
        return this.f37431.mo10010();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30603(boolean z) {
        this.f37431.mo10012(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30600(boolean z) {
        this.f37431.mo10009(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30602(int i) {
        this.f37431.mo10011(i);
    }
}
