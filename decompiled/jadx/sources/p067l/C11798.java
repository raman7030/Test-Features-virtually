package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۢ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BBQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11798 extends AbstractC13630 {

    /* JADX INFO: renamed from: ֫ */
    public static final C11798 f32953 = new C11798();

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final int mo9224() {
        return 4;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final String mo9225(AbstractC12289 abstractC12289) {
        return AbstractC13630.m31006(m27047(abstractC12289.m15873())) + ", " + abstractC12289.mo15872();
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
        if (c19585.m44497() != 2) {
            return false;
        }
        return AbstractC13630.m31010(c19585.m44500(0)) && AbstractC13630.m31010(c19585.m44500(1)) && (c19585.m44498(0) instanceof C23648) && (c19585.m44498(1) instanceof C6884) && m27046(c19585.m15873()) >= 0;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final BitSet mo9226(AbstractC6924 abstractC6924) {
        C21442 c21442M15873 = abstractC6924.m15873();
        int size = c21442M15873.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            C22783 c22783M56524get = c21442M15873.m56524get(i);
            bitSet.set(i, AbstractC13630.m31007((c22783M56524get.m50982() + c22783M56524get.m50989()) - 1));
        }
        return bitSet;
    }

    @Override // p067l.AbstractC13630
    /* JADX INFO: renamed from: ֫ */
    public final void mo9227(C19705 c19705, AbstractC12289 abstractC12289) {
        C19585 c19585 = (C19585) abstractC12289;
        short sM44500 = (short) c19585.m44500(0);
        short sM44501 = (short) c19585.m44500(1);
        C21442 c21442M27047 = m27047(abstractC12289.m15873());
        int size = c21442M27047.size();
        int iM50989 = size > 0 ? c21442M27047.m56524get(0).m50989() : 0;
        int iM509810 = size > 1 ? c21442M27047.m56524get(1).m50989() : 0;
        int iM509811 = size > 2 ? c21442M27047.m56524get(2).m50989() : 0;
        int iM509812 = size > 3 ? c21442M27047.m56524get(3).m50989() : 0;
        short sM31000 = AbstractC13630.m31000(abstractC12289, AbstractC13630.m31005(size > 4 ? c21442M27047.m56524get(4).m50989() : 0, size));
        short sM30999 = AbstractC13630.m30999(iM50989, iM509810, iM509811, iM509812);
        c19705.m44770(sM31000);
        c19705.m44770(sM44500);
        c19705.m44770(sM30999);
        c19705.m44770(sM44501);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m27046(C21442 c21442) {
        int size = c21442.size();
        if (size > 5) {
            return -1;
        }
        int iM50982 = 0;
        for (int i = 0; i < size; i++) {
            C22783 c22783M56524get = c21442.m56524get(i);
            iM50982 += c22783M56524get.m50982();
            if (!AbstractC13630.m31007((c22783M56524get.m50982() + c22783M56524get.m50989()) - 1)) {
                return -1;
            }
        }
        if (iM50982 <= 5) {
            return iM50982;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C21442 m27047(C21442 c21442) {
        int iM27046 = m27046(c21442);
        int size = c21442.size();
        if (iM27046 == size) {
            return c21442;
        }
        C21442 c21443 = new C21442(iM27046);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C22783 c22783M56524get = c21442.m56524get(i2);
            c21443.m43248(i, c22783M56524get);
            if (c22783M56524get.m50982() == 2) {
                c21443.m43248(i + 1, C22783.m50968(c22783M56524get.m50989() + 1, C9566.f26318));
                i += 2;
            } else {
                i++;
            }
        }
        c21443.mo22326();
        return c21443;
    }
}
