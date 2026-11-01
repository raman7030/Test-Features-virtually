package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11071 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f30651;

    /* JADX INFO: renamed from: ۧ */
    public final long f30652;

    /* JADX INFO: renamed from: ܽ */
    public final long f30653;

    /* JADX INFO: renamed from: ܿ */
    public final long f30654;

    /* JADX INFO: renamed from: ᩳ */
    public final long f30655;

    public /* synthetic */ C11071(long j, long j2, long j3, long j4, long j5, int i) {
        this(j, j2, j3, j4, j5);
    }

    public final int hashCode() {
        long j = this.f30651;
        long j2 = this.f30652;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f30654;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f30653;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f30655;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public C11071(long j, long j2, long j3, long j4, long j5) {
        this.f30651 = j;
        this.f30652 = j2;
        this.f30654 = j3;
        this.f30653 = j4;
        this.f30655 = j5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11071)) {
            return false;
        }
        C11071 c11071 = (C11071) obj;
        return this.f30651 == c11071.f30651 && this.f30652 == c11071.f30652 && this.f30654 == c11071.f30654 && this.f30653 == c11071.f30653 && this.f30655 == c11071.f30655;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f30651), Long.valueOf(this.f30652), Long.valueOf(this.f30654), Long.valueOf(this.f30653), Long.valueOf(this.f30655)};
        String[] strArrSplit = "bytes;chars;words;chinese;lines".length() == 0 ? new String[0] : "bytes;chars;words;chinese;lines".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11071.class, sb, "[");
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
    public final String m25514() {
        return C7050.m16203(R.string.MT_Protector, Long.valueOf(this.f30651), Long.valueOf(this.f30652), Long.valueOf(this.f30654), Long.valueOf(this.f30653), Long.valueOf(this.f30655));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11071 m25515(C11071 c11071) {
        return new C11071(this.f30651 + c11071.f30651, this.f30652 + c11071.f30652, this.f30654 + c11071.f30654, this.f30653 + c11071.f30653, (this.f30655 + c11071.f30655) - 1);
    }
}
