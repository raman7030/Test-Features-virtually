package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܺ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBAC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17831 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C17831 f53207 = new C17831();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 5;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        return abstractC12289.m15873().m56524get(0).m50981() + ", " + AbstractC13630.m30996((AbstractC3531) ((C23018) abstractC12289).m51402());
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return AbstractC13630.m30997((AbstractC3531) ((C23018) abstractC12289).m51402(), 64);
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        if ((abstractC6924 instanceof C23018) && c21442M15873.size() == 1 && AbstractC13630.m31003(c21442M15873.m56524get(0).m50989())) {
            return ((C23018) abstractC6924).m51402() instanceof AbstractC7555;
        }
        return false;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo9226(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC13630.m31003(c21442M15873.m56524get(0).m50989()));
        return bitSet;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        long jMo4594 = ((AbstractC7555) ((C23018) abstractC12289).m51402()).mo4594();
        c19705.m44770(AbstractC13630.m31000(abstractC12289, c21442M15873.m56524get(0).m50989()));
        c19705.m44770((short) jMo4594);
        c19705.m44770((short) (jMo4594 >> 16));
        c19705.m44770((short) (jMo4594 >> 32));
        c19705.m44770((short) (jMo4594 >> 48));
    }
}
