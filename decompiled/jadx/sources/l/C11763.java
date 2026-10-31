package l;

/* JADX INFO: renamed from: l.ۨܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11763 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f35113;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35116;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6118 f35114 = new C6118();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6118 f35112 = new C6118();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f35115 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28790() {
        this.f35114.m17033();
        this.f35112.m17033();
        this.f35113 = false;
        this.f35115 = -9223372036854775807L;
        this.f35116 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28788(long j) {
        this.f35114.m17030(j);
        if (this.f35114.m17034()) {
            this.f35113 = false;
        } else if (this.f35115 != -9223372036854775807L) {
            if (!this.f35113 || this.f35112.m17032()) {
                this.f35112.m17033();
                this.f35112.m17030(this.f35115);
            }
            this.f35113 = true;
            this.f35112.m17030(j);
        }
        if (this.f35113 && this.f35112.m17034()) {
            C6118 c6118 = this.f35114;
            this.f35114 = this.f35112;
            this.f35112 = c6118;
            this.f35113 = false;
        }
        this.f35115 = j;
        this.f35116 = this.f35114.m17034() ? 0 : this.f35116 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m28787() {
        if (this.f35114.m17034()) {
            return this.f35114.m17029();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m28789() {
        if (this.f35114.m17034()) {
            return (float) (1.0E9d / this.f35114.m17029());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m28792() {
        return this.f35114.m17034();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m28793() {
        if (this.f35114.m17034()) {
            return this.f35114.m17031();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28791() {
        return this.f35116;
    }
}
