package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.᩷ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21975 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f69042 = false;

    /* JADX INFO: renamed from: ۜ */
    public final int f69043;

    /* JADX INFO: renamed from: ۡ */
    public List[] f69044;

    /* JADX INFO: renamed from: ۢ */
    public int f69045;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f69046;

    /* JADX INFO: renamed from: ܳ */
    public int f69047;

    /* JADX INFO: renamed from: ܺ */
    public ArrayList[] f69048;

    /* JADX INFO: renamed from: ܽ */
    public int f69049;

    /* JADX INFO: renamed from: ܿ */
    public int f69050;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15938[] f69051;

    /* JADX INFO: renamed from: ᩷ */
    public int f69052;

    /* JADX INFO: renamed from: ᩻ */
    public int f69053;

    /* JADX INFO: renamed from: ֫ */
    public static C21975 m49495(C14735 c14735, int i) {
        C21975 c21975 = new C21975(c14735, i);
        int size = c14735.m33676().size();
        c21975.f69046 = new ArrayList(size + 2);
        for (int i2 = 0; i2 < size; i2++) {
            c21975.f69046.add(C17950.m40807(c14735, i2, c21975));
        }
        c21975.f69050 = ((C17950) c21975.f69046.get(c14735.m33676().m40219(c14735.m33678()))).m40838().m40826();
        c21975.f69047 = -1;
        return c21975;
    }

    public C21975(C14735 c14735, int i) {
        this.f69043 = i;
        this.f69053 = c14735.m33676().m40215();
        int iM42785 = c14735.m33676().m42785();
        this.f69052 = iM42785;
        this.f69045 = iM42785;
    }

    /* JADX INFO: renamed from: ֫ */
    public static BitSet m49494(C18759 c18759, C22388 c22388) {
        BitSet bitSet = new BitSet(c18759.size());
        int size = c22388.size();
        for (int i = 0; i < size; i++) {
            bitSet.set(c18759.m40219(c22388.get(i)));
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m49515() {
        if (this.f69047 >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        int size = this.f69046.size();
        this.f69047 = size;
        int i = this.f69053;
        this.f69053 = i + 1;
        C17950 c17950 = new C17950(size, i, this);
        this.f69046.add(c17950);
        Iterator it = this.f69046.iterator();
        while (it.hasNext()) {
            ((C17950) it.next()).m40829(c17950);
        }
        if (c17950.m40841().cardinality() == 0) {
            this.f69046.remove(this.f69047);
            this.f69047 = -1;
            this.f69053--;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final C17950 m49514() {
        int size = this.f69046.size();
        int i = this.f69053;
        this.f69053 = i + 1;
        C17950 c17950 = new C17950(size, i, this);
        c17950.m40832().add(new C13889(new C3336(C14065.f39817, C12054.f33582, (C22783) null, C21442.f67643), c17950));
        this.f69046.add(c17950);
        return c17950;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m49525() {
        return this.f69050;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17950 m49522() {
        return (C17950) this.f69046.get(this.f69050);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m49519() {
        return this.f69047;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C17950 m49523() {
        int i = this.f69047;
        if (i < 0) {
            return null;
        }
        return (C17950) this.f69046.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49500(int i) {
        if (i < 0) {
            return -1;
        }
        return ((C17950) this.f69046.get(i)).m40824();
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m49513() {
        return this.f69052;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m49529() {
        return this.f69043;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49516(int i) {
        int i2 = this.f69045;
        int i3 = this.f69049;
        int i4 = i2 + i3;
        this.f69049 = i3 + i;
        this.f69052 = Math.max(this.f69052, i + i4);
        return i4;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m49512() {
        this.f69049 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49508(C17911 c17911) {
        Iterator it = this.f69046.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C17950) it.next()).m40832().iterator();
            while (it2.hasNext()) {
                ((AbstractC15938) it2.next()).m36172(c17911);
            }
        }
        int iM40717 = c17911.m40717();
        this.f69052 = iM40717;
        this.f69045 = iM40717;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m49517() {
        return this.f69046;
    }

    /* JADX INFO: renamed from: ֫ */
    public final BitSet m49501() {
        int size = this.f69046.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(m49522().m40826());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit == -1) {
                return bitSet2;
            }
            bitSet2.set(iNextSetBit);
            bitSet.or(((C17950) this.f69046.get(iNextSetBit)).m40821());
            bitSet.andNot(bitSet2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15938 m49521(int i) {
        if (this.f69042) {
            throw new RuntimeException("No def list in back mode");
        }
        AbstractC15938[] abstractC15938Arr = this.f69051;
        if (abstractC15938Arr != null) {
            return abstractC15938Arr[i];
        }
        this.f69051 = new AbstractC15938[this.f69052];
        m49509(new C24656(this));
        return this.f69051[i];
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m49499() {
        if (this.f69042) {
            throw new RuntimeException("No use list in back mode");
        }
        this.f69048 = new ArrayList[this.f69052];
        for (int i = 0; i < this.f69052; i++) {
            this.f69048[i] = new ArrayList();
        }
        m49509(new C8563(this));
        this.f69044 = new List[this.f69052];
        for (int i2 = 0; i2 < this.f69052; i2++) {
            this.f69044[i2] = C21562.unmodifiableList(this.f69048[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49507(AbstractC15938 abstractC15938, C22783 c22783, C22783 c22784) {
        if (this.f69048 == null) {
            return;
        }
        if (c22783 != null) {
            this.f69048[c22783.m50989()].remove(abstractC15938);
        }
        int iM50989 = c22784.m50989();
        ArrayList[] arrayListArr = this.f69048;
        if (arrayListArr.length <= iM50989) {
            this.f69048 = null;
        } else {
            arrayListArr[iM50989].add(abstractC15938);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49504(C13889 c13889, C21442 c21442) {
        if (this.f69048 == null) {
            return;
        }
        if (c21442 != null) {
            m49496((AbstractC15938) c13889, c21442);
        }
        C21442 c21442Mo31600 = c13889.mo31600();
        int size = c21442Mo31600.size();
        for (int i = 0; i < size; i++) {
            this.f69048[c21442Mo31600.m56524get(i).m50989()].add(c13889);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49496(AbstractC15938 abstractC15938, C21442 c21442) {
        if (c21442 == null) {
            return;
        }
        int size = c21442.size();
        for (int i = 0; i < size; i++) {
            if (!this.f69048[c21442.m56524get(i).m50989()].remove(abstractC15938)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49505(AbstractC15938 abstractC15938) {
        if (this.f69048 != null) {
            m49496(abstractC15938, abstractC15938.mo31600());
        }
        C22783 c22783M36175 = abstractC15938.m36175();
        AbstractC15938[] abstractC15938Arr = this.f69051;
        if (abstractC15938Arr == null || c22783M36175 == null) {
            return;
        }
        abstractC15938Arr[c22783M36175.m50989()] = null;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m49511() {
        this.f69051 = null;
        this.f69048 = null;
        this.f69044 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49506(AbstractC15938 abstractC15938, C22783 c22783) {
        if (this.f69051 == null) {
            return;
        }
        if (c22783 != null) {
            this.f69051[c22783.m50989()] = null;
        }
        C22783 c22783M36175 = abstractC15938.m36175();
        if (c22783M36175 != null) {
            int iM50989 = c22783M36175.m50989();
            AbstractC15938[] abstractC15938Arr = this.f69051;
            if (abstractC15938Arr[iM50989] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            abstractC15938Arr[c22783M36175.m50989()] = abstractC15938;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final List m49526(int i) {
        if (this.f69044 == null) {
            m49499();
        }
        return this.f69044[i];
    }

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList[] m49528() {
        if (this.f69048 == null) {
            m49499();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f69052];
        for (int i = 0; i < this.f69052; i++) {
            arrayListArr[i] = new ArrayList(this.f69048[i]);
        }
        return arrayListArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49510(C22783 c22783) {
        AbstractC15938 abstractC15938M49521 = m49521(c22783.m50989());
        if (abstractC15938M49521 == null) {
            return false;
        }
        if (abstractC15938M49521.mo31605() != null) {
            return true;
        }
        Iterator it = m49526(c22783.m50989()).iterator();
        while (it.hasNext()) {
            AbstractC17417 abstractC17417Mo31607 = ((AbstractC15938) it.next()).mo31607();
            if (abstractC17417Mo31607 != null && abstractC17417Mo31607.m39656().m11605() == 54) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m49524(int i) {
        this.f69052 = i;
        this.f69045 = i;
        m49511();
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m49520() {
        int i = this.f69052;
        int i2 = i + 1;
        this.f69052 = i2;
        this.f69045 = i2;
        m49511();
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49509(InterfaceC18621 interfaceC18621) {
        Iterator it = this.f69046.iterator();
        while (it.hasNext()) {
            ((C17950) it.next()).m40816(interfaceC18621);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49503(InterfaceC12587 interfaceC12587) {
        BitSet bitSet = new BitSet(this.f69046.size());
        Stack stack = new Stack();
        C17950 c17950M49522 = m49522();
        if (c17950M49522 == null) {
            return;
        }
        stack.add(null);
        stack.add(c17950M49522);
        while (stack.size() > 0) {
            C17950 c17950 = (C17950) stack.pop();
            C17950 c17951 = (C17950) stack.pop();
            if (!bitSet.get(c17950.m40826())) {
                BitSet bitSetM40821 = c17950.m40821();
                for (int iNextSetBit = bitSetM40821.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM40821.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c17950);
                    stack.add((C17950) this.f69046.get(iNextSetBit));
                }
                bitSet.set(c17950.m40826());
                interfaceC12587.mo26104(c17950, c17951);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49518(InterfaceC12587 interfaceC12587) {
        BitSet bitSet = new BitSet(this.f69046.size());
        Stack stack = new Stack();
        stack.add(m49522());
        while (stack.size() > 0) {
            C17950 c17950 = (C17950) stack.pop();
            ArrayList arrayListM40811 = c17950.m40811();
            if (!bitSet.get(c17950.m40826())) {
                int size = arrayListM40811.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        stack.add((C17950) arrayListM40811.get(size));
                    }
                }
                bitSet.set(c17950.m40826());
                interfaceC12587.mo26104(c17950, null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49502(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC15938 abstractC15938 = (AbstractC15938) it.next();
            C17950 c17950M36177 = abstractC15938.m36177();
            ArrayList arrayListM40832 = c17950M36177.m40832();
            for (int size = arrayListM40832.size() - 1; size >= 0; size--) {
                AbstractC15938 abstractC15939 = (AbstractC15938) arrayListM40832.get(size);
                if (abstractC15938 == abstractC15939) {
                    m49505(abstractC15939);
                    arrayListM40832.remove(size);
                    break;
                }
            }
            int size2 = arrayListM40832.size();
            AbstractC15938 abstractC159310 = size2 == 0 ? null : (AbstractC15938) arrayListM40832.get(size2 - 1);
            if (c17950M36177 != m49523() && (size2 == 0 || abstractC159310.mo31607() == null || abstractC159310.mo31607().m39656().m11601() == 1)) {
                arrayListM40832.add(new C13889(new C3336(C14065.f39817, C12054.f33582, (C22783) null, C21442.f67643), c17950M36177));
                BitSet bitSetM40821 = c17950M36177.m40821();
                for (int iNextSetBit = bitSetM40821.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM40821.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c17950M36177.m40840()) {
                        c17950M36177.m40837(iNextSetBit);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m49527() {
        this.f69042 = true;
        this.f69048 = null;
        this.f69051 = null;
    }
}
