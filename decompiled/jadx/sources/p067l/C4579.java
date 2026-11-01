package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X20E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4579 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public static final C4579 f10252 = new C4579(R.string.MT_Protector, R.drawable.MT_Protector);

    /* JADX INFO: renamed from: ᩻ */
    public static C4579 m9654() {
        return f10252;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9966() == 1 && !c4697.m9961().isDirectory();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
        c4697.m9970().mo17065(interfaceC19370M9961);
        C6001.m13511(c4697.m9969(), interfaceC19370M9961, interfaceC19370M9961.mo39139().m9395() == null);
    }
}
