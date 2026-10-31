package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20846 implements InterfaceC19150 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f67488;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12918 f67489;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile BitSet f67490;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67491 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16611 f67492;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47664(long j) {
        return j >= 0 && j <= 2147483647L;
    }

    public C20846(C12918 c12918, C16611 c16611, int i) {
        this.f67489 = c12918;
        this.f67492 = c16611;
        this.f67488 = i;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3818() {
        int i = this.f67491;
        if (i != -1) {
            return i;
        }
        int iM11936 = this.f67489.m31418().m11936(this.f67488);
        this.f67491 = iM11936;
        return iM11936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47669() {
        return this.f67489.m31418().mo11935(this.f67488 + 12);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m47667() {
        int i = this.f67488 + 16;
        int iM47669 = m47669();
        BitSet bitSet = new BitSet();
        if (iM47669 > 0) {
            int i2 = (iM47669 * 2) + i;
            C18729 c18729M11939 = this.f67489.m31418().m11939(i);
            try {
                C7897 c7897Mo27437 = this.f67489.mo27437();
                ArrayList arrayList = new ArrayList(mo3811());
                C15859 c15859 = new C15859();
                BitSet bitSet2 = new BitSet();
                c15859.add(0);
                while (!c15859.isEmpty()) {
                    m47662(c7897Mo27437, c18729M11939, i, i2, c15859, bitSet, bitSet2);
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C15905 c15905 = (C15905) it.next();
                        int iMo14555 = c15905.mo14555();
                        if (m47664(iMo14555) && bitSet2.get(iMo14555)) {
                            it.remove();
                            Iterator it2 = c15905.mo14556().iterator();
                            while (it2.hasNext()) {
                                m47663(c15859, bitSet2, ((AbstractC12213) it2.next()).mo7391());
                            }
                        }
                    }
                }
                c18729M11939.m43359();
            } catch (Throwable th) {
                c18729M11939.m43359();
                throw th;
            }
        }
        this.f67490 = bitSet;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo3817() {
        int iM47669 = m47669();
        int i = this.f67488 + 16;
        return new C17317(this, i, (iM47669 * 2) + i, this.f67489.m31420() ? m47668() : null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47662(C7897 c7897, C18729 c18729, int i, int i2, C15859 c15859, BitSet bitSet, BitSet bitSet2) {
        int iM43369;
        int iM43379;
        int iM433710;
        int iM43364;
        while (!c15859.isEmpty()) {
            int iM26284 = c15859.m26284();
            if (m47664(iM26284)) {
                int i3 = (iM26284 * 2) + i;
                if (!bitSet2.get(iM26284)) {
                    c18729.m43378(i3);
                    while (true) {
                        if (c18729.m43364() < i2) {
                            int iM43371 = c18729.m43371();
                            if (iM43371 == 0) {
                                iM43371 = c18729.m43366();
                            }
                            EnumC0841 enumC0841M21189 = c7897.m21189(iM43371);
                            if (enumC0841M21189 != null) {
                                int i4 = 0;
                                switch (C6734.f20917[enumC0841M21189.f3316.ordinal()]) {
                                    case 1:
                                        iM43369 = c18729.m43369();
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        iM43369 = c18729.m43373();
                                        break;
                                    case 5:
                                    case 6:
                                        iM43369 = c18729.m43365(2);
                                        break;
                                    default:
                                        iM43369 = 0;
                                        break;
                                }
                                if (iM43369 != 0) {
                                    m47663(c15859, bitSet2, ((long) ((c18729.m43364() - i) / 2)) + ((long) iM43369));
                                }
                                int i5 = C6734.f20918[enumC0841M21189.ordinal()];
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        int iM43365 = c18729.m43364();
                                        long jM43364 = (c18729.m43364() - i) / 2;
                                        long j = ((long) iM43369) + jM43364;
                                        if (m47664(j)) {
                                            c18729.m43378((((int) j) * 2) + i);
                                            int iM43372 = c18729.m43371();
                                            if (iM43372 == 0) {
                                                iM43372 = c18729.m43366();
                                            }
                                            if (c7897.m21189(iM43372) == EnumC0841.f3269) {
                                                int iM433711 = c18729.m43379();
                                                while (i4 < iM433711) {
                                                    m47663(c15859, bitSet2, ((long) c18729.m43365((i4 * 4) + 8)) + jM43364);
                                                    i4++;
                                                }
                                            }
                                            c18729.m43378(iM43365);
                                        }
                                        iM433710 = enumC0841M21189.f3316.f11595 / 2;
                                    } else if (i5 == 3) {
                                        int iM43366 = c18729.m43364();
                                        long jM43365 = (c18729.m43364() - i) / 2;
                                        long j2 = ((long) iM43369) + jM43365;
                                        if (m47664(j2)) {
                                            c18729.m43378((((int) j2) * 2) + i);
                                            int iM43373 = c18729.m43371();
                                            if (iM43373 == 0) {
                                                iM43373 = c18729.m43366();
                                            }
                                            if (c7897.m21189(iM43373) == EnumC0841.f3126) {
                                                int iM433712 = c18729.m43379();
                                                int i6 = (iM433712 * 4) + 4;
                                                while (i4 < iM433712) {
                                                    m47663(c15859, bitSet2, ((long) c18729.m43365((i4 * 4) + i6)) + jM43365);
                                                    i4++;
                                                }
                                            }
                                            c18729.m43378(iM43366);
                                        }
                                        iM433710 = enumC0841M21189.f3316.f11595 / 2;
                                    } else if (i5 != 4) {
                                        iM433710 = i5 != 5 ? enumC0841M21189.f3316.f11595 / 2 : (c18729.m43379() * 4) + 2;
                                    } else {
                                        iM43379 = c18729.m43379() * 2;
                                    }
                                    iM43364 = (c18729.m43364() - i) / 2;
                                    int i7 = iM43364 + iM433710;
                                    if (!m47664(iM43364) && i7 >= iM43364) {
                                        bitSet.set(iM43364);
                                        bitSet2.set(iM43364, i7);
                                        if (!enumC0841M21189.m3132()) {
                                            break;
                                        } else {
                                            c18729.m43356(iM433710 * 2);
                                        }
                                    }
                                } else {
                                    int iM433713 = c18729.m43379();
                                    int iM43367 = c18729.m43365(4);
                                    if (iM43367 >= 0 && ((iM433713 == 1 || iM433713 == 2 || iM433713 == 4 || iM433713 == 8) && ((long) iM433713) * ((long) iM43367) <= 2147483647L)) {
                                        iM43379 = ((iM433713 * iM43367) + 1) / 2;
                                    }
                                }
                                iM433710 = iM43379 + 4;
                                iM43364 = (c18729.m43364() - i) / 2;
                                int i8 = iM43364 + iM433710;
                                if (!m47664(iM43364)) {
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47663(C15859 c15859, BitSet bitSet, long j) {
        if (m47664(j)) {
            int i = (int) j;
            if (bitSet.get(i)) {
                return;
            }
            c15859.add(i);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private BitSet m47668() {
        BitSet bitSet;
        BitSet bitSet2 = this.f67490;
        if (bitSet2 != null) {
            return bitSet2;
        }
        synchronized (this) {
            bitSet = this.f67490;
            if (bitSet == null) {
                m47667();
                bitSet = this.f67490;
            }
        }
        return bitSet;
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ۜ */
    public final List mo3811() {
        AbstractC3912 abstractC3912M31418 = this.f67489.m31418();
        int i = this.f67488;
        int iM11936 = abstractC3912M31418.m11936(i + 6);
        if (iM11936 > 0) {
            int iM51496 = C23202.m51496(m47669(), 2, i + 16, 3) & (-4);
            return new C23667(this, iM51496, (iM11936 * 8) + iM51496, iM11936);
        }
        return AbstractC14545.of();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC20722 m47666() {
        C12918 c12918 = this.f67489;
        int iMo11937 = c12918.m31418().mo11937(this.f67488 + 8);
        if (iMo11937 == -1 || iMo11937 == 0) {
            return AbstractC20722.m47328(c12918, 0, this);
        }
        C16611 c16611 = this.f67492;
        if (iMo11937 < 0) {
            System.err.printf("%s: Invalid debug offset%n", c16611);
            return AbstractC20722.m47328(c12918, 0, this);
        }
        if (iMo11937 >= c12918.m31418().length()) {
            System.err.printf("%s: Invalid debug offset%n", c16611);
            return AbstractC20722.m47328(c12918, 0, this);
        }
        return AbstractC20722.m47328(c12918, iMo11937, this);
    }

    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo3812() {
        final BitSet bitSetM47668 = m47668();
        return C8882.m22954(m47666(), new InterfaceC18842() { // from class: l.ᩳۨ֡
            @Override // l.InterfaceC18842
            public final boolean apply(Object obj) {
                return C20846.m47665(bitSetM47668, (InterfaceC7860) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m47665(BitSet bitSet, InterfaceC7860 interfaceC7860) {
        if (interfaceC7860.mo8424() != 10) {
            return true;
        }
        int iMo14974 = interfaceC7860.mo14974();
        if (m47664(iMo14974) && bitSet.get(iMo14974)) {
            return true;
        }
        if (!(interfaceC7860 instanceof C5199)) {
            return false;
        }
        ((C5199) interfaceC7860).m14973();
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Iterator m47670() {
        return m47666().mo18118();
    }
}
