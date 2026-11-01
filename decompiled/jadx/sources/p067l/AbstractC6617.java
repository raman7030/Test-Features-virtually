package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۙۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P7A5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6617 {
    /* JADX INFO: renamed from: ֫ */
    public abstract C14663 mo5348(JSONObject jSONObject);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo5349();

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo5350();

    /* JADX INFO: renamed from: ܽ */
    public abstract JSONObject mo5351();

    /* JADX INFO: renamed from: ܿ */
    public abstract JSONObject mo5352();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo5353();

    /* JADX INFO: renamed from: ֫ */
    public JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObjectAdd = JSON.object().add("errorCode", c5276.f12413).add("message", c5276.getMessage()).add("recoverable", c5276.f12410).add("retrySameArguments", c5276.f12409).add("errorSeverity", c5276.f12414).add("nextActions", c5276.f12407);
        for (JSONObject.Member member : c5276.f12412) {
            String name = member.getName();
            if (!"errorCode".equals(name) && !"message".equals(name) && !"recoverable".equals(name) && !"retrySameArguments".equals(name) && !"errorSeverity".equals(name) && !"nextActions".equals(name)) {
                jSONObjectAdd.put(name, member.getValue());
            }
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ֫ */
    public JSONObject mo5346() {
        return JSON.object();
    }
}
