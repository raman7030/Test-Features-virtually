package l;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۗ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3117 implements InterfaceC18581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f9739 = new AtomicBoolean();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC3575 f9740;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20256 f9741;

    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo9498() {
    }

    public C3117(FutureC3575 futureC3575, C20256 c20256) {
        this.f9740 = futureC3575;
        this.f9741 = c20256;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    @Override // l.InterfaceC18581
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9497() {
        C20256 c20256 = this.f9741;
        AtomicBoolean atomicBoolean = this.f9739;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Fragment state persistence must wait in the background");
        }
        try {
            this.f9740.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            if (atomicBoolean.compareAndSet(false, true)) {
                c20256.m46502((Throwable) e);
            }
        } catch (CancellationException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if ((e instanceof CancellationException) && atomicBoolean.compareAndSet(false, true)) {
                c20256.m46502(e);
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
