package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ᩴܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2NA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC20236 extends AbstractC7495 implements Runnable {

    /* JADX INFO: renamed from: ۨ */
    public static final /* synthetic */ int f62557 = 0;

    /* JADX INFO: renamed from: ۛ */
    public InterfaceFutureC5483 f62558;

    /* JADX INFO: renamed from: ۤ */
    public C16451 f62559;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC5483 interfaceFutureC5483 = this.f62558;
        C16451 c16451 = this.f62559;
        if (((this.f10920 instanceof C24517) | (interfaceFutureC5483 == null)) || (c16451 == null)) {
            return;
        }
        this.f62558 = null;
        ((C21577) interfaceFutureC5483).getClass();
        try {
            Object objM30788 = C13530.m30788(interfaceFutureC5483);
            try {
                c16451.apply(objM30788);
                this.f62559 = null;
                ((C6154) this).mo28151(objM30788);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    mo28152(th);
                } finally {
                    this.f62559 = null;
                }
            }
        } catch (Error e) {
            mo28152((Throwable) e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo28152(e2.getCause());
        } catch (Exception e3) {
            mo28152((Throwable) e3);
        }
    }

    @Override // p067l.AbstractC18894
    /* JADX INFO: renamed from: ᩳ */
    public final void mo42996() {
        InterfaceFutureC5483 interfaceFutureC5483 = this.f62558;
        if ((interfaceFutureC5483 != null) & (this.f10920 instanceof C24517)) {
            Object obj = this.f10920;
            if (obj instanceof C24517) {
                boolean z = ((C24517) obj).f77663;
            }
            interfaceFutureC5483.getClass();
        }
        this.f62558 = null;
        this.f62559 = null;
    }

    @Override // p067l.AbstractC18894
    /* JADX INFO: renamed from: ܿ */
    public final String mo42995() {
        String str;
        InterfaceFutureC5483 interfaceFutureC5483 = this.f62558;
        C16451 c16451 = this.f62559;
        String strMo42995 = super.mo42995();
        if (interfaceFutureC5483 != null) {
            str = "inputFuture=[" + interfaceFutureC5483 + "], ";
        } else {
            str = "";
        }
        if (c16451 == null) {
            if (strMo42995 != null) {
                return C17588.m40053(str, strMo42995);
            }
            return null;
        }
        return str + "function=[" + c16451 + "]";
    }
}
