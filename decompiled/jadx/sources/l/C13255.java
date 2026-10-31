package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C13255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f39685;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f39686;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39687;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f39688;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39689;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f39690;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean[] f39691;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f39692;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23735 f39693;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2569 f39694;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean[] f39695;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f39696;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f39697;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f39698;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f39699;

    /* JADX WARN: Code duplicated, block: B:103:0x0217  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0440  */
    public C13255(CharSequence charSequence, List list, C8931 c8931, C2569 c2569) {
        Iterator it;
        boolean[] zArr;
        int[] iArr;
        int i;
        C13255 c13255 = this;
        c13255.f39685 = new ArrayList();
        c13255.f39689 = new ArrayList();
        c13255.f39687 = new ArrayList();
        c13255.f39686 = charSequence;
        c13255.f39697 = list;
        c13255.f39694 = c2569;
        c13255.f39693 = new C23735(c8931, list.size(), c2569);
        int i2 = 1;
        c13255.f39688 = new int[Character.codePointCount(charSequence, 0, charSequence.length()) + 1];
        int i3 = 0;
        int iCharCount = 0;
        while (true) {
            int[] iArr2 = c13255.f39688;
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
        c13255.f39699 = new int[i4];
        int i6 = 1;
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (charSequence.charAt(i7) == '\n') {
                c13255.f39699[i6] = i7 + 1;
                i6++;
            }
        }
        c13255.f39690 = new int[i4];
        c13255.f39698 = new int[i4];
        int[] iArr3 = new int[i4];
        c13255.f39692 = iArr3;
        c13255.f39695 = new boolean[i4];
        c13255.f39696 = new boolean[i4];
        c13255.f39691 = new boolean[i4];
        Arrays.fill(iArr3, -1);
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = c13255.f39699[i8];
            if (i9 == 0 && C2732.m8477(charSequence, false, 0, "\ufeff", 1)) {
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
            c13255.f39690[i8] = i9;
            c13255.f39698[i8] = i10;
        }
        C6452 c6452 = (C6452) c8931;
        int[] iArr4 = c13255.f39688;
        List list2 = c13255.f39697;
        if (((C20333) c6452.m23039(C20333.class, 0)) != null) {
            for (C22449 c22449 : ((C20333) c6452.m23039(C20333.class, 0)).m23037(C22449.class)) {
                int iMo2052 = c22449.f27155.mo2052();
                while (iMo2052 >= c22449.f27156.mo2052()) {
                    InterfaceC0463 interfaceC0463 = (InterfaceC0463) list2.get(iMo2052);
                    if (interfaceC0463.mo2050() == 0 && !C5391.m15361(interfaceC0463.getType())) {
                        break;
                    } else {
                        iMo2052--;
                    }
                }
                if (iMo2052 >= c22449.f27156.mo2052()) {
                    c13255.f39687.add(new C3378(iArr4[c22449.f27156.mo2054()], iArr4[((InterfaceC0463) list2.get(iMo2052)).mo2053() + 1]));
                }
            }
        }
        int[] iArr5 = c13255.f39688;
        List list3 = c13255.f39697;
        int i11 = 0;
        int i12 = 0;
        while (i12 < list3.size()) {
            c13255.f39694.m8120();
            InterfaceC0463 interfaceC0464 = (InterfaceC0463) list3.get(i12);
            int type = interfaceC0464.getType();
            if (type == 2) {
                i11++;
            } else if (type == 3) {
                i11--;
            }
            if (C5391.m15361(type) || type == 104 || type == i2) {
                i = 1;
            } else {
                int i13 = c13255.f39693.f76852[i12];
                int i14 = i13 > i12 ? i13 : i12;
                InterfaceC0463 interfaceC0465 = (InterfaceC0463) list3.get(i14);
                if (interfaceC0464.mo2054() < 0 || interfaceC0465.mo2053() < interfaceC0464.mo2054()) {
                    i = 1;
                } else {
                    int i15 = iArr5[interfaceC0464.mo2054()];
                    int i16 = iArr5[interfaceC0465.mo2053() + i2];
                    int iBinarySearch = Arrays.binarySearch(c13255.f39699, i15);
                    C22428 c22428 = new C22428(i12, i14, type, i15, i16, iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch, i11);
                    c13255.f39685.add(c22428);
                    if (type != 105) {
                        i = 1;
                    } else {
                        int iBinarySearch2 = Arrays.binarySearch(c13255.f39699, i16);
                        if ((iBinarySearch2 < 0 ? (-iBinarySearch2) - 2 : iBinarySearch2) > c22428.f72670) {
                            boolean[] zArr2 = c13255.f39695;
                            int iBinarySearch3 = Arrays.binarySearch(c13255.f39699, i16);
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
        CharSequence charSequence2 = c13255.f39686;
        ArrayList arrayList = c13255.f39689;
        int[] iArr6 = c13255.f39699;
        int[] iArr7 = c13255.f39698;
        boolean[] zArr3 = c13255.f39696;
        boolean[] zArr4 = c13255.f39695;
        boolean[] zArr5 = c13255.f39691;
        int[] iArr8 = c13255.f39692;
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it2 = c13255.f39685.iterator();
        int i17 = -1;
        while (it2.hasNext()) {
            C22428 c22429 = (C22428) it2.next();
            c13255.f39694.m8120();
            boolean z = c13255.f39690[c22429.f72670] == c22429.f72668;
            int i18 = c22429.f72672;
            int i19 = (i18 == 15 || i18 == 16 || i18 == 17) ? 1 : 0;
            if (!z || zArr4[c22429.f72670]) {
                it = it2;
            } else if (!arrayDeque.isEmpty()) {
                iArr8[c22429.f72670] = ((C20312) arrayDeque.peek()).f65583 + (i19 ^ 1);
                it = it2;
            } else {
                it = it2;
                if (c22429.f72672 == 103) {
                    zArr3[c22429.f72670] = true;
                } else {
                    iArr8[c22429.f72670] = c22429.f72671;
                    zArr5[c22429.f72670] = true;
                }
            }
            String strTrim = c22429.f72672 == 103 ? C2732.m8476(c22429.f72668, c22429.f72666, c13255.f39686).trim() : "";
            if (strTrim.equals("# fmt: off") || strTrim.equals("# fmt: on")) {
                if (z && iArr7[c22429.f72670] == 0 && arrayDeque.isEmpty() && !zArr4[c22429.f72670]) {
                    int i20 = c22429.f72668;
                    ArrayList arrayList2 = c13255.f39687;
                    int size = arrayList2.size();
                    zArr = zArr4;
                    int i21 = 0;
                    while (i21 < size) {
                        int i22 = size;
                        size = (i21 + size) >>> 1;
                        int[] iArr9 = iArr7;
                        if (((C3378) arrayList2.get(size)).f10675 <= i20) {
                            i21 = size + 1;
                            size = i22;
                        }
                        iArr7 = iArr9;
                    }
                    iArr = iArr7;
                    if (i21 >= arrayList2.size() || ((C3378) arrayList2.get(i21)).f10676 >= i20) {
                        if (strTrim.equals("# fmt: off")) {
                            if (i17 >= 0) {
                                throw C5391.m15357(EnumC0451.DIRECTIVE, "Nested format directives");
                            }
                            i17 = iArr6[c22429.f72670];
                        } else {
                            if (i17 < 0) {
                                throw C5391.m15357(EnumC0451.DIRECTIVE, "Unmatched format directive");
                            }
                            int i23 = c22429.f72670 + 1;
                            arrayList.add(new C3378(i17, i23 < iArr6.length ? iArr6[i23] : charSequence2.length()));
                            i17 = -1;
                        }
                    }
                }
                throw C5391.m15357(EnumC0451.DIRECTIVE, "Unsafe format directive boundary");
            }
            iArr = iArr7;
            zArr = zArr4;
            int i24 = c22429.f72672;
            if (i24 == 12 || i24 == 13 || i24 == 14) {
                arrayDeque.push(new C20312(iArr8[c22429.f72670] >= 0 ? iArr8[c22429.f72670] : c22429.f72671 + arrayDeque.size()));
            } else if (i19 != 0 && !arrayDeque.isEmpty()) {
                arrayDeque.pop();
            }
            c13255 = this;
            it2 = it;
            iArr7 = iArr;
            zArr3 = zArr3;
            zArr4 = zArr;
        }
        int[] iArr10 = iArr7;
        boolean[] zArr6 = zArr3;
        if (i17 >= 0) {
            arrayList.add(new C3378(i17, charSequence2.length()));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32165(boolean z, int i, C19012 c19012) {
        CharSequence charSequence;
        C2569 c2569;
        List list;
        C23735 c23735;
        ArrayList arrayList;
        C2569 c25610;
        String strM8476;
        int i2;
        ArrayList<C4789> arrayList2 = new ArrayList();
        char c = ' ';
        String strM24607 = z ? "\t" : C9679.m24607(' ', i);
        int i3 = 0;
        while (true) {
            int[] iArr = this.f39692;
            int length = iArr.length;
            charSequence = this.f39686;
            c2569 = this.f39694;
            if (i3 >= length) {
                break;
            }
            c2569.m8120();
            if (iArr[i3] >= 0 && !this.f39695[i3]) {
                int i4 = this.f39699[i3];
                if (i4 == 0 && C2732.m8477(charSequence, false, 0, "\ufeff", 1)) {
                    i4++;
                }
                m32163(arrayList2, i4, this.f39690[i3], C9679.m24608(iArr[i3], strM24607));
            }
            i3++;
        }
        ArrayList arrayList3 = this.f39685;
        Iterator it = arrayList3.iterator();
        C22428 c22428 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            list = this.f39697;
            c23735 = this.f39693;
            if (!zHasNext) {
                break;
            }
            C22428 c22429 = (C22428) it.next();
            c2569.m8120();
            if (c22428 == null) {
                arrayList = arrayList3;
                it = it;
                c25610 = c2569;
                break;
                break;
            }
            int i5 = c22428.f72666;
            int i6 = c22429.f72668;
            while (true) {
                if (i5 >= i6) {
                    if (c22428.f72672 != 103 && c22428.f72672 != 105 && c22429.f72672 != 105) {
                        int i7 = c22428.f72666;
                        int i8 = c22429.f72668;
                        if (c22429.f72672 == 103) {
                            strM8476 = EnumC0121.f1143;
                            arrayList = arrayList3;
                            c25610 = c2569;
                        } else {
                            String strM8477 = c22428.f72666 - c22428.f72668 <= 8 ? C2732.m8476(c22428.f72668, c22428.f72666, charSequence) : "";
                            String strM8478 = c22429.f72666 - c22429.f72668 <= 8 ? C2732.m8476(c22429.f72668, c22429.f72666, charSequence) : "";
                            if ((strM8477.equals(".") || strM8477.equals("...")) && (strM8478.equals(".") || strM8478.equals("..."))) {
                                arrayList2 = arrayList2;
                                arrayList = arrayList3;
                                c25610 = c2569;
                                strM8476 = C2732.m8476(c22428.f72666, c22429.f72668, charSequence);
                            } else {
                                if (strM8478.equals(",")) {
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList3;
                                    if (!strM8478.equals(l.b)) {
                                        c25610 = c2569;
                                        if (strM8478.equals(":")) {
                                            arrayList2 = arrayList2;
                                        } else {
                                            int i9 = c22429.f72672;
                                            arrayList2 = arrayList2;
                                            if (i9 != 15 && i9 != 16 && i9 != 17 && (strM8477.equals(",") || strM8477.equals(l.b) || (!c23735.f76853[c22428.f72669] && !c23735.f76854[c22429.f72667] && (i2 = c22428.f72672) != 12 && i2 != 13 && i2 != 14 && (strM8477.equals(".") || strM8478.equals(".") ? strM8477.equals("from") || strM8478.equals("import") || c22428.f72672 == 100 : !strM8477.equals("...") || (!strM8478.equals(".") && ((InterfaceC0463) list.get(c22429.f72667)).getType() != 99))))) {
                                                strM8476 = " ";
                                            }
                                        }
                                        strM8476 = "";
                                    }
                                }
                                c25610 = c2569;
                                strM8476 = "";
                            }
                            arrayList2 = arrayList2;
                        }
                        m32163(arrayList2, i7, i8, strM8476);
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
                c25610 = c2569;
                break;
            }
            c = ' ';
            c22428 = c22429;
            it = it;
            arrayList3 = arrayList;
            c2569 = c25610;
        }
        ArrayList<C22428> arrayList4 = arrayList3;
        C2569 c25611 = c2569;
        C6083.sort(arrayList2, new C21723());
        C19012 c19012M43853 = c19012.m43853();
        try {
            int i10 = 0;
            for (C4789 c4789 : arrayList2) {
                c25611.m8120();
                if (c4789.f15186 < i10) {
                    throw C5391.m15357(EnumC0451.CHANGED, "Overlapping whitespace edits");
                }
                c19012M43853.m43854(i10, c4789.f15186, charSequence);
                c19012M43853.append((CharSequence) c4789.f15185);
                i10 = c4789.f15184;
            }
            c19012M43853.m43854(i10, charSequence.length(), charSequence);
            if (c19012M43853.length() > 1048576) {
                throw C5391.m15357(EnumC0451.LIMIT, "Formatted source length limit exceeded");
            }
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            boolean[] zArr = new boolean[list.size()];
            int i11 = 0;
            boolean z2 = false;
            for (int i12 = 0; i12 < list.size(); i12++) {
                c25611.m8120();
                InterfaceC0463 interfaceC0463 = (InterfaceC0463) list.get(i12);
                if (interfaceC0463.getType() == 103) {
                    z2 = true;
                }
                if (interfaceC0463.getType() == -1 || (interfaceC0463.getType() == 102 && interfaceC0463.mo2050() == 0)) {
                    if (z2) {
                        Arrays.fill(zArr, i11, i12 + 1, true);
                    }
                    i11 = i12 + 1;
                    z2 = false;
                }
            }
            int i13 = 0;
            int length2 = 0;
            for (C22428 c224210 : arrayList4) {
                c25611.m8120();
                while (i13 < arrayList2.size() && ((C4789) arrayList2.get(i13)).f15184 <= c224210.f72668) {
                    int i14 = i13 + 1;
                    C4789 c47810 = (C4789) arrayList2.get(i13);
                    length2 += c47810.f15185.length() - (c47810.f15184 - c47810.f15186);
                    i13 = i14;
                }
                arrayList5.add(new C21619(c224210.f72668 + length2, c224210.f72666 + length2, c224210.f72672, c23735.f76851[c224210.f72667], zArr[c224210.f72667] || m32164(c224210.f72668, c224210.f72666)));
            }
            new C22324(c19012M43853, arrayList5, this.f39694, z, i, c19012).m50061();
            c19012M43853.close();
        } catch (Throwable th) {
            try {
                c19012M43853.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32163(ArrayList arrayList, int i, int i2, String str) {
        if ((C2732.m8477(this.f39686, false, i, str, str.length()) && i2 - i == str.length()) || m32164(i, i2)) {
            return;
        }
        arrayList.add(new C4789(i, i2, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m32164(int i, int i2) {
        ArrayList arrayList = this.f39689;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) >>> 1;
            if (((C3378) arrayList.get(i4)).f10675 <= i) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        if (i3 < arrayList.size()) {
            C3378 c3378 = (C3378) arrayList.get(i3);
            if (i >= c3378.f10676 || i2 > c3378.f10676) {
                return true;
            }
        }
        return false;
    }
}
