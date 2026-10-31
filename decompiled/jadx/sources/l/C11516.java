package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C11516 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f34383;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34384;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f34385;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34386;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f34387;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final CharSequence f34388;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4460 f34389;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f34390;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean[] f34392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f34393;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f34394;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f34395;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f34396;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean[] f34397;

    /* JADX WARN: Code duplicated, block: B:136:0x0284  */
    public C11516(CharSequence charSequence, List list, C8694 c8694, C3463 c3463, String str, C4460 c4460) {
        String string;
        int i;
        C4460 c4461;
        List list2;
        boolean z;
        int i2;
        int i3;
        this.f34388 = charSequence;
        this.f34385 = list;
        this.f34389 = c4460;
        this.f34394 = new int[list.size()];
        this.f34393 = new int[list.size()];
        this.f34383 = new boolean[list.size()];
        this.f34384 = new boolean[list.size()];
        this.f34391 = new boolean[list.size()];
        this.f34397 = new boolean[list.size()];
        this.f34396 = new boolean[list.size()];
        this.f34386 = new boolean[list.size()];
        this.f34392 = new boolean[list.size()];
        int iMax = Math.max(1, Math.min(16, c3463.m10601()));
        this.f34387 = iMax;
        if (c3463.m10602()) {
            string = "\t";
        } else {
            if (iMax < 0) {
                throw new IllegalArgumentException(C19370.m44628(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C18307.m42645(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i4 = 0; i4 < iMax; i4++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f34395 = string;
        this.f34390 = str;
        boolean[] zArr = this.f34396;
        boolean[] zArr2 = this.f34391;
        int[] iArr = this.f34394;
        boolean[] zArr3 = this.f34383;
        C4460 c4462 = this.f34389;
        boolean[] zArr4 = this.f34384;
        List list3 = this.f34385;
        int[] iArr2 = new int[list3.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C5871(c8694, 0, false));
        while (!arrayDeque.isEmpty()) {
            c4462.m13206();
            C5871 c5871 = (C5871) arrayDeque.pop();
            C8931 c8931 = c5871.f18014;
            int iMo1085 = c8931.mo1085();
            if (iMo1085 == 18) {
                this.f34393[c8931.f27156.mo2052()] = c8931.f27155.mo2053() + 1;
            }
            if ((iMo1085 == 3 || iMo1085 == 6) && c8931.f27156.getType() != 1) {
                zArr3[c8931.f27156.mo2052()] = true;
            }
            if (iMo1085 == 5 && c8931.getChildCount() > 0) {
                String text = c8931.mo23040(1).getText();
                if (!text.equals("const") && !text.equals("close")) {
                    throw new C0350(EnumC19402.SYNTAX, c8931.f27156.getLine(), c8931.f27156.mo2049(), "Unknown local attribute: ".concat(text));
                }
            }
            int childCount = c8931.getChildCount() - 1;
            while (childCount >= 0) {
                InterfaceC16174 interfaceC16174Mo23040 = c8931.mo23040(childCount);
                if (interfaceC16174Mo23040 instanceof C8931) {
                    C8931 c8932 = (C8931) interfaceC16174Mo23040;
                    int i5 = c5871.f18016;
                    c4461 = c4462;
                    list2 = list3;
                    if (c8932.mo1085() == 2 && iMo1085 != 1) {
                        i5++;
                        int iMo2052 = ((InterfaceC4181) c8931.mo23040(childCount - 1)).mo12628().mo2052() + 1;
                        int iMo2053 = ((InterfaceC4181) c8931.mo23040(childCount + 1)).mo12628().mo2052();
                        iArr2[iMo2052] = iArr2[iMo2052] + 1;
                        iArr2[iMo2053] = iArr2[iMo2053] - 1;
                    }
                    int iMo1086 = c8932.mo1085();
                    arrayDeque.push(new C5871(c8932, i5, iMo1086 != 2 && (c5871.f18015 || iMo1086 == 12 || iMo1086 == 14 || iMo1086 == 11 || iMo1086 == 20 || iMo1086 == 10 || iMo1086 == 4 || iMo1086 == 9)));
                } else {
                    c4461 = c4462;
                    list2 = list3;
                    if (interfaceC16174Mo23040 instanceof InterfaceC4181) {
                        InterfaceC0463 interfaceC0463Mo12628 = ((InterfaceC4181) interfaceC16174Mo23040).mo12628();
                        int iMo2054 = interfaceC0463Mo12628.mo2052();
                        int type = interfaceC0463Mo12628.getType();
                        iArr[iMo2054] = c5871.f18016;
                        this.f34392[iMo2054] = c5871.f18015;
                        if (type == 6 || type == 13 || type == 12 || type == 9) {
                            zArr3[iMo2054] = true;
                        }
                        if (type == 30 && (iMo1085 == 17 || iMo1085 == 19)) {
                            z = true;
                            zArr4[iMo2054] = true;
                        } else {
                            z = true;
                        }
                        if (type == 47 && iMo1085 != 23) {
                            zArr4[iMo2054] = z;
                        }
                        if (iMo1085 == 5) {
                            if (type == 19) {
                                zArr2[iMo2054] = z;
                            }
                            if (type == 20) {
                                zArr4[iMo2054] = z;
                            }
                        }
                        if (iMo1085 == 12 && childCount == 0) {
                            if (type == 28 || type == 27 || type == 29) {
                                zArr2[iMo2054] = true;
                            } else {
                                i3 = 12;
                                i2 = 1;
                            }
                            if (iMo1085 == i3 && childCount == i2 && (c8931.mo23040(0) instanceof C5995)) {
                                zArr[iMo2054] = true;
                            }
                            if (iMo1085 == 15 && (type == 26 || type == 38)) {
                                zArr[iMo2054] = true;
                            }
                            if (type != 15 || iMo1085 == 24 || type == 2 || type == 21) {
                                this.f34386[iMo2054] = true;
                            }
                        }
                        i2 = 1;
                        i3 = 12;
                        if (iMo1085 == i3) {
                            zArr[iMo2054] = true;
                        }
                        if (iMo1085 == 15) {
                            zArr[iMo2054] = true;
                        }
                        if (type != 15) {
                            this.f34386[iMo2054] = true;
                        } else {
                            this.f34386[iMo2054] = true;
                        }
                    }
                }
                childCount--;
                c4462 = c4461;
                list3 = list2;
            }
        }
        C4460 c4463 = c4462;
        List list4 = list3;
        int i6 = 0;
        int i7 = 0;
        while (i7 < list4.size()) {
            if ((i7 & 1023) == 0) {
                c4463.m13206();
            }
            i6 += iArr2[i7];
            List list5 = list4;
            if (m28345((InterfaceC0463) list5.get(i7))) {
                iArr[i7] = i6;
            }
            i7++;
            list4 = list5;
        }
        int i8 = 0;
        C12345 c12345 = (C12345) ((C10229) c8694.m23039(C10229.class, 0)).m23039(C12345.class, 0);
        List list6 = this.f34385;
        ArrayList arrayList = new ArrayList(c12345.m23037(C15748.class));
        if (((C9400) c12345.m23039(C9400.class, 0)) != null) {
            arrayList.add((C9400) c12345.m23039(C9400.class, 0));
        }
        int iMo2055 = 0;
        while (i8 < arrayList.size()) {
            this.f34389.m13206();
            C8931 c8933 = (C8931) arrayList.get(i8);
            i8++;
            int iMo2056 = i8 < arrayList.size() ? ((C8931) arrayList.get(i8)).f27156.mo2052() : list6.size();
            while (true) {
                if (iMo2055 >= iMo2056) {
                    i = 1;
                    break;
                } else {
                    if (m28345((InterfaceC0463) list6.get(iMo2055))) {
                        i = 1;
                        Arrays.fill(this.f34397, c8933.f27156.mo2052(), c8933.f27155.mo2052() + 1, true);
                        break;
                    }
                    iMo2055++;
                }
            }
            iMo2055 = c8933.f27155.mo2052() + i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28343(CharSequence charSequence, C4460 c4460) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                c4460.m13206();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                int i2 = i + 1;
                if (i2 < charSequence.length()) {
                    if (charSequence.charAt(i2) == (cCharAt != '\r' ? '\r' : '\n')) {
                        return cCharAt == '\r' ? "\r\n" : "\n\r";
                    }
                }
                return String.valueOf(cCharAt);
            }
        }
        return "\n";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28346(C19012 c19012) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0463 interfaceC0463 : this.f34385) {
            if (interfaceC0463.getType() != 65 && interfaceC0463.getType() != -1) {
                arrayList.add(interfaceC0463);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        InterfaceC0463 interfaceC0464 = null;
        int i2 = 0;
        int iMo2053 = 0;
        while (true) {
            int size = arrayList.size();
            C4460 c4460 = this.f34389;
            if (i2 < size) {
                c4460.m13206();
                InterfaceC0463 interfaceC0465 = (InterfaceC0463) arrayList.get(i2);
                int iMo2052 = interfaceC0465.mo2052();
                int type = interfaceC0465.getType();
                int i3 = this.f34394[iMo2052];
                if (type == 31 || type == 48 || type == 46) {
                    arrayDeque.pop();
                }
                int i4 = arrayDeque.isEmpty() ? 0 : ((C10105) arrayDeque.peek()).f30427;
                int i5 = i3 + i4;
                int iMo2054 = interfaceC0465.mo2054();
                CharSequence charSequence = this.f34388;
                if (m28344(iMo2053, iMo2054, charSequence)) {
                    int iMo2055 = interfaceC0465.mo2054();
                    while (iMo2055 > iMo2053) {
                        int i6 = iMo2055 - 1;
                        if (charSequence.charAt(i6) == '\n' || charSequence.charAt(i6) == '\r') {
                            break;
                        } else {
                            iMo2055--;
                        }
                    }
                    i = iMo2055;
                } else {
                    i = -1;
                }
                boolean[] zArr = this.f34397;
                boolean z = zArr[iMo2052] || m28345(interfaceC0465) || (interfaceC0464 != null && (zArr[interfaceC0464.mo2052()] || m28345(interfaceC0464)));
                String str2 = "";
                if (interfaceC0464 == null || interfaceC0464.getType() == 67) {
                    str = str2;
                } else {
                    int type2 = interfaceC0464.getType();
                    int type3 = interfaceC0465.getType();
                    if (m28345(interfaceC0465)) {
                        str2 = EnumC0121.f1143;
                    } else {
                        str = " ";
                        if ((type2 == 28 && type3 == 28) || (type2 == 47 && (type3 == 47 || type3 == 59))) {
                            str2 = " ";
                        } else if (type3 == 15 || type3 == 1 || type3 == 31 || type3 == 48 || type3 == 46 || type3 == 26 || type3 == 38 || type2 == 26 || type2 == 38 || type2 == 30 || type2 == 47 || type2 == 45 || type2 == 22 || type3 == 22 || this.f34384[interfaceC0465.mo2052()] || this.f34391[interfaceC0464.mo2052()]) {
                        }
                    }
                    str = str2;
                }
                boolean[] zArr2 = this.f34383;
                ArrayList arrayList3 = arrayList;
                arrayList2.add(new C22223(interfaceC0465.mo2054(), interfaceC0465.mo2053() + 1, type, i5, i, str, (interfaceC0464 == null || interfaceC0464.getType() == 67 || !zArr2[iMo2052] || z) ? false : true, z, this.f34396[iMo2052] || (interfaceC0464 != null && this.f34386[interfaceC0464.mo2052()]), this.f34392[iMo2052] && !zArr2[iMo2052], this.f34393[iMo2052]));
                if (type == 30 || type == 47 || type == 45) {
                    arrayDeque.push(new C10105(i4 + 1));
                }
                iMo2053 = interfaceC0465.mo2053() + 1;
                i2++;
                interfaceC0464 = interfaceC0465;
                arrayList = arrayList3;
            } else {
                new C20107(this.f34388, arrayList2, this.f34395, this.f34390, this.f34387, c4460, c19012).m46365();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28345(InterfaceC0463 interfaceC0463) {
        return interfaceC0463.getType() == 64 || interfaceC0463.getType() == 66;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28344(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if ((i & 1023) == 0) {
                C20813.m47630();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            i++;
        }
        return false;
    }
}
