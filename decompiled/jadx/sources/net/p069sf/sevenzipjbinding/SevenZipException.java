package net.p069sf.sevenzipjbinding;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import p067l.C17588;
import p067l.C21545;
import p067l.C22512;
import p067l.C9100;
import p067l.EnumC2483;

/* JADX INFO: loaded from: classes.dex */
public class SevenZipException extends IOException {
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final long serialVersionUID = 42;
    public Throwable causeFirstPotentialThrown;
    public Throwable causeLastPotentialThrown;
    public Throwable causeLastThrown;

    public SevenZipException() {
    }

    public SevenZipException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    public SevenZipException(String str) {
        super(str);
    }

    public SevenZipException(Throwable th) {
        initCause(th);
    }

    private void setCauseLastThrown(Throwable th) {
        this.causeLastThrown = th;
    }

    private void setCauseFirstPotentialThrown(Throwable th) {
        this.causeFirstPotentialThrown = th;
    }

    private void setCauseLastPotentialThrown(Throwable th) {
        this.causeLastPotentialThrown = th;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getMessage(false);
    }

    public String getSevenZipExceptionMessage() {
        return super.getMessage();
    }

    private String getMessage(boolean z) {
        if (this.causeLastThrown == null && this.causeFirstPotentialThrown == null && this.causeLastPotentialThrown == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        printToStringBuilder("", sb, z);
        return sb.toString();
    }

    private void printToStringBuilder(String str, StringBuilder sb, boolean z) {
        String message = super.getMessage();
        if (message == null) {
            sb.append("No message");
        } else {
            sb.append(message);
        }
        if (str.length() == 0 && !z) {
            sb.append(NEW_LINE);
            sb.append("This SevenZipException has multiple 'cause by' exceptions. Use one of the SevenZipException.printStackTraceExtended(..) methods to get stack trace of last thrown and first/last potiential thrown 'cause by' exceptions.");
        }
        Throwable cause = getCause();
        if (cause != null) {
            C21545.m48729(sb, NEW_LINE, str, "Caused by (first thrown): ");
            printMessageToStringBuilder(str, sb, cause);
        }
        if (this.causeLastThrown != null) {
            C21545.m48729(sb, NEW_LINE, str, "Caused by (last thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastThrown);
        }
        if (this.causeFirstPotentialThrown != null) {
            C21545.m48729(sb, NEW_LINE, str, "Caused by (first potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeFirstPotentialThrown);
        }
        if (this.causeLastPotentialThrown != null) {
            C21545.m48729(sb, NEW_LINE, str, "Caused by (last potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastPotentialThrown);
        }
    }

    private void printMessageToStringBuilder(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getClass().getCanonicalName());
        sb.append(": ");
        if (th instanceof SevenZipException) {
            ((SevenZipException) th).printToStringBuilder(C17588.m40053(str, EnumC2483.f3919), sb, false);
        } else {
            sb.append(th.getMessage());
        }
    }

    public void printStackTraceExtended() {
        printStackTraceExtended(System.err);
    }

    public void printStackTraceExtended(PrintStream printStream) {
        synchronized (printStream) {
            printStackTraceToPrintWriter(new PrintWriter(new C9100(printStream)), this, null);
        }
    }

    public void printStackTraceExtended(PrintWriter printWriter) {
        synchronized (printWriter) {
            printStackTraceToPrintWriter(printWriter, this, null);
        }
    }

    public static void printStackTraceOfThrowable(PrintWriter printWriter, Throwable th, Throwable th2) {
        if (th instanceof SevenZipException) {
            printStackTraceToPrintWriter(printWriter, (SevenZipException) th, th2);
        } else {
            printStackTraceRecursive(printWriter, th, th2);
        }
    }

    public static void printStackTraceToPrintWriter(PrintWriter printWriter, SevenZipException sevenZipException, Throwable th) {
        if (sevenZipException.causeLastThrown == null && sevenZipException.causeFirstPotentialThrown == null && sevenZipException.causeLastPotentialThrown == null) {
            printStackTraceRecursive(printWriter, sevenZipException, th);
        }
        printWriter.println("+------ SevenZipException with multiple 'cause by' exceptions. Stacktraces for all involved exceptions:");
        printWriter.println("+-- The SevenZipException itself with first thrown 'cause by' exception (first cause): ");
        printStackTraceRecursive(new PrintWriter(new C22512(printWriter, "  FIRST THROWN CAUSE ")), sevenZipException, th);
        if (sevenZipException.causeLastThrown != null) {
            printWriter.println("+-- Last thrown 'cause by' exception (last cause): ");
            printStackTraceOfThrowable(new PrintWriter(new C22512(printWriter, "  LAST THROWN CAUSE ")), sevenZipException.causeLastThrown, sevenZipException);
        }
        if (sevenZipException.causeFirstPotentialThrown != null) {
            printWriter.println("+-- First thrown potential 'cause by' exception, thrown in an other thread (first possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new C22512(printWriter, "  FIRST THROWN POTENTIAL CAUSE ")), sevenZipException.causeFirstPotentialThrown, sevenZipException);
        }
        if (sevenZipException.causeLastPotentialThrown != null) {
            printWriter.println("+-- Last thrown potential 'cause by' exception, thrown in an other thread (last possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new C22512(printWriter, "  LAST THROWN POTENTIAL CAUSE ")), sevenZipException.causeLastPotentialThrown, sevenZipException);
        }
        printWriter.println("+------ End of stacktrace of SevenZipException with multiple 'cause by' exceptions");
    }

    public static void printStackTraceRecursive(PrintWriter printWriter, Throwable th, Throwable th2) {
        int i;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (th2 != null) {
            StackTraceElement[] stackTrace2 = th2.getStackTrace();
            int length = stackTrace2.length - 1;
            int length2 = stackTrace.length - 1;
            i = 0;
            while (length >= 3 && length2 >= 3 && stackTrace2[length].equals(stackTrace[length2])) {
                length--;
                length2--;
                i++;
            }
        } else {
            i = 0;
        }
        if (i <= 3) {
            i = 0;
        }
        if (th2 == null) {
            printWriter.println(getMessageForPrintStackTraceExtended(th));
        } else {
            printWriter.println("Caused by: " + getMessageForPrintStackTraceExtended(th));
        }
        for (int i2 = 0; i2 < stackTrace.length - i; i2++) {
            printWriter.println("\tat " + stackTrace[i2]);
        }
        if (i > 0) {
            printWriter.println("\t... " + i + " more");
        }
        if (th.getCause() != null) {
            printStackTraceOfThrowable(printWriter, th.getCause(), th);
        }
    }

    public static String getMessageForPrintStackTraceExtended(Throwable th) {
        if (th instanceof SevenZipException) {
            return ((SevenZipException) th).getMessage(true);
        }
        return th.toString();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return super.getCause();
    }

    public Throwable getCauseLastThrown() {
        return this.causeLastThrown;
    }

    public Throwable getCauseLastPotentialThrown() {
        return this.causeLastPotentialThrown;
    }

    public Throwable getCauseFirstPotentialThrown() {
        return this.causeFirstPotentialThrown;
    }
}
