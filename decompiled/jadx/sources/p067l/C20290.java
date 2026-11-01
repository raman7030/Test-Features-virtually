package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩴܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20290 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C22640 f62691;

    /* JADX INFO: renamed from: ۧ */
    public final long f62692;

    public C20290(C22640 c22640, long j) {
        this.f62691 = c22640;
        this.f62692 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20290)) {
            return false;
        }
        C20290 c20290 = (C20290) obj;
        return this.f62692 == c20290.f62692 && C12826.equals(this.f62691, c20290.f62691);
    }

    public final int hashCode() {
        long j = this.f62692;
        return C12826.hashCode(this.f62691) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62691, Long.valueOf(this.f62692)};
        String[] strArrSplit = "scanner;touched".length() == 0 ? new String[0] : "scanner;touched".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20290.class, sb, "[");
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
