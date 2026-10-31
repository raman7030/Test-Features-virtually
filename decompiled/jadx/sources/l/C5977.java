package l;

/* JADX INFO: renamed from: l.ۛۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1YC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5977 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f18358;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f18359;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f18360;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f18361;

    public C5977(C12951 c12951) {
        this.f18361 = c12951.m31506();
        this.f18359 = c12951.m31506();
        this.f18358 = C16999.m39866(c12951.m31506(), new String[0]);
        this.f18360 = c12951.readLong();
    }

    public C5977(AbstractC15440 abstractC15440, String str, String str2) {
        this.f18361 = str;
        this.f18359 = str2;
        this.f18358 = abstractC15440;
        this.f18360 = abstractC15440.mo23117();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m16771() {
        this.f18360 = this.f18358.mo23117();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m16772() {
        return this.f18360;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m16773() {
        AbstractC15440 abstractC15440 = this.f18358;
        return abstractC15440.mo23120() && abstractC15440.mo23117() != this.f18360;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m16774() {
        return this.f18361;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m16770() {
        return this.f18359;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m16768() {
        return this.f18358;
    }

    public final String toString() {
        return this.f18361;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16769(C10130 c10130) {
        c10130.m25439(this.f18361);
        c10130.m25439(this.f18359);
        c10130.m25439(this.f18358.mo23554());
        c10130.m25431(this.f18360);
    }
}
