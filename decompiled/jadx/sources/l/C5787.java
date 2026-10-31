package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5787 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17812;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17813;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17814;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f17815;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f17816;

    public C5787(int i, int i2, int i3, int i4, long j) {
        this.f17814 = i;
        this.f17812 = i2;
        this.f17816 = j;
        this.f17815 = i3;
        this.f17813 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5787)) {
            return false;
        }
        C5787 c5787 = (C5787) obj;
        return this.f17814 == c5787.f17814 && this.f17812 == c5787.f17812 && this.f17815 == c5787.f17815 && this.f17813 == c5787.f17813 && this.f17816 == c5787.f17816;
    }

    public final int hashCode() {
        int i = ((((((this.f17814 * 31) + this.f17812) * 31) + this.f17815) * 31) + this.f17813) * 31;
        long j = this.f17816;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f17814), Integer.valueOf(this.f17812), Long.valueOf(this.f17816), Integer.valueOf(this.f17815), Integer.valueOf(this.f17813)};
        String[] strArrSplit = "mediaToken;generation;positionMs;widthPx;heightPx".length() == 0 ? new String[0] : "mediaToken;generation;positionMs;widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5787.class, sb, "[");
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
