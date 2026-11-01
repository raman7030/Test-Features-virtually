package net.p069sf.sevenzipjbinding.impl;

import java.io.PrintStream;
import net.p069sf.sevenzipjbinding.ArchiveFormat;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.IOutArchive;
import net.p069sf.sevenzipjbinding.IOutCreateCallback;
import net.p069sf.sevenzipjbinding.IOutStream;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: loaded from: classes2.dex */
public class OutArchiveImpl implements IOutArchive {
    public ArchiveFormat archiveFormat;
    public boolean closed;
    public int compressionLevel = -1;
    public IInArchive inArchive;
    public long jbindingSession;
    public long sevenZipArchiveInstance;
    public boolean trace;
    public PrintStream tracePrintStream;

    private native void nativeClose();

    private native void nativeUpdateItems(ISequentialOutStream iSequentialOutStream, int i, Object obj);

    public native void nativeSet7z(int i, int i2, int i3, String str);

    public native void nativeSetLevel(int i);

    public void setLevel(int i) {
        featureSetLevel(i);
    }

    public void createArchive(IOutStream iOutStream, int i, IOutCreateCallback iOutCreateCallback) {
        createArchive((ISequentialOutStream) iOutStream, i, iOutCreateCallback);
    }

    public void setInArchive(IInArchive iInArchive) {
        this.inArchive = iInArchive;
    }

    public void featureSetLevel(int i) {
        this.compressionLevel = i;
    }

    public void applyFeatures() {
        ensureOpened();
        int i = this.compressionLevel;
        if (i != -1) {
            nativeSetLevel(i);
        }
    }

    @Override // net.p069sf.sevenzipjbinding.IOutCreateArchive, net.p069sf.sevenzipjbinding.IOutUpdateArchive
    public ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    public void setArchiveFormat(ArchiveFormat archiveFormat) {
        this.archiveFormat = archiveFormat;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        if (this.inArchive != null) {
            return;
        }
        nativeClose();
    }

    @Override // net.p069sf.sevenzipjbinding.IOutUpdateArchive
    public void updateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback) {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i, iOutCreateCallback);
    }

    private void doUpdateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback) {
        applyFeatures();
        nativeUpdateItems(iSequentialOutStream, i, iOutCreateCallback);
    }

    @Override // net.p069sf.sevenzipjbinding.IOutCreateArchive
    public void createArchive(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback) {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i, iOutCreateCallback);
    }

    @Override // net.p069sf.sevenzipjbinding.IOutUpdateArchive
    public IInArchive getConnectedInArchive() {
        return this.inArchive;
    }

    private final void traceMessage(String str) {
        if (this.trace) {
            PrintStream printStream = this.tracePrintStream;
            if (printStream == null) {
                System.out.println(str);
            } else {
                printStream.println(str);
            }
        }
    }

    @Override // net.p069sf.sevenzipjbinding.IOutArchiveBase
    public void setTracePrintStream(PrintStream printStream) {
        this.tracePrintStream = printStream;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutArchiveBase
    public PrintStream getTracePrintStream() {
        return this.tracePrintStream;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutArchiveBase
    public void setTrace(boolean z) {
        this.trace = z;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutArchiveBase
    public boolean isTrace() {
        return this.trace;
    }

    public void ensureOpened() {
        if (this.closed) {
            throw new SevenZipException("OutArchive closed");
        }
        IInArchive iInArchive = this.inArchive;
        if (iInArchive != null) {
            ((InArchiveImpl) iInArchive).ensureOpened();
        }
    }
}
