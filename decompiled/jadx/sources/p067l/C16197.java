package p067l;

/* JADX INFO: renamed from: l.ܳ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16197 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC16436 f47673;

    public C16197(InterfaceC16436 interfaceC16436) {
        this.f47673 = interfaceC16436;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f47673.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
