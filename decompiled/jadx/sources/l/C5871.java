package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C5871 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8931 f18014;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f18015;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f18016;

    public C5871(C8931 c8931, int i, boolean z) {
        this.f18014 = c8931;
        this.f18016 = i;
        this.f18015 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5871)) {
            return false;
        }
        C5871 c5871 = (C5871) obj;
        return this.f18015 == c5871.f18015 && this.f18016 == c5871.f18016 && C11003.equals(this.f18014, c5871.f18014);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f18014) + C4153.m12551(this.f18015 ? 1231 : 1237, 31, this.f18016, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f18014, Integer.valueOf(this.f18016), Boolean.valueOf(this.f18015)};
        String[] strArrSplit = "context;depth;continuation".length() == 0 ? new String[0] : "context;depth;continuation".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5871.class, sb, "[");
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
