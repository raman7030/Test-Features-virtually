package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.֨᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4KG */
/* JADX INFO: loaded from: classes2.dex */
public class C3682 {

    /* JADX INFO: renamed from: ֫ */
    public Object f7789;

    /* JADX INFO: renamed from: ۧ */
    public Object[] f7790;

    /* JADX INFO: renamed from: ֫ */
    public final void m7105(int i, Object obj) {
        Object[] objArr = this.f7790;
        if (i > objArr.length || i < 0) {
            return;
        }
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7106(AbstractC21788 abstractC21788, AbstractC9088 abstractC9088) {
        ArrayList arrayList;
        int i;
        EnumC5044 enumC5044 = abstractC21788.f68605;
        if (enumC5044 == null) {
            return;
        }
        switch (C7706.f20226[enumC5044.ordinal()]) {
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
                m7105(((C23129) abstractC21788).f72711, abstractC9088.mo21031(abstractC21788));
                this.f7789 = null;
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                m7105(((C7035) abstractC21788).f18332, abstractC9088.mo21031(abstractC21788));
                this.f7789 = null;
                return;
            case 21:
                m7105(((C19125) abstractC21788).f57065, abstractC9088.mo21031(abstractC21788));
                this.f7789 = null;
                return;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                C18454 c18454 = (C18454) abstractC21788;
                m7105(c18454.f55166, abstractC9088.mo21032(abstractC21788, m7104(c18454.f55167)));
                this.f7789 = null;
                return;
            case 31:
            case 32:
            case 33:
            case 34:
                m7105(((C4373) abstractC21788).f9828, abstractC9088.mo21032(abstractC21788, this.f7789));
                this.f7789 = null;
                return;
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
            case 52:
            case 53:
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
            case 56:
                C18454 c18455 = (C18454) abstractC21788;
                m7105(c18455.f55166, abstractC9088.mo21037(abstractC21788, m7104(c18455.f55167)));
                this.f7789 = null;
                return;
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
                abstractC9088.mo21037(abstractC21788, m7104(((C14411) abstractC21788).f41211));
                this.f7789 = null;
                return;
            case 63:
                abstractC9088.mo21037(abstractC21788, m7104(((C15751) abstractC21788).f50508));
                this.f7789 = null;
                return;
            case 64:
                abstractC9088.mo21037(abstractC21788, m7104(((C24469) abstractC21788).f50508));
                this.f7789 = null;
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                abstractC9088.mo21037(abstractC21788, m7104(((C7035) abstractC21788).f18332));
                this.f7789 = null;
                return;
            case 72:
            case 73:
            case 74:
            case 75:
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case 77:
            case 78:
                C7035 c7035 = (C7035) abstractC21788;
                m7105(c7035.f18332, abstractC9088.mo21037(abstractC21788, m7104(c7035.f18334)));
                this.f7789 = null;
                return;
            case 79:
            case 80:
                C19125 c19125 = (C19125) abstractC21788;
                m7105(c19125.f57065, abstractC9088.mo21037(abstractC21788, m7104(c19125.f57067)));
                this.f7789 = null;
                return;
            case 81:
                int i2 = ((C19125) abstractC21788).f57065;
                m7105(i2, abstractC9088.mo21037(abstractC21788, m7104(i2)));
                this.f7789 = null;
                return;
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case 84:
                abstractC9088.mo21037(abstractC21788, m7104(((C4373) abstractC21788).f9828));
                this.f7789 = null;
                return;
            case 85:
            case HRSS1373Polynomial.f81792K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                abstractC9088.mo21036(abstractC21788, m7104(((C4373) abstractC21788).f9828));
                this.f7789 = null;
                return;
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
                C19796 c19796 = (C19796) abstractC21788;
                m7105(c19796.f60206, abstractC9088.mo21033(abstractC21788, m7104(c19796.f60208), m7104(c19796.f60207)));
                this.f7789 = null;
                return;
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                C14411 c14411 = (C14411) abstractC21788;
                abstractC9088.mo21033(abstractC21788, m7104(c14411.f41211), m7104(c14411.f41213));
                this.f7789 = null;
                return;
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                C7035 c7036 = (C7035) abstractC21788;
                abstractC9088.mo21033(abstractC21788, m7104(c7036.f18334), m7104(c7036.f18332));
                this.f7789 = null;
                return;
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
                C19796 c19797 = (C19796) abstractC21788;
                abstractC9088.mo21034(abstractC21788, m7104(c19797.f60208), m7104(c19797.f60207), m7104(c19797.f60206));
                this.f7789 = null;
                return;
            case 152:
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
                AbstractC10388 abstractC10388 = (AbstractC10388) abstractC21788;
                int[] iArr = abstractC10388.f28750;
                C12891 c12891Mo19510 = abstractC10388.mo19510();
                if (enumC5044 == EnumC5044.f11662 || enumC5044 == EnumC5044.f11610 || enumC5044 == EnumC5044.f11622 || enumC5044 == EnumC5044.f11716) {
                    arrayList = new ArrayList(c12891Mo19510.m29530().length);
                    i = 0;
                } else {
                    i = 1;
                    arrayList = new ArrayList(c12891Mo19510.m29530().length + 1);
                    arrayList.add(m7104(iArr[0]));
                }
                for (String str : c12891Mo19510.m29530()) {
                    arrayList.add(m7104(iArr[i]));
                    char cCharAt = str.charAt(0);
                    i = (cCharAt == 'J' || cCharAt == 'D') ? i + 2 : i + 1;
                }
                this.f7789 = abstractC9088.mo21035(abstractC21788, arrayList);
                return;
            case 166:
            case 167:
                int[] iArr2 = ((C15081) abstractC21788).f43068;
                ArrayList arrayList2 = new ArrayList(iArr2.length);
                for (int i3 : iArr2) {
                    arrayList2.add(m7104(i3));
                }
                this.f7789 = abstractC9088.mo21035(abstractC21788, arrayList2);
                return;
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
            case 177:
            case 178:
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
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
                C18454 c18456 = (C18454) abstractC21788;
                int i4 = c18456.f55166;
                m7105(i4, abstractC9088.mo21033(abstractC21788, m7104(i4), m7104(c18456.f55167)));
                this.f7789 = null;
                return;
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
                C13091 c13091 = (C13091) abstractC21788;
                m7105(c13091.f36808, abstractC9088.mo21037(abstractC21788, m7104(c13091.f36807)));
                this.f7789 = null;
                return;
            case 219:
                abstractC9088.mo21037(abstractC21788, m7104(((C5694) abstractC21788).f13902));
                this.f7789 = null;
                return;
            case 220:
            case 221:
            case 222:
            case 223:
            case BERTags.FLAGS /* 224 */:
                this.f7789 = null;
                return;
            default:
                throw new RuntimeException("not support " + enumC5044);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m7104(int i) {
        Object[] objArr = this.f7790;
        if (i > objArr.length || i < 0) {
            return null;
        }
        return objArr[i];
    }
}
