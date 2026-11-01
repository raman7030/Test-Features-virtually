package p067l;

import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֡ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2854 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f4914;

    /* JADX INFO: renamed from: ۧ */
    public final JSONObject f4915;

    public C2854(JSONObject jSONObject, String str) {
        this.f4915 = jSONObject;
        this.f4914 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2854)) {
            return false;
        }
        C2854 c2854 = (C2854) obj;
        return C12826.equals(this.f4915, c2854.f4915) && C12826.equals(this.f4914, c2854.f4914);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f4914) + (C12826.hashCode(this.f4915) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4915, this.f4914};
        String[] strArrSplit = "data;cursor".length() == 0 ? new String[0] : "data;cursor".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C2854.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫ */
    public final String m4580() {
        return this.f4914;
    }

    /* JADX INFO: renamed from: ܽ */
    public final JSONObject m4581() {
        return this.f4915;
    }
}
