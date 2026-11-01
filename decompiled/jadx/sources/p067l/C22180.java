package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22180 implements InterfaceC20568 {

    /* JADX INFO: renamed from: ֫ */
    public final int f70170;

    /* JADX INFO: renamed from: ۧ */
    public final C14645 f70171;

    /* JADX INFO: renamed from: ܽ */
    public volatile BitSet f70172;

    /* JADX INFO: renamed from: ܿ */
    public int f70173 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public final C18155 f70174;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49992(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    public C22180(C14645 c14645, C18155 c18155, int i) {
        this.f70171 = c14645;
        this.f70174 = c18155;
        this.f70170 = i;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩻ */
    public final int mo6075() {
        int i = this.f70173;
        if (i != -1) {
            return i;
        }
        int iM13856 = this.f70171.m33504().m13856(this.f70170);
        this.f70173 = iM13856;
        return iM13856;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49997() {
        return this.f70171.m33504().mo13855(this.f70170 + 12);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m49995() {
        int i = this.f70170 + 16;
        int iM49997 = m49997();
        BitSet bitSet = new BitSet();
        if (iM49997 > 0) {
            int i2 = (iM49997 * 2) + i;
            C20168 c20168M13859 = this.f70171.m33504().m13859(i);
            try {
                C9873 c9873Mo29499 = this.f70171.mo29499();
                ArrayList arrayList = new ArrayList(mo6068());
                C17441 c17441 = new C17441();
                BitSet bitSet2 = new BitSet();
                c17441.add(0);
                while (!c17441.isEmpty()) {
                    m49990(c9873Mo29499, c20168M13859, i, i2, c17441, bitSet, bitSet2);
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C17484 c17484 = (C17484) it.next();
                        int iMo16459 = c17484.mo16459();
                        if (m49992(iMo16459) && bitSet2.get(iMo16459)) {
                            it.remove();
                            Iterator it2 = c17484.mo16460().iterator();
                            while (it2.hasNext()) {
                                m49991(c17441, bitSet2, ((AbstractC13975) it2.next()).mo9474());
                            }
                        }
                    }
                }
                c20168M13859.m45626();
            } catch (Throwable th) {
                c20168M13859.m45626();
                throw th;
            }
        }
        this.f70172 = bitSet;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo6074() {
        int iM49997 = m49997();
        int i = this.f70170 + 16;
        return new C18826(this, i, (iM49997 * 2) + i, this.f70171.m33506() ? m49996() : null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49990(C9873 c9873, C20168 c20168, int i, int i2, C17441 c17441, BitSet bitSet, BitSet bitSet2) {
        int iM45636;
        int iM45646;
        int iM45647;
        int iM45631;
        while (!c17441.isEmpty()) {
            int iM28313 = c17441.m28313();
            if (m49992(iM28313)) {
                int i3 = (iM28313 * 2) + i;
                if (!bitSet2.get(iM28313)) {
                    c20168.m45645(i3);
                    while (true) {
                        if (c20168.m45631() < i2) {
                            int iM45638 = c20168.m45638();
                            if (iM45638 == 0) {
                                iM45638 = c20168.m45633();
                            }
                            EnumC3167 enumC3167M23155 = c9873.m23155(iM45638);
                            if (enumC3167M23155 != null) {
                                int i4 = 0;
                                switch (C8768.f23791[enumC3167M23155.f6090.ordinal()]) {
                                    case 1:
                                        iM45636 = c20168.m45636();
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        iM45636 = c20168.m45640();
                                        break;
                                    case 5:
                                    case 6:
                                        iM45636 = c20168.m45632(2);
                                        break;
                                    default:
                                        iM45636 = 0;
                                        break;
                                }
                                if (iM45636 != 0) {
                                    m49991(c17441, bitSet2, ((long) ((c20168.m45631() - i) / 2)) + ((long) iM45636));
                                }
                                int i5 = C8768.f23792[enumC3167M23155.ordinal()];
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        int iM45632 = c20168.m45631();
                                        long jM45631 = (c20168.m45631() - i) / 2;
                                        long j = ((long) iM45636) + jM45631;
                                        if (m49992(j)) {
                                            c20168.m45645((((int) j) * 2) + i);
                                            int iM45639 = c20168.m45638();
                                            if (iM45639 == 0) {
                                                iM45639 = c20168.m45633();
                                            }
                                            if (c9873.m23155(iM45639) == EnumC3167.f6043) {
                                                int iM45648 = c20168.m45646();
                                                while (i4 < iM45648) {
                                                    m49991(c17441, bitSet2, ((long) c20168.m45632((i4 * 4) + 8)) + jM45631);
                                                    i4++;
                                                }
                                            }
                                            c20168.m45645(iM45632);
                                        }
                                        iM45647 = enumC3167M23155.f6090.f14399 / 2;
                                    } else if (i5 == 3) {
                                        int iM45633 = c20168.m45631();
                                        long jM45632 = (c20168.m45631() - i) / 2;
                                        long j2 = ((long) iM45636) + jM45632;
                                        if (m49992(j2)) {
                                            c20168.m45645((((int) j2) * 2) + i);
                                            int iM456310 = c20168.m45638();
                                            if (iM456310 == 0) {
                                                iM456310 = c20168.m45633();
                                            }
                                            if (c9873.m23155(iM456310) == EnumC3167.f5900) {
                                                int iM45649 = c20168.m45646();
                                                int i6 = (iM45649 * 4) + 4;
                                                while (i4 < iM45649) {
                                                    m49991(c17441, bitSet2, ((long) c20168.m45632((i4 * 4) + i6)) + jM45632);
                                                    i4++;
                                                }
                                            }
                                            c20168.m45645(iM45633);
                                        }
                                        iM45647 = enumC3167M23155.f6090.f14399 / 2;
                                    } else if (i5 != 4) {
                                        iM45647 = i5 != 5 ? enumC3167M23155.f6090.f14399 / 2 : (c20168.m45646() * 4) + 2;
                                    } else {
                                        iM45646 = c20168.m45646() * 2;
                                    }
                                    iM45631 = (c20168.m45631() - i) / 2;
                                    int i7 = iM45631 + iM45647;
                                    if (!m49992(iM45631) && i7 >= iM45631) {
                                        bitSet.set(iM45631);
                                        bitSet2.set(iM45631, i7);
                                        if (!enumC3167M23155.m5446()) {
                                            break;
                                        } else {
                                            c20168.m45623(iM45647 * 2);
                                        }
                                    }
                                } else {
                                    int iM456410 = c20168.m45646();
                                    int iM45634 = c20168.m45632(4);
                                    if (iM45634 >= 0 && ((iM456410 == 1 || iM456410 == 2 || iM456410 == 4 || iM456410 == 8) && ((long) iM456410) * ((long) iM45634) <= 2147483647L)) {
                                        iM45646 = ((iM456410 * iM45634) + 1) / 2;
                                    }
                                }
                                iM45647 = iM45646 + 4;
                                iM45631 = (c20168.m45631() - i) / 2;
                                int i8 = iM45631 + iM45647;
                                if (!m49992(iM45631)) {
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49991(C17441 c17441, BitSet bitSet, long j) {
        if (m49992(j)) {
            int i = (int) j;
            if (bitSet.get(i)) {
                return;
            }
            c17441.add(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private BitSet m49996() {
        BitSet bitSet;
        BitSet bitSet2 = this.f70172;
        if (bitSet2 != null) {
            return bitSet2;
        }
        synchronized (this) {
            bitSet = this.f70172;
            if (bitSet == null) {
                m49995();
                bitSet = this.f70172;
            }
        }
        return bitSet;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ۜ */
    public final List mo6068() {
        AbstractC6086 abstractC6086M33504 = this.f70171.m33504();
        int i = this.f70170;
        int iM13856 = abstractC6086M33504.m13856(i + 6);
        if (iM13856 > 0) {
            int iM53892 = C24420.m53892(m49997(), 2, i + 16, 3) & (-4);
            return new C24861(this, iM53892, (iM13856 * 8) + iM53892, iM13856);
        }
        return AbstractC16192.m36872of();
    }

    /* JADX INFO: renamed from: ܽ */
    private AbstractC22062 m49994() {
        C14645 c14645 = this.f70171;
        int iMo13857 = c14645.m33504().mo13857(this.f70170 + 8);
        if (iMo13857 == -1 || iMo13857 == 0) {
            return AbstractC22062.m49655(c14645, 0, this);
        }
        C18155 c18155 = this.f70174;
        if (iMo13857 < 0) {
            System.err.printf("%s: Invalid debug offset%n", c18155);
            return AbstractC22062.m49655(c14645, 0, this);
        }
        if (iMo13857 >= c14645.m33504().length()) {
            System.err.printf("%s: Invalid debug offset%n", c18155);
            return AbstractC22062.m49655(c14645, 0, this);
        }
        return AbstractC22062.m49655(c14645, iMo13857, this);
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo6069() {
        final BitSet bitSetM49996 = m49996();
        return C10810.m24925(m49994(), new InterfaceC20276() { // from class: l.ᩳۨ֡
            @Override // p067l.InterfaceC20276
            public final boolean apply(Object obj) {
                return C22180.m49993(bitSetM49996, (InterfaceC9838) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m49993(BitSet bitSet, InterfaceC9838 interfaceC9838) {
        if (interfaceC9838.mo10470() != 10) {
            return true;
        }
        int iMo16884 = interfaceC9838.mo16884();
        if (m49992(iMo16884) && bitSet.get(iMo16884)) {
            return true;
        }
        if (!(interfaceC9838 instanceof C7309)) {
            return false;
        }
        ((C7309) interfaceC9838).m16883();
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Iterator m49998() {
        return m49994().mo20070();
    }
}
