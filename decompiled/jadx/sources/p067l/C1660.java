package p067l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ܽ۟ */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C1660 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f53858;

    /* JADX INFO: renamed from: ֫ */
    public static C1660 m41076(int i, int i2, int i3, boolean z) {
        return new C1660(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1660 m41075(int i) {
        return new C1660(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }

    public C1660(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f53858 = collectionInfo;
    }
}
