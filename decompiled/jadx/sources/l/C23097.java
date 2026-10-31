package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.᩺ܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86ZM */
/* JADX INFO: loaded from: classes.dex */
public final class C23097 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f74309;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f74310;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f74311;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f74312;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15068 f74313;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f74314;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f74315;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f74316;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f74317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f74318;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21834 f74319;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15068[] f74320;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC20276[] f74321;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f74322;

    public C23097(AbstractC20276[] abstractC20276Arr, C15068 c15068, C21834 c21834, int i, int i2, int i3) {
        boolean z;
        AbstractC20276[] abstractC20276Arr2 = abstractC20276Arr;
        this.f74321 = abstractC20276Arr2;
        this.f74313 = c15068;
        this.f74319 = c21834;
        int i4 = C7017.f21654;
        C21834 unused = c15068.m35669().f22434;
        this.f74310 = i;
        this.f74317 = i2;
        this.f74314 = i3;
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        arrayList.add(c15068);
        identityHashMap.put(c15068, 0);
        int length = abstractC20276Arr2.length;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = false;
        while (i5 < length) {
            AbstractC20276 abstractC20276 = abstractC20276Arr2[i5];
            if (abstractC20276 instanceof C12514) {
                C12514 c12514 = (C12514) abstractC20276;
                z3 = c12514.f37608.m28265() ? false : z3;
                if (c12514.f37610) {
                    z4 = false;
                }
            } else if (abstractC20276 instanceof C10398) {
                C10398 c10398 = (C10398) abstractC20276;
                C8281 c8281 = c10398.f31285;
                if (c8281 != null) {
                    for (C15068 c15069 : c8281.f25457) {
                        if (c15069 != null && !identityHashMap.containsKey(c15069)) {
                            identityHashMap.put(c15069, Integer.valueOf(arrayList.size()));
                            arrayList.add(c15069);
                        }
                    }
                    z2 = true;
                }
                if (c10398.f31287.isEmpty() && ((c8281 != null || c10398.f31284.f16989.length != 0) && ((z = c10398.f31288) || !c10398.f31280 || c8281 != null))) {
                    z5 = true;
                    if (z) {
                        z6 = true;
                    }
                }
            }
            i5++;
            abstractC20276Arr2 = abstractC20276Arr;
        }
        this.f74320 = (C15068[]) arrayList.toArray(new C15068[0]);
        this.f74318 = identityHashMap;
        this.f74322 = z2;
        this.f74311 = z3;
        this.f74312 = z3 && z4;
        this.f74316 = z4;
        boolean z7 = z3 && z4 && z5;
        this.f74315 = z7;
        this.f74309 = z7 && z6;
    }

    /* JADX WARN: Code duplicated, block: B:287:0x072d  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23097 m51264(C15068 c15068) {
        boolean z;
        int i;
        C11251 c11251;
        ArrayList arrayList;
        AbstractC20276[] abstractC20276Arr;
        int i2;
        AbstractC20276 c13219;
        AbstractC20276 abstractC20276M51263;
        C21834 c21834M35651;
        C8281 c8281;
        C6164 c6164;
        int i3;
        int i4;
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        C4753 c4753M13900;
        C11003.requireNonNull(c15068, am.N);
        c15068.m35667();
        C11251 c11251M18953 = C7017.m18953(c15068);
        ArrayList arrayList2 = new ArrayList();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        arrayList2.add(new C1225(c15068, c15068, c15068.m35653(), null));
        int i5 = 0;
        identityHashMap3.put(c15068, 0);
        int i6 = 0;
        while (true) {
            int i7 = 2;
            int i8 = 1;
            if (i6 >= arrayList2.size()) {
                byte b = 1;
                byte[] bArr = new byte[arrayList2.size()];
                ArrayDeque arrayDeque = new ArrayDeque();
                int i9 = 0;
                while (i9 < arrayList2.size()) {
                    if (bArr[i9] == 0) {
                        bArr[i9] = b;
                        arrayDeque.push(new C21687(i9));
                        while (!arrayDeque.isEmpty()) {
                            C21687 c21687 = (C21687) arrayDeque.peek();
                            C1225 c1225 = (C1225) arrayList2.get(c21687.f69563);
                            C15335 c15335 = c1225.f4392;
                            int[] iArr = c1225.f4391;
                            int length = c15335 == null ? iArr.length : Math.min(2, iArr.length);
                            if ((c1225.f4393 instanceof C0252) || (i4 = c21687.f69564) == length) {
                                bArr[c21687.f69563] = 2;
                                arrayDeque.pop();
                            } else {
                                c21687.f69564 = i4 + 1;
                                int i10 = iArr[i4];
                                byte b2 = bArr[i10];
                                if (b2 == 1) {
                                    throw m51262(((C1225) arrayList2.get(i10)).f4393, "Cyclic eager syntax structure");
                                }
                                if (b2 == 0) {
                                    bArr[i10] = 1;
                                    arrayDeque.push(new C21687(i10));
                                }
                            }
                        }
                    }
                    i9++;
                    b = 1;
                }
                int size = arrayList2.size();
                C7225[] c7225Arr = new C7225[size];
                byte[] bArr2 = new byte[arrayList2.size()];
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC9693 abstractC9693 = ((C1225) arrayList2.get(i11)).f4393;
                    if (abstractC9693 instanceof C1372) {
                        c7225Arr[i11] = ((C1372) abstractC9693).m4852().m15915();
                        bArr2[i11] = 2;
                    } else if (abstractC9693 instanceof C4195) {
                        c7225Arr[i11] = ((C4195) abstractC9693).m12659().m8610();
                        bArr2[i11] = 2;
                    }
                }
                ArrayDeque arrayDeque2 = new ArrayDeque();
                for (int i12 = 0; i12 < size; i12++) {
                    if (bArr2[i12] == 0) {
                        bArr2[i12] = 1;
                        arrayDeque2.push(new C21687(i12));
                        while (!arrayDeque2.isEmpty()) {
                            C21687 c21688 = (C21687) arrayDeque2.peek();
                            C1225 c1226 = (C1225) arrayList2.get(c21688.f69563);
                            int length2 = c1226.f4391.length;
                            AbstractC9693 abstractC9694 = c1226.f4393;
                            if ((abstractC9694 instanceof C8428) || ((abstractC9694 instanceof C19304) && ((C19304) abstractC9694).m44502() != 2)) {
                                length2 = Math.min(length2, 1);
                            }
                            if (c21688.f69564 == length2 || c21688.f69565.m19326()) {
                                int i13 = c21688.f69563;
                                c7225Arr[i13] = c21688.f69565;
                                bArr2[i13] = 2;
                                arrayDeque2.pop();
                            } else {
                                int[] iArr2 = c1226.f4391;
                                int i14 = c21688.f69564;
                                int i15 = iArr2[i14];
                                byte b3 = bArr2[i15];
                                if (b3 == 0) {
                                    bArr2[i15] = 1;
                                    arrayDeque2.push(new C21687(i15));
                                } else {
                                    c21688.f69564 = i14 + 1;
                                    c21688.f69565 = c21688.f69565.m19320(b3 == 1 ? C7225.f22115 : c7225Arr[i15]);
                                }
                            }
                        }
                    }
                }
                int size2 = arrayList2.size();
                AbstractC20276[] abstractC20276Arr2 = new AbstractC20276[size2];
                int i16 = 0;
                while (i16 < size2) {
                    C1225 c1227 = (C1225) arrayList2.get(i16);
                    C7225 c7225 = c7225Arr[i16];
                    C15068 c15069 = c1227.f4394;
                    C15335 c15336 = c1227.f4392;
                    int[] iArr3 = c1227.f4391;
                    AbstractC9693 abstractC9695 = c1227.f4393;
                    if (abstractC9695 instanceof C1372) {
                        C1372 c1372 = (C1372) abstractC9695;
                        List listM4854 = c1372.m4854();
                        int[] iArr4 = new int[listM4854.size()];
                        C21834[] c21834Arr = new C21834[listM4854.size()];
                        C8720[] c8720Arr = new C8720[listM4854.size()];
                        int i17 = 0;
                        while (i17 < listM4854.size()) {
                            C3489 c3489 = (C3489) listM4854.get(i17);
                            iArr4[i17] = c3489.f11057;
                            int i18 = size2;
                            if (c3489.f11054.startsWith("parseColor(")) {
                                C8720 c8720M10673 = c3489.m10673();
                                c8720Arr[i17] = c8720M10673;
                                int iM22538 = c8720M10673.m22538();
                                c21834Arr[i17] = iM22538 == 0 ? C21834.f69949 : c15069.m35651(iM22538);
                            } else {
                                c21834Arr[i17] = c15069.m35651(c3489.f11055);
                            }
                            i17++;
                            size2 = i18;
                        }
                        i = size2;
                        C5606 c5606M4852 = c1372.m4852();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List listM4851 = c1372.m4851();
                        int i19 = 0;
                        c11251 = c11251M18953;
                        while (i19 < listM4851.size()) {
                            ((ArrayList) C13843.computeIfAbsent(linkedHashMap, Integer.valueOf(((C8987) listM4851.get(i19)).m23222()), new C0519(0))).add(Integer.valueOf(iArr3[i19]));
                            i19++;
                            listM4851 = listM4851;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        C11809[] c11809Arr = new C11809[linkedHashMap.size()];
                        Iterator it = linkedHashMap.entrySet().iterator();
                        int i20 = 0;
                        int i21 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            int size3 = ((ArrayList) entry.getValue()).size();
                            Iterator it2 = it;
                            int[] iArr5 = new int[size3];
                            AbstractC20276[] abstractC20276Arr3 = abstractC20276Arr2;
                            int i22 = 0;
                            while (i22 < size3) {
                                iArr5[i22] = ((Integer) ((ArrayList) entry.getValue()).get(i22)).intValue();
                                i22++;
                                i16 = i16;
                            }
                            c11809Arr[i20] = new C11809(((Integer) entry.getKey()).intValue(), i21, iArr5);
                            i21 += size3;
                            i20++;
                            it = it2;
                            abstractC20276Arr2 = abstractC20276Arr3;
                            i16 = i16;
                        }
                        abstractC20276Arr = abstractC20276Arr2;
                        i2 = i16;
                        abstractC20276M51263 = new C12514(c5606M4852, iArr4, c21834Arr, c8720Arr, c11809Arr, c1372.m4857(), c15069.m35669().f22434);
                    } else {
                        i = size2;
                        c11251 = c11251M18953;
                        arrayList = arrayList2;
                        abstractC20276Arr = abstractC20276Arr2;
                        i2 = i16;
                        if (abstractC9695 instanceof C4195) {
                            C4195 c4195 = (C4195) abstractC9695;
                            abstractC20276M51263 = new C3342(c4195.m12659().m8605(), c15069.m35651(c4195.m12656()));
                        } else {
                            boolean z2 = abstractC9695 instanceof C0252;
                            if (z2 || (abstractC9695 instanceof C12039)) {
                                c13219 = new C13219(iArr3[0], z2, c7225);
                            } else if (abstractC9695 instanceof C19304) {
                                C19304 c19304 = (C19304) abstractC9695;
                                int iM44502 = c19304.m44502();
                                int iM44500 = c19304.m44500();
                                c13219 = new C22392(iM44502, iArr3, iM44500 == 0 ? C21834.f69949 : c15069.m35651(iM44500), c7225);
                            } else if (abstractC9695 instanceof C8428) {
                                C8428 c8428 = (C8428) abstractC9695;
                                int length3 = c15336 == null ? iArr3.length - 2 : 0;
                                boolean zM22076 = c8428.m22076();
                                int iMin = Math.min(c15336 == null ? length3 : 1, c8428.m22078());
                                int i23 = c15336 == null ? length3 + (!zM22076 ? 1 : 0) : 0;
                                int[] iArr6 = new int[i23];
                                int i24 = 2;
                                for (int i25 = 0; i25 < i23; i25++) {
                                    if (zM22076 || i25 != iMin) {
                                        i3 = iArr3[i24];
                                        i24++;
                                    } else {
                                        i3 = iArr3[1];
                                    }
                                    iArr6[i25] = i3;
                                }
                                int iM22085 = c8428.m22085();
                                C21834 c21834M35652 = iM22085 == 0 ? C21834.f69949 : c15069.m35651(iM22085);
                                C21834 c21834M35653 = c8428.m22087() == 0 ? c21834M35652 : c15069.m35651(c8428.m22087());
                                BitSet bitSetM22093 = c8428.m22093();
                                if (c15336 == null) {
                                    c8281 = null;
                                } else {
                                    C15068[] c15068Arr = c15336.f46996;
                                    int length4 = c15068Arr.length;
                                    int[] iArr7 = new int[length4];
                                    C15068[] c15068Arr2 = new C15068[length4];
                                    int i26 = 0;
                                    while (i26 < length4) {
                                        int i27 = length4;
                                        int i28 = c15336.f46995[i26];
                                        iArr7[i26] = i28 < 0 ? -1 : iArr3[i28];
                                        c15068Arr2[i26] = c15068Arr[i26];
                                        i26++;
                                        length4 = i27;
                                    }
                                    int iM22079 = c8428.m22079();
                                    if (iM22079 != 0) {
                                        c21834M35651 = c15069.m35651(iM22079);
                                    } else if (c8428.m22087() == 0) {
                                        int iM22086 = c8428.m22085();
                                        c21834M35651 = iM22086 == 0 ? C21834.f69949 : c15069.m35651(iM22086);
                                    } else {
                                        c21834M35651 = c15069.m35651(c8428.m22087());
                                    }
                                    c8281 = new C8281(c15336.f46994, c15336.f46999, c15336.f46998, c15336.f46997, iArr7, c15068Arr2, c21834M35651);
                                }
                                AbstractC9693 abstractC9693M22086 = c8428.m22086();
                                if (abstractC9693M22086 instanceof C1372) {
                                    C1372 c1373 = (C1372) abstractC9693M22086;
                                    if (c1373.m4849().isEmpty()) {
                                        c6164 = null;
                                    } else {
                                        AbstractC9693 abstractC9693M22094 = c8428.m22094();
                                        if (!(abstractC9693M22094 instanceof C1372)) {
                                            throw m51262(c8428, "start exports require a direct end match");
                                        }
                                        C1372 c1374 = (C1372) abstractC9693M22094;
                                        List listM4849 = c1373.m4849();
                                        int[] iArr8 = new int[listM4849.size()];
                                        HashMap map = new HashMap(listM4849.size() * 2);
                                        int i29 = 0;
                                        while (i29 < listM4849.size()) {
                                            C23327 c23327 = (C23327) listM4849.get(i29);
                                            iArr8[i29] = c23327.m51733();
                                            map.put(c23327.m51734(), Integer.valueOf(i29));
                                            i29++;
                                            listM4849 = listM4849;
                                        }
                                        List listM15914 = c1374.m4852().m15914();
                                        int size4 = listM15914.size();
                                        int[] iArr9 = new int[size4];
                                        int i30 = 0;
                                        while (i30 < size4) {
                                            List list = listM15914;
                                            String str = (String) listM15914.get(i30);
                                            Integer num = (Integer) map.get(str);
                                            if (num == null) {
                                                throw m51262(c8428, C20094.m46315("Undefined scope variable: ", str));
                                            }
                                            iArr9[i30] = num.intValue();
                                            i30++;
                                            listM15914 = list;
                                        }
                                        c6164 = new C6164(iArr8, iArr9, c1374.m4852());
                                    }
                                } else {
                                    c6164 = null;
                                }
                                abstractC20276M51263 = new C10398(iArr3[0], iArr3[1], m51263(iArr6, c7225Arr), c21834M35652, c21834M35653, zM22076, c8428.m22077(), iMin, bitSetM22093 == null ? new BitSet() : (BitSet) bitSetM22093.clone(), c8281, c6164, c7225);
                            } else {
                                abstractC20276M51263 = m51263(iArr3, c7225Arr);
                            }
                            abstractC20276M51263 = c13219;
                        }
                    }
                    abstractC20276Arr[i2] = abstractC20276M51263;
                    i16 = i2 + 1;
                    size2 = i;
                    c11251M18953 = c11251;
                    arrayList2 = arrayList;
                    abstractC20276Arr2 = abstractC20276Arr;
                }
                C11251 c11252 = c11251M18953;
                ArrayList arrayList3 = arrayList2;
                AbstractC20276[] abstractC20276Arr4 = abstractC20276Arr2;
                C21834 c21834M35661 = c15068.m35661();
                int iMax = Math.max(8, Math.min(64, arrayList3.size()));
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((C1225) it3.next()).f4392 != null) {
                        z = true;
                        break;
                    }
                }
                int iHashCode = c15068.hashCode();
                if (z) {
                    iHashCode = (iHashCode * 31) + 1162691140;
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        C15335 c15337 = ((C1225) it4.next()).f4392;
                        if (c15337 != null) {
                            C15068[] c15068Arr3 = c15337.f46996;
                            iHashCode = (iHashCode * 31) + c15068Arr3.length;
                            int length5 = c15068Arr3.length;
                            for (int i31 = 0; i31 < length5; i31++) {
                                C15068 c150610 = c15068Arr3[i31];
                                iHashCode = (iHashCode * 31) + (c150610 == null ? 0 : 1);
                                if (c150610 != null) {
                                    iHashCode = c150610.hashCode() + (iHashCode * 31);
                                }
                            }
                        }
                    }
                }
                return new C23097(abstractC20276Arr4, c15068, c21834M35661, iMax, iHashCode, c11252.m27839());
            }
            C1225 c1228 = (C1225) arrayList2.get(i6);
            int i32 = 0;
            while (i32 < c1228.f4391.length) {
                AbstractC9693 abstractC9696 = (AbstractC9693) c1228.f4395.get(i32);
                Integer numValueOf = (Integer) identityHashMap3.get(abstractC9696);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(arrayList2.size());
                    identityHashMap3.put(abstractC9696, numValueOf);
                    boolean z3 = abstractC9696 instanceof C15068;
                    final C15068 c150611 = z3 ? (C15068) abstractC9696 : c1228.f4394;
                    if (z3) {
                        C15068 c150612 = (C15068) abstractC9696;
                        c150612.m35667();
                        c4753M13900 = C4753.m13900(c150612.m35653());
                    } else if (abstractC9696 instanceof C0252) {
                        try {
                            Object[] objArr = new Object[i8];
                            objArr[i5] = c150611.m35658(((C0252) abstractC9696).m1518());
                            ArrayList arrayList4 = new ArrayList(i8);
                            Object obj = objArr[i5];
                            C11003.requireNonNull(obj);
                            arrayList4.add(obj);
                            c4753M13900 = C4753.m13900(C20195.unmodifiableList(arrayList4));
                        } catch (RuntimeException e) {
                            throw m51262(abstractC9696, e.getMessage());
                        }
                    } else if (abstractC9696 instanceof C12039) {
                        try {
                            Object[] objArr2 = new Object[i8];
                            objArr2[0] = (AbstractC9693) C13843.computeIfAbsent((Map) C13843.computeIfAbsent(identityHashMap4, c150611, new C18865(i5)), ((C12039) abstractC9696).m29414(), new Function() { // from class: l.᩵ܺܿ
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo22274andThen(Function function) {
                                    return C20696.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C20696.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return C7017.m18952((AbstractC9693) c150611, (String) obj2);
                                }
                            });
                            ArrayList arrayList5 = new ArrayList(i8);
                            Object obj2 = objArr2[0];
                            C11003.requireNonNull(obj2);
                            arrayList5.add(obj2);
                            c4753M13900 = C4753.m13900(C20195.unmodifiableList(arrayList5));
                        } catch (RuntimeException e2) {
                            throw m51262(abstractC9696, e2.getMessage());
                        }
                    } else if (abstractC9696 instanceof C2370) {
                        C2370 c2370 = (C2370) abstractC9696;
                        if (c2370.m7684().isEmpty()) {
                            throw m51262(abstractC9696, "Empty competition");
                        }
                        c4753M13900 = C4753.m13900(c2370.m7684());
                    } else {
                        if (abstractC9696 instanceof C19304) {
                            C19304 c19305 = (C19304) abstractC9696;
                            if (c19305.m44502() < 0 || c19305.m44502() > i7) {
                                throw m51262(c19305, "Invalid group type");
                            }
                            c4753M13900 = C4753.m13900(c19305.m44497());
                        } else if (abstractC9696 instanceof C8428) {
                            C8428 c8429 = (C8428) abstractC9696;
                            C1664 c1664M22091 = c8429.m22091();
                            if (c1664M22091 != null) {
                                C1664 c1664M5643 = c1664M22091.m5643(c150611);
                                int iM5645 = c1664M5643.m5645();
                                int i33 = (!c1664M5643.m5649() || c1664M5643.m5648() == null) ? -1 : iM5645;
                                int i34 = c1664M5643.m5649() ? iM5645 + (i33 < 0 ? 0 : 1) : 1;
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList6 = new ArrayList(i34 + 2);
                                AbstractC9693 abstractC9693M22087 = c8429.m22086();
                                C11003.requireNonNull(abstractC9693M22087, "start");
                                arrayList6.add(abstractC9693M22087);
                                AbstractC9693 abstractC9693M22095 = c8429.m22094();
                                C11003.requireNonNull(abstractC9693M22095, "end");
                                arrayList6.add(abstractC9693M22095);
                                C15068[] c15068Arr4 = new C15068[i34];
                                int[] iArr10 = new int[i34];
                                String[] strArr = c1664M5643.m5649() ? new String[iM5645] : null;
                                int i35 = 0;
                                while (i35 < i34) {
                                    String strM5646 = c1664M5643.m5649() ? i35 < iM5645 ? c1664M5643.m5646(i35) : c1664M5643.m5648() : c1664M5643.m5650();
                                    C11003.requireNonNull(strM5646);
                                    C15068 c15068M27840 = c11251M18953.m27840(strM5646);
                                    c15068Arr4[i35] = c15068M27840;
                                    if (c1664M5643.m5649() && i35 < iM5645) {
                                        strArr[i35] = c1664M5643.m5642(i35);
                                    }
                                    if (c15068M27840 == null) {
                                        iArr10[i35] = -1;
                                    } else {
                                        iArr10[i35] = arrayList6.size();
                                        arrayList6.add(c15068M27840);
                                    }
                                    i35++;
                                }
                                c4753M13900 = new C4753(arrayList6, new C15335(c1664M5643.m5649() ? c1664M5643.m5641() : -1, c1664M5643.m5647(), strArr, i33, c15068Arr4, iArr10));
                            } else {
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList7 = new ArrayList(((ArrayList) c8429.m22090()).size() + 2);
                                AbstractC9693 abstractC9693M22088 = c8429.m22086();
                                C11003.requireNonNull(abstractC9693M22088, "start");
                                arrayList7.add(abstractC9693M22088);
                                AbstractC9693 abstractC9693M22096 = c8429.m22094();
                                C11003.requireNonNull(abstractC9693M22096, "end");
                                arrayList7.add(abstractC9693M22096);
                                arrayList7.addAll(c8429.m22090());
                                c4753M13900 = C4753.m13900(arrayList7);
                            }
                        } else {
                            identityHashMap = identityHashMap3;
                            identityHashMap2 = identityHashMap4;
                            if (abstractC9696 instanceof C1372) {
                                C1372 c1375 = (C1372) abstractC9696;
                                ArrayList arrayList8 = new ArrayList(c1375.m4851().size());
                                Iterator it5 = c1375.m4851().iterator();
                                while (it5.hasNext()) {
                                    arrayList8.add(((C8987) it5.next()).m23224());
                                }
                                c4753M13900 = C4753.m13900(arrayList8);
                            } else {
                                if (!(abstractC9696 instanceof C4195)) {
                                    throw m51262(abstractC9696, "Unknown syntax rule");
                                }
                                c4753M13900 = C4753.m13900(Collections.EMPTY_LIST);
                            }
                        }
                        arrayList2.add(new C1225(c150611, abstractC9696, c4753M13900.f15072, c4753M13900.f15071));
                    }
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                    arrayList2.add(new C1225(c150611, abstractC9696, c4753M13900.f15072, c4753M13900.f15071));
                } else {
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                }
                c1228.f4391[i32] = numValueOf.intValue();
                i32++;
                i5 = 0;
                i7 = 2;
                i8 = 1;
                identityHashMap3 = identityHashMap;
                identityHashMap4 = identityHashMap2;
            }
            i6++;
            i5 = 0;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m51274() {
        return this.f74317;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51272() {
        return !this.f74322 || C7017.m18972(this.f74314);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51270() {
        return this.f74322;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51265() {
        return this.f74320.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15068 m51268(int i) {
        C15068[] c15068Arr = this.f74320;
        return c15068Arr[C11003.checkIndex(i, c15068Arr.length)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51266(C15068 c15068) {
        Integer num = (Integer) this.f74318.get(c15068);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3158 m51267(CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        return new C3158(this, charSequence, interfaceC17066);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m51275() {
        return this.f74311;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m51269() {
        return this.f74312;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51276() {
        return this.f74316;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m51271() {
        return this.f74315;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m51273() {
        return this.f74309;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5459 m51263(int[] iArr, C7225[] c7225Arr) {
        int length = iArr.length;
        C7225[] c7225Arr2 = new C7225[length];
        C7225 c7225M19320 = C7225.f22117;
        for (int i = 0; i < length; i++) {
            C7225 c7225 = c7225Arr[iArr[i]];
            c7225Arr2[i] = c7225;
            c7225M19320 = c7225M19320.m19320(c7225);
        }
        return new C5459(iArr, c7225Arr2, c7225M19320);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m51262(AbstractC9693 abstractC9693, String str) {
        String str2;
        StringBuilder sbM19190 = C7166.m19190(str, ": ");
        sbM19190.append(abstractC9693.getClass().getSimpleName());
        if (abstractC9693.f29308 == null) {
            str2 = "";
        } else {
            str2 = " at " + abstractC9693.f29308;
        }
        sbM19190.append(str2);
        return new IllegalArgumentException(sbM19190.toString());
    }
}
