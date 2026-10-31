package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17325 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18031[] f53061;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19012 f53062;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List f53063;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f53064;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f53065;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f53066;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f53067;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f53068;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean[] f53069;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f53070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f53071;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18031[] f53072;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40649(int i) {
        return i == 59 || i == 57 || i == 55;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40651(CharSequence charSequence, boolean z, int i, C19012 c19012) throws InterruptedException {
        C1803.m5995(charSequence, z, i, c19012);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0217  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0259  */
    /* JADX WARN: Code duplicated, block: B:121:0x0260  */
    /* JADX WARN: Code duplicated, block: B:123:0x0268  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:213:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:221:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:223:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:232:0x03eb A[LOOP:11: B:231:0x03e9->B:232:0x03eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:243:0x0414  */
    /* JADX WARN: Code duplicated, block: B:246:0x0423  */
    /* JADX WARN: Code duplicated, block: B:248:0x0426 A[LOOP:12: B:247:0x0424->B:248:0x0426, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x044c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0466  */
    /* JADX WARN: Code duplicated, block: B:262:0x0470  */
    /* JADX WARN: Code duplicated, block: B:263:0x0474  */
    /* JADX WARN: Code duplicated, block: B:266:0x0479  */
    /* JADX WARN: Code duplicated, block: B:267:0x047b  */
    /* JADX WARN: Code duplicated, block: B:306:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0279 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:223:0x03dc, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40648(CharSequence charSequence, boolean z, int i, C19012 c19012) {
        String str;
        C19012 c19013;
        boolean[] zArr;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        C18031 c18031;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC16174 interfaceC16174Mo23040;
        C18031 c18032;
        int i10;
        InterfaceC16174 interfaceC16174Mo23041;
        InterfaceC4181 interfaceC4181;
        int type;
        m40647();
        try {
            C14502 c14502 = new C14502(new C11837(charSequence, new RunnableC7281(3)));
            C16619 c16619 = new C16619();
            c14502.m43458();
            c14502.m43456(c16619);
            C1875 c1875 = new C1875(c14502);
            c1875.m6206();
            int i11 = -1;
            if (c1875.mo6203(1) == -1) {
                c19012.append(charSequence);
                return;
            }
            ArrayList arrayListM6210 = c1875.m6210();
            C17325 c17325 = new C17325(charSequence, arrayListM6210, z, i, c19012);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int i13 = -1;
            while (true) {
                int size = arrayListM6210.size();
                C18031[] c18031Arr = c17325.f53061;
                C18031[] c18031Arr2 = c17325.f53072;
                if (i12 < size) {
                    m40647();
                    InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayListM6210.get(i12);
                    int type2 = interfaceC0463.getType();
                    if (type2 != 64 && type2 != 53 && type2 != i11) {
                        if (type2 == 65) {
                            if (!arrayDeque.isEmpty()) {
                                ((C18031) arrayDeque.peek()).f56220 = true;
                            }
                        } else if (m40649(type2)) {
                            if (arrayDeque.size() >= 128) {
                                throw new C10976(interfaceC0463.getLine(), interfaceC0463.mo2049(), "Formatting nesting limit exceeded");
                            }
                            C18031 c18033 = new C18031(i12);
                            if (!arrayDeque.isEmpty() && type2 != 55) {
                                ((C18031) arrayDeque.peek()).f56220 = true;
                            }
                            c18031Arr2[i12] = c18033;
                            arrayDeque.push(c18033);
                        } else if (type2 == 60 || type2 == 58 || type2 == 56) {
                            if (arrayDeque.isEmpty() || !(((type = ((InterfaceC0463) arrayListM6210.get(((C18031) arrayDeque.peek()).f56221)).getType()) == 59 && type2 == 60) || ((type == 57 && type2 == 58) || (type == 55 && type2 == 56)))) {
                                throw new C10976(interfaceC0463.getLine(), interfaceC0463.mo2049(), "Mismatched closing delimiter");
                            }
                            C18031 c18034 = (C18031) arrayDeque.pop();
                            c18034.f56219 = i12;
                            c18034.f56222 = i13 != c18034.f56221;
                            c18031Arr[i12] = c18034;
                        }
                        i13 = i12;
                    }
                    i12++;
                    i11 = -1;
                } else {
                    if (!arrayDeque.isEmpty()) {
                        InterfaceC0463 interfaceC0464 = (InterfaceC0463) arrayListM6210.get(((C18031) arrayDeque.peek()).f56221);
                        throw new C10976(interfaceC0464.getLine(), interfaceC0464.mo2049(), "Unclosed delimiter");
                    }
                    C14562 c14562 = new C14562(c1875);
                    c14562.m43458();
                    c14562.m43456(c16619);
                    C12386 c12386M34772 = c14562.m34772();
                    if (c1875.mo6203(1) != -1) {
                        InterfaceC0463 interfaceC0463Mo6211 = c1875.mo6211(1);
                        throw new C10976(interfaceC0463Mo6211.getLine(), interfaceC0463Mo6211.mo2049(), "Unexpected trailing content");
                    }
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    arrayDeque2.push(c12386M34772);
                    while (true) {
                        boolean zIsEmpty = arrayDeque2.isEmpty();
                        int[] iArr = c17325.f53068;
                        boolean[] zArr2 = c17325.f53069;
                        if (zIsEmpty) {
                            ArrayDeque arrayDeque3 = new ArrayDeque();
                            int size2 = arrayListM6210.size();
                            while (true) {
                                size2--;
                                if (size2 >= 0) {
                                    C18031 c18035 = c18031Arr[size2];
                                    if (c18035 != null) {
                                        arrayDeque3.push(c18035);
                                    }
                                    if (c18031Arr2[size2] != null) {
                                        C18031 c18036 = (C18031) arrayDeque3.pop();
                                        boolean z7 = c18036.f56220 & c18036.f56222;
                                        c18036.f56220 = z7;
                                        if (z7 && !arrayDeque3.isEmpty()) {
                                            ((C18031) arrayDeque3.peek()).f56220 = true;
                                        }
                                    }
                                } else {
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int size3 = arrayListM6210.size();
                                        int[] iArr2 = c17325.f53067;
                                        if (i14 >= size3) {
                                            ArrayDeque arrayDeque4 = new ArrayDeque();
                                            int i16 = 0;
                                            int i17 = 0;
                                            int i18 = 0;
                                            boolean z8 = false;
                                            boolean z9 = false;
                                            int i19 = 0;
                                            while (true) {
                                                int size4 = arrayListM6210.size();
                                                int i20 = i19;
                                                str = c17325.f53066;
                                                c19013 = c17325.f53062;
                                                if (i16 < size4) {
                                                    m40647();
                                                    InterfaceC0463 interfaceC0465 = (InterfaceC0463) arrayListM6210.get(i16);
                                                    ArrayList arrayList = arrayListM6210;
                                                    int type3 = interfaceC0465.getType();
                                                    C18031[] c18031Arr3 = c18031Arr2;
                                                    if (type3 != -1) {
                                                        if (type3 == 53) {
                                                            i19 = i20;
                                                            zArr = zArr2;
                                                            c18031Arr = c18031Arr;
                                                        } else if (type3 == 64) {
                                                            String text = interfaceC0465.getText();
                                                            int i21 = 0;
                                                            for (int i22 = 0; i22 < text.length(); i22++) {
                                                                char cCharAt = text.charAt(i22);
                                                                if (cCharAt == '\n' || (cCharAt == '\r' && ((i8 = i22 + 1) == text.length() || text.charAt(i8) != '\n'))) {
                                                                    i21++;
                                                                }
                                                            }
                                                            i17 += i21;
                                                            i19 = i20;
                                                            zArr = zArr2;
                                                            c18031Arr = c18031Arr;
                                                        } else {
                                                            C18031 c18037 = c18031Arr[i16];
                                                            if (c18037 != null) {
                                                                arrayDeque4.pop();
                                                                i2 = c18037.f56224;
                                                            } else {
                                                                i2 = i20;
                                                            }
                                                            if (!zArr2[i16] || arrayDeque4.isEmpty()) {
                                                                zArr = zArr2;
                                                            } else {
                                                                zArr = zArr2;
                                                                if (((C18031) arrayDeque4.peek()).f56223 && i18 != 54 && i18 != 61) {
                                                                    z2 = true;
                                                                }
                                                                if (!z8 || z9 || z2 || (c18037 != null && c18037.f56223)) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                if (type3 == 65) {
                                                                    if (!z8 || i17 > 0) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = false;
                                                                    }
                                                                }
                                                                if (!z3 || (i7 = iArr[i16]) == 0 || (c17325.f53065 + iArr2[i7]) - iArr2[i16] <= 120) {
                                                                    i3 = i2;
                                                                } else {
                                                                    i3 = i2 + 1;
                                                                    z3 = true;
                                                                }
                                                                if (z3) {
                                                                    i5 = i17 < 2 ? 1 : 2;
                                                                    if (c19013.length() != 0) {
                                                                        for (i6 = 0; i6 < i5; i6++) {
                                                                            c19013.append((CharSequence) str);
                                                                        }
                                                                        c17325.f53065 = 0;
                                                                    }
                                                                } else if (c17325.f53065 > 0) {
                                                                    if (c17325.m40650(i18, i16)) {
                                                                        c19013.append(',');
                                                                        c17325.f53065++;
                                                                    }
                                                                    if (type3 != 65 || m40652(i18, type3)) {
                                                                        c19013.append(' ');
                                                                        c17325.f53065++;
                                                                    }
                                                                }
                                                                if (c17325.f53065 == 0) {
                                                                    for (i4 = 0; i4 < i3; i4++) {
                                                                        c19013.append((CharSequence) c17325.f53070);
                                                                    }
                                                                    c17325.f53065 = i3 * c17325.f53064;
                                                                }
                                                                c19013.append((CharSequence) interfaceC0465.getText());
                                                                int length = interfaceC0465.getText().length() + c17325.f53065;
                                                                c17325.f53065 = length;
                                                                c18031 = c18031Arr3[i16];
                                                                if (c18031 != null) {
                                                                    c18031.f56224 = i2;
                                                                    if (c18031.f56222 || (!c18031.f56220 && (length + iArr2[c18031.f56219 + 1]) - iArr2[i16 + 1] <= 120)) {
                                                                        z6 = false;
                                                                    } else {
                                                                        z6 = true;
                                                                    }
                                                                    c18031.f56223 = z6;
                                                                    arrayDeque4.push(c18031);
                                                                    if (c18031.f56223) {
                                                                        i2++;
                                                                        z4 = true;
                                                                    } else {
                                                                        z4 = false;
                                                                    }
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                                if (type3 == 65) {
                                                                    z5 = true;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                z9 = z4;
                                                                z8 = z5;
                                                                i18 = type3;
                                                                i19 = i2;
                                                                i17 = 0;
                                                            }
                                                            z2 = false;
                                                            if (z8) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            if (type3 == 65) {
                                                                if (z8) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = true;
                                                                }
                                                            }
                                                            if (z3) {
                                                                i3 = i2;
                                                            } else {
                                                                i3 = i2;
                                                            }
                                                            if (z3) {
                                                                if (i17 < 2) {
                                                                }
                                                                if (c19013.length() != 0) {
                                                                    while (i6 < i5) {
                                                                        c19013.append((CharSequence) str);
                                                                    }
                                                                    c17325.f53065 = 0;
                                                                }
                                                            } else if (c17325.f53065 > 0) {
                                                                if (c17325.m40650(i18, i16)) {
                                                                    c19013.append(',');
                                                                    c17325.f53065++;
                                                                }
                                                                if (type3 != 65) {
                                                                    c19013.append(' ');
                                                                    c17325.f53065++;
                                                                } else {
                                                                    c19013.append(' ');
                                                                    c17325.f53065++;
                                                                }
                                                            }
                                                            if (c17325.f53065 == 0) {
                                                                while (i4 < i3) {
                                                                    c19013.append((CharSequence) c17325.f53070);
                                                                }
                                                                c17325.f53065 = i3 * c17325.f53064;
                                                            }
                                                            c19013.append((CharSequence) interfaceC0465.getText());
                                                            int length2 = interfaceC0465.getText().length() + c17325.f53065;
                                                            c17325.f53065 = length2;
                                                            c18031 = c18031Arr3[i16];
                                                            if (c18031 != null) {
                                                                c18031.f56224 = i2;
                                                                if (c18031.f56222) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                c18031.f56223 = z6;
                                                                arrayDeque4.push(c18031);
                                                                if (c18031.f56223) {
                                                                    i2++;
                                                                    z4 = true;
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            if (type3 == 65) {
                                                                z5 = true;
                                                            } else {
                                                                z5 = false;
                                                            }
                                                            z9 = z4;
                                                            z8 = z5;
                                                            i18 = type3;
                                                            i19 = i2;
                                                            i17 = 0;
                                                        }
                                                        i16++;
                                                        zArr2 = zArr;
                                                        c18031Arr2 = c18031Arr3;
                                                        c18031Arr = c18031Arr;
                                                        arrayListM6210 = arrayList;
                                                    }
                                                }
                                            }
                                            if (charSequence.length() > 0) {
                                                if (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == '\r') {
                                                    c19013.append((CharSequence) str);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        m40647();
                                        InterfaceC0463 interfaceC0466 = (InterfaceC0463) arrayListM6210.get(i14);
                                        int type4 = interfaceC0466.getType();
                                        int i23 = i14 + 1;
                                        int i24 = iArr2[i14];
                                        iArr2[i23] = i24;
                                        if (type4 != 64 && type4 != 53 && type4 != -1) {
                                            iArr2[i23] = interfaceC0466.getText().length() + (m40652(i15, type4) ? 1 : 0) + (c17325.m40650(i15, i14) ? 1 : 0) + i24;
                                            i15 = type4;
                                        }
                                        i14 = i23;
                                    }
                                }
                            }
                        } else {
                            m40647();
                            InterfaceC16174 interfaceC16174 = (InterfaceC16174) arrayDeque2.pop();
                            if (interfaceC16174 instanceof C8931) {
                                C8931 c8931 = (C8931) interfaceC16174;
                                int iMo1085 = c8931.mo1085();
                                if (c8931.getChildCount() > 1) {
                                    InterfaceC16174 interfaceC16174Mo23042 = c8931.mo23040(1);
                                    if ((interfaceC16174Mo23042 instanceof InterfaceC4181) && ((InterfaceC4181) interfaceC16174Mo23042).mo12628().getType() == 54) {
                                        zArr2[c8931.f27156.mo2052()] = true;
                                    }
                                }
                                if (iMo1085 == 20) {
                                    for (int i25 = 0; i25 < c8931.getChildCount(); i25++) {
                                        InterfaceC16174 interfaceC16174Mo23043 = c8931.mo23040(i25);
                                        if (interfaceC16174Mo23043 instanceof InterfaceC4181) {
                                            InterfaceC4181 interfaceC4182 = (InterfaceC4181) interfaceC16174Mo23043;
                                            if (interfaceC4182.mo12628().getType() == 49 || interfaceC4182.mo12628().getType() == 51) {
                                                c17325.f53071[interfaceC4182.mo12628().mo2052()] = true;
                                            }
                                        }
                                    }
                                }
                                if (iMo1085 == 0) {
                                    for (i9 = 0; i9 < c8931.getChildCount(); i9++) {
                                        interfaceC16174Mo23040 = c8931.mo23040(i9);
                                        if (!(interfaceC16174Mo23040 instanceof InterfaceC4181) && (c18032 = c18031Arr2[((InterfaceC4181) interfaceC16174Mo23040).mo12628().mo2052()]) != null) {
                                            c18032.f56220 = true;
                                        }
                                    }
                                } else if (iMo1085 == 5) {
                                    zArr2[c8931.f27156.mo2052()] = true;
                                } else if (iMo1085 == 9) {
                                    while (i9 < c8931.getChildCount()) {
                                        interfaceC16174Mo23040 = c8931.mo23040(i9);
                                        if (!(interfaceC16174Mo23040 instanceof InterfaceC4181)) {
                                        }
                                    }
                                } else if (iMo1085 == 20) {
                                    zArr2[c8931.f27156.mo2052()] = true;
                                } else if (iMo1085 == 47) {
                                    while (i9 < c8931.getChildCount()) {
                                        interfaceC16174Mo23040 = c8931.mo23040(i9);
                                        if (!(interfaceC16174Mo23040 instanceof InterfaceC4181)) {
                                        }
                                    }
                                } else if (iMo1085 == 50) {
                                    zArr2[c8931.f27156.mo2052()] = true;
                                } else if (iMo1085 == 64) {
                                    int i26 = 1;
                                    while (true) {
                                        int i27 = i26 + 1;
                                        if (i27 < c8931.getChildCount()) {
                                            iArr[((InterfaceC4181) c8931.mo23040(i26)).mo12628().mo2052()] = ((C8931) c8931.mo23040(i27)).f27155.mo2052() + 1;
                                            i26 += 2;
                                        }
                                    }
                                } else if (iMo1085 != 61 && iMo1085 != 62) {
                                    switch (iMo1085) {
                                        case 13:
                                            for (i10 = 0; i10 < c8931.getChildCount(); i10++) {
                                                interfaceC16174Mo23041 = c8931.mo23040(i10);
                                                if (interfaceC16174Mo23041 instanceof InterfaceC4181) {
                                                    interfaceC4181 = (InterfaceC4181) interfaceC16174Mo23041;
                                                    if (interfaceC4181.mo12628().getType() != 46) {
                                                        zArr2[interfaceC4181.mo12628().mo2052()] = true;
                                                    } else {
                                                        zArr2[interfaceC4181.mo12628().mo2052()] = true;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            switch (iMo1085) {
                                                case 27:
                                                case 28:
                                                case 29:
                                                    zArr2[c8931.f27156.mo2052()] = true;
                                                    break;
                                            }
                                        case 14:
                                        case 15:
                                        case 16:
                                            while (i9 < c8931.getChildCount()) {
                                                interfaceC16174Mo23040 = c8931.mo23040(i9);
                                                if (!(interfaceC16174Mo23040 instanceof InterfaceC4181)) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    while (i10 < c8931.getChildCount()) {
                                        interfaceC16174Mo23041 = c8931.mo23040(i10);
                                        if (interfaceC16174Mo23041 instanceof InterfaceC4181) {
                                            interfaceC4181 = (InterfaceC4181) interfaceC16174Mo23041;
                                            if (interfaceC4181.mo12628().getType() != 46 || interfaceC4181.mo12628().getType() == 61) {
                                                zArr2[interfaceC4181.mo12628().mo2052()] = true;
                                            }
                                        }
                                    }
                                }
                                for (int childCount = c8931.getChildCount() - 1; childCount >= 0; childCount--) {
                                    arrayDeque2.push(c8931.mo23040(childCount));
                                }
                            }
                        }
                    }
                }
            }
        } catch (C6701 unused) {
            throw new InterruptedException();
        }
    }

    public C17325(CharSequence charSequence, ArrayList arrayList, boolean z, int i, C19012 c19012) {
        String str;
        char cCharAt;
        this.f53063 = arrayList;
        int iMax = Math.max(1, i);
        this.f53064 = iMax;
        this.f53070 = z ? "\t" : C9679.m24607(' ', iMax);
        int i2 = 0;
        while (true) {
            str = "\n";
            if (i2 >= charSequence.length() || (cCharAt = charSequence.charAt(i2)) == '\n') {
                break;
            }
            if (cCharAt == '\r') {
                int i3 = i2 + 1;
                if (i3 < charSequence.length() && charSequence.charAt(i3) == '\n') {
                    str = "\r\n";
                    break;
                } else {
                    str = "\r";
                    break;
                }
            }
            i2++;
        }
        this.f53066 = str;
        this.f53062 = c19012;
        this.f53072 = new C18031[arrayList.size()];
        this.f53061 = new C18031[arrayList.size()];
        this.f53069 = new boolean[arrayList.size()];
        this.f53071 = new boolean[arrayList.size()];
        this.f53068 = new int[arrayList.size()];
        this.f53067 = new int[arrayList.size() + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40650(int i, int i2) {
        return ((!this.f53069[i2] && !this.f53071[i2]) || i == 0 || i == 65 || m40649(i) || i == 54 || i == 61 || i == 62 || i == 63 || ((InterfaceC0463) this.f53063.get(i2)).getType() == 61) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m40652(int i, int i2) {
        return (i == 0 || m40649(i) || i2 == 54 || i2 == 53 || i2 == 55 || i2 == 60 || i2 == 58 || i2 == 56) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40647() throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }
}
