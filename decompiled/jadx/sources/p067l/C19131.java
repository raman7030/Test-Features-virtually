package p067l;

import android.util.Base64;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܿ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01T6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19131 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f57075;

    /* JADX INFO: renamed from: ֨ */
    public int f57076;

    /* JADX INFO: renamed from: ֫ */
    public boolean f57077;

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f57078;

    /* JADX INFO: renamed from: ۘ */
    public int f57081;

    /* JADX INFO: renamed from: ۛ */
    public boolean[] f57084;

    /* JADX INFO: renamed from: ۜ */
    public int f57085;

    /* JADX INFO: renamed from: ۟ */
    public boolean f57086;

    /* JADX INFO: renamed from: ۠ */
    public final C4379 f57087;

    /* JADX INFO: renamed from: ۡ */
    public int f57088;

    /* JADX INFO: renamed from: ۢ */
    public int f57089;

    /* JADX INFO: renamed from: ۤ */
    public final AbstractC5050 f57090;

    /* JADX INFO: renamed from: ۧ */
    public final C4379 f57091;

    /* JADX INFO: renamed from: ۨ */
    public String f57093;

    /* JADX INFO: renamed from: ۬ */
    public C4379 f57095;

    /* JADX INFO: renamed from: ܰ */
    public int f57096;

    /* JADX INFO: renamed from: ܳ */
    public int f57097;

    /* JADX INFO: renamed from: ܺ */
    public int f57099;

    /* JADX INFO: renamed from: ܽ */
    public int f57100;

    /* JADX INFO: renamed from: ܽ֫ */
    public byte f57101;

    /* JADX INFO: renamed from: ܿ */
    public int f57102;

    /* JADX INFO: renamed from: ܿ֫ */
    public byte f57103;

    /* JADX INFO: renamed from: ᩴ */
    public int f57106;

    /* JADX INFO: renamed from: ᩵ */
    public int f57107;

    /* JADX INFO: renamed from: ᩶ */
    public int f57108;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f57109;

    /* JADX INFO: renamed from: ᩸ */
    public int f57110;

    /* JADX INFO: renamed from: ᩹ */
    public int f57111;

    /* JADX INFO: renamed from: ᩺ */
    public final Stack f57112 = new Stack();

    /* JADX INFO: renamed from: ۖ */
    public int f57079 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f57104 = new int[16];

    /* JADX INFO: renamed from: ܶ */
    public final StringBuilder f57098 = new StringBuilder();

    /* JADX INFO: renamed from: ۗ */
    public final C19802 f57080 = new C19802();

    /* JADX INFO: renamed from: ۙ */
    public final C19802 f57082 = new C19802();

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f57092 = true;

    /* JADX INFO: renamed from: ۫ */
    public int f57094 = 0;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final byte[] f57105 = new byte[4];

    /* JADX INFO: renamed from: ۚ */
    public int f57083 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public final C18460 f57113 = new C18460();

    /* JADX INFO: renamed from: ۜ */
    public static int m43476(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 25) {
            return 16;
        }
        if (i == 66) {
            return 32;
        }
        if (i == 69) {
            return 2048;
        }
        if (i == 1000) {
            return 64;
        }
        if (i == 1002) {
            return 128;
        }
        if (i == 1004) {
            return 256;
        }
        if (i == 1006) {
            return 512;
        }
        if (i == 2004) {
            return 1024;
        }
        if (i == 5) {
            return 2;
        }
        if (i != 6) {
            return i != 7 ? -1 : 8;
        }
        return 4;
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m43492(int i) {
        return (i & this.f57089) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43482(int i, boolean z) {
        if (z) {
            if (i == 64) {
                m43482(128, false);
            } else if (i == 128) {
                m43482(64, false);
            }
        }
        if (z) {
            this.f57089 = i | this.f57089;
        } else {
            this.f57089 = (~i) & this.f57089;
        }
    }

    public C19131(C19071 c19071, int i, int i2) {
        this.f57090 = c19071;
        C4379 c4379 = new C4379(i, 2000, i2);
        this.f57087 = c4379;
        this.f57095 = c4379;
        this.f57091 = new C4379(i, i2, i2);
        this.f57111 = i2;
        this.f57085 = i;
        this.f57084 = new boolean[i];
        m43505();
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4379 m43507() {
        return this.f57095;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m43510() {
        return this.f57095 == this.f57091;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43496(int i, int i2) {
        int i3 = this.f57111;
        if (i3 == i2 && this.f57085 == i) {
            return;
        }
        if (i < 2 || i2 < 2) {
            throw new IllegalArgumentException(C19768.m44907("rows=", i2, i, ", columns="));
        }
        if (i3 != i2) {
            this.f57111 = i2;
            this.f57096 = 0;
            this.f57097 = i2;
        }
        int i4 = this.f57085;
        if (i4 != i) {
            this.f57085 = i;
            boolean[] zArr = this.f57084;
            this.f57084 = new boolean[i];
            int i5 = 0;
            while (i5 < this.f57085) {
                this.f57084[i5] = (i5 & 7) == 0 && i5 != 0;
                i5++;
            }
            System.arraycopy(zArr, 0, this.f57084, 0, Math.min(i4, i));
            this.f57076 = 0;
            this.f57110 = this.f57085;
        }
        m43489();
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m43489() {
        int[] iArr = {this.f57088, this.f57099};
        C4379 c4379 = this.f57095;
        c4379.m9118(this.f57085, this.f57111, c4379 == this.f57091 ? this.f57111 : this.f57087.f9849, iArr, m43474(), m43510());
        this.f57088 = iArr[0];
        this.f57099 = iArr[1];
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43506() {
        return this.f57099;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43503() {
        return this.f57088;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m43508() {
        return this.f57079;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m43502() {
        return m43492(2);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m43501() {
        return m43492(16);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m43509() {
        return m43492(32);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m43500() {
        return m43492(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43498(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            m43472(bArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43472(byte b) {
        int i;
        byte b2;
        byte b3 = this.f57103;
        byte[] bArr = this.f57105;
        int i2 = 65533;
        if (b3 <= 0) {
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                m43495((int) b);
                return;
            }
            if ((b & C0684bo.f2506k) == 192) {
                this.f57103 = (byte) 1;
            } else if ((b & 240) == 224) {
                this.f57103 = (byte) 2;
            } else if ((b & 248) == 240) {
                this.f57103 = (byte) 3;
            } else {
                m43495(65533);
                return;
            }
            byte b4 = this.f57101;
            this.f57101 = (byte) (b4 + 1);
            bArr[b4] = b;
            return;
        }
        if ((b & 192) == 128) {
            byte b5 = this.f57101;
            byte b6 = (byte) (b5 + 1);
            this.f57101 = b6;
            bArr[b5] = b;
            byte b7 = (byte) (b3 - 1);
            this.f57103 = b7;
            if (b7 == 0) {
                if (b6 == 2) {
                    i = 31;
                } else {
                    i = b6 == 3 ? 15 : 7;
                }
                int i3 = ((byte) i) & bArr[0];
                int i4 = 1;
                while (true) {
                    b2 = this.f57101;
                    if (i4 >= b2) {
                        break;
                    }
                    i3 = (i3 << 6) | (bArr[i4] & 63);
                    i4++;
                }
                if ((i3 <= 127 && b2 > 1) || ((i3 < 2047 && b2 > 2) || (i3 < 65535 && b2 > 3))) {
                    i3 = 65533;
                }
                this.f57103 = (byte) 0;
                this.f57101 = (byte) 0;
                if (i3 < 128 || i3 > 159) {
                    int type = Character.getType(i3);
                    if (type != 0 && type != 19) {
                        i2 = i3;
                    }
                    m43495(i2);
                    return;
                }
                return;
            }
            return;
        }
        this.f57103 = (byte) 0;
        this.f57101 = (byte) 0;
        m43484(65533);
        m43472(b);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:136:0x0245  */
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:212:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:215:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:283:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:285:0x0515  */
    /* JADX WARN: Code duplicated, block: B:286:0x051b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:287:0x051d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0520  */
    /* JADX WARN: Code duplicated, block: B:389:0x0694  */
    /* JADX WARN: Code duplicated, block: B:93:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX INFO: renamed from: ֫ */
    public final void m43495(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM43471;
        int i17;
        C4379 c4379;
        long j;
        String strM53628;
        if (i != 0) {
            ?? r3 = 0;
            if (i == 24 || i == 26) {
                if (this.f57106 != 0) {
                    this.f57106 = 0;
                    m43484(127);
                    return;
                }
                return;
            }
            int[] iArr = this.f57104;
            int i18 = 1;
            i = 1;
            int i19 = 1;
            if (i == 27) {
                int i20 = this.f57106;
                if (i20 == 13) {
                    return;
                }
                if (i20 == 10) {
                    m43487(i);
                    return;
                }
                this.f57106 = 1;
                this.f57100 = 0;
                Arrays.fill(iArr, -1);
                return;
            }
            AbstractC5050 abstractC5050 = this.f57090;
            switch (i) {
                case 7:
                    if (this.f57106 == 10) {
                        m43487(i);
                    } else {
                        abstractC5050.mo10780();
                    }
                    break;
                case 8:
                    int i21 = this.f57076;
                    int i22 = this.f57088;
                    if (i21 == i22) {
                        int i23 = this.f57099 - 1;
                        if (i23 >= 0) {
                            C4379 c43710 = this.f57095;
                            if (c43710.f9850[c43710.m9121(i23)].f63226) {
                                C4379 c43711 = this.f57095;
                                c43711.f9850[c43711.m9121(i23)].f63226 = false;
                                m43486(i23, this.f57110 - 1);
                            }
                        }
                    } else {
                        m43477(i22 - 1);
                    }
                    break;
                case 9:
                    this.f57088 = m43491(1);
                    break;
                case 10:
                case 11:
                case 12:
                    m43473();
                    break;
                case 13:
                    m43477(this.f57076);
                    break;
                case 14:
                    this.f57092 = false;
                    break;
                case 15:
                    this.f57092 = true;
                    break;
                default:
                    this.f57109 = false;
                    int i24 = this.f57106;
                    StringBuilder sb = this.f57098;
                    switch (i24) {
                        case 0:
                            if (i >= 32) {
                                m43484(i);
                            }
                            break;
                        case 1:
                            if (i == 35) {
                                m43485(2);
                                break;
                            } else if (i != 48) {
                                if (i == 72) {
                                    this.f57084[this.f57088] = true;
                                    break;
                                } else if (i == 80) {
                                    sb.setLength(0);
                                    m43485(13);
                                    break;
                                } else if (i == 91) {
                                    m43485(6);
                                    break;
                                } else if (i == 93) {
                                    sb.setLength(0);
                                    m43485(10);
                                    break;
                                } else if (i == 99) {
                                    m43505();
                                    m43481(0, 0, this.f57085, this.f57111);
                                    m43480(0, 0);
                                    break;
                                } else if (i == 40) {
                                    m43485(3);
                                    break;
                                } else if (i == 41) {
                                    m43485(4);
                                    break;
                                } else if (i == 61) {
                                    m43482(32, true);
                                    break;
                                } else if (i == 62) {
                                    m43482(32, false);
                                    break;
                                } else if (i == 77) {
                                    int i25 = this.f57099;
                                    int i26 = this.f57096;
                                    if (i25 <= i26) {
                                        int i27 = i26 + 1;
                                        this.f57095.m9115(0, i26, this.f57085, this.f57097 - i27, 0, i27);
                                        m43481(0, this.f57096, this.f57085, 1);
                                    } else {
                                        this.f57099 = i25 - 1;
                                    }
                                    break;
                                } else if (i != 78) {
                                    switch (i) {
                                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            int i28 = this.f57088;
                                            int i29 = this.f57076;
                                            if (i28 > i29) {
                                                this.f57088 = i28 - 1;
                                            } else {
                                                int i30 = this.f57097;
                                                int i31 = this.f57096;
                                                int i32 = i30 - i31;
                                                this.f57095.m9115(i29, i31, (this.f57110 - i29) - 1, i32, i29 + 1, i31);
                                                this.f57095.m9116(this.f57076, this.f57096, 1, i32, 32, C25106.m55094(this.f57107, this.f57102, 0));
                                            }
                                            break;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            m43470();
                                            break;
                                        case 56:
                                            m43490();
                                            break;
                                        case 57:
                                            int i33 = this.f57088;
                                            int i34 = this.f57110;
                                            if (i33 < i34 - 1) {
                                                this.f57088 = i33 + 1;
                                            } else {
                                                int i35 = this.f57097;
                                                int i36 = this.f57096;
                                                int i37 = i35 - i36;
                                                C4379 c43712 = this.f57095;
                                                int i38 = this.f57076;
                                                c43712.m9115(i38 + 1, i36, (i34 - i38) - 1, i37, i38, i36);
                                                this.f57095.m9116(this.f57110 - 1, this.f57096, 1, i37, 32, C25106.m55094(this.f57107, this.f57102, 0));
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 68:
                                                    m43473();
                                                    break;
                                                case 69:
                                                    m43477(m43492(4) ? this.f57076 : 0);
                                                    m43473();
                                                    break;
                                                case 70:
                                                    m43486(0, this.f57097 - 1);
                                                    break;
                                                default:
                                                    i2 = 0;
                                                    this.f57106 = i2;
                                                    break;
                                            }
                                            break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            if (i != 56) {
                                i2 = 0;
                                this.f57106 = i2;
                            } else {
                                this.f57095.m9116(0, 0, this.f57085, this.f57111, 69, m43474());
                            }
                            break;
                        case 3:
                            this.f57086 = i == 48;
                            break;
                        case 4:
                            this.f57078 = i == 48;
                            break;
                        case 5:
                        default:
                            this.f57106 = 0;
                            break;
                        case 6:
                            m43488(i);
                            break;
                        case 7:
                            if (i == 36) {
                                m43485(14);
                            } else if (i == 104 || i == 108) {
                                if (this.f57100 >= iArr.length) {
                                    this.f57100 = iArr.length - 1;
                                }
                                for (int i39 = 0; i39 <= this.f57100; i39++) {
                                    m43497(iArr[i39], i == 104);
                                }
                            } else if (i == 110) {
                                i2 = 0;
                                if (m43471(0, -1, true) != 6) {
                                    this.f57106 = i2;
                                } else {
                                    Locale locale = Locale.US;
                                    abstractC5050.m10778(C20780.m46928("\u001b[?", this.f57099 + 1, C0249l.f1196b, ";1R", this.f57088 + 1));
                                }
                            } else if (i == 74 || i == 75) {
                                this.f57077 = false;
                                boolean z2 = i == 75;
                                int iM43472 = m43471(0, 0, true);
                                if (iM43472 != 0) {
                                    if (iM43472 == 1) {
                                        int i40 = z2 ? this.f57099 : 0;
                                        int i41 = this.f57088 + 1;
                                        i6 = this.f57099 + 1;
                                        i5 = i40;
                                        i4 = i41;
                                    } else if (iM43472 != 2) {
                                        this.f57106 = 0;
                                        i6 = -1;
                                        i4 = -1;
                                        i5 = -1;
                                        i3 = -1;
                                    } else {
                                        int i42 = z2 ? this.f57099 : 0;
                                        int i43 = this.f57085;
                                        i6 = z2 ? this.f57099 + 1 : this.f57111;
                                        i5 = i42;
                                        i4 = i43;
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = this.f57088;
                                    int i44 = this.f57099;
                                    i4 = this.f57085;
                                    int i45 = z2 ? i44 + 1 : this.f57111;
                                    i5 = i44;
                                    i6 = i45;
                                }
                                long jM43474 = m43474();
                                while (i5 < i6) {
                                    for (int i46 = i3; i46 < i4; i46++) {
                                        C4379 c43713 = this.f57095;
                                        if ((((int) (c43713.m9114(c43713.m9121(i5)).f63227[i46] & 2047)) & 128) == 0) {
                                            this.f57095.m9117(i46, i5, 32, jM43474);
                                        }
                                    }
                                    i5++;
                                }
                            } else if (i == 114 || i == 115) {
                                if (this.f57100 >= iArr.length) {
                                    this.f57100 = iArr.length - 1;
                                }
                                for (int i47 = 0; i47 <= this.f57100; i47++) {
                                    int i48 = iArr[i47];
                                    int iM43476 = m43476(i48);
                                    if (iM43476 != -1) {
                                        if (i == 115) {
                                            this.f57108 |= iM43476;
                                        } else {
                                            m43497(i48, (iM43476 & this.f57108) != 0);
                                        }
                                    }
                                }
                            } else {
                                m43478(i);
                            }
                            break;
                        case 8:
                            boolean zM43492 = m43492(4);
                            int i49 = zM43492 ? this.f57096 : 0;
                            int i50 = zM43492 ? this.f57097 : this.f57111;
                            int i51 = zM43492 ? this.f57076 : 0;
                            int i52 = zM43492 ? this.f57110 : this.f57085;
                            int i53 = 5;
                            if (i != 114) {
                                i7 = 116;
                                if (i != 116) {
                                    if (i == 118) {
                                        int iMin = Math.min((m43471(0, 1, true) - 1) + i49, this.f57111);
                                        int iMin2 = Math.min((m43471(1, 1, true) - 1) + i51, this.f57085);
                                        int iMin3 = Math.min(Math.max(m43471(2, this.f57111, true) + i49, iMin), this.f57111);
                                        int iMin4 = Math.min(Math.max(m43471(3, this.f57085, true) + i51, iMin2), this.f57085);
                                        int iMin5 = Math.min((m43471(5, 1, true) - 1) + i49, this.f57111);
                                        int iMin6 = Math.min((m43471(6, 1, true) - 1) + i51, this.f57085);
                                        this.f57095.m9115(iMin2, iMin, Math.min(this.f57085 - iMin6, iMin4 - iMin2), Math.min(this.f57111 - iMin5, iMin3 - iMin), iMin6, iMin5);
                                    } else if (i == 120 || i == 122 || i == 123) {
                                        boolean z3 = i != 120;
                                        boolean z4 = i == 123;
                                        boolean z5 = z3 && z4;
                                        if (z3) {
                                            i17 = 0;
                                            iM43471 = 32;
                                        } else {
                                            iM43471 = m43471(0, -1, true);
                                            i17 = 1;
                                        }
                                        if ((iM43471 >= 32 && iM43471 <= 126) || (iM43471 >= 160 && iM43471 <= 255)) {
                                            int iMin7 = Math.min(m43471(i17, 1, true) + i49, i50 + 1);
                                            int iMin8 = Math.min(m43471(i17 + 1, 1, true) + i51, i52 + 1);
                                            int iMin9 = Math.min(m43471(i17 + 2, this.f57111, true) + i49, i50);
                                            int iMin10 = Math.min(m43471(i17 + 3, this.f57085, true) + i51, i52);
                                            long jM43475 = m43474();
                                            for (int i54 = iMin7 - 1; i54 < iMin9; i54++) {
                                                for (int i55 = iMin8 - 1; i55 < iMin10; i55++) {
                                                    if (z4) {
                                                        C4379 c43714 = this.f57095;
                                                        if ((((int) (c43714.m9114(c43714.m9121(i54)).f63227[i55] & 2047)) & 128) == 0) {
                                                            c4379 = this.f57095;
                                                            if (z5) {
                                                                j = c4379.m9114(c4379.m9121(i54)).f63227[i55];
                                                            } else {
                                                                j = jM43475;
                                                            }
                                                            c4379.m9117(i55, i54, iM43471, j);
                                                        }
                                                    } else {
                                                        c4379 = this.f57095;
                                                        if (z5) {
                                                            j = c4379.m9114(c4379.m9121(i54)).f63227[i55];
                                                        } else {
                                                            j = jM43475;
                                                        }
                                                        c4379.m9117(i55, i54, iM43471, j);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        this.f57106 = 0;
                                    }
                                }
                            } else {
                                i7 = 116;
                            }
                            boolean z6 = i == i7;
                            int iMin11 = Math.min(m43471(0, 1, true) - 1, i50) + i49;
                            int iMin12 = Math.min(m43471(1, 1, true) - 1, i52) + i51;
                            int iMin13 = Math.min(m43471(2, this.f57111, true) + 1, i50 - 1) + i49;
                            int iMin14 = Math.min(m43471(3, this.f57085, true) + 1, i52 - 1) + i51;
                            int i56 = this.f57100;
                            if (i56 >= 4) {
                                if (i56 >= iArr.length) {
                                    this.f57100 = iArr.length - 1;
                                }
                                int i57 = 4;
                                while (i57 <= this.f57100) {
                                    int iM43473 = m43471(i57, r3, r3);
                                    if (iM43473 != 0) {
                                        if (iM43473 != i18) {
                                            if (iM43473 != 4) {
                                                if (iM43473 != i53) {
                                                    i8 = 16;
                                                    if (iM43473 == 7) {
                                                        z = true;
                                                    } else if (iM43473 == 22) {
                                                        z = false;
                                                    } else if (iM43473 == 27) {
                                                        z = false;
                                                    } else if (iM43473 == 24) {
                                                        z = false;
                                                    } else if (iM43473 != 25) {
                                                        z = true;
                                                        i8 = 0;
                                                    } else {
                                                        z = false;
                                                    }
                                                } else {
                                                    z = true;
                                                }
                                                i8 = 8;
                                            } else {
                                                z = true;
                                            }
                                            i8 = 4;
                                        } else {
                                            z = true;
                                        }
                                        i8 = 1;
                                    } else {
                                        z = z6;
                                        i8 = 29;
                                    }
                                    if (!z6 || z) {
                                        C4379 c43715 = this.f57095;
                                        boolean zM43493 = m43492(4096);
                                        int i58 = iMin11;
                                        while (i58 < iMin13) {
                                            C20473 c20473 = c43715.f9850[c43715.m9121(i58)];
                                            int i59 = (zM43493 || i58 == iMin11) ? iMin12 : i51;
                                            if (zM43493) {
                                                i13 = i52;
                                            } else {
                                                i13 = i52;
                                                if (i58 + 1 != iMin13) {
                                                    i14 = i13;
                                                }
                                                while (i59 < i14) {
                                                    int i60 = i14;
                                                    long j2 = c20473.f63227[i59];
                                                    int iM55095 = C25106.m55095(j2);
                                                    int i61 = iMin14;
                                                    int iM55093 = C25106.m55093(j2);
                                                    int i62 = iMin13;
                                                    int i63 = i51;
                                                    i15 = (int) (j2 & 2047);
                                                    if (z6) {
                                                        i16 = ((~i8) & i15) | ((~i15) & i8);
                                                    } else if (z) {
                                                        i16 = i15 | i8;
                                                    } else {
                                                        i16 = (~i8) & i15;
                                                    }
                                                    c20473.f63227[i59] = C25106.m55094(iM55095, iM55093, i16);
                                                    i59++;
                                                    iMin14 = i61;
                                                    i14 = i60;
                                                    i51 = i63;
                                                    iMin13 = i62;
                                                }
                                                i58++;
                                                i52 = i13;
                                            }
                                            i14 = iMin14;
                                            while (i59 < i14) {
                                                int i64 = i14;
                                                long j3 = c20473.f63227[i59];
                                                int iM55096 = C25106.m55095(j3);
                                                int i65 = iMin14;
                                                int iM55094 = C25106.m55093(j3);
                                                int i66 = iMin13;
                                                int i67 = i51;
                                                i15 = (int) (j3 & 2047);
                                                if (z6) {
                                                    i16 = ((~i8) & i15) | ((~i15) & i8);
                                                } else if (z) {
                                                    i16 = i15 | i8;
                                                } else {
                                                    i16 = (~i8) & i15;
                                                }
                                                c20473.f63227[i59] = C25106.m55094(iM55096, iM55094, i16);
                                                i59++;
                                                iMin14 = i65;
                                                i14 = i64;
                                                i51 = i67;
                                                iMin13 = i66;
                                            }
                                            i58++;
                                            i52 = i13;
                                        }
                                        i9 = i52;
                                        i10 = iMin14;
                                        i11 = iMin13;
                                        i12 = i51;
                                        c43715.getClass();
                                    } else {
                                        i9 = i52;
                                        i10 = iMin14;
                                        i11 = iMin13;
                                        i12 = i51;
                                    }
                                    i57++;
                                    r3 = 0;
                                    i18 = 1;
                                    i53 = 5;
                                    iMin14 = i10;
                                    i52 = i9;
                                    i51 = i12;
                                    iMin13 = i11;
                                }
                            }
                            break;
                        case 9:
                            break;
                        case 10:
                            m43487(i);
                            break;
                        case 11:
                            if (i != 92) {
                                m43479(27);
                                m43479(i);
                                m43485(10);
                            } else {
                                m43483("\u001b\\");
                            }
                            break;
                        case 12:
                            if (i == 99) {
                                abstractC5050.m10778("\u001b[>41;320;0c");
                            } else if (i != 109) {
                                m43478(i);
                            }
                            break;
                        case 13:
                            if (i != 92) {
                                if (sb.length() <= 8192) {
                                    sb.appendCodePoint(i);
                                    m43485(this.f57106);
                                } else {
                                    sb.setLength(0);
                                }
                                break;
                            } else {
                                String string = sb.toString();
                                if (string.startsWith("$q")) {
                                    if (string.equals("$q\"p")) {
                                        abstractC5050.m10778("\u001bP1$r64;1\"p\u001b\\");
                                    } else {
                                        this.f57106 = 0;
                                    }
                                } else if (string.startsWith("+q")) {
                                    for (String str : string.substring(2).split(C0249l.f1196b)) {
                                        if (str.length() % 2 == 0) {
                                            StringBuilder sb2 = new StringBuilder();
                                            for (int i68 = 0; i68 < str.length(); i68 += 2) {
                                                sb2.append((char) Long.decode("0x" + str.charAt(i68) + "" + str.charAt(i68 + 1)).longValue());
                                            }
                                            String string2 = sb2.toString();
                                            string2.getClass();
                                            switch (string2) {
                                                case "colors":
                                                case "Co":
                                                    strM53628 = "256";
                                                    break;
                                                case "TN":
                                                case "name":
                                                    strM53628 = "xterm";
                                                    break;
                                                default:
                                                    strM53628 = C24295.m53628(string2, m43492(1), m43492(32));
                                                    break;
                                            }
                                            if (strM53628 == null) {
                                                abstractC5050.m10778("\u001bP0+r" + str + "\u001b\\");
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                for (int i69 = 0; i69 < strM53628.length(); i69++) {
                                                    sb3.append(String.format("%02X", Integer.valueOf(strM53628.charAt(i69))));
                                                }
                                                abstractC5050.m10778("\u001bP1+r" + str + "=" + ((Object) sb3) + "\u001b\\");
                                            }
                                        }
                                    }
                                }
                            }
                            this.f57106 = 0;
                            break;
                        case 14:
                            if (i == 112) {
                                int iM43474 = m43471(0, 0, true);
                                if (iM43474 != 47 && iM43474 != 1047 && iM43474 != 1049) {
                                    int iM43477 = m43476(iM43474);
                                    if (iM43477 != -1) {
                                        i19 = 0;
                                    } else if (!m43492(iM43477)) {
                                        i19 = 2;
                                    }
                                } else if (this.f57095 != this.f57091) {
                                    i19 = 2;
                                }
                                Locale locale2 = Locale.US;
                                abstractC5050.m10778(C20780.m46928("\u001b[?", iM43474, C0249l.f1196b, "$y", i19));
                            } else {
                                this.f57106 = 0;
                            }
                            break;
                        case 15:
                            int iM43475 = m43471(0, 0, true);
                            if (i == 113) {
                                switch (iM43475) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        this.f57079 = 0;
                                        break;
                                    case 3:
                                    case 4:
                                        this.f57079 = 1;
                                        break;
                                    case 5:
                                    case 6:
                                        this.f57079 = 2;
                                        break;
                                }
                            } else {
                                if (i != 116 && i != 117) {
                                    this.f57106 = 0;
                                }
                                break;
                            }
                            break;
                        case 16:
                            int iM43478 = m43471(0, 0, true);
                            if (i != 120 || iM43478 < 0 || iM43478 > 2) {
                                this.f57106 = 0;
                            } else {
                                m43482(4096, iM43478 == 2);
                            }
                            break;
                        case 17:
                            if (i != 113) {
                                this.f57106 = 0;
                            } else {
                                int iM43479 = m43471(0, 0, true);
                                if (iM43479 == 0 || iM43479 == 2) {
                                    this.f57081 &= -129;
                                } else if (iM43479 == 1) {
                                    this.f57081 |= 128;
                                } else {
                                    this.f57106 = 0;
                                }
                            }
                            break;
                        case 18:
                            if (i == 125) {
                                int i70 = this.f57110 - this.f57088;
                                int iMin15 = Math.min(m43471(0, 1, true), i70);
                                C4379 c43716 = this.f57095;
                                int i71 = this.f57088;
                                c43716.m9115(i71, 0, i70 - iMin15, this.f57111, i71 + iMin15, 0);
                                m43481(this.f57088, 0, iMin15, this.f57111);
                            } else if (i == 126) {
                                int i72 = this.f57110 - this.f57088;
                                int iMin16 = Math.min(m43471(0, 1, true), i72);
                                int i73 = i72 - iMin16;
                                C4379 c43717 = this.f57095;
                                int i74 = this.f57088;
                                c43717.m9115(i74 + iMin16, 0, i73, this.f57111, i74, 0);
                                m43481(this.f57099 + i73, 0, iMin16, this.f57111);
                            } else {
                                this.f57106 = 0;
                            }
                            break;
                        case 19:
                            if (i == 112) {
                                m43505();
                            } else {
                                this.f57106 = 0;
                            }
                            break;
                    }
                    if (!this.f57109) {
                        this.f57106 = 0;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private int m43491(int i) {
        int i2 = this.f57088;
        while (true) {
            i2++;
            if (i2 < this.f57085) {
                if (this.f57084[i2] && (i = i - 1) == 0) {
                    return Math.min(i2, this.f57110);
                }
            } else {
                return this.f57110 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43497(int i, boolean z) {
        int iM43476 = m43476(i);
        if (iM43476 != -1) {
            m43482(iM43476, z);
        }
        switch (i) {
            case 1:
            case 12:
            case 25:
            case 40:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 66:
            case 1015:
            case 1034:
            case 2004:
                return;
            case 47:
                break;
            case 69:
                if (z) {
                    return;
                }
                this.f57076 = 0;
                this.f57110 = this.f57085;
                return;
            default:
                switch (i) {
                    case 3:
                        this.f57096 = 0;
                        this.f57076 = 0;
                        this.f57097 = this.f57111;
                        this.f57110 = this.f57085;
                        m43482(2048, false);
                        m43481(0, 0, this.f57085, this.f57111);
                        m43486(0, 0);
                        return;
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        return;
                    case 6:
                        if (z) {
                            m43480(0, 0);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 1000:
                            case 1001:
                            case C0215b.f1000c /* 1002 */:
                            case C0215b.f1001d /* 1003 */:
                            case 1004:
                            case 1005:
                            case 1006:
                                return;
                            default:
                                switch (i) {
                                    case 1047:
                                    case 1049:
                                        break;
                                    case 1048:
                                        if (z) {
                                            m43470();
                                        } else {
                                            m43490();
                                        }
                                        break;
                                    default:
                                        this.f57106 = 0;
                                        break;
                                }
                                return;
                        }
                }
        }
        C4379 c4379 = this.f57091;
        C4379 c43710 = z ? c4379 : this.f57087;
        if (c43710 != this.f57095) {
            boolean z2 = (c43710.f9848 == this.f57085 && c43710.f9851 == this.f57111) ? false : true;
            if (z) {
                m43470();
            }
            this.f57095 = c43710;
            if (!z) {
                C19802 c19802 = this.f57080;
                int i2 = c19802.f60221;
                int i3 = c19802.f60223;
                m43490();
                if (z2) {
                    this.f57088 = i2;
                    this.f57099 = i3;
                }
            }
            if (z2) {
                m43489();
            }
            if (c43710 == c4379) {
                c43710.m9116(0, 0, this.f57085, this.f57111, 32, m43474());
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m43473() {
        int i = this.f57099;
        int i2 = this.f57097;
        int i3 = i + 1;
        if (i >= i2) {
            if (i != this.f57111 - 1) {
                this.f57099 = i3;
                this.f57077 = false;
                return;
            }
            return;
        }
        if (i3 == i2) {
            m43475();
            i3 = this.f57097 - 1;
        }
        this.f57099 = i3;
        this.f57077 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m43485(int i) {
        this.f57106 = i;
        this.f57109 = true;
    }

    /* JADX INFO: renamed from: ֡ */
    private void m43470() {
        C19802 c19802 = this.f57095 == this.f57087 ? this.f57080 : this.f57082;
        c19802.f60223 = this.f57099;
        c19802.f60221 = this.f57088;
        c19802.f60224 = this.f57081;
        c19802.f60222 = this.f57107;
        c19802.f60219 = this.f57102;
        c19802.f60225 = this.f57089;
        c19802.f60227 = this.f57086;
        c19802.f60220 = this.f57078;
        c19802.f60226 = this.f57092;
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m43490() {
        C19802 c19802 = this.f57095 == this.f57087 ? this.f57080 : this.f57082;
        m43486(c19802.f60223, c19802.f60221);
        this.f57081 = c19802.f60224;
        this.f57107 = c19802.f60222;
        this.f57102 = c19802.f60219;
        this.f57089 = (this.f57089 & (-13)) | (c19802.f60225 & 12);
        this.f57086 = c19802.f60227;
        this.f57078 = c19802.f60220;
        this.f57092 = c19802.f60226;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:117:0x0223  */
    /* JADX WARN: Code duplicated, block: B:143:0x0287  */
    /* JADX WARN: Code duplicated, block: B:144:0x028f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0291  */
    /* JADX WARN: Code duplicated, block: B:146:0x0298 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x029a  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:150:0x02aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02be  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:172:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:174:0x0302  */
    /* JADX WARN: Code duplicated, block: B:175:0x030a  */
    /* JADX WARN: Code duplicated, block: B:177:0x030e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0316  */
    /* JADX WARN: Code duplicated, block: B:180:0x031a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0322  */
    /* JADX WARN: Code duplicated, block: B:183:0x0326  */
    /* JADX WARN: Code duplicated, block: B:184:0x032e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0332  */
    /* JADX WARN: Code duplicated, block: B:187:0x033a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0348  */
    /* JADX WARN: Code duplicated, block: B:194:0x034c  */
    /* JADX WARN: Code duplicated, block: B:218:0x038a  */
    /* JADX WARN: Code duplicated, block: B:221:0x038f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0395  */
    /* JADX WARN: Code duplicated, block: B:226:0x039a  */
    /* JADX WARN: Code duplicated, block: B:228:0x03a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:244:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:248:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:250:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:367:0x03db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x03db A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ */
    private void m43488(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 8;
        if (i == 36) {
            m43485(8);
            return;
        }
        if (i == 39) {
            m43485(18);
            return;
        }
        if (i == 42) {
            m43485(16);
            return;
        }
        int i10 = 0;
        if (i == 80) {
            this.f57077 = false;
            int i11 = this.f57085 - this.f57088;
            int iMin = Math.min(m43471(0, 1, true), i11);
            int i12 = i11 - iMin;
            C4379 c4379 = this.f57095;
            int i13 = this.f57088;
            int i14 = this.f57099;
            c4379.m9115(i13 + iMin, i14, i12, 1, i13, i14);
            m43481(this.f57088 + i12, this.f57099, iMin, 1);
            return;
        }
        if (i == 88) {
            this.f57077 = false;
            this.f57095.m9116(this.f57088, this.f57099, Math.min(m43471(0, 1, true), this.f57085 - this.f57088), 1, 32, m43474());
            return;
        }
        if (i == 90) {
            int iM43471 = m43471(0, 1, true);
            int iMax = this.f57076;
            for (int i15 = this.f57088 - 1; i15 >= 0; i15--) {
                if (this.f57084[i15] && (iM43471 = iM43471 - 1) == 0) {
                    iMax = Math.max(i15, this.f57076);
                    break;
                }
            }
            this.f57088 = iMax;
            return;
        }
        if (i == 83) {
            int iM43472 = m43471(0, 1, true);
            while (i10 < iM43472) {
                m43475();
                i10++;
            }
            return;
        }
        if (i == 84) {
            if (this.f57100 != 0) {
                this.f57106 = 0;
                return;
            }
            int iM43473 = m43471(0, 1, true);
            int i16 = this.f57097 - this.f57096;
            int iMin2 = Math.min(i16, iM43473);
            C4379 c43710 = this.f57095;
            int i17 = this.f57096;
            c43710.m9115(0, i17, this.f57085, i16 - iMin2, 0, i17 + iMin2);
            m43481(0, this.f57096, this.f57085, iMin2);
            return;
        }
        switch (i) {
            case 32:
                m43485(15);
                break;
            case 33:
                m43485(19);
                break;
            case 34:
                m43485(17);
                break;
            default:
                switch (i) {
                    case 62:
                        m43485(12);
                        break;
                    case 63:
                        m43485(7);
                        break;
                    case 64:
                        this.f57077 = false;
                        int i18 = this.f57085 - this.f57088;
                        int iMin3 = Math.min(m43471(0, 1, true), i18);
                        C4379 c43711 = this.f57095;
                        int i19 = this.f57088;
                        int i20 = this.f57099;
                        c43711.m9115(i19, i20, i18 - iMin3, 1, i19 + iMin3, i20);
                        m43481(this.f57088, this.f57099, iMin3, 1);
                        break;
                    case 65:
                        this.f57099 = Math.max(this.f57096, this.f57099 - m43471(0, 1, true));
                        this.f57077 = false;
                        break;
                    case 66:
                        this.f57099 = Math.min(this.f57097 - 1, this.f57099 + m43471(0, 1, true));
                        this.f57077 = false;
                        break;
                    case 67:
                        m43477(Math.min(this.f57110 - 1, this.f57088 + m43471(0, 1, true)));
                        break;
                    case 68:
                        m43477(Math.max(this.f57076, this.f57088 - m43471(0, 1, true)));
                        break;
                    case 69:
                        m43480(0, this.f57099 + m43471(0, 1, true));
                        break;
                    case 70:
                        m43480(0, this.f57099 - m43471(0, 1, true));
                        break;
                    case 71:
                        m43477(Math.min(Math.max(1, m43471(0, 1, true)), this.f57085) - 1);
                        break;
                    case 72:
                        m43480(m43471(1, 1, true) - 1, m43471(0, 1, true) - 1);
                        break;
                    case 73:
                        m43477(m43491(m43471(0, 1, true)));
                        break;
                    case 74:
                        int iM43474 = m43471(0, 0, true);
                        if (iM43474 == 0) {
                            int i21 = this.f57088;
                            m43481(i21, this.f57099, this.f57085 - i21, 1);
                            int i22 = this.f57099 + 1;
                            m43481(0, i22, this.f57085, this.f57111 - i22);
                        } else if (iM43474 == 1) {
                            m43481(0, 0, this.f57085, this.f57099);
                            m43481(0, this.f57099, this.f57088 + 1, 1);
                        } else if (iM43474 != 2) {
                            this.f57106 = 0;
                        } else {
                            m43481(0, 0, this.f57085, this.f57111);
                        }
                        this.f57077 = false;
                        break;
                    case 75:
                        int iM43475 = m43471(0, 0, true);
                        if (iM43475 != 0) {
                            if (iM43475 == 1) {
                                i2 = this.f57099;
                                i3 = this.f57088 + 1;
                            } else if (iM43475 != 2) {
                                this.f57106 = 0;
                            } else {
                                i2 = this.f57099;
                                i3 = this.f57085;
                            }
                            m43481(0, i2, i3, 1);
                        } else {
                            int i23 = this.f57088;
                            m43481(i23, this.f57099, this.f57085 - i23, 1);
                        }
                        this.f57077 = false;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                        int i24 = this.f57097 - this.f57099;
                        int iMin4 = Math.min(m43471(0, 1, true), i24);
                        C4379 c43712 = this.f57095;
                        int i25 = this.f57099;
                        c43712.m9115(0, i25, this.f57085, i24 - iMin4, 0, i25 + iMin4);
                        m43481(0, this.f57099, this.f57085, iMin4);
                        break;
                    case 77:
                        this.f57077 = false;
                        int i26 = this.f57097 - this.f57099;
                        int iMin5 = Math.min(m43471(0, 1, true), i26);
                        int i27 = i26 - iMin5;
                        C4379 c43713 = this.f57095;
                        int i28 = this.f57099;
                        c43713.m9115(0, i28 + iMin5, this.f57085, i27, 0, i28);
                        m43481(0, this.f57099 + i27, this.f57085, iMin5);
                        break;
                    default:
                        AbstractC5050 abstractC5050 = this.f57090;
                        switch (i) {
                            case 96:
                                m43480(m43471(0, 1, true) - 1, this.f57099);
                                break;
                            case 97:
                                m43477(Math.min(this.f57110 - 1, this.f57088 + m43471(0, 1, true)));
                                break;
                            case 98:
                                if (this.f57083 != -1) {
                                    int iM43476 = m43471(0, 1, true);
                                    while (i10 < iM43476) {
                                        m43484(this.f57083);
                                        i10++;
                                    }
                                    break;
                                }
                                break;
                            case C0254q.f1216f /* 99 */:
                                if (m43471(0, 0, true) == 0) {
                                    abstractC5050.m10778("\u001b[?64;1;2;6;9;15;18;21;22c");
                                }
                                break;
                            case 100:
                                this.f57099 = Math.min(Math.max(1, m43471(0, 1, true)), this.f57111) - 1;
                                this.f57077 = false;
                                break;
                            case 101:
                                m43480(this.f57088, this.f57099 + m43471(0, 1, true));
                                break;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                m43480(m43471(1, 1, true) - 1, m43471(0, 1, true) - 1);
                                break;
                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                int iM43477 = m43471(0, 0, true);
                                if (iM43477 == 0) {
                                    this.f57084[this.f57088] = false;
                                    break;
                                } else if (iM43477 == 3) {
                                    for (int i29 = 0; i29 < this.f57085; i29++) {
                                        this.f57084[i29] = false;
                                    }
                                    break;
                                }
                                break;
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                int iM43478 = m43471(0, 0, true);
                                if (iM43478 == 4) {
                                    this.f57075 = true;
                                } else if (iM43478 == 20) {
                                    this.f57106 = 0;
                                } else if (iM43478 != 34) {
                                    this.f57106 = 0;
                                }
                                break;
                            default:
                                int i30 = 11;
                                switch (i) {
                                    case 108:
                                        int iM43479 = m43471(0, 0, true);
                                        if (iM43479 == 4) {
                                            this.f57075 = false;
                                        } else if (iM43479 == 20) {
                                            this.f57106 = 0;
                                        } else if (iM43479 != 34) {
                                            this.f57106 = 0;
                                        }
                                        break;
                                    case 109:
                                        int i31 = this.f57100;
                                        int[] iArr = this.f57104;
                                        if (i31 >= iArr.length) {
                                            this.f57100 = iArr.length - 1;
                                        }
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = this.f57100;
                                            if (i32 <= i33) {
                                                int i34 = iArr[i32];
                                                if (i34 >= 0) {
                                                    if (i34 == 0) {
                                                        this.f57107 = 256;
                                                        this.f57102 = 257;
                                                        this.f57081 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f57081 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f57081 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f57081 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f57081 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f57081 = i9 | this.f57081;
                                                    } else if (i34 == 7) {
                                                        this.f57081 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f57081 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f57081 |= 64;
                                                    } else if (i34 != 10 && i34 != i30) {
                                                        if (i34 == 22) {
                                                            this.f57081 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f57081 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f57081 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f57081 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f57081 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f57081 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f57081 &= -65;
                                                        } else if (i34 < 30 && i34 <= 37) {
                                                            this.f57107 = i34 - 30;
                                                        } else if (i34 != 38 || i34 == 48) {
                                                            i4 = i32 + 2;
                                                            if (i4 <= i33) {
                                                                i5 = iArr[i32 + 1];
                                                                if (i5 == 2) {
                                                                    i7 = i32 + 4;
                                                                    if (i7 <= i33) {
                                                                        i8 = iArr[i4];
                                                                        int i35 = iArr[i32 + 3];
                                                                        int i36 = iArr[i7];
                                                                        if (i8 >= 0 || i35 < 0 || i36 < 0 || i8 > 255 || i35 > 255 || i36 > 255) {
                                                                            this.f57106 = 0;
                                                                        } else {
                                                                            int i37 = (i35 << 8) | (i8 << 16) | (-16777216) | i36;
                                                                            if (i34 == 38) {
                                                                                this.f57107 = i37;
                                                                            } else {
                                                                                this.f57102 = i37;
                                                                            }
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0 && i6 < 261) {
                                                                        if (i34 == 38) {
                                                                            this.f57107 = i6;
                                                                        } else {
                                                                            this.f57102 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f57106 = 0;
                                                                }
                                                            }
                                                        } else if (i34 == 39) {
                                                            this.f57107 = 256;
                                                        } else if (i34 >= 40 && i34 <= 47) {
                                                            this.f57102 = i34 - 40;
                                                        } else if (i34 == 49) {
                                                            this.f57102 = 257;
                                                        } else if (i34 >= 90 && i34 <= 97) {
                                                            this.f57107 = i34 - 82;
                                                        } else if (i34 >= 100 && i34 <= 107) {
                                                            this.f57102 = i34 - 92;
                                                        }
                                                    }
                                                } else if (i33 <= 0) {
                                                    i34 = 0;
                                                    if (i34 == 0) {
                                                        this.f57107 = 256;
                                                        this.f57102 = 257;
                                                        this.f57081 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f57081 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f57081 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f57081 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f57081 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f57081 = i9 | this.f57081;
                                                    } else if (i34 == 7) {
                                                        this.f57081 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f57081 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f57081 |= 64;
                                                    } else if (i34 != 10) {
                                                        if (i34 == 22) {
                                                            this.f57081 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f57081 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f57081 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f57081 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f57081 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f57081 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f57081 &= -65;
                                                        } else if (i34 < 30) {
                                                            if (i34 != 38) {
                                                                i4 = i32 + 2;
                                                                if (i4 <= i33) {
                                                                    i5 = iArr[i32 + 1];
                                                                    if (i5 == 2) {
                                                                        i7 = i32 + 4;
                                                                        if (i7 <= i33) {
                                                                            i8 = iArr[i4];
                                                                            int i38 = iArr[i32 + 3];
                                                                            int i39 = iArr[i7];
                                                                            if (i8 >= 0) {
                                                                                this.f57106 = 0;
                                                                            } else {
                                                                                this.f57106 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f57107 = i6;
                                                                            } else {
                                                                                this.f57102 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f57106 = 0;
                                                                    }
                                                                }
                                                            } else {
                                                                i4 = i32 + 2;
                                                                if (i4 <= i33) {
                                                                    i5 = iArr[i32 + 1];
                                                                    if (i5 == 2) {
                                                                        i7 = i32 + 4;
                                                                        if (i7 <= i33) {
                                                                            i8 = iArr[i4];
                                                                            int i310 = iArr[i32 + 3];
                                                                            int i311 = iArr[i7];
                                                                            if (i8 >= 0) {
                                                                                this.f57106 = 0;
                                                                            } else {
                                                                                this.f57106 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f57107 = i6;
                                                                            } else {
                                                                                this.f57102 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f57106 = 0;
                                                                    }
                                                                }
                                                            }
                                                        } else if (i34 != 38) {
                                                            i4 = i32 + 2;
                                                            if (i4 <= i33) {
                                                                i5 = iArr[i32 + 1];
                                                                if (i5 == 2) {
                                                                    i7 = i32 + 4;
                                                                    if (i7 <= i33) {
                                                                        i8 = iArr[i4];
                                                                        int i312 = iArr[i32 + 3];
                                                                        int i313 = iArr[i7];
                                                                        if (i8 >= 0) {
                                                                            this.f57106 = 0;
                                                                        } else {
                                                                            this.f57106 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f57107 = i6;
                                                                        } else {
                                                                            this.f57102 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f57106 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            i4 = i32 + 2;
                                                            if (i4 <= i33) {
                                                                i5 = iArr[i32 + 1];
                                                                if (i5 == 2) {
                                                                    i7 = i32 + 4;
                                                                    if (i7 <= i33) {
                                                                        i8 = iArr[i4];
                                                                        int i314 = iArr[i32 + 3];
                                                                        int i315 = iArr[i7];
                                                                        if (i8 >= 0) {
                                                                            this.f57106 = 0;
                                                                        } else {
                                                                            this.f57106 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f57107 = i6;
                                                                        } else {
                                                                            this.f57102 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f57106 = 0;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                i32++;
                                                i9 = 8;
                                                i30 = 11;
                                            }
                                            break;
                                        }
                                        break;
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                        int iM434710 = m43471(0, 0, true);
                                        if (iM434710 == 5) {
                                            abstractC5050.mo10773(4, new byte[]{27, 91, UTF8.S_P3A, KeyFactorySpi.x25519_type});
                                            break;
                                        } else if (iM434710 == 6) {
                                            Locale locale = Locale.US;
                                            abstractC5050.m10778(C20780.m46928("\u001b[", this.f57099 + 1, C0249l.f1196b, "R", this.f57088 + 1));
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 114:
                                                int iMax2 = Math.max(0, Math.min(m43471(0, 1, true) - 1, this.f57111 - 2));
                                                this.f57096 = iMax2;
                                                this.f57097 = Math.max(iMax2 + 2, Math.min(m43471(1, this.f57111, true), this.f57111));
                                                m43480(0, 0);
                                                break;
                                            case 115:
                                                if (m43492(2048)) {
                                                    int iMin6 = Math.min(m43471(0, 1, true) - 1, this.f57085 - 2);
                                                    this.f57076 = iMin6;
                                                    this.f57110 = Math.max(iMin6 + 1, Math.min(m43471(1, this.f57085, true), this.f57085));
                                                    m43480(0, 0);
                                                } else {
                                                    m43470();
                                                }
                                                break;
                                            case 116:
                                                int iM434711 = m43471(0, 0, true);
                                                if (iM434711 == 11) {
                                                    abstractC5050.m10778("\u001b[1t");
                                                    break;
                                                } else if (iM434711 == 13) {
                                                    abstractC5050.m10778("\u001b[3;0;0t");
                                                    break;
                                                } else if (iM434711 == 14) {
                                                    Locale locale2 = Locale.US;
                                                    abstractC5050.m10778(C20780.m46928("\u001b[4;", this.f57111 * 12, C0249l.f1196b, C0655am.f2281aI, this.f57085 * 12));
                                                    break;
                                                } else {
                                                    Stack stack = this.f57112;
                                                    switch (iM434711) {
                                                        case 18:
                                                            Locale locale3 = Locale.US;
                                                            abstractC5050.m10778(C20780.m46928("\u001b[8;", this.f57111, C0249l.f1196b, C0655am.f2281aI, this.f57085));
                                                            break;
                                                        case 19:
                                                            Locale locale4 = Locale.US;
                                                            abstractC5050.m10778(C20780.m46928("\u001b[9;", this.f57111, C0249l.f1196b, C0655am.f2281aI, this.f57085));
                                                            break;
                                                        case 20:
                                                            abstractC5050.m10778("\u001b]LIconLabel\u001b\\");
                                                            break;
                                                        case 21:
                                                            abstractC5050.m10778("\u001b]l\u001b\\");
                                                            break;
                                                        case 22:
                                                            stack.push(this.f57093);
                                                            if (stack.size() > 20) {
                                                                stack.remove(0);
                                                            }
                                                            break;
                                                        case 23:
                                                            if (!stack.isEmpty()) {
                                                                String str = (String) stack.pop();
                                                                String str2 = this.f57093;
                                                                this.f57093 = str;
                                                                if (!C12826.equals(str2, str)) {
                                                                    abstractC5050.mo10781();
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                m43490();
                                                break;
                                            default:
                                                m43478(i);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m43487(int i) {
        if (i == 7) {
            m43483("\u0007");
        } else if (i == 27) {
            m43485(11);
        } else {
            m43479(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43483(String str) {
        char c;
        String strSubstring;
        int i = 0;
        int i2 = -1;
        while (true) {
            StringBuilder sb = this.f57098;
            c = ';';
            if (i >= sb.length()) {
                strSubstring = "";
                break;
            }
            char cCharAt = sb.charAt(i);
            if (cCharAt == ';') {
                strSubstring = sb.substring(i + 1);
                break;
            } else if (cCharAt < '0' || cCharAt > '9') {
                this.f57106 = 0;
                return;
            } else {
                i2 = (i2 < 0 ? 0 : i2 * 10) + (cCharAt - '0');
                i++;
            }
        }
        AbstractC5050 abstractC5050 = this.f57090;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            String str2 = this.f57093;
            this.f57093 = strSubstring;
            if (!C12826.equals(str2, strSubstring)) {
                abstractC5050.mo10781();
            }
        } else {
            int i3 = 255;
            C18460 c18460 = this.f57113;
            if (i2 == 4) {
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                while (true) {
                    boolean z = i4 == strSubstring.length();
                    char cCharAt2 = z ? ';' : strSubstring.charAt(i4);
                    if (cCharAt2 == ';') {
                        if (i5 < 0) {
                            i5 = i4 + 1;
                        } else {
                            if (i6 < 0 || i6 > 255) {
                                break;
                            }
                            c18460.m42016(i6, strSubstring.substring(i5, i4));
                            abstractC5050.mo10782();
                            i5 = -1;
                            i6 = -1;
                        }
                    } else if (i5 < 0) {
                        if (i5 >= 0 || cCharAt2 < '0' || cCharAt2 > '9') {
                            this.f57106 = 0;
                            return;
                        }
                        i6 = (i6 < 0 ? 0 : i6 * 10) + (cCharAt2 - '0');
                    }
                    if (!z) {
                        i4++;
                    }
                }
                this.f57106 = 0;
                return;
            }
            if (i2 == 52) {
                try {
                    abstractC5050.mo10774(new String(Base64.decode(strSubstring.substring(strSubstring.indexOf(C0249l.f1196b) + 1), 0), StandardCharsets.UTF_8));
                } catch (Exception unused) {
                }
            } else if (i2 != 104) {
                if (i2 != 119) {
                    switch (i2) {
                        case 10:
                        case 11:
                        case 12:
                            int i7 = i2 + 246;
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                boolean z2 = i8 == strSubstring.length();
                                if (z2 || strSubstring.charAt(i8) == c) {
                                    try {
                                        String strSubstring2 = strSubstring.substring(i9, i8);
                                        if ("?".equals(strSubstring2)) {
                                            int i10 = c18460.f55183[i7];
                                            int i11 = (((16711680 & i10) >> 16) * 65535) / i3;
                                            int i12 = (((i10 & 65280) >> 8) * 65535) / i3;
                                            int i13 = ((i10 & 255) * 65535) / i3;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("\u001b]");
                                            sb2.append(i2);
                                            sb2.append(";rgb:");
                                            Locale locale = Locale.US;
                                            sb2.append(String.format(locale, "%04x", Integer.valueOf(i11)));
                                            sb2.append("/");
                                            sb2.append(String.format(locale, "%04x", Integer.valueOf(i12)));
                                            sb2.append("/");
                                            sb2.append(String.format(locale, "%04x", Integer.valueOf(i13)));
                                            try {
                                                sb2.append(str);
                                                abstractC5050.m10778(sb2.toString());
                                            } catch (NumberFormatException unused2) {
                                                continue;
                                            }
                                        } else {
                                            c18460.m42016(i7, strSubstring2);
                                            abstractC5050.mo10782();
                                        }
                                        i7++;
                                        if (!z2 && i7 <= 258 && (i8 = i8 + 1) < strSubstring.length()) {
                                            i9 = i8;
                                        }
                                        break;
                                    } catch (NumberFormatException unused3) {
                                    }
                                }
                                i8++;
                                c = ';';
                                i3 = 255;
                            }
                            break;
                        default:
                            switch (i2) {
                                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    int i14 = i2 + 146;
                                    c18460.f55183[i14] = C18460.f55182.f36814[i14];
                                    abstractC5050.mo10782();
                                    break;
                                default:
                                    this.f57106 = 0;
                                    break;
                            }
                            break;
                    }
                }
            } else if (strSubstring.isEmpty()) {
                c18460.m42015();
                abstractC5050.mo10782();
            } else {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    boolean z3 = i15 == strSubstring.length();
                    if (z3 || strSubstring.charAt(i15) == ';') {
                        try {
                            int i17 = Integer.parseInt(strSubstring.substring(i16, i15));
                            c18460.f55183[i17] = C18460.f55182.f36814[i17];
                            abstractC5050.mo10782();
                            if (z3) {
                                break;
                            }
                            i15++;
                            i16 = i15;
                        } catch (NumberFormatException unused4) {
                            continue;
                        }
                    }
                    i15++;
                }
            }
        }
        this.f57106 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43481(int i, int i2, int i3, int i4) {
        this.f57095.m9116(i, i2, i3, i4, 32, m43474());
    }

    /* JADX INFO: renamed from: ۘ */
    private long m43474() {
        return C25106.m55094(this.f57107, this.f57102, this.f57081);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43480(int i, int i2) {
        boolean zM43492 = m43492(4);
        int i3 = zM43492 ? this.f57096 : 0;
        int i4 = zM43492 ? this.f57097 : this.f57111;
        int i5 = zM43492 ? this.f57076 : 0;
        m43486(Math.max(i3, Math.min(i2 + i3, i4 - 1)), Math.max(i5, Math.min(i + i5, (zM43492 ? this.f57110 : this.f57085) - 1)));
    }

    /* JADX INFO: renamed from: ۚ */
    private void m43475() {
        this.f57094++;
        int i = this.f57076;
        if (i != 0 || this.f57110 != this.f57085) {
            C4379 c4379 = this.f57095;
            int i2 = this.f57096;
            c4379.m9115(i, i2 + 1, this.f57110 - i, (this.f57097 - i2) - 1, i, i2);
            C4379 c43710 = this.f57095;
            int i3 = this.f57076;
            c43710.m9116(i3, this.f57097 - 1, this.f57110 - i3, 1, 32, this.f57081);
            return;
        }
        this.f57095.m9119(this.f57096, this.f57097, m43474());
    }

    /* JADX INFO: renamed from: ۢ */
    private void m43478(int i) {
        int[] iArr = this.f57104;
        if (i < 48 || i > 57) {
            if (i == 59) {
                int i2 = this.f57100;
                if (i2 < iArr.length) {
                    this.f57100 = i2 + 1;
                }
                m43485(this.f57106);
                return;
            }
            this.f57106 = 0;
            return;
        }
        int i3 = this.f57100;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            int i5 = i - 48;
            if (i4 >= 0) {
                i5 += i4 * 10;
            }
            iArr[i3] = i5;
        }
        m43485(this.f57106);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43471(int i, int i2, boolean z) {
        int i3 = this.f57104[i];
        return (i3 < 0 || (i3 == 0 && z)) ? i2 : i3;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m43479(int i) {
        StringBuilder sb = this.f57098;
        if (sb.length() < 8192) {
            sb.appendCodePoint(i);
            m43485(this.f57106);
        } else {
            this.f57106 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:88:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    /* JADX INFO: renamed from: ܳ */
    private void m43484(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f57083 = i;
        if (this.f57092) {
            if (!this.f57086) {
                i2 = i;
            } else if (i != 48) {
                switch (i) {
                    case 95:
                        i2 = 32;
                        break;
                    case 96:
                        i2 = 9670;
                        break;
                    case 97:
                        i2 = 9618;
                        break;
                    case 98:
                        i2 = 9225;
                        break;
                    case C0254q.f1216f /* 99 */:
                        i2 = 9228;
                        break;
                    case 100:
                        i2 = 13;
                        break;
                    case 101:
                        i2 = 9226;
                        break;
                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                        i2 = PicnicEngine.MAX_AUX_BYTES;
                        break;
                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                        i2 = 177;
                        break;
                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                        i2 = 10;
                        break;
                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                        i2 = 9227;
                        break;
                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                        i2 = 9496;
                        break;
                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                        i2 = 9488;
                        break;
                    case 108:
                        i2 = 9484;
                        break;
                    case 109:
                        i2 = 9492;
                        break;
                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                        i2 = 9532;
                        break;
                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                        i2 = 9146;
                        break;
                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                        i2 = 9147;
                        break;
                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                        i2 = 9472;
                        break;
                    case 114:
                        i2 = 9148;
                        break;
                    case 115:
                        i2 = 9149;
                        break;
                    case 116:
                        i2 = 9500;
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                        i2 = 9508;
                        break;
                    case 118:
                        i2 = 9524;
                        break;
                    case 119:
                        i2 = 9516;
                        break;
                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                        i2 = 9474;
                        break;
                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                        i2 = 8804;
                        break;
                    case 122:
                        i2 = 8805;
                        break;
                    case 123:
                        i2 = 960;
                        break;
                    case 124:
                        i2 = 8800;
                        break;
                    case C0254q.f1218h /* 125 */:
                        i2 = 163;
                        break;
                    case 126:
                        i2 = 183;
                        break;
                    default:
                        i2 = i;
                        break;
                }
            } else {
                i2 = 9608;
            }
        } else if (!this.f57078) {
            i2 = i;
        } else if (i != 48) {
            switch (i) {
                case 95:
                    i2 = 32;
                    break;
                case 96:
                    i2 = 9670;
                    break;
                case 97:
                    i2 = 9618;
                    break;
                case 98:
                    i2 = 9225;
                    break;
                case C0254q.f1216f /* 99 */:
                    i2 = 9228;
                    break;
                case 100:
                    i2 = 13;
                    break;
                case 101:
                    i2 = 9226;
                    break;
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    i2 = PicnicEngine.MAX_AUX_BYTES;
                    break;
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    i2 = 177;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    i2 = 10;
                    break;
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    i2 = 9227;
                    break;
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                    i2 = 9496;
                    break;
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    i2 = 9488;
                    break;
                case 108:
                    i2 = 9484;
                    break;
                case 109:
                    i2 = 9492;
                    break;
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    i2 = 9532;
                    break;
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    i2 = 9146;
                    break;
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    i2 = 9147;
                    break;
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                    i2 = 9472;
                    break;
                case 114:
                    i2 = 9148;
                    break;
                case 115:
                    i2 = 9149;
                    break;
                case 116:
                    i2 = 9500;
                    break;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    i2 = 9508;
                    break;
                case 118:
                    i2 = 9524;
                    break;
                case 119:
                    i2 = 9516;
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    i2 = 9474;
                    break;
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                    i2 = 8804;
                    break;
                case 122:
                    i2 = 8805;
                    break;
                case 123:
                    i2 = 960;
                    break;
                case 124:
                    i2 = 8800;
                    break;
                case C0254q.f1218h /* 125 */:
                    i2 = 163;
                    break;
                case 126:
                    i2 = 183;
                    break;
                default:
                    i2 = i;
                    break;
            }
        } else {
            i2 = 9608;
        }
        boolean zM43492 = m43492(8);
        int iM20874 = C9013.m20874(i2);
        boolean z = this.f57088 == this.f57110 - 1;
        if (zM43492) {
            if (z && ((this.f57077 && iM20874 == 1) || iM20874 == 2)) {
                C4379 c4379 = this.f57095;
                c4379.f9850[c4379.m9121(this.f57099)].f63226 = true;
                this.f57088 = this.f57076;
                int i6 = this.f57099 + 1;
                if (i6 < this.f57097) {
                    this.f57099 = i6;
                } else {
                    m43475();
                }
            }
        } else if (z && iM20874 == 2) {
            return;
        }
        if (this.f57075 && iM20874 > 0 && (i4 = (i3 = this.f57088) + iM20874) < (i5 = this.f57110)) {
            C4379 c43710 = this.f57095;
            int i7 = this.f57099;
            c43710.m9115(i3, i7, i5 - i4, 1, i4, i7);
        }
        this.f57095.m9117(this.f57088 - ((iM20874 > 0 || this.f57088 <= 0 || this.f57077) ? 0 : 1), this.f57099, i2, m43474());
        if (zM43492 && iM20874 > 0) {
            this.f57077 = this.f57088 == this.f57110 - iM20874;
        }
        this.f57088 = Math.min(this.f57088 + iM20874, this.f57110 - 1);
    }

    /* JADX INFO: renamed from: ۡ */
    private void m43477(int i) {
        this.f57088 = i;
        this.f57077 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m43486(int i, int i2) {
        this.f57099 = Math.max(0, Math.min(i, this.f57111 - 1));
        this.f57088 = Math.max(0, Math.min(i2, this.f57085 - 1));
        this.f57077 = false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m43504() {
        return this.f57094;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43494() {
        this.f57094 = 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m43505() {
        this.f57079 = 0;
        this.f57100 = 0;
        this.f57109 = false;
        this.f57106 = 0;
        this.f57075 = false;
        this.f57076 = 0;
        this.f57096 = 0;
        this.f57097 = this.f57111;
        this.f57110 = this.f57085;
        this.f57077 = false;
        C19802 c19802 = this.f57082;
        c19802.f60222 = 256;
        C19802 c19803 = this.f57080;
        c19803.f60222 = 256;
        this.f57107 = 256;
        c19802.f60219 = 257;
        c19803.f60219 = 257;
        this.f57102 = 257;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.f57085) {
                boolean[] zArr = this.f57084;
                if ((i & 7) != 0 || i == 0) {
                    z = false;
                }
                zArr[i] = z;
                i++;
            } else {
                this.f57078 = false;
                this.f57086 = false;
                this.f57092 = true;
                c19803.f60225 = 0;
                c19803.f60224 = 0;
                c19803.f60221 = 0;
                c19803.f60223 = 0;
                c19802.f60225 = 0;
                c19802.f60224 = 0;
                c19802.f60221 = 0;
                c19802.f60223 = 0;
                this.f57089 = 0;
                m43482(8, true);
                m43482(16, true);
                int i2 = this.f57089;
                c19802.f60225 = i2;
                c19803.f60225 = i2;
                this.f57108 = i2;
                this.f57103 = (byte) 0;
                this.f57101 = (byte) 0;
                this.f57113.m42015();
                this.f57090.mo10782();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43493(int i, int i2, int i3, int i4) {
        return this.f57095.m9113(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43499(String str) {
        String strReplaceAll = str.replaceAll("(\u001b|[\u0080-\u009f])", "").replaceAll("\r?\n", "\r");
        if (strReplaceAll.isEmpty()) {
            return;
        }
        boolean zM43492 = m43492(1024);
        AbstractC5050 abstractC5050 = this.f57090;
        if (zM43492) {
            abstractC5050.m10778("\u001b[200~");
        }
        abstractC5050.m10778(strReplaceAll);
        if (zM43492) {
            abstractC5050.m10778("\u001b[201~");
        }
    }
}
