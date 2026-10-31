package l;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ܳ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J634 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14815 extends C16445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23988 f45214;

    public C14815(C23988 c23988) {
        this.f45214 = c23988;
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        C23988 c23988 = this.f45214;
        c23988.f77772.onInitializeAccessibilityNodeInfo(view, c14369);
        int childAdapterPosition = c23988.f77774.getChildAdapterPosition(view);
        AbstractC19902 adapter = c23988.f77774.getAdapter();
        if (adapter instanceof C6328) {
            ((C6328) adapter).m17607(childAdapterPosition);
        }
    }

    @Override // l.C16445
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f45214.f77772.performAccessibilityAction(view, i, bundle);
    }
}
