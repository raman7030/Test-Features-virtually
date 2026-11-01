package p067l;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.ۨܰ */
/* JADX INFO: compiled from: L3T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC1424 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1144 f37993;

    public AccessibilityManagerTouchExplorationStateChangeListenerC1424(InterfaceC1144 interfaceC1144) {
        this.f37993 = interfaceC1144;
    }

    public final int hashCode() {
        return this.f37993.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC1424) {
            return this.f37993.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC1424) obj).f37993);
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f37993.onTouchExplorationStateChanged(z);
    }
}
