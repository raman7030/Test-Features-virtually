package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۙۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P7A5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4470 {
    /* JADX INFO: renamed from: ֫ */
    public abstract C12936 mo3035(JSONObject jSONObject);

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo3036();

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo3037();

    /* JADX INFO: renamed from: ܽ */
    public abstract JSONObject mo3038();

    /* JADX INFO: renamed from: ܿ */
    public abstract JSONObject mo3039();

    /* JADX INFO: renamed from: ᩳ */
    public abstract String mo3040();

    /* JADX INFO: renamed from: ֫ */
    public JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObjectAdd = JSON.object().add("errorCode", c3059.f9610).add("message", c3059.getMessage()).add("recoverable", c3059.f9607).add("retrySameArguments", c3059.f9606).add("errorSeverity", c3059.f9611).add("nextActions", c3059.f9604);
        for (JSONObject.Member member : c3059.f9609) {
            String name = member.getName();
            if (!"errorCode".equals(name) && !"message".equals(name) && !"recoverable".equals(name) && !"retrySameArguments".equals(name) && !"errorSeverity".equals(name) && !"nextActions".equals(name)) {
                jSONObjectAdd.put(name, member.getValue());
            }
        }
        return jSONObjectAdd;
    }

    /* JADX INFO: renamed from: ֫ */
    public JSONObject mo3033() {
        return JSON.object();
    }
}
