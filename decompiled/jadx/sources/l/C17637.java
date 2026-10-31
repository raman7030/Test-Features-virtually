package l;

import android.util.Base64;
import com.alipay.sdk.m.t0.b;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
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
public final class C17637 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f53882;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f53883;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53884;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f53885;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f53888;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean[] f53891;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f53892;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f53893;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C2115 f53894;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f53895;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f53896;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC2821 f53897;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2115 f53898;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f53900;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2115 f53902;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53903;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53904;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f53906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f53907;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public byte f53908;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f53909;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public byte f53910;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f53913;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f53914;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f53916;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53917;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f53918;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Stack f53919 = new Stack();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f53886 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f53911 = new int[16];

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f53905 = new StringBuilder();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C18343 f53887 = new C18343();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18343 f53889 = new C18343();

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f53899 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f53901 = 0;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f53912 = new byte[4];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f53890 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16931 f53920 = new C16931();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m41230(int i) {
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m41246(int i) {
        return (i & this.f53896) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41236(int i, boolean z) {
        if (z) {
            if (i == 64) {
                m41236(128, false);
            } else if (i == 128) {
                m41236(64, false);
            }
        }
        if (z) {
            this.f53896 = i | this.f53896;
        } else {
            this.f53896 = (~i) & this.f53896;
        }
    }

    public C17637(C17574 c17574, int i, int i2) {
        this.f53897 = c17574;
        C2115 c2115 = new C2115(i, 2000, i2);
        this.f53894 = c2115;
        this.f53902 = c2115;
        this.f53898 = new C2115(i, i2, i2);
        this.f53918 = i2;
        this.f53892 = i;
        this.f53891 = new boolean[i];
        m41259();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2115 m41261() {
        return this.f53902;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41264() {
        return this.f53902 == this.f53898;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41250(int i, int i2) {
        int i3 = this.f53918;
        if (i3 == i2 && this.f53892 == i) {
            return;
        }
        if (i < 2 || i2 < 2) {
            throw new IllegalArgumentException(C18307.m42646("rows=", i2, i, ", columns="));
        }
        if (i3 != i2) {
            this.f53918 = i2;
            this.f53903 = 0;
            this.f53904 = i2;
        }
        int i4 = this.f53892;
        if (i4 != i) {
            this.f53892 = i;
            boolean[] zArr = this.f53891;
            this.f53891 = new boolean[i];
            int i5 = 0;
            while (i5 < this.f53892) {
                this.f53891[i5] = (i5 & 7) == 0 && i5 != 0;
                i5++;
            }
            System.arraycopy(zArr, 0, this.f53891, 0, Math.min(i4, i));
            this.f53883 = 0;
            this.f53917 = this.f53892;
        }
        m41243();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m41243() {
        int[] iArr = {this.f53895, this.f53906};
        C2115 c2115 = this.f53902;
        c2115.m7007(this.f53892, this.f53918, c2115 == this.f53898 ? this.f53918 : this.f53894.f7064, iArr, m41228(), m41264());
        this.f53895 = iArr[0];
        this.f53906 = iArr[1];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m41260() {
        return this.f53906;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41257() {
        return this.f53895;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41262() {
        return this.f53886;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m41256() {
        return m41246(2);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m41255() {
        return m41246(16);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m41263() {
        return m41246(32);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m41254() {
        return m41246(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41252(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            m41226(bArr[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41226(byte b) {
        int i;
        byte b2;
        byte b3 = this.f53910;
        byte[] bArr = this.f53912;
        int i2 = 65533;
        if (b3 <= 0) {
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                m41249((int) b);
                return;
            }
            if ((b & bo.k) == 192) {
                this.f53910 = (byte) 1;
            } else if ((b & 240) == 224) {
                this.f53910 = (byte) 2;
            } else if ((b & 248) == 240) {
                this.f53910 = (byte) 3;
            } else {
                m41249(65533);
                return;
            }
            byte b4 = this.f53908;
            this.f53908 = (byte) (b4 + 1);
            bArr[b4] = b;
            return;
        }
        if ((b & 192) == 128) {
            byte b5 = this.f53908;
            byte b6 = (byte) (b5 + 1);
            this.f53908 = b6;
            bArr[b5] = b;
            byte b7 = (byte) (b3 - 1);
            this.f53910 = b7;
            if (b7 == 0) {
                if (b6 == 2) {
                    i = 31;
                } else {
                    i = b6 == 3 ? 15 : 7;
                }
                int i3 = ((byte) i) & bArr[0];
                int i4 = 1;
                while (true) {
                    b2 = this.f53908;
                    if (i4 >= b2) {
                        break;
                    }
                    i3 = (i3 << 6) | (bArr[i4] & 63);
                    i4++;
                }
                if ((i3 <= 127 && b2 > 1) || ((i3 < 2047 && b2 > 2) || (i3 < 65535 && b2 > 3))) {
                    i3 = 65533;
                }
                this.f53910 = (byte) 0;
                this.f53908 = (byte) 0;
                if (i3 < 128 || i3 > 159) {
                    int type = Character.getType(i3);
                    if (type != 0 && type != 19) {
                        i2 = i3;
                    }
                    m41249(i2);
                    return;
                }
                return;
            }
            return;
        }
        this.f53910 = (byte) 0;
        this.f53908 = (byte) 0;
        m41238(65533);
        m41226(b);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41249(int i) {
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
        int iM41225;
        int i17;
        C2115 c2115;
        long j;
        String strM51235;
        if (i != 0) {
            ?? r3 = 0;
            if (i == 24 || i == 26) {
                if (this.f53913 != 0) {
                    this.f53913 = 0;
                    m41238(127);
                    return;
                }
                return;
            }
            int[] iArr = this.f53911;
            int i18 = 1;
            i = 1;
            int i19 = 1;
            if (i == 27) {
                int i20 = this.f53913;
                if (i20 == 13) {
                    return;
                }
                if (i20 == 10) {
                    m41241(i);
                    return;
                }
                this.f53913 = 1;
                this.f53907 = 0;
                Arrays.fill(iArr, -1);
                return;
            }
            AbstractC2821 abstractC2821 = this.f53897;
            switch (i) {
                case 7:
                    if (this.f53913 == 10) {
                        m41241(i);
                    } else {
                        abstractC2821.mo8719();
                    }
                    break;
                case 8:
                    int i21 = this.f53883;
                    int i22 = this.f53895;
                    if (i21 == i22) {
                        int i23 = this.f53906 - 1;
                        if (i23 >= 0) {
                            C2115 c2116 = this.f53902;
                            if (c2116.f7065[c2116.m7010(i23)].f59997) {
                                C2115 c2117 = this.f53902;
                                c2117.f7065[c2117.m7010(i23)].f59997 = false;
                                m41240(i23, this.f53917 - 1);
                            }
                        }
                    } else {
                        m41231(i22 - 1);
                    }
                    break;
                case 9:
                    this.f53895 = m41245(1);
                    break;
                case 10:
                case 11:
                case 12:
                    m41227();
                    break;
                case 13:
                    m41231(this.f53883);
                    break;
                case 14:
                    this.f53899 = false;
                    break;
                case 15:
                    this.f53899 = true;
                    break;
                default:
                    this.f53916 = false;
                    int i24 = this.f53913;
                    StringBuilder sb = this.f53905;
                    switch (i24) {
                        case 0:
                            if (i >= 32) {
                                m41238(i);
                            }
                            break;
                        case 1:
                            if (i == 35) {
                                m41239(2);
                                break;
                            } else if (i != 48) {
                                if (i == 72) {
                                    this.f53891[this.f53895] = true;
                                    break;
                                } else if (i == 80) {
                                    sb.setLength(0);
                                    m41239(13);
                                    break;
                                } else if (i == 91) {
                                    m41239(6);
                                    break;
                                } else if (i == 93) {
                                    sb.setLength(0);
                                    m41239(10);
                                    break;
                                } else if (i == 99) {
                                    m41259();
                                    m41235(0, 0, this.f53892, this.f53918);
                                    m41234(0, 0);
                                    break;
                                } else if (i == 40) {
                                    m41239(3);
                                    break;
                                } else if (i == 41) {
                                    m41239(4);
                                    break;
                                } else if (i == 61) {
                                    m41236(32, true);
                                    break;
                                } else if (i == 62) {
                                    m41236(32, false);
                                    break;
                                } else if (i == 77) {
                                    int i25 = this.f53906;
                                    int i26 = this.f53903;
                                    if (i25 <= i26) {
                                        int i27 = i26 + 1;
                                        this.f53902.m7004(0, i26, this.f53892, this.f53904 - i27, 0, i27);
                                        m41235(0, this.f53903, this.f53892, 1);
                                    } else {
                                        this.f53906 = i25 - 1;
                                    }
                                    break;
                                } else if (i != 78) {
                                    switch (i) {
                                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            int i28 = this.f53895;
                                            int i29 = this.f53883;
                                            if (i28 > i29) {
                                                this.f53895 = i28 - 1;
                                            } else {
                                                int i30 = this.f53904;
                                                int i31 = this.f53903;
                                                int i32 = i30 - i31;
                                                this.f53902.m7004(i29, i31, (this.f53917 - i29) - 1, i32, i29 + 1, i31);
                                                this.f53902.m7005(this.f53883, this.f53903, 1, i32, 32, C23924.m52688(this.f53914, this.f53909, 0));
                                            }
                                            break;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            m41224();
                                            break;
                                        case 56:
                                            m41244();
                                            break;
                                        case 57:
                                            int i33 = this.f53895;
                                            int i34 = this.f53917;
                                            if (i33 < i34 - 1) {
                                                this.f53895 = i33 + 1;
                                            } else {
                                                int i35 = this.f53904;
                                                int i36 = this.f53903;
                                                int i37 = i35 - i36;
                                                C2115 c2118 = this.f53902;
                                                int i38 = this.f53883;
                                                c2118.m7004(i38 + 1, i36, (i34 - i38) - 1, i37, i38, i36);
                                                this.f53902.m7005(this.f53917 - 1, this.f53903, 1, i37, 32, C23924.m52688(this.f53914, this.f53909, 0));
                                            }
                                            break;
                                        default:
                                            switch (i) {
                                                case 68:
                                                    m41227();
                                                    break;
                                                case 69:
                                                    m41231(m41246(4) ? this.f53883 : 0);
                                                    m41227();
                                                    break;
                                                case 70:
                                                    m41240(0, this.f53904 - 1);
                                                    break;
                                                default:
                                                    i2 = 0;
                                                    this.f53913 = i2;
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
                                this.f53913 = i2;
                            } else {
                                this.f53902.m7005(0, 0, this.f53892, this.f53918, 69, m41228());
                            }
                            break;
                        case 3:
                            this.f53893 = i == 48;
                            break;
                        case 4:
                            this.f53885 = i == 48;
                            break;
                        case 5:
                        default:
                            this.f53913 = 0;
                            break;
                        case 6:
                            m41242(i);
                            break;
                        case 7:
                            if (i == 36) {
                                m41239(14);
                            } else if (i == 104 || i == 108) {
                                if (this.f53907 >= iArr.length) {
                                    this.f53907 = iArr.length - 1;
                                }
                                for (int i39 = 0; i39 <= this.f53907; i39++) {
                                    m41251(iArr[i39], i == 104);
                                }
                            } else if (i == 110) {
                                i2 = 0;
                                if (m41225(0, -1, true) != 6) {
                                    this.f53913 = i2;
                                } else {
                                    Locale locale = Locale.US;
                                    abstractC2821.m8717(C19373.m44634("\u001b[?", this.f53906 + 1, l.b, ";1R", this.f53895 + 1));
                                }
                            } else if (i == 74 || i == 75) {
                                this.f53884 = false;
                                boolean z2 = i == 75;
                                int iM41226 = m41225(0, 0, true);
                                if (iM41226 != 0) {
                                    if (iM41226 == 1) {
                                        int i40 = z2 ? this.f53906 : 0;
                                        int i41 = this.f53895 + 1;
                                        i6 = this.f53906 + 1;
                                        i5 = i40;
                                        i4 = i41;
                                    } else if (iM41226 != 2) {
                                        this.f53913 = 0;
                                        i6 = -1;
                                        i4 = -1;
                                        i5 = -1;
                                        i3 = -1;
                                    } else {
                                        int i42 = z2 ? this.f53906 : 0;
                                        int i43 = this.f53892;
                                        i6 = z2 ? this.f53906 + 1 : this.f53918;
                                        i5 = i42;
                                        i4 = i43;
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = this.f53895;
                                    int i44 = this.f53906;
                                    i4 = this.f53892;
                                    int i45 = z2 ? i44 + 1 : this.f53918;
                                    i5 = i44;
                                    i6 = i45;
                                }
                                long jM41228 = m41228();
                                while (i5 < i6) {
                                    for (int i46 = i3; i46 < i4; i46++) {
                                        C2115 c2119 = this.f53902;
                                        if ((((int) (c2119.m7003(c2119.m7010(i5)).f59998[i46] & 2047)) & 128) == 0) {
                                            this.f53902.m7006(i46, i5, 32, jM41228);
                                        }
                                    }
                                    i5++;
                                }
                            } else if (i == 114 || i == 115) {
                                if (this.f53907 >= iArr.length) {
                                    this.f53907 = iArr.length - 1;
                                }
                                for (int i47 = 0; i47 <= this.f53907; i47++) {
                                    int i48 = iArr[i47];
                                    int iM41230 = m41230(i48);
                                    if (iM41230 != -1) {
                                        if (i == 115) {
                                            this.f53915 |= iM41230;
                                        } else {
                                            m41251(i48, (iM41230 & this.f53915) != 0);
                                        }
                                    }
                                }
                            } else {
                                m41232(i);
                            }
                            break;
                        case 8:
                            boolean zM41246 = m41246(4);
                            int i49 = zM41246 ? this.f53903 : 0;
                            int i50 = zM41246 ? this.f53904 : this.f53918;
                            int i51 = zM41246 ? this.f53883 : 0;
                            int i52 = zM41246 ? this.f53917 : this.f53892;
                            int i53 = 5;
                            if (i != 114) {
                                i7 = 116;
                                if (i != 116) {
                                    if (i == 118) {
                                        int iMin = Math.min((m41225(0, 1, true) - 1) + i49, this.f53918);
                                        int iMin2 = Math.min((m41225(1, 1, true) - 1) + i51, this.f53892);
                                        int iMin3 = Math.min(Math.max(m41225(2, this.f53918, true) + i49, iMin), this.f53918);
                                        int iMin4 = Math.min(Math.max(m41225(3, this.f53892, true) + i51, iMin2), this.f53892);
                                        int iMin5 = Math.min((m41225(5, 1, true) - 1) + i49, this.f53918);
                                        int iMin6 = Math.min((m41225(6, 1, true) - 1) + i51, this.f53892);
                                        this.f53902.m7004(iMin2, iMin, Math.min(this.f53892 - iMin6, iMin4 - iMin2), Math.min(this.f53918 - iMin5, iMin3 - iMin), iMin6, iMin5);
                                    } else if (i == 120 || i == 122 || i == 123) {
                                        boolean z3 = i != 120;
                                        boolean z4 = i == 123;
                                        boolean z5 = z3 && z4;
                                        if (z3) {
                                            i17 = 0;
                                            iM41225 = 32;
                                        } else {
                                            iM41225 = m41225(0, -1, true);
                                            i17 = 1;
                                        }
                                        if ((iM41225 >= 32 && iM41225 <= 126) || (iM41225 >= 160 && iM41225 <= 255)) {
                                            int iMin7 = Math.min(m41225(i17, 1, true) + i49, i50 + 1);
                                            int iMin8 = Math.min(m41225(i17 + 1, 1, true) + i51, i52 + 1);
                                            int iMin9 = Math.min(m41225(i17 + 2, this.f53918, true) + i49, i50);
                                            int iMin10 = Math.min(m41225(i17 + 3, this.f53892, true) + i51, i52);
                                            long jM41229 = m41228();
                                            for (int i54 = iMin7 - 1; i54 < iMin9; i54++) {
                                                for (int i55 = iMin8 - 1; i55 < iMin10; i55++) {
                                                    if (z4) {
                                                        C2115 c21110 = this.f53902;
                                                        if ((((int) (c21110.m7003(c21110.m7010(i54)).f59998[i55] & 2047)) & 128) == 0) {
                                                            c2115 = this.f53902;
                                                            if (z5) {
                                                                j = c2115.m7003(c2115.m7010(i54)).f59998[i55];
                                                            } else {
                                                                j = jM41229;
                                                            }
                                                            c2115.m7006(i55, i54, iM41225, j);
                                                        }
                                                    } else {
                                                        c2115 = this.f53902;
                                                        if (z5) {
                                                            j = c2115.m7003(c2115.m7010(i54)).f59998[i55];
                                                        } else {
                                                            j = jM41229;
                                                        }
                                                        c2115.m7006(i55, i54, iM41225, j);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        this.f53913 = 0;
                                    }
                                }
                            } else {
                                i7 = 116;
                            }
                            boolean z6 = i == i7;
                            int iMin11 = Math.min(m41225(0, 1, true) - 1, i50) + i49;
                            int iMin12 = Math.min(m41225(1, 1, true) - 1, i52) + i51;
                            int iMin13 = Math.min(m41225(2, this.f53918, true) + 1, i50 - 1) + i49;
                            int iMin14 = Math.min(m41225(3, this.f53892, true) + 1, i52 - 1) + i51;
                            int i56 = this.f53907;
                            if (i56 >= 4) {
                                if (i56 >= iArr.length) {
                                    this.f53907 = iArr.length - 1;
                                }
                                int i57 = 4;
                                while (i57 <= this.f53907) {
                                    int iM41227 = m41225(i57, r3, r3);
                                    if (iM41227 != 0) {
                                        if (iM41227 != i18) {
                                            if (iM41227 != 4) {
                                                if (iM41227 != i53) {
                                                    i8 = 16;
                                                    if (iM41227 == 7) {
                                                        z = true;
                                                    } else if (iM41227 == 22) {
                                                        z = false;
                                                    } else if (iM41227 == 27) {
                                                        z = false;
                                                    } else if (iM41227 == 24) {
                                                        z = false;
                                                    } else if (iM41227 != 25) {
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
                                        C2115 c21111 = this.f53902;
                                        boolean zM41247 = m41246(4096);
                                        int i58 = iMin11;
                                        while (i58 < iMin13) {
                                            C19049 c19049 = c21111.f7065[c21111.m7010(i58)];
                                            int i59 = (zM41247 || i58 == iMin11) ? iMin12 : i51;
                                            if (zM41247) {
                                                i13 = i52;
                                            } else {
                                                i13 = i52;
                                                if (i58 + 1 != iMin13) {
                                                    i14 = i13;
                                                }
                                                while (i59 < i14) {
                                                    int i60 = i14;
                                                    long j2 = c19049.f59998[i59];
                                                    int iM52689 = C23924.m52689(j2);
                                                    int i61 = iMin14;
                                                    int iM52687 = C23924.m52687(j2);
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
                                                    c19049.f59998[i59] = C23924.m52688(iM52689, iM52687, i16);
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
                                                long j3 = c19049.f59998[i59];
                                                int iM526810 = C23924.m52689(j3);
                                                int i65 = iMin14;
                                                int iM52688 = C23924.m52687(j3);
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
                                                c19049.f59998[i59] = C23924.m52688(iM526810, iM52688, i16);
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
                                        c21111.getClass();
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
                            m41241(i);
                            break;
                        case 11:
                            if (i != 92) {
                                m41233(27);
                                m41233(i);
                                m41239(10);
                            } else {
                                m41237("\u001b\\");
                            }
                            break;
                        case 12:
                            if (i == 99) {
                                abstractC2821.m8717("\u001b[>41;320;0c");
                            } else if (i != 109) {
                                m41232(i);
                            }
                            break;
                        case 13:
                            if (i != 92) {
                                if (sb.length() <= 8192) {
                                    sb.appendCodePoint(i);
                                    m41239(this.f53913);
                                } else {
                                    sb.setLength(0);
                                }
                                break;
                            } else {
                                String string = sb.toString();
                                if (string.startsWith("$q")) {
                                    if (string.equals("$q\"p")) {
                                        abstractC2821.m8717("\u001bP1$r64;1\"p\u001b\\");
                                    } else {
                                        this.f53913 = 0;
                                    }
                                } else if (string.startsWith("+q")) {
                                    for (String str : string.substring(2).split(l.b)) {
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
                                                    strM51235 = "256";
                                                    break;
                                                case "TN":
                                                case "name":
                                                    strM51235 = "xterm";
                                                    break;
                                                default:
                                                    strM51235 = C23071.m51235(string2, m41246(1), m41246(32));
                                                    break;
                                            }
                                            if (strM51235 == null) {
                                                abstractC2821.m8717("\u001bP0+r" + str + "\u001b\\");
                                            } else {
                                                StringBuilder sb3 = new StringBuilder();
                                                for (int i69 = 0; i69 < strM51235.length(); i69++) {
                                                    sb3.append(String.format("%02X", Integer.valueOf(strM51235.charAt(i69))));
                                                }
                                                abstractC2821.m8717("\u001bP1+r" + str + "=" + ((Object) sb3) + "\u001b\\");
                                            }
                                        }
                                    }
                                }
                            }
                            this.f53913 = 0;
                            break;
                        case 14:
                            if (i == 112) {
                                int iM41228 = m41225(0, 0, true);
                                if (iM41228 != 47 && iM41228 != 1047 && iM41228 != 1049) {
                                    int iM41231 = m41230(iM41228);
                                    if (iM41231 != -1) {
                                        i19 = 0;
                                    } else if (!m41246(iM41231)) {
                                        i19 = 2;
                                    }
                                } else if (this.f53902 != this.f53898) {
                                    i19 = 2;
                                }
                                Locale locale2 = Locale.US;
                                abstractC2821.m8717(C19373.m44634("\u001b[?", iM41228, l.b, "$y", i19));
                            } else {
                                this.f53913 = 0;
                            }
                            break;
                        case 15:
                            int iM41229 = m41225(0, 0, true);
                            if (i == 113) {
                                switch (iM41229) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        this.f53886 = 0;
                                        break;
                                    case 3:
                                    case 4:
                                        this.f53886 = 1;
                                        break;
                                    case 5:
                                    case 6:
                                        this.f53886 = 2;
                                        break;
                                }
                            } else {
                                if (i != 116 && i != 117) {
                                    this.f53913 = 0;
                                }
                                break;
                            }
                            break;
                        case 16:
                            int iM412210 = m41225(0, 0, true);
                            if (i != 120 || iM412210 < 0 || iM412210 > 2) {
                                this.f53913 = 0;
                            } else {
                                m41236(4096, iM412210 == 2);
                            }
                            break;
                        case 17:
                            if (i != 113) {
                                this.f53913 = 0;
                            } else {
                                int iM412211 = m41225(0, 0, true);
                                if (iM412211 == 0 || iM412211 == 2) {
                                    this.f53888 &= -129;
                                } else if (iM412211 == 1) {
                                    this.f53888 |= 128;
                                } else {
                                    this.f53913 = 0;
                                }
                            }
                            break;
                        case 18:
                            if (i == 125) {
                                int i70 = this.f53917 - this.f53895;
                                int iMin15 = Math.min(m41225(0, 1, true), i70);
                                C2115 c21112 = this.f53902;
                                int i71 = this.f53895;
                                c21112.m7004(i71, 0, i70 - iMin15, this.f53918, i71 + iMin15, 0);
                                m41235(this.f53895, 0, iMin15, this.f53918);
                            } else if (i == 126) {
                                int i72 = this.f53917 - this.f53895;
                                int iMin16 = Math.min(m41225(0, 1, true), i72);
                                int i73 = i72 - iMin16;
                                C2115 c21113 = this.f53902;
                                int i74 = this.f53895;
                                c21113.m7004(i74 + iMin16, 0, i73, this.f53918, i74, 0);
                                m41235(this.f53906 + i73, 0, iMin16, this.f53918);
                            } else {
                                this.f53913 = 0;
                            }
                            break;
                        case 19:
                            if (i == 112) {
                                m41259();
                            } else {
                                this.f53913 = 0;
                            }
                            break;
                    }
                    if (!this.f53916) {
                        this.f53913 = 0;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m41245(int i) {
        int i2 = this.f53895;
        while (true) {
            i2++;
            if (i2 < this.f53892) {
                if (this.f53891[i2] && (i = i - 1) == 0) {
                    return Math.min(i2, this.f53917);
                }
            } else {
                return this.f53917 - 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41251(int i, boolean z) {
        int iM41230 = m41230(i);
        if (iM41230 != -1) {
            m41236(iM41230, z);
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
                this.f53883 = 0;
                this.f53917 = this.f53892;
                return;
            default:
                switch (i) {
                    case 3:
                        this.f53903 = 0;
                        this.f53883 = 0;
                        this.f53904 = this.f53918;
                        this.f53917 = this.f53892;
                        m41236(2048, false);
                        m41235(0, 0, this.f53892, this.f53918);
                        m41240(0, 0);
                        return;
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        return;
                    case 6:
                        if (z) {
                            m41234(0, 0);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 1000:
                            case 1001:
                            case b.c /* 1002 */:
                            case b.d /* 1003 */:
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
                                            m41224();
                                        } else {
                                            m41244();
                                        }
                                        break;
                                    default:
                                        this.f53913 = 0;
                                        break;
                                }
                                return;
                        }
                }
        }
        C2115 c2115 = this.f53898;
        C2115 c2116 = z ? c2115 : this.f53894;
        if (c2116 != this.f53902) {
            boolean z2 = (c2116.f7063 == this.f53892 && c2116.f7066 == this.f53918) ? false : true;
            if (z) {
                m41224();
            }
            this.f53902 = c2116;
            if (!z) {
                C18343 c18343 = this.f53887;
                int i2 = c18343.f57003;
                int i3 = c18343.f57005;
                m41244();
                if (z2) {
                    this.f53895 = i2;
                    this.f53906 = i3;
                }
            }
            if (z2) {
                m41243();
            }
            if (c2116 == c2115) {
                c2116.m7005(0, 0, this.f53892, this.f53918, 32, m41228());
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m41227() {
        int i = this.f53906;
        int i2 = this.f53904;
        int i3 = i + 1;
        if (i >= i2) {
            if (i != this.f53918 - 1) {
                this.f53906 = i3;
                this.f53884 = false;
                return;
            }
            return;
        }
        if (i3 == i2) {
            m41229();
            i3 = this.f53904 - 1;
        }
        this.f53906 = i3;
        this.f53884 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41239(int i) {
        this.f53913 = i;
        this.f53916 = true;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m41224() {
        C18343 c18343 = this.f53902 == this.f53894 ? this.f53887 : this.f53889;
        c18343.f57005 = this.f53906;
        c18343.f57003 = this.f53895;
        c18343.f57006 = this.f53888;
        c18343.f57004 = this.f53914;
        c18343.f57001 = this.f53909;
        c18343.f57007 = this.f53896;
        c18343.f57009 = this.f53893;
        c18343.f57002 = this.f53885;
        c18343.f57008 = this.f53899;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m41244() {
        C18343 c18343 = this.f53902 == this.f53894 ? this.f53887 : this.f53889;
        m41240(c18343.f57005, c18343.f57003);
        this.f53888 = c18343.f57006;
        this.f53914 = c18343.f57004;
        this.f53909 = c18343.f57001;
        this.f53896 = (this.f53896 & (-13)) | (c18343.f57007 & 12);
        this.f53893 = c18343.f57009;
        this.f53885 = c18343.f57002;
        this.f53899 = c18343.f57008;
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
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m41242(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 8;
        if (i == 36) {
            m41239(8);
            return;
        }
        if (i == 39) {
            m41239(18);
            return;
        }
        if (i == 42) {
            m41239(16);
            return;
        }
        int i10 = 0;
        if (i == 80) {
            this.f53884 = false;
            int i11 = this.f53892 - this.f53895;
            int iMin = Math.min(m41225(0, 1, true), i11);
            int i12 = i11 - iMin;
            C2115 c2115 = this.f53902;
            int i13 = this.f53895;
            int i14 = this.f53906;
            c2115.m7004(i13 + iMin, i14, i12, 1, i13, i14);
            m41235(this.f53895 + i12, this.f53906, iMin, 1);
            return;
        }
        if (i == 88) {
            this.f53884 = false;
            this.f53902.m7005(this.f53895, this.f53906, Math.min(m41225(0, 1, true), this.f53892 - this.f53895), 1, 32, m41228());
            return;
        }
        if (i == 90) {
            int iM41225 = m41225(0, 1, true);
            int iMax = this.f53883;
            for (int i15 = this.f53895 - 1; i15 >= 0; i15--) {
                if (this.f53891[i15] && (iM41225 = iM41225 - 1) == 0) {
                    iMax = Math.max(i15, this.f53883);
                    break;
                }
            }
            this.f53895 = iMax;
            return;
        }
        if (i == 83) {
            int iM41226 = m41225(0, 1, true);
            while (i10 < iM41226) {
                m41229();
                i10++;
            }
            return;
        }
        if (i == 84) {
            if (this.f53907 != 0) {
                this.f53913 = 0;
                return;
            }
            int iM41227 = m41225(0, 1, true);
            int i16 = this.f53904 - this.f53903;
            int iMin2 = Math.min(i16, iM41227);
            C2115 c2116 = this.f53902;
            int i17 = this.f53903;
            c2116.m7004(0, i17, this.f53892, i16 - iMin2, 0, i17 + iMin2);
            m41235(0, this.f53903, this.f53892, iMin2);
            return;
        }
        switch (i) {
            case 32:
                m41239(15);
                break;
            case 33:
                m41239(19);
                break;
            case 34:
                m41239(17);
                break;
            default:
                switch (i) {
                    case 62:
                        m41239(12);
                        break;
                    case 63:
                        m41239(7);
                        break;
                    case 64:
                        this.f53884 = false;
                        int i18 = this.f53892 - this.f53895;
                        int iMin3 = Math.min(m41225(0, 1, true), i18);
                        C2115 c2117 = this.f53902;
                        int i19 = this.f53895;
                        int i20 = this.f53906;
                        c2117.m7004(i19, i20, i18 - iMin3, 1, i19 + iMin3, i20);
                        m41235(this.f53895, this.f53906, iMin3, 1);
                        break;
                    case 65:
                        this.f53906 = Math.max(this.f53903, this.f53906 - m41225(0, 1, true));
                        this.f53884 = false;
                        break;
                    case 66:
                        this.f53906 = Math.min(this.f53904 - 1, this.f53906 + m41225(0, 1, true));
                        this.f53884 = false;
                        break;
                    case 67:
                        m41231(Math.min(this.f53917 - 1, this.f53895 + m41225(0, 1, true)));
                        break;
                    case 68:
                        m41231(Math.max(this.f53883, this.f53895 - m41225(0, 1, true)));
                        break;
                    case 69:
                        m41234(0, this.f53906 + m41225(0, 1, true));
                        break;
                    case 70:
                        m41234(0, this.f53906 - m41225(0, 1, true));
                        break;
                    case 71:
                        m41231(Math.min(Math.max(1, m41225(0, 1, true)), this.f53892) - 1);
                        break;
                    case 72:
                        m41234(m41225(1, 1, true) - 1, m41225(0, 1, true) - 1);
                        break;
                    case 73:
                        m41231(m41245(m41225(0, 1, true)));
                        break;
                    case 74:
                        int iM41228 = m41225(0, 0, true);
                        if (iM41228 == 0) {
                            int i21 = this.f53895;
                            m41235(i21, this.f53906, this.f53892 - i21, 1);
                            int i22 = this.f53906 + 1;
                            m41235(0, i22, this.f53892, this.f53918 - i22);
                        } else if (iM41228 == 1) {
                            m41235(0, 0, this.f53892, this.f53906);
                            m41235(0, this.f53906, this.f53895 + 1, 1);
                        } else if (iM41228 != 2) {
                            this.f53913 = 0;
                        } else {
                            m41235(0, 0, this.f53892, this.f53918);
                        }
                        this.f53884 = false;
                        break;
                    case 75:
                        int iM41229 = m41225(0, 0, true);
                        if (iM41229 != 0) {
                            if (iM41229 == 1) {
                                i2 = this.f53906;
                                i3 = this.f53895 + 1;
                            } else if (iM41229 != 2) {
                                this.f53913 = 0;
                            } else {
                                i2 = this.f53906;
                                i3 = this.f53892;
                            }
                            m41235(0, i2, i3, 1);
                        } else {
                            int i23 = this.f53895;
                            m41235(i23, this.f53906, this.f53892 - i23, 1);
                        }
                        this.f53884 = false;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                        int i24 = this.f53904 - this.f53906;
                        int iMin4 = Math.min(m41225(0, 1, true), i24);
                        C2115 c2118 = this.f53902;
                        int i25 = this.f53906;
                        c2118.m7004(0, i25, this.f53892, i24 - iMin4, 0, i25 + iMin4);
                        m41235(0, this.f53906, this.f53892, iMin4);
                        break;
                    case 77:
                        this.f53884 = false;
                        int i26 = this.f53904 - this.f53906;
                        int iMin5 = Math.min(m41225(0, 1, true), i26);
                        int i27 = i26 - iMin5;
                        C2115 c2119 = this.f53902;
                        int i28 = this.f53906;
                        c2119.m7004(0, i28 + iMin5, this.f53892, i27, 0, i28);
                        m41235(0, this.f53906 + i27, this.f53892, iMin5);
                        break;
                    default:
                        AbstractC2821 abstractC2821 = this.f53897;
                        switch (i) {
                            case 96:
                                m41234(m41225(0, 1, true) - 1, this.f53906);
                                break;
                            case 97:
                                m41231(Math.min(this.f53917 - 1, this.f53895 + m41225(0, 1, true)));
                                break;
                            case 98:
                                if (this.f53890 != -1) {
                                    int iM412210 = m41225(0, 1, true);
                                    while (i10 < iM412210) {
                                        m41238(this.f53890);
                                        i10++;
                                    }
                                    break;
                                }
                                break;
                            case q.f /* 99 */:
                                if (m41225(0, 0, true) == 0) {
                                    abstractC2821.m8717("\u001b[?64;1;2;6;9;15;18;21;22c");
                                }
                                break;
                            case 100:
                                this.f53906 = Math.min(Math.max(1, m41225(0, 1, true)), this.f53918) - 1;
                                this.f53884 = false;
                                break;
                            case 101:
                                m41234(this.f53895, this.f53906 + m41225(0, 1, true));
                                break;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                m41234(m41225(1, 1, true) - 1, m41225(0, 1, true) - 1);
                                break;
                            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                int iM412211 = m41225(0, 0, true);
                                if (iM412211 == 0) {
                                    this.f53891[this.f53895] = false;
                                    break;
                                } else if (iM412211 == 3) {
                                    for (int i29 = 0; i29 < this.f53892; i29++) {
                                        this.f53891[i29] = false;
                                    }
                                    break;
                                }
                                break;
                            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                int iM412212 = m41225(0, 0, true);
                                if (iM412212 == 4) {
                                    this.f53882 = true;
                                } else if (iM412212 == 20) {
                                    this.f53913 = 0;
                                } else if (iM412212 != 34) {
                                    this.f53913 = 0;
                                }
                                break;
                            default:
                                int i30 = 11;
                                switch (i) {
                                    case 108:
                                        int iM412213 = m41225(0, 0, true);
                                        if (iM412213 == 4) {
                                            this.f53882 = false;
                                        } else if (iM412213 == 20) {
                                            this.f53913 = 0;
                                        } else if (iM412213 != 34) {
                                            this.f53913 = 0;
                                        }
                                        break;
                                    case 109:
                                        int i31 = this.f53907;
                                        int[] iArr = this.f53911;
                                        if (i31 >= iArr.length) {
                                            this.f53907 = iArr.length - 1;
                                        }
                                        int i32 = 0;
                                        while (true) {
                                            int i33 = this.f53907;
                                            if (i32 <= i33) {
                                                int i34 = iArr[i32];
                                                if (i34 >= 0) {
                                                    if (i34 == 0) {
                                                        this.f53914 = 256;
                                                        this.f53909 = 257;
                                                        this.f53888 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f53888 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f53888 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f53888 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f53888 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f53888 = i9 | this.f53888;
                                                    } else if (i34 == 7) {
                                                        this.f53888 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f53888 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f53888 |= 64;
                                                    } else if (i34 != 10 && i34 != i30) {
                                                        if (i34 == 22) {
                                                            this.f53888 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f53888 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f53888 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f53888 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f53888 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f53888 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f53888 &= -65;
                                                        } else if (i34 < 30 && i34 <= 37) {
                                                            this.f53914 = i34 - 30;
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
                                                                            this.f53913 = 0;
                                                                        } else {
                                                                            int i37 = (i35 << 8) | (i8 << 16) | (-16777216) | i36;
                                                                            if (i34 == 38) {
                                                                                this.f53914 = i37;
                                                                            } else {
                                                                                this.f53909 = i37;
                                                                            }
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0 && i6 < 261) {
                                                                        if (i34 == 38) {
                                                                            this.f53914 = i6;
                                                                        } else {
                                                                            this.f53909 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f53913 = 0;
                                                                }
                                                            }
                                                        } else if (i34 == 39) {
                                                            this.f53914 = 256;
                                                        } else if (i34 >= 40 && i34 <= 47) {
                                                            this.f53909 = i34 - 40;
                                                        } else if (i34 == 49) {
                                                            this.f53909 = 257;
                                                        } else if (i34 >= 90 && i34 <= 97) {
                                                            this.f53914 = i34 - 82;
                                                        } else if (i34 >= 100 && i34 <= 107) {
                                                            this.f53909 = i34 - 92;
                                                        }
                                                    }
                                                } else if (i33 <= 0) {
                                                    i34 = 0;
                                                    if (i34 == 0) {
                                                        this.f53914 = 256;
                                                        this.f53909 = 257;
                                                        this.f53888 = 0;
                                                    } else if (i34 == 1) {
                                                        this.f53888 |= 1;
                                                    } else if (i34 == 2) {
                                                        this.f53888 |= 256;
                                                    } else if (i34 == 3) {
                                                        this.f53888 |= 2;
                                                    } else if (i34 == 4) {
                                                        this.f53888 |= 4;
                                                    } else if (i34 == 5) {
                                                        this.f53888 = i9 | this.f53888;
                                                    } else if (i34 == 7) {
                                                        this.f53888 |= 16;
                                                    } else if (i34 == i9) {
                                                        this.f53888 |= 32;
                                                    } else if (i34 == 9) {
                                                        this.f53888 |= 64;
                                                    } else if (i34 != 10) {
                                                        if (i34 == 22) {
                                                            this.f53888 &= -258;
                                                        } else if (i34 == 23) {
                                                            this.f53888 &= -3;
                                                        } else if (i34 == 24) {
                                                            this.f53888 &= -5;
                                                        } else if (i34 == 25) {
                                                            this.f53888 &= -9;
                                                        } else if (i34 == 27) {
                                                            this.f53888 &= -17;
                                                        } else if (i34 == 28) {
                                                            this.f53888 &= -33;
                                                        } else if (i34 == 29) {
                                                            this.f53888 &= -65;
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
                                                                                this.f53913 = 0;
                                                                            } else {
                                                                                this.f53913 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f53914 = i6;
                                                                            } else {
                                                                                this.f53909 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f53913 = 0;
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
                                                                                this.f53913 = 0;
                                                                            } else {
                                                                                this.f53913 = 0;
                                                                            }
                                                                            i32 = i7;
                                                                        }
                                                                    } else if (i5 == 5) {
                                                                        i6 = iArr[i4];
                                                                        if (i6 >= 0) {
                                                                            if (i34 == 38) {
                                                                                this.f53914 = i6;
                                                                            } else {
                                                                                this.f53909 = i6;
                                                                            }
                                                                        }
                                                                        i32 = i4;
                                                                    } else {
                                                                        this.f53913 = 0;
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
                                                                            this.f53913 = 0;
                                                                        } else {
                                                                            this.f53913 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f53914 = i6;
                                                                        } else {
                                                                            this.f53909 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f53913 = 0;
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
                                                                            this.f53913 = 0;
                                                                        } else {
                                                                            this.f53913 = 0;
                                                                        }
                                                                        i32 = i7;
                                                                    }
                                                                } else if (i5 == 5) {
                                                                    i6 = iArr[i4];
                                                                    if (i6 >= 0) {
                                                                        if (i34 == 38) {
                                                                            this.f53914 = i6;
                                                                        } else {
                                                                            this.f53909 = i6;
                                                                        }
                                                                    }
                                                                    i32 = i4;
                                                                } else {
                                                                    this.f53913 = 0;
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
                                        int iM412214 = m41225(0, 0, true);
                                        if (iM412214 == 5) {
                                            abstractC2821.mo8712(4, new byte[]{27, 91, UTF8.S_P3A, KeyFactorySpi.x25519_type});
                                            break;
                                        } else if (iM412214 == 6) {
                                            Locale locale = Locale.US;
                                            abstractC2821.m8717(C19373.m44634("\u001b[", this.f53906 + 1, l.b, "R", this.f53895 + 1));
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 114:
                                                int iMax2 = Math.max(0, Math.min(m41225(0, 1, true) - 1, this.f53918 - 2));
                                                this.f53903 = iMax2;
                                                this.f53904 = Math.max(iMax2 + 2, Math.min(m41225(1, this.f53918, true), this.f53918));
                                                m41234(0, 0);
                                                break;
                                            case 115:
                                                if (m41246(2048)) {
                                                    int iMin6 = Math.min(m41225(0, 1, true) - 1, this.f53892 - 2);
                                                    this.f53883 = iMin6;
                                                    this.f53917 = Math.max(iMin6 + 1, Math.min(m41225(1, this.f53892, true), this.f53892));
                                                    m41234(0, 0);
                                                } else {
                                                    m41224();
                                                }
                                                break;
                                            case 116:
                                                int iM412215 = m41225(0, 0, true);
                                                if (iM412215 == 11) {
                                                    abstractC2821.m8717("\u001b[1t");
                                                    break;
                                                } else if (iM412215 == 13) {
                                                    abstractC2821.m8717("\u001b[3;0;0t");
                                                    break;
                                                } else if (iM412215 == 14) {
                                                    Locale locale2 = Locale.US;
                                                    abstractC2821.m8717(C19373.m44634("\u001b[4;", this.f53918 * 12, l.b, am.aI, this.f53892 * 12));
                                                    break;
                                                } else {
                                                    Stack stack = this.f53919;
                                                    switch (iM412215) {
                                                        case 18:
                                                            Locale locale3 = Locale.US;
                                                            abstractC2821.m8717(C19373.m44634("\u001b[8;", this.f53918, l.b, am.aI, this.f53892));
                                                            break;
                                                        case 19:
                                                            Locale locale4 = Locale.US;
                                                            abstractC2821.m8717(C19373.m44634("\u001b[9;", this.f53918, l.b, am.aI, this.f53892));
                                                            break;
                                                        case 20:
                                                            abstractC2821.m8717("\u001b]LIconLabel\u001b\\");
                                                            break;
                                                        case 21:
                                                            abstractC2821.m8717("\u001b]l\u001b\\");
                                                            break;
                                                        case 22:
                                                            stack.push(this.f53900);
                                                            if (stack.size() > 20) {
                                                                stack.remove(0);
                                                            }
                                                            break;
                                                        case 23:
                                                            if (!stack.isEmpty()) {
                                                                String str = (String) stack.pop();
                                                                String str2 = this.f53900;
                                                                this.f53900 = str;
                                                                if (!C11003.equals(str2, str)) {
                                                                    abstractC2821.mo8720();
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                                break;
                                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                m41244();
                                                break;
                                            default:
                                                m41232(i);
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

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m41241(int i) {
        if (i == 7) {
            m41237("\u0007");
        } else if (i == 27) {
            m41239(11);
        } else {
            m41233(i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41237(String str) {
        char c;
        String strSubstring;
        int i = 0;
        int i2 = -1;
        while (true) {
            StringBuilder sb = this.f53905;
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
                this.f53913 = 0;
                return;
            } else {
                i2 = (i2 < 0 ? 0 : i2 * 10) + (cCharAt - '0');
                i++;
            }
        }
        AbstractC2821 abstractC2821 = this.f53897;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            String str2 = this.f53900;
            this.f53900 = strSubstring;
            if (!C11003.equals(str2, strSubstring)) {
                abstractC2821.mo8720();
            }
        } else {
            int i3 = 255;
            C16931 c16931 = this.f53920;
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
                            c16931.m39775(i6, strSubstring.substring(i5, i4));
                            abstractC2821.mo8721();
                            i5 = -1;
                            i6 = -1;
                        }
                    } else if (i5 < 0) {
                        if (i5 >= 0 || cCharAt2 < '0' || cCharAt2 > '9') {
                            this.f53913 = 0;
                            return;
                        }
                        i6 = (i6 < 0 ? 0 : i6 * 10) + (cCharAt2 - '0');
                    }
                    if (!z) {
                        i4++;
                    }
                }
                this.f53913 = 0;
                return;
            }
            if (i2 == 52) {
                try {
                    abstractC2821.mo8713(new String(Base64.decode(strSubstring.substring(strSubstring.indexOf(l.b) + 1), 0), StandardCharsets.UTF_8));
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
                                            int i10 = c16931.f52002[i7];
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
                                                abstractC2821.m8717(sb2.toString());
                                            } catch (NumberFormatException unused2) {
                                                continue;
                                            }
                                        } else {
                                            c16931.m39775(i7, strSubstring2);
                                            abstractC2821.mo8721();
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
                                    c16931.f52002[i14] = C16931.f52001.f33815[i14];
                                    abstractC2821.mo8721();
                                    break;
                                default:
                                    this.f53913 = 0;
                                    break;
                            }
                            break;
                    }
                }
            } else if (strSubstring.isEmpty()) {
                c16931.m39774();
                abstractC2821.mo8721();
            } else {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    boolean z3 = i15 == strSubstring.length();
                    if (z3 || strSubstring.charAt(i15) == ';') {
                        try {
                            int i17 = Integer.parseInt(strSubstring.substring(i16, i15));
                            c16931.f52002[i17] = C16931.f52001.f33815[i17];
                            abstractC2821.mo8721();
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
        this.f53913 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41235(int i, int i2, int i3, int i4) {
        this.f53902.m7005(i, i2, i3, i4, 32, m41228());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m41228() {
        return C23924.m52688(this.f53914, this.f53909, this.f53888);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41234(int i, int i2) {
        boolean zM41246 = m41246(4);
        int i3 = zM41246 ? this.f53903 : 0;
        int i4 = zM41246 ? this.f53904 : this.f53918;
        int i5 = zM41246 ? this.f53883 : 0;
        m41240(Math.max(i3, Math.min(i2 + i3, i4 - 1)), Math.max(i5, Math.min(i + i5, (zM41246 ? this.f53917 : this.f53892) - 1)));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m41229() {
        this.f53901++;
        int i = this.f53883;
        if (i != 0 || this.f53917 != this.f53892) {
            C2115 c2115 = this.f53902;
            int i2 = this.f53903;
            c2115.m7004(i, i2 + 1, this.f53917 - i, (this.f53904 - i2) - 1, i, i2);
            C2115 c2116 = this.f53902;
            int i3 = this.f53883;
            c2116.m7005(i3, this.f53904 - 1, this.f53917 - i3, 1, 32, this.f53888);
            return;
        }
        this.f53902.m7008(this.f53903, this.f53904, m41228());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m41232(int i) {
        int[] iArr = this.f53911;
        if (i < 48 || i > 57) {
            if (i == 59) {
                int i2 = this.f53907;
                if (i2 < iArr.length) {
                    this.f53907 = i2 + 1;
                }
                m41239(this.f53913);
                return;
            }
            this.f53913 = 0;
            return;
        }
        int i3 = this.f53907;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            int i5 = i - 48;
            if (i4 >= 0) {
                i5 += i4 * 10;
            }
            iArr[i3] = i5;
        }
        m41239(this.f53913);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41225(int i, int i2, boolean z) {
        int i3 = this.f53911[i];
        return (i3 < 0 || (i3 == 0 && z)) ? i2 : i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m41233(int i) {
        StringBuilder sb = this.f53905;
        if (sb.length() < 8192) {
            sb.appendCodePoint(i);
            m41239(this.f53913);
        } else {
            this.f53913 = 0;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m41238(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f53890 = i;
        if (this.f53899) {
            if (!this.f53893) {
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
                    case q.f /* 99 */:
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
                    case q.h /* 125 */:
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
        } else if (!this.f53885) {
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
                case q.f /* 99 */:
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
                case q.h /* 125 */:
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
        boolean zM41246 = m41246(8);
        int iM18920 = C6991.m18920(i2);
        boolean z = this.f53895 == this.f53917 - 1;
        if (zM41246) {
            if (z && ((this.f53884 && iM18920 == 1) || iM18920 == 2)) {
                C2115 c2115 = this.f53902;
                c2115.f7065[c2115.m7010(this.f53906)].f59997 = true;
                this.f53895 = this.f53883;
                int i6 = this.f53906 + 1;
                if (i6 < this.f53904) {
                    this.f53906 = i6;
                } else {
                    m41229();
                }
            }
        } else if (z && iM18920 == 2) {
            return;
        }
        if (this.f53882 && iM18920 > 0 && (i4 = (i3 = this.f53895) + iM18920) < (i5 = this.f53917)) {
            C2115 c2116 = this.f53902;
            int i7 = this.f53906;
            c2116.m7004(i3, i7, i5 - i4, 1, i4, i7);
        }
        this.f53902.m7006(this.f53895 - ((iM18920 > 0 || this.f53895 <= 0 || this.f53884) ? 0 : 1), this.f53906, i2, m41228());
        if (zM41246 && iM18920 > 0) {
            this.f53884 = this.f53895 == this.f53917 - iM18920;
        }
        this.f53895 = Math.min(this.f53895 + iM18920, this.f53917 - 1);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m41231(int i) {
        this.f53895 = i;
        this.f53884 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m41240(int i, int i2) {
        this.f53906 = Math.max(0, Math.min(i, this.f53918 - 1));
        this.f53895 = Math.max(0, Math.min(i2, this.f53892 - 1));
        this.f53884 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41258() {
        return this.f53901;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41248() {
        this.f53901 = 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m41259() {
        this.f53886 = 0;
        this.f53907 = 0;
        this.f53916 = false;
        this.f53913 = 0;
        this.f53882 = false;
        this.f53883 = 0;
        this.f53903 = 0;
        this.f53904 = this.f53918;
        this.f53917 = this.f53892;
        this.f53884 = false;
        C18343 c18343 = this.f53889;
        c18343.f57004 = 256;
        C18343 c18344 = this.f53887;
        c18344.f57004 = 256;
        this.f53914 = 256;
        c18343.f57001 = 257;
        c18344.f57001 = 257;
        this.f53909 = 257;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < this.f53892) {
                boolean[] zArr = this.f53891;
                if ((i & 7) != 0 || i == 0) {
                    z = false;
                }
                zArr[i] = z;
                i++;
            } else {
                this.f53885 = false;
                this.f53893 = false;
                this.f53899 = true;
                c18344.f57007 = 0;
                c18344.f57006 = 0;
                c18344.f57003 = 0;
                c18344.f57005 = 0;
                c18343.f57007 = 0;
                c18343.f57006 = 0;
                c18343.f57003 = 0;
                c18343.f57005 = 0;
                this.f53896 = 0;
                m41236(8, true);
                m41236(16, true);
                int i2 = this.f53896;
                c18343.f57007 = i2;
                c18344.f57007 = i2;
                this.f53915 = i2;
                this.f53910 = (byte) 0;
                this.f53908 = (byte) 0;
                this.f53920.m39774();
                this.f53897.mo8721();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41247(int i, int i2, int i3, int i4) {
        return this.f53902.m7002(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41253(String str) {
        String strReplaceAll = str.replaceAll("(\u001b|[\u0080-\u009f])", "").replaceAll("\r?\n", "\r");
        if (strReplaceAll.isEmpty()) {
            return;
        }
        boolean zM41246 = m41246(1024);
        AbstractC2821 abstractC2821 = this.f53897;
        if (zM41246) {
            abstractC2821.m8717("\u001b[200~");
        }
        abstractC2821.m8717(strReplaceAll);
        if (zM41246) {
            abstractC2821.m8717("\u001b[201~");
        }
    }
}
