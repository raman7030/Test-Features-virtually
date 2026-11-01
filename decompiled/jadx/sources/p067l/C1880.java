package p067l;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.᩷ܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C1880 {
    /* JADX INFO: renamed from: ֫ */
    public static OnBackInvokedCallback m50081(Object obj, final LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        C12826.requireNonNull(layoutInflaterFactory2C1110);
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: l.ۜܳ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                layoutInflaterFactory2C1110.m17382();
            }
        };
        C7470.m17245(obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, onBackInvokedCallback);
        return onBackInvokedCallback;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50083(Object obj, Object obj2) {
        C7470.m17245(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static OnBackInvokedDispatcher m50082(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
