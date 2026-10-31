package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9048 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5478 f27432;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21043[] f27433;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f27434;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3361 f27435;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18926 f27436;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f27437;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17514[] f27438;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f27439;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12533[] f27440;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23864 f27441;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16102 f27442;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f27443;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f27444;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f27445;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13012 m23347(C3361 c3361, C18199 c18199, C9733 c9733) {
        try {
            C9048 c9048 = new C9048(c3361, c18199, c9733);
            c9048.m23360();
            ArrayList arrayList = c9048.f27444;
            int size = arrayList.size();
            C17246 c17246 = new C17246(size);
            for (int i = 0; i < size; i++) {
                c17246.m40531(i, (C16540) arrayList.get(i));
            }
            c17246.mo20349();
            return new C13012(c17246, c9048.m23346(-1));
        } catch (C2698 e) {
            e.m21602("...while working on method " + c3361.mo10264().mo2463());
            throw e;
        }
    }

    public C9048(C3361 c3361, C18199 c18199, C9733 c9733) {
        this.f27435 = c3361;
        C5478 c5478M8322 = C2656.m8322(c3361);
        this.f27432 = c5478M8322;
        int iM38023 = c5478M8322.m38023();
        this.f27439 = iM38023;
        int iM10266 = c3361.m10266();
        this.f27445 = iM10266;
        C16102 c16102 = new C16102(this, c3361, c18199);
        this.f27442 = c16102;
        this.f27436 = new C18926(c16102, c3361, c9733);
        C12533[] c12533Arr = new C12533[iM38023];
        this.f27440 = c12533Arr;
        this.f27433 = new C21043[iM38023];
        this.f27444 = new ArrayList((c5478M8322.size() * 2) + 10);
        this.f27437 = new ArrayList((c5478M8322.size() * 2) + 10);
        this.f27438 = new C17514[iM38023];
        this.f27434 = false;
        c12533Arr[0] = new C12533(iM10266, c3361.m10265());
        C23864 c23864 = new C23864(iM38023);
        c23864.f77187 = c3361.m10271().size() + iM38023;
        this.f27441 = c23864;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m23346(int i) {
        return this.f27435.m10271().size() + this.f27439 + (~i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23362() {
        int size = this.f27435.m10271().size() + this.f27439 + 7;
        Iterator it = this.f27444.iterator();
        while (it.hasNext()) {
            int iMo2269 = ((C16540) it.next()).mo2269();
            if (iMo2269 >= size) {
                size = iMo2269 + 1;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m23366(int i) {
        int size = this.f27435.m10271().size() + this.f27439 + 7;
        ArrayList arrayList = this.f27444;
        C21064 c21064M38911 = ((C16540) arrayList.get(i)).m38911();
        int size2 = c21064M38911.size();
        arrayList.remove(i);
        this.f27437.remove(i);
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = c21064M38911.get(i2);
            if (i3 >= size) {
                int iM23363 = m23363(i3);
                if (iM23363 < 0) {
                    throw new RuntimeException("Invalid label ".concat(C14712.m35006(i3)));
                }
                m23366(iM23363);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m23365() {
        return (this.f27435.mo10269() & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m23367() {
        return (this.f27435.mo10269() & 8) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23368() {
        int iM10265 = this.f27435.m10265() + this.f27445;
        return m23365() ? iM10265 + 1 : iM10265;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m23363(int i) {
        ArrayList arrayList = this.f27444;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C16540) arrayList.get(i2)).mo2269() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16540 m23358(int i) {
        int iM23363 = m23363(i);
        if (iM23363 < 0) {
            throw new IllegalArgumentException("no such label ".concat(C14712.m35006(i)));
        }
        return (C16540) this.f27444.get(iM23363);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23355(C16540 c16540, C21064 c21064) {
        this.f27444.add(c16540);
        c21064.m43732();
        this.f27437.add(c21064);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23361(C9048 c9048, C16540 c16540, C21064 c21064) {
        ArrayList arrayList = c9048.f27437;
        ArrayList arrayList2 = c9048.f27444;
        int iM23363 = c9048.m23363(c16540.mo2269());
        if (iM23363 >= 0) {
            arrayList2.remove(iM23363);
            arrayList.remove(iM23363);
        }
        arrayList2.add(c16540);
        c21064.m43732();
        arrayList.add(c21064);
    }

    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.lang.String, l.᩸ۡܺ] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23360() {
        ?? r6;
        char c;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C2430 c2430;
        boolean z;
        int i3 = this.f27439;
        int[] iArrM32622 = C13573.m32622(i3);
        int i4 = 0;
        C13573.m32627(0, iArrM32622);
        C3361 c3361 = this.f27435;
        C23116 c23116M10272 = c3361.m10272();
        C10191 c10191M10261 = c3361.m10261(0);
        C13922 c13922M51259 = c3361.mo10262().m51259();
        int size = c13922M51259.size();
        C2430 c2431 = new C2430(size + 1);
        int i5 = 0;
        int iM20314 = 0;
        while (i5 < size) {
            C7573 c7573M40995get = c13922M51259.m40995get(i5);
            C11828 c11828M51308 = c23116M10272.m51308(i4, iM20314);
            C23116 c23116 = c23116M10272;
            int i6 = i5;
            c2431.m40986(i6, (AbstractC15834) new C5252(C12307.m29861(c7573M40995get), c10191M10261, c11828M51308 == null ? C21480.m48631(iM20314, c7573M40995get) : C21480.m48636(iM20314, c7573M40995get, c11828M51308.m28913()), C20069.f65002, C2635.m8291(iM20314)));
            iM20314 = c7573M40995get.m20314() + iM20314;
            i5 = i6 + 1;
            c23116M10272 = c23116;
            i4 = 0;
        }
        C3135 c3135 = C12307.f36802;
        C20069 c20069 = C20069.f65002;
        c2431.m40986(size, (AbstractC15834) new C1018(c3135, c10191M10261, (C21480) null, c20069));
        c2431.mo20349();
        boolean zM23365 = m23365();
        int iM23346 = zM23365 ? m23346(-4) : 0;
        C16540 c16540 = new C16540(m23346(-1), c2431, C21064.m47910(iM23346), iM23346);
        C21064 c21064 = C21064.f67936;
        m23355(c16540, c21064);
        int i7 = this.f27445;
        if (zM23365) {
            int iM10265 = c3361.m10265() + i7;
            if (iM10265 < 1) {
                iM10265 = 1;
            }
            C21480 c21480M48631 = C21480.m48631(iM10265, C7573.f23412);
            if (m23367()) {
                C11602 c11602 = new C11602(C12307.f36697, c10191M10261, c20069, C13922.f41594, c3361.mo10267());
                C2430 c2432 = new C2430(1);
                c2432.m40986(0, (AbstractC15834) c11602);
                c2430 = c2432;
                z = false;
                i = 1;
            } else {
                c2430 = new C2430(2);
                c2430.m40986(0, (AbstractC15834) new C5252(C12307.f36803, c10191M10261, c21480M48631, c20069, C2635.f8323));
                z = false;
                i = 1;
                c2430.m40986(1, (AbstractC15834) new C1018(c3135, c10191M10261, (C21480) null, c20069));
            }
            int iM23347 = m23346(-5);
            c2430.mo20349();
            m23355(new C16540(iM23346, c2430, C21064.m47910(iM23347), iM23347), c21064);
            C2430 c2433 = new C2430(m23367() ? 2 : 1);
            if (m23367()) {
                c2433.m40986(0, (AbstractC15834) new C1018(C12307.m29863(c21480M48631), c10191M10261, c21480M48631, c20069));
            }
            c2433.m40986(m23367() ? 1 : 0, (AbstractC15834) new C22890(C12307.f36797, c10191M10261, C20069.m46252(c21480M48631), C13922.f41594));
            c2433.mo20349();
            c = 0;
            m23355(new C16540(iM23347, c2433, C21064.m47910(0), 0), c21064);
            r6 = z;
        } else {
            i3 = i3;
            iArrM32622 = iArrM32622;
            i7 = i7;
            r6 = 0;
            c = 0;
            i = 1;
        }
        C23095 c23095Mo10262 = c3361.mo10262();
        C12533[] c12533Arr = this.f27440;
        c12533Arr[c].m30749(c23095Mo10262.m51259());
        c12533Arr[c].m30753();
        int[] iArr = iArrM32622;
        int i8 = 0;
        while (true) {
            int iM32623 = C13573.m32623(i8, iArr);
            if (iM32623 < 0) {
                break;
            }
            int i9 = i3;
            int i10 = i7;
            C13573.m32620(iM32623, iArr);
            try {
                m23351(this.f27432.m15579(iM32623), c12533Arr[iM32623], iArr);
                i8 = 0;
                i = 1;
                i3 = i9;
                i7 = i10;
            } catch (C2698 e) {
                e.m21602("...while working on block ".concat(C14712.m35006(iM32623)));
                throw e;
            }
        }
        C16102 c16102 = this.f27442;
        C3135 c3135M38008 = c16102.m38008();
        if (c3135M38008 == null) {
            i2 = i7;
        } else {
            C10191 c10191M37997 = c16102.m37997();
            int iM23348 = m23346(-2);
            if (m23365()) {
                C2430 c2434 = new C2430(i);
                C3135 c3136 = C12307.f36791;
                i2 = i7;
                int iM10266 = c3361.m10265() + i2;
                if (iM10266 < i) {
                    iM10266 = 1;
                }
                c2434.m40986(i8, (AbstractC15834) new C22890(c3136, c10191M37997, C20069.m46252(C21480.m48631(iM10266, C7573.f23412)), C13922.f41594));
                c2434.mo20349();
                int iM23349 = m23346(-3);
                m23355(new C16540(iM23348, c2434, C21064.m47910(iM23349), iM23349), C21064.f67936);
                iM23348 = iM23349;
            } else {
                i2 = i7;
            }
            C2430 c2435 = new C2430(i);
            InterfaceC10711 interfaceC10711M9559 = c3135M38008.m9559();
            c2435.m40986(i8, (AbstractC15834) new C1018(c3135M38008, c10191M37997, (C21480) r6, interfaceC10711M9559.size() == 0 ? C20069.f65002 : C20069.m46252(C21480.m48631(i8, interfaceC10711M9559.getType(i8)))));
            c2435.mo20349();
            C21064 c21065 = C21064.f67936;
            m23355(new C16540(iM23348, c2435, c21065, -1), c21065);
        }
        if (this.f27434) {
            C10191 c10191M10262 = c3361.m10261(i8);
            C7573 c7573 = C7573.f23403;
            C21480 c21480M48632 = C21480.m48631(i8, c7573);
            C2430 c2436 = new C2430(2);
            c7573.getClass();
            C13922 c13922 = C13922.f41594;
            c2436.m40986(i8, (AbstractC15834) new C1018(new C3135(4, c7573, c13922, r6), c10191M10262, c21480M48632, C20069.f65002));
            C3135 c3137 = C12307.f36791;
            int iM10267 = c3361.m10265() + i2;
            if (iM10267 < i) {
                iM10267 = 1;
            }
            c2436.m40986(i, (AbstractC15834) new C22890(c3137, c10191M10262, C20069.m46252(C21480.m48631(iM10267, C7573.f23412)), c13922));
            c2436.mo20349();
            int iM233410 = m23346(-7);
            C16540 c16541 = new C16540(m23346(-6), c2436, C21064.m47910(iM233410), iM233410);
            C21064 c21066 = C21064.f67936;
            m23355(c16541, c21066);
            C2430 c2437 = new C2430(i);
            c2437.m40986(i8, (AbstractC15834) new C22890(C12307.f36670, c10191M10262, C20069.m46252(c21480M48632), c13922));
            c2437.mo20349();
            m23355(new C16540(iM233410, c2437, c21066, -1), c21066);
        }
        C17514[] c17514Arr = this.f27438;
        int length = c17514Arr.length;
        for (int i11 = 0; i11 < length; i11++) {
            C17514 c17514 = c17514Arr[i11];
            if (c17514 != null) {
                for (C14691 c14691 : c17514.m40927()) {
                    C10191 c10191M37480 = m23358(i11).m38914().m37480();
                    C2430 c2438 = new C2430(2);
                    C7573 c7573M34988 = c14691.m34988();
                    c7573M34988.getClass();
                    C3135 c3138 = new C3135(4, c7573M34988, C13922.f41594, r6);
                    C21480 c21480M48633 = C21480.m48631(i2, c14691.m34988());
                    C20069 c200610 = C20069.f65002;
                    c2438.m40986(0, (AbstractC15834) new C1018(c3138, c10191M37480, c21480M48633, c200610));
                    c2438.m40986(1, (AbstractC15834) new C1018(C12307.f36802, c10191M37480, (C21480) r6, c200610));
                    c2438.mo20349();
                    m23355(new C16540(c14691.m34989(), c2438, C21064.m47910(i11), i11), c12533Arr[i11].m30754());
                }
            }
        }
        if (!this.f27443) {
            return;
        }
        C21064 c21067 = new C21064(4);
        int i12 = i3;
        m23354(m23358(0), new C16808(this, c21067), new BitSet(i12));
        int iM23362 = m23362();
        ArrayList arrayList3 = new ArrayList(iM23362);
        for (int i13 = 0; i13 < iM23362; i13++) {
            arrayList3.add(r6);
        }
        int i14 = 0;
        while (true) {
            arrayList = this.f27444;
            int size2 = arrayList.size();
            arrayList2 = this.f27437;
            if (i14 >= size2) {
                break;
            }
            C16540 c16542 = (C16540) arrayList.get(i14);
            if (c16542 != null) {
                arrayList3.set(c16542.mo2269(), (C21064) arrayList2.get(i14));
            }
            i14++;
        }
        int size3 = c21067.size();
        for (int i15 = 0; i15 < size3; i15++) {
            new C9754(this, new C6931(m23362()), arrayList3).m24734(m23358(c21067.get(i15)));
        }
        C21064 c21068 = new C21064(arrayList.size());
        arrayList2.clear();
        m23354(m23358(m23346(-1)), new C18220(c21068), new BitSet(i12));
        c21068.m47914();
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                return;
            }
            int iM47912 = c21068.m47912(((C16540) arrayList.get(size4)).mo2269());
            if (iM47912 < 0) {
                iM47912 = -1;
            }
            if (iM47912 < 0) {
                arrayList.remove(size4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23351(C0538 c0538, C12533 c12533, int[] iArr) {
        int size;
        C21043 c21043;
        int i;
        C21064 c21064M47913;
        int i2;
        int i3;
        C10191 c10191M37480;
        C21064 c21064M47910;
        C8300 c8300M2270 = c0538.m2270();
        C13922 c13922M21900 = c8300M2270.m21900();
        C16102 c16102 = this.f27442;
        c16102.m37999(c13922M21900);
        C12533 c12533M30742 = c12533.m30742();
        this.f27436.m43681(c0538, c12533M30742);
        c12533M30742.m30753();
        int iM38006 = c16102.m38006();
        ArrayList arrayListM38000 = c16102.m38000();
        int size2 = arrayListM38000.size();
        int size3 = c8300M2270.size();
        C21064 c21064M2272 = c0538.m2272();
        boolean zM38002 = c16102.m38002();
        C21043[] c21043Arr = this.f27433;
        if (zM38002) {
            int i4 = c21064M2272.get(1);
            if (c21043Arr[i4] == null) {
                c21043Arr[i4] = new C21043(this, i4);
            }
            c21043Arr[i4].m47879(c0538.mo2269());
            c21043 = c21043Arr[i4];
            size = 1;
        } else {
            if (c16102.m37998()) {
                int iM27690 = c16102.m38007().m27690();
                C21043 c21044 = c21043Arr[iM27690];
                if (c21044 == null) {
                    int iMo2269 = c0538.mo2269();
                    C21043 c21045 = new C21043(this, iM27690);
                    c21045.m47882(iMo2269);
                    c21043Arr[iM27690] = c21045;
                } else {
                    c21044.m47882(c0538.mo2269());
                }
                C21064 c21064M47881 = c21043Arr[iM27690].m47881();
                c21043Arr[iM27690].m47880(c12533M30742, iArr);
                size = c21064M47881.size();
                c21064M2272 = c21064M47881;
            } else {
                size = c16102.m38005() ? size3 : 0;
            }
            c21043 = null;
        }
        C21064 c21064 = c21064M2272;
        C21043 c21046 = c21043;
        int size4 = c21064.size();
        int i5 = size;
        while (i5 < size4) {
            int i6 = c21064.get(i5);
            try {
                int i7 = i5;
                int i8 = size4;
                C21064 c21065 = c21064;
                m23350(i6, c0538.mo2269(), c21046, c12533M30742, iArr);
                i5 = i7 + 1;
                size4 = i8;
                c21064 = c21065;
            } catch (C2698 e) {
                e.m21602("...while merging to block ".concat(C14712.m35006(i6)));
                throw e;
            }
        }
        int i9 = size4;
        C21064 c21066 = c21064;
        if (i9 == 0 && c16102.m38003()) {
            c21064M47913 = C21064.m47910(m23346(-2));
            i = 1;
        } else {
            i = i9;
            c21064M47913 = c21066;
        }
        if (i == 0) {
            i2 = -1;
        } else {
            int iM38001 = c16102.m38001();
            if (iM38001 >= 0) {
                iM38001 = c21064M47913.get(iM38001);
            }
            i2 = iM38001;
        }
        boolean z = m23365() && c16102.m38004();
        if (z || size3 != 0) {
            C21064 c21067 = new C21064(i);
            boolean z2 = false;
            int i10 = 0;
            while (i10 < size3) {
                C1244 c1244M40991get = c8300M2270.m40991get(i10);
                C12512 c12512M4087 = c1244M40991get.m4087();
                int iM4088 = c1244M40991get.m4088();
                boolean z3 = (c12512M4087 == C12512.f37597) | z2;
                try {
                    C8300 c8300 = c8300M2270;
                    int i11 = i2;
                    int i12 = i10;
                    C21064 c21068 = c21067;
                    m23350(iM4088, c0538.mo2269(), null, c12533M30742.m30744(c12512M4087), iArr);
                    C17514[] c17514Arr = this.f27438;
                    C17514 c17514 = c17514Arr[iM4088];
                    if (c17514 == null) {
                        c17514 = new C17514(this);
                        c17514Arr[iM4088] = c17514;
                    }
                    c21068.add(c17514.m40928(c12512M4087.m30696()).m34989());
                    i10 = i12 + 1;
                    i2 = i11;
                    c21067 = c21068;
                    z2 = z3;
                    c8300M2270 = c8300;
                } catch (C2698 e2) {
                    e2.m21602("...while merging exception to block ".concat(C14712.m35006(iM4088)));
                    throw e2;
                }
            }
            i3 = i2;
            C21064 c21069 = c21067;
            if (z && !z2) {
                c21069.add(m23346(-6));
                this.f27434 = true;
                for (int i13 = (size2 - iM38006) - 1; i13 < size2; i13++) {
                    AbstractC15834 abstractC15834 = (AbstractC15834) arrayListM38000.get(i13);
                    if (abstractC15834.m37481()) {
                        arrayListM38000.set(i13, abstractC15834.mo3529(C7573.f23412));
                    }
                }
            }
            if (i3 >= 0) {
                c21069.add(i3);
            }
            c21069.mo20349();
            c21064M47913 = c21069;
        } else {
            i3 = i2;
        }
        int iM47912 = c21064M47913.m47912(i3);
        if (iM47912 < 0) {
            iM47912 = -1;
        }
        int i14 = i3;
        while (iM38006 > 0) {
            size2--;
            AbstractC15834 abstractC15835 = (AbstractC15834) arrayListM38000.get(size2);
            boolean z4 = abstractC15835.m37484().m9558() == 1;
            C2430 c2430 = new C2430(z4 ? 2 : 1);
            c2430.m40986(0, abstractC15835);
            if (z4) {
                c2430.m40986(1, (AbstractC15834) new C1018(C12307.f36802, abstractC15835.m37480(), (C21480) null, C20069.f65002));
                c21064M47910 = C21064.m47910(i14);
            } else {
                c21064M47910 = c21064M47913;
            }
            c2430.mo20349();
            int iM23362 = m23362();
            m23355(new C16540(iM23362, c2430, c21064M47910, i14), c12533M30742.m30754());
            c21064M47913 = c21064M47913.m47913();
            c21064M47913.set(iM47912, iM23362);
            c21064M47913.mo20349();
            iM38006--;
            i14 = iM23362;
        }
        AbstractC15834 abstractC15836 = size2 == 0 ? null : (AbstractC15834) arrayListM38000.get(size2 - 1);
        if (abstractC15836 == null || abstractC15836.m37484().m9558() == 1) {
            if (abstractC15836 == null) {
                c10191M37480 = C10191.f30620;
            } else {
                c10191M37480 = abstractC15836.m37480();
            }
            arrayListM38000.add(new C1018(C12307.f36802, c10191M37480, (C21480) null, C20069.f65002));
            size2++;
        }
        C2430 c2431 = new C2430(size2);
        for (int i15 = 0; i15 < size2; i15++) {
            c2431.m40986(i15, (AbstractC15834) arrayListM38000.get(i15));
        }
        c2431.mo20349();
        C16540 c16540 = new C16540(c0538.mo2269(), c2431, c21064M47913, i14);
        C21064 c21064M30754 = c12533M30742.m30754();
        int iM23363 = m23363(c16540.mo2269());
        if (iM23363 >= 0) {
            m23366(iM23363);
        }
        this.f27444.add(c16540);
        c21064M30754.m43732();
        this.f27437.add(c21064M30754);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23350(int i, int i2, C21043 c21043, C12533 c12533, int[] iArr) {
        C12533 c12533M30745;
        C12533[] c12533Arr = this.f27440;
        C12533 c12534 = c12533Arr[i];
        if (c12534 == null) {
            if (c21043 != null) {
                c12533Arr[i] = c12533.m30743(i, i2);
            } else {
                c12533Arr[i] = c12533;
            }
            C13573.m32627(i, iArr);
            return;
        }
        if (c21043 != null) {
            c12533M30745 = c12534.m30746(c12533, c21043.m47878(), i2);
        } else {
            c12533M30745 = c12534.m30745(c12533);
        }
        if (c12533M30745 != c12534) {
            c12533Arr[i] = c12533M30745;
            C13573.m32627(i, iArr);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23356(C9048 c9048, C16540 c16540) {
        C21064 c21064M38911 = c16540.m38911();
        if (c21064M38911.size() < 2) {
            return false;
        }
        int i = c21064M38911.get(1);
        C21043[] c21043Arr = c9048.f27433;
        return i < c21043Arr.length && c21043Arr[i] != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21043 m23359(C9048 c9048, int i) {
        C21043[] c21043Arr = c9048.f27433;
        int length = c21043Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                return null;
            }
            C21043 c21043 = c21043Arr[length];
            if (c21043 != null && c21043.f67899.get(i)) {
                return c21043;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23354(C16540 c16540, InterfaceC10897 interfaceC10897, BitSet bitSet) {
        int iM23363;
        interfaceC10897.mo27216(c16540);
        bitSet.set(c16540.mo2269());
        C21064 c21064M38911 = c16540.m38911();
        int size = c21064M38911.size();
        for (int i = 0; i < size; i++) {
            int i2 = c21064M38911.get(i);
            if (!bitSet.get(i2)) {
                C21064 c21064M38912 = c16540.m38911();
                if (c21064M38912.size() >= 2) {
                    int i3 = c21064M38912.get(1);
                    C21043[] c21043Arr = this.f27433;
                    if (i3 >= c21043Arr.length || c21043Arr[i3] == null || i <= 0) {
                        iM23363 = m23363(i2);
                        if (iM23363 >= 0) {
                            m23354((C16540) this.f27444.get(iM23363), interfaceC10897, bitSet);
                        }
                    }
                } else {
                    iM23363 = m23363(i2);
                    if (iM23363 >= 0) {
                        m23354((C16540) this.f27444.get(iM23363), interfaceC10897, bitSet);
                    }
                }
            }
        }
    }
}
