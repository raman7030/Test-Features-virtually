package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4L2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6077 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16983(C21600 c21600, AbstractC2262 abstractC2262, View view, View view2, AbstractC17366 abstractC17366, boolean z, boolean z2) {
        int iMax;
        if (abstractC17366.getChildCount() == 0 || c21600.m48777() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(abstractC17366.getPosition(view), abstractC17366.getPosition(view2));
        int iMax2 = Math.max(abstractC17366.getPosition(view), abstractC17366.getPosition(view2));
        if (z2) {
            iMax = Math.max(0, (c21600.m48777() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(abstractC2262.mo7473(view2) - abstractC2262.mo7485(view)) / (Math.abs(abstractC17366.getPosition(view) - abstractC17366.getPosition(view2)) + 1))) + (abstractC2262.mo7478() - abstractC2262.mo7485(view)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16982(C21600 c21600, AbstractC2262 abstractC2262, View view, View view2, AbstractC17366 abstractC17366, boolean z) {
        if (abstractC17366.getChildCount() == 0 || c21600.m48777() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC17366.getPosition(view) - abstractC17366.getPosition(view2)) + 1;
        }
        return Math.min(abstractC2262.mo7487(), abstractC2262.mo7473(view2) - abstractC2262.mo7485(view));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m16984(C21600 c21600, AbstractC2262 abstractC2262, View view, View view2, AbstractC17366 abstractC17366, boolean z) {
        if (abstractC17366.getChildCount() == 0 || c21600.m48777() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c21600.m48777();
        }
        return (int) (((abstractC2262.mo7473(view2) - abstractC2262.mo7485(view)) / (Math.abs(abstractC17366.getPosition(view) - abstractC17366.getPosition(view2)) + 1)) * c21600.m48777());
    }
}
