package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B3J */
/* JADX INFO: loaded from: classes3.dex */
public class C6993 extends AbstractC10128 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19944 f21586;

    public C6993(InterfaceC19944 interfaceC19944) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f21586 = interfaceC19944;
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        InterfaceC19944 interfaceC19944 = this.f21586;
        C14298.m34099(c16560, interfaceC19944, interfaceC19944.mo13539());
    }

    @Override // l.AbstractC10128
    /* JADX INFO: renamed from: ܳ */
    public boolean mo9841() {
        C16415 c16415Mo13539 = this.f21586.mo13539();
        return !(c16415Mo13539.f50494 == null || c16415Mo13539.f50492.isEmpty());
    }
}
