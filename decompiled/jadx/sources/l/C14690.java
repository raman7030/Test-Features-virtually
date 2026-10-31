package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܳᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C14690 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f44867;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f44868;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f44869;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f44870;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f44871;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f44872;

    public C14690(int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.f44870 = i;
        this.f44871 = i2;
        this.f44872 = i3;
        this.f44869 = j;
        this.f44867 = z;
        this.f44868 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14690)) {
            return false;
        }
        C14690 c14690 = (C14690) obj;
        return this.f44867 == c14690.f44867 && this.f44868 == c14690.f44868 && this.f44870 == c14690.f44870 && this.f44871 == c14690.f44871 && this.f44872 == c14690.f44872 && this.f44869 == c14690.f44869;
    }

    public final int hashCode() {
        int i = (((((((((this.f44867 ? 1231 : 1237) * 31) + (this.f44868 ? 1231 : 1237)) * 31) + this.f44870) * 31) + this.f44871) * 31) + this.f44872) * 31;
        long j = this.f44869;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f44870), Integer.valueOf(this.f44871), Integer.valueOf(this.f44872), Long.valueOf(this.f44869), Boolean.valueOf(this.f44867), Boolean.valueOf(this.f44868)};
        String[] strArrSplit = "height;length;leaves;patchBytes;allDelta;allMemory".length() == 0 ? new String[0] : "height;length;leaves;patchBytes;allDelta;allMemory".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C14690.class, sb, "[");
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
