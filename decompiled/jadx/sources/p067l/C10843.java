package p067l;

/* JADX INFO: renamed from: l.ۡܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76MD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10843 {

    /* JADX INFO: renamed from: ֫ */
    public final int f30027;

    /* JADX INFO: renamed from: ۜ */
    public final int f30028;

    /* JADX INFO: renamed from: ۧ */
    public final int f30029;

    /* JADX INFO: renamed from: ܳ */
    public final int f30030;

    /* JADX INFO: renamed from: ܽ */
    public final int f30031;

    /* JADX INFO: renamed from: ܿ */
    public final int f30032;

    /* JADX INFO: renamed from: ᩳ */
    public final int f30033;

    /* JADX INFO: renamed from: ᩷ */
    public final int f30034;

    /* JADX INFO: renamed from: ᩻ */
    public final int f30035;

    public C10843(int i, int i2, int i3, long j, long j2, long j3, long j4) {
        this.f30028 = i3;
        this.f30031 = (int) j;
        this.f30032 = (int) j2;
        long j5 = i;
        this.f30033 = (int) Math.min(j5, j3);
        long j6 = i2;
        this.f30029 = (int) Math.min(j6, j4);
        long j7 = i3;
        this.f30030 = (int) Math.max(0L, j - j7);
        this.f30034 = (int) Math.max(0L, j2 - j7);
        this.f30035 = (int) Math.min(j5, j3 + j7);
        this.f30027 = (int) Math.min(j6, j4 + j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10843)) {
            return false;
        }
        C10843 c10843 = (C10843) obj;
        return this.f30028 == c10843.f30028 && this.f30030 == c10843.f30030 && this.f30034 == c10843.f30034 && this.f30035 == c10843.f30035 && this.f30027 == c10843.f30027 && this.f30031 == c10843.f30031 && this.f30032 == c10843.f30032 && this.f30033 == c10843.f30033 && this.f30029 == c10843.f30029;
    }

    public final int hashCode() {
        return (((((((((((((((this.f30028 * 31) + this.f30030) * 31) + this.f30034) * 31) + this.f30035) * 31) + this.f30027) * 31) + this.f30031) * 31) + this.f30032) * 31) + this.f30033) * 31) + this.f30029;
    }
}
