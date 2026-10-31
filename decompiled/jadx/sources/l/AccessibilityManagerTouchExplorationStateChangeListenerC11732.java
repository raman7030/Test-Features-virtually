package l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.ۨܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC11732 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6087 f34993;

    public AccessibilityManagerTouchExplorationStateChangeListenerC11732(InterfaceC6087 interfaceC6087) {
        this.f34993 = interfaceC6087;
    }

    public final int hashCode() {
        return this.f34993.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC11732) {
            return this.f34993.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC11732) obj).f34993);
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f34993.onTouchExplorationStateChanged(z);
    }
}
