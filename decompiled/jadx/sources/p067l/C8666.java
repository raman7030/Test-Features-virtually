package p067l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ۜ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8666 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C22078 f23272;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC19570 f23273;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8666(C22078 c22078, InterfaceC19570 interfaceC19570) {
        super("OkHttp %s", c22078.f69446.f29566.m30821());
        this.f23272 = c22078;
        this.f23273 = interfaceC19570;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20109(ExecutorService executorService) {
        C22078 c22078 = this.f23272;
        C18724 c18724 = c22078.f69449;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                c22078.f69450.getClass();
                this.f23273.mo44480(interruptedIOException);
                c18724.f55954.m17323(this);
            }
        } catch (Throwable th) {
            c18724.f55954.m17323(this);
            throw th;
        }
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        InterfaceC19570 interfaceC19570 = this.f23273;
        C22078 c22078 = this.f23272;
        C18724 c18724 = c22078.f69449;
        c22078.f69447.m15805();
        boolean z = false;
        try {
            try {
                try {
                    interfaceC19570.mo44481(c22078.m49700());
                } catch (IOException e) {
                    e = e;
                    z = true;
                    IOException iOExceptionM49699 = c22078.m49699(e);
                    if (z) {
                        C20304 c20304M45846 = C20304.m45846();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        StringBuilder sb2 = new StringBuilder();
                        C21545.m48729(sb2, c22078.f69445.m50601() ? "canceled " : "", "call", " to ");
                        sb2.append(c22078.f69446.f29566.m30821());
                        sb.append(sb2.toString());
                        c20304M45846.mo45848(4, sb.toString(), iOExceptionM49699);
                    } else {
                        c22078.f69450.getClass();
                        interfaceC19570.mo44480(iOExceptionM49699);
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    c22078.cancel();
                    if (!z) {
                        interfaceC19570.mo44480(new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c18724.f55954.m17323(this);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        c18724.f55954.m17323(this);
    }
}
