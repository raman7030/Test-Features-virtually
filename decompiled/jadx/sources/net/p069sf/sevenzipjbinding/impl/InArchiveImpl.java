package net.p069sf.sevenzipjbinding.impl;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.p069sf.sevenzipjbinding.ArchiveFormat;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import net.p069sf.sevenzipjbinding.IArchiveExtractCallback;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.IOutUpdateArchive;
import net.p069sf.sevenzipjbinding.IOutUpdateArchive7z;
import net.p069sf.sevenzipjbinding.IOutUpdateArchiveBZip2;
import net.p069sf.sevenzipjbinding.IOutUpdateArchiveGZip;
import net.p069sf.sevenzipjbinding.IOutUpdateArchiveTar;
import net.p069sf.sevenzipjbinding.IOutUpdateArchiveZip;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.PropID;
import net.p069sf.sevenzipjbinding.PropertyInfo;
import net.p069sf.sevenzipjbinding.SevenZip;
import net.p069sf.sevenzipjbinding.SevenZipException;
import p067l.C11112;
import p067l.C15033;
import p067l.C15426;
import p067l.C17816;
import p067l.C5077;
import p067l.EnumC19829;
import p067l.InterfaceC23852;

/* JADX INFO: loaded from: classes.dex */
public final class InArchiveImpl implements IInArchive {
    public static final long USE_DEFAULT_MEMORY_USAGE = -1;
    public ArchiveFormat archiveFormat;
    public boolean closed;
    public String fileName;
    public long fileSize;
    public long fileTime;
    public long jbindingSession;
    public OutArchiveImpl outArchiveImpl;
    public long sevenZipArchiveInstance;
    public long sevenZipInStreamInstance;
    public int numberOfItems = -1;
    public List autoCloseableList = new ArrayList();

    private native void nativeClose();

    private native void nativeConnectOutArchive(OutArchiveImpl outArchiveImpl, ArchiveFormat archiveFormat);

    private native void nativeExtract(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback, long j);

    private native Object nativeGetArchiveProperty(int i);

    private native PropertyInfo nativeGetArchivePropertyInfo(int i);

    private native int nativeGetNumberOfArchiveProperties();

    private native int nativeGetNumberOfItems();

    private native int nativeGetNumberOfProperties();

    private native Object nativeGetProperty(int i, int i2);

    private native PropertyInfo nativeGetPropertyInfo(int i);

    private native String nativeGetStringArchiveProperty(int i);

    private native String nativeGetStringProperty(int i, int i2);

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public void extract(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback) throws SevenZipException {
        ensureOpened();
        extractWithMemoryUsage(iArr, z, iArchiveExtractCallback);
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public ExtractOperationResult extractSlow(int i, ISequentialOutStream iSequentialOutStream) throws SevenZipException {
        ensureOpened();
        C17816 c17816 = new C17816(iSequentialOutStream);
        extractWithMemoryUsage(new int[]{i}, false, c17816);
        return c17816.m40437();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public ExtractOperationResult extractSlow(int i, ISequentialOutStream iSequentialOutStream, String str) throws SevenZipException {
        ensureOpened();
        C5077 c5077 = new C5077(iSequentialOutStream, str);
        extractWithMemoryUsage(new int[]{i}, false, c5077);
        return c5077.m40437();
    }

    private void extractWithMemoryUsage(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback) {
        nativeExtract(iArr, z, iArchiveExtractCallback, this.archiveFormat == ArchiveFormat.SEVEN_ZIP ? SevenZip.m55298() : -1L);
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public Object getArchiveProperty(PropID propID) throws SevenZipException {
        ensureOpened();
        return nativeGetArchiveProperty(propID.getPropIDIndex());
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public String getStringArchiveProperty(PropID propID) throws SevenZipException {
        ensureOpened();
        return nativeGetStringArchiveProperty(propID.getPropIDIndex());
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public PropertyInfo getArchivePropertyInfo(int i) throws SevenZipException {
        ensureOpened();
        return nativeGetArchivePropertyInfo(i);
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public int getNumberOfArchiveProperties() throws SevenZipException {
        ensureOpened();
        return nativeGetNumberOfArchiveProperties();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public int getNumberOfProperties() throws SevenZipException {
        ensureOpened();
        return nativeGetNumberOfProperties();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public PropertyInfo getPropertyInfo(int i) throws SevenZipException {
        ensureOpened();
        return nativeGetPropertyInfo(i);
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        nativeClose();
        for (Closeable closeable : this.autoCloseableList) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
        this.autoCloseableList.clear();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public int getNumberOfItems() throws SevenZipException {
        ensureOpened();
        if (this.numberOfItems == -1) {
            this.numberOfItems = nativeGetNumberOfItems();
        }
        return this.numberOfItems;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public Object getProperty(int i, PropID propID) throws SevenZipException {
        ArchiveFormat archiveFormat;
        ensureOpened();
        if (i < 0 || i >= getNumberOfItems()) {
            StringBuilder sbM34408 = C15033.m34408(i, "Index out of range. Index: ", ", NumberOfItems: ");
            sbM34408.append(getNumberOfItems());
            throw new SevenZipException(sbM34408.toString());
        }
        Object objNativeGetProperty = nativeGetProperty(i, propID.getPropIDIndex());
        int i2 = C11112.f30820[propID.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                return objNativeGetProperty == null ? Boolean.FALSE : objNativeGetProperty;
            }
            if (i2 != 4) {
                return (i2 == 5 && objNativeGetProperty != null) ? EnumC19829.values()[((Integer) objNativeGetProperty).intValue()] : objNativeGetProperty;
            }
            return objNativeGetProperty == null ? Boolean.FALSE : objNativeGetProperty;
        }
        if (objNativeGetProperty instanceof Integer) {
            return Long.valueOf(((Integer) objNativeGetProperty).longValue());
        }
        if (objNativeGetProperty == null && (archiveFormat = this.archiveFormat) != null && archiveFormat == ArchiveFormat.NSIS) {
            return 0L;
        }
        return objNativeGetProperty;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public String getStringProperty(int i, PropID propID) throws SevenZipException {
        ensureOpened();
        if (i >= 0 && i < getNumberOfItems()) {
            return nativeGetStringProperty(i, propID.getPropIDIndex());
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Index out of range. Index: ", ", NumberOfItems: ");
        sbM34408.append(getNumberOfItems());
        throw new SevenZipException(sbM34408.toString());
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public InterfaceC23852 getSimpleInterface() {
        return new C15426();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    private void setArchiveFormat(String str) {
        for (ArchiveFormat archiveFormat : ArchiveFormat.values()) {
            if (archiveFormat.getMethodName().equalsIgnoreCase(str)) {
                this.archiveFormat = archiveFormat;
                return;
            }
        }
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchive getConnectedOutArchive() throws SevenZipException {
        ensureOpened();
        return getConnectedOutArchiveIntern();
    }

    private IOutUpdateArchive getConnectedOutArchiveIntern() {
        if (this.outArchiveImpl == null) {
            createConnectedOutArchive();
        }
        return this.outArchiveImpl;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchive7z getConnectedOutArchive7z() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.SEVEN_ZIP);
        return (IOutUpdateArchive7z) getConnectedOutArchiveIntern();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveZip getConnectedOutArchiveZip() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.ZIP);
        return (IOutUpdateArchiveZip) getConnectedOutArchiveIntern();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveTar getConnectedOutArchiveTar() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.TAR);
        return (IOutUpdateArchiveTar) getConnectedOutArchiveIntern();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveGZip getConnectedOutArchiveGZip() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.GZIP);
        return (IOutUpdateArchiveGZip) getConnectedOutArchiveIntern();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public IOutUpdateArchiveBZip2 getConnectedOutArchiveBZip2() throws SevenZipException {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.BZIP2);
        return (IOutUpdateArchiveBZip2) getConnectedOutArchiveIntern();
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public void addAutoCloseable(Closeable closeable) {
        this.autoCloseableList.add(closeable);
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public void setFileName(String str) {
        this.fileName = str;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public String getFileName() {
        return this.fileName;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public void setFileSize(long j) {
        this.fileSize = j;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public long getFileSize() {
        return this.fileSize;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public void setFileTime(long j) {
        this.fileTime = j;
    }

    @Override // net.p069sf.sevenzipjbinding.IInArchive
    public long getFileTime() {
        return this.fileTime;
    }

    private void ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat archiveFormat) throws SevenZipException {
        if (getArchiveFormat() == archiveFormat) {
            return;
        }
        throw new SevenZipException("Archive format specific update API for " + archiveFormat.getMethodName() + "-archives can't work with the currently opened " + getArchiveFormat().getMethodName() + "-archive");
    }

    private void createConnectedOutArchive() {
        if (!this.archiveFormat.isOutArchiveSupported()) {
            throw new IllegalStateException("Archive format '" + this.archiveFormat + "' doesn't support archive manipulations.");
        }
        try {
            OutArchiveImpl outArchiveImpl = (OutArchiveImpl) this.archiveFormat.getOutArchiveImplementation().newInstance();
            this.outArchiveImpl = outArchiveImpl;
            outArchiveImpl.setInArchive(this);
            this.outArchiveImpl.setArchiveFormat(this.archiveFormat);
            nativeConnectOutArchive(this.outArchiveImpl, this.archiveFormat);
        } catch (Exception unused) {
            throw new IllegalStateException("Internal error: Can't create new instance of the class " + this.archiveFormat.getOutArchiveImplementation() + " using default constructor.");
        }
    }

    public void ensureOpened() throws SevenZipException {
        if (this.closed) {
            throw new SevenZipException("InArchive closed");
        }
    }
}
