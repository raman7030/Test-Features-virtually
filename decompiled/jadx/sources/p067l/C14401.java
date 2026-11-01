package p067l;

import bin.p000mt.plus.Features;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۫᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14401 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f41161;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f41162;

    /* JADX INFO: renamed from: ܳ */
    public final String[] f41163;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f41164;

    /* JADX INFO: renamed from: ܿ */
    public final short f41165;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f41166;

    public C14401(C5684 c5684, int i) {
        C23119 c23119;
        int i2 = c5684.f13857;
        c5684.f13857 = i;
        int iM12664 = c5684.m12664() - 2;
        this.f41165 = c5684.m12666();
        if (C7025.f18301 != null) {
            Object[] objArrAnalyze = Features.analyze(c5684.m12665(iM12664));
            int i3 = 0;
            byte[] bArr = (byte[]) objArrAnalyze[0];
            byte[] bArr2 = (byte[]) objArrAnalyze[1];
            byte[] bArr3 = (byte[]) objArrAnalyze[2];
            byte[] bArr4 = (byte[]) objArrAnalyze[3];
            int length = bArr3.length / 10;
            int[] iArr = new int[length];
            int[] iArr2 = new int[length];
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr4);
            int i4 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
            String[] strArr = new String[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
                byte[] bArr5 = new byte[i6];
                byteArrayInputStream.read(bArr5, i3, i6);
                strArr[i5] = new String(bArr5, StandardCharsets.UTF_8);
                i5++;
                i3 = 0;
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr3);
            for (int i7 = 0; i7 < length; i7++) {
                byteArrayInputStream2.skip(2L);
                iArr[i7] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
                iArr2[i7] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
            }
            c23119 = new C23119(bArr2, bArr, iArr, iArr2, strArr);
        } else {
            c23119 = new C23119(new C23789(c5684.m12665(iM12664)));
        }
        this.f41162 = c23119.f72654;
        this.f41161 = c23119.f72653;
        this.f41164 = c23119.f72655;
        this.f41166 = c23119.f72657;
        this.f41163 = c23119.f72656;
        c5684.f13857 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33016(C21778 c21778, boolean z) {
        C15071 c15071 = new C15071(this, c21778, z);
        while (true) {
            int i = c15071.f43050;
            c15071.f43050 = i + 1;
            byte b = this.f41162[i];
            byte[] bArr = this.f41161;
            int[] iArr = this.f41166;
            int[] iArr2 = this.f41164;
            C14401 c14401 = c15071.f43049;
            C13731[] c13731Arr = c15071.f43052;
            C13731[] c13731Arr2 = c15071.f43048;
            C17613 c17613 = c15071.f43051;
            switch (b) {
                case 0:
                    short sM34481 = c15071.m34481();
                    C13731 c13731 = (C13731) c17613.m40104();
                    c13731Arr[sM34481] = c13731;
                    c13731.f38730 = false;
                    break;
                case 1:
                    C13731 c13732 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31255(c13732);
                    if (c13732.f38730) {
                        c13732.m31252();
                        c15071.f43053 = c13732;
                    }
                    break;
                case 2:
                    int iM34479 = c15071.m34479();
                    if (!((C13731) c17613.m40104()).m31245()) {
                        c15071.f43047 = iArr2[iM34479];
                        c15071.f43050 = iArr[iM34479];
                    } else if (c15071.f43053 == null) {
                        C13731 c13733 = (C13731) c17613.m40106();
                        if (c13733.f38730) {
                            c13733.m31252();
                            c15071.f43053 = c13733;
                        }
                    } else {
                        c17613.m40106();
                    }
                    break;
                case 3:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c13734 = (C13731) c17613.m40104();
                        c13734.m31250(c13734);
                    } else {
                        C13731 c13735 = (C13731) c17613.m40106();
                        C13731 c13736 = c15071.f43053;
                        if (c13736 == null) {
                            c13736 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c13735.m31250(c13736);
                        c17613.m40105(c13736);
                    }
                    break;
                case 4:
                    C13731 c13737 = c15071.f43053;
                    if (c13737 == null) {
                        c13737 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c13738 = (C13731) c17613.m40106();
                    C13731 c13739 = (C13731) c17613.m40106();
                    c13739.m31238(c13738, c13737);
                    c17613.m40105(c13737);
                    if (c13739.f38730) {
                        c13739.m31252();
                        c15071.f43053 = c13739;
                    } else if (c13738.f38730) {
                        c13738.m31252();
                        c15071.f43053 = c13738;
                    }
                    break;
                case 5:
                    int iM31222 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137310 = c15071.f43053;
                    if (c137310 == null) {
                        c137310 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137310.m31208(new long[iM31222]);
                    c17613.m40105(c137310);
                    break;
                case 6:
                    int i2 = c15071.f43047;
                    int i3 = i2 + 1;
                    c15071.f43047 = i3;
                    if (bArr[i2] == 0) {
                        int iM49144 = c21778.m49144(new String(bArr, i3, 32));
                        int i4 = c15071.f43047;
                        bArr[i4 - 1] = 1;
                        bArr[i4] = (byte) (iM49144 & 255);
                        bArr[i4 + 1] = (byte) ((iM49144 >>> 8) & 255);
                        bArr[i4 + 2] = (byte) ((iM49144 >>> 16) & 255);
                        bArr[i4 + 3] = (byte) ((iM49144 >>> 24) & 255);
                    }
                    c21778.m49145(c15071.m34479());
                    c15071.f43047 += 28;
                    break;
                case 7:
                    int iM31223 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137311 = c15071.f43053;
                    if (c137311 == null) {
                        c137311 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137311.m31208(new int[iM31223]);
                    c17613.m40105(c137311);
                    break;
                case 8:
                    C13731 c137312 = c15071.f43053;
                    if (c137312 == null) {
                        c137312 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    byte[] bArr2 = c14401.f41161;
                    int i5 = c15071.f43047;
                    c15071.f43047 = i5 + 1;
                    c137312.m31214(bArr2[i5] != 0);
                    c17613.m40105(c137312);
                    break;
                case 9:
                    int iM31224 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137313 = c15071.f43053;
                    if (c137313 == null) {
                        c137313 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137313.m31208(new String[iM31224]);
                    c17613.m40105(c137313);
                    break;
                case 10:
                    C13731 c137314 = c15071.f43053;
                    if (c137314 == null) {
                        c137314 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    int i6 = (c14401.f41161[c15071.f43047 + 1] & 255) << 8;
                    byte[] bArr3 = c14401.f41161;
                    int i7 = c15071.f43047;
                    char c = (char) (i6 | (bArr3[i7] & 255));
                    c15071.f43047 = i7 + 2;
                    c137314.m31203(c);
                    c17613.m40105(c137314);
                    break;
                case 11:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c137315 = (C13731) c17613.m40104();
                        c137315.m31230(c137315);
                    } else {
                        C13731 c137316 = (C13731) c17613.m40106();
                        C13731 c137317 = c15071.f43053;
                        if (c137317 == null) {
                            c137317 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c137316.m31230(c137317);
                        c17613.m40105(c137317);
                    }
                    break;
                case 12:
                    C13731 c137318 = c15071.f43053;
                    if (c137318 == null) {
                        c137318 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137319 = (C13731) c17613.m40106();
                    C13731 c137320 = (C13731) c17613.m40106();
                    c137320.m31231(c137319, c137318);
                    c17613.m40105(c137318);
                    if (c137320.f38730) {
                        c137320.m31252();
                        c15071.f43053 = c137320;
                    } else if (c137319.f38730) {
                        c137319.m31252();
                        c15071.f43053 = c137319;
                    }
                    break;
                case 13:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c137321 = (C13731) c17613.m40104();
                        c137321.m31247(c137321);
                    } else {
                        C13731 c137322 = (C13731) c17613.m40106();
                        C13731 c137323 = c15071.f43053;
                        if (c137323 == null) {
                            c137323 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c137322.m31247(c137323);
                        c17613.m40105(c137323);
                    }
                    break;
                case 14:
                    C13731 c137324 = c15071.f43053;
                    if (c137324 == null) {
                        c137324 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137324.m31206(c15071.m34479());
                    c17613.m40105(c137324);
                    break;
                case 15:
                    int iM31225 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137325 = c15071.f43053;
                    if (c137325 == null) {
                        c137325 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137325.m31208(new boolean[iM31225]);
                    c17613.m40105(c137325);
                    break;
                case 16:
                    C13731 c137326 = c15071.f43053;
                    if (c137326 == null) {
                        c137326 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137327 = (C13731) c17613.m40106();
                    c137327.m31218(c137326);
                    c17613.m40105(c137326);
                    if (c137327.f38730) {
                        c137327.m31252();
                        c15071.f43053 = c137327;
                    }
                    break;
                case 17:
                    c17613.m40105(c13731Arr2[c15071.m34481()]);
                    break;
                case 18:
                    int iM344710 = c15071.m34479();
                    c15071.f43047 = iArr2[iM344710];
                    c15071.f43050 = iArr[iM344710];
                    break;
                case 19:
                    int iM31226 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137328 = c15071.f43053;
                    if (c137328 == null) {
                        c137328 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137328.m31208(new float[iM31226]);
                    c17613.m40105(c137328);
                    break;
                case 20:
                    C13731 c137329 = c15071.f43053;
                    if (c137329 == null) {
                        c137329 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137330 = (C13731) c17613.m40106();
                    C13731 c137331 = (C13731) c17613.m40106();
                    c137331.m31256(c137330, c137329);
                    c17613.m40105(c137329);
                    if (c137331.f38730) {
                        c137331.m31252();
                        c15071.f43053 = c137331;
                    } else if (c137330.f38730) {
                        c137330.m31252();
                        c15071.f43053 = c137330;
                    }
                    break;
                case 21:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c137332 = (C13731) c17613.m40104();
                        c137332.m31243(c137332);
                    } else {
                        C13731 c137333 = (C13731) c17613.m40106();
                        C13731 c137334 = c15071.f43053;
                        if (c137334 == null) {
                            c137334 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c137333.m31243(c137334);
                        c17613.m40105(c137334);
                    }
                    break;
                case 22:
                    C13731 c137335 = c15071.f43053;
                    if (c137335 == null) {
                        c137335 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c13731Arr[c15071.m34481()].m31211(c137335, ((C13731) c17613.m40106()).m31222());
                    c17613.m40105(c137335);
                    break;
                case 23:
                    C13731 c137336 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31198(c137336);
                    if (c137336.f38730) {
                        c137336.m31252();
                        c15071.f43053 = c137336;
                    }
                    break;
                case 24:
                    int i8 = c15071.f43047;
                    int i9 = i8 + 1;
                    c15071.f43047 = i9;
                    if (bArr[i8] == 0) {
                        int iM49146 = c21778.m49146(new String(bArr, i9, 32));
                        int i10 = c15071.f43047;
                        bArr[i10 - 1] = 1;
                        bArr[i10] = (byte) (iM49146 & 255);
                        bArr[i10 + 1] = (byte) ((iM49146 >>> 8) & 255);
                        bArr[i10 + 2] = (byte) ((iM49146 >>> 16) & 255);
                        bArr[i10 + 3] = (byte) ((iM49146 >>> 24) & 255);
                    }
                    c21778.m49147(c15071.m34479());
                    c15071.f43047 += 28;
                    break;
                case 25:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c137337 = (C13731) c17613.m40104();
                        c137337.m31237(c137337);
                    } else {
                        C13731 c137338 = (C13731) c17613.m40106();
                        C13731 c137339 = c15071.f43053;
                        if (c137339 == null) {
                            c137339 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c137338.m31237(c137339);
                        c17613.m40105(c137339);
                    }
                    break;
                case 26:
                    c17613.m40106();
                    break;
                case 27:
                    int iM31227 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137340 = c15071.f43053;
                    if (c137340 == null) {
                        c137340 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137340.m31208(new char[iM31227]);
                    c17613.m40105(c137340);
                    break;
                case 28:
                    C13731 c137341 = c15071.f43053;
                    if (c137341 == null) {
                        c137341 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137342 = (C13731) c17613.m40106();
                    C13731 c137343 = (C13731) c17613.m40106();
                    c137343.m31251(c137342, c137341);
                    c17613.m40105(c137341);
                    if (c137343.f38730) {
                        c137343.m31252();
                        c15071.f43053 = c137343;
                    } else if (c137342.f38730) {
                        c137342.m31252();
                        c15071.f43053 = c137342;
                    }
                    break;
                case 29:
                    c13731Arr2[c15071.m34481()].m31215();
                    break;
                case 30:
                    C13731 c137344 = c15071.f43053;
                    if (c137344 == null) {
                        c137344 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137345 = (C13731) c17613.m40106();
                    C13731 c137346 = (C13731) c17613.m40106();
                    c137346.m31228(c137345, c137344);
                    c17613.m40105(c137344);
                    if (c137346.f38730) {
                        c137346.m31252();
                        c15071.f43053 = c137346;
                    } else if (c137345.f38730) {
                        c137345.m31252();
                        c15071.f43053 = c137345;
                    }
                    break;
                case 31:
                    C13731 c137347 = c15071.f43053;
                    if (c137347 == null) {
                        c137347 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137347.m31205(Float.intBitsToFloat(c15071.m34479()));
                    c17613.m40105(c137347);
                    break;
                case 32:
                    int iM344711 = c15071.m34479();
                    if (((C13731) c17613.m40104()).m31245()) {
                        c15071.f43047 = iArr2[iM344711];
                        c15071.f43050 = iArr[iM344711];
                    } else if (c15071.f43053 == null) {
                        C13731 c137348 = (C13731) c17613.m40106();
                        if (c137348.f38730) {
                            c137348.m31252();
                            c15071.f43053 = c137348;
                        }
                    } else {
                        c17613.m40106();
                    }
                    break;
                case 33:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c137349 = (C13731) c17613.m40104();
                        c137349.m31223(c137349);
                    } else {
                        C13731 c137350 = (C13731) c17613.m40106();
                        C13731 c137351 = c15071.f43053;
                        if (c137351 == null) {
                            c137351 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c137350.m31223(c137351);
                        c17613.m40105(c137351);
                    }
                    break;
                case 34:
                    C13731 c137352 = c15071.f43053;
                    if (c137352 == null) {
                        c137352 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137353 = (C13731) c17613.m40106();
                    c137353.m31216(c137352);
                    c17613.m40105(c137352);
                    if (c137353.f38730) {
                        c137353.m31252();
                        c15071.f43053 = c137353;
                    }
                    break;
                case 35:
                    int iM31228 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137354 = c15071.f43053;
                    if (c137354 == null) {
                        c137354 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137354.m31208(new double[iM31228]);
                    c17613.m40105(c137354);
                    break;
                case 36:
                    C13731 c137355 = c15071.f43053;
                    if (c137355 == null) {
                        c137355 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137355.m31206(c13731Arr[c15071.m34481()].m31232());
                    c17613.m40105(c137355);
                    break;
                case 37:
                    c13731Arr2[c15071.m34481()].m31201();
                    break;
                case 38:
                    C13731 c137356 = c15071.f43053;
                    if (c137356 == null) {
                        c137356 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137357 = (C13731) c17613.m40106();
                    C13731 c137358 = (C13731) c17613.m40106();
                    c137358.m31235(c137357, c137356);
                    c17613.m40105(c137356);
                    if (c137358.f38730) {
                        c137358.m31252();
                        c15071.f43053 = c137358;
                    } else if (c137357.f38730) {
                        c137357.m31252();
                        c15071.f43053 = c137357;
                    }
                    break;
                case 39:
                    C13731 c137359 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31227(c137359);
                    if (c137359.f38730) {
                        c137359.m31252();
                        c15071.f43053 = c137359;
                    }
                    break;
                case 40:
                    c13731Arr[c15071.m34481()].m31215();
                    break;
                case 41:
                    C13731 c137360 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31253(c137360);
                    if (c137360.f38730) {
                        c137360.m31252();
                        c15071.f43053 = c137360;
                    }
                    break;
                case 42:
                    C13731 c137361 = c15071.f43053;
                    if (c137361 == null) {
                        c137361 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137362 = (C13731) c17613.m40106();
                    C13731 c137363 = (C13731) c17613.m40106();
                    c137363.m31212(c137362, c137361);
                    c17613.m40105(c137361);
                    if (c137363.f38730) {
                        c137363.m31252();
                        c15071.f43053 = c137363;
                    } else if (c137362.f38730) {
                        c137362.m31252();
                        c15071.f43053 = c137362;
                    }
                    break;
                case 43:
                    C13731 c137364 = c15071.f43053;
                    if (c137364 == null) {
                        c137364 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137364.m31209(this.f41163[c15071.m34479()]);
                    c17613.m40105(c137364);
                    break;
                case 44:
                    C13731 c137365 = c15071.f43053;
                    if (c137365 == null) {
                        c137365 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137366 = (C13731) c17613.m40106();
                    C13731 c137367 = (C13731) c17613.m40106();
                    c137367.m31242(c137366, c137365);
                    c17613.m40105(c137365);
                    if (c137367.f38730) {
                        c137367.m31252();
                        c15071.f43053 = c137367;
                    } else if (c137366.f38730) {
                        c137366.m31252();
                        c15071.f43053 = c137366;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C13731 c137368 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31221(c137368);
                    if (c137368.f38730) {
                        c137368.m31252();
                        c15071.f43053 = c137368;
                    }
                    break;
                case 46:
                    return;
                case 47:
                    short sM34482 = c15071.m34481();
                    C13731 c137369 = (C13731) c17613.m40104();
                    c13731Arr2[sM34482] = c137369;
                    c137369.f38730 = false;
                    break;
                case 48:
                    C13731 c137370 = c15071.f43053;
                    if (c137370 == null) {
                        c137370 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137371 = (C13731) c17613.m40106();
                    C13731 c137372 = (C13731) c17613.m40106();
                    c137372.m31248(c137371, c137370);
                    c17613.m40105(c137370);
                    if (c137372.f38730) {
                        c137372.m31252();
                        c15071.f43053 = c137372;
                    } else if (c137371.f38730) {
                        c137371.m31252();
                        c15071.f43053 = c137371;
                    }
                    break;
                case 49:
                    short sM34483 = c15071.m34481();
                    C13731 c137373 = (C13731) c17613.m40106();
                    c13731Arr2[sM34483] = c137373;
                    c137373.f38730 = false;
                    break;
                case 50:
                    if (((C13731) c17613.m40106()).m31245()) {
                        int iM344712 = c15071.m34479();
                        c15071.f43047 = iArr2[iM344712];
                        c15071.f43050 = iArr[iM344712];
                    } else {
                        c15071.f43047 += 4;
                    }
                    break;
                case 51:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c137374 = (C13731) c17613.m40104();
                        c137374.m31261(c137374);
                    } else {
                        C13731 c137375 = (C13731) c17613.m40106();
                        C13731 c137376 = c15071.f43053;
                        if (c137376 == null) {
                            c137376 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c137375.m31261(c137376);
                        c17613.m40105(c137376);
                    }
                    break;
                case 52:
                    if (!((C13731) c17613.m40106()).m31245()) {
                        int iM344713 = c15071.m34479();
                        c15071.f43047 = iArr2[iM344713];
                        c15071.f43050 = iArr[iM344713];
                    } else {
                        c15071.f43047 += 4;
                    }
                    break;
                case 53:
                    C13731 c137377 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31241(c137377);
                    if (c137377.f38730) {
                        c137377.m31252();
                        c15071.f43053 = c137377;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    C13731 c137378 = c15071.f43053;
                    if (c137378 == null) {
                        c137378 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137379 = (C13731) c17613.m40106();
                    C13731 c137380 = (C13731) c17613.m40106();
                    c137380.m31262(c137379, c137378);
                    c17613.m40105(c137378);
                    if (c137380.f38730) {
                        c137380.m31252();
                        c15071.f43053 = c137380;
                    } else if (c137379.f38730) {
                        c137379.m31252();
                        c15071.f43053 = c137379;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    C13731 c137381 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31210(c137381);
                    if (c137381.f38730) {
                        c137381.m31252();
                        c15071.f43053 = c137381;
                    }
                    break;
                case 56:
                    C13731 c137382 = c15071.f43053;
                    if (c137382 == null) {
                        c137382 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137383 = (C13731) c17613.m40106();
                    C13731 c137384 = (C13731) c17613.m40106();
                    c137384.m31254(c137383, c137382);
                    c17613.m40105(c137382);
                    if (c137384.f38730) {
                        c137384.m31252();
                        c15071.f43053 = c137384;
                    } else if (c137383.f38730) {
                        c137383.m31252();
                        c15071.f43053 = c137383;
                    }
                    break;
                case 57:
                    C13731 c137385 = c15071.f43053;
                    if (c137385 == null) {
                        c137385 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c13731Arr2[c15071.m34481()].m31211(c137385, ((C13731) c17613.m40106()).m31222());
                    c17613.m40105(c137385);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    C13731 c137386 = c15071.f43053;
                    if (c137386 == null) {
                        c137386 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137387 = (C13731) c17613.m40106();
                    C13731 c137388 = (C13731) c17613.m40106();
                    c137388.m31244(c137387, c137386);
                    c17613.m40105(c137386);
                    if (c137388.f38730) {
                        c137388.m31252();
                        c15071.f43053 = c137388;
                    } else if (c137387.f38730) {
                        c137387.m31252();
                        c15071.f43053 = c137387;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    C13731 c137389 = c15071.f43053;
                    if (c137389 == null) {
                        c137389 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137389.m31204(Double.longBitsToDouble(c15071.m34480()));
                    c17613.m40105(c137389);
                    break;
                case 60:
                    C13731 c137390 = c15071.f43053;
                    if (c137390 == null) {
                        c137390 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137391 = (C13731) c17613.m40106();
                    C13731 c137392 = (C13731) c17613.m40106();
                    c137392.m31219(c137391, c137390);
                    c17613.m40105(c137390);
                    if (c137392.f38730) {
                        c137392.m31252();
                        c15071.f43053 = c137392;
                    } else if (c137391.f38730) {
                        c137391.m31252();
                        c15071.f43053 = c137391;
                    }
                    break;
                case 61:
                    C13731 c137393 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31200(c137393);
                    if (c137393.f38730) {
                        c137393.m31252();
                        c15071.f43053 = c137393;
                    }
                    break;
                case 62:
                    C13731 c137394 = c15071.f43053;
                    if (c137394 == null) {
                        c137394 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137394.m31207(c15071.m34480());
                    c17613.m40105(c137394);
                    break;
                case 63:
                    C13731 c137395 = c15071.f43053;
                    if (c137395 == null) {
                        c137395 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137395.m31213(c15071.m34481());
                    c17613.m40105(c137395);
                    break;
                case 64:
                    c17613.m40105(c13731Arr[c15071.m34481()]);
                    break;
                case 65:
                    int iM31229 = ((C13731) c17613.m40106()).m31222();
                    C13731 c137396 = c15071.f43053;
                    if (c137396 == null) {
                        c137396 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c137396.m31208(new Object[iM31229]);
                    c17613.m40105(c137396);
                    break;
                case 66:
                    C13731 c137397 = c15071.f43053;
                    if (c137397 == null) {
                        c137397 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c137398 = (C13731) c17613.m40106();
                    C13731 c137399 = (C13731) c17613.m40106();
                    c137399.m31259(c137398, c137397);
                    c17613.m40105(c137397);
                    if (c137399.f38730) {
                        c137399.m31252();
                        c15071.f43053 = c137399;
                    } else if (c137398.f38730) {
                        c137398.m31252();
                        c15071.f43053 = c137398;
                    }
                    break;
                case 67:
                    if (((C13731) c17613.m40104()).f38730) {
                        C13731 c1373100 = (C13731) c17613.m40104();
                        c1373100.m31258(c1373100);
                    } else {
                        C13731 c1373101 = (C13731) c17613.m40106();
                        C13731 c1373102 = c15071.f43053;
                        if (c1373102 == null) {
                            c1373102 = new C13731();
                        } else {
                            c15071.f43053 = null;
                        }
                        c1373101.m31258(c1373102);
                        c17613.m40105(c1373102);
                    }
                    break;
                case 68:
                    C13731 c1373103 = c15071.f43053;
                    if (c1373103 == null) {
                        c1373103 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c1373104 = (C13731) c17613.m40106();
                    C13731 c1373105 = (C13731) c17613.m40106();
                    c1373105.m31224(c1373104, c1373103);
                    c17613.m40105(c1373103);
                    if (c1373105.f38730) {
                        c1373105.m31252();
                        c15071.f43053 = c1373105;
                    } else if (c1373104.f38730) {
                        c1373104.m31252();
                        c15071.f43053 = c1373104;
                    }
                    break;
                case 69:
                    c13731Arr2[c15071.m34481()].m31234((C13731) c17613.m40106(), ((C13731) c17613.m40106()).m31222());
                    break;
                case 70:
                    c13731Arr[c15071.m34481()].m31201();
                    break;
                case 71:
                    int iM312210 = ((C13731) c17613.m40106()).m31222();
                    C13731 c1373106 = c15071.f43053;
                    if (c1373106 == null) {
                        c1373106 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c1373106.m31208(new byte[iM312210]);
                    c17613.m40105(c1373106);
                    break;
                case 72:
                    c13731Arr[c15071.m34481()].m31234((C13731) c17613.m40106(), ((C13731) c17613.m40106()).m31222());
                    break;
                case 73:
                    C13731 c1373107 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31239(c1373107);
                    if (c1373107.f38730) {
                        c1373107.m31252();
                        c15071.f43053 = c1373107;
                    }
                    break;
                case 74:
                    C13731 c1373108 = c15071.f43053;
                    if (c1373108 == null) {
                        c1373108 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c1373109 = (C13731) c17613.m40106();
                    C13731 c1373110 = (C13731) c17613.m40106();
                    c1373110.m31199(c1373109, c1373108);
                    c17613.m40105(c1373108);
                    if (c1373110.f38730) {
                        c1373110.m31252();
                        c15071.f43053 = c1373110;
                    } else if (c1373109.f38730) {
                        c1373109.m31252();
                        c15071.f43053 = c1373109;
                    }
                    break;
                case 75:
                    C13731 c1373111 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31233(c1373111);
                    if (c1373111.f38730) {
                        c1373111.m31252();
                        c15071.f43053 = c1373111;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    C13731 c1373112 = c15071.f43053;
                    if (c1373112 == null) {
                        c1373112 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    byte[] bArr4 = c14401.f41161;
                    int i11 = c15071.f43047;
                    c15071.f43047 = i11 + 1;
                    c1373112.m31202(bArr4[i11]);
                    c17613.m40105(c1373112);
                    break;
                case 77:
                    C13731 c1373113 = (C13731) c17613.m40106();
                    ((C13731) c17613.m40106()).m31225(c1373113);
                    if (c1373113.f38730) {
                        c1373113.m31252();
                        c15071.f43053 = c1373113;
                    }
                    break;
                case 78:
                    short sM34484 = c15071.m34481();
                    C13731 c1373114 = (C13731) c17613.m40106();
                    c13731Arr[sM34484] = c1373114;
                    c1373114.f38730 = false;
                    break;
                case 79:
                    int iM312211 = ((C13731) c17613.m40106()).m31222();
                    C13731 c1373115 = c15071.f43053;
                    if (c1373115 == null) {
                        c1373115 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c1373115.m31208(new short[iM312211]);
                    c17613.m40105(c1373115);
                    break;
                case 80:
                    C13731 c1373116 = c15071.f43053;
                    if (c1373116 == null) {
                        c1373116 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    C13731 c1373117 = (C13731) c17613.m40106();
                    C13731 c1373118 = (C13731) c17613.m40106();
                    c1373118.m31217(c1373117, c1373116);
                    c17613.m40105(c1373116);
                    if (c1373118.f38730) {
                        c1373118.m31252();
                        c15071.f43053 = c1373118;
                    } else if (c1373117.f38730) {
                        c1373117.m31252();
                        c15071.f43053 = c1373117;
                    }
                    break;
                case 81:
                    C13731 c1373119 = c15071.f43053;
                    if (c1373119 == null) {
                        c1373119 = new C13731();
                    } else {
                        c15071.f43053 = null;
                    }
                    c1373119.m31206(c13731Arr2[c15071.m34481()].m31232());
                    c17613.m40105(c1373119);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }
}
