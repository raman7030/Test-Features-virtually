package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۗܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5579 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f13482;

    /* JADX INFO: renamed from: ۧ */
    public final int f13483;

    public C5579(int i, int i2) {
        this.f13483 = i;
        this.f13482 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5579)) {
            return false;
        }
        C5579 c5579 = (C5579) obj;
        return this.f13483 == c5579.f13483 && this.f13482 == c5579.f13482;
    }

    public final int hashCode() {
        return (this.f13483 * 31) + this.f13482;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f13483), Integer.valueOf(this.f13482)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C5579.class, sb, "[");
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
