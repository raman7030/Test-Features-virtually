package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩺ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBEN */
/* JADX INFO: loaded from: classes.dex */
public final class C24278 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C24278 f76908 = new C24278();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 2;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        return c21442M15873.m56524get(0).m50981() + ", " + c21442M15873.m56524get(1).m50981() + ", " + abstractC12289.mo15872();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return abstractC12289.mo15868();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        if (!(abstractC6924 instanceof C23018) || c21442M15873.size() != 2 || !AbstractC13630.m31007(c21442M15873.m56524get(0).m50989()) || !AbstractC13630.m31007(c21442M15873.m56524get(1).m50989())) {
            return false;
        }
        C23018 c23018 = (C23018) abstractC6924;
        if (!AbstractC13630.m31010(c23018.m51403())) {
            return false;
        }
        AbstractC15405 abstractC15405M51402 = c23018.m51402();
        return (abstractC15405M51402 instanceof C14260) || (abstractC15405M51402 instanceof C10908);
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo9226(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC13630.m31007(c21442M15873.m56524get(0).m50989()));
        bitSet.set(1, AbstractC13630.m31007(c21442M15873.m56524get(1).m50989()));
        return bitSet;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        AbstractC13630.m31001((InterfaceC7893) c19705, AbstractC13630.m31000(abstractC12289, AbstractC13630.m31005(c21442M15873.m56524get(0).m50989(), c21442M15873.m56524get(1).m50989())), (short) ((C23018) abstractC12289).m51403());
    }
}
