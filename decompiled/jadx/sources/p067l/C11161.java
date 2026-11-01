package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۢ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11161 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f30974;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16716 f30975;

    /* JADX INFO: renamed from: ܽ */
    public final long f30976;

    /* JADX INFO: renamed from: ܿ */
    public final Uri f30977;

    /* JADX INFO: renamed from: ᩳ */
    public final long f30978;

    public C11161(long j, long j2, Uri uri, InterfaceC16716 interfaceC16716, String str) {
        this.f30977 = uri;
        this.f30974 = str;
        this.f30978 = j;
        this.f30976 = j2;
        this.f30975 = interfaceC16716;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11161)) {
            return false;
        }
        C11161 c11161 = (C11161) obj;
        return this.f30978 == c11161.f30978 && this.f30976 == c11161.f30976 && C12826.equals(this.f30977, c11161.f30977) && C12826.equals(this.f30974, c11161.f30974) && C12826.equals(this.f30975, c11161.f30975);
    }

    public final int hashCode() {
        long j = this.f30978;
        long j2 = this.f30976;
        return C12826.hashCode(this.f30975) + C21720.m49003((C12826.hashCode(this.f30977) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.f30974);
    }

    public final String toString() {
        Object[] objArr = {this.f30977, this.f30974, Long.valueOf(this.f30978), Long.valueOf(this.f30976), this.f30975};
        String[] strArrSplit = "uri;cacheKey;offset;length;cacheOnlyFactory".length() == 0 ? new String[0] : "uri;cacheKey;offset;length;cacheOnlyFactory".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11161.class, sb, "[");
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
