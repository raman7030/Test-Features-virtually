package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ۙ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T41H */
/* JADX INFO: loaded from: classes2.dex */
public final class C6795 {

    /* JADX INFO: renamed from: ۧ */
    public static final C6468 f17609 = new C6468();

    /* JADX INFO: renamed from: ܽ */
    public static final Integer f17610 = -1;

    /* JADX INFO: renamed from: ܿ */
    public static final Integer f17611 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public static final Integer f17612 = 1;

    /* JADX INFO: renamed from: ֫ */
    public C22004 f17613;

    /* JADX INFO: renamed from: ֫ */
    public static C6795 m15513(C5127 c5127) {
        C6468 c6468 = f17609;
        C6795 c6795 = (C6795) c5127.m10905(c6468);
        if (c6795 != null) {
            return c6795;
        }
        C6795 c6796 = new C6795();
        c5127.m10908(c6468, c6796);
        c6796.f17613 = C22004.m49577(c5127);
        return c6796;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Integer m15512(boolean z) {
        return z ? f17612 : f17611;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m15514(int i, AbstractC6462 abstractC6462) {
        C22004 c22004 = this.f17613;
        try {
            Object objMo14779 = abstractC6462.mo14779();
            if (i == 0) {
                return abstractC6462;
            }
            if (i == 257) {
                return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() == 0));
            }
            if (i == 130) {
                return c22004.f69134.mo5576(Integer.valueOf(~((Number) objMo14779).intValue()));
            }
            if (i == 131) {
                return c22004.f69152.mo5576(Long.valueOf(~((Number) objMo14779).longValue()));
            }
            switch (i) {
                case 116:
                    return c22004.f69134.mo5576(Integer.valueOf(-((Number) objMo14779).intValue()));
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    return c22004.f69152.mo5576(Long.valueOf(-((Number) objMo14779).longValue()));
                case 118:
                    return c22004.f69165.mo5576(Float.valueOf(-((Number) objMo14779).floatValue()));
                case 119:
                    return c22004.f69181.mo5576(Double.valueOf(-((Number) objMo14779).doubleValue()));
                default:
                    switch (i) {
                        case 153:
                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() == 0));
                        case EnumC19222.f57460 /* 154 */:
                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() != 0));
                        case 155:
                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() < 0));
                        case 156:
                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() >= 0));
                        case 157:
                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() > 0));
                        case 158:
                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() <= 0));
                        default:
                            return null;
                    }
            }
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x049b A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x04b3 A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x04cb A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x04e3 A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x04fb A[Catch: ArithmeticException -> 0x0567, TryCatch #0 {ArithmeticException -> 0x0567, blocks: (B:5:0x0008, B:8:0x0013, B:10:0x0019, B:136:0x03df, B:138:0x03f0, B:140:0x03ff, B:143:0x0410, B:145:0x0419, B:148:0x042a, B:150:0x0433, B:153:0x0444, B:155:0x044d, B:158:0x045e, B:160:0x0467, B:163:0x0478, B:165:0x0481, B:168:0x0492, B:90:0x02f2, B:92:0x0304, B:94:0x030b, B:96:0x031d, B:98:0x0324, B:100:0x0334, B:104:0x033f, B:106:0x0346, B:108:0x034d, B:110:0x035f, B:112:0x0366, B:114:0x0378, B:116:0x037f, B:118:0x038f, B:122:0x039a, B:124:0x03a1, B:126:0x03a8, B:128:0x03ba, B:130:0x03c1, B:132:0x03d1, B:134:0x03d8, B:64:0x0229, B:66:0x0241, B:68:0x0249, B:70:0x024e, B:69:0x024c, B:72:0x0264, B:74:0x027c, B:76:0x0284, B:78:0x0289, B:77:0x0287, B:80:0x029f, B:82:0x02b7, B:84:0x02bf, B:86:0x02c4, B:85:0x02c2, B:88:0x02da, B:170:0x049b, B:172:0x04b3, B:174:0x04cb, B:176:0x04e3, B:178:0x04fb, B:24:0x0045, B:26:0x005d, B:28:0x0075, B:30:0x008d, B:32:0x00a5, B:34:0x00bd, B:36:0x00d5, B:38:0x00ed, B:40:0x0105, B:42:0x011e, B:44:0x0137, B:46:0x0150, B:48:0x0169, B:50:0x0181, B:52:0x0199, B:54:0x01b1, B:56:0x01c9, B:58:0x01e1, B:60:0x01f9, B:62:0x0211, B:180:0x0513, B:183:0x0525, B:185:0x052e, B:188:0x0540, B:190:0x0549), top: B:195:0x0004 }] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m15515(int i, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C22004 c22004 = this.f17613;
        try {
            if (i > 511) {
                AbstractC6462 abstractC6462M15515 = m15515(i >> 9, abstractC6462, abstractC6463);
                return abstractC6462M15515.mo14779() == null ? abstractC6462M15515 : m15514(i & SecP521R1Field.P16, abstractC6462M15515);
            }
            Object objMo14779 = abstractC6462.mo14779();
            Object objMo147710 = abstractC6463.mo14779();
            if (i == 256) {
                return c22004.f69215.mo5576(abstractC6462.mo5578() + abstractC6463.mo5578());
            }
            if (i == 258) {
                return c22004.f69151.mo5576(m15512((((Number) objMo14779).intValue() & ((Number) objMo147710).intValue()) != 0));
            }
            if (i == 259) {
                return c22004.f69151.mo5576(m15512((((Number) objMo14779).intValue() | ((Number) objMo147710).intValue()) != 0));
            }
            switch (i) {
                case 96:
                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() + ((Number) objMo147710).intValue()));
                case 97:
                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() + ((Number) objMo147710).longValue()));
                case 98:
                    return c22004.f69165.mo5576(Float.valueOf(((Number) objMo14779).floatValue() + ((Number) objMo147710).floatValue()));
                case C0254q.f1216f /* 99 */:
                    return c22004.f69181.mo5576(Double.valueOf(((Number) objMo14779).doubleValue() + ((Number) objMo147710).doubleValue()));
                case 100:
                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() - ((Number) objMo147710).intValue()));
                case 101:
                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() - ((Number) objMo147710).longValue()));
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                    return c22004.f69165.mo5576(Float.valueOf(((Number) objMo14779).floatValue() - ((Number) objMo147710).floatValue()));
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    return c22004.f69181.mo5576(Double.valueOf(((Number) objMo14779).doubleValue() - ((Number) objMo147710).doubleValue()));
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() * ((Number) objMo147710).intValue()));
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() * ((Number) objMo147710).longValue()));
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                    return c22004.f69165.mo5576(Float.valueOf(((Number) objMo14779).floatValue() * ((Number) objMo147710).floatValue()));
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    return c22004.f69181.mo5576(Double.valueOf(((Number) objMo14779).doubleValue() * ((Number) objMo147710).doubleValue()));
                case 108:
                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() / ((Number) objMo147710).intValue()));
                case 109:
                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() / ((Number) objMo147710).longValue()));
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    return c22004.f69165.mo5576(Float.valueOf(((Number) objMo14779).floatValue() / ((Number) objMo147710).floatValue()));
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                    return c22004.f69181.mo5576(Double.valueOf(((Number) objMo14779).doubleValue() / ((Number) objMo147710).doubleValue()));
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() % ((Number) objMo147710).intValue()));
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() % ((Number) objMo147710).longValue()));
                case 114:
                    return c22004.f69165.mo5576(Float.valueOf(((Number) objMo14779).floatValue() % ((Number) objMo147710).floatValue()));
                case 115:
                    return c22004.f69181.mo5576(Double.valueOf(((Number) objMo14779).doubleValue() % ((Number) objMo147710).doubleValue()));
                default:
                    switch (i) {
                        case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                            return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() << ((Number) objMo147710).intValue()));
                        case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                            return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() << ((Number) objMo147710).intValue()));
                        case 122:
                            return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() >> ((Number) objMo147710).intValue()));
                        case 123:
                            return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() >> ((Number) objMo147710).intValue()));
                        case 124:
                            return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() >>> ((Number) objMo147710).intValue()));
                        case C0254q.f1218h /* 125 */:
                            return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() >>> ((Number) objMo147710).intValue()));
                        case 126:
                            return (abstractC6462.m14777(EnumC11353.BOOLEAN) ? c22004.f69151 : c22004.f69134).mo5576(Integer.valueOf(((Number) objMo14779).intValue() & ((Number) objMo147710).intValue()));
                        case 127:
                            return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() & ((Number) objMo147710).longValue()));
                        case 128:
                            return (abstractC6462.m14777(EnumC11353.BOOLEAN) ? c22004.f69151 : c22004.f69134).mo5576(Integer.valueOf(((Number) objMo14779).intValue() | ((Number) objMo147710).intValue()));
                        case 129:
                            return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() | ((Number) objMo147710).longValue()));
                        case 130:
                            return (abstractC6462.m14777(EnumC11353.BOOLEAN) ? c22004.f69151 : c22004.f69134).mo5576(Integer.valueOf(((Number) objMo14779).intValue() ^ ((Number) objMo147710).intValue()));
                        case 131:
                            return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() ^ ((Number) objMo147710).longValue()));
                        default:
                            Integer num = f17611;
                            Integer num2 = f17612;
                            Integer num3 = f17610;
                            switch (i) {
                                case 148:
                                    if (((Number) objMo14779).longValue() < ((Number) objMo147710).longValue()) {
                                        return c22004.f69134.mo5576(num3);
                                    }
                                    return ((Number) objMo14779).longValue() > ((Number) objMo147710).longValue() ? c22004.f69134.mo5576(num2) : c22004.f69134.mo5576(num);
                                case 149:
                                case 150:
                                    if (((Number) objMo14779).floatValue() < ((Number) objMo147710).floatValue()) {
                                        return c22004.f69134.mo5576(num3);
                                    }
                                    if (((Number) objMo14779).floatValue() > ((Number) objMo147710).floatValue()) {
                                        return c22004.f69134.mo5576(num2);
                                    }
                                    if (((Number) objMo14779).floatValue() == ((Number) objMo147710).floatValue()) {
                                        return c22004.f69134.mo5576(num);
                                    }
                                    return i == 150 ? c22004.f69134.mo5576(num2) : c22004.f69134.mo5576(num3);
                                case 151:
                                case 152:
                                    if (((Number) objMo14779).doubleValue() < ((Number) objMo147710).doubleValue()) {
                                        return c22004.f69134.mo5576(num3);
                                    }
                                    if (((Number) objMo14779).doubleValue() > ((Number) objMo147710).doubleValue()) {
                                        return c22004.f69134.mo5576(num2);
                                    }
                                    if (((Number) objMo14779).doubleValue() == ((Number) objMo147710).doubleValue()) {
                                        return c22004.f69134.mo5576(num);
                                    }
                                    return i == 152 ? c22004.f69134.mo5576(num2) : c22004.f69134.mo5576(num3);
                                default:
                                    switch (i) {
                                        case 159:
                                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() == ((Number) objMo147710).intValue()));
                                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() != ((Number) objMo147710).intValue()));
                                        case 161:
                                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() < ((Number) objMo147710).intValue()));
                                        case 162:
                                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() >= ((Number) objMo147710).intValue()));
                                        case 163:
                                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() > ((Number) objMo147710).intValue()));
                                        case 164:
                                            return c22004.f69151.mo5576(m15512(((Number) objMo14779).intValue() <= ((Number) objMo147710).intValue()));
                                        case 165:
                                            return c22004.f69151.mo5576(m15512(objMo14779.equals(objMo147710)));
                                        case 166:
                                            return c22004.f69151.mo5576(m15512(!objMo14779.equals(objMo147710)));
                                        default:
                                            switch (i) {
                                                case BottomAppBarTopEdgeTreatment.ANGLE_UP /* 270 */:
                                                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() << ((Number) objMo147710).intValue()));
                                                case 271:
                                                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() << ((Number) objMo147710).intValue()));
                                                case 272:
                                                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() >> ((Number) objMo147710).intValue()));
                                                case 273:
                                                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue() >> ((Number) objMo147710).intValue()));
                                                case 274:
                                                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue() >>> ((Number) objMo147710).intValue()));
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
            }
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 m15516(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C22004 c22004 = this.f17613;
        if (abstractC6462.f16705.f20406 == abstractC6463.f16705.f20406) {
            return abstractC6462;
        }
        if (abstractC6462.mo14778()) {
            Object objMo14779 = abstractC6462.mo14779();
            switch (C21548.f67957[abstractC6463.mo5577().ordinal()]) {
                case 1:
                    return c22004.f69184.mo5576(Integer.valueOf((byte) ((Number) objMo14779).intValue()));
                case 2:
                    return c22004.f69136.mo5576(Integer.valueOf((char) ((Number) objMo14779).intValue()));
                case 3:
                    return c22004.f69195.mo5576(Integer.valueOf((short) ((Number) objMo14779).intValue()));
                case 4:
                    return c22004.f69134.mo5576(Integer.valueOf(((Number) objMo14779).intValue()));
                case 5:
                    return c22004.f69152.mo5576(Long.valueOf(((Number) objMo14779).longValue()));
                case 6:
                    return c22004.f69165.mo5576(Float.valueOf(((Number) objMo14779).floatValue()));
                case 7:
                    return c22004.f69181.mo5576(Double.valueOf(((Number) objMo14779).doubleValue()));
            }
        }
        return abstractC6463;
    }
}
