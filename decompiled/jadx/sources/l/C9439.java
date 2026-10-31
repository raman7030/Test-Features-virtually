package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9439 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f28621;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23549 f28622;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6616 f28623;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17199 f28624;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f28625 = C13132.FOREVER_NS;

    public C9439(InterfaceC7505 interfaceC7505) {
        this.f28624 = new C17199(interfaceC7505);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:64:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x018b  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01da  */
    /* JADX WARN: Code duplicated, block: B:86:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [l.ۖ۟ۜ] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [l.ۖ۟ۜ] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r4v33, types: [l.᩷᩷ۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21125 m24265() {
        C23549 c23549;
        C23549 c235410;
        long jM1573;
        long jM1574;
        int i;
        ArrayList arrayListM18140;
        ArrayList arrayListM18141;
        C2383 c2383;
        ?? r1;
        List<C8733> list;
        C23549 c235411;
        ?? r19;
        int i2;
        int[] iArr;
        long[] jArr;
        HashMap map;
        ?? r110;
        int i3;
        int[] iArr2;
        long[] jArr2;
        HashMap map2;
        ?? r111;
        int i4;
        Iterator it;
        HashMap map3;
        long j;
        C23549 c235412;
        long[] jArr3;
        long[] jArr4;
        Iterator it2;
        C2383 c2384;
        C17199 c17199 = this.f28624;
        this.f28621 = C17199.m40461(c17199);
        this.f28625 = C13132.FOREVER_NS;
        C6616 c6616M24269 = m24269();
        this.f28623 = c6616M24269;
        if (c6616M24269 == null || C6616.m18145(c6616M24269)) {
            return null;
        }
        long j2 = this.f28621;
        int i5 = 1;
        if (j2 >= 16) {
            C17905 c17905M24263 = m24263(j2 - 16, j2);
            if (c17905M24263.f54673 == C0265.f1555 && c17905M24263.f54676 == 16) {
                long j3 = c17905M24263.f54671;
                long j4 = this.f28621;
                if (j3 != j4) {
                    c23549 = null;
                } else {
                    long jM1575 = C0265.m1573(0, C17199.m40462(c17199, j4 - 4, 4));
                    if (jM1575 <= 0 || jM1575 > 4194304) {
                        c23549 = null;
                    } else {
                        long j5 = this.f28621;
                        if (jM1575 > j5) {
                            c23549 = null;
                        } else {
                            long j6 = j5 - jM1575;
                            C17905 c17905M24264 = m24263(j6, j5);
                            if (c17905M24264.f54673 == C0265.f1553 && c17905M24264.f54671 == this.f28621) {
                                byte[] bArrM40462 = C17199.m40462(c17199, c17905M24264.f54674, (int) C17905.m41886(c17905M24264));
                                C23549 c235413 = new C23549(j6);
                                int i6 = 4096;
                                int i7 = 2;
                                for (C16493 c16493 : C0265.m1556(0, bArrM40462.length, bArrM40462)) {
                                    if (c16493.f50689 == C0265.f1586) {
                                        int i8 = c16493.f50688;
                                        int i9 = bArrM40462[i8] & 255;
                                        if (i9 != 0 && i9 != i5) {
                                            throw new C19317();
                                        }
                                        int iM1569 = C0265.m1569(i8 + 4, bArrM40462);
                                        byte b = bArrM40462[i8 + 11];
                                        int i10 = b & 255;
                                        int i11 = ((i10 >> 4) & 3) + 1;
                                        int i12 = ((i10 >> i7) & 3) + i5;
                                        int i13 = (b & 3) + i5;
                                        int iM15610 = C0265.m1569(i8 + 12, bArrM40462);
                                        int i14 = i8 + 16;
                                        if (iM15610 < 0 || iM15610 > i6) {
                                            throw new C19317();
                                        }
                                        List list2 = (List) C13843.computeIfAbsent(c235413.f75604, Integer.valueOf(iM1569), new C8069(1));
                                        int i15 = 0;
                                        while (i15 < iM15610) {
                                            if (i9 == i5) {
                                                jM1573 = C0265.m1562(i14, bArrM40462);
                                                jM1574 = C0265.m1562(i14 + 8, bArrM40462);
                                                i = i14 + 16;
                                            } else {
                                                jM1573 = C0265.m1573(i14, bArrM40462);
                                                jM1574 = C0265.m1573(i14 + 4, bArrM40462);
                                                i = i14 + 8;
                                            }
                                            long j7 = jM1573;
                                            long j8 = jM1574;
                                            int iM1572 = C0265.m1572(i, i11, bArrM40462);
                                            int i16 = i + i11;
                                            int iM1573 = C0265.m1572(i16, i12, bArrM40462);
                                            int i17 = i16 + i12;
                                            int iM1574 = C0265.m1572(i17, i13, bArrM40462);
                                            i14 = i17 + i13;
                                            if (j7 < 0 || j8 < 0 || iM1572 <= 0 || iM1573 <= 0 || iM1574 <= 0) {
                                                throw new C19317();
                                            }
                                            list2.add(new C8733(j7, iM1572 - 1, iM1573 - 1, iM1574 - 1, j8));
                                            i15++;
                                            i5 = 1;
                                        }
                                    }
                                    i6 = 4096;
                                    i7 = 2;
                                    i5 = 1;
                                }
                                c23549 = c235413;
                            } else {
                                c23549 = null;
                            }
                        }
                    }
                }
            } else {
                c23549 = null;
            }
            c235410 = c23549;
            this.f28622 = c23549;
            if (c23549 == null) {
                r1 = c2383;
                r1 = c2384;
                r1 = c2384;
                r1 = c2384;
                r1 = c2384;
                c235411 = c235410;
            } else {
                arrayListM18140 = C6616.m18140(this.f28623, 1);
                if (!arrayListM18140.isEmpty()) {
                    arrayListM18141 = C6616.m18140(this.f28623, 2);
                    if (arrayListM18141.size() == 1 || !m24268((C2383) arrayListM18141.get(0))) {
                        r1 = c235410;
                    } else {
                        c2383 = (C2383) arrayListM18141.get(0);
                    }
                } else if (arrayListM18140.size() == 1 || !m24268((C2383) arrayListM18140.get(0))) {
                    r1 = c235410;
                } else {
                    c2384 = (C2383) arrayListM18140.get(0);
                }
                if (r1 == 0) {
                    r1 = c2383;
                    r1 = c2384;
                    r1 = c2384;
                    r1 = c2384;
                    r1 = c2384;
                    c235411 = c235410;
                } else {
                    r1 = c2383;
                    list = (List) this.f28622.f75604.get(Integer.valueOf(r1.f7592));
                    if (list != null || list.isEmpty() || list.size() > 4096) {
                        r1 = c2383;
                        r1 = c2384;
                        r1 = c2384;
                        r1 = c2384;
                        r1 = c2384;
                        c235411 = c235410;
                    } else {
                        r1 = c2384;
                        ArrayList arrayList = new ArrayList();
                        long j9 = Long.MIN_VALUE;
                        long j10 = Long.MIN_VALUE;
                        for (C8733 c8733 : list) {
                            if (c8733.f26583 <= j9 || c8733.f26581 <= 0 || c8733.f26581 >= this.f28622.f75605) {
                                throw new C19317();
                            }
                            if (c8733.f26581 < j10) {
                                throw new C19317();
                            }
                            j9 = c8733.f26583;
                            if (c8733.f26581 != j10) {
                                arrayList.add(c8733);
                                j10 = c8733.f26581;
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C0265.m1555(((C8733) it3.next()).f26583, r1.f7591);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int[] iArr3 = new int[size];
                            long[] jArr5 = new long[size];
                            long[] jArr6 = new long[size];
                            long[] jArr7 = new long[size];
                            HashMap map4 = new HashMap();
                            long jMin = C13132.FOREVER_NS;
                            for (Iterator it4 = this.f28623.m18135().iterator(); it4.hasNext(); it4 = it2) {
                                C2383 c2385 = (C2383) it4.next();
                                if (c2385.f7592 == r1.f7592) {
                                    C8733 c8733M24270 = m24270(c2385);
                                    if (c8733M24270 == null) {
                                        throw new C19317();
                                    }
                                    c235412 = c235410;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    map4.put(Integer.valueOf(c2385.f7592), new C15787(c2385, c8733M24270.f26581, 0));
                                    jMin = Math.min(jMin, c8733M24270.f26581);
                                } else {
                                    c235412 = c235410;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    long j11 = c2385.f7593;
                                    if (j11 > 0) {
                                        map4.put(Integer.valueOf(c2385.f7592), C15787.m37244(c2385, j11));
                                    } else {
                                        C8733 c8733M24271 = m24270(c2385);
                                        if (c8733M24271 == null) {
                                            throw new C19317();
                                        }
                                        map4.put(Integer.valueOf(c2385.f7592), new C15787(c2385, c8733M24271.f26581, 0));
                                        jMin = Math.min(jMin, c8733M24271.f26581);
                                    }
                                    c235410 = c235412;
                                    jArr6 = jArr3;
                                    jArr7 = jArr4;
                                }
                                c235410 = c235412;
                                jArr6 = jArr3;
                                jArr7 = jArr4;
                            }
                            c235411 = c235410;
                            long[] jArr8 = jArr6;
                            long[] jArr9 = jArr7;
                            int i18 = 0;
                            ?? r2 = r1;
                            if (jMin != C13132.FOREVER_NS) {
                                while (jMin < this.f28622.f75605) {
                                    C17905 c17905M24265 = m24263(jMin, this.f28622.f75605);
                                    if (c17905M24265.f54673 == C0265.f1581) {
                                        C20728 c20728M24264 = m24264(jMin);
                                        Iterator it5 = map4.values().iterator();
                                        ?? r3 = r2;
                                        while (it5.hasNext()) {
                                            C15787 c15787 = (C15787) it5.next();
                                            if (!C15787.m37248(c15787) || jMin < c15787.f48704) {
                                                r111 = r3;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                            } else {
                                                List list3 = (List) c20728M24264.f66746.get(Integer.valueOf(c15787.f48705.f7592));
                                                if (list3 == null || list3.size() != 1) {
                                                    throw new C19317();
                                                }
                                                C3794 c3794 = (C3794) list3.get(i18);
                                                if (!c3794.f11972) {
                                                    throw new C19317();
                                                }
                                                long j12 = c15787.f48706;
                                                Iterator it6 = ((ArrayList) c3794.f11970).iterator();
                                                long jMax = Long.MIN_VALUE;
                                                ?? r4 = r3;
                                                while (it6.hasNext()) {
                                                    C18611 c18611 = (C18611) it6.next();
                                                    ?? r112 = r4;
                                                    int i19 = size;
                                                    C3794 c3795 = c3794;
                                                    Iterator it7 = it5;
                                                    long jM1535 = C0265.m1535(c3794.f11969, c18611.f57714);
                                                    int i20 = 0;
                                                    while (i20 < c18611.f57715) {
                                                        jMax = Math.max(jMax, C0265.m1535(C0265.m1535(jM1535, c18611.f57712[i20]), c18611.f57717[i20]));
                                                        jM1535 = C0265.m1535(jM1535, c18611.f57717[i20]);
                                                        i20++;
                                                        map4 = map4;
                                                        it6 = it6;
                                                        jMin = jMin;
                                                    }
                                                    r4 = r112;
                                                    size = i19;
                                                    it5 = it7;
                                                    c3794 = c3795;
                                                }
                                                r111 = r4;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                                if (jMax < 0) {
                                                    throw new C19317();
                                                }
                                                c15787.f48706 = Math.max(j12, jMax);
                                                i18 = 0;
                                            }
                                            c20728M24264 = c20728M24264;
                                            r3 = r111;
                                            iArr3 = iArr3;
                                            jArr5 = jArr5;
                                            size = i4;
                                            it5 = it;
                                            map4 = map3;
                                            jMin = j;
                                        }
                                        r110 = r3;
                                        i3 = size;
                                        iArr2 = iArr3;
                                        jArr2 = jArr5;
                                        map2 = map4;
                                    } else {
                                        r110 = r2;
                                        i3 = size;
                                        iArr2 = iArr3;
                                        jArr2 = jArr5;
                                        map2 = map4;
                                        int unused = C0265.f1583;
                                    }
                                    jMin = c17905M24265.f54671;
                                    i18 = 0;
                                    r2 = r110;
                                    iArr3 = iArr2;
                                    jArr5 = jArr2;
                                    size = i3;
                                    map4 = map2;
                                }
                                r19 = r2;
                                i2 = size;
                                iArr = iArr3;
                                jArr = jArr5;
                                map = map4;
                                if (jMin != this.f28622.f75605) {
                                    throw new C19317();
                                }
                            } else {
                                r19 = r1;
                                i2 = size;
                                iArr = iArr3;
                                jArr = jArr5;
                                map = map4;
                            }
                            Iterator it8 = map.values().iterator();
                            long jMax2 = 0;
                            while (it8.hasNext()) {
                                long jM37249 = C15787.m37249((C15787) it8.next());
                                if (jM37249 <= 0) {
                                    throw new C19317();
                                }
                                jMax2 = Math.max(jMax2, jM37249);
                            }
                            int i21 = 0;
                            int i22 = i2;
                            while (i21 < i22) {
                                C8733 c8734 = (C8733) arrayList.get(i21);
                                int i23 = i21 + 1;
                                long j13 = i23 < i22 ? ((C8733) arrayList.get(i23)).f26581 : this.f28622.f75605;
                                long j14 = j13 - c8734.f26581;
                                if (j14 > 0 && j14 <= 2147483647L) {
                                    C20728 c20728M24265 = m24264(c8734.f26581);
                                    if (c8734.f26585 < 0 || c8734.f26585 >= c20728M24265.f66747.size()) {
                                        throw new C19317();
                                    }
                                    C3794 c3796 = (C3794) c20728M24265.f66747.get(c8734.f26585);
                                    if (c3796.f11976 != r19.f7592) {
                                        throw new C19317();
                                    }
                                    List list4 = (List) c20728M24265.f66746.get(Integer.valueOf(r19.f7592));
                                    if (list4 == null || list4.size() != 1) {
                                        throw new C19317();
                                    }
                                    if (c8734.f26584 < 0 || c8734.f26584 >= ((ArrayList) c3796.f11970).size()) {
                                        throw new C19317();
                                    }
                                    C18611 c18612 = (C18611) ((ArrayList) c3796.f11970).get(c8734.f26584);
                                    if (c8734.f26582 < 0 || c8734.f26582 >= c18612.f57715) {
                                        throw new C19317();
                                    }
                                    m24267(c3796, c8734.f26581, j13);
                                    if (!c18612.f57718[c8734.f26582]) {
                                        throw new C19317();
                                    }
                                    jArr[i21] = c8734.f26581;
                                    iArr[i21] = (int) j14;
                                    long jM1555 = C0265.m1555(c8734.f26583, r19.f7591);
                                    jArr8[i21] = jM1555;
                                    if (i21 <= 0 || jM1555 > jArr8[i21 - 1]) {
                                        i21 = i23;
                                    }
                                }
                            }
                            int i24 = 0;
                            while (i24 < i22) {
                                int i25 = i24 + 1;
                                long j15 = (i25 < i22 ? jArr8[i25] : jMax2) - jArr8[i24];
                                if (j15 > 0) {
                                    jArr9[i24] = j15;
                                    i24 = i25;
                                }
                            }
                            return new C21125(iArr, jArr, jArr9, jArr8);
                        }
                        r1 = c2383;
                        r1 = c2384;
                        r1 = c2384;
                        r1 = c2384;
                        r1 = c2384;
                        c235411 = c235410;
                    }
                }
            }
            return c235411;
        }
        c23549 = null;
        c235410 = null;
        this.f28622 = c23549;
        if (c23549 == null) {
            r1 = c2383;
            r1 = c2384;
            r1 = c2384;
            r1 = c2384;
            r1 = c2384;
            c235411 = c235410;
        } else {
            arrayListM18140 = C6616.m18140(this.f28623, 1);
            if (!arrayListM18140.isEmpty()) {
                arrayListM18141 = C6616.m18140(this.f28623, 2);
                if (arrayListM18141.size() == 1) {
                    r1 = c235410;
                } else {
                    r1 = c235410;
                }
            } else if (arrayListM18140.size() == 1) {
                r1 = c235410;
            } else {
                r1 = c235410;
            }
            if (r1 == 0) {
                r1 = c2383;
                r1 = c2384;
                r1 = c2384;
                r1 = c2384;
                r1 = c2384;
                c235411 = c235410;
            } else {
                r1 = c2383;
                list = (List) this.f28622.f75604.get(Integer.valueOf(r1.f7592));
                if (list != null) {
                    r1 = c2383;
                    r1 = c2384;
                    r1 = c2384;
                    r1 = c2384;
                    r1 = c2384;
                    c235411 = c235410;
                } else {
                    r1 = c2383;
                    r1 = c2384;
                    r1 = c2384;
                    r1 = c2384;
                    r1 = c2384;
                    c235411 = c235410;
                }
            }
        }
        return c235411;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10850 m24271(C9439 c9439) {
        C21125 c21125M24265 = c9439.m24265();
        if (c21125M24265 == null || c21125M24265.f68134 == 0) {
            return null;
        }
        long j = c21125M24265.f68136[0];
        if (j <= 0 || j > 16777216) {
            return null;
        }
        return new C10850(c21125M24265, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5205 m24262(C9439 c9439, long j) {
        List list;
        ArrayList arrayList;
        long j2;
        C9439 c94310 = c9439;
        long j3 = j;
        long jM40461 = C17199.m40461(c94310.f28624);
        c94310.f28621 = jM40461;
        if (j3 <= 0 || j3 >= jM40461 || j3 > 16777216) {
            return null;
        }
        c94310.f28625 = j3;
        C6616 c6616M24269 = c9439.m24269();
        c94310.f28623 = c6616M24269;
        if (c6616M24269 == null || C6616.m18145(c6616M24269)) {
            return null;
        }
        ArrayList arrayListM18140 = C6616.m18140(c94310.f28623, 1);
        if (arrayListM18140.size() != 1) {
            return null;
        }
        C2383 c2383 = (C2383) arrayListM18140.get(0);
        c94310.f28622 = new C23549(c94310.f28621);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            long j4 = c94310.f28621;
            if (j3 < j4) {
                C17905 c17905M24263 = c94310.m24263(j3, j4);
                if (c17905M24263.f54673 == C0265.f1581) {
                    arrayList2.add(Long.valueOf(j3));
                } else if (c17905M24263.f54673 == C0265.f1583) {
                    arrayList3.add(c17905M24263);
                } else if (c17905M24263.f54673 != C0265.f1568) {
                    return null;
                }
                j3 = c17905M24263.f54671;
            } else {
                if (j3 != j4 || arrayList2.isEmpty()) {
                    return null;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                long j5 = Long.MIN_VALUE;
                int i = 0;
                while (i < arrayList2.size()) {
                    Long l2 = (Long) arrayList2.get(i);
                    long jLongValue = l2.longValue();
                    int i2 = i + 1;
                    long jLongValue2 = i2 < arrayList2.size() ? ((Long) arrayList2.get(i2)).longValue() : c94310.f28621;
                    long j6 = j5;
                    long j7 = jLongValue2 - jLongValue;
                    if (j7 <= 0 || j7 > 2147483647L || (list = (List) c94310.m24264(jLongValue).f66746.get(Integer.valueOf(c2383.f7592))) == null) {
                        return null;
                    }
                    ArrayList arrayList7 = arrayList2;
                    if (list.size() != 1) {
                        return null;
                    }
                    C3794 c3794 = (C3794) list.get(0);
                    if (!c3794.f11972 || !c3794.f11974) {
                        return null;
                    }
                    m24267(c3794, jLongValue, jLongValue2);
                    Iterator it = ((ArrayList) c3794.f11970).iterator();
                    while (it.hasNext()) {
                        C18611 c18611 = (C18611) it.next();
                        Iterator it2 = it;
                        ArrayList arrayList8 = arrayList6;
                        int i3 = 0;
                        long j8 = j7;
                        long j9 = c18611.f57713;
                        while (i3 < c18611.f57715) {
                            int i4 = i2;
                            long jM1535 = C0265.m1535(j9, c18611.f57716[i3]);
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    throw new C19317();
                                }
                                C17905 c17905 = (C17905) it3.next();
                                if (c17905.f54675 < jLongValue || c17905.f54671 > jLongValue2 || j9 < c17905.f54674 || jM1535 > c17905.f54671) {
                                }
                            }
                            i3++;
                            j9 = jM1535;
                            i2 = i4;
                        }
                        arrayList6 = arrayList8;
                        j7 = j8;
                        it = it2;
                    }
                    ArrayList arrayList9 = arrayList6;
                    long j10 = j7;
                    int i5 = i2;
                    Iterator it4 = ((ArrayList) c3794.f11970).iterator();
                    j5 = j6;
                    while (it4.hasNext()) {
                        C18611 c18612 = (C18611) it4.next();
                        ArrayList arrayList10 = arrayList3;
                        long jM1536 = C0265.m1535(c3794.f11969, c18612.f57714);
                        int i6 = 0;
                        while (i6 < c18612.f57715) {
                            if (c18612.f57718[i6]) {
                                long jM1555 = C0265.m1555(C0265.m1535(jM1536, c18612.f57712[i6]), c2383.f7591);
                                if (jM1555 <= j5) {
                                    return null;
                                }
                                arrayList4.add(Long.valueOf(jM1555));
                                arrayList5.add(l2);
                                j2 = j10;
                                arrayList = arrayList9;
                                arrayList.add(Integer.valueOf((int) j2));
                                j5 = jM1555;
                            } else {
                                arrayList = arrayList9;
                                j2 = j10;
                            }
                            jM1536 = C0265.m1535(jM1536, c18612.f57717[i6]);
                            i6++;
                            it4 = it4;
                            j10 = j2;
                            c2383 = c2383;
                            arrayList9 = arrayList;
                        }
                        arrayList3 = arrayList10;
                    }
                    c94310 = c9439;
                    arrayList6 = arrayList9;
                    arrayList2 = arrayList7;
                    i = i5;
                }
                ArrayList arrayList11 = arrayList6;
                if (arrayList4.isEmpty()) {
                    return null;
                }
                int size = arrayList4.size();
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                int[] iArr = new int[size];
                for (int i7 = 0; i7 < size; i7++) {
                    jArr[i7] = ((Long) arrayList4.get(i7)).longValue();
                    jArr2[i7] = ((Long) arrayList5.get(i7)).longValue();
                    iArr[i7] = ((Integer) arrayList11.get(i7)).intValue();
                }
                return new C5205(jArr, jArr2, iArr);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C6616 m24269() {
        long jMin = Math.min(Math.min(this.f28621, 16777216L), this.f28625);
        long j = 0;
        while (j < jMin) {
            C17905 c17905M24263 = m24263(j, this.f28621);
            if (c17905M24263.f54673 == C0265.f1561) {
                return null;
            }
            if (c17905M24263.f54673 == C0265.f1549) {
                if (C17905.m41886(c17905M24263) > 4194304) {
                    return null;
                }
                byte[] bArrM40462 = C17199.m40462(this.f28624, c17905M24263.f54674, (int) C17905.m41886(c17905M24263));
                C6616 c6616 = new C6616();
                int i = 0;
                for (C16493 c16493 : C0265.m1556(0, bArrM40462.length, bArrM40462)) {
                    int i2 = 1;
                    if (c16493.f50689 == C0265.f1550) {
                        int i3 = c16493.f50688;
                        int i4 = bArrM40462[i3] & 255;
                        if (i4 != 0 && i4 != 1) {
                            throw new C19317();
                        }
                        if (i4 == 1) {
                            c6616.f20371 = C0265.m1573(i3 + 20, bArrM40462);
                        } else {
                            c6616.f20371 = C0265.m1573(i3 + 12, bArrM40462);
                        }
                    } else if (c16493.f50689 == C0265.f1552) {
                        C2383 c2383 = new C2383(i);
                        for (C16493 c16494 : C0265.m1556(c16493.f50688, c16493.f50687, bArrM40462)) {
                            int i5 = 8;
                            int i6 = 4;
                            if (c16494.f50689 == C0265.f1570) {
                                int i7 = c16494.f50688;
                                int i8 = bArrM40462[i7] & 255;
                                if (i8 != 0 && i8 != i2) {
                                    throw new C19317();
                                }
                                if (i8 == i2) {
                                    c2383.f7592 = C0265.m1569(i7 + 20, bArrM40462);
                                    c2383.f7595 = C0265.m1567(i7 + 28, 8, bArrM40462);
                                } else {
                                    c2383.f7592 = C0265.m1569(i7 + 12, bArrM40462);
                                    c2383.f7595 = C0265.m1567(i7 + 20, 4, bArrM40462);
                                }
                            } else if (c16494.f50689 == C0265.f1562) {
                                for (C16493 c16495 : C0265.m1556(c16494.f50688, c16494.f50687, bArrM40462)) {
                                    if (c16495.f50689 == C0265.f1563) {
                                        int i9 = c16495.f50688;
                                        int i10 = bArrM40462[i9] & 255;
                                        if (i10 != 0 && i10 != i2) {
                                            throw new C19317();
                                        }
                                        if (i10 == i2) {
                                            c2383.f7591 = C0265.m1573(i9 + 20, bArrM40462);
                                            c2383.f7594 = C0265.m1567(i9 + 24, i5, bArrM40462);
                                        } else {
                                            c2383.f7591 = C0265.m1573(i9 + 12, bArrM40462);
                                            c2383.f7594 = C0265.m1567(i9 + 16, i6, bArrM40462);
                                        }
                                    } else if (c16495.f50689 == C0265.f1559) {
                                        int iM1569 = C0265.m1569(c16495.f50688 + i5, bArrM40462);
                                        if (iM1569 == C0265.f1577) {
                                            c2383.f7589 = i2;
                                        } else if (iM1569 == C0265.f1556) {
                                            c2383.f7589 = 2;
                                        }
                                    } else if (c16495.f50689 == C0265.f1580) {
                                        for (C16493 c16496 : C0265.m1556(c16495.f50688, c16495.f50687, bArrM40462)) {
                                            if (c16496.f50689 == C0265.f1554) {
                                                for (C16493 c16497 : C0265.m1556(c16496.f50688, c16496.f50687, bArrM40462)) {
                                                    if (c16497.f50689 == C0265.f1569) {
                                                        int i11 = c16497.f50688;
                                                        int iM15610 = C0265.m1569(i11 + 4, bArrM40462);
                                                        int i12 = i11 + i5;
                                                        for (int i13 = 0; i13 < iM15610 && i12 < c16497.f50687; i13++) {
                                                            C16493 c16493M1570 = C0265.m1570(i12, c16497.f50687, bArrM40462);
                                                            if (c16493M1570.f50689 == C0265.f1587 || c16493M1570.f50689 == C0265.f1571 || C0265.m1540(c16493M1570.f50688, bArrM40462, c16493M1570.f50687, C0265.f1582) || C0265.m1540(c16493M1570.f50688, bArrM40462, c16493M1570.f50687, C0265.f1564)) {
                                                                c2383.f7588 = true;
                                                            }
                                                            i12 = c16493M1570.f50687;
                                                        }
                                                    }
                                                    i5 = 8;
                                                }
                                            }
                                            i5 = 8;
                                        }
                                    }
                                    i2 = 1;
                                    i5 = 8;
                                    i6 = 4;
                                }
                            } else if (c16494.f50689 == C0265.f1578 || c16494.f50689 == C0265.f1576) {
                                c2383.f7590 = true;
                            }
                            i2 = 1;
                        }
                        if (c2383.f7592 == 0 || c2383.f7589 == 0) {
                            c2383 = null;
                        }
                        if (c2383 != null) {
                            C6616.m18139(c6616, c2383);
                        }
                    } else if (c16493.f50689 == C0265.f1557) {
                        for (C16493 c16498 : C0265.m1556(c16493.f50688, c16493.f50687, bArrM40462)) {
                            if (c16498.f50689 == C0265.f1573) {
                                int i14 = c16498.f50688;
                                int i15 = bArrM40462[i14] & 255;
                                if (i15 != 0 && i15 != 1) {
                                    throw new C19317();
                                }
                                int i16 = i14 + 4;
                                c6616.f20369 = i15 == 1 ? C0265.m1562(i16, bArrM40462) : C0265.m1573(i16, bArrM40462);
                            } else if (c16498.f50689 == C0265.f1566) {
                                int i17 = c16498.f50688;
                                c6616.f20367.put(Integer.valueOf(C0265.m1569(i17 + 4, bArrM40462)), new C14376(C0265.m1569(i17 + 8, bArrM40462) - 1, C0265.m1566(i17 + 12, bArrM40462), C0265.m1566(i17 + 16, bArrM40462), C0265.m1569(i17 + 20, bArrM40462)));
                            }
                        }
                    } else if (c16493.f50689 == C0265.f1561) {
                        c6616.f20368 = true;
                    }
                    i = 0;
                }
                C6616.m18146(c6616);
                return c6616;
            }
            j = c17905M24263.f54671;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24268(C2383 c2383) {
        List list = (List) this.f28622.f75604.get(Integer.valueOf(c2383.f7592));
        return (list == null || list.isEmpty() || list.size() > 4096) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C8733 m24270(C2383 c2383) {
        List list = (List) this.f28622.f75604.get(Integer.valueOf(c2383.f7592));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C8733) C7166.m19188(1, list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24267(C3794 c3794, long j, long j2) {
        for (C18611 c18611 : (ArrayList) c3794.f11970) {
            long j3 = c18611.f57713;
            int i = 0;
            while (i < c18611.f57715) {
                long j4 = c18611.f57716[i];
                long jM1535 = C0265.m1535(j3, j4);
                if (j3 < j || j4 < 0 || jM1535 > j2) {
                    throw new C19317();
                }
                i++;
                j3 = jM1535;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C20728 m24264(long j) {
        C3794 c3794M11452;
        C9439 c9439 = this;
        long j2 = j;
        C17905 c17905M24263 = c9439.m24263(j2, c9439.f28621);
        if (c17905M24263.f54673 != C0265.f1581 || C17905.m41886(c17905M24263) > 4194304 || c17905M24263.f54671 > c9439.f28622.f75605) {
            throw new C19317();
        }
        byte[] bArrM40462 = C17199.m40462(c9439.f28624, j2, (int) c17905M24263.f54676);
        C20728 c20728 = new C20728();
        Iterator it = C0265.m1556((int) c17905M24263.f54672, bArrM40462.length, bArrM40462).iterator();
        while (it.hasNext()) {
            C16493 c16493 = (C16493) it.next();
            if (c16493.f50689 == C0265.f1560) {
                ArrayList<C16493> arrayList = new ArrayList();
                C16493 c16494 = null;
                C16493 c16495 = null;
                for (C16493 c16496 : C0265.m1556(c16493.f50688, c16493.f50687, bArrM40462)) {
                    if (c16496.f50689 == C0265.f1567) {
                        c16494 = c16496;
                    } else if (c16496.f50689 == C0265.f1558) {
                        c16495 = c16496;
                    } else if (c16496.f50689 == C0265.f1575) {
                        arrayList.add(c16496);
                    } else if (C0265.m1539(c16496.f50689) || (c16496.f50689 == C0265.f1579 && C0265.m1541(bArrM40462, c16496))) {
                        throw new C19317();
                    }
                }
                if (c16494 == null || arrayList.isEmpty()) {
                    throw new C19317();
                }
                int i = c16494.f50688;
                int iM1569 = C0265.m1569(i, bArrM40462);
                int iM15610 = C0265.m1569(i + 4, bArrM40462);
                int i2 = i + 8;
                C2383 c2383 = (C2383) c9439.f28623.f20370.get(Integer.valueOf(iM15610));
                if (c2383 == null) {
                    c3794M11452 = C3794.m11452(iM15610);
                } else {
                    C14376 c14376M18137 = C6616.m18137(c9439.f28623, iM15610);
                    if (c14376M18137 == null) {
                        throw new C19317();
                    }
                    long unused = c2383.f7591;
                    C3794 c3794 = new C3794(iM15610, 0);
                    c3794.f11971 = j2;
                    int i3 = iM1569 & 1;
                    if (i3 != 0) {
                        c3794.f11971 = C0265.m1562(i2, bArrM40462);
                        i2 = i + 16;
                    }
                    c3794.f11974 = i3 == 0 && (131072 & iM1569) != 0;
                    int iM15611 = c14376M18137.f43319;
                    int iM1566 = c14376M18137.f43317;
                    int iM1567 = c14376M18137.f43320;
                    int iM15612 = c14376M18137.f43318;
                    if ((iM1569 & 2) != 0) {
                        iM15611 = C0265.m1569(i2, bArrM40462) - 1;
                        i2 += 4;
                    }
                    if ((iM1569 & 8) != 0) {
                        iM1566 = C0265.m1566(i2, bArrM40462);
                        i2 += 4;
                    }
                    if ((iM1569 & 16) != 0) {
                        iM1567 = C0265.m1566(i2, bArrM40462);
                        i2 += 4;
                    }
                    if ((iM1569 & 32) != 0) {
                        iM15612 = C0265.m1569(i2, bArrM40462);
                    }
                    c3794.f11973 = new C14376(iM15611, iM1566, iM1567, iM15612);
                    c3794M11452 = c3794;
                }
                if (!c3794M11452.f11975) {
                    if (c16495 != null) {
                        c3794M11452.f11972 = true;
                        int i4 = c16495.f50688;
                        int i5 = bArrM40462[i4] & 255;
                        if (i5 != 0 && i5 != 1) {
                            throw new C19317();
                        }
                        int i6 = i4 + 4;
                        c3794M11452.f11969 = i5 == 1 ? C0265.m1562(i6, bArrM40462) : C0265.m1573(i6, bArrM40462);
                    }
                    long jM1535 = 0;
                    int i7 = 0;
                    for (C16493 c16497 : arrayList) {
                        int iM1568 = C0265.m1566(c16497.f50688 + 4, bArrM40462);
                        if (iM1568 <= 0 || iM1568 > 4096 || i7 > 4096 - iM1568) {
                            throw new C19317();
                        }
                        int i8 = c16497.f50688;
                        int iM15613 = C0265.m1569(i8, bArrM40462);
                        int iM15614 = C0265.m1566(i8 + 4, bArrM40462);
                        int i9 = i8 + 8;
                        if (iM15614 <= 0 || iM15614 > 4096) {
                            throw new C19317();
                        }
                        C18611 c18611 = new C18611(iM15614);
                        c18611.f57714 = jM1535;
                        c18611.f57713 = c3794M11452.f11971;
                        if ((iM15613 & 1) != 0) {
                            c18611.f57713 = C0265.m1535(c18611.f57713, C0265.m1569(i9, bArrM40462));
                            i9 = i8 + 12;
                        }
                        boolean z = (iM15613 & 4) != 0;
                        int iM15615 = c3794M11452.f11973.f43318;
                        if (z) {
                            iM15615 = C0265.m1569(i9, bArrM40462);
                            i9 += 4;
                        }
                        boolean z2 = (iM15613 & 256) != 0;
                        boolean z3 = (iM15613 & 512) != 0;
                        boolean z4 = (iM15613 & 1024) != 0;
                        boolean z5 = (iM15613 & 2048) != 0;
                        int i10 = iM15615;
                        for (int i11 = 0; i11 < iM15614; i11++) {
                            c18611.f57717[i11] = z2 ? C0265.m1566(i9, bArrM40462) : c3794M11452.f11973.f43317;
                            if (z2) {
                                i9 += 4;
                            }
                            c18611.f57716[i11] = z3 ? C0265.m1566(i9, bArrM40462) : c3794M11452.f11973.f43320;
                            if (z3) {
                                i9 += 4;
                            }
                            int iM15616 = z4 ? C0265.m1569(i9, bArrM40462) : (i7 + i11 == 0 && z) ? i10 : c3794M11452.f11973.f43318;
                            if (z4) {
                                i9 += 4;
                            }
                            if (z5) {
                                c18611.f57712[i11] = C0265.m1569(i9, bArrM40462);
                                i9 += 4;
                            }
                            c18611.f57718[i11] = ((iM15616 >> 16) & 1) == 0;
                        }
                        jM1535 = C0265.m1535(jM1535, C18611.m43144(c18611));
                        i7 += c18611.f57715;
                        ((ArrayList) c3794M11452.f11970).add(c18611);
                        it = it;
                    }
                }
                Iterator it2 = it;
                c20728.f66747.add(c3794M11452);
                if (!c3794M11452.f11975) {
                    ((List) C13843.computeIfAbsent(c20728.f66746, Integer.valueOf(c3794M11452.f11976), new C2286(2))).add(c3794M11452);
                }
                c9439 = this;
                j2 = j;
                it = it2;
            }
        }
        return c20728;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C17905 m24263(long j, long j2) {
        long jM1562;
        if (j >= 0) {
            long j3 = 8;
            long j4 = j + 8;
            if (j4 <= j2) {
                C17199 c17199 = this.f28624;
                byte[] bArrM40462 = C17199.m40462(c17199, j, 8);
                long jM1573 = C0265.m1573(0, bArrM40462);
                int iM1569 = C0265.m1569(4, bArrM40462);
                if (jM1573 == 1) {
                    if (j + 16 > j2) {
                        throw new C19317();
                    }
                    jM1562 = C0265.m1562(0, C17199.m40462(c17199, j4, 8));
                    j3 = 16;
                } else {
                    if (jM1573 == 0) {
                        throw new C19317();
                    }
                    jM1562 = jM1573;
                }
                long jM1535 = C0265.m1535(j, jM1562);
                if (jM1562 < j3 || jM1535 > j2) {
                    throw new C19317();
                }
                return new C17905(j, jM1562, j3, jM1535, iM1569);
            }
        }
        throw new C19317();
    }
}
