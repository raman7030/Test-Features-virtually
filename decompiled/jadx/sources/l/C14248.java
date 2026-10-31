package l;

/* JADX INFO: renamed from: l.ܳۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F8T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14248 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f42925;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f42926;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f42927;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f42928;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f42929;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15894 f42930;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f42931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f42932;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f42933;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f42934;

    public C14248(C15894 c15894, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        C22632.m50631(!z5 || z3);
        C22632.m50631(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        C22632.m50631(z6);
        this.f42930 = c15894;
        this.f42927 = j;
        this.f42933 = j2;
        this.f42928 = j3;
        this.f42925 = j4;
        this.f42926 = z;
        this.f42931 = z2;
        this.f42929 = z3;
        this.f42934 = z4;
        this.f42932 = z5;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14248 m33893(long j) {
        if (j == this.f42927) {
            return this;
        }
        return new C14248(this.f42930, j, this.f42933, this.f42928, this.f42925, this.f42926, this.f42931, this.f42929, this.f42934, this.f42932);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14248 m33892(long j) {
        if (j == this.f42933) {
            return this;
        }
        return new C14248(this.f42930, this.f42927, j, this.f42928, this.f42925, this.f42926, this.f42931, this.f42929, this.f42934, this.f42932);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14248.class == obj.getClass()) {
            C14248 c14248 = (C14248) obj;
            if (this.f42927 == c14248.f42927 && this.f42933 == c14248.f42933 && this.f42928 == c14248.f42928 && this.f42925 == c14248.f42925 && this.f42926 == c14248.f42926 && this.f42931 == c14248.f42931 && this.f42929 == c14248.f42929 && this.f42934 == c14248.f42934 && this.f42932 == c14248.f42932 && C11003.equals(this.f42930, c14248.f42930)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f42930.hashCode() + 527) * 31) + ((int) this.f42927)) * 31) + ((int) this.f42933)) * 31) + ((int) this.f42928)) * 31) + ((int) this.f42925)) * 31) + (this.f42926 ? 1 : 0)) * 31) + (this.f42931 ? 1 : 0)) * 31) + (this.f42929 ? 1 : 0)) * 31) + (this.f42934 ? 1 : 0)) * 31) + (this.f42932 ? 1 : 0);
    }
}
