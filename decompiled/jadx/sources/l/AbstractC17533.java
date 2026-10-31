package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܿᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8JY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17533 extends AbstractC20432 implements InterfaceC13571 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f53545;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC13571 f53546;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40971(long j, InterfaceC13571 interfaceC13571, long j2) {
        this.f65926 = j;
        this.f53546 = interfaceC13571;
        if (j2 != C13132.FOREVER_NS) {
            j = j2;
        }
        this.f53545 = j;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4658() {
        InterfaceC13571 interfaceC13571 = this.f53546;
        interfaceC13571.getClass();
        return interfaceC13571.mo4658();
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final long mo4660(int i) {
        InterfaceC13571 interfaceC13571 = this.f53546;
        interfaceC13571.getClass();
        return interfaceC13571.mo4660(i) + this.f53545;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4659(long j) {
        InterfaceC13571 interfaceC13571 = this.f53546;
        interfaceC13571.getClass();
        return interfaceC13571.mo4659(j - this.f53545);
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ܽ */
    public final List mo4661(long j) {
        InterfaceC13571 interfaceC13571 = this.f53546;
        interfaceC13571.getClass();
        return interfaceC13571.mo4661(j - this.f53545);
    }

    @Override // l.AbstractC20432, l.AbstractC4204
    /* JADX INFO: renamed from: ۧ */
    public final void mo7() {
        super.mo7();
        this.f53546 = null;
    }
}
