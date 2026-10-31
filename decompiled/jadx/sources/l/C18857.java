package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18857 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21330 f59462;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f59463;

    public C18857(C21330 c21330, long j) {
        this.f59462 = c21330;
        this.f59463 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18857)) {
            return false;
        }
        C18857 c18857 = (C18857) obj;
        return this.f59463 == c18857.f59463 && C11003.equals(this.f59462, c18857.f59462);
    }

    public final int hashCode() {
        long j = this.f59463;
        return C11003.hashCode(this.f59462) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59462, Long.valueOf(this.f59463)};
        String[] strArrSplit = "scanner;touched".length() == 0 ? new String[0] : "scanner;touched".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18857.class, sb, "[");
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
