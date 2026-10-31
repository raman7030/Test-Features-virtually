package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩷᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E15S */
/* JADX INFO: loaded from: classes4.dex */
public final class C21190 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f68291;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f68293;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19779 f68292 = new C19779();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C24011 f68290 = new C24011();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m48141() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("b", this.f68292.m45466());
            jSONObject.put("e", this.f68290.m52854());
            jSONObject.put(am.aF, this.f68291);
            jSONObject.put("d", this.f68293);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48140() {
        StringBuilder sb = new StringBuilder();
        int i = this.f68291;
        if (i == 0) {
            sb.append(C4925.m14327(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f68292.m45464());
        } else if (i == 1) {
            sb.append(C4925.m14327(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f68292.m45464());
        } else if (i == 2) {
            sb.append(C4925.m14327(R.string.MT_Protector));
            sb.append('\n');
            sb.append(this.f68290.m52852());
        }
        return sb.toString();
    }
}
