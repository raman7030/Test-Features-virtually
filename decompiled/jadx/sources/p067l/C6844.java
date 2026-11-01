package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۙܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBG6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6844 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C6844 f17783 = new C6844();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 1;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final String mo9228(AbstractC12289 abstractC12289) {
        return "";
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        int size = c21442M15873.size();
        return c21442M15873.m56524get(size - 2).m50981() + ", " + c21442M15873.m56524get(size - 1).m50981();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9229(AbstractC6924 abstractC6924) {
        C22783 c22783M56524get;
        C22783 c22783M56524get2;
        if (!(abstractC6924 instanceof C20256)) {
            return false;
        }
        C21442 c21442M15873 = abstractC6924.m15873();
        int size = c21442M15873.size();
        if (size == 2) {
            c22783M56524get = c21442M15873.m56524get(0);
            c22783M56524get2 = c21442M15873.m56524get(1);
        } else {
            if (size != 3) {
                return false;
            }
            c22783M56524get = c21442M15873.m56524get(1);
            c22783M56524get2 = c21442M15873.m56524get(2);
            if (c22783M56524get.m50989() != c21442M15873.m56524get(0).m50989()) {
                return false;
            }
        }
        return AbstractC13630.m31007(c22783M56524get.m50989()) && AbstractC13630.m31007(c22783M56524get2.m50989());
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo9226(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        BitSet bitSet = new BitSet(2);
        int iM50989 = c21442M15873.m56524get(0).m50989();
        int iM509810 = c21442M15873.m56524get(1).m50989();
        int size = c21442M15873.size();
        if (size == 2) {
            bitSet.set(0, AbstractC13630.m31007(iM50989));
            bitSet.set(1, AbstractC13630.m31007(iM509810));
            return bitSet;
        }
        if (size == 3) {
            if (iM50989 != iM509810) {
                bitSet.set(0, false);
                bitSet.set(1, false);
            } else {
                boolean zM31007 = AbstractC13630.m31007(iM509810);
                bitSet.set(0, zM31007);
                bitSet.set(1, zM31007);
            }
            bitSet.set(2, AbstractC13630.m31007(c21442M15873.m56524get(2).m50989()));
            return bitSet;
        }
        throw new AssertionError();
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        C21442 c21442M15873 = abstractC12289.m15873();
        int size = c21442M15873.size();
        c19705.m44770(AbstractC13630.m31000(abstractC12289, AbstractC13630.m31005(c21442M15873.m56524get(size - 2).m50989(), c21442M15873.m56524get(size - 1).m50989())));
    }
}
