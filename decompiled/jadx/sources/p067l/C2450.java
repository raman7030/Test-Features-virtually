package p067l;

/* JADX INFO: renamed from: l.֡֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAQI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2450 extends Exception {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f3794;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f3795;

    /* JADX INFO: renamed from: ᩹ */
    public final String f3796;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public C2450(int i, String str) {
        super(C7050.m16224(i));
        this.f3796 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m3445() {
        this.f3795 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m3444() {
        this.f3794 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m3441() {
        return this.f3796;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m3442() {
        return this.f3795;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m3443() {
        return this.f3794;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage() + "\n" + this.f3796;
    }
}
