package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܺۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1DD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15681 implements Cloneable {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f48271;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f48272;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f48273;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public int f48274;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f48275;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public short[] f48276;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f48277;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f48278;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22033 f48279;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f48280;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f48281;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f48282;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f48283;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f48284;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f48285;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C18505 f48286;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public int f48287;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f48288;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C22033 f48289;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public byte[] f48290;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22033 f48291;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f48292;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f48293;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public C2277 f48294;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f48295;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public short[] f48296;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f48297;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public byte[] f48298;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f48299;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public int f48300;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public short[] f48301;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f48302;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int[] f48303;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f48304;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public int f48305;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f48306;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f48307;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public int f48308;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public short[] f48309;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public int f48310;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f48311;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public int f48312;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f48313;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f48314;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public short[] f48315;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public short[] f48316;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f48317;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f48318;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short f48319;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f48320;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f48321;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f48322;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public short[] f48323;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int f48324;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f48325;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f48326;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final C8627[] f48270 = {new C8627(0, 0, 0, 0, 0), new C8627(4, 4, 8, 4, 1), new C8627(4, 5, 16, 8, 1), new C8627(4, 6, 32, 32, 1), new C8627(4, 4, 16, 16, 2), new C8627(8, 16, 32, 32, 2), new C8627(8, 16, 128, 128, 2), new C8627(8, 32, 128, 256, 2), new C8627(32, 128, 258, 1024, 2), new C8627(32, 258, 258, 4096, 2)};

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f48269 = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36950() {
        for (int i = 0; i < 286; i++) {
            this.f48301[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.f48323[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.f48276[i3 * 2] = 0;
        }
        this.f48301[512] = 1;
        this.f48287 = 0;
        this.f48277 = 0;
        this.f48305 = 0;
        this.f48278 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36942(short[] sArr, int i) {
        int i2 = this.f48303[i];
        int i3 = i << 1;
        while (true) {
            int i4 = this.f48325;
            if (i3 > i4) {
                break;
            }
            if (i3 < i4) {
                int[] iArr = this.f48303;
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                int i7 = iArr[i3];
                byte[] bArr = this.f48295;
                short s = sArr[i6 * 2];
                short s2 = sArr[i7 * 2];
                if (s < s2 || (s == s2 && bArr[i6] <= bArr[i7])) {
                    i3 = i5;
                }
            }
            int[] iArr2 = this.f48303;
            int i8 = iArr2[i3];
            byte[] bArr2 = this.f48295;
            short s3 = sArr[i2 * 2];
            short s4 = sArr[i8 * 2];
            if (s3 < s4 || (s3 == s4 && bArr2[i2] <= bArr2[i8])) {
                break;
            }
            iArr2[i] = i8;
            int i9 = i3;
            i3 <<= 1;
            i = i9;
        }
        this.f48303[i] = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36946(short[] sArr, int i) {
        int i2;
        int i3;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        short s2 = -1;
        sArr[C20094.m46314(i, 1, 2, 1)] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    short[] sArr2 = this.f48276;
                    int i6 = s * 2;
                    sArr2[i6] = (short) (sArr2[i6] + ((short) i5));
                } else if (s != 0) {
                    if (s != s2) {
                        short[] sArr3 = this.f48276;
                        int i7 = s * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.f48276;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i5 <= 10) {
                    short[] sArr5 = this.f48276;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.f48276;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s3 == 0) {
                    i2 = 138;
                } else {
                    if (s == s3) {
                        i2 = 6;
                    } else {
                        i2 = 7;
                        i3 = 4;
                    }
                    s2 = s;
                    i5 = 0;
                }
                i3 = 3;
                s2 = s;
                i5 = 0;
            }
            s = s3;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36954(short[] sArr, int i) {
        int i2;
        int i3;
        int i4 = 1;
        short s = sArr[1];
        if (s == 0) {
            i2 = 138;
            i3 = 3;
        } else {
            i2 = 7;
            i3 = 4;
        }
        int i5 = 0;
        int i6 = 0;
        short s2 = -1;
        while (i5 <= i) {
            i5++;
            short s3 = sArr[(i5 * 2) + i4];
            int i7 = i6 + 1;
            if (i7 >= i2 || s != s3) {
                if (i7 < i3) {
                    do {
                        m36949(this.f48276, s);
                        i7--;
                    } while (i7 != 0);
                } else if (s != 0) {
                    if (s != s2) {
                        m36949(this.f48276, s);
                    } else {
                        i6 = i7;
                    }
                    m36949(this.f48276, 16);
                    m36945(i6 - 3, 2);
                } else if (i7 <= 10) {
                    m36949(this.f48276, 17);
                    m36945(i6 - 2, 3);
                } else {
                    m36949(this.f48276, 18);
                    m36945(i6 - 10, 7);
                }
                if (s3 == 0) {
                    i2 = 138;
                } else {
                    if (s == s3) {
                        i2 = 6;
                    } else {
                        i2 = 7;
                        i3 = 4;
                    }
                    i6 = 0;
                    s2 = s;
                }
                i3 = 3;
                i6 = 0;
                s2 = s;
            } else {
                i6 = i7;
            }
            s = s3;
            i4 = 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36940(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f48298, this.f48300, i2);
        this.f48300 += i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36939(byte b) {
        byte[] bArr = this.f48298;
        int i = this.f48300;
        this.f48300 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36951(int i) {
        m36939((byte) i);
        m36939((byte) (i >>> 8));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36953(int i) {
        m36939((byte) (i >> 8));
        m36939((byte) i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36949(short[] sArr, int i) {
        int i2 = i * 2;
        m36945(sArr[i2] & HPKE.aead_EXPORT_ONLY, sArr[i2 + 1] & HPKE.aead_EXPORT_ONLY);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36945(int i, int i2) {
        int i3 = this.f48321;
        if (i3 > 16 - i2) {
            short s = (short) (((short) ((i << i3) & 65535)) | this.f48319);
            this.f48319 = s;
            m36951(s);
            int i4 = this.f48321;
            this.f48319 = (short) (i >>> (16 - i4));
            this.f48321 = (i2 - 16) + i4;
            return;
        }
        this.f48319 = (short) (((short) ((i << i3) & 65535)) | this.f48319);
        this.f48321 = i3 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36944(int i, int i2) {
        byte[] bArr = this.f48298;
        int i3 = this.f48297;
        int i4 = this.f48278;
        int i5 = (i4 * 2) + i3;
        bArr[i5] = (byte) (i >>> 8);
        bArr[i5 + 1] = (byte) i;
        this.f48290[i4] = (byte) i2;
        int i6 = i4 + 1;
        this.f48278 = i6;
        if (i == 0) {
            short[] sArr = this.f48301;
            int i7 = i2 * 2;
            sArr[i7] = (short) (sArr[i7] + 1);
        } else {
            this.f48305++;
            int i8 = i - 1;
            short[] sArr2 = this.f48301;
            int i9 = (C22033.f70627[i2] + 257) * 2;
            sArr2[i9] = (short) (sArr2[i9] + 1);
            short[] sArr3 = this.f48323;
            byte[] bArr2 = C22033.f70628;
            int i10 = (i8 < 256 ? bArr2[i8] : bArr2[(i8 >>> 7) + 256]) * 2;
            sArr3[i10] = (short) (sArr3[i10] + 1);
        }
        if ((i6 & 8191) == 0 && this.f48313 > 2) {
            int iM46314 = i6 * 8;
            int i11 = this.f48308 - this.f48299;
            for (int i12 = 0; i12 < 30; i12++) {
                iM46314 = C20094.m46314(C22033.f70625[i12], 5, this.f48323[i12 * 2], iM46314);
            }
            int i13 = iM46314 >>> 3;
            if (this.f48305 >= this.f48278 / 2 || i13 >= i11 / 2) {
                if (this.f48278 == this.f48314 - 1) {
                    return false;
                }
            }
        } else if (this.f48278 == this.f48314 - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36943(short[] sArr, short[] sArr2) {
        if (this.f48278 != 0) {
            int i = 0;
            do {
                byte[] bArr = this.f48298;
                int i2 = (i * 2) + this.f48297;
                int i3 = (bArr[i2 + 1] & 255) | ((bArr[i2] << 8) & 65280);
                int i4 = this.f48290[i] & 255;
                i++;
                if (i3 == 0) {
                    m36949(sArr, i4);
                } else {
                    byte b = C22033.f70627[i4];
                    m36949(sArr, b + 257);
                    int i5 = C22033.f70624[b];
                    if (i5 != 0) {
                        m36945(i4 - C22033.f70630[b], i5);
                    }
                    int i6 = i3 - 1;
                    byte[] bArr2 = C22033.f70628;
                    byte b2 = i6 < 256 ? bArr2[i6] : bArr2[(i6 >>> 7) + 256];
                    m36949(sArr2, b2);
                    int i7 = C22033.f70625[b2];
                    if (i7 != 0) {
                        m36945(i6 - C22033.f70626[b2], i7);
                    }
                }
            } while (i < this.f48278);
        }
        m36949(sArr, 256);
        this.f48306 = sArr[513];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36938() {
        int i = this.f48321;
        if (i == 16) {
            m36951(this.f48319);
            this.f48319 = (short) 0;
            this.f48321 = 0;
        } else if (i >= 8) {
            m36939((byte) this.f48319);
            this.f48319 = (short) (this.f48319 >>> 8);
            this.f48321 -= 8;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36941(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = this.f48299;
        int i5 = i4 >= 0 ? i4 : -1;
        int i6 = this.f48308 - i4;
        C22033 c22033 = this.f48291;
        C22033 c22034 = this.f48289;
        int i7 = this.f48313;
        byte[] bArr = C22033.f70623;
        if (i7 > 0) {
            if (this.f48282 == 2) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < 7) {
                    i9 += this.f48301[i8 * 2];
                    i8++;
                }
                int i10 = 0;
                while (i8 < 128) {
                    i10 += this.f48301[i8 * 2];
                    i8++;
                }
                while (i8 < 256) {
                    i9 += this.f48301[i8 * 2];
                    i8++;
                }
                this.f48282 = (byte) (i9 > (i10 >>> 2) ? 0 : 1);
            }
            c22034.m49575(this);
            c22033.m49575(this);
            m36946(this.f48301, c22034.f70632);
            m36946(this.f48323, c22033.f70632);
            this.f48279.m49575(this);
            i2 = 18;
            while (i2 >= 3 && this.f48276[(bArr[i2] * 2) + 1] == 0) {
                i2--;
            }
            int i11 = ((i2 + 1) * 3) + 14 + this.f48277;
            this.f48277 = i11;
            i = (i11 + 10) >>> 3;
            i3 = (this.f48287 + 10) >>> 3;
            if (i3 <= i) {
                i = i3;
            }
        } else {
            i = i6 + 5;
            i2 = 0;
            i3 = i;
        }
        if (i6 + 4 <= i && i5 != -1) {
            m36945(z ? 1 : 0, 3);
            int i12 = this.f48321;
            if (i12 > 8) {
                m36951(this.f48319);
            } else if (i12 > 0) {
                m36939((byte) this.f48319);
            }
            this.f48319 = (short) 0;
            this.f48321 = 0;
            this.f48306 = 8;
            m36951((short) i6);
            m36951((short) (~i6));
            m36940(i5, i6, this.f48326);
        } else if (i3 == i) {
            m36945((z ? 1 : 0) + 2, 3);
            m36943(C21328.f68724, C21328.f68723);
        } else {
            m36945((z ? 1 : 0) + 4, 3);
            int i13 = c22034.f70632;
            int i14 = c22033.f70632;
            int i15 = i2 + 1;
            m36945(i13 - 256, 5);
            m36945(i14, 5);
            m36945(i2 - 3, 4);
            for (int i16 = 0; i16 < i15; i16++) {
                m36945(this.f48276[(bArr[i16] * 2) + 1], 3);
            }
            m36954(this.f48301, i13);
            m36954(this.f48323, i14);
            m36943(this.f48301, this.f48323);
        }
        m36950();
        if (z) {
            int i17 = this.f48321;
            if (i17 > 8) {
                m36951(this.f48319);
            } else if (i17 > 0) {
                m36939((byte) this.f48319);
            }
            this.f48319 = (short) 0;
            this.f48321 = 0;
        }
        this.f48299 = this.f48308;
        this.f48294.m45836();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36952() {
        int i;
        int i2;
        C2277 c2277 = this.f48294;
        do {
            int i3 = this.f48285;
            int i4 = this.f48271;
            int i5 = this.f48308;
            int i6 = (i3 - i4) - i5;
            int i7 = 0;
            if (i6 == 0 && i5 == 0 && i4 == 0) {
                i6 = this.f48304;
            } else if (i6 == -1) {
                i6--;
            } else {
                int i8 = this.f48304;
                if (i5 >= (i8 + i8) - 262) {
                    byte[] bArr = this.f48326;
                    System.arraycopy(bArr, i8, bArr, 0, i8);
                    int i9 = this.f48288;
                    int i10 = this.f48304;
                    this.f48288 = i9 - i10;
                    this.f48308 -= i10;
                    this.f48299 -= i10;
                    int i11 = this.f48311;
                    int i12 = i11;
                    do {
                        short[] sArr = this.f48309;
                        i11--;
                        int i13 = sArr[i11] & HPKE.aead_EXPORT_ONLY;
                        i = this.f48304;
                        sArr[i11] = i13 >= i ? (short) (i13 - i) : (short) 0;
                        i12--;
                    } while (i12 != 0);
                    int i14 = i;
                    do {
                        short[] sArr2 = this.f48296;
                        i--;
                        int i15 = sArr2[i] & HPKE.aead_EXPORT_ONLY;
                        i2 = this.f48304;
                        sArr2[i] = i15 >= i2 ? (short) (i15 - i2) : (short) 0;
                        i14--;
                    } while (i14 != 0);
                    i6 += i2;
                }
            }
            int i16 = c2277.f64356;
            if (i16 == 0) {
                return;
            }
            byte[] bArr2 = this.f48326;
            int i17 = this.f48308 + this.f48271;
            if (i16 <= i6) {
                i6 = i16;
            }
            if (i6 != 0) {
                c2277.f64356 = i16 - i6;
                if (c2277.f64361.f48318 != 0) {
                    c2277.f64352.update(c2277.f64363, c2277.f64353, i6);
                }
                System.arraycopy(c2277.f64363, c2277.f64353, bArr2, i17, i6);
                c2277.f64353 += i6;
                c2277.f64354 += (long) i6;
                i7 = i6;
            }
            int i18 = this.f48271 + i7;
            this.f48271 = i18;
            if (i18 >= 3) {
                byte[] bArr3 = this.f48326;
                int i19 = this.f48308;
                int i20 = bArr3[i19] & 255;
                this.f48317 = i20;
                this.f48317 = ((bArr3[i19 + 1] & 255) ^ (i20 << this.f48307)) & this.f48293;
            }
            if (i18 >= 262) {
                return;
            }
        } while (c2277.f64356 != 0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m36948(int i) {
        byte b;
        int i2;
        byte[] bArr;
        int i3;
        int i4 = this.f48320;
        int i5 = this.f48308;
        int i6 = this.f48324;
        int i7 = this.f48304 - 262;
        int i8 = i5 > i7 ? i5 - i7 : 0;
        int i9 = this.f48280;
        int i10 = this.f48310;
        int i11 = i5 + 258;
        byte[] bArr2 = this.f48326;
        int i12 = i5 + i6;
        byte b2 = bArr2[i12 - 1];
        byte b3 = bArr2[i12];
        if (i6 >= this.f48273) {
            i4 >>= 2;
        }
        int i13 = this.f48271;
        if (i9 > i13) {
            i9 = i13;
        }
        byte b4 = b3;
        int i14 = i6;
        int i15 = i4;
        int i16 = i;
        while (true) {
            byte[] bArr3 = this.f48326;
            int i17 = i16 + i14;
            if (bArr3[i17] == b4 && bArr3[i17 - 1] == b2 && bArr3[i16] == bArr3[i5] && bArr3[i16 + 1] == bArr3[i5 + 1]) {
                int i18 = i5 + 2;
                int i19 = i16 + 2;
                while (true) {
                    bArr = this.f48326;
                    i3 = i18 + 1;
                    b = b4;
                    if (bArr[i3] != bArr[i19 + 1]) {
                        break;
                    }
                    i3 = i18 + 2;
                    if (bArr[i3] != bArr[i19 + 2]) {
                        break;
                    }
                    i3 = i18 + 3;
                    if (bArr[i3] != bArr[i19 + 3]) {
                        break;
                    }
                    i3 = i18 + 4;
                    if (bArr[i3] != bArr[i19 + 4]) {
                        break;
                    }
                    i3 = i18 + 5;
                    if (bArr[i3] != bArr[i19 + 5]) {
                        break;
                    }
                    i3 = i18 + 6;
                    if (bArr[i3] != bArr[i19 + 6]) {
                        break;
                    }
                    i3 = i18 + 7;
                    if (bArr[i3] != bArr[i19 + 7]) {
                        break;
                    }
                    i18 += 8;
                    i19 += 8;
                    if (bArr[i18] != bArr[i19] || i18 >= i11) {
                        i3 = i18;
                        break;
                    }
                    b4 = b;
                }
                i2 = 258 - (i11 - i3);
                if (i2 > i14) {
                    this.f48288 = i16;
                    if (i2 >= i9) {
                        break;
                    }
                    int i20 = i5 + i2;
                    b2 = bArr[i20 - 1];
                    b4 = bArr[i20];
                    i14 = i2;
                }
                i16 = this.f48296[i16 & i10] & HPKE.aead_EXPORT_ONLY;
                if (i16 > i8 || (i15 = i15 - 1) == 0) {
                    i2 = i14;
                    break;
                }
            } else {
                b = b4;
            }
            b4 = b;
            i16 = this.f48296[i16 & i10] & HPKE.aead_EXPORT_ONLY;
            if (i16 > i8) {
            }
            i2 = i14;
            break;
        }
        int i21 = this.f48271;
        return i2 <= i21 ? i2 : i21;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36937(int i) {
        C2277 c2277 = this.f48294;
        c2277.f64357 = null;
        if (i == -1) {
            i = 6;
        }
        if (i < 0 || i > 9) {
            return -2;
        }
        c2277.f64361 = this;
        this.f48318 = 1;
        this.f48312 = 15;
        this.f48304 = 32768;
        this.f48310 = EnumC5983.f18409;
        this.f48311 = 32768;
        this.f48293 = EnumC5983.f18409;
        this.f48307 = 5;
        this.f48326 = new byte[65536];
        this.f48296 = new short[32768];
        this.f48309 = new short[32768];
        this.f48314 = 16384;
        this.f48298 = new byte[49152];
        this.f48292 = 49152;
        this.f48297 = 16384;
        this.f48290 = new byte[16384];
        this.f48313 = i;
        c2277.f64358 = 0L;
        c2277.f64354 = 0L;
        c2277.f64357 = null;
        this.f48300 = 0;
        this.f48283 = 0;
        this.f48274 = 42;
        c2277.f64352.reset();
        this.f48275 = 0;
        C22033 c22033 = this.f48289;
        c22033.f70631 = this.f48301;
        c22033.f70633 = C21328.f68726;
        C22033 c22034 = this.f48291;
        c22034.f70631 = this.f48323;
        c22034.f70633 = C21328.f68727;
        C22033 c22035 = this.f48279;
        c22035.f70631 = this.f48276;
        c22035.f70633 = C21328.f68725;
        this.f48319 = (short) 0;
        this.f48321 = 0;
        this.f48306 = 8;
        m36950();
        this.f48285 = this.f48304 * 2;
        this.f48309[this.f48311 - 1] = 0;
        for (int i2 = 0; i2 < this.f48311 - 1; i2++) {
            this.f48309[i2] = 0;
        }
        C8627 c8627 = f48270[this.f48313];
        this.f48322 = c8627.f26348;
        this.f48273 = c8627.f26345;
        this.f48280 = c8627.f26347;
        this.f48320 = c8627.f26346;
        this.f48308 = 0;
        this.f48299 = 0;
        this.f48271 = 0;
        this.f48324 = 2;
        this.f48272 = 2;
        this.f48281 = 0;
        this.f48317 = 0;
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0260  */
    /* JADX WARN: Code duplicated, block: B:138:0x0264  */
    /* JADX WARN: Code duplicated, block: B:140:0x0273  */
    /* JADX WARN: Code duplicated, block: B:144:0x0286  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x034d  */
    /* JADX WARN: Code duplicated, block: B:172:0x036b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:192:0x03be  */
    /* JADX WARN: Code duplicated, block: B:195:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0399 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m36947() {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        boolean zM36944;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM36948;
        C18505 c18505;
        int i11;
        String[] strArr = f48269;
        C2277 c2277 = this.f48294;
        if (c2277.f64362 == null || ((c2277.f64363 == null && c2277.f64356 != 0) || (i = this.f48274) == 666)) {
            c2277.f64357 = strArr[4];
            return -2;
        }
        if (c2277.f64359 == 0) {
            c2277.f64357 = strArr[7];
            return -5;
        }
        int i12 = this.f48275;
        this.f48275 = 1;
        if (i == 42) {
            if (this.f48318 == 2) {
                synchronized (this) {
                    if (this.f48286 == null) {
                        this.f48286 = new C18505();
                    }
                    c18505 = this.f48286;
                }
                int i13 = c18505.f57352 != null ? 4 : 0;
                if (c18505.f57349 != null) {
                    i13 |= 8;
                }
                if (c18505.f57351 != null) {
                    i13 |= 16;
                }
                int i14 = this.f48313;
                if (i14 == 1) {
                    i11 = 4;
                } else {
                    i11 = i14 == 9 ? 2 : 0;
                }
                m36951(-29921);
                m36939((byte) 8);
                m36939((byte) i13);
                m36939((byte) c18505.f57350);
                m36939((byte) (c18505.f57350 >> 8));
                m36939((byte) (c18505.f57350 >> 16));
                m36939((byte) (c18505.f57350 >> 24));
                m36939((byte) i11);
                m36939((byte) c18505.f57348);
                byte[] bArr = c18505.f57352;
                if (bArr != null) {
                    m36939((byte) bArr.length);
                    m36939((byte) (c18505.f57352.length >> 8));
                    byte[] bArr2 = c18505.f57352;
                    m36940(0, bArr2.length, bArr2);
                }
                byte[] bArr3 = c18505.f57349;
                if (bArr3 != null) {
                    m36940(0, bArr3.length, bArr3);
                    m36939((byte) 0);
                }
                byte[] bArr4 = c18505.f57351;
                if (bArr4 != null) {
                    m36940(0, bArr4.length, bArr4);
                    m36939((byte) 0);
                }
                this.f48274 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                c2277.f64352.reset();
            } else {
                int i15 = (((this.f48312 - 8) << 4) + 8) << 8;
                int i16 = ((this.f48313 - 1) & 255) >> 1;
                if (i16 > 3) {
                    i16 = 3;
                }
                int i17 = i15 | (i16 << 6);
                if (this.f48308 != 0) {
                    i17 |= 32;
                }
                this.f48274 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                m36953((31 - (i17 % 31)) + i17);
                if (this.f48308 != 0) {
                    long value = c2277.f64352.getValue();
                    m36953((int) (value >>> 16));
                    m36953((int) (65535 & value));
                }
                c2277.f64352.reset();
            }
        }
        if (this.f48300 != 0) {
            c2277.m45836();
            if (c2277.f64359 == 0) {
                this.f48275 = -1;
                return 0;
            }
        } else if (c2277.f64356 == 0 && 1 <= i12) {
            c2277.f64357 = strArr[7];
            return -5;
        }
        int i18 = this.f48274;
        if (i18 == 666 && c2277.f64356 != 0) {
            c2277.f64357 = strArr[7];
            return -5;
        }
        if (c2277.f64356 != 0 || this.f48271 != 0 || i18 != 666) {
            int i19 = f48270[this.f48313].f26344;
            int i20 = 5;
            short s = HPKE.aead_EXPORT_ONLY;
            if (i19 == 0) {
                int i21 = this.f48292 - 5;
                int i22 = 65535 > i21 ? i21 : 65535;
                while (true) {
                    if (this.f48271 <= 1) {
                        m36952();
                        if (this.f48271 == 0) {
                            m36941(false);
                            if (c2277.f64359 != 0) {
                                b = 1;
                            }
                        } else {
                            i2 = this.f48308 + this.f48271;
                            this.f48308 = i2;
                            this.f48271 = 0;
                            i3 = this.f48299 + i22;
                            if (i2 != 0 || i2 >= i3) {
                                this.f48271 = i2 - i3;
                                this.f48308 = i3;
                                m36941(false);
                                if (c2277.f64359 != 0) {
                                    if (this.f48308 - this.f48299 >= this.f48304 - 262) {
                                        m36941(false);
                                        if (c2277.f64359 == 0) {
                                        }
                                    }
                                }
                            } else if (this.f48308 - this.f48299 >= this.f48304 - 262) {
                                m36941(false);
                                if (c2277.f64359 == 0) {
                                }
                            }
                        }
                    } else {
                        i2 = this.f48308 + this.f48271;
                        this.f48308 = i2;
                        this.f48271 = 0;
                        i3 = this.f48299 + i22;
                        if (i2 != 0) {
                            this.f48271 = i2 - i3;
                            this.f48308 = i3;
                            m36941(false);
                            if (c2277.f64359 != 0) {
                                if (this.f48308 - this.f48299 >= this.f48304 - 262) {
                                    m36941(false);
                                    if (c2277.f64359 == 0) {
                                    }
                                }
                            }
                        } else {
                            this.f48271 = i2 - i3;
                            this.f48308 = i3;
                            m36941(false);
                            if (c2277.f64359 != 0) {
                                if (this.f48308 - this.f48299 >= this.f48304 - 262) {
                                    m36941(false);
                                    if (c2277.f64359 == 0) {
                                    }
                                }
                            }
                        }
                    }
                    b = 0;
                }
            } else if (i19 == 1) {
                int i23 = 0;
                while (true) {
                    if (this.f48271 < 262) {
                        m36952();
                        if (this.f48271 == 0) {
                            m36941(false);
                            if (c2277.f64359 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f48271 >= 3) {
                                int i24 = this.f48317 << this.f48307;
                                byte[] bArr5 = this.f48326;
                                int i25 = this.f48308;
                                int i26 = (i24 ^ (bArr5[i25 + 2] & 255)) & this.f48293;
                                this.f48317 = i26;
                                short[] sArr = this.f48309;
                                short s2 = sArr[i26];
                                int i27 = s2 & HPKE.aead_EXPORT_ONLY;
                                this.f48296[this.f48310 & i25] = s2;
                                sArr[i26] = (short) i25;
                                i23 = i27;
                            }
                            if (i23 != 0 && ((this.f48308 - i23) & 65535) <= this.f48304 - 262) {
                                this.f48272 = m36948(i23);
                            }
                            i4 = this.f48272;
                            if (i4 >= 3) {
                                zM36944 = m36944(this.f48308 - this.f48288, i4 - 3);
                                int i28 = this.f48271;
                                i5 = this.f48272;
                                int i29 = i28 - i5;
                                this.f48271 = i29;
                                if (i5 <= this.f48322 || i29 < 3) {
                                    int i30 = this.f48308 + i5;
                                    this.f48308 = i30;
                                    this.f48272 = 0;
                                    byte[] bArr6 = this.f48326;
                                    int i31 = bArr6[i30] & 255;
                                    this.f48317 = i31;
                                    this.f48317 = ((bArr6[i30 + 1] & 255) ^ (i31 << this.f48307)) & this.f48293;
                                } else {
                                    this.f48272 = i5 - 1;
                                    do {
                                        i6 = this.f48308;
                                        int i32 = i6 + 1;
                                        this.f48308 = i32;
                                        int i33 = ((this.f48317 << this.f48307) ^ (this.f48326[i6 + 3] & 255)) & this.f48293;
                                        this.f48317 = i33;
                                        short[] sArr2 = this.f48309;
                                        short s3 = sArr2[i33];
                                        i7 = s3 & HPKE.aead_EXPORT_ONLY;
                                        this.f48296[this.f48310 & i32] = s3;
                                        sArr2[i33] = (short) i32;
                                        i8 = this.f48272 - 1;
                                        this.f48272 = i8;
                                    } while (i8 != 0);
                                    this.f48308 = i6 + 2;
                                    i23 = i7;
                                }
                            } else {
                                zM36944 = m36944(0, this.f48326[this.f48308] & 255);
                                this.f48271--;
                                this.f48308++;
                            }
                            if (zM36944) {
                                m36941(false);
                                if (c2277.f64359 == 0) {
                                }
                            }
                        }
                    } else {
                        if (this.f48271 >= 3) {
                            int i210 = this.f48317 << this.f48307;
                            byte[] bArr7 = this.f48326;
                            int i211 = this.f48308;
                            int i212 = (i210 ^ (bArr7[i211 + 2] & 255)) & this.f48293;
                            this.f48317 = i212;
                            short[] sArr3 = this.f48309;
                            short s4 = sArr3[i212];
                            int i213 = s4 & HPKE.aead_EXPORT_ONLY;
                            this.f48296[this.f48310 & i211] = s4;
                            sArr3[i212] = (short) i211;
                            i23 = i213;
                        }
                        if (i23 != 0) {
                            this.f48272 = m36948(i23);
                        }
                        i4 = this.f48272;
                        if (i4 >= 3) {
                            zM36944 = m36944(this.f48308 - this.f48288, i4 - 3);
                            int i214 = this.f48271;
                            i5 = this.f48272;
                            int i215 = i214 - i5;
                            this.f48271 = i215;
                            if (i5 <= this.f48322) {
                                int i34 = this.f48308 + i5;
                                this.f48308 = i34;
                                this.f48272 = 0;
                                byte[] bArr8 = this.f48326;
                                int i35 = bArr8[i34] & 255;
                                this.f48317 = i35;
                                this.f48317 = ((bArr8[i34 + 1] & 255) ^ (i35 << this.f48307)) & this.f48293;
                            } else {
                                int i36 = this.f48308 + i5;
                                this.f48308 = i36;
                                this.f48272 = 0;
                                byte[] bArr9 = this.f48326;
                                int i37 = bArr9[i36] & 255;
                                this.f48317 = i37;
                                this.f48317 = ((bArr9[i36 + 1] & 255) ^ (i37 << this.f48307)) & this.f48293;
                            }
                        } else {
                            zM36944 = m36944(0, this.f48326[this.f48308] & 255);
                            this.f48271--;
                            this.f48308++;
                        }
                        if (zM36944) {
                            m36941(false);
                            if (c2277.f64359 == 0) {
                            }
                        }
                    }
                    b = 0;
                }
            } else if (i19 != 2) {
                b = -1;
            } else {
                int i38 = 0;
                while (true) {
                    if (this.f48271 < 262) {
                        m36952();
                        if (this.f48271 == 0) {
                            if (this.f48281 != 0) {
                                m36944(0, this.f48326[this.f48308 - 1] & 255);
                                this.f48281 = 0;
                            }
                            m36941(false);
                            if (c2277.f64359 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f48271 >= 3) {
                                int i39 = this.f48317 << this.f48307;
                                byte[] bArr10 = this.f48326;
                                int i40 = this.f48308;
                                int i41 = (i39 ^ (bArr10[i40 + 2] & 255)) & this.f48293;
                                this.f48317 = i41;
                                short[] sArr4 = this.f48309;
                                short s5 = sArr4[i41];
                                this.f48296[this.f48310 & i40] = s5;
                                sArr4[i41] = (short) i40;
                                i38 = s5 & s;
                            }
                            int i42 = this.f48272;
                            this.f48324 = i42;
                            this.f48302 = this.f48288;
                            this.f48272 = 2;
                            if (i38 != 0 && i42 < this.f48322 && ((this.f48308 - i38) & s) <= this.f48304 - 262) {
                                iM36948 = m36948(i38);
                                this.f48272 = iM36948;
                                if (iM36948 <= i20 && iM36948 == 3 && this.f48308 - this.f48288 > 4096) {
                                    this.f48272 = 2;
                                }
                            }
                            i9 = this.f48324;
                            if (i9 >= 3 || this.f48272 > i9) {
                                if (this.f48281 != 0) {
                                    if (m36944(0, this.f48326[this.f48308 - 1] & 255)) {
                                        m36941(false);
                                    }
                                    this.f48308++;
                                    this.f48271--;
                                    if (c2277.f64359 == 0) {
                                    }
                                } else {
                                    this.f48281 = 1;
                                    this.f48308++;
                                    this.f48271--;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            } else {
                                int i43 = this.f48308;
                                int i44 = (this.f48271 + i43) - 3;
                                boolean zM36945 = m36944((i43 - 1) - this.f48302, i9 - 3);
                                int i45 = this.f48271;
                                int i46 = this.f48324;
                                this.f48271 = i45 - (i46 - 1);
                                this.f48324 = i46 - 2;
                                while (true) {
                                    i10 = this.f48308;
                                    int i47 = i10 + 1;
                                    this.f48308 = i47;
                                    if (i47 <= i44) {
                                        int i48 = ((this.f48317 << this.f48307) ^ (this.f48326[i10 + 3] & 255)) & this.f48293;
                                        this.f48317 = i48;
                                        short[] sArr5 = this.f48309;
                                        short s6 = sArr5[i48];
                                        this.f48296[this.f48310 & i47] = s6;
                                        sArr5[i48] = (short) i47;
                                        i38 = s6 & s;
                                    }
                                    int i49 = this.f48324 - 1;
                                    this.f48324 = i49;
                                    if (i49 == 0) {
                                        break;
                                    }
                                    s = HPKE.aead_EXPORT_ONLY;
                                }
                                this.f48281 = 0;
                                this.f48272 = 2;
                                this.f48308 = i10 + 2;
                                if (zM36945) {
                                    m36941(false);
                                    if (c2277.f64359 == 0) {
                                    }
                                } else {
                                    continue;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            }
                        }
                    } else {
                        if (this.f48271 >= 3) {
                            int i310 = this.f48317 << this.f48307;
                            byte[] bArr11 = this.f48326;
                            int i410 = this.f48308;
                            int i411 = (i310 ^ (bArr11[i410 + 2] & 255)) & this.f48293;
                            this.f48317 = i411;
                            short[] sArr6 = this.f48309;
                            short s7 = sArr6[i411];
                            this.f48296[this.f48310 & i410] = s7;
                            sArr6[i411] = (short) i410;
                            i38 = s7 & s;
                        }
                        int i412 = this.f48272;
                        this.f48324 = i412;
                        this.f48302 = this.f48288;
                        this.f48272 = 2;
                        if (i38 != 0) {
                            iM36948 = m36948(i38);
                            this.f48272 = iM36948;
                            if (iM36948 <= i20) {
                                this.f48272 = 2;
                            }
                        }
                        i9 = this.f48324;
                        if (i9 >= 3) {
                            if (this.f48281 != 0) {
                                if (m36944(0, this.f48326[this.f48308 - 1] & 255)) {
                                    m36941(false);
                                }
                                this.f48308++;
                                this.f48271--;
                                if (c2277.f64359 == 0) {
                                }
                            } else {
                                this.f48281 = 1;
                                this.f48308++;
                                this.f48271--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        } else {
                            if (this.f48281 != 0) {
                                if (m36944(0, this.f48326[this.f48308 - 1] & 255)) {
                                    m36941(false);
                                }
                                this.f48308++;
                                this.f48271--;
                                if (c2277.f64359 == 0) {
                                }
                            } else {
                                this.f48281 = 1;
                                this.f48308++;
                                this.f48271--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        }
                    }
                    b = 0;
                }
            }
            if (b == 2 || b == 3) {
                this.f48274 = 666;
            }
            if (b == 0 || b == 2) {
                if (c2277.f64359 == 0) {
                    this.f48275 = -1;
                }
            } else if (b == 1) {
                m36945(2, 3);
                short[] sArr7 = C21328.f68724;
                m36949(sArr7, 256);
                m36938();
                if ((this.f48306 + 11) - this.f48321 < 9) {
                    m36945(2, 3);
                    m36949(sArr7, 256);
                    m36938();
                }
                this.f48306 = 7;
                c2277.m45836();
                if (c2277.f64359 == 0) {
                    this.f48275 = -1;
                    return 0;
                }
            }
        }
        return 0;
    }

    public final Object clone() {
        C15681 c15681 = (C15681) super.clone();
        byte[] bArr = c15681.f48298;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        c15681.f48298 = bArr2;
        byte[] bArr3 = c15681.f48290;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length2);
        c15681.f48290 = bArr4;
        byte[] bArr5 = c15681.f48326;
        int length3 = bArr5.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(bArr5, 0, bArr6, 0, length3);
        c15681.f48326 = bArr6;
        c15681.f48296 = m36936(c15681.f48296);
        c15681.f48309 = m36936(c15681.f48309);
        c15681.f48301 = m36936(c15681.f48301);
        c15681.f48323 = m36936(c15681.f48323);
        c15681.f48276 = m36936(c15681.f48276);
        c15681.f48315 = m36936(c15681.f48315);
        c15681.f48316 = m36936(c15681.f48316);
        int[] iArr = c15681.f48303;
        int length4 = iArr.length;
        int[] iArr2 = new int[length4];
        System.arraycopy(iArr, 0, iArr2, 0, length4);
        c15681.f48303 = iArr2;
        byte[] bArr7 = c15681.f48295;
        int length5 = bArr7.length;
        byte[] bArr8 = new byte[length5];
        System.arraycopy(bArr7, 0, bArr8, 0, length5);
        c15681.f48295 = bArr8;
        c15681.f48289.f70631 = c15681.f48301;
        c15681.f48291.f70631 = c15681.f48323;
        c15681.f48279.f70631 = c15681.f48276;
        C18505 c18505 = c15681.f48286;
        if (c18505 != null) {
            c15681.f48286 = (C18505) c18505.clone();
        }
        return c15681;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short[] m36936(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }
}
