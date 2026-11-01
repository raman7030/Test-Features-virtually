package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩴ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes5.dex */
public final class C19878 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f60391;

    /* JADX INFO: renamed from: ۧ */
    public final long f60392;

    /* JADX INFO: renamed from: ܽ */
    public final Uri f60393;

    public C19878(Uri uri, long j, long j2) {
        this.f60393 = uri;
        this.f60392 = j;
        this.f60391 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19878)) {
            return false;
        }
        C19878 c19878 = (C19878) obj;
        return this.f60392 == c19878.f60392 && this.f60391 == c19878.f60391 && C12826.equals(this.f60393, c19878.f60393);
    }

    public final int hashCode() {
        long j = this.f60392;
        long j2 = this.f60391;
        return C12826.hashCode(this.f60393) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f60393, Long.valueOf(this.f60392), Long.valueOf(this.f60391)};
        String[] strArrSplit = "uri;offset;length".length() == 0 ? new String[0] : "uri;offset;length".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19878.class, sb, "[");
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
