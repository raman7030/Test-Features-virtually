package l;

import bin.mt.plus.Features;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.۫᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12660 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f38134;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f38135;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String[] f38136;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f38137;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short f38138;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f38139;

    public C12660(C3488 c3488, int i) {
        C21833 c21833;
        int i2 = c3488.f11052;
        c3488.f11052 = i;
        int iM10669 = c3488.m10669() - 2;
        this.f38138 = c3488.m10671();
        if (C4899.f15467 != null) {
            Object[] objArrAnalyze = Features.analyze(c3488.m10670(iM10669));
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
            c21833 = new C21833(bArr2, bArr, iArr, iArr2, strArr);
        } else {
            c21833 = new C21833(new C22538(c3488.m10670(iM10669)));
        }
        this.f38135 = c21833.f69945;
        this.f38134 = c21833.f69944;
        this.f38137 = c21833.f69946;
        this.f38139 = c21833.f69948;
        this.f38136 = c21833.f69947;
        c3488.f11052 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30938(C20422 c20422, boolean z) {
        C13365 c13365 = new C13365(this, c20422, z);
        while (true) {
            int i = c13365.f39983;
            c13365.f39983 = i + 1;
            byte b = this.f38135[i];
            byte[] bArr = this.f38134;
            int[] iArr = this.f38139;
            int[] iArr2 = this.f38137;
            C12660 c12660 = c13365.f39982;
            C11955[] c11955Arr = c13365.f39985;
            C11955[] c11955Arr2 = c13365.f39981;
            C16040 c16040 = c13365.f39984;
            switch (b) {
                case 0:
                    short sM32380 = c13365.m32380();
                    C11955 c11955 = (C11955) c16040.m37917();
                    c11955Arr[sM32380] = c11955;
                    c11955.f35719 = false;
                    break;
                case 1:
                    C11955 c11956 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29201(c11956);
                    if (c11956.f35719) {
                        c11956.m29198();
                        c13365.f39986 = c11956;
                    }
                    break;
                case 2:
                    int iM32378 = c13365.m32378();
                    if (!((C11955) c16040.m37917()).m29191()) {
                        c13365.f39980 = iArr2[iM32378];
                        c13365.f39983 = iArr[iM32378];
                    } else if (c13365.f39986 == null) {
                        C11955 c11957 = (C11955) c16040.m37919();
                        if (c11957.f35719) {
                            c11957.m29198();
                            c13365.f39986 = c11957;
                        }
                    } else {
                        c16040.m37919();
                    }
                    break;
                case 3:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c11958 = (C11955) c16040.m37917();
                        c11958.m29196(c11958);
                    } else {
                        C11955 c11959 = (C11955) c16040.m37919();
                        C11955 c119510 = c13365.f39986;
                        if (c119510 == null) {
                            c119510 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c11959.m29196(c119510);
                        c16040.m37918(c119510);
                    }
                    break;
                case 4:
                    C11955 c119511 = c13365.f39986;
                    if (c119511 == null) {
                        c119511 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119512 = (C11955) c16040.m37919();
                    C11955 c119513 = (C11955) c16040.m37919();
                    c119513.m29184(c119512, c119511);
                    c16040.m37918(c119511);
                    if (c119513.f35719) {
                        c119513.m29198();
                        c13365.f39986 = c119513;
                    } else if (c119512.f35719) {
                        c119512.m29198();
                        c13365.f39986 = c119512;
                    }
                    break;
                case 5:
                    int iM29168 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119514 = c13365.f39986;
                    if (c119514 == null) {
                        c119514 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119514.m29154(new long[iM29168]);
                    c16040.m37918(c119514);
                    break;
                case 6:
                    int i2 = c13365.f39980;
                    int i3 = i2 + 1;
                    c13365.f39980 = i3;
                    if (bArr[i2] == 0) {
                        int iM46821 = c20422.m46821(new String(bArr, i3, 32));
                        int i4 = c13365.f39980;
                        bArr[i4 - 1] = 1;
                        bArr[i4] = (byte) (iM46821 & 255);
                        bArr[i4 + 1] = (byte) ((iM46821 >>> 8) & 255);
                        bArr[i4 + 2] = (byte) ((iM46821 >>> 16) & 255);
                        bArr[i4 + 3] = (byte) ((iM46821 >>> 24) & 255);
                    }
                    c20422.m46822(c13365.m32378());
                    c13365.f39980 += 28;
                    break;
                case 7:
                    int iM29169 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119515 = c13365.f39986;
                    if (c119515 == null) {
                        c119515 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119515.m29154(new int[iM29169]);
                    c16040.m37918(c119515);
                    break;
                case 8:
                    C11955 c119516 = c13365.f39986;
                    if (c119516 == null) {
                        c119516 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    byte[] bArr2 = c12660.f38134;
                    int i5 = c13365.f39980;
                    c13365.f39980 = i5 + 1;
                    c119516.m29160(bArr2[i5] != 0);
                    c16040.m37918(c119516);
                    break;
                case 9:
                    int iM291610 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119517 = c13365.f39986;
                    if (c119517 == null) {
                        c119517 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119517.m29154(new String[iM291610]);
                    c16040.m37918(c119517);
                    break;
                case 10:
                    C11955 c119518 = c13365.f39986;
                    if (c119518 == null) {
                        c119518 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    int i6 = (c12660.f38134[c13365.f39980 + 1] & 255) << 8;
                    byte[] bArr3 = c12660.f38134;
                    int i7 = c13365.f39980;
                    char c = (char) (i6 | (bArr3[i7] & 255));
                    c13365.f39980 = i7 + 2;
                    c119518.m29149(c);
                    c16040.m37918(c119518);
                    break;
                case 11:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119519 = (C11955) c16040.m37917();
                        c119519.m29176(c119519);
                    } else {
                        C11955 c119520 = (C11955) c16040.m37919();
                        C11955 c119521 = c13365.f39986;
                        if (c119521 == null) {
                            c119521 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119520.m29176(c119521);
                        c16040.m37918(c119521);
                    }
                    break;
                case 12:
                    C11955 c119522 = c13365.f39986;
                    if (c119522 == null) {
                        c119522 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119523 = (C11955) c16040.m37919();
                    C11955 c119524 = (C11955) c16040.m37919();
                    c119524.m29177(c119523, c119522);
                    c16040.m37918(c119522);
                    if (c119524.f35719) {
                        c119524.m29198();
                        c13365.f39986 = c119524;
                    } else if (c119523.f35719) {
                        c119523.m29198();
                        c13365.f39986 = c119523;
                    }
                    break;
                case 13:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119525 = (C11955) c16040.m37917();
                        c119525.m29193(c119525);
                    } else {
                        C11955 c119526 = (C11955) c16040.m37919();
                        C11955 c119527 = c13365.f39986;
                        if (c119527 == null) {
                            c119527 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119526.m29193(c119527);
                        c16040.m37918(c119527);
                    }
                    break;
                case 14:
                    C11955 c119528 = c13365.f39986;
                    if (c119528 == null) {
                        c119528 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119528.m29152(c13365.m32378());
                    c16040.m37918(c119528);
                    break;
                case 15:
                    int iM291611 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119529 = c13365.f39986;
                    if (c119529 == null) {
                        c119529 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119529.m29154(new boolean[iM291611]);
                    c16040.m37918(c119529);
                    break;
                case 16:
                    C11955 c119530 = c13365.f39986;
                    if (c119530 == null) {
                        c119530 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119531 = (C11955) c16040.m37919();
                    c119531.m29164(c119530);
                    c16040.m37918(c119530);
                    if (c119531.f35719) {
                        c119531.m29198();
                        c13365.f39986 = c119531;
                    }
                    break;
                case 17:
                    c16040.m37918(c11955Arr2[c13365.m32380()]);
                    break;
                case 18:
                    int iM32379 = c13365.m32378();
                    c13365.f39980 = iArr2[iM32379];
                    c13365.f39983 = iArr[iM32379];
                    break;
                case 19:
                    int iM291612 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119532 = c13365.f39986;
                    if (c119532 == null) {
                        c119532 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119532.m29154(new float[iM291612]);
                    c16040.m37918(c119532);
                    break;
                case 20:
                    C11955 c119533 = c13365.f39986;
                    if (c119533 == null) {
                        c119533 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119534 = (C11955) c16040.m37919();
                    C11955 c119535 = (C11955) c16040.m37919();
                    c119535.m29202(c119534, c119533);
                    c16040.m37918(c119533);
                    if (c119535.f35719) {
                        c119535.m29198();
                        c13365.f39986 = c119535;
                    } else if (c119534.f35719) {
                        c119534.m29198();
                        c13365.f39986 = c119534;
                    }
                    break;
                case 21:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119536 = (C11955) c16040.m37917();
                        c119536.m29189(c119536);
                    } else {
                        C11955 c119537 = (C11955) c16040.m37919();
                        C11955 c119538 = c13365.f39986;
                        if (c119538 == null) {
                            c119538 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119537.m29189(c119538);
                        c16040.m37918(c119538);
                    }
                    break;
                case 22:
                    C11955 c119539 = c13365.f39986;
                    if (c119539 == null) {
                        c119539 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955Arr[c13365.m32380()].m29157(c119539, ((C11955) c16040.m37919()).m29168());
                    c16040.m37918(c119539);
                    break;
                case 23:
                    C11955 c119540 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29144(c119540);
                    if (c119540.f35719) {
                        c119540.m29198();
                        c13365.f39986 = c119540;
                    }
                    break;
                case 24:
                    int i8 = c13365.f39980;
                    int i9 = i8 + 1;
                    c13365.f39980 = i9;
                    if (bArr[i8] == 0) {
                        int iM46823 = c20422.m46823(new String(bArr, i9, 32));
                        int i10 = c13365.f39980;
                        bArr[i10 - 1] = 1;
                        bArr[i10] = (byte) (iM46823 & 255);
                        bArr[i10 + 1] = (byte) ((iM46823 >>> 8) & 255);
                        bArr[i10 + 2] = (byte) ((iM46823 >>> 16) & 255);
                        bArr[i10 + 3] = (byte) ((iM46823 >>> 24) & 255);
                    }
                    c20422.m46824(c13365.m32378());
                    c13365.f39980 += 28;
                    break;
                case 25:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119541 = (C11955) c16040.m37917();
                        c119541.m29183(c119541);
                    } else {
                        C11955 c119542 = (C11955) c16040.m37919();
                        C11955 c119543 = c13365.f39986;
                        if (c119543 == null) {
                            c119543 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119542.m29183(c119543);
                        c16040.m37918(c119543);
                    }
                    break;
                case 26:
                    c16040.m37919();
                    break;
                case 27:
                    int iM291613 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119544 = c13365.f39986;
                    if (c119544 == null) {
                        c119544 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119544.m29154(new char[iM291613]);
                    c16040.m37918(c119544);
                    break;
                case 28:
                    C11955 c119545 = c13365.f39986;
                    if (c119545 == null) {
                        c119545 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119546 = (C11955) c16040.m37919();
                    C11955 c119547 = (C11955) c16040.m37919();
                    c119547.m29197(c119546, c119545);
                    c16040.m37918(c119545);
                    if (c119547.f35719) {
                        c119547.m29198();
                        c13365.f39986 = c119547;
                    } else if (c119546.f35719) {
                        c119546.m29198();
                        c13365.f39986 = c119546;
                    }
                    break;
                case 29:
                    c11955Arr2[c13365.m32380()].m29161();
                    break;
                case 30:
                    C11955 c119548 = c13365.f39986;
                    if (c119548 == null) {
                        c119548 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119549 = (C11955) c16040.m37919();
                    C11955 c119550 = (C11955) c16040.m37919();
                    c119550.m29174(c119549, c119548);
                    c16040.m37918(c119548);
                    if (c119550.f35719) {
                        c119550.m29198();
                        c13365.f39986 = c119550;
                    } else if (c119549.f35719) {
                        c119549.m29198();
                        c13365.f39986 = c119549;
                    }
                    break;
                case 31:
                    C11955 c119551 = c13365.f39986;
                    if (c119551 == null) {
                        c119551 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119551.m29151(Float.intBitsToFloat(c13365.m32378()));
                    c16040.m37918(c119551);
                    break;
                case 32:
                    int iM323710 = c13365.m32378();
                    if (((C11955) c16040.m37917()).m29191()) {
                        c13365.f39980 = iArr2[iM323710];
                        c13365.f39983 = iArr[iM323710];
                    } else if (c13365.f39986 == null) {
                        C11955 c119552 = (C11955) c16040.m37919();
                        if (c119552.f35719) {
                            c119552.m29198();
                            c13365.f39986 = c119552;
                        }
                    } else {
                        c16040.m37919();
                    }
                    break;
                case 33:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119553 = (C11955) c16040.m37917();
                        c119553.m29169(c119553);
                    } else {
                        C11955 c119554 = (C11955) c16040.m37919();
                        C11955 c119555 = c13365.f39986;
                        if (c119555 == null) {
                            c119555 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119554.m29169(c119555);
                        c16040.m37918(c119555);
                    }
                    break;
                case 34:
                    C11955 c119556 = c13365.f39986;
                    if (c119556 == null) {
                        c119556 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119557 = (C11955) c16040.m37919();
                    c119557.m29162(c119556);
                    c16040.m37918(c119556);
                    if (c119557.f35719) {
                        c119557.m29198();
                        c13365.f39986 = c119557;
                    }
                    break;
                case 35:
                    int iM291614 = ((C11955) c16040.m37919()).m29168();
                    C11955 c119558 = c13365.f39986;
                    if (c119558 == null) {
                        c119558 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119558.m29154(new double[iM291614]);
                    c16040.m37918(c119558);
                    break;
                case 36:
                    C11955 c119559 = c13365.f39986;
                    if (c119559 == null) {
                        c119559 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119559.m29152(c11955Arr[c13365.m32380()].m29178());
                    c16040.m37918(c119559);
                    break;
                case 37:
                    c11955Arr2[c13365.m32380()].m29147();
                    break;
                case 38:
                    C11955 c119560 = c13365.f39986;
                    if (c119560 == null) {
                        c119560 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119561 = (C11955) c16040.m37919();
                    C11955 c119562 = (C11955) c16040.m37919();
                    c119562.m29181(c119561, c119560);
                    c16040.m37918(c119560);
                    if (c119562.f35719) {
                        c119562.m29198();
                        c13365.f39986 = c119562;
                    } else if (c119561.f35719) {
                        c119561.m29198();
                        c13365.f39986 = c119561;
                    }
                    break;
                case 39:
                    C11955 c119563 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29173(c119563);
                    if (c119563.f35719) {
                        c119563.m29198();
                        c13365.f39986 = c119563;
                    }
                    break;
                case 40:
                    c11955Arr[c13365.m32380()].m29161();
                    break;
                case 41:
                    C11955 c119564 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29199(c119564);
                    if (c119564.f35719) {
                        c119564.m29198();
                        c13365.f39986 = c119564;
                    }
                    break;
                case 42:
                    C11955 c119565 = c13365.f39986;
                    if (c119565 == null) {
                        c119565 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119566 = (C11955) c16040.m37919();
                    C11955 c119567 = (C11955) c16040.m37919();
                    c119567.m29158(c119566, c119565);
                    c16040.m37918(c119565);
                    if (c119567.f35719) {
                        c119567.m29198();
                        c13365.f39986 = c119567;
                    } else if (c119566.f35719) {
                        c119566.m29198();
                        c13365.f39986 = c119566;
                    }
                    break;
                case 43:
                    C11955 c119568 = c13365.f39986;
                    if (c119568 == null) {
                        c119568 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119568.m29155(this.f38136[c13365.m32378()]);
                    c16040.m37918(c119568);
                    break;
                case 44:
                    C11955 c119569 = c13365.f39986;
                    if (c119569 == null) {
                        c119569 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119570 = (C11955) c16040.m37919();
                    C11955 c119571 = (C11955) c16040.m37919();
                    c119571.m29188(c119570, c119569);
                    c16040.m37918(c119569);
                    if (c119571.f35719) {
                        c119571.m29198();
                        c13365.f39986 = c119571;
                    } else if (c119570.f35719) {
                        c119570.m29198();
                        c13365.f39986 = c119570;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C11955 c119572 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29167(c119572);
                    if (c119572.f35719) {
                        c119572.m29198();
                        c13365.f39986 = c119572;
                    }
                    break;
                case 46:
                    return;
                case 47:
                    short sM32381 = c13365.m32380();
                    C11955 c119573 = (C11955) c16040.m37917();
                    c11955Arr2[sM32381] = c119573;
                    c119573.f35719 = false;
                    break;
                case 48:
                    C11955 c119574 = c13365.f39986;
                    if (c119574 == null) {
                        c119574 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119575 = (C11955) c16040.m37919();
                    C11955 c119576 = (C11955) c16040.m37919();
                    c119576.m29194(c119575, c119574);
                    c16040.m37918(c119574);
                    if (c119576.f35719) {
                        c119576.m29198();
                        c13365.f39986 = c119576;
                    } else if (c119575.f35719) {
                        c119575.m29198();
                        c13365.f39986 = c119575;
                    }
                    break;
                case 49:
                    short sM32382 = c13365.m32380();
                    C11955 c119577 = (C11955) c16040.m37919();
                    c11955Arr2[sM32382] = c119577;
                    c119577.f35719 = false;
                    break;
                case 50:
                    if (((C11955) c16040.m37919()).m29191()) {
                        int iM323711 = c13365.m32378();
                        c13365.f39980 = iArr2[iM323711];
                        c13365.f39983 = iArr[iM323711];
                    } else {
                        c13365.f39980 += 4;
                    }
                    break;
                case 51:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119578 = (C11955) c16040.m37917();
                        c119578.m29207(c119578);
                    } else {
                        C11955 c119579 = (C11955) c16040.m37919();
                        C11955 c119580 = c13365.f39986;
                        if (c119580 == null) {
                            c119580 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119579.m29207(c119580);
                        c16040.m37918(c119580);
                    }
                    break;
                case 52:
                    if (!((C11955) c16040.m37919()).m29191()) {
                        int iM323712 = c13365.m32378();
                        c13365.f39980 = iArr2[iM323712];
                        c13365.f39983 = iArr[iM323712];
                    } else {
                        c13365.f39980 += 4;
                    }
                    break;
                case 53:
                    C11955 c119581 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29187(c119581);
                    if (c119581.f35719) {
                        c119581.m29198();
                        c13365.f39986 = c119581;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    C11955 c119582 = c13365.f39986;
                    if (c119582 == null) {
                        c119582 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119583 = (C11955) c16040.m37919();
                    C11955 c119584 = (C11955) c16040.m37919();
                    c119584.m29208(c119583, c119582);
                    c16040.m37918(c119582);
                    if (c119584.f35719) {
                        c119584.m29198();
                        c13365.f39986 = c119584;
                    } else if (c119583.f35719) {
                        c119583.m29198();
                        c13365.f39986 = c119583;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    C11955 c119585 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29156(c119585);
                    if (c119585.f35719) {
                        c119585.m29198();
                        c13365.f39986 = c119585;
                    }
                    break;
                case 56:
                    C11955 c119586 = c13365.f39986;
                    if (c119586 == null) {
                        c119586 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119587 = (C11955) c16040.m37919();
                    C11955 c119588 = (C11955) c16040.m37919();
                    c119588.m29200(c119587, c119586);
                    c16040.m37918(c119586);
                    if (c119588.f35719) {
                        c119588.m29198();
                        c13365.f39986 = c119588;
                    } else if (c119587.f35719) {
                        c119587.m29198();
                        c13365.f39986 = c119587;
                    }
                    break;
                case 57:
                    C11955 c119589 = c13365.f39986;
                    if (c119589 == null) {
                        c119589 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955Arr2[c13365.m32380()].m29157(c119589, ((C11955) c16040.m37919()).m29168());
                    c16040.m37918(c119589);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    C11955 c119590 = c13365.f39986;
                    if (c119590 == null) {
                        c119590 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119591 = (C11955) c16040.m37919();
                    C11955 c119592 = (C11955) c16040.m37919();
                    c119592.m29190(c119591, c119590);
                    c16040.m37918(c119590);
                    if (c119592.f35719) {
                        c119592.m29198();
                        c13365.f39986 = c119592;
                    } else if (c119591.f35719) {
                        c119591.m29198();
                        c13365.f39986 = c119591;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    C11955 c119593 = c13365.f39986;
                    if (c119593 == null) {
                        c119593 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119593.m29150(Double.longBitsToDouble(c13365.m32379()));
                    c16040.m37918(c119593);
                    break;
                case 60:
                    C11955 c119594 = c13365.f39986;
                    if (c119594 == null) {
                        c119594 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119595 = (C11955) c16040.m37919();
                    C11955 c119596 = (C11955) c16040.m37919();
                    c119596.m29165(c119595, c119594);
                    c16040.m37918(c119594);
                    if (c119596.f35719) {
                        c119596.m29198();
                        c13365.f39986 = c119596;
                    } else if (c119595.f35719) {
                        c119595.m29198();
                        c13365.f39986 = c119595;
                    }
                    break;
                case 61:
                    C11955 c119597 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29146(c119597);
                    if (c119597.f35719) {
                        c119597.m29198();
                        c13365.f39986 = c119597;
                    }
                    break;
                case 62:
                    C11955 c119598 = c13365.f39986;
                    if (c119598 == null) {
                        c119598 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119598.m29153(c13365.m32379());
                    c16040.m37918(c119598);
                    break;
                case 63:
                    C11955 c119599 = c13365.f39986;
                    if (c119599 == null) {
                        c119599 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c119599.m29159(c13365.m32380());
                    c16040.m37918(c119599);
                    break;
                case 64:
                    c16040.m37918(c11955Arr[c13365.m32380()]);
                    break;
                case 65:
                    int iM291615 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195100 = c13365.f39986;
                    if (c1195100 == null) {
                        c1195100 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195100.m29154(new Object[iM291615]);
                    c16040.m37918(c1195100);
                    break;
                case 66:
                    C11955 c1195101 = c13365.f39986;
                    if (c1195101 == null) {
                        c1195101 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195102 = (C11955) c16040.m37919();
                    C11955 c1195103 = (C11955) c16040.m37919();
                    c1195103.m29205(c1195102, c1195101);
                    c16040.m37918(c1195101);
                    if (c1195103.f35719) {
                        c1195103.m29198();
                        c13365.f39986 = c1195103;
                    } else if (c1195102.f35719) {
                        c1195102.m29198();
                        c13365.f39986 = c1195102;
                    }
                    break;
                case 67:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195104 = (C11955) c16040.m37917();
                        c1195104.m29204(c1195104);
                    } else {
                        C11955 c1195105 = (C11955) c16040.m37919();
                        C11955 c1195106 = c13365.f39986;
                        if (c1195106 == null) {
                            c1195106 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195105.m29204(c1195106);
                        c16040.m37918(c1195106);
                    }
                    break;
                case 68:
                    C11955 c1195107 = c13365.f39986;
                    if (c1195107 == null) {
                        c1195107 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195108 = (C11955) c16040.m37919();
                    C11955 c1195109 = (C11955) c16040.m37919();
                    c1195109.m29170(c1195108, c1195107);
                    c16040.m37918(c1195107);
                    if (c1195109.f35719) {
                        c1195109.m29198();
                        c13365.f39986 = c1195109;
                    } else if (c1195108.f35719) {
                        c1195108.m29198();
                        c13365.f39986 = c1195108;
                    }
                    break;
                case 69:
                    c11955Arr2[c13365.m32380()].m29180((C11955) c16040.m37919(), ((C11955) c16040.m37919()).m29168());
                    break;
                case 70:
                    c11955Arr[c13365.m32380()].m29147();
                    break;
                case 71:
                    int iM291616 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195110 = c13365.f39986;
                    if (c1195110 == null) {
                        c1195110 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195110.m29154(new byte[iM291616]);
                    c16040.m37918(c1195110);
                    break;
                case 72:
                    c11955Arr[c13365.m32380()].m29180((C11955) c16040.m37919(), ((C11955) c16040.m37919()).m29168());
                    break;
                case 73:
                    C11955 c1195111 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29185(c1195111);
                    if (c1195111.f35719) {
                        c1195111.m29198();
                        c13365.f39986 = c1195111;
                    }
                    break;
                case 74:
                    C11955 c1195112 = c13365.f39986;
                    if (c1195112 == null) {
                        c1195112 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195113 = (C11955) c16040.m37919();
                    C11955 c1195114 = (C11955) c16040.m37919();
                    c1195114.m29145(c1195113, c1195112);
                    c16040.m37918(c1195112);
                    if (c1195114.f35719) {
                        c1195114.m29198();
                        c13365.f39986 = c1195114;
                    } else if (c1195113.f35719) {
                        c1195113.m29198();
                        c13365.f39986 = c1195113;
                    }
                    break;
                case 75:
                    C11955 c1195115 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29179(c1195115);
                    if (c1195115.f35719) {
                        c1195115.m29198();
                        c13365.f39986 = c1195115;
                    }
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    C11955 c1195116 = c13365.f39986;
                    if (c1195116 == null) {
                        c1195116 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    byte[] bArr4 = c12660.f38134;
                    int i11 = c13365.f39980;
                    c13365.f39980 = i11 + 1;
                    c1195116.m29148(bArr4[i11]);
                    c16040.m37918(c1195116);
                    break;
                case 77:
                    C11955 c1195117 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29171(c1195117);
                    if (c1195117.f35719) {
                        c1195117.m29198();
                        c13365.f39986 = c1195117;
                    }
                    break;
                case 78:
                    short sM32383 = c13365.m32380();
                    C11955 c1195118 = (C11955) c16040.m37919();
                    c11955Arr[sM32383] = c1195118;
                    c1195118.f35719 = false;
                    break;
                case 79:
                    int iM291617 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195119 = c13365.f39986;
                    if (c1195119 == null) {
                        c1195119 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195119.m29154(new short[iM291617]);
                    c16040.m37918(c1195119);
                    break;
                case 80:
                    C11955 c1195120 = c13365.f39986;
                    if (c1195120 == null) {
                        c1195120 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195121 = (C11955) c16040.m37919();
                    C11955 c1195122 = (C11955) c16040.m37919();
                    c1195122.m29163(c1195121, c1195120);
                    c16040.m37918(c1195120);
                    if (c1195122.f35719) {
                        c1195122.m29198();
                        c13365.f39986 = c1195122;
                    } else if (c1195121.f35719) {
                        c1195121.m29198();
                        c13365.f39986 = c1195121;
                    }
                    break;
                case 81:
                    C11955 c1195123 = c13365.f39986;
                    if (c1195123 == null) {
                        c1195123 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195123.m29152(c11955Arr2[c13365.m32380()].m29178());
                    c16040.m37918(c1195123);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }
}
