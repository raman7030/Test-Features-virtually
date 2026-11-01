package p067l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۫۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes4.dex */
public final class C14179 extends C1658 {

    /* JADX INFO: renamed from: ֫ */
    public WeakHashMap f40434 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final C12168 f40435;

    public C14179(C12168 c12168) {
        this.f40435 = c12168;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32659(View view) {
        C1658 c1658M43569 = C1717.m43569(view);
        if (c1658M43569 == null || c1658M43569 == this) {
            return;
        }
        this.f40434.put(view, c1658M43569);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1658 m32658(View view) {
        return (C1658) this.f40434.remove(view);
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C1555 c1555) {
        C12168 c12168 = this.f40435;
        if (!c12168.shouldIgnore() && c12168.mRecyclerView.getLayoutManager() != null) {
            c12168.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c1555);
            C1658 c1658 = (C1658) this.f40434.get(view);
            if (c1658 != null) {
                c1658.onInitializeAccessibilityNodeInfo(view, c1555);
                return;
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c1555);
                return;
            }
        }
        super.onInitializeAccessibilityNodeInfo(view, c1555);
    }

    @Override // p067l.C1658
    public final boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        C12168 c12168 = this.f40435;
        if (!c12168.shouldIgnore() && c12168.mRecyclerView.getLayoutManager() != null) {
            C1658 c1658 = (C1658) this.f40434.get(view);
            if (c1658 != null) {
                if (c1658.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return c12168.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    @Override // p067l.C1658
    public final void sendAccessibilityEvent(View view, int i) {
        C1658 c1658 = (C1658) this.f40434.get(view);
        if (c1658 != null) {
            c1658.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // p067l.C1658
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C1658 c1658 = (C1658) this.f40434.get(view);
        if (c1658 != null) {
            c1658.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // p067l.C1658
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C1658 c1658 = (C1658) this.f40434.get(view);
        if (c1658 != null) {
            return c1658.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p067l.C1658
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C1658 c1658 = (C1658) this.f40434.get(view);
        if (c1658 != null) {
            c1658.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C1658 c1658 = (C1658) this.f40434.get(view);
        if (c1658 != null) {
            c1658.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p067l.C1658
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1658 c1658 = (C1658) this.f40434.get(viewGroup);
        if (c1658 != null) {
            return c1658.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p067l.C1658
    public final C1870 getAccessibilityNodeProvider(View view) {
        C1658 c1658 = (C1658) this.f40434.get(view);
        if (c1658 != null) {
            return c1658.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }
}
