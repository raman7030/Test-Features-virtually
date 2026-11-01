package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܰۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15301 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f43678;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f43679;

    /* JADX INFO: renamed from: ܽ */
    public final String f43680;

    public C15301(long j, Uri uri, String str) {
        this.f43678 = j;
        this.f43680 = str;
        this.f43679 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15301)) {
            return false;
        }
        C15301 c15301 = (C15301) obj;
        return this.f43678 == c15301.f43678 && C12826.equals(this.f43680, c15301.f43680) && C12826.equals(this.f43679, c15301.f43679);
    }

    public final int hashCode() {
        long j = this.f43678;
        return C12826.hashCode(this.f43679) + C21720.m49003(((int) (j ^ (j >>> 32))) * 31, 31, this.f43680);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f43678), this.f43680, this.f43679};
        String[] strArrSplit = "bodyLength;sha256;finalUri".length() == 0 ? new String[0] : "bodyLength;sha256;finalUri".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15301.class, sb, "[");
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
