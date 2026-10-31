package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4509 implements InterfaceC1274 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6171 f14339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12975 f14340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f14341;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10405 f14342;

    public C4509(InterfaceC6171 interfaceC6171, InterfaceC12975 interfaceC12975, InterfaceC10405 interfaceC10405) {
        this.f14339 = interfaceC6171;
        this.f14340 = interfaceC12975;
        this.f14342 = interfaceC10405;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) throws IOException {
        try {
            long jMo4334 = this.f14339.mo4334(c12521, 8192L);
            InterfaceC10405 interfaceC10405 = this.f14342;
            if (jMo4334 == -1) {
                if (!this.f14341) {
                    this.f14341 = true;
                    interfaceC10405.close();
                }
                return -1L;
            }
            c12521.m30711(interfaceC10405.mo26253(), c12521.size() - jMo4334, jMo4334);
            interfaceC10405.mo26248();
            return jMo4334;
        } catch (IOException e) {
            if (!this.f14341) {
                this.f14341 = true;
                this.f14340.mo17690();
            }
            throw e;
        }
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f14339.mo4333();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM46184;
        if (!this.f14341) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM46184 = C20032.m46184(this, 100);
            } catch (IOException unused) {
                zM46184 = false;
            }
            if (!zM46184) {
                this.f14341 = true;
                this.f14340.mo17690();
            }
        }
        this.f14339.close();
    }
}
