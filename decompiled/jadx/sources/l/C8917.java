package l;

/* JADX INFO: renamed from: l.ۡܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76MD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8917 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f27095;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f27096;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f27097;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f27098;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f27099;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f27100;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f27101;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f27102;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f27103;

    public C8917(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.f27096 = i3;
        this.f27099 = (int) j;
        this.f27100 = (int) j2;
        long j5 = i;
        this.f27101 = (int) Math.min(j5, j3);
        long j6 = i2;
        this.f27097 = (int) Math.min(j6, j4);
        long j7 = i3;
        this.f27098 = (int) Math.max(0L, j - j7);
        this.f27102 = (int) Math.max(0L, j2 - j7);
        this.f27103 = (int) Math.min(j5, j3 + j7);
        this.f27095 = (int) Math.min(j6, j4 + j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8917)) {
            return false;
        }
        C8917 c8917 = (C8917) obj;
        return this.f27096 == c8917.f27096 && this.f27098 == c8917.f27098 && this.f27102 == c8917.f27102 && this.f27103 == c8917.f27103 && this.f27095 == c8917.f27095 && this.f27099 == c8917.f27099 && this.f27100 == c8917.f27100 && this.f27101 == c8917.f27101 && this.f27097 == c8917.f27097;
    }

    public final int hashCode() {
        return (((((((((((((((this.f27096 * 31) + this.f27098) * 31) + this.f27102) * 31) + this.f27103) * 31) + this.f27095) * 31) + this.f27099) * 31) + this.f27100) * 31) + this.f27101) * 31) + this.f27097;
    }
}
