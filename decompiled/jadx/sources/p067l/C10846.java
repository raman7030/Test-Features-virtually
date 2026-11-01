package p067l;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۡܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10846 extends C1658 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C2798 f30056;

    public C10846(C2798 c2798) {
        this.f30056 = c2798;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // p067l.C1658
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC13787 abstractC13787;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(C2798.class.getName());
        C2798 c2798 = this.f30056;
        AbstractC13787 abstractC13788 = c2798.f4783;
        if (abstractC13788 != null) {
            z = abstractC13788.mo13852() > 1;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() != 4096 || (abstractC13787 = c2798.f4783) == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC13787.mo13852());
        accessibilityEvent.setFromIndex(c2798.f4765);
        accessibilityEvent.setToIndex(c2798.f4765);
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        super.onInitializeAccessibilityNodeInfo(view, c1555);
        c1555.m36414((CharSequence) C2798.class.getName());
        C2798 c2798 = this.f30056;
        AbstractC13787 abstractC13787 = c2798.f4783;
        c1555.m36446(abstractC13787 != null && abstractC13787.mo13852() > 1);
        if (c2798.canScrollHorizontally(1)) {
            c1555.m36408(4096);
        }
        if (c2798.canScrollHorizontally(-1)) {
            c1555.m36408(8192);
        }
    }

    @Override // p067l.C1658
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C2798 c2798 = this.f30056;
        if (i == 4096) {
            if (!c2798.canScrollHorizontally(1)) {
                return false;
            }
            c2798.m4420(c2798.f4765 + 1);
            return true;
        }
        if (i != 8192 || !c2798.canScrollHorizontally(-1)) {
            return false;
        }
        c2798.m4420(c2798.f4765 - 1);
        return true;
    }
}
