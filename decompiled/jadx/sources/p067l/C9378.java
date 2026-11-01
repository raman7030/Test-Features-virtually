package p067l;

import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p037n.C0172c;

/* JADX INFO: renamed from: l.۟ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes3.dex */
public final class C9378 {
    /* JADX INFO: renamed from: ֫ */
    public static C4209 m21795(JSONObject jSONObject) {
        C4209 c4209 = new C4209(jSONObject.getInt("id"));
        c4209.f9258 = jSONObject.getString(C0172c.f710f);
        c4209.f9261 = jSONObject.getInt("port");
        c4209.f14164 = jSONObject.getString("remark");
        c4209.f9259 = jSONObject.getString("username");
        c4209.f9262 = jSONObject.getString("password");
        c4209.f14159 = jSONObject.getString("startPath");
        c4209.f9257 = jSONObject.getString("charset");
        c4209.f9260 = jSONObject.getBoolean("passive");
        return c4209;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4209 m21796(C14677 c14677) {
        c14677.readByte();
        C4209 c4209 = new C4209(c14677.readInt());
        c4209.f9261 = c14677.readInt();
        c14677.m33585();
        c4209.f9260 = c14677.m33585();
        c4209.f9258 = c14677.m33591();
        c4209.f9259 = c14677.m33591();
        c4209.f9262 = c14677.m33591();
        c4209.f14164 = c14677.m33591();
        c4209.f14159 = c14677.m33591();
        c4209.f9257 = c14677.m33591();
        if (!c4209.f14159.startsWith(":")) {
            c4209.f14159 = "";
            return c4209;
        }
        c4209.f14159 = c4209.f14159.substring(1);
        return c4209;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4209 m21797(C14677 c14677) {
        c14677.readByte();
        C4209 c4209 = new C4209(c14677.readInt());
        c4209.f9261 = c14677.readInt();
        c14677.m33585();
        c4209.f9258 = c14677.m33591();
        c4209.f9259 = c14677.m33591();
        c4209.f9262 = c14677.m33591();
        c4209.f14164 = c14677.m33591();
        c4209.f14159 = c14677.m33591();
        c4209.f9257 = c14677.m33591();
        if (!c4209.f14159.startsWith(":")) {
            c4209.f14159 = "";
            return c4209;
        }
        c4209.f14159 = c4209.f14159.substring(1);
        return c4209;
    }
}
