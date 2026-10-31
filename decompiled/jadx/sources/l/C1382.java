package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public class C1382 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f5017;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object[] f5018;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4867(int i, Object obj) {
        Object[] objArr = this.f5018;
        if (i > objArr.length || i < 0) {
            return;
        }
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4868(AbstractC20433 abstractC20433, AbstractC7070 abstractC7070) {
        ArrayList arrayList;
        int i;
        EnumC2815 enumC2815 = abstractC20433.f65930;
        if (enumC2815 == null) {
            return;
        }
        switch (C5616.f17382[enumC2815.ordinal()]) {
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
                m4867(((C21844) abstractC20433).f70002, abstractC7070.mo19073(abstractC20433));
                this.f5017 = null;
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                m4867(((C4910) abstractC20433).f15499, abstractC7070.mo19073(abstractC20433));
                this.f5017 = null;
                return;
            case 21:
                m4867(((C17631) abstractC20433).f53872, abstractC7070.mo19073(abstractC20433));
                this.f5017 = null;
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
                C16925 c16925 = (C16925) abstractC20433;
                m4867(c16925.f51985, abstractC7070.mo19074(abstractC20433, m4866(c16925.f51986)));
                this.f5017 = null;
                return;
            case 31:
            case 32:
            case 33:
            case 34:
                m4867(((C2109) abstractC20433).f7043, abstractC7070.mo19074(abstractC20433, this.f5017));
                this.f5017 = null;
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
                C16925 c16926 = (C16925) abstractC20433;
                m4867(c16926.f51985, abstractC7070.mo19079(abstractC20433, m4866(c16926.f51986)));
                this.f5017 = null;
                return;
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
                abstractC7070.mo19079(abstractC20433, m4866(((C12671) abstractC20433).f38184));
                this.f5017 = null;
                return;
            case 63:
                abstractC7070.mo19079(abstractC20433, m4866(((C14081) abstractC20433).f47377));
                this.f5017 = null;
                return;
            case 64:
                abstractC7070.mo19079(abstractC20433, m4866(((C23254) abstractC20433).f47377));
                this.f5017 = null;
                return;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                abstractC7070.mo19079(abstractC20433, m4866(((C4910) abstractC20433).f15499));
                this.f5017 = null;
                return;
            case 72:
            case 73:
            case 74:
            case 75:
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
            case 77:
            case 78:
                C4910 c4910 = (C4910) abstractC20433;
                m4867(c4910.f15499, abstractC7070.mo19079(abstractC20433, m4866(c4910.f15501)));
                this.f5017 = null;
                return;
            case 79:
            case 80:
                C17631 c17631 = (C17631) abstractC20433;
                m4867(c17631.f53872, abstractC7070.mo19079(abstractC20433, m4866(c17631.f53874)));
                this.f5017 = null;
                return;
            case 81:
                int i2 = ((C17631) abstractC20433).f53872;
                m4867(i2, abstractC7070.mo19079(abstractC20433, m4866(i2)));
                this.f5017 = null;
                return;
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
            case 84:
                abstractC7070.mo19079(abstractC20433, m4866(((C2109) abstractC20433).f7043));
                this.f5017 = null;
                return;
            case 85:
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                abstractC7070.mo19078(abstractC20433, m4866(((C2109) abstractC20433).f7043));
                this.f5017 = null;
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
                C18337 c18337 = (C18337) abstractC20433;
                m4867(c18337.f56988, abstractC7070.mo19075(abstractC20433, m4866(c18337.f56990), m4866(c18337.f56989)));
                this.f5017 = null;
                return;
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                C12671 c12671 = (C12671) abstractC20433;
                abstractC7070.mo19075(abstractC20433, m4866(c12671.f38184), m4866(c12671.f38186));
                this.f5017 = null;
                return;
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
                C4910 c4911 = (C4910) abstractC20433;
                abstractC7070.mo19075(abstractC20433, m4866(c4911.f15501), m4866(c4911.f15499));
                this.f5017 = null;
                return;
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
                C18337 c18338 = (C18337) abstractC20433;
                abstractC7070.mo19076(abstractC20433, m4866(c18338.f56990), m4866(c18338.f56989), m4866(c18338.f56988));
                this.f5017 = null;
                return;
            case 152:
            case 153:
            case EnumC17734.f54268 /* 154 */:
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
                AbstractC8438 abstractC8438 = (AbstractC8438) abstractC20433;
                int[] iArr = abstractC8438.f25837;
                C11072 c11072Mo17570 = abstractC8438.mo17570();
                if (enumC2815 == EnumC2815.f8868 || enumC2815 == EnumC2815.f8816 || enumC2815 == EnumC2815.f8828 || enumC2815 == EnumC2815.f8922) {
                    arrayList = new ArrayList(c11072Mo17570.m27468().length);
                    i = 0;
                } else {
                    i = 1;
                    arrayList = new ArrayList(c11072Mo17570.m27468().length + 1);
                    arrayList.add(m4866(iArr[0]));
                }
                for (String str : c11072Mo17570.m27468()) {
                    arrayList.add(m4866(iArr[i]));
                    char cCharAt = str.charAt(0);
                    i = (cCharAt == 'J' || cCharAt == 'D') ? i + 2 : i + 1;
                }
                this.f5017 = abstractC7070.mo19077(abstractC20433, arrayList);
                return;
            case 166:
            case 167:
                int[] iArr2 = ((C13376) abstractC20433).f40001;
                ArrayList arrayList2 = new ArrayList(iArr2.length);
                for (int i3 : iArr2) {
                    arrayList2.add(m4866(i3));
                }
                this.f5017 = abstractC7070.mo19077(abstractC20433, arrayList2);
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
                C16925 c16927 = (C16925) abstractC20433;
                int i4 = c16927.f51985;
                m4867(i4, abstractC7070.mo19075(abstractC20433, m4866(i4), m4866(c16927.f51986)));
                this.f5017 = null;
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
                C11282 c11282 = (C11282) abstractC20433;
                m4867(c11282.f33809, abstractC7070.mo19079(abstractC20433, m4866(c11282.f33808)));
                this.f5017 = null;
                return;
            case 219:
                abstractC7070.mo19079(abstractC20433, m4866(((C3499) abstractC20433).f11097));
                this.f5017 = null;
                return;
            case 220:
            case 221:
            case 222:
            case 223:
            case BERTags.FLAGS /* 224 */:
                this.f5017 = null;
                return;
            default:
                throw new RuntimeException("not support " + enumC2815);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4866(int i) {
        Object[] objArr = this.f5018;
        if (i > objArr.length || i < 0) {
            return null;
        }
        return objArr[i];
    }
}
