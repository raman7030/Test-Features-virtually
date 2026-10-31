package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.᩷ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20630 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f66361 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f66362;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List[] f66363;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f66364;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f66365;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f66366;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f66367;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f66368;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f66369;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC14278[] f66370;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f66371;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f66372;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20630 m47168(C13012 c13012, int i) {
        C20630 c20630 = new C20630(c13012, i);
        int size = c13012.m31591().size();
        c20630.f66365 = new ArrayList(size + 2);
        for (int i2 = 0; i2 < size; i2++) {
            c20630.f66365.add(C16395.m38590(c13012, i2, c20630));
        }
        c20630.f66369 = ((C16395) c20630.f66365.get(c13012.m31591().m38027(c13012.m31593()))).m38621().m38609();
        c20630.f66366 = -1;
        return c20630;
    }

    public C20630(C13012 c13012, int i) {
        this.f66362 = i;
        this.f66372 = c13012.m31591().m38023();
        int iM40536 = c13012.m31591().m40536();
        this.f66371 = iM40536;
        this.f66364 = iM40536;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BitSet m47167(C17246 c17246, C21064 c21064) {
        BitSet bitSet = new BitSet(c17246.size());
        int size = c21064.size();
        for (int i = 0; i < size; i++) {
            bitSet.set(c17246.m38027(c21064.get(i)));
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m47188() {
        if (this.f66366 >= 0) {
            throw new RuntimeException("must be called at most once");
        }
        int size = this.f66365.size();
        this.f66366 = size;
        int i = this.f66372;
        this.f66372 = i + 1;
        C16395 c16395 = new C16395(size, i, this);
        this.f66365.add(c16395);
        Iterator it = this.f66365.iterator();
        while (it.hasNext()) {
            ((C16395) it.next()).m38612(c16395);
        }
        if (c16395.m38624().cardinality() == 0) {
            this.f66365.remove(this.f66366);
            this.f66366 = -1;
            this.f66372--;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16395 m47187() {
        int size = this.f66365.size();
        int i = this.f66372;
        this.f66372 = i + 1;
        C16395 c16395 = new C16395(size, i, this);
        c16395.m38615().add(new C12122(new C1018(C12307.f36802, C10191.f30620, (C21480) null, C20069.f65002), c16395));
        this.f66365.add(c16395);
        return c16395;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47198() {
        return this.f66369;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16395 m47195() {
        return (C16395) this.f66365.get(this.f66369);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m47192() {
        return this.f66366;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16395 m47196() {
        int i = this.f66366;
        if (i < 0) {
            return null;
        }
        return (C16395) this.f66365.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47173(int i) {
        if (i < 0) {
            return -1;
        }
        return ((C16395) this.f66365.get(i)).m38607();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m47186() {
        return this.f66371;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m47202() {
        return this.f66362;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47189(int i) {
        int i2 = this.f66364;
        int i3 = this.f66368;
        int i4 = i2 + i3;
        this.f66368 = i3 + i;
        this.f66371 = Math.max(this.f66371, i + i4);
        return i4;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m47185() {
        this.f66368 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47181(C16354 c16354) {
        Iterator it = this.f66365.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C16395) it.next()).m38615().iterator();
            while (it2.hasNext()) {
                ((AbstractC14278) it2.next()).m34039(c16354);
            }
        }
        int iM38500 = c16354.m38500();
        this.f66371 = iM38500;
        this.f66364 = iM38500;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m47190() {
        return this.f66365;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet m47174() {
        int size = this.f66365.size();
        BitSet bitSet = new BitSet(size);
        BitSet bitSet2 = new BitSet(size);
        bitSet.set(m47195().m38609());
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(0);
            if (iNextSetBit == -1) {
                return bitSet2;
            }
            bitSet2.set(iNextSetBit);
            bitSet.or(((C16395) this.f66365.get(iNextSetBit)).m38604());
            bitSet.andNot(bitSet2);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14278 m47194(int i) {
        if (this.f66361) {
            throw new RuntimeException("No def list in back mode");
        }
        AbstractC14278[] abstractC14278Arr = this.f66370;
        if (abstractC14278Arr != null) {
            return abstractC14278Arr[i];
        }
        this.f66370 = new AbstractC14278[this.f66371];
        m47182(new C23451(this));
        return this.f66370[i];
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m47172() {
        if (this.f66361) {
            throw new RuntimeException("No use list in back mode");
        }
        this.f66367 = new ArrayList[this.f66371];
        for (int i = 0; i < this.f66371; i++) {
            this.f66367[i] = new ArrayList();
        }
        m47182(new C6518(this));
        this.f66363 = new List[this.f66371];
        for (int i2 = 0; i2 < this.f66371; i2++) {
            this.f66363[i2] = C20195.unmodifiableList(this.f66367[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47180(AbstractC14278 abstractC14278, C21480 c21480, C21480 c21481) {
        if (this.f66367 == null) {
            return;
        }
        if (c21480 != null) {
            this.f66367[c21480.m48652()].remove(abstractC14278);
        }
        int iM48652 = c21481.m48652();
        ArrayList[] arrayListArr = this.f66367;
        if (arrayListArr.length <= iM48652) {
            this.f66367 = null;
        } else {
            arrayListArr[iM48652].add(abstractC14278);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47177(C12122 c12122, C20069 c20069) {
        if (this.f66367 == null) {
            return;
        }
        if (c20069 != null) {
            m47169((AbstractC14278) c12122, c20069);
        }
        C20069 c20069Mo29535 = c12122.mo29535();
        int size = c20069Mo29535.size();
        for (int i = 0; i < size; i++) {
            this.f66367[c20069Mo29535.m41004get(i).m48652()].add(c12122);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47169(AbstractC14278 abstractC14278, C20069 c20069) {
        if (c20069 == null) {
            return;
        }
        int size = c20069.size();
        for (int i = 0; i < size; i++) {
            if (!this.f66367[c20069.m41004get(i).m48652()].remove(abstractC14278)) {
                throw new RuntimeException("use not found");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47178(AbstractC14278 abstractC14278) {
        if (this.f66367 != null) {
            m47169(abstractC14278, abstractC14278.mo29535());
        }
        C21480 c21480M34042 = abstractC14278.m34042();
        AbstractC14278[] abstractC14278Arr = this.f66370;
        if (abstractC14278Arr == null || c21480M34042 == null) {
            return;
        }
        abstractC14278Arr[c21480M34042.m48652()] = null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m47184() {
        this.f66370 = null;
        this.f66367 = null;
        this.f66363 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47179(AbstractC14278 abstractC14278, C21480 c21480) {
        if (this.f66370 == null) {
            return;
        }
        if (c21480 != null) {
            this.f66370[c21480.m48652()] = null;
        }
        C21480 c21480M34042 = abstractC14278.m34042();
        if (c21480M34042 != null) {
            int iM48652 = c21480M34042.m48652();
            AbstractC14278[] abstractC14278Arr = this.f66370;
            if (abstractC14278Arr[iM48652] != null) {
                throw new RuntimeException("Duplicate add of insn");
            }
            abstractC14278Arr[c21480M34042.m48652()] = abstractC14278;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m47199(int i) {
        if (this.f66363 == null) {
            m47172();
        }
        return this.f66363[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList[] m47201() {
        if (this.f66367 == null) {
            m47172();
        }
        ArrayList[] arrayListArr = new ArrayList[this.f66371];
        for (int i = 0; i < this.f66371; i++) {
            arrayListArr[i] = new ArrayList(this.f66367[i]);
        }
        return arrayListArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47183(C21480 c21480) {
        AbstractC14278 abstractC14278M47194 = m47194(c21480.m48652());
        if (abstractC14278M47194 == null) {
            return false;
        }
        if (abstractC14278M47194.mo29540() != null) {
            return true;
        }
        Iterator it = m47199(c21480.m48652()).iterator();
        while (it.hasNext()) {
            AbstractC15834 abstractC15834Mo29542 = ((AbstractC14278) it.next()).mo29542();
            if (abstractC15834Mo29542 != null && abstractC15834Mo29542.m37484().m9562() == 54) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47197(int i) {
        this.f66371 = i;
        this.f66364 = i;
        m47184();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m47193() {
        int i = this.f66371;
        int i2 = i + 1;
        this.f66371 = i2;
        this.f66364 = i2;
        m47184();
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47182(InterfaceC17101 interfaceC17101) {
        Iterator it = this.f66365.iterator();
        while (it.hasNext()) {
            ((C16395) it.next()).m38599(interfaceC17101);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47176(InterfaceC10752 interfaceC10752) {
        BitSet bitSet = new BitSet(this.f66365.size());
        Stack stack = new Stack();
        C16395 c16395M47195 = m47195();
        if (c16395M47195 == null) {
            return;
        }
        stack.add(null);
        stack.add(c16395M47195);
        while (stack.size() > 0) {
            C16395 c16395 = (C16395) stack.pop();
            C16395 c16396 = (C16395) stack.pop();
            if (!bitSet.get(c16395.m38609())) {
                BitSet bitSetM38604 = c16395.m38604();
                for (int iNextSetBit = bitSetM38604.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM38604.nextSetBit(iNextSetBit + 1)) {
                    stack.add(c16395);
                    stack.add((C16395) this.f66365.get(iNextSetBit));
                }
                bitSet.set(c16395.m38609());
                interfaceC10752.mo24095(c16395, c16396);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47191(InterfaceC10752 interfaceC10752) {
        BitSet bitSet = new BitSet(this.f66365.size());
        Stack stack = new Stack();
        stack.add(m47195());
        while (stack.size() > 0) {
            C16395 c16395 = (C16395) stack.pop();
            ArrayList arrayListM38594 = c16395.m38594();
            if (!bitSet.get(c16395.m38609())) {
                int size = arrayListM38594.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        stack.add((C16395) arrayListM38594.get(size));
                    }
                }
                bitSet.set(c16395.m38609());
                interfaceC10752.mo24095(c16395, null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47175(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC14278 abstractC14278 = (AbstractC14278) it.next();
            C16395 c16395M34044 = abstractC14278.m34044();
            ArrayList arrayListM38615 = c16395M34044.m38615();
            for (int size = arrayListM38615.size() - 1; size >= 0; size--) {
                AbstractC14278 abstractC14279 = (AbstractC14278) arrayListM38615.get(size);
                if (abstractC14278 == abstractC14279) {
                    m47178(abstractC14279);
                    arrayListM38615.remove(size);
                    break;
                }
            }
            int size2 = arrayListM38615.size();
            AbstractC14278 abstractC142710 = size2 == 0 ? null : (AbstractC14278) arrayListM38615.get(size2 - 1);
            if (c16395M34044 != m47196() && (size2 == 0 || abstractC142710.mo29542() == null || abstractC142710.mo29542().m37484().m9558() == 1)) {
                arrayListM38615.add(new C12122(new C1018(C12307.f36802, C10191.f30620, (C21480) null, C20069.f65002), c16395M34044));
                BitSet bitSetM38604 = c16395M34044.m38604();
                for (int iNextSetBit = bitSetM38604.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetM38604.nextSetBit(iNextSetBit + 1)) {
                    if (iNextSetBit != c16395M34044.m38623()) {
                        c16395M34044.m38620(iNextSetBit);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m47200() {
        this.f66361 = true;
        this.f66367 = null;
        this.f66370 = null;
    }
}
