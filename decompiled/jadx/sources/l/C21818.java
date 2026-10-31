package l;

/* JADX INFO: renamed from: l.᩸᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes.dex */
public final class C21818 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f69893;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f69894;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8918 f69895;

    public C21818(AbstractC15440 abstractC15440) {
        this.f69893 = abstractC15440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m49174() {
        return this.f69894;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8918 m49176() {
        return this.f69895;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49175(AbstractC15440 abstractC15440, Runnable runnable, AutoCloseable... autoCloseableArr) {
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            C0349.m1793(autoCloseable);
        }
        this.f69894.m36501(abstractC15440, C19890.f64276, true, runnable);
    }
}
