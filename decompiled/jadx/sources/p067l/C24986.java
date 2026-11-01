package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes.dex */
public final class C24986 extends AbstractC4643 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18228 f79757;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC17043 f79758;

    /* JADX INFO: renamed from: ܽ */
    public C20689 f79759;

    /* JADX INFO: renamed from: ᩳ */
    public String f79760;

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ܽ */
    public final C15545 mo4356() {
        try {
            return C15545.m35336("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final long mo4352() {
        return this.f79758.mo25101();
    }

    @Override // p067l.AbstractC4643
    /* JADX INFO: renamed from: ֫ */
    public final void mo4353(InterfaceC12257 interfaceC12257) throws IOException {
        InterfaceC3579 interfaceC3579M54972 = C25037.m54972(this.f79758.mo29987());
        while (true) {
            try {
                long jMo6580 = interfaceC3579M54972.mo6580(interfaceC12257.mo28282(), 10240L);
                if (jMo6580 == -1) {
                    break;
                }
                interfaceC12257.flush();
                this.f79759.m46754((int) jMo6580);
            } catch (Throwable th) {
                try {
                    interfaceC3579M54972.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (ServiceC10905.f30231.contains(this.f79760)) {
            InterfaceC18228 interfaceC18228 = this.f79757;
            if (interfaceC18228 != null) {
                interfaceC18228.cancel();
            }
            throw new IOException();
        }
        interfaceC3579M54972.close();
    }
}
