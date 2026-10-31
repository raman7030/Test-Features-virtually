package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9493 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f28833;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9493(C5259 c5259) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f28833 = c5259;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        AbstractC3577 abstractC3577M15171 = this.f28833.m15171();
        if (abstractC3577M15171 == null) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        C9068.m23403(c16560.m39058(), new C17534(abstractC3577M15171, true), c16560.m39016().m24082());
        C1099.m3771(c16560.m39056());
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9841() {
        this.f28833.getClass();
        return true;
    }
}
