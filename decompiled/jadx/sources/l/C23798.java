package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes.dex */
public final class C23798 extends AbstractC2393 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC16687 f77004;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f77005;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19277 f77006;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f77007;

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ܽ */
    public final C13864 mo1980() {
        try {
            return C13864.m33217("application/octet-stream");
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫ */
    public final long mo1976() {
        return this.f77005.mo23127();
    }

    @Override // l.AbstractC2393
    /* JADX INFO: renamed from: ֫ */
    public final void mo1977(InterfaceC10405 interfaceC10405) throws IOException {
        InterfaceC1274 interfaceC1274M52563 = C23852.m52563(this.f77005.mo27926());
        while (true) {
            try {
                long jMo4334 = interfaceC1274M52563.mo4334(interfaceC10405.mo26253(), 10240L);
                if (jMo4334 == -1) {
                    break;
                }
                interfaceC10405.flush();
                this.f77006.m44460((int) jMo4334);
            } catch (Throwable th) {
                try {
                    interfaceC1274M52563.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (ServiceC8982.f27296.contains(this.f77007)) {
            InterfaceC16687 interfaceC16687 = this.f77004;
            if (interfaceC16687 != null) {
                interfaceC16687.cancel();
            }
            throw new IOException();
        }
        interfaceC1274M52563.close();
    }
}
