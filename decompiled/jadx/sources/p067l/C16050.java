package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C16050 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f46453;

    /* JADX INFO: renamed from: ۧ */
    public final long f46454;

    /* JADX INFO: renamed from: ܽ */
    public final long f46455;

    /* JADX INFO: renamed from: ᩳ */
    public final Uri f46456;

    public C16050(Uri uri, String str, long j, long j2) {
        this.f46456 = uri;
        this.f46453 = str;
        this.f46455 = j;
        this.f46454 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16050)) {
            return false;
        }
        C16050 c16050 = (C16050) obj;
        return this.f46455 == c16050.f46455 && this.f46454 == c16050.f46454 && C12826.equals(this.f46456, c16050.f46456) && C12826.equals(this.f46453, c16050.f46453);
    }

    public final int hashCode() {
        long j = this.f46455;
        long j2 = this.f46454;
        return C12826.hashCode(this.f46453) + ((C12826.hashCode(this.f46456) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f46456, this.f46453, Long.valueOf(this.f46455), Long.valueOf(this.f46454)};
        String[] strArrSplit = "uri;cacheKey;offset;length".length() == 0 ? new String[0] : "uri;cacheKey;offset;length".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C16050.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫ */
    public final C6998 m36522(InterfaceC16716 interfaceC16716) {
        return new C6998(this.f46455, this.f46454, this.f46456, interfaceC16716, this.f46453);
    }
}
