package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13608 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f40600;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f40601;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f40602;

    public C13608(long j, Uri uri, String str) {
        this.f40600 = j;
        this.f40602 = str;
        this.f40601 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13608)) {
            return false;
        }
        C13608 c13608 = (C13608) obj;
        return this.f40600 == c13608.f40600 && C11003.equals(this.f40602, c13608.f40602) && C11003.equals(this.f40601, c13608.f40601);
    }

    public final int hashCode() {
        long j = this.f40600;
        return C11003.hashCode(this.f40601) + C20361.m46680(((int) (j ^ (j >>> 32))) * 31, 31, this.f40602);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f40600), this.f40602, this.f40601};
        String[] strArrSplit = "bodyLength;sha256;finalUri".length() == 0 ? new String[0] : "bodyLength;sha256;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C13608.class, sb, "[");
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
