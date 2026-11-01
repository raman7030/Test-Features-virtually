package p067l;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩶ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2QG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21577 implements InterfaceFutureC5483 {

    /* JADX INFO: renamed from: ᩸ */
    public final Object f68033;

    /* JADX INFO: renamed from: ᩹ */
    public static final InterfaceFutureC5483 f68032 = new C21577(null);

    /* JADX INFO: renamed from: ᩶ */
    public static final C6824 f68031 = new C6824(C21577.class);

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public C21577(Object obj) {
        this.f68033 = obj;
    }

    @Override // p067l.InterfaceFutureC5483
    /* JADX INFO: renamed from: ֫ */
    public final void mo12113(Runnable runnable, Executor executor) {
        C6194.m14026(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f68031.m15619().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f68033;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f68033 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f68033;
    }
}
