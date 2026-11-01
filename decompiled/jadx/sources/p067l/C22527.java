package p067l;

/* JADX INFO: renamed from: l.᩷᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEF */
/* JADX INFO: loaded from: classes5.dex */
public final class C22527 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C22527 f71027 = new C22527();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 3;
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
        if (!(abstractC6924 instanceof C23018)) {
            return false;
        }
        C23018 c23018 = (C23018) abstractC6924;
        int iM51403 = c23018.m51403();
        AbstractC15405 abstractC15405M51402 = c23018.m51402();
        if (!AbstractC13630.m31010(iM51403)) {
            return false;
        }
        if (!(abstractC15405M51402 instanceof C23648) && !(abstractC15405M51402 instanceof C14260) && !(abstractC15405M51402 instanceof C24989)) {
            return false;
        }
        C21442 c21442M15873 = c23018.m15873();
        c21442M15873.size();
        if (c21442M15873.size() != 0) {
            return AbstractC13630.m31004(c21442M15873) && AbstractC13630.m31010(c21442M15873.m56524get(0).m50989()) && AbstractC13630.m31003(c21442M15873.m48569());
        }
        return true;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        int iM51403 = ((C23018) abstractC12289).m51403();
        int iM50989 = c21442M15873.size() != 0 ? c21442M15873.m56524get(0).m50989() : 0;
        c19705.m44770(AbstractC13630.m31000(abstractC12289, c21442M15873.m48569()));
        c19705.m44770((short) iM51403);
        c19705.m44770((short) iM50989);
    }
}
