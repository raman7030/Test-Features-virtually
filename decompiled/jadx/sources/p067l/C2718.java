package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֡ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C766 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2718 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C6211 f4562;

    /* JADX INFO: renamed from: ۧ */
    public final long f4563;

    public C2718(C6211 c6211, long j) {
        this.f4562 = c6211;
        this.f4563 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2718)) {
            return false;
        }
        C2718 c2718 = (C2718) obj;
        return this.f4563 == c2718.f4563 && C12826.equals(this.f4562, c2718.f4562);
    }

    public final int hashCode() {
        long j = this.f4563;
        return C12826.hashCode(this.f4562) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4562, Long.valueOf(this.f4563)};
        String[] strArrSplit = "mapping;targetVirtualAddress".length() == 0 ? new String[0] : "mapping;targetVirtualAddress".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C2718.class, sb, "[");
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
