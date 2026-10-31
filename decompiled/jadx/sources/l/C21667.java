package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21667 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f69523;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18845 f69524;

    public C21667(boolean z, C18845 c18845) {
        this.f69523 = z;
        this.f69524 = c18845;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21667)) {
            return false;
        }
        C21667 c21667 = (C21667) obj;
        return this.f69523 == c21667.f69523 && C11003.equals(this.f69524, c21667.f69524);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f69524) + ((this.f69523 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f69523), this.f69524};
        String[] strArrSplit = "active;inactive".length() == 0 ? new String[0] : "active;inactive".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21667.class, sb, "[");
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
