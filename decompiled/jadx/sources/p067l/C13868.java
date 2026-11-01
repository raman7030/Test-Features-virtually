package p067l;

/* JADX INFO: renamed from: l.۫֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13868 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f39175;

    /* JADX INFO: renamed from: ۜ */
    public final C13868 f39176;

    /* JADX INFO: renamed from: ۧ */
    public final long[] f39177;

    /* JADX INFO: renamed from: ܳ */
    public final int f39178;

    /* JADX INFO: renamed from: ܽ */
    public final long f39179;

    /* JADX INFO: renamed from: ܿ */
    public final C13868 f39180;

    /* JADX INFO: renamed from: ᩳ */
    public final int f39181;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f39182;

    /* JADX INFO: renamed from: ᩻ */
    public final long f39183;

    public C13868(C13868 c13868, C13868 c13869, long[] jArr, int i, int i2, boolean z, boolean z2) {
        this.f39180 = c13868;
        this.f39176 = c13869;
        this.f39177 = jArr;
        this.f39178 = i;
        this.f39181 = i2;
        this.f39182 = z;
        this.f39175 = z2;
        if (jArr != null) {
            long length = ((long) jArr.length) * 8;
            this.f39179 = length;
            this.f39183 = length + 48;
        } else if (c13868 != null) {
            this.f39179 = C15208.m34653(c13868.f39179, c13869.f39179);
            this.f39183 = C15208.m34653(48L, C15208.m34653(c13868.f39183, c13869.f39183));
        } else {
            this.f39179 = 0L;
            this.f39183 = 48L;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m31578() {
        return this.f39180 == null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m31577() {
        return this.f39177 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m31579() {
        return m31578() && this.f39177 == null;
    }
}
