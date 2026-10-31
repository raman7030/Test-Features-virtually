package l;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S78W */
/* JADX INFO: loaded from: classes.dex */
public final class C23882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SharedPreferences f77220;

    public C23882() {
        this(C4925.m14335());
    }

    public C23882(Application application) {
        this.f77220 = application.getSharedPreferences("remote_auth", 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m52620() {
        String string = this.f77220.getString("trusted_devices_json", "");
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        try {
            JSONObject jSONObjectM17734 = C6411.m17734(string);
            if (C6411.m17741(jSONObjectM17734, "version") != 2) {
                m52618();
                return new ArrayList();
            }
            try {
                JSONArray jSONArray = jSONObjectM17734.getJSONArray("devices");
                if (jSONArray == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    C14709 c14709M52616 = m52616(jSONArray, i);
                    if (c14709M52616 != null) {
                        arrayList.add(c14709M52616);
                    }
                }
                return arrayList;
            } catch (RuntimeException e) {
                throw C6411.m17739(e);
            }
        } catch (C23344 unused) {
            m52618();
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52621(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14709 c14709 = (C14709) it.next();
            jSONArray.add(new JSONObject().add("deviceId", c14709.f44917).add("deviceName", c14709.f44919).add("publicKey", c14709.f44920).add("firstAccessAt", c14709.f44921).add("lastAccessAt", c14709.f44923).add("lastIp", c14709.f44922).add("userAgent", c14709.f44918).add("temporary", c14709.f44924));
        }
        jSONObject.add("version", 2);
        jSONObject.add("devices", jSONArray);
        this.f77220.edit().putString("trusted_devices_json", jSONObject.toString()).apply();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52618() {
        this.f77220.edit().putString("trusted_devices_json", new JSONObject().add("version", 2).add("devices", new JSONArray()).toString()).commit();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52622(final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayListM52620 = m52620();
        boolean zRemoveIf = C5378.removeIf(arrayListM52620, new Predicate() { // from class: l.ܿᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C14709) obj).f44917);
            }
        });
        if (zRemoveIf) {
            m52621(arrayListM52620);
        }
        return zRemoveIf;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52619(ArrayList arrayList) {
        C6083.sort(arrayList, C15254.reversed(C8200.comparingLong(new C18238())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14709 m52616(JSONArray jSONArray, int i) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C14709 c14709 = new C14709();
            String strM17742 = C6411.m17742(jSONObject, "deviceId");
            c14709.f44917 = strM17742;
            if (TextUtils.isEmpty(strM17742)) {
                return null;
            }
            c14709.f44919 = C6411.m17742(jSONObject, "deviceName");
            c14709.f44920 = C6411.m17742(jSONObject, "publicKey");
            c14709.f44921 = C6411.m17741(jSONObject, "firstAccessAt");
            c14709.f44923 = C6411.m17741(jSONObject, "lastAccessAt");
            c14709.f44922 = C6411.m17742(jSONObject, "lastIp");
            c14709.f44918 = C6411.m17742(jSONObject, "userAgent");
            c14709.f44924 = false;
            return c14709;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16826 m52617(C14709 c14709) {
        return new C16826(c14709.f44917, c14709.f44919, c14709.f44921, c14709.f44923, c14709.f44922, c14709.f44918, c14709.f44924);
    }
}
