package l;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.᩶ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T2QG */
/* JADX INFO: loaded from: classes5.dex */
public final class C20211 implements InterfaceFutureC3277 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f65386;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final InterfaceFutureC3277 f65385 = new C20211(null);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4688 f65384 = new C4688(C20211.class);

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

    public C20211(Object obj) {
        this.f65386 = obj;
    }

    @Override // l.InterfaceFutureC3277
    /* JADX INFO: renamed from: ֫ */
    public final void mo10080(Runnable runnable, Executor executor) {
        C4025.m12106(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f65384.m13744().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f65386;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f65386 + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f65386;
    }
}
