package p067l;

/* JADX INFO: renamed from: l.۫ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA24 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14345 extends AbstractC5628 implements InterfaceC3835 {

    /* JADX INFO: renamed from: ۖ֫ */
    public boolean f41022;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f41023;

    /* JADX INFO: renamed from: ۡ֫ */
    public Exception f41024;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f41025;

    /* JADX INFO: renamed from: ܺ֫ */
    public Long f41026;

    /* JADX INFO: renamed from: ᩷֫ */
    public boolean f41027;

    public AbstractC14345(InterfaceC3341 interfaceC3341) {
        super(interfaceC3341);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo7517(InterfaceC9571 interfaceC9571) {
        InterfaceC3835 interfaceC3835 = (InterfaceC3835) getNext();
        if (interfaceC3835 != null) {
            interfaceC3835.mo7517(interfaceC9571);
        }
    }

    @Override // p067l.AbstractC5628, p067l.InterfaceC15605
    public final void reset() {
        super.reset();
        this.f41022 = false;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ᩷ */
    public final void mo30272() {
        if (m12490() && m12485() == 259) {
            synchronized (this) {
                notifyAll();
            }
        } else {
            this.f41022 = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ֫ */
    public final void mo30246(Exception exc) {
        this.f41025 = true;
        this.f41024 = exc;
        this.f41022 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۗ */
    public final void mo30252() {
        this.f41025 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۤ */
    public final void mo30260() {
        this.f41022 = false;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo30257() {
        return this.f41022;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo30253() {
        return this.f41025;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ᩳ */
    public final Long mo30269() {
        return this.f41026;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ֫ */
    public final void mo30247(Long l2) {
        this.f41026 = l2;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean m32943() {
        return this.f41027;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final void m32945() {
        this.f41027 = true;
    }

    @Override // p067l.InterfaceC15194
    public final Exception getException() {
        return this.f41024;
    }

    @Override // p067l.InterfaceC15194
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo30258() {
        return this.f41023;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ֫ */
    public final void mo12472(int i, int i2, byte[] bArr) throws C19258 {
        if (m12479()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            m12488(bArr2);
        }
        if (m32944(i, i2, bArr)) {
            this.f41027 = false;
            mo30272();
            return;
        }
        throw new C19258("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32944(int i, int i2, byte[] bArr) {
        C8310 digest = getDigest();
        if (digest == null || m12490() || !(((C15410) m12497()).m35126() || m12485() == 0)) {
            return true;
        }
        boolean zM19166 = digest.m19166(bArr, i, i2, this);
        this.f41023 = zM19166;
        return !zM19166;
    }
}
