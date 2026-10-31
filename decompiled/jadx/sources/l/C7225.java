package l;

/* JADX INFO: renamed from: l.۟ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F71A */
/* JADX INFO: loaded from: classes2.dex */
public final class C7225 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f22118;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f22119;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f22120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f22121;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f22122;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C7225 f22115 = new C7225(true, 0, 0, true, true);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C7225 f22117 = new C7225(false, 0, 0, false, false);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C7225 f22116 = new C7225(false, 0, 0, false, true);

    public C7225(boolean z, long j, long j2, boolean z2, boolean z3) {
        this.f22121 = z;
        this.f22119 = j;
        this.f22118 = j2;
        this.f22120 = z2;
        this.f22122 = z3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7225 m19318(long j, long j2, boolean z, boolean z2) {
        if (j == 0 && j2 == 0 && !z) {
            return z2 ? f22116 : f22117;
        }
        return new C7225(false, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7225 m19319(String str) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                throw new IllegalArgumentException(C19370.m44628(cCharAt, "Non-ASCII start character: "));
            }
            if (cCharAt < '@') {
                j = (1 << cCharAt) | j;
            } else {
                j2 = (1 << (cCharAt - '@')) | j2;
            }
        }
        return m19318(j, j2, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7225 m19320(C7225 c7225) {
        if (!this.f22121) {
            boolean z = c7225.f22121;
            boolean z2 = c7225.f22122;
            boolean z3 = c7225.f22120;
            if (!z) {
                long j = c7225.f22119;
                long j2 = this.f22119;
                long j3 = j2 | j;
                long j4 = c7225.f22118;
                long j5 = this.f22118;
                long j6 = j5 | j4;
                boolean z4 = this.f22120;
                boolean z5 = z4 || z3;
                boolean z6 = this.f22122;
                boolean z7 = z6 || z2;
                if (j3 == j2 && j6 == j5 && z5 == z4 && z7 == z6) {
                    return this;
                }
                return (j3 == j && j6 == j4 && z5 == z3 && z7 == z2) ? c7225 : m19318(j3, j6, z5, z7);
            }
        }
        return f22115;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7225 m19328() {
        if (this.f22121 || !this.f22122) {
            return this;
        }
        return m19318(this.f22119, this.f22118, this.f22120, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19322(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return false;
        }
        if (this.f22121 || this.f22122) {
            return true;
        }
        if (i == length) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '@') {
            return ((1 << cCharAt) & this.f22119) != 0;
        }
        if (cCharAt < 128) {
            return ((1 << (cCharAt - '@')) & this.f22118) != 0;
        }
        return this.f22120;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m19326() {
        return this.f22121;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m19325() {
        return this.f22119;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m19323() {
        return this.f22118;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19324() {
        return this.f22120;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m19327() {
        return this.f22122;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19321() {
        return !this.f22121 && this.f22119 == -1 && this.f22118 == -1 && this.f22120;
    }
}
