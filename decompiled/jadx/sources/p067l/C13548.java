package p067l;

/* JADX INFO: renamed from: l.ۨܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C13548 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f38112;

    /* JADX INFO: renamed from: ᩳ */
    public int f38115;

    /* JADX INFO: renamed from: ܽ */
    public C8183 f38113 = new C8183();

    /* JADX INFO: renamed from: ֫ */
    public C8183 f38111 = new C8183();

    /* JADX INFO: renamed from: ܿ */
    public long f38114 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ */
    public final void m30837() {
        this.f38113.m18964();
        this.f38111.m18964();
        this.f38112 = false;
        this.f38114 = -9223372036854775807L;
        this.f38115 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30835(long j) {
        this.f38113.m18961(j);
        if (this.f38113.m18965()) {
            this.f38112 = false;
        } else if (this.f38114 != -9223372036854775807L) {
            if (!this.f38112 || this.f38111.m18963()) {
                this.f38111.m18964();
                this.f38111.m18961(this.f38114);
            }
            this.f38112 = true;
            this.f38111.m18961(j);
        }
        if (this.f38112 && this.f38111.m18965()) {
            C8183 c8183 = this.f38113;
            this.f38113 = this.f38111;
            this.f38111 = c8183;
            this.f38112 = false;
        }
        this.f38114 = j;
        this.f38115 = this.f38113.m18965() ? 0 : this.f38115 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m30834() {
        if (this.f38113.m18965()) {
            return this.f38113.m18960();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m30836() {
        if (this.f38113.m18965()) {
            return (float) (1.0E9d / this.f38113.m18960());
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m30839() {
        return this.f38113.m18965();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m30840() {
        if (this.f38113.m18965()) {
            return this.f38113.m18962();
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m30838() {
        return this.f38115;
    }
}
