package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֨᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3749 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f7960;

    /* JADX INFO: renamed from: ۧ */
    public final int f7961;

    public C3749(String str, int i) {
        this.f7960 = str;
        this.f7961 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3749)) {
            return false;
        }
        C3749 c3749 = (C3749) obj;
        return this.f7961 == c3749.f7961 && C12826.equals(this.f7960, c3749.f7960);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f7960) + (this.f7961 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f7960, Integer.valueOf(this.f7961)};
        String[] strArrSplit = "path;sortingData".length() == 0 ? new String[0] : "path;sortingData".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3749.class, sb, "[");
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
    public final String m7236() {
        return this.f7960;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m7237() {
        return this.f7961;
    }
}
