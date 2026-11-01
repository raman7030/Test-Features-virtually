package p067l;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAJX */
/* JADX INFO: loaded from: classes2.dex */
public final class C9195 {

    /* JADX INFO: renamed from: ֫ */
    public final BitSet f24860;

    /* JADX INFO: renamed from: ֫ */
    public static void m21148(C21975 c21975) {
        BitSet bitSet;
        C20101 c20101M50990;
        C20101 c20101M50991;
        C9195 c9195 = new C9195(c21975);
        int iM49513 = c21975.m49513();
        int i = 0;
        while (true) {
            bitSet = c9195.f24860;
            if (i >= iM49513) {
                break;
            }
            AbstractC15938 abstractC15938M49521 = c21975.m49521(i);
            if (abstractC15938M49521 != null && abstractC15938M49521.m36175().mo7484() == 0) {
                bitSet.set(i);
            }
            i++;
        }
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            bitSet.clear(iNextSetBit);
            C15229 c15229 = (C15229) c21975.m49521(iNextSetBit);
            c15229.m34673(c21975);
            C21442 c21442Mo31600 = c15229.mo31600();
            int size = c21442Mo31600.size();
            int i2 = -1;
            C22783 c22783 = null;
            for (int i3 = 0; i3 < size; i3++) {
                C22783 c22783M56524get = c21442Mo31600.m56524get(i3);
                if (c22783M56524get.mo7484() != 0) {
                    i2 = i3;
                    c22783 = c22783M56524get;
                }
            }
            if (c22783 != null) {
                C20101 c20101M50992 = c22783.m50990();
                InterfaceC3830 type = c22783.getType();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (i4 != i2) {
                        C22783 c22783M56524get2 = c21442Mo31600.m56524get(i4);
                        if (c22783M56524get2.mo7484() != 0) {
                            z = z && (c20101M50992 == (c20101M50991 = c22783M56524get2.m50990()) || (c20101M50992 != null && c20101M50992.equals(c20101M50991)));
                            type = C24158.m53421(type, c22783M56524get2.getType());
                        }
                    }
                }
                if (type == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < size; i5++) {
                        sb.append(c21442Mo31600.m56524get(i5).toString());
                        sb.append(' ');
                    }
                    throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
                }
                C20101 c20101 = z ? c20101M50992 : null;
                C22783 c22783M36175 = c15229.m36175();
                if (c22783M36175.m50974() != type || (c20101 != (c20101M50990 = c22783M36175.m50990()) && (c20101 == null || !c20101.equals(c20101M50990)))) {
                    c15229.m36174(C22783.m50973(c15229.m36175().m50989(), type, c20101));
                    List listM49526 = c21975.m49526(iNextSetBit);
                    int size2 = listM49526.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        AbstractC15938 abstractC15938 = (AbstractC15938) listM49526.get(i6);
                        C22783 c22783M36176 = abstractC15938.m36175();
                        if (c22783M36176 != null && (abstractC15938 instanceof C15229)) {
                            bitSet.set(c22783M36176.m50989());
                        }
                    }
                }
            }
        }
    }

    public C9195(C21975 c21975) {
        this.f24860 = new BitSet(c21975.m49513());
    }
}
