package l;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: l.۠ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5SW */
/* JADX INFO: loaded from: classes3.dex */
public class C8136 extends RuntimeException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public StringBuffer f25112;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8136 m21601(String str, Exception exc) {
        C8136 c8136;
        if (exc instanceof C8136) {
            c8136 = (C8136) exc;
        } else {
            c8136 = new C8136(null, exc);
        }
        c8136.m21602(str);
        return c8136;
    }

    public C8136(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (exc instanceof C8136) {
            String string = ((C8136) exc).f25112.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.f25112 = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.f25112 = new StringBuffer(200);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f25112);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f25112);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21602(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        StringBuffer stringBuffer = this.f25112;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }
}
