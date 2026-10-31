package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ܿ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes4.dex */
public final class C17594 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m41121(C14771 c14771, float f, float f2) {
        View viewM41120 = m41120((ViewGroup) c14771, f, f2);
        if (viewM41120 == null) {
            return false;
        }
        if (viewM41120 instanceof C9503) {
            if (((C9503) viewM41120).f28867) {
                return true;
            }
        } else if ((viewM41120 instanceof C2447) && ((C2447) viewM41120).m7902()) {
            return true;
        }
        return viewM41120.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m41120(ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getLeft() <= f && f <= childAt.getRight() && childAt.getTop() <= f2 && f2 <= childAt.getBottom()) {
                if (!(childAt instanceof ViewGroup) || (childAt instanceof C13132) || (childAt instanceof ListView)) {
                    return childAt;
                }
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                return m41120(viewGroup2, (f - viewGroup2.getLeft()) + viewGroup2.getScrollX(), (f2 - viewGroup2.getTop()) + viewGroup2.getScrollY());
            }
        }
        return null;
    }
}
