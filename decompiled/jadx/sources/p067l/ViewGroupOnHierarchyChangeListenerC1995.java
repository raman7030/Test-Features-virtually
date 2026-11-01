package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺᩸ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC1995 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1751 f77435;

    public ViewGroupOnHierarchyChangeListenerC1995(C1751 c1751) {
        this.f77435 = c1751;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f77435.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        C1751 c1751 = this.f77435;
        c1751.onChildViewsChanged(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = c1751.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
