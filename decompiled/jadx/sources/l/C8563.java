package l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* JADX INFO: renamed from: l.ۡ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8563 extends C16445 {
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @Override // l.C16445
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C0095 c0095 = (C0095) view;
        if (c0095.isEnabled()) {
            int height = c0095.getHeight();
            Rect rect = new Rect();
            if (c0095.getMatrix().isIdentity() && c0095.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = Math.min(c0095.getScrollY() + ((height - c0095.getPaddingBottom()) - c0095.getPaddingTop()), c0095.m1064());
                if (iMin != c0095.getScrollY()) {
                    c0095.m1076(iMin);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = Math.max(c0095.getScrollY() - ((height - c0095.getPaddingBottom()) - c0095.getPaddingTop()), 0);
                if (iMax != c0095.getScrollY()) {
                    c0095.m1076(iMax);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = Math.min(c0095.getScrollY() + ((height - c0095.getPaddingBottom()) - c0095.getPaddingTop()), c0095.m1064());
                if (iMin != c0095.getScrollY()) {
                    c0095.m1076(iMin);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        int iM1064;
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        C0095 c0095 = (C0095) view;
        c14369.m34281((CharSequence) ScrollView.class.getName());
        if (!c0095.isEnabled() || (iM1064 = c0095.m1064()) <= 0) {
            return;
        }
        c14369.m34313(true);
        if (c0095.getScrollY() > 0) {
            c14369.m34283(C13847.f41299);
            c14369.m34283(C13847.f41297);
        }
        if (c0095.getScrollY() < iM1064) {
            c14369.m34283(C13847.f41296);
            c14369.m34283(C13847.f41302);
        }
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        C0095 c0095 = (C0095) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(c0095.m1064() > 0);
        accessibilityEvent.setScrollX(c0095.getScrollX());
        accessibilityEvent.setScrollY(c0095.getScrollY());
        accessibilityEvent.setMaxScrollX(c0095.getScrollX());
        accessibilityEvent.setMaxScrollY(c0095.m1064());
    }
}
