package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.m */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0027m extends FutureTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallableC0031q f122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0026l f123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0027m(C0026l c0026l, Callable callable, CallableC0031q callableC0031q) {
        super(callable);
        this.f123b = c0026l;
        this.f122a = callableC0031q;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        String msg;
        int code;
        C0029o c0029oM255e = this.f122a.m255e();
        InterfaceC0014ae interfaceC0014aeM261f = c0029oM255e.m261f();
        if (interfaceC0014aeM261f == null) {
            super.done();
            return;
        }
        try {
            C0036v c0036v = (C0036v) get();
            if (!isCancelled() && !c0029oM255e.m263h()) {
                if (c0036v != null) {
                    interfaceC0014aeM261f.m164a(c0029oM255e, c0036v);
                    return;
                }
                return;
            }
            c0029oM255e.m262g();
            if (!isCancelled() || !isDone()) {
                cancel(false);
            }
            interfaceC0014aeM261f.m161a(c0029oM255e);
        } catch (InterruptedException e) {
            interfaceC0014aeM261f.m163a(c0029oM255e, 7, e + "");
        } catch (CancellationException unused) {
            c0029oM255e.m262g();
            interfaceC0014aeM261f.m161a(c0029oM255e);
        } catch (ExecutionException e2) {
            if (e2.getCause() == null || !(e2.getCause() instanceof HttpException)) {
                msg = e2 + "";
                code = 6;
            } else {
                HttpException httpException = (HttpException) e2.getCause();
                code = httpException.getCode();
                msg = httpException.getMsg();
            }
            interfaceC0014aeM261f.m163a(c0029oM255e, code, msg);
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
