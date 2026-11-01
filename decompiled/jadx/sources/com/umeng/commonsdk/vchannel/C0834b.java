package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p067l.C17588;
import p067l.C9179;

/* JADX INFO: renamed from: com.umeng.commonsdk.vchannel.b */
/* JADX INFO: compiled from: 4BMI */
/* JADX INFO: loaded from: classes.dex */
public class C0834b {

    /* JADX INFO: renamed from: b */
    public String f3667b;

    /* JADX INFO: renamed from: a */
    public String f3666a = "_$unknown";

    /* JADX INFO: renamed from: c */
    public long f3668c = 0;

    /* JADX INFO: renamed from: d */
    public long f3669d = 0;

    /* JADX INFO: renamed from: e */
    public String f3670e = C0833a.f3665j;

    /* JADX INFO: renamed from: f */
    public Map f3671f = null;

    /* JADX INFO: renamed from: a */
    public String m3316a() {
        return this.f3666a;
    }

    /* JADX INFO: renamed from: a */
    public void m3318a(String str) {
        this.f3666a = str;
    }

    /* JADX INFO: renamed from: b */
    public long m3320b() {
        return this.f3668c;
    }

    /* JADX INFO: renamed from: a */
    public void m3317a(long j) {
        this.f3668c = j;
    }

    /* JADX INFO: renamed from: c */
    public Map m3321c() {
        return this.f3671f;
    }

    /* JADX INFO: renamed from: a */
    public void m3319a(Map map) {
        this.f3671f = map;
    }

    public C0834b(Context context) {
        this.f3667b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[");
        sb.append("id:" + this.f3666a + ",");
        sb.append("pn:" + this.f3667b + ",");
        sb.append("ts:" + this.f3668c + ",");
        Map map = this.f3671f;
        if (map != null && map.size() > 0) {
            for (String str : this.f3671f.keySet()) {
                Object obj = this.f3671f.get(str);
                if (obj == null) {
                    string = C17588.m40053(str, ": null,");
                } else {
                    StringBuilder sbM21133 = C9179.m21133(str, ": ");
                    sbM21133.append(obj.toString());
                    sbM21133.append(",");
                    string = sbM21133.toString();
                }
                sb.append(string);
            }
        }
        sb.append("ds:" + this.f3669d + "]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m3322d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f3666a);
            jSONObject.put("pn", this.f3667b);
            jSONObject.put("ds", this.f3669d);
            jSONObject.put("ts", this.f3668c);
            Map map = this.f3671f;
            if (map != null && map.size() > 0) {
                for (String str : this.f3671f.keySet()) {
                    jSONObject.put(str, this.f3671f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f3670e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }
}
