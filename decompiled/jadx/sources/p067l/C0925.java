package p067l;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.֫۟ */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0925 {
    /* JADX INFO: renamed from: ֫ */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m7891(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m7900(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7897(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1730 m7895(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        return new C1730(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1555 m7894(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new C1555((Object) child);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1555 m7893(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new C1555((Object) parent);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m7898(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7896(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m7899(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7892(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }
}
