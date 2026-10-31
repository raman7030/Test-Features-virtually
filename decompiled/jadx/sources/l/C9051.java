package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9051 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f27451;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f27452;

    public C9051(int i, byte[] bArr) {
        this.f27451 = i;
        this.f27452 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9051)) {
            return false;
        }
        C9051 c9051 = (C9051) obj;
        return this.f27451 == c9051.f27451 && C11003.equals(this.f27452, c9051.f27452);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f27452) + (this.f27451 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f27451), this.f27452};
        String[] strArrSplit = "algorithmId;signature".length() == 0 ? new String[0] : "algorithmId;signature".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9051.class, sb, "[");
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
