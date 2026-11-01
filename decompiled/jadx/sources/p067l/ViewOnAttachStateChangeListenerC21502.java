package p067l;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩶ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: OANW */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnAttachStateChangeListenerC21502 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final WeakReference f67809;

    /* JADX INFO: renamed from: ᩹ */
    public final C14795 f67810;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C13045.m29867(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        C13045.m29867(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f67809.get();
        IBinder iBinder = null;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        }
        if (activity == null || iBinder == null) {
            return;
        }
        this.f67810.m33777(iBinder, activity);
    }

    public ViewOnAttachStateChangeListenerC21502(C14795 c14795, Activity activity) {
        this.f67810 = c14795;
        this.f67809 = new WeakReference(activity);
    }
}
