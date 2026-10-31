package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ܶ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes4.dex */
public class C15431 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuffer f47244;

    public C15431(Exception exc) {
        this(exc, null, new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15431 m36467(Exception exc, String str, Object... objArr) {
        C15431 c15431;
        if (exc instanceof C15431) {
            c15431 = (C15431) exc;
        } else {
            c15431 = new C15431(exc);
        }
        String str2 = String.format(str, objArr);
        StringBuffer stringBuffer = c15431.f47244;
        if (str2 == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str2);
        if (!str2.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c15431;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15431(Exception exc, String str, Object... objArr) {
        String message;
        if (str == null) {
            message = exc != null ? exc.getMessage() : null;
        } else {
            message = String.format(str, objArr);
        }
        super(message, exc);
        if (exc instanceof C15431) {
            String string = ((C15431) exc).f47244.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f47244 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f47244 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f47244);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f47244);
    }
}
