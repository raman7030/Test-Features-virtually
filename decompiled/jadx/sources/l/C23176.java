package l;

import android.text.TextUtils;
import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.g;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.prng.X931RNG;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩺ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes.dex */
public final class C23176 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f74471;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f74472;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final long f74473;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final long f74474;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f74477;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final long f74478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final long f74479;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f74480;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f74481 = new SecureRandom();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f74482;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12761 f74483;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f74484;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashMap f74485;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f74486;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f74487;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f74488;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f74489;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f74490;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23882 f74491;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f74492;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f74493;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f74476 = Pattern.compile("Android\\s+([0-9]+(?:\\.[0-9]+)*)", 2);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74475 = Pattern.compile("Android\\s+[0-9]+(?:\\.[0-9]+)*;\\s*([^)]*)", 2);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f74470 = Pattern.compile("(?:CPU(?: iPhone)? OS)\\s+([0-9_]+)", 2);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f74469 = Pattern.compile("\"([^\"]+)\"\\s*;\\s*v=\"?([^\"]*)\"?");

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f74478 = timeUnit.toMillis(1L);
        f74474 = TimeUnit.SECONDS.toMillis(30L);
        f74471 = timeUnit.toMillis(30L);
        f74477 = TimeUnit.HOURS.toMillis(2L);
        long millis = timeUnit.toMillis(5L);
        f74479 = millis;
        f74473 = millis * 2;
        f74472 = timeUnit.toMillis(10L);
    }

    public C23176(C12761 c12761, String str) {
        Object obj = new Object();
        this.f74490 = obj;
        this.f74482 = new HashMap();
        this.f74487 = new HashMap();
        this.f74485 = new HashMap();
        this.f74486 = new HashMap();
        this.f74480 = new HashMap();
        this.f74489 = str == null ? "" : str;
        this.f74483 = c12761;
        this.f74491 = new C23882(C4925.m14335());
        synchronized (obj) {
            if (!m51386()) {
                m51381(System.currentTimeMillis());
                m51369();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51394() {
        LinkedHashMap linkedHashMap;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            if (!m51386()) {
                m51362(jCurrentTimeMillis);
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("authRequired", Boolean.TRUE);
            linkedHashMap.put("pairingAvailable", Boolean.valueOf(m51386() || (this.f74493 != null && jCurrentTimeMillis < this.f74492)));
            long jMax = 0;
            if (!m51386()) {
                jMax = Math.max(this.f74492 - jCurrentTimeMillis, 0L);
            }
            linkedHashMap.put("pairingExpiresInMs", Long.valueOf(jMax));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10477 m51391(C15996 c15996, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM51384 = m51384(c15996);
        synchronized (this.f74490) {
            try {
                C10477 c10477M51361 = m51361(jCurrentTimeMillis, strM51384);
                if (c10477M51361 != null) {
                    return c10477M51361;
                }
                try {
                    C12593 c12593M51385 = m51385(str);
                    if (TextUtils.isEmpty(c12593M51385.f37981) || c12593M51385.f37984 == null) {
                        m51377(jCurrentTimeMillis, strM51384);
                        return C10477.m26368(R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f74490) {
                        try {
                            m51362(jCurrentTimeMillis);
                            if (!m51372(jCurrentTimeMillis, c12593M51385.f37981)) {
                                m51382(jCurrentTimeMillis, strM51384);
                                return C10477.m26367();
                            }
                            try {
                                C6243 c6243M51360 = m51360(c12593M51385.f37984);
                                synchronized (this.f74490) {
                                    try {
                                        m51362(jCurrentTimeMillis);
                                        if (!m51372(jCurrentTimeMillis, c12593M51385.f37981)) {
                                            m51382(jCurrentTimeMillis, strM51384);
                                            return C10477.m26367();
                                        }
                                        this.f74485.remove(strM51384);
                                        m51364(c6243M51360, m51357(c15996, c12593M51385), c12593M51385.f37983, jCurrentTimeMillis, c15996);
                                        if (!m51386()) {
                                            m51381(jCurrentTimeMillis);
                                            m51369();
                                        }
                                        return C10477.m26369(c6243M51360.f19321);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Exception unused) {
                                m51377(jCurrentTimeMillis, strM51384);
                                return C10477.m26368(R.string.MT_Protector, new Object[0]);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (C23344 unused2) {
                    m51377(jCurrentTimeMillis, strM51384);
                    return C10477.m26368(R.string.MT_Protector, new Object[0]);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10477 m51403(C15996 c15996) {
        C10477 c10477M51361;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            c10477M51361 = m51361(jCurrentTimeMillis, m51384(c15996));
        }
        return c10477M51361;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m51401(C15996 c15996) {
        m51377(System.currentTimeMillis(), m51384(c15996));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21766 m51399(C15996 c15996) {
        boolean zEquals;
        String strM40234 = C17140.m40234(c15996, "ticket");
        if (!TextUtils.isEmpty(strM40234)) {
            if (!EnumC4003.GET.equals(c15996.m37807()) && !EnumC4003.HEAD.equals(c15996.m37807())) {
                return C21766.m49091(EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
            }
            if (C17140.m40233(c15996)) {
                return C21766.m49091(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM40235 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
            String strM40236 = C17140.m40234(c15996, "disposition");
            synchronized (this.f74490) {
                m51376(jCurrentTimeMillis);
                C5378.removeIf(this.f74486.entrySet(), new C16120(jCurrentTimeMillis));
                C4832 c4832 = (C4832) this.f74486.get(strM40234);
                if (c4832 != null && c4832.f15267 > jCurrentTimeMillis) {
                    String str = c4832.f15268;
                    boolean zEquals2 = true;
                    if (str == null) {
                        zEquals = strM40235 == null;
                    } else {
                        zEquals = str.equals(strM40235);
                    }
                    if (zEquals) {
                        String str2 = c4832.f15266;
                        if (str2 != null) {
                            zEquals2 = str2.equals(strM40236);
                        } else if (strM40236 != null) {
                            zEquals2 = false;
                        }
                        if (zEquals2) {
                            C14709 c14709M51380 = m51380(c4832.f15265);
                            if (c14709M51380 != null) {
                                if (!c14709M51380.f44924) {
                                    m51363(c4832.f15265, jCurrentTimeMillis, c15996, false);
                                }
                                return C21766.m49092(new C15414(c4832.f15265, null, null));
                            }
                            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                    }
                    return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
        }
        return m51392(c15996);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21766 m51395(C15996 c15996) {
        String strM40234 = C17140.m40234(c15996, "ticket");
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return C21766.m49091(EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        if (C17140.m40233(c15996)) {
            return C21766.m49091(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        if (TextUtils.isEmpty(strM40234)) {
            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(jCurrentTimeMillis);
            C5378.removeIf(this.f74480.entrySet(), new C19650(jCurrentTimeMillis));
            C8360 c8360 = (C8360) this.f74480.get(strM40234);
            if (c8360 == null) {
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (c8360.f25666 <= jCurrentTimeMillis) {
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            C14709 c14709M51380 = m51380(c8360.f25665);
            if (c14709M51380 == null) {
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (!c14709M51380.f44924) {
                m51363(c8360.f25665, jCurrentTimeMillis, c15996, false);
            }
            return C21766.m49092(new C15414(c8360.f25665, strM40234, c8360.f25664));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51388(C15414 c15414) {
        C14709 c14709M51380;
        if (c15414 == null) {
            c14709M51380 = null;
        } else {
            String str = c15414.f47212;
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.f74490) {
                m51376(jCurrentTimeMillis);
                c14709M51380 = m51380(str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authenticated", Boolean.valueOf(c14709M51380 != null));
        if (c14709M51380 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("deviceId", c14709M51380.f44917);
            linkedHashMap2.put("deviceName", c14709M51380.f44919);
            linkedHashMap2.put("firstAccessAt", Long.valueOf(c14709M51380.f44921));
            linkedHashMap2.put("lastAccessAt", Long.valueOf(c14709M51380.f44923));
            linkedHashMap2.put("lastIp", c14709M51380.f44922);
            linkedHashMap2.put("userAgent", c14709M51380.f44918);
            linkedHashMap2.put("temporary", Boolean.valueOf(c14709M51380.f44924));
            linkedHashMap.put(e.p, linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m51387() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(jCurrentTimeMillis);
            arrayList = new ArrayList();
            Iterator it = this.f74491.m52620().iterator();
            while (it.hasNext()) {
                arrayList.add(C23882.m52617((C14709) it.next()));
            }
            Iterator it2 = this.f74482.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(C23882.m52617((C14709) it2.next()));
            }
            C23882.m52619(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51397(C15414 c15414, String str) {
        boolean zRemoveIf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(jCurrentTimeMillis);
            C23882 c23882 = this.f74491;
            ArrayList arrayListM52620 = c23882.m52620();
            zRemoveIf = C5378.removeIf(arrayListM52620, new C0598(str));
            if (zRemoveIf) {
                c23882.m52621(arrayListM52620);
            }
            if (c15414 != null && str.equals(c15414.f47212)) {
                zRemoveIf = this.f74482.remove(str) != null || zRemoveIf;
            }
            if (zRemoveIf) {
                m51378(str);
            }
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51393(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(jCurrentTimeMillis);
            C23882 c23882 = this.f74491;
            ArrayList arrayListM52620 = c23882.m52620();
            boolean zRemoveIf = C5378.removeIf(arrayListM52620, new C0598(str));
            if (zRemoveIf) {
                c23882.m52621(arrayListM52620);
            }
            z = this.f74482.remove(str) != null || zRemoveIf;
            if (z) {
                m51378(str);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C12593 m51385(String str) {
        String strM51367;
        String strM51368;
        String strM51369;
        JSONObject jSONObjectM17734 = C6411.m17734(str);
        C12593 c12593 = new C12593();
        c12593.f37981 = C6411.m17742(jSONObjectM17734, "code");
        c12593.f37982 = C6411.m17742(jSONObjectM17734, "deviceName");
        C20355 c20355 = null;
        Boolean booleanObject = null;
        c20355 = null;
        try {
            JSONObject jSONObject = jSONObjectM17734.getJSONObject("clientHints");
            if (jSONObject != null) {
                C20355 c20356 = new C20355();
                List list = Collections.EMPTY_LIST;
                c20356.f65721 = list;
                c20356.f65722 = list;
                try {
                    strM51367 = m51367(jSONObject.getString("platform"));
                } catch (RuntimeException unused) {
                    strM51367 = null;
                }
                c20356.f65725 = strM51367;
                try {
                    strM51368 = m51367(jSONObject.getString("platformVersion"));
                } catch (RuntimeException unused2) {
                    strM51368 = null;
                }
                c20356.f65723 = strM51368;
                try {
                    strM51369 = m51367(jSONObject.getString("model"));
                } catch (RuntimeException unused3) {
                    strM51369 = null;
                }
                c20356.f65726 = strM51369;
                try {
                    booleanObject = jSONObject.getBooleanObject("mobile");
                } catch (RuntimeException unused4) {
                }
                c20356.f65724 = booleanObject;
                c20356.f65721 = m51359(jSONObject, "brands");
                c20356.f65722 = m51359(jSONObject, "fullVersionList");
                c20355 = c20356;
            }
        } catch (RuntimeException unused5) {
        }
        c12593.f37980 = c20355;
        try {
            c12593.f37984 = jSONObjectM17734.getJSONObject("publicKey");
            c12593.f37983 = C6411.m17740(jSONObjectM17734, "trust");
            return c12593;
        } catch (RuntimeException e) {
            throw C6411.m17739(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51389(C15414 c15414, String str) {
        C3421 c3421;
        try {
            JSONObject jSONObjectM17734 = C6411.m17734(str);
            c3421 = new C3421();
            c3421.f10800 = C6411.m17742(jSONObjectM17734, MotionUtils.EASING_TYPE_PATH);
            c3421.f10799 = C6411.m17742(jSONObjectM17734, "disposition");
        } catch (C23344 unused) {
            c3421 = null;
        }
        if (c3421 == null || TextUtils.isEmpty(c3421.f10800) || !("inline".equals(c3421.f10799) || "attachment".equals(c3421.f10799))) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f74481.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C4832 c4832 = new C4832(0);
        c4832.f15265 = c15414.f47212;
        c4832.f15268 = c3421.f10800;
        c4832.f15266 = c3421.f10799;
        c4832.f15267 = f74472 + jCurrentTimeMillis;
        synchronized (this.f74490) {
            C5378.removeIf(this.f74486.entrySet(), new C16120(jCurrentTimeMillis));
            this.f74486.put(strEncodeToString, c4832);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c4832.f15267));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51390(C15414 c15414, C1304 c1304) {
        if (c15414 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f74481.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C8360 c8360 = new C8360(0);
        c8360.f25665 = c15414.f47212;
        c8360.f25664 = c1304;
        c8360.f25666 = f74472 + jCurrentTimeMillis;
        synchronized (this.f74490) {
            C5378.removeIf(this.f74480.entrySet(), new C19650(jCurrentTimeMillis));
            this.f74480.put(strEncodeToString, c8360);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c8360.f25666));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m51400() {
        synchronized (this.f74490) {
            ScheduledFuture scheduledFuture = this.f74484;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f74484 = null;
            }
            ScheduledExecutorService scheduledExecutorService = this.f74488;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f74488 = null;
            }
            this.f74486.clear();
            this.f74480.clear();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m51398() {
        synchronized (this.f74490) {
            if (m51386()) {
                return null;
            }
            m51362(System.currentTimeMillis());
            return this.f74493;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m51402() {
        synchronized (this.f74490) {
            if (m51386()) {
                return 0L;
            }
            m51362(System.currentTimeMillis());
            return this.f74492;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m51373() {
        return f74478;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21766 m51392(C15996 c15996) {
        String strM37804;
        boolean zVerify;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM40231 = C17140.m40231(c15996, "X-MT-Auth-Device");
        String strM40232 = C17140.m40231(c15996, "X-MT-Auth-Timestamp");
        String strM40233 = C17140.m40231(c15996, "X-MT-Auth-Nonce");
        String strM40234 = C17140.m40231(c15996, "X-MT-Auth-Content-SHA256");
        String strM40235 = C17140.m40231(c15996, "X-MT-Auth-Signature");
        boolean zEquals = false;
        if (TextUtils.isEmpty(strM40231) || TextUtils.isEmpty(strM40232) || TextUtils.isEmpty(strM40233) || TextUtils.isEmpty(strM40234) || TextUtils.isEmpty(strM40235)) {
            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        try {
            if (Math.abs(jCurrentTimeMillis - Long.parseLong(strM40232)) > f74479) {
                return C21766.m49090();
            }
            synchronized (this.f74490) {
                m51376(jCurrentTimeMillis);
                m51371(jCurrentTimeMillis);
                C14709 c14709M51380 = m51380(strM40231);
                if (c14709M51380 == null) {
                    return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                Map map = (Map) this.f74487.get(strM40231);
                if (map != null && map.containsKey(strM40233)) {
                    return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                StringBuilder sb = new StringBuilder("MT-REMOTE-AUTH-v1\n");
                sb.append(c15996.m37807().name());
                sb.append("\n");
                String strM37812 = c15996.m37812();
                if (TextUtils.isEmpty(strM37812)) {
                    strM37804 = c15996.m37804();
                } else {
                    strM37804 = c15996.m37804() + "?" + strM37812;
                }
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, strM37804, "\n", strM40232, "\n");
                String strM51498 = C23202.m51498(sb, strM40233, "\n", strM40234);
                try {
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(m51360(C6411.m17734(c14709M51380.f44920)).f19322);
                    signature.update(strM51498.getBytes(StandardCharsets.UTF_8));
                    zVerify = signature.verify(Base64.decode(strM40235, 11));
                } catch (Exception unused) {
                    zVerify = false;
                }
                if (!zVerify) {
                    return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                try {
                    if (!strM40234.equals(m51383(c15996))) {
                        return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f74490) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m51376(jCurrentTimeMillis2);
                        m51371(jCurrentTimeMillis2);
                        if (m51380(strM40231) == null) {
                            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        Map map2 = (Map) this.f74487.get(strM40231);
                        if (map2 != null && map2.containsKey(strM40233)) {
                            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        HashMap map3 = this.f74487;
                        Map map4 = (Map) map3.get(strM40231);
                        if (map4 == null) {
                            map4 = new HashMap();
                            map3.put(strM40231, map4);
                        }
                        map4.put(strM40233, Long.valueOf(jCurrentTimeMillis2));
                        if (EnumC4003.DELETE.equals(c15996.m37807()) && "/api/auth/devices".equals(c15996.m37804())) {
                            zEquals = strM40231.equals(C17140.m40234(c15996, "deviceId"));
                        }
                        if (!zEquals) {
                            m51363(strM40231, jCurrentTimeMillis2, c15996, true);
                        }
                        return C21766.m49092(new C15414(strM40231, null, null));
                    }
                } catch (C11888 e) {
                    return C21766.m49091(e.f35515, e.f35517, e.f35516);
                } catch (Exception unused2) {
                    return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
            }
        } catch (NumberFormatException unused3) {
            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51396(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(jCurrentTimeMillis);
            C5378.removeIf(this.f74480.entrySet(), new C19650(jCurrentTimeMillis));
            C8360 c8360 = (C8360) this.f74480.get(str);
            if (c8360 == null) {
                return false;
            }
            if (c8360.f25666 <= jCurrentTimeMillis) {
                return false;
            }
            return m51380(c8360.f25665) != null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if ("/api/file-upload-complete".equals(r0) == false) goto L56;
     */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m51383(C15996 c15996) throws C11888 {
        EnumC4003 enumC4003 = EnumC4003.POST;
        if (enumC4003.equals(c15996.m37807()) && "/api/file-upload-content".equals(c15996.m37804())) {
            String strM40234 = C17140.m40234(c15996, "taskId");
            String strM40235 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
            String strM40236 = C17140.m40234(c15996, "armToken");
            try {
                return "UPLOAD:v1:" + m51358((String.valueOf(strM40234) + "\n" + String.valueOf(strM40235) + "\n" + String.valueOf(strM40236) + "\n" + C17140.m40236(c15996)).getBytes(StandardCharsets.UTF_8));
            } catch (C10791 e) {
                throw new C11888(EnumC1180.BAD_REQUEST, e.f32453, e.f32452);
            }
        }
        if (!EnumC4003.PUT.equals(c15996.m37807()) || !"/api/text-file".equals(c15996.m37804())) {
            long jM51374 = m51374(c15996);
            if (jM51374 < 0) {
                if (!C17140.m40235(c15996)) {
                    if (C17140.m40237(c15996)) {
                        if (enumC4003.equals(c15996.m37807())) {
                            String strM37804 = c15996.m37804();
                            if (!"/api/file-rename".equals(strM37804)) {
                                if (!"/api/file-upload-prepare".equals(strM37804)) {
                                    if (!"/api/file-upload-begin".equals(strM37804)) {
                                    }
                                }
                            }
                        }
                    }
                }
                throw new C11888(EnumC1180.LENGTH_REQUIRED, R.string.MT_Protector, new Object[0]);
            }
            if (jM51374 <= X931RNG.BLOCK128_RESEED_MAX) {
                return jM51374 > 0 ? m51358(C17140.m40239(c15996).getBytes(StandardCharsets.UTF_8)) : m51358(new byte[0]);
            }
            throw new C11888(EnumC1180.PAYLOAD_TOO_LARGE, R.string.MT_Protector, new Object[0]);
        }
        long jM51375 = m51374(c15996);
        if (jM51375 < 0) {
            throw new C11888(EnumC1180.LENGTH_REQUIRED, R.string.MT_Protector, new Object[0]);
        }
        try {
            C17846 c17846M40232 = C17140.m40232(c15996, jM51375);
            String strM40237 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
            String strM40238 = C17140.m40234(c15996, "lineBreak");
            String strM40231 = C17140.m40231(c15996, "X-MT-Text-Parameters-Token");
            String strM40239 = C17140.m40234(c15996, "charsetIndex");
            String strEncodeToString = Base64.encodeToString(c17846M40232.f54517, 11);
            StringBuilder sb = new StringBuilder();
            if (strM40237 == null) {
                strM40237 = "";
            }
            sb.append(strM40237);
            sb.append("\n");
            if (strM40238 == null) {
                strM40238 = "";
            }
            sb.append(strM40238);
            sb.append("\n");
            if (strM40231 == null) {
                strM40231 = "";
            }
            sb.append(strM40231);
            sb.append("\n");
            if (strM40239 == null) {
                strM40239 = "";
            }
            sb.append(strM40239);
            sb.append("\n");
            sb.append(jM51375);
            return "TEXT_SAVE:v1:" + m51358(C9045.m23341(sb, "\n", strEncodeToString).getBytes(StandardCharsets.UTF_8));
        } catch (C16434 unused) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m51374(C15996 c15996) throws C11888 {
        if (!C17140.m40237(c15996)) {
            return 0L;
        }
        if (C17140.m40235(c15996)) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        String strM40231 = C17140.m40231(c15996, "content-length");
        if (TextUtils.isEmpty(strM40231)) {
            return -1L;
        }
        String strTrim = strM40231.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6243 m51360(JSONObject jSONObject) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidParameterSpecException {
        String strM51370 = m51370(jSONObject, "kty");
        String strM51371 = m51370(jSONObject, "crv");
        String strM51372 = m51370(jSONObject, "x");
        String strM51373 = m51370(jSONObject, "y");
        if (!"EC".equals(strM51370) || !"P-256".equals(strM51371) || strM51372.contains("=") || strM51373.contains("=")) {
            throw new IllegalArgumentException("unsupported key");
        }
        byte[] bArrDecode = Base64.decode(strM51372, 11);
        byte[] bArrDecode2 = Base64.decode(strM51373, 11);
        if (bArrDecode.length != 32 || bArrDecode2.length != 32) {
            throw new IllegalArgumentException("invalid coordinate length");
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrDecode), new BigInteger(1, bArrDecode2)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        if (!(publicKeyGeneratePublic instanceof ECPublicKey)) {
            throw new IllegalArgumentException("invalid key");
        }
        StringBuilder sbM10501 = C3435.m10501("{\"crv\":\"", strM51371, "\",\"kty\":\"", strM51370, "\",\"x\":\"");
        sbM10501.append(strM51372);
        sbM10501.append("\",\"y\":\"");
        sbM10501.append(strM51373);
        sbM10501.append("\"}");
        String string = sbM10501.toString();
        return new C6243(string, m51358(string.getBytes(StandardCharsets.UTF_8)), (ECPublicKey) publicKeyGeneratePublic);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51370(JSONObject jSONObject, String str) {
        String strM17742 = jSONObject == null ? null : C6411.m17742(jSONObject, str);
        if (TextUtils.isEmpty(strM17742)) {
            throw new IllegalArgumentException("missing ".concat(str));
        }
        return strM17742;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51364(final C6243 c6243, String str, boolean z, long j, C15996 c15996) {
        C14709 c14709;
        long j2;
        String str2 = c6243.f19321;
        C23882 c23882 = this.f74491;
        ArrayList arrayListM52620 = c23882.m52620();
        Iterator it = arrayListM52620.iterator();
        do {
            if (!it.hasNext()) {
                c14709 = null;
                break;
            }
            c14709 = (C14709) it.next();
        } while (!str2.equals(c14709.f44917));
        C5378.removeIf(arrayListM52620, new Predicate() { // from class: l.ۡᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c6243.f19321.equals(((C14709) obj).f44917);
            }
        });
        HashMap map = this.f74482;
        map.remove(str2);
        C14709 c147010 = c14709 == null ? new C14709() : c14709;
        c147010.f44917 = str2;
        c147010.f44919 = str;
        c147010.f44920 = c6243.f19320;
        if (c14709 != null) {
            j2 = c14709.f44921;
            if (j2 <= 0) {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        c147010.f44921 = j2;
        c147010.f44923 = j;
        c147010.f44922 = m51384(c15996);
        c147010.f44918 = m51368(c15996);
        c147010.f44924 = !z;
        if (z) {
            arrayListM52620.add(c147010);
            C6083.sort(arrayListM52620, C8200.comparingLong(new C5538()));
            while (arrayListM52620.size() > 32) {
                arrayListM52620.remove(0);
            }
            c23882.m52621(arrayListM52620);
            return;
        }
        map.put(c147010.f44917, c147010);
        c23882.m52621(arrayListM52620);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51363(String str, long j, C15996 c15996, boolean z) {
        C14709 c14709 = (C14709) this.f74482.get(str);
        if (c14709 != null && z) {
            c14709.f44923 = j;
            c14709.f44922 = m51384(c15996);
            c14709.f44918 = m51368(c15996);
            return;
        }
        C23882 c23882 = this.f74491;
        ArrayList<C14709> arrayListM52620 = c23882.m52620();
        for (C14709 c147010 : arrayListM52620) {
            if (str.equals(c147010.f44917)) {
                c147010.f44923 = j;
                c147010.f44922 = m51384(c15996);
                c147010.f44918 = m51368(c15996);
                c23882.m52621(arrayListM52620);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51378(final String str) {
        this.f74487.remove(str);
        C5378.removeIf(this.f74486.entrySet(), new Predicate() { // from class: l.ۘᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C4832) ((Map.Entry) obj).getValue()).f15265);
            }
        });
        C5378.removeIf(this.f74480.entrySet(), new Predicate() { // from class: l.ᩴᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C8360) ((Map.Entry) obj).getValue()).f25665);
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C14709 m51380(String str) {
        for (C14709 c14709 : this.f74491.m52620()) {
            if (str.equals(c14709.f44917)) {
                return c14709;
            }
        }
        return (C14709) this.f74482.get(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51376(long j) {
        Iterator it = this.f74482.entrySet().iterator();
        while (it.hasNext()) {
            C14709 c14709 = (C14709) ((Map.Entry) it.next()).getValue();
            if (j - c14709.f44923 > f74471 || j - c14709.f44921 > f74477) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51371(final long j) {
        Iterator it = this.f74487.entrySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map.Entry) it.next()).getValue();
            C5378.removeIf(map.entrySet(), new Predicate() { // from class: l.ۖᩴۢ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C23176.m51366(j, (Map.Entry) obj);
                }
            });
            if (map.isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m51366(long j, Map.Entry entry) {
        return j - ((Long) entry.getValue()).longValue() > f74473;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51362(long j) {
        if (m51386()) {
            return;
        }
        if (this.f74493 == null || j >= this.f74492) {
            m51381(j);
            m51369();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m51372(long j, String str) {
        if (m51386()) {
            return this.f74489.equals(str);
        }
        String str2 = this.f74493;
        return str2 != null && j < this.f74492 && str2.equals(str);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m51386() {
        return !TextUtils.isEmpty(this.f74489);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51381(long j) {
        String str = String.format(Locale.ROOT, "%06d", Integer.valueOf(this.f74481.nextInt(BasicLabelFormatter.MILLION)));
        this.f74493 = str;
        long j2 = j + f74478;
        this.f74492 = j2;
        C12761 c12761 = this.f74483;
        if (c12761 != null) {
            C22639 c22639 = (C22639) c12761.f38355;
            ServiceC1618 serviceC1618 = (ServiceC1618) ((C7385) c12761.f38356).f22731;
            int i = ServiceC1618.f5686;
            C4925.m14315(new RunnableC7117(serviceC1618, c22639, str, j2));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m51369() {
        if (this.f74488 == null) {
            this.f74488 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC21061());
        }
        ScheduledFuture scheduledFuture = this.f74484;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f74484 = this.f74488.schedule(new Runnable() { // from class: l.ۢᩴۢ
            @Override // java.lang.Runnable
            public final void run() {
                C23176.m51365(this.f29557);
            }
        }, Math.max(this.f74492 - System.currentTimeMillis(), 1L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51365(C23176 c23176) {
        synchronized (c23176.f74490) {
            c23176.m51381(System.currentTimeMillis());
            c23176.m51369();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51377(long j, String str) {
        synchronized (this.f74490) {
            m51382(j, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51382(long j, String str) {
        HashMap map = this.f74485;
        C13298 c13298 = (C13298) map.get(str);
        if (c13298 != null) {
            long j2 = c13298.f39809;
            if (j2 > 0 && j >= j2) {
                c13298 = new C13298(0);
                map.put(str, c13298);
            }
        } else {
            c13298 = new C13298(0);
            map.put(str, c13298);
        }
        int i = c13298.f39810 + 1;
        c13298.f39810 = i;
        if (i >= 5) {
            c13298.f39809 = j + f74474;
            c13298.f39810 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10477 m51361(long j, String str) {
        C13298 c13298 = (C13298) this.f74485.get(str);
        if (c13298 == null || c13298.f39809 <= j) {
            return null;
        }
        m51382(j, str);
        return C10477.m26368(R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m51384(C15996 c15996) {
        String strM37805 = c15996.m37805();
        return TextUtils.isEmpty(strM37805) ? "" : strM37805;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m51368(C15996 c15996) {
        String strM40231 = C17140.m40231(c15996, "user-agent");
        if (strM40231 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(strM40231.length(), 1024));
        for (int i = 0; i < strM40231.length(); i++) {
            char cCharAt = strM40231.charAt(i);
            if (!Character.isISOControl(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strTrim = sb.toString().trim();
        return strTrim.length() > 1024 ? strTrim.substring(0, 1024) : strTrim;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x028b A[PHI: r5
      0x028b: PHI (r5v34 java.lang.String) = (r5v33 java.lang.String), (r5v33 java.lang.String), (r5v37 java.lang.String), (r5v33 java.lang.String) binds: [B:135:0x0233, B:145:0x0255, B:415:0x028b, B:143:0x024b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:193:0x0313  */
    /* JADX WARN: Code duplicated, block: B:197:0x031a  */
    /* JADX WARN: Code duplicated, block: B:281:0x0455  */
    /* JADX WARN: Code duplicated, block: B:306:0x04a5 A[PHI: r0 r2
      0x04a5: PHI (r0v20 java.lang.String[]) = 
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v18 java.lang.String[])
      (r0v25 java.lang.String[])
     binds: [B:236:0x03a8, B:239:0x03b6, B:241:0x03be, B:243:0x03c6, B:245:0x03ce, B:247:0x03d6, B:249:0x03de, B:251:0x03e6, B:253:0x03ee, B:255:0x03f6, B:257:0x03fe, B:259:0x0406, B:261:0x040e, B:263:0x0416, B:265:0x041e, B:412:0x04a5] A[DONT_GENERATE, DONT_INLINE]
      0x04a5: PHI (r2v5 int) = 
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v8 int)
     binds: [B:236:0x03a8, B:239:0x03b6, B:241:0x03be, B:243:0x03c6, B:245:0x03ce, B:247:0x03d6, B:249:0x03de, B:251:0x03e6, B:253:0x03ee, B:255:0x03f6, B:257:0x03fe, B:259:0x0406, B:261:0x040e, B:263:0x0416, B:265:0x041e, B:412:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:310:0x04b7 A[EDGE_INSN: B:310:0x04b7->B:311:0x04b8 BREAK  A[LOOP:1: B:231:0x0389->B:307:0x04a9]] */
    /* JADX WARN: Code duplicated, block: B:314:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:321:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:376:0x059d  */
    /* JADX WARN: Code duplicated, block: B:379:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51357(C15996 c15996, C12593 c12593) {
        String str;
        String strM51354;
        int i;
        String strM51355;
        boolean z;
        int i2;
        String str2;
        Boolean bool;
        String str3;
        String[] strArr;
        int i3;
        String str4;
        String str5;
        List list;
        String strM40231 = C17140.m40231(c15996, "user-agent");
        C20355 c20355 = c12593.f37980;
        String strM40232 = C17140.m40231(c15996, "sec-ch-ua");
        String strM51356 = m51355(c20355 == null ? null : c20355.f65722);
        if (TextUtils.isEmpty(strM51356)) {
            strM51356 = m51355(c20355 == null ? null : c20355.f65721);
        }
        if (TextUtils.isEmpty(strM51356)) {
            if (TextUtils.isEmpty(strM40232)) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = f74469.matcher(strM40232);
                while (matcher.find() && arrayList.size() < 8) {
                    String strM51367 = m51367(matcher.group(1));
                    m51367(matcher.group(2));
                    arrayList.add(new C22471(strM51367));
                }
                list = arrayList;
            }
            strM51356 = m51355(list);
        }
        if (TextUtils.isEmpty(strM51356)) {
            if (TextUtils.isEmpty(strM40231)) {
                strM51356 = null;
            } else if (strM40231.contains("SamsungBrowser/")) {
                strM51356 = "Samsung Internet";
            } else if (strM40231.contains("Edg/") || strM40231.contains("EdgA/") || strM40231.contains("EdgiOS/")) {
                strM51356 = "Edge";
            } else if (strM40231.contains("OPR/") || strM40231.contains("Opera/")) {
                strM51356 = "Opera";
            } else if (strM40231.contains("FxiOS/") || strM40231.contains("Firefox/")) {
                strM51356 = "Firefox";
            } else if (strM40231.contains("CriOS/") || strM40231.contains("Chrome/")) {
                strM51356 = "Chrome";
            } else if (strM40231.contains("Safari/") && strM40231.contains("Version/")) {
                strM51356 = "Safari";
            } else {
                strM51356 = null;
            }
        }
        String strM40233 = C17140.m40231(c15996, "sec-ch-ua-platform");
        String str6 = c20355 == null ? null : c20355.f65725;
        String strM51368 = m51367(strM40233);
        if (strM51368.length() >= 2 && strM51368.startsWith("\"") && strM51368.endsWith("\"")) {
            strM51368 = C15472.m36561(1, 1, strM51368);
        }
        String strM51369 = m51367(str6);
        if (TextUtils.isEmpty(strM51369)) {
            strM51369 = m51367(strM51368);
        }
        String str7 = c20355 == null ? null : c20355.f65723;
        String strM513610 = m51367(strM51369);
        if (TextUtils.isEmpty(strM513610)) {
            strM51354 = null;
            str = strM51356;
        } else {
            String lowerCase = strM513610.toLowerCase(Locale.ROOT);
            str = strM51356;
            if (lowerCase.contains("android")) {
                strM51354 = m51354(AnalyticsConstants.SDK_TYPE, m51375(str7));
            } else if (lowerCase.contains("ios")) {
                strM51354 = m51354("iOS", m51375(str7));
            } else if (lowerCase.contains(g.a)) {
                strM51354 = m51354("macOS", m51375(str7));
            } else if (lowerCase.contains("windows")) {
                String strM513611 = m51367(str7);
                int i4 = 0;
                while (i4 < strM513611.length() && Character.isDigit(strM513611.charAt(i4))) {
                    i4++;
                }
                if (i4 == 0) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(strM513611.substring(0, i4));
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                }
                if (i >= 13) {
                    strM51354 = "Windows 11";
                } else {
                    strM51354 = i > 0 ? "Windows 10" : null;
                }
                if (TextUtils.isEmpty(strM51354)) {
                    strM51354 = "Windows";
                }
            } else {
                strM51354 = lowerCase.contains("chrome os") ? m51354("ChromeOS", m51375(str7)) : m51354(strM513610, m51375(str7));
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(strM51354);
        String str8 = strM51354;
        Pattern pattern = f74475;
        String str9 = "iPhone";
        String strM50967 = "";
        if (!zIsEmpty) {
            strM51355 = str8;
        } else if (TextUtils.isEmpty(strM40231)) {
            strM51355 = null;
        } else if (strM40231.contains("iPhone") || strM40231.contains("iPad")) {
            String str10 = strM40231.contains("iPad") ? "iPadOS" : "iOS";
            String strM51375 = m51375(m51356(f74470, strM40231));
            if (strM51375.startsWith("18.6")) {
                int iIndexOf = strM40231.indexOf("Version/");
                if (iIndexOf < 0) {
                    i2 = -1;
                } else {
                    int i5 = iIndexOf + 8;
                    int i6 = i5;
                    while (i6 < strM40231.length() && Character.isDigit(strM40231.charAt(i6))) {
                        i6++;
                    }
                    if (i6 == i5) {
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(strM40231.substring(i5, i6));
                        } catch (NumberFormatException unused2) {
                            i2 = -1;
                        }
                    }
                }
                if (i2 >= 26) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                strM51375 = "";
            }
            strM51355 = m51354(str10, strM51375);
        } else {
            String strM51357 = m51356(f74476, strM40231);
            if (!TextUtils.isEmpty(strM51357)) {
                String strM51376 = m51375(strM51357);
                if (!"10".equals(strM51376) || (!strM40231.contains("Chrome/") && !strM40231.contains("EdgA/") && !strM40231.contains("OPR/") && !strM40231.contains("SamsungBrowser/"))) {
                    str2 = strM51376;
                    break;
                }
                String strM51358 = m51356(pattern, strM40231);
                if (!TextUtils.isEmpty(strM51358)) {
                    String[] strArrSplit = strM51358.split(l.b);
                    int length = strArrSplit.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            str2 = strM51376;
                            break;
                        }
                        String strM513612 = m51367(strArrSplit[i7]);
                        int iIndexOf2 = strM513612.indexOf(" Build/");
                        String str11 = strM51376;
                        if (iIndexOf2 >= 0) {
                            strM513612 = strM513612.substring(0, iIndexOf2);
                        }
                        if ("k".equals(m51367(strM513612).toLowerCase(Locale.ROOT))) {
                            str2 = "";
                            break;
                        }
                        i7++;
                        strM51376 = str11;
                    }
                } else {
                    str2 = strM51376;
                    break;
                }
                strM51355 = m51354(AnalyticsConstants.SDK_TYPE, str2);
            } else if (strM40231.contains("Mac OS X") || strM40231.contains("Macintosh")) {
                strM51355 = "macOS";
            } else if (strM40231.contains("Windows NT")) {
                strM51355 = "Windows";
            } else if (strM40231.contains("CrOS")) {
                strM51355 = "ChromeOS";
            } else {
                strM51355 = "Linux";
                if (!strM40231.contains("Linux")) {
                    strM51355 = null;
                }
            }
        }
        String strM40234 = C17140.m40231(c15996, "sec-ch-ua-mobile");
        if (c20355 == null || (bool = c20355.f65724) == null) {
            String strM513613 = m51367(strM40234);
            if ("?1".equals(strM513613)) {
                bool = Boolean.TRUE;
            } else {
                bool = "?0".equals(strM513613) ? Boolean.FALSE : null;
            }
        }
        String strM513614 = m51367(c20355 == null ? null : c20355.f65726);
        if (!TextUtils.isEmpty(strM513614)) {
            str9 = strM513614;
        } else if (TextUtils.isEmpty(strM40231)) {
            if (Boolean.TRUE.equals(bool) || TextUtils.isEmpty(strM51355) || !strM51355.startsWith("iOS")) {
                str9 = null;
            }
        } else if (strM40231.contains("iPad")) {
            str9 = "iPad";
        } else if (!strM40231.contains("iPhone")) {
            String strM51359 = m51356(pattern, strM40231);
            if (!TextUtils.isEmpty(strM51359)) {
                String[] strArrSplit2 = strM51359.split(l.b);
                int length2 = strArrSplit2.length;
                int i8 = 0;
                str3 = "";
                while (true) {
                    if (i8 >= length2) {
                        if (!TextUtils.isEmpty(str3)) {
                            break;
                        }
                        str3 = null;
                        break;
                    }
                    String str12 = strArrSplit2[i8];
                    String strM513615 = m51367(str12);
                    int iIndexOf3 = strM513615.indexOf(" Build/");
                    if (iIndexOf3 >= 0) {
                        strM513615 = strM513615.substring(0, iIndexOf3);
                    }
                    String strM513616 = m51367(strM513615);
                    String strM513617 = m51367(strM513616);
                    if (!TextUtils.isEmpty(strM513617)) {
                        String lowerCase2 = strM513617.toLowerCase(Locale.ROOT);
                        if (!"k".equals(lowerCase2) && !"wv".equals(lowerCase2) && !"tablet".equals(lowerCase2) && !lowerCase2.contains("mobile") && !lowerCase2.contains("linux") && !lowerCase2.startsWith("rv:") && !lowerCase2.startsWith("version/") && !lowerCase2.startsWith("chrome/") && !lowerCase2.startsWith("crios/") && !lowerCase2.startsWith("firefox/") && !lowerCase2.startsWith("fxios/") && !lowerCase2.startsWith("gecko/") && !lowerCase2.startsWith("safari/") && !lowerCase2.startsWith("applewebkit/")) {
                            if (lowerCase2.length() < 2 || lowerCase2.length() > 12) {
                                strArr = strArrSplit2;
                                i3 = length2;
                            } else {
                                String[] strArrSplit3 = lowerCase2.replace('_', '-').split("-");
                                if (strArrSplit3.length < 1 || strArrSplit3.length > 3 || (strArrSplit3.length == 1 && strArrSplit3[0].length() > 3)) {
                                    strArr = strArrSplit2;
                                } else {
                                    int length3 = strArrSplit3.length;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < length3) {
                                            String str13 = strArrSplit3[i9];
                                            strArr = strArrSplit2;
                                            if (str13.length() >= 2 && str13.length() <= 4) {
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < str13.length()) {
                                                        char cCharAt = str13.charAt(i10);
                                                        i3 = length2;
                                                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                                                            i10++;
                                                            length2 = i3;
                                                        }
                                                    } else {
                                                        i9++;
                                                        strArrSplit2 = strArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            strArr = strArrSplit2;
                                            i3 = length2;
                                        }
                                    }
                                }
                                i3 = length2;
                            }
                            if (!TextUtils.isEmpty(strM513616) && str12.contains("Build/")) {
                                str3 = strM513616;
                                break;
                            }
                            str3 = strM513616;
                        } else {
                            strArr = strArrSplit2;
                            i3 = length2;
                        }
                    } else {
                        strArr = strArrSplit2;
                        i3 = length2;
                    }
                    i8++;
                    strArrSplit2 = strArr;
                    length2 = i3;
                }
            } else {
                str3 = null;
                break;
            }
            if (!TextUtils.isEmpty(str3)) {
                str9 = str3;
            } else if (Boolean.TRUE.equals(bool)) {
                str9 = null;
            } else {
                str9 = null;
            }
        }
        String strM513618 = m51367(str);
        String strM513619 = m51367(strM51355);
        if (!TextUtils.isEmpty(strM513618) && !TextUtils.isEmpty(strM513619)) {
            strM513618 = C22870.m50967(strM513618, " on ", strM513619);
        } else if (TextUtils.isEmpty(strM513618)) {
            strM513618 = TextUtils.isEmpty(strM513619) ? "" : strM513619;
        }
        String strM513620 = m51367(str9);
        if (TextUtils.isEmpty(strM513620)) {
            strM513620 = strM50967;
        } else {
            String upperCase = strM513620.toUpperCase(Locale.ROOT);
            if (upperCase.contains("REDMI") || upperCase.startsWith("POCO") || upperCase.contains("XIAOMI")) {
                str4 = "Xiaomi";
            } else if (upperCase.startsWith("RMX")) {
                str4 = "realme";
            } else if (upperCase.startsWith("SM-")) {
                str4 = "Samsung";
            } else if (upperCase.contains("PIXEL")) {
                str4 = "Google";
            } else {
                String str14 = "OPPO";
                if (!upperCase.contains("OPPO")) {
                    if (upperCase.contains("IQOO")) {
                        str4 = "iQOO";
                    } else if (upperCase.contains("VIVO")) {
                        str4 = "vivo";
                    } else if (upperCase.contains("HONOR")) {
                        str4 = "Honor";
                    } else if (upperCase.contains("HUAWEI")) {
                        str4 = "Huawei";
                    } else if (upperCase.contains("ONEPLUS")) {
                        str4 = "OnePlus";
                    } else {
                        str14 = null;
                    }
                }
                str5 = str14;
                if (!TextUtils.isEmpty(str5)) {
                    if (!strM513620.regionMatches(true, 0, str5, 0, str5.length())) {
                        strM50967 = C22870.m50967(str5, " ", strM513620);
                        strM513620 = strM50967;
                    }
                }
            }
            str5 = str4;
            if (!TextUtils.isEmpty(str5)) {
                if (!strM513620.regionMatches(true, 0, str5, 0, str5.length())) {
                    strM50967 = C22870.m50967(str5, " ", strM513620);
                    strM513620 = strM50967;
                }
            }
        }
        if (!TextUtils.isEmpty(strM513620) && !TextUtils.isEmpty(strM513618)) {
            return m51379(C22870.m50967(strM513620, " · ", strM513618));
        }
        if (TextUtils.isEmpty(strM513620)) {
            return !TextUtils.isEmpty(strM513618) ? m51379(strM513618) : m51379(c12593.f37982);
        }
        return m51379(strM513620);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m51359(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(jSONArray.size(), 8);
            for (int i = 0; i < iMin; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String strM51367 = m51367(jSONObject2.getString("brand"));
                    if (!TextUtils.isEmpty(strM51367)) {
                        m51367(jSONObject2.getString("version"));
                        arrayList.add(new C22471(strM51367));
                    }
                } catch (RuntimeException unused) {
                }
            }
            return arrayList;
        } catch (RuntimeException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51355(List list) {
        String str;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM51367 = m51367(((C22471) it.next()).f72775);
                if (TextUtils.isEmpty(strM51367)) {
                    str = null;
                } else {
                    String lowerCase = strM51367.toLowerCase(Locale.ROOT);
                    if ((lowerCase.contains("not") && lowerCase.contains("brand")) || lowerCase.contains("chromium")) {
                        str = null;
                    } else if (lowerCase.contains("samsung internet")) {
                        str = "Samsung Internet";
                    } else if (lowerCase.contains("microsoft edge") || lowerCase.equals("edge")) {
                        str = "Edge";
                    } else if (lowerCase.contains("google chrome") || lowerCase.equals("chrome")) {
                        str = "Chrome";
                    } else if (lowerCase.contains("opera")) {
                        str = "Opera";
                    } else if (lowerCase.contains("firefox")) {
                        str = "Firefox";
                    } else if (lowerCase.contains("safari")) {
                        str = "Safari";
                    } else {
                        str = null;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String strM51368 = m51367(((C22471) it2.next()).f72775);
                if (TextUtils.isEmpty(strM51368)) {
                    strM51368 = null;
                } else {
                    String lowerCase2 = strM51368.toLowerCase(Locale.ROOT);
                    if ((lowerCase2.contains("not") && lowerCase2.contains("brand")) || lowerCase2.contains("chromium")) {
                        strM51368 = null;
                    }
                }
                if (!TextUtils.isEmpty(strM51368)) {
                    return strM51368;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m51367(String str) {
        if (str == null) {
            return "";
        }
        int iMin = Math.min(str.length(), 128);
        StringBuilder sb = new StringBuilder(iMin);
        boolean z = false;
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isISOControl(cCharAt)) {
                if (Character.isWhitespace(cCharAt)) {
                    z = sb.length() > 0;
                } else {
                    if (z) {
                        sb.append(' ');
                        z = false;
                    }
                    sb.append(cCharAt);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m51375(String str) {
        String strReplace = m51367(str).replace('_', '.');
        while (strReplace.endsWith(".0")) {
            int i = 0;
            for (int i2 = 0; i2 < strReplace.length(); i2++) {
                if (strReplace.charAt(i2) == '.') {
                    i++;
                }
            }
            if (i <= 0) {
                break;
            }
            strReplace = C15472.m36561(2, 0, strReplace);
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51354(String str, String str2) {
        String strM51375 = m51375(str2);
        return TextUtils.isEmpty(strM51375) ? str : C22870.m50967(str, " ", strM51375);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51356(Pattern pattern, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m51379(String str) {
        String strM51367 = m51367(str);
        if (TextUtils.isEmpty(strM51367)) {
            return "Unknown browser";
        }
        return strM51367.length() > 64 ? strM51367.substring(0, 64) : strM51367;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51358(byte[] bArr) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(bArr), 11);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
