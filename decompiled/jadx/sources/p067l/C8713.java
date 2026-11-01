package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۜۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8713 extends AbstractC19442 {

    /* JADX INFO: renamed from: ֡ */
    public static String[] f23609;

    /* JADX INFO: renamed from: ֨ */
    public static byte[][] f23610 = {new byte[]{6, 8, 42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};

    /* JADX INFO: renamed from: ۚ */
    public static String[] f23611;

    /* JADX INFO: renamed from: ۖ */
    public byte[] f23612;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f23613;

    /* JADX INFO: renamed from: ᩴ */
    public byte[] f23614;

    /* JADX INFO: renamed from: ᩵ */
    public byte[] f23615;

    static {
        String[] strArr = {"nistp256", "nistp384", "nistp521"};
        f23611 = strArr;
        f23609 = (String[]) C23573.stream(strArr).map(new C16088(0)).toArray(new C24806());
        C20764.m46893("-----BEGIN EC PRIVATE KEY-----");
        C20764.m46893("-----END EC PRIVATE KEY-----");
    }

    public C8713(C23780 c23780) {
        this(c23780, null, null, null, null);
    }

    public C8713(C23780 c23780, byte[] bArr) {
        this(c23780, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            Charset charset = StandardCharsets.UTF_8;
            if (C20764.m46885(bArr2, C20764.m46886("nistp384", charset))) {
                this.f23612 = bArr2;
            }
            if (C20764.m46885(bArr2, C20764.m46886("nistp521", charset))) {
                this.f23612 = bArr2;
            }
        }
    }

    public C8713(C23780 c23780, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(c23780);
        this.f23612 = C20764.m46886(f23611[0], StandardCharsets.UTF_8);
        if (bArr != null) {
            this.f23612 = bArr;
        }
        this.f23614 = bArr2;
        this.f23615 = bArr3;
        this.f23613 = bArr4;
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m20159() {
        char c;
        byte[] bArr = {1};
        byte[] bArr2 = this.f23614;
        if (bArr2.length >= 64) {
            c = 2;
        } else {
            c = bArr2.length >= 48 ? (char) 1 : (char) 0;
        }
        byte[] bArr3 = f23610[c];
        byte[] bArr4 = this.f23615;
        int length = bArr2.length + 1 + bArr4.length;
        byte[] bArr5 = new byte[length];
        bArr5[0] = 4;
        System.arraycopy(bArr2, 0, bArr5, 1, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length + 1, bArr4.length);
        int i = length + 1;
        int i2 = (i & 128) == 0 ? 3 : 4;
        int i3 = length + i2;
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArr5, 0, bArr6, i2, length);
        bArr6[0] = 3;
        if (i2 == 3) {
            bArr6[1] = (byte) i;
        } else {
            bArr6[1] = -127;
            bArr6[2] = (byte) i;
        }
        int iM44215 = AbstractC19442.m44215(1) + 3 + AbstractC19442.m44215(this.f23613.length) + this.f23613.length + 1 + AbstractC19442.m44215(bArr3.length) + bArr3.length + 1 + AbstractC19442.m44215(i3) + i3;
        byte[] bArr7 = new byte[AbstractC19442.m44215(iM44215) + 1 + iM44215];
        bArr7[0] = UTF8.S_P3A;
        int iM44216 = AbstractC19442.m44216(AbstractC19442.m44224(1, iM44215, bArr7), bArr7, bArr);
        byte[] bArr8 = this.f23613;
        bArr7[iM44216] = 4;
        int iM44224 = AbstractC19442.m44224(iM44216 + 1, bArr8.length, bArr7);
        System.arraycopy(bArr8, 0, bArr7, iM44224, bArr8.length);
        int length2 = iM44224 + bArr8.length;
        bArr7[length2] = -96;
        int iM44225 = AbstractC19442.m44224(length2 + 1, bArr3.length, bArr7);
        System.arraycopy(bArr3, 0, bArr7, iM44225, bArr3.length);
        int length3 = iM44225 + bArr3.length;
        bArr7[length3] = -95;
        System.arraycopy(bArr6, 0, bArr7, AbstractC19442.m44224(length3 + 1, i3, bArr7), i3);
        return bArr7;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:108:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:108:0x0009, inners: #1 }] */
    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9933(byte[] bArr) {
        int i;
        String str;
        byte[] bArrM40471;
        C23780 c23780 = this.f59228;
        try {
            int i2 = this.f59223;
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2 || i2 == 5) {
                C17823 c17823 = new C17823(bArr);
                c17823.m40465(bArr.length);
                try {
                    byte[] bArr2 = c17823.m40453(1, "")[0];
                    this.f23613 = bArr2;
                    if (bArr2.length < 64) {
                        int length = bArr2.length;
                    }
                    return true;
                } catch (C14392 unused) {
                    c23780.getClass();
                    C21769.f68542.getClass();
                    return false;
                }
            }
            String[] strArr = f23611;
            if (i2 == 4) {
                C17823 c17824 = new C17823(bArr);
                if (c17824.m40464() != c17824.m40464()) {
                    throw new C14392("check failed");
                }
                byte[] bArrM40472 = c17824.m40471();
                int length2 = bArrM40472.length;
                Charset charset = StandardCharsets.UTF_8;
                String str2 = new String(bArrM40472, 0, length2, charset);
                if (!Arrays.asList(f23609).contains(str2)) {
                    throw new IllegalArgumentException("unknown key type ".concat(str2));
                }
                byte[] bArrM40473 = c17824.m40471();
                this.f23612 = bArrM40473;
                String strM46882 = C20764.m46882(bArrM40473);
                if (!Arrays.asList(strArr).contains(strM46882)) {
                    throw new IllegalArgumentException("unknown curve name ".concat(strM46882));
                }
                if (!str2.endsWith(strM46882)) {
                    throw new IllegalArgumentException("key type " + str2 + " does not match curve name " + strM46882);
                }
                int iHashCode = strM46882.hashCode();
                if (iHashCode == 537081663) {
                    str = "nistp256";
                } else {
                    if (iHashCode != 537082715) {
                        if (iHashCode == 537084448) {
                            str = "nistp521";
                        }
                        bArrM40471 = c17824.m40471();
                        if (bArrM40471[0] == 4) {
                            throw new IllegalArgumentException("only uncompressed ECPoint supported");
                        }
                        byte[][] bArrM20158 = m20158(bArrM40471);
                        this.f23613 = c17824.m40468();
                        byte[] bArrM40474 = c17824.m40471();
                        this.f59222 = new String(bArrM40474, 0, bArrM40474.length, charset);
                        this.f23614 = bArrM20158[0];
                        this.f23615 = bArrM20158[1];
                        return true;
                    }
                    str = "nistp384";
                }
                strM46882.equals(str);
                bArrM40471 = c17824.m40471();
                if (bArrM40471[0] == 4) {
                    throw new IllegalArgumentException("only uncompressed ECPoint supported");
                }
                byte[][] bArrM20159 = m20158(bArrM40471);
                this.f23613 = c17824.m40468();
                byte[] bArrM40475 = c17824.m40471();
                this.f59222 = new String(bArrM40475, 0, bArrM40475.length, charset);
                this.f23614 = bArrM20159[0];
                this.f23615 = bArrM20159[1];
                return true;
            }
            if (bArr[0] != 48) {
                return false;
            }
            byte b = bArr[1];
            if ((b & GCMSIVBlockCipher.MASK) != 0) {
                int i3 = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                i = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    int i5 = i + 1;
                    byte b2 = bArr[i];
                    i = i5;
                    i3 = i4;
                }
            } else {
                i = 2;
            }
            if (bArr[i] != 2) {
                return false;
            }
            int i6 = i + 1;
            int i7 = i + 2;
            int i8 = bArr[i6];
            int i9 = i8 & 255;
            if ((i8 & 128) != 0) {
                int i10 = i8 & 127;
                i9 = 0;
                while (true) {
                    int i11 = i10 - 1;
                    if (i10 <= 0) {
                        break;
                    }
                    int i12 = (i9 << 8) + (bArr[i7] & 255);
                    i7++;
                    i9 = i12;
                    i10 = i11;
                }
            }
            int i13 = i7 + i9;
            int i14 = i13 + 1;
            int i15 = i13 + 2;
            int i16 = bArr[i14];
            int i17 = i16 & 255;
            if ((i16 & 128) != 0) {
                int i18 = i16 & 127;
                i17 = 0;
                while (true) {
                    int i19 = i18 - 1;
                    if (i18 <= 0) {
                        break;
                    }
                    int i20 = (i17 << 8) + (bArr[i15] & 255);
                    i15++;
                    i17 = i20;
                    i18 = i19;
                }
            }
            byte[] bArr3 = new byte[i17];
            this.f23613 = bArr3;
            System.arraycopy(bArr, i15, bArr3, 0, i17);
            int i21 = i15 + i17;
            int i22 = i21 + 1;
            int i23 = i21 + 2;
            int i24 = bArr[i22];
            int i25 = i24 & 255;
            if ((i24 & 128) != 0) {
                int i26 = i24 & 127;
                i25 = 0;
                while (true) {
                    int i27 = i26 - 1;
                    if (i26 <= 0) {
                        break;
                    }
                    int i28 = (i25 << 8) + (bArr[i23] & 255);
                    i23++;
                    i25 = i28;
                    i26 = i27;
                }
            }
            byte[] bArr4 = new byte[i25];
            System.arraycopy(bArr, i23, bArr4, 0, i25);
            int i29 = i23 + i25;
            int i30 = 0;
            while (true) {
                byte[][] bArr5 = f23610;
                if (i30 >= 3) {
                    break;
                }
                if (C20764.m46885(bArr5[i30], bArr4)) {
                    this.f23612 = C20764.m46886(strArr[i30], StandardCharsets.UTF_8);
                    break;
                }
                i30++;
            }
            int i31 = i29 + 1;
            int i32 = i29 + 2;
            int i33 = bArr[i31];
            int i34 = i33 & 255;
            if ((i33 & 128) != 0) {
                int i35 = i33 & 127;
                i34 = 0;
                while (true) {
                    int i36 = i35 - 1;
                    if (i35 <= 0) {
                        break;
                    }
                    int i37 = (i34 << 8) + (bArr[i32] & 255);
                    i32++;
                    i34 = i37;
                    i35 = i36;
                }
            }
            byte[] bArr6 = new byte[i34];
            System.arraycopy(bArr, i32, bArr6, 0, i34);
            byte[][] bArrM201510 = m20158(bArr6);
            this.f23614 = bArrM201510[0];
            this.f23615 = bArrM201510[1];
            byte[] bArr7 = this.f23613;
            if (bArr7 != null && bArr7.length < 64) {
                int length3 = bArr7.length;
            }
            return true;
        } catch (Exception unused2) {
            c23780.getClass();
            C21769.f68542.getClass();
            return false;
        }
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܿ */
    public final byte[] mo9934() {
        byte[] bArrMo9934 = super.mo9934();
        if (bArrMo9934 != null) {
            return bArrMo9934;
        }
        if (this.f23614 == null) {
            return null;
        }
        byte[] bArrM46886 = C20764.m46886("ecdsa-sha2-".concat(C20764.m46882(this.f23612)), StandardCharsets.UTF_8);
        byte[] bArr = this.f23612;
        byte[] bArr2 = this.f23614;
        byte[][] bArr3 = {bArrM46886, bArr, new byte[bArr2.length + 1 + this.f23615.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.f23615;
        System.arraycopy(bArr5, 0, bArr3[2], this.f23614.length + 1, bArr5.length);
        return C17823.m40446(bArr3).f53185;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo9935() {
        return C20764.m46886("ecdsa-sha2-".concat(C20764.m46882(this.f23612)), StandardCharsets.UTF_8);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9932(byte[] bArr) throws Throwable {
        byte[] bArrCopyOf;
        byte[] bArr2 = null;
        try {
            InterfaceC16068 interfaceC16068 = (InterfaceC16068) Class.forName(C21769.m49091("ecdsa-sha2-".concat(C20764.m46882(this.f23612)))).asSubclass(InterfaceC16068.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC16068.init();
            byte[] bArr3 = this.f23613;
            bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
            try {
                try {
                    interfaceC16068.mo27179(bArrCopyOf);
                    interfaceC16068.update(bArr);
                    byte[] bArr4 = C17823.m40446(new byte[][]{C20764.m46886("ecdsa-sha2-".concat(C20764.m46882(this.f23612)), StandardCharsets.UTF_8), interfaceC16068.sign()}).f53185;
                    C20764.m46890(bArrCopyOf);
                    return bArr4;
                } catch (Exception unused) {
                    this.f59228.getClass();
                    C21769.f68542.getClass();
                    C20764.m46890(bArrCopyOf);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bArr2 = bArrCopyOf;
                C20764.m46890(bArr2);
                throw th;
            }
        } catch (Exception unused2) {
            bArrCopyOf = null;
        } catch (Throwable th2) {
            th = th2;
            C20764.m46890(bArr2);
            throw th;
        }
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo9930(String str, byte[] bArr) {
        return mo9932(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m20157(C23780 c23780, C17823 c17823) throws C14392 {
        byte[][] bArrM40453 = c17823.m40453(5, "invalid key format");
        byte[] bArr = bArrM40453[1];
        byte[][] bArrM20158 = m20158(bArrM40453[2]);
        C8713 c8713 = new C8713(c23780, bArr, bArrM20158[0], bArrM20158[1], bArrM40453[3]);
        c8713.f59222 = C20764.m46882(bArrM40453[4]);
        c8713.f59223 = 0;
        return c8713;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static byte[][] m20158(byte[] bArr) {
        int i = 0;
        while (bArr[i] != 4) {
            i++;
        }
        int i2 = i + 1;
        int length = (bArr.length - i2) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - i2) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        System.arraycopy(bArr, i2 + length, bArr3, 0, length2);
        return new byte[][]{bArr2, bArr3};
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final void mo13547() {
        C20764.m46890(this.f23613);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9931() throws C14392 {
        if (this.f59227) {
            throw new C14392("key is encrypted.");
        }
        C17823 c17823 = new C17823();
        String strConcat = "ecdsa-sha2-".concat(C20764.m46882(this.f23612));
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470(C20764.m46886(strConcat, charset));
        c17823.m40470(this.f23612);
        byte[] bArr = this.f23614;
        byte[] bArr2 = this.f23615;
        int length = bArr.length + 1 + bArr2.length;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        c17823.m40466(0, length, bArr3);
        c17823.m40470(this.f23613);
        c17823.m40470(C20764.m46886(this.f59222, charset));
        int iM40469 = c17823.m40469();
        byte[] bArr4 = new byte[iM40469];
        c17823.m40450(0, iM40469, bArr4);
        return bArr4;
    }
}
