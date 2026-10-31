package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C8850 extends C20845 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f26946;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public WindowInsetsController f26947;

    public C8850(View view) {
        super(view);
        this.f26946 = view;
    }

    public C8850(WindowInsetsController windowInsetsController) {
        super(null);
        this.f26947 = windowInsetsController;
    }

    @Override // l.C20845
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo22868() {
        View view = this.f26946;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f26947;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        } else {
            super.mo22868();
        }
    }

    @Override // l.C20845
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22867() {
        WindowInsetsController windowInsetsController = this.f26947;
        View view = this.f26946;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: l.ۢۨ
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    atomicBoolean.set((i & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.mo22867();
    }
}
