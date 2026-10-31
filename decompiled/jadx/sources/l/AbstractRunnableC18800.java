package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ᩴܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2NA */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC18800 extends AbstractC5394 implements Runnable {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59334 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceFutureC3277 f59335;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14817 f59336;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC3277 interfaceFutureC3277 = this.f59335;
        C14817 c14817 = this.f59336;
        if (((this.f8130 instanceof C23304) | (interfaceFutureC3277 == null)) || (c14817 == null)) {
            return;
        }
        this.f59335 = null;
        ((C20211) interfaceFutureC3277).getClass();
        try {
            Object objM28740 = C11744.m28740(interfaceFutureC3277);
            try {
                c14817.apply(objM28740);
                this.f59336 = null;
                ((C3983) this).mo26126(objM28740);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    mo26127(th);
                } finally {
                    this.f59336 = null;
                }
            }
        } catch (Error e) {
            mo26127((Throwable) e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            mo26127(e2.getCause());
        } catch (Exception e3) {
            mo26127((Throwable) e3);
        }
    }

    @Override // l.AbstractC17388
    /* JADX INFO: renamed from: ᩳ */
    public final void mo40743() {
        InterfaceFutureC3277 interfaceFutureC3277 = this.f59335;
        if ((interfaceFutureC3277 != null) & (this.f8130 instanceof C23304)) {
            Object obj = this.f8130;
            if (obj instanceof C23304) {
                boolean z = ((C23304) obj).f74918;
            }
            interfaceFutureC3277.getClass();
        }
        this.f59335 = null;
        this.f59336 = null;
    }

    @Override // l.AbstractC17388
    /* JADX INFO: renamed from: ܿ */
    public final String mo40742() {
        String str;
        InterfaceFutureC3277 interfaceFutureC3277 = this.f59335;
        C14817 c14817 = this.f59336;
        String strMo40742 = super.mo40742();
        if (interfaceFutureC3277 != null) {
            str = "inputFuture=[" + interfaceFutureC3277 + "], ";
        } else {
            str = "";
        }
        if (c14817 == null) {
            if (strMo40742 != null) {
                return C16014.m37867(str, strMo40742);
            }
            return null;
        }
        return str + "function=[" + c14817 + "]";
    }
}
