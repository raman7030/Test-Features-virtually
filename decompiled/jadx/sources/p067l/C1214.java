package p067l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.۟ܰ */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C1214 {
    /* JADX INFO: renamed from: ֫ */
    public static void m22104(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m22102(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m22103(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }
}
