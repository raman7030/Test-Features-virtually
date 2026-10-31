package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C14396 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f43360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f43361;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f43362;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Uri f43363;

    public C14396(Uri uri, String str, long j, long j2) {
        this.f43363 = uri;
        this.f43360 = str;
        this.f43362 = j;
        this.f43361 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14396)) {
            return false;
        }
        C14396 c14396 = (C14396) obj;
        return this.f43362 == c14396.f43362 && this.f43361 == c14396.f43361 && C11003.equals(this.f43363, c14396.f43363) && C11003.equals(this.f43360, c14396.f43360);
    }

    public final int hashCode() {
        long j = this.f43362;
        long j2 = this.f43361;
        return C11003.hashCode(this.f43360) + ((C11003.hashCode(this.f43363) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f43363, this.f43360, Long.valueOf(this.f43362), Long.valueOf(this.f43361)};
        String[] strArrSplit = "uri;cacheKey;offset;length".length() == 0 ? new String[0] : "uri;cacheKey;offset;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14396.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4871 m34388(InterfaceC15097 interfaceC15097) {
        return new C4871(this.f43362, this.f43361, this.f43363, interfaceC15097, this.f43360);
    }
}
