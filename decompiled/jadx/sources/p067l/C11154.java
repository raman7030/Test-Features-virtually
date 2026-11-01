package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۢ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11154 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f30956;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC17187 f30957;

    public C11154(EnumC17187 enumC17187, boolean z) {
        this.f30957 = enumC17187;
        this.f30956 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11154)) {
            return false;
        }
        C11154 c11154 = (C11154) obj;
        return this.f30956 == c11154.f30956 && C12826.equals(this.f30957, c11154.f30957);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f30957) + ((this.f30956 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30957, Boolean.valueOf(this.f30956)};
        String[] strArrSplit = "state;stale".length() == 0 ? new String[0] : "state;stale".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11154.class, sb, "[");
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
    public final boolean m25713() {
        return this.f30956;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC17187 m25714() {
        return this.f30957;
    }
}
