package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.n.c;

/* JADX INFO: renamed from: l.۟ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7375 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1936 m19822(JSONObject jSONObject) {
        C1936 c1936 = new C1936(jSONObject.getInt("id"));
        c1936.f6478 = jSONObject.getString(c.f);
        c1936.f6481 = jSONObject.getInt("port");
        c1936.f11359 = jSONObject.getString("remark");
        c1936.f6479 = jSONObject.getString("username");
        c1936.f6482 = jSONObject.getString("password");
        c1936.f11354 = jSONObject.getString("startPath");
        c1936.f6477 = jSONObject.getString("charset");
        c1936.f6480 = jSONObject.getBoolean("passive");
        return c1936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1936 m19823(C12951 c12951) {
        c12951.readByte();
        C1936 c1936 = new C1936(c12951.readInt());
        c1936.f6481 = c12951.readInt();
        c12951.m31498();
        c1936.f6480 = c12951.m31498();
        c1936.f6478 = c12951.m31504();
        c1936.f6479 = c12951.m31504();
        c1936.f6482 = c12951.m31504();
        c1936.f11359 = c12951.m31504();
        c1936.f11354 = c12951.m31504();
        c1936.f6477 = c12951.m31504();
        if (!c1936.f11354.startsWith(":")) {
            c1936.f11354 = "";
            return c1936;
        }
        c1936.f11354 = c1936.f11354.substring(1);
        return c1936;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1936 m19824(C12951 c12951) {
        c12951.readByte();
        C1936 c1936 = new C1936(c12951.readInt());
        c1936.f6481 = c12951.readInt();
        c12951.m31498();
        c1936.f6478 = c12951.m31504();
        c1936.f6479 = c12951.m31504();
        c1936.f6482 = c12951.m31504();
        c1936.f11359 = c12951.m31504();
        c1936.f11354 = c12951.m31504();
        c1936.f6477 = c12951.m31504();
        if (!c1936.f11354.startsWith(":")) {
            c1936.f11354 = "";
            return c1936;
        }
        c1936.f11354 = c1936.f11354.substring(1);
        return c1936;
    }
}
