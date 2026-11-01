package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4L2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8144 {
    /* JADX INFO: renamed from: ֫ */
    public static int m18912(C22897 c22897, AbstractC4518 abstractC4518, View view, View view2, AbstractC18873 abstractC18873, boolean z, boolean z2) {
        int iMax;
        if (abstractC18873.getChildCount() == 0 || c22897.m51124() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMin = Math.min(abstractC18873.getPosition(view), abstractC18873.getPosition(view2));
        int iMax2 = Math.max(abstractC18873.getPosition(view), abstractC18873.getPosition(view2));
        if (z2) {
            iMax = Math.max(0, (c22897.m51124() - iMax2) - 1);
        } else {
            iMax = Math.max(0, iMin);
        }
        if (!z) {
            return iMax;
        }
        return Math.round((iMax * (Math.abs(abstractC4518.mo9555(view2) - abstractC4518.mo9567(view)) / (Math.abs(abstractC18873.getPosition(view) - abstractC18873.getPosition(view2)) + 1))) + (abstractC4518.mo9560() - abstractC4518.mo9567(view)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18911(C22897 c22897, AbstractC4518 abstractC4518, View view, View view2, AbstractC18873 abstractC18873, boolean z) {
        if (abstractC18873.getChildCount() == 0 || c22897.m51124() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC18873.getPosition(view) - abstractC18873.getPosition(view2)) + 1;
        }
        return Math.min(abstractC4518.mo9569(), abstractC4518.mo9555(view2) - abstractC4518.mo9567(view));
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m18913(C22897 c22897, AbstractC4518 abstractC4518, View view, View view2, AbstractC18873 abstractC18873, boolean z) {
        if (abstractC18873.getChildCount() == 0 || c22897.m51124() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c22897.m51124();
        }
        return (int) (((abstractC4518.mo9555(view2) - abstractC4518.mo9567(view)) / (Math.abs(abstractC18873.getPosition(view) - abstractC18873.getPosition(view2)) + 1)) * c22897.m51124());
    }
}
