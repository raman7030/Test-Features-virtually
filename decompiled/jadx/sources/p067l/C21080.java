package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.᩵᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A570 */
/* JADX INFO: loaded from: classes4.dex */
public class C21080 {

    /* JADX INFO: renamed from: ֫ */
    public int f66224;

    /* JADX INFO: renamed from: ۜ */
    public short f66225;

    /* JADX INFO: renamed from: ۧ */
    public int[] f66226;

    /* JADX INFO: renamed from: ܳ */
    public int[] f66227;

    /* JADX INFO: renamed from: ܽ */
    public int[] f66228;

    /* JADX INFO: renamed from: ܿ */
    public int[] f66229;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f66230;

    /* JADX INFO: renamed from: ᩷ */
    public C3644 f66231;

    /* JADX INFO: renamed from: ᩻ */
    public short f66232;

    public C21080(C3644 c3644) {
        this.f66231 = c3644;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47576(C21080 c21080) {
        this.f66228 = c21080.f66228;
        this.f66230 = c21080.f66230;
        this.f66232 = (short) 0;
        this.f66229 = c21080.f66229;
        this.f66227 = c21080.f66227;
        this.f66225 = c21080.f66225;
        this.f66224 = c21080.f66224;
        this.f66226 = c21080.f66226;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47564(C8338 c8338, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return m47565(c8338, C13703.m31148((String) obj).m31152(), 0);
        }
        C3644 c3644 = (C3644) obj;
        if ((c3644.f7650 & 4) != 0) {
            return c8338.m19239(c3644.f7644, "") | 12582912;
        }
        return c8338.m19241(c3644) | 16777216;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m47565(C8338 c8338, String str, int i) {
        int iM19263;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return c8338.m19263(C17073.m38720(1, i + 1, str)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 == 'F') {
                            iM19263 = 4194306;
                        } else if (cCharAt2 == 'L') {
                            iM19263 = c8338.m19263(C17073.m38720(1, i2 + 1, str)) | 8388608;
                        } else if (cCharAt2 == 'S') {
                            iM19263 = 4194316;
                        } else if (cCharAt2 == 'Z') {
                            iM19263 = 4194313;
                        } else if (cCharAt2 == 'I') {
                            iM19263 = 4194305;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM19263 = 4194314;
                                    break;
                                case 'C':
                                    iM19263 = 4194315;
                                    break;
                                case 'D':
                                    iM19263 = 4194307;
                                    break;
                                default:
                                    throw new IllegalArgumentException(C21466.m48631("Invalid descriptor fragment: ", str.substring(i2)));
                            }
                        } else {
                            iM19263 = 4194308;
                        }
                        return iM19263 | ((i2 - i) << 26);
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException(C21466.m48631("Invalid descriptor: ", str.substring(i)));
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47574(C8338 c8338, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f66228 = iArr;
        this.f66230 = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = c8338.m19263(c8338.m19255()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (C13703 c13703 : C13703.m31145(str)) {
            int iM47565 = m47565(c8338, c13703.m31152(), 0);
            int[] iArr2 = this.f66228;
            int i4 = i3 + 1;
            iArr2[i3] = iM47565;
            if (iM47565 == 4194308 || iM47565 == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f66228[i3] = 4194304;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47575(C8338 c8338, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f66228[i3] = m47564(c8338, objArr[i4]);
            if (objArr[i4] == 4 || objArr[i4] == 3) {
                i3 += 2;
                this.f66228[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.f66228;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            if (objArr2[i7] == 4 || objArr2[i7] == 3) {
                i6++;
            }
        }
        this.f66230 = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.f66230[i8] = m47564(c8338, objArr2[i9]);
            if (objArr2[i9] == 4 || objArr2[i9] == 3) {
                i8 += 2;
                this.f66230[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.f66225 = (short) 0;
        this.f66224 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m47573() {
        return this.f66230.length;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m47561(int i) {
        int[] iArr = this.f66229;
        if (iArr == null || i >= iArr.length) {
            return i | 20971520;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 20971520 | i;
        iArr[i] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m47571(int i, int i2) {
        if (this.f66229 == null) {
            this.f66229 = new int[10];
        }
        int length = this.f66229.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f66229, 0, iArr, 0, length);
            this.f66229 = iArr;
        }
        this.f66229[i] = i2;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m47572(int i) {
        if (this.f66227 == null) {
            this.f66227 = new int[10];
        }
        int length = this.f66227.length;
        short s = this.f66225;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f66227, 0, iArr, 0, length);
            this.f66227 = iArr;
        }
        int[] iArr2 = this.f66227;
        short s2 = this.f66225;
        short s3 = (short) (s2 + 1);
        this.f66225 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f66232 + s3);
        C3644 c3644 = this.f66231;
        if (s4 > c3644.f7652) {
            c3644.f7652 = s4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47567(C8338 c8338, String str) {
        int iM47565 = m47565(c8338, str, str.charAt(0) == '(' ? C13703.m31150(str) : 0);
        if (iM47565 != 0) {
            m47572(iM47565);
            if (iM47565 == 4194308 || iM47565 == 4194307) {
                m47572(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m47569() {
        short s = this.f66225;
        if (s > 0) {
            int[] iArr = this.f66227;
            short s2 = (short) (s - 1);
            this.f66225 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.f66232 - 1);
        this.f66232 = s3;
        return (-s3) | 25165824;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m47570(int i) {
        short s = this.f66225;
        if (s >= i) {
            this.f66225 = (short) (s - i);
        } else {
            this.f66232 = (short) (this.f66232 - (i - s));
            this.f66225 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47566(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m47570((C13703.m31147(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m47570(2);
        } else {
            m47570(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[LOOP:0: B:9:0x0011->B:25:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x003a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private int m47563(C8338 c8338, int i) {
        int i2;
        int iM19263;
        int i3;
        if (i == 4194310 || (i3 = (-4194304) & i) == 12582912 || i3 == 16777216) {
            for (int i4 = 0; i4 < this.f66224; i4++) {
                int i5 = this.f66226[i4];
                int i6 = (-67108864) & i5;
                int i7 = 62914560 & i5;
                int i8 = i5 & 1048575;
                if (i7 == 20971520) {
                    i2 = this.f66228[i8];
                } else {
                    if (i7 == 25165824) {
                        int[] iArr = this.f66230;
                        i2 = iArr[iArr.length - i8];
                    }
                    if (i == i5) {
                        if (i == 4194310) {
                            iM19263 = c8338.m19263(c8338.m19255());
                        } else {
                            iM19263 = c8338.m19263(c8338.m19260(i & 1048575).f42972);
                        }
                        return iM19263 | 8388608;
                    }
                }
                i5 = i2 + i6;
                if (i == i5) {
                    if (i == 4194310) {
                        iM19263 = c8338.m19263(c8338.m19255());
                    } else {
                        iM19263 = c8338.m19263(c8338.m19260(i & 1048575).f42972);
                    }
                    return iM19263 | 8388608;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0228  */
    /* JADX WARN: Code duplicated, block: B:145:0x0239  */
    /* JADX WARN: Code duplicated, block: B:159:0x0279  */
    /* JADX WARN: Code duplicated, block: B:163:0x028d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX INFO: renamed from: ֫ */
    public void mo40283(int i, int i2, AbstractC15043 abstractC15043, C8338 c8338) {
        switch (i) {
            case 0:
                return;
            case 1:
                m47572(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                m47572(4194305);
                return;
            case 9:
            case 10:
                m47572(4194308);
                m47572(4194304);
                return;
            case 11:
            case 12:
            case 13:
                m47572(4194306);
                return;
            case 14:
            case 15:
                m47572(4194307);
                m47572(4194304);
                return;
            case 18:
                int i3 = abstractC15043.f42968;
                switch (i3) {
                    case 3:
                        m47572(4194305);
                        return;
                    case 4:
                        m47572(4194306);
                        return;
                    case 5:
                        m47572(4194308);
                        m47572(4194304);
                        return;
                    case 6:
                        m47572(4194307);
                        m47572(4194304);
                        return;
                    case 7:
                        m47572(8388608 | c8338.m19263("java/lang/Class"));
                        return;
                    case 8:
                        m47572(8388608 | c8338.m19263("java/lang/String"));
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m47572(8388608 | c8338.m19263("java/lang/invoke/MethodHandle"));
                                return;
                            case 16:
                                m47572(8388608 | c8338.m19263("java/lang/invoke/MethodType"));
                                return;
                            case 17:
                                m47567(c8338, abstractC15043.f42972);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        m47572(4194305);
                        return;
                    case 22:
                        m47572(4194308);
                        m47572(4194304);
                        return;
                    case 23:
                        m47572(4194306);
                        return;
                    case 24:
                        m47572(4194307);
                        m47572(4194304);
                        return;
                    case 25:
                        m47572(m47561(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                m47570(2);
                                m47572(4194305);
                                return;
                            case 47:
                                m47570(2);
                                m47572(4194308);
                                m47572(4194304);
                                return;
                            case 48:
                                m47570(2);
                                m47572(4194306);
                                return;
                            case 49:
                                m47570(2);
                                m47572(4194307);
                                m47572(4194304);
                                return;
                            case 50:
                                m47570(1);
                                int iM47569 = m47569();
                                if (iM47569 != 4194309) {
                                    iM47569 -= 67108864;
                                }
                                m47572(iM47569);
                                return;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                m47571(i2, m47569());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM47561 = m47561(i4);
                                    if (iM47561 == 4194308 || iM47561 == 4194307) {
                                        m47571(i4, 4194304);
                                        return;
                                    }
                                    int i5 = iM47561 & 62914560;
                                    if (i5 == 20971520 || i5 == 25165824) {
                                        m47571(i4, iM47561 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                m47570(1);
                                m47571(i2, m47569());
                                m47571(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM47562 = m47561(i6);
                                    if (iM47562 == 4194308 || iM47562 == 4194307) {
                                        m47571(i6, 4194304);
                                        return;
                                    }
                                    int i7 = iM47562 & 62914560;
                                    if (i7 == 20971520 || i7 == 25165824) {
                                        m47571(i6, iM47562 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                                    case 84:
                                    case 85:
                                    case HRSS1373Polynomial.f81792K /* 86 */:
                                        m47570(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m47570(4);
                                        return;
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 153:
                                    case EnumC19222.f57460 /* 154 */:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                                    case 191:
                                    case 194:
                                    case 195:
                                        break;
                                    case 88:
                                    case 159:
                                    case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                                        m47570(2);
                                        return;
                                    case 89:
                                        int iM475610 = m47569();
                                        m47572(iM475610);
                                        m47572(iM475610);
                                        return;
                                    case 90:
                                        int iM475611 = m47569();
                                        int iM475612 = m47569();
                                        m47572(iM475611);
                                        m47572(iM475612);
                                        m47572(iM475611);
                                        return;
                                    case 91:
                                        int iM475613 = m47569();
                                        int iM475614 = m47569();
                                        int iM475615 = m47569();
                                        m47572(iM475613);
                                        m47572(iM475615);
                                        m47572(iM475614);
                                        m47572(iM475613);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        int iM475616 = m47569();
                                        int iM475617 = m47569();
                                        m47572(iM475617);
                                        m47572(iM475616);
                                        m47572(iM475617);
                                        m47572(iM475616);
                                        return;
                                    case 93:
                                        int iM475618 = m47569();
                                        int iM475619 = m47569();
                                        int iM475620 = m47569();
                                        m47572(iM475619);
                                        m47572(iM475618);
                                        m47572(iM475620);
                                        m47572(iM475619);
                                        m47572(iM475618);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        int iM475621 = m47569();
                                        int iM475622 = m47569();
                                        int iM475623 = m47569();
                                        int iM475624 = m47569();
                                        m47572(iM475622);
                                        m47572(iM475621);
                                        m47572(iM475624);
                                        m47572(iM475623);
                                        m47572(iM475622);
                                        m47572(iM475621);
                                        return;
                                    case 95:
                                        int iM475625 = m47569();
                                        int iM475626 = m47569();
                                        m47572(iM475625);
                                        m47572(iM475626);
                                        return;
                                    case 96:
                                    case 100:
                                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                                    case 108:
                                    case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        m47570(2);
                                        m47572(4194305);
                                        return;
                                    case 97:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 127:
                                    case 129:
                                    case 131:
                                        m47570(4);
                                        m47572(4194308);
                                        m47572(4194304);
                                        return;
                                    case 98:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case 114:
                                    case 137:
                                    case 144:
                                        m47570(2);
                                        m47572(4194306);
                                        return;
                                    case C0254q.f1216f /* 99 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m47570(4);
                                        m47572(4194307);
                                        m47572(4194304);
                                        return;
                                    case 116:
                                    case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        return;
                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    case 123:
                                    case C0254q.f1218h /* 125 */:
                                        m47570(3);
                                        m47572(4194308);
                                        m47572(4194304);
                                        return;
                                    case 132:
                                        m47571(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        m47570(1);
                                        m47572(4194308);
                                        m47572(4194304);
                                        return;
                                    case 134:
                                        m47570(1);
                                        m47572(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        m47570(1);
                                        m47572(4194307);
                                        m47572(4194304);
                                        return;
                                    case 138:
                                        m47570(2);
                                        m47572(4194307);
                                        m47572(4194304);
                                        return;
                                    case 139:
                                    case 190:
                                    case 193:
                                        m47570(1);
                                        m47572(4194305);
                                        return;
                                    case 143:
                                        m47570(2);
                                        m47572(4194308);
                                        m47572(4194304);
                                        return;
                                    case 148:
                                    case 151:
                                    case 152:
                                        m47570(4);
                                        m47572(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        m47567(c8338, abstractC15043.f42972);
                                        return;
                                    case 179:
                                        m47566(abstractC15043.f42972);
                                        return;
                                    case 180:
                                        m47570(1);
                                        m47567(c8338, abstractC15043.f42972);
                                        return;
                                    case 181:
                                        m47566(abstractC15043.f42972);
                                        m47569();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        m47566(abstractC15043.f42972);
                                        if (i != 184) {
                                            int iM475627 = m47569();
                                            if (i == 183 && abstractC15043.f42971.charAt(0) == '<') {
                                                if (this.f66226 == null) {
                                                    this.f66226 = new int[2];
                                                }
                                                int length = this.f66226.length;
                                                int i8 = this.f66224;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f66226, 0, iArr, 0, length);
                                                    this.f66226 = iArr;
                                                }
                                                int[] iArr2 = this.f66226;
                                                int i9 = this.f66224;
                                                this.f66224 = i9 + 1;
                                                iArr2[i9] = iM475627;
                                            }
                                        }
                                        m47567(c8338, abstractC15043.f42972);
                                        return;
                                    case 186:
                                        m47566(abstractC15043.f42972);
                                        m47567(c8338, abstractC15043.f42972);
                                        return;
                                    case 187:
                                        m47572(c8338.m19239(i2, abstractC15043.f42972) | 12582912);
                                        return;
                                    case 188:
                                        m47569();
                                        switch (i2) {
                                            case 4:
                                                m47572(71303177);
                                                return;
                                            case 5:
                                                m47572(71303179);
                                                return;
                                            case 6:
                                                m47572(71303170);
                                                return;
                                            case 7:
                                                m47572(71303171);
                                                return;
                                            case 8:
                                                m47572(71303178);
                                                return;
                                            case 9:
                                                m47572(71303180);
                                                return;
                                            case 10:
                                                m47572(71303169);
                                                return;
                                            case 11:
                                                m47572(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = abstractC15043.f42972;
                                        m47569();
                                        if (str.charAt(0) == '[') {
                                            m47567(c8338, "[".concat(str));
                                            return;
                                        } else {
                                            m47572(c8338.m19263(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        String str2 = abstractC15043.f42972;
                                        m47569();
                                        if (str2.charAt(0) == '[') {
                                            m47567(c8338, str2);
                                            return;
                                        } else {
                                            m47572(c8338.m19263(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m47570(i2);
                                                m47567(c8338, abstractC15043.f42972);
                                                return;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m47570(1);
                                return;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m47562(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 20971520) {
            int i5 = i3 + this.f66228[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 25165824) {
            return i;
        }
        int i6 = i3 + this.f66230[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47578(C8338 c8338, C21080 c21080, int i) {
        boolean zM47568;
        int iM47563;
        int i2;
        int length = this.f66228.length;
        int length2 = this.f66230.length;
        boolean zM47569 = true;
        if (c21080.f66228 == null) {
            c21080.f66228 = new int[length];
            zM47568 = true;
        } else {
            zM47568 = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.f66229;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                iM47563 = this.f66228[i3];
            } else {
                iM47563 = m47562(i2, length2);
            }
            if (this.f66226 != null) {
                iM47563 = m47563(c8338, iM47563);
            }
            zM47568 |= m47568(c8338, iM47563, c21080.f66228, i3);
            i3++;
        }
        if (i > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                zM47568 |= m47568(c8338, this.f66228[i4], c21080.f66228, i4);
            }
            if (c21080.f66230 == null) {
                c21080.f66230 = new int[1];
            } else {
                zM47569 = zM47568;
            }
            return m47568(c8338, i, c21080.f66230, 0) | zM47569;
        }
        int length3 = this.f66230.length + this.f66232;
        if (c21080.f66230 == null) {
            c21080.f66230 = new int[this.f66225 + length3];
        } else {
            zM47569 = zM47568;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            int iM47564 = this.f66230[i5];
            if (this.f66226 != null) {
                iM47564 = m47563(c8338, iM47564);
            }
            zM47569 |= m47568(c8338, iM47564, c21080.f66230, i5);
        }
        for (int i6 = 0; i6 < this.f66225; i6++) {
            int iM47562 = m47562(this.f66227[i6], length2);
            if (this.f66226 != null) {
                iM47562 = m47563(c8338, iM47562);
            }
            zM47569 |= m47568(c8338, iM47562, c21080.f66230, length3 + i6);
        }
        return zM47569;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m47568(C8338 c8338, int i, int[] iArr, int i2) {
        int iMin;
        int iM19263;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iM19238 = 4194304;
        if (i4 != 0 || (i3 & 62914560) == 8388608) {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & 62914560) == 8388608) {
                    if (i5 != 0 && (i & 62914560) != 8388608) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    iMin = Math.min(i5, i4) | 8388608;
                    iM19263 = c8338.m19263("java/lang/Object");
                    iM19238 = iMin | iM19263;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iM19238 = (i & (-67108864)) | 8388608 | c8338.m19238(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iM19263 = c8338.m19263("java/lang/Object");
                iM19238 = iMin | iM19263;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            iM19238 = i;
        }
        if (iM19238 == i3) {
            return false;
        }
        iArr[i2] = iM19238;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47577(C23091 c23091) {
        int i;
        int[] iArr = this.f66228;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            int i5 = 0;
            do {
                int i6 = 2;
                if (i3 >= iArr.length) {
                    break loop0;
                }
                i = iArr[i3];
                if (i != 4194308 && i != 4194307) {
                    i6 = 1;
                }
                i3 += i6;
                i5++;
            } while (i == 4194304);
            i4 += i5;
        }
        int[] iArr2 = this.f66230;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c23091.m51494(this.f66231.f7644, i4, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c23091.m51499(i10, i13);
            i4 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 > 0) {
                int i15 = iArr2[i2];
                i2 += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
                c23091.m51499(i10, i15);
                i10++;
                i8 = i14;
            } else {
                c23091.m51502();
                return;
            }
        }
    }
}
