package l;

import com.alipay.sdk.m.y.q;
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
public class C19688 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63603;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public short f63604;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f63605;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f63606;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f63607;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f63608;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f63609;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1342 f63610;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public short f63611;

    public C19688(C1342 c1342) {
        this.f63610 = c1342;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45279(C19688 c19688) {
        this.f63607 = c19688.f63607;
        this.f63609 = c19688.f63609;
        this.f63611 = (short) 0;
        this.f63608 = c19688.f63608;
        this.f63606 = c19688.f63606;
        this.f63604 = c19688.f63604;
        this.f63603 = c19688.f63603;
        this.f63605 = c19688.f63605;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45267(C6281 c6281, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        if (obj instanceof String) {
            return m45268(c6281, C11926.m29095((String) obj).m29099(), 0);
        }
        C1342 c1342 = (C1342) obj;
        if ((c1342.f4880 & 4) != 0) {
            return c6281.m17300(c1342.f4874, "") | 12582912;
        }
        return c6281.m17302(c1342) | 16777216;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45268(C6281 c6281, String str, int i) {
        int iM17324;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return c6281.m17324(C15472.m36561(1, i + 1, str)) | 8388608;
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
                            iM17324 = 4194306;
                        } else if (cCharAt2 == 'L') {
                            iM17324 = c6281.m17324(C15472.m36561(1, i2 + 1, str)) | 8388608;
                        } else if (cCharAt2 == 'S') {
                            iM17324 = 4194316;
                        } else if (cCharAt2 == 'Z') {
                            iM17324 = 4194313;
                        } else if (cCharAt2 == 'I') {
                            iM17324 = 4194305;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM17324 = 4194314;
                                    break;
                                case 'C':
                                    iM17324 = 4194315;
                                    break;
                                case 'D':
                                    iM17324 = 4194307;
                                    break;
                                default:
                                    throw new IllegalArgumentException(C20094.m46315("Invalid descriptor fragment: ", str.substring(i2)));
                            }
                        } else {
                            iM17324 = 4194308;
                        }
                        return iM17324 | ((i2 - i) << 26);
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException(C20094.m46315("Invalid descriptor: ", str.substring(i)));
                    }
                }
            }
        }
        return 4194305;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45277(C6281 c6281, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f63607 = iArr;
        this.f63609 = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = c6281.m17324(c6281.m17316()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (C11926 c11926 : C11926.m29092(str)) {
            int iM45268 = m45268(c6281, c11926.m29099(), 0);
            int[] iArr2 = this.f63607;
            int i4 = i3 + 1;
            iArr2[i3] = iM45268;
            if (iM45268 == 4194308 || iM45268 == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f63607[i3] = 4194304;
            i3++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45278(C6281 c6281, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f63607[i3] = m45267(c6281, objArr[i4]);
            if (objArr[i4] == 4 || objArr[i4] == 3) {
                i3 += 2;
                this.f63607[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.f63607;
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
        this.f63609 = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.f63609[i8] = m45267(c6281, objArr2[i9]);
            if (objArr2[i9] == 4 || objArr2[i9] == 3) {
                i8 += 2;
                this.f63609[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.f63604 = (short) 0;
        this.f63603 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45276() {
        return this.f63609.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m45264(int i) {
        int[] iArr = this.f63608;
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45274(int i, int i2) {
        if (this.f63608 == null) {
            this.f63608 = new int[10];
        }
        int length = this.f63608.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f63608, 0, iArr, 0, length);
            this.f63608 = iArr;
        }
        this.f63608[i] = i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45275(int i) {
        if (this.f63606 == null) {
            this.f63606 = new int[10];
        }
        int length = this.f63606.length;
        short s = this.f63604;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.f63606, 0, iArr, 0, length);
            this.f63606 = iArr;
        }
        int[] iArr2 = this.f63606;
        short s2 = this.f63604;
        short s3 = (short) (s2 + 1);
        this.f63604 = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f63611 + s3);
        C1342 c1342 = this.f63610;
        if (s4 > c1342.f4882) {
            c1342.f4882 = s4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45270(C6281 c6281, String str) {
        int iM45268 = m45268(c6281, str, str.charAt(0) == '(' ? C11926.m29097(str) : 0);
        if (iM45268 != 0) {
            m45275(iM45268);
            if (iM45268 == 4194308 || iM45268 == 4194307) {
                m45275(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m45272() {
        short s = this.f63604;
        if (s > 0) {
            int[] iArr = this.f63606;
            short s2 = (short) (s - 1);
            this.f63604 = s2;
            return iArr[s2];
        }
        short s3 = (short) (this.f63611 - 1);
        this.f63611 = s3;
        return (-s3) | 25165824;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45273(int i) {
        short s = this.f63604;
        if (s >= i) {
            this.f63604 = (short) (s - i);
        } else {
            this.f63611 = (short) (this.f63611 - (i - s));
            this.f63604 = (short) 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45269(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m45273((C11926.m29094(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m45273(2);
        } else {
            m45273(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[LOOP:0: B:9:0x0011->B:25:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x003a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m45266(C6281 c6281, int i) {
        int i2;
        int iM17324;
        int i3;
        if (i == 4194310 || (i3 = (-4194304) & i) == 12582912 || i3 == 16777216) {
            for (int i4 = 0; i4 < this.f63603; i4++) {
                int i5 = this.f63605[i4];
                int i6 = (-67108864) & i5;
                int i7 = 62914560 & i5;
                int i8 = i5 & 1048575;
                if (i7 == 20971520) {
                    i2 = this.f63607[i8];
                } else {
                    if (i7 == 25165824) {
                        int[] iArr = this.f63609;
                        i2 = iArr[iArr.length - i8];
                    }
                    if (i == i5) {
                        if (i == 4194310) {
                            iM17324 = c6281.m17324(c6281.m17316());
                        } else {
                            iM17324 = c6281.m17324(c6281.m17321(i & 1048575).f39906);
                        }
                        return iM17324 | 8388608;
                    }
                }
                i5 = i2 + i6;
                if (i == i5) {
                    if (i == 4194310) {
                        iM17324 = c6281.m17324(c6281.m17316());
                    } else {
                        iM17324 = c6281.m17324(c6281.m17321(i & 1048575).f39906);
                    }
                    return iM17324 | 8388608;
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
    public void mo38091(int i, int i2, AbstractC13336 abstractC13336, C6281 c6281) {
        switch (i) {
            case 0:
                return;
            case 1:
                m45275(4194309);
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
                m45275(4194305);
                return;
            case 9:
            case 10:
                m45275(4194308);
                m45275(4194304);
                return;
            case 11:
            case 12:
            case 13:
                m45275(4194306);
                return;
            case 14:
            case 15:
                m45275(4194307);
                m45275(4194304);
                return;
            case 18:
                int i3 = abstractC13336.f39902;
                switch (i3) {
                    case 3:
                        m45275(4194305);
                        return;
                    case 4:
                        m45275(4194306);
                        return;
                    case 5:
                        m45275(4194308);
                        m45275(4194304);
                        return;
                    case 6:
                        m45275(4194307);
                        m45275(4194304);
                        return;
                    case 7:
                        m45275(8388608 | c6281.m17324("java/lang/Class"));
                        return;
                    case 8:
                        m45275(8388608 | c6281.m17324("java/lang/String"));
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                m45275(8388608 | c6281.m17324("java/lang/invoke/MethodHandle"));
                                return;
                            case 16:
                                m45275(8388608 | c6281.m17324("java/lang/invoke/MethodType"));
                                return;
                            case 17:
                                m45270(c6281, abstractC13336.f39906);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        m45275(4194305);
                        return;
                    case 22:
                        m45275(4194308);
                        m45275(4194304);
                        return;
                    case 23:
                        m45275(4194306);
                        return;
                    case 24:
                        m45275(4194307);
                        m45275(4194304);
                        return;
                    case 25:
                        m45275(m45264(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                m45273(2);
                                m45275(4194305);
                                return;
                            case 47:
                                m45273(2);
                                m45275(4194308);
                                m45275(4194304);
                                return;
                            case 48:
                                m45273(2);
                                m45275(4194306);
                                return;
                            case 49:
                                m45273(2);
                                m45275(4194307);
                                m45275(4194304);
                                return;
                            case 50:
                                m45273(1);
                                int iM45272 = m45272();
                                if (iM45272 != 4194309) {
                                    iM45272 -= 67108864;
                                }
                                m45275(iM45272);
                                return;
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                m45274(i2, m45272());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM45264 = m45264(i4);
                                    if (iM45264 == 4194308 || iM45264 == 4194307) {
                                        m45274(i4, 4194304);
                                        return;
                                    }
                                    int i5 = iM45264 & 62914560;
                                    if (i5 == 20971520 || i5 == 25165824) {
                                        m45274(i4, iM45264 | 1048576);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                m45273(1);
                                m45274(i2, m45272());
                                m45274(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM45265 = m45264(i6);
                                    if (iM45265 == 4194308 || iM45265 == 4194307) {
                                        m45274(i6, 4194304);
                                        return;
                                    }
                                    int i7 = iM45265 & 62914560;
                                    if (i7 == 20971520 || i7 == 25165824) {
                                        m45274(i6, iM45265 | 1048576);
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
                                    case HRSS1373Polynomial.K /* 86 */:
                                        m45273(3);
                                        return;
                                    case 80:
                                    case 82:
                                        m45273(4);
                                        return;
                                    case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                                    case 153:
                                    case EnumC17734.f54268 /* 154 */:
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
                                        m45273(2);
                                        return;
                                    case 89:
                                        int iM45273 = m45272();
                                        m45275(iM45273);
                                        m45275(iM45273);
                                        return;
                                    case 90:
                                        int iM45274 = m45272();
                                        int iM45275 = m45272();
                                        m45275(iM45274);
                                        m45275(iM45275);
                                        m45275(iM45274);
                                        return;
                                    case 91:
                                        int iM45276 = m45272();
                                        int iM45277 = m45272();
                                        int iM45278 = m45272();
                                        m45275(iM45276);
                                        m45275(iM45278);
                                        m45275(iM45277);
                                        m45275(iM45276);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        int iM45279 = m45272();
                                        int iM452710 = m45272();
                                        m45275(iM452710);
                                        m45275(iM45279);
                                        m45275(iM452710);
                                        m45275(iM45279);
                                        return;
                                    case 93:
                                        int iM452711 = m45272();
                                        int iM452712 = m45272();
                                        int iM452713 = m45272();
                                        m45275(iM452712);
                                        m45275(iM452711);
                                        m45275(iM452713);
                                        m45275(iM452712);
                                        m45275(iM452711);
                                        return;
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        int iM452714 = m45272();
                                        int iM452715 = m45272();
                                        int iM452716 = m45272();
                                        int iM452717 = m45272();
                                        m45275(iM452715);
                                        m45275(iM452714);
                                        m45275(iM452717);
                                        m45275(iM452716);
                                        m45275(iM452715);
                                        m45275(iM452714);
                                        return;
                                    case 95:
                                        int iM452718 = m45272();
                                        int iM452719 = m45272();
                                        m45275(iM452718);
                                        m45275(iM452719);
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
                                        m45273(2);
                                        m45275(4194305);
                                        return;
                                    case 97:
                                    case 101:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    case 109:
                                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                                    case 127:
                                    case 129:
                                    case 131:
                                        m45273(4);
                                        m45275(4194308);
                                        m45275(4194304);
                                        return;
                                    case 98:
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                                    case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                                    case 114:
                                    case 137:
                                    case 144:
                                        m45273(2);
                                        m45275(4194306);
                                        return;
                                    case q.f /* 99 */:
                                    case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                                    case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                                    case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                                    case 115:
                                        m45273(4);
                                        m45275(4194307);
                                        m45275(4194304);
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
                                    case q.h /* 125 */:
                                        m45273(3);
                                        m45275(4194308);
                                        m45275(4194304);
                                        return;
                                    case 132:
                                        m45274(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        m45273(1);
                                        m45275(4194308);
                                        m45275(4194304);
                                        return;
                                    case 134:
                                        m45273(1);
                                        m45275(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        m45273(1);
                                        m45275(4194307);
                                        m45275(4194304);
                                        return;
                                    case 138:
                                        m45273(2);
                                        m45275(4194307);
                                        m45275(4194304);
                                        return;
                                    case 139:
                                    case 190:
                                    case 193:
                                        m45273(1);
                                        m45275(4194305);
                                        return;
                                    case 143:
                                        m45273(2);
                                        m45275(4194308);
                                        m45275(4194304);
                                        return;
                                    case 148:
                                    case 151:
                                    case 152:
                                        m45273(4);
                                        m45275(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        m45270(c6281, abstractC13336.f39906);
                                        return;
                                    case 179:
                                        m45269(abstractC13336.f39906);
                                        return;
                                    case 180:
                                        m45273(1);
                                        m45270(c6281, abstractC13336.f39906);
                                        return;
                                    case 181:
                                        m45269(abstractC13336.f39906);
                                        m45272();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        m45269(abstractC13336.f39906);
                                        if (i != 184) {
                                            int iM452720 = m45272();
                                            if (i == 183 && abstractC13336.f39905.charAt(0) == '<') {
                                                if (this.f63605 == null) {
                                                    this.f63605 = new int[2];
                                                }
                                                int length = this.f63605.length;
                                                int i8 = this.f63603;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f63605, 0, iArr, 0, length);
                                                    this.f63605 = iArr;
                                                }
                                                int[] iArr2 = this.f63605;
                                                int i9 = this.f63603;
                                                this.f63603 = i9 + 1;
                                                iArr2[i9] = iM452720;
                                            }
                                        }
                                        m45270(c6281, abstractC13336.f39906);
                                        return;
                                    case 186:
                                        m45269(abstractC13336.f39906);
                                        m45270(c6281, abstractC13336.f39906);
                                        return;
                                    case 187:
                                        m45275(c6281.m17300(i2, abstractC13336.f39906) | 12582912);
                                        return;
                                    case 188:
                                        m45272();
                                        switch (i2) {
                                            case 4:
                                                m45275(71303177);
                                                return;
                                            case 5:
                                                m45275(71303179);
                                                return;
                                            case 6:
                                                m45275(71303170);
                                                return;
                                            case 7:
                                                m45275(71303171);
                                                return;
                                            case 8:
                                                m45275(71303178);
                                                return;
                                            case 9:
                                                m45275(71303180);
                                                return;
                                            case 10:
                                                m45275(71303169);
                                                return;
                                            case 11:
                                                m45275(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = abstractC13336.f39906;
                                        m45272();
                                        if (str.charAt(0) == '[') {
                                            m45270(c6281, "[".concat(str));
                                            return;
                                        } else {
                                            m45275(c6281.m17324(str) | 75497472);
                                            return;
                                        }
                                    case 192:
                                        String str2 = abstractC13336.f39906;
                                        m45272();
                                        if (str2.charAt(0) == '[') {
                                            m45270(c6281, str2);
                                            return;
                                        } else {
                                            m45275(c6281.m17324(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case 197:
                                                m45273(i2);
                                                m45270(c6281, abstractC13336.f39906);
                                                return;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                m45273(1);
                                return;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m45265(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 20971520) {
            int i5 = i3 + this.f63607[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 25165824) {
            return i;
        }
        int i6 = i3 + this.f63609[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45281(C6281 c6281, C19688 c19688, int i) {
        boolean zM45271;
        int iM45266;
        int i2;
        int length = this.f63607.length;
        int length2 = this.f63609.length;
        boolean zM45272 = true;
        if (c19688.f63607 == null) {
            c19688.f63607 = new int[length];
            zM45271 = true;
        } else {
            zM45271 = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.f63608;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                iM45266 = this.f63607[i3];
            } else {
                iM45266 = m45265(i2, length2);
            }
            if (this.f63605 != null) {
                iM45266 = m45266(c6281, iM45266);
            }
            zM45271 |= m45271(c6281, iM45266, c19688.f63607, i3);
            i3++;
        }
        if (i > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                zM45271 |= m45271(c6281, this.f63607[i4], c19688.f63607, i4);
            }
            if (c19688.f63609 == null) {
                c19688.f63609 = new int[1];
            } else {
                zM45272 = zM45271;
            }
            return m45271(c6281, i, c19688.f63609, 0) | zM45272;
        }
        int length3 = this.f63609.length + this.f63611;
        if (c19688.f63609 == null) {
            c19688.f63609 = new int[this.f63604 + length3];
        } else {
            zM45272 = zM45271;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            int iM45267 = this.f63609[i5];
            if (this.f63605 != null) {
                iM45267 = m45266(c6281, iM45267);
            }
            zM45272 |= m45271(c6281, iM45267, c19688.f63609, i5);
        }
        for (int i6 = 0; i6 < this.f63604; i6++) {
            int iM45265 = m45265(this.f63606[i6], length2);
            if (this.f63605 != null) {
                iM45265 = m45266(c6281, iM45265);
            }
            zM45272 |= m45271(c6281, iM45265, c19688.f63609, length3 + i6);
        }
        return zM45272;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45271(C6281 c6281, int i, int[] iArr, int i2) {
        int iMin;
        int iM17324;
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
        int iM17299 = 4194304;
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
                    iM17324 = c6281.m17324("java/lang/Object");
                    iM17299 = iMin | iM17324;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iM17299 = (i & (-67108864)) | 8388608 | c6281.m17299(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | 8388608;
                iM17324 = c6281.m17324("java/lang/Object");
                iM17299 = iMin | iM17324;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            iM17299 = i;
        }
        if (iM17299 == i3) {
            return false;
        }
        iArr[i2] = iM17299;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45280(C21804 c21804) {
        int i;
        int[] iArr = this.f63607;
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
        int[] iArr2 = this.f63609;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c21804.m49143(this.f63610.f4874, i4, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i4 - 1;
            if (i4 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c21804.m49148(i10, i13);
            i4 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 > 0) {
                int i15 = iArr2[i2];
                i2 += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
                c21804.m49148(i10, i15);
                i10++;
                i8 = i14;
            } else {
                c21804.m49151();
                return;
            }
        }
    }
}
