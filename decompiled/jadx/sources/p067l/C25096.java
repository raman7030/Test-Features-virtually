package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩻᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes.dex */
public final class C25096 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f80067;

    /* JADX INFO: renamed from: ۧ */
    public final long f80068;

    /* JADX INFO: renamed from: ܽ */
    public final int f80069;

    /* JADX INFO: renamed from: ᩳ */
    public final C21744 f80070;

    public C25096(byte[] bArr, int i, long j, C21744 c21744) {
        this.f80067 = bArr;
        this.f80069 = i;
        this.f80068 = j;
        this.f80070 = c21744;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25096)) {
            return false;
        }
        C25096 c25096 = (C25096) obj;
        return this.f80069 == c25096.f80069 && this.f80068 == c25096.f80068 && C12826.equals(this.f80067, c25096.f80067) && this.f80070.equals(c25096.f80070);
    }

    public final int hashCode() {
        int i = this.f80069 * 31;
        long j = this.f80068;
        return this.f80070.hashCode() + ((C12826.hashCode(this.f80067) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f80067, Integer.valueOf(this.f80069), Long.valueOf(this.f80068), this.f80070};
        String[] strArrSplit = "buffer;length;fileOffset;pendingWrite".length() == 0 ? new String[0] : "buffer;length;fileOffset;pendingWrite".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C25096.class, sb, "[");
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
