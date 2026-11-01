package p067l;

import android.net.Uri;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7M5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14134 implements InterfaceC11441, InterfaceC4133 {

    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC2830 f40133;

    /* JADX INFO: renamed from: ۗ */
    public final C19781 f40134;

    /* JADX INFO: renamed from: ۙ */
    public C21244 f40135;

    /* JADX INFO: renamed from: ۛ */
    public C19144[] f40136;

    /* JADX INFO: renamed from: ۜ֫ */
    public final IdentityHashMap f40137;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceC22170 f40138;

    /* JADX INFO: renamed from: ۢ֫ */
    public C8243 f40139;

    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC6601 f40140;

    /* JADX INFO: renamed from: ۧ֫ */
    public final int f40141;

    /* JADX INFO: renamed from: ۨ */
    public final C10099 f40142;

    /* JADX INFO: renamed from: ۫ */
    public final C16658 f40143;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC22852 f40144;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC12878 f40145;

    /* JADX INFO: renamed from: ܳ֫ */
    public final InterfaceC13110 f40146 = new C14804(this);

    /* JADX INFO: renamed from: ܽ֫ */
    public int f40147;

    /* JADX INFO: renamed from: ܿ֫ */
    public final InterfaceC18885 f40148;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C15512 f40149;

    /* JADX INFO: renamed from: ᩶ */
    public int f40150;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C22498 f40151;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23016 f40152;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f40153;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC23522 f40154;

    /* JADX INFO: renamed from: ᩻֫ */
    public C19144[] f40155;

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܽ */
    public final long mo13098() {
        return -9223372036854775807L;
    }

    public C14134(InterfaceC23522 interfaceC23522, InterfaceC18885 interfaceC18885, InterfaceC22852 interfaceC22852, InterfaceC2830 interfaceC2830, InterfaceC6601 interfaceC6601, C16658 c16658, InterfaceC12878 interfaceC12878, C10099 c10099, InterfaceC23016 interfaceC23016, C19781 c19781, boolean z, int i, C15512 c15512) {
        this.f40154 = interfaceC23522;
        this.f40148 = interfaceC18885;
        this.f40144 = interfaceC22852;
        this.f40133 = interfaceC2830;
        this.f40140 = interfaceC6601;
        this.f40143 = c16658;
        this.f40145 = interfaceC12878;
        this.f40142 = c10099;
        this.f40152 = interfaceC23016;
        this.f40134 = c19781;
        this.f40153 = z;
        this.f40141 = i;
        this.f40149 = c15512;
        c19781.getClass();
        this.f40135 = new C21244(AbstractC16192.m36872of(), AbstractC16192.m36872of());
        this.f40137 = new IdentityHashMap();
        this.f40151 = new C22498();
        this.f40155 = new C19144[0];
        this.f40136 = new C19144[0];
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m32169() {
        this.f40148.mo11228(this);
        for (C19144 c19144 : this.f40155) {
            c19144.m43624();
        }
        this.f40138 = null;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142 A[LOOP:2: B:59:0x0140->B:60:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d4 A[LOOP:3: B:70:0x01ce->B:72:0x01d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe A[LOOP:4: B:74:0x01fc->B:75:0x01fe, LOOP_END] */
    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13097(InterfaceC22170 interfaceC22170, long j) {
        boolean z;
        InterfaceC23522 interfaceC23522;
        List list;
        Map map;
        List list2;
        ArrayList arrayList;
        int i;
        List list3;
        boolean z2;
        boolean z3;
        int i2;
        Uri[] uriArr;
        C10307[] c10307Arr;
        int[] iArr;
        int i3;
        int i4;
        int iM12978;
        int iM12979;
        int i5;
        C19144 c19144M32162;
        ArrayList arrayList2;
        C10307[] c10307Arr2;
        int i6;
        C10307[] c10307Arr3;
        int i7;
        List list4;
        int i8;
        InterfaceC23522 interfaceC23523;
        this.f40138 = interfaceC22170;
        InterfaceC18885 interfaceC18885 = this.f40148;
        interfaceC18885.mo11232(this);
        C14450 c14450Mo11230 = interfaceC18885.mo11230();
        c14450Mo11230.getClass();
        List list5 = c14450Mo11230.f41289;
        List list6 = c14450Mo11230.f41287;
        Map map2 = Collections.EMPTY_MAP;
        boolean zIsEmpty = list6.isEmpty();
        List list7 = c14450Mo11230.f41285;
        int i9 = 0;
        this.f40147 = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        InterfaceC23522 interfaceC23524 = this.f40154;
        boolean z4 = this.f40153;
        if (zIsEmpty) {
            z = z4;
            interfaceC23522 = interfaceC23524;
            list = list5;
            map = map2;
            list2 = list7;
            arrayList = arrayList4;
        } else {
            C10307 c10307 = c14450Mo11230.f41291;
            int size = list6.size();
            int[] iArr2 = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < list6.size()) {
                C10307 c10308 = ((C15120) list6.get(i10)).f43173;
                boolean z5 = z4;
                int i12 = c10308.f28523;
                String str = c10308.f28533;
                if (i12 > 0 || C5792.m13017(2, str) != null) {
                    iArr2[i10] = 2;
                    i11++;
                } else if (C5792.m13017(1, str) != null) {
                    iArr2[i10] = 1;
                    i9++;
                } else {
                    iArr2[i10] = -1;
                }
                i10++;
                z4 = z5;
            }
            z = z4;
            if (i11 > 0) {
                size = i11;
                z2 = true;
            } else {
                if (i9 < size) {
                    size -= i9;
                    z2 = false;
                    z3 = true;
                } else {
                    z2 = false;
                }
                i2 = size;
                uriArr = new Uri[i2];
                c10307Arr = new C10307[i2];
                iArr = new int[i2];
                i3 = 0;
                i4 = 0;
                while (i4 < list6.size()) {
                    if (z2) {
                        interfaceC23523 = interfaceC23524;
                        if (iArr2[i4] == 2) {
                        }
                        i4++;
                        interfaceC23524 = interfaceC23523;
                    } else {
                        interfaceC23523 = interfaceC23524;
                    }
                    if (z3 || iArr2[i4] != 1) {
                        C15120 c15120 = (C15120) list6.get(i4);
                        uriArr[i3] = c15120.f43174;
                        c10307Arr[i3] = c15120.f43173;
                        iArr[i3] = i4;
                        i3++;
                    }
                    i4++;
                    interfaceC23524 = interfaceC23523;
                }
                InterfaceC23522 interfaceC23525 = interfaceC23524;
                String str2 = c10307Arr[0].f28533;
                iM12978 = C5792.m12978(2, str2);
                iM12979 = C5792.m12978(1, str2);
                boolean z6 = (iM12979 != 1 || (iM12979 == 0 && list5.isEmpty())) && iM12978 <= 1 && iM12979 + iM12978 > 0;
                if (!z2 || iM12979 <= 0) {
                    i5 = 0;
                } else {
                    i5 = 1;
                }
                list2 = list7;
                list = list5;
                map = map2;
                arrayList = arrayList4;
                interfaceC23522 = interfaceC23525;
                c19144M32162 = m32162("main", i5, uriArr, c10307Arr, c14450Mo11230.f41291, c14450Mo11230.f41283, map2, j);
                arrayList3.add(c19144M32162);
                arrayList.add(iArr);
                if (z && z6) {
                    arrayList2 = new ArrayList();
                    if (iM12978 > 0) {
                        c10307Arr3 = new C10307[i2];
                        for (i7 = 0; i7 < i2; i7++) {
                            C10307 c10309 = c10307Arr[i7];
                            String strM13017 = C5792.m13017(2, c10309.f28533);
                            String strM26817 = C11669.m26817(strM13017);
                            C3601 c3601 = new C3601();
                            c3601.m6701(c10309.f28535);
                            c3601.m6705(c10309.f28549);
                            c3601.m6695(c10309.f28545);
                            c3601.m6694(c10309.f28520);
                            c3601.m6697(strM26817);
                            c3601.m6677(strM13017);
                            c3601.m6681(c10309.f28526);
                            c3601.m6700(c10309.f28537);
                            c3601.m6670(c10309.f28529);
                            c3601.m6685(c10309.f28547);
                            c3601.m6689(c10309.f28523);
                            c3601.m6673(c10309.f28510);
                            c3601.m6698(c10309.f28542);
                            c3601.m6686(c10309.f28522);
                            c10307Arr3[i7] = c3601.m6672();
                        }
                        arrayList2.add(new C15020("main", c10307Arr3));
                        if (iM12979 > 0 && (c10307 != null || list.isEmpty())) {
                            arrayList2.add(new C15020("main:audio", m32161(c10307Arr[0], c10307, false)));
                        }
                        list4 = c14450Mo11230.f41283;
                        if (list4 != null) {
                            for (i8 = 0; i8 < list4.size(); i8++) {
                                arrayList2.add(new C15020(C20778.m46922(i8, "main:cc:"), ((C4747) interfaceC23522).m10051((C10307) list4.get(i8))));
                            }
                        }
                    } else {
                        c10307Arr2 = new C10307[i2];
                        for (i6 = 0; i6 < i2; i6++) {
                            c10307Arr2[i6] = m32161(c10307Arr[i6], c10307, true);
                        }
                        arrayList2.add(new C15020("main", c10307Arr2));
                    }
                    C3601 c3602 = new C3601();
                    c3602.m6701("ID3");
                    c3602.m6697("application/id3");
                    C15020 c15020 = new C15020("main:id3", c3602.m6672());
                    arrayList2.add(c15020);
                    c19144M32162.m43610((C15020[]) arrayList2.toArray(new C15020[0]), arrayList2.indexOf(c15020));
                }
            }
            z3 = false;
            i2 = size;
            uriArr = new Uri[i2];
            c10307Arr = new C10307[i2];
            iArr = new int[i2];
            i3 = 0;
            i4 = 0;
            while (i4 < list6.size()) {
                if (z2) {
                    interfaceC23523 = interfaceC23524;
                    if (iArr2[i4] == 2) {
                    }
                    i4++;
                    interfaceC23524 = interfaceC23523;
                } else {
                    interfaceC23523 = interfaceC23524;
                }
                if (z3) {
                    C15120 c15121 = (C15120) list6.get(i4);
                    uriArr[i3] = c15121.f43174;
                    c10307Arr[i3] = c15121.f43173;
                    iArr[i3] = i4;
                    i3++;
                } else {
                    C15120 c15122 = (C15120) list6.get(i4);
                    uriArr[i3] = c15122.f43174;
                    c10307Arr[i3] = c15122.f43173;
                    iArr[i3] = i4;
                    i3++;
                }
                i4++;
                interfaceC23524 = interfaceC23523;
            }
            InterfaceC23522 interfaceC23526 = interfaceC23524;
            String str3 = c10307Arr[0].f28533;
            iM12978 = C5792.m12978(2, str3);
            iM12979 = C5792.m12978(1, str3);
            if (iM12979 != 1) {
            }
            if (z2) {
                i5 = 0;
            } else {
                i5 = 0;
            }
            list2 = list7;
            list = list5;
            map = map2;
            arrayList = arrayList4;
            interfaceC23522 = interfaceC23526;
            c19144M32162 = m32162("main", i5, uriArr, c10307Arr, c14450Mo11230.f41291, c14450Mo11230.f41283, map2, j);
            arrayList3.add(c19144M32162);
            arrayList.add(iArr);
            if (z) {
                arrayList2 = new ArrayList();
                if (iM12978 > 0) {
                    c10307Arr3 = new C10307[i2];
                    while (i7 < i2) {
                        C10307 c103010 = c10307Arr[i7];
                        String strM13018 = C5792.m13017(2, c103010.f28533);
                        String strM26818 = C11669.m26817(strM13018);
                        C3601 c3603 = new C3601();
                        c3603.m6701(c103010.f28535);
                        c3603.m6705(c103010.f28549);
                        c3603.m6695(c103010.f28545);
                        c3603.m6694(c103010.f28520);
                        c3603.m6697(strM26818);
                        c3603.m6677(strM13018);
                        c3603.m6681(c103010.f28526);
                        c3603.m6700(c103010.f28537);
                        c3603.m6670(c103010.f28529);
                        c3603.m6685(c103010.f28547);
                        c3603.m6689(c103010.f28523);
                        c3603.m6673(c103010.f28510);
                        c3603.m6698(c103010.f28542);
                        c3603.m6686(c103010.f28522);
                        c10307Arr3[i7] = c3603.m6672();
                    }
                    arrayList2.add(new C15020("main", c10307Arr3));
                    if (iM12979 > 0) {
                        arrayList2.add(new C15020("main:audio", m32161(c10307Arr[0], c10307, false)));
                    }
                    list4 = c14450Mo11230.f41283;
                    if (list4 != null) {
                        while (i8 < list4.size()) {
                            arrayList2.add(new C15020(C20778.m46922(i8, "main:cc:"), ((C4747) interfaceC23522).m10051((C10307) list4.get(i8))));
                        }
                    }
                } else {
                    c10307Arr2 = new C10307[i2];
                    while (i6 < i2) {
                        c10307Arr2[i6] = m32161(c10307Arr[i6], c10307, true);
                    }
                    arrayList2.add(new C15020("main", c10307Arr2));
                }
                C3601 c3604 = new C3601();
                c3604.m6701("ID3");
                c3604.m6697("application/id3");
                C15020 c15021 = new C15020("main:id3", c3604.m6672());
                arrayList2.add(c15021);
                c19144M32162.m43610((C15020[]) arrayList2.toArray(new C15020[0]), arrayList2.indexOf(c15021));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List list8 = list;
            String str4 = ((C5733) list8.get(i13)).f14043;
            if (hashSet.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                boolean z7 = true;
                for (int i14 = 0; i14 < list8.size(); i14++) {
                    if (str4.equals(((C5733) list8.get(i14)).f14043)) {
                        C5733 c5733 = (C5733) list8.get(i14);
                        arrayList7.add(Integer.valueOf(i14));
                        Uri uri = c5733.f14044;
                        C10307 c103011 = c5733.f14042;
                        arrayList5.add(uri);
                        arrayList6.add(c103011);
                        z7 &= C5792.m12978(1, c103011.f28533) == 1;
                    }
                }
                String strConcat = "audio:".concat(str4);
                String str5 = C5792.f14228;
                i = i13;
                list3 = list8;
                C19144 c19144M32163 = m32162(strConcat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (C10307[]) arrayList6.toArray(new C10307[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList.add(C15129.m34551(arrayList7));
                arrayList3.add(c19144M32163);
                if (z && z7) {
                    c19144M32163.m43610(new C15020[]{new C15020(strConcat, (C10307[]) arrayList6.toArray(new C10307[0]))}, new int[0]);
                }
            } else {
                i = i13;
                list3 = list8;
            }
            i13 = i + 1;
            list = list3;
        }
        this.f40150 = arrayList3.size();
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        ArrayList arrayList10 = new ArrayList(list2.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            List list9 = list2;
            String str6 = ((C5733) list9.get(i15)).f14043;
            if (hashSet2.add(str6)) {
                arrayList8.clear();
                arrayList9.clear();
                arrayList10.clear();
                for (int i16 = 0; i16 < list9.size(); i16++) {
                    if (str6.equals(((C5733) list9.get(i16)).f14043)) {
                        C5733 c5734 = (C5733) list9.get(i16);
                        arrayList10.add(Integer.valueOf(i16));
                        arrayList8.add(c5734.f14044);
                        arrayList9.add(c5734.f14042);
                    }
                }
                String strConcat2 = "subtitle:".concat(str6);
                C10307[] c10307Arr4 = (C10307[]) arrayList9.toArray(new C10307[0]);
                String str7 = C5792.f14228;
                C19144 c19144M32164 = m32162(strConcat2, 3, (Uri[]) arrayList8.toArray(new Uri[0]), c10307Arr4, null, AbstractC16192.m36872of(), map, j);
                arrayList.add(C15129.m34551(arrayList10));
                arrayList3.add(c19144M32164);
                int length = c10307Arr4.length;
                C10307[] c10307Arr5 = new C10307[length];
                for (int i17 = 0; i17 < length; i17++) {
                    c10307Arr5[i17] = ((C4747) interfaceC23522).m10051(c10307Arr4[i17]);
                }
                c19144M32164.m43610(new C15020[]{new C15020(strConcat2, c10307Arr5)}, new int[0]);
            }
            i15++;
            list2 = list9;
            hashSet2 = hashSet2;
        }
        this.f40155 = (C19144[]) arrayList3.toArray(new C19144[0]);
        this.f40147 = this.f40155.length;
        for (int i18 = 0; i18 < this.f40150; i18++) {
            this.f40155[i18].m43609(true);
        }
        for (C19144 c19144 : this.f40155) {
            c19144.m43616();
        }
        this.f40136 = this.f40155;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ܿ */
    public final void mo13100() {
        for (C19144 c19144 : this.f40155) {
            c19144.m43622();
        }
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ᩻ */
    public final C8243 mo13102() {
        C8243 c8243 = this.f40139;
        c8243.getClass();
        return c8243;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13092(InterfaceC11617[] interfaceC11617Arr, boolean[] zArr, InterfaceC20314[] interfaceC20314Arr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int i;
        C14134 c14134 = this;
        InterfaceC20314[] interfaceC20314Arr2 = interfaceC20314Arr;
        int[] iArr = new int[interfaceC11617Arr.length];
        int[] iArr2 = new int[interfaceC11617Arr.length];
        int i2 = 0;
        while (true) {
            int length = interfaceC11617Arr.length;
            identityHashMap = c14134.f40137;
            if (i2 >= length) {
                break;
            }
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr2[i2];
            iArr[i2] = interfaceC20314 == null ? -1 : ((Integer) identityHashMap.get(interfaceC20314)).intValue();
            iArr2[i2] = -1;
            InterfaceC11617 interfaceC11617 = interfaceC11617Arr[i2];
            if (interfaceC11617 != null) {
                C15020 c15020Mo4759 = interfaceC11617.mo4759();
                int i3 = 0;
                while (true) {
                    C19144[] c19144Arr = c14134.f40155;
                    if (i3 >= c19144Arr.length) {
                        break;
                    }
                    if (c19144Arr[i3].m43625().m19033(c15020Mo4759) != -1) {
                        iArr2[i2] = i3;
                        break;
                    }
                    i3++;
                }
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = interfaceC11617Arr.length;
        InterfaceC20314[] interfaceC20314Arr3 = new InterfaceC20314[length2];
        InterfaceC20314[] interfaceC20314Arr4 = new InterfaceC20314[interfaceC11617Arr.length];
        InterfaceC11617[] interfaceC11617Arr2 = new InterfaceC11617[interfaceC11617Arr.length];
        C19144[] c19144Arr2 = new C19144[c14134.f40155.length];
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (i5 < c14134.f40155.length) {
            for (int i6 = 0; i6 < interfaceC11617Arr.length; i6++) {
                InterfaceC11617 interfaceC11618 = null;
                interfaceC20314Arr4[i6] = iArr[i6] == i5 ? interfaceC20314Arr2[i6] : null;
                if (iArr2[i6] == i5) {
                    interfaceC11618 = interfaceC11617Arr[i6];
                }
                interfaceC11617Arr2[i6] = interfaceC11618;
            }
            C19144 c19144 = c14134.f40155[i5];
            int i7 = length2;
            int i8 = i4;
            int i9 = i5;
            InterfaceC11617[] interfaceC11617Arr3 = interfaceC11617Arr2;
            C19144[] c19144Arr3 = c19144Arr2;
            boolean zM43612 = c19144.m43612(interfaceC11617Arr2, zArr, interfaceC20314Arr4, zArr2, j, z);
            boolean z2 = false;
            for (int i10 = 0; i10 < interfaceC11617Arr.length; i10++) {
                InterfaceC20314 interfaceC20315 = interfaceC20314Arr4[i10];
                if (iArr2[i10] == i9) {
                    interfaceC20315.getClass();
                    interfaceC20314Arr3[i10] = interfaceC20315;
                    identityHashMap.put(interfaceC20315, Integer.valueOf(i9));
                    z2 = true;
                } else if (iArr[i10] == i9) {
                    C23877.m52960(interfaceC20315 == null);
                }
            }
            if (z2) {
                c19144Arr3[i8] = c19144;
                i4 = i8 + 1;
                if (i8 == 0) {
                    c19144.m43609(true);
                    if (zM43612) {
                        i = i9;
                        c14134 = this;
                    } else {
                        i = i9;
                        c14134 = this;
                        C19144[] c19144Arr4 = c14134.f40136;
                        if (c19144Arr4.length == 0 || c19144 != c19144Arr4[0]) {
                        }
                    }
                    c14134.f40151.m50460();
                    z = true;
                } else {
                    i = i9;
                    c14134 = this;
                    c19144.m43609(i < c14134.f40150);
                }
            } else {
                i = i9;
                c14134 = this;
                i4 = i8;
            }
            i5 = i + 1;
            c19144Arr2 = c19144Arr3;
            length2 = i7;
            interfaceC11617Arr2 = interfaceC11617Arr3;
            interfaceC20314Arr2 = interfaceC20314Arr;
        }
        System.arraycopy(interfaceC20314Arr3, 0, interfaceC20314Arr, 0, length2);
        C19144[] c19144Arr5 = (C19144[]) C5792.m13009(i4, c19144Arr2);
        c14134.f40136 = c19144Arr5;
        AbstractC16192 abstractC16192M36882 = AbstractC16192.m36882(c19144Arr5);
        AbstractList abstractListM21989 = C9468.m21989(abstractC16192M36882, new C5417());
        c14134.f40134.getClass();
        c14134.f40135 = new C21244(abstractC16192M36882, abstractListM21989);
        return j;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final void mo13093(long j, boolean z) {
        for (C19144 c19144 : this.f40136) {
            c19144.m43607(j, z);
        }
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        this.f40135.mo4635(j);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        if (this.f40139 == null) {
            for (C19144 c19144 : this.f40155) {
                c19144.m43616();
            }
            return false;
        }
        return this.f40135.mo4632(c13268);
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        return this.f40135.mo4631();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        return this.f40135.mo4634();
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        return this.f40135.mo4633();
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13090(long j) {
        C19144[] c19144Arr = this.f40136;
        if (c19144Arr.length > 0) {
            boolean zM43618 = c19144Arr[0].m43618(j, false);
            int i = 1;
            while (true) {
                C19144[] c19144Arr2 = this.f40136;
                if (i >= c19144Arr2.length) {
                    break;
                }
                c19144Arr2[i].m43618(j, zM43618);
                i++;
            }
            if (zM43618) {
                this.f40151.m50460();
            }
        }
        return j;
    }

    @Override // p067l.InterfaceC11441
    /* JADX INFO: renamed from: ֫ */
    public final long mo13091(long j, C11491 c11491) {
        for (C19144 c19144 : this.f40136) {
            if (c19144.m43615()) {
                return c19144.m43606(j, c11491);
            }
        }
        return j;
    }

    @Override // p067l.InterfaceC4133
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8373() {
        for (C19144 c19144 : this.f40155) {
            c19144.m43614();
        }
        this.f40138.mo13095((InterfaceC2878) this);
    }

    @Override // p067l.InterfaceC4133
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8372(Uri uri, C4160 c4160, boolean z) {
        boolean zM43611 = true;
        for (C19144 c19144 : this.f40155) {
            zM43611 &= c19144.m43611(uri, c4160, z);
        }
        this.f40138.mo13095((InterfaceC2878) this);
        return zM43611;
    }

    /* JADX INFO: renamed from: ֫ */
    private C19144 m32162(String str, int i, Uri[] uriArr, C10307[] c10307Arr, C10307 c10307, List list, Map map, long j) {
        return new C19144(str, i, this.f40146, new C16815(this.f40154, this.f40148, uriArr, c10307Arr, this.f40144, this.f40133, this.f40151, list, this.f40149), map, this.f40152, j, c10307, this.f40140, this.f40143, this.f40145, this.f40142, this.f40141);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10307 m32161(C10307 c10307, C10307 c10308, boolean z) {
        C25079 c25079;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        List list;
        List listM36872of = AbstractC16192.m36872of();
        if (c10308 != null) {
            str3 = c10308.f28533;
            c25079 = c10308.f28526;
            i2 = c10308.f28539;
            i = c10308.f28542;
            i3 = c10308.f28522;
            str = c10308.f28517;
            str2 = c10308.f28549;
            list = c10308.f28545;
        } else {
            String strM13017 = C5792.m13017(1, c10307.f28533);
            c25079 = c10307.f28526;
            if (z) {
                i2 = c10307.f28539;
                i = c10307.f28542;
                i3 = c10307.f28522;
                str = c10307.f28517;
                str2 = c10307.f28549;
                listM36872of = c10307.f28545;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            List list2 = listM36872of;
            str3 = strM13017;
            list = list2;
        }
        String strM26817 = C11669.m26817(str3);
        int i4 = z ? c10307.f28537 : -1;
        int i5 = z ? c10307.f28529 : -1;
        C3601 c3601 = new C3601();
        c3601.m6701(c10307.f28535);
        c3601.m6705(str2);
        c3601.m6695(list);
        c3601.m6694(c10307.f28520);
        c3601.m6697(strM26817);
        c3601.m6677(str3);
        c3601.m6681(c25079);
        c3601.m6700(i4);
        c3601.m6670(i5);
        c3601.m6704(i2);
        c3601.m6698(i);
        c3601.m6686(i3);
        c3601.m6703(str);
        return c3601.m6672();
    }
}
