package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0674be;
import com.umeng.analytics.pro.C0708d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.C0773c;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C0790a;
import com.umeng.commonsdk.stateless.C0791b;
import com.umeng.commonsdk.stateless.C0793d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C0806e;
import com.umeng.commonsdk.statistics.idtracking.C0810i;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C0831c;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.b */
/* JADX INFO: compiled from: V45U */
/* JADX INFO: loaded from: classes.dex */
public class C0795b {

    /* JADX INFO: renamed from: a */
    public static String f3342a = null;

    /* JADX INFO: renamed from: b */
    public static String f3343b = "";

    /* JADX INFO: renamed from: c */
    public static final String f3344c = "EnvelopeManager";

    /* JADX INFO: renamed from: d */
    public static final String f3345d = "debug.umeng.umTaskId";

    /* JADX INFO: renamed from: e */
    public static final String f3346e = "debug.umeng.umCaseId";

    /* JADX INFO: renamed from: f */
    public static final String f3347f = "empty";

    /* JADX INFO: renamed from: g */
    public static String f3348g = "";

    /* JADX INFO: renamed from: h */
    public static String f3349h = "";

    /* JADX INFO: renamed from: i */
    public static String f3350i;

    /* JADX INFO: renamed from: j */
    public static Map f3351j;

    /* JADX INFO: renamed from: l */
    public static boolean f3352l;

    /* JADX INFO: renamed from: k */
    public int f3353k = 0;

    static {
        HashMap map = new HashMap();
        f3351j = map;
        map.put("header", "#h");
        f3351j.put(C0655am.f2360u, "#sdt");
        f3351j.put(C0655am.f2262Q, "#ac");
        f3351j.put("device_model", "#dm");
        f3351j.put(C0655am.f2346g, "#umid");
        f3351j.put(C0655am.f2363x, C0655am.f2363x);
        f3351j.put(C0655am.f2259N, "#lang");
        f3351j.put(C0655am.f2307ai, "#dt");
        f3351j.put(C0655am.f2365z, "#rl");
        f3351j.put(C0655am.f2253H, "#dmf");
        f3351j.put(C0655am.f2255J, "#dn");
        f3351j.put("platform_version", "#pv");
        f3351j.put("font_size_setting", "#fss");
        f3351j.put(C0655am.f2364y, "#ov");
        f3351j.put(C0655am.f2254I, "#did");
        f3351j.put("platform_sdk_version", "#psv");
        f3351j.put(C0655am.f2251F, "#db");
        f3351j.put("appkey", "#ak");
        f3351j.put(C0655am.f2270Y, "#itr");
        f3351j.put("id_type", "#it");
        f3351j.put("uuid", "#ud");
        f3351j.put("device_id", "#dd");
        f3351j.put(C0655am.f2269X, "#imp");
        f3351j.put("sdk_version", "#sv");
        f3351j.put("st", "#st");
        f3351j.put("analytics", "#a");
        f3351j.put(C0655am.f2354o, "#pkg");
        f3351j.put(C0655am.f2355p, "#sig");
        f3351j.put(C0655am.f2356q, "#sis1");
        f3351j.put(C0655am.f2357r, "#sis");
        f3351j.put("app_version", "#av");
        f3351j.put("version_code", "#vc");
        f3351j.put("idmd5", "#imd");
        f3351j.put(C0655am.f2247B, "#mnc");
        f3351j.put(C0655am.f2250E, "#boa");
        f3351j.put(C0655am.f2252G, "#mant");
        f3351j.put(C0655am.f2258M, "#tz");
        f3351j.put(C0655am.f2260O, "#ct");
        f3351j.put(C0655am.f2261P, "#car");
        f3351j.put(C0655am.f2358s, "#disn");
        f3351j.put(C0655am.f2265T, "#nt");
        f3351j.put(C0655am.f2325b, "#cv");
        f3351j.put(C0655am.f2343d, "#mv");
        f3351j.put(C0655am.f2342c, "#cot");
        f3351j.put(C0655am.f2344e, "#mod");
        f3351j.put(C0655am.f2308aj, "#al");
        f3351j.put("session_id", "#sid");
        f3351j.put(C0655am.f2264S, "#ip");
        f3351j.put(C0655am.f2266U, "#sre");
        f3351j.put(C0655am.f2267V, "#fre");
        f3351j.put(C0655am.f2268W, "#ret");
        f3351j.put("channel", "#chn");
        f3351j.put("wrapper_type", "#wt");
        f3351j.put("wrapper_version", "#wv");
        f3351j.put(C0655am.f2294aV, "#tsv");
        f3351j.put(C0655am.f2295aW, "#rps");
        f3351j.put(C0655am.f2298aZ, "#mov");
        f3351j.put(C0708d.f2653i, "#vt");
        f3351j.put("secret", "#sec");
        f3351j.put(C0708d.f2627ah, "#prv");
        f3351j.put(C0708d.f2656l, "#$prv");
        f3351j.put(C0708d.f2657m, "#uda");
        f3351j.put(C0655am.f2272a, "#tok");
        f3351j.put(C0655am.f2286aN, "#iv");
        f3351j.put(C0655am.f2263R, "#ast");
        f3351j.put("backstate", "#bst");
        f3351j.put("zdata_ver", "#zv");
        f3351j.put("zdata_req_ts", "#zrt");
        f3351j.put("app_b_v", "#bv");
        f3351j.put("zdata", "#zta");
        f3351j.put(C0655am.f2314ap, "#mt");
        f3351j.put(C0655am.f2311am, "#zsv");
        f3351j.put(C0655am.f2313ao, "#oos");
    }

    /* JADX INFO: renamed from: a */
    public static String m2926a(String str) {
        return f3351j.containsKey(str) ? (String) f3351j.get(str) : str;
    }

    /* JADX INFO: renamed from: a */
    public static void m2930a() {
        if (f3350i != null) {
            f3350i = null;
            C0806e.m3068a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m2924a(Context context) {
        return DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m2927a(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2932b() {
        f3348g = UMUtils.getSystemProperty(f3345d, "");
        f3349h = UMUtils.getSystemProperty(f3346e, "");
        return (!TextUtils.isEmpty(f3348g) && !f3347f.equals(f3348g)) && (!TextUtils.isEmpty(f3349h) && !f3347f.equals(f3349h));
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m2935a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        String strSubstring;
        Envelope envelopeM2925a;
        JSONObject jSONObjectOptJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            int length = jSONObject.toString().getBytes().length;
            int length2 = jSONObject2.toString().getBytes().length;
        }
        if (context == null || jSONObject2 == null) {
            return m2927a(UMErrorCode.E_UM_BE_JSON_FAILED, (JSONObject) null);
        }
        try {
            JSONObject jSONObjectM2928a = m2928a(context, str2, jSONObject2.has("analytics") && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.has(C0708d.f2658n));
            if (jSONObjectM2928a != null && jSONObject != null) {
                jSONObjectM2928a = m2929a(jSONObjectM2928a, jSONObject);
            }
            JSONObject jSONObject4 = jSONObjectM2928a;
            if (jSONObject4 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str4 = next;
                        if (jSONObject2.opt(str4) != null) {
                            try {
                                jSONObject4.put(m2926a(str4), jSONObject2.opt(str4));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            String str5 = C0655am.f2280aH;
            if (!TextUtils.isEmpty(str2)) {
                str5 = str2;
            }
            String str6 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
            if (jSONObject4 != null) {
                strSubstring = str5 + "==" + str6 + "&=";
                if (TextUtils.isEmpty(strSubstring)) {
                    return m2927a(101, jSONObject4);
                }
                if (strSubstring.endsWith("&=")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                }
            } else {
                strSubstring = null;
            }
            String str7 = strSubstring;
            if (jSONObject4 != null) {
                try {
                    C0806e c0806eM3067a = C0806e.m3067a(context);
                    if (c0806eM3067a != null) {
                        c0806eM3067a.m3075b();
                        String strEncodeToString = Base64.encodeToString(new C0674be().m2321a(c0806eM3067a.m3076c()), 0);
                        if (!TextUtils.isEmpty(strEncodeToString)) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject(m2926a("header"));
                            jSONObject5.put(m2926a(C0655am.f2270Y), strEncodeToString);
                            jSONObject4.put(m2926a("header"), jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject4 != null && DataHelper.largeThanMaxSize(jSONObject4.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(C0810i.f3439a, sharedPreferences.getInt(C0810i.f3439a, 1) + 1).commit();
                }
                return m2927a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject4);
            }
            if (jSONObject4 != null) {
                envelopeM2925a = m2925a(context, jSONObject4.toString().getBytes());
                if (envelopeM2925a == null) {
                    return m2927a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject4);
                }
            } else {
                envelopeM2925a = null;
            }
            Envelope envelope = envelopeM2925a;
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m2927a(114, jSONObject4);
            }
            int iM2923a = m2923a(context, envelope, str7, jSONObject4 != null ? jSONObject4.optJSONObject(m2926a("header")).optString(m2926a("app_version")) : null, str);
            if (iM2923a != 0) {
                return m2927a(iM2923a, jSONObject4);
            }
            if (ULog.DEBUG) {
                int length3 = jSONObject4.toString().getBytes().length;
            }
            if (!str7.startsWith(C0655am.f2276aD) && !str7.startsWith(C0655am.f2275aC) && !str7.startsWith(C0655am.f2281aI) && !str7.startsWith(C0655am.f2320av) && !C0791b.m2879a()) {
                new C0791b(context);
                C0791b.m2880b();
            }
            return jSONObject4;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            if (jSONObject != null) {
                try {
                    jSONObject3 = new JSONObject();
                    try {
                        try {
                            jSONObject3.put("header", jSONObject);
                        } catch (Exception e) {
                            e = e;
                            UMCrashManager.reportCrash(context, e);
                            return m2927a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject3);
                        }
                    } catch (JSONException unused3) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject3 = null;
                    UMCrashManager.reportCrash(context, e);
                    return m2927a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject3);
                }
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (next2 != null && (next2 instanceof String)) {
                    String str8 = next2;
                    if (jSONObject2.opt(str8) != null) {
                        try {
                            jSONObject3.put(str8, jSONObject2.opt(str8));
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
            return m2927a(UMErrorCode.E_UM_BE_JSON_FAILED, jSONObject3);
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m2934a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelopeM2925a;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(m2926a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = m2929a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(C0810i.f3439a, sharedPreferences.getInt(C0810i.f3439a, 1) + 1).commit();
                }
                return m2927a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelopeM2925a = m2925a(context, jSONObject3.toString().getBytes());
                if (envelopeM2925a == null) {
                    return m2927a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject3);
                }
            } else {
                envelopeM2925a = null;
            }
            Envelope envelope = envelopeM2925a;
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m2927a(114, jSONObject3);
            }
            int iM2923a = m2923a(context, envelope, "h==1.2.0", "", str);
            if (iM2923a != 0) {
                return m2927a(iM2923a, jSONObject3);
            }
            if (ULog.DEBUG) {
                int length = jSONObject3.toString().getBytes().length;
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m2927a(UMErrorCode.E_UM_BE_JSON_FAILED, new JSONObject());
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m2936b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelopeM2925a;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(m2926a("header"), new JSONObject());
            try {
                if (m2932b()) {
                    jSONObject.put("umTaskId", f3348g);
                    jSONObject.put("umCaseId", f3349h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = m2929a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(C0810i.f3439a, sharedPreferences.getInt(C0810i.f3439a, 1) + 1).commit();
                }
                return m2927a(UMErrorCode.E_UM_BE_RAW_OVERSIZE, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelopeM2925a = m2925a(context, jSONObject3.toString().getBytes());
                if (envelopeM2925a == null) {
                    return m2927a(UMErrorCode.E_UM_BE_CREATE_FAILED, jSONObject3);
                }
            } else {
                envelopeM2925a = null;
            }
            Envelope envelope = envelopeM2925a;
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m2927a(114, jSONObject3);
            }
            int iM2923a = m2923a(context, envelope, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (iM2923a != 0) {
                return m2927a(iM2923a, jSONObject3);
            }
            if (ULog.DEBUG) {
                int length = jSONObject3.toString().getBytes().length;
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m2927a(UMErrorCode.E_UM_BE_JSON_FAILED, new JSONObject());
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m2933b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(C0773c.f3245a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(C0773c.f3246b, 0);
                iArr[1] = sharedPreferences.getInt(C0773c.f3247c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:163:0x03ad
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: a */
    public static org.json.JSONObject m2928a(android.content.Context r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.C0795b.m2928a(android.content.Context, java.lang.String, boolean):org.json.JSONObject");
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m2929a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(m2926a("header")) != null && (jSONObject.opt(m2926a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(m2926a("header"));
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(m2926a(C0708d.f2653i)) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f3353k = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private Envelope m2925a(Context context, byte[] bArr) {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int iIntValue = -1;
        try {
            if (!TextUtils.isEmpty(strImprintProperty)) {
                iIntValue = Integer.valueOf(strImprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            UMCrashManager.reportCrash(context, e);
        }
        if (iIntValue == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (iIntValue == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f3352l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* JADX INFO: renamed from: a */
    private int m2923a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String strM2911b = C0793d.m2911b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(strM2911b);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (C0831c.m3310a()) {
            if (str.startsWith(C0655am.f2279aG)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return 122;
        }
        if (str.startsWith(C0655am.f2279aG)) {
            return 122;
        }
        if (str.startsWith(C0655am.f2276aD) || str.startsWith(C0655am.f2275aC) || str.startsWith(C0655am.f2320av) || str.startsWith(C0655am.f2281aI)) {
            return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
        }
        return C0793d.m2900a(context, C0790a.f3313f, sb.toString(), binary);
    }

    /* JADX INFO: renamed from: a */
    public static void m2931a(boolean z) {
        f3352l = z;
    }
}
