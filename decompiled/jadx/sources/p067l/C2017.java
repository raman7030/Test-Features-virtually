package p067l;

/* JADX INFO: renamed from: l.᩻۫ */
/* JADX INFO: compiled from: Z3CI */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C2017 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f79464;

    /* JADX INFO: renamed from: ۧ */
    public boolean f79465;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC1562 f79466;

    /* JADX INFO: renamed from: ֫ */
    public final void m54628() {
        synchronized (this) {
            if (this.f79465) {
                return;
            }
            this.f79465 = true;
            this.f79464 = true;
            InterfaceC1562 interfaceC1562 = this.f79466;
            if (interfaceC1562 != null) {
                try {
                    interfaceC1562.mo26244();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f79464 = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f79464 = false;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54629(InterfaceC1562 interfaceC1562) {
        synchronized (this) {
            while (this.f79464) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f79466 == interfaceC1562) {
                return;
            }
            this.f79466 = interfaceC1562;
            if (this.f79465) {
                interfaceC1562.mo26244();
            }
        }
    }
}
