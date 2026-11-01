package p067l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۤ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes3.dex */
public class C12168 extends C1658 {
    public final C14179 mItemDelegate;
    public final C14849 mRecyclerView;

    public C12168(C14849 c14849) {
        this.mRecyclerView = c14849;
        C1658 itemDelegate = getItemDelegate();
        if (itemDelegate != null && (itemDelegate instanceof C14179)) {
            this.mItemDelegate = (C14179) itemDelegate;
        } else {
            this.mItemDelegate = new C14179(this);
        }
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    @Override // p067l.C1658
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    @Override // p067l.C1658
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C1555 c1555) {
        super.onInitializeAccessibilityNodeInfo(view, c1555);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c1555);
    }

    @Override // p067l.C1658
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof C14849) || shouldIgnore()) {
            return;
        }
        C14849 c14849 = (C14849) view;
        if (c14849.getLayoutManager() != null) {
            c14849.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public C1658 getItemDelegate() {
        return this.mItemDelegate;
    }
}
