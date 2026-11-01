package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC16152 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public ViewGroup f47571;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC18164 f47572;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f47571;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        C24870.f79452.remove(viewGroup);
        ArrayList arrayList = (ArrayList) C24870.m54626().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC18164) it.next()).resume(viewGroup);
            }
        }
        this.f47572.clearValues(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AbstractC18164 abstractC18164 = this.f47572;
        ViewGroup viewGroup = this.f47571;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (!C24870.f79452.remove(viewGroup)) {
            return true;
        }
        C0977 c0977M54626 = C24870.m54626();
        ArrayList arrayList = null;
        ArrayList arrayList2 = (ArrayList) c0977M54626.getOrDefault(viewGroup, null);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c0977M54626.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
        }
        arrayList2.add(abstractC18164);
        abstractC18164.addListener(new C18835(this, c0977M54626));
        abstractC18164.captureValues(viewGroup, false);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC18164) it.next()).resume(viewGroup);
            }
        }
        abstractC18164.playTransition(viewGroup);
        return true;
    }
}
