package p067l;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۗ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C5331 implements InterfaceC20028 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicBoolean f12542 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ FutureC5767 f12543;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C21620 f12544;

    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ۧ */
    public final void mo11541() {
    }

    public C5331(FutureC5767 futureC5767, C21620 c21620) {
        this.f12543 = futureC5767;
        this.f12544 = c21620;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // p067l.InterfaceC20028
    /* JADX INFO: renamed from: ֫ */
    public final void mo11540() {
        C21620 c21620 = this.f12544;
        AtomicBoolean atomicBoolean = this.f12542;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Fragment state persistence must wait in the background");
        }
        try {
            this.f12543.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (atomicBoolean.compareAndSet(false, true)) {
                c21620.m48823((Throwable) e);
            }
        } catch (CancellationException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if ((e instanceof CancellationException) && atomicBoolean.compareAndSet(false, true)) {
                c21620.m48823(e);
            }
        } catch (ExecutionException e3) {
            e = e3;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof CancellationException) {
            }
        }
    }
}
