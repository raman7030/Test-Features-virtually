package p067l;

/* JADX INFO: renamed from: l.ۛۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1YC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8049 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 f21210;

    /* JADX INFO: renamed from: ۧ */
    public String f21211;

    /* JADX INFO: renamed from: ܽ */
    public long f21212;

    /* JADX INFO: renamed from: ᩳ */
    public String f21213;

    public C8049(C14677 c14677) {
        this.f21213 = c14677.m33593();
        this.f21211 = c14677.m33593();
        this.f21210 = C18524.m42109(c14677.m33593(), new String[0]);
        this.f21212 = c14677.readLong();
    }

    public C8049(AbstractC17043 abstractC17043, String str, String str2) {
        this.f21213 = str;
        this.f21211 = str2;
        this.f21210 = abstractC17043;
        this.f21212 = abstractC17043.mo25091();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m18697() {
        this.f21212 = this.f21210.mo25091();
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m18698() {
        return this.f21212;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m18699() {
        AbstractC17043 abstractC17043 = this.f21210;
        return abstractC17043.mo25094() && abstractC17043.mo25091() != this.f21212;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m18700() {
        return this.f21213;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m18696() {
        return this.f21211;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m18694() {
        return this.f21210;
    }

    public final String toString() {
        return this.f21213;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18695(C11996 c11996) {
        c11996.m27459(this.f21213);
        c11996.m27459(this.f21211);
        c11996.m27459(this.f21210.mo25505());
        c11996.m27451(this.f21212);
    }
}
