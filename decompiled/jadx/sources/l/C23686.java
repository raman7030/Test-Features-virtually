package l;

/* JADX INFO: renamed from: l.᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3CI */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C23686 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f76714;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f76715;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC14513 f76716;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52225() {
        synchronized (this) {
            if (this.f76715) {
                return;
            }
            this.f76715 = true;
            this.f76714 = true;
            InterfaceC14513 interfaceC14513 = this.f76716;
            if (interfaceC14513 != null) {
                try {
                    interfaceC14513.mo24234();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f76714 = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f76714 = false;
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52226(InterfaceC14513 interfaceC14513) {
        synchronized (this) {
            while (this.f76714) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f76716 == interfaceC14513) {
                return;
            }
            this.f76716 = interfaceC14513;
            if (this.f76715) {
                interfaceC14513.mo24234();
            }
        }
    }
}
