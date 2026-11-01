package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۧۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC12804 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractActivityC5549 f36032;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC16066 f36033;

    public ViewOnAttachStateChangeListenerC12804(AbstractActivityC5549 abstractActivityC5549, InterfaceC16066 interfaceC16066) {
        this.f36032 = abstractActivityC5549;
        this.f36033 = interfaceC16066;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f36032.getLifecycle().mo21806(this.f36033);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f36032.getLifecycle().mo21807(this.f36033);
    }
}
