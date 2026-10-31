package l;

/* JADX INFO: renamed from: l.ܳ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AX2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14550 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f44566;

    public C14550(InterfaceC14801 interfaceC14801) {
        this.f44566 = interfaceC14801;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f44566.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
