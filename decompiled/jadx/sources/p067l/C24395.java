package p067l;

import android.text.TextUtils;
import android.util.Base64;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.C0808g;
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
public final class C24395 {

    /* JADX INFO: renamed from: ۙ */
    public static final long f77215;

    /* JADX INFO: renamed from: ۚ */
    public static final long f77216;

    /* JADX INFO: renamed from: ۠ */
    public static final long f77217;

    /* JADX INFO: renamed from: ܶ */
    public static final long f77218;

    /* JADX INFO: renamed from: ᩶ */
    public static final long f77221;

    /* JADX INFO: renamed from: ᩸ */
    public static final long f77222;

    /* JADX INFO: renamed from: ᩹ */
    public static final long f77223;

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f77224;

    /* JADX INFO: renamed from: ۖ */
    public final SecureRandom f77225 = new SecureRandom();

    /* JADX INFO: renamed from: ۘ */
    public final HashMap f77226;

    /* JADX INFO: renamed from: ۜ */
    public final C14496 f77227;

    /* JADX INFO: renamed from: ۡ */
    public ScheduledFuture f77228;

    /* JADX INFO: renamed from: ۢ */
    public final HashMap f77229;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f77230;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f77231;

    /* JADX INFO: renamed from: ܺ */
    public ScheduledExecutorService f77232;

    /* JADX INFO: renamed from: ܽ */
    public final String f77233;

    /* JADX INFO: renamed from: ܿ */
    public final Object f77234;

    /* JADX INFO: renamed from: ᩳ */
    public final C25066 f77235;

    /* JADX INFO: renamed from: ᩷ */
    public long f77236;

    /* JADX INFO: renamed from: ᩻ */
    public String f77237;

    /* JADX INFO: renamed from: ᩵ */
    public static final Pattern f77220 = Pattern.compile("Android\\s+([0-9]+(?:\\.[0-9]+)*)", 2);

    /* JADX INFO: renamed from: ᩴ */
    public static final Pattern f77219 = Pattern.compile("Android\\s+[0-9]+(?:\\.[0-9]+)*;\\s*([^)]*)", 2);

    /* JADX INFO: renamed from: ֨ */
    public static final Pattern f77214 = Pattern.compile("(?:CPU(?: iPhone)? OS)\\s+([0-9_]+)", 2);

    /* JADX INFO: renamed from: ֡ */
    public static final Pattern f77213 = Pattern.compile("\"([^\"]+)\"\\s*;\\s*v=\"?([^\"]*)\"?");

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f77222 = timeUnit.toMillis(1L);
        f77218 = TimeUnit.SECONDS.toMillis(30L);
        f77215 = timeUnit.toMillis(30L);
        f77221 = TimeUnit.HOURS.toMillis(2L);
        long millis = timeUnit.toMillis(5L);
        f77223 = millis;
        f77217 = millis * 2;
        f77216 = timeUnit.toMillis(10L);
    }

    public C24395(C14496 c14496, String str) {
        Object obj = new Object();
        this.f77234 = obj;
        this.f77226 = new HashMap();
        this.f77231 = new HashMap();
        this.f77229 = new HashMap();
        this.f77230 = new HashMap();
        this.f77224 = new HashMap();
        this.f77233 = str == null ? "" : str;
        this.f77227 = c14496;
        this.f77235 = new C25066(C7050.m16232());
        synchronized (obj) {
            if (!m53782()) {
                m53777(System.currentTimeMillis());
                m53765();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap m53790() {
        LinkedHashMap linkedHashMap;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            if (!m53782()) {
                m53758(jCurrentTimeMillis);
            }
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("authRequired", Boolean.TRUE);
            linkedHashMap.put("pairingAvailable", Boolean.valueOf(m53782() || (this.f77237 != null && jCurrentTimeMillis < this.f77236)));
            long jMax = 0;
            if (!m53782()) {
                jMax = Math.max(this.f77236 - jCurrentTimeMillis, 0L);
            }
            linkedHashMap.put("pairingExpiresInMs", Long.valueOf(jMax));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12326 m53787(C17571 c17571, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM53780 = m53780(c17571);
        synchronized (this.f77234) {
            try {
                C12326 c12326M53757 = m53757(jCurrentTimeMillis, strM53780);
                if (c12326M53757 != null) {
                    return c12326M53757;
                }
                try {
                    C14337 c14337M53781 = m53781(str);
                    if (TextUtils.isEmpty(c14337M53781.f41008) || c14337M53781.f41011 == null) {
                        m53773(jCurrentTimeMillis, strM53780);
                        return C12326.m28400(R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f77234) {
                        try {
                            m53758(jCurrentTimeMillis);
                            if (!m53768(jCurrentTimeMillis, c14337M53781.f41008)) {
                                m53778(jCurrentTimeMillis, strM53780);
                                return C12326.m28399();
                            }
                            try {
                                C8302 c8302M53756 = m53756(c14337M53781.f41011);
                                synchronized (this.f77234) {
                                    try {
                                        m53758(jCurrentTimeMillis);
                                        if (!m53768(jCurrentTimeMillis, c14337M53781.f41008)) {
                                            m53778(jCurrentTimeMillis, strM53780);
                                            return C12326.m28399();
                                        }
                                        this.f77229.remove(strM53780);
                                        m53760(c8302M53756, m53753(c17571, c14337M53781), c14337M53781.f41010, jCurrentTimeMillis, c17571);
                                        if (!m53782()) {
                                            m53777(jCurrentTimeMillis);
                                            m53765();
                                        }
                                        return C12326.m28401(c8302M53756.f22185);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (Exception unused) {
                                m53773(jCurrentTimeMillis, strM53780);
                                return C12326.m28400(R.string.MT_Protector, new Object[0]);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (C24554 unused2) {
                    m53773(jCurrentTimeMillis, strM53780);
                    return C12326.m28400(R.string.MT_Protector, new Object[0]);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C12326 m53799(C17571 c17571) {
        C12326 c12326M53757;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            c12326M53757 = m53757(jCurrentTimeMillis, m53780(c17571));
        }
        return c12326M53757;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m53797(C17571 c17571) {
        m53773(System.currentTimeMillis(), m53780(c17571));
    }

    /* JADX INFO: renamed from: ܽ */
    public final C23055 m53795(C17571 c17571) {
        boolean zEquals;
        String strM42479 = C18658.m42479(c17571, "ticket");
        if (!TextUtils.isEmpty(strM42479)) {
            if (!EnumC6173.GET.equals(c17571.m39993()) && !EnumC6173.HEAD.equals(c17571.m39993())) {
                return C23055.m51441(EnumC3490.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
            }
            if (C18658.m42478(c17571)) {
                return C23055.m51441(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strM424710 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
            String strM424711 = C18658.m42479(c17571, "disposition");
            synchronized (this.f77234) {
                m53772(jCurrentTimeMillis);
                C7480.removeIf(this.f77230.entrySet(), new C17689(jCurrentTimeMillis));
                C6961 c6961 = (C6961) this.f77230.get(strM42479);
                if (c6961 != null && c6961.f18100 > jCurrentTimeMillis) {
                    String str = c6961.f18101;
                    boolean zEquals2 = true;
                    if (str == null) {
                        zEquals = strM424710 == null;
                    } else {
                        zEquals = str.equals(strM424710);
                    }
                    if (zEquals) {
                        String str2 = c6961.f18099;
                        if (str2 != null) {
                            zEquals2 = str2.equals(strM424711);
                        } else if (strM424711 != null) {
                            zEquals2 = false;
                        }
                        if (zEquals2) {
                            C16348 c16348M53776 = m53776(c6961.f18098);
                            if (c16348M53776 != null) {
                                if (!c16348M53776.f48038) {
                                    m53759(c6961.f18098, jCurrentTimeMillis, c17571, false);
                                }
                                return C23055.m51442(new C17018(c6961.f18098, null, null));
                            }
                            return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                    }
                    return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
        }
        return m53788(c17571);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C23055 m53791(C17571 c17571) {
        String strM42479 = C18658.m42479(c17571, "ticket");
        if (!EnumC6173.GET.equals(c17571.m39993())) {
            return C23055.m51441(EnumC3490.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        if (C18658.m42478(c17571)) {
            return C23055.m51441(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        if (TextUtils.isEmpty(strM42479)) {
            return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            m53772(jCurrentTimeMillis);
            C7480.removeIf(this.f77224.entrySet(), new C21044(jCurrentTimeMillis));
            C10314 c10314 = (C10314) this.f77224.get(strM42479);
            if (c10314 == null) {
                return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (c10314.f28579 <= jCurrentTimeMillis) {
                return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            C16348 c16348M53776 = m53776(c10314.f28578);
            if (c16348M53776 == null) {
                return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
            }
            if (!c16348M53776.f48038) {
                m53759(c10314.f28578, jCurrentTimeMillis, c17571, false);
            }
            return C23055.m51442(new C17018(c10314.f28578, strM42479, c10314.f28577));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap m53784(C17018 c17018) {
        C16348 c16348M53776;
        if (c17018 == null) {
            c16348M53776 = null;
        } else {
            String str = c17018.f50341;
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.f77234) {
                m53772(jCurrentTimeMillis);
                c16348M53776 = m53776(str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authenticated", Boolean.valueOf(c16348M53776 != null));
        if (c16348M53776 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("deviceId", c16348M53776.f48031);
            linkedHashMap2.put("deviceName", c16348M53776.f48033);
            linkedHashMap2.put("firstAccessAt", Long.valueOf(c16348M53776.f48035));
            linkedHashMap2.put("lastAccessAt", Long.valueOf(c16348M53776.f48037));
            linkedHashMap2.put("lastIp", c16348M53776.f48036);
            linkedHashMap2.put("userAgent", c16348M53776.f48032);
            linkedHashMap2.put("temporary", Boolean.valueOf(c16348M53776.f48038));
            linkedHashMap.put(AbstractC0213e.f992p, linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m53783() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            m53772(jCurrentTimeMillis);
            arrayList = new ArrayList();
            Iterator it = this.f77235.m55029().iterator();
            while (it.hasNext()) {
                arrayList.add(C25066.m55026((C16348) it.next()));
            }
            Iterator it2 = this.f77226.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(C25066.m55026((C16348) it2.next()));
            }
            C25066.m55028(arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53793(C17018 c17018, String str) {
        boolean zRemoveIf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            m53772(jCurrentTimeMillis);
            C25066 c25066 = this.f77235;
            ArrayList arrayListM55029 = c25066.m55029();
            zRemoveIf = C7480.removeIf(arrayListM55029, new C2937(str));
            if (zRemoveIf) {
                c25066.m55030(arrayListM55029);
            }
            if (c17018 != null && str.equals(c17018.f50341)) {
                zRemoveIf = this.f77226.remove(str) != null || zRemoveIf;
            }
            if (zRemoveIf) {
                m53774(str);
            }
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53789(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            m53772(jCurrentTimeMillis);
            C25066 c25066 = this.f77235;
            ArrayList arrayListM55029 = c25066.m55029();
            boolean zRemoveIf = C7480.removeIf(arrayListM55029, new C2937(str));
            if (zRemoveIf) {
                c25066.m55030(arrayListM55029);
            }
            z = this.f77226.remove(str) != null || zRemoveIf;
            if (z) {
                m53774(str);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C14337 m53781(String str) {
        String strM53763;
        String strM53764;
        String strM53765;
        JSONObject jSONObjectM19681 = C8461.m19681(str);
        C14337 c14337 = new C14337();
        c14337.f41008 = C8461.m19689(jSONObjectM19681, "code");
        c14337.f41009 = C8461.m19689(jSONObjectM19681, "deviceName");
        C21714 c21714 = null;
        Boolean booleanObject = null;
        c21714 = null;
        try {
            JSONObject jSONObject = jSONObjectM19681.getJSONObject("clientHints");
            if (jSONObject != null) {
                C21714 c21715 = new C21714();
                List list = Collections.EMPTY_LIST;
                c21715.f68397 = list;
                c21715.f68398 = list;
                try {
                    strM53763 = m53763(jSONObject.getString("platform"));
                } catch (RuntimeException unused) {
                    strM53763 = null;
                }
                c21715.f68401 = strM53763;
                try {
                    strM53764 = m53763(jSONObject.getString("platformVersion"));
                } catch (RuntimeException unused2) {
                    strM53764 = null;
                }
                c21715.f68399 = strM53764;
                try {
                    strM53765 = m53763(jSONObject.getString("model"));
                } catch (RuntimeException unused3) {
                    strM53765 = null;
                }
                c21715.f68402 = strM53765;
                try {
                    booleanObject = jSONObject.getBooleanObject("mobile");
                } catch (RuntimeException unused4) {
                }
                c21715.f68400 = booleanObject;
                c21715.f68397 = m53755(jSONObject, "brands");
                c21715.f68398 = m53755(jSONObject, "fullVersionList");
                c21714 = c21715;
            }
        } catch (RuntimeException unused5) {
        }
        c14337.f41007 = c21714;
        try {
            c14337.f41011 = jSONObjectM19681.getJSONObject("publicKey");
            c14337.f41010 = C8461.m19687(jSONObjectM19681, "trust");
            return c14337;
        } catch (RuntimeException e) {
            throw C8461.m19686(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap m53785(C17018 c17018, String str) {
        C5620 c5620;
        try {
            JSONObject jSONObjectM19681 = C8461.m19681(str);
            c5620 = new C5620();
            c5620.f13605 = C8461.m19689(jSONObjectM19681, MotionUtils.EASING_TYPE_PATH);
            c5620.f13604 = C8461.m19689(jSONObjectM19681, "disposition");
        } catch (C24554 unused) {
            c5620 = null;
        }
        if (c5620 == null || TextUtils.isEmpty(c5620.f13605) || !("inline".equals(c5620.f13604) || "attachment".equals(c5620.f13604))) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f77225.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C6961 c6961 = new C6961(0);
        c6961.f18098 = c17018.f50341;
        c6961.f18101 = c5620.f13605;
        c6961.f18099 = c5620.f13604;
        c6961.f18100 = f77216 + jCurrentTimeMillis;
        synchronized (this.f77234) {
            C7480.removeIf(this.f77230.entrySet(), new C17689(jCurrentTimeMillis));
            this.f77230.put(strEncodeToString, c6961);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c6961.f18100));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap m53786(C17018 c17018, C3608 c3608) {
        if (c17018 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f77225.nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        C10314 c10314 = new C10314(0);
        c10314.f28578 = c17018.f50341;
        c10314.f28577 = c3608;
        c10314.f28579 = f77216 + jCurrentTimeMillis;
        synchronized (this.f77234) {
            C7480.removeIf(this.f77224.entrySet(), new C21044(jCurrentTimeMillis));
            this.f77224.put(strEncodeToString, c10314);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", strEncodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c10314.f28579));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m53796() {
        synchronized (this.f77234) {
            ScheduledFuture scheduledFuture = this.f77228;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f77228 = null;
            }
            ScheduledExecutorService scheduledExecutorService = this.f77232;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f77232 = null;
            }
            this.f77230.clear();
            this.f77224.clear();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m53794() {
        synchronized (this.f77234) {
            if (m53782()) {
                return null;
            }
            m53758(System.currentTimeMillis());
            return this.f77237;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m53798() {
        synchronized (this.f77234) {
            if (m53782()) {
                return 0L;
            }
            m53758(System.currentTimeMillis());
            return this.f77236;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static long m53769() {
        return f77222;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23055 m53788(C17571 c17571) {
        String strM39990;
        boolean zVerify;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM42476 = C18658.m42476(c17571, "X-MT-Auth-Device");
        String strM42477 = C18658.m42476(c17571, "X-MT-Auth-Timestamp");
        String strM42478 = C18658.m42476(c17571, "X-MT-Auth-Nonce");
        String strM42479 = C18658.m42476(c17571, "X-MT-Auth-Content-SHA256");
        String strM424710 = C18658.m42476(c17571, "X-MT-Auth-Signature");
        boolean zEquals = false;
        if (TextUtils.isEmpty(strM42476) || TextUtils.isEmpty(strM42477) || TextUtils.isEmpty(strM42478) || TextUtils.isEmpty(strM42479) || TextUtils.isEmpty(strM424710)) {
            return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
        try {
            if (Math.abs(jCurrentTimeMillis - Long.parseLong(strM42477)) > f77223) {
                return C23055.m51440();
            }
            synchronized (this.f77234) {
                m53772(jCurrentTimeMillis);
                m53767(jCurrentTimeMillis);
                C16348 c16348M53776 = m53776(strM42476);
                if (c16348M53776 == null) {
                    return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                Map map = (Map) this.f77231.get(strM42476);
                if (map != null && map.containsKey(strM42478)) {
                    return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                StringBuilder sb = new StringBuilder("MT-REMOTE-AUTH-v1\n");
                sb.append(c17571.m39993().name());
                sb.append("\n");
                String strM39998 = c17571.m39998();
                if (TextUtils.isEmpty(strM39998)) {
                    strM39990 = c17571.m39990();
                } else {
                    strM39990 = c17571.m39990() + "?" + strM39998;
                }
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, strM39990, "\n", strM42477, "\n");
                String strM53894 = C24420.m53894(sb, strM42478, "\n", strM42479);
                try {
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(m53756(C8461.m19681(c16348M53776.f48034)).f22186);
                    signature.update(strM53894.getBytes(StandardCharsets.UTF_8));
                    zVerify = signature.verify(Base64.decode(strM424710, 11));
                } catch (Exception unused) {
                    zVerify = false;
                }
                if (!zVerify) {
                    return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
                try {
                    if (!strM42479.equals(m53779(c17571))) {
                        return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                    }
                    synchronized (this.f77234) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        m53772(jCurrentTimeMillis2);
                        m53767(jCurrentTimeMillis2);
                        if (m53776(strM42476) == null) {
                            return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        Map map2 = (Map) this.f77231.get(strM42476);
                        if (map2 != null && map2.containsKey(strM42478)) {
                            return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                        }
                        HashMap map3 = this.f77231;
                        Map map4 = (Map) map3.get(strM42476);
                        if (map4 == null) {
                            map4 = new HashMap();
                            map3.put(strM42476, map4);
                        }
                        map4.put(strM42478, Long.valueOf(jCurrentTimeMillis2));
                        if (EnumC6173.DELETE.equals(c17571.m39993()) && "/api/auth/devices".equals(c17571.m39990())) {
                            zEquals = strM42476.equals(C18658.m42479(c17571, "deviceId"));
                        }
                        if (!zEquals) {
                            m53759(strM42476, jCurrentTimeMillis2, c17571, true);
                        }
                        return C23055.m51442(new C17018(strM42476, null, null));
                    }
                } catch (C13667 e) {
                    return C23055.m51441(e.f38525, e.f38527, e.f38526);
                } catch (Exception unused2) {
                    return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
                }
            }
        } catch (NumberFormatException unused3) {
            return C23055.m51441(EnumC3490.UNAUTHORIZED, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53792(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f77234) {
            m53772(jCurrentTimeMillis);
            C7480.removeIf(this.f77224.entrySet(), new C21044(jCurrentTimeMillis));
            C10314 c10314 = (C10314) this.f77224.get(str);
            if (c10314 == null) {
                return false;
            }
            if (c10314.f28579 <= jCurrentTimeMillis) {
                return false;
            }
            return m53776(c10314.f28578) != null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if ("/api/file-upload-complete".equals(r0) == false) goto L56;
     */
    /* JADX INFO: renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m53779(C17571 c17571) throws C13667 {
        EnumC6173 enumC6173 = EnumC6173.POST;
        if (enumC6173.equals(c17571.m39993()) && "/api/file-upload-content".equals(c17571.m39990())) {
            String strM42479 = C18658.m42479(c17571, "taskId");
            String strM424710 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
            String strM424711 = C18658.m42479(c17571, "armToken");
            try {
                return "UPLOAD:v1:" + m53754((String.valueOf(strM42479) + "\n" + String.valueOf(strM424710) + "\n" + String.valueOf(strM424711) + "\n" + C18658.m42481(c17571)).getBytes(StandardCharsets.UTF_8));
            } catch (C12624 e) {
                throw new C13667(EnumC3490.BAD_REQUEST, e.f35429, e.f35428);
            }
        }
        if (!EnumC6173.PUT.equals(c17571.m39993()) || !"/api/text-file".equals(c17571.m39990())) {
            long jM53770 = m53770(c17571);
            if (jM53770 < 0) {
                if (!C18658.m42480(c17571)) {
                    if (C18658.m42482(c17571)) {
                        if (enumC6173.equals(c17571.m39993())) {
                            String strM39990 = c17571.m39990();
                            if (!"/api/file-rename".equals(strM39990)) {
                                if (!"/api/file-upload-prepare".equals(strM39990)) {
                                    if (!"/api/file-upload-begin".equals(strM39990)) {
                                    }
                                }
                            }
                        }
                    }
                }
                throw new C13667(EnumC3490.LENGTH_REQUIRED, R.string.MT_Protector, new Object[0]);
            }
            if (jM53770 <= X931RNG.BLOCK128_RESEED_MAX) {
                return jM53770 > 0 ? m53754(C18658.m42484(c17571).getBytes(StandardCharsets.UTF_8)) : m53754(new byte[0]);
            }
            throw new C13667(EnumC3490.PAYLOAD_TOO_LARGE, R.string.MT_Protector, new Object[0]);
        }
        long jM53771 = m53770(c17571);
        if (jM53771 < 0) {
            throw new C13667(EnumC3490.LENGTH_REQUIRED, R.string.MT_Protector, new Object[0]);
        }
        try {
            C19329 c19329M42477 = C18658.m42477(c17571, jM53771);
            String strM424712 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
            String strM424713 = C18658.m42479(c17571, "lineBreak");
            String strM42476 = C18658.m42476(c17571, "X-MT-Text-Parameters-Token");
            String strM424714 = C18658.m42479(c17571, "charsetIndex");
            String strEncodeToString = Base64.encodeToString(c19329M42477.f57715, 11);
            StringBuilder sb = new StringBuilder();
            if (strM424712 == null) {
                strM424712 = "";
            }
            sb.append(strM424712);
            sb.append("\n");
            if (strM424713 == null) {
                strM424713 = "";
            }
            sb.append(strM424713);
            sb.append("\n");
            if (strM42476 == null) {
                strM42476 = "";
            }
            sb.append(strM42476);
            sb.append("\n");
            if (strM424714 == null) {
                strM424714 = "";
            }
            sb.append(strM424714);
            sb.append("\n");
            sb.append(jM53771);
            return "TEXT_SAVE:v1:" + m53754(C10965.m25286(sb, "\n", strEncodeToString).getBytes(StandardCharsets.UTF_8));
        } catch (C17987 unused) {
            throw new C13667(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static long m53770(C17571 c17571) throws C13667 {
        if (!C18658.m42482(c17571)) {
            return 0L;
        }
        if (C18658.m42480(c17571)) {
            throw new C13667(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        String strM42476 = C18658.m42476(c17571, "content-length");
        if (TextUtils.isEmpty(strM42476)) {
            return -1L;
        }
        String strTrim = strM42476.trim();
        if (TextUtils.isEmpty(strTrim)) {
            throw new C13667(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
        for (int i = 0; i < strTrim.length(); i++) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C13667(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
            }
        }
        try {
            return Long.parseLong(strTrim);
        } catch (NumberFormatException unused) {
            throw new C13667(EnumC3490.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8302 m53756(JSONObject jSONObject) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidParameterSpecException {
        String strM53766 = m53766(jSONObject, "kty");
        String strM53767 = m53766(jSONObject, "crv");
        String strM53768 = m53766(jSONObject, "x");
        String strM53769 = m53766(jSONObject, "y");
        if (!"EC".equals(strM53766) || !"P-256".equals(strM53767) || strM53768.contains("=") || strM53769.contains("=")) {
            throw new IllegalArgumentException("unsupported key");
        }
        byte[] bArrDecode = Base64.decode(strM53768, 11);
        byte[] bArrDecode2 = Base64.decode(strM53769, 11);
        if (bArrDecode.length != 32 || bArrDecode2.length != 32) {
            throw new IllegalArgumentException("invalid coordinate length");
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, bArrDecode), new BigInteger(1, bArrDecode2)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        if (!(publicKeyGeneratePublic instanceof ECPublicKey)) {
            throw new IllegalArgumentException("invalid key");
        }
        StringBuilder sbM12525 = C5633.m12525("{\"crv\":\"", strM53767, "\",\"kty\":\"", strM53766, "\",\"x\":\"");
        sbM12525.append(strM53768);
        sbM12525.append("\",\"y\":\"");
        sbM12525.append(strM53769);
        sbM12525.append("\"}");
        String string = sbM12525.toString();
        return new C8302(string, m53754(string.getBytes(StandardCharsets.UTF_8)), (ECPublicKey) publicKeyGeneratePublic);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m53766(JSONObject jSONObject, String str) {
        String strM19689 = jSONObject == null ? null : C8461.m19689(jSONObject, str);
        if (TextUtils.isEmpty(strM19689)) {
            throw new IllegalArgumentException("missing ".concat(str));
        }
        return strM19689;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: ֫ */
    private void m53760(final C8302 c8302, String str, boolean z, long j, C17571 c17571) {
        C16348 c16348;
        long j2;
        String str2 = c8302.f22185;
        C25066 c25066 = this.f77235;
        ArrayList arrayListM55029 = c25066.m55029();
        Iterator it = arrayListM55029.iterator();
        do {
            if (!it.hasNext()) {
                c16348 = null;
                break;
            }
            c16348 = (C16348) it.next();
        } while (!str2.equals(c16348.f48031));
        C7480.removeIf(arrayListM55029, new Predicate() { // from class: l.ۡᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m25339or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return c8302.f22185.equals(((C16348) obj).f48031);
            }
        });
        HashMap map = this.f77226;
        map.remove(str2);
        C16348 c16349 = c16348 == null ? new C16348() : c16348;
        c16349.f48031 = str2;
        c16349.f48033 = str;
        c16349.f48034 = c8302.f22184;
        if (c16348 != null) {
            j2 = c16348.f48035;
            if (j2 <= 0) {
                j2 = j;
            }
        } else {
            j2 = j;
        }
        c16349.f48035 = j2;
        c16349.f48037 = j;
        c16349.f48036 = m53780(c17571);
        c16349.f48032 = m53764(c17571);
        c16349.f48038 = !z;
        if (z) {
            arrayListM55029.add(c16349);
            C8150.sort(arrayListM55029, C10162.comparingLong(new C7632()));
            while (arrayListM55029.size() > 32) {
                arrayListM55029.remove(0);
            }
            c25066.m55030(arrayListM55029);
            return;
        }
        map.put(c16349.f48031, c16349);
        c25066.m55030(arrayListM55029);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53759(String str, long j, C17571 c17571, boolean z) {
        C16348 c16348 = (C16348) this.f77226.get(str);
        if (c16348 != null && z) {
            c16348.f48037 = j;
            c16348.f48036 = m53780(c17571);
            c16348.f48032 = m53764(c17571);
            return;
        }
        C25066 c25066 = this.f77235;
        ArrayList<C16348> arrayListM55029 = c25066.m55029();
        for (C16348 c16349 : arrayListM55029) {
            if (str.equals(c16349.f48031)) {
                c16349.f48037 = j;
                c16349.f48036 = m53780(c17571);
                c16349.f48032 = m53764(c17571);
                c25066.m55030(arrayListM55029);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53774(final String str) {
        this.f77231.remove(str);
        C7480.removeIf(this.f77230.entrySet(), new Predicate() { // from class: l.ۘᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m14293or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C6961) ((Map.Entry) obj).getValue()).f18098);
            }
        });
        C7480.removeIf(this.f77224.entrySet(), new Predicate() { // from class: l.ᩴᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m45984or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C10314) ((Map.Entry) obj).getValue()).f28578);
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    private C16348 m53776(String str) {
        for (C16348 c16348 : this.f77235.m55029()) {
            if (str.equals(c16348.f48031)) {
                return c16348;
            }
        }
        return (C16348) this.f77226.get(str);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53772(long j) {
        Iterator it = this.f77226.entrySet().iterator();
        while (it.hasNext()) {
            C16348 c16348 = (C16348) ((Map.Entry) it.next()).getValue();
            if (j - c16348.f48037 > f77215 || j - c16348.f48035 > f77221) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53767(final long j) {
        Iterator it = this.f77231.entrySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map.Entry) it.next()).getValue();
            C7480.removeIf(map.entrySet(), new Predicate() { // from class: l.ۖᩴۢ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m10495or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C24395.m53762(j, (Map.Entry) obj);
                }
            });
            if (map.isEmpty()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m53762(long j, Map.Entry entry) {
        return j - ((Long) entry.getValue()).longValue() > f77217;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53758(long j) {
        if (m53782()) {
            return;
        }
        if (this.f77237 == null || j >= this.f77236) {
            m53777(j);
            m53765();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m53768(long j, String str) {
        if (m53782()) {
            return this.f77233.equals(str);
        }
        String str2 = this.f77237;
        return str2 != null && j < this.f77236 && str2.equals(str);
    }

    /* JADX INFO: renamed from: ᩻ */
    private boolean m53782() {
        return !TextUtils.isEmpty(this.f77233);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m53777(long j) {
        String str = String.format(Locale.ROOT, "%06d", Integer.valueOf(this.f77225.nextInt(BasicLabelFormatter.MILLION)));
        this.f77237 = str;
        long j2 = j + f77222;
        this.f77236 = j2;
        C14496 c14496 = this.f77227;
        if (c14496 != null) {
            C23884 c23884 = (C23884) c14496.f41395;
            ServiceC3906 serviceC3906 = (ServiceC3906) ((C9387) c14496.f41396).f25643;
            int i = ServiceC3906.f8466;
            C7050.m16212(new RunnableC9132(serviceC3906, c23884, str, j2));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m53765() {
        if (this.f77232 == null) {
            this.f77232 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC22385());
        }
        ScheduledFuture scheduledFuture = this.f77228;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f77228 = this.f77232.schedule(new Runnable() { // from class: l.ۢᩴۢ
            @Override // java.lang.Runnable
            public final void run() {
                C24395.m53761(this.f32509);
            }
        }, Math.max(this.f77236 - System.currentTimeMillis(), 1L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53761(C24395 c24395) {
        synchronized (c24395.f77234) {
            c24395.m53777(System.currentTimeMillis());
            c24395.m53765();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m53773(long j, String str) {
        synchronized (this.f77234) {
            m53778(j, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: ᩳ */
    private void m53778(long j, String str) {
        HashMap map = this.f77229;
        C15007 c15007 = (C15007) map.get(str);
        if (c15007 != null) {
            long j2 = c15007.f42876;
            if (j2 > 0 && j >= j2) {
                c15007 = new C15007(0);
                map.put(str, c15007);
            }
        } else {
            c15007 = new C15007(0);
            map.put(str, c15007);
        }
        int i = c15007.f42877 + 1;
        c15007.f42877 = i;
        if (i >= 5) {
            c15007.f42876 = j + f77218;
            c15007.f42877 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C12326 m53757(long j, String str) {
        C15007 c15007 = (C15007) this.f77229.get(str);
        if (c15007 == null || c15007.f42876 <= j) {
            return null;
        }
        m53778(j, str);
        return C12326.m28400(R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m53780(C17571 c17571) {
        String strM39991 = c17571.m39991();
        return TextUtils.isEmpty(strM39991) ? "" : strM39991;
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m53764(C17571 c17571) {
        String strM42476 = C18658.m42476(c17571, "user-agent");
        if (strM42476 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(strM42476.length(), 1024));
        for (int i = 0; i < strM42476.length(); i++) {
            char cCharAt = strM42476.charAt(i);
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
    /* JADX INFO: renamed from: ֫ */
    public static String m53753(C17571 c17571, C14337 c14337) {
        String str;
        String strM53750;
        int i;
        String strM53751;
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
        String strM42476 = C18658.m42476(c17571, "user-agent");
        C21714 c21714 = c14337.f41007;
        String strM42477 = C18658.m42476(c17571, "sec-ch-ua");
        String strM53752 = m53751(c21714 == null ? null : c21714.f68398);
        if (TextUtils.isEmpty(strM53752)) {
            strM53752 = m53751(c21714 == null ? null : c21714.f68397);
        }
        if (TextUtils.isEmpty(strM53752)) {
            if (TextUtils.isEmpty(strM42477)) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList = new ArrayList();
                Matcher matcher = f77213.matcher(strM42477);
                while (matcher.find() && arrayList.size() < 8) {
                    String strM53763 = m53763(matcher.group(1));
                    m53763(matcher.group(2));
                    arrayList.add(new C23725(strM53763));
                }
                list = arrayList;
            }
            strM53752 = m53751(list);
        }
        if (TextUtils.isEmpty(strM53752)) {
            if (TextUtils.isEmpty(strM42476)) {
                strM53752 = null;
            } else if (strM42476.contains("SamsungBrowser/")) {
                strM53752 = "Samsung Internet";
            } else if (strM42476.contains("Edg/") || strM42476.contains("EdgA/") || strM42476.contains("EdgiOS/")) {
                strM53752 = "Edge";
            } else if (strM42476.contains("OPR/") || strM42476.contains("Opera/")) {
                strM53752 = "Opera";
            } else if (strM42476.contains("FxiOS/") || strM42476.contains("Firefox/")) {
                strM53752 = "Firefox";
            } else if (strM42476.contains("CriOS/") || strM42476.contains("Chrome/")) {
                strM53752 = "Chrome";
            } else if (strM42476.contains("Safari/") && strM42476.contains("Version/")) {
                strM53752 = "Safari";
            } else {
                strM53752 = null;
            }
        }
        String strM42478 = C18658.m42476(c17571, "sec-ch-ua-platform");
        String str6 = c21714 == null ? null : c21714.f68401;
        String strM53764 = m53763(strM42478);
        if (strM53764.length() >= 2 && strM53764.startsWith("\"") && strM53764.endsWith("\"")) {
            strM53764 = C17073.m38720(1, 1, strM53764);
        }
        String strM53765 = m53763(str6);
        if (TextUtils.isEmpty(strM53765)) {
            strM53765 = m53763(strM53764);
        }
        String str7 = c21714 == null ? null : c21714.f68399;
        String strM53766 = m53763(strM53765);
        if (TextUtils.isEmpty(strM53766)) {
            strM53750 = null;
            str = strM53752;
        } else {
            String lowerCase = strM53766.toLowerCase(Locale.ROOT);
            str = strM53752;
            if (lowerCase.contains("android")) {
                strM53750 = m53750(AnalyticsConstants.SDK_TYPE, m53771(str7));
            } else if (lowerCase.contains("ios")) {
                strM53750 = m53750("iOS", m53771(str7));
            } else if (lowerCase.contains(C0808g.f3432a)) {
                strM53750 = m53750("macOS", m53771(str7));
            } else if (lowerCase.contains("windows")) {
                String strM53767 = m53763(str7);
                int i4 = 0;
                while (i4 < strM53767.length() && Character.isDigit(strM53767.charAt(i4))) {
                    i4++;
                }
                if (i4 == 0) {
                    i = -1;
                } else {
                    try {
                        i = Integer.parseInt(strM53767.substring(0, i4));
                    } catch (NumberFormatException unused) {
                        i = -1;
                    }
                }
                if (i >= 13) {
                    strM53750 = "Windows 11";
                } else {
                    strM53750 = i > 0 ? "Windows 10" : null;
                }
                if (TextUtils.isEmpty(strM53750)) {
                    strM53750 = "Windows";
                }
            } else {
                strM53750 = lowerCase.contains("chrome os") ? m53750("ChromeOS", m53771(str7)) : m53750(strM53766, m53771(str7));
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(strM53750);
        String str8 = strM53750;
        Pattern pattern = f77219;
        String str9 = "iPhone";
        String strM53357 = "";
        if (!zIsEmpty) {
            strM53751 = str8;
        } else if (TextUtils.isEmpty(strM42476)) {
            strM53751 = null;
        } else if (strM42476.contains("iPhone") || strM42476.contains("iPad")) {
            String str10 = strM42476.contains("iPad") ? "iPadOS" : "iOS";
            String strM53771 = m53771(m53752(f77214, strM42476));
            if (strM53771.startsWith("18.6")) {
                int iIndexOf = strM42476.indexOf("Version/");
                if (iIndexOf < 0) {
                    i2 = -1;
                } else {
                    int i5 = iIndexOf + 8;
                    int i6 = i5;
                    while (i6 < strM42476.length() && Character.isDigit(strM42476.charAt(i6))) {
                        i6++;
                    }
                    if (i6 == i5) {
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(strM42476.substring(i5, i6));
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
                strM53771 = "";
            }
            strM53751 = m53750(str10, strM53771);
        } else {
            String strM53753 = m53752(f77220, strM42476);
            if (!TextUtils.isEmpty(strM53753)) {
                String strM53772 = m53771(strM53753);
                if (!"10".equals(strM53772) || (!strM42476.contains("Chrome/") && !strM42476.contains("EdgA/") && !strM42476.contains("OPR/") && !strM42476.contains("SamsungBrowser/"))) {
                    str2 = strM53772;
                    break;
                }
                String strM53754 = m53752(pattern, strM42476);
                if (!TextUtils.isEmpty(strM53754)) {
                    String[] strArrSplit = strM53754.split(C0249l.f1196b);
                    int length = strArrSplit.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            str2 = strM53772;
                            break;
                        }
                        String strM53768 = m53763(strArrSplit[i7]);
                        int iIndexOf2 = strM53768.indexOf(" Build/");
                        String str11 = strM53772;
                        if (iIndexOf2 >= 0) {
                            strM53768 = strM53768.substring(0, iIndexOf2);
                        }
                        if ("k".equals(m53763(strM53768).toLowerCase(Locale.ROOT))) {
                            str2 = "";
                            break;
                        }
                        i7++;
                        strM53772 = str11;
                    }
                } else {
                    str2 = strM53772;
                    break;
                }
                strM53751 = m53750(AnalyticsConstants.SDK_TYPE, str2);
            } else if (strM42476.contains("Mac OS X") || strM42476.contains("Macintosh")) {
                strM53751 = "macOS";
            } else if (strM42476.contains("Windows NT")) {
                strM53751 = "Windows";
            } else if (strM42476.contains("CrOS")) {
                strM53751 = "ChromeOS";
            } else {
                strM53751 = "Linux";
                if (!strM42476.contains("Linux")) {
                    strM53751 = null;
                }
            }
        }
        String strM42479 = C18658.m42476(c17571, "sec-ch-ua-mobile");
        if (c21714 == null || (bool = c21714.f68400) == null) {
            String strM53769 = m53763(strM42479);
            if ("?1".equals(strM53769)) {
                bool = Boolean.TRUE;
            } else {
                bool = "?0".equals(strM53769) ? Boolean.FALSE : null;
            }
        }
        String strM537610 = m53763(c21714 == null ? null : c21714.f68402);
        if (!TextUtils.isEmpty(strM537610)) {
            str9 = strM537610;
        } else if (TextUtils.isEmpty(strM42476)) {
            if (Boolean.TRUE.equals(bool) || TextUtils.isEmpty(strM53751) || !strM53751.startsWith("iOS")) {
                str9 = null;
            }
        } else if (strM42476.contains("iPad")) {
            str9 = "iPad";
        } else if (!strM42476.contains("iPhone")) {
            String strM53755 = m53752(pattern, strM42476);
            if (!TextUtils.isEmpty(strM53755)) {
                String[] strArrSplit2 = strM53755.split(C0249l.f1196b);
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
                    String strM537611 = m53763(str12);
                    int iIndexOf3 = strM537611.indexOf(" Build/");
                    if (iIndexOf3 >= 0) {
                        strM537611 = strM537611.substring(0, iIndexOf3);
                    }
                    String strM537612 = m53763(strM537611);
                    String strM537613 = m53763(strM537612);
                    if (!TextUtils.isEmpty(strM537613)) {
                        String lowerCase2 = strM537613.toLowerCase(Locale.ROOT);
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
                            if (!TextUtils.isEmpty(strM537612) && str12.contains("Build/")) {
                                str3 = strM537612;
                                break;
                            }
                            str3 = strM537612;
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
        String strM537614 = m53763(str);
        String strM537615 = m53763(strM53751);
        if (!TextUtils.isEmpty(strM537614) && !TextUtils.isEmpty(strM537615)) {
            strM537614 = C24104.m53357(strM537614, " on ", strM537615);
        } else if (TextUtils.isEmpty(strM537614)) {
            strM537614 = TextUtils.isEmpty(strM537615) ? "" : strM537615;
        }
        String strM537616 = m53763(str9);
        if (TextUtils.isEmpty(strM537616)) {
            strM537616 = strM53357;
        } else {
            String upperCase = strM537616.toUpperCase(Locale.ROOT);
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
                    if (!strM537616.regionMatches(true, 0, str5, 0, str5.length())) {
                        strM53357 = C24104.m53357(str5, " ", strM537616);
                        strM537616 = strM53357;
                    }
                }
            }
            str5 = str4;
            if (!TextUtils.isEmpty(str5)) {
                if (!strM537616.regionMatches(true, 0, str5, 0, str5.length())) {
                    strM53357 = C24104.m53357(str5, " ", strM537616);
                    strM537616 = strM53357;
                }
            }
        }
        if (!TextUtils.isEmpty(strM537616) && !TextUtils.isEmpty(strM537614)) {
            return m53775(C24104.m53357(strM537616, " · ", strM537614));
        }
        if (TextUtils.isEmpty(strM537616)) {
            return !TextUtils.isEmpty(strM537614) ? m53775(strM537614) : m53775(c14337.f41009);
        }
        return m53775(strM537616);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m53755(JSONObject jSONObject, String str) {
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
                    String strM53763 = m53763(jSONObject2.getString("brand"));
                    if (!TextUtils.isEmpty(strM53763)) {
                        m53763(jSONObject2.getString("version"));
                        arrayList.add(new C23725(strM53763));
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
    /* JADX INFO: renamed from: ֫ */
    public static String m53751(List list) {
        String str;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strM53763 = m53763(((C23725) it.next()).f75502);
                if (TextUtils.isEmpty(strM53763)) {
                    str = null;
                } else {
                    String lowerCase = strM53763.toLowerCase(Locale.ROOT);
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
                String strM53764 = m53763(((C23725) it2.next()).f75502);
                if (TextUtils.isEmpty(strM53764)) {
                    strM53764 = null;
                } else {
                    String lowerCase2 = strM53764.toLowerCase(Locale.ROOT);
                    if ((lowerCase2.contains("not") && lowerCase2.contains("brand")) || lowerCase2.contains("chromium")) {
                        strM53764 = null;
                    }
                }
                if (!TextUtils.isEmpty(strM53764)) {
                    return strM53764;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m53763(String str) {
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

    /* JADX INFO: renamed from: ܳ */
    public static String m53771(String str) {
        String strReplace = m53763(str).replace('_', '.');
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
            strReplace = C17073.m38720(2, 0, strReplace);
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53750(String str, String str2) {
        String strM53771 = m53771(str2);
        return TextUtils.isEmpty(strM53771) ? str : C24104.m53357(str, " ", strM53771);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53752(Pattern pattern, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m53775(String str) {
        String strM53763 = m53763(str);
        if (TextUtils.isEmpty(strM53763)) {
            return "Unknown browser";
        }
        return strM53763.length() > 64 ? strM53763.substring(0, 64) : strM53763;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m53754(byte[] bArr) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(bArr), 11);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
