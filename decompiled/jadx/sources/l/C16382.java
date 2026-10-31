package l;

/* JADX INFO: renamed from: l.ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64IT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16382 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50404 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50408 = 0;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f50402 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50401 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50403 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50405 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f50406 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50407 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38575() {
        return this.f50404;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m38577() {
        return this.f50408;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m38578() {
        return this.f50406 ? this.f50408 : this.f50404;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38572() {
        return this.f50406 ? this.f50404 : this.f50408;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38576(int i, int i2) {
        this.f50402 = i;
        this.f50401 = i2;
        this.f50407 = true;
        if (this.f50406) {
            if (i2 != Integer.MIN_VALUE) {
                this.f50404 = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f50408 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f50404 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f50408 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38573(int i, int i2) {
        this.f50407 = false;
        if (i != Integer.MIN_VALUE) {
            this.f50403 = i;
            this.f50404 = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f50405 = i2;
            this.f50408 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38574(boolean z) {
        if (z == this.f50406) {
            return;
        }
        this.f50406 = z;
        if (!this.f50407) {
            this.f50404 = this.f50403;
            this.f50408 = this.f50405;
            return;
        }
        if (z) {
            int i = this.f50401;
            if (i == Integer.MIN_VALUE) {
                i = this.f50403;
            }
            this.f50404 = i;
            int i2 = this.f50402;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f50405;
            }
            this.f50408 = i2;
            return;
        }
        int i3 = this.f50402;
        if (i3 == Integer.MIN_VALUE) {
            i3 = this.f50403;
        }
        this.f50404 = i3;
        int i4 = this.f50401;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f50405;
        }
        this.f50408 = i4;
    }
}
