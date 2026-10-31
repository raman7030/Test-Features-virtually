package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۨܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11847 implements InterfaceC13257, InterfaceC0486 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    public static C11847 f35353;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f35354;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f35355;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f35356;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f35357;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f35358;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f35359;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f35360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f35361;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0473 f35362;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f35363;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4791 f35364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f35365;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f35366;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f35367;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f35368;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f35351 = AbstractC14545.of((Object) 4300000L, (Object) 3200000L, (Object) 2400000L, (Object) 1700000L, (Object) 860000L);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f35352 = AbstractC14545.of((Object) 1500000L, (Object) 980000L, (Object) 750000L, (Object) 520000L, (Object) 290000L);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f35347 = AbstractC14545.of((Object) 2000000L, (Object) 1300000L, (Object) 1000000L, (Object) 860000L, (Object) 610000L);

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f35349 = AbstractC14545.of((Object) 2500000L, (Object) 1700000L, (Object) 1200000L, (Object) 970000L, (Object) 680000L);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f35348 = AbstractC14545.of((Object) 4700000L, (Object) 2800000L, (Object) 2100000L, (Object) 1700000L, (Object) 980000L);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final AbstractC14545 f35350 = AbstractC14545.of((Object) 2700000L, (Object) 2000000L, (Object) 1600000L, (Object) 1300000L, (Object) 1000000L);

    @Override // l.InterfaceC13257
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11847 mo28942() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0012  */
    /* JADX WARN: Code duplicated, block: B:15:0x0015 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0017 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0005, B:17:0x0017, B:20:0x001c, B:22:0x0039, B:24:0x0053, B:27:0x0065, B:31:0x0071, B:35:0x007f, B:34:0x0078, B:26:0x005c, B:36:0x0083), top: B:41:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x001b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:6:0x0005, B:17:0x0017, B:20:0x001c, B:22:0x0039, B:24:0x0053, B:27:0x0065, B:31:0x0071, B:35:0x007f, B:34:0x0078, B:26:0x005c, B:36:0x0083), top: B:41:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:6:0x0005, B:17:0x0017, B:20:0x001c, B:22:0x0039, B:24:0x0053, B:27:0x0065, B:31:0x0071, B:35:0x007f, B:34:0x0078, B:26:0x005c, B:36:0x0083), top: B:41:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:6:0x0005, B:17:0x0017, B:20:0x001c, B:22:0x0039, B:24:0x0053, B:27:0x0065, B:31:0x0071, B:35:0x007f, B:34:0x0078, B:26:0x005c, B:36:0x0083), top: B:41:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x0015, please report this as an issue */
    @Override // l.InterfaceC0486
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo2146(C3104 c3104, boolean z) {
        boolean z2;
        long jMo33834;
        int i;
        long j;
        long j2;
        long j3;
        if (!z) {
            z2 = false;
            if (z2) {
                C22632.m50634(this.f35355 > 0);
                jMo33834 = this.f35360.mo33834();
                i = (int) (jMo33834 - this.f35358);
                this.f35366 += (long) i;
                long j4 = this.f35356;
                j = this.f35359;
                this.f35356 = j4 + j;
                if (i > 0) {
                    this.f35362.m2077((j * 8000.0f) / i, (int) Math.sqrt(j));
                    if (this.f35366 < 2000) {
                        this.f35354 = (long) this.f35362.m2076();
                    } else {
                        this.f35354 = (long) this.f35362.m2076();
                    }
                    j2 = this.f35359;
                    j3 = this.f35354;
                    if (i == 0) {
                        this.f35368 = j3;
                        this.f35364.m13974(j2, i, j3);
                    } else {
                        this.f35368 = j3;
                        this.f35364.m13974(j2, i, j3);
                    }
                    this.f35358 = jMo33834;
                    this.f35359 = 0L;
                }
                this.f35355--;
                return;
            }
            return;
        }
        if ((c3104.f9710 & 8) == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        C22632.m50634(this.f35355 > 0);
        jMo33834 = this.f35360.mo33834();
        i = (int) (jMo33834 - this.f35358);
        this.f35366 += (long) i;
        long j5 = this.f35356;
        j = this.f35359;
        this.f35356 = j5 + j;
        if (i > 0) {
            this.f35362.m2077((j * 8000.0f) / i, (int) Math.sqrt(j));
            if (this.f35366 < 2000 || this.f35356 >= 524288) {
                this.f35354 = (long) this.f35362.m2076();
            }
            j2 = this.f35359;
            j3 = this.f35354;
            if (i == 0 || j2 != 0 || j3 != this.f35368) {
                this.f35368 = j3;
                this.f35364.m13974(j2, i, j3);
            }
            this.f35358 = jMo33834;
            this.f35359 = 0L;
        }
        this.f35355--;
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    /* JADX WARN: Code duplicated, block: B:14:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015), top: B:21:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0013, please report this as an issue */
    @Override // l.InterfaceC0486
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo2147(C3104 c3104, boolean z, int i) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                this.f35359 += (long) i;
                return;
            }
            return;
        }
        if ((c3104.f9710 & 8) == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        this.f35359 += (long) i;
        return;
        throw th;
    }

    @Override // l.InterfaceC13257
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo28945() {
        return this.f35354;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    /* JADX WARN: Code duplicated, block: B:14:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015, B:18:0x0019, B:19:0x0021), top: B:24:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0019 A[Catch: all -> 0x000e, TryCatch #0 {, blocks: (B:5:0x0004, B:16:0x0015, B:18:0x0019, B:19:0x0021), top: B:24:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0013, please report this as an issue */
    @Override // l.InterfaceC0486
    /* JADX INFO: renamed from: ۧ */
    public final synchronized void mo2148(C3104 c3104, boolean z) {
        boolean z2;
        if (!z) {
            z2 = false;
            if (z2) {
                if (this.f35355 == 0) {
                    this.f35358 = this.f35360.mo33834();
                }
                this.f35355++;
                return;
            }
            return;
        }
        if ((c3104.f9710 & 8) == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if (this.f35355 == 0) {
            this.f35358 = this.f35360.mo33834();
        }
        this.f35355++;
        return;
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C11847 m28940(ContextWrapper contextWrapper) {
        if (f35353 == null) {
            f35353 = new C6202(contextWrapper).m17123();
        }
        return f35353;
    }

    @Override // l.InterfaceC13257
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28943(Handler handler, InterfaceC3380 interfaceC3380) {
        interfaceC3380.getClass();
        this.f35364.m13975(handler, interfaceC3380);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [l.ۤܿۧ] */
    public C11847(Context context, HashMap map, int i, C14185 c14185, boolean z) {
        this.f35363 = context == null ? null : context.getApplicationContext();
        this.f35361 = AbstractC9608.copyOf((Map) map);
        this.f35364 = new C4791();
        this.f35362 = new C0473(i);
        this.f35360 = c14185;
        this.f35367 = z;
        if (context != null) {
            C10659 c10659M26749 = C10659.m26749(context);
            int iM26753 = c10659M26749.m26753();
            this.f35357 = iM26753;
            this.f35354 = m28939(iM26753);
            c10659M26749.m26754((C10436) new InterfaceC11489() { // from class: l.ۤܿۧ
                @Override // l.InterfaceC11489
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final void mo26280(int i2) {
                    C11847.m28941(this.f31362, i2);
                }
            }, C10881.m27178());
            return;
        }
        this.f35357 = 0;
        this.f35354 = 1000000L;
    }

    @Override // l.InterfaceC13257
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28944(InterfaceC3380 interfaceC3380) {
        this.f35364.m13976(interfaceC3380);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0044 A[Catch: all -> 0x0096, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:11:0x000e, B:15:0x0014, B:21:0x0021, B:23:0x0025, B:25:0x002b, B:27:0x0035, B:29:0x003f, B:31:0x0050, B:30:0x0044, B:32:0x0052, B:34:0x0062, B:36:0x006b, B:40:0x0077, B:44:0x0085, B:43:0x007e), top: B:52:0x0002 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28941(C11847 c11847, int i) {
        String strM35802;
        TelephonyManager telephonyManager;
        synchronized (c11847) {
            int i2 = c11847.f35357;
            if (i2 == 0 || c11847.f35367) {
                if (i2 != i || c11847.f35365 == null) {
                    c11847.f35357 = i;
                    if (i != 1 && i != 0 && i != 8) {
                        if (c11847.f35365 == null) {
                            Context context = c11847.f35363;
                            String str = C3603.f11424;
                            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                strM35802 = C15107.m35802(Locale.getDefault().getCountry());
                            } else {
                                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                if (TextUtils.isEmpty(networkCountryIso)) {
                                    strM35802 = C15107.m35802(Locale.getDefault().getCountry());
                                } else {
                                    strM35802 = C15107.m35802(networkCountryIso);
                                }
                            }
                            c11847.f35365 = strM35802;
                        }
                        c11847.f35354 = c11847.m28939(i);
                        long jMo33834 = c11847.f35360.mo33834();
                        int i3 = c11847.f35355 > 0 ? (int) (jMo33834 - c11847.f35358) : 0;
                        long j = c11847.f35359;
                        long j2 = c11847.f35354;
                        if (i3 != 0 || j != 0 || j2 != c11847.f35368) {
                            c11847.f35368 = j2;
                            c11847.f35364.m13974(j, i3, j2);
                        }
                        c11847.f35358 = jMo33834;
                        c11847.f35359 = 0L;
                        c11847.f35356 = 0L;
                        c11847.f35366 = 0L;
                        c11847.f35362.m2078();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:1149:0x1224  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m28939(int i) {
        int[] iArr;
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i);
        AbstractC9608 abstractC9608 = this.f35361;
        Long lValueOf = (Long) abstractC9608.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = (Long) abstractC9608.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.f35365;
            if (str == null) {
                str = "";
            }
            byte b = -1;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        b = 0;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        b = 1;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        b = 2;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        b = 3;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        b = 4;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        b = 5;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        b = 6;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        b = 7;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        b = 8;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        b = 9;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        b = 10;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        b = 11;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        b = 12;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        b = cb.k;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        b = cb.f77931l;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        b = 15;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        b = 16;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        b = 17;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        b = 18;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        b = 19;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        b = 20;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        b = 21;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        b = 22;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        b = 23;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        b = 24;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        b = 25;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        b = 26;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        b = 27;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        b = 29;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        b = 30;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        b = bo.j;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        b = UTF8.S_CS3;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        b = PublicSuffixDatabase.EXCEPTION_MARKER;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        b = 34;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        b = 35;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        b = 36;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        b = 37;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        b = 38;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        b = 39;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        b = 40;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        b = 41;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        b = 42;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        b = 43;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        b = 44;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        b = 45;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        b = 46;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        b = 47;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        b = UTF8.S_P3A;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        b = 49;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        b = 50;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        b = 51;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        b = 52;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        b = 53;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        b = 54;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        b = 55;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        b = 56;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        b = 57;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        b = 58;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        b = 59;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        b = 60;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        b = Base32Encoder.DEFAULT_PADDING;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        b = 62;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        b = 63;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        b = 64;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        b = 65;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        b = 66;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        b = 67;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        b = 68;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        b = 69;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        b = 70;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        b = 71;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        b = 72;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        b = 73;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        b = 74;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        b = 75;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        b = 76;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        b = 77;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        b = 78;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        b = 79;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        b = UTF8.S_P4A;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        b = 81;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        b = 82;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        b = 83;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        b = 84;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        b = 85;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        b = 86;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        b = 87;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        b = 88;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        b = 89;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        b = 90;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        b = 91;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        b = 92;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        b = 93;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        b = 94;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        b = 95;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        b = UTF8.S_P4B;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        b = 97;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        b = 98;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        b = 99;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        b = 100;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        b = 101;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        b = 102;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        b = 103;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        b = 104;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        b = 105;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        b = 106;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        b = 107;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        b = 108;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        b = 109;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        b = KeyFactorySpi.x25519_type;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        b = KeyFactorySpi.x448_type;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        b = KeyFactorySpi.Ed25519_type;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        b = KeyFactorySpi.Ed448_type;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        b = 114;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        b = 115;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        b = 116;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        b = 117;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        b = 118;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        b = 119;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        b = 120;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        b = 121;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        b = 122;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        b = 123;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        b = 124;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        b = 125;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        b = 126;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        b = ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        b = GCMSIVBlockCipher.MASK;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        b = 129;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        b = bo.h;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        b = 131;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        b = 132;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        b = 133;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        b = 134;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        b = 135;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        b = 136;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        b = 137;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        b = 138;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        b = 139;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        b = 140;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        b = 141;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        b = 142;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        b = 143;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        b = 144;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        b = 145;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        b = 146;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        b = 147;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        b = 148;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        b = 149;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        b = 150;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        b = 151;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        b = 152;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        b = 153;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        b = 154;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        b = 155;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        b = 156;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        b = 157;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        b = 158;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        b = 159;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        b = 160;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        b = 161;
                    }
                    break;
                case 2503:
                    if (str.equals("NU")) {
                        b = 162;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        b = 163;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        b = 164;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        b = 165;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        b = 166;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        b = 167;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        b = 168;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        b = 169;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        b = 170;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        b = 171;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        b = 172;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        b = 173;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        b = 174;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        b = 175;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        b = 176;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        b = 177;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        b = 178;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        b = 179;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        b = 180;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        b = 181;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        b = 182;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        b = 183;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        b = 184;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        b = 185;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        b = 186;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        b = 187;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        b = PSSSigner.TRAILER_IMPLICIT;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        b = 189;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        b = 190;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        b = 191;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        b = 192;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        b = 193;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        b = 194;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        b = 195;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        b = 196;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        b = 197;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        b = 198;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        b = 199;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        b = 200;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        b = 201;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        b = 202;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        b = 203;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        b = 204;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        b = 205;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        b = 206;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        b = 207;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        b = 208;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        b = 209;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        b = 210;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        b = 211;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        b = 212;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        b = 213;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        b = 214;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        b = 215;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        b = 216;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        b = 217;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        b = 218;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        b = 219;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        b = 220;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        b = 221;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        b = 222;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        b = 223;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        b = bo.k;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        b = GCMSIVBlockCipher.ADD;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        b = 226;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        b = 227;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        b = 228;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        b = 229;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        b = 230;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        b = 231;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        b = 232;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        b = 233;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        b = 234;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        b = 235;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        b = 236;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        b = 237;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        b = 238;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 4:
                case 17:
                case 29:
                case 50:
                case 57:
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 116:
                case 202:
                case HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS /* 225 */:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case 41:
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case 8:
                case 63:
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case 9:
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case 10:
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case 61:
                case 93:
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case 12:
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case 13:
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case 51:
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                case 144:
                case 172:
                case 195:
                case BERTags.FLAGS /* 224 */:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 84:
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case EnumC17734.f54268 /* 154 */:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case 32:
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case 33:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case 34:
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case 35:
                case 42:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case 36:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case 37:
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case 38:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case 39:
                case 62:
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case 40:
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case 43:
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case 44:
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case 46:
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case 47:
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case 48:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case 49:
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case 52:
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case 53:
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case 56:
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case 123:
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case 60:
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case 64:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 65:
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 66:
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 67:
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 68:
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 69:
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 70:
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 71:
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 72:
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 73:
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 74:
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 75:
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 77:
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 78:
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 79:
                case 97:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 80:
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 81:
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 82:
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 85:
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case HRSS1373Polynomial.K /* 86 */:
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 88:
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 89:
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 90:
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case 91:
                case 115:
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case 95:
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case 96:
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 98:
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case q.f /* 99 */:
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 100:
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 101:
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 108:
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 109:
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 114:
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 118:
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 119:
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 122:
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case 124:
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case q.h /* 125 */:
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case 126:
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case Primes.SMALL_FACTOR_LIMIT /* 211 */:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case 185:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION /* 217 */:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i == 2) {
                jLongValue = ((Long) f35351.get(iArr[0])).longValue();
            } else if (i == 3) {
                jLongValue = ((Long) f35352.get(iArr[1])).longValue();
            } else if (i == 4) {
                jLongValue = ((Long) f35347.get(iArr[2])).longValue();
            } else if (i == 5) {
                jLongValue = ((Long) f35349.get(iArr[3])).longValue();
            } else if (i == 7) {
                jLongValue = ((Long) f35351.get(iArr[0])).longValue();
            } else if (i != 9) {
                jLongValue = i != 10 ? 1000000L : ((Long) f35348.get(iArr[4])).longValue();
            } else {
                jLongValue = ((Long) f35350.get(iArr[5])).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }
}
