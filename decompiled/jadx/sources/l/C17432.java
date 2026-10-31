package l;

/* JADX INFO: renamed from: l.ܿܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O99Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C17432 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C17432 f53288 = new C17432("Permission denied");

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
