package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ۜ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G4FN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6626 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20738 f20396;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18099 f20397;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6626(C20738 c20738, InterfaceC18099 interfaceC18099) {
        super("OkHttp %s", c20738.f66762.f26640.m28774());
        this.f20396 = c20738;
        this.f20397 = interfaceC18099;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18157(ExecutorService executorService) {
        C20738 c20738 = this.f20396;
        C17209 c17209 = c20738.f66765;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                c20738.f66766.getClass();
                this.f20397.mo42221(interruptedIOException);
                c17209.f52772.m15412(this);
            }
        } catch (Throwable th) {
            c17209.f52772.m15412(this);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        InterfaceC18099 interfaceC18099 = this.f20397;
        C20738 c20738 = this.f20396;
        C17209 c17209 = c20738.f66765;
        c20738.f66763.m13925();
        boolean z = false;
        try {
            try {
                try {
                    interfaceC18099.mo42222(c20738.m47373());
                } catch (IOException e) {
                    e = e;
                    z = true;
                    IOException iOExceptionM47372 = c20738.m47372(e);
                    if (z) {
                        C18872 c18872M43580 = C18872.m43580();
                        StringBuilder sb = new StringBuilder("Callback failure for ");
                        StringBuilder sb2 = new StringBuilder();
                        C20177.m46410(sb2, c20738.f66761.m48270() ? "canceled " : "", "call", " to ");
                        sb2.append(c20738.f66762.f26640.m28774());
                        sb.append(sb2.toString());
                        c18872M43580.mo43582(4, sb.toString(), iOExceptionM47372);
                    } else {
                        c20738.f66766.getClass();
                        interfaceC18099.mo42221(iOExceptionM47372);
                    }
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    c20738.cancel();
                    if (!z) {
                        interfaceC18099.mo42221(new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c17209.f52772.m15412(this);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        c17209.f52772.m15412(this);
    }
}
