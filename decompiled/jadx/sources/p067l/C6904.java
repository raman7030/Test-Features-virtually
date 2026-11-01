package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ۙܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BGI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6904 {

    /* JADX INFO: renamed from: ܽ */
    public static final C22998 f17972 = new C22998();

    /* JADX INFO: renamed from: ֫ */
    public final C13000 f17973;

    /* JADX INFO: renamed from: ۧ */
    public final C12249 f17974;

    public C6904(C13000 c13000, C12249 c12249) {
        if (c12249 == null) {
            throw new NullPointerException("pool == null");
        }
        this.f17973 = c13000;
        this.f17974 = c12249;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m15821() {
        return this.f17973.m29810();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15819() {
        return this.f17973.m29810() + 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15820(int i, InterfaceC21657 interfaceC21657) {
        C13000 c13000 = this.f17973;
        if (interfaceC21657 == null) {
            interfaceC21657 = f17972;
        }
        InterfaceC21657 interfaceC21658 = interfaceC21657;
        try {
            int iM29817 = c13000.m29817(i);
            C16961.m38548(iM29817);
            C12249 c12249 = this.f17974;
            switch (iM29817) {
                case 0:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26318);
                    return 1;
                case 1:
                    interfaceC21658.mo10374(18, i, 1, C20967.f65872, 0);
                    return 1;
                case 2:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11113, -1);
                    return 1;
                case 3:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11117, 0);
                    return 1;
                case 4:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11116, 1);
                    return 1;
                case 5:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11111, 2);
                    return 1;
                case 6:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11110, 3);
                    return 1;
                case 7:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11115, 4);
                    return 1;
                case 8:
                    interfaceC21658.mo10374(18, i, 1, C4873.f11114, 5);
                    return 1;
                case 9:
                    interfaceC21658.mo10374(18, i, 1, C10237.f28361, 0);
                    return 1;
                case 10:
                    interfaceC21658.mo10374(18, i, 1, C10237.f28360, 0);
                    return 1;
                case 11:
                    interfaceC21658.mo10374(18, i, 1, C17612.f52625, 0);
                    return 1;
                case 12:
                    interfaceC21658.mo10374(18, i, 1, C17612.f52624, 0);
                    return 1;
                case 13:
                    interfaceC21658.mo10374(18, i, 1, C17612.f52623, 0);
                    return 1;
                case 14:
                    interfaceC21658.mo10374(18, i, 1, C22308.f70453, 0);
                    return 1;
                case 15:
                    interfaceC21658.mo10374(18, i, 1, C22308.f70452, 0);
                    return 1;
                case 16:
                    int iM29811 = c13000.m29811(i + 1);
                    interfaceC21658.mo10374(18, i, 2, C4873.m10335(iM29811), iM29811);
                    return 2;
                case 17:
                    int iM29818 = c13000.m29818(i + 1);
                    interfaceC21658.mo10374(18, i, 3, C4873.m10335(iM29818), iM29818);
                    return 3;
                case 18:
                    AbstractC15405 abstractC15405 = c12249.get(c13000.m29817(i + 1));
                    interfaceC21658.mo10374(18, i, 2, abstractC15405, abstractC15405 instanceof C4873 ? ((C4873) abstractC15405).mo4598() : 0);
                    return 2;
                case 19:
                    AbstractC15405 abstractC15406 = c12249.get(c13000.m29815(i + 1));
                    interfaceC21658.mo10374(18, i, 3, abstractC15406, abstractC15406 instanceof C4873 ? ((C4873) abstractC15406).mo4598() : 0);
                    return 3;
                case 20:
                    interfaceC21658.mo10374(20, i, 3, c12249.get(c13000.m29815(i + 1)), 0);
                    return 3;
                case 21:
                    interfaceC21658.mo10373(21, i, 2, c13000.m29817(i + 1), C9566.f26325, 0);
                    return 2;
                case 22:
                    interfaceC21658.mo10373(21, i, 2, c13000.m29817(i + 1), C9566.f26330, 0);
                    return 2;
                case 23:
                    interfaceC21658.mo10373(21, i, 2, c13000.m29817(i + 1), C9566.f26332, 0);
                    return 2;
                case 24:
                    interfaceC21658.mo10373(21, i, 2, c13000.m29817(i + 1), C9566.f26323, 0);
                    return 2;
                case 25:
                    interfaceC21658.mo10373(21, i, 2, c13000.m29817(i + 1), C9566.f26324, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC21658.mo10373(21, i, 1, iM29817 - 26, C9566.f26325, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC21658.mo10373(21, i, 1, iM29817 - 30, C9566.f26330, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC21658.mo10373(21, i, 1, iM29817 - 34, C9566.f26332, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC21658.mo10373(21, i, 1, iM29817 - 38, C9566.f26323, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    interfaceC21658.mo10373(21, i, 1, iM29817 - 42, C9566.f26324, 0);
                    return 1;
                case 46:
                    interfaceC21658.mo10375(46, i, C9566.f26325);
                    return 1;
                case 47:
                    interfaceC21658.mo10375(46, i, C9566.f26330);
                    return 1;
                case 48:
                    interfaceC21658.mo10375(46, i, C9566.f26332);
                    return 1;
                case 49:
                    interfaceC21658.mo10375(46, i, C9566.f26323);
                    return 1;
                case 50:
                    interfaceC21658.mo10375(46, i, C9566.f26324);
                    return 1;
                case 51:
                    interfaceC21658.mo10375(46, i, C9566.f26335);
                    return 1;
                case 52:
                    interfaceC21658.mo10375(46, i, C9566.f26301);
                    return 1;
                case 53:
                    interfaceC21658.mo10375(46, i, C9566.f26305);
                    return 1;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    interfaceC21658.mo10373(54, i, 2, c13000.m29817(i + 1), C9566.f26325, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    interfaceC21658.mo10373(54, i, 2, c13000.m29817(i + 1), C9566.f26330, 0);
                    return 2;
                case 56:
                    interfaceC21658.mo10373(54, i, 2, c13000.m29817(i + 1), C9566.f26332, 0);
                    return 2;
                case 57:
                    interfaceC21658.mo10373(54, i, 2, c13000.m29817(i + 1), C9566.f26323, 0);
                    return 2;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    interfaceC21658.mo10373(54, i, 2, c13000.m29817(i + 1), C9566.f26324, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                case 61:
                case 62:
                    interfaceC21658.mo10373(54, i, 1, iM29817 - 59, C9566.f26325, 0);
                    return 1;
                case 63:
                case 64:
                case 65:
                case 66:
                    interfaceC21658.mo10373(54, i, 1, iM29817 - 63, C9566.f26330, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    interfaceC21658.mo10373(54, i, 1, iM29817 - 67, C9566.f26332, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    interfaceC21658.mo10373(54, i, 1, iM29817 - 71, C9566.f26323, 0);
                    return 1;
                case 75:
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 77:
                case 78:
                    interfaceC21658.mo10373(54, i, 1, iM29817 - 75, C9566.f26324, 0);
                    return 1;
                case 79:
                    interfaceC21658.mo10375(79, i, C9566.f26325);
                    return 1;
                case 80:
                    interfaceC21658.mo10375(79, i, C9566.f26330);
                    return 1;
                case 81:
                    interfaceC21658.mo10375(79, i, C9566.f26332);
                    return 1;
                case 82:
                    interfaceC21658.mo10375(79, i, C9566.f26323);
                    return 1;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    interfaceC21658.mo10375(79, i, C9566.f26324);
                    return 1;
                case 84:
                    interfaceC21658.mo10375(79, i, C9566.f26335);
                    return 1;
                case 85:
                    interfaceC21658.mo10375(79, i, C9566.f26301);
                    return 1;
                case HRSS1373Polynomial.f81792K /* 86 */:
                    interfaceC21658.mo10375(79, i, C9566.f26305);
                    return 1;
                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case 93:
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                case 95:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26318);
                    return 1;
                case 96:
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 116:
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26325);
                    return 1;
                case 97:
                case 101:
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                case 109:
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                case 123:
                case C0254q.f1218h /* 125 */:
                case 127:
                case 129:
                case 131:
                    interfaceC21658.mo10375(iM29817 - 1, i, C9566.f26330);
                    return 1;
                case 98:
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case 114:
                case 118:
                    interfaceC21658.mo10375(iM29817 - 2, i, C9566.f26332);
                    return 1;
                case C0254q.f1216f /* 99 */:
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                case 115:
                case 119:
                    interfaceC21658.mo10375(iM29817 - 3, i, C9566.f26323);
                    return 1;
                case 132:
                    interfaceC21658.mo10373(iM29817, i, 3, c13000.m29817(i + 1), C9566.f26325, c13000.m29811(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26330);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26332);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26323);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26325);
                    return 1;
                case 153:
                case EnumC19222.f57460 /* 154 */:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    interfaceC21658.mo10372(iM29817, i, 3, c13000.m29818(i + 1) + i);
                    return 3;
                case 169:
                    interfaceC21658.mo10373(iM29817, i, 2, c13000.m29817(i + 1), C9566.f26334, 0);
                    return 2;
                case 170:
                    return m15818(i, interfaceC21658);
                case 171:
                    return m15815(i, interfaceC21658);
                case 172:
                    interfaceC21658.mo10375(172, i, C9566.f26325);
                    return 1;
                case 173:
                    interfaceC21658.mo10375(172, i, C9566.f26330);
                    return 1;
                case 174:
                    interfaceC21658.mo10375(172, i, C9566.f26332);
                    return 1;
                case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                    interfaceC21658.mo10375(172, i, C9566.f26323);
                    return 1;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    interfaceC21658.mo10375(172, i, C9566.f26324);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    interfaceC21658.mo10375(iM29817, i, C9566.f26318);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    interfaceC21658.mo10374(iM29817, i, 3, c12249.get(c13000.m29815(i + 1)), 0);
                    return 3;
                case 185:
                    interfaceC21658.mo10374(iM29817, i, 5, c12249.get(c13000.m29815(i + 1)), (c13000.m29817(i + 4) << 8) | c13000.m29817(i + 3));
                    return 5;
                case 186:
                    interfaceC21658.mo10374(iM29817, i, 5, (C20296) c12249.get(c13000.m29815(i + 1)), 0);
                    return 5;
                case 188:
                    return m15816(i, interfaceC21658);
                case 196:
                    return m15817(i, interfaceC21658);
                case 197:
                    interfaceC21658.mo10374(iM29817, i, 4, c12249.get(c13000.m29815(i + 1)), c13000.m29817(i + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC21658.mo10372(iM29817 == 200 ? 167 : 168, i, 5, c13000.m29814(i + 1) + i);
                    return 5;
                default:
                    interfaceC21658.mo10371(iM29817, i);
                    return 1;
            }
        } catch (C4933 e) {
            e.m23570("...at bytecode offset ".concat(C16351.m37155(i)));
            throw e;
        } catch (RuntimeException e2) {
            C4933 c4933 = new C4933(null, e2);
            c4933.m23570("...at bytecode offset ".concat(C16351.m37155(i)));
            throw c4933;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m15818(int i, InterfaceC21657 interfaceC21657) {
        C13000 c13000;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int iM29817 = 0;
        while (true) {
            c13000 = this.f17973;
            if (i3 >= i2) {
                break;
            }
            iM29817 = (iM29817 << 8) | c13000.m29817(i3);
            i3++;
        }
        int iM29814 = c13000.m29814(i2) + i;
        int iM29815 = c13000.m29814(i2 + 4);
        int iM29816 = c13000.m29814(i2 + 8);
        int i4 = (iM29816 - iM29815) + 1;
        int i5 = i2 + 12;
        if (iM29815 > iM29816) {
            throw new C4933("low / high inversion", null);
        }
        C21027 c21027 = new C21027(i4);
        for (int i6 = 0; i6 < i4; i6++) {
            int iM29818 = c13000.m29814(i5) + i;
            i5 += 4;
            c21027.add(iM29815 + i6, iM29818);
        }
        c21027.m47443(iM29814);
        c21027.m47444();
        c21027.mo22326();
        int i7 = i5 - i;
        interfaceC21657.mo10377(i, i7, c21027, iM29817);
        return i7;
    }

    /* JADX INFO: renamed from: ۧ */
    private int m15815(int i, InterfaceC21657 interfaceC21657) {
        C13000 c13000;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int iM29817 = 0;
        while (true) {
            c13000 = this.f17973;
            if (i3 >= i2) {
                break;
            }
            iM29817 = (iM29817 << 8) | c13000.m29817(i3);
            i3++;
        }
        int iM29814 = c13000.m29814(i2) + i;
        int iM29815 = c13000.m29814(i2 + 4);
        int i4 = i2 + 8;
        C21027 c21027 = new C21027(iM29815);
        for (int i5 = 0; i5 < iM29815; i5++) {
            int iM29816 = c13000.m29814(i4);
            int iM29818 = c13000.m29814(i4 + 4) + i;
            i4 += 8;
            c21027.add(iM29816, iM29818);
        }
        c21027.m47443(iM29814);
        c21027.m47444();
        c21027.mo22326();
        int i6 = i4 - i;
        interfaceC21657.mo10377(i, i6, c21027, iM29817);
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX INFO: renamed from: ܽ */
    private int m15816(int i, InterfaceC21657 interfaceC21657) {
        C14260 c14260;
        int i2;
        C13000 c13000 = this.f17973;
        int iM29817 = c13000.m29817(i + 1);
        switch (iM29817) {
            case 4:
                c14260 = C14260.f40608;
                break;
            case 5:
                c14260 = C14260.f40613;
                break;
            case 6:
                c14260 = C14260.f40618;
                break;
            case 7:
                c14260 = C14260.f40615;
                break;
            case 8:
                c14260 = C14260.f40617;
                break;
            case 9:
                c14260 = C14260.f40626;
                break;
            case 10:
                c14260 = C14260.f40606;
                break;
            case 11:
                c14260 = C14260.f40620;
                break;
            default:
                throw new C4933("bad newarray code ".concat(C16351.m37152(iM29817)), null);
        }
        int iMo10370 = interfaceC21657.mo10370();
        C23668 c23668 = new C23668();
        int i3 = 0;
        if (iMo10370 >= 0) {
            m15820(iMo10370, c23668);
            if ((c23668.f75357 instanceof C4873) && c23668.f75358 + iMo10370 == i) {
                i2 = c23668.f75359;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        int i4 = i + 2;
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            while (true) {
                int i5 = i4 + 1;
                if (c13000.m29817(i4) == 89) {
                    m15820(i5, c23668);
                    int i6 = c23668.f75358;
                    if (i6 != 0 && (c23668.f75357 instanceof C4873) && c23668.f75359 == i3) {
                        int i7 = i5 + i6;
                        m15820(i7, c23668);
                        int i8 = c23668.f75358;
                        if (i8 != 0) {
                            AbstractC15405 abstractC15405 = c23668.f75357;
                            if (abstractC15405 instanceof AbstractC3531) {
                                int i9 = i7 + i8;
                                arrayList.add(abstractC15405);
                                int i10 = i9 + 1;
                                int iM29818 = c13000.m29817(i9);
                                switch (iM29817) {
                                    case 4:
                                    case 8:
                                        if (iM29818 == 84) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 5:
                                        if (iM29818 == 85) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 6:
                                        if (iM29818 == 81) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 7:
                                        if (iM29818 == 82) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 9:
                                        if (iM29818 == 86) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 10:
                                        if (iM29818 == 79) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                    case 11:
                                        if (iM29818 == 80) {
                                            i3++;
                                            i4 = i10;
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 < 2 || i3 != i2) {
            interfaceC21657.mo10376(i, 2, c14260, (ArrayList) null);
            return 2;
        }
        int i11 = i4 - i;
        interfaceC21657.mo10376(i, i11, c14260, arrayList);
        return i11;
    }

    /* JADX INFO: renamed from: ܿ */
    private int m15817(int i, InterfaceC21657 interfaceC21657) {
        C13000 c13000 = this.f17973;
        int iM29817 = c13000.m29817(i + 1);
        int iM29815 = c13000.m29815(i + 2);
        if (iM29817 == 132) {
            interfaceC21657.mo10373(iM29817, i, 6, iM29815, C9566.f26325, c13000.m29818(i + 4));
            return 6;
        }
        if (iM29817 != 169) {
            switch (iM29817) {
                case 21:
                    interfaceC21657.mo10373(21, i, 4, iM29815, C9566.f26325, 0);
                    return 4;
                case 22:
                    interfaceC21657.mo10373(21, i, 4, iM29815, C9566.f26330, 0);
                    return 4;
                case 23:
                    interfaceC21657.mo10373(21, i, 4, iM29815, C9566.f26332, 0);
                    return 4;
                case 24:
                    interfaceC21657.mo10373(21, i, 4, iM29815, C9566.f26323, 0);
                    return 4;
                case 25:
                    interfaceC21657.mo10373(21, i, 4, iM29815, C9566.f26324, 0);
                    return 4;
                default:
                    switch (iM29817) {
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            interfaceC21657.mo10373(54, i, 4, iM29815, C9566.f26325, 0);
                            return 4;
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            interfaceC21657.mo10373(54, i, 4, iM29815, C9566.f26330, 0);
                            return 4;
                        case 56:
                            interfaceC21657.mo10373(54, i, 4, iM29815, C9566.f26332, 0);
                            return 4;
                        case 57:
                            interfaceC21657.mo10373(54, i, 4, iM29815, C9566.f26323, 0);
                            return 4;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            interfaceC21657.mo10373(54, i, 4, iM29815, C9566.f26324, 0);
                            return 4;
                        default:
                            interfaceC21657.mo10371(196, i);
                            return 1;
                    }
            }
        }
        interfaceC21657.mo10373(iM29817, i, 4, iM29815, C9566.f26334, 0);
        return 4;
    }
}
