package p067l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ܿ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAWX */
/* JADX INFO: loaded from: classes4.dex */
public final class C19090 {
    /* JADX INFO: renamed from: ֫ */
    public static final boolean m43367(C16407 c16407, float f, float f2) {
        View viewM43366 = m43366((ViewGroup) c16407, f, f2);
        if (viewM43366 == null) {
            return false;
        }
        if (viewM43366 instanceof C11400) {
            if (((C11400) viewM43366).f31814) {
                return true;
            }
        } else if ((viewM43366 instanceof C4694) && ((C4694) viewM43366).m9950()) {
            return true;
        }
        return viewM43366.canScrollVertically(-1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static View m43366(ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getLeft() <= f && f <= childAt.getRight() && childAt.getTop() <= f2 && f2 <= childAt.getBottom()) {
                if (!(childAt instanceof ViewGroup) || (childAt instanceof C14849) || (childAt instanceof ListView)) {
                    return childAt;
                }
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                return m43366(viewGroup2, (f - viewGroup2.getLeft()) + viewGroup2.getScrollX(), (f2 - viewGroup2.getTop()) + viewGroup2.getScrollY());
            }
        }
        return null;
    }
}
