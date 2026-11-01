package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۤۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11951 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 f33331;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f33332;

    public C11951(AbstractC6462 abstractC6462, boolean z) {
        this.f33331 = abstractC6462;
        this.f33332 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11951)) {
            return false;
        }
        C11951 c11951 = (C11951) obj;
        return this.f33332 == c11951.f33332 && C12826.equals(this.f33331, c11951.f33331);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f33331) + ((this.f33332 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33331, Boolean.valueOf(this.f33332)};
        String[] strArrSplit = "type;unconditional".length() == 0 ? new String[0] : "type;unconditional".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11951.class, sb, "[");
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
    public final AbstractC6462 m27359() {
        return this.f33331;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m27360() {
        return this.f33332;
    }
}
