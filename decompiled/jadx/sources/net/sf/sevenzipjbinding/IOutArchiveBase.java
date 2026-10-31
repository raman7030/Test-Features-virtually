package net.sf.sevenzipjbinding;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public interface IOutArchiveBase {
    PrintStream getTracePrintStream();

    boolean isTrace();

    void setTrace(boolean z);

    void setTracePrintStream(PrintStream printStream);
}
