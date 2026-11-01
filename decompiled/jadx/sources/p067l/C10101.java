package p067l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۠ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes3.dex */
public class C10101 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸ */
    public StringBuffer f28025;

    /* JADX INFO: renamed from: ֫ */
    public static C10101 m23569(String str, Exception exc) {
        C10101 c10101;
        if (exc instanceof C10101) {
            c10101 = (C10101) exc;
        } else {
            c10101 = new C10101(null, exc);
        }
        c10101.m23570(str);
        return c10101;
    }

    public C10101(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C10101) {
            String string = ((C10101) exc).f28025.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f28025 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f28025 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f28025);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f28025);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23570(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f28025;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }
}
