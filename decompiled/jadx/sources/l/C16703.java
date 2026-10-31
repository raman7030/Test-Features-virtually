package l;

/* JADX INFO: renamed from: l.ܽܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B9V */
/* JADX INFO: loaded from: classes5.dex */
public final class C16703 extends AbstractC8237 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21480 f51289;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39268(C21480 c21480) {
        return c21480.m48644() + ' ' + c21480.m48653().toString() + ": " + c21480.m48637().mo2463();
    }

    public C16703(C10191 c10191, C21480 c21480) {
        super(c10191);
        if (c21480 == null) {
            throw new NullPointerException("local == null");
        }
        this.f51289 = c21480;
    }

    @Override // l.AbstractC8237, l.AbstractC4793
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC4793 mo3994(int i) {
        return new C16703(m13983(), this.f51289.m48640(i));
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo2081(C20069 c20069) {
        return new C16703(m13983(), this.f51289);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21480 m39269() {
        return this.f51289;
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final String mo2080() {
        return this.f51289.toString();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܺ */
    public final String mo2085() {
        return "local-start " + m39268(this.f51289);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC4793 mo13980(C16354 c16354) {
        return new C16703(m13983(), c16354.mo9123(this.f51289));
    }
}
