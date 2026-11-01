package p067l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.ۡ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10506 extends C1658 {
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @Override // p067l.C1658
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C2458 c2458 = (C2458) view;
        if (c2458.isEnabled()) {
            int height = c2458.getHeight();
            Rect rect = new Rect();
            if (c2458.getMatrix().isIdentity() && c2458.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(c2458.getScrollY() + ((height - c2458.getPaddingBottom()) - c2458.getPaddingTop()), c2458.m3460());
                if (iMin != c2458.getScrollY()) {
                    c2458.m3472(iMin);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(c2458.getScrollY() - ((height - c2458.getPaddingBottom()) - c2458.getPaddingTop()), 0);
                if (iMax != c2458.getScrollY()) {
                    c2458.m3472(iMax);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(c2458.getScrollY() + ((height - c2458.getPaddingBottom()) - c2458.getPaddingTop()), c2458.m3460());
                if (iMin != c2458.getScrollY()) {
                    c2458.m3472(iMin);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        int iM3460;
        super.onInitializeAccessibilityNodeInfo(view, c1555);
        C2458 c2458 = (C2458) view;
        c1555.m36414((CharSequence) ScrollView.class.getName());
        if (!c2458.isEnabled() || (iM3460 = c2458.m3460()) <= 0) {
            return;
        }
        c1555.m36446(true);
        if (c2458.getScrollY() > 0) {
            c1555.m36416(C1529.f44378);
            c1555.m36416(C1529.f44376);
        }
        if (c2458.getScrollY() < iM3460) {
            c1555.m36416(C1529.f44375);
            c1555.m36416(C1529.f44381);
        }
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        C2458 c2458 = (C2458) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(c2458.m3460() > 0);
        accessibilityEvent.setScrollX(c2458.getScrollX());
        accessibilityEvent.setScrollY(c2458.getScrollY());
        accessibilityEvent.setMaxScrollX(c2458.getScrollX());
        accessibilityEvent.setMaxScrollY(c2458.m3460());
    }
}
