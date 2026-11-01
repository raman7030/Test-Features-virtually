package p067l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۧܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12917 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f36313;

    /* JADX INFO: renamed from: ۧ */
    public String f36314;

    /* JADX INFO: renamed from: ܳ */
    public boolean f36315;

    /* JADX INFO: renamed from: ܽ */
    public boolean f36316;

    /* JADX INFO: renamed from: ܿ */
    public boolean f36317;

    /* JADX INFO: renamed from: ᩳ */
    public String f36318;

    /* JADX INFO: renamed from: ֫ */
    public final String m29594() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pattern", this.f36318);
            jSONObject.put("obf", this.f36316);
            jSONObject.put("keep", this.f36313);
            jSONObject.put("xp", this.f36315);
            jSONObject.put("vfy", this.f36317);
            jSONObject.put("map", this.f36314);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29595(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pattern")) {
                this.f36318 = jSONObject.getString("pattern");
            }
            if (jSONObject.has("obf")) {
                this.f36316 = jSONObject.getBoolean("obf");
            }
            if (jSONObject.has("keep")) {
                this.f36313 = jSONObject.getBoolean("keep");
            }
            if (jSONObject.has("xp")) {
                this.f36315 = jSONObject.getBoolean("xp");
            }
            if (jSONObject.has("vfy")) {
                this.f36317 = jSONObject.getBoolean("vfy");
            }
            if (jSONObject.has("map")) {
                this.f36314 = jSONObject.getString("map");
            }
        } catch (JSONException unused) {
        }
    }
}
