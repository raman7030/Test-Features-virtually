package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17898 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f54662;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17898 m41877(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return new C17898(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
    }

    public C17898(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f54662 = collectionItemInfo;
    }
}
