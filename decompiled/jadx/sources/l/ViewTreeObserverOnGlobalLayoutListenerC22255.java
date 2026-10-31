package l;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.᩹ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC22255 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f72218 = new WeakHashMap();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f72218.entrySet()) {
                View view = (View) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z) {
                    C17648.m41300(z ? 16 : 32, view);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49969(View view) {
        this.f72218.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49970(View view) {
        this.f72218.remove(view);
        view.removeOnAttachStateChangeListener(this);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
