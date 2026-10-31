package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ܿ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17192 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f52710;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17192 m40444(float f, float f2, float f3) {
        return new C17192(AccessibilityNodeInfo.RangeInfo.obtain(1, f, f2, f3));
    }

    public C17192(AccessibilityNodeInfo.RangeInfo rangeInfo) {
        this.f52710 = rangeInfo;
    }
}
