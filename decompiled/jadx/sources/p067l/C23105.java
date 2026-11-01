package p067l;

/* JADX INFO: renamed from: l.᩸᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ZE */
/* JADX INFO: loaded from: classes.dex */
public final class C23105 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f72602;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC17043 f72603;

    /* JADX INFO: renamed from: ܽ */
    public C10844 f72604;

    public C23105(AbstractC17043 abstractC17043) {
        this.f72602 = abstractC17043;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m51525() {
        return this.f72603;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10844 m51527() {
        return this.f72604;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51526(AbstractC17043 abstractC17043, Runnable runnable, AutoCloseable... autoCloseableArr) {
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            C2700.m4192(autoCloseable);
        }
        this.f72603.m38659(abstractC17043, C21272.f66912, true, runnable);
    }
}
