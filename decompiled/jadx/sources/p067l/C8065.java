package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8065 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f21280;

    /* JADX INFO: renamed from: ۧ */
    public final int f21281;

    public C8065(int i, byte[] bArr) {
        this.f21281 = i;
        this.f21280 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8065)) {
            return false;
        }
        C8065 c8065 = (C8065) obj;
        return this.f21281 == c8065.f21281 && C12826.equals(this.f21280, c8065.f21280);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f21280) + (this.f21281 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f21281), this.f21280};
        String[] strArrSplit = "type;data".length() == 0 ? new String[0] : "type;data".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8065.class, sb, "[");
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
