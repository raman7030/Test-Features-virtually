package p067l;

/* JADX INFO: renamed from: l.ۗܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBBQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5503 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C5503 f13153 = new C5503();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 2;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        return AbstractC13630.m31011(abstractC12289);
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return AbstractC13630.m31008(abstractC12289);
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        if (!(abstractC6924 instanceof C7515) || abstractC6924.m15873().size() != 0) {
            return false;
        }
        C7515 c7515 = (C7515) abstractC6924;
        if (c7515.m17409()) {
            return mo12133(c7515);
        }
        return true;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12133(C7515 c7515) {
        int iM17408 = c7515.m17408();
        return iM17408 != 0 && ((short) iM17408) == iM17408;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        AbstractC13630.m31001((InterfaceC7893) c19705, AbstractC13630.m31000(abstractC12289, 0), (short) ((C7515) abstractC12289).m17408());
    }
}
