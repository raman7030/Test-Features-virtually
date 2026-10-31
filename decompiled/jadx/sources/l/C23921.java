package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes.dex */
public final class C23921 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11197 f77592;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f77593;

    public C23921(C11197 c11197, int i) {
        this.f77592 = c11197;
        this.f77593 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23921)) {
            return false;
        }
        C23921 c23921 = (C23921) obj;
        return this.f77593 == c23921.f77593 && C11003.equals(this.f77592, c23921.f77592);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f77592) + (this.f77593 * 31);
    }

    public final int position() {
        return this.f77593;
    }

    public final String toString() {
        Object[] objArr = {this.f77592, Integer.valueOf(this.f77593)};
        String[] strArrSplit = "mediaItem;position".length() == 0 ? new String[0] : "mediaItem;position".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C23921.class, sb, "[");
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
    public final C11197 m52686() {
        return this.f77592;
    }
}
