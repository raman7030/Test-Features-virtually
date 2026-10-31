package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes3.dex */
public final class C5498 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f17052;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f17053;

    public C5498(String str, String str2) {
        this.f17053 = str;
        this.f17052 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5498)) {
            return false;
        }
        C5498 c5498 = (C5498) obj;
        return C11003.equals(this.f17053, c5498.f17053) && C11003.equals(this.f17052, c5498.f17052);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f17052) + (C11003.hashCode(this.f17053) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f17053, this.f17052};
        String[] strArrSplit = "source;path".length() == 0 ? new String[0] : "source;path".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5498.class, sb, "[");
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
