package p067l;

/* JADX INFO: renamed from: l.ۡ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11127 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C11127 f30851 = new C11127();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 4;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        return AbstractC13630.m31009(abstractC12289.m15873()) + ", " + abstractC12289.mo15872();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return abstractC12289.mo15868();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        if (!(abstractC6924 instanceof C19585)) {
            return false;
        }
        C19585 c19585 = (C19585) abstractC6924;
        int iM44500 = c19585.m44500(0);
        int iM44501 = c19585.m44500(1);
        if (!AbstractC13630.m31010(iM44500) || !AbstractC13630.m31010(iM44501) || !(c19585.m44498(0) instanceof C23648) || !(c19585.m44498(1) instanceof C6884)) {
            return false;
        }
        C21442 c21442M15873 = c19585.m15873();
        int size = c21442M15873.size();
        if (size == 0) {
            return true;
        }
        return AbstractC13630.m31003(c21442M15873.m48569()) && AbstractC13630.m31010(size) && AbstractC13630.m31010(c21442M15873.m56524get(0).m50989()) && AbstractC13630.m31004(c21442M15873);
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        C19585 c19585 = (C19585) abstractC12289;
        short sM44500 = (short) c19585.m44500(0);
        short sM44501 = (short) c19585.m44500(1);
        C21442 c21442M15873 = abstractC12289.m15873();
        short sM50989 = c21442M15873.size() > 0 ? (short) c21442M15873.m56524get(0).m50989() : (short) 0;
        c19705.m44770(AbstractC13630.m31000(abstractC12289, c21442M15873.m48569()));
        c19705.m44770(sM44500);
        c19705.m44770(sM50989);
        c19705.m44770(sM44501);
    }
}
