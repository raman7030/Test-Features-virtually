package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۗ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1H0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC5752 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ LayoutInflaterFactory2C15139 f14106;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7961 f14107;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC5752(LayoutInflaterFactory2C15139 layoutInflaterFactory2C15139, C7961 c7961) {
        this.f14106 = layoutInflaterFactory2C15139;
        this.f14107 = c7961;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C7961 c7961 = this.f14107;
        ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
        c7961.m18407();
        AbstractC5673.m12630((ViewGroup) componentCallbacksC11117M18414.mView.getParent(), this.f14106.f43222).m12639();
    }
}
