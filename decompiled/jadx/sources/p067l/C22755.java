package p067l;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩸۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C22755 {

    /* JADX INFO: renamed from: ܿ */
    public static SharedPreferences f71762;

    /* JADX INFO: renamed from: ֫ */
    public String f71763;

    /* JADX INFO: renamed from: ۧ */
    public String f71764;

    /* JADX INFO: renamed from: ܽ */
    public long f71765 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public C23800 f71766;

    public C22755() {
        try {
            new C16718(this).start();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m50934() {
        return this.f71763 != null && System.currentTimeMillis() < this.f71765;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50929() {
        return this.f71763;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50931(String str, String str2) {
        this.f71763 = str;
        this.f71765 = 0L;
        if (str2 != null) {
            this.f71765 = (Long.parseLong(str2) * 1000) + System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m50933() {
        return this.f71764;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50930(String str) {
        this.f71764 = str;
        C13562.m30863().m30867(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50932(JSONObject jSONObject) {
        try {
            m50926("saveSession");
            return m50925(jSONObject, this.f71766);
        } catch (Exception e) {
            C11060.m25469("openSDK_LOG.QQToken", "login saveSession" + e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public synchronized void m50926(String str) {
        if (this.f71766 == null) {
            C11060.m25469("openSDK_LOG.QQToken", "initAESUtils ".concat(str));
            this.f71766 = new C23800(C24158.m53410());
            C11060.m25469("openSDK_LOG.QQToken", "initAESUtils " + str + " end");
        }
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: ᩳ */
    public static synchronized SharedPreferences m50928() {
        if (f71762 == null) {
            f71762 = C24158.m53410().getSharedPreferences("token_info_file", 0);
        }
        return f71762;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized boolean m50925(JSONObject jSONObject, C23800 c23800) {
        if (C24158.m53410() == null) {
            C11060.m25469("openSDK_LOG.QQToken", "saveJsonPreference context null");
            return false;
        }
        try {
            String string = jSONObject.getString("expires_in");
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("expires_time", (Long.parseLong(string) * 1000) + System.currentTimeMillis());
                String str = Base64.encodeToString(C19797.m45009("101492915"), 2) + "_aes_google";
                String strM52894 = c23800.m52894(jSONObject.toString());
                if (str.length() > 6 && strM52894 != null) {
                    m50928().edit().putString(str, strM52894).commit();
                    C11060.m25469("openSDK_LOG.QQToken", "saveJsonPreference sucess");
                    return true;
                }
                C11060.m25469("openSDK_LOG.QQToken", "saveJsonPreference keyEncode or josnEncode null");
                return false;
            }
            C11060.m25469("openSDK_LOG.QQToken", "expires is null");
            return false;
        } catch (Exception e) {
            C11060.m25467("openSDK_LOG.QQToken", "saveJsonPreference exception:" + e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50927(String str) {
        SharedPreferences.Editor editorEdit = m50928().edit();
        editorEdit.remove(Base64.encodeToString(C19797.m45009(str), 2) + "_spkey");
        editorEdit.remove(Base64.encodeToString(C19797.m45009(str), 2) + "_spkey");
        editorEdit.remove(Base64.encodeToString(C19797.m45009(str), 2) + "_aes_google");
        editorEdit.apply();
        C11060.m25469("openSDK_LOG.QQToken", "removeSession sucess");
    }
}
