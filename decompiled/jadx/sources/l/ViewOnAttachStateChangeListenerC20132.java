package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩶ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC20132 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f65170;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13075 f65171;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C11233.m27805(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        C11233.m27805(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f65170.get();
        IBinder iBinder = null;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        }
        if (activity == null || iBinder == null) {
            return;
        }
        this.f65171.m31689(iBinder, activity);
    }

    public ViewOnAttachStateChangeListenerC20132(C13075 c13075, Activity activity) {
        this.f65171 = c13075;
        this.f65170 = new WeakReference(activity);
    }
}
