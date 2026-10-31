package l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC5433 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8255 f16931;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f16932;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC5433(AbstractC8255 abstractC8255, AtomicBoolean atomicBoolean) {
        this.f16931 = abstractC8255;
        this.f16932 = atomicBoolean;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f16932.compareAndSet(true, false)) {
            this.f16931.m21842(EnumC1199.RETRY);
        }
    }
}
