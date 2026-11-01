package p067l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ܽۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17919 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸ */
    public StringBuffer f53524;

    /* JADX INFO: renamed from: ֫ */
    public static C17919 m40738(String str, Exception exc) {
        C17919 c17919;
        if (exc instanceof C17919) {
            c17919 = (C17919) exc;
        } else {
            c17919 = new C17919(null, exc);
        }
        StringBuffer stringBuffer = c17919.f53524;
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str);
        if (!str.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c17919;
    }

    public C17919(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C17919) {
            String string = ((C17919) exc).f53524.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f53524 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f53524 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f53524);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f53524);
    }
}
