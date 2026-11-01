package p067l;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: l.ۗܰ */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1004 extends C1494 {

    /* JADX INFO: renamed from: ֫ */
    public final WindowInsetsController f13053;

    /* JADX INFO: renamed from: ۧ */
    public final C0966 f13054;

    /* JADX INFO: renamed from: ܽ */
    public Window f13055;

    public C1004(WindowInsetsController windowInsetsController, C0966 c0966) {
        new C1012();
        this.f13053 = windowInsetsController;
        this.f13054 = c0966;
    }

    public C1004(Window window, C0966 c0966) {
        this(window.getInsetsController(), c0966);
        this.f13055 = window;
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ܽ */
    public final void mo12046(int i) {
        if ((i & 8) != 0) {
            this.f13054.m10046();
        }
        this.f13053.show(i & (-9));
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ֫ */
    public final void mo12041(int i) {
        if ((i & 8) != 0) {
            this.f13054.m10045();
        }
        this.f13053.hide(i & (-9));
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12043() {
        this.f13053.setSystemBarsAppearance(0, 0);
        return (this.f13053.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ۧ */
    public final void mo12045(boolean z) {
        Window window = this.f13055;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f13053.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f13053.setSystemBarsAppearance(0, 8);
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ֫ */
    public final void mo12042(boolean z) {
        Window window = this.f13055;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f13053.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f13053.setSystemBarsAppearance(0, 16);
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ۧ */
    public final void mo12044(int i) {
        this.f13053.setSystemBarsBehavior(i);
    }
}
