package p067l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.textfield.IndicatorViewController;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۢ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11345 {

    /* JADX INFO: renamed from: ֫ */
    public static final C13929 f31583;

    /* JADX INFO: renamed from: ۧ */
    public static final C13929 f31584;

    /* JADX INFO: renamed from: ܳ */
    public static final C13929 f31585;

    /* JADX INFO: renamed from: ܽ */
    public static final C13929 f31586;

    /* JADX INFO: renamed from: ܿ */
    public static final C13929 f31587;

    /* JADX INFO: renamed from: ᩳ */
    public static final C13929 f31588;

    /* JADX INFO: renamed from: ᩹۬᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f82105 = {5732, -2925, -2907, -2908, -2912, -2882, -2901, -2885, -2887, -2884, -2903, -2894, -2924, -2900, -2844, -2842, -2924, -2843, -2840, -2923, -2845, -2841, -2925, -2903, -2843, -2894, -2924, -2900, -2841, -2923, -2845, -2835, -2848, -2924, -2900, -2845, -2924, -2836, -2847, -2825, -2925, -2900, -2885, -2898, -2923, -2925, -2924, -2885, -2841, -2844, -2923, -2846, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2848, -2921, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2847, -2845, -2936, -2825, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2848, -2924, -2842, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2847, -2846, -2924, -2842, -2848, -2901, -2905, -2907, -2892, -2901, -2906, -2892, -2906, -2899, -2884, -2892, -2905, -2886, -2897, -2847, -2901, -2883, -2902, -2911, -2901, -2843, -2902, -2899, -2894, -2911, -2899, -2886, -2924, -2848, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2844, -2840, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2844, -2840, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2844, -2840, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2924, -2847, 5257, -28121, -28101, -28101, -28097, -28043, -28064, -28064, -28121, -28101, -28101, -28097, -28100, -28043, -28064, -28064, -28119, -28101, -28097, -28043, -28064, -28064, -28114, -28127, -28117, -28099, -28128, -28122, -28117, -28063, -28140, -28063, -28114, -28062, -28107, -28053, -28142, -28060, -28116, -28128, -28126, -28063, -28097, -28114, -28101, -28121, -28057, -28058, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28049, -28101, -28118, -28105, -28101, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28062, -28126, -28118, -28117, -28122, -28102, -28126, -28100, -28114, -28127, -28100, -28062, -28100, -28118, -28099, -28122, -28119, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28062, -28101, -28118, -28105, -28101, -28062, -28126, -28118, -28117, -28122, -28102, -28126, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28043, -28038, -28033, -28033, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28100, -28114, -28127, -28100, -28062, -28100, -28118, -28099, -28122, -28119, -28062, -28126, -28118, -28117, -28122, -28102, -28126, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28049, -28101, -28118, -28105, -28101, -28043, -28038, -28033, -28033, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28062, -28101, -28118, -28105, -28101, -28114, -28127, -28117, -28099, -28128, -28122, -28117, -28105, -28063, -28100, -28101, -28114, -28099, -28101, -28102, -28097, -28100, -28114, -28127, -28100, -28062, -28100, -28118, -28099, -28122, -28119, -28062, -28125, -28122, -28120, -28121, -28101, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28049, -28117, -28122, -28100, -28097, -28125, -28114, -28106, -28049, -28033, -28034, -28035, -28036, -28037, -28038, -28039, -28040, -28041, -28042, -28113, -28111, -28050, -28145, -28052, -28053, -28054, -28143, -28055, -28059, -28057, -28058, -28144, -28060, -28062, -28046, -28108, -28110, -28109, -28140, -28142, -28141, -28044, -28043, -28051, -28056, -28045, -28047, -28048, -28061, -28063, -28064, -28094, -28090, -28091};

    /* JADX INFO: renamed from: ᩻ */
    public static final C13929 f31589;

    /* JADX WARN: Code duplicated, block: B:118:0x0245 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:10:0x0025, B:13:0x002d, B:15:0x0044, B:17:0x0054, B:20:0x0065, B:22:0x0075, B:31:0x009a, B:33:0x00a5, B:36:0x00ad, B:39:0x00b2, B:41:0x00c2, B:43:0x00d1, B:45:0x00e6, B:48:0x00ee, B:51:0x00fc, B:55:0x0109, B:59:0x0116, B:63:0x0123, B:67:0x0130, B:69:0x0145, B:73:0x0152, B:74:0x0156, B:116:0x023f, B:118:0x0245, B:123:0x024f, B:125:0x0260, B:76:0x015b, B:79:0x016d, B:82:0x017f, B:85:0x0191, B:88:0x01a3, B:91:0x01b5, B:94:0x01c7, B:97:0x01d8, B:100:0x01e9, B:103:0x01fa, B:106:0x020b, B:109:0x021c, B:112:0x022d, B:27:0x0088), top: B:142:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0260 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:10:0x0025, B:13:0x002d, B:15:0x0044, B:17:0x0054, B:20:0x0065, B:22:0x0075, B:31:0x009a, B:33:0x00a5, B:36:0x00ad, B:39:0x00b2, B:41:0x00c2, B:43:0x00d1, B:45:0x00e6, B:48:0x00ee, B:51:0x00fc, B:55:0x0109, B:59:0x0116, B:63:0x0123, B:67:0x0130, B:69:0x0145, B:73:0x0152, B:74:0x0156, B:116:0x023f, B:118:0x0245, B:123:0x024f, B:125:0x0260, B:76:0x015b, B:79:0x016d, B:82:0x017f, B:85:0x0191, B:88:0x01a3, B:91:0x01b5, B:94:0x01c7, B:97:0x01d8, B:100:0x01e9, B:103:0x01fa, B:106:0x020b, B:109:0x021c, B:112:0x022d, B:27:0x0088), top: B:142:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x026d A[LOOP:0: B:124:0x025e->B:129:0x026d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023b, code lost:
    
        if (p067l.C0906.m55806(r3, p067l.C1017.m56189(p067l.C11345.f82105, 243, 16, r1)) != false) goto L114;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized boolean m26283(String str) {
        String strM56318;
        int iM55719;
        int i;
        short s = f82105[195];
        int i2 = 53640 * s;
        int i3 = s + 13410;
        int i4 = (i3 * i3) - i2 < 0 ? 61835 : 37455;
        synchronized (C11345.class) {
            boolean z = false;
            if (str != null) {
                try {
                    if (!C0937.m55923(str)) {
                        String strM56310 = C1048.m56310(C0894.m55765(str));
                        if (!C1229.m56404(strM56310, C1003.m56132(f82105, 196, 7, i4)) && !C1229.m56404(strM56310, C0912.m55822(f82105, 203, 8, i4)) && !C1071.m56345(strM56310, C0937.m55921(f82105, Primes.SMALL_FACTOR_LIMIT, 6, i4))) {
                            if (C1071.m56345(strM56310, AbstractC0942.m55970(f82105, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 8, i4)) || C1071.m56345(strM56310, C0873.m55689(f82105, 233, 4, i4))) {
                                if (strM56310.matches(C1003.m56132(f82105, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 8, i4))) {
                                    return false;
                                }
                            }
                            C13929 c13929 = f31589;
                            c13929.m56473reset((CharSequence) strM56310);
                            if (c13929.matches() && C0927.m55878(strM56310) > 20) {
                                try {
                                    C1563.m36824(str);
                                    return false;
                                } catch (Exception unused) {
                                }
                            }
                            if (C1229.m56404(strM56310, C1929.m56558(f82105, 237, 5, i4)) && C1028.m56248(strM56310, C1229.m56403(f82105, 242, 1, i4))) {
                                C13929 c139210 = f31589;
                                c139210.m56473reset((CharSequence) C1404.m56454(strM56310, 5, C0927.m55878(strM56310) - 1));
                                if (c139210.matches() && C0882.m55719(strM56310) > 26) {
                                    try {
                                        C1563.m36824(C0892.m55757(str, 5, C0927.m55878(str) - 1));
                                        return false;
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                            C13929 c139211 = f31585;
                            c139211.m56473reset((CharSequence) strM56310);
                            if (c139211.matches()) {
                                return false;
                            }
                            C13929 c139212 = f31587;
                            c139212.m56473reset((CharSequence) strM56310);
                            if (c139212.matches()) {
                                return false;
                            }
                            C13929 c139213 = f31583;
                            c139213.m56473reset((CharSequence) strM56310);
                            if (c139213.matches()) {
                                return false;
                            }
                            C13929 c139214 = f31584;
                            c139214.m56473reset((CharSequence) str);
                            if (c139214.matches()) {
                                return false;
                            }
                            C13929 c139215 = f31586;
                            c139215.m56473reset((CharSequence) strM56310);
                            String strReplaceAll = c139215.replaceAll("");
                            if (C0927.m55878(strM56310) != C0882.m55719(strReplaceAll)) {
                                C13929 c139216 = f31588;
                                c139216.m56473reset((CharSequence) strReplaceAll);
                                if (c139216.matches()) {
                                    return false;
                                }
                            }
                            switch (C0946.m55979(strM56310)) {
                                case -1673287821:
                                    break;
                                case -1582112677:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, C0937.m55921(f82105, 259, 18, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1 && C0882.m55712(strM56310, 0) <= 127) {
                                        return false;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    for (i = 0; i < iM55719; i++) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -1536685117:
                                    if (C0906.m55806(strM56310, AbstractC0942.m55970(f82105, 277, 10, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -1180285201:
                                    if (C0906.m55806(strM56310, C0955.m56029(f82105, 287, 23, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -884548715:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, C0946.m55986(f82105, 310, 15, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -392933862:
                                    if (C0906.m55806(strM56310, C0906.m55810(f82105, 325, 11, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -380928089:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, C1194.m56386(f82105, 336, 11, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -264127297:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, C1025.m56233(f82105, 347, 17, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -91758482:
                                    if (C0906.m55806(strM56310, C0989.m56092(f82105, 364, 20, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 79009683:
                                    if (C0906.m55806(strM56310, C0949.m56016(f82105, MLKEMEngine.KyberPolyBytes, 16, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 327283064:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, RunnableC0871.m55667(f82105, 400, 16, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 960509580:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, C1071.m56336(f82105, 416, 16, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 1562659004:
                                    if (ViewOnClickListenerC0939.m55949(strM56310, C0946.m55986(f82105, 432, 19, i4))) {
                                        return false;
                                    }
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                default:
                                    if (C0882.m55719(strM56310) != 1) {
                                        break;
                                    }
                                    strM56318 = C1048.m56318(f82105, 451, 46, i4);
                                    iM55719 = C0882.m55719(strM56310);
                                    while (i < iM55719) {
                                        if (C0989.m56097(strM56318, C0882.m55712(strM56310, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                            }
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ac, code lost:
    
        if (p067l.C0863.f81833 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015a, code lost:
    
        if (p067l.C1012.f81938 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0311, code lost:
    
        if (p067l.C1229.f82066 >= 0) goto L68;
     */
    static {
        C13259 c13259;
        int iM55680;
        int i;
        short[] sArr;
        C13259 c132510;
        int i2;
        int i3;
        int iM55979;
        int i4;
        int iM559710;
        int i5;
        int i6;
        int i7;
        C13259 c13259M30304;
        int i8;
        int iM55681;
        int i9;
        int i10 = C1229.f82066;
        int i11 = C0873.f81841;
        int iM55682 = (i10 - C0873.m55680("ۙ᩶")) * 55;
        int i12 = ((iM55682 ^ i11) * (-5247)) ^ (-794971789);
        int i13 = 0;
        short s = 0;
        String strM55750 = null;
        C13259 c132511 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i14 = iM55682 ^ 1846306565;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -70417405;
        int i21 = 0;
        C13259 c13259M30305 = null;
        short[] sArr6 = null;
        int i22 = 0;
        C13929 c13929Matcher = null;
        String str = null;
        while (true) {
            i20 = i14 ^ (i12 & (((i20 ^ i11) * (-24659)) >> 31));
            switch (i20) {
                case -2033943783:
                case -1277661615:
                    c13259 = c13259M30305;
                    C0894.m55769();
                    break;
                case -1972676945:
                case 1339114263:
                    c13259 = c13259M30305;
                    f31587 = C13259.m30304(C0873.m55689(sArr6, i16, 49, i15)).matcher((CharSequence) str);
                    sArr5 = f82105;
                    if (!C0861.m55626()) {
                        iM55680 = C0873.m55680("ܰ֡") ^ i10;
                        i = ((iM55680 ^ i11) * 7977) ^ 2013647185;
                        sArr = sArr2;
                        c132510 = c132511;
                        i2 = i21;
                        i3 = -113944862;
                        i8 = iM55680 ^ i3;
                        i21 = i2;
                        c132511 = c132510;
                        sArr2 = sArr;
                        c13259M30305 = c13259;
                        i14 = i8;
                        i12 = i;
                    }
                    i7 = i21;
                    iM559710 = (C0946.m55979("ᩴ᩵") ^ i11) * 97;
                    i5 = ((iM559710 ^ i10) * (-9507)) ^ (-177752600);
                    i21 = i7;
                    i6 = -305651146;
                    i8 = iM559710 ^ i6;
                    i = i5;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1846936012:
                case -1534252707:
                    C1024.m56209();
                    C1229.m56410();
                    throw new RuntimeException();
                case -1823888623:
                case 547972388:
                    c13259 = c13259M30305;
                    f31588 = C13259.m30304(C0882.m55717(sArr3, i17, i18, i15)).matcher((CharSequence) str);
                    sArr4 = f82105;
                    i19 = 52;
                    i22 = 28;
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (C0873.m55680("ۙ᩹") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i11) * 29553) ^ (-609491374);
                        sArr = sArr2;
                        c132510 = c132511;
                        i2 = i21;
                        i3 = -611103753;
                    } else {
                        iM55680 = C0946.m55979("᩸᩵") ^ i10;
                        i = ((iM55680 ^ i11) * 20677) ^ (-2138796148);
                        sArr = sArr2;
                        c132510 = c132511;
                        i2 = i21;
                        i3 = 3807681;
                    }
                    i8 = iM55680 ^ i3;
                    i21 = i2;
                    c132511 = c132510;
                    sArr2 = sArr;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1494189447:
                case 1550959537:
                    i15 = 62664;
                    iM55979 = (i10 - C0873.m55680("ۚۤ")) * (-45);
                    i = 506448523 ^ ((iM55979 ^ i11) * (-20961));
                    c13259M30305 = c13259M30305;
                    i4 = 2100684067;
                    i8 = iM55979 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1487848388:
                case 1808483868:
                    f31589 = c13929Matcher;
                    c13259M30305 = C13259.m30304(C0989.m56092(f82105, 21, 10, i15));
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("֨֫") + i11) * (-11);
                        i = ((iM55979 ^ i10) * (-14079)) ^ 1288301226;
                        i4 = 32502857;
                    } else {
                        iM55979 = C0946.m55979("᩻ۗ") ^ i10;
                        i = ((iM55979 ^ i11) * (-11991)) ^ (-1672665020);
                        i4 = 1383098657;
                    }
                    i8 = iM55979 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1312189829:
                case 723937307:
                    c13259 = c13259M30305;
                    f31583 = C13259.m30304(C0937.m55921(sArr4, i19, i22, i15)).matcher((CharSequence) str);
                    sArr6 = f82105;
                    i16 = 80;
                    if (!C0949.m56012()) {
                        iM55680 = C0946.m55979("ۗ֡") ^ i11;
                        i = ((iM55680 ^ i10) * 16685) ^ 502486455;
                        sArr = sArr2;
                        c132510 = c132511;
                        i2 = i21;
                        i3 = -790929341;
                        i8 = iM55680 ^ i3;
                        i21 = i2;
                        c132511 = c132510;
                        sArr2 = sArr;
                        c13259M30305 = c13259;
                        i14 = i8;
                        i12 = i;
                    }
                    iM559710 = C0873.m55680("ۛܶ") ^ i11;
                    i5 = ((iM559710 ^ i10) * (-18791)) ^ (-426482877);
                    i6 = -883307831;
                    i8 = iM559710 ^ i6;
                    i = i5;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1231013515:
                case 1220900820:
                    f31584 = C13259.m30304(C0863.m55635(sArr5, 129, 66, i15)).matcher((CharSequence) str);
                    return;
                case -1041369176:
                case 1498512379:
                    c13259 = c13259M30305;
                    str = "";
                    c13929Matcher = C13259.m30304(strM55750).matcher((CharSequence) "");
                    if (RunnableC0897.f81856) {
                        iM559710 = C0946.m55979("ۤܺ") ^ i10;
                        i5 = ((iM559710 ^ i11) * (-2693)) ^ (-251582867);
                        i6 = -633643123;
                    } else {
                        iM559710 = C0873.m55680("ۛܶ") ^ i11;
                        i5 = ((iM559710 ^ i10) * (-18791)) ^ (-426482877);
                        i6 = -883307831;
                    }
                    i8 = iM559710 ^ i6;
                    i = i5;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case -974767196:
                case 2145043824:
                    c13259 = c13259M30305;
                    strM55750 = C0892.m55750(f82105, 1, 20, i15);
                    if (!C0917.f81868) {
                        iM55979 = C0873.m55680("֡᩵") ^ i11;
                        i = (-668427066) ^ ((iM55979 ^ i10) * 13089);
                        c13259M30305 = c13259;
                        i4 = 65100873;
                        i8 = iM55979 ^ i4;
                        i14 = i8;
                        i12 = i;
                    }
                    i7 = i21;
                    iM559710 = (C0946.m55979("ᩴ᩵") ^ i11) * 97;
                    i5 = ((iM559710 ^ i10) * (-9507)) ^ (-177752600);
                    i21 = i7;
                    i6 = -305651146;
                    i8 = iM559710 ^ i6;
                    i = i5;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case -811194925:
                case 1278396582:
                    C0947.m55997();
                    c13259 = c13259M30305;
                    iM559710 = C0873.m55680("ۛܶ") ^ i11;
                    i5 = ((iM559710 ^ i10) * (-18791)) ^ (-426482877);
                    i6 = -883307831;
                    i8 = iM559710 ^ i6;
                    i = i5;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case -754127800:
                case 76883867:
                    break;
                case -477915174:
                case 582130651:
                    f31585 = c13259M30305.matcher((CharSequence) str);
                    sArr2 = f82105;
                    if (C1964.m56597() != 0) {
                        i7 = 31;
                        c13259 = c13259M30305;
                        iM559710 = (C0946.m55979("ᩴ᩵") ^ i11) * 97;
                        i5 = ((iM559710 ^ i10) * (-9507)) ^ (-177752600);
                        i21 = i7;
                        i6 = -305651146;
                        i8 = iM559710 ^ i6;
                        i = i5;
                        c13259M30305 = c13259;
                        i14 = i8;
                    } else {
                        int iM559711 = C0946.m55979("ܳ۫") ^ i11;
                        i = ((iM559711 ^ i10) * (-7831)) ^ 699711678;
                        i14 = iM559711 ^ (-1624834672);
                        i21 = 31;
                    }
                    i12 = i;
                    break;
                case -353475946:
                case -60646957:
                    i15 = 10309;
                    iM55979 = (i10 - C0873.m55680("ۚۤ")) * (-45);
                    i = 506448523 ^ ((iM55979 ^ i11) * (-20961));
                    c13259M30305 = c13259M30305;
                    i4 = 2100684067;
                    i8 = iM55979 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case -35439111:
                case 1918174413:
                    f31586 = c132511.matcher((CharSequence) str);
                    sArr3 = f82105;
                    i17 = 45;
                    i18 = 7;
                    if (C0845.m55584() <= 0) {
                        c13259 = c13259M30305;
                        c13259M30304 = c132511;
                        sArr = sArr2;
                        i2 = i21;
                        iM55681 = C0873.m55680("ۖ᩶") ^ i10;
                        c132510 = c13259M30304;
                        i9 = ((iM55681 ^ i11) * 1693) ^ 483098286;
                        i3 = -1251668804;
                        int i23 = iM55681;
                        i = i9;
                        iM55680 = i23;
                    } else {
                        iM55680 = C0946.m55979("۟ܶ") ^ i11;
                        i = ((iM55680 ^ i10) * 20699) ^ 1046695431;
                        c13259 = c13259M30305;
                        sArr = sArr2;
                        c132510 = c132511;
                        i2 = i21;
                        i3 = -906389408;
                    }
                    i8 = iM55680 ^ i3;
                    i21 = i2;
                    c132511 = c132510;
                    sArr2 = sArr;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
                case 269324979:
                case 1174157293:
                    if (((s * s) + 1132096) - i13 >= 0) {
                        iM55979 = C0946.m55979("᩸᩹") ^ i11;
                        i = ((iM55979 ^ i10) * 14873) ^ (-990419768);
                        i4 = -62662082;
                    } else {
                        iM55979 = C0873.m55680("ܽ᩸") ^ i11;
                        i = ((iM55979 ^ i10) * 441) ^ 1412119759;
                        i4 = -1496150962;
                    }
                    i8 = iM55979 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case 464651412:
                case 575861156:
                    RunnableC1014.m56177();
                    c13259 = c13259M30305;
                    break;
                case 1418424483:
                case 1625082160:
                    short s2 = f82105[0];
                    int i24 = s2 * 2128;
                    if (C0890.f81849 != 0) {
                        s = s2;
                        i13 = i24;
                        iM55979 = (C0946.m55979("֨֫") + i11) * (-11);
                        i = ((iM55979 ^ i10) * (-14079)) ^ 1288301226;
                        i4 = 32502857;
                        i8 = iM55979 ^ i4;
                        i14 = i8;
                        i12 = i;
                    } else {
                        int iM559712 = C0946.m55979("ۙۢ") ^ i10;
                        i12 = ((iM559712 ^ i11) * 23791) ^ (-1380310778);
                        i14 = iM559712 ^ (-1577218851);
                        s = s2;
                        i13 = i24;
                    }
                    break;
                default:
                    c13259 = c13259M30305;
                    sArr = sArr2;
                    i2 = i21;
                    c13259M30304 = C13259.m30304(C1046.m56293(sArr, i2, 14, i15));
                    if (C1036.f81953 >= 0) {
                        iM55681 = C0873.m55680("ۖ᩶") ^ i10;
                        c132510 = c13259M30304;
                        i9 = ((iM55681 ^ i11) * 1693) ^ 483098286;
                        i3 = -1251668804;
                    } else {
                        iM55681 = C0873.m55680("ۡ۫") ^ i10;
                        c132510 = c13259M30304;
                        i9 = ((iM55681 ^ i11) * (-29097)) ^ (-1966949463);
                        i3 = 1276322964;
                    }
                    int i25 = iM55681;
                    i = i9;
                    iM55680 = i25;
                    i8 = iM55680 ^ i3;
                    i21 = i2;
                    c132511 = c132510;
                    sArr2 = sArr;
                    c13259M30305 = c13259;
                    i14 = i8;
                    i12 = i;
                    break;
            }
        }
    }
}
