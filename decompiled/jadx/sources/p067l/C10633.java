package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10633 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f29407;

    /* JADX INFO: renamed from: ۧ */
    public final long f29408;

    /* JADX INFO: renamed from: ܽ */
    public final long f29409;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f29410;

    public C10633(AbstractC17043 abstractC17043, boolean z, long j, long j2) {
        this.f29407 = abstractC17043;
        this.f29410 = z;
        this.f29409 = j;
        this.f29408 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10633)) {
            return false;
        }
        C10633 c10633 = (C10633) obj;
        return this.f29410 == c10633.f29410 && this.f29409 == c10633.f29409 && this.f29408 == c10633.f29408 && C12826.equals(this.f29407, c10633.f29407);
    }

    public final int hashCode() {
        int i = this.f29410 ? 1231 : 1237;
        long j = this.f29409;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f29408;
        return C12826.hashCode(this.f29407) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final long length() {
        return this.f29409;
    }

    public final String toString() {
        Object[] objArr = {this.f29407, Boolean.valueOf(this.f29410), Long.valueOf(this.f29409), Long.valueOf(this.f29408)};
        String[] strArrSplit = "file;regularFile;length;lastModified".length() == 0 ? new String[0] : "file;regularFile;length;lastModified".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10633.class, sb, "[");
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
    public final AbstractC17043 m24447() {
        return this.f29407;
    }

    /* JADX INFO: renamed from: ۚ */
    public final long m24448() {
        return this.f29408;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m24449() {
        return this.f29410;
    }
}
