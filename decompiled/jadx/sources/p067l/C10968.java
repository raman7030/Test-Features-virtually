package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10968 {

    /* JADX INFO: renamed from: ֫ */
    public final C7575 f30369;

    /* JADX INFO: renamed from: ۖ */
    public final C22368[] f30370;

    /* JADX INFO: renamed from: ۘ */
    public boolean f30371;

    /* JADX INFO: renamed from: ۜ */
    public final C5563 f30372;

    /* JADX INFO: renamed from: ۡ */
    public final C20356 f30373;

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f30374;

    /* JADX INFO: renamed from: ۧ */
    public final C19014[] f30375;

    /* JADX INFO: renamed from: ܳ */
    public final int f30376;

    /* JADX INFO: renamed from: ܺ */
    public final C14280[] f30377;

    /* JADX INFO: renamed from: ܽ */
    public final C25049 f30378;

    /* JADX INFO: renamed from: ܿ */
    public final C17672 f30379;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f30380;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f30381;

    /* JADX INFO: renamed from: ᩻ */
    public final int f30382;

    /* JADX INFO: renamed from: ֫ */
    public static C14735 m25292(C5563 c5563, C19665 c19665, C11619 c11619) {
        try {
            C10968 c10968 = new C10968(c5563, c19665, c11619);
            c10968.m25305();
            ArrayList arrayList = c10968.f30381;
            int size = arrayList.size();
            C18759 c18759 = new C18759(size);
            for (int i = 0; i < size; i++) {
                c18759.m42780(i, (C18088) arrayList.get(i));
            }
            c18759.mo22326();
            return new C14735(c18759, c10968.m25291(-1));
        } catch (C4933 e) {
            e.m23570("...while working on method " + c5563.mo12301().mo4819());
            throw e;
        }
    }

    public C10968(C5563 c5563, C19665 c19665, C11619 c11619) {
        this.f30372 = c5563;
        C7575 c7575M10366 = C4893.m10366(c5563);
        this.f30369 = c7575M10366;
        int iM40215 = c7575M10366.m40215();
        this.f30376 = iM40215;
        int iM12303 = c5563.m12303();
        this.f30382 = iM12303;
        C17672 c17672 = new C17672(this, c5563, c19665);
        this.f30379 = c17672;
        this.f30373 = new C20356(c17672, c5563, c11619);
        C14280[] c14280Arr = new C14280[iM40215];
        this.f30377 = c14280Arr;
        this.f30370 = new C22368[iM40215];
        this.f30381 = new ArrayList((c7575M10366.size() * 2) + 10);
        this.f30374 = new ArrayList((c7575M10366.size() * 2) + 10);
        this.f30375 = new C19014[iM40215];
        this.f30371 = false;
        c14280Arr[0] = new C14280(iM12303, c5563.m12302());
        C25049 c25049 = new C25049(iM40215);
        c25049.f79937 = c5563.m12308().size() + iM40215;
        this.f30378 = c25049;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m25291(int i) {
        return this.f30372.m12308().size() + this.f30376 + (~i);
    }

    /* JADX INFO: renamed from: ܽ */
    private int m25307() {
        int size = this.f30372.m12308().size() + this.f30376 + 7;
        Iterator it = this.f30381.iterator();
        while (it.hasNext()) {
            int iMo4636 = ((C18088) it.next()).mo4636();
            if (iMo4636 >= size) {
                size = iMo4636 + 1;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m25311(int i) {
        int size = this.f30372.m12308().size() + this.f30376 + 7;
        ArrayList arrayList = this.f30381;
        C22388 c22388M41137 = ((C18088) arrayList.get(i)).m41137();
        int size2 = c22388M41137.size();
        arrayList.remove(i);
        this.f30374.remove(i);
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = c22388M41137.get(i2);
            if (i3 >= size) {
                int iM25308 = m25308(i3);
                if (iM25308 < 0) {
                    throw new RuntimeException("Invalid label ".concat(C16351.m37153(i3)));
                }
                m25311(iM25308);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m25310() {
        return (this.f30372.mo12306() & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m25312() {
        return (this.f30372.mo12306() & 8) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25313() {
        int iM12302 = this.f30372.m12302() + this.f30382;
        return m25310() ? iM12302 + 1 : iM12302;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m25308(int i) {
        ArrayList arrayList = this.f30381;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C18088) arrayList.get(i2)).mo4636() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public C18088 m25303(int i) {
        int iM25308 = m25308(i);
        if (iM25308 < 0) {
            throw new IllegalArgumentException("no such label ".concat(C16351.m37153(i)));
        }
        return (C18088) this.f30381.get(iM25308);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m25300(C18088 c18088, C22388 c22388) {
        this.f30381.add(c18088);
        c22388.m45999();
        this.f30374.add(c22388);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25306(C10968 c10968, C18088 c18088, C22388 c22388) {
        ArrayList arrayList = c10968.f30374;
        ArrayList arrayList2 = c10968.f30381;
        int iM25308 = c10968.m25308(c18088.mo4636());
        if (iM25308 >= 0) {
            arrayList2.remove(iM25308);
            arrayList.remove(iM25308);
        }
        arrayList2.add(c18088);
        c22388.m45999();
        arrayList.add(c22388);
    }

    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.lang.String, l.᩸ۡܺ] */
    /* JADX INFO: renamed from: ۧ */
    private void m25305() {
        ?? r6;
        char c;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        C4678 c4678;
        boolean z;
        int i3 = this.f30376;
        int[] iArrM34734 = C15268.m34734(i3);
        int i4 = 0;
        C15268.m34739(0, iArrM34734);
        C5563 c5563 = this.f30372;
        C24338 c24338M12309 = c5563.m12309();
        C12054 c12054M12298 = c5563.m12298(0);
        C15600 c15600M53653 = c5563.mo12299().m53653();
        int size = c15600M53653.size();
        C4678 c4679 = new C4678(size + 1);
        int i5 = 0;
        int iM22291 = 0;
        while (i5 < size) {
            C9566 c9566M56515get = c15600M53653.m56515get(i5);
            C13610 c13610M53702 = c24338M12309.m53702(i4, iM22291);
            C24338 c24338 = c24338M12309;
            int i6 = i5;
            c4679.m43246(i6, (AbstractC17417) new C7360(C14065.m31921(c9566M56515get), c12054M12298, c13610M53702 == null ? C22783.m50968(iM22291, c9566M56515get) : C22783.m50973(iM22291, c9566M56515get, c13610M53702.m30963()), C21442.f67643, C4873.m10335(iM22291)));
            iM22291 = c9566M56515get.m22291() + iM22291;
            i5 = i6 + 1;
            c24338M12309 = c24338;
            i4 = 0;
        }
        C5348 c5348 = C14065.f39817;
        C21442 c21442 = C21442.f67643;
        c4679.m43246(size, (AbstractC17417) new C3336(c5348, c12054M12298, (C22783) null, c21442));
        c4679.mo22326();
        boolean zM25310 = m25310();
        int iM25291 = zM25310 ? m25291(-4) : 0;
        C18088 c18088 = new C18088(m25291(-1), c4679, C22388.m50240(iM25291), iM25291);
        C22388 c22388 = C22388.f70620;
        m25300(c18088, c22388);
        int i7 = this.f30382;
        if (zM25310) {
            int iM12302 = c5563.m12302() + i7;
            if (iM12302 < 1) {
                iM12302 = 1;
            }
            C22783 c22783M50968 = C22783.m50968(iM12302, C9566.f26324);
            if (m25312()) {
                C13395 c13395 = new C13395(C14065.f39712, c12054M12298, c21442, C15600.f44675, c5563.mo12304());
                C4678 c46710 = new C4678(1);
                c46710.m43246(0, (AbstractC17417) c13395);
                c4678 = c46710;
                z = false;
                i = 1;
            } else {
                c4678 = new C4678(2);
                c4678.m43246(0, (AbstractC17417) new C7360(C14065.f39818, c12054M12298, c22783M50968, c21442, C4873.f11117));
                z = false;
                i = 1;
                c4678.m43246(1, (AbstractC17417) new C3336(c5348, c12054M12298, (C22783) null, c21442));
            }
            int iM25292 = m25291(-5);
            c4678.mo22326();
            m25300(new C18088(iM25291, c4678, C22388.m50240(iM25292), iM25292), c22388);
            C4678 c46711 = new C4678(m25312() ? 2 : 1);
            if (m25312()) {
                c46711.m43246(0, (AbstractC17417) new C3336(C14065.m31923(c22783M50968), c12054M12298, c22783M50968, c21442));
            }
            c46711.m43246(m25312() ? 1 : 0, (AbstractC17417) new C24123(C14065.f39812, c12054M12298, C21442.m48568(c22783M50968), C15600.f44675));
            c46711.mo22326();
            c = 0;
            m25300(new C18088(iM25292, c46711, C22388.m50240(0), 0), c22388);
            r6 = z;
        } else {
            i3 = i3;
            iArrM34734 = iArrM34734;
            i7 = i7;
            r6 = 0;
            c = 0;
            i = 1;
        }
        C24318 c24318Mo12299 = c5563.mo12299();
        C14280[] c14280Arr = this.f30377;
        c14280Arr[c].m32821(c24318Mo12299.m53653());
        c14280Arr[c].m32825();
        int[] iArr = iArrM34734;
        int i8 = 0;
        while (true) {
            int iM34735 = C15268.m34735(i8, iArr);
            if (iM34735 < 0) {
                break;
            }
            int i9 = i3;
            int i10 = i7;
            C15268.m34732(iM34735, iArr);
            try {
                m25296(this.f30369.m17490(iM34735), c14280Arr[iM34735], iArr);
                i8 = 0;
                i = 1;
                i3 = i9;
                i7 = i10;
            } catch (C4933 e) {
                e.m23570("...while working on block ".concat(C16351.m37153(iM34735)));
                throw e;
            }
        }
        C17672 c17672 = this.f30379;
        C5348 c5348M40199 = c17672.m40199();
        if (c5348M40199 == null) {
            i2 = i7;
        } else {
            C12054 c12054M40188 = c17672.m40188();
            int iM25293 = m25291(-2);
            if (m25310()) {
                C4678 c46712 = new C4678(i);
                C5348 c5349 = C14065.f39806;
                i2 = i7;
                int iM12303 = c5563.m12302() + i2;
                if (iM12303 < i) {
                    iM12303 = 1;
                }
                c46712.m43246(i8, (AbstractC17417) new C24123(c5349, c12054M40188, C21442.m48568(C22783.m50968(iM12303, C9566.f26324)), C15600.f44675));
                c46712.mo22326();
                int iM25294 = m25291(-3);
                m25300(new C18088(iM25293, c46712, C22388.m50240(iM25294), iM25294), C22388.f70620);
                iM25293 = iM25294;
            } else {
                i2 = i7;
            }
            C4678 c46713 = new C4678(i);
            InterfaceC12548 interfaceC12548M11602 = c5348M40199.m11602();
            c46713.m43246(i8, (AbstractC17417) new C3336(c5348M40199, c12054M40188, (C22783) r6, interfaceC12548M11602.size() == 0 ? C21442.f67643 : C21442.m48568(C22783.m50968(i8, interfaceC12548M11602.getType(i8)))));
            c46713.mo22326();
            C22388 c22389 = C22388.f70620;
            m25300(new C18088(iM25293, c46713, c22389, -1), c22389);
        }
        if (this.f30371) {
            C12054 c12054M12299 = c5563.m12298(i8);
            C9566 c9566 = C9566.f26315;
            C22783 c22783M50969 = C22783.m50968(i8, c9566);
            C4678 c46714 = new C4678(2);
            c9566.getClass();
            C15600 c15600 = C15600.f44675;
            c46714.m43246(i8, (AbstractC17417) new C3336(new C5348(4, c9566, c15600, r6), c12054M12299, c22783M50969, C21442.f67643));
            C5348 c53410 = C14065.f39806;
            int iM12304 = c5563.m12302() + i2;
            if (iM12304 < i) {
                iM12304 = 1;
            }
            c46714.m43246(i, (AbstractC17417) new C24123(c53410, c12054M12299, C21442.m48568(C22783.m50968(iM12304, C9566.f26324)), c15600));
            c46714.mo22326();
            int iM25295 = m25291(-7);
            C18088 c18089 = new C18088(m25291(-6), c46714, C22388.m50240(iM25295), iM25295);
            C22388 c223810 = C22388.f70620;
            m25300(c18089, c223810);
            C4678 c46715 = new C4678(i);
            c46715.m43246(i8, (AbstractC17417) new C24123(C14065.f39685, c12054M12299, C21442.m48568(c22783M50969), c15600));
            c46715.mo22326();
            m25300(new C18088(iM25295, c46715, c223810, -1), c223810);
        }
        C19014[] c19014Arr = this.f30375;
        int length = c19014Arr.length;
        for (int i11 = 0; i11 < length; i11++) {
            C19014 c19014 = c19014Arr[i11];
            if (c19014 != null) {
                for (C16331 c16331 : c19014.m43185()) {
                    C12054 c12054M39652 = m25303(i11).m41140().m39652();
                    C4678 c46716 = new C4678(2);
                    C9566 c9566M37135 = c16331.m37135();
                    c9566M37135.getClass();
                    C5348 c53411 = new C5348(4, c9566M37135, C15600.f44675, r6);
                    C22783 c22783M509610 = C22783.m50968(i2, c16331.m37135());
                    C21442 c21443 = C21442.f67643;
                    c46716.m43246(0, (AbstractC17417) new C3336(c53411, c12054M39652, c22783M509610, c21443));
                    c46716.m43246(1, (AbstractC17417) new C3336(C14065.f39817, c12054M39652, (C22783) r6, c21443));
                    c46716.mo22326();
                    m25300(new C18088(c16331.m37136(), c46716, C22388.m50240(i11), i11), c14280Arr[i11].m32826());
                }
            }
        }
        if (!this.f30380) {
            return;
        }
        C22388 c223811 = new C22388(4);
        int i12 = i3;
        m25299(m25303(0), new C18343(this, c223811), new BitSet(i12));
        int iM25307 = m25307();
        ArrayList arrayList3 = new ArrayList(iM25307);
        for (int i13 = 0; i13 < iM25307; i13++) {
            arrayList3.add(r6);
        }
        int i14 = 0;
        while (true) {
            arrayList = this.f30381;
            int size2 = arrayList.size();
            arrayList2 = this.f30374;
            if (i14 >= size2) {
                break;
            }
            C18088 c180810 = (C18088) arrayList.get(i14);
            if (c180810 != null) {
                arrayList3.set(c180810.mo4636(), (C22388) arrayList2.get(i14));
            }
            i14++;
        }
        int size3 = c223811.size();
        for (int i15 = 0; i15 < size3; i15++) {
            new C11639(this, new C8956(m25307()), arrayList3).m26748(m25303(c223811.get(i15)));
        }
        C22388 c223812 = new C22388(arrayList.size());
        arrayList2.clear();
        m25299(m25303(m25291(-1)), new C19685(c223812), new BitSet(i12));
        c223812.m50244();
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                return;
            }
            int iM50242 = c223812.m50242(((C18088) arrayList.get(size4)).mo4636());
            if (iM50242 < 0) {
                iM50242 = -1;
            }
            if (iM50242 < 0) {
                arrayList.remove(size4);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25296(C2880 c2880, C14280 c14280, int[] iArr) {
        int size;
        C22368 c22368;
        int i;
        C22388 c22388M50243;
        int i2;
        int i3;
        C12054 c12054M39652;
        C22388 c22388M50240;
        C10257 c10257M4637 = c2880.m4637();
        C15600 c15600M23870 = c10257M4637.m23870();
        C17672 c17672 = this.f30379;
        c17672.m40190(c15600M23870);
        C14280 c14280M32814 = c14280.m32814();
        this.f30373.m45947(c2880, c14280M32814);
        c14280M32814.m32825();
        int iM40197 = c17672.m40197();
        ArrayList arrayListM40191 = c17672.m40191();
        int size2 = arrayListM40191.size();
        int size3 = c10257M4637.size();
        C22388 c22388M4639 = c2880.m4639();
        boolean zM40193 = c17672.m40193();
        C22368[] c22368Arr = this.f30370;
        if (zM40193) {
            int i4 = c22388M4639.get(1);
            if (c22368Arr[i4] == null) {
                c22368Arr[i4] = new C22368(this, i4);
            }
            c22368Arr[i4].m50209(c2880.mo4636());
            c22368 = c22368Arr[i4];
            size = 1;
        } else {
            if (c17672.m40189()) {
                int iM29752 = c17672.m40198().m29752();
                C22368 c22369 = c22368Arr[iM29752];
                if (c22369 == null) {
                    int iMo4636 = c2880.mo4636();
                    C22368 c223610 = new C22368(this, iM29752);
                    c223610.m50212(iMo4636);
                    c22368Arr[iM29752] = c223610;
                } else {
                    c22369.m50212(c2880.mo4636());
                }
                C22388 c22388M50211 = c22368Arr[iM29752].m50211();
                c22368Arr[iM29752].m50210(c14280M32814, iArr);
                size = c22388M50211.size();
                c22388M4639 = c22388M50211;
            } else {
                size = c17672.m40196() ? size3 : 0;
            }
            c22368 = null;
        }
        C22388 c22388 = c22388M4639;
        C22368 c223611 = c22368;
        int size4 = c22388.size();
        int i5 = size;
        while (i5 < size4) {
            int i6 = c22388.get(i5);
            try {
                int i7 = i5;
                int i8 = size4;
                C22388 c22389 = c22388;
                m25295(i6, c2880.mo4636(), c223611, c14280M32814, iArr);
                i5 = i7 + 1;
                size4 = i8;
                c22388 = c22389;
            } catch (C4933 e) {
                e.m23570("...while merging to block ".concat(C16351.m37153(i6)));
                throw e;
            }
        }
        int i9 = size4;
        C22388 c223810 = c22388;
        if (i9 == 0 && c17672.m40194()) {
            c22388M50243 = C22388.m50240(m25291(-2));
            i = 1;
        } else {
            i = i9;
            c22388M50243 = c223810;
        }
        if (i == 0) {
            i2 = -1;
        } else {
            int iM40192 = c17672.m40192();
            if (iM40192 >= 0) {
                iM40192 = c22388M50243.get(iM40192);
            }
            i2 = iM40192;
        }
        boolean z = m25310() && c17672.m40195();
        if (z || size3 != 0) {
            C22388 c223811 = new C22388(i);
            boolean z2 = false;
            int i10 = 0;
            while (i10 < size3) {
                C3551 c3551M56511get = c10257M4637.m56511get(i10);
                C14260 c14260M6331 = c3551M56511get.m6331();
                int iM6332 = c3551M56511get.m6332();
                boolean z3 = (c14260M6331 == C14260.f40621) | z2;
                try {
                    C10257 c10257 = c10257M4637;
                    int i11 = i2;
                    int i12 = i10;
                    C22388 c223812 = c223811;
                    m25295(iM6332, c2880.mo4636(), null, c14280M32814.m32816(c14260M6331), iArr);
                    C19014[] c19014Arr = this.f30375;
                    C19014 c19014 = c19014Arr[iM6332];
                    if (c19014 == null) {
                        c19014 = new C19014(this);
                        c19014Arr[iM6332] = c19014;
                    }
                    c223812.add(c19014.m43186(c14260M6331.m32771()).m37136());
                    i10 = i12 + 1;
                    i2 = i11;
                    c223811 = c223812;
                    z2 = z3;
                    c10257M4637 = c10257;
                } catch (C4933 e2) {
                    e2.m23570("...while merging exception to block ".concat(C16351.m37153(iM6332)));
                    throw e2;
                }
            }
            i3 = i2;
            C22388 c223813 = c223811;
            if (z && !z2) {
                c223813.add(m25291(-6));
                this.f30371 = true;
                for (int i13 = (size2 - iM40197) - 1; i13 < size2; i13++) {
                    AbstractC17417 abstractC17417 = (AbstractC17417) arrayListM40191.get(i13);
                    if (abstractC17417.m39653()) {
                        arrayListM40191.set(i13, abstractC17417.mo5816(C9566.f26324));
                    }
                }
            }
            if (i3 >= 0) {
                c223813.add(i3);
            }
            c223813.mo22326();
            c22388M50243 = c223813;
        } else {
            i3 = i2;
        }
        int iM50242 = c22388M50243.m50242(i3);
        if (iM50242 < 0) {
            iM50242 = -1;
        }
        int i14 = i3;
        while (iM40197 > 0) {
            size2--;
            AbstractC17417 abstractC17418 = (AbstractC17417) arrayListM40191.get(size2);
            boolean z4 = abstractC17418.m39656().m11601() == 1;
            C4678 c4678 = new C4678(z4 ? 2 : 1);
            c4678.m43246(0, abstractC17418);
            if (z4) {
                c4678.m43246(1, (AbstractC17417) new C3336(C14065.f39817, abstractC17418.m39652(), (C22783) null, C21442.f67643));
                c22388M50240 = C22388.m50240(i14);
            } else {
                c22388M50240 = c22388M50243;
            }
            c4678.mo22326();
            int iM25307 = m25307();
            m25300(new C18088(iM25307, c4678, c22388M50240, i14), c14280M32814.m32826());
            c22388M50243 = c22388M50243.m50243();
            c22388M50243.set(iM50242, iM25307);
            c22388M50243.mo22326();
            iM40197--;
            i14 = iM25307;
        }
        AbstractC17417 abstractC17419 = size2 == 0 ? null : (AbstractC17417) arrayListM40191.get(size2 - 1);
        if (abstractC17419 == null || abstractC17419.m39656().m11601() == 1) {
            if (abstractC17419 == null) {
                c12054M39652 = C12054.f33582;
            } else {
                c12054M39652 = abstractC17419.m39652();
            }
            arrayListM40191.add(new C3336(C14065.f39817, c12054M39652, (C22783) null, C21442.f67643));
            size2++;
        }
        C4678 c4679 = new C4678(size2);
        for (int i15 = 0; i15 < size2; i15++) {
            c4679.m43246(i15, (AbstractC17417) arrayListM40191.get(i15));
        }
        c4679.mo22326();
        C18088 c18088 = new C18088(c2880.mo4636(), c4679, c22388M50243, i14);
        C22388 c22388M32826 = c14280M32814.m32826();
        int iM25308 = m25308(c18088.mo4636());
        if (iM25308 >= 0) {
            m25311(iM25308);
        }
        this.f30381.add(c18088);
        c22388M32826.m45999();
        this.f30374.add(c22388M32826);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m25295(int i, int i2, C22368 c22368, C14280 c14280, int[] iArr) {
        C14280 c14280M32817;
        C14280[] c14280Arr = this.f30377;
        C14280 c14281 = c14280Arr[i];
        if (c14281 == null) {
            if (c22368 != null) {
                c14280Arr[i] = c14280.m32815(i, i2);
            } else {
                c14280Arr[i] = c14280;
            }
            C15268.m34739(i, iArr);
            return;
        }
        if (c22368 != null) {
            c14280M32817 = c14281.m32818(c14280, c22368.m50208(), i2);
        } else {
            c14280M32817 = c14281.m32817(c14280);
        }
        if (c14280M32817 != c14281) {
            c14280Arr[i] = c14280M32817;
            C15268.m34739(i, iArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m25301(C10968 c10968, C18088 c18088) {
        C22388 c22388M41137 = c18088.m41137();
        if (c22388M41137.size() < 2) {
            return false;
        }
        int i = c22388M41137.get(1);
        C22368[] c22368Arr = c10968.f30370;
        return i < c22368Arr.length && c22368Arr[i] != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22368 m25304(C10968 c10968, int i) {
        C22368[] c22368Arr = c10968.f30370;
        int length = c22368Arr.length;
        while (true) {
            length--;
            if (length < 0) {
                return null;
            }
            C22368 c22368 = c22368Arr[length];
            if (c22368 != null && c22368.f70584.get(i)) {
                return c22368;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private void m25299(C18088 c18088, InterfaceC12725 interfaceC12725, BitSet bitSet) {
        int iM25308;
        interfaceC12725.mo29261(c18088);
        bitSet.set(c18088.mo4636());
        C22388 c22388M41137 = c18088.m41137();
        int size = c22388M41137.size();
        for (int i = 0; i < size; i++) {
            int i2 = c22388M41137.get(i);
            if (!bitSet.get(i2)) {
                C22388 c22388M41138 = c18088.m41137();
                if (c22388M41138.size() >= 2) {
                    int i3 = c22388M41138.get(1);
                    C22368[] c22368Arr = this.f30370;
                    if (i3 >= c22368Arr.length || c22368Arr[i3] == null || i <= 0) {
                        iM25308 = m25308(i2);
                        if (iM25308 >= 0) {
                            m25299((C18088) this.f30381.get(iM25308), interfaceC12725, bitSet);
                        }
                    }
                } else {
                    iM25308 = m25308(i2);
                    if (iM25308 >= 0) {
                        m25299((C18088) this.f30381.get(iM25308), interfaceC12725, bitSet);
                    }
                }
            }
        }
    }
}
