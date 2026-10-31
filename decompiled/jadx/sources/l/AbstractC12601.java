package l;

/* JADX INFO: renamed from: l.۫ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA24 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12601 extends AbstractC3429 implements InterfaceC1543 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f37995;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f37996;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public Exception f37997;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f37998;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public Long f37999;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f38000;

    public AbstractC12601(InterfaceC1023 interfaceC1023) {
        super(interfaceC1023);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5288(InterfaceC7578 interfaceC7578) {
        InterfaceC1543 interfaceC1543 = (InterfaceC1543) getNext();
        if (interfaceC1543 != null) {
            interfaceC1543.mo5288(interfaceC7578);
        }
    }

    @Override // l.AbstractC3429, l.InterfaceC13927
    public final void reset() {
        super.reset();
        this.f37995 = false;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ᩷ */
    public final void mo28228() {
        if (m10451() && m10446() == 259) {
            synchronized (this) {
                notifyAll();
            }
        } else {
            this.f37995 = true;
            synchronized (this) {
                notifyAll();
            }
        }
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ֫ */
    public final void mo28202(Exception exc) {
        this.f37998 = true;
        this.f37997 = exc;
        this.f37995 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۗ */
    public final void mo28208() {
        this.f37998 = true;
        synchronized (this) {
            notifyAll();
        }
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۤ */
    public final void mo28216() {
        this.f37995 = false;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo28213() {
        return this.f37995;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo28209() {
        return this.f37998;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ᩳ */
    public final Long mo28225() {
        return this.f37999;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ֫ */
    public final void mo28203(Long l2) {
        this.f37999 = l2;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30866() {
        return this.f38000;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final void m30868() {
        this.f38000 = true;
    }

    @Override // l.InterfaceC13495
    public final Exception getException() {
        return this.f37997;
    }

    @Override // l.InterfaceC13495
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo28214() {
        return this.f37996;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ֫ */
    public final void mo10433(int i, int i2, byte[] bArr) throws C17771 {
        if (m10440()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            m10449(bArr2);
        }
        if (m30867(i, i2, bArr)) {
            this.f38000 = false;
            mo28228();
            return;
        }
        throw new C17771("Signature verification failed for ".concat(getClass().getName()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30867(int i, int i2, byte[] bArr) {
        C6251 digest = getDigest();
        if (digest == null || m10451() || !(((C13722) m10458()).m33012() || m10446() == 0)) {
            return true;
        }
        boolean zM17228 = digest.m17228(bArr, i, i2, this);
        this.f37996 = zM17228;
        return !zM17228;
    }
}
