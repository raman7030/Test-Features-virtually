package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܿۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7YM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18771 extends AbstractC19442 {

    /* JADX INFO: renamed from: ۚ */
    public static final byte[] f56088;

    /* JADX INFO: renamed from: ֡ */
    public byte[] f56089;

    /* JADX INFO: renamed from: ۖ */
    public byte[] f56090;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f56091;

    /* JADX INFO: renamed from: ᩴ */
    public byte[] f56092;

    /* JADX INFO: renamed from: ᩵ */
    public byte[] f56093;

    public C18771(C23780 c23780) {
        this(c23780, null, null, null, null, null);
    }

    public C18771(C23780 c23780, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(c23780);
        this.f56091 = bArr;
        this.f56092 = bArr2;
        this.f56090 = bArr3;
        this.f56089 = bArr4;
        this.f56093 = bArr5;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C20764.m46893("-----BEGIN DSA PRIVATE KEY-----");
        C20764.m46893("-----END DSA PRIVATE KEY-----");
        f56088 = OpenSSHPublicKeyUtil.DSS.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m42804() {
        int iM44215 = AbstractC19442.m44215(1) + 3 + AbstractC19442.m44215(this.f56091.length) + this.f56091.length + 1 + AbstractC19442.m44215(this.f56092.length) + this.f56092.length + 1 + AbstractC19442.m44215(this.f56090.length) + this.f56090.length + 1 + AbstractC19442.m44215(this.f56089.length) + this.f56089.length + 1 + AbstractC19442.m44215(this.f56093.length) + this.f56093.length;
        byte[] bArr = new byte[AbstractC19442.m44215(iM44215) + 1 + iM44215];
        bArr[0] = UTF8.S_P3A;
        AbstractC19442.m44216(AbstractC19442.m44216(AbstractC19442.m44216(AbstractC19442.m44216(AbstractC19442.m44216(AbstractC19442.m44216(AbstractC19442.m44224(1, iM44215, bArr), bArr, new byte[1]), bArr, this.f56091), bArr, this.f56092), bArr, this.f56090), bArr, this.f56089), bArr, this.f56093);
        return bArr;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9933(byte[] bArr) {
        int i;
        C23780 c23780 = this.f59228;
        try {
            int i2 = this.f59223;
            if (i2 == 1) {
                if (bArr[0] == 48) {
                    return false;
                }
                C17823 c17823 = new C17823(bArr);
                c17823.m40464();
                this.f56091 = c17823.m40462();
                this.f56090 = c17823.m40462();
                this.f56092 = c17823.m40462();
                this.f56089 = c17823.m40462();
                this.f56093 = c17823.m40462();
                if (this.f56091 != null) {
                    new BigInteger(this.f56091).bitLength();
                }
                return true;
            }
            if (i2 != 2 && i2 != 5) {
                if (i2 == 4) {
                    C17823 c17824 = new C17823(bArr);
                    if (c17824.m40464() != c17824.m40464()) {
                        throw new C14392("check failed");
                    }
                    C20764.m46882(c17824.m40471());
                    this.f56091 = c17824.m40468();
                    this.f56092 = c17824.m40468();
                    this.f56090 = c17824.m40468();
                    this.f56089 = c17824.m40468();
                    this.f56093 = c17824.m40468();
                    byte[] bArrM40471 = c17824.m40471();
                    this.f59222 = new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                    new BigInteger(this.f56091).bitLength();
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
                this.f56091 = bArr2;
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
                this.f56092 = bArr3;
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
                this.f56090 = bArr4;
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
                this.f56089 = bArr5;
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
                this.f56093 = bArr6;
                System.arraycopy(bArr, i47, bArr6, 0, i49);
                if (this.f56091 != null) {
                    new BigInteger(this.f56091).bitLength();
                }
                return true;
            }
            C17823 c17825 = new C17823(bArr);
            c17825.m40465(bArr.length);
            try {
                this.f56093 = c17825.m40453(1, "")[0];
                return true;
            } catch (C14392 unused) {
                c23780.getClass();
                C21769.f68542.getClass();
                return false;
            }
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
        byte[] bArr = this.f56091;
        if (bArr == null) {
            return null;
        }
        return C17823.m40446(new byte[][]{f56088, bArr, this.f56092, this.f56090, this.f56089}).f53185;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo9935() {
        return f56088;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9932(byte[] bArr) {
        try {
            InterfaceC18751 interfaceC18751 = (InterfaceC18751) Class.forName(C21769.m49091("signature.dss")).asSubclass(InterfaceC18751.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC18751.init();
            interfaceC18751.mo14917(this.f56093, this.f56091, this.f56092, this.f56090);
            interfaceC18751.update(bArr);
            return C17823.m40446(new byte[][]{f56088, interfaceC18751.sign()}).f53185;
        } catch (Exception unused) {
            this.f59228.getClass();
            C21769.f68542.getClass();
            return null;
        }
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo9930(String str, byte[] bArr) {
        return mo9932(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m42803(C23780 c23780, C17823 c17823) throws C14392 {
        byte[][] bArrM40453 = c17823.m40453(7, "invalid key format");
        C18771 c18771 = new C18771(c23780, bArrM40453[1], bArrM40453[2], bArrM40453[3], bArrM40453[4], bArrM40453[5]);
        c18771.f59222 = C20764.m46882(bArrM40453[6]);
        c18771.f59223 = 0;
        return c18771;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final void mo13547() {
        C20764.m46890(this.f56093);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9931() throws C14392 {
        if (this.f59227) {
            throw new C14392("key is encrypted.");
        }
        C17823 c17823 = new C17823();
        c17823.m40470(f56088);
        c17823.m40470(this.f56091);
        c17823.m40470(this.f56092);
        c17823.m40470(this.f56090);
        c17823.m40470(this.f56089);
        c17823.m40470(this.f56093);
        c17823.m40470(C20764.m46886(this.f59222, StandardCharsets.UTF_8));
        int iM40469 = c17823.m40469();
        byte[] bArr = new byte[iM40469];
        c17823.m40450(0, iM40469, bArr);
        return bArr;
    }
}
