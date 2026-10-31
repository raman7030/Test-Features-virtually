package l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۤ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes3.dex */
public class C10311 extends C16445 {
    public final C12427 mItemDelegate;
    public final C13132 mRecyclerView;

    public C10311(C13132 c13132) {
        this.mRecyclerView = c13132;
        C16445 itemDelegate = getItemDelegate();
        if (itemDelegate != null && (itemDelegate instanceof C12427)) {
            this.mItemDelegate = (C12427) itemDelegate;
        } else {
            this.mItemDelegate = new C12427(this);
        }
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }

    @Override // l.C16445
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    @Override // l.C16445
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c14369);
    }

    @Override // l.C16445
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof C13132) || shouldIgnore()) {
            return;
        }
        C13132 c13132 = (C13132) view;
        if (c13132.getLayoutManager() != null) {
            c13132.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public C16445 getItemDelegate() {
        return this.mItemDelegate;
    }
}
