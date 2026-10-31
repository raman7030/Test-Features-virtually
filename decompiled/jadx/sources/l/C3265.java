package l;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.ۗܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3265 extends C13142 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WindowInsetsController f10245;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2500 f10246;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Window f10247;

    public C3265(WindowInsetsController windowInsetsController, C2500 c2500) {
        new C3432();
        this.f10245 = windowInsetsController;
        this.f10246 = c2500;
    }

    public C3265(Window window, C2500 c2500) {
        this(window.getInsetsController(), c2500);
        this.f10247 = window;
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo10013(int i) {
        if ((i & 8) != 0) {
            this.f10246.m7998();
        }
        this.f10245.show(i & (-9));
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10008(int i) {
        if ((i & 8) != 0) {
            this.f10246.m7997();
        }
        this.f10245.hide(i & (-9));
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10010() {
        this.f10245.setSystemBarsAppearance(0, 0);
        return (this.f10245.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo10012(boolean z) {
        Window window = this.f10247;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f10245.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f10245.setSystemBarsAppearance(0, 8);
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10009(boolean z) {
        Window window = this.f10247;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f10245.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f10245.setSystemBarsAppearance(0, 16);
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo10011(int i) {
        this.f10245.setSystemBarsBehavior(i);
    }
}
