package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K6KF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3472 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13349 f10989;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3472(C13349 c13349, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f10989 = c13349;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (!C11356.m28105(strTrim)) {
            m31263(R.string.MT_Protector);
            return;
        }
        C11356.m28106(strTrim);
        this.f10989.mo6922();
        m31262();
    }
}
