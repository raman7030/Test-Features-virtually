package l;

/* JADX INFO: renamed from: l.ܺ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1US */
/* JADX INFO: loaded from: classes4.dex */
public final class C15955 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f49249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f49250;

    public C15955(long j, long j2) {
        this.f49250 = j;
        this.f49249 = j2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m37731() {
        return this.f49250;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m37730() {
        return this.f49249;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15955.class == obj.getClass()) {
            C15955 c15955 = (C15955) obj;
            if (this.f49250 == c15955.f49250 && this.f49249 == c15955.f49249) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f49250;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f49249;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
