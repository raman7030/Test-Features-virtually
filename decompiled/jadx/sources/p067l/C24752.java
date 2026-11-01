package p067l;

import android.R;

/* JADX INFO: renamed from: l.᩻۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24752 extends AbstractC9504 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C4636 f78357;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1100 f78356 = new C19388(this);

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1100 f78355 = new C18717(this);

    public C24752(C4636 c4636) {
        this.f78357 = c4636;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54413() {
        int itemCount;
        int i = R.id.accessibilityActionPageLeft;
        C4636 c4636 = this.f78357;
        C1717.m43583(R.id.accessibilityActionPageLeft, c4636);
        C1717.m43583(R.id.accessibilityActionPageRight, c4636);
        C1717.m43583(R.id.accessibilityActionPageUp, c4636);
        C1717.m43583(R.id.accessibilityActionPageDown, c4636);
        if (c4636.f10398.getAdapter() == null || (itemCount = c4636.f10398.getAdapter().getItemCount()) == 0 || !c4636.m9782()) {
            return;
        }
        int iM9785 = c4636.m9785();
        InterfaceC1100 interfaceC1100 = this.f78355;
        InterfaceC1100 interfaceC1101 = this.f78356;
        if (iM9785 == 0) {
            boolean z = c4636.f10397.getLayoutDirection() == 1;
            int i2 = z ? R.id.accessibilityActionPageLeft : R.id.accessibilityActionPageRight;
            if (z) {
                i = R.id.accessibilityActionPageRight;
            }
            if (c4636.f10402 < itemCount - 1) {
                C1717.m43554(c4636, new C1529(i2, (String) null), null, interfaceC1101);
            }
            if (c4636.f10402 > 0) {
                C1717.m43554(c4636, new C1529(i, (String) null), null, interfaceC1100);
                return;
            }
            return;
        }
        if (c4636.f10402 < itemCount - 1) {
            C1717.m43554(c4636, new C1529(R.id.accessibilityActionPageDown, (String) null), null, interfaceC1101);
        }
        if (c4636.f10402 > 0) {
            C1717.m43554(c4636, new C1529(R.id.accessibilityActionPageUp, (String) null), null, interfaceC1100);
        }
    }
}
