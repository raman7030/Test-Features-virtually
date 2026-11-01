package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۖᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes2.dex */
public final class C4932 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C22367 f11233;

    /* JADX INFO: renamed from: ۧ */
    public final C10967 f11234;

    public C4932(C10967 c10967, C22367 c22367) {
        this.f11234 = c10967;
        this.f11233 = c22367;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4932)) {
            return false;
        }
        C4932 c4932 = (C4932) obj;
        return C12826.equals(this.f11234, c4932.f11234) && C12826.equals(this.f11233, c4932.f11233);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f11233) + (C12826.hashCode(this.f11234) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f11234, this.f11233};
        String[] strArrSplit = "rest;extent".length() == 0 ? new String[0] : "rest;extent".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C4932.class, sb, "[");
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
