package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C5875 extends AbstractViewOnClickListenerC11726 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20858 f18018;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13262 f18019;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5875(InterfaceC20858 interfaceC20858, AbstractC13262 abstractC13262, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f18019 = abstractC13262;
        this.f18018 = interfaceC20858;
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo16437() {
        String strM28623 = m28623();
        AbstractC13262 abstractC13262 = this.f18019;
        abstractC13262.m32192(strM28623);
        boolean zIsEmpty = m28623().isEmpty();
        InterfaceC20858 interfaceC20858 = this.f18018;
        if (!zIsEmpty) {
            try {
                abstractC13262.mo32190();
                interfaceC20858.onSuccess();
            } catch (Throwable unused) {
                C21374.m48457(R.string.MT_Protector);
                m28625();
                return;
            }
        } else {
            interfaceC20858.onCanceled();
        }
        m28620();
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo16436() {
        this.f18018.onCanceled();
    }
}
