package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6OO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18834 {

    /* JADX INFO: renamed from: ֫ */
    public final C19505[] f56243;

    /* JADX INFO: renamed from: ۜ */
    public final C20438 f56244;

    /* JADX INFO: renamed from: ۡ */
    public final List f56245;

    /* JADX INFO: renamed from: ۢ */
    public final int f56246;

    /* JADX INFO: renamed from: ۧ */
    public int f56247;

    /* JADX INFO: renamed from: ܳ */
    public final String f56248;

    /* JADX INFO: renamed from: ܺ */
    public final int[] f56249;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f56250;

    /* JADX INFO: renamed from: ܿ */
    public final boolean[] f56251;

    /* JADX INFO: renamed from: ᩳ */
    public final String f56252;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean[] f56253;

    /* JADX INFO: renamed from: ᩻ */
    public final C19505[] f56254;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42900(int i) {
        return i == 59 || i == 57 || i == 55;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42902(CharSequence charSequence, boolean z, int i, C20438 c20438) throws InterruptedException {
        C4082.m8192(charSequence, z, i, c20438);
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
    /* JADX INFO: renamed from: ֫ */
    public static void m42899(CharSequence charSequence, boolean z, int i, C20438 c20438) {
        String str;
        C20438 c20439;
        boolean[] zArr;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        C19505 c19505;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC17740 interfaceC17740Mo25014;
        C19505 c19506;
        int i10;
        InterfaceC17740 interfaceC17740Mo25015;
        InterfaceC6342 interfaceC6342;
        int type;
        m42898();
        try {
            C16151 c16151 = new C16151(new C13618(charSequence, new RunnableC9288(3)));
            C18163 c18163 = new C18163();
            c16151.m45727();
            c16151.m45725(c18163);
            C4150 c4150 = new C4150(c16151);
            c4150.m8408();
            int i11 = -1;
            if (c4150.mo8405(1) == -1) {
                c20438.append(charSequence);
                return;
            }
            ArrayList arrayListM8412 = c4150.m8412();
            C18834 c18834 = new C18834(charSequence, arrayListM8412, z, i, c20438);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = 0;
            int i13 = -1;
            while (true) {
                int size = arrayListM8412.size();
                C19505[] c19505Arr = c18834.f56243;
                C19505[] c19505Arr2 = c18834.f56254;
                if (i12 < size) {
                    m42898();
                    InterfaceC2808 interfaceC2808 = (InterfaceC2808) arrayListM8412.get(i12);
                    int type2 = interfaceC2808.getType();
                    if (type2 != 64 && type2 != 53 && type2 != i11) {
                        if (type2 == 65) {
                            if (!arrayDeque.isEmpty()) {
                                ((C19505) arrayDeque.peek()).f59418 = true;
                            }
                        } else if (m42900(type2)) {
                            if (arrayDeque.size() >= 128) {
                                throw new C12800(interfaceC2808.getLine(), interfaceC2808.mo4429(), "Formatting nesting limit exceeded");
                            }
                            C19505 c19507 = new C19505(i12);
                            if (!arrayDeque.isEmpty() && type2 != 55) {
                                ((C19505) arrayDeque.peek()).f59418 = true;
                            }
                            c19505Arr2[i12] = c19507;
                            arrayDeque.push(c19507);
                        } else if (type2 == 60 || type2 == 58 || type2 == 56) {
                            if (arrayDeque.isEmpty() || !(((type = ((InterfaceC2808) arrayListM8412.get(((C19505) arrayDeque.peek()).f59419)).getType()) == 59 && type2 == 60) || ((type == 57 && type2 == 58) || (type == 55 && type2 == 56)))) {
                                throw new C12800(interfaceC2808.getLine(), interfaceC2808.mo4429(), "Mismatched closing delimiter");
                            }
                            C19505 c19508 = (C19505) arrayDeque.pop();
                            c19508.f59417 = i12;
                            c19508.f59420 = i13 != c19508.f59419;
                            c19505Arr[i12] = c19508;
                        }
                        i13 = i12;
                    }
                    i12++;
                    i11 = -1;
                } else {
                    if (!arrayDeque.isEmpty()) {
                        InterfaceC2808 interfaceC2809 = (InterfaceC2808) arrayListM8412.get(((C19505) arrayDeque.peek()).f59419);
                        throw new C12800(interfaceC2809.getLine(), interfaceC2809.mo4429(), "Unclosed delimiter");
                    }
                    C16208 c16208 = new C16208(c4150);
                    c16208.m45727();
                    c16208.m45725(c18163);
                    C14140 c14140M36921 = c16208.m36921();
                    if (c4150.mo8405(1) != -1) {
                        InterfaceC2808 interfaceC2808Mo8413 = c4150.mo8413(1);
                        throw new C12800(interfaceC2808Mo8413.getLine(), interfaceC2808Mo8413.mo4429(), "Unexpected trailing content");
                    }
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    arrayDeque2.push(c14140M36921);
                    while (true) {
                        boolean zIsEmpty = arrayDeque2.isEmpty();
                        int[] iArr = c18834.f56250;
                        boolean[] zArr2 = c18834.f56251;
                        if (zIsEmpty) {
                            ArrayDeque arrayDeque3 = new ArrayDeque();
                            int size2 = arrayListM8412.size();
                            while (true) {
                                size2--;
                                if (size2 >= 0) {
                                    C19505 c19509 = c19505Arr[size2];
                                    if (c19509 != null) {
                                        arrayDeque3.push(c19509);
                                    }
                                    if (c19505Arr2[size2] != null) {
                                        C19505 c195010 = (C19505) arrayDeque3.pop();
                                        boolean z7 = c195010.f59418 & c195010.f59420;
                                        c195010.f59418 = z7;
                                        if (z7 && !arrayDeque3.isEmpty()) {
                                            ((C19505) arrayDeque3.peek()).f59418 = true;
                                        }
                                    }
                                } else {
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int size3 = arrayListM8412.size();
                                        int[] iArr2 = c18834.f56249;
                                        if (i14 >= size3) {
                                            ArrayDeque arrayDeque4 = new ArrayDeque();
                                            int i16 = 0;
                                            int i17 = 0;
                                            int i18 = 0;
                                            boolean z8 = false;
                                            boolean z9 = false;
                                            int i19 = 0;
                                            while (true) {
                                                int size4 = arrayListM8412.size();
                                                int i20 = i19;
                                                str = c18834.f56248;
                                                c20439 = c18834.f56244;
                                                if (i16 < size4) {
                                                    m42898();
                                                    InterfaceC2808 interfaceC28010 = (InterfaceC2808) arrayListM8412.get(i16);
                                                    ArrayList arrayList = arrayListM8412;
                                                    int type3 = interfaceC28010.getType();
                                                    C19505[] c19505Arr3 = c19505Arr2;
                                                    if (type3 != -1) {
                                                        if (type3 == 53) {
                                                            i19 = i20;
                                                            zArr = zArr2;
                                                            c19505Arr = c19505Arr;
                                                        } else if (type3 == 64) {
                                                            String text = interfaceC28010.getText();
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
                                                            c19505Arr = c19505Arr;
                                                        } else {
                                                            C19505 c195011 = c19505Arr[i16];
                                                            if (c195011 != null) {
                                                                arrayDeque4.pop();
                                                                i2 = c195011.f59422;
                                                            } else {
                                                                i2 = i20;
                                                            }
                                                            if (!zArr2[i16] || arrayDeque4.isEmpty()) {
                                                                zArr = zArr2;
                                                            } else {
                                                                zArr = zArr2;
                                                                if (((C19505) arrayDeque4.peek()).f59421 && i18 != 54 && i18 != 61) {
                                                                    z2 = true;
                                                                }
                                                                if (!z8 || z9 || z2 || (c195011 != null && c195011.f59421)) {
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
                                                                if (!z3 || (i7 = iArr[i16]) == 0 || (c18834.f56247 + iArr2[i7]) - iArr2[i16] <= 120) {
                                                                    i3 = i2;
                                                                } else {
                                                                    i3 = i2 + 1;
                                                                    z3 = true;
                                                                }
                                                                if (z3) {
                                                                    i5 = i17 < 2 ? 1 : 2;
                                                                    if (c20439.length() != 0) {
                                                                        for (i6 = 0; i6 < i5; i6++) {
                                                                            c20439.append((CharSequence) str);
                                                                        }
                                                                        c18834.f56247 = 0;
                                                                    }
                                                                } else if (c18834.f56247 > 0) {
                                                                    if (c18834.m42901(i18, i16)) {
                                                                        c20439.append(',');
                                                                        c18834.f56247++;
                                                                    }
                                                                    if (type3 != 65 || m42903(i18, type3)) {
                                                                        c20439.append(' ');
                                                                        c18834.f56247++;
                                                                    }
                                                                }
                                                                if (c18834.f56247 == 0) {
                                                                    for (i4 = 0; i4 < i3; i4++) {
                                                                        c20439.append((CharSequence) c18834.f56252);
                                                                    }
                                                                    c18834.f56247 = i3 * c18834.f56246;
                                                                }
                                                                c20439.append((CharSequence) interfaceC28010.getText());
                                                                int length = interfaceC28010.getText().length() + c18834.f56247;
                                                                c18834.f56247 = length;
                                                                c19505 = c19505Arr3[i16];
                                                                if (c19505 != null) {
                                                                    c19505.f59422 = i2;
                                                                    if (c19505.f59420 || (!c19505.f59418 && (length + iArr2[c19505.f59417 + 1]) - iArr2[i16 + 1] <= 120)) {
                                                                        z6 = false;
                                                                    } else {
                                                                        z6 = true;
                                                                    }
                                                                    c19505.f59421 = z6;
                                                                    arrayDeque4.push(c19505);
                                                                    if (c19505.f59421) {
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
                                                                if (c20439.length() != 0) {
                                                                    while (i6 < i5) {
                                                                        c20439.append((CharSequence) str);
                                                                    }
                                                                    c18834.f56247 = 0;
                                                                }
                                                            } else if (c18834.f56247 > 0) {
                                                                if (c18834.m42901(i18, i16)) {
                                                                    c20439.append(',');
                                                                    c18834.f56247++;
                                                                }
                                                                if (type3 != 65) {
                                                                    c20439.append(' ');
                                                                    c18834.f56247++;
                                                                } else {
                                                                    c20439.append(' ');
                                                                    c18834.f56247++;
                                                                }
                                                            }
                                                            if (c18834.f56247 == 0) {
                                                                while (i4 < i3) {
                                                                    c20439.append((CharSequence) c18834.f56252);
                                                                }
                                                                c18834.f56247 = i3 * c18834.f56246;
                                                            }
                                                            c20439.append((CharSequence) interfaceC28010.getText());
                                                            int length2 = interfaceC28010.getText().length() + c18834.f56247;
                                                            c18834.f56247 = length2;
                                                            c19505 = c19505Arr3[i16];
                                                            if (c19505 != null) {
                                                                c19505.f59422 = i2;
                                                                if (c19505.f59420) {
                                                                    z6 = false;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                c19505.f59421 = z6;
                                                                arrayDeque4.push(c19505);
                                                                if (c19505.f59421) {
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
                                                        c19505Arr2 = c19505Arr3;
                                                        c19505Arr = c19505Arr;
                                                        arrayListM8412 = arrayList;
                                                    }
                                                }
                                            }
                                            if (charSequence.length() > 0) {
                                                if (charSequence.charAt(charSequence.length() - 1) == '\n' || charSequence.charAt(charSequence.length() - 1) == '\r') {
                                                    c20439.append((CharSequence) str);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        m42898();
                                        InterfaceC2808 interfaceC28011 = (InterfaceC2808) arrayListM8412.get(i14);
                                        int type4 = interfaceC28011.getType();
                                        int i23 = i14 + 1;
                                        int i24 = iArr2[i14];
                                        iArr2[i23] = i24;
                                        if (type4 != 64 && type4 != 53 && type4 != -1) {
                                            iArr2[i23] = interfaceC28011.getText().length() + (m42903(i15, type4) ? 1 : 0) + (c18834.m42901(i15, i14) ? 1 : 0) + i24;
                                            i15 = type4;
                                        }
                                        i14 = i23;
                                    }
                                }
                            }
                        } else {
                            m42898();
                            InterfaceC17740 interfaceC17740 = (InterfaceC17740) arrayDeque2.pop();
                            if (interfaceC17740 instanceof C10856) {
                                C10856 c10856 = (C10856) interfaceC17740;
                                int iMo3481 = c10856.mo3481();
                                if (c10856.getChildCount() > 1) {
                                    InterfaceC17740 interfaceC17740Mo25016 = c10856.mo25014(1);
                                    if ((interfaceC17740Mo25016 instanceof InterfaceC6342) && ((InterfaceC6342) interfaceC17740Mo25016).mo14503().getType() == 54) {
                                        zArr2[c10856.f30091.mo4432()] = true;
                                    }
                                }
                                if (iMo3481 == 20) {
                                    for (int i25 = 0; i25 < c10856.getChildCount(); i25++) {
                                        InterfaceC17740 interfaceC17740Mo25017 = c10856.mo25014(i25);
                                        if (interfaceC17740Mo25017 instanceof InterfaceC6342) {
                                            InterfaceC6342 interfaceC6343 = (InterfaceC6342) interfaceC17740Mo25017;
                                            if (interfaceC6343.mo14503().getType() == 49 || interfaceC6343.mo14503().getType() == 51) {
                                                c18834.f56253[interfaceC6343.mo14503().mo4432()] = true;
                                            }
                                        }
                                    }
                                }
                                if (iMo3481 == 0) {
                                    for (i9 = 0; i9 < c10856.getChildCount(); i9++) {
                                        interfaceC17740Mo25014 = c10856.mo25014(i9);
                                        if (!(interfaceC17740Mo25014 instanceof InterfaceC6342) && (c19506 = c19505Arr2[((InterfaceC6342) interfaceC17740Mo25014).mo14503().mo4432()]) != null) {
                                            c19506.f59418 = true;
                                        }
                                    }
                                } else if (iMo3481 == 5) {
                                    zArr2[c10856.f30091.mo4432()] = true;
                                } else if (iMo3481 == 9) {
                                    while (i9 < c10856.getChildCount()) {
                                        interfaceC17740Mo25014 = c10856.mo25014(i9);
                                        if (!(interfaceC17740Mo25014 instanceof InterfaceC6342)) {
                                        }
                                    }
                                } else if (iMo3481 == 20) {
                                    zArr2[c10856.f30091.mo4432()] = true;
                                } else if (iMo3481 == 47) {
                                    while (i9 < c10856.getChildCount()) {
                                        interfaceC17740Mo25014 = c10856.mo25014(i9);
                                        if (!(interfaceC17740Mo25014 instanceof InterfaceC6342)) {
                                        }
                                    }
                                } else if (iMo3481 == 50) {
                                    zArr2[c10856.f30091.mo4432()] = true;
                                } else if (iMo3481 == 64) {
                                    int i26 = 1;
                                    while (true) {
                                        int i27 = i26 + 1;
                                        if (i27 < c10856.getChildCount()) {
                                            iArr[((InterfaceC6342) c10856.mo25014(i26)).mo14503().mo4432()] = ((C10856) c10856.mo25014(i27)).f30090.mo4432() + 1;
                                            i26 += 2;
                                        }
                                    }
                                } else if (iMo3481 != 61 && iMo3481 != 62) {
                                    switch (iMo3481) {
                                        case 13:
                                            for (i10 = 0; i10 < c10856.getChildCount(); i10++) {
                                                interfaceC17740Mo25015 = c10856.mo25014(i10);
                                                if (interfaceC17740Mo25015 instanceof InterfaceC6342) {
                                                    interfaceC6342 = (InterfaceC6342) interfaceC17740Mo25015;
                                                    if (interfaceC6342.mo14503().getType() != 46) {
                                                        zArr2[interfaceC6342.mo14503().mo4432()] = true;
                                                    } else {
                                                        zArr2[interfaceC6342.mo14503().mo4432()] = true;
                                                    }
                                                }
                                            }
                                            break;
                                        default:
                                            switch (iMo3481) {
                                                case 27:
                                                case 28:
                                                case 29:
                                                    zArr2[c10856.f30091.mo4432()] = true;
                                                    break;
                                            }
                                        case 14:
                                        case 15:
                                        case 16:
                                            while (i9 < c10856.getChildCount()) {
                                                interfaceC17740Mo25014 = c10856.mo25014(i9);
                                                if (!(interfaceC17740Mo25014 instanceof InterfaceC6342)) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    while (i10 < c10856.getChildCount()) {
                                        interfaceC17740Mo25015 = c10856.mo25014(i10);
                                        if (interfaceC17740Mo25015 instanceof InterfaceC6342) {
                                            interfaceC6342 = (InterfaceC6342) interfaceC17740Mo25015;
                                            if (interfaceC6342.mo14503().getType() != 46 || interfaceC6342.mo14503().getType() == 61) {
                                                zArr2[interfaceC6342.mo14503().mo4432()] = true;
                                            }
                                        }
                                    }
                                }
                                for (int childCount = c10856.getChildCount() - 1; childCount >= 0; childCount--) {
                                    arrayDeque2.push(c10856.mo25014(childCount));
                                }
                            }
                        }
                    }
                }
            }
        } catch (C8737 unused) {
            throw new InterruptedException();
        }
    }

    public C18834(CharSequence charSequence, ArrayList arrayList, boolean z, int i, C20438 c20438) {
        String str;
        char cCharAt;
        this.f56245 = arrayList;
        int iMax = Math.max(1, i);
        this.f56246 = iMax;
        this.f56252 = z ? "\t" : C11567.m26621(' ', iMax);
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
        this.f56248 = str;
        this.f56244 = c20438;
        this.f56254 = new C19505[arrayList.size()];
        this.f56243 = new C19505[arrayList.size()];
        this.f56251 = new boolean[arrayList.size()];
        this.f56253 = new boolean[arrayList.size()];
        this.f56250 = new int[arrayList.size()];
        this.f56249 = new int[arrayList.size() + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42901(int i, int i2) {
        return ((!this.f56251[i2] && !this.f56253[i2]) || i == 0 || i == 65 || m42900(i) || i == 54 || i == 61 || i == 62 || i == 63 || ((InterfaceC2808) this.f56245.get(i2)).getType() == 61) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42903(int i, int i2) {
        return (i == 0 || m42900(i) || i2 == 54 || i2 == 53 || i2 == 55 || i2 == 60 || i2 == 58 || i2 == 56) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42898() throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }
}
