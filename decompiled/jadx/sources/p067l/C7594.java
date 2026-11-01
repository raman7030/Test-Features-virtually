package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7594 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f19891;

    /* JADX INFO: renamed from: ۧ */
    public final String f19892;

    public C7594(String str, String str2) {
        this.f19892 = str;
        this.f19891 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7594)) {
            return false;
        }
        C7594 c7594 = (C7594) obj;
        return C12826.equals(this.f19892, c7594.f19892) && C12826.equals(this.f19891, c7594.f19891);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f19891) + (C12826.hashCode(this.f19892) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19892, this.f19891};
        String[] strArrSplit = "source;path".length() == 0 ? new String[0] : "source;path".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7594.class, sb, "[");
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
