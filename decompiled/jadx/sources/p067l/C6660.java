package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5281 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6660 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f17184 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: ۧ */
    public static final Charset f17185 = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: ֫ */
    public static int m15172(int i) {
        if (i < 96) {
            return f17184[i];
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:254:0x047f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0487 A[LOOP:22: B:253:0x047d->B:257:0x0487, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[EDGE_INSN: B:38:0x0066->B:42:0x0070 BREAK  A[LOOP:30: B:25:0x0043->B:35:0x005e]] */
    /* JADX WARN: Code duplicated, block: B:397:0x048c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0491 A[EDGE_INSN: B:398:0x0491->B:260:0x0491 BREAK  A[LOOP:22: B:253:0x047d->B:257:0x0487], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x006b A[EDGE_INSN: B:40:0x006b->B:42:0x0070 BREAK  A[LOOP:30: B:25:0x0043->B:35:0x005e]] */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[EDGE_INSN: B:41:0x006e->B:42:0x0070 BREAK  A[LOOP:30: B:25:0x0043->B:35:0x005e]] */
    /* JADX WARN: Code duplicated, block: B:424:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0064 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C14036 m15173(String str, EnumC2636 enumC2636) throws C11355 {
        int i;
        boolean z;
        boolean z2;
        EnumC7331 enumC7331;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        EnumC2636 enumC2637 = enumC2636;
        Charset charset = C4649.f10450;
        Charset charset2 = f17185;
        int i8 = 1;
        if (charset != null && charset.equals(charset2)) {
            byte[] bytes = str.getBytes(C4649.f10450);
            int length = bytes.length;
            boolean z3 = false;
            if (length % 2 == 0) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        z3 = true;
                        break;
                    }
                    int i10 = bytes[i9] & 255;
                    if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                        break;
                    }
                    i9 += 2;
                }
            }
            if (!z3) {
                i = 0;
                z = false;
                z2 = false;
                while (true) {
                    if (i < str.length()) {
                        if (z) {
                            if (z2) {
                                enumC7331 = EnumC7331.BYTE;
                                break;
                            }
                            enumC7331 = EnumC7331.NUMERIC;
                            break;
                        }
                        enumC7331 = EnumC7331.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i);
                    if (cCharAt >= '0') {
                        if (m15172(cCharAt) == -1) {
                            enumC7331 = EnumC7331.BYTE;
                            break;
                        }
                        z = true;
                    } else {
                        if (m15172(cCharAt) == -1) {
                            enumC7331 = EnumC7331.BYTE;
                            break;
                        }
                        z = true;
                    }
                    i++;
                }
            } else {
                enumC7331 = EnumC7331.KANJI;
            }
        } else {
            i = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i < str.length()) {
                    if (z) {
                        if (z2) {
                            enumC7331 = EnumC7331.BYTE;
                            break;
                        }
                        enumC7331 = EnumC7331.NUMERIC;
                        break;
                    }
                    enumC7331 = EnumC7331.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    z2 = true;
                } else {
                    if (m15172(cCharAt) == -1) {
                        enumC7331 = EnumC7331.BYTE;
                        break;
                    }
                    z = true;
                }
                i++;
            }
        }
        C10684 c10684 = new C10684();
        EnumC7331 enumC7332 = EnumC7331.BYTE;
        c10684.m24600(enumC7331.m16924(), 4);
        C10684 c10685 = new C10684();
        int i11 = C21413.f67577[enumC7331.ordinal()];
        if (i11 == 1) {
            int length2 = str.length();
            int i12 = 0;
            while (i12 < length2) {
                int iCharAt = str.charAt(i12) - '0';
                int i13 = i12 + 2;
                if (i13 < length2) {
                    c10685.m24600(C24420.m53892(str.charAt(i12 + 1) - '0', 10, iCharAt * 100, str.charAt(i13) - '0'), 10);
                    i12 += 3;
                } else {
                    i12++;
                    if (i12 < length2) {
                        c10685.m24600((iCharAt * 10) + (str.charAt(i12) - '0'), 7);
                        i12 = i13;
                    } else {
                        c10685.m24600(iCharAt, 4);
                    }
                }
            }
        } else if (i11 == 2) {
            int length3 = str.length();
            int i14 = 0;
            while (i14 < length3) {
                int iM15172 = m15172(str.charAt(i14));
                if (iM15172 == -1) {
                    throw new C11355();
                }
                int i15 = i14 + 1;
                if (i15 < length3) {
                    int iM15173 = m15172(str.charAt(i15));
                    if (iM15173 == -1) {
                        throw new C11355();
                    }
                    c10685.m24600((iM15172 * 45) + iM15173, 11);
                    i14 += 2;
                } else {
                    c10685.m24600(iM15172, 6);
                    i14 = i15;
                }
            }
        } else if (i11 == 3) {
            for (byte b : str.getBytes(charset2)) {
                c10685.m24600(b, 8);
            }
        } else {
            if (i11 != 4) {
                throw new C11355("Invalid mode: " + enumC7331);
            }
            Charset charset3 = C4649.f10450;
            if (charset3 == null) {
                throw new C11355("SJIS Charset not supported on this platform");
            }
            byte[] bytes2 = str.getBytes(charset3);
            if (bytes2.length % 2 != 0) {
                throw new C11355("Kanji byte size not even");
            }
            int length4 = bytes2.length - 1;
            for (int i16 = 0; i16 < length4; i16 += 2) {
                int i17 = ((bytes2[i16] & 255) << 8) | (bytes2[i16 + 1] & 255);
                int i18 = (i17 < 33088 || i17 > 40956) ? (i17 < 57408 || i17 > 60351) ? -1 : i17 - 49472 : i17 - 33088;
                if (i18 == -1) {
                    throw new C11355("Invalid byte sequence");
                }
                c10685.m24600(((i18 >> 8) * 192) + (i18 & 255), 13);
            }
        }
        int size = c10685.getSize() + enumC7331.m16925(C16717.m37936(1)) + c10684.getSize();
        int i19 = 1;
        boolean z4 = false;
        while (i19 <= 40) {
            C16717 c16717M37936 = C16717.m37936(i19);
            if (m15174(size, c16717M37936, enumC2637)) {
                int size2 = c10685.getSize() + enumC7331.m16925(c16717M37936) + c10684.getSize();
                int i20 = 1;
                boolean z5 = z4;
                while (i20 <= 40) {
                    C16717 c16717M37937 = C16717.m37936(i20);
                    if (m15174(size2, c16717M37937, enumC2637)) {
                        C10684 c10686 = new C10684();
                        c10686.m24601(c10684);
                        int iM24599 = enumC7331 == enumC7332 ? c10685.m24599() : str.length();
                        int iM16925 = enumC7331.m16925(c16717M37937);
                        int i21 = i8 << iM16925;
                        if (iM24599 >= i21) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iM24599);
                            sb.append(" is bigger than ");
                            sb.append(i21 - 1);
                            throw new C11355(sb.toString());
                        }
                        c10686.m24600(iM24599, iM16925);
                        c10686.m24601(c10685);
                        C10013 c10013M37938 = c16717M37937.m37938(enumC2637);
                        int iM37939 = c16717M37937.m37939() - c10013M37938.m23331();
                        int i22 = iM37939 * 8;
                        if (c10686.getSize() > i22) {
                            throw new C11355("data bits cannot fit in the QR Code" + c10686.getSize() + " > " + i22);
                        }
                        for (int i23 = 0; i23 < 4 && c10686.getSize() < i22; i23++) {
                            c10686.m24602(z5);
                        }
                        int size3 = c10686.getSize() & 7;
                        if (size3 > 0) {
                            while (size3 < 8) {
                                c10686.m24602(z5);
                                size3++;
                            }
                        }
                        int iM245910 = iM37939 - c10686.m24599();
                        for (int i24 = 0; i24 < iM245910; i24++) {
                            c10686.m24600((i24 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (c10686.getSize() != i22) {
                            throw new C11355("Bits size does not equal capacity");
                        }
                        int iM379310 = c16717M37937.m37939();
                        int iM23330 = c10013M37938.m23330();
                        if (c10686.m24599() != iM37939) {
                            throw new C11355("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(iM23330);
                        int i25 = 0;
                        int i26 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        while (i25 < iM23330) {
                            int[] iArr = new int[i8];
                            int[] iArr2 = new int[i8];
                            if (i25 >= iM23330) {
                                throw new C11355("Block ID too large");
                            }
                            int i27 = iM379310 % iM23330;
                            int i28 = iM23330 - i27;
                            int i29 = iM379310 / iM23330;
                            int i30 = iM37939 / iM23330;
                            C16717 c16717 = c16717M37937;
                            int i31 = i30 + 1;
                            EnumC7331 enumC7333 = enumC7331;
                            int i32 = i29 - i30;
                            int i33 = (i29 + 1) - i31;
                            if (i32 != i33) {
                                throw new C11355("EC bytes mismatch");
                            }
                            int i34 = iM37939;
                            if (iM23330 != i28 + i27) {
                                throw new C11355("RS blocks mismatch");
                            }
                            if (iM379310 != C21466.m48630(i31, i33, i27, (i30 + i32) * i28)) {
                                throw new C11355("Total bytes mismatch");
                            }
                            if (i25 < i28) {
                                c = 0;
                                iArr[0] = i30;
                                iArr2[0] = i32;
                            } else {
                                c = 0;
                                iArr[0] = i31;
                                iArr2[0] = i33;
                            }
                            int i35 = iArr[c];
                            byte[] bArr = new byte[i35];
                            int i36 = i26 * 8;
                            int i37 = 0;
                            while (i37 < i35) {
                                int i38 = 0;
                                int i39 = iM23330;
                                for (int i40 = 0; i40 < 8; i40++) {
                                    if (c10686.m24603(i36)) {
                                        i38 = (1 << (7 - i40)) | i38;
                                    }
                                    i36++;
                                }
                                bArr[i37] = (byte) i38;
                                i37++;
                                iM23330 = i39;
                            }
                            int i41 = iM23330;
                            int i42 = iArr2[0];
                            int[] iArr3 = new int[i35 + i42];
                            for (int i43 = 0; i43 < i35; i43++) {
                                iArr3[i43] = bArr[i43] & 255;
                            }
                            new C20743(C5990.f14818).m46844(i42, iArr3);
                            byte[] bArr2 = new byte[i42];
                            for (int i44 = 0; i44 < i42; i44++) {
                                bArr2[i44] = (byte) iArr3[i35 + i44];
                            }
                            arrayList.add(new C22754(bArr, bArr2));
                            iMax = Math.max(iMax, i35);
                            iMax2 = Math.max(iMax2, i42);
                            i26 += iArr[0];
                            i25++;
                            i8 = 1;
                            iM37939 = i34;
                            iM23330 = i41;
                            c16717M37937 = c16717;
                            enumC7331 = enumC7333;
                        }
                        EnumC7331 enumC7334 = enumC7331;
                        C16717 c16718 = c16717M37937;
                        if (iM37939 != i26) {
                            throw new C11355("Data bytes does not match offset");
                        }
                        C10684 c10687 = new C10684();
                        for (int i45 = 0; i45 < iMax; i45++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArrM50922 = ((C22754) it.next()).m50922();
                                if (i45 < bArrM50922.length) {
                                    c10687.m24600(bArrM50922[i45], 8);
                                }
                            }
                        }
                        for (int i46 = 0; i46 < iMax2; i46++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArrM50923 = ((C22754) it2.next()).m50923();
                                if (i46 < bArrM50923.length) {
                                    c10687.m24600(bArrM50923[i46], 8);
                                }
                            }
                        }
                        if (iM379310 != c10687.m24599()) {
                            StringBuilder sbM34408 = C15033.m34408(iM379310, "Interleaving error: ", " and ");
                            sbM34408.append(c10687.m24599());
                            sbM34408.append(" differ.");
                            throw new C11355(sbM34408.toString());
                        }
                        C14036 c14036 = new C14036();
                        EnumC2636 enumC2638 = enumC2636;
                        c14036.m31873(enumC2638);
                        c14036.m31874(enumC7334);
                        c14036.m31875(c16718);
                        int iM37937 = c16718.m37937();
                        C23424 c23424 = new C23424(iM37937, iM37937);
                        int i47 = -1;
                        int i48 = Integer.MAX_VALUE;
                        int i49 = 0;
                        while (i49 < 8) {
                            C14706.m33632(c10687, enumC2638, c16718, i49, c23424);
                            int iM11511 = C5319.m11511(c23424);
                            byte[][] bArrM52110 = c23424.m52110();
                            int iM52112 = c23424.m52112();
                            int iM52111 = c23424.m52111();
                            int i50 = 0;
                            int i51 = 0;
                            while (i50 < iM52111 - 1) {
                                byte[] bArr3 = bArrM52110[i50];
                                int i52 = 0;
                                while (true) {
                                    i7 = iM52111;
                                    if (i52 < iM52112 - 1) {
                                        byte b2 = bArr3[i52];
                                        int i53 = i52 + 1;
                                        int i54 = iM52112;
                                        if (b2 == bArr3[i53]) {
                                            byte[] bArr4 = bArrM52110[i50 + 1];
                                            if (b2 == bArr4[i52] && b2 == bArr4[i53]) {
                                                i51++;
                                            }
                                        }
                                        iM52111 = i7;
                                        i52 = i53;
                                        iM52112 = i54;
                                    }
                                }
                                i50++;
                                iM52111 = i7;
                            }
                            int i55 = (i51 * 3) + iM11511;
                            byte[][] bArrM52111 = c23424.m52110();
                            int iM52113 = c23424.m52112();
                            int iM52114 = c23424.m52111();
                            int i56 = 0;
                            for (int i57 = 0; i57 < iM52114; i57++) {
                                int i58 = 0;
                                while (i58 < iM52113) {
                                    byte[] bArr5 = bArrM52111[i57];
                                    C10684 c10688 = c10687;
                                    int i59 = i58 + 6;
                                    if (i59 < iM52113) {
                                        i2 = iM52113;
                                        byte b3 = 1;
                                        if (bArr5[i58] == 1 && bArr5[i58 + 1] == 0 && bArr5[i58 + 2] == 1 && bArr5[i58 + 3] == 1 && bArr5[i58 + 4] == 1 && bArr5[i58 + 5] == 0 && bArr5[i59] == 1) {
                                            int i60 = i58 - 4;
                                            if (i60 >= 0 && bArr5.length >= i58) {
                                                while (true) {
                                                    if (i60 < i58) {
                                                        if (bArr5[i60] == b3) {
                                                            i4 = i58 + 7;
                                                            i5 = i58 + 11;
                                                            if (i4 >= 0) {
                                                                while (true) {
                                                                    if (i4 >= i5) {
                                                                        i6 = i5;
                                                                        if (bArr5[i4] == 1) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i4++;
                                                                        i5 = i6;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i60++;
                                                            b3 = 1;
                                                        }
                                                    }
                                                    i56++;
                                                    break;
                                                }
                                            } else {
                                                i4 = i58 + 7;
                                                i5 = i58 + 11;
                                                if (i4 >= 0 && bArr5.length >= i5) {
                                                    while (true) {
                                                        if (i4 >= i5) {
                                                            i56++;
                                                            break;
                                                        }
                                                        i6 = i5;
                                                        if (bArr5[i4] == 1) {
                                                            break;
                                                        }
                                                        i4++;
                                                        i5 = i6;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = iM52113;
                                    }
                                    int i61 = i57 + 6;
                                    if (i61 < iM52114) {
                                        byte b4 = 1;
                                        if (bArrM52111[i57][i58] == 1 && bArrM52111[i57 + 1][i58] == 0 && bArrM52111[i57 + 2][i58] == 1 && bArrM52111[i57 + 3][i58] == 1 && bArrM52111[i57 + 4][i58] == 1 && bArrM52111[i57 + 5][i58] == 0 && bArrM52111[i61][i58] == 1) {
                                            int i62 = i57 - 4;
                                            if (i62 >= 0 && bArrM52111.length >= i57) {
                                                while (true) {
                                                    if (i62 < i57) {
                                                        if (bArrM52111[i62][i58] == b4) {
                                                            i3 = i57 + 7;
                                                            int i63 = i57 + 11;
                                                            if (i3 < 0) {
                                                            }
                                                        } else {
                                                            i62++;
                                                            b4 = 1;
                                                        }
                                                    }
                                                    i56++;
                                                    break;
                                                    break;
                                                }
                                            }
                                            i3 = i57 + 7;
                                            int i64 = i57 + 11;
                                            if (i3 < 0 && bArrM52111.length >= i64) {
                                                while (true) {
                                                    if (i3 >= i64) {
                                                        i56++;
                                                        break;
                                                    }
                                                    if (bArrM52111[i3][i58] == 1) {
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    i58++;
                                    c10687 = c10688;
                                    iM52113 = i2;
                                }
                            }
                            C10684 c10689 = c10687;
                            int i65 = (i56 * 40) + i55;
                            byte[][] bArrM52112 = c23424.m52110();
                            int iM52115 = c23424.m52112();
                            int iM52116 = c23424.m52111();
                            int i66 = 0;
                            for (int i67 = 0; i67 < iM52116; i67++) {
                                byte[] bArr6 = bArrM52112[i67];
                                for (int i68 = 0; i68 < iM52115; i68++) {
                                    if (bArr6[i68] == 1) {
                                        i66++;
                                    }
                                }
                            }
                            int iM52117 = c23424.m52112() * c23424.m52111();
                            int iAbs = (((Math.abs((i66 * 2) - iM52117) * 10) / iM52117) * 10) + i65;
                            if (iAbs < i48) {
                                i48 = iAbs;
                                i47 = i49;
                            }
                            i49++;
                            c10687 = c10689;
                            enumC2638 = enumC2636;
                        }
                        c14036.m31872(i47);
                        C14706.m33632(c10687, enumC2636, c16718, i47, c23424);
                        c14036.m31876(c23424);
                        return c14036;
                    }
                    i20++;
                    z5 = false;
                    enumC2637 = enumC2637;
                    enumC7331 = enumC7331;
                    i8 = 1;
                }
                throw new C11355("Data too big");
            }
            i19++;
            z4 = false;
            enumC2637 = enumC2637;
            enumC7331 = enumC7331;
            i8 = 1;
        }
        throw new C11355("Data too big");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15174(int i, C16717 c16717, EnumC2636 enumC2636) {
        return c16717.m37939() - c16717.m37938(enumC2636).m23331() >= (i + 7) / 8;
    }
}
