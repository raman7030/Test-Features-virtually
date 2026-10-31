package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6TJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6788 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f21069;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f21070;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f21071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f21072;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6788)) {
            return false;
        }
        C6788 c6788 = (C6788) obj;
        return this.f21071 == c6788.f21071 && this.f21069 == c6788.f21069 && C11003.equals(this.f21070, c6788.f21070) && C11003.equals(this.f21072, c6788.f21072);
    }

    public final int hashCode() {
        int i = this.f21071 ? 1231 : 1237;
        long j = this.f21069;
        return C11003.hashCode(this.f21072) + C20361.m46680(((i * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f21070);
    }

    public final String toString() {
        Object[] objArr = {this.f21070, this.f21072, Long.valueOf(this.f21069), Boolean.valueOf(this.f21071)};
        String[] strArrSplit = "key;version;byteLength;reopenable".length() == 0 ? new String[0] : "key;version;byteLength;reopenable".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6788.class, sb, "[");
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
    public final long m18431() {
        return this.f21069;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m18432() {
        return this.f21072;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m18433() {
        return this.f21070;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m18434() {
        return this.f21071;
    }

    public C6788(String str, String str2, long j, boolean z) {
        C11003.requireNonNull(str);
        C11003.requireNonNull(str2);
        if (!str.isEmpty() && str.length() <= 1024 && str2.length() <= 512 && j >= -1 && (!z || !str2.isEmpty())) {
            this.f21070 = str;
            this.f21072 = str2;
            this.f21069 = j;
            this.f21071 = z;
            return;
        }
        throw new IllegalArgumentException("Invalid text source identity");
    }
}
