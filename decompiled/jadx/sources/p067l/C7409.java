package p067l;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۚۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7409 extends C1658 {

    /* JADX INFO: renamed from: ֫ */
    public final Rect f19386 = new Rect();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C14784 f19387;

    public C7409(C14784 c14784) {
        this.f19387 = c14784;
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        if (C14784.f42155) {
            super.onInitializeAccessibilityNodeInfo(view, c1555);
        } else {
            C1555 c1555M36398 = C1555.m36398(c1555);
            super.onInitializeAccessibilityNodeInfo(view, c1555M36398);
            c1555.m36460(view);
            int i = C1717.f57146;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                c1555.m36451((View) parentForAccessibility);
            }
            Rect rect = this.f19386;
            c1555M36398.m36436(rect);
            c1555.m36459(rect);
            c1555.m36463(c1555M36398.m36406());
            c1555.m36461(c1555M36398.m36442());
            c1555.m36414(c1555M36398.m36448());
            c1555.m36438(c1555M36398.m36458());
            c1555.m36444(c1555M36398.m36430());
            c1555.m36426(c1555M36398.m36422());
            c1555.m36420(c1555M36398.m36427());
            c1555.m36421(c1555M36398.m36405());
            c1555.m36408(c1555M36398.m36407());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (C14784.m33727(childAt)) {
                    c1555.m36412(childAt);
                }
            }
        }
        c1555.m36414("androidx.drawerlayout.widget.DrawerLayout");
        c1555.m36470(false);
        c1555.m36426(false);
        c1555.m36440(C1529.f44379);
        c1555.m36440(C1529.f44382);
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // p067l.C1658
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            C14784 c14784 = this.f19387;
            View viewM33742 = c14784.m33742();
            if (viewM33742 == null) {
                return true;
            }
            int iM33741 = c14784.m33741(viewM33742);
            c14784.getClass();
            int i = C1717.f57146;
            Gravity.getAbsoluteGravity(iM33741, c14784.getLayoutDirection());
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p067l.C1658
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (C14784.f42155 || C14784.m33727(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
