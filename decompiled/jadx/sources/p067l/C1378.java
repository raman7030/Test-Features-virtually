package p067l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۛ */
/* JADX INFO: compiled from: 86A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1378 extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: ֫ */
    public final C1658 f35464;

    public C1378(C1658 c1658) {
        this.f35464 = c1658;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f35464.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f35464.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C1555 c1555M36397 = C1555.m36397(accessibilityNodeInfo);
        int i = C1717.f57146;
        Boolean bool = (Boolean) new C0896(R.id.MT_Protector, 0, 28, Boolean.class).m48701(view);
        c1555M36397.m36429(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new C1911(R.id.MT_Protector, 0, 28, Boolean.class).m48701(view);
        c1555M36397.m36466(bool2 != null && bool2.booleanValue());
        c1555M36397.m36456(C1717.m43582(view));
        c1555M36397.m36443((CharSequence) new C1596(R.id.MT_Protector, 64, 30, CharSequence.class).m48701(view));
        this.f35464.onInitializeAccessibilityNodeInfo(view, c1555M36397);
        c1555M36397.m36413(view, accessibilityNodeInfo.getText());
        List listM40974 = C1658.m40974(view);
        for (int i2 = 0; i2 < listM40974.size(); i2++) {
            c1555M36397.m36416((C1529) listM40974.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f35464.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f35464.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f35464.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f35464.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1870 accessibilityNodeProvider = this.f35464.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.m49654();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f35464.performAccessibilityAction(view, i, bundle);
    }
}
