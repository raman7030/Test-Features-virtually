package l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩺۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BG */
/* JADX INFO: loaded from: classes.dex */
public final class C22990 extends C16445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect f74022 = new Rect();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14462 f74023;

    public C22990(C14462 c14462) {
        this.f74023 = c14462;
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        C14369 c14369M34265 = C14369.m34265(c14369);
        super.onInitializeAccessibilityNodeInfo(view, c14369M34265);
        Rect rect = this.f74022;
        c14369M34265.m34303(rect);
        c14369.m34326(rect);
        c14369.m34330(c14369M34265.m34273());
        c14369.m34328(c14369M34265.m34309());
        c14369.m34281(c14369M34265.m34315());
        c14369.m34305(c14369M34265.m34325());
        c14369.m34311(c14369M34265.m34297());
        c14369.m34329(c14369M34265.m34299());
        c14369.m34337(c14369M34265.m34314());
        c14369.m34293(c14369M34265.m34289());
        c14369.m34287(c14369M34265.m34294());
        c14369.m34288(c14369M34265.m34272());
        c14369.m34298(c14369M34265.m34291());
        c14369.m34275(c14369M34265.m34274());
        c14369.m34316(c14369M34265.m34321());
        c14369.m34281("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        c14369.m34327(view);
        int i = C17648.f53953;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            c14369.m34318((View) parentForAccessibility);
        }
        C14462 c14462 = this.f74023;
        int childCount = c14462.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c14462.getChildAt(i2);
            if (!c14462.m34546(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                c14369.m34279(childAt);
            }
        }
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // l.C16445
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f74023.m34546(view)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
