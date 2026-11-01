package p067l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۡۨ */
/* JADX INFO: compiled from: A9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C1281 extends C1876 {

    /* JADX INFO: renamed from: ۧ */
    public View f29869;

    /* JADX INFO: renamed from: ܽ */
    public WindowInsetsController f29870;

    public C1281(View view) {
        super(view);
        this.f29869 = view;
    }

    public C1281(WindowInsetsController windowInsetsController) {
        super(null);
        this.f29870 = windowInsetsController;
    }

    @Override // p067l.C1876
    /* JADX INFO: renamed from: ۧ */
    public final void mo24839() {
        View view = this.f29869;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f29870;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        } else {
            super.mo24839();
        }
    }

    @Override // p067l.C1876
    /* JADX INFO: renamed from: ֫ */
    public final void mo24838() {
        WindowInsetsController windowInsetsController = this.f29870;
        View view = this.f29869;
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
        super.mo24838();
    }
}
