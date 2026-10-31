package l;

/* JADX INFO: renamed from: l.ۢۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 096Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C9426 extends Error {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RuntimeException f28602;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public C9426(RuntimeException runtimeException) {
        super(null, runtimeException);
        this.f28602 = runtimeException;
    }
}
