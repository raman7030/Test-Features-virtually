package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BCT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15560 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C15560 f44472 = new C15560();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 2;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        return c21442M15873.m56524get(0).m50981() + ", " + c21442M15873.m56524get(1).m50981() + ", " + AbstractC13630.m30996((AbstractC3531) ((C23018) abstractC12289).m51402());
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return AbstractC13630.m30997((AbstractC3531) ((C23018) abstractC12289).m51402(), 16);
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        if ((abstractC6924 instanceof C23018) && c21442M15873.size() == 2 && AbstractC13630.m31007(c21442M15873.m56524get(0).m50989()) && AbstractC13630.m31007(c21442M15873.m56524get(1).m50989())) {
            AbstractC15405 abstractC15405M51402 = ((C23018) abstractC6924).m51402();
            if (abstractC15405M51402 instanceof AbstractC3531) {
                AbstractC3531 abstractC3531 = (AbstractC3531) abstractC15405M51402;
                if (abstractC3531.mo4597()) {
                    int iMo4598 = abstractC3531.mo4598();
                    if (((short) iMo4598) == iMo4598) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        AbstractC13630.m31001((InterfaceC7893) c19705, AbstractC13630.m31000(abstractC12289, AbstractC13630.m31005(c21442M15873.m56524get(0).m50989(), c21442M15873.m56524get(1).m50989())), (short) ((AbstractC3531) ((C23018) abstractC12289).m51402()).mo4598());
    }
}
