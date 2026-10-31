package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܿۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7YM */
/* JADX INFO: loaded from: classes5.dex */
public final class C17259 extends AbstractC17965 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f52906;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f52907;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f52908;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f52909;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f52910;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f52911;

    public C17259(C22529 c22529) {
        this(c22529, null, null, null, null, null);
    }

    public C17259(C22529 c22529, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(c22529);
        this.f52909 = bArr;
        this.f52910 = bArr2;
        this.f52908 = bArr3;
        this.f52907 = bArr4;
        this.f52911 = bArr5;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C19356.m44599("-----BEGIN DSA PRIVATE KEY-----");
        C19356.m44599("-----END DSA PRIVATE KEY-----");
        f52906 = OpenSSHPublicKeyUtil.DSS.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m40555() {
        int iM41966 = AbstractC17965.m41966(1) + 3 + AbstractC17965.m41966(this.f52909.length) + this.f52909.length + 1 + AbstractC17965.m41966(this.f52910.length) + this.f52910.length + 1 + AbstractC17965.m41966(this.f52908.length) + this.f52908.length + 1 + AbstractC17965.m41966(this.f52907.length) + this.f52907.length + 1 + AbstractC17965.m41966(this.f52911.length) + this.f52911.length;
        byte[] bArr = new byte[AbstractC17965.m41966(iM41966) + 1 + iM41966];
        bArr[0] = UTF8.S_P3A;
        AbstractC17965.m41967(AbstractC17965.m41967(AbstractC17965.m41967(AbstractC17965.m41967(AbstractC17965.m41967(AbstractC17965.m41967(AbstractC17965.m41975(1, iM41966, bArr), bArr, new byte[1]), bArr, this.f52909), bArr, this.f52910), bArr, this.f52908), bArr, this.f52907), bArr, this.f52911);
        return bArr;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7885(byte[] bArr) {
        int i;
        C22529 c22529 = this.f56031;
        try {
            int i2 = this.f56026;
            if (i2 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                C16261 c16261 = new C16261(bArr);
                c16261.m38250();
                this.f52909 = c16261.m38248();
                this.f52908 = c16261.m38248();
                this.f52910 = c16261.m38248();
                this.f52907 = c16261.m38248();
                this.f52911 = c16261.m38248();
                if (this.f52909 != null) {
                    new BigInteger(this.f52909).bitLength();
                }
                return true;
            }
            if (i2 != 2 && i2 != 5) {
                if (i2 == 4) {
                    C16261 c16262 = new C16261(bArr);
                    if (c16262.m38250() != c16262.m38250()) {
                        throw new C12651("check failed");
                    }
                    C19356.m44588(c16262.m38257());
                    this.f52909 = c16262.m38254();
                    this.f52910 = c16262.m38254();
                    this.f52908 = c16262.m38254();
                    this.f52907 = c16262.m38254();
                    this.f52911 = c16262.m38254();
                    byte[] bArrM38257 = c16262.m38257();
                    this.f56025 = new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                    new BigInteger(this.f52909).bitLength();
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
                byte[] bArr2 = new byte[i17];
                this.f52909 = bArr2;
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
                this.f52910 = bArr3;
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
                this.f52908 = bArr4;
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
                this.f52907 = bArr5;
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
                this.f52911 = bArr6;
                System.arraycopy(bArr, i47, bArr6, 0, i49);
                if (this.f52909 != null) {
                    new BigInteger(this.f52909).bitLength();
                }
                return true;
            }
            C16261 c16263 = new C16261(bArr);
            c16263.m38251(bArr.length);
            try {
                this.f52911 = c16263.m38239(1, "")[0];
                return true;
            } catch (C12651 unused) {
                c22529.getClass();
                C20413.f65866.getClass();
                return false;
            }
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
        byte[] bArr = this.f52909;
        if (bArr == null) {
            return null;
        }
        return C16261.m38232(new byte[][]{f52906, bArr, this.f52910, this.f52908, this.f52907}).f50016;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo7887() {
        return f52906;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7884(byte[] bArr) {
        try {
            InterfaceC17238 interfaceC17238 = (InterfaceC17238) Class.forName(C20413.m46768("signature.dss")).asSubclass(InterfaceC17238.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC17238.init();
            interfaceC17238.mo13053(this.f52911, this.f52909, this.f52910, this.f52908);
            interfaceC17238.update(bArr);
            return C16261.m38232(new byte[][]{f52906, interfaceC17238.sign()}).f50016;
        } catch (Exception unused) {
            this.f56031.getClass();
            C20413.f65866.getClass();
            return null;
        }
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo7882(String str, byte[] bArr) {
        return mo7884(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m40554(C22529 c22529, C16261 c16261) throws C12651 {
        byte[][] bArrM38239 = c16261.m38239(7, "invalid key format");
        C17259 c17259 = new C17259(c22529, bArrM38239[1], bArrM38239[2], bArrM38239[3], bArrM38239[4], bArrM38239[5]);
        c17259.f56025 = C19356.m44588(bArrM38239[6]);
        c17259.f56026 = 0;
        return c17259;
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ֫ */
    public final void mo11611() {
        C19356.m44596(this.f52911);
    }

    @Override // l.AbstractC17965
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo7883() throws C12651 {
        if (this.f56030) {
            throw new C12651("key is encrypted.");
        }
        C16261 c16261 = new C16261();
        c16261.m38256(f52906);
        c16261.m38256(this.f52909);
        c16261.m38256(this.f52910);
        c16261.m38256(this.f52908);
        c16261.m38256(this.f52907);
        c16261.m38256(this.f52911);
        c16261.m38256(C19356.m44592(this.f56025, StandardCharsets.UTF_8));
        int iM38255 = c16261.m38255();
        byte[] bArr = new byte[iM38255];
        c16261.m38236(0, iM38255, bArr);
        return bArr;
    }
}
