package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۫ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14243 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f40555;

    /* JADX INFO: renamed from: ۧ */
    public final C8208 f40556;

    public C14243(C8208 c8208, int i) {
        this.f40556 = c8208;
        this.f40555 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14243)) {
            return false;
        }
        C14243 c14243 = (C14243) obj;
        return this.f40555 == c14243.f40555 && C12826.equals(this.f40556, c14243.f40556);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f40556) + (this.f40555 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f40556, Integer.valueOf(this.f40555)};
        String[] strArrSplit = "source;charset".length() == 0 ? new String[0] : "source;charset".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14243.class, sb, "[");
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
}
