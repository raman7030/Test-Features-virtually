package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC10980 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f33039;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14413 f33040;

    public ViewOnAttachStateChangeListenerC10980(AbstractActivityC3346 abstractActivityC3346, InterfaceC14413 interfaceC14413) {
        this.f33039 = abstractActivityC3346;
        this.f33040 = interfaceC14413;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f33039.getLifecycle().mo19833(this.f33040);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f33039.getLifecycle().mo19834(this.f33040);
    }
}
