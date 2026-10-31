package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C12616 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f38023;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f38024;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f38025;

    public C12616(String str, long j, long j2) {
        this.f38025 = str;
        this.f38024 = j;
        this.f38023 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12616)) {
            return false;
        }
        C12616 c12616 = (C12616) obj;
        return this.f38024 == c12616.f38024 && this.f38023 == c12616.f38023 && C11003.equals(this.f38025, c12616.f38025);
    }

    public final int hashCode() {
        long j = this.f38024;
        long j2 = this.f38023;
        return C11003.hashCode(this.f38025) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f38025, Long.valueOf(this.f38024), Long.valueOf(this.f38023)};
        String[] strArrSplit = "path;length;lastModified".length() == 0 ? new String[0] : "path;length;lastModified".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12616.class, sb, "[");
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
