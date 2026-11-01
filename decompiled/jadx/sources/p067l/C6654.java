package p067l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۙ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6654 implements InterfaceC3579 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC8233 f17166;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC14700 f17167;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f17168;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC12257 f17169;

    public C6654(InterfaceC8233 interfaceC8233, InterfaceC14700 interfaceC14700, InterfaceC12257 interfaceC12257) {
        this.f17166 = interfaceC8233;
        this.f17167 = interfaceC14700;
        this.f17169 = interfaceC12257;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) throws IOException {
        try {
            long jMo6580 = this.f17166.mo6580(c14268, 8192L);
            InterfaceC12257 interfaceC12257 = this.f17169;
            if (jMo6580 == -1) {
                if (!this.f17168) {
                    this.f17168 = true;
                    interfaceC12257.close();
                }
                return -1L;
            }
            c14268.m32785(interfaceC12257.mo28282(), c14268.size() - jMo6580, jMo6580);
            interfaceC12257.mo28277();
            return jMo6580;
        } catch (IOException e) {
            if (!this.f17168) {
                this.f17168 = true;
                this.f17167.mo19637();
            }
            throw e;
        }
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f17166.mo6579();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM48500;
        if (!this.f17168) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM48500 = C21407.m48500(this, 100);
            } catch (IOException unused) {
                zM48500 = false;
            }
            if (!zM48500) {
                this.f17168 = true;
                this.f17167.mo19637();
            }
        }
        this.f17166.close();
    }
}
