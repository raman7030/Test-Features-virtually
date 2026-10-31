package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC23250 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18333 f74692;

    public ViewGroupOnHierarchyChangeListenerC23250(C18333 c18333) {
        this.f74692 = c18333;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f74692.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        C18333 c18333 = this.f74692;
        c18333.onChildViewsChanged(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = c18333.mOnHierarchyChangeListener;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
