package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14210 extends AbstractC17150 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC12199 f40488;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC17150 f40489;

    public C14210(DialogInterfaceOnCancelListenerC12199 dialogInterfaceOnCancelListenerC12199, AbstractC17150 abstractC17150) {
        this.f40488 = dialogInterfaceOnCancelListenerC12199;
        this.f40489 = abstractC17150;
    }

    @Override // p067l.AbstractC17150
    /* JADX INFO: renamed from: ֫ */
    public final View mo9201(int i) {
        AbstractC17150 abstractC17150 = this.f40489;
        if (abstractC17150.mo9202()) {
            return abstractC17150.mo9201(i);
        }
        return this.f40488.onFindViewById(i);
    }

    @Override // p067l.AbstractC17150
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9202() {
        return this.f40489.mo9202() || this.f40488.onHasView();
    }
}
