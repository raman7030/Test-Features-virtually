package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes.dex */
public final class C23913 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f77316;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f77317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f77318;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20386 f77319;

    public C23913(byte[] bArr, int i, long j, C20386 c20386) {
        this.f77316 = bArr;
        this.f77318 = i;
        this.f77317 = j;
        this.f77319 = c20386;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23913)) {
            return false;
        }
        C23913 c23913 = (C23913) obj;
        return this.f77318 == c23913.f77318 && this.f77317 == c23913.f77317 && C11003.equals(this.f77316, c23913.f77316) && this.f77319.equals(c23913.f77319);
    }

    public final int hashCode() {
        int i = this.f77318 * 31;
        long j = this.f77317;
        return this.f77319.hashCode() + ((C11003.hashCode(this.f77316) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f77316, Integer.valueOf(this.f77318), Long.valueOf(this.f77317), this.f77319};
        String[] strArrSplit = "buffer;length;fileOffset;pendingWrite".length() == 0 ? new String[0] : "buffer;length;fileOffset;pendingWrite".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C23913.class, sb, "[");
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
