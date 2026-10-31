package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9984 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 f30101;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12100 f30102;

    public C9984(C12100 c12100, C12100 c12101) {
        this.f30102 = c12100;
        this.f30101 = c12101;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9984)) {
            return false;
        }
        C9984 c9984 = (C9984) obj;
        return C11003.equals(this.f30102, c9984.f30102) && C11003.equals(this.f30101, c9984.f30101);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f30101) + (C11003.hashCode(this.f30102) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30102, this.f30101};
        String[] strArrSplit = "rest;leaf".length() == 0 ? new String[0] : "rest;leaf".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9984.class, sb, "[");
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
