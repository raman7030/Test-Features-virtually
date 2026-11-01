package p067l;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩷ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC22033 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C4598 f69330;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC12257 f69331;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C6634 f69332;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ExecutorService f69333;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ InterfaceC24317 f69334;

    /* JADX INFO: renamed from: ᩶ */
    public Future f69335;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC19370 f69336 = null;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f69337;

    public RunnableC22033(C4598 c4598, C6634 c6634, ExecutorService executorService, InterfaceC24317 interfaceC24317) {
        this.f69330 = c4598;
        this.f69332 = c6634;
        this.f69333 = executorService;
        this.f69334 = interfaceC24317;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC24317 interfaceC24317 = this.f69334;
        ExecutorService executorService = this.f69333;
        try {
            try {
                try {
                    C19847.m45088(this.f69332.keySet(), new C8621(this, this.f69330));
                    executorService.shutdown();
                    executorService.awaitTermination(1L, TimeUnit.HOURS);
                } catch (InterruptedException unused) {
                }
            } catch (IOException e) {
                if (!interfaceC24317.mo3924()) {
                    interfaceC24317.mo10594(e);
                }
                executorService.shutdown();
                executorService.awaitTermination(1L, TimeUnit.HOURS);
            } catch (Exception e2) {
                if (!interfaceC24317.mo3924()) {
                    interfaceC24317.mo10594(new IOException(e2));
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
