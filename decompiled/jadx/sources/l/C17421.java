package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* JADX INFO: renamed from: l.ܿܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5TO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17421 extends AbstractC7070 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20950 f53281;

    public C17421(C20950 c20950) {
        this.f53281 = c20950;
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ֫ */
    public final Object mo19074(AbstractC20433 abstractC20433, Object obj) {
        C6838 c6838 = (C6838) obj;
        if (c6838 == null) {
            m40767(abstractC20433);
            return m40766(C23275.m51589(0));
        }
        return m40766(this.f53281.m47767(c6838));
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ֫ */
    public final Object mo19075(AbstractC20433 abstractC20433, Object obj, Object obj2) {
        C6838 c6838 = (C6838) obj;
        C6838 c6839 = (C6838) obj2;
        if (c6838 == null || c6839 == null) {
            m40767(abstractC20433);
            return m40766(C23275.m51589(0));
        }
        C20950 c20950 = this.f53281;
        C18274 c18274M47767 = c20950.m47767(c6838);
        C18274 c18274M47768 = c20950.m47767(c6839);
        switch (C14598.f44686[abstractC20433.f65930.ordinal()]) {
            case 98:
                return m40766(new C12692(c18274M47767, c18274M47768, EnumC3520.IF.f11199));
            case q.f /* 99 */:
                return m40766(new C12692(c18274M47767, c18274M47768, "Z"));
            case 100:
                return m40766(new C12692(c18274M47767, c18274M47768, "B"));
            case 101:
                return m40766(new C12692(c18274M47767, c18274M47768, "C"));
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                return m40766(new C12692(c18274M47767, c18274M47768, "L"));
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                return m40766(new C12692(c18274M47767, c18274M47768, "S"));
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return m40766(new C12692(c18274M47767, c18274M47768, EnumC3520.JD.f11199));
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                return m40766(new C10576(EnumC1340.LCMP, c18274M47767, c18274M47768, "J"));
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return m40766(new C10576(EnumC1340.DCMPG, c18274M47767, c18274M47768, "D"));
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return m40766(new C10576(EnumC1340.FCMPG, c18274M47767, c18274M47768, "F"));
            case 108:
                return m40766(new C10576(EnumC1340.DCMPL, c18274M47767, c18274M47768, "D"));
            case 109:
                return m40766(new C10576(EnumC1340.FCMPL, c18274M47767, c18274M47768, "F"));
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "D"));
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "F"));
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "I"));
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "J"));
            case 114:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "D"));
            case 115:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "F"));
            case 116:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "I"));
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "J"));
            case 118:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "D"));
            case 119:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "F"));
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "I"));
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "J"));
            case 122:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "D"));
            case 123:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "F"));
            case 124:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "I"));
            case q.h /* 125 */:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "J"));
            case 126:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "D"));
            case 127:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "F"));
            case 128:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "I"));
            case 129:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "J"));
            case 130:
                return m40766(new C10576(EnumC1340.AND, c18274M47767, c18274M47768, EnumC3520.ZI.f11199));
            case 131:
                return m40766(new C10576(EnumC1340.AND, c18274M47767, c18274M47768, "J"));
            case 132:
                return m40766(new C10576(EnumC1340.OR, c18274M47767, c18274M47768, EnumC3520.ZI.f11199));
            case 133:
                return m40766(new C10576(EnumC1340.OR, c18274M47767, c18274M47768, "J"));
            case 134:
                return m40766(new C10576(EnumC1340.XOR, c18274M47767, c18274M47768, EnumC3520.ZI.f11199));
            case 135:
                return m40766(new C10576(EnumC1340.XOR, c18274M47767, c18274M47768, "J"));
            case 136:
                return m40766(new C10576(EnumC1340.SHL, c18274M47767, c18274M47768, "I"));
            case 137:
                return m40766(new C10576(EnumC1340.SHL, c18274M47767, c18274M47768, "J"));
            case 138:
                return m40766(new C10576(EnumC1340.SHR, c18274M47767, c18274M47768, "I"));
            case 139:
                return m40766(new C10576(EnumC1340.SHR, c18274M47767, c18274M47768, "J"));
            case 140:
                return m40766(new C10576(EnumC1340.USHR, c18274M47767, c18274M47768, "I"));
            case 141:
                return m40766(new C10576(EnumC1340.USHR, c18274M47767, c18274M47768, "J"));
            case 142:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.EQ, c18274M47767, c18274M47768, EnumC3520.ZIL.f11199), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 143:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.GE, c18274M47767, c18274M47768, "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 144:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.GT, c18274M47767, c18274M47768, "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 145:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.LE, c18274M47767, c18274M47768, "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 146:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.LT, c18274M47767, c18274M47768, "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 147:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.NE, c18274M47767, c18274M47768, EnumC3520.ZIL.f11199), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case EnumC17734.f54268 /* 154 */:
                C13687 c13687 = ((C4910) abstractC20433).f15500;
                c20950.m47768(C17819.m41744(new C14102(c18274M47767, c13687.m32933(), c13687.m32932(), c13687.m32934()), c18274M47768));
                return null;
            case 155:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "D"));
            case 156:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "F"));
            case 157:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "I"));
            case 158:
                return m40766(C23275.m51587(c18274M47767, c18274M47768, "J"));
            case 159:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "D"));
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "F"));
            case 161:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "I"));
            case 162:
                return m40766(C23275.m51592(c18274M47768, c18274M47767, "J"));
            case 163:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "D"));
            case 164:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "F"));
            case 165:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "I"));
            case 166:
                return m40766(C23275.m51591(c18274M47767, c18274M47768, "J"));
            case 167:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "D"));
            case 168:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "F"));
            case 169:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "I"));
            case 170:
                return m40766(C23275.m51590(c18274M47767, c18274M47768, "J"));
            case 171:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "D"));
            case 172:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "F"));
            case 173:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "I"));
            case 174:
                return m40766(C23275.m51593(c18274M47767, c18274M47768, "J"));
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                return m40766(new C10576(EnumC1340.AND, c18274M47767, c18274M47768, EnumC3520.ZI.f11199));
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return m40766(new C10576(EnumC1340.AND, c18274M47767, c18274M47768, "J"));
            case 177:
                return m40766(new C10576(EnumC1340.OR, c18274M47767, c18274M47768, EnumC3520.ZI.f11199));
            case 178:
                return m40766(new C10576(EnumC1340.OR, c18274M47767, c18274M47768, "J"));
            case 179:
                return m40766(new C10576(EnumC1340.XOR, c18274M47767, c18274M47768, EnumC3520.ZI.f11199));
            case 180:
                return m40766(new C10576(EnumC1340.XOR, c18274M47767, c18274M47768, "J"));
            case 181:
                return m40766(new C10576(EnumC1340.SHL, c18274M47767, c18274M47768, "I"));
            case 182:
                return m40766(new C10576(EnumC1340.SHL, c18274M47767, c18274M47768, "J"));
            case 183:
                return m40766(new C10576(EnumC1340.SHR, c18274M47767, c18274M47768, "I"));
            case 184:
                return m40766(new C10576(EnumC1340.SHR, c18274M47767, c18274M47768, "J"));
            case 185:
                return m40766(new C10576(EnumC1340.USHR, c18274M47767, c18274M47768, "I"));
            case 186:
                return m40766(new C10576(EnumC1340.USHR, c18274M47767, c18274M47768, "J"));
            default:
                throw new RuntimeException();
        }
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ֫ */
    public final Object mo19076(AbstractC20433 abstractC20433, Object obj, Object obj2, Object obj3) {
        C6838 c6838 = (C6838) obj;
        C6838 c6839 = (C6838) obj2;
        C6838 c68310 = (C6838) obj3;
        if (c6838 == null || c6839 == null || c68310 == null) {
            m40767(abstractC20433);
            return m40766(C23275.m51589(0));
        }
        C20950 c20950 = this.f53281;
        C18274 c18274M47767 = c20950.m47767(c6838);
        C18274 c18274M47768 = c20950.m47767(c6839);
        C18274 c18274M47769 = c20950.m47767(c68310);
        switch (C14598.f44686[abstractC20433.f65930.ordinal()]) {
            case 187:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, EnumC3520.IF.f11199), c18274M47769));
                return null;
            case 188:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, "Z"), c18274M47769));
                return null;
            case 189:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, "B"), c18274M47769));
                return null;
            case 190:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, "C"), c18274M47769));
                return null;
            case 191:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, "L"), c18274M47769));
                return null;
            case 192:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, "S"), c18274M47769));
                return null;
            case 193:
                c20950.m47768(C17819.m41744(new C12692(c18274M47767, c18274M47768, EnumC3520.JD.f11199), c18274M47769));
                return null;
            default:
                return null;
        }
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ۧ */
    public final void mo19078(AbstractC20433 abstractC20433, Object obj) {
        C6838 c6838 = (C6838) obj;
        if (c6838 == null) {
            m40767(abstractC20433);
            return;
        }
        C20950 c20950 = this.f53281;
        c20950.m47768(new C23463(EnumC7690.RETURN, c20950.m47767(c6838)));
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ܽ */
    public final Object mo19079(AbstractC20433 abstractC20433, Object obj) {
        EnumC2815 enumC2815 = abstractC20433.f65930;
        C6838 c6838 = (C6838) obj;
        if (c6838 == null) {
            m40767(abstractC20433);
            return m40766(C23275.m51589(0));
        }
        C20950 c20950 = this.f53281;
        C18274 c18274M47767 = c20950.m47767(c6838);
        String str = "I";
        switch (C14598.f44686[enumC2815.ordinal()]) {
            case 28:
                return m40766(new C4163(EnumC1340.NOT, c18274M47767, "I"));
            case 29:
                return m40766(new C4163(EnumC1340.NOT, c18274M47767, "J"));
            case 30:
                return m40766(new C4163(EnumC1340.NEG, c18274M47767, "D"));
            case 31:
                return m40766(new C4163(EnumC1340.NEG, c18274M47767, "F"));
            case 32:
                return m40766(new C4163(EnumC1340.NEG, c18274M47767, "I"));
            case 33:
                return m40766(new C4163(EnumC1340.NEG, c18274M47767, "J"));
            case 34:
                return m40766(new C6342(c18274M47767, "I", "B"));
            case 35:
                return m40766(new C6342(c18274M47767, "I", "C"));
            case 36:
                return m40766(new C6342(c18274M47767, "I", "D"));
            case 37:
                return m40766(new C6342(c18274M47767, "I", "F"));
            case 38:
                return m40766(new C6342(c18274M47767, "I", "J"));
            case 39:
                return m40766(new C6342(c18274M47767, "I", "S"));
            case 40:
                return m40766(new C6342(c18274M47767, "F", "D"));
            case 41:
                return m40766(new C6342(c18274M47767, "F", "I"));
            case 42:
                return m40766(new C6342(c18274M47767, "F", "J"));
            case 43:
                return m40766(new C6342(c18274M47767, "D", "F"));
            case 44:
                return m40766(new C6342(c18274M47767, "D", "I"));
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return m40766(new C6342(c18274M47767, "D", "J"));
            case 46:
                return m40766(new C6342(c18274M47767, "J", "D"));
            case 47:
                return m40766(new C6342(c18274M47767, "J", "F"));
            case 48:
                return m40766(new C6342(c18274M47767, "J", "I"));
            case 49:
                return m40766(new C4163(EnumC1340.LENGTH, c18274M47767, null));
            case 50:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.EQ, c18274M47767, C23275.m51589(0), EnumC3520.ZIL.f11199), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 51:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.GE, c18274M47767, C23275.m51589(0), "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 52:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.GT, c18274M47767, C23275.m51589(0), "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 53:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.LE, c18274M47767, C23275.m51589(0), "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.LT, c18274M47767, C23275.m51589(0), "I"), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                c20950.m47768(C17819.m41743(new C10576(EnumC1340.NE, c18274M47767, C23275.m51589(0), EnumC3520.ZIL.f11199), c20950.m47766(((C12671) abstractC20433).f38185)));
                return null;
            case 56:
            case 57:
                C11572[] c11572Arr = ((AbstractC15492) abstractC20433).f47378;
                C13334[] c13334Arr = new C13334[c11572Arr.length];
                for (int i = 0; i < c11572Arr.length; i++) {
                    c13334Arr[i] = c20950.m47766(c11572Arr[i]);
                }
                C13334 c13334 = new C13334();
                if (enumC2815 == EnumC2815.f9004) {
                    c20950.m47768(new C17113(c18274M47767, ((C23254) abstractC20433).f74693, c13334Arr, c13334));
                } else {
                    c20950.m47768(new C12629(c18274M47767, ((C14081) abstractC20433).f42534, c13334Arr, c13334));
                }
                c20950.m47768(c13334);
                return null;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                C13687 c13687 = ((C4910) abstractC20433).f15500;
                c20950.m47768(C17819.m41744(new C9808(c13687.m32933(), c13687.m32932(), c13687.m32934()), c18274M47767));
                return null;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                C13687 c13688 = ((C4910) abstractC20433).f15500;
                return m40766(new C14102(c18274M47767, c13688.m32933(), c13688.m32932(), c13688.m32934()));
            case 72:
                return m40766(new C16156(EnumC1340.INSTANCE_OF, c18274M47767, ((C17631) abstractC20433).f53873));
            case 73:
                return m40766(new C16156(EnumC1340.NEW_ARRAY, c18274M47767, ((C17631) abstractC20433).f53873.substring(1)));
            case 74:
                return m40766(new C16156(EnumC1340.CHECK_CAST, c18274M47767, ((C17631) abstractC20433).f53873));
            case 75:
                c20950.m47768(new C23463(EnumC7690.LOCK, c18274M47767));
                return null;
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                c20950.m47768(new C23463(EnumC7690.UNLOCK, c18274M47767));
                return null;
            case 77:
                c20950.m47768(C17819.m41745(c18274M47767));
                return null;
            case 78:
            case 79:
                return m40766(C23275.m51587(c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 80:
            case 81:
                return m40766(C23275.m51592(c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                return m40766(C23275.m51591(c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 84:
            case 85:
                return m40766(C23275.m51590(c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case HRSS1373Polynomial.K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                return m40766(C23275.m51593(c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 88:
            case 89:
                int i2 = ((C11282) abstractC20433).f33807;
                C11987 c11987M51589 = C23275.m51589(i2);
                if (i2 >= 0 && i2 <= 1) {
                    str = EnumC3520.ZI.f11199;
                }
                return m40766(new C10576(EnumC1340.AND, c18274M47767, c11987M51589, str));
            case 90:
            case 91:
                int i3 = ((C11282) abstractC20433).f33807;
                C11987 c11987M515810 = C23275.m51589(i3);
                if (i3 >= 0 && i3 <= 1) {
                    str = EnumC3520.ZI.f11199;
                }
                return m40766(new C10576(EnumC1340.OR, c18274M47767, c11987M515810, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
            case 93:
                int i4 = ((C11282) abstractC20433).f33807;
                C11987 c11987M515811 = C23275.m51589(i4);
                if (i4 >= 0 && i4 <= 1) {
                    str = EnumC3520.ZI.f11199;
                }
                return m40766(new C10576(EnumC1340.XOR, c18274M47767, c11987M515811, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                return m40766(new C10576(EnumC1340.SHL, c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 95:
                return m40766(new C10576(EnumC1340.SHR, c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 96:
                return m40766(new C10576(EnumC1340.USHR, c18274M47767, C23275.m51589(((C11282) abstractC20433).f33807), "I"));
            case 97:
                c20950.m47768(new C21802(EnumC7690.FILL_ARRAY_DATA, c18274M47767, new C11987(((C3499) abstractC20433).f11096)));
                return null;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6838 m40766(AbstractC8396 abstractC8396) {
        C20950 c20950 = this.f53281;
        C18274 c18274M47763 = c20950.m47763();
        c20950.m47768(C17819.m41744(c18274M47763, abstractC8396));
        return new C6838(c18274M47763);
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ֫ */
    public final Object mo19073(AbstractC20433 abstractC20433) {
        switch (C14598.f44686[abstractC20433.f65930.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
                Integer num = (Integer) ((C21844) abstractC20433).f70003;
                num.getClass();
                return m40766(new C11987(num));
            case 11:
            case 12:
            case 13:
            case 14:
                Long l2 = (Long) ((C21844) abstractC20433).f70003;
                l2.getClass();
                return m40766(new C11987(l2));
            case 15:
                return m40766(new C11987((C22860) ((C21844) abstractC20433).f70003));
            case 16:
            case 17:
                return m40766(new C11987((String) ((C21844) abstractC20433).f70003));
            case 18:
                return m40766(new C11987((C1899) ((C21844) abstractC20433).f70003));
            case 19:
                return m40766(new C11987((C11072) ((C21844) abstractC20433).f70003));
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                C13687 c13687 = ((C4910) abstractC20433).f15500;
                return m40766(new C9808(c13687.m32933(), c13687.m32932(), c13687.m32934()));
            case 27:
                return m40766(new C17568(((C17631) abstractC20433).f53873));
            default:
                return null;
        }
    }

    @Override // l.AbstractC7070
    /* JADX INFO: renamed from: ֫ */
    public final Object mo19077(AbstractC20433 abstractC20433, ArrayList arrayList) {
        C11219 c11219;
        EnumC2815 enumC2815 = abstractC20433.f65930;
        Iterator it = arrayList.iterator();
        do {
            int i = 0;
            if (!it.hasNext()) {
                int i2 = C14598.f44686[enumC2815.ordinal()];
                C20950 c20950 = this.f53281;
                switch (i2) {
                    case 204:
                    case 205:
                        C6838 c6838 = new C6838();
                        String strSubstring = ((C13376) abstractC20433).f40002.substring(1);
                        c20950.m47768(C17819.m41744(c20950.m47767(c6838), new C16156(EnumC1340.NEW_ARRAY, C23275.m51589(arrayList.size()), strSubstring)));
                        while (i < arrayList.size()) {
                            c20950.m47768(C17819.m41744(new C12692(c20950.m47767(c6838), C23275.m51589(i), strSubstring), c20950.m47767((C6838) arrayList.get(i))));
                            i++;
                        }
                        return c6838;
                    case 206:
                    case 207:
                        int size = arrayList.size();
                        AbstractC8396[] abstractC8396Arr = new AbstractC8396[size];
                        while (i < size) {
                            abstractC8396Arr[i] = c20950.m47767((C6838) arrayList.get(i));
                            i++;
                        }
                        C10161 c10161 = ((C10555) abstractC20433).f31687;
                        C2046 c2046 = new C2046(EnumC1340.INVOKE_CUSTOM, abstractC8396Arr, c10161);
                        if ("V".equals(c10161.m25525().m27469())) {
                            c20950.m47768(new C6530(c2046));
                            return null;
                        }
                        return m40766(c2046);
                    case 208:
                    case 209:
                        int size2 = arrayList.size();
                        AbstractC8396[] abstractC8396Arr2 = new AbstractC8396[size2];
                        while (i < size2) {
                            abstractC8396Arr2[i] = c20950.m47767((C6838) arrayList.get(i));
                            i++;
                        }
                        C6321 c6321 = (C6321) abstractC20433;
                        C11072 c11072 = c6321.f19610;
                        C16862 c16862 = new C16862(EnumC1340.INVOKE_POLYMORPHIC, abstractC8396Arr2, c11072, c6321.f19611);
                        if ("V".equals(c11072.m27469())) {
                            c20950.m47768(new C6530(c16862));
                            return null;
                        }
                        return m40766(c16862);
                    default:
                        int size3 = arrayList.size();
                        AbstractC8396[] abstractC8396Arr3 = new AbstractC8396[size3];
                        while (i < size3) {
                            abstractC8396Arr3[i] = c20950.m47767((C6838) arrayList.get(i));
                            i++;
                        }
                        C7338 c7338 = ((C11966) abstractC20433).f35833;
                        switch (C14598.f44686[enumC2815.ordinal()]) {
                            case 194:
                            case 195:
                                c11219 = new C11219(EnumC1340.INVOKE_VIRTUAL, abstractC8396Arr3, c7338.m19702(), c7338.m19700(), c7338.m19704(), c7338.m19701());
                                break;
                            case 196:
                            case 197:
                            case 198:
                            case 199:
                                c11219 = new C11219(EnumC1340.INVOKE_SPECIAL, abstractC8396Arr3, c7338.m19702(), c7338.m19700(), c7338.m19704(), c7338.m19701());
                                break;
                            case 200:
                            case 201:
                                c11219 = new C11219(EnumC1340.INVOKE_STATIC, abstractC8396Arr3, c7338.m19702(), c7338.m19700(), c7338.m19704(), c7338.m19701());
                                break;
                            case 202:
                            case 203:
                                c11219 = new C11219(EnumC1340.INVOKE_INTERFACE, abstractC8396Arr3, c7338.m19702(), c7338.m19700(), c7338.m19704(), c7338.m19701());
                                break;
                            default:
                                throw new RuntimeException();
                        }
                        if ("V".equals(c7338.m19701())) {
                            c20950.m47768(new C6530(c11219));
                            return null;
                        }
                        return m40766(c11219);
                }
            }
        } while (((C6838) it.next()) != null);
        m40767(abstractC20433);
        return m40766(C23275.m51589(0));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40767(AbstractC20433 abstractC20433) {
        String str;
        int[] iArr = C14598.f44686;
        EnumC2815 enumC2815 = abstractC20433.f65930;
        switch (iArr[enumC2815.ordinal()]) {
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
                str = "can't get operand(s) for " + enumC2815 + ", wrong position ?";
                break;
            default:
                str = "can't get operand(s) for " + enumC2815 + ", out-of-range or not initialized ?";
                break;
        }
        System.err.println("WARN: " + str);
        this.f53281.m47768(C17819.m41745(C23275.m51588(new AbstractC8396[]{new C11987(C20094.m46315("d2j: ", str))}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
    }
}
