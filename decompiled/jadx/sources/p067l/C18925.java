package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C18925 extends AbstractC9088 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22279 f56469;

    public C18925(C22279 c22279) {
        this.f56469 = c22279;
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21032(AbstractC21788 abstractC21788, Object obj) {
        C8867 c8867 = (C8867) obj;
        if (c8867 == null) {
            m43024(abstractC21788);
            return m43023(C24489.m53985(0));
        }
        return m43023(this.f56469.m50097(c8867));
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21033(AbstractC21788 abstractC21788, Object obj, Object obj2) {
        C8867 c8867 = (C8867) obj;
        C8867 c8868 = (C8867) obj2;
        if (c8867 == null || c8868 == null) {
            m43024(abstractC21788);
            return m43023(C24489.m53985(0));
        }
        C22279 c22279 = this.f56469;
        C19736 c19736M50097 = c22279.m50097(c8867);
        C19736 c19736M50098 = c22279.m50097(c8868);
        switch (C16242.f47793[abstractC21788.f68605.ordinal()]) {
            case 98:
                return m43023(new C14431(c19736M50097, c19736M50098, EnumC5714.IF.f14005));
            case C0254q.f1216f /* 99 */:
                return m43023(new C14431(c19736M50097, c19736M50098, "Z"));
            case 100:
                return m43023(new C14431(c19736M50097, c19736M50098, "B"));
            case 101:
                return m43023(new C14431(c19736M50097, c19736M50098, "C"));
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                return m43023(new C14431(c19736M50097, c19736M50098, "L"));
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                return m43023(new C14431(c19736M50097, c19736M50098, "S"));
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return m43023(new C14431(c19736M50097, c19736M50098, EnumC5714.JD.f14005));
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                return m43023(new C12420(EnumC3642.LCMP, c19736M50097, c19736M50098, "J"));
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return m43023(new C12420(EnumC3642.DCMPG, c19736M50097, c19736M50098, "D"));
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return m43023(new C12420(EnumC3642.FCMPG, c19736M50097, c19736M50098, "F"));
            case 108:
                return m43023(new C12420(EnumC3642.DCMPL, c19736M50097, c19736M50098, "D"));
            case 109:
                return m43023(new C12420(EnumC3642.FCMPL, c19736M50097, c19736M50098, "F"));
            case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "D"));
            case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "F"));
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "I"));
            case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "J"));
            case 114:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "D"));
            case 115:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "F"));
            case 116:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "I"));
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "J"));
            case 118:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "D"));
            case 119:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "F"));
            case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "I"));
            case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "J"));
            case 122:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "D"));
            case 123:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "F"));
            case 124:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "I"));
            case C0254q.f1218h /* 125 */:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "J"));
            case 126:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "D"));
            case 127:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "F"));
            case 128:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "I"));
            case 129:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "J"));
            case 130:
                return m43023(new C12420(EnumC3642.AND, c19736M50097, c19736M50098, EnumC5714.ZI.f14005));
            case 131:
                return m43023(new C12420(EnumC3642.AND, c19736M50097, c19736M50098, "J"));
            case 132:
                return m43023(new C12420(EnumC3642.OR, c19736M50097, c19736M50098, EnumC5714.ZI.f14005));
            case 133:
                return m43023(new C12420(EnumC3642.OR, c19736M50097, c19736M50098, "J"));
            case 134:
                return m43023(new C12420(EnumC3642.XOR, c19736M50097, c19736M50098, EnumC5714.ZI.f14005));
            case 135:
                return m43023(new C12420(EnumC3642.XOR, c19736M50097, c19736M50098, "J"));
            case 136:
                return m43023(new C12420(EnumC3642.SHL, c19736M50097, c19736M50098, "I"));
            case 137:
                return m43023(new C12420(EnumC3642.SHL, c19736M50097, c19736M50098, "J"));
            case 138:
                return m43023(new C12420(EnumC3642.SHR, c19736M50097, c19736M50098, "I"));
            case 139:
                return m43023(new C12420(EnumC3642.SHR, c19736M50097, c19736M50098, "J"));
            case 140:
                return m43023(new C12420(EnumC3642.USHR, c19736M50097, c19736M50098, "I"));
            case 141:
                return m43023(new C12420(EnumC3642.USHR, c19736M50097, c19736M50098, "J"));
            case 142:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.EQ, c19736M50097, c19736M50098, EnumC5714.ZIL.f14005), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 143:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.GE, c19736M50097, c19736M50098, "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 144:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.GT, c19736M50097, c19736M50098, "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 145:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.LE, c19736M50097, c19736M50098, "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 146:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.LT, c19736M50097, c19736M50098, "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 147:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.NE, c19736M50097, c19736M50098, EnumC5714.ZIL.f14005), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case EnumC19222.f57460 /* 154 */:
                C15376 c15376 = ((C7035) abstractC21788).f18333;
                c22279.m50098(C19303.m43990(new C15771(c19736M50097, c15376.m35048(), c15376.m35047(), c15376.m35049()), c19736M50098));
                return null;
            case 155:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "D"));
            case 156:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "F"));
            case 157:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "I"));
            case 158:
                return m43023(C24489.m53983(c19736M50097, c19736M50098, "J"));
            case 159:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "D"));
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "F"));
            case 161:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "I"));
            case 162:
                return m43023(C24489.m53988(c19736M50098, c19736M50097, "J"));
            case 163:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "D"));
            case 164:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "F"));
            case 165:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "I"));
            case 166:
                return m43023(C24489.m53987(c19736M50097, c19736M50098, "J"));
            case 167:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "D"));
            case 168:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "F"));
            case 169:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "I"));
            case 170:
                return m43023(C24489.m53986(c19736M50097, c19736M50098, "J"));
            case 171:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "D"));
            case 172:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "F"));
            case 173:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "I"));
            case 174:
                return m43023(C24489.m53989(c19736M50097, c19736M50098, "J"));
            case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                return m43023(new C12420(EnumC3642.AND, c19736M50097, c19736M50098, EnumC5714.ZI.f14005));
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                return m43023(new C12420(EnumC3642.AND, c19736M50097, c19736M50098, "J"));
            case 177:
                return m43023(new C12420(EnumC3642.OR, c19736M50097, c19736M50098, EnumC5714.ZI.f14005));
            case 178:
                return m43023(new C12420(EnumC3642.OR, c19736M50097, c19736M50098, "J"));
            case 179:
                return m43023(new C12420(EnumC3642.XOR, c19736M50097, c19736M50098, EnumC5714.ZI.f14005));
            case 180:
                return m43023(new C12420(EnumC3642.XOR, c19736M50097, c19736M50098, "J"));
            case 181:
                return m43023(new C12420(EnumC3642.SHL, c19736M50097, c19736M50098, "I"));
            case 182:
                return m43023(new C12420(EnumC3642.SHL, c19736M50097, c19736M50098, "J"));
            case 183:
                return m43023(new C12420(EnumC3642.SHR, c19736M50097, c19736M50098, "I"));
            case 184:
                return m43023(new C12420(EnumC3642.SHR, c19736M50097, c19736M50098, "J"));
            case 185:
                return m43023(new C12420(EnumC3642.USHR, c19736M50097, c19736M50098, "I"));
            case 186:
                return m43023(new C12420(EnumC3642.USHR, c19736M50097, c19736M50098, "J"));
            default:
                throw new RuntimeException();
        }
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21034(AbstractC21788 abstractC21788, Object obj, Object obj2, Object obj3) {
        C8867 c8867 = (C8867) obj;
        C8867 c8868 = (C8867) obj2;
        C8867 c8869 = (C8867) obj3;
        if (c8867 == null || c8868 == null || c8869 == null) {
            m43024(abstractC21788);
            return m43023(C24489.m53985(0));
        }
        C22279 c22279 = this.f56469;
        C19736 c19736M50097 = c22279.m50097(c8867);
        C19736 c19736M50098 = c22279.m50097(c8868);
        C19736 c19736M50099 = c22279.m50097(c8869);
        switch (C16242.f47793[abstractC21788.f68605.ordinal()]) {
            case 187:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, EnumC5714.IF.f14005), c19736M50099));
                return null;
            case 188:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, "Z"), c19736M50099));
                return null;
            case 189:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, "B"), c19736M50099));
                return null;
            case 190:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, "C"), c19736M50099));
                return null;
            case 191:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, "L"), c19736M50099));
                return null;
            case 192:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, "S"), c19736M50099));
                return null;
            case 193:
                c22279.m50098(C19303.m43990(new C14431(c19736M50097, c19736M50098, EnumC5714.JD.f14005), c19736M50099));
                return null;
            default:
                return null;
        }
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ۧ */
    public final void mo21036(AbstractC21788 abstractC21788, Object obj) {
        C8867 c8867 = (C8867) obj;
        if (c8867 == null) {
            m43024(abstractC21788);
            return;
        }
        C22279 c22279 = this.f56469;
        c22279.m50098(new C24667(EnumC9677.RETURN, c22279.m50097(c8867)));
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ܽ */
    public final Object mo21037(AbstractC21788 abstractC21788, Object obj) {
        EnumC5044 enumC5044 = abstractC21788.f68605;
        C8867 c8867 = (C8867) obj;
        if (c8867 == null) {
            m43024(abstractC21788);
            return m43023(C24489.m53985(0));
        }
        C22279 c22279 = this.f56469;
        C19736 c19736M50097 = c22279.m50097(c8867);
        String str = "I";
        switch (C16242.f47793[enumC5044.ordinal()]) {
            case 28:
                return m43023(new C6325(EnumC3642.NOT, c19736M50097, "I"));
            case 29:
                return m43023(new C6325(EnumC3642.NOT, c19736M50097, "J"));
            case 30:
                return m43023(new C6325(EnumC3642.NEG, c19736M50097, "D"));
            case 31:
                return m43023(new C6325(EnumC3642.NEG, c19736M50097, "F"));
            case 32:
                return m43023(new C6325(EnumC3642.NEG, c19736M50097, "I"));
            case 33:
                return m43023(new C6325(EnumC3642.NEG, c19736M50097, "J"));
            case 34:
                return m43023(new C8396(c19736M50097, "I", "B"));
            case 35:
                return m43023(new C8396(c19736M50097, "I", "C"));
            case 36:
                return m43023(new C8396(c19736M50097, "I", "D"));
            case 37:
                return m43023(new C8396(c19736M50097, "I", "F"));
            case 38:
                return m43023(new C8396(c19736M50097, "I", "J"));
            case 39:
                return m43023(new C8396(c19736M50097, "I", "S"));
            case 40:
                return m43023(new C8396(c19736M50097, "F", "D"));
            case 41:
                return m43023(new C8396(c19736M50097, "F", "I"));
            case 42:
                return m43023(new C8396(c19736M50097, "F", "J"));
            case 43:
                return m43023(new C8396(c19736M50097, "D", "F"));
            case 44:
                return m43023(new C8396(c19736M50097, "D", "I"));
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                return m43023(new C8396(c19736M50097, "D", "J"));
            case 46:
                return m43023(new C8396(c19736M50097, "J", "D"));
            case 47:
                return m43023(new C8396(c19736M50097, "J", "F"));
            case 48:
                return m43023(new C8396(c19736M50097, "J", "I"));
            case 49:
                return m43023(new C6325(EnumC3642.LENGTH, c19736M50097, null));
            case 50:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.EQ, c19736M50097, C24489.m53985(0), EnumC5714.ZIL.f14005), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 51:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.GE, c19736M50097, C24489.m53985(0), "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 52:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.GT, c19736M50097, C24489.m53985(0), "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 53:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.LE, c19736M50097, C24489.m53985(0), "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.LT, c19736M50097, C24489.m53985(0), "I"), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                c22279.m50098(C19303.m43989(new C12420(EnumC3642.NE, c19736M50097, C24489.m53985(0), EnumC5714.ZIL.f14005), c22279.m50096(((C14411) abstractC21788).f41212)));
                return null;
            case 56:
            case 57:
                C13366[] c13366Arr = ((AbstractC17092) abstractC21788).f50509;
                C15041[] c15041Arr = new C15041[c13366Arr.length];
                for (int i = 0; i < c13366Arr.length; i++) {
                    c15041Arr[i] = c22279.m50096(c13366Arr[i]);
                }
                C15041 c15041 = new C15041();
                if (enumC5044 == EnumC5044.f11798) {
                    c22279.m50098(new C18632(c19736M50097, ((C24469) abstractC21788).f77436, c15041Arr, c15041));
                } else {
                    c22279.m50098(new C14371(c19736M50097, ((C15751) abstractC21788).f45620, c15041Arr, c15041));
                }
                c22279.m50098(c15041);
                return null;
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                C15376 c15376 = ((C7035) abstractC21788).f18333;
                c22279.m50098(C19303.m43990(new C11690(c15376.m35048(), c15376.m35047(), c15376.m35049()), c19736M50097));
                return null;
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                C15376 c15377 = ((C7035) abstractC21788).f18333;
                return m43023(new C15771(c19736M50097, c15377.m35048(), c15377.m35047(), c15377.m35049()));
            case 72:
                return m43023(new C17723(EnumC3642.INSTANCE_OF, c19736M50097, ((C19125) abstractC21788).f57066));
            case 73:
                return m43023(new C17723(EnumC3642.NEW_ARRAY, c19736M50097, ((C19125) abstractC21788).f57066.substring(1)));
            case 74:
                return m43023(new C17723(EnumC3642.CHECK_CAST, c19736M50097, ((C19125) abstractC21788).f57066));
            case 75:
                c22279.m50098(new C24667(EnumC9677.LOCK, c19736M50097));
                return null;
            case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                c22279.m50098(new C24667(EnumC9677.UNLOCK, c19736M50097));
                return null;
            case 77:
                c22279.m50098(C19303.m43991(c19736M50097));
                return null;
            case 78:
            case 79:
                return m43023(C24489.m53983(c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 80:
            case 81:
                return m43023(C24489.m53988(c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 82:
            case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                return m43023(C24489.m53987(c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 84:
            case 85:
                return m43023(C24489.m53986(c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case HRSS1373Polynomial.f81792K /* 86 */:
            case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                return m43023(C24489.m53989(c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 88:
            case 89:
                int i2 = ((C13091) abstractC21788).f36806;
                C13761 c13761M53985 = C24489.m53985(i2);
                if (i2 >= 0 && i2 <= 1) {
                    str = EnumC5714.ZI.f14005;
                }
                return m43023(new C12420(EnumC3642.AND, c19736M50097, c13761M53985, str));
            case 90:
            case 91:
                int i3 = ((C13091) abstractC21788).f36806;
                C13761 c13761M53986 = C24489.m53985(i3);
                if (i3 >= 0 && i3 <= 1) {
                    str = EnumC5714.ZI.f14005;
                }
                return m43023(new C12420(EnumC3642.OR, c19736M50097, c13761M53986, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
            case 93:
                int i4 = ((C13091) abstractC21788).f36806;
                C13761 c13761M53987 = C24489.m53985(i4);
                if (i4 >= 0 && i4 <= 1) {
                    str = EnumC5714.ZI.f14005;
                }
                return m43023(new C12420(EnumC3642.XOR, c19736M50097, c13761M53987, str));
            case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                return m43023(new C12420(EnumC3642.SHL, c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 95:
                return m43023(new C12420(EnumC3642.SHR, c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 96:
                return m43023(new C12420(EnumC3642.USHR, c19736M50097, C24489.m53985(((C13091) abstractC21788).f36806), "I"));
            case 97:
                c22279.m50098(new C23089(EnumC9677.FILL_ARRAY_DATA, c19736M50097, new C13761(((C5694) abstractC21788).f13901)));
                return null;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8867 m43023(AbstractC10348 abstractC10348) {
        C22279 c22279 = this.f56469;
        C19736 c19736M50093 = c22279.m50093();
        c22279.m50098(C19303.m43990(c19736M50093, abstractC10348));
        return new C8867(c19736M50093);
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21031(AbstractC21788 abstractC21788) {
        switch (C16242.f47793[abstractC21788.f68605.ordinal()]) {
            case 7:
            case 8:
            case 9:
            case 10:
                Integer num = (Integer) ((C23129) abstractC21788).f72712;
                num.getClass();
                return m43023(new C13761(num));
            case 11:
            case 12:
            case 13:
            case 14:
                Long l2 = (Long) ((C23129) abstractC21788).f72712;
                l2.getClass();
                return m43023(new C13761(l2));
            case 15:
                return m43023(new C13761((C24094) ((C23129) abstractC21788).f72712));
            case 16:
            case 17:
                return m43023(new C13761((String) ((C23129) abstractC21788).f72712));
            case 18:
                return m43023(new C13761((C4173) ((C23129) abstractC21788).f72712));
            case 19:
                return m43023(new C13761((C12891) ((C23129) abstractC21788).f72712));
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                C15376 c15376 = ((C7035) abstractC21788).f18333;
                return m43023(new C11690(c15376.m35048(), c15376.m35047(), c15376.m35049()));
            case 27:
                return m43023(new C19065(((C19125) abstractC21788).f57066));
            default:
                return null;
        }
    }

    @Override // p067l.AbstractC9088
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21035(AbstractC21788 abstractC21788, ArrayList arrayList) {
        C13031 c13031;
        EnumC5044 enumC5044 = abstractC21788.f68605;
        Iterator it = arrayList.iterator();
        do {
            int i = 0;
            if (!it.hasNext()) {
                int i2 = C16242.f47793[enumC5044.ordinal()];
                C22279 c22279 = this.f56469;
                switch (i2) {
                    case 204:
                    case 205:
                        C8867 c8867 = new C8867();
                        String strSubstring = ((C15081) abstractC21788).f43069.substring(1);
                        c22279.m50098(C19303.m43990(c22279.m50097(c8867), new C17723(EnumC3642.NEW_ARRAY, C24489.m53985(arrayList.size()), strSubstring)));
                        while (i < arrayList.size()) {
                            c22279.m50098(C19303.m43990(new C14431(c22279.m50097(c8867), C24489.m53985(i), strSubstring), c22279.m50097((C8867) arrayList.get(i))));
                            i++;
                        }
                        return c8867;
                    case 206:
                    case 207:
                        int size = arrayList.size();
                        AbstractC10348[] abstractC10348Arr = new AbstractC10348[size];
                        while (i < size) {
                            abstractC10348Arr[i] = c22279.m50097((C8867) arrayList.get(i));
                            i++;
                        }
                        C12025 c12025 = ((C12400) abstractC21788).f34651;
                        C4313 c4313 = new C4313(EnumC3642.INVOKE_CUSTOM, abstractC10348Arr, c12025);
                        if ("V".equals(c12025.m27544().m29531())) {
                            c22279.m50098(new C8574(c4313));
                            return null;
                        }
                        return m43023(c4313);
                    case 208:
                    case 209:
                        int size2 = arrayList.size();
                        AbstractC10348[] abstractC10348Arr2 = new AbstractC10348[size2];
                        while (i < size2) {
                            abstractC10348Arr2[i] = c22279.m50097((C8867) arrayList.get(i));
                            i++;
                        }
                        C8376 c8376 = (C8376) abstractC21788;
                        C12891 c12891 = c8376.f22481;
                        C18394 c18394 = new C18394(EnumC3642.INVOKE_POLYMORPHIC, abstractC10348Arr2, c12891, c8376.f22482);
                        if ("V".equals(c12891.m29531())) {
                            c22279.m50098(new C8574(c18394));
                            return null;
                        }
                        return m43023(c18394);
                    default:
                        int size3 = arrayList.size();
                        AbstractC10348[] abstractC10348Arr3 = new AbstractC10348[size3];
                        while (i < size3) {
                            abstractC10348Arr3[i] = c22279.m50097((C8867) arrayList.get(i));
                            i++;
                        }
                        C9342 c9342 = ((C13741) abstractC21788).f38843;
                        switch (C16242.f47793[enumC5044.ordinal()]) {
                            case 194:
                            case 195:
                                c13031 = new C13031(EnumC3642.INVOKE_VIRTUAL, abstractC10348Arr3, c9342.m21675(), c9342.m21673(), c9342.m21677(), c9342.m21674());
                                break;
                            case 196:
                            case 197:
                            case 198:
                            case 199:
                                c13031 = new C13031(EnumC3642.INVOKE_SPECIAL, abstractC10348Arr3, c9342.m21675(), c9342.m21673(), c9342.m21677(), c9342.m21674());
                                break;
                            case 200:
                            case 201:
                                c13031 = new C13031(EnumC3642.INVOKE_STATIC, abstractC10348Arr3, c9342.m21675(), c9342.m21673(), c9342.m21677(), c9342.m21674());
                                break;
                            case 202:
                            case 203:
                                c13031 = new C13031(EnumC3642.INVOKE_INTERFACE, abstractC10348Arr3, c9342.m21675(), c9342.m21673(), c9342.m21677(), c9342.m21674());
                                break;
                            default:
                                throw new RuntimeException();
                        }
                        if ("V".equals(c9342.m21674())) {
                            c22279.m50098(new C8574(c13031));
                            return null;
                        }
                        return m43023(c13031);
                }
            }
        } while (((C8867) it.next()) != null);
        m43024(abstractC21788);
        return m43023(C24489.m53985(0));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43024(AbstractC21788 abstractC21788) {
        String str;
        int[] iArr = C16242.f47793;
        EnumC5044 enumC5044 = abstractC21788.f68605;
        switch (iArr[enumC5044.ordinal()]) {
            case 210:
            case Primes.SMALL_FACTOR_LIMIT /* 211 */:
            case 212:
                str = "can't get operand(s) for " + enumC5044 + ", wrong position ?";
                break;
            default:
                str = "can't get operand(s) for " + enumC5044 + ", out-of-range or not initialized ?";
                break;
        }
        System.err.println("WARN: " + str);
        this.f56469.m50098(C19303.m43991(C24489.m53984(new AbstractC10348[]{new C13761(C21466.m48631("d2j: ", str))}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
    }
}
