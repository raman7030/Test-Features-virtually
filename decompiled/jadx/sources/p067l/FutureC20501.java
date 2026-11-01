package p067l;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ᩴ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C19Y */
/* JADX INFO: loaded from: classes4.dex */
public final class FutureC20501 implements Future {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ byte[] f63300;

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

    public FutureC20501(byte[] bArr) {
        this.f63300 = bArr;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f63300;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f63300;
    }
}
