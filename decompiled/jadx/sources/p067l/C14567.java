package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C14567 {
    /* JADX INFO: renamed from: ֫ */
    public static void m33309(InterfaceC23920 interfaceC23920, boolean z, InterfaceC5180 interfaceC5180) {
        switch (C6521.f16865[interfaceC23920.mo6217().ordinal()]) {
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
                interfaceC5180.mo11091(((InterfaceC4059) interfaceC23920).mo4189());
                return;
            case 22:
                int iMo4189 = ((InterfaceC4059) interfaceC23920).mo4189();
                if (z) {
                    interfaceC5180.mo11091(iMo4189);
                }
                interfaceC5180.mo11093(iMo4189);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo4189);
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                int iMo41810 = ((InterfaceC4059) interfaceC23920).mo4189();
                interfaceC5180.mo11091(iMo41810);
                interfaceC5180.mo11094(iMo41810 + 1);
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
                interfaceC5180.mo11093(((InterfaceC4059) interfaceC23920).mo4189());
                return;
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                int iMo41811 = ((InterfaceC4059) interfaceC23920).mo4189();
                interfaceC5180.mo11093(iMo41811);
                interfaceC5180.mo11092(iMo41811 + 1);
                return;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
                InterfaceC24846 interfaceC24846 = (InterfaceC24846) interfaceC23920;
                int iMo41812 = interfaceC24846.mo4189();
                int iMo9978 = interfaceC24846.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41812);
                    interfaceC5180.mo11094(iMo41812 + 1);
                }
                interfaceC5180.mo11093(iMo9978);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41812);
                interfaceC5180.mo11094(iMo41812 + 1);
                return;
            case 62:
            case 63:
            case 64:
                InterfaceC24846 interfaceC24847 = (InterfaceC24846) interfaceC23920;
                int iMo41813 = interfaceC24847.mo4189();
                int iMo9979 = interfaceC24847.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41813);
                    interfaceC5180.mo11094(iMo41813 + 1);
                }
                interfaceC5180.mo11093(iMo41813);
                int i = iMo41813 + 1;
                interfaceC5180.mo11093(i);
                interfaceC5180.mo11093(iMo9979);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41813);
                interfaceC5180.mo11094(i);
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                InterfaceC24846 interfaceC24848 = (InterfaceC24846) interfaceC23920;
                int iMo41814 = interfaceC24848.mo4189();
                int iMo99710 = interfaceC24848.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41814);
                    interfaceC5180.mo11094(iMo41814 + 1);
                }
                interfaceC5180.mo11093(iMo99710);
                interfaceC5180.mo11092(iMo99710 + 1);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41814);
                interfaceC5180.mo11094(iMo41814 + 1);
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
                InterfaceC24846 interfaceC24849 = (InterfaceC24846) interfaceC23920;
                int iMo41815 = interfaceC24849.mo4189();
                int iMo99711 = interfaceC24849.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41815);
                    interfaceC5180.mo11094(iMo41815 + 1);
                }
                interfaceC5180.mo11093(iMo41815);
                int i2 = iMo41815 + 1;
                interfaceC5180.mo11092(i2);
                interfaceC5180.mo11093(iMo99711);
                interfaceC5180.mo11092(iMo99711 + 1);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41815);
                interfaceC5180.mo11094(i2);
                return;
            case HRSS1373Polynomial.f81792K /* 86 */:
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
            case C0254q.f1216f /* 99 */:
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
            case C0254q.f1218h /* 125 */:
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
                InterfaceC24846 interfaceC248410 = (InterfaceC24846) interfaceC23920;
                int iMo41816 = interfaceC248410.mo4189();
                int iMo99712 = interfaceC248410.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41816);
                }
                interfaceC5180.mo11093(iMo99712);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41816);
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
                InterfaceC24846 interfaceC248411 = (InterfaceC24846) interfaceC23920;
                int iMo41817 = interfaceC248411.mo4189();
                int iMo99713 = interfaceC248411.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41817);
                }
                interfaceC5180.mo11093(iMo41817);
                interfaceC5180.mo11093(iMo99713);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41817);
                return;
            case 152:
            case 153:
            case EnumC19222.f57460 /* 154 */:
            case 155:
                InterfaceC24846 interfaceC248412 = (InterfaceC24846) interfaceC23920;
                int iMo41818 = interfaceC248412.mo4189();
                int iMo99714 = interfaceC248412.mo9978();
                if (z) {
                    interfaceC5180.mo11091(iMo41818);
                }
                interfaceC5180.mo11093(iMo99714);
                interfaceC5180.mo11092(iMo99714 + 1);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41818);
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
                InterfaceC24846 interfaceC248413 = (InterfaceC24846) interfaceC23920;
                int iMo41819 = interfaceC248413.mo4189();
                int iMo99715 = interfaceC248413.mo9978();
                interfaceC5180.mo11093(iMo41819);
                interfaceC5180.mo11093(iMo99715);
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
            case 177:
            case 178:
                InterfaceC24846 interfaceC248414 = (InterfaceC24846) interfaceC23920;
                int iMo41820 = interfaceC248414.mo4189();
                int iMo99716 = interfaceC248414.mo9978();
                interfaceC5180.mo11093(iMo41820);
                interfaceC5180.mo11092(iMo41820 + 1);
                interfaceC5180.mo11093(iMo99716);
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
                InterfaceC16128 interfaceC16128 = (InterfaceC16128) interfaceC23920;
                int iMo41821 = interfaceC16128.mo4189();
                int iMo99717 = interfaceC16128.mo9978();
                int iMo99718 = interfaceC16128.mo9979();
                if (z) {
                    interfaceC5180.mo11091(iMo41821);
                    interfaceC5180.mo11094(iMo41821 + 1);
                }
                interfaceC5180.mo11093(iMo99717);
                interfaceC5180.mo11092(iMo99717 + 1);
                interfaceC5180.mo11093(iMo99718);
                interfaceC5180.mo11092(iMo99718 + 1);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41821);
                interfaceC5180.mo11094(iMo41821 + 1);
                return;
            case 192:
                InterfaceC16128 interfaceC16129 = (InterfaceC16128) interfaceC23920;
                int iMo41822 = interfaceC16129.mo4189();
                int iMo99719 = interfaceC16129.mo9978();
                int iMo99720 = interfaceC16129.mo9979();
                if (z) {
                    interfaceC5180.mo11091(iMo41822);
                    interfaceC5180.mo11094(iMo41822 + 1);
                }
                interfaceC5180.mo11093(iMo99719);
                interfaceC5180.mo11093(iMo99720);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41822);
                interfaceC5180.mo11094(iMo41822 + 1);
                return;
            case 193:
            case 194:
            case 195:
                InterfaceC16128 interfaceC161210 = (InterfaceC16128) interfaceC23920;
                int iMo41823 = interfaceC161210.mo4189();
                int iMo99721 = interfaceC161210.mo9978();
                int iMo99722 = interfaceC161210.mo9979();
                if (z) {
                    interfaceC5180.mo11091(iMo41823);
                    interfaceC5180.mo11094(iMo41823 + 1);
                }
                interfaceC5180.mo11093(iMo99721);
                interfaceC5180.mo11092(iMo99721 + 1);
                interfaceC5180.mo11093(iMo99722);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41823);
                interfaceC5180.mo11094(iMo41823 + 1);
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
                InterfaceC16128 interfaceC161211 = (InterfaceC16128) interfaceC23920;
                int iMo41824 = interfaceC161211.mo4189();
                int iMo99723 = interfaceC161211.mo9978();
                int iMo99724 = interfaceC161211.mo9979();
                if (z) {
                    interfaceC5180.mo11091(iMo41824);
                }
                interfaceC5180.mo11093(iMo99723);
                interfaceC5180.mo11093(iMo99724);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41824);
                return;
            case 220:
            case 221:
            case 222:
                InterfaceC16128 interfaceC161212 = (InterfaceC16128) interfaceC23920;
                int iMo41825 = interfaceC161212.mo4189();
                int iMo99725 = interfaceC161212.mo9978();
                int iMo99726 = interfaceC161212.mo9979();
                if (z) {
                    interfaceC5180.mo11091(iMo41825);
                }
                interfaceC5180.mo11093(iMo99725);
                interfaceC5180.mo11092(iMo99725 + 1);
                interfaceC5180.mo11093(iMo99726);
                interfaceC5180.mo11092(iMo99726 + 1);
                if (z) {
                    return;
                }
                interfaceC5180.mo11091(iMo41825);
                return;
            case 223:
            case BERTags.FLAGS /* 224 */:
            case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
            case 226:
            case 227:
            case 228:
                InterfaceC16128 interfaceC161213 = (InterfaceC16128) interfaceC23920;
                int iMo41826 = interfaceC161213.mo4189();
                int iMo99727 = interfaceC161213.mo9978();
                int iMo99728 = interfaceC161213.mo9979();
                interfaceC5180.mo11093(iMo41826);
                interfaceC5180.mo11093(iMo99727);
                interfaceC5180.mo11093(iMo99728);
                return;
            case 229:
                InterfaceC16128 interfaceC161214 = (InterfaceC16128) interfaceC23920;
                int iMo41827 = interfaceC161214.mo4189();
                int iMo99729 = interfaceC161214.mo9978();
                int iMo99730 = interfaceC161214.mo9979();
                interfaceC5180.mo11093(iMo41827);
                interfaceC5180.mo11092(iMo41827 + 1);
                interfaceC5180.mo11093(iMo99729);
                interfaceC5180.mo11093(iMo99730);
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
                InterfaceC11851 interfaceC11851 = (InterfaceC11851) interfaceC23920;
                int iMo5886 = interfaceC11851.mo5886();
                if (iMo5886 == 1) {
                    interfaceC5180.mo11093(interfaceC11851.mo5885());
                    return;
                }
                if (iMo5886 == 2) {
                    interfaceC5180.mo11093(interfaceC11851.mo5885());
                    interfaceC5180.mo11093(interfaceC11851.mo5883());
                    return;
                }
                if (iMo5886 == 3) {
                    interfaceC5180.mo11093(interfaceC11851.mo5885());
                    interfaceC5180.mo11093(interfaceC11851.mo5883());
                    interfaceC5180.mo11093(interfaceC11851.mo5882());
                    return;
                } else {
                    if (iMo5886 == 4) {
                        interfaceC5180.mo11093(interfaceC11851.mo5885());
                        interfaceC5180.mo11093(interfaceC11851.mo5883());
                        interfaceC5180.mo11093(interfaceC11851.mo5882());
                        interfaceC5180.mo11093(interfaceC11851.mo5884());
                        return;
                    }
                    if (iMo5886 != 5) {
                        return;
                    }
                    interfaceC5180.mo11093(interfaceC11851.mo5885());
                    interfaceC5180.mo11093(interfaceC11851.mo5883());
                    interfaceC5180.mo11093(interfaceC11851.mo5882());
                    interfaceC5180.mo11093(interfaceC11851.mo5884());
                    interfaceC5180.mo11093(interfaceC11851.mo5881());
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
                InterfaceC18140 interfaceC18140 = (InterfaceC18140) interfaceC23920;
                int iMo11756 = interfaceC18140.mo11756();
                int iMo5887 = interfaceC18140.mo5886();
                for (int i3 = 0; i3 < iMo5887; i3++) {
                    interfaceC5180.mo11093(iMo11756 + i3);
                }
                return;
            default:
                if ((interfaceC23920 instanceof InterfaceC4059) || (interfaceC23920 instanceof InterfaceC8753)) {
                    throw new RuntimeException(interfaceC23920.mo6217().toString());
                }
                return;
        }
    }
}
