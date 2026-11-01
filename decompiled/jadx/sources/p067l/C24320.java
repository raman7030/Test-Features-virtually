package p067l;

import com.umeng.analytics.pro.C0655am;
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
public final class C24320 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f77055;

    /* JADX INFO: renamed from: ۖ */
    public final int f77056;

    /* JADX INFO: renamed from: ۘ */
    public final boolean f77057;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f77058;

    /* JADX INFO: renamed from: ۡ */
    public final C16689 f77059;

    /* JADX INFO: renamed from: ۢ */
    public final int f77060;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f77061;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f77062;

    /* JADX INFO: renamed from: ܺ */
    public final int f77063;

    /* JADX INFO: renamed from: ܽ */
    public final IdentityHashMap f77064;

    /* JADX INFO: renamed from: ܿ */
    public final C23120 f77065;

    /* JADX INFO: renamed from: ᩳ */
    public final C16689[] f77066;

    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC21639[] f77067;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f77068;

    public C24320(AbstractC21639[] abstractC21639Arr, C16689 c16689, C23120 c23120, int i, int i2, int i3) {
        boolean z;
        AbstractC21639[] abstractC21639Arr2 = abstractC21639Arr;
        this.f77067 = abstractC21639Arr2;
        this.f77059 = c16689;
        this.f77065 = c23120;
        int i4 = C9038.f24535;
        C23120 unused = c16689.m37827().f25325;
        this.f77056 = i;
        this.f77063 = i2;
        this.f77060 = i3;
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        arrayList.add(c16689);
        identityHashMap.put(c16689, 0);
        int length = abstractC21639Arr2.length;
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = false;
        while (i5 < length) {
            AbstractC21639 abstractC21639 = abstractC21639Arr2[i5];
            if (abstractC21639 instanceof C14262) {
                C14262 c14262 = (C14262) abstractC21639;
                z3 = c14262.f40632.m30309() ? false : z3;
                if (c14262.f40634) {
                    z4 = false;
                }
            } else if (abstractC21639 instanceof C12251) {
                C12251 c12251 = (C12251) abstractC21639;
                C10239 c10239 = c12251.f34250;
                if (c10239 != null) {
                    for (C16689 c166810 : c10239.f28367) {
                        if (c166810 != null && !identityHashMap.containsKey(c166810)) {
                            identityHashMap.put(c166810, Integer.valueOf(arrayList.size()));
                            arrayList.add(c166810);
                        }
                    }
                    z2 = true;
                }
                if (c12251.f34252.isEmpty() && ((c10239 != null || c12251.f34249.f19830.length != 0) && ((z = c12251.f34253) || !c12251.f34245 || c10239 != null))) {
                    z5 = true;
                    if (z) {
                        z6 = true;
                    }
                }
            }
            i5++;
            abstractC21639Arr2 = abstractC21639Arr;
        }
        this.f77066 = (C16689[]) arrayList.toArray(new C16689[0]);
        this.f77064 = identityHashMap;
        this.f77068 = z2;
        this.f77057 = z3;
        this.f77058 = z3 && z4;
        this.f77062 = z4;
        boolean z7 = z3 && z4 && z5;
        this.f77061 = z7;
        this.f77055 = z7 && z6;
    }

    /* JADX WARN: Code duplicated, block: B:287:0x072d  */
    /* JADX INFO: renamed from: ۧ */
    public static C24320 m53658(C16689 c16689) {
        boolean z;
        int i;
        C13062 c13062;
        ArrayList arrayList;
        AbstractC21639[] abstractC21639Arr;
        int i2;
        AbstractC21639 c14932;
        AbstractC21639 abstractC21639M53657;
        C23120 c23120M37809;
        C10239 c10239;
        C8227 c8227;
        int i3;
        int i4;
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        C6886 c6886M15780;
        C12826.requireNonNull(c16689, C0655am.f2259N);
        c16689.m37825();
        C13062 c13062M20910 = C9038.m20910(c16689);
        ArrayList arrayList2 = new ArrayList();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        IdentityHashMap identityHashMap4 = new IdentityHashMap();
        arrayList2.add(new C3533(c16689, c16689, c16689.m37811(), null));
        int i5 = 0;
        identityHashMap3.put(c16689, 0);
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
                        arrayDeque.push(new C22980(i9));
                        while (!arrayDeque.isEmpty()) {
                            C22980 c22980 = (C22980) arrayDeque.peek();
                            C3533 c3533 = (C3533) arrayList2.get(c22980.f72268);
                            C16943 c16943 = c3533.f7162;
                            int[] iArr = c3533.f7161;
                            int length = c16943 == null ? iArr.length : Math.min(2, iArr.length);
                            if ((c3533.f7163 instanceof C2608) || (i4 = c22980.f72269) == length) {
                                bArr[c22980.f72268] = 2;
                                arrayDeque.pop();
                            } else {
                                c22980.f72269 = i4 + 1;
                                int i10 = iArr[i4];
                                byte b2 = bArr[i10];
                                if (b2 == 1) {
                                    throw m53656(((C3533) arrayList2.get(i10)).f7163, "Cyclic eager syntax structure");
                                }
                                if (b2 == 0) {
                                    bArr[i10] = 1;
                                    arrayDeque.push(new C22980(i10));
                                }
                            }
                        }
                    }
                    i9++;
                    b = 1;
                }
                int size = arrayList2.size();
                C9235[] c9235Arr = new C9235[size];
                byte[] bArr2 = new byte[arrayList2.size()];
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC11581 abstractC11581 = ((C3533) arrayList2.get(i11)).f7163;
                    if (abstractC11581 instanceof C3673) {
                        c9235Arr[i11] = ((C3673) abstractC11581).m7090().m17836();
                        bArr2[i11] = 2;
                    } else if (abstractC11581 instanceof C6356) {
                        c9235Arr[i11] = ((C6356) abstractC11581).m14535().m10673();
                        bArr2[i11] = 2;
                    }
                }
                ArrayDeque arrayDeque2 = new ArrayDeque();
                for (int i12 = 0; i12 < size; i12++) {
                    if (bArr2[i12] == 0) {
                        bArr2[i12] = 1;
                        arrayDeque2.push(new C22980(i12));
                        while (!arrayDeque2.isEmpty()) {
                            C22980 c22981 = (C22980) arrayDeque2.peek();
                            C3533 c3534 = (C3533) arrayList2.get(c22981.f72268);
                            int length2 = c3534.f7161.length;
                            AbstractC11581 abstractC11582 = c3534.f7163;
                            if ((abstractC11582 instanceof C10379) || ((abstractC11582 instanceof C20715) && ((C20715) abstractC11582).m46796() != 2)) {
                                length2 = Math.min(length2, 1);
                            }
                            if (c22981.f72269 == length2 || c22981.f72270.m21275()) {
                                int i13 = c22981.f72268;
                                c9235Arr[i13] = c22981.f72270;
                                bArr2[i13] = 2;
                                arrayDeque2.pop();
                            } else {
                                int[] iArr2 = c3534.f7161;
                                int i14 = c22981.f72269;
                                int i15 = iArr2[i14];
                                byte b3 = bArr2[i15];
                                if (b3 == 0) {
                                    bArr2[i15] = 1;
                                    arrayDeque2.push(new C22980(i15));
                                } else {
                                    c22981.f72269 = i14 + 1;
                                    c22981.f72270 = c22981.f72270.m21269(b3 == 1 ? C9235.f24999 : c9235Arr[i15]);
                                }
                            }
                        }
                    }
                }
                int size2 = arrayList2.size();
                AbstractC21639[] abstractC21639Arr2 = new AbstractC21639[size2];
                int i16 = 0;
                while (i16 < size2) {
                    C3533 c3535 = (C3533) arrayList2.get(i16);
                    C9235 c9235 = c9235Arr[i16];
                    C16689 c166810 = c3535.f7164;
                    C16943 c16944 = c3535.f7162;
                    int[] iArr3 = c3535.f7161;
                    AbstractC11581 abstractC11583 = c3535.f7163;
                    if (abstractC11583 instanceof C3673) {
                        C3673 c3673 = (C3673) abstractC11583;
                        List listM7092 = c3673.m7092();
                        int[] iArr4 = new int[listM7092.size()];
                        C23120[] c23120Arr = new C23120[listM7092.size()];
                        C10656[] c10656Arr = new C10656[listM7092.size()];
                        int i17 = 0;
                        while (i17 < listM7092.size()) {
                            C5685 c5685 = (C5685) listM7092.get(i17);
                            iArr4[i17] = c5685.f13862;
                            int i18 = size2;
                            if (c5685.f13859.startsWith("parseColor(")) {
                                C10656 c10656M12668 = c5685.m12668();
                                c10656Arr[i17] = c10656M12668;
                                int iM24507 = c10656M12668.m24507();
                                c23120Arr[i17] = iM24507 == 0 ? C23120.f72658 : c166810.m37809(iM24507);
                            } else {
                                c23120Arr[i17] = c166810.m37809(c5685.f13860);
                            }
                            i17++;
                            size2 = i18;
                        }
                        i = size2;
                        C7697 c7697M7090 = c3673.m7090();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        List listM7089 = c3673.m7089();
                        int i19 = 0;
                        c13062 = c13062M20910;
                        while (i19 < listM7089.size()) {
                            ((ArrayList) C15525.computeIfAbsent(linkedHashMap, Integer.valueOf(((C10910) listM7089.get(i19)).m25166()), new C2862(0))).add(Integer.valueOf(iArr3[i19]));
                            i19++;
                            listM7089 = listM7089;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                        C13592[] c13592Arr = new C13592[linkedHashMap.size()];
                        Iterator it = linkedHashMap.entrySet().iterator();
                        int i20 = 0;
                        int i21 = 0;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            int size3 = ((ArrayList) entry.getValue()).size();
                            Iterator it2 = it;
                            int[] iArr5 = new int[size3];
                            AbstractC21639[] abstractC21639Arr3 = abstractC21639Arr2;
                            int i22 = 0;
                            while (i22 < size3) {
                                iArr5[i22] = ((Integer) ((ArrayList) entry.getValue()).get(i22)).intValue();
                                i22++;
                                i16 = i16;
                            }
                            c13592Arr[i20] = new C13592(((Integer) entry.getKey()).intValue(), i21, iArr5);
                            i21 += size3;
                            i20++;
                            it = it2;
                            abstractC21639Arr2 = abstractC21639Arr3;
                            i16 = i16;
                        }
                        abstractC21639Arr = abstractC21639Arr2;
                        i2 = i16;
                        abstractC21639M53657 = new C14262(c7697M7090, iArr4, c23120Arr, c10656Arr, c13592Arr, c3673.m7095(), c166810.m37827().f25325);
                    } else {
                        i = size2;
                        c13062 = c13062M20910;
                        arrayList = arrayList2;
                        abstractC21639Arr = abstractC21639Arr2;
                        i2 = i16;
                        if (abstractC11583 instanceof C6356) {
                            C6356 c6356 = (C6356) abstractC11583;
                            abstractC21639M53657 = new C5545(c6356.m14535().m10668(), c166810.m37809(c6356.m14532()));
                        } else {
                            boolean z2 = abstractC11583 instanceof C2608;
                            if (z2 || (abstractC11583 instanceof C13811)) {
                                c14932 = new C14932(iArr3[0], z2, c9235);
                            } else if (abstractC11583 instanceof C20715) {
                                C20715 c20715 = (C20715) abstractC11583;
                                int iM46796 = c20715.m46796();
                                int iM46794 = c20715.m46794();
                                c14932 = new C23650(iM46796, iArr3, iM46794 == 0 ? C23120.f72658 : c166810.m37809(iM46794), c9235);
                            } else if (abstractC11583 instanceof C10379) {
                                C10379 c10379 = (C10379) abstractC11583;
                                int length3 = c16944 == null ? iArr3.length - 2 : 0;
                                boolean zM24046 = c10379.m24046();
                                int iMin = Math.min(c16944 == null ? length3 : 1, c10379.m24048());
                                int i23 = c16944 == null ? length3 + (!zM24046 ? 1 : 0) : 0;
                                int[] iArr6 = new int[i23];
                                int i24 = 2;
                                for (int i25 = 0; i25 < i23; i25++) {
                                    if (zM24046 || i25 != iMin) {
                                        i3 = iArr3[i24];
                                        i24++;
                                    } else {
                                        i3 = iArr3[1];
                                    }
                                    iArr6[i25] = i3;
                                }
                                int iM24055 = c10379.m24055();
                                C23120 c23120M378010 = iM24055 == 0 ? C23120.f72658 : c166810.m37809(iM24055);
                                C23120 c23120M378011 = c10379.m24057() == 0 ? c23120M378010 : c166810.m37809(c10379.m24057());
                                BitSet bitSetM24063 = c10379.m24063();
                                if (c16944 == null) {
                                    c10239 = null;
                                } else {
                                    C16689[] c16689Arr = c16944.f50122;
                                    int length4 = c16689Arr.length;
                                    int[] iArr7 = new int[length4];
                                    C16689[] c16689Arr2 = new C16689[length4];
                                    int i26 = 0;
                                    while (i26 < length4) {
                                        int i27 = length4;
                                        int i28 = c16944.f50121[i26];
                                        iArr7[i26] = i28 < 0 ? -1 : iArr3[i28];
                                        c16689Arr2[i26] = c16689Arr[i26];
                                        i26++;
                                        length4 = i27;
                                    }
                                    int iM24049 = c10379.m24049();
                                    if (iM24049 != 0) {
                                        c23120M37809 = c166810.m37809(iM24049);
                                    } else if (c10379.m24057() == 0) {
                                        int iM24056 = c10379.m24055();
                                        c23120M37809 = iM24056 == 0 ? C23120.f72658 : c166810.m37809(iM24056);
                                    } else {
                                        c23120M37809 = c166810.m37809(c10379.m24057());
                                    }
                                    c10239 = new C10239(c16944.f50120, c16944.f50125, c16944.f50124, c16944.f50123, iArr7, c16689Arr2, c23120M37809);
                                }
                                AbstractC11581 abstractC11581M24056 = c10379.m24056();
                                if (abstractC11581M24056 instanceof C3673) {
                                    C3673 c3674 = (C3673) abstractC11581M24056;
                                    if (c3674.m7087().isEmpty()) {
                                        c8227 = null;
                                    } else {
                                        AbstractC11581 abstractC11581M24064 = c10379.m24064();
                                        if (!(abstractC11581M24064 instanceof C3673)) {
                                            throw m53656(c10379, "start exports require a direct end match");
                                        }
                                        C3673 c3675 = (C3673) abstractC11581M24064;
                                        List listM7087 = c3674.m7087();
                                        int[] iArr8 = new int[listM7087.size()];
                                        HashMap map = new HashMap(listM7087.size() * 2);
                                        int i29 = 0;
                                        while (i29 < listM7087.size()) {
                                            C24539 c24539 = (C24539) listM7087.get(i29);
                                            iArr8[i29] = c24539.m54130();
                                            map.put(c24539.m54131(), Integer.valueOf(i29));
                                            i29++;
                                            listM7087 = listM7087;
                                        }
                                        List listM17835 = c3675.m7090().m17835();
                                        int size4 = listM17835.size();
                                        int[] iArr9 = new int[size4];
                                        int i30 = 0;
                                        while (i30 < size4) {
                                            List list = listM17835;
                                            String str = (String) listM17835.get(i30);
                                            Integer num = (Integer) map.get(str);
                                            if (num == null) {
                                                throw m53656(c10379, C21466.m48631("Undefined scope variable: ", str));
                                            }
                                            iArr9[i30] = num.intValue();
                                            i30++;
                                            listM17835 = list;
                                        }
                                        c8227 = new C8227(iArr8, iArr9, c3675.m7090());
                                    }
                                } else {
                                    c8227 = null;
                                }
                                abstractC21639M53657 = new C12251(iArr3[0], iArr3[1], m53657(iArr6, c9235Arr), c23120M378010, c23120M378011, zM24046, c10379.m24047(), iMin, bitSetM24063 == null ? new BitSet() : (BitSet) bitSetM24063.clone(), c10239, c8227, c9235);
                            } else {
                                abstractC21639M53657 = m53657(iArr3, c9235Arr);
                            }
                            abstractC21639M53657 = c14932;
                        }
                    }
                    abstractC21639Arr[i2] = abstractC21639M53657;
                    i16 = i2 + 1;
                    size2 = i;
                    c13062M20910 = c13062;
                    arrayList2 = arrayList;
                    abstractC21639Arr2 = abstractC21639Arr;
                }
                C13062 c13063 = c13062M20910;
                ArrayList arrayList3 = arrayList2;
                AbstractC21639[] abstractC21639Arr4 = abstractC21639Arr2;
                C23120 c23120M37819 = c16689.m37819();
                int iMax = Math.max(8, Math.min(64, arrayList3.size()));
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((C3533) it3.next()).f7162 != null) {
                        z = true;
                        break;
                    }
                }
                int iHashCode = c16689.hashCode();
                if (z) {
                    iHashCode = (iHashCode * 31) + 1162691140;
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        C16943 c16945 = ((C3533) it4.next()).f7162;
                        if (c16945 != null) {
                            C16689[] c16689Arr3 = c16945.f50122;
                            iHashCode = (iHashCode * 31) + c16689Arr3.length;
                            int length5 = c16689Arr3.length;
                            for (int i31 = 0; i31 < length5; i31++) {
                                C16689 c166811 = c16689Arr3[i31];
                                iHashCode = (iHashCode * 31) + (c166811 == null ? 0 : 1);
                                if (c166811 != null) {
                                    iHashCode = c166811.hashCode() + (iHashCode * 31);
                                }
                            }
                        }
                    }
                }
                return new C24320(abstractC21639Arr4, c16689, c23120M37819, iMax, iHashCode, c13063.m29901());
            }
            C3533 c3536 = (C3533) arrayList2.get(i6);
            int i32 = 0;
            while (i32 < c3536.f7161.length) {
                AbstractC11581 abstractC11584 = (AbstractC11581) c3536.f7165.get(i32);
                Integer numValueOf = (Integer) identityHashMap3.get(abstractC11584);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(arrayList2.size());
                    identityHashMap3.put(abstractC11584, numValueOf);
                    boolean z3 = abstractC11584 instanceof C16689;
                    final C16689 c166812 = z3 ? (C16689) abstractC11584 : c3536.f7164;
                    if (z3) {
                        C16689 c166813 = (C16689) abstractC11584;
                        c166813.m37825();
                        c6886M15780 = C6886.m15780(c166813.m37811());
                    } else if (abstractC11584 instanceof C2608) {
                        try {
                            Object[] objArr = new Object[i8];
                            objArr[i5] = c166812.m37816(((C2608) abstractC11584).m3916());
                            ArrayList arrayList4 = new ArrayList(i8);
                            Object obj = objArr[i5];
                            C12826.requireNonNull(obj);
                            arrayList4.add(obj);
                            c6886M15780 = C6886.m15780(C21562.unmodifiableList(arrayList4));
                        } catch (RuntimeException e) {
                            throw m53656(abstractC11584, e.getMessage());
                        }
                    } else if (abstractC11584 instanceof C13811) {
                        try {
                            Object[] objArr2 = new Object[i8];
                            objArr2[0] = (AbstractC11581) C15525.computeIfAbsent((Map) C15525.computeIfAbsent(identityHashMap4, c166812, new C20298(i5)), ((C13811) abstractC11584).m31476(), new Function() { // from class: l.᩵ܺܿ
                                @Override // java.util.function.Function
                                /* JADX INFO: renamed from: andThen */
                                public /* synthetic */ Function mo56417andThen(Function function) {
                                    return C22038.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public /* synthetic */ Function compose(Function function) {
                                    return C22038.$default$compose(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return C9038.m20909((AbstractC11581) c166812, (String) obj2);
                                }
                            });
                            ArrayList arrayList5 = new ArrayList(i8);
                            Object obj2 = objArr2[0];
                            C12826.requireNonNull(obj2);
                            arrayList5.add(obj2);
                            c6886M15780 = C6886.m15780(C21562.unmodifiableList(arrayList5));
                        } catch (RuntimeException e2) {
                            throw m53656(abstractC11584, e2.getMessage());
                        }
                    } else if (abstractC11584 instanceof C4621) {
                        C4621 c4621 = (C4621) abstractC11584;
                        if (c4621.m9745().isEmpty()) {
                            throw m53656(abstractC11584, "Empty competition");
                        }
                        c6886M15780 = C6886.m15780(c4621.m9745());
                    } else {
                        if (abstractC11584 instanceof C20715) {
                            C20715 c20716 = (C20715) abstractC11584;
                            if (c20716.m46796() < 0 || c20716.m46796() > i7) {
                                throw m53656(c20716, "Invalid group type");
                            }
                            c6886M15780 = C6886.m15780(c20716.m46791());
                        } else if (abstractC11584 instanceof C10379) {
                            C10379 c103710 = (C10379) abstractC11584;
                            C3950 c3950M24061 = c103710.m24061();
                            if (c3950M24061 != null) {
                                C3950 c3950M7873 = c3950M24061.m7873(c166812);
                                int iM7875 = c3950M7873.m7875();
                                int i33 = (!c3950M7873.m7879() || c3950M7873.m7878() == null) ? -1 : iM7875;
                                int i34 = c3950M7873.m7879() ? iM7875 + (i33 < 0 ? 0 : 1) : 1;
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList6 = new ArrayList(i34 + 2);
                                AbstractC11581 abstractC11581M24057 = c103710.m24056();
                                C12826.requireNonNull(abstractC11581M24057, "start");
                                arrayList6.add(abstractC11581M24057);
                                AbstractC11581 abstractC11581M24065 = c103710.m24064();
                                C12826.requireNonNull(abstractC11581M24065, "end");
                                arrayList6.add(abstractC11581M24065);
                                C16689[] c16689Arr4 = new C16689[i34];
                                int[] iArr10 = new int[i34];
                                String[] strArr = c3950M7873.m7879() ? new String[iM7875] : null;
                                int i35 = 0;
                                while (i35 < i34) {
                                    String strM7876 = c3950M7873.m7879() ? i35 < iM7875 ? c3950M7873.m7876(i35) : c3950M7873.m7878() : c3950M7873.m7880();
                                    C12826.requireNonNull(strM7876);
                                    C16689 c16689M29902 = c13062M20910.m29902(strM7876);
                                    c16689Arr4[i35] = c16689M29902;
                                    if (c3950M7873.m7879() && i35 < iM7875) {
                                        strArr[i35] = c3950M7873.m7872(i35);
                                    }
                                    if (c16689M29902 == null) {
                                        iArr10[i35] = -1;
                                    } else {
                                        iArr10[i35] = arrayList6.size();
                                        arrayList6.add(c16689M29902);
                                    }
                                    i35++;
                                }
                                c6886M15780 = new C6886(arrayList6, new C16943(c3950M7873.m7879() ? c3950M7873.m7871() : -1, c3950M7873.m7877(), strArr, i33, c16689Arr4, iArr10));
                            } else {
                                identityHashMap = identityHashMap3;
                                identityHashMap2 = identityHashMap4;
                                ArrayList arrayList7 = new ArrayList(((ArrayList) c103710.m24060()).size() + 2);
                                AbstractC11581 abstractC11581M24058 = c103710.m24056();
                                C12826.requireNonNull(abstractC11581M24058, "start");
                                arrayList7.add(abstractC11581M24058);
                                AbstractC11581 abstractC11581M24066 = c103710.m24064();
                                C12826.requireNonNull(abstractC11581M24066, "end");
                                arrayList7.add(abstractC11581M24066);
                                arrayList7.addAll(c103710.m24060());
                                c6886M15780 = C6886.m15780(arrayList7);
                            }
                        } else {
                            identityHashMap = identityHashMap3;
                            identityHashMap2 = identityHashMap4;
                            if (abstractC11584 instanceof C3673) {
                                C3673 c3676 = (C3673) abstractC11584;
                                ArrayList arrayList8 = new ArrayList(c3676.m7089().size());
                                Iterator it5 = c3676.m7089().iterator();
                                while (it5.hasNext()) {
                                    arrayList8.add(((C10910) it5.next()).m25168());
                                }
                                c6886M15780 = C6886.m15780(arrayList8);
                            } else {
                                if (!(abstractC11584 instanceof C6356)) {
                                    throw m53656(abstractC11584, "Unknown syntax rule");
                                }
                                c6886M15780 = C6886.m15780(Collections.EMPTY_LIST);
                            }
                        }
                        arrayList2.add(new C3533(c166812, abstractC11584, c6886M15780.f17903, c6886M15780.f17902));
                    }
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                    arrayList2.add(new C3533(c166812, abstractC11584, c6886M15780.f17903, c6886M15780.f17902));
                } else {
                    identityHashMap = identityHashMap3;
                    identityHashMap2 = identityHashMap4;
                }
                c3536.f7161[i32] = numValueOf.intValue();
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

    /* JADX INFO: renamed from: ᩳ */
    public final int m53668() {
        return this.f77063;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53666() {
        return !this.f77068 || C9038.m20929(this.f77060);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53664() {
        return this.f77068;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53659() {
        return this.f77066.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16689 m53662(int i) {
        C16689[] c16689Arr = this.f77066;
        return c16689Arr[C12826.checkIndex(i, c16689Arr.length)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53660(C16689 c16689) {
        Integer num = (Integer) this.f77064.get(c16689);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5370 m53661(CharSequence charSequence, InterfaceC18588 interfaceC18588) {
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        return new C5370(this, charSequence, interfaceC18588);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m53669() {
        return this.f77057;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m53663() {
        return this.f77058;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m53670() {
        return this.f77062;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m53665() {
        return this.f77061;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m53667() {
        return this.f77055;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7557 m53657(int[] iArr, C9235[] c9235Arr) {
        int length = iArr.length;
        C9235[] c9235Arr2 = new C9235[length];
        C9235 c9235M21269 = C9235.f25001;
        for (int i = 0; i < length; i++) {
            C9235 c9235 = c9235Arr[iArr[i]];
            c9235Arr2[i] = c9235;
            c9235M21269 = c9235M21269.m21269(c9235);
        }
        return new C7557(iArr, c9235Arr2, c9235M21269);
    }

    /* JADX INFO: renamed from: ֫ */
    public static IllegalArgumentException m53656(AbstractC11581 abstractC11581, String str) {
        String str2;
        StringBuilder sbM21133 = C9179.m21133(str, ": ");
        sbM21133.append(abstractC11581.getClass().getSimpleName());
        if (abstractC11581.f32258 == null) {
            str2 = "";
        } else {
            str2 = " at " + abstractC11581.f32258;
        }
        sbM21133.append(str2);
        return new IllegalArgumentException(sbM21133.toString());
    }
}
