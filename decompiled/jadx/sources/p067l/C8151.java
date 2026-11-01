package p067l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۛ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B32G */
/* JADX INFO: loaded from: classes2.dex */
public final class C8151 extends CancellationException {

    /* JADX INFO: renamed from: ᩸ */
    public final transient C19532 f21512;

    public C8151(String str, Throwable th, C19532 c19532) {
        super(str);
        this.f21512 = c19532;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f21512;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8151)) {
            return false;
        }
        C8151 c8151 = (C8151) obj;
        return C13045.m29864((Object) c8151.getMessage(), (Object) getMessage()) && C13045.m29864(c8151.f21512, this.f21512) && C13045.m29864(c8151.getCause(), getCause());
    }

    public final int hashCode() {
        String message = getMessage();
        C13045.m29861((Object) message);
        int iHashCode = (this.f21512.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }
}
