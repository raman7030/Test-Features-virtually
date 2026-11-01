package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBHL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17950 {

    /* JADX INFO: renamed from: ۖ */
    public BitSet f53606;

    /* JADX INFO: renamed from: ۜ */
    public final C21975 f53607;

    /* JADX INFO: renamed from: ۡ */
    public final int f53608;

    /* JADX INFO: renamed from: ۧ */
    public final int f53610;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC11659 f53614;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC11659 f53615;

    /* JADX INFO: renamed from: ᩷ */
    public BitSet f53616;

    /* JADX INFO: renamed from: ۢ */
    public int f53609 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public int f53617 = 0;

    /* JADX INFO: renamed from: ܳ */
    public int f53611 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f53613 = new ArrayList();

    /* JADX INFO: renamed from: ܺ */
    public C22388 f53612 = new C22388();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f53605 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m40814(AbstractC17417 abstractC17417) {
        C13889 c13889 = new C13889(abstractC17417, this);
        this.f53613.add(m40806(), c13889);
        C21975 c21975 = this.f53607;
        c21975.m49504(c13889, (C21442) null);
        c21975.m49506(c13889, (C22783) null);
    }

    public C17950(int i, int i2, C21975 c21975) {
        this.f53607 = c21975;
        this.f53610 = i;
        this.f53608 = i2;
        this.f53616 = new BitSet(c21975.m49517().size());
        this.f53606 = new BitSet(c21975.m49517().size());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17950 m40807(C14735 c14735, int i, C21975 c21975) {
        C18759 c18759M33676 = c14735.m33676();
        C18088 c18088M56522get = c18759M33676.m56522get(i);
        C17950 c17950 = new C17950(i, c18088M56522get.mo4636(), c21975);
        C4678 c4678M41142 = c18088M56522get.m41142();
        int size = c4678M41142.size();
        ArrayList arrayList = c17950.f53613;
        arrayList.ensureCapacity(size);
        int size2 = c4678M41142.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new C13889(c4678M41142.m56521get(i2), c17950));
        }
        c17950.f53616 = C21975.m49494(c18759M33676, c14735.m33677(c18088M56522get.mo4636()));
        c17950.f53606 = C21975.m49494(c18759M33676, c18088M56522get.m41137());
        C22388 c22388M41137 = c18088M56522get.m41137();
        C22388 c22388 = new C22388(c22388M41137.size());
        int size3 = c22388M41137.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c22388.add(c18759M33676.m40219(c22388M41137.get(i3)));
        }
        c17950.f53612 = c22388;
        if (c22388.size() != 0) {
            int iM41139 = c18088M56522get.m41139();
            c17950.f53609 = iM41139 < 0 ? -1 : c18759M33676.m40219(iM41139);
        }
        return c17950;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40815(C17950 c17950) {
        this.f53605.add(c17950);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m40811() {
        return this.f53605;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40834(int i) {
        this.f53613.add(0, new C15229(i, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40817(C22783 c22783) {
        this.f53613.add(0, new C15229(c22783, this));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40828(AbstractC17417 abstractC17417) {
        if (abstractC17417.m39656().m11601() == 1) {
            throw new IllegalArgumentException("last insn must branch");
        }
        ArrayList arrayList = this.f53613;
        AbstractC15938 abstractC15938 = (AbstractC15938) C20013.m45383(arrayList, 1);
        C13889 c13889 = new C13889(abstractC17417, this);
        arrayList.set(arrayList.size() - 1, c13889);
        C21975 c21975 = this.f53607;
        c21975.m49505(abstractC15938);
        c21975.m49504(c13889, (C21442) null);
        c21975.m49506(c13889, (C22783) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40819(InterfaceC23947 interfaceC23947) {
        ArrayList arrayList = this.f53613;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC15938 abstractC15938 = (AbstractC15938) arrayList.get(i);
            if (!(abstractC15938 instanceof C15229)) {
                return;
            }
            interfaceC23947.mo24367((C15229) abstractC15938);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m40810() {
        this.f53613.subList(0, m40806()).clear();
    }

    /* JADX INFO: renamed from: ֨ */
    private int m40806() {
        ArrayList arrayList = this.f53613;
        int size = arrayList.size();
        int i = 0;
        while (i < size && (((AbstractC15938) arrayList.get(i)) instanceof C15229)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m40832() {
        return this.f53613;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m40830() {
        return this.f53613.subList(0, m40806());
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40826() {
        return this.f53610;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m40824() {
        return this.f53608;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final BitSet m40841() {
        return this.f53616;
    }

    /* JADX INFO: renamed from: ۘ */
    public final BitSet m40821() {
        return this.f53606;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C22388 m40820() {
        return this.f53612;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m40840() {
        return this.f53609;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m40825() {
        return this.f53607.m49500(this.f53609);
    }

    /* JADX INFO: renamed from: ۜ */
    public final C17950 m40823() {
        if (this.f53609 < 0) {
            return null;
        }
        return (C17950) this.f53607.m49517().get(this.f53609);
    }

    /* JADX INFO: renamed from: ܺ */
    public final C22388 m40831() {
        C22388 c22388 = new C22388(this.f53612.size());
        int size = this.f53612.size();
        for (int i = 0; i < size; i++) {
            c22388.add(this.f53607.m49500(this.f53612.get(i)));
        }
        return c22388;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C21975 m40835() {
        return this.f53607;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C17950 m40838() {
        C21975 c21975 = this.f53607;
        C17950 c17950M49514 = c21975.m49514();
        c17950M49514.f53616 = this.f53616;
        BitSet bitSet = c17950M49514.f53606;
        int i = this.f53610;
        bitSet.set(i);
        c17950M49514.f53612.add(i);
        c17950M49514.f53609 = i;
        BitSet bitSet2 = new BitSet(c21975.m49517().size());
        this.f53616 = bitSet2;
        int i2 = c17950M49514.f53610;
        bitSet2.set(i2);
        for (int iNextSetBit = c17950M49514.f53616.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = c17950M49514.f53616.nextSetBit(iNextSetBit + 1)) {
            ((C17950) c21975.m49517().get(iNextSetBit)).m40813(i, i2);
        }
        return c17950M49514;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17950 m40833(C17950 c17950) {
        C17950 c17950M49514 = this.f53607.m49514();
        int i = c17950M49514.f53610;
        BitSet bitSet = this.f53606;
        int i2 = c17950.f53610;
        int i3 = c17950.f53610;
        if (!bitSet.get(i2)) {
            throw new RuntimeException("Block " + C16351.m37153(c17950.f53608) + " not successor of " + C16351.m37153(this.f53608));
        }
        BitSet bitSet2 = c17950M49514.f53616;
        int i4 = this.f53610;
        bitSet2.set(i4);
        c17950M49514.f53606.set(i3);
        c17950M49514.f53612.add(i3);
        c17950M49514.f53609 = i3;
        int size = this.f53612.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f53612.get(size) == i3) {
                this.f53612.set(size, i);
            }
        }
        if (this.f53609 == i3) {
            this.f53609 = i;
        }
        this.f53606.clear(i3);
        this.f53606.set(i);
        c17950.f53616.set(i);
        c17950.f53616.set(i4, this.f53606.get(i3));
        return c17950M49514;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40813(int i, int i2) {
        if (i == i2) {
            return;
        }
        this.f53606.set(i2);
        if (this.f53609 == i) {
            this.f53609 = i2;
        }
        int size = this.f53612.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.f53612.get(size) == i) {
                    this.f53612.set(size, i2);
                }
            } else {
                this.f53606.clear(i);
                C21975 c21975 = this.f53607;
                BitSet bitSet = ((C17950) c21975.m49517().get(i2)).f53616;
                int i3 = this.f53610;
                bitSet.set(i3);
                ((C17950) c21975.m49517().get(i)).f53616.clear(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40837(int i) {
        int i2 = 0;
        for (int size = this.f53612.size() - 1; size >= 0; size--) {
            if (this.f53612.get(size) == i) {
                i2 = size;
            } else {
                this.f53609 = this.f53612.get(size);
            }
        }
        this.f53612.m50245(i2);
        this.f53606.clear(i);
        ((C17950) this.f53607.m49517().get(i)).f53616.clear(this.f53610);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40829(C17950 c17950) {
        if (this != c17950 && this.f53612.size() == 0) {
            BitSet bitSet = this.f53606;
            int i = c17950.f53610;
            bitSet.set(i);
            this.f53612.add(i);
            this.f53609 = i;
            c17950.f53616.set(this.f53610);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40818(C22783 c22783, C22783 c22784) {
        if (this.f53606.cardinality() > 1) {
            throw new IllegalStateException("Inserting a move to a block with multiple successors");
        }
        if (c22783.m50989() == c22784.m50989()) {
            return;
        }
        ArrayList arrayList = this.f53613;
        C13889 c13889 = (C13889) C20013.m45383(arrayList, 1);
        if (c13889.m36175() == null && c13889.mo31600().size() <= 0) {
            arrayList.add(arrayList.size() - 1, new C13889(new C3336(C14065.m31920(c22783.getType()), C12054.f33582, c22783, C21442.m48568(c22784)), this));
            this.f53617++;
            return;
        }
        int iNextSetBit = this.f53606.nextSetBit(0);
        while (iNextSetBit >= 0) {
            C17950 c17950 = (C17950) this.f53607.m49517().get(iNextSetBit);
            c17950.getClass();
            if (c22783.m50989() != c22784.m50989()) {
                c17950.f53613.add(c17950.m40806(), new C13889(new C3336(C14065.m31920(c22783.getType()), C12054.f33582, c22783, C21442.m48568(c22784)), c17950));
                c17950.f53611++;
            }
            iNextSetBit = this.f53606.nextSetBit(iNextSetBit + 1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40809(BitSet bitSet, C22783 c22783) {
        int iM50989 = c22783.m50989();
        return bitSet.get(iM50989) || (c22783.m50982() == 2 && bitSet.get(iM50989 + 1));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40808(List list) {
        AbstractC15938 abstractC15938;
        C21975 c21975 = this.f53607;
        BitSet bitSet = new BitSet(c21975.m49513());
        BitSet bitSet2 = new BitSet(c21975.m49513());
        int size = list.size();
        int i = 0;
        while (i < size) {
            for (int i2 = i; i2 < size; i2++) {
                C22783 c22783M56524get = ((AbstractC15938) list.get(i2)).mo31600().m56524get(0);
                bitSet.set(c22783M56524get.m50989());
                if (c22783M56524get.m50982() > 1) {
                    bitSet.set(c22783M56524get.m50989() + 1);
                }
                C22783 c22783M36175 = ((AbstractC15938) list.get(i2)).m36175();
                bitSet2.set(c22783M36175.m50989());
                if (c22783M36175.m50982() > 1) {
                    bitSet2.set(c22783M36175.m50989() + 1);
                }
            }
            int i3 = i;
            int i4 = i3;
            while (i3 < size) {
                if (!m40809(bitSet, ((AbstractC15938) list.get(i3)).m36175())) {
                    Collections.swap(list, i3, i4);
                    i4++;
                }
                i3++;
            }
            if (i == i4) {
                int i5 = i4;
                while (true) {
                    if (i5 >= size) {
                        abstractC15938 = null;
                        break;
                    }
                    abstractC15938 = (AbstractC15938) list.get(i5);
                    if (m40809(bitSet, abstractC15938.m36175()) && m40809(bitSet2, abstractC15938.mo31600().m56524get(0))) {
                        Collections.swap(list, i4, i5);
                        break;
                    }
                    i5++;
                }
                C22783 c22783M36176 = abstractC15938.m36175();
                C22783 c22783M50983 = c22783M36176.m50983(c21975.m49516(c22783M36176.m50982()));
                C5348 c5348M31920 = C14065.m31920(c22783M36176.getType());
                C12054 c12054 = C12054.f33582;
                C13889 c13889 = new C13889(new C3336(c5348M31920, c12054, c22783M50983, abstractC15938.mo31600()), this);
                int i6 = i4 + 1;
                list.add(i4, c13889);
                list.set(i6, new C13889(new C3336(C14065.m31920(c22783M36176.getType()), c12054, c22783M36176, C21442.m48568(c22783M50983)), this));
                size = list.size();
                i = i6;
            } else {
                i = i4;
            }
            bitSet.clear();
            bitSet2.clear();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40827(int i) {
        InterfaceC11659 c6294;
        if (this.f53614 == null) {
            int iM49513 = this.f53607.m49513();
            if (iM49513 <= 3072) {
                c6294 = new C23986(iM49513);
            } else {
                c6294 = new C6294();
            }
            this.f53614 = c6294;
        }
        this.f53614.add(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40812(int i) {
        InterfaceC11659 c6294;
        if (this.f53615 == null) {
            int iM49513 = this.f53607.m49513();
            if (iM49513 <= 3072) {
                c6294 = new C23986(iM49513);
            } else {
                c6294 = new C6294();
            }
            this.f53615 = c6294;
        }
        this.f53615.add(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11659 m40836() {
        InterfaceC11659 c6294;
        if (this.f53614 == null) {
            int iM49513 = this.f53607.m49513();
            if (iM49513 <= 3072) {
                c6294 = new C23986(iM49513);
            } else {
                c6294 = new C6294();
            }
            this.f53614 = c6294;
        }
        return this.f53614;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m40839() {
        return this.f53610 == this.f53607.m49519();
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m40822() {
        int i = this.f53611;
        ArrayList arrayList = this.f53613;
        if (i > 1) {
            m40808(arrayList.subList(0, i));
            if (((AbstractC15938) arrayList.get(this.f53611)).mo31595()) {
                throw new RuntimeException("Unexpected: moves from phis before move-exception");
            }
        }
        if (this.f53617 > 1) {
            m40808(arrayList.subList((arrayList.size() - this.f53617) - 1, arrayList.size() - 1));
        }
        this.f53607.m49512();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40816(InterfaceC18621 interfaceC18621) {
        ArrayList arrayList = this.f53613;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC15938) arrayList.get(i)).mo31598(interfaceC18621);
        }
    }

    public final String toString() {
        return "{" + this.f53610 + ":" + C16351.m37153(this.f53608) + '}';
    }
}
