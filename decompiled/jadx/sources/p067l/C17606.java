package p067l;

import bin.p000mt.json.JSONArray;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܺܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17606 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final JSONArray f52617;

    /* JADX INFO: renamed from: ۧ */
    public final C19619 f52618;

    /* JADX INFO: renamed from: ܽ */
    public final JSONArray f52619;

    public C17606(C19619 c19619, JSONArray jSONArray, JSONArray jSONArray2) {
        this.f52618 = c19619;
        this.f52619 = jSONArray;
        this.f52617 = jSONArray2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17606)) {
            return false;
        }
        C17606 c17606 = (C17606) obj;
        return C12826.equals(this.f52618, c17606.f52618) && C12826.equals(this.f52619, c17606.f52619) && C12826.equals(this.f52617, c17606.f52617);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f52617) + ((C12826.hashCode(this.f52619) + (C12826.hashCode(this.f52618) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f52618, this.f52619, this.f52617};
        String[] strArrSplit = "page;warnings;failedFiles".length() == 0 ? new String[0] : "page;warnings;failedFiles".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C17606.class, sb, "[");
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
    public final JSONArray m40088() {
        return this.f52617;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C19619 m40089() {
        return this.f52618;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final JSONArray m40090() {
        return this.f52619;
    }
}
