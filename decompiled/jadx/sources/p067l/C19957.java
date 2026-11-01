package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩴۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19957 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f60576;

    /* JADX INFO: renamed from: ۧ */
    public final long f60577;

    /* JADX INFO: renamed from: ܳ */
    public final String f60578;

    /* JADX INFO: renamed from: ܽ */
    public final long f60579;

    /* JADX INFO: renamed from: ܿ */
    public final long f60580;

    /* JADX INFO: renamed from: ᩳ */
    public final int f60581;

    public C19957(long j, long j2, long j3, String str, int i, long j4) {
        this.f60580 = j;
        this.f60577 = j2;
        this.f60576 = j3;
        this.f60578 = str;
        this.f60581 = i;
        this.f60579 = j4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19957)) {
            return false;
        }
        C19957 c19957 = (C19957) obj;
        return this.f60581 == c19957.f60581 && this.f60580 == c19957.f60580 && this.f60577 == c19957.f60577 && this.f60576 == c19957.f60576 && this.f60579 == c19957.f60579 && C12826.equals(this.f60578, c19957.f60578);
    }

    public final int hashCode() {
        int i = this.f60581 * 31;
        long j = this.f60580;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f60577;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f60576;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f60579;
        return C12826.hashCode(this.f60578) + ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f60580), Long.valueOf(this.f60577), Long.valueOf(this.f60576), this.f60578, Integer.valueOf(this.f60581), Long.valueOf(this.f60579)};
        String[] strArrSplit = "number;byteStart;byteEnd;text;contentLength;column".length() == 0 ? new String[0] : "number;byteStart;byteEnd;text;contentLength;column".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19957.class, sb, "[");
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
    public final long m45286() {
        return this.f60576;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m45288() {
        return this.f60578;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m45289() {
        return this.f60581;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m45290() {
        return this.f60577;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m45291() {
        return this.f60579;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final long m45292() {
        return this.f60580;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19957 m45287(int i) {
        String str = this.f60578;
        if (str.length() <= i) {
            return this;
        }
        int length = str.length() - i;
        if (length > 0 && Character.isLowSurrogate(str.charAt(length))) {
            length++;
        }
        if (length > 0 && str.charAt(length - 1) == '\r' && str.charAt(length) == '\n') {
            length++;
        }
        return new C19957(this.f60580, this.f60577, this.f60576, str.substring(length), Math.max(0, this.f60581 - length), this.f60579 + ((long) str.codePointCount(0, length)));
    }
}
