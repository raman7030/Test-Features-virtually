package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.r */
/* JADX INFO: compiled from: A46G */
/* JADX INFO: loaded from: classes.dex */
public class C0722r {

    /* JADX INFO: renamed from: a */
    public static final int f2934a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f2935b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f2936c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f2937d = 3;

    /* JADX INFO: renamed from: e */
    public final long f2938e;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.r$a */
    /* JADX INFO: compiled from: A46G */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0722r f2939a = new C0722r();
    }

    public C0722r() {
        this.f2938e = 60000L;
    }

    /* JADX INFO: renamed from: a */
    public static C0722r m2613a() {
        return a.f2939a;
    }

    /* JADX INFO: renamed from: a */
    public int m2617a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* JADX INFO: renamed from: a */
    private void m2614a(JSONObject jSONObject, boolean z) {
        if (!z && jSONObject.has(C0708d.f2658n)) {
            jSONObject.remove(C0708d.f2658n);
        }
        if (jSONObject.has(C0708d.f2596L)) {
            jSONObject.remove(C0708d.f2596L);
        }
        if (jSONObject.has(C0708d.f2599O)) {
            jSONObject.remove(C0708d.f2599O);
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has(C0708d.f2604T)) {
            jSONObject.remove(C0708d.f2604T);
        }
        if (jSONObject.has(C0708d.f2596L)) {
            jSONObject.remove(C0708d.f2596L);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2618a(JSONObject jSONObject, Context context) {
        int iM2617a = m2617a(context);
        if (iM2617a == 1) {
            m2614a(jSONObject, true);
            C0713i.m2480a(context).m2503b(false, true);
        } else {
            if (iM2617a == 2) {
                jSONObject.remove(C0708d.f2658n);
                try {
                    jSONObject.put(C0708d.f2658n, m2615b());
                } catch (Exception unused) {
                }
                m2614a(jSONObject, true);
                C0713i.m2480a(context).m2503b(false, true);
                return;
            }
            if (iM2617a == 3) {
                m2614a(jSONObject, false);
                C0713i.m2480a(context).m2503b(false, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2619b(JSONObject jSONObject, Context context) {
        int iM2617a = m2617a(context);
        if (iM2617a == 1) {
            if (jSONObject.has(C0708d.f2596L)) {
                jSONObject.remove(C0708d.f2596L);
            }
            if (jSONObject.has(C0708d.f2658n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(C0708d.f2658n);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has(C0708d.f2640au)) {
                            jSONObject2.remove(C0708d.f2640au);
                        }
                        if (jSONObject2.has(C0708d.f2641av)) {
                            jSONObject2.remove(C0708d.f2641av);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            C0713i.m2480a(context).m2497a(false, true);
            return;
        }
        if (iM2617a == 2) {
            if (jSONObject.has(C0708d.f2596L)) {
                jSONObject.remove(C0708d.f2596L);
            }
            if (jSONObject.has(C0708d.f2658n)) {
                jSONObject.remove(C0708d.f2658n);
            }
            try {
                jSONObject.put(C0708d.f2658n, m2616c());
            } catch (Exception unused2) {
            }
            C0713i.m2480a(context).m2497a(false, true);
            return;
        }
        if (iM2617a == 3) {
            if (jSONObject.has(C0708d.f2596L)) {
                jSONObject.remove(C0708d.f2596L);
            }
            jSONObject.remove(C0708d.f2658n);
            C0713i.m2480a(context).m2497a(false, true);
        }
    }

    /* JADX INFO: renamed from: b */
    private JSONArray m2615b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C0729y.m2667a().m2674a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C0708d.f2660p, jCurrentTimeMillis);
            jSONObject.put(C0708d.f2661q, jCurrentTimeMillis + 60000);
            jSONObject.put("duration", 60000L);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: c */
    private JSONArray m2616c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C0729y.m2667a().m2682d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C0708d.f2660p, jCurrentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
