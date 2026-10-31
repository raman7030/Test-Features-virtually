package l;

import bin.mt.json.JSONObject;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0511 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f2141;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject f2142;

    public C0511(JSONObject jSONObject, String str) {
        this.f2142 = jSONObject;
        this.f2141 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0511)) {
            return false;
        }
        C0511 c0511 = (C0511) obj;
        return C11003.equals(this.f2142, c0511.f2142) && C11003.equals(this.f2141, c0511.f2141);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f2141) + (C11003.hashCode(this.f2142) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f2142, this.f2141};
        String[] strArrSplit = "data;cursor".length() == 0 ? new String[0] : "data;cursor".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0511.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m2213() {
        return this.f2141;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONObject m2214() {
        return this.f2142;
    }
}
