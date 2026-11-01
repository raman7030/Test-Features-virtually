package p067l;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۟ */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes.dex */
public class C2010 extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: ֫ */
    public final C1870 f78340;

    public C2010(C1870 c1870) {
        this.f78340 = c1870;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C1555 c1555Mo41315 = this.f78340.mo41315(i);
        if (c1555Mo41315 == null) {
            return null;
        }
        return c1555Mo41315.m36445();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f78340.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f78340.mo41316(i, i2, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C1555 c1555Mo41317 = this.f78340.mo41317(i);
        if (c1555Mo41317 == null) {
            return null;
        }
        return c1555Mo41317.m36445();
    }
}
