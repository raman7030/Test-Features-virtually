package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C16486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f50681;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16486 m38850(int i, int i2, int i3, boolean z) {
        return new C16486(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16486 m38849(int i) {
        return new C16486(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }

    public C16486(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f50681 = collectionInfo;
    }
}
