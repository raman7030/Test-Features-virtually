package p067l;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.ᩳᩴ */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1746 {
    /* JADX INFO: renamed from: ֫ */
    public static void m44726(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m44727(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static OnBackInvokedDispatcher m44725(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: ֫ */
    public static OnBackInvokedCallback m44724(final Runnable runnable) {
        C12826.requireNonNull(runnable);
        return new OnBackInvokedCallback() { // from class: l.ܽᩴ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }
}
