package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.ܽۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16363 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuffer f50351;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16363 m38521(String str, Exception exc) {
        C16363 c16363;
        if (exc instanceof C16363) {
            c16363 = (C16363) exc;
        } else {
            c16363 = new C16363(null, exc);
        }
        StringBuffer stringBuffer = c16363.f50351;
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        stringBuffer.append(str);
        if (!str.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c16363;
    }

    public C16363(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C16363) {
            String string = ((C16363) exc).f50351.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f50351 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f50351 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f50351);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f50351);
    }
}
