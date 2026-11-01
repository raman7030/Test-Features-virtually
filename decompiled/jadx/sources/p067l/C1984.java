package p067l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.᩺ܰ */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1984 {
    /* JADX INFO: renamed from: ֫ */
    public static void m53552(AccessibilityManager accessibilityManager, InterfaceC1144 interfaceC1144) {
        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1424(interfaceC1144));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53553(AccessibilityManager accessibilityManager, InterfaceC1144 interfaceC1144) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC1424(interfaceC1144));
    }
}
