package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3171 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 f9976;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23190 f9977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9978;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9979;

    public C3171(C23190 c23190, int i, C8353 c8353, int i2) {
        this.f9977 = c23190;
        this.f9979 = i;
        this.f9976 = c8353;
        this.f9978 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3171)) {
            return false;
        }
        C3171 c3171 = (C3171) obj;
        return this.f9979 == c3171.f9979 && this.f9978 == c3171.f9978 && C11003.equals(this.f9977, c3171.f9977) && C11003.equals(this.f9976, c3171.f9976);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f9976) + ((C11003.hashCode(this.f9977) + C4153.m12551(this.f9979, 31, this.f9978, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f9977, Integer.valueOf(this.f9979), this.f9976, Integer.valueOf(this.f9978)};
        String[] strArrSplit = "group;trackIndex;format;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;format;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C3171.class, sb, "[");
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
    public final C8353 m9722() {
        return this.f9976;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m9723() {
        return this.f9979;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23190 m9724() {
        return this.f9977;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m9725() {
        return this.f9978;
    }
}
