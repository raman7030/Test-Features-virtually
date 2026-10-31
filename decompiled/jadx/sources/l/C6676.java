package l;

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
public final class C6676 extends AbstractC17965 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static String[] f20734;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static byte[][] f20735 = {new byte[]{6, 8, 42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String[] f20736;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f20737;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f20738;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f20739;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f20740;

    static {
        String[] strArr = {"nistp256", "nistp384", "nistp521"};
        f20736 = strArr;
        f20734 = (String[]) C22311.stream(strArr).map(new C14436(0)).toArray(new C23609());
        C19356.m44599("-----BEGIN EC PRIVATE KEY-----");
        C19356.m44599("-----END EC PRIVATE KEY-----");
    }

    public C6676(C22529 c22529) {
        this(c22529, null, null, null, null);
    }

    public C6676(C22529 c22529, byte[] bArr) {
        this(c22529, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            Charset charset = StandardCharsets.UTF_8;
            if (C19356.m44591(bArr2, C19356.m44592("nistp384", charset))) {
                this.f20737 = bArr2;
            }
            if (C19356.m44591(bArr2, C19356.m44592("nistp521", charset))) {
                this.f20737 = bArr2;
            }
        }
    }

    public C6676(C22529 c22529, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(c22529);
        this.f20737 = C19356.m44592(f20736[0], StandardCharsets.UTF_8);
        if (bArr != null) {
            this.f20737 = bArr;
        }
        this.f20739 = bArr2;
        this.f20740 = bArr3;
        this.f20738 = bArr4;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m18211() {
        char c;
        byte[] bArr = {1};
        byte[] bArr2 = this.f20739;
        if (bArr2.length >= 64) {
            c = 2;
        } else {
            c = bArr2.length >= 48 ? (char) 1 : (char) 0;
        }
        byte[] bArr3 = f20735[c];
        byte[] bArr4 = this.f20740;
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
        int iM41966 = AbstractC17965.m41966(1) + 3 + AbstractC17965.m41966(this.f20738.length) + this.f20738.length + 1 + AbstractC17965.m41966(bArr3.length) + bArr3.length + 1 + AbstractC17965.m41966(i3) + i3;
        byte[] bArr7 = new byte[AbstractC17965.m41966(iM41966) + 1 + iM41966];
        bArr7[0] = UTF8.S_P3A;
        int iM41967 = AbstractC17965.m41967(AbstractC17965.m41975(1, iM41966, bArr7), bArr7, bArr);
        byte[] bArr8 = this.f20738;
        bArr7[iM41967] = 4;
        int iM41975 = AbstractC17965.m41975(iM41967 + 1, bArr8.length, bArr7);
        System.arraycopy(bArr8, 0, bArr7, iM41975, bArr8.length);
        int length2 = iM41975 + bArr8.length;
        bArr7[length2] = -96;
        int iM41976 = AbstractC17965.m41975(length2 + 1, bArr3.length, bArr7);
        System.arraycopy(bArr3, 0, bArr7, iM41976, bArr3.length);
        int length3 = iM41976 + bArr3.length;
        bArr7[length3] = -95;
        System.arraycopy(bArr6, 0, bArr7, AbstractC17965.m41975(length3 + 1, i3, bArr7), i3);
        return bArr7;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:108:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:33:0x007e, B:35:0x0086, B:37:0x00a5, B:38:0x00ac, B:32:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:66:0x0123, B:68:0x012f, B:69:0x0132, B:71:0x0136, B:72:0x0143, B:74:0x0156, B:75:0x0159, B:77:0x015d, B:78:0x016a, B:79:0x0171, B:81:0x0176, B:83:0x017e, B:84:0x0189, B:85:0x018c, B:87:0x0197, B:88:0x019a, B:90:0x019e, B:91:0x01ab, B:93:0x01c0, B:96:0x01c4, B:98:0x01c6, B:99:0x01cf, B:102:0x01dd, B:104:0x01df), top: B:108:0x0009, inners: #1 }] */
    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7885(byte[] bArr) {
        int i;
        String str;
        byte[] bArrM38257;
        C22529 c22529 = this.f56031;
        try {
            int i2 = this.f56026;
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2 || i2 == 5) {
                C16261 c16261 = new C16261(bArr);
                c16261.m38251(bArr.length);
                try {
                    byte[] bArr2 = c16261.m38239(1, "")[0];
                    this.f20738 = bArr2;
                    if (bArr2.length < 64) {
                        int length = bArr2.length;
                    }
                    return true;
                } catch (C12651 unused) {
                    c22529.getClass();
                    C20413.f65866.getClass();
                    return false;
                }
            }
            String[] strArr = f20736;
            if (i2 == 4) {
                C16261 c16262 = new C16261(bArr);
                if (c16262.m38250() != c16262.m38250()) {
                    throw new C12651("check failed");
                }
                byte[] bArrM38258 = c16262.m38257();
                int length2 = bArrM38258.length;
                Charset charset = StandardCharsets.UTF_8;
                String str2 = new String(bArrM38258, 0, length2, charset);
                if (!Arrays.asList(f20734).contains(str2)) {
                    throw new IllegalArgumentException("unknown key type ".concat(str2));
                }
                byte[] bArrM38259 = c16262.m38257();
                this.f20737 = bArrM38259;
                String strM44588 = C19356.m44588(bArrM38259);
                if (!Arrays.asList(strArr).contains(strM44588)) {
                    throw new IllegalArgumentException("unknown curve name ".concat(strM44588));
                }
                if (!str2.endsWith(strM44588)) {
                    throw new IllegalArgumentException("key type " + str2 + " does not match curve name " + strM44588);
                }
                int iHashCode = strM44588.hashCode();
                if (iHashCode == 537081663) {
                    str = "nistp256";
                } else {
                    if (iHashCode != 537082715) {
                        if (iHashCode == 537084448) {
                            str = "nistp521";
                        }
                        bArrM38257 = c16262.m38257();
                        if (bArrM38257[0] == 4) {
                            throw new IllegalArgumentException("only uncompressed ECPoint supported");
                        }
                        byte[][] bArrM18210 = m18210(bArrM38257);
                        this.f20738 = c16262.m38254();
                        byte[] bArrM382510 = c16262.m38257();
                        this.f56025 = new String(bArrM382510, 0, bArrM382510.length, charset);
                        this.f20739 = bArrM18210[0];
                        this.f20740 = bArrM18210[1];
                        return true;
                    }
                    str = "nistp384";
                }
                strM44588.equals(str);
                bArrM38257 = c16262.m38257();
                if (bArrM38257[0] == 4) {
                    throw new IllegalArgumentException("only uncompressed ECPoint supported");
                }
                byte[][] bArrM18211 = m18210(bArrM38257);
                this.f20738 = c16262.m38254();
                byte[] bArrM382511 = c16262.m38257();
                this.f56025 = new String(bArrM382511, 0, bArrM382511.length, charset);
                this.f20739 = bArrM18211[0];
                this.f20740 = bArrM18211[1];
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
            this.f20738 = bArr3;
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
                byte[][] bArr5 = f20735;
                if (i30 >= 3) {
                    break;
                }
                if (C19356.m44591(bArr5[i30], bArr4)) {
                    this.f20737 = C19356.m44592(strArr[i30], StandardCharsets.UTF_8);
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
            byte[][] bArrM18212 = m18210(bArr6);
            this.f20739 = bArrM18212[0];
            this.f20740 = bArrM18212[1];
            byte[] bArr7 = this.f20738;
            if (bArr7 != null && bArr7.length < 64) {
                int length3 = bArr7.length;
            }
            return true;
        } catch (Exception unused2) {
            c22529.getClass();
            C20413.f65866.getClass();
            return false;
        }
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܿ */
    public final byte[] mo7886() {
        byte[] bArrMo7886 = super.mo7886();
        if (bArrMo7886 != null) {
            return bArrMo7886;
        }
        if (this.f20739 == null) {
            return null;
        }
        byte[] bArrM44592 = C19356.m44592("ecdsa-sha2-".concat(C19356.m44588(this.f20737)), StandardCharsets.UTF_8);
        byte[] bArr = this.f20737;
        byte[] bArr2 = this.f20739;
        byte[][] bArr3 = {bArrM44592, bArr, new byte[bArr2.length + 1 + this.f20740.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.f20740;
        System.arraycopy(bArr5, 0, bArr3[2], this.f20739.length + 1, bArr5.length);
        return C16261.m38232(bArr3).f50016;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo7887() {
        return C19356.m44592("ecdsa-sha2-".concat(C19356.m44588(this.f20737)), StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7884(byte[] bArr) throws Throwable {
        byte[] bArrCopyOf;
        byte[] bArr2 = null;
        try {
            InterfaceC14415 interfaceC14415 = (InterfaceC14415) Class.forName(C20413.m46768("ecdsa-sha2-".concat(C19356.m44588(this.f20737)))).asSubclass(InterfaceC14415.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC14415.init();
            byte[] bArr3 = this.f20738;
            bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
            try {
                try {
                    interfaceC14415.mo25162(bArrCopyOf);
                    interfaceC14415.update(bArr);
                    byte[] bArr4 = C16261.m38232(new byte[][]{C19356.m44592("ecdsa-sha2-".concat(C19356.m44588(this.f20737)), StandardCharsets.UTF_8), interfaceC14415.sign()}).f50016;
                    C19356.m44596(bArrCopyOf);
                    return bArr4;
                } catch (Exception unused) {
                    this.f56031.getClass();
                    C20413.f65866.getClass();
                    C19356.m44596(bArrCopyOf);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bArr2 = bArrCopyOf;
                C19356.m44596(bArr2);
                throw th;
            }
        } catch (Exception unused2) {
            bArrCopyOf = null;
        } catch (Throwable th2) {
            th = th2;
            C19356.m44596(bArr2);
            throw th;
        }
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo7882(String str, byte[] bArr) {
        return mo7884(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m18209(C22529 c22529, C16261 c16261) throws C12651 {
        byte[][] bArrM38239 = c16261.m38239(5, "invalid key format");
        byte[] bArr = bArrM38239[1];
        byte[][] bArrM18210 = m18210(bArrM38239[2]);
        C6676 c6676 = new C6676(c22529, bArr, bArrM18210[0], bArrM18210[1], bArrM38239[3]);
        c6676.f56025 = C19356.m44588(bArrM38239[4]);
        c6676.f56026 = 0;
        return c6676;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static byte[][] m18210(byte[] bArr) {
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

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final void mo11611() {
        C19356.m44596(this.f20738);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7883() throws C12651 {
        if (this.f56030) {
            throw new C12651("key is encrypted.");
        }
        C16261 c16261 = new C16261();
        String strConcat = "ecdsa-sha2-".concat(C19356.m44588(this.f20737));
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256(C19356.m44592(strConcat, charset));
        c16261.m38256(this.f20737);
        byte[] bArr = this.f20739;
        byte[] bArr2 = this.f20740;
        int length = bArr.length + 1 + bArr2.length;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        c16261.m38252(0, length, bArr3);
        c16261.m38256(this.f20738);
        c16261.m38256(C19356.m44592(this.f56025, charset));
        int iM38255 = c16261.m38255();
        byte[] bArr4 = new byte[iM38255];
        c16261.m38236(0, iM38255, bArr4);
        return bArr4;
    }
}
