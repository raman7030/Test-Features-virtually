package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۘᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6273 extends AbstractC15010 {

    /* JADX INFO: renamed from: ܽ */
    public static final C6273 f15867 = new C6273(0, 0);

    /* JADX INFO: renamed from: ֫ */
    public final long f15868;

    /* JADX INFO: renamed from: ۧ */
    public final long f15869;

    public final int hashCode() {
        long j = this.f15868;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f15869;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C6273(long j, long j2) {
        this.f15868 = j;
        this.f15869 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6273)) {
            return false;
        }
        C6273 c6273 = (C6273) obj;
        return this.f15868 == c6273.f15868 && this.f15869 == c6273.f15869;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f15868), Long.valueOf(this.f15869)};
        String[] strArrSplit = "deltaSourceBytes;historySourceBytes".length() == 0 ? new String[0] : "deltaSourceBytes;historySourceBytes".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6273.class, sb, "[");
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
    public final long m14236() {
        return this.f15868;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m14237() {
        return this.f15869;
    }
}
