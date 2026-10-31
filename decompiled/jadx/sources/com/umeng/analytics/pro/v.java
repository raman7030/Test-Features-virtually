package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
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

/* JADX INFO: compiled from: V4TG */
/* JADX INFO: loaded from: classes.dex */
public class v {
    public static final int c = 5;
    public static JSONArray d = new JSONArray();
    public static Object e = new Object();
    public final Map f = new HashMap();
    public Stack a = new Stack();
    public com.umeng.analytics.vshelper.a b = PageNameMonitor.getInstance();

    public int a() {
        return 2;
    }

    public static void a(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (e) {
                    string = d.toString();
                    d = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__a", new JSONArray(string));
                    if (jSONObject.length() > 0) {
                        i.a(context).a(u.a().c(), jSONObject, i.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.a.size() != 0) {
            String[] strArr = {(String) this.a.peek()};
            UMLog.aq(j.F, 0, "\\|", new String[]{"@"}, strArr, null, null);
        }
        this.b.customPageBegin(str);
        synchronized (this.f) {
            this.f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.a.push(str);
            }
        }
    }

    public void b(String str) {
        Long l2;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f.containsKey(str)) {
            synchronized (this.f) {
                l2 = (Long) this.f.get(str);
                this.f.remove(str);
            }
            if (l2 == null) {
                return;
            }
            if (UMConfigure.isDebugLog() && this.a.size() > 0 && str.equals(this.a.peek())) {
                this.a.pop();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - l2.longValue();
            synchronized (e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(d.v, str);
                    jSONObject.put("duration", jCurrentTimeMillis);
                    jSONObject.put(d.x, l2);
                    jSONObject.put("type", a());
                    d.put(jSONObject);
                    if (d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                        UMWorkDispatch.sendEvent(appContext, o.a.c, CoreProtocol.getInstance(appContext), null);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!UMConfigure.isDebugLog() || this.a.size() == 0) {
                return;
            }
            UMLog.aq(j.E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
            return;
        }
        if (UMConfigure.isDebugLog() && this.a.size() == 0) {
            UMLog.aq(j.G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    public void b() {
        String str;
        synchronized (this.f) {
            str = null;
            long jLongValue = 0;
            for (Map.Entry entry : this.f.entrySet()) {
                if (((Long) entry.getValue()).longValue() > jLongValue) {
                    jLongValue = ((Long) entry.getValue()).longValue();
                    str = (String) entry.getKey();
                }
            }
        }
        if (str != null) {
            b(str);
        }
    }
}
