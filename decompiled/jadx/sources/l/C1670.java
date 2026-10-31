package l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.֫۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1670 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m5661(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m5670(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5667(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17898 m5665(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        return new C17898(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14369 m5664(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new C14369((Object) child);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14369 m5663(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new C14369((Object) parent);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m5668(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5666(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m5669(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5662(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }
}
