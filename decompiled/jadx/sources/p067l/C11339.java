package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11339 {

    /* JADX INFO: renamed from: ֫ */
    public long f31568;

    /* JADX INFO: renamed from: ۧ */
    public C24749 f31569;

    /* JADX INFO: renamed from: ܽ */
    public C8656 f31570;

    /* JADX INFO: renamed from: ܿ */
    public final C18714 f31571;

    /* JADX INFO: renamed from: ᩳ */
    public long f31572 = C14849.FOREVER_NS;

    public C11339(InterfaceC9501 interfaceC9501) {
        this.f31571 = new C18714(interfaceC9501);
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
    /* JADX INFO: renamed from: ֫ */
    public C22446 m26275() {
        C24749 c24749;
        C24749 c247410;
        long jM3971;
        long jM3972;
        int i;
        ArrayList arrayListM20092;
        ArrayList arrayListM20093;
        C4633 c4633;
        ?? r1;
        List<C10668> list;
        C24749 c247411;
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
        C24749 c247412;
        long[] jArr3;
        long[] jArr4;
        Iterator it2;
        C4633 c4634;
        C18714 c18714 = this.f31571;
        this.f31568 = C18714.m42708(c18714);
        this.f31572 = C14849.FOREVER_NS;
        C8656 c8656M26279 = m26279();
        this.f31570 = c8656M26279;
        if (c8656M26279 == null || C8656.m20097(c8656M26279)) {
            return null;
        }
        long j2 = this.f31568;
        int i5 = 1;
        if (j2 >= 16) {
            C19385 c19385M26273 = m26273(j2 - 16, j2);
            if (c19385M26273.f57870 == C2620.f4333 && c19385M26273.f57873 == 16) {
                long j3 = c19385M26273.f57868;
                long j4 = this.f31568;
                if (j3 != j4) {
                    c24749 = null;
                } else {
                    long jM3973 = C2620.m3971(0, C18714.m42709(c18714, j4 - 4, 4));
                    if (jM3973 <= 0 || jM3973 > 4194304) {
                        c24749 = null;
                    } else {
                        long j5 = this.f31568;
                        if (jM3973 > j5) {
                            c24749 = null;
                        } else {
                            long j6 = j5 - jM3973;
                            C19385 c19385M26274 = m26273(j6, j5);
                            if (c19385M26274.f57870 == C2620.f4331 && c19385M26274.f57868 == this.f31568) {
                                byte[] bArrM42709 = C18714.m42709(c18714, c19385M26274.f57871, (int) C19385.m44134(c19385M26274));
                                C24749 c247413 = new C24749(j6);
                                int i6 = 4096;
                                int i7 = 2;
                                for (C18043 c18043 : C2620.m3954(0, bArrM42709.length, bArrM42709)) {
                                    if (c18043.f53866 == C2620.f4364) {
                                        int i8 = c18043.f53865;
                                        int i9 = bArrM42709[i8] & 255;
                                        if (i9 != 0 && i9 != i5) {
                                            throw new C20727();
                                        }
                                        int iM3967 = C2620.m3967(i8 + 4, bArrM42709);
                                        byte b = bArrM42709[i8 + 11];
                                        int i10 = b & 255;
                                        int i11 = ((i10 >> 4) & 3) + 1;
                                        int i12 = ((i10 >> i7) & 3) + i5;
                                        int i13 = (b & 3) + i5;
                                        int iM3968 = C2620.m3967(i8 + 12, bArrM42709);
                                        int i14 = i8 + 16;
                                        if (iM3968 < 0 || iM3968 > i6) {
                                            throw new C20727();
                                        }
                                        List list2 = (List) C15525.computeIfAbsent(c247413.f78350, Integer.valueOf(iM3967), new C10037(1));
                                        int i15 = 0;
                                        while (i15 < iM3968) {
                                            if (i9 == i5) {
                                                jM3971 = C2620.m3960(i14, bArrM42709);
                                                jM3972 = C2620.m3960(i14 + 8, bArrM42709);
                                                i = i14 + 16;
                                            } else {
                                                jM3971 = C2620.m3971(i14, bArrM42709);
                                                jM3972 = C2620.m3971(i14 + 4, bArrM42709);
                                                i = i14 + 8;
                                            }
                                            long j7 = jM3971;
                                            long j8 = jM3972;
                                            int iM3970 = C2620.m3970(i, i11, bArrM42709);
                                            int i16 = i + i11;
                                            int iM3971 = C2620.m3970(i16, i12, bArrM42709);
                                            int i17 = i16 + i12;
                                            int iM3972 = C2620.m3970(i17, i13, bArrM42709);
                                            i14 = i17 + i13;
                                            if (j7 < 0 || j8 < 0 || iM3970 <= 0 || iM3971 <= 0 || iM3972 <= 0) {
                                                throw new C20727();
                                            }
                                            list2.add(new C10668(j7, iM3970 - 1, iM3971 - 1, iM3972 - 1, j8));
                                            i15++;
                                            i5 = 1;
                                        }
                                    }
                                    i6 = 4096;
                                    i7 = 2;
                                    i5 = 1;
                                }
                                c24749 = c247413;
                            } else {
                                c24749 = null;
                            }
                        }
                    }
                }
            } else {
                c24749 = null;
            }
            c247410 = c24749;
            this.f31569 = c24749;
            if (c24749 == null) {
                r1 = c4633;
                r1 = c4634;
                r1 = c4634;
                r1 = c4634;
                r1 = c4634;
                c247411 = c247410;
            } else {
                arrayListM20092 = C8656.m20092(this.f31570, 1);
                if (!arrayListM20092.isEmpty()) {
                    arrayListM20093 = C8656.m20092(this.f31570, 2);
                    if (arrayListM20093.size() == 1 || !m26278((C4633) arrayListM20093.get(0))) {
                        r1 = c247410;
                    } else {
                        c4633 = (C4633) arrayListM20093.get(0);
                    }
                } else if (arrayListM20092.size() == 1 || !m26278((C4633) arrayListM20092.get(0))) {
                    r1 = c247410;
                } else {
                    c4634 = (C4633) arrayListM20092.get(0);
                }
                if (r1 == 0) {
                    r1 = c4633;
                    r1 = c4634;
                    r1 = c4634;
                    r1 = c4634;
                    r1 = c4634;
                    c247411 = c247410;
                } else {
                    r1 = c4633;
                    list = (List) this.f31569.f78350.get(Integer.valueOf(r1.f10383));
                    if (list != null || list.isEmpty() || list.size() > 4096) {
                        r1 = c4633;
                        r1 = c4634;
                        r1 = c4634;
                        r1 = c4634;
                        r1 = c4634;
                        c247411 = c247410;
                    } else {
                        r1 = c4634;
                        ArrayList arrayList = new ArrayList();
                        long j9 = Long.MIN_VALUE;
                        long j10 = Long.MIN_VALUE;
                        for (C10668 c10668 : list) {
                            if (c10668.f29508 <= j9 || c10668.f29506 <= 0 || c10668.f29506 >= this.f31569.f78351) {
                                throw new C20727();
                            }
                            if (c10668.f29506 < j10) {
                                throw new C20727();
                            }
                            j9 = c10668.f29508;
                            if (c10668.f29506 != j10) {
                                arrayList.add(c10668);
                                j10 = c10668.f29506;
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C2620.m3953(((C10668) it3.next()).f29508, r1.f10382);
                        }
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            int[] iArr3 = new int[size];
                            long[] jArr5 = new long[size];
                            long[] jArr6 = new long[size];
                            long[] jArr7 = new long[size];
                            HashMap map4 = new HashMap();
                            long jMin = C14849.FOREVER_NS;
                            for (Iterator it4 = this.f31570.m20087().iterator(); it4.hasNext(); it4 = it2) {
                                C4633 c4635 = (C4633) it4.next();
                                if (c4635.f10383 == r1.f10383) {
                                    C10668 c10668M26280 = m26280(c4635);
                                    if (c10668M26280 == null) {
                                        throw new C20727();
                                    }
                                    c247412 = c247410;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    map4.put(Integer.valueOf(c4635.f10383), new C17372(c4635, c10668M26280.f29506, 0));
                                    jMin = Math.min(jMin, c10668M26280.f29506);
                                } else {
                                    c247412 = c247410;
                                    jArr3 = jArr6;
                                    jArr4 = jArr7;
                                    it2 = it4;
                                    long j11 = c4635.f10384;
                                    if (j11 > 0) {
                                        map4.put(Integer.valueOf(c4635.f10383), C17372.m39414(c4635, j11));
                                    } else {
                                        C10668 c10668M26281 = m26280(c4635);
                                        if (c10668M26281 == null) {
                                            throw new C20727();
                                        }
                                        map4.put(Integer.valueOf(c4635.f10383), new C17372(c4635, c10668M26281.f29506, 0));
                                        jMin = Math.min(jMin, c10668M26281.f29506);
                                    }
                                    c247410 = c247412;
                                    jArr6 = jArr3;
                                    jArr7 = jArr4;
                                }
                                c247410 = c247412;
                                jArr6 = jArr3;
                                jArr7 = jArr4;
                            }
                            c247411 = c247410;
                            long[] jArr8 = jArr6;
                            long[] jArr9 = jArr7;
                            int i18 = 0;
                            ?? r2 = r1;
                            if (jMin != C14849.FOREVER_NS) {
                                while (jMin < this.f31569.f78351) {
                                    C19385 c19385M26275 = m26273(jMin, this.f31569.f78351);
                                    if (c19385M26275.f57870 == C2620.f4359) {
                                        C22068 c22068M26274 = m26274(jMin);
                                        Iterator it5 = map4.values().iterator();
                                        ?? r3 = r2;
                                        while (it5.hasNext()) {
                                            C17372 c17372 = (C17372) it5.next();
                                            if (!C17372.m39418(c17372) || jMin < c17372.f51843) {
                                                r111 = r3;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                            } else {
                                                List list3 = (List) c22068M26274.f69427.get(Integer.valueOf(c17372.f51844.f10383));
                                                if (list3 == null || list3.size() != 1) {
                                                    throw new C20727();
                                                }
                                                C5974 c5974 = (C5974) list3.get(i18);
                                                if (!c5974.f14778) {
                                                    throw new C20727();
                                                }
                                                long j12 = c17372.f51845;
                                                Iterator it6 = ((ArrayList) c5974.f14776).iterator();
                                                long jMax = Long.MIN_VALUE;
                                                ?? r4 = r3;
                                                while (it6.hasNext()) {
                                                    C20056 c20056 = (C20056) it6.next();
                                                    ?? r112 = r4;
                                                    int i19 = size;
                                                    C5974 c5975 = c5974;
                                                    Iterator it7 = it5;
                                                    long jM3933 = C2620.m3933(c5974.f14775, c20056.f60936);
                                                    int i20 = 0;
                                                    while (i20 < c20056.f60937) {
                                                        jMax = Math.max(jMax, C2620.m3933(C2620.m3933(jM3933, c20056.f60934[i20]), c20056.f60939[i20]));
                                                        jM3933 = C2620.m3933(jM3933, c20056.f60939[i20]);
                                                        i20++;
                                                        map4 = map4;
                                                        it6 = it6;
                                                        jMin = jMin;
                                                    }
                                                    r4 = r112;
                                                    size = i19;
                                                    it5 = it7;
                                                    c5974 = c5975;
                                                }
                                                r111 = r4;
                                                i4 = size;
                                                it = it5;
                                                map3 = map4;
                                                j = jMin;
                                                if (jMax < 0) {
                                                    throw new C20727();
                                                }
                                                c17372.f51845 = Math.max(j12, jMax);
                                                i18 = 0;
                                            }
                                            c22068M26274 = c22068M26274;
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
                                        int unused = C2620.f4361;
                                    }
                                    jMin = c19385M26275.f57868;
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
                                if (jMin != this.f31569.f78351) {
                                    throw new C20727();
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
                                long jM39419 = C17372.m39419((C17372) it8.next());
                                if (jM39419 <= 0) {
                                    throw new C20727();
                                }
                                jMax2 = Math.max(jMax2, jM39419);
                            }
                            int i21 = 0;
                            int i22 = i2;
                            while (i21 < i22) {
                                C10668 c10669 = (C10668) arrayList.get(i21);
                                int i23 = i21 + 1;
                                long j13 = i23 < i22 ? ((C10668) arrayList.get(i23)).f29506 : this.f31569.f78351;
                                long j14 = j13 - c10669.f29506;
                                if (j14 > 0 && j14 <= 2147483647L) {
                                    C22068 c22068M26275 = m26274(c10669.f29506);
                                    if (c10669.f29510 < 0 || c10669.f29510 >= c22068M26275.f69428.size()) {
                                        throw new C20727();
                                    }
                                    C5974 c5976 = (C5974) c22068M26275.f69428.get(c10669.f29510);
                                    if (c5976.f14782 != r19.f10383) {
                                        throw new C20727();
                                    }
                                    List list4 = (List) c22068M26275.f69427.get(Integer.valueOf(r19.f10383));
                                    if (list4 == null || list4.size() != 1) {
                                        throw new C20727();
                                    }
                                    if (c10669.f29509 < 0 || c10669.f29509 >= ((ArrayList) c5976.f14776).size()) {
                                        throw new C20727();
                                    }
                                    C20056 c20057 = (C20056) ((ArrayList) c5976.f14776).get(c10669.f29509);
                                    if (c10669.f29507 < 0 || c10669.f29507 >= c20057.f60937) {
                                        throw new C20727();
                                    }
                                    m26277(c5976, c10669.f29506, j13);
                                    if (!c20057.f60940[c10669.f29507]) {
                                        throw new C20727();
                                    }
                                    jArr[i21] = c10669.f29506;
                                    iArr[i21] = (int) j14;
                                    long jM3953 = C2620.m3953(c10669.f29508, r19.f10382);
                                    jArr8[i21] = jM3953;
                                    if (i21 <= 0 || jM3953 > jArr8[i21 - 1]) {
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
                            return new C22446(iArr, jArr, jArr9, jArr8);
                        }
                        r1 = c4633;
                        r1 = c4634;
                        r1 = c4634;
                        r1 = c4634;
                        r1 = c4634;
                        c247411 = c247410;
                    }
                }
            }
            return c247411;
        }
        c24749 = null;
        c247410 = null;
        this.f31569 = c24749;
        if (c24749 == null) {
            r1 = c4633;
            r1 = c4634;
            r1 = c4634;
            r1 = c4634;
            r1 = c4634;
            c247411 = c247410;
        } else {
            arrayListM20092 = C8656.m20092(this.f31570, 1);
            if (!arrayListM20092.isEmpty()) {
                arrayListM20093 = C8656.m20092(this.f31570, 2);
                if (arrayListM20093.size() == 1) {
                    r1 = c247410;
                } else {
                    r1 = c247410;
                }
            } else if (arrayListM20092.size() == 1) {
                r1 = c247410;
            } else {
                r1 = c247410;
            }
            if (r1 == 0) {
                r1 = c4633;
                r1 = c4634;
                r1 = c4634;
                r1 = c4634;
                r1 = c4634;
                c247411 = c247410;
            } else {
                r1 = c4633;
                list = (List) this.f31569.f78350.get(Integer.valueOf(r1.f10383));
                if (list != null) {
                    r1 = c4633;
                    r1 = c4634;
                    r1 = c4634;
                    r1 = c4634;
                    r1 = c4634;
                    c247411 = c247410;
                } else {
                    r1 = c4633;
                    r1 = c4634;
                    r1 = c4634;
                    r1 = c4634;
                    r1 = c4634;
                    c247411 = c247410;
                }
            }
        }
        return c247411;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C12680 m26281(C11339 c11339) {
        C22446 c22446M26275 = c11339.m26275();
        if (c22446M26275 == null || c22446M26275.f70816 == 0) {
            return null;
        }
        long j = c22446M26275.f70818[0];
        if (j <= 0 || j > 16777216) {
            return null;
        }
        return new C12680(c22446M26275, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7315 m26272(C11339 c11339, long j) {
        List list;
        ArrayList arrayList;
        long j2;
        C11339 c113310 = c11339;
        long j3 = j;
        long jM42708 = C18714.m42708(c113310.f31571);
        c113310.f31568 = jM42708;
        if (j3 <= 0 || j3 >= jM42708 || j3 > 16777216) {
            return null;
        }
        c113310.f31572 = j3;
        C8656 c8656M26279 = c11339.m26279();
        c113310.f31570 = c8656M26279;
        if (c8656M26279 == null || C8656.m20097(c8656M26279)) {
            return null;
        }
        ArrayList arrayListM20092 = C8656.m20092(c113310.f31570, 1);
        if (arrayListM20092.size() != 1) {
            return null;
        }
        C4633 c4633 = (C4633) arrayListM20092.get(0);
        c113310.f31569 = new C24749(c113310.f31568);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (true) {
            long j4 = c113310.f31568;
            if (j3 < j4) {
                C19385 c19385M26273 = c113310.m26273(j3, j4);
                if (c19385M26273.f57870 == C2620.f4359) {
                    arrayList2.add(Long.valueOf(j3));
                } else if (c19385M26273.f57870 == C2620.f4361) {
                    arrayList3.add(c19385M26273);
                } else if (c19385M26273.f57870 != C2620.f4346) {
                    return null;
                }
                j3 = c19385M26273.f57868;
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
                    long jLongValue2 = i2 < arrayList2.size() ? ((Long) arrayList2.get(i2)).longValue() : c113310.f31568;
                    long j6 = j5;
                    long j7 = jLongValue2 - jLongValue;
                    if (j7 <= 0 || j7 > 2147483647L || (list = (List) c113310.m26274(jLongValue).f69427.get(Integer.valueOf(c4633.f10383))) == null) {
                        return null;
                    }
                    ArrayList arrayList7 = arrayList2;
                    if (list.size() != 1) {
                        return null;
                    }
                    C5974 c5974 = (C5974) list.get(0);
                    if (!c5974.f14778 || !c5974.f14780) {
                        return null;
                    }
                    m26277(c5974, jLongValue, jLongValue2);
                    Iterator it = ((ArrayList) c5974.f14776).iterator();
                    while (it.hasNext()) {
                        C20056 c20056 = (C20056) it.next();
                        Iterator it2 = it;
                        ArrayList arrayList8 = arrayList6;
                        int i3 = 0;
                        long j8 = j7;
                        long j9 = c20056.f60935;
                        while (i3 < c20056.f60937) {
                            int i4 = i2;
                            long jM3933 = C2620.m3933(j9, c20056.f60938[i3]);
                            Iterator it3 = arrayList3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    throw new C20727();
                                }
                                C19385 c19385 = (C19385) it3.next();
                                if (c19385.f57872 < jLongValue || c19385.f57868 > jLongValue2 || j9 < c19385.f57871 || jM3933 > c19385.f57868) {
                                }
                            }
                            i3++;
                            j9 = jM3933;
                            i2 = i4;
                        }
                        arrayList6 = arrayList8;
                        j7 = j8;
                        it = it2;
                    }
                    ArrayList arrayList9 = arrayList6;
                    long j10 = j7;
                    int i5 = i2;
                    Iterator it4 = ((ArrayList) c5974.f14776).iterator();
                    j5 = j6;
                    while (it4.hasNext()) {
                        C20056 c20057 = (C20056) it4.next();
                        ArrayList arrayList10 = arrayList3;
                        long jM3934 = C2620.m3933(c5974.f14775, c20057.f60936);
                        int i6 = 0;
                        while (i6 < c20057.f60937) {
                            if (c20057.f60940[i6]) {
                                long jM3953 = C2620.m3953(C2620.m3933(jM3934, c20057.f60934[i6]), c4633.f10382);
                                if (jM3953 <= j5) {
                                    return null;
                                }
                                arrayList4.add(Long.valueOf(jM3953));
                                arrayList5.add(l2);
                                j2 = j10;
                                arrayList = arrayList9;
                                arrayList.add(Integer.valueOf((int) j2));
                                j5 = jM3953;
                            } else {
                                arrayList = arrayList9;
                                j2 = j10;
                            }
                            jM3934 = C2620.m3933(jM3934, c20057.f60939[i6]);
                            i6++;
                            it4 = it4;
                            j10 = j2;
                            c4633 = c4633;
                            arrayList9 = arrayList;
                        }
                        arrayList3 = arrayList10;
                    }
                    c113310 = c11339;
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
                return new C7315(jArr, jArr2, iArr);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C8656 m26279() {
        long jMin = Math.min(Math.min(this.f31568, 16777216L), this.f31572);
        long j = 0;
        while (j < jMin) {
            C19385 c19385M26273 = m26273(j, this.f31568);
            if (c19385M26273.f57870 == C2620.f4339) {
                return null;
            }
            if (c19385M26273.f57870 == C2620.f4327) {
                if (C19385.m44134(c19385M26273) > 4194304) {
                    return null;
                }
                byte[] bArrM42709 = C18714.m42709(this.f31571, c19385M26273.f57871, (int) C19385.m44134(c19385M26273));
                C8656 c8656 = new C8656();
                int i = 0;
                for (C18043 c18043 : C2620.m3954(0, bArrM42709.length, bArrM42709)) {
                    int i2 = 1;
                    if (c18043.f53866 == C2620.f4328) {
                        int i3 = c18043.f53865;
                        int i4 = bArrM42709[i3] & 255;
                        if (i4 != 0 && i4 != 1) {
                            throw new C20727();
                        }
                        if (i4 == 1) {
                            c8656.f23248 = C2620.m3971(i3 + 20, bArrM42709);
                        } else {
                            c8656.f23248 = C2620.m3971(i3 + 12, bArrM42709);
                        }
                    } else if (c18043.f53866 == C2620.f4330) {
                        C4633 c4633 = new C4633(i);
                        for (C18043 c18044 : C2620.m3954(c18043.f53865, c18043.f53864, bArrM42709)) {
                            int i5 = 8;
                            int i6 = 4;
                            if (c18044.f53866 == C2620.f4348) {
                                int i7 = c18044.f53865;
                                int i8 = bArrM42709[i7] & 255;
                                if (i8 != 0 && i8 != i2) {
                                    throw new C20727();
                                }
                                if (i8 == i2) {
                                    c4633.f10383 = C2620.m3967(i7 + 20, bArrM42709);
                                    c4633.f10386 = C2620.m3965(i7 + 28, 8, bArrM42709);
                                } else {
                                    c4633.f10383 = C2620.m3967(i7 + 12, bArrM42709);
                                    c4633.f10386 = C2620.m3965(i7 + 20, 4, bArrM42709);
                                }
                            } else if (c18044.f53866 == C2620.f4340) {
                                for (C18043 c18045 : C2620.m3954(c18044.f53865, c18044.f53864, bArrM42709)) {
                                    if (c18045.f53866 == C2620.f4341) {
                                        int i9 = c18045.f53865;
                                        int i10 = bArrM42709[i9] & 255;
                                        if (i10 != 0 && i10 != i2) {
                                            throw new C20727();
                                        }
                                        if (i10 == i2) {
                                            c4633.f10382 = C2620.m3971(i9 + 20, bArrM42709);
                                            c4633.f10385 = C2620.m3965(i9 + 24, i5, bArrM42709);
                                        } else {
                                            c4633.f10382 = C2620.m3971(i9 + 12, bArrM42709);
                                            c4633.f10385 = C2620.m3965(i9 + 16, i6, bArrM42709);
                                        }
                                    } else if (c18045.f53866 == C2620.f4337) {
                                        int iM3967 = C2620.m3967(c18045.f53865 + i5, bArrM42709);
                                        if (iM3967 == C2620.f4355) {
                                            c4633.f10380 = i2;
                                        } else if (iM3967 == C2620.f4334) {
                                            c4633.f10380 = 2;
                                        }
                                    } else if (c18045.f53866 == C2620.f4358) {
                                        for (C18043 c18046 : C2620.m3954(c18045.f53865, c18045.f53864, bArrM42709)) {
                                            if (c18046.f53866 == C2620.f4332) {
                                                for (C18043 c18047 : C2620.m3954(c18046.f53865, c18046.f53864, bArrM42709)) {
                                                    if (c18047.f53866 == C2620.f4347) {
                                                        int i11 = c18047.f53865;
                                                        int iM3968 = C2620.m3967(i11 + 4, bArrM42709);
                                                        int i12 = i11 + i5;
                                                        for (int i13 = 0; i13 < iM3968 && i12 < c18047.f53864; i13++) {
                                                            C18043 c18043M3968 = C2620.m3968(i12, c18047.f53864, bArrM42709);
                                                            if (c18043M3968.f53866 == C2620.f4365 || c18043M3968.f53866 == C2620.f4349 || C2620.m3938(c18043M3968.f53865, bArrM42709, c18043M3968.f53864, C2620.f4360) || C2620.m3938(c18043M3968.f53865, bArrM42709, c18043M3968.f53864, C2620.f4342)) {
                                                                c4633.f10379 = true;
                                                            }
                                                            i12 = c18043M3968.f53864;
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
                            } else if (c18044.f53866 == C2620.f4356 || c18044.f53866 == C2620.f4354) {
                                c4633.f10381 = true;
                            }
                            i2 = 1;
                        }
                        if (c4633.f10383 == 0 || c4633.f10380 == 0) {
                            c4633 = null;
                        }
                        if (c4633 != null) {
                            C8656.m20091(c8656, c4633);
                        }
                    } else if (c18043.f53866 == C2620.f4335) {
                        for (C18043 c18048 : C2620.m3954(c18043.f53865, c18043.f53864, bArrM42709)) {
                            if (c18048.f53866 == C2620.f4351) {
                                int i14 = c18048.f53865;
                                int i15 = bArrM42709[i14] & 255;
                                if (i15 != 0 && i15 != 1) {
                                    throw new C20727();
                                }
                                int i16 = i14 + 4;
                                c8656.f23246 = i15 == 1 ? C2620.m3960(i16, bArrM42709) : C2620.m3971(i16, bArrM42709);
                            } else if (c18048.f53866 == C2620.f4344) {
                                int i17 = c18048.f53865;
                                c8656.f23244.put(Integer.valueOf(C2620.m3967(i17 + 4, bArrM42709)), new C16031(C2620.m3967(i17 + 8, bArrM42709) - 1, C2620.m3964(i17 + 12, bArrM42709), C2620.m3964(i17 + 16, bArrM42709), C2620.m3967(i17 + 20, bArrM42709)));
                            }
                        }
                    } else if (c18043.f53866 == C2620.f4339) {
                        c8656.f23245 = true;
                    }
                    i = 0;
                }
                C8656.m20098(c8656);
                return c8656;
            }
            j = c19385M26273.f57868;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m26278(C4633 c4633) {
        List list = (List) this.f31569.f78350.get(Integer.valueOf(c4633.f10383));
        return (list == null || list.isEmpty() || list.size() > 4096) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    private C10668 m26280(C4633 c4633) {
        List list = (List) this.f31569.f78350.get(Integer.valueOf(c4633.f10383));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (C10668) C9179.m21131(1, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26277(C5974 c5974, long j, long j2) {
        for (C20056 c20056 : (ArrayList) c5974.f14776) {
            long j3 = c20056.f60935;
            int i = 0;
            while (i < c20056.f60937) {
                long j4 = c20056.f60938[i];
                long jM3933 = C2620.m3933(j3, j4);
                if (j3 < j || j4 < 0 || jM3933 > j2) {
                    throw new C20727();
                }
                i++;
                j3 = jM3933;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C22068 m26274(long j) {
        C5974 c5974M13388;
        C11339 c11339 = this;
        long j2 = j;
        C19385 c19385M26273 = c11339.m26273(j2, c11339.f31568);
        if (c19385M26273.f57870 != C2620.f4359 || C19385.m44134(c19385M26273) > 4194304 || c19385M26273.f57868 > c11339.f31569.f78351) {
            throw new C20727();
        }
        byte[] bArrM42709 = C18714.m42709(c11339.f31571, j2, (int) c19385M26273.f57873);
        C22068 c22068 = new C22068();
        Iterator it = C2620.m3954((int) c19385M26273.f57869, bArrM42709.length, bArrM42709).iterator();
        while (it.hasNext()) {
            C18043 c18043 = (C18043) it.next();
            if (c18043.f53866 == C2620.f4338) {
                ArrayList<C18043> arrayList = new ArrayList();
                C18043 c18044 = null;
                C18043 c18045 = null;
                for (C18043 c18046 : C2620.m3954(c18043.f53865, c18043.f53864, bArrM42709)) {
                    if (c18046.f53866 == C2620.f4345) {
                        c18044 = c18046;
                    } else if (c18046.f53866 == C2620.f4336) {
                        c18045 = c18046;
                    } else if (c18046.f53866 == C2620.f4353) {
                        arrayList.add(c18046);
                    } else if (C2620.m3937(c18046.f53866) || (c18046.f53866 == C2620.f4357 && C2620.m3939(bArrM42709, c18046))) {
                        throw new C20727();
                    }
                }
                if (c18044 == null || arrayList.isEmpty()) {
                    throw new C20727();
                }
                int i = c18044.f53865;
                int iM3967 = C2620.m3967(i, bArrM42709);
                int iM3968 = C2620.m3967(i + 4, bArrM42709);
                int i2 = i + 8;
                C4633 c4633 = (C4633) c11339.f31570.f23247.get(Integer.valueOf(iM3968));
                if (c4633 == null) {
                    c5974M13388 = C5974.m13388(iM3968);
                } else {
                    C16031 c16031M20089 = C8656.m20089(c11339.f31570, iM3968);
                    if (c16031M20089 == null) {
                        throw new C20727();
                    }
                    long unused = c4633.f10382;
                    C5974 c5974 = new C5974(iM3968, 0);
                    c5974.f14777 = j2;
                    int i3 = iM3967 & 1;
                    if (i3 != 0) {
                        c5974.f14777 = C2620.m3960(i2, bArrM42709);
                        i2 = i + 16;
                    }
                    c5974.f14780 = i3 == 0 && (131072 & iM3967) != 0;
                    int iM3969 = c16031M20089.f46410;
                    int iM3964 = c16031M20089.f46408;
                    int iM3965 = c16031M20089.f46411;
                    int iM39610 = c16031M20089.f46409;
                    if ((iM3967 & 2) != 0) {
                        iM3969 = C2620.m3967(i2, bArrM42709) - 1;
                        i2 += 4;
                    }
                    if ((iM3967 & 8) != 0) {
                        iM3964 = C2620.m3964(i2, bArrM42709);
                        i2 += 4;
                    }
                    if ((iM3967 & 16) != 0) {
                        iM3965 = C2620.m3964(i2, bArrM42709);
                        i2 += 4;
                    }
                    if ((iM3967 & 32) != 0) {
                        iM39610 = C2620.m3967(i2, bArrM42709);
                    }
                    c5974.f14779 = new C16031(iM3969, iM3964, iM3965, iM39610);
                    c5974M13388 = c5974;
                }
                if (!c5974M13388.f14781) {
                    if (c18045 != null) {
                        c5974M13388.f14778 = true;
                        int i4 = c18045.f53865;
                        int i5 = bArrM42709[i4] & 255;
                        if (i5 != 0 && i5 != 1) {
                            throw new C20727();
                        }
                        int i6 = i4 + 4;
                        c5974M13388.f14775 = i5 == 1 ? C2620.m3960(i6, bArrM42709) : C2620.m3971(i6, bArrM42709);
                    }
                    long jM3933 = 0;
                    int i7 = 0;
                    for (C18043 c18047 : arrayList) {
                        int iM3966 = C2620.m3964(c18047.f53865 + 4, bArrM42709);
                        if (iM3966 <= 0 || iM3966 > 4096 || i7 > 4096 - iM3966) {
                            throw new C20727();
                        }
                        int i8 = c18047.f53865;
                        int iM39611 = C2620.m3967(i8, bArrM42709);
                        int iM39612 = C2620.m3964(i8 + 4, bArrM42709);
                        int i9 = i8 + 8;
                        if (iM39612 <= 0 || iM39612 > 4096) {
                            throw new C20727();
                        }
                        C20056 c20056 = new C20056(iM39612);
                        c20056.f60936 = jM3933;
                        c20056.f60935 = c5974M13388.f14777;
                        if ((iM39611 & 1) != 0) {
                            c20056.f60935 = C2620.m3933(c20056.f60935, C2620.m3967(i9, bArrM42709));
                            i9 = i8 + 12;
                        }
                        boolean z = (iM39611 & 4) != 0;
                        int iM39613 = c5974M13388.f14779.f46409;
                        if (z) {
                            iM39613 = C2620.m3967(i9, bArrM42709);
                            i9 += 4;
                        }
                        boolean z2 = (iM39611 & 256) != 0;
                        boolean z3 = (iM39611 & 512) != 0;
                        boolean z4 = (iM39611 & 1024) != 0;
                        boolean z5 = (iM39611 & 2048) != 0;
                        int i10 = iM39613;
                        for (int i11 = 0; i11 < iM39612; i11++) {
                            c20056.f60939[i11] = z2 ? C2620.m3964(i9, bArrM42709) : c5974M13388.f14779.f46408;
                            if (z2) {
                                i9 += 4;
                            }
                            c20056.f60938[i11] = z3 ? C2620.m3964(i9, bArrM42709) : c5974M13388.f14779.f46411;
                            if (z3) {
                                i9 += 4;
                            }
                            int iM39614 = z4 ? C2620.m3967(i9, bArrM42709) : (i7 + i11 == 0 && z) ? i10 : c5974M13388.f14779.f46409;
                            if (z4) {
                                i9 += 4;
                            }
                            if (z5) {
                                c20056.f60934[i11] = C2620.m3967(i9, bArrM42709);
                                i9 += 4;
                            }
                            c20056.f60940[i11] = ((iM39614 >> 16) & 1) == 0;
                        }
                        jM3933 = C2620.m3933(jM3933, C20056.m45409(c20056));
                        i7 += c20056.f60937;
                        ((ArrayList) c5974M13388.f14776).add(c20056);
                        it = it;
                    }
                }
                Iterator it2 = it;
                c22068.f69428.add(c5974M13388);
                if (!c5974M13388.f14781) {
                    ((List) C15525.computeIfAbsent(c22068.f69427, Integer.valueOf(c5974M13388.f14782), new C4541(2))).add(c5974M13388);
                }
                c11339 = this;
                j2 = j;
                it = it2;
            }
        }
        return c22068;
    }

    /* JADX INFO: renamed from: ֫ */
    private C19385 m26273(long j, long j2) {
        long jM3960;
        if (j >= 0) {
            long j3 = 8;
            long j4 = j + 8;
            if (j4 <= j2) {
                C18714 c18714 = this.f31571;
                byte[] bArrM42709 = C18714.m42709(c18714, j, 8);
                long jM3971 = C2620.m3971(0, bArrM42709);
                int iM3967 = C2620.m3967(4, bArrM42709);
                if (jM3971 == 1) {
                    if (j + 16 > j2) {
                        throw new C20727();
                    }
                    jM3960 = C2620.m3960(0, C18714.m42709(c18714, j4, 8));
                    j3 = 16;
                } else {
                    if (jM3971 == 0) {
                        throw new C20727();
                    }
                    jM3960 = jM3971;
                }
                long jM3933 = C2620.m3933(j, jM3960);
                if (jM3960 < j3 || jM3933 > j2) {
                    throw new C20727();
                }
                return new C19385(j, jM3960, j3, jM3933, iM3967);
            }
        }
        throw new C20727();
    }
}
