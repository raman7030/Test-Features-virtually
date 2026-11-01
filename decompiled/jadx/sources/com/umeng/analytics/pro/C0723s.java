package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.s */
/* JADX INFO: compiled from: 15SY */
/* JADX INFO: loaded from: classes.dex */
public class C0723s {

    /* JADX INFO: renamed from: a */
    public static final String f2940a = "fs_lc_tl_uapp";

    /* JADX INFO: renamed from: f */
    public static final String f2941f = "-1";

    /* JADX INFO: renamed from: g */
    public static Context f2942g;

    /* JADX INFO: renamed from: b */
    public final int f2943b;

    /* JADX INFO: renamed from: c */
    public final int f2944c;

    /* JADX INFO: renamed from: d */
    public final int f2945d;

    /* JADX INFO: renamed from: e */
    public final int f2946e;

    /* JADX INFO: renamed from: h */
    public JSONObject f2947h;

    public C0723s() {
        this.f2943b = 128;
        this.f2944c = 256;
        this.f2945d = 1024;
        this.f2946e = 10;
        this.f2947h = null;
        try {
            m2626b(f2942g);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.s$a */
    /* JADX INFO: compiled from: 15SY */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0723s f2948a = new C0723s();
    }

    /* JADX INFO: renamed from: a */
    public static C0723s m2620a(Context context) {
        if (f2942g == null && context != null) {
            f2942g = context.getApplicationContext();
        }
        return a.f2948a;
    }

    /* JADX INFO: renamed from: a */
    public void m2631a(String str, String str2, long j, int i, String str3) {
        String strM2675a;
        try {
            if (m2625a(str) && m2627b(str2)) {
                if (Arrays.asList(C0708d.f2618aG).contains(str)) {
                    MLog.m2947e("key is " + str + ", please check key, illegal");
                    UMLog.m2750aq(C0714j.f2822m, 0, "\\|");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", jCurrentTimeMillis);
                if (j > 0) {
                    jSONObject.put(C0708d.f2607W, j);
                }
                jSONObject.put("__t", C0713i.f2746a);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
                if (UMUtils.isMainProgress(f2942g)) {
                    strM2675a = C0729y.m2667a().m2682d(UMGlobalContext.getAppContext(f2942g));
                } else {
                    strM2675a = C0729y.m2667a().m2675a(UMGlobalContext.getAppContext(f2942g), jCurrentTimeMillis);
                }
                if (TextUtils.isEmpty(strM2675a)) {
                    strM2675a = "-1";
                }
                jSONObject.put("__i", strM2675a);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C0708d.f2640au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f2942g).getProcessName(f2942g));
                m2622a();
                JSONObject jSONObject3 = this.f2947h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f2947h.get(str)).booleanValue()) {
                    jSONObject.put(C0708d.f2609Y, 1);
                    this.f2947h.put(str, true);
                    m2629c(f2942g);
                }
                Context context = f2942g;
                UMWorkDispatch.sendEvent(context, C0719o.a.f2895a, CoreProtocol.getInstance(context), jSONObject);
                return;
            }
            UMLog.m2750aq(C0714j.f2821l, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2632a(String str, Map map, long j, String str2, boolean z) {
        String strM2675a;
        try {
            if (!m2625a(str)) {
                UMLog.m2750aq(C0714j.f2815f, 0, "\\|");
                return;
            }
            if (m2628b(map)) {
                if (map.size() > 100) {
                    MLog.m2947e("map size is " + map.size() + ", please check");
                    return;
                }
                if (Arrays.asList(C0708d.f2618aG).contains(str)) {
                    MLog.m2947e("key is " + str + ", please check key, illegal");
                    UMLog.m2750aq(C0714j.f2811b, 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j > 0) {
                    jSONObject.put(C0708d.f2607W, j);
                }
                jSONObject.put("__t", C0713i.f2746a);
                ULog.m2983i("befort ekv map, event is " + jSONObject.toString());
                for (Map.Entry entry : map.entrySet()) {
                    if (!Arrays.asList(C0708d.f2618aG).contains(entry.getKey())) {
                        Object value = entry.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long) || (value instanceof Short) || (value instanceof Float) || (value instanceof Double)) {
                            jSONObject.put((String) entry.getKey(), value);
                        } else if (value.getClass().isArray()) {
                            if (value instanceof int[]) {
                                int[] iArr = (int[]) value;
                                if (iArr.length > 10) {
                                    MLog.m2947e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray = new JSONArray();
                                for (int i : iArr) {
                                    jSONArray.put(i);
                                }
                                jSONObject.put((String) entry.getKey(), jSONArray);
                            } else if (value instanceof double[]) {
                                double[] dArr = (double[]) value;
                                if (dArr.length > 10) {
                                    MLog.m2947e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray2 = new JSONArray();
                                for (double d : dArr) {
                                    jSONArray2.put(d);
                                }
                                jSONObject.put((String) entry.getKey(), jSONArray2);
                            } else if (value instanceof long[]) {
                                long[] jArr = (long[]) value;
                                if (jArr.length > 10) {
                                    MLog.m2947e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray3 = new JSONArray();
                                for (long j2 : jArr) {
                                    jSONArray3.put(j2);
                                }
                                jSONObject.put((String) entry.getKey(), jSONArray3);
                            } else if (value instanceof float[]) {
                                float[] fArr = (float[]) value;
                                if (fArr.length > 10) {
                                    MLog.m2947e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray4 = new JSONArray();
                                for (float f : fArr) {
                                    jSONArray4.put(f);
                                }
                                jSONObject.put((String) entry.getKey(), jSONArray4);
                            } else if (value instanceof short[]) {
                                short[] sArr = (short[]) value;
                                if (sArr.length > 10) {
                                    MLog.m2947e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray5 = new JSONArray();
                                for (short s : sArr) {
                                    jSONArray5.put((int) s);
                                }
                                jSONObject.put((String) entry.getKey(), jSONArray5);
                            } else if (value instanceof String[]) {
                                String[] strArr = (String[]) value;
                                if (strArr.length > 10) {
                                    MLog.m2947e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray6 = new JSONArray();
                                for (int i2 = 0; i2 < strArr.length; i2++) {
                                    String str3 = strArr[i2];
                                    if (str3 == null) {
                                        MLog.m2947e("please check array, null item!");
                                        return;
                                    } else {
                                        if (!m2627b(str3)) {
                                            return;
                                        }
                                        jSONArray6.put(strArr[i2]);
                                    }
                                }
                                jSONObject.put((String) entry.getKey(), jSONArray6);
                            } else {
                                MLog.m2947e("please check key or value, illegal type!");
                                return;
                            }
                        } else {
                            MLog.m2947e("please check key or value, illegal type!");
                            return;
                        }
                    } else {
                        UMLog.m2750aq(C0714j.f2814e, 0, "\\|");
                        return;
                    }
                }
                if (UMUtils.isMainProgress(f2942g)) {
                    strM2675a = C0729y.m2667a().m2682d(UMGlobalContext.getAppContext(f2942g));
                } else {
                    strM2675a = C0729y.m2667a().m2675a(UMGlobalContext.getAppContext(f2942g), jSONObject.getLong("ts"));
                }
                if (TextUtils.isEmpty(strM2675a)) {
                    strM2675a = "-1";
                }
                jSONObject.put("__i", strM2675a);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C0708d.f2640au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f2942g).getProcessName(f2942g));
                m2622a();
                JSONObject jSONObject3 = this.f2947h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f2947h.get(str)).booleanValue()) {
                    jSONObject.put(C0708d.f2609Y, 1);
                    this.f2947h.put(str, true);
                    m2629c(f2942g);
                }
                ULog.m2983i("----->>>>>ekv event json is " + jSONObject.toString());
                if (!z) {
                    Context context = f2942g;
                    UMWorkDispatch.sendEvent(context, C0719o.a.f2895a, CoreProtocol.getInstance(context), jSONObject);
                } else {
                    Context context2 = f2942g;
                    UMWorkDispatch.sendEvent(context2, C0719o.a.f2908n, CoreProtocol.getInstance(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2633a(String str, Map map, String str2) {
        try {
            if (m2625a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C0708d.f2607W, 0);
                jSONObject.put("__t", C0713i.f2747b);
                ULog.m2983i("befort gkv map, event is " + jSONObject.toString());
                Iterator it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!C0708d.f2609Y.equals(entry.getKey()) && !C0708d.f2607W.equals(entry.getKey()) && !"id".equals(entry.getKey()) && !"ts".equals(entry.getKey())) {
                        Object value = entry.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put((String) entry.getKey(), value);
                        }
                    }
                }
                String strM2682d = C0729y.m2667a().m2682d(UMGlobalContext.getAppContext(f2942g));
                if (TextUtils.isEmpty(strM2682d)) {
                    strM2682d = "-1";
                }
                jSONObject.put("__i", strM2682d);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C0708d.f2640au, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f2942g).getProcessName(f2942g));
                ULog.m2983i("----->>>>>gkv event json is " + jSONObject.toString());
                Context context = f2942g;
                UMWorkDispatch.sendEvent(context, C0719o.a.f2896b, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2626b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f2940a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f2947h = new JSONObject(string);
            }
            m2622a();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2622a() {
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f2942g, "track_list", "");
            if (TextUtils.isEmpty(strImprintProperty)) {
                return;
            }
            String[] strArrSplit = strImprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i = 0;
            if (this.f2947h != null) {
                for (String str : strArrSplit) {
                    String strSubStr = HelperUtils.subStr(str, 128);
                    if (this.f2947h.has(strSubStr)) {
                        jSONObject.put(strSubStr, this.f2947h.get(strSubStr));
                    }
                }
            }
            this.f2947h = new JSONObject();
            if (strArrSplit.length >= 10) {
                while (i < 10) {
                    m2623a(strArrSplit[i], jSONObject);
                    i++;
                }
            } else {
                while (i < strArrSplit.length) {
                    m2623a(strArrSplit[i], jSONObject);
                    i++;
                }
            }
            m2629c(f2942g);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2623a(String str, JSONObject jSONObject) {
        String strSubStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(strSubStr)) {
            m2624a(strSubStr, ((Boolean) jSONObject.get(strSubStr)).booleanValue());
        } else {
            m2624a(strSubStr, false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2624a(String str, boolean z) {
        try {
            if (C0708d.f2609Y.equals(str) || C0708d.f2607W.equals(str) || "id".equals(str) || "ts".equals(str) || this.f2947h.has(str)) {
                return;
            }
            this.f2947h.put(str, z);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2629c(Context context) {
        try {
            if (this.f2947h != null) {
                PreferenceWrapper.getDefault(f2942g).edit().putString(f2940a, this.f2947h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2634a(List list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    m2622a();
                    JSONObject jSONObject = this.f2947h;
                    if (jSONObject == null) {
                        this.f2947h = new JSONObject();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            JSONObject jSONObject2 = this.f2947h;
                            if (jSONObject2 == null) {
                                this.f2947h = new JSONObject();
                            } else if (jSONObject2.length() >= 5) {
                                break;
                            }
                            String str = (String) list.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                m2624a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        m2629c(f2942g);
                        return;
                    }
                    if (jSONObject.length() >= 5) {
                        MLog.m2941d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (this.f2947h.length() >= 5) {
                            MLog.m2941d(" add setFistLaunchEvent over.");
                            return;
                        }
                        m2624a(HelperUtils.subStr((String) list.get(i2), 128), false);
                    }
                    m2629c(f2942g);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.m2750aq(C0714j.f2803ak, 0, "\\|");
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m2621a(Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                try {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        String strSubStr = HelperUtils.subStr(str, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i < iArr.length) {
                                        jSONArray.put(iArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i < dArr.length) {
                                        jSONArray2.put(dArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i < jArr.length) {
                                        jSONArray3.put(jArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i < fArr.length) {
                                        jSONArray4.put(fArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i < sArr.length) {
                                        jSONArray5.put((int) sArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(strSubStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i < list.size()) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i));
                                    }
                                    i++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(strSubStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(strSubStr, HelperUtils.subStr(value.toString(), 256));
                            } else if ((value instanceof Long) || (value instanceof Integer) || (value instanceof Float) || (value instanceof Double) || (value instanceof Short)) {
                                jSONObject.put(strSubStr, value);
                            } else {
                                MLog.m2947e("The param has not support type. please check !");
                            }
                        }
                    }
                } catch (Exception e) {
                    MLog.m2951e(e);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2625a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.m2947e("key is " + str + ", please check key, illegal");
        return false;
    }

    /* JADX INFO: renamed from: b */
    private boolean m2627b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.m2947e("value is " + str + ", please check value, illegal");
        return false;
    }

    /* JADX INFO: renamed from: c */
    private boolean m2630c(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m2628b(Map map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!m2625a((String) entry.getKey())) {
                            UMLog.m2750aq(C0714j.f2817h, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            UMLog.m2750aq(C0714j.f2818i, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if (C0708d.f2616aE.equals(entry.getKey())) {
                                if (!m2630c(entry.getValue().toString())) {
                                    UMLog.m2750aq(C0714j.f2781P, 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!m2630c(entry.getValue().toString())) {
                                    UMLog.m2750aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!m2627b(entry.getValue().toString())) {
                                UMLog.m2750aq(C0714j.f2819j, 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        UMLog.m2750aq(C0714j.f2816g, 0, "\\|");
        return false;
    }
}
