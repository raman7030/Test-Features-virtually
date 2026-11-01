package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10971 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f30388;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f30389;

    public C10971(int i, byte[] bArr) {
        this.f30388 = i;
        this.f30389 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10971)) {
            return false;
        }
        C10971 c10971 = (C10971) obj;
        return this.f30388 == c10971.f30388 && C12826.equals(this.f30389, c10971.f30389);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f30389) + (this.f30388 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f30388), this.f30389};
        String[] strArrSplit = "algorithmId;signature".length() == 0 ? new String[0] : "algorithmId;signature".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10971.class, sb, "[");
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
