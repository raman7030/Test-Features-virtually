package p067l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ܶ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes4.dex */
public class C17034 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸ */
    public StringBuffer f50373;

    public C17034(Exception exc) {
        this(exc, null, new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17034 m38625(Exception exc, String str, Object... objArr) {
        C17034 c17034;
        if (exc instanceof C17034) {
            c17034 = (C17034) exc;
        } else {
            c17034 = new C17034(exc);
        }
        String str2 = String.format(str, objArr);
        StringBuffer stringBuffer = c17034.f50373;
        if (str2 == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str2);
        if (!str2.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c17034;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17034(Exception exc, String str, Object... objArr) {
        String message;
        if (str == null) {
            message = exc != null ? exc.getMessage() : null;
        } else {
            message = String.format(str, objArr);
        }
        super(message, exc);
        if (exc instanceof C17034) {
            String string = ((C17034) exc).f50373.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f50373 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f50373 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f50373);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f50373);
    }
}
