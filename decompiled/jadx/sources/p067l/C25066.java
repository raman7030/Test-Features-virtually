package p067l;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S78W */
/* JADX INFO: loaded from: classes.dex */
public final class C25066 {

    /* JADX INFO: renamed from: ֫ */
    public final SharedPreferences f79971;

    public C25066() {
        this(C7050.m16232());
    }

    public C25066(Application application) {
        this.f79971 = application.getSharedPreferences("remote_auth", 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m55029() {
        String string = this.f79971.getString("trusted_devices_json", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObjectM19681 = C8461.m19681(string);
            if (C8461.m19688(jSONObjectM19681, "version") != 2) {
                m55027();
                return new ArrayList();
            }
            try {
                JSONArray jSONArray = jSONObjectM19681.getJSONArray("devices");
                if (jSONArray == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    C16348 c16348M55025 = m55025(jSONArray, i);
                    if (c16348M55025 != null) {
                        arrayList.add(c16348M55025);
                    }
                }
                return arrayList;
            } catch (RuntimeException e) {
                throw C8461.m19686(e);
            }
        } catch (C24554 unused) {
            m55027();
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55030(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16348 c16348 = (C16348) it.next();
            jSONArray.add(new JSONObject().add("deviceId", c16348.f48031).add("deviceName", c16348.f48033).add("publicKey", c16348.f48034).add("firstAccessAt", c16348.f48035).add("lastAccessAt", c16348.f48037).add("lastIp", c16348.f48036).add("userAgent", c16348.f48032).add("temporary", c16348.f48038));
        }
        jSONObject.add("version", 2);
        jSONObject.add("devices", jSONArray);
        this.f79971.edit().putString("trusted_devices_json", jSONObject.toString()).apply();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m55027() {
        this.f79971.edit().putString("trusted_devices_json", new JSONObject().add("version", 2).add("devices", new JSONArray()).toString()).commit();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m55031(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayListM55029 = m55029();
        boolean zRemoveIf = C7480.removeIf(arrayListM55029, new Predicate() { // from class: l.ܿᩴۢ
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
            public /* synthetic */ Predicate m43230or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C16348) obj).f48031);
            }
        });
        if (zRemoveIf) {
            m55030(arrayListM55029);
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m55028(ArrayList arrayList) {
        C8150.sort(arrayList, C16866.reversed(C10162.comparingLong(new C19702())));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16348 m55025(JSONArray jSONArray, int i) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C16348 c16348 = new C16348();
            String strM19689 = C8461.m19689(jSONObject, "deviceId");
            c16348.f48031 = strM19689;
            if (TextUtils.isEmpty(strM19689)) {
                return null;
            }
            c16348.f48033 = C8461.m19689(jSONObject, "deviceName");
            c16348.f48034 = C8461.m19689(jSONObject, "publicKey");
            c16348.f48035 = C8461.m19688(jSONObject, "firstAccessAt");
            c16348.f48037 = C8461.m19688(jSONObject, "lastAccessAt");
            c16348.f48036 = C8461.m19689(jSONObject, "lastIp");
            c16348.f48032 = C8461.m19689(jSONObject, "userAgent");
            c16348.f48038 = false;
            return c16348;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18360 m55026(C16348 c16348) {
        return new C18360(c16348.f48031, c16348.f48033, c16348.f48035, c16348.f48037, c16348.f48036, c16348.f48032, c16348.f48038);
    }
}
