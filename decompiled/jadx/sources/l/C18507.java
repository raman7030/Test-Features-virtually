package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18507 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f57354;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f57355;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f57356;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f57357;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f57358;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f57359;

    public C18507(long j, long j2, long j3, String str, int i, long j4) {
        this.f57358 = j;
        this.f57355 = j2;
        this.f57354 = j3;
        this.f57356 = str;
        this.f57359 = i;
        this.f57357 = j4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18507)) {
            return false;
        }
        C18507 c18507 = (C18507) obj;
        return this.f57359 == c18507.f57359 && this.f57358 == c18507.f57358 && this.f57355 == c18507.f57355 && this.f57354 == c18507.f57354 && this.f57357 == c18507.f57357 && C11003.equals(this.f57356, c18507.f57356);
    }

    public final int hashCode() {
        int i = this.f57359 * 31;
        long j = this.f57358;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f57355;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f57354;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f57357;
        return C11003.hashCode(this.f57356) + ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f57358), Long.valueOf(this.f57355), Long.valueOf(this.f57354), this.f57356, Integer.valueOf(this.f57359), Long.valueOf(this.f57357)};
        String[] strArrSplit = "number;byteStart;byteEnd;text;contentLength;column".length() == 0 ? new String[0] : "number;byteStart;byteEnd;text;contentLength;column".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18507.class, sb, "[");
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
    public final long m43008() {
        return this.f57354;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m43010() {
        return this.f57356;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m43011() {
        return this.f57359;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m43012() {
        return this.f57355;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m43013() {
        return this.f57357;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m43014() {
        return this.f57358;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18507 m43009(int i) {
        String str = this.f57356;
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
        return new C18507(this.f57358, this.f57355, this.f57354, str.substring(length), Math.max(0, this.f57359 - length), this.f57357 + ((long) str.codePointCount(0, length)));
    }
}
