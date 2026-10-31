package l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23020 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51159(AccessibilityManager accessibilityManager, InterfaceC6087 interfaceC6087) {
        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC11732(interfaceC6087));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51160(AccessibilityManager accessibilityManager, InterfaceC6087 interfaceC6087) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC11732(interfaceC6087));
    }
}
