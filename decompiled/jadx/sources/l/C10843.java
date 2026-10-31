package l;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l.ۧ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 44RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10843 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m27105(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27100(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m27095(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27099(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27097(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27102(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m27104(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27103(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m27101(AccessibilityNodeInfo accessibilityNodeInfo) {
        return C0710.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()).toMillis();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27096(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(C0710.convert(C2828.ofMillis(j)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27098(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AccessibilityNodeInfo.AccessibilityAction m27094() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }
}
