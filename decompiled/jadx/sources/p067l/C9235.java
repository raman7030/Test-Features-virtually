package p067l;

/* JADX INFO: renamed from: l.۟ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F71A */
/* JADX INFO: loaded from: classes2.dex */
public final class C9235 {

    /* JADX INFO: renamed from: ֫ */
    public final long f25002;

    /* JADX INFO: renamed from: ۧ */
    public final long f25003;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f25004;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f25005;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f25006;

    /* JADX INFO: renamed from: ۜ */
    public static final C9235 f24999 = new C9235(true, 0, 0, true, true);

    /* JADX INFO: renamed from: ᩻ */
    public static final C9235 f25001 = new C9235(false, 0, 0, false, false);

    /* JADX INFO: renamed from: ܳ */
    public static final C9235 f25000 = new C9235(false, 0, 0, false, true);

    public C9235(boolean z, long j, long j2, boolean z2, boolean z3) {
        this.f25005 = z;
        this.f25003 = j;
        this.f25002 = j2;
        this.f25004 = z2;
        this.f25006 = z3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9235 m21267(long j, long j2, boolean z, boolean z2) {
        if (j == 0 && j2 == 0 && !z) {
            return z2 ? f25000 : f25001;
        }
        return new C9235(false, j, j2, z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9235 m21268(String str) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                throw new IllegalArgumentException(C20778.m46922(cCharAt, "Non-ASCII start character: "));
            }
            if (cCharAt < '@') {
                j = (1 << cCharAt) | j;
            } else {
                j2 = (1 << (cCharAt - '@')) | j2;
            }
        }
        return m21267(j, j2, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9235 m21269(C9235 c9235) {
        if (!this.f25005) {
            boolean z = c9235.f25005;
            boolean z2 = c9235.f25006;
            boolean z3 = c9235.f25004;
            if (!z) {
                long j = c9235.f25003;
                long j2 = this.f25003;
                long j3 = j2 | j;
                long j4 = c9235.f25002;
                long j5 = this.f25002;
                long j6 = j5 | j4;
                boolean z4 = this.f25004;
                boolean z5 = z4 || z3;
                boolean z6 = this.f25006;
                boolean z7 = z6 || z2;
                if (j3 == j2 && j6 == j5 && z5 == z4 && z7 == z6) {
                    return this;
                }
                return (j3 == j && j6 == j4 && z5 == z3 && z7 == z2) ? c9235 : m21267(j3, j6, z5, z7);
            }
        }
        return f24999;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C9235 m21277() {
        if (this.f25005 || !this.f25006) {
            return this;
        }
        return m21267(this.f25003, this.f25002, this.f25004, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21271(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return false;
        }
        if (this.f25005 || this.f25006) {
            return true;
        }
        if (i == length) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '@') {
            return ((1 << cCharAt) & this.f25003) != 0;
        }
        if (cCharAt < 128) {
            return ((1 << (cCharAt - '@')) & this.f25002) != 0;
        }
        return this.f25004;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m21275() {
        return this.f25005;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m21274() {
        return this.f25003;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m21272() {
        return this.f25002;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m21273() {
        return this.f25004;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m21276() {
        return this.f25006;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21270() {
        return !this.f25005 && this.f25003 == -1 && this.f25002 == -1 && this.f25004;
    }
}
