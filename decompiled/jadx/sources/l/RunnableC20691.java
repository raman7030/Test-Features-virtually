package l;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20691 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2346 f66648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10405 f66649;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4488 f66650;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorService f66651;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC23094 f66652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Future f66653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f66654 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f66655;

    public RunnableC20691(C2346 c2346, C4488 c4488, ExecutorService executorService, InterfaceC23094 interfaceC23094) {
        this.f66648 = c2346;
        this.f66650 = c4488;
        this.f66651 = executorService;
        this.f66652 = interfaceC23094;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC23094 interfaceC23094 = this.f66652;
        ExecutorService executorService = this.f66651;
        try {
            try {
                try {
                    C18390.m42816(this.f66650.keySet(), new C6579(this, this.f66648));
                    executorService.shutdown();
                    executorService.awaitTermination(1L, TimeUnit.HOURS);
                } catch (InterruptedException unused) {
                }
            } catch (IOException e) {
                if (!interfaceC23094.mo1526()) {
                    interfaceC23094.mo8531(e);
                }
                executorService.shutdown();
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            } catch (Exception e2) {
                if (!interfaceC23094.mo1526()) {
                    interfaceC23094.mo8531(new IOException(e2));
                }
                executorService.shutdown();
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            }
        } catch (Throwable th) {
            executorService.shutdown();
            try {
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            } catch (InterruptedException unused2) {
            }
            throw th;
        }
    }
}
