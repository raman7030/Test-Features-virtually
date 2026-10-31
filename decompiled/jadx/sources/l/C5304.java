package l;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۚۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O607 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5304 extends C16445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect f16549 = new Rect();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13064 f16550;

    public C5304(C13064 c13064) {
        this.f16550 = c13064;
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        if (C13064.f39107) {
            super.onInitializeAccessibilityNodeInfo(view, c14369);
        } else {
            C14369 c14369M34265 = C14369.m34265(c14369);
            super.onInitializeAccessibilityNodeInfo(view, c14369M34265);
            c14369.m34327(view);
            int i = C17648.f53953;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                c14369.m34318((View) parentForAccessibility);
            }
            Rect rect = this.f16549;
            c14369M34265.m34303(rect);
            c14369.m34326(rect);
            c14369.m34330(c14369M34265.m34273());
            c14369.m34328(c14369M34265.m34309());
            c14369.m34281(c14369M34265.m34315());
            c14369.m34305(c14369M34265.m34325());
            c14369.m34311(c14369M34265.m34297());
            c14369.m34293(c14369M34265.m34289());
            c14369.m34287(c14369M34265.m34294());
            c14369.m34288(c14369M34265.m34272());
            c14369.m34275(c14369M34265.m34274());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (C13064.m31640(childAt)) {
                    c14369.m34279(childAt);
                }
            }
        }
        c14369.m34281("androidx.drawerlayout.widget.DrawerLayout");
        c14369.m34337(false);
        c14369.m34293(false);
        c14369.m34307(C13847.f41300);
        c14369.m34307(C13847.f41303);
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // l.C16445
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            C13064 c13064 = this.f16550;
            View viewM31655 = c13064.m31655();
            if (viewM31655 == null) {
                return true;
            }
            int iM31654 = c13064.m31654(viewM31655);
            c13064.getClass();
            int i = C17648.f53953;
            Gravity.getAbsoluteGravity(iM31654, c13064.getLayoutDirection());
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // l.C16445
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (C13064.f39107 || C13064.m31640(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
