package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۘۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3854 extends AbstractC17965 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final byte[] f12297;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f12298;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f12299;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f12300;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f12301;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f12302;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f12303;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f12304;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f12305;

    public C3854(C22529 c22529) {
        this(c22529, null, null, null);
    }

    public C3854(C22529 c22529, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(c22529);
        this.f12305 = bArr;
        this.f12299 = bArr2;
        this.f12302 = bArr3;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C19356.m44599("-----BEGIN RSA PRIVATE KEY-----");
        C19356.m44599("-----END RSA PRIVATE KEY-----");
        f12297 = OpenSSHPublicKeyUtil.RSA.getBytes(StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7885(byte[] bArr) {
        int i;
        C22529 c22529 = this.f56031;
        try {
            int i2 = this.f56026;
            if (i2 == 2 || i2 == 5) {
                C16261 c16261 = new C16261(bArr);
                c16261.m38251(bArr.length);
                try {
                    byte[][] bArrM38239 = c16261.m38239(4, "");
                    this.f12302 = bArrM38239[0];
                    this.f12298 = bArrM38239[1];
                    this.f12303 = bArrM38239[2];
                    this.f12300 = bArrM38239[3];
                    m11610();
                    m11608();
                    return true;
                } catch (C12651 unused) {
                    c22529.getClass();
                    C20413.f65866.getClass();
                }
            } else {
                if (i2 == 1) {
                    if (bArr[0] != 48) {
                        C16261 c16262 = new C16261(bArr);
                        this.f12299 = c16262.m38248();
                        this.f12302 = c16262.m38248();
                        this.f12305 = c16262.m38248();
                        c16262.m38248();
                        this.f12298 = c16262.m38248();
                        this.f12303 = c16262.m38248();
                        if (this.f12305 != null) {
                            new BigInteger(this.f12305).bitLength();
                        }
                        m11610();
                        m11608();
                        m11609();
                        return true;
                    }
                    c22529.getClass();
                    C20413.f65866.getClass();
                    return false;
                }
                if (i2 == 4) {
                    C16261 c16263 = new C16261(bArr);
                    if (c16263.m38250() != c16263.m38250()) {
                        throw new C12651("check failed");
                    }
                    C19356.m44588(c16263.m38257());
                    this.f12305 = c16263.m38254();
                    this.f12299 = c16263.m38254();
                    this.f12302 = c16263.m38254();
                    this.f12300 = c16263.m38254();
                    this.f12298 = c16263.m38254();
                    this.f12303 = c16263.m38254();
                    new BigInteger(this.f12305).bitLength();
                    byte[] bArrM38257 = c16263.m38257();
                    this.f56025 = new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                    m11610();
                    m11608();
                    return true;
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
                if (bArr[i] == 2) {
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
                    byte[] bArr2 = new byte[i17];
                    this.f12305 = bArr2;
                    System.arraycopy(bArr, i15, bArr2, 0, i17);
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
                    byte[] bArr3 = new byte[i25];
                    this.f12299 = bArr3;
                    System.arraycopy(bArr, i23, bArr3, 0, i25);
                    int i29 = i23 + i25;
                    int i30 = i29 + 1;
                    int i31 = i29 + 2;
                    int i32 = bArr[i30];
                    int i33 = i32 & 255;
                    if ((i32 & 128) != 0) {
                        int i34 = i32 & 127;
                        i33 = 0;
                        while (true) {
                            int i35 = i34 - 1;
                            if (i34 <= 0) {
                                break;
                            }
                            int i36 = (i33 << 8) + (bArr[i31] & 255);
                            i31++;
                            i33 = i36;
                            i34 = i35;
                        }
                    }
                    byte[] bArr4 = new byte[i33];
                    this.f12302 = bArr4;
                    System.arraycopy(bArr, i31, bArr4, 0, i33);
                    int i37 = i31 + i33;
                    int i38 = i37 + 1;
                    int i39 = i37 + 2;
                    int i40 = bArr[i38];
                    int i41 = i40 & 255;
                    if ((i40 & 128) != 0) {
                        int i42 = i40 & 127;
                        i41 = 0;
                        while (true) {
                            int i43 = i42 - 1;
                            if (i42 <= 0) {
                                break;
                            }
                            int i44 = (i41 << 8) + (bArr[i39] & 255);
                            i39++;
                            i41 = i44;
                            i42 = i43;
                        }
                    }
                    byte[] bArr5 = new byte[i41];
                    this.f12298 = bArr5;
                    System.arraycopy(bArr, i39, bArr5, 0, i41);
                    int i45 = i39 + i41;
                    int i46 = i45 + 1;
                    int i47 = i45 + 2;
                    int i48 = bArr[i46];
                    int i49 = i48 & 255;
                    if ((i48 & 128) != 0) {
                        int i50 = i48 & 127;
                        i49 = 0;
                        while (true) {
                            int i51 = i50 - 1;
                            if (i50 <= 0) {
                                break;
                            }
                            int i52 = (i49 << 8) + (bArr[i47] & 255);
                            i47++;
                            i49 = i52;
                            i50 = i51;
                        }
                    }
                    byte[] bArr6 = new byte[i49];
                    this.f12303 = bArr6;
                    System.arraycopy(bArr, i47, bArr6, 0, i49);
                    int i53 = i47 + i49;
                    int i54 = i53 + 1;
                    int i55 = i53 + 2;
                    int i56 = bArr[i54];
                    int i57 = i56 & 255;
                    if ((i56 & 128) != 0) {
                        int i58 = i56 & 127;
                        i57 = 0;
                        while (true) {
                            int i59 = i58 - 1;
                            if (i58 <= 0) {
                                break;
                            }
                            int i60 = (i57 << 8) + (bArr[i55] & 255);
                            i55++;
                            i57 = i60;
                            i58 = i59;
                        }
                    }
                    byte[] bArr7 = new byte[i57];
                    this.f12301 = bArr7;
                    System.arraycopy(bArr, i55, bArr7, 0, i57);
                    int i61 = i55 + i57;
                    int i62 = i61 + 1;
                    int i63 = i61 + 2;
                    int i64 = bArr[i62];
                    int i65 = i64 & 255;
                    if ((i64 & 128) != 0) {
                        int i66 = i64 & 127;
                        i65 = 0;
                        while (true) {
                            int i67 = i66 - 1;
                            if (i66 <= 0) {
                                break;
                            }
                            int i68 = (i65 << 8) + (bArr[i63] & 255);
                            i63++;
                            i65 = i68;
                            i66 = i67;
                        }
                    }
                    byte[] bArr8 = new byte[i65];
                    this.f12304 = bArr8;
                    System.arraycopy(bArr, i63, bArr8, 0, i65);
                    int i69 = i63 + i65;
                    int i70 = i69 + 1;
                    int i71 = i69 + 2;
                    int i72 = bArr[i70];
                    int i73 = i72 & 255;
                    if ((i72 & 128) != 0) {
                        int i74 = i72 & 127;
                        i73 = 0;
                        while (true) {
                            int i75 = i74 - 1;
                            if (i74 <= 0) {
                                break;
                            }
                            int i76 = (i73 << 8) + (bArr[i71] & 255);
                            i71++;
                            i73 = i76;
                            i74 = i75;
                        }
                    }
                    byte[] bArr9 = new byte[i73];
                    this.f12300 = bArr9;
                    System.arraycopy(bArr, i71, bArr9, 0, i73);
                    if (this.f12305 != null) {
                        new BigInteger(this.f12305).bitLength();
                    }
                    return true;
                }
            }
            return false;
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
        byte[] bArr = this.f12299;
        if (bArr == null) {
            return null;
        }
        return C16261.m38232(new byte[][]{f12297, bArr, this.f12305}).f50016;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo7887() {
        return f12297;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7884(byte[] bArr) {
        return mo7882(OpenSSHPublicKeyUtil.RSA, bArr);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo7882(String str, byte[] bArr) {
        try {
            InterfaceC6655 interfaceC6655 = (InterfaceC6655) Class.forName(C20413.m46768(str)).asSubclass(InterfaceC6655.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC6655.init();
            interfaceC6655.mo18182(this.f12302, this.f12305);
            interfaceC6655.update(bArr);
            return C16261.m38232(new byte[][]{str.getBytes(StandardCharsets.UTF_8), interfaceC6655.sign()}).f50016;
        } catch (Exception unused) {
            this.f56031.getClass();
            C20413.f65866.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m11607(C22529 c22529, C16261 c16261) throws C12651 {
        byte[][] bArrM38239 = c16261.m38239(8, "invalid key format");
        C3854 c3854 = new C3854(c22529, bArrM38239[1], bArrM38239[2], bArrM38239[3]);
        c3854.f12300 = bArrM38239[4];
        c3854.f12298 = bArrM38239[5];
        c3854.f12303 = bArrM38239[6];
        c3854.f56025 = C19356.m44588(bArrM38239[7]);
        c3854.f56026 = 0;
        return c3854;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m11610() {
        if (this.f12301 == null) {
            this.f12301 = new BigInteger(this.f12302).mod(new BigInteger(this.f12298).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m11608() {
        if (this.f12304 == null) {
            this.f12304 = new BigInteger(this.f12302).mod(new BigInteger(this.f12303).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte[] m11609() {
        if (this.f12300 == null) {
            this.f12300 = new BigInteger(this.f12303).modInverse(new BigInteger(this.f12298)).toByteArray();
        }
        return this.f12300;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11611() {
        C19356.m44596(this.f12302);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7883() throws C12651 {
        if (this.f56030) {
            throw new C12651("key is encrypted.");
        }
        C16261 c16261 = new C16261();
        c16261.m38256(f12297);
        c16261.m38256(this.f12305);
        c16261.m38256(this.f12299);
        c16261.m38256(this.f12302);
        c16261.m38256(m11609());
        c16261.m38256(this.f12298);
        c16261.m38256(this.f12303);
        c16261.m38256(C19356.m44592(this.f56025, StandardCharsets.UTF_8));
        int iM38255 = c16261.m38255();
        byte[] bArr = new byte[iM38255];
        c16261.m38236(0, iM38255, bArr);
        return bArr;
    }
}
