package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC14503 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ViewGroup f44470;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC16620 f44471;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f44470;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        C23676.f76702.remove(viewGroup);
        ArrayList arrayList = (ArrayList) C23676.m52223().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC16620) it.next()).resume(viewGroup);
            }
        }
        this.f44471.clearValues(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AbstractC16620 abstractC16620 = this.f44471;
        ViewGroup viewGroup = this.f44470;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (!C23676.f76702.remove(viewGroup)) {
            return true;
        }
        C2727 c2727M52223 = C23676.m52223();
        ArrayList arrayList = null;
        ArrayList arrayList2 = (ArrayList) c2727M52223.getOrDefault(viewGroup, null);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            c2727M52223.put(viewGroup, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
        }
        arrayList2.add(abstractC16620);
        abstractC16620.addListener(new C17326(this, c2727M52223));
        abstractC16620.captureValues(viewGroup, false);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC16620) it.next()).resume(viewGroup);
            }
        }
        abstractC16620.playTransition(viewGroup);
        return true;
    }
}
