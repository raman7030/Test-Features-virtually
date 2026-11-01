package p067l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ܿ۟ */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C1695 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f55891;

    /* JADX INFO: renamed from: ֫ */
    public static C1695 m42689(float f, float f2, float f3) {
        return new C1695(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public C1695(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        this.f55891 = rangeInfo;
    }
}
