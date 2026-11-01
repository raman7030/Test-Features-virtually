package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۤ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11857 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C13868 f33060;

    /* JADX INFO: renamed from: ۧ */
    public final C13868 f33061;

    public C11857(C13868 c13868, C13868 c13869) {
        this.f33061 = c13868;
        this.f33060 = c13869;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11857)) {
            return false;
        }
        C11857 c11857 = (C11857) obj;
        return C12826.equals(this.f33061, c11857.f33061) && C12826.equals(this.f33060, c11857.f33060);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f33060) + (C12826.hashCode(this.f33061) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33061, this.f33060};
        String[] strArrSplit = "rest;leaf".length() == 0 ? new String[0] : "rest;leaf".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11857.class, sb, "[");
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
