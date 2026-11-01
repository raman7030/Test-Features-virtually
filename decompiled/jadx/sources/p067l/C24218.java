package p067l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩺۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes.dex */
public final class C24218 extends C1658 {

    /* JADX INFO: renamed from: ֫ */
    public final Rect f76757 = new Rect();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C16113 f76758;

    public C24218(C16113 c16113) {
        this.f76758 = c16113;
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        C1555 c1555M36398 = C1555.m36398(c1555);
        super.onInitializeAccessibilityNodeInfo(view, c1555M36398);
        Rect rect = this.f76757;
        c1555M36398.m36436(rect);
        c1555.m36459(rect);
        c1555.m36463(c1555M36398.m36406());
        c1555.m36461(c1555M36398.m36442());
        c1555.m36414(c1555M36398.m36448());
        c1555.m36438(c1555M36398.m36458());
        c1555.m36444(c1555M36398.m36430());
        c1555.m36462(c1555M36398.m36432());
        c1555.m36470(c1555M36398.m36447());
        c1555.m36426(c1555M36398.m36422());
        c1555.m36420(c1555M36398.m36427());
        c1555.m36421(c1555M36398.m36405());
        c1555.m36431(c1555M36398.m36424());
        c1555.m36408(c1555M36398.m36407());
        c1555.m36449(c1555M36398.m36454());
        c1555.m36414("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        c1555.m36460(view);
        int i = C1717.f57146;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            c1555.m36451((View) parentForAccessibility);
        }
        C16113 c16113 = this.f76758;
        int childCount = c16113.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c16113.getChildAt(i2);
            if (!c16113.m36680(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                c1555.m36412(childAt);
            }
        }
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // p067l.C1658
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f76758.m36680(view)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
