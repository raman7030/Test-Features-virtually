package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes5.dex */
public final class C18424 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f57172;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f57173;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Uri f57174;

    public C18424(Uri uri, long j, long j2) {
        this.f57174 = uri;
        this.f57173 = j;
        this.f57172 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18424)) {
            return false;
        }
        C18424 c18424 = (C18424) obj;
        return this.f57173 == c18424.f57173 && this.f57172 == c18424.f57172 && C11003.equals(this.f57174, c18424.f57174);
    }

    public final int hashCode() {
        long j = this.f57173;
        long j2 = this.f57172;
        return C11003.hashCode(this.f57174) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f57174, Long.valueOf(this.f57173), Long.valueOf(this.f57172)};
        String[] strArrSplit = "uri;offset;length".length() == 0 ? new String[0] : "uri;offset;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18424.class, sb, "[");
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
