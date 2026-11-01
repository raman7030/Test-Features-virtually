package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۘۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6031 extends AbstractC19442 {

    /* JADX INFO: renamed from: ܶ */
    public static final byte[] f15104;

    /* JADX INFO: renamed from: ֡ */
    public byte[] f15105;

    /* JADX INFO: renamed from: ֨ */
    public byte[] f15106;

    /* JADX INFO: renamed from: ۖ */
    public byte[] f15107;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f15108;

    /* JADX INFO: renamed from: ۚ */
    public byte[] f15109;

    /* JADX INFO: renamed from: ۠ */
    public byte[] f15110;

    /* JADX INFO: renamed from: ᩴ */
    public byte[] f15111;

    /* JADX INFO: renamed from: ᩵ */
    public byte[] f15112;

    public C6031(C23780 c23780) {
        this(c23780, null, null, null);
    }

    public C6031(C23780 c23780, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(c23780);
        this.f15112 = bArr;
        this.f15106 = bArr2;
        this.f15109 = bArr3;
        if (bArr != null) {
            new BigInteger(bArr).bitLength();
        }
    }

    static {
        C20764.m46893("-----BEGIN RSA PRIVATE KEY-----");
        C20764.m46893("-----END RSA PRIVATE KEY-----");
        f15104 = OpenSSHPublicKeyUtil.RSA.getBytes(StandardCharsets.UTF_8);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9933(byte[] bArr) {
        int i;
        C23780 c23780 = this.f59228;
        try {
            int i2 = this.f59223;
            if (i2 == 2 || i2 == 5) {
                C17823 c17823 = new C17823(bArr);
                c17823.m40465(bArr.length);
                try {
                    byte[][] bArrM40453 = c17823.m40453(4, "");
                    this.f15109 = bArrM40453[0];
                    this.f15105 = bArrM40453[1];
                    this.f15110 = bArrM40453[2];
                    this.f15107 = bArrM40453[3];
                    m13546();
                    m13544();
                    return true;
                } catch (C14392 unused) {
                    c23780.getClass();
                    C21769.f68542.getClass();
                }
            } else {
                if (i2 == 1) {
                    if (bArr[0] != 48) {
                        C17823 c17824 = new C17823(bArr);
                        this.f15106 = c17824.m40462();
                        this.f15109 = c17824.m40462();
                        this.f15112 = c17824.m40462();
                        c17824.m40462();
                        this.f15105 = c17824.m40462();
                        this.f15110 = c17824.m40462();
                        if (this.f15112 != null) {
                            new BigInteger(this.f15112).bitLength();
                        }
                        m13546();
                        m13544();
                        m13545();
                        return true;
                    }
                    c23780.getClass();
                    C21769.f68542.getClass();
                    return false;
                }
                if (i2 == 4) {
                    C17823 c17825 = new C17823(bArr);
                    if (c17825.m40464() != c17825.m40464()) {
                        throw new C14392("check failed");
                    }
                    C20764.m46882(c17825.m40471());
                    this.f15112 = c17825.m40468();
                    this.f15106 = c17825.m40468();
                    this.f15109 = c17825.m40468();
                    this.f15107 = c17825.m40468();
                    this.f15105 = c17825.m40468();
                    this.f15110 = c17825.m40468();
                    new BigInteger(this.f15112).bitLength();
                    byte[] bArrM40471 = c17825.m40471();
                    this.f59222 = new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                    m13546();
                    m13544();
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
                    this.f15112 = bArr2;
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
                    this.f15106 = bArr3;
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
                    this.f15109 = bArr4;
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
                    this.f15105 = bArr5;
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
                    this.f15110 = bArr6;
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
                    this.f15108 = bArr7;
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
                    this.f15111 = bArr8;
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
                    this.f15107 = bArr9;
                    System.arraycopy(bArr, i71, bArr9, 0, i73);
                    if (this.f15112 != null) {
                        new BigInteger(this.f15112).bitLength();
                    }
                    return true;
                }
            }
            return false;
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
        byte[] bArr = this.f15106;
        if (bArr == null) {
            return null;
        }
        return C17823.m40446(new byte[][]{f15104, bArr, this.f15112}).f53185;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo9935() {
        return f15104;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9932(byte[] bArr) {
        return mo9930(OpenSSHPublicKeyUtil.RSA, bArr);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo9930(String str, byte[] bArr) {
        try {
            InterfaceC8693 interfaceC8693 = (InterfaceC8693) Class.forName(C21769.m49091(str)).asSubclass(InterfaceC8693.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC8693.init();
            interfaceC8693.mo20130(this.f15109, this.f15112);
            interfaceC8693.update(bArr);
            return C17823.m40446(new byte[][]{str.getBytes(StandardCharsets.UTF_8), interfaceC8693.sign()}).f53185;
        } catch (Exception unused) {
            this.f59228.getClass();
            C21769.f68542.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC19442 m13543(C23780 c23780, C17823 c17823) throws C14392 {
        byte[][] bArrM40453 = c17823.m40453(8, "invalid key format");
        C6031 c6031 = new C6031(c23780, bArrM40453[1], bArrM40453[2], bArrM40453[3]);
        c6031.f15107 = bArrM40453[4];
        c6031.f15105 = bArrM40453[5];
        c6031.f15110 = bArrM40453[6];
        c6031.f59222 = C20764.m46882(bArrM40453[7]);
        c6031.f59223 = 0;
        return c6031;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m13546() {
        if (this.f15108 == null) {
            this.f15108 = new BigInteger(this.f15109).mod(new BigInteger(this.f15105).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m13544() {
        if (this.f15111 == null) {
            this.f15111 = new BigInteger(this.f15109).mod(new BigInteger(this.f15110).subtract(BigInteger.ONE)).toByteArray();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private byte[] m13545() {
        if (this.f15107 == null) {
            this.f15107 = new BigInteger(this.f15110).modInverse(new BigInteger(this.f15105)).toByteArray();
        }
        return this.f15107;
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ֫ */
    public final void mo13547() {
        C20764.m46890(this.f15109);
    }

    @Override // p067l.AbstractC19442
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo9931() throws C14392 {
        if (this.f59227) {
            throw new C14392("key is encrypted.");
        }
        C17823 c17823 = new C17823();
        c17823.m40470(f15104);
        c17823.m40470(this.f15112);
        c17823.m40470(this.f15106);
        c17823.m40470(this.f15109);
        c17823.m40470(m13545());
        c17823.m40470(this.f15105);
        c17823.m40470(this.f15110);
        c17823.m40470(C20764.m46886(this.f59222, StandardCharsets.UTF_8));
        int iM40469 = c17823.m40469();
        byte[] bArr = new byte[iM40469];
        c17823.m40450(0, iM40469, bArr);
        return bArr;
    }
}
