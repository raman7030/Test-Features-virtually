package l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.textfield.IndicatorViewController;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: renamed from: l.ۢ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9RW */
/* JADX INFO: loaded from: classes3.dex */
public final class C9445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C12164 f28636;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C12164 f28637;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C12164 f28638;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C12164 f28639;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C12164 f28640;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12164 f28641;

    /* JADX INFO: renamed from: ᩹۬᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f28642 = {5732, -2925, -2907, -2908, -2912, -2882, -2901, -2885, -2887, -2884, -2903, -2894, -2924, -2900, -2844, -2842, -2924, -2843, -2840, -2923, -2845, -2841, -2925, -2903, -2843, -2894, -2924, -2900, -2841, -2923, -2845, -2835, -2848, -2924, -2900, -2845, -2924, -2836, -2847, -2825, -2925, -2900, -2885, -2898, -2923, -2925, -2924, -2885, -2841, -2844, -2923, -2846, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2848, -2921, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2847, -2845, -2936, -2825, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2848, -2924, -2842, -2925, -2903, -2843, -2894, -2935, -2843, -2926, -2824, -2843, -2831, -2923, -2845, -2847, -2846, -2924, -2842, -2848, -2901, -2905, -2907, -2892, -2901, -2906, -2892, -2906, -2899, -2884, -2892, -2905, -2886, -2897, -2847, -2901, -2883, -2902, -2911, -2901, -2843, -2902, -2899, -2894, -2911, -2899, -2886, -2924, -2848, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2844, -2840, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2844, -2840, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2844, -2840, -2924, -2900, -2845, -2848, -2924, -2842, -2924, -2900, -2845, -2847, -2825, -2924, -2847, 5257, -28121, -28101, -28101, -28097, -28043, -28064, -28064, -28121, -28101, -28101, -28097, -28100, -28043, -28064, -28064, -28119, -28101, -28097, -28043, -28064, -28064, -28114, -28127, -28117, -28099, -28128, -28122, -28117, -28063, -28140, -28063, -28114, -28062, -28107, -28053, -28142, -28060, -28116, -28128, -28126, -28063, -28097, -28114, -28101, -28121, -28057, -28058, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28049, -28101, -28118, -28105, -28101, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28062, -28126, -28118, -28117, -28122, -28102, -28126, -28100, -28114, -28127, -28100, -28062, -28100, -28118, -28099, -28122, -28119, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28062, -28101, -28118, -28105, -28101, -28062, -28126, -28118, -28117, -28122, -28102, -28126, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28043, -28038, -28033, -28033, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28100, -28114, -28127, -28100, -28062, -28100, -28118, -28099, -28122, -28119, -28062, -28126, -28118, -28117, -28122, -28102, -28126, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28049, -28101, -28118, -28105, -28101, -28043, -28038, -28033, -28033, -28120, -28128, -28128, -28120, -28125, -28118, -28062, -28100, -28114, -28127, -28100, -28062, -28101, -28118, -28105, -28101, -28114, -28127, -28117, -28099, -28128, -28122, -28117, -28105, -28063, -28100, -28101, -28114, -28099, -28101, -28102, -28097, -28100, -28114, -28127, -28100, -28062, -28100, -28118, -28099, -28122, -28119, -28062, -28125, -28122, -28120, -28121, -28101, -28120, -28128, -28128, -28120, -28125, -28118, -28049, -28100, -28114, -28127, -28100, -28049, -28117, -28122, -28100, -28097, -28125, -28114, -28106, -28049, -28033, -28034, -28035, -28036, -28037, -28038, -28039, -28040, -28041, -28042, -28113, -28111, -28050, -28145, -28052, -28053, -28054, -28143, -28055, -28059, -28057, -28058, -28144, -28060, -28062, -28046, -28108, -28110, -28109, -28140, -28142, -28141, -28044, -28043, -28051, -28056, -28045, -28047, -28048, -28061, -28063, -28064, -28094, -28090, -28091};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C12164 f28643;

    /* JADX WARN: Code duplicated, block: B:118:0x0245 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:10:0x0025, B:13:0x002d, B:15:0x0044, B:17:0x0054, B:20:0x0065, B:22:0x0075, B:31:0x009a, B:33:0x00a5, B:36:0x00ad, B:39:0x00b2, B:41:0x00c2, B:43:0x00d1, B:45:0x00e6, B:48:0x00ee, B:51:0x00fc, B:55:0x0109, B:59:0x0116, B:63:0x0123, B:67:0x0130, B:69:0x0145, B:73:0x0152, B:74:0x0156, B:116:0x023f, B:118:0x0245, B:123:0x024f, B:125:0x0260, B:76:0x015b, B:79:0x016d, B:82:0x017f, B:85:0x0191, B:88:0x01a3, B:91:0x01b5, B:94:0x01c7, B:97:0x01d8, B:100:0x01e9, B:103:0x01fa, B:106:0x020b, B:109:0x021c, B:112:0x022d, B:27:0x0088), top: B:142:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0260 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #1 {all -> 0x0085, blocks: (B:10:0x0025, B:13:0x002d, B:15:0x0044, B:17:0x0054, B:20:0x0065, B:22:0x0075, B:31:0x009a, B:33:0x00a5, B:36:0x00ad, B:39:0x00b2, B:41:0x00c2, B:43:0x00d1, B:45:0x00e6, B:48:0x00ee, B:51:0x00fc, B:55:0x0109, B:59:0x0116, B:63:0x0123, B:67:0x0130, B:69:0x0145, B:73:0x0152, B:74:0x0156, B:116:0x023f, B:118:0x0245, B:123:0x024f, B:125:0x0260, B:76:0x015b, B:79:0x016d, B:82:0x017f, B:85:0x0191, B:88:0x01a3, B:91:0x01b5, B:94:0x01c7, B:97:0x01d8, B:100:0x01e9, B:103:0x01fa, B:106:0x020b, B:109:0x021c, B:112:0x022d, B:27:0x0088), top: B:142:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x026d A[LOOP:0: B:124:0x025e->B:129:0x026d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023b, code lost:
    
        if (l.C1294.m4369(r3, l.C3537.m10748(l.C9445.f28642, 243, 16, r1)) != false) goto L114;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized boolean m24273(String str) {
        String strM12578;
        int iM3007;
        int i;
        short s = f28642[195];
        int i2 = 53640 * s;
        int i3 = s + 13410;
        int i4 = (i3 * i3) - i2 < 0 ? 61835 : 37455;
        synchronized (C9445.class) {
            boolean z = false;
            if (str != null) {
                try {
                    if (!C1916.m6313(str)) {
                        String strM12570 = C4159.m12570(C1047.m3595(str));
                        if (!C7811.m20838(strM12570, C3245.m9934(f28642, 196, 7, i4)) && !C7811.m20838(strM12570, C1420.m4902(f28642, 203, 8, i4)) && !C4616.m13554(strM12570, C1916.m6311(f28642, Primes.SMALL_FACTOR_LIMIT, 6, i4))) {
                            if (C4616.m13554(strM12570, AbstractC2021.m6573(f28642, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 8, i4)) || C4616.m13554(strM12570, C0630.m2575(f28642, 233, 4, i4))) {
                                if (strM12570.matches(C3245.m9934(f28642, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 8, i4))) {
                                    return false;
                                }
                            }
                            C12164 c12164 = f28643;
                            c12164.m29615reset((CharSequence) strM12570);
                            if (c12164.matches() && C1711.m5741(strM12570) > 20) {
                                try {
                                    C14533.m34681(str);
                                    return false;
                                } catch (Exception unused) {
                                }
                            }
                            if (C7811.m20838(strM12570, C21923.m49334(f28642, 237, 5, i4)) && C3746.m11370(strM12570, C7811.m20837(f28642, 242, 1, i4))) {
                                C12164 c12165 = f28643;
                                c12165.m29615reset((CharSequence) C11340.m28015(strM12570, 5, C1711.m5741(strM12570) - 1));
                                if (c12165.matches() && C0798.m3007(strM12570) > 26) {
                                    try {
                                        C14533.m34681(C1005.m3509(str, 5, C1711.m5741(str) - 1));
                                        return false;
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                            C12164 c12166 = f28638;
                            c12166.m29615reset((CharSequence) strM12570);
                            if (c12166.matches()) {
                                return false;
                            }
                            C12164 c12167 = f28640;
                            c12167.m29615reset((CharSequence) strM12570);
                            if (c12167.matches()) {
                                return false;
                            }
                            C12164 c12168 = f28636;
                            c12168.m29615reset((CharSequence) strM12570);
                            if (c12168.matches()) {
                                return false;
                            }
                            C12164 c12169 = f28637;
                            c12169.m29615reset((CharSequence) str);
                            if (c12169.matches()) {
                                return false;
                            }
                            C12164 c121610 = f28639;
                            c121610.m29615reset((CharSequence) strM12570);
                            String strReplaceAll = c121610.replaceAll("");
                            if (C1711.m5741(strM12570) != C0798.m3007(strReplaceAll)) {
                                C12164 c121611 = f28641;
                                c121611.m29615reset((CharSequence) strReplaceAll);
                                if (c121611.matches()) {
                                    return false;
                                }
                            }
                            switch (C2105.m6981(strM12570)) {
                                case -1673287821:
                                    break;
                                case -1582112677:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, C1916.m6311(f28642, 259, 18, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1 && C0798.m3000(strM12570, 0) <= 127) {
                                        return false;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    for (i = 0; i < iM3007; i++) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -1536685117:
                                    if (C1294.m4369(strM12570, AbstractC2021.m6573(f28642, 277, 10, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -1180285201:
                                    if (C1294.m4369(strM12570, C2272.m7507(f28642, 287, 23, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -884548715:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, C2105.m6988(f28642, 310, 15, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -392933862:
                                    if (C1294.m4369(strM12570, C1294.m4373(f28642, 325, 11, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -380928089:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, C7106.m19110(f28642, 336, 11, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -264127297:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, C3683.m11225(f28642, 347, 17, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case -91758482:
                                    if (C1294.m4369(strM12570, C2958.m9031(f28642, 364, 20, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 79009683:
                                    if (C1294.m4369(strM12570, C2167.m7159(f28642, MLKEMEngine.KyberPolyBytes, 16, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 327283064:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, RunnableC0588.m2436(f28642, 400, 16, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 960509580:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, C4616.m13542(f28642, 416, 16, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                case 1562659004:
                                    if (ViewOnClickListenerC1958.m6437(strM12570, C2105.m6988(f28642, 432, 19, i4))) {
                                        return false;
                                    }
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
                                            z = true;
                                            return z;
                                        }
                                    }
                                    return z;
                                default:
                                    if (C0798.m3007(strM12570) != 1) {
                                        break;
                                    }
                                    strM12578 = C4159.m12578(f28642, 451, 46, i4);
                                    iM3007 = C0798.m3007(strM12570);
                                    while (i < iM3007) {
                                        if (C2958.m9036(strM12578, C0798.m3000(strM12570, i)) == -1) {
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
    
        if (l.C0422.f1886 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015a, code lost:
    
        if (l.C3432.f10845 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0311, code lost:
    
        if (l.C7811.f24123 >= 0) goto L68;
     */
    static {
        C11459 c11459;
        int iM2566;
        int i;
        short[] sArr;
        C11459 c114510;
        int i2;
        int i3;
        int iM6981;
        int i4;
        int iM6982;
        int i5;
        int i6;
        int i7;
        C11459 c11459M28260;
        int i8;
        int iM2567;
        int i9;
        int i10 = C7811.f24123;
        int i11 = C0630.f2410;
        int iM2568 = (i10 - C0630.m2566("ۙ᩶")) * 55;
        int i12 = ((iM2568 ^ i11) * (-5247)) ^ (-794971789);
        int i13 = 0;
        short s = 0;
        String strM3502 = null;
        C11459 c114511 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i14 = iM2568 ^ 1846306565;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -70417405;
        int i21 = 0;
        C11459 c11459M28261 = null;
        short[] sArr6 = null;
        int i22 = 0;
        C12164 c12164Matcher = null;
        String str = null;
        while (true) {
            i20 = i14 ^ (i12 & (((i20 ^ i11) * (-24659)) >> 31));
            switch (i20) {
                case -2033943783:
                case -1277661615:
                    c11459 = c11459M28261;
                    C1047.m3599();
                    break;
                case -1972676945:
                case 1339114263:
                    c11459 = c11459M28261;
                    f28640 = C11459.m28260(C0630.m2575(sArr6, i16, 49, i15)).matcher((CharSequence) str);
                    sArr5 = f28642;
                    if (!C0382.m1848()) {
                        iM2566 = C0630.m2566("ܰ֡") ^ i10;
                        i = ((iM2566 ^ i11) * 7977) ^ 2013647185;
                        sArr = sArr2;
                        c114510 = c114511;
                        i2 = i21;
                        i3 = -113944862;
                        i8 = iM2566 ^ i3;
                        i21 = i2;
                        c114511 = c114510;
                        sArr2 = sArr;
                        c11459M28261 = c11459;
                        i14 = i8;
                        i12 = i;
                    }
                    i7 = i21;
                    iM6982 = (C2105.m6981("ᩴ᩵") ^ i11) * 97;
                    i5 = ((iM6982 ^ i10) * (-9507)) ^ (-177752600);
                    i21 = i7;
                    i6 = -305651146;
                    i8 = iM6982 ^ i6;
                    i = i5;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1846936012:
                case -1534252707:
                    C3663.m11168();
                    C7811.m20844();
                    throw new RuntimeException();
                case -1823888623:
                case 547972388:
                    c11459 = c11459M28261;
                    f28641 = C11459.m28260(C0798.m3005(sArr3, i17, i18, i15)).matcher((CharSequence) str);
                    sArr4 = f28642;
                    i19 = 52;
                    i22 = 28;
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = (C0630.m2566("ۙ᩹") ^ i10) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i11) * 29553) ^ (-609491374);
                        sArr = sArr2;
                        c114510 = c114511;
                        i2 = i21;
                        i3 = -611103753;
                    } else {
                        iM2566 = C2105.m6981("᩸᩵") ^ i10;
                        i = ((iM2566 ^ i11) * 20677) ^ (-2138796148);
                        sArr = sArr2;
                        c114510 = c114511;
                        i2 = i21;
                        i3 = 3807681;
                    }
                    i8 = iM2566 ^ i3;
                    i21 = i2;
                    c114511 = c114510;
                    sArr2 = sArr;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1494189447:
                case 1550959537:
                    i15 = 62664;
                    iM6981 = (i10 - C0630.m2566("ۚۤ")) * (-45);
                    i = 506448523 ^ ((iM6981 ^ i11) * (-20961));
                    c11459M28261 = c11459M28261;
                    i4 = 2100684067;
                    i8 = iM6981 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1487848388:
                case 1808483868:
                    f28643 = c12164Matcher;
                    c11459M28261 = C11459.m28260(C2958.m9031(f28642, 21, 10, i15));
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("֨֫") + i11) * (-11);
                        i = ((iM6981 ^ i10) * (-14079)) ^ 1288301226;
                        i4 = 32502857;
                    } else {
                        iM6981 = C2105.m6981("᩻ۗ") ^ i10;
                        i = ((iM6981 ^ i11) * (-11991)) ^ (-1672665020);
                        i4 = 1383098657;
                    }
                    i8 = iM6981 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1312189829:
                case 723937307:
                    c11459 = c11459M28261;
                    f28636 = C11459.m28260(C1916.m6311(sArr4, i19, i22, i15)).matcher((CharSequence) str);
                    sArr6 = f28642;
                    i16 = 80;
                    if (!C2167.m7155()) {
                        iM2566 = C2105.m6981("ۗ֡") ^ i11;
                        i = ((iM2566 ^ i10) * 16685) ^ 502486455;
                        sArr = sArr2;
                        c114510 = c114511;
                        i2 = i21;
                        i3 = -790929341;
                        i8 = iM2566 ^ i3;
                        i21 = i2;
                        c114511 = c114510;
                        sArr2 = sArr;
                        c11459M28261 = c11459;
                        i14 = i8;
                        i12 = i;
                    }
                    iM6982 = C0630.m2566("ۛܶ") ^ i11;
                    i5 = ((iM6982 ^ i10) * (-18791)) ^ (-426482877);
                    i6 = -883307831;
                    i8 = iM6982 ^ i6;
                    i = i5;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case -1231013515:
                case 1220900820:
                    f28637 = C11459.m28260(C0422.m1955(sArr5, 129, 66, i15)).matcher((CharSequence) str);
                    return;
                case -1041369176:
                case 1498512379:
                    c11459 = c11459M28261;
                    str = "";
                    c12164Matcher = C11459.m28260(strM3502).matcher((CharSequence) "");
                    if (RunnableC1108.f4040) {
                        iM6982 = C2105.m6981("ۤܺ") ^ i10;
                        i5 = ((iM6982 ^ i11) * (-2693)) ^ (-251582867);
                        i6 = -633643123;
                    } else {
                        iM6982 = C0630.m2566("ۛܶ") ^ i11;
                        i5 = ((iM6982 ^ i10) * (-18791)) ^ (-426482877);
                        i6 = -883307831;
                    }
                    i8 = iM6982 ^ i6;
                    i = i5;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case -974767196:
                case 2145043824:
                    c11459 = c11459M28261;
                    strM3502 = C1005.m3502(f28642, 1, 20, i15);
                    if (!C1504.f5354) {
                        iM6981 = C0630.m2566("֡᩵") ^ i11;
                        i = (-668427066) ^ ((iM6981 ^ i10) * 13089);
                        c11459M28261 = c11459;
                        i4 = 65100873;
                        i8 = iM6981 ^ i4;
                        i14 = i8;
                        i12 = i;
                    }
                    i7 = i21;
                    iM6982 = (C2105.m6981("ᩴ᩵") ^ i11) * 97;
                    i5 = ((iM6982 ^ i10) * (-9507)) ^ (-177752600);
                    i21 = i7;
                    i6 = -305651146;
                    i8 = iM6982 ^ i6;
                    i = i5;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case -811194925:
                case 1278396582:
                    C2126.m7040();
                    c11459 = c11459M28261;
                    iM6982 = C0630.m2566("ۛܶ") ^ i11;
                    i5 = ((iM6982 ^ i10) * (-18791)) ^ (-426482877);
                    i6 = -883307831;
                    i8 = iM6982 ^ i6;
                    i = i5;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case -754127800:
                case 76883867:
                    break;
                case -477915174:
                case 582130651:
                    f28638 = c11459M28261.matcher((CharSequence) str);
                    sArr2 = f28642;
                    if (C22628.m50615() != 0) {
                        i7 = 31;
                        c11459 = c11459M28261;
                        iM6982 = (C2105.m6981("ᩴ᩵") ^ i11) * 97;
                        i5 = ((iM6982 ^ i10) * (-9507)) ^ (-177752600);
                        i21 = i7;
                        i6 = -305651146;
                        i8 = iM6982 ^ i6;
                        i = i5;
                        c11459M28261 = c11459;
                        i14 = i8;
                    } else {
                        int iM6983 = C2105.m6981("ܳ۫") ^ i11;
                        i = ((iM6983 ^ i10) * (-7831)) ^ 699711678;
                        i14 = iM6983 ^ (-1624834672);
                        i21 = 31;
                    }
                    i12 = i;
                    break;
                case -353475946:
                case -60646957:
                    i15 = 10309;
                    iM6981 = (i10 - C0630.m2566("ۚۤ")) * (-45);
                    i = 506448523 ^ ((iM6981 ^ i11) * (-20961));
                    c11459M28261 = c11459M28261;
                    i4 = 2100684067;
                    i8 = iM6981 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case -35439111:
                case 1918174413:
                    f28639 = c114511.matcher((CharSequence) str);
                    sArr3 = f28642;
                    i17 = 45;
                    i18 = 7;
                    if (C0050.m940() <= 0) {
                        c11459 = c11459M28261;
                        c11459M28260 = c114511;
                        sArr = sArr2;
                        i2 = i21;
                        iM2567 = C0630.m2566("ۖ᩶") ^ i10;
                        c114510 = c11459M28260;
                        i9 = ((iM2567 ^ i11) * 1693) ^ 483098286;
                        i3 = -1251668804;
                        int i23 = iM2567;
                        i = i9;
                        iM2566 = i23;
                    } else {
                        iM2566 = C2105.m6981("۟ܶ") ^ i11;
                        i = ((iM2566 ^ i10) * 20699) ^ 1046695431;
                        c11459 = c11459M28261;
                        sArr = sArr2;
                        c114510 = c114511;
                        i2 = i21;
                        i3 = -906389408;
                    }
                    i8 = iM2566 ^ i3;
                    i21 = i2;
                    c114511 = c114510;
                    sArr2 = sArr;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
                case 269324979:
                case 1174157293:
                    if (((s * s) + 1132096) - i13 >= 0) {
                        iM6981 = C2105.m6981("᩸᩹") ^ i11;
                        i = ((iM6981 ^ i10) * 14873) ^ (-990419768);
                        i4 = -62662082;
                    } else {
                        iM6981 = C0630.m2566("ܽ᩸") ^ i11;
                        i = ((iM6981 ^ i10) * 441) ^ 1412119759;
                        i4 = -1496150962;
                    }
                    i8 = iM6981 ^ i4;
                    i14 = i8;
                    i12 = i;
                    break;
                case 464651412:
                case 575861156:
                    RunnableC3474.m10630();
                    c11459 = c11459M28261;
                    break;
                case 1418424483:
                case 1625082160:
                    short s2 = f28642[0];
                    int i24 = s2 * 2128;
                    if (C0964.f3626 != 0) {
                        s = s2;
                        i13 = i24;
                        iM6981 = (C2105.m6981("֨֫") + i11) * (-11);
                        i = ((iM6981 ^ i10) * (-14079)) ^ 1288301226;
                        i4 = 32502857;
                        i8 = iM6981 ^ i4;
                        i14 = i8;
                        i12 = i;
                    } else {
                        int iM6984 = C2105.m6981("ۙۢ") ^ i10;
                        i12 = ((iM6984 ^ i11) * 23791) ^ (-1380310778);
                        i14 = iM6984 ^ (-1577218851);
                        s = s2;
                        i13 = i24;
                    }
                    break;
                default:
                    c11459 = c11459M28261;
                    sArr = sArr2;
                    i2 = i21;
                    c11459M28260 = C11459.m28260(C4117.m12355(sArr, i2, 14, i15));
                    if (C3911.f12484 >= 0) {
                        iM2567 = C0630.m2566("ۖ᩶") ^ i10;
                        c114510 = c11459M28260;
                        i9 = ((iM2567 ^ i11) * 1693) ^ 483098286;
                        i3 = -1251668804;
                    } else {
                        iM2567 = C0630.m2566("ۡ۫") ^ i10;
                        c114510 = c11459M28260;
                        i9 = ((iM2567 ^ i11) * (-29097)) ^ (-1966949463);
                        i3 = 1276322964;
                    }
                    int i25 = iM2567;
                    i = i9;
                    iM2566 = i25;
                    i8 = iM2566 ^ i3;
                    i21 = i2;
                    c114511 = c114510;
                    sArr2 = sArr;
                    c11459M28261 = c11459;
                    i14 = i8;
                    i12 = i;
                    break;
            }
        }
    }
}
