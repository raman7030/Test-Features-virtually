package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۘܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6253 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f15830;

    /* JADX INFO: renamed from: ۧ */
    public final String f15831;

    public C6253(String str, String str2) {
        this.f15831 = str;
        this.f15830 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6253)) {
            return false;
        }
        C6253 c6253 = (C6253) obj;
        return C12826.equals(this.f15831, c6253.f15831) && C12826.equals(this.f15830, c6253.f15830);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f15830) + (C12826.hashCode(this.f15831) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f15831, this.f15830};
        String[] strArrSplit = "path;label".length() == 0 ? new String[0] : "path;label".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6253.class, sb, "[");
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
    public final String m14192() {
        return this.f15830;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m14193() {
        return this.f15831;
    }
}
