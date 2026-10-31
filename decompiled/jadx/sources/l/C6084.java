package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۛ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B32G */
/* JADX INFO: loaded from: classes2.dex */
public final class C6084 extends CancellationException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final transient C18059 f18656;

    public C6084(String str, Throwable th, C18059 c18059) {
        super(str);
        this.f18656 = c18059;
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
        return super.toString() + "; job=" + this.f18656;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6084)) {
            return false;
        }
        C6084 c6084 = (C6084) obj;
        return C11233.m27802((Object) c6084.getMessage(), (Object) getMessage()) && C11233.m27802(c6084.f18656, this.f18656) && C11233.m27802(c6084.getCause(), getCause());
    }

    public final int hashCode() {
        String message = getMessage();
        C11233.m27799((Object) message);
        int iHashCode = (this.f18656.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }
}
