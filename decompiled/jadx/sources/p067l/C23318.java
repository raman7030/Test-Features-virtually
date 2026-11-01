package p067l;

/* JADX INFO: renamed from: l.᩹ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes.dex */
public final class C23318 {

    /* JADX INFO: renamed from: ֫ */
    public int f73375;

    /* JADX INFO: renamed from: ۧ */
    public int f73376;

    /* JADX INFO: renamed from: ܳ */
    public int f73377;

    /* JADX INFO: renamed from: ܽ */
    public EnumC22648 f73378;

    /* JADX INFO: renamed from: ܿ */
    public int f73379;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f73380;

    /* JADX INFO: renamed from: ᩻ */
    public int f73381;

    public C23318(int i) {
        m51940(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51940(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative text length");
        }
        this.f73381 = i;
        this.f73375 = -1;
        this.f73376 = -1;
        this.f73379 = -1;
        this.f73377 = -1;
        this.f73380 = false;
        this.f73378 = EnumC22648.COMPLETE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51936(int i, int i2) {
        if (i == i2) {
            m51935(i);
            return;
        }
        if (i < 0 || i > i2 || i2 > this.f73381) {
            throw new IndexOutOfBoundsException("Invalid dependency read range");
        }
        int i3 = this.f73377;
        if (i3 == -1 || i < i3) {
            this.f73377 = i;
        }
        if (i2 > this.f73379) {
            this.f73379 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51935(int i) {
        if (i < 0 || i > this.f73381) {
            throw new IndexOutOfBoundsException("Invalid dependency boundary");
        }
        int i2 = this.f73376;
        if (i2 == -1 || i < i2) {
            this.f73376 = i;
        }
        if (i > this.f73375) {
            this.f73375 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51934() {
        this.f73380 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51941() {
        this.f73378 = EnumC22648.UNKNOWN;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51937(C21307 c21307) {
        C12826.requireNonNull(c21307);
        if (this.f73381 != c21307.f67158) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c21307.f67154;
        if (i != -1) {
            int i2 = this.f73377;
            if (i2 == -1 || i < i2) {
                this.f73377 = i;
            }
            int i3 = c21307.f67156;
            if (i3 > this.f73379) {
                this.f73379 = i3;
            }
        }
        int i4 = c21307.f67153;
        if (i4 != -1) {
            int i5 = this.f73376;
            if (i5 == -1 || i4 < i5) {
                this.f73376 = i4;
            }
            int i6 = c21307.f67152;
            if (i6 > this.f73375) {
                this.f73375 = i6;
            }
        }
        this.f73380 |= c21307.f67157;
        EnumC22648 enumC22648 = c21307.f67155;
        EnumC22648 enumC22649 = EnumC22648.UNKNOWN;
        if (enumC22648 == enumC22649) {
            this.f73378 = enumC22649;
            return;
        }
        EnumC22648 enumC226410 = EnumC22648.INCOMPLETE;
        if (enumC22648 == enumC226410 && this.f73378 == EnumC22648.COMPLETE) {
            this.f73378 = enumC226410;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51938(C23318 c23318) {
        C12826.requireNonNull(c23318);
        if (c23318 == this) {
            return;
        }
        if (this.f73381 != c23318.f73381) {
            throw new IllegalArgumentException("Dependency text lengths differ");
        }
        int i = c23318.f73377;
        if (i != -1) {
            int i2 = this.f73377;
            if (i2 == -1 || i < i2) {
                this.f73377 = i;
            }
            int i3 = c23318.f73379;
            if (i3 > this.f73379) {
                this.f73379 = i3;
            }
        }
        int i4 = c23318.f73376;
        if (i4 != -1) {
            int i5 = this.f73376;
            if (i5 == -1 || i4 < i5) {
                this.f73376 = i4;
            }
            int i6 = c23318.f73375;
            if (i6 > this.f73375) {
                this.f73375 = i6;
            }
        }
        this.f73380 |= c23318.f73380;
        EnumC22648 enumC22648 = c23318.f73378;
        EnumC22648 enumC22649 = EnumC22648.UNKNOWN;
        if (enumC22648 == enumC22649) {
            this.f73378 = enumC22649;
            return;
        }
        EnumC22648 enumC226410 = EnumC22648.INCOMPLETE;
        if (enumC22648 == enumC226410 && this.f73378 == EnumC22648.COMPLETE) {
            this.f73378 = enumC226410;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21307 m51939() {
        return new C21307(this, this.f73378);
    }
}
