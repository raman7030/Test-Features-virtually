package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.۬ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB9X */
/* JADX INFO: loaded from: classes4.dex */
public final class C14890 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C14890 f42467 = new C14890();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 2;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        return abstractC12289.m15873().m56524get(0).m50981() + ", " + abstractC12289.mo15872();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return abstractC12289.mo15868();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        C22783 c22783M56524get;
        if (!(abstractC6924 instanceof C23018)) {
            return false;
        }
        C21442 c21442M15873 = abstractC6924.m15873();
        int size = c21442M15873.size();
        if (size == 1) {
            c22783M56524get = c21442M15873.m56524get(0);
        } else {
            if (size != 2) {
                return false;
            }
            c22783M56524get = c21442M15873.m56524get(0);
            if (c22783M56524get.m50989() != c21442M15873.m56524get(1).m50989()) {
                return false;
            }
        }
        if (!AbstractC13630.m31003(c22783M56524get.m50989())) {
            return false;
        }
        C23018 c23018 = (C23018) abstractC6924;
        int iM51403 = c23018.m51403();
        AbstractC15405 abstractC15405M51402 = c23018.m51402();
        if (AbstractC13630.m31010(iM51403)) {
            return (abstractC15405M51402 instanceof C14260) || (abstractC15405M51402 instanceof C10908) || (abstractC15405M51402 instanceof C14930) || (abstractC15405M51402 instanceof C22978) || (abstractC15405M51402 instanceof C6884);
        }
        return false;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo9226(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        int size = c21442M15873.size();
        BitSet bitSet = new BitSet(size);
        boolean zM31003 = AbstractC13630.m31003(c21442M15873.m56524get(0).m50989());
        if (size == 1) {
            bitSet.set(0, zM31003);
            return bitSet;
        }
        if (c21442M15873.m56524get(0).m50989() == c21442M15873.m56524get(1).m50989()) {
            bitSet.set(0, zM31003);
            bitSet.set(1, zM31003);
        }
        return bitSet;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        AbstractC13630.m31001((InterfaceC7893) c19705, AbstractC13630.m31000(abstractC12289, abstractC12289.m15873().m56524get(0).m50989()), (short) ((C23018) abstractC12289).m51403());
    }
}
