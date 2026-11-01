package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܺۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1DD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17271 implements Cloneable {

    /* JADX INFO: renamed from: ֡֫ */
    public int f51409;

    /* JADX INFO: renamed from: ֨֫ */
    public int f51410;

    /* JADX INFO: renamed from: ֫֫ */
    public int f51411;

    /* JADX INFO: renamed from: ֫ۧ */
    public int f51412;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f51413;

    /* JADX INFO: renamed from: ۗ */
    public short[] f51414;

    /* JADX INFO: renamed from: ۗ֫ */
    public int f51415;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f51416;

    /* JADX INFO: renamed from: ۙ */
    public C23308 f51417;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f51418;

    /* JADX INFO: renamed from: ۚ֫ */
    public int f51419;

    /* JADX INFO: renamed from: ۛ */
    public byte f51420;

    /* JADX INFO: renamed from: ۛ֫ */
    public int f51421;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f51422;

    /* JADX INFO: renamed from: ۜۧ */
    public int f51423;

    /* JADX INFO: renamed from: ۟ */
    public C19955 f51424;

    /* JADX INFO: renamed from: ۟֫ */
    public int f51425;

    /* JADX INFO: renamed from: ۠֫ */
    public int f51426;

    /* JADX INFO: renamed from: ۡ֫ */
    public C23308 f51427;

    /* JADX INFO: renamed from: ۢ֫ */
    public byte[] f51428;

    /* JADX INFO: renamed from: ۤ */
    public C23308 f51429;

    /* JADX INFO: renamed from: ۤ֫ */
    public int f51430;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f51431;

    /* JADX INFO: renamed from: ۧۧ */
    public C4532 f51432;

    /* JADX INFO: renamed from: ۨ */
    public byte[] f51433;

    /* JADX INFO: renamed from: ۨ֫ */
    public short[] f51434;

    /* JADX INFO: renamed from: ۫ */
    public int f51435;

    /* JADX INFO: renamed from: ۫֫ */
    public byte[] f51436;

    /* JADX INFO: renamed from: ۬ */
    public int f51437;

    /* JADX INFO: renamed from: ۬֫ */
    public int f51438;

    /* JADX INFO: renamed from: ܰ */
    public short[] f51439;

    /* JADX INFO: renamed from: ܰ֫ */
    public int f51440;

    /* JADX INFO: renamed from: ܳ֫ */
    public int[] f51441;

    /* JADX INFO: renamed from: ܳۧ */
    public int f51442;

    /* JADX INFO: renamed from: ܶ֫ */
    public int f51443;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f51444;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f51445;

    /* JADX INFO: renamed from: ܽۧ */
    public int f51446;

    /* JADX INFO: renamed from: ܿ֫ */
    public short[] f51447;

    /* JADX INFO: renamed from: ܿۧ */
    public int f51448;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f51449;

    /* JADX INFO: renamed from: ᩳۧ */
    public int f51450;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f51451;

    /* JADX INFO: renamed from: ᩵֫ */
    public int f51452;

    /* JADX INFO: renamed from: ᩶ */
    public short[] f51453;

    /* JADX INFO: renamed from: ᩶֫ */
    public short[] f51454;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f51455;

    /* JADX INFO: renamed from: ᩷ۧ */
    public int f51456;

    /* JADX INFO: renamed from: ᩸ */
    public short f51457;

    /* JADX INFO: renamed from: ᩸֫ */
    public int f51458;

    /* JADX INFO: renamed from: ᩹ */
    public int f51459;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f51460;

    /* JADX INFO: renamed from: ᩺ */
    public short[] f51461;

    /* JADX INFO: renamed from: ᩺֫ */
    public int f51462;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f51463;

    /* JADX INFO: renamed from: ᩻ۧ */
    public byte[] f51464;

    /* JADX INFO: renamed from: ۢۧ */
    public static final C10567[] f51408 = {new C10567(0, 0, 0, 0, 0), new C10567(4, 4, 8, 4, 1), new C10567(4, 5, 16, 8, 1), new C10567(4, 6, 32, 32, 1), new C10567(4, 4, 16, 16, 2), new C10567(8, 16, 32, 32, 2), new C10567(8, 16, 128, 128, 2), new C10567(8, 32, 128, 256, 2), new C10567(32, 128, 258, 1024, 2), new C10567(32, 258, 258, 4096, 2)};

    /* JADX INFO: renamed from: ۡۧ */
    public static final String[] f51407 = {"need dictionary", "stream end", "", "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", ""};

    /* JADX INFO: renamed from: ܿ */
    public final void m39116() {
        for (int i = 0; i < 286; i++) {
            this.f51439[i * 2] = 0;
        }
        for (int i2 = 0; i2 < 30; i2++) {
            this.f51461[i2 * 2] = 0;
        }
        for (int i3 = 0; i3 < 19; i3++) {
            this.f51414[i3 * 2] = 0;
        }
        this.f51439[512] = 1;
        this.f51425 = 0;
        this.f51415 = 0;
        this.f51443 = 0;
        this.f51416 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39108(short[] sArr, int i) {
        int i2 = this.f51441[i];
        int i3 = i << 1;
        while (true) {
            int i4 = this.f51463;
            if (i3 > i4) {
                break;
            }
            if (i3 < i4) {
                int[] iArr = this.f51441;
                int i5 = i3 + 1;
                int i6 = iArr[i5];
                int i7 = iArr[i3];
                byte[] bArr = this.f51433;
                short s = sArr[i6 * 2];
                short s2 = sArr[i7 * 2];
                if (s < s2 || (s == s2 && bArr[i6] <= bArr[i7])) {
                    i3 = i5;
                }
            }
            int[] iArr2 = this.f51441;
            int i8 = iArr2[i3];
            byte[] bArr2 = this.f51433;
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
        this.f51441[i] = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39112(short[] sArr, int i) {
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
        sArr[C21466.m48630(i, 1, 2, 1)] = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 <= i) {
            i4++;
            short s3 = sArr[(i4 * 2) + 1];
            i5++;
            if (i5 >= i2 || s != s3) {
                if (i5 < i3) {
                    short[] sArr2 = this.f51414;
                    int i6 = s * 2;
                    sArr2[i6] = (short) (sArr2[i6] + ((short) i5));
                } else if (s != 0) {
                    if (s != s2) {
                        short[] sArr3 = this.f51414;
                        int i7 = s * 2;
                        sArr3[i7] = (short) (sArr3[i7] + 1);
                    }
                    short[] sArr4 = this.f51414;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i5 <= 10) {
                    short[] sArr5 = this.f51414;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.f51414;
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

    /* JADX INFO: renamed from: ᩳ */
    public final void m39120(short[] sArr, int i) {
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
                        m39115(this.f51414, s);
                        i7--;
                    } while (i7 != 0);
                } else if (s != 0) {
                    if (s != s2) {
                        m39115(this.f51414, s);
                    } else {
                        i6 = i7;
                    }
                    m39115(this.f51414, 16);
                    m39111(i6 - 3, 2);
                } else if (i7 <= 10) {
                    m39115(this.f51414, 17);
                    m39111(i6 - 2, 3);
                } else {
                    m39115(this.f51414, 18);
                    m39111(i6 - 10, 7);
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

    /* JADX INFO: renamed from: ֫ */
    public final void m39106(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f51436, this.f51438, i2);
        this.f51438 += i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39105(byte b) {
        byte[] bArr = this.f51436;
        int i = this.f51438;
        this.f51438 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m39117(int i) {
        m39105((byte) i);
        m39105((byte) (i >>> 8));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39119(int i) {
        m39105((byte) (i >> 8));
        m39105((byte) i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39115(short[] sArr, int i) {
        int i2 = i * 2;
        m39111(sArr[i2] & HPKE.aead_EXPORT_ONLY, sArr[i2 + 1] & HPKE.aead_EXPORT_ONLY);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39111(int i, int i2) {
        int i3 = this.f51459;
        if (i3 > 16 - i2) {
            short s = (short) (((short) ((i << i3) & 65535)) | this.f51457);
            this.f51457 = s;
            m39117(s);
            int i4 = this.f51459;
            this.f51457 = (short) (i >>> (16 - i4));
            this.f51459 = (i2 - 16) + i4;
            return;
        }
        this.f51457 = (short) (((short) ((i << i3) & 65535)) | this.f51457);
        this.f51459 = i3 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m39110(int i, int i2) {
        byte[] bArr = this.f51436;
        int i3 = this.f51435;
        int i4 = this.f51416;
        int i5 = (i4 * 2) + i3;
        bArr[i5] = (byte) (i >>> 8);
        bArr[i5 + 1] = (byte) i;
        this.f51428[i4] = (byte) i2;
        int i6 = i4 + 1;
        this.f51416 = i6;
        if (i == 0) {
            short[] sArr = this.f51439;
            int i7 = i2 * 2;
            sArr[i7] = (short) (sArr[i7] + 1);
        } else {
            this.f51443++;
            int i8 = i - 1;
            short[] sArr2 = this.f51439;
            int i9 = (C23308.f73344[i2] + 257) * 2;
            sArr2[i9] = (short) (sArr2[i9] + 1);
            short[] sArr3 = this.f51461;
            byte[] bArr2 = C23308.f73345;
            int i10 = (i8 < 256 ? bArr2[i8] : bArr2[(i8 >>> 7) + 256]) * 2;
            sArr3[i10] = (short) (sArr3[i10] + 1);
        }
        if ((i6 & 8191) == 0 && this.f51451 > 2) {
            int iM48630 = i6 * 8;
            int i11 = this.f51446 - this.f51437;
            for (int i12 = 0; i12 < 30; i12++) {
                iM48630 = C21466.m48630(C23308.f73342[i12], 5, this.f51461[i12 * 2], iM48630);
            }
            int i13 = iM48630 >>> 3;
            if (this.f51443 >= this.f51416 / 2 || i13 >= i11 / 2) {
                if (this.f51416 == this.f51452 - 1) {
                    return false;
                }
            }
        } else if (this.f51416 == this.f51452 - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39109(short[] sArr, short[] sArr2) {
        if (this.f51416 != 0) {
            int i = 0;
            do {
                byte[] bArr = this.f51436;
                int i2 = (i * 2) + this.f51435;
                int i3 = (bArr[i2 + 1] & 255) | ((bArr[i2] << 8) & 65280);
                int i4 = this.f51428[i] & 255;
                i++;
                if (i3 == 0) {
                    m39115(sArr, i4);
                } else {
                    byte b = C23308.f73344[i4];
                    m39115(sArr, b + 257);
                    int i5 = C23308.f73341[b];
                    if (i5 != 0) {
                        m39111(i4 - C23308.f73347[b], i5);
                    }
                    int i6 = i3 - 1;
                    byte[] bArr2 = C23308.f73345;
                    byte b2 = i6 < 256 ? bArr2[i6] : bArr2[(i6 >>> 7) + 256];
                    m39115(sArr2, b2);
                    int i7 = C23308.f73342[b2];
                    if (i7 != 0) {
                        m39111(i6 - C23308.f73343[b2], i7);
                    }
                }
            } while (i < this.f51416);
        }
        m39115(sArr, 256);
        this.f51444 = sArr[513];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39104() {
        int i = this.f51459;
        if (i == 16) {
            m39117(this.f51457);
            this.f51457 = (short) 0;
            this.f51459 = 0;
        } else if (i >= 8) {
            m39105((byte) this.f51457);
            this.f51457 = (short) (this.f51457 >>> 8);
            this.f51459 -= 8;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39107(boolean z) {
        int i;
        int i2;
        int i3;
        int i4 = this.f51437;
        int i5 = i4 >= 0 ? i4 : -1;
        int i6 = this.f51446 - i4;
        C23308 c23308 = this.f51429;
        C23308 c23309 = this.f51427;
        int i7 = this.f51451;
        byte[] bArr = C23308.f73340;
        if (i7 > 0) {
            if (this.f51420 == 2) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < 7) {
                    i9 += this.f51439[i8 * 2];
                    i8++;
                }
                int i10 = 0;
                while (i8 < 128) {
                    i10 += this.f51439[i8 * 2];
                    i8++;
                }
                while (i8 < 256) {
                    i9 += this.f51439[i8 * 2];
                    i8++;
                }
                this.f51420 = (byte) (i9 > (i10 >>> 2) ? 0 : 1);
            }
            c23309.m51911(this);
            c23308.m51911(this);
            m39112(this.f51439, c23309.f73349);
            m39112(this.f51461, c23308.f73349);
            this.f51417.m51911(this);
            i2 = 18;
            while (i2 >= 3 && this.f51414[(bArr[i2] * 2) + 1] == 0) {
                i2--;
            }
            int i11 = ((i2 + 1) * 3) + 14 + this.f51415;
            this.f51415 = i11;
            i = (i11 + 10) >>> 3;
            i3 = (this.f51425 + 10) >>> 3;
            if (i3 <= i) {
                i = i3;
            }
        } else {
            i = i6 + 5;
            i2 = 0;
            i3 = i;
        }
        if (i6 + 4 <= i && i5 != -1) {
            m39111(z ? 1 : 0, 3);
            int i12 = this.f51459;
            if (i12 > 8) {
                m39117(this.f51457);
            } else if (i12 > 0) {
                m39105((byte) this.f51457);
            }
            this.f51457 = (short) 0;
            this.f51459 = 0;
            this.f51444 = 8;
            m39117((short) i6);
            m39117((short) (~i6));
            m39106(i5, i6, this.f51464);
        } else if (i3 == i) {
            m39111((z ? 1 : 0) + 2, 3);
            m39109(C22638.f71418, C22638.f71417);
        } else {
            m39111((z ? 1 : 0) + 4, 3);
            int i13 = c23309.f73349;
            int i14 = c23308.f73349;
            int i15 = i2 + 1;
            m39111(i13 - 256, 5);
            m39111(i14, 5);
            m39111(i2 - 3, 4);
            for (int i16 = 0; i16 < i15; i16++) {
                m39111(this.f51414[(bArr[i16] * 2) + 1], 3);
            }
            m39120(this.f51439, i13);
            m39120(this.f51461, i14);
            m39109(this.f51439, this.f51461);
        }
        m39116();
        if (z) {
            int i17 = this.f51459;
            if (i17 > 8) {
                m39117(this.f51457);
            } else if (i17 > 0) {
                m39105((byte) this.f51457);
            }
            this.f51457 = (short) 0;
            this.f51459 = 0;
        }
        this.f51437 = this.f51446;
        this.f51432.m48148();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m39118() {
        int i;
        int i2;
        C4532 c4532 = this.f51432;
        do {
            int i3 = this.f51423;
            int i4 = this.f51409;
            int i5 = this.f51446;
            int i6 = (i3 - i4) - i5;
            int i7 = 0;
            if (i6 == 0 && i5 == 0 && i4 == 0) {
                i6 = this.f51442;
            } else if (i6 == -1) {
                i6--;
            } else {
                int i8 = this.f51442;
                if (i5 >= (i8 + i8) - 262) {
                    byte[] bArr = this.f51464;
                    System.arraycopy(bArr, i8, bArr, 0, i8);
                    int i9 = this.f51426;
                    int i10 = this.f51442;
                    this.f51426 = i9 - i10;
                    this.f51446 -= i10;
                    this.f51437 -= i10;
                    int i11 = this.f51449;
                    int i12 = i11;
                    do {
                        short[] sArr = this.f51447;
                        i11--;
                        int i13 = sArr[i11] & HPKE.aead_EXPORT_ONLY;
                        i = this.f51442;
                        sArr[i11] = i13 >= i ? (short) (i13 - i) : (short) 0;
                        i12--;
                    } while (i12 != 0);
                    int i14 = i;
                    do {
                        short[] sArr2 = this.f51434;
                        i--;
                        int i15 = sArr2[i] & HPKE.aead_EXPORT_ONLY;
                        i2 = this.f51442;
                        sArr2[i] = i15 >= i2 ? (short) (i15 - i2) : (short) 0;
                        i14--;
                    } while (i14 != 0);
                    i6 += i2;
                }
            }
            int i16 = c4532.f66994;
            if (i16 == 0) {
                return;
            }
            byte[] bArr2 = this.f51464;
            int i17 = this.f51446 + this.f51409;
            if (i16 <= i6) {
                i6 = i16;
            }
            if (i6 != 0) {
                c4532.f66994 = i16 - i6;
                if (c4532.f66999.f51456 != 0) {
                    c4532.f66990.update(c4532.f67001, c4532.f66991, i6);
                }
                System.arraycopy(c4532.f67001, c4532.f66991, bArr2, i17, i6);
                c4532.f66991 += i6;
                c4532.f66992 += (long) i6;
                i7 = i6;
            }
            int i18 = this.f51409 + i7;
            this.f51409 = i18;
            if (i18 >= 3) {
                byte[] bArr3 = this.f51464;
                int i19 = this.f51446;
                int i20 = bArr3[i19] & 255;
                this.f51455 = i20;
                this.f51455 = ((bArr3[i19 + 1] & 255) ^ (i20 << this.f51445)) & this.f51431;
            }
            if (i18 >= 262) {
                return;
            }
        } while (c4532.f66994 != 0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m39114(int i) {
        byte b;
        int i2;
        byte[] bArr;
        int i3;
        int i4 = this.f51458;
        int i5 = this.f51446;
        int i6 = this.f51462;
        int i7 = this.f51442 - 262;
        int i8 = i5 > i7 ? i5 - i7 : 0;
        int i9 = this.f51418;
        int i10 = this.f51448;
        int i11 = i5 + 258;
        byte[] bArr2 = this.f51464;
        int i12 = i5 + i6;
        byte b2 = bArr2[i12 - 1];
        byte b3 = bArr2[i12];
        if (i6 >= this.f51411) {
            i4 >>= 2;
        }
        int i13 = this.f51409;
        if (i9 > i13) {
            i9 = i13;
        }
        byte b4 = b3;
        int i14 = i6;
        int i15 = i4;
        int i16 = i;
        while (true) {
            byte[] bArr3 = this.f51464;
            int i17 = i16 + i14;
            if (bArr3[i17] == b4 && bArr3[i17 - 1] == b2 && bArr3[i16] == bArr3[i5] && bArr3[i16 + 1] == bArr3[i5 + 1]) {
                int i18 = i5 + 2;
                int i19 = i16 + 2;
                while (true) {
                    bArr = this.f51464;
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
                    this.f51426 = i16;
                    if (i2 >= i9) {
                        break;
                    }
                    int i20 = i5 + i2;
                    b2 = bArr[i20 - 1];
                    b4 = bArr[i20];
                    i14 = i2;
                }
                i16 = this.f51434[i16 & i10] & HPKE.aead_EXPORT_ONLY;
                if (i16 > i8 || (i15 = i15 - 1) == 0) {
                    i2 = i14;
                    break;
                }
            } else {
                b = b4;
            }
            b4 = b;
            i16 = this.f51434[i16 & i10] & HPKE.aead_EXPORT_ONLY;
            if (i16 > i8) {
            }
            i2 = i14;
            break;
        }
        int i21 = this.f51409;
        return i2 <= i21 ? i2 : i21;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m39103(int i) {
        C4532 c4532 = this.f51432;
        c4532.f66995 = null;
        if (i == -1) {
            i = 6;
        }
        if (i < 0 || i > 9) {
            return -2;
        }
        c4532.f66999 = this;
        this.f51456 = 1;
        this.f51450 = 15;
        this.f51442 = 32768;
        this.f51448 = EnumC8055.f21261;
        this.f51449 = 32768;
        this.f51431 = EnumC8055.f21261;
        this.f51445 = 5;
        this.f51464 = new byte[65536];
        this.f51434 = new short[32768];
        this.f51447 = new short[32768];
        this.f51452 = 16384;
        this.f51436 = new byte[49152];
        this.f51430 = 49152;
        this.f51435 = 16384;
        this.f51428 = new byte[16384];
        this.f51451 = i;
        c4532.f66996 = 0L;
        c4532.f66992 = 0L;
        c4532.f66995 = null;
        this.f51438 = 0;
        this.f51421 = 0;
        this.f51412 = 42;
        c4532.f66990.reset();
        this.f51413 = 0;
        C23308 c23308 = this.f51427;
        c23308.f73348 = this.f51439;
        c23308.f73350 = C22638.f71420;
        C23308 c23309 = this.f51429;
        c23309.f73348 = this.f51461;
        c23309.f73350 = C22638.f71421;
        C23308 c233010 = this.f51417;
        c233010.f73348 = this.f51414;
        c233010.f73350 = C22638.f71419;
        this.f51457 = (short) 0;
        this.f51459 = 0;
        this.f51444 = 8;
        m39116();
        this.f51423 = this.f51442 * 2;
        this.f51447[this.f51449 - 1] = 0;
        for (int i2 = 0; i2 < this.f51449 - 1; i2++) {
            this.f51447[i2] = 0;
        }
        C10567 c10567 = f51408[this.f51451];
        this.f51460 = c10567.f29266;
        this.f51411 = c10567.f29263;
        this.f51418 = c10567.f29265;
        this.f51458 = c10567.f29264;
        this.f51446 = 0;
        this.f51437 = 0;
        this.f51409 = 0;
        this.f51462 = 2;
        this.f51410 = 2;
        this.f51419 = 0;
        this.f51455 = 0;
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
    /* JADX INFO: renamed from: ܽ */
    public final int m39113() {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        boolean zM39110;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iM39114;
        C19955 c19955;
        int i11;
        String[] strArr = f51407;
        C4532 c4532 = this.f51432;
        if (c4532.f67000 == null || ((c4532.f67001 == null && c4532.f66994 != 0) || (i = this.f51412) == 666)) {
            c4532.f66995 = strArr[4];
            return -2;
        }
        if (c4532.f66997 == 0) {
            c4532.f66995 = strArr[7];
            return -5;
        }
        int i12 = this.f51413;
        this.f51413 = 1;
        if (i == 42) {
            if (this.f51456 == 2) {
                synchronized (this) {
                    if (this.f51424 == null) {
                        this.f51424 = new C19955();
                    }
                    c19955 = this.f51424;
                }
                int i13 = c19955.f60574 != null ? 4 : 0;
                if (c19955.f60571 != null) {
                    i13 |= 8;
                }
                if (c19955.f60573 != null) {
                    i13 |= 16;
                }
                int i14 = this.f51451;
                if (i14 == 1) {
                    i11 = 4;
                } else {
                    i11 = i14 == 9 ? 2 : 0;
                }
                m39117(-29921);
                m39105((byte) 8);
                m39105((byte) i13);
                m39105((byte) c19955.f60572);
                m39105((byte) (c19955.f60572 >> 8));
                m39105((byte) (c19955.f60572 >> 16));
                m39105((byte) (c19955.f60572 >> 24));
                m39105((byte) i11);
                m39105((byte) c19955.f60570);
                byte[] bArr = c19955.f60574;
                if (bArr != null) {
                    m39105((byte) bArr.length);
                    m39105((byte) (c19955.f60574.length >> 8));
                    byte[] bArr2 = c19955.f60574;
                    m39106(0, bArr2.length, bArr2);
                }
                byte[] bArr3 = c19955.f60571;
                if (bArr3 != null) {
                    m39106(0, bArr3.length, bArr3);
                    m39105((byte) 0);
                }
                byte[] bArr4 = c19955.f60573;
                if (bArr4 != null) {
                    m39106(0, bArr4.length, bArr4);
                    m39105((byte) 0);
                }
                this.f51412 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                c4532.f66990.reset();
            } else {
                int i15 = (((this.f51450 - 8) << 4) + 8) << 8;
                int i16 = ((this.f51451 - 1) & 255) >> 1;
                if (i16 > 3) {
                    i16 = 3;
                }
                int i17 = i15 | (i16 << 6);
                if (this.f51446 != 0) {
                    i17 |= 32;
                }
                this.f51412 = UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                m39119((31 - (i17 % 31)) + i17);
                if (this.f51446 != 0) {
                    long value = c4532.f66990.getValue();
                    m39119((int) (value >>> 16));
                    m39119((int) (65535 & value));
                }
                c4532.f66990.reset();
            }
        }
        if (this.f51438 != 0) {
            c4532.m48148();
            if (c4532.f66997 == 0) {
                this.f51413 = -1;
                return 0;
            }
        } else if (c4532.f66994 == 0 && 1 <= i12) {
            c4532.f66995 = strArr[7];
            return -5;
        }
        int i18 = this.f51412;
        if (i18 == 666 && c4532.f66994 != 0) {
            c4532.f66995 = strArr[7];
            return -5;
        }
        if (c4532.f66994 != 0 || this.f51409 != 0 || i18 != 666) {
            int i19 = f51408[this.f51451].f29262;
            int i20 = 5;
            short s = HPKE.aead_EXPORT_ONLY;
            if (i19 == 0) {
                int i21 = this.f51430 - 5;
                int i22 = 65535 > i21 ? i21 : 65535;
                while (true) {
                    if (this.f51409 <= 1) {
                        m39118();
                        if (this.f51409 == 0) {
                            m39107(false);
                            if (c4532.f66997 != 0) {
                                b = 1;
                            }
                        } else {
                            i2 = this.f51446 + this.f51409;
                            this.f51446 = i2;
                            this.f51409 = 0;
                            i3 = this.f51437 + i22;
                            if (i2 != 0 || i2 >= i3) {
                                this.f51409 = i2 - i3;
                                this.f51446 = i3;
                                m39107(false);
                                if (c4532.f66997 != 0) {
                                    if (this.f51446 - this.f51437 >= this.f51442 - 262) {
                                        m39107(false);
                                        if (c4532.f66997 == 0) {
                                        }
                                    }
                                }
                            } else if (this.f51446 - this.f51437 >= this.f51442 - 262) {
                                m39107(false);
                                if (c4532.f66997 == 0) {
                                }
                            }
                        }
                    } else {
                        i2 = this.f51446 + this.f51409;
                        this.f51446 = i2;
                        this.f51409 = 0;
                        i3 = this.f51437 + i22;
                        if (i2 != 0) {
                            this.f51409 = i2 - i3;
                            this.f51446 = i3;
                            m39107(false);
                            if (c4532.f66997 != 0) {
                                if (this.f51446 - this.f51437 >= this.f51442 - 262) {
                                    m39107(false);
                                    if (c4532.f66997 == 0) {
                                    }
                                }
                            }
                        } else {
                            this.f51409 = i2 - i3;
                            this.f51446 = i3;
                            m39107(false);
                            if (c4532.f66997 != 0) {
                                if (this.f51446 - this.f51437 >= this.f51442 - 262) {
                                    m39107(false);
                                    if (c4532.f66997 == 0) {
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
                    if (this.f51409 < 262) {
                        m39118();
                        if (this.f51409 == 0) {
                            m39107(false);
                            if (c4532.f66997 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f51409 >= 3) {
                                int i24 = this.f51455 << this.f51445;
                                byte[] bArr5 = this.f51464;
                                int i25 = this.f51446;
                                int i26 = (i24 ^ (bArr5[i25 + 2] & 255)) & this.f51431;
                                this.f51455 = i26;
                                short[] sArr = this.f51447;
                                short s2 = sArr[i26];
                                int i27 = s2 & HPKE.aead_EXPORT_ONLY;
                                this.f51434[this.f51448 & i25] = s2;
                                sArr[i26] = (short) i25;
                                i23 = i27;
                            }
                            if (i23 != 0 && ((this.f51446 - i23) & 65535) <= this.f51442 - 262) {
                                this.f51410 = m39114(i23);
                            }
                            i4 = this.f51410;
                            if (i4 >= 3) {
                                zM39110 = m39110(this.f51446 - this.f51426, i4 - 3);
                                int i28 = this.f51409;
                                i5 = this.f51410;
                                int i29 = i28 - i5;
                                this.f51409 = i29;
                                if (i5 <= this.f51460 || i29 < 3) {
                                    int i30 = this.f51446 + i5;
                                    this.f51446 = i30;
                                    this.f51410 = 0;
                                    byte[] bArr6 = this.f51464;
                                    int i31 = bArr6[i30] & 255;
                                    this.f51455 = i31;
                                    this.f51455 = ((bArr6[i30 + 1] & 255) ^ (i31 << this.f51445)) & this.f51431;
                                } else {
                                    this.f51410 = i5 - 1;
                                    do {
                                        i6 = this.f51446;
                                        int i32 = i6 + 1;
                                        this.f51446 = i32;
                                        int i33 = ((this.f51455 << this.f51445) ^ (this.f51464[i6 + 3] & 255)) & this.f51431;
                                        this.f51455 = i33;
                                        short[] sArr2 = this.f51447;
                                        short s3 = sArr2[i33];
                                        i7 = s3 & HPKE.aead_EXPORT_ONLY;
                                        this.f51434[this.f51448 & i32] = s3;
                                        sArr2[i33] = (short) i32;
                                        i8 = this.f51410 - 1;
                                        this.f51410 = i8;
                                    } while (i8 != 0);
                                    this.f51446 = i6 + 2;
                                    i23 = i7;
                                }
                            } else {
                                zM39110 = m39110(0, this.f51464[this.f51446] & 255);
                                this.f51409--;
                                this.f51446++;
                            }
                            if (zM39110) {
                                m39107(false);
                                if (c4532.f66997 == 0) {
                                }
                            }
                        }
                    } else {
                        if (this.f51409 >= 3) {
                            int i210 = this.f51455 << this.f51445;
                            byte[] bArr7 = this.f51464;
                            int i211 = this.f51446;
                            int i212 = (i210 ^ (bArr7[i211 + 2] & 255)) & this.f51431;
                            this.f51455 = i212;
                            short[] sArr3 = this.f51447;
                            short s4 = sArr3[i212];
                            int i213 = s4 & HPKE.aead_EXPORT_ONLY;
                            this.f51434[this.f51448 & i211] = s4;
                            sArr3[i212] = (short) i211;
                            i23 = i213;
                        }
                        if (i23 != 0) {
                            this.f51410 = m39114(i23);
                        }
                        i4 = this.f51410;
                        if (i4 >= 3) {
                            zM39110 = m39110(this.f51446 - this.f51426, i4 - 3);
                            int i214 = this.f51409;
                            i5 = this.f51410;
                            int i215 = i214 - i5;
                            this.f51409 = i215;
                            if (i5 <= this.f51460) {
                                int i34 = this.f51446 + i5;
                                this.f51446 = i34;
                                this.f51410 = 0;
                                byte[] bArr8 = this.f51464;
                                int i35 = bArr8[i34] & 255;
                                this.f51455 = i35;
                                this.f51455 = ((bArr8[i34 + 1] & 255) ^ (i35 << this.f51445)) & this.f51431;
                            } else {
                                int i36 = this.f51446 + i5;
                                this.f51446 = i36;
                                this.f51410 = 0;
                                byte[] bArr9 = this.f51464;
                                int i37 = bArr9[i36] & 255;
                                this.f51455 = i37;
                                this.f51455 = ((bArr9[i36 + 1] & 255) ^ (i37 << this.f51445)) & this.f51431;
                            }
                        } else {
                            zM39110 = m39110(0, this.f51464[this.f51446] & 255);
                            this.f51409--;
                            this.f51446++;
                        }
                        if (zM39110) {
                            m39107(false);
                            if (c4532.f66997 == 0) {
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
                    if (this.f51409 < 262) {
                        m39118();
                        if (this.f51409 == 0) {
                            if (this.f51419 != 0) {
                                m39110(0, this.f51464[this.f51446 - 1] & 255);
                                this.f51419 = 0;
                            }
                            m39107(false);
                            if (c4532.f66997 != 0) {
                                b = 1;
                            }
                        } else {
                            if (this.f51409 >= 3) {
                                int i39 = this.f51455 << this.f51445;
                                byte[] bArr10 = this.f51464;
                                int i40 = this.f51446;
                                int i41 = (i39 ^ (bArr10[i40 + 2] & 255)) & this.f51431;
                                this.f51455 = i41;
                                short[] sArr4 = this.f51447;
                                short s5 = sArr4[i41];
                                this.f51434[this.f51448 & i40] = s5;
                                sArr4[i41] = (short) i40;
                                i38 = s5 & s;
                            }
                            int i42 = this.f51410;
                            this.f51462 = i42;
                            this.f51440 = this.f51426;
                            this.f51410 = 2;
                            if (i38 != 0 && i42 < this.f51460 && ((this.f51446 - i38) & s) <= this.f51442 - 262) {
                                iM39114 = m39114(i38);
                                this.f51410 = iM39114;
                                if (iM39114 <= i20 && iM39114 == 3 && this.f51446 - this.f51426 > 4096) {
                                    this.f51410 = 2;
                                }
                            }
                            i9 = this.f51462;
                            if (i9 >= 3 || this.f51410 > i9) {
                                if (this.f51419 != 0) {
                                    if (m39110(0, this.f51464[this.f51446 - 1] & 255)) {
                                        m39107(false);
                                    }
                                    this.f51446++;
                                    this.f51409--;
                                    if (c4532.f66997 == 0) {
                                    }
                                } else {
                                    this.f51419 = 1;
                                    this.f51446++;
                                    this.f51409--;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            } else {
                                int i43 = this.f51446;
                                int i44 = (this.f51409 + i43) - 3;
                                boolean zM39111 = m39110((i43 - 1) - this.f51440, i9 - 3);
                                int i45 = this.f51409;
                                int i46 = this.f51462;
                                this.f51409 = i45 - (i46 - 1);
                                this.f51462 = i46 - 2;
                                while (true) {
                                    i10 = this.f51446;
                                    int i47 = i10 + 1;
                                    this.f51446 = i47;
                                    if (i47 <= i44) {
                                        int i48 = ((this.f51455 << this.f51445) ^ (this.f51464[i10 + 3] & 255)) & this.f51431;
                                        this.f51455 = i48;
                                        short[] sArr5 = this.f51447;
                                        short s6 = sArr5[i48];
                                        this.f51434[this.f51448 & i47] = s6;
                                        sArr5[i48] = (short) i47;
                                        i38 = s6 & s;
                                    }
                                    int i49 = this.f51462 - 1;
                                    this.f51462 = i49;
                                    if (i49 == 0) {
                                        break;
                                    }
                                    s = HPKE.aead_EXPORT_ONLY;
                                }
                                this.f51419 = 0;
                                this.f51410 = 2;
                                this.f51446 = i10 + 2;
                                if (zM39111) {
                                    m39107(false);
                                    if (c4532.f66997 == 0) {
                                    }
                                } else {
                                    continue;
                                }
                                i20 = 5;
                                s = HPKE.aead_EXPORT_ONLY;
                            }
                        }
                    } else {
                        if (this.f51409 >= 3) {
                            int i310 = this.f51455 << this.f51445;
                            byte[] bArr11 = this.f51464;
                            int i410 = this.f51446;
                            int i411 = (i310 ^ (bArr11[i410 + 2] & 255)) & this.f51431;
                            this.f51455 = i411;
                            short[] sArr6 = this.f51447;
                            short s7 = sArr6[i411];
                            this.f51434[this.f51448 & i410] = s7;
                            sArr6[i411] = (short) i410;
                            i38 = s7 & s;
                        }
                        int i412 = this.f51410;
                        this.f51462 = i412;
                        this.f51440 = this.f51426;
                        this.f51410 = 2;
                        if (i38 != 0) {
                            iM39114 = m39114(i38);
                            this.f51410 = iM39114;
                            if (iM39114 <= i20) {
                                this.f51410 = 2;
                            }
                        }
                        i9 = this.f51462;
                        if (i9 >= 3) {
                            if (this.f51419 != 0) {
                                if (m39110(0, this.f51464[this.f51446 - 1] & 255)) {
                                    m39107(false);
                                }
                                this.f51446++;
                                this.f51409--;
                                if (c4532.f66997 == 0) {
                                }
                            } else {
                                this.f51419 = 1;
                                this.f51446++;
                                this.f51409--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        } else {
                            if (this.f51419 != 0) {
                                if (m39110(0, this.f51464[this.f51446 - 1] & 255)) {
                                    m39107(false);
                                }
                                this.f51446++;
                                this.f51409--;
                                if (c4532.f66997 == 0) {
                                }
                            } else {
                                this.f51419 = 1;
                                this.f51446++;
                                this.f51409--;
                            }
                            i20 = 5;
                            s = HPKE.aead_EXPORT_ONLY;
                        }
                    }
                    b = 0;
                }
            }
            if (b == 2 || b == 3) {
                this.f51412 = 666;
            }
            if (b == 0 || b == 2) {
                if (c4532.f66997 == 0) {
                    this.f51413 = -1;
                }
            } else if (b == 1) {
                m39111(2, 3);
                short[] sArr7 = C22638.f71418;
                m39115(sArr7, 256);
                m39104();
                if ((this.f51444 + 11) - this.f51459 < 9) {
                    m39111(2, 3);
                    m39115(sArr7, 256);
                    m39104();
                }
                this.f51444 = 7;
                c4532.m48148();
                if (c4532.f66997 == 0) {
                    this.f51413 = -1;
                    return 0;
                }
            }
        }
        return 0;
    }

    public final Object clone() {
        C17271 c17271 = (C17271) super.clone();
        byte[] bArr = c17271.f51436;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        c17271.f51436 = bArr2;
        byte[] bArr3 = c17271.f51428;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length2);
        c17271.f51428 = bArr4;
        byte[] bArr5 = c17271.f51464;
        int length3 = bArr5.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(bArr5, 0, bArr6, 0, length3);
        c17271.f51464 = bArr6;
        c17271.f51434 = m39102(c17271.f51434);
        c17271.f51447 = m39102(c17271.f51447);
        c17271.f51439 = m39102(c17271.f51439);
        c17271.f51461 = m39102(c17271.f51461);
        c17271.f51414 = m39102(c17271.f51414);
        c17271.f51453 = m39102(c17271.f51453);
        c17271.f51454 = m39102(c17271.f51454);
        int[] iArr = c17271.f51441;
        int length4 = iArr.length;
        int[] iArr2 = new int[length4];
        System.arraycopy(iArr, 0, iArr2, 0, length4);
        c17271.f51441 = iArr2;
        byte[] bArr7 = c17271.f51433;
        int length5 = bArr7.length;
        byte[] bArr8 = new byte[length5];
        System.arraycopy(bArr7, 0, bArr8, 0, length5);
        c17271.f51433 = bArr8;
        c17271.f51427.f73348 = c17271.f51439;
        c17271.f51429.f73348 = c17271.f51461;
        c17271.f51417.f73348 = c17271.f51414;
        C19955 c19955 = c17271.f51424;
        if (c19955 != null) {
            c17271.f51424 = (C19955) c19955.clone();
        }
        return c17271;
    }

    /* JADX INFO: renamed from: ֫ */
    public static short[] m39102(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }
}
