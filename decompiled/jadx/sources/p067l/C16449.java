package p067l;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ܳ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J634 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16449 extends C1658 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C25167 f48330;

    public C16449(C25167 c25167) {
        this.f48330 = c25167;
    }

    @Override // p067l.C1658
    public final void onInitializeAccessibilityNodeInfo(View view, C1555 c1555) {
        C25167 c25167 = this.f48330;
        c25167.f80523.onInitializeAccessibilityNodeInfo(view, c1555);
        int childAdapterPosition = c25167.f80525.getChildAdapterPosition(view);
        AbstractC21283 adapter = c25167.f80525.getAdapter();
        if (adapter instanceof C8383) {
            ((C8383) adapter).m19547(childAdapterPosition);
        }
    }

    @Override // p067l.C1658
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f48330.f80523.performAccessibilityAction(view, i, bundle);
    }
}
