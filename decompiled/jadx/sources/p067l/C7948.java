package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C7948 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C10856 f20867;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f20868;

    /* JADX INFO: renamed from: ܽ */
    public final int f20869;

    public C7948(C10856 c10856, int i, boolean z) {
        this.f20867 = c10856;
        this.f20869 = i;
        this.f20868 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7948)) {
            return false;
        }
        C7948 c7948 = (C7948) obj;
        return this.f20868 == c7948.f20868 && this.f20869 == c7948.f20869 && C12826.equals(this.f20867, c7948.f20867);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f20867) + C6316.m14441(this.f20868 ? 1231 : 1237, 31, this.f20869, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20867, Integer.valueOf(this.f20869), Boolean.valueOf(this.f20868)};
        String[] strArrSplit = "context;depth;continuation".length() == 0 ? new String[0] : "context;depth;continuation".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C7948.class, sb, "[");
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
