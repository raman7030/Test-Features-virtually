package p067l;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBA0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6552 {

    /* JADX INFO: renamed from: ֫ */
    public C17950 f16904;

    /* JADX INFO: renamed from: ۜ */
    public final BitSet f16905;

    /* JADX INFO: renamed from: ۧ */
    public final C23316 f16906;

    /* JADX INFO: renamed from: ܳ */
    public final C21975 f16907;

    /* JADX INFO: renamed from: ܽ */
    public final BitSet f16908;

    /* JADX INFO: renamed from: ܿ */
    public final int f16909;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC21305 f16910;

    /* JADX INFO: renamed from: ᩻ */
    public int f16911;

    /* JADX INFO: renamed from: ֫ */
    public static C23316 m14990(C21975 c21975) {
        int iM49513 = c21975.m49513();
        C23316 c23316 = new C23316(iM49513);
        for (int i = 0; i < iM49513; i++) {
            C6552 c6552 = new C6552(c21975, i, c23316);
            C21975 c21976 = c6552.f16907;
            int i2 = c6552.f16909;
            for (AbstractC15938 abstractC15938 : c21976.m49526(i2)) {
                c6552.f16910 = EnumC21305.DONE;
                if (abstractC15938 instanceof C15229) {
                    Iterator it = ((C15229) abstractC15938).m34672(i2, c21976).iterator();
                    while (it.hasNext()) {
                        c6552.f16904 = (C17950) it.next();
                        c6552.f16910 = EnumC21305.LIVE_OUT_AT_BLOCK;
                        c6552.m14991();
                    }
                } else {
                    C17950 c17950M36177 = abstractC15938.m36177();
                    c6552.f16904 = c17950M36177;
                    int iIndexOf = c17950M36177.m40832().indexOf(abstractC15938);
                    c6552.f16911 = iIndexOf;
                    if (iIndexOf < 0) {
                        throw new RuntimeException("insn not found in it's own block");
                    }
                    c6552.f16910 = EnumC21305.LIVE_IN_AT_STATEMENT;
                    c6552.m14991();
                }
            }
            while (true) {
                BitSet bitSet = c6552.f16908;
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    c6552.f16904 = (C17950) c21976.m49517().get(iNextSetBit);
                    bitSet.clear(iNextSetBit);
                    c6552.f16910 = EnumC21305.LIVE_OUT_AT_BLOCK;
                    c6552.m14991();
                }
            }
        }
        Iterator it2 = c21975.m49517().iterator();
        while (it2.hasNext()) {
            List listM40830 = ((C17950) it2.next()).m40830();
            int size = listM40830.size();
            for (int i3 = 0; i3 < size; i3++) {
                for (int i4 = 0; i4 < size; i4++) {
                    if (i3 != i4) {
                        AbstractC15938 abstractC15939 = (AbstractC15938) listM40830.get(i3);
                        AbstractC15938 abstractC159310 = (AbstractC15938) listM40830.get(i4);
                        C22783 c22783M36175 = abstractC15939.m36175();
                        C21442 c21442Mo31600 = abstractC159310.mo31600();
                        int iM50989 = c22783M36175.m50989();
                        for (int i5 = 0; i5 < c21442Mo31600.size(); i5++) {
                            c23316.m51924(iM50989, c21442Mo31600.m56524get(i5).m50989());
                        }
                        C22783 c22783M36176 = abstractC159310.m36175();
                        C21442 c21442Mo31601 = abstractC15939.mo31600();
                        int iM509810 = c22783M36176.m50989();
                        for (int i6 = 0; i6 < c21442Mo31601.size(); i6++) {
                            c23316.m51924(iM509810, c21442Mo31601.m56524get(i6).m50989());
                        }
                        c23316.m51924(abstractC15939.m36175().m50989(), abstractC159310.m36175().m50989());
                    }
                }
            }
        }
        return c23316;
    }

    public C6552(C21975 c21975, int i, C23316 c23316) {
        int size = c21975.m49517().size();
        this.f16907 = c21975;
        this.f16909 = i;
        this.f16905 = new BitSet(size);
        this.f16908 = new BitSet(size);
        this.f16906 = c23316;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14991() {
        while (true) {
            EnumC21305 enumC21305 = this.f16910;
            EnumC21305 enumC21306 = EnumC21305.DONE;
            if (enumC21305 == enumC21306) {
                return;
            }
            int iOrdinal = enumC21305.ordinal();
            int i = this.f16909;
            if (iOrdinal == 0) {
                this.f16910 = enumC21306;
                int i2 = this.f16911;
                if (i2 == 0) {
                    this.f16904.m40812(i);
                    this.f16908.or(this.f16904.m40841());
                } else {
                    this.f16911 = i2 - 1;
                    this.f16910 = EnumC21305.LIVE_OUT_AT_STATEMENT;
                }
            } else if (iOrdinal == 1) {
                this.f16910 = enumC21306;
                AbstractC15938 abstractC15938 = (AbstractC15938) this.f16904.m40832().get(this.f16911);
                C22783 c22783M36175 = abstractC15938.m36175();
                if (!abstractC15938.m36176(i)) {
                    if (c22783M36175 != null) {
                        this.f16906.m51924(i, c22783M36175.m50989());
                    }
                    this.f16910 = EnumC21305.LIVE_IN_AT_STATEMENT;
                }
            } else if (iOrdinal == 2) {
                this.f16910 = enumC21306;
                int iM40826 = this.f16904.m40826();
                BitSet bitSet = this.f16905;
                if (!bitSet.get(iM40826)) {
                    bitSet.set(this.f16904.m40826());
                    this.f16904.m40827(i);
                    this.f16911 = this.f16904.m40832().size() - 1;
                    this.f16910 = EnumC21305.LIVE_OUT_AT_STATEMENT;
                }
            }
        }
    }
}
