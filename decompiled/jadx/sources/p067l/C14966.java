package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14966 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f42749;

    /* JADX INFO: renamed from: ۖ */
    public final CharSequence f42750;

    /* JADX INFO: renamed from: ۘ */
    public final ArrayList f42751;

    /* JADX INFO: renamed from: ۜ */
    public final int[] f42752;

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList f42753;

    /* JADX INFO: renamed from: ۢ */
    public final int[] f42754;

    /* JADX INFO: renamed from: ۧ */
    public final boolean[] f42755;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f42756;

    /* JADX INFO: renamed from: ܺ */
    public final C24926 f42757;

    /* JADX INFO: renamed from: ܽ */
    public final C4810 f42758;

    /* JADX INFO: renamed from: ܿ */
    public final boolean[] f42759;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f42760;

    /* JADX INFO: renamed from: ᩴ */
    public final List f42761;

    /* JADX INFO: renamed from: ᩷ */
    public final int[] f42762;

    /* JADX INFO: renamed from: ᩻ */
    public final int[] f42763;

    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0440  */
    public C14966(CharSequence charSequence, List list, C10856 c10856, C4810 c4810) {
        Iterator it;
        boolean[] zArr;
        int[] iArr;
        int i;
        C14966 c14966 = this;
        c14966.f42749 = new ArrayList();
        c14966.f42753 = new ArrayList();
        c14966.f42751 = new ArrayList();
        c14966.f42750 = charSequence;
        c14966.f42761 = list;
        c14966.f42758 = c4810;
        c14966.f42757 = new C24926(c10856, list.size(), c4810);
        int i2 = 1;
        c14966.f42752 = new int[Character.codePointCount(charSequence, 0, charSequence.length()) + 1];
        int i3 = 0;
        int iCharCount = 0;
        while (true) {
            int[] iArr2 = c14966.f42752;
            if (i3 >= iArr2.length) {
                break;
            }
            iArr2[i3] = iCharCount;
            if (iCharCount < charSequence.length()) {
                iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
            }
            i3++;
        }
        int i4 = 1;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (charSequence.charAt(i5) == '\n') {
                i4++;
            }
        }
        c14966.f42763 = new int[i4];
        int i6 = 1;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (charSequence.charAt(i7) == '\n') {
                c14966.f42763[i6] = i7 + 1;
                i6++;
            }
        }
        c14966.f42754 = new int[i4];
        c14966.f42762 = new int[i4];
        int[] iArr3 = new int[i4];
        c14966.f42756 = iArr3;
        c14966.f42759 = new boolean[i4];
        c14966.f42760 = new boolean[i4];
        c14966.f42755 = new boolean[i4];
        Arrays.fill(iArr3, -1);
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = c14966.f42763[i8];
            if (i9 == 0 && C4965.m10524(charSequence, false, 0, "\ufeff", 1)) {
                i9++;
            }
            int i10 = 0;
            while (i9 < charSequence.length()) {
                char cCharAt = charSequence.charAt(i9);
                if (cCharAt == ' ') {
                    i10++;
                } else if (cCharAt == '\t') {
                    i10 = (8 - (i10 % 8)) + i10;
                } else if (cCharAt != '\f') {
                    break;
                } else {
                    i10 = 0;
                }
                i9++;
            }
            c14966.f42754[i8] = i9;
            c14966.f42762[i8] = i10;
        }
        C8500 c8500 = (C8500) c10856;
        int[] iArr4 = c14966.f42752;
        List list2 = c14966.f42761;
        if (((C21693) c8500.m25013(C21693.class, 0)) != null) {
            for (C23704 c23704 : ((C21693) c8500.m25013(C21693.class, 0)).m25011(C23704.class)) {
                int iMo4432 = c23704.f30090.mo4432();
                while (iMo4432 >= c23704.f30091.mo4432()) {
                    InterfaceC2808 interfaceC2808 = (InterfaceC2808) list2.get(iMo4432);
                    if (interfaceC2808.mo4430() == 0 && !C7492.m17272(interfaceC2808.getType())) {
                        break;
                    } else {
                        iMo4432--;
                    }
                }
                if (iMo4432 >= c23704.f30091.mo4432()) {
                    c14966.f42751.add(new C5579(iArr4[c23704.f30091.mo4434()], iArr4[((InterfaceC2808) list2.get(iMo4432)).mo4433() + 1]));
                }
            }
        }
        int[] iArr5 = c14966.f42752;
        List list3 = c14966.f42761;
        int i11 = 0;
        int i12 = 0;
        while (i12 < list3.size()) {
            c14966.f42758.m10153();
            InterfaceC2808 interfaceC2809 = (InterfaceC2808) list3.get(i12);
            int type = interfaceC2809.getType();
            if (type == 2) {
                i11++;
            } else if (type == 3) {
                i11--;
            }
            if (C7492.m17272(type) || type == 104 || type == i2) {
                i = 1;
            } else {
                int i13 = c14966.f42757.f79603[i12];
                int i14 = i13 > i12 ? i13 : i12;
                InterfaceC2808 interfaceC28010 = (InterfaceC2808) list3.get(i14);
                if (interfaceC2809.mo4434() < 0 || interfaceC28010.mo4433() < interfaceC2809.mo4434()) {
                    i = 1;
                } else {
                    int i15 = iArr5[interfaceC2809.mo4434()];
                    int i16 = iArr5[interfaceC28010.mo4433() + i2];
                    int iBinarySearch = Arrays.binarySearch(c14966.f42763, i15);
                    C23684 c23684 = new C23684(i12, i14, type, i15, i16, iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch, i11);
                    c14966.f42749.add(c23684);
                    if (type != 105) {
                        i = 1;
                    } else {
                        int iBinarySearch2 = Arrays.binarySearch(c14966.f42763, i16);
                        if ((iBinarySearch2 < 0 ? (-iBinarySearch2) - 2 : iBinarySearch2) > c23684.f75397) {
                            boolean[] zArr2 = c14966.f42759;
                            int iBinarySearch3 = Arrays.binarySearch(c14966.f42763, i16);
                            i = 1;
                            zArr2[iBinarySearch3 < 0 ? (-iBinarySearch3) - 2 : iBinarySearch3] = true;
                        } else {
                            i = 1;
                        }
                    }
                    i12 = i14;
                }
            }
            i12 += i;
            i2 = 1;
        }
        CharSequence charSequence2 = c14966.f42750;
        ArrayList arrayList = c14966.f42753;
        int[] iArr6 = c14966.f42763;
        int[] iArr7 = c14966.f42762;
        boolean[] zArr3 = c14966.f42760;
        boolean[] zArr4 = c14966.f42759;
        boolean[] zArr5 = c14966.f42755;
        int[] iArr8 = c14966.f42756;
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it2 = c14966.f42749.iterator();
        int i17 = -1;
        while (it2.hasNext()) {
            C23684 c23685 = (C23684) it2.next();
            c14966.f42758.m10153();
            boolean z = c14966.f42754[c23685.f75397] == c23685.f75395;
            int i18 = c23685.f75399;
            int i19 = (i18 == 15 || i18 == 16 || i18 == 17) ? 1 : 0;
            if (!z || zArr4[c23685.f75397]) {
                it = it2;
            } else if (!arrayDeque.isEmpty()) {
                iArr8[c23685.f75397] = ((C21673) arrayDeque.peek()).f68258 + (i19 ^ 1);
                it = it2;
            } else {
                it = it2;
                if (c23685.f75399 == 103) {
                    zArr3[c23685.f75397] = true;
                } else {
                    iArr8[c23685.f75397] = c23685.f75398;
                    zArr5[c23685.f75397] = true;
                }
            }
            String strTrim = c23685.f75399 == 103 ? C4965.m10523(c23685.f75395, c23685.f75393, c14966.f42750).trim() : "";
            if (strTrim.equals("# fmt: off") || strTrim.equals("# fmt: on")) {
                if (z && iArr7[c23685.f75397] == 0 && arrayDeque.isEmpty() && !zArr4[c23685.f75397]) {
                    int i20 = c23685.f75395;
                    ArrayList arrayList2 = c14966.f42751;
                    int size = arrayList2.size();
                    zArr = zArr4;
                    int i21 = 0;
                    while (i21 < size) {
                        int i22 = size;
                        size = (i21 + size) >>> 1;
                        int[] iArr9 = iArr7;
                        if (((C5579) arrayList2.get(size)).f13482 <= i20) {
                            i21 = size + 1;
                            size = i22;
                        }
                        iArr7 = iArr9;
                    }
                    iArr = iArr7;
                    if (i21 >= arrayList2.size() || ((C5579) arrayList2.get(i21)).f13483 >= i20) {
                        if (strTrim.equals("# fmt: off")) {
                            if (i17 >= 0) {
                                throw C7492.m17268(EnumC2797.DIRECTIVE, "Nested format directives");
                            }
                            i17 = iArr6[c23685.f75397];
                        } else {
                            if (i17 < 0) {
                                throw C7492.m17268(EnumC2797.DIRECTIVE, "Unmatched format directive");
                            }
                            int i23 = c23685.f75397 + 1;
                            arrayList.add(new C5579(i17, i23 < iArr6.length ? iArr6[i23] : charSequence2.length()));
                            i17 = -1;
                        }
                    }
                }
                throw C7492.m17268(EnumC2797.DIRECTIVE, "Unsafe format directive boundary");
            }
            iArr = iArr7;
            zArr = zArr4;
            int i24 = c23685.f75399;
            if (i24 == 12 || i24 == 13 || i24 == 14) {
                arrayDeque.push(new C21673(iArr8[c23685.f75397] >= 0 ? iArr8[c23685.f75397] : c23685.f75398 + arrayDeque.size()));
            } else if (i19 != 0 && !arrayDeque.isEmpty()) {
                arrayDeque.pop();
            }
            c14966 = this;
            it2 = it;
            iArr7 = iArr;
            zArr3 = zArr3;
            zArr4 = zArr;
        }
        int[] iArr10 = iArr7;
        boolean[] zArr6 = zArr3;
        if (i17 >= 0) {
            arrayList.add(new C5579(i17, charSequence2.length()));
        }
        int[] iArr11 = new int[iArr8.length];
        int i25 = -1;
        for (int length = iArr8.length - 1; length >= 0; length--) {
            iArr11[length] = i25;
            if (zArr5[length]) {
                i25 = length;
            }
        }
        int i26 = -1;
        for (int i27 = 0; i27 < iArr8.length; i27++) {
            if (zArr6[i27]) {
                int i28 = iArr11[i27];
                int i29 = iArr10[i27];
                if (i29 == 0) {
                    iArr8[i27] = 0;
                } else {
                    int i30 = (i26 < 0 || iArr10[i26] != 0) ? i26 : -1;
                    if (i28 >= 0 && iArr10[i28] == 0) {
                        i28 = -1;
                    }
                    if (i30 < 0) {
                        i30 = i28;
                    } else if (i28 >= 0) {
                        int i31 = iArr10[i30];
                        int i32 = iArr10[i28];
                        if (i29 >= Math.min(i31, i32) ? i31 > i29 || (i32 <= i29 && i31 <= i32) : i31 >= i32) {
                            i30 = i28;
                        }
                    }
                    if (i30 >= 0) {
                        iArr8[i27] = iArr8[i30];
                    }
                }
            } else if (zArr5[i27]) {
                i26 = i27;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34264(boolean z, int i, C20438 c20438) {
        CharSequence charSequence;
        C4810 c4810;
        List list;
        C24926 c24926;
        ArrayList arrayList;
        C4810 c4811;
        String strM10523;
        int i2;
        ArrayList<C6920> arrayList2 = new ArrayList();
        char c = ' ';
        String strM26621 = z ? "\t" : C11567.m26621(' ', i);
        int i3 = 0;
        while (true) {
            int[] iArr = this.f42756;
            int length = iArr.length;
            charSequence = this.f42750;
            c4810 = this.f42758;
            if (i3 >= length) {
                break;
            }
            c4810.m10153();
            if (iArr[i3] >= 0 && !this.f42759[i3]) {
                int i4 = this.f42763[i3];
                if (i4 == 0 && C4965.m10524(charSequence, false, 0, "\ufeff", 1)) {
                    i4++;
                }
                m34262(arrayList2, i4, this.f42754[i3], C11567.m26622(iArr[i3], strM26621));
            }
            i3++;
        }
        ArrayList arrayList3 = this.f42749;
        Iterator it = arrayList3.iterator();
        C23684 c23684 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.f42761;
            c24926 = this.f42757;
            if (!zHasNext) {
                break;
            }
            C23684 c23685 = (C23684) it.next();
            c4810.m10153();
            if (c23684 == null) {
                arrayList = arrayList3;
                it = it;
                c4811 = c4810;
                break;
                break;
            }
            int i5 = c23684.f75393;
            int i6 = c23685.f75395;
            while (true) {
                if (i5 >= i6) {
                    if (c23684.f75399 != 103 && c23684.f75399 != 105 && c23685.f75399 != 105) {
                        int i7 = c23684.f75393;
                        int i8 = c23685.f75395;
                        if (c23685.f75399 == 103) {
                            strM10523 = EnumC2483.f3919;
                            arrayList = arrayList3;
                            c4811 = c4810;
                        } else {
                            String strM10524 = c23684.f75393 - c23684.f75395 <= 8 ? C4965.m10523(c23684.f75395, c23684.f75393, charSequence) : "";
                            String strM10525 = c23685.f75393 - c23685.f75395 <= 8 ? C4965.m10523(c23685.f75395, c23685.f75393, charSequence) : "";
                            if ((strM10524.equals(".") || strM10524.equals("...")) && (strM10525.equals(".") || strM10525.equals("..."))) {
                                arrayList2 = arrayList2;
                                arrayList = arrayList3;
                                c4811 = c4810;
                                strM10523 = C4965.m10523(c23684.f75393, c23685.f75395, charSequence);
                            } else {
                                if (strM10525.equals(",")) {
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList3;
                                    if (!strM10525.equals(C0249l.f1196b)) {
                                        c4811 = c4810;
                                        if (strM10525.equals(":")) {
                                            arrayList2 = arrayList2;
                                        } else {
                                            int i9 = c23685.f75399;
                                            arrayList2 = arrayList2;
                                            if (i9 != 15 && i9 != 16 && i9 != 17 && (strM10524.equals(",") || strM10524.equals(C0249l.f1196b) || (!c24926.f79604[c23684.f75396] && !c24926.f79605[c23685.f75394] && (i2 = c23684.f75399) != 12 && i2 != 13 && i2 != 14 && (strM10524.equals(".") || strM10525.equals(".") ? strM10524.equals("from") || strM10525.equals("import") || c23684.f75399 == 100 : !strM10524.equals("...") || (!strM10525.equals(".") && ((InterfaceC2808) list.get(c23685.f75394)).getType() != 99))))) {
                                                strM10523 = " ";
                                            }
                                        }
                                        strM10523 = "";
                                    }
                                }
                                c4811 = c4810;
                                strM10523 = "";
                            }
                            arrayList2 = arrayList2;
                        }
                        m34262(arrayList2, i7, i8, strM10523);
                        break;
                    }
                } else {
                    char cCharAt = charSequence.charAt(i5);
                    if (cCharAt == c || cCharAt == '\t' || cCharAt == '\f') {
                        i5++;
                        c = ' ';
                    }
                }
                arrayList = arrayList3;
                it = it;
                c4811 = c4810;
                break;
            }
            c = ' ';
            c23684 = c23685;
            it = it;
            arrayList3 = arrayList;
            c4810 = c4811;
        }
        ArrayList<C23684> arrayList4 = arrayList3;
        C4810 c4812 = c4810;
        C8150.sort(arrayList2, new C23014());
        C20438 c20438M46121 = c20438.m46121();
        try {
            int i10 = 0;
            for (C6920 c6920 : arrayList2) {
                c4812.m10153();
                if (c6920.f18018 < i10) {
                    throw C7492.m17268(EnumC2797.CHANGED, "Overlapping whitespace edits");
                }
                c20438M46121.m46122(i10, c6920.f18018, charSequence);
                c20438M46121.append((CharSequence) c6920.f18017);
                i10 = c6920.f18016;
            }
            c20438M46121.m46122(i10, charSequence.length(), charSequence);
            if (c20438M46121.length() > 1048576) {
                throw C7492.m17268(EnumC2797.LIMIT, "Formatted source length limit exceeded");
            }
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            boolean[] zArr = new boolean[list.size()];
            int i11 = 0;
            boolean z2 = false;
            for (int i12 = 0; i12 < list.size(); i12++) {
                c4812.m10153();
                InterfaceC2808 interfaceC2808 = (InterfaceC2808) list.get(i12);
                if (interfaceC2808.getType() == 103) {
                    z2 = true;
                }
                if (interfaceC2808.getType() == -1 || (interfaceC2808.getType() == 102 && interfaceC2808.mo4430() == 0)) {
                    if (z2) {
                        Arrays.fill(zArr, i11, i12 + 1, true);
                    }
                    i11 = i12 + 1;
                    z2 = false;
                }
            }
            int i13 = 0;
            int length2 = 0;
            for (C23684 c23686 : arrayList4) {
                c4812.m10153();
                while (i13 < arrayList2.size() && ((C6920) arrayList2.get(i13)).f18016 <= c23686.f75395) {
                    int i14 = i13 + 1;
                    C6920 c6921 = (C6920) arrayList2.get(i13);
                    length2 += c6921.f18017.length() - (c6921.f18016 - c6921.f18018);
                    i13 = i14;
                }
                arrayList5.add(new C22915(c23686.f75395 + length2, c23686.f75393 + length2, c23686.f75399, c24926.f79602[c23686.f75394], zArr[c23686.f75394] || m34263(c23686.f75395, c23686.f75393)));
            }
            new C23585(c20438M46121, arrayList5, this.f42758, z, i, c20438).m52392();
            c20438M46121.close();
        } catch (Throwable th) {
            try {
                c20438M46121.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34262(ArrayList arrayList, int i, int i2, String str) {
        if ((C4965.m10524(this.f42750, false, i, str, str.length()) && i2 - i == str.length()) || m34263(i, i2)) {
            return;
        }
        arrayList.add(new C6920(i, i2, str));
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m34263(int i, int i2) {
        ArrayList arrayList = this.f42753;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) >>> 1;
            if (((C5579) arrayList.get(i4)).f13482 <= i) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        if (i3 < arrayList.size()) {
            C5579 c5579 = (C5579) arrayList.get(i3);
            if (i >= c5579.f13483 || i2 > c5579.f13483) {
                return true;
            }
        }
        return false;
    }
}
