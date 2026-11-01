package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.vshelper.InterfaceC0741a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.v */
/* JADX INFO: compiled from: V4TG */
/* JADX INFO: loaded from: classes.dex */
public class C0726v {

    /* JADX INFO: renamed from: c */
    public static final int f2963c = 5;

    /* JADX INFO: renamed from: d */
    public static JSONArray f2964d = new JSONArray();

    /* JADX INFO: renamed from: e */
    public static Object f2965e = new Object();

    /* JADX INFO: renamed from: f */
    public final Map f2968f = new HashMap();

    /* JADX INFO: renamed from: a */
    public Stack f2966a = new Stack();

    /* JADX INFO: renamed from: b */
    public InterfaceC0741a f2967b = PageNameMonitor.getInstance();

    /* JADX INFO: renamed from: a */
    public int mo2515a() {
        return 2;
    }

    /* JADX INFO: renamed from: a */
    public static void m2657a(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f2965e) {
                    string = f2964d.toString();
                    f2964d = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__a", new JSONArray(string));
                    if (jSONObject.length() > 0) {
                        C0713i.m2480a(context).m2499a(C0725u.m2637a().m2653c(), jSONObject, C0713i.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2658a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f2966a.size() != 0) {
            String[] strArr = {(String) this.f2966a.peek()};
            UMLog.m2752aq(C0714j.f2771F, 0, "\\|", new String[]{"@"}, strArr, null, null);
        }
        this.f2967b.customPageBegin(str);
        synchronized (this.f2968f) {
            this.f2968f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f2966a.push(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2660b(String str) {
        Long l2;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f2968f.containsKey(str)) {
            synchronized (this.f2968f) {
                l2 = (Long) this.f2968f.get(str);
                this.f2968f.remove(str);
            }
            if (l2 == null) {
                return;
            }
            if (UMConfigure.isDebugLog() && this.f2966a.size() > 0 && str.equals(this.f2966a.peek())) {
                this.f2966a.pop();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - l2.longValue();
            synchronized (f2965e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0708d.f2666v, str);
                    jSONObject.put("duration", jCurrentTimeMillis);
                    jSONObject.put(C0708d.f2668x, l2);
                    jSONObject.put("type", mo2515a());
                    f2964d.put(jSONObject);
                    if (f2964d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                        UMWorkDispatch.sendEvent(appContext, C0719o.a.f2897c, CoreProtocol.getInstance(appContext), null);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!UMConfigure.isDebugLog() || this.f2966a.size() == 0) {
                return;
            }
            UMLog.m2752aq(C0714j.f2770E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
            return;
        }
        if (UMConfigure.isDebugLog() && this.f2966a.size() == 0) {
            UMLog.m2752aq(C0714j.f2772G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2659b() {
        String str;
        synchronized (this.f2968f) {
            str = null;
            long jLongValue = 0;
            for (Map.Entry entry : this.f2968f.entrySet()) {
                if (((Long) entry.getValue()).longValue() > jLongValue) {
                    jLongValue = ((Long) entry.getValue()).longValue();
                    str = (String) entry.getKey();
                }
            }
        }
        if (str != null) {
            m2660b(str);
        }
    }
}
