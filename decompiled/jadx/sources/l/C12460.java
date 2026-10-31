package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12460 extends AbstractC15553 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC10344 f37468;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15553 f37469;

    public C12460(DialogInterfaceOnCancelListenerC10344 dialogInterfaceOnCancelListenerC10344, AbstractC15553 abstractC15553) {
        this.f37468 = dialogInterfaceOnCancelListenerC10344;
        this.f37469 = abstractC15553;
    }

    @Override // l.AbstractC15553
    /* JADX INFO: renamed from: ֫ */
    public final View mo7106(int i) {
        AbstractC15553 abstractC15553 = this.f37469;
        if (abstractC15553.mo7107()) {
            return abstractC15553.mo7106(i);
        }
        return this.f37468.onFindViewById(i);
    }

    @Override // l.AbstractC15553
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo7107() {
        return this.f37469.mo7107() || this.f37468.onHasView();
    }
}
