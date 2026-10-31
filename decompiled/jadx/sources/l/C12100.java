package l;

/* JADX INFO: renamed from: l.۫֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12100 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f36164;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12100 f36165;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long[] f36166;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f36167;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f36168;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12100 f36169;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f36170;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f36171;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f36172;

    public C12100(C12100 c12100, C12100 c12101, long[] jArr, int i, int i2, boolean z, boolean z2) {
        this.f36169 = c12100;
        this.f36165 = c12101;
        this.f36166 = jArr;
        this.f36167 = i;
        this.f36170 = i2;
        this.f36171 = z;
        this.f36164 = z2;
        if (jArr != null) {
            long length = ((long) jArr.length) * 8;
            this.f36168 = length;
            this.f36172 = length + 48;
        } else if (c12100 != null) {
            this.f36168 = C13510.m32551(c12100.f36168, c12101.f36168);
            this.f36172 = C13510.m32551(48L, C13510.m32551(c12100.f36172, c12101.f36172));
        } else {
            this.f36168 = 0L;
            this.f36172 = 48L;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29515() {
        return this.f36169 == null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29514() {
        return this.f36166 != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29516() {
        return m29515() && this.f36166 == null;
    }
}
