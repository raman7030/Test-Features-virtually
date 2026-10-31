package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBHL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16395 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BitSet f50434;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20630 f50435;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f50436;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f50438;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC9775 f50442;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9775 f50443;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public BitSet f50444;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f50437 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50445 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50439 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50441 = new ArrayList();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21064 f50440 = new C21064();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f50433 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38597(AbstractC15834 abstractC15834) {
        C12122 c12122 = new C12122(abstractC15834, this);
        this.f50441.add(m38589(), c12122);
        C20630 c20630 = this.f50435;
        c20630.m47177(c12122, (C20069) null);
        c20630.m47179(c12122, (C21480) null);
    }

    public C16395(int i, int i2, C20630 c20630) {
        this.f50435 = c20630;
        this.f50438 = i;
        this.f50436 = i2;
        this.f50444 = new BitSet(c20630.m47190().size());
        this.f50434 = new BitSet(c20630.m47190().size());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16395 m38590(C13012 c13012, int i, C20630 c20630) {
        C17246 c17246M31591 = c13012.m31591();
        C16540 c16540M41002get = c17246M31591.m41002get(i);
        C16395 c16395 = new C16395(i, c16540M41002get.mo2269(), c20630);
        C2430 c2430M38916 = c16540M41002get.m38916();
        int size = c2430M38916.size();
        ArrayList arrayList = c16395.f50441;
        arrayList.ensureCapacity(size);
        int size2 = c2430M38916.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new C12122(c2430M38916.m41001get(i2), c16395));
        }
        c16395.f50444 = C20630.m47167(c17246M31591, c13012.m31592(c16540M41002get.mo2269()));
        c16395.f50434 = C20630.m47167(c17246M31591, c16540M41002get.m38911());
        C21064 c21064M38911 = c16540M41002get.m38911();
        C21064 c21064 = new C21064(c21064M38911.size());
        int size3 = c21064M38911.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c21064.add(c17246M31591.m38027(c21064M38911.get(i3)));
        }
        c16395.f50440 = c21064;
        if (c21064.size() != 0) {
            int iM38913 = c16540M41002get.m38913();
            c16395.f50437 = iM38913 < 0 ? -1 : c17246M31591.m38027(iM38913);
        }
        return c16395;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38598(C16395 c16395) {
        this.f50433.add(c16395);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m38594() {
        return this.f50433;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38617(int i) {
        this.f50441.add(0, new C13532(i, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38600(C21480 c21480) {
        this.f50441.add(0, new C13532(c21480, this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38611(AbstractC15834 abstractC15834) {
        if (abstractC15834.m37484().m9558() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        ArrayList arrayList = this.f50441;
        AbstractC14278 abstractC14278 = (AbstractC14278) C18566.m43105(arrayList, 1);
        C12122 c12122 = new C12122(abstractC15834, this);
        arrayList.set(arrayList.size() - 1, c12122);
        C20630 c20630 = this.f50435;
        c20630.m47178(abstractC14278);
        c20630.m47177(c12122, (C20069) null);
        c20630.m47179(c12122, (C21480) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38602(InterfaceC22705 interfaceC22705) {
        ArrayList arrayList = this.f50441;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC14278 abstractC14278 = (AbstractC14278) arrayList.get(i);
            if (!(abstractC14278 instanceof C13532)) {
                return;
            }
            interfaceC22705.mo22398((C13532) abstractC14278);
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m38593() {
        this.f50441.subList(0, m38589()).clear();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m38589() {
        ArrayList arrayList = this.f50441;
        int size = arrayList.size();
        int i = 0;
        while (i < size && (((AbstractC14278) arrayList.get(i)) instanceof C13532)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m38615() {
        return this.f50441;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m38613() {
        return this.f50441.subList(0, m38589());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38609() {
        return this.f50438;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m38607() {
        return this.f50436;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final BitSet m38624() {
        return this.f50444;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BitSet m38604() {
        return this.f50434;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21064 m38603() {
        return this.f50440;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m38623() {
        return this.f50437;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m38608() {
        return this.f50435.m47173(this.f50437);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16395 m38606() {
        if (this.f50437 < 0) {
            return null;
        }
        return (C16395) this.f50435.m47190().get(this.f50437);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21064 m38614() {
        C21064 c21064 = new C21064(this.f50440.size());
        int size = this.f50440.size();
        for (int i = 0; i < size; i++) {
            c21064.add(this.f50435.m47173(this.f50440.get(i)));
        }
        return c21064;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20630 m38618() {
        return this.f50435;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C16395 m38621() {
        C20630 c20630 = this.f50435;
        C16395 c16395M47187 = c20630.m47187();
        c16395M47187.f50444 = this.f50444;
        BitSet bitSet = c16395M47187.f50434;
        int i = this.f50438;
        bitSet.set(i);
        c16395M47187.f50440.add(i);
        c16395M47187.f50437 = i;
        BitSet bitSet2 = new BitSet(c20630.m47190().size());
        this.f50444 = bitSet2;
        int i2 = c16395M47187.f50438;
        bitSet2.set(i2);
        for (int iNextSetBit = c16395M47187.f50444.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c16395M47187.f50444.nextSetBit(iNextSetBit + 1)) {
            ((C16395) c20630.m47190().get(iNextSetBit)).m38596(i, i2);
        }
        return c16395M47187;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16395 m38616(C16395 c16395) {
        C16395 c16395M47187 = this.f50435.m47187();
        int i = c16395M47187.f50438;
        BitSet bitSet = this.f50434;
        int i2 = c16395.f50438;
        int i3 = c16395.f50438;
        if (!bitSet.get(i2)) {
            throw new RuntimeException("Block " + C14712.m35006(c16395.f50436) + " not successor of " + C14712.m35006(this.f50436));
        }
        BitSet bitSet2 = c16395M47187.f50444;
        int i4 = this.f50438;
        bitSet2.set(i4);
        c16395M47187.f50434.set(i3);
        c16395M47187.f50440.add(i3);
        c16395M47187.f50437 = i3;
        int size = this.f50440.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f50440.get(size) == i3) {
                this.f50440.set(size, i);
            }
        }
        if (this.f50437 == i3) {
            this.f50437 = i;
        }
        this.f50434.clear(i3);
        this.f50434.set(i);
        c16395.f50444.set(i);
        c16395.f50444.set(i4, this.f50434.get(i3));
        return c16395M47187;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38596(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.f50434.set(i2);
        if (this.f50437 == i) {
            this.f50437 = i2;
        }
        int size = this.f50440.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.f50440.get(size) == i) {
                    this.f50440.set(size, i2);
                }
            } else {
                this.f50434.clear(i);
                C20630 c20630 = this.f50435;
                BitSet bitSet = ((C16395) c20630.m47190().get(i2)).f50444;
                int i3 = this.f50438;
                bitSet.set(i3);
                ((C16395) c20630.m47190().get(i)).f50444.clear(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38620(int i) {
        int i2 = 0;
        for (int size = this.f50440.size() - 1; size >= 0; size--) {
            if (this.f50440.get(size) == i) {
                i2 = size;
            } else {
                this.f50437 = this.f50440.get(size);
            }
        }
        this.f50440.m47915(i2);
        this.f50434.clear(i);
        ((C16395) this.f50435.m47190().get(i)).f50444.clear(this.f50438);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38612(C16395 c16395) {
        if (this != c16395 && this.f50440.size() == 0) {
            BitSet bitSet = this.f50434;
            int i = c16395.f50438;
            bitSet.set(i);
            this.f50440.add(i);
            this.f50437 = i;
            c16395.f50444.set(this.f50438);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38601(C21480 c21480, C21480 c21481) {
        if (this.f50434.cardinality() > 1) {
            throw new IllegalStateException("Inserting a move to a block with multiple successors");
        }
        if (c21480.m48652() == c21481.m48652()) {
            return;
        }
        ArrayList arrayList = this.f50441;
        C12122 c12122 = (C12122) C18566.m43105(arrayList, 1);
        if (c12122.m34042() == null && c12122.mo29535().size() <= 0) {
            arrayList.add(arrayList.size() - 1, new C12122(new C1018(C12307.m29860(c21480.getType()), C10191.f30620, c21480, C20069.m46252(c21481)), this));
            this.f50445++;
            return;
        }
        int iNextSetBit = this.f50434.nextSetBit(0);
        while (iNextSetBit >= 0) {
            C16395 c16395 = (C16395) this.f50435.m47190().get(iNextSetBit);
            c16395.getClass();
            if (c21480.m48652() != c21481.m48652()) {
                c16395.f50441.add(c16395.m38589(), new C12122(new C1018(C12307.m29860(c21480.getType()), C10191.f30620, c21480, C20069.m46252(c21481)), c16395));
                c16395.f50439++;
            }
            iNextSetBit = this.f50434.nextSetBit(iNextSetBit + 1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38592(BitSet bitSet, C21480 c21480) {
        int iM48652 = c21480.m48652();
        return bitSet.get(iM48652) || (c21480.m48645() == 2 && bitSet.get(iM48652 + 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38591(List list) {
        AbstractC14278 abstractC14278;
        C20630 c20630 = this.f50435;
        BitSet bitSet = new BitSet(c20630.m47186());
        BitSet bitSet2 = new BitSet(c20630.m47186());
        int size = list.size();
        int i = 0;
        while (i < size) {
            for (int i2 = i; i2 < size; i2++) {
                C21480 c21480M41004get = ((AbstractC14278) list.get(i2)).mo29535().m41004get(0);
                bitSet.set(c21480M41004get.m48652());
                if (c21480M41004get.m48645() > 1) {
                    bitSet.set(c21480M41004get.m48652() + 1);
                }
                C21480 c21480M34042 = ((AbstractC14278) list.get(i2)).m34042();
                bitSet2.set(c21480M34042.m48652());
                if (c21480M34042.m48645() > 1) {
                    bitSet2.set(c21480M34042.m48652() + 1);
                }
            }
            int i3 = i;
            int i4 = i3;
            while (i3 < size) {
                if (!m38592(bitSet, ((AbstractC14278) list.get(i3)).m34042())) {
                    Collections.swap(list, i3, i4);
                    i4++;
                }
                i3++;
            }
            if (i == i4) {
                int i5 = i4;
                while (true) {
                    if (i5 >= size) {
                        abstractC14278 = null;
                        break;
                    }
                    abstractC14278 = (AbstractC14278) list.get(i5);
                    if (m38592(bitSet, abstractC14278.m34042()) && m38592(bitSet2, abstractC14278.mo29535().m41004get(0))) {
                        Collections.swap(list, i4, i5);
                        break;
                    }
                    i5++;
                }
                C21480 c21480M34043 = abstractC14278.m34042();
                C21480 c21480M48646 = c21480M34043.m48646(c20630.m47189(c21480M34043.m48645()));
                C3135 c3135M29860 = C12307.m29860(c21480M34043.getType());
                C10191 c10191 = C10191.f30620;
                C12122 c12122 = new C12122(new C1018(c3135M29860, c10191, c21480M48646, abstractC14278.mo29535()), this);
                int i6 = i4 + 1;
                list.add(i4, c12122);
                list.set(i6, new C12122(new C1018(C12307.m29860(c21480M34043.getType()), c10191, c21480M34043, C20069.m46252(c21480M48646)), this));
                size = list.size();
                i = i6;
            } else {
                i = i4;
            }
            bitSet.clear();
            bitSet2.clear();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38610(int i) {
        InterfaceC9775 c4130;
        if (this.f50442 == null) {
            int iM47186 = this.f50435.m47186();
            if (iM47186 <= 3072) {
                c4130 = new C22746(iM47186);
            } else {
                c4130 = new C4130();
            }
            this.f50442 = c4130;
        }
        this.f50442.add(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38595(int i) {
        InterfaceC9775 c4130;
        if (this.f50443 == null) {
            int iM47186 = this.f50435.m47186();
            if (iM47186 <= 3072) {
                c4130 = new C22746(iM47186);
            } else {
                c4130 = new C4130();
            }
            this.f50443 = c4130;
        }
        this.f50443.add(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9775 m38619() {
        InterfaceC9775 c4130;
        if (this.f50442 == null) {
            int iM47186 = this.f50435.m47186();
            if (iM47186 <= 3072) {
                c4130 = new C22746(iM47186);
            } else {
                c4130 = new C4130();
            }
            this.f50442 = c4130;
        }
        return this.f50442;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m38622() {
        return this.f50438 == this.f50435.m47192();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m38605() {
        int i = this.f50439;
        ArrayList arrayList = this.f50441;
        if (i > 1) {
            m38591(arrayList.subList(0, i));
            if (((AbstractC14278) arrayList.get(this.f50439)).mo29530()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.f50445 > 1) {
            m38591(arrayList.subList((arrayList.size() - this.f50445) - 1, arrayList.size() - 1));
        }
        this.f50435.m47185();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38599(InterfaceC17101 interfaceC17101) {
        ArrayList arrayList = this.f50441;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC14278) arrayList.get(i)).mo29533(interfaceC17101);
        }
    }

    public final String toString() {
        return "{" + this.f50438 + ":" + C14712.m35006(this.f50436) + '}';
    }
}
