package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9156 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f27711;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f27712;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f27713;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f27714;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f27715;

    public /* synthetic */ C9156(long j, long j2, long j3, long j4, long j5, int i) {
        this(j, j2, j3, j4, j5);
    }

    public final int hashCode() {
        long j = this.f27711;
        long j2 = this.f27712;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f27714;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f27713;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f27715;
        return i3 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public C9156(long j, long j2, long j3, long j4, long j5) {
        this.f27711 = j;
        this.f27712 = j2;
        this.f27714 = j3;
        this.f27713 = j4;
        this.f27715 = j5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9156)) {
            return false;
        }
        C9156 c9156 = (C9156) obj;
        return this.f27711 == c9156.f27711 && this.f27712 == c9156.f27712 && this.f27714 == c9156.f27714 && this.f27713 == c9156.f27713 && this.f27715 == c9156.f27715;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f27711), Long.valueOf(this.f27712), Long.valueOf(this.f27714), Long.valueOf(this.f27713), Long.valueOf(this.f27715)};
        String[] strArrSplit = "bytes;chars;words;chinese;lines".length() == 0 ? new String[0] : "bytes;chars;words;chinese;lines".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9156.class, sb, "[");
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
    public final String m23563() {
        return C4925.m14306(R.string.MT_Protector, Long.valueOf(this.f27711), Long.valueOf(this.f27712), Long.valueOf(this.f27714), Long.valueOf(this.f27713), Long.valueOf(this.f27715));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9156 m23564(C9156 c9156) {
        return new C9156(this.f27711 + c9156.f27711, this.f27712 + c9156.f27712, this.f27714 + c9156.f27714, this.f27713 + c9156.f27713, (this.f27715 + c9156.f27715) - 1);
    }
}
