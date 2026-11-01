package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܿۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18604 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f55569;

    /* JADX INFO: renamed from: ۧ */
    public final Object f55570;

    public C18604(int i, Object obj) {
        this.f55569 = i;
        this.f55570 = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18604)) {
            return false;
        }
        C18604 c18604 = (C18604) obj;
        return this.f55569 == c18604.f55569 && C12826.equals(this.f55570, c18604.f55570);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f55570) + (this.f55569 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f55569), this.f55570};
        String[] strArrSplit = "type;value".length() == 0 ? new String[0] : "type;value".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C18604.class, sb, "[");
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
