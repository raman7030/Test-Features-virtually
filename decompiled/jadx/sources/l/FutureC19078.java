package l;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ᩴ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C19Y */
/* JADX INFO: loaded from: classes4.dex */
public final class FutureC19078 implements Future {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f60066;

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

    public FutureC19078(byte[] bArr) {
        this.f60066 = bArr;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f60066;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f60066;
    }
}
