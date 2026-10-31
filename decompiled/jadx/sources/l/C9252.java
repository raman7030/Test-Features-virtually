package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9252 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f28028;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f28029;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f28030;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri f28031;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f28032;

    public C9252(long j, long j2, Uri uri, InterfaceC15097 interfaceC15097, String str) {
        this.f28031 = uri;
        this.f28028 = str;
        this.f28032 = j;
        this.f28030 = j2;
        this.f28029 = interfaceC15097;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9252)) {
            return false;
        }
        C9252 c9252 = (C9252) obj;
        return this.f28032 == c9252.f28032 && this.f28030 == c9252.f28030 && C11003.equals(this.f28031, c9252.f28031) && C11003.equals(this.f28028, c9252.f28028) && C11003.equals(this.f28029, c9252.f28029);
    }

    public final int hashCode() {
        long j = this.f28032;
        long j2 = this.f28030;
        return C11003.hashCode(this.f28029) + C20361.m46680((C11003.hashCode(this.f28031) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.f28028);
    }

    public final String toString() {
        Object[] objArr = {this.f28031, this.f28028, Long.valueOf(this.f28032), Long.valueOf(this.f28030), this.f28029};
        String[] strArrSplit = "uri;cacheKey;offset;length;cacheOnlyFactory".length() == 0 ? new String[0] : "uri;cacheKey;offset;length;cacheOnlyFactory".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9252.class, sb, "[");
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
