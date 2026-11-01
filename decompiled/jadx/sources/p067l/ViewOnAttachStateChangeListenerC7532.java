package p067l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۚܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ1 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC7532 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC10214 f19771;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AtomicBoolean f19772;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC7532(AbstractC10214 abstractC10214, AtomicBoolean atomicBoolean) {
        this.f19771 = abstractC10214;
        this.f19772 = atomicBoolean;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f19772.compareAndSet(true, false)) {
            this.f19771.m23812(EnumC3508.RETRY);
        }
    }
}
