package p067l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes.dex */
public final class C23277 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f73224;

    /* JADX INFO: renamed from: ۧ */
    public final C21975 f73225;

    /* JADX INFO: renamed from: ܽ */
    public final C21266 f73226;

    /* JADX INFO: renamed from: ᩳ */
    public final BitSet f73227;

    /* JADX INFO: renamed from: ֫ */
    public static C21266 m51830(C21975 c21975) {
        C23277 c23277;
        C23277 c23278;
        C23277 c23279 = new C23277(c21975);
        C21975 c21976 = c23279.f73225;
        int iM49513 = c21976.m49513();
        C21266 c21266 = c23279.f73226;
        if (iM49513 > 0) {
            int iM49525 = c21976.m49525();
            while (iM49525 >= 0) {
                BitSet bitSet = c23279.f73227;
                bitSet.clear(iM49525);
                C6689 c6689M48026 = c21266.m48026(iM49525);
                C17950 c17950 = (C17950) c23279.f73224.get(iM49525);
                ArrayList arrayListM40832 = c17950.m40832();
                int size = arrayListM40832.size();
                if (iM49525 == c21976.m49519()) {
                    c23277 = c23279;
                } else {
                    int i = size - 1;
                    AbstractC15938 abstractC15938 = (AbstractC15938) arrayListM40832.get(i);
                    boolean z = (abstractC15938.mo31607().mo5820().size() == 0 || abstractC15938.m36175() == null) ? false : true;
                    int i2 = 0;
                    C6689 c6689M15239 = c6689M48026;
                    while (i2 < size) {
                        if (z && i2 == i) {
                            c6689M15239.mo22326();
                            c6689M15239 = c6689M15239.m15239();
                        }
                        AbstractC15938 abstractC15939 = (AbstractC15938) arrayListM40832.get(i2);
                        C22783 c22783Mo31605 = abstractC15939.mo31605();
                        if (c22783Mo31605 == null) {
                            C22783 c22783M36175 = abstractC15939.m36175();
                            if (c22783M36175 != null && c6689M15239.get(c22783M36175.m50989()) != null) {
                                c6689M15239.m15247(c6689M15239.get(c22783M36175.m50989()));
                            }
                        } else {
                            C22783 c22783M50985 = c22783Mo31605.m50985();
                            c6689M15239.getClass();
                            if (!c22783M50985.equals(c6689M15239.get(c22783M50985.m50989()))) {
                                C22783 c22783M15241 = c6689M15239.m15241(c22783M50985.m50990());
                                if (c22783M15241 != null) {
                                    c23278 = c23279;
                                    if (c22783M15241.m50989() != c22783M50985.m50989()) {
                                        c6689M15239.m15247(c22783M15241);
                                    }
                                } else {
                                    c23278 = c23279;
                                }
                                c21266.m48024(abstractC15939, c22783M50985);
                                c6689M15239.m15246(c22783M50985);
                            }
                            i2++;
                            c23279 = c23278;
                        }
                        c23278 = c23279;
                        i2++;
                        c23279 = c23278;
                    }
                    c23277 = c23279;
                    c6689M15239.mo22326();
                    C22388 c22388M40820 = c17950.m40820();
                    int size2 = c22388M40820.size();
                    int iM40840 = c17950.m40840();
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c22388M40820.get(i3);
                        if (c21266.m48025(i4, i4 == iM40840 ? c6689M15239 : c6689M48026)) {
                            bitSet.set(i4);
                        }
                    }
                }
                iM49525 = bitSet.nextSetBit(0);
                c23279 = c23277;
            }
        }
        c21266.mo22326();
        return c21266;
    }

    public C23277(C21975 c21975) {
        ArrayList arrayListM49517 = c21975.m49517();
        this.f73225 = c21975;
        this.f73224 = arrayListM49517;
        this.f73226 = new C21266(c21975);
        this.f73227 = new BitSet(arrayListM49517.size());
    }
}
