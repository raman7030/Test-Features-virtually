package l;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۫۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N69K */
/* JADX INFO: loaded from: classes4.dex */
public final class C12427 extends C16445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakHashMap f37417 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10311 f37418;

    public C12427(C10311 c10311) {
        this.f37418 = c10311;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30594(View view) {
        C16445 c16445M41323 = C17648.m41323(view);
        if (c16445M41323 == null || c16445M41323 == this) {
            return;
        }
        this.f37417.put(view, c16445M41323);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16445 m30593(View view) {
        return (C16445) this.f37417.remove(view);
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) C14369 c14369) {
        C10311 c10311 = this.f37418;
        if (!c10311.shouldIgnore() && c10311.mRecyclerView.getLayoutManager() != null) {
            c10311.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c14369);
            C16445 c16445 = (C16445) this.f37417.get(view);
            if (c16445 != null) {
                c16445.onInitializeAccessibilityNodeInfo(view, c14369);
                return;
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c14369);
                return;
            }
        }
        super.onInitializeAccessibilityNodeInfo(view, c14369);
    }

    @Override // l.C16445
    public final boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        C10311 c10311 = this.f37418;
        if (!c10311.shouldIgnore() && c10311.mRecyclerView.getLayoutManager() != null) {
            C16445 c16445 = (C16445) this.f37417.get(view);
            if (c16445 != null) {
                if (c16445.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return c10311.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    @Override // l.C16445
    public final void sendAccessibilityEvent(View view, int i) {
        C16445 c16445 = (C16445) this.f37417.get(view);
        if (c16445 != null) {
            c16445.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // l.C16445
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C16445 c16445 = (C16445) this.f37417.get(view);
        if (c16445 != null) {
            c16445.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @Override // l.C16445
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C16445 c16445 = (C16445) this.f37417.get(view);
        if (c16445 != null) {
            return c16445.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C16445
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C16445 c16445 = (C16445) this.f37417.get(view);
        if (c16445 != null) {
            c16445.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C16445 c16445 = (C16445) this.f37417.get(view);
        if (c16445 != null) {
            c16445.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // l.C16445
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C16445 c16445 = (C16445) this.f37417.get(viewGroup);
        if (c16445 != null) {
            return c16445.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // l.C16445
    public final C20721 getAccessibilityNodeProvider(View view) {
        C16445 c16445 = (C16445) this.f37417.get(view);
        if (c16445 != null) {
            return c16445.getAccessibilityNodeProvider(view);
        }
        return super.getAccessibilityNodeProvider(view);
    }
}
