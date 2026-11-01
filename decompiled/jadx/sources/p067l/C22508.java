package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E15S */
/* JADX INFO: loaded from: classes4.dex */
public final class C22508 {

    /* JADX INFO: renamed from: ۧ */
    public int f70973;

    /* JADX INFO: renamed from: ᩳ */
    public int f70975;

    /* JADX INFO: renamed from: ܽ */
    public C21167 f70974 = new C21167();

    /* JADX INFO: renamed from: ֫ */
    public C25189 f70972 = new C25189();

    /* JADX INFO: renamed from: ۧ */
    public final JSONObject m50471() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("b", this.f70974.m47777());
            jSONObject.put("e", this.f70972.m55260());
            jSONObject.put(C0655am.f2278aF, this.f70973);
            jSONObject.put("d", this.f70975);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m50470() {
        StringBuilder sb = new StringBuilder();
        int i = this.f70973;
        if (i == 0) {
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f70974.m47775());
        } else if (i == 1) {
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f70974.m47775());
        } else if (i == 2) {
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f70972.m55258());
        }
        return sb.toString();
    }
}
