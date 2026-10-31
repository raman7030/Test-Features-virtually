package l;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C20925 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m47751(Object obj, final LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        C11003.requireNonNull(layoutInflaterFactory2C5402);
        OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: l.ۜܳ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                layoutInflaterFactory2C5402.m15471();
            }
        };
        C5368.m15336(obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, onBackInvokedCallback);
        return onBackInvokedCallback;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47753(Object obj, Object obj2) {
        C5368.m15336(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m47752(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }
}
