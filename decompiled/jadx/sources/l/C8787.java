package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8787 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f26760;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8787(C5259 c5259) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f26760 = c5259;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        C5259 c5259 = this.f26760;
        AbstractC3577 abstractC3577M31047 = C12749.m31047(c5259.f16459);
        if (abstractC3577M31047 != null) {
            abstractC3577M31047.f11354 = c5259.m39741();
            C12749.m31032();
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C21374.m48463(R.string.MT_Protector);
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo9841() {
        this.f26760.getClass();
        return true;
    }
}
