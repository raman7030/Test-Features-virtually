package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7952 extends AbstractViewOnClickListenerC13513 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ InterfaceC22192 f20871;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractC14973 f20872;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7952(InterfaceC22192 interfaceC22192, AbstractC14973 abstractC14973, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f20872 = abstractC14973;
        this.f20871 = interfaceC22192;
    }

    @Override // p067l.AbstractViewOnClickListenerC13513
    /* JADX INFO: renamed from: ܿ */
    public final void mo18363() {
        String strM30671 = m30671();
        AbstractC14973 abstractC14973 = this.f20872;
        abstractC14973.m34291(strM30671);
        boolean zIsEmpty = m30671().isEmpty();
        InterfaceC22192 interfaceC22192 = this.f20871;
        if (!zIsEmpty) {
            try {
                abstractC14973.mo34289();
                interfaceC22192.onSuccess();
            } catch (Throwable unused) {
                C22682.m50793(R.string.MT_Protector);
                m30673();
                return;
            }
        } else {
            interfaceC22192.onCanceled();
        }
        m30668();
    }

    @Override // p067l.AbstractViewOnClickListenerC13513
    /* JADX INFO: renamed from: ܽ */
    public final void mo18362() {
        this.f20871.onCanceled();
    }
}
