package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.۬ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K1XV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12836 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31223(InterfaceC22677 interfaceC22677, boolean z, InterfaceC2959 interfaceC2959) {
        switch (C4370.f14050[interfaceC22677.mo3975().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                interfaceC2959.mo9039(((InterfaceC1779) interfaceC22677).mo1790());
                return;
            case 22:
                int iMo1790 = ((InterfaceC1779) interfaceC22677).mo1790();
                if (z) {
                    interfaceC2959.mo9039(iMo1790);
                }
                interfaceC2959.mo9041(iMo1790);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1790);
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                int iMo1791 = ((InterfaceC1779) interfaceC22677).mo1790();
                interfaceC2959.mo9039(iMo1791);
                interfaceC2959.mo9042(iMo1791 + 1);
                return;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                interfaceC2959.mo9041(((InterfaceC1779) interfaceC22677).mo1790());
                return;
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                int iMo1792 = ((InterfaceC1779) interfaceC22677).mo1790();
                interfaceC2959.mo9041(iMo1792);
                interfaceC2959.mo9040(iMo1792 + 1);
                return;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
                InterfaceC23651 interfaceC23651 = (InterfaceC23651) interfaceC22677;
                int iMo1793 = interfaceC23651.mo1790();
                int iMo7930 = interfaceC23651.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1793);
                    interfaceC2959.mo9042(iMo1793 + 1);
                }
                interfaceC2959.mo9041(iMo7930);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1793);
                interfaceC2959.mo9042(iMo1793 + 1);
                return;
            case 62:
            case 63:
            case 64:
                InterfaceC23651 interfaceC23652 = (InterfaceC23651) interfaceC22677;
                int iMo1794 = interfaceC23652.mo1790();
                int iMo7931 = interfaceC23652.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1794);
                    interfaceC2959.mo9042(iMo1794 + 1);
                }
                interfaceC2959.mo9041(iMo1794);
                int i = iMo1794 + 1;
                interfaceC2959.mo9041(i);
                interfaceC2959.mo9041(iMo7931);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1794);
                interfaceC2959.mo9042(i);
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                InterfaceC23651 interfaceC23653 = (InterfaceC23651) interfaceC22677;
                int iMo1795 = interfaceC23653.mo1790();
                int iMo7932 = interfaceC23653.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1795);
                    interfaceC2959.mo9042(iMo1795 + 1);
                }
                interfaceC2959.mo9041(iMo7932);
                interfaceC2959.mo9040(iMo7932 + 1);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1795);
                interfaceC2959.mo9042(iMo1795 + 1);
                return;
            case 73:
            case 74:
            case 75:
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case 84:
            case 85:
                InterfaceC23651 interfaceC23654 = (InterfaceC23651) interfaceC22677;
                int iMo1796 = interfaceC23654.mo1790();
                int iMo7933 = interfaceC23654.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1796);
                    interfaceC2959.mo9042(iMo1796 + 1);
                }
                interfaceC2959.mo9041(iMo1796);
                int i2 = iMo1796 + 1;
                interfaceC2959.mo9040(i2);
                interfaceC2959.mo9041(iMo7933);
                interfaceC2959.mo9040(iMo7933 + 1);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1796);
                interfaceC2959.mo9042(i2);
                return;
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
            case 88:
            case 89:
            case 90:
            case 91:
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
            case 93:
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
            case 95:
            case 96:
            case 97:
            case 98:
            case q.f /* 99 */:
            case 100:
            case 101:
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
            case 108:
            case 109:
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
            case 114:
            case 115:
            case 116:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
            case 118:
            case 119:
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
            case 122:
            case 123:
            case 124:
            case q.h /* 125 */:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                InterfaceC23651 interfaceC23655 = (InterfaceC23651) interfaceC22677;
                int iMo1797 = interfaceC23655.mo1790();
                int iMo7934 = interfaceC23655.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1797);
                }
                interfaceC2959.mo9041(iMo7934);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1797);
                return;
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
                InterfaceC23651 interfaceC23656 = (InterfaceC23651) interfaceC22677;
                int iMo1798 = interfaceC23656.mo1790();
                int iMo7935 = interfaceC23656.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1798);
                }
                interfaceC2959.mo9041(iMo1798);
                interfaceC2959.mo9041(iMo7935);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1798);
                return;
            case 152:
            case 153:
            case EnumC17734.f54268 /* 154 */:
            case 155:
                InterfaceC23651 interfaceC23657 = (InterfaceC23651) interfaceC22677;
                int iMo1799 = interfaceC23657.mo1790();
                int iMo7936 = interfaceC23657.mo7930();
                if (z) {
                    interfaceC2959.mo9039(iMo1799);
                }
                interfaceC2959.mo9041(iMo7936);
                interfaceC2959.mo9040(iMo7936 + 1);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo1799);
                return;
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
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                InterfaceC23651 interfaceC23658 = (InterfaceC23651) interfaceC22677;
                int iMo17910 = interfaceC23658.mo1790();
                int iMo7937 = interfaceC23658.mo7930();
                interfaceC2959.mo9041(iMo17910);
                interfaceC2959.mo9041(iMo7937);
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
            case 177:
            case 178:
                InterfaceC23651 interfaceC23659 = (InterfaceC23651) interfaceC22677;
                int iMo17911 = interfaceC23659.mo1790();
                int iMo7938 = interfaceC23659.mo7930();
                interfaceC2959.mo9041(iMo17911);
                interfaceC2959.mo9040(iMo17911 + 1);
                interfaceC2959.mo9041(iMo7938);
                return;
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
                InterfaceC14478 interfaceC14478 = (InterfaceC14478) interfaceC22677;
                int iMo17912 = interfaceC14478.mo1790();
                int iMo7939 = interfaceC14478.mo7930();
                int iMo79310 = interfaceC14478.mo7931();
                if (z) {
                    interfaceC2959.mo9039(iMo17912);
                    interfaceC2959.mo9042(iMo17912 + 1);
                }
                interfaceC2959.mo9041(iMo7939);
                interfaceC2959.mo9040(iMo7939 + 1);
                interfaceC2959.mo9041(iMo79310);
                interfaceC2959.mo9040(iMo79310 + 1);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo17912);
                interfaceC2959.mo9042(iMo17912 + 1);
                return;
            case 192:
                InterfaceC14478 interfaceC14479 = (InterfaceC14478) interfaceC22677;
                int iMo17913 = interfaceC14479.mo1790();
                int iMo79311 = interfaceC14479.mo7930();
                int iMo79312 = interfaceC14479.mo7931();
                if (z) {
                    interfaceC2959.mo9039(iMo17913);
                    interfaceC2959.mo9042(iMo17913 + 1);
                }
                interfaceC2959.mo9041(iMo79311);
                interfaceC2959.mo9041(iMo79312);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo17913);
                interfaceC2959.mo9042(iMo17913 + 1);
                return;
            case 193:
            case 194:
            case 195:
                InterfaceC14478 interfaceC144710 = (InterfaceC14478) interfaceC22677;
                int iMo17914 = interfaceC144710.mo1790();
                int iMo79313 = interfaceC144710.mo7930();
                int iMo79314 = interfaceC144710.mo7931();
                if (z) {
                    interfaceC2959.mo9039(iMo17914);
                    interfaceC2959.mo9042(iMo17914 + 1);
                }
                interfaceC2959.mo9041(iMo79313);
                interfaceC2959.mo9040(iMo79313 + 1);
                interfaceC2959.mo9041(iMo79314);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo17914);
                interfaceC2959.mo9042(iMo17914 + 1);
                return;
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
            case 218:
            case 219:
                InterfaceC14478 interfaceC144711 = (InterfaceC14478) interfaceC22677;
                int iMo17915 = interfaceC144711.mo1790();
                int iMo79315 = interfaceC144711.mo7930();
                int iMo79316 = interfaceC144711.mo7931();
                if (z) {
                    interfaceC2959.mo9039(iMo17915);
                }
                interfaceC2959.mo9041(iMo79315);
                interfaceC2959.mo9041(iMo79316);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo17915);
                return;
            case 220:
            case 221:
            case 222:
                InterfaceC14478 interfaceC144712 = (InterfaceC14478) interfaceC22677;
                int iMo17916 = interfaceC144712.mo1790();
                int iMo79317 = interfaceC144712.mo7930();
                int iMo79318 = interfaceC144712.mo7931();
                if (z) {
                    interfaceC2959.mo9039(iMo17916);
                }
                interfaceC2959.mo9041(iMo79317);
                interfaceC2959.mo9040(iMo79317 + 1);
                interfaceC2959.mo9041(iMo79318);
                interfaceC2959.mo9040(iMo79318 + 1);
                if (z) {
                    return;
                }
                interfaceC2959.mo9039(iMo17916);
                return;
            case 223:
            case BERTags.FLAGS /* 224 */:
            case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
            case 226:
            case 227:
            case 228:
                InterfaceC14478 interfaceC144713 = (InterfaceC14478) interfaceC22677;
                int iMo17917 = interfaceC144713.mo1790();
                int iMo79319 = interfaceC144713.mo7930();
                int iMo79320 = interfaceC144713.mo7931();
                interfaceC2959.mo9041(iMo17917);
                interfaceC2959.mo9041(iMo79319);
                interfaceC2959.mo9041(iMo79320);
                return;
            case 229:
                InterfaceC14478 interfaceC144714 = (InterfaceC14478) interfaceC22677;
                int iMo17918 = interfaceC144714.mo1790();
                int iMo79321 = interfaceC144714.mo7930();
                int iMo79322 = interfaceC144714.mo7931();
                interfaceC2959.mo9041(iMo17918);
                interfaceC2959.mo9040(iMo17918 + 1);
                interfaceC2959.mo9041(iMo79321);
                interfaceC2959.mo9041(iMo79322);
                return;
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
                InterfaceC9978 interfaceC9978 = (InterfaceC9978) interfaceC22677;
                int iMo3615 = interfaceC9978.mo3615();
                if (iMo3615 == 1) {
                    interfaceC2959.mo9041(interfaceC9978.mo3614());
                    return;
                }
                if (iMo3615 == 2) {
                    interfaceC2959.mo9041(interfaceC9978.mo3614());
                    interfaceC2959.mo9041(interfaceC9978.mo3612());
                    return;
                }
                if (iMo3615 == 3) {
                    interfaceC2959.mo9041(interfaceC9978.mo3614());
                    interfaceC2959.mo9041(interfaceC9978.mo3612());
                    interfaceC2959.mo9041(interfaceC9978.mo3611());
                    return;
                } else {
                    if (iMo3615 == 4) {
                        interfaceC2959.mo9041(interfaceC9978.mo3614());
                        interfaceC2959.mo9041(interfaceC9978.mo3612());
                        interfaceC2959.mo9041(interfaceC9978.mo3611());
                        interfaceC2959.mo9041(interfaceC9978.mo3613());
                        return;
                    }
                    if (iMo3615 != 5) {
                        return;
                    }
                    interfaceC2959.mo9041(interfaceC9978.mo3614());
                    interfaceC2959.mo9041(interfaceC9978.mo3612());
                    interfaceC2959.mo9041(interfaceC9978.mo3611());
                    interfaceC2959.mo9041(interfaceC9978.mo3613());
                    interfaceC2959.mo9041(interfaceC9978.mo3610());
                    return;
                }
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
                InterfaceC16595 interfaceC16595 = (InterfaceC16595) interfaceC22677;
                int iMo9712 = interfaceC16595.mo9712();
                int iMo3616 = interfaceC16595.mo3615();
                for (int i3 = 0; i3 < iMo3616; i3++) {
                    interfaceC2959.mo9041(iMo9712 + i3);
                }
                return;
            default:
                if ((interfaceC22677 instanceof InterfaceC1779) || (interfaceC22677 instanceof InterfaceC6718)) {
                    throw new RuntimeException(interfaceC22677.mo3975().toString());
                }
                return;
        }
    }
}
