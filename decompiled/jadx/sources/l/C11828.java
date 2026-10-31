package l;

/* JADX INFO: renamed from: l.ۨܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBEZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11828 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13217 f35286;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f35287;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f35288;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f35289;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13217 f35290;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13217 f35291;

    public C11828(int i, int i2, C13217 c13217, C13217 c13218, C13217 c13219, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("startPc < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        if (c13217 == null) {
            throw new NullPointerException("name == null");
        }
        if (c13218 == null && c13219 == null) {
            throw new NullPointerException("(descriptor == null) && (signature == null)");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        this.f35288 = i;
        this.f35289 = i2;
        this.f35291 = c13217;
        this.f35286 = c13218;
        this.f35290 = c13219;
        this.f35287 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18658 m28913() {
        return C18658.m43257(this.f35291, this.f35290);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13217 m28911(C11828 c11828) {
        return c11828.f35290;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7573 m28916() {
        return C7573.m20297(this.f35286.getString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11828 m28912(C13217 c13217) {
        return new C11828(this.f35288, this.f35289, this.f35291, this.f35286, c13217, this.f35287);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28914(int i, int i2) {
        int i3;
        return i2 == this.f35287 && i >= (i3 = this.f35288) && i < i3 + this.f35289;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28915(C11828 c11828) {
        return this.f35288 == c11828.f35288 && this.f35289 == c11828.f35289 && this.f35287 == c11828.f35287 && this.f35291.equals(c11828.f35291);
    }
}
