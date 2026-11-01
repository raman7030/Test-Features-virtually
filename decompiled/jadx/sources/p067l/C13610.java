package p067l;

/* JADX INFO: renamed from: l.ۨܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13610 {

    /* JADX INFO: renamed from: ֫ */
    public final C14930 f38288;

    /* JADX INFO: renamed from: ۧ */
    public final int f38289;

    /* JADX INFO: renamed from: ܳ */
    public final int f38290;

    /* JADX INFO: renamed from: ܽ */
    public final int f38291;

    /* JADX INFO: renamed from: ܿ */
    public final C14930 f38292;

    /* JADX INFO: renamed from: ᩳ */
    public final C14930 f38293;

    public C13610(int i, int i2, C14930 c14930, C14930 c14931, C14930 c14932, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c14930 == null) {
            throw new NullPointerException("name == null");
        }
        if (c14931 == null && c14932 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f38290 = i;
        this.f38291 = i2;
        this.f38293 = c14930;
        this.f38288 = c14931;
        this.f38292 = c14932;
        this.f38289 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20101 m30963() {
        return C20101.m45523(this.f38293, this.f38292);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14930 m30961(C13610 c13610) {
        return c13610.f38292;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9566 m30966() {
        return C9566.m22274(this.f38288.getString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13610 m30962(C14930 c14930) {
        return new C13610(this.f38290, this.f38291, this.f38293, this.f38288, c14930, this.f38289);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30964(int i, int i2) {
        int i3;
        return i2 == this.f38289 && i >= (i3 = this.f38290) && i < i3 + this.f38291;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30965(C13610 c13610) {
        return this.f38290 == c13610.f38290 && this.f38291 == c13610.f38291 && this.f38289 == c13610.f38289 && this.f38293.equals(c13610.f38293);
    }
}
