package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5281 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4516 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f14357 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Charset f14358 = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13289(int i) {
        if (i < 96) {
            return f14357[i];
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12277 m13290(String str, EnumC0282 enumC0282) throws C9456 {
        int i;
        boolean z;
        boolean z2;
        EnumC5222 enumC5222;
        char cCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char c;
        EnumC0282 enumC0283 = enumC0282;
        Charset charset = C2400.f7658;
        Charset charset2 = f14358;
        int i8 = 1;
        if (charset != null && charset.equals(charset2)) {
            byte[] bytes = str.getBytes(C2400.f7658);
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
                                enumC5222 = EnumC5222.BYTE;
                                break;
                            }
                            enumC5222 = EnumC5222.NUMERIC;
                            break;
                        }
                        enumC5222 = EnumC5222.ALPHANUMERIC;
                        break;
                    }
                    cCharAt = str.charAt(i);
                    if (cCharAt >= '0') {
                        if (m13289(cCharAt) == -1) {
                            enumC5222 = EnumC5222.BYTE;
                            break;
                        }
                        z = true;
                    } else {
                        if (m13289(cCharAt) == -1) {
                            enumC5222 = EnumC5222.BYTE;
                            break;
                        }
                        z = true;
                    }
                    i++;
                }
            } else {
                enumC5222 = EnumC5222.KANJI;
            }
        } else {
            i = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i < str.length()) {
                    if (z) {
                        if (z2) {
                            enumC5222 = EnumC5222.BYTE;
                            break;
                        }
                        enumC5222 = EnumC5222.NUMERIC;
                        break;
                    }
                    enumC5222 = EnumC5222.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    z2 = true;
                } else {
                    if (m13289(cCharAt) == -1) {
                        enumC5222 = EnumC5222.BYTE;
                        break;
                    }
                    z = true;
                }
                i++;
            }
        }
        C8750 c8750 = new C8750();
        EnumC5222 enumC5223 = EnumC5222.BYTE;
        c8750.m22630(enumC5222.m15014(), 4);
        C8750 c8751 = new C8750();
        int i11 = C20039.f64935[enumC5222.ordinal()];
        if (i11 == 1) {
            int length2 = str.length();
            int i12 = 0;
            while (i12 < length2) {
                int iCharAt = str.charAt(i12) - '0';
                int i13 = i12 + 2;
                if (i13 < length2) {
                    c8751.m22630(C23202.m51496(str.charAt(i12 + 1) - '0', 10, iCharAt * 100, str.charAt(i13) - '0'), 10);
                    i12 += 3;
                } else {
                    i12++;
                    if (i12 < length2) {
                        c8751.m22630((iCharAt * 10) + (str.charAt(i12) - '0'), 7);
                        i12 = i13;
                    } else {
                        c8751.m22630(iCharAt, 4);
                    }
                }
            }
        } else if (i11 == 2) {
            int length3 = str.length();
            int i14 = 0;
            while (i14 < length3) {
                int iM13289 = m13289(str.charAt(i14));
                if (iM13289 == -1) {
                    throw new C9456();
                }
                int i15 = i14 + 1;
                if (i15 < length3) {
                    int iM132810 = m13289(str.charAt(i15));
                    if (iM132810 == -1) {
                        throw new C9456();
                    }
                    c8751.m22630((iM13289 * 45) + iM132810, 11);
                    i14 += 2;
                } else {
                    c8751.m22630(iM13289, 6);
                    i14 = i15;
                }
            }
        } else if (i11 == 3) {
            for (byte b : str.getBytes(charset2)) {
                c8751.m22630(b, 8);
            }
        } else {
            if (i11 != 4) {
                throw new C9456("Invalid mode: " + enumC5222);
            }
            Charset charset3 = C2400.f7658;
            if (charset3 == null) {
                throw new C9456("SJIS Charset not supported on this platform");
            }
            byte[] bytes2 = str.getBytes(charset3);
            if (bytes2.length % 2 != 0) {
                throw new C9456("Kanji byte size not even");
            }
            int length4 = bytes2.length - 1;
            for (int i16 = 0; i16 < length4; i16 += 2) {
                int i17 = ((bytes2[i16] & 255) << 8) | (bytes2[i16 + 1] & 255);
                int i18 = (i17 < 33088 || i17 > 40956) ? (i17 < 57408 || i17 > 60351) ? -1 : i17 - 49472 : i17 - 33088;
                if (i18 == -1) {
                    throw new C9456("Invalid byte sequence");
                }
                c8751.m22630(((i18 >> 8) * 192) + (i18 & 255), 13);
            }
        }
        int size = c8751.getSize() + enumC5222.m15015(C15098.m35778(1)) + c8750.getSize();
        int i19 = 1;
        boolean z4 = false;
        while (i19 <= 40) {
            C15098 c15098M35778 = C15098.m35778(i19);
            if (m13291(size, c15098M35778, enumC0283)) {
                int size2 = c8751.getSize() + enumC5222.m15015(c15098M35778) + c8750.getSize();
                int i20 = 1;
                boolean z5 = z4;
                while (i20 <= 40) {
                    C15098 c15098M35779 = C15098.m35778(i20);
                    if (m13291(size2, c15098M35779, enumC0283)) {
                        C8750 c8752 = new C8750();
                        c8752.m22631(c8750);
                        int iM22629 = enumC5222 == enumC5223 ? c8751.m22629() : str.length();
                        int iM15015 = enumC5222.m15015(c15098M35779);
                        int i21 = i8 << iM15015;
                        if (iM22629 >= i21) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iM22629);
                            sb.append(" is bigger than ");
                            sb.append(i21 - 1);
                            throw new C9456(sb.toString());
                        }
                        c8752.m22630(iM22629, iM15015);
                        c8752.m22631(c8751);
                        C8044 c8044M35780 = c15098M35779.m35780(enumC0283);
                        int iM35781 = c15098M35779.m35781() - c8044M35780.m21364();
                        int i22 = iM35781 * 8;
                        if (c8752.getSize() > i22) {
                            throw new C9456("data bits cannot fit in the QR Code" + c8752.getSize() + " > " + i22);
                        }
                        for (int i23 = 0; i23 < 4 && c8752.getSize() < i22; i23++) {
                            c8752.m22632(z5);
                        }
                        int size3 = c8752.getSize() & 7;
                        if (size3 > 0) {
                            while (size3 < 8) {
                                c8752.m22632(z5);
                                size3++;
                            }
                        }
                        int iM226210 = iM35781 - c8752.m22629();
                        for (int i24 = 0; i24 < iM226210; i24++) {
                            c8752.m22630((i24 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (c8752.getSize() != i22) {
                            throw new C9456("Bits size does not equal capacity");
                        }
                        int iM35782 = c15098M35779.m35781();
                        int iM21363 = c8044M35780.m21363();
                        if (c8752.m22629() != iM35781) {
                            throw new C9456("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(iM21363);
                        int i25 = 0;
                        int i26 = 0;
                        int iMax = 0;
                        int iMax2 = 0;
                        while (i25 < iM21363) {
                            int[] iArr = new int[i8];
                            int[] iArr2 = new int[i8];
                            if (i25 >= iM21363) {
                                throw new C9456("Block ID too large");
                            }
                            int i27 = iM35782 % iM21363;
                            int i28 = iM21363 - i27;
                            int i29 = iM35782 / iM21363;
                            int i30 = iM35781 / iM21363;
                            C15098 c15098 = c15098M35779;
                            int i31 = i30 + 1;
                            EnumC5222 enumC5224 = enumC5222;
                            int i32 = i29 - i30;
                            int i33 = (i29 + 1) - i31;
                            if (i32 != i33) {
                                throw new C9456("EC bytes mismatch");
                            }
                            int i34 = iM35781;
                            if (iM21363 != i28 + i27) {
                                throw new C9456("RS blocks mismatch");
                            }
                            if (iM35782 != C20094.m46314(i31, i33, i27, (i30 + i32) * i28)) {
                                throw new C9456("Total bytes mismatch");
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
                                int i39 = iM21363;
                                for (int i40 = 0; i40 < 8; i40++) {
                                    if (c8752.m22633(i36)) {
                                        i38 = (1 << (7 - i40)) | i38;
                                    }
                                    i36++;
                                }
                                bArr[i37] = (byte) i38;
                                i37++;
                                iM21363 = i39;
                            }
                            int i41 = iM21363;
                            int i42 = iArr2[0];
                            int[] iArr3 = new int[i35 + i42];
                            for (int i43 = 0; i43 < i35; i43++) {
                                iArr3[i43] = bArr[i43] & 255;
                            }
                            new C19334(C3811.f12010).m44550(i42, iArr3);
                            byte[] bArr2 = new byte[i42];
                            for (int i44 = 0; i44 < i42; i44++) {
                                bArr2[i44] = (byte) iArr3[i35 + i44];
                            }
                            arrayList.add(new C21450(bArr, bArr2));
                            iMax = Math.max(iMax, i35);
                            iMax2 = Math.max(iMax2, i42);
                            i26 += iArr[0];
                            i25++;
                            i8 = 1;
                            iM35781 = i34;
                            iM21363 = i41;
                            c15098M35779 = c15098;
                            enumC5222 = enumC5224;
                        }
                        EnumC5222 enumC5225 = enumC5222;
                        C15098 c15099 = c15098M35779;
                        if (iM35781 != i26) {
                            throw new C9456("Data bytes does not match offset");
                        }
                        C8750 c8753 = new C8750();
                        for (int i45 = 0; i45 < iMax; i45++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArrM48585 = ((C21450) it.next()).m48585();
                                if (i45 < bArrM48585.length) {
                                    c8753.m22630(bArrM48585[i45], 8);
                                }
                            }
                        }
                        for (int i46 = 0; i46 < iMax2; i46++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArrM48586 = ((C21450) it2.next()).m48586();
                                if (i46 < bArrM48586.length) {
                                    c8753.m22630(bArrM48586[i46], 8);
                                }
                            }
                        }
                        if (iM35782 != c8753.m22629()) {
                            StringBuilder sbM32308 = C13325.m32308(iM35782, "Interleaving error: ", " and ");
                            sbM32308.append(c8753.m22629());
                            sbM32308.append(" differ.");
                            throw new C9456(sbM32308.toString());
                        }
                        C12277 c12277 = new C12277();
                        EnumC0282 enumC0284 = enumC0282;
                        c12277.m29811(enumC0284);
                        c12277.m29812(enumC5225);
                        c12277.m29813(c15099);
                        int iM35779 = c15099.m35779();
                        C22155 c22155 = new C22155(iM35779, iM35779);
                        int i47 = -1;
                        int i48 = Integer.MAX_VALUE;
                        int i49 = 0;
                        while (i49 < 8) {
                            C12982.m31547(c8753, enumC0284, c15099, i49, c22155);
                            int iM9468 = C3105.m9468(c22155);
                            byte[][] bArrM49772 = c22155.m49772();
                            int iM49774 = c22155.m49774();
                            int iM49773 = c22155.m49773();
                            int i50 = 0;
                            int i51 = 0;
                            while (i50 < iM49773 - 1) {
                                byte[] bArr3 = bArrM49772[i50];
                                int i52 = 0;
                                while (true) {
                                    i7 = iM49773;
                                    if (i52 < iM49774 - 1) {
                                        byte b2 = bArr3[i52];
                                        int i53 = i52 + 1;
                                        int i54 = iM49774;
                                        if (b2 == bArr3[i53]) {
                                            byte[] bArr4 = bArrM49772[i50 + 1];
                                            if (b2 == bArr4[i52] && b2 == bArr4[i53]) {
                                                i51++;
                                            }
                                        }
                                        iM49773 = i7;
                                        i52 = i53;
                                        iM49774 = i54;
                                    }
                                }
                                i50++;
                                iM49773 = i7;
                            }
                            int i55 = (i51 * 3) + iM9468;
                            byte[][] bArrM49773 = c22155.m49772();
                            int iM49775 = c22155.m49774();
                            int iM49776 = c22155.m49773();
                            int i56 = 0;
                            for (int i57 = 0; i57 < iM49776; i57++) {
                                int i58 = 0;
                                while (i58 < iM49775) {
                                    byte[] bArr5 = bArrM49773[i57];
                                    C8750 c8754 = c8753;
                                    int i59 = i58 + 6;
                                    if (i59 < iM49775) {
                                        i2 = iM49775;
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
                                        i2 = iM49775;
                                    }
                                    int i61 = i57 + 6;
                                    if (i61 < iM49776) {
                                        byte b4 = 1;
                                        if (bArrM49773[i57][i58] == 1 && bArrM49773[i57 + 1][i58] == 0 && bArrM49773[i57 + 2][i58] == 1 && bArrM49773[i57 + 3][i58] == 1 && bArrM49773[i57 + 4][i58] == 1 && bArrM49773[i57 + 5][i58] == 0 && bArrM49773[i61][i58] == 1) {
                                            int i62 = i57 - 4;
                                            if (i62 >= 0 && bArrM49773.length >= i57) {
                                                while (true) {
                                                    if (i62 < i57) {
                                                        if (bArrM49773[i62][i58] == b4) {
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
                                            if (i3 < 0 && bArrM49773.length >= i64) {
                                                while (true) {
                                                    if (i3 >= i64) {
                                                        i56++;
                                                        break;
                                                    }
                                                    if (bArrM49773[i3][i58] == 1) {
                                                        break;
                                                    }
                                                    i3++;
                                                }
                                            }
                                        }
                                    }
                                    i58++;
                                    c8753 = c8754;
                                    iM49775 = i2;
                                }
                            }
                            C8750 c8755 = c8753;
                            int i65 = (i56 * 40) + i55;
                            byte[][] bArrM49774 = c22155.m49772();
                            int iM49777 = c22155.m49774();
                            int iM49778 = c22155.m49773();
                            int i66 = 0;
                            for (int i67 = 0; i67 < iM49778; i67++) {
                                byte[] bArr6 = bArrM49774[i67];
                                for (int i68 = 0; i68 < iM49777; i68++) {
                                    if (bArr6[i68] == 1) {
                                        i66++;
                                    }
                                }
                            }
                            int iM49779 = c22155.m49774() * c22155.m49773();
                            int iAbs = (((Math.abs((i66 * 2) - iM49779) * 10) / iM49779) * 10) + i65;
                            if (iAbs < i48) {
                                i48 = iAbs;
                                i47 = i49;
                            }
                            i49++;
                            c8753 = c8755;
                            enumC0284 = enumC0282;
                        }
                        c12277.m29810(i47);
                        C12982.m31547(c8753, enumC0282, c15099, i47, c22155);
                        c12277.m29814(c22155);
                        return c12277;
                    }
                    i20++;
                    z5 = false;
                    enumC0283 = enumC0283;
                    enumC5222 = enumC5222;
                    i8 = 1;
                }
                throw new C9456("Data too big");
            }
            i19++;
            z4 = false;
            enumC0283 = enumC0283;
            enumC5222 = enumC5222;
            i8 = 1;
        }
        throw new C9456("Data too big");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13291(int i, C15098 c15098, EnumC0282 enumC0282) {
        return c15098.m35781() - c15098.m35780(enumC0282).m21364() >= (i + 7) / 8;
    }
}
