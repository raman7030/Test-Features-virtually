package net.p069sf.sevenzipjbinding;

import java.io.Closeable;
import p067l.InterfaceC23852;

/* JADX INFO: loaded from: classes.dex */
public interface IInArchive extends Closeable {
    void addAutoCloseable(Closeable closeable);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void extract(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback);

    ExtractOperationResult extractSlow(int i, ISequentialOutStream iSequentialOutStream);

    ExtractOperationResult extractSlow(int i, ISequentialOutStream iSequentialOutStream, String str);

    ArchiveFormat getArchiveFormat();

    Object getArchiveProperty(PropID propID);

    PropertyInfo getArchivePropertyInfo(int i);

    IOutUpdateArchive getConnectedOutArchive();

    IOutUpdateArchive7z getConnectedOutArchive7z();

    IOutUpdateArchiveBZip2 getConnectedOutArchiveBZip2();

    IOutUpdateArchiveGZip getConnectedOutArchiveGZip();

    IOutUpdateArchiveTar getConnectedOutArchiveTar();

    IOutUpdateArchiveZip getConnectedOutArchiveZip();

    String getFileName();

    long getFileSize();

    long getFileTime();

    int getNumberOfArchiveProperties();

    int getNumberOfItems();

    int getNumberOfProperties();

    Object getProperty(int i, PropID propID);

    PropertyInfo getPropertyInfo(int i);

    InterfaceC23852 getSimpleInterface();

    String getStringArchiveProperty(PropID propID);

    String getStringProperty(int i, PropID propID);

    void setFileName(String str);

    void setFileSize(long j);

    void setFileTime(long j);
}
