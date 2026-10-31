package net.sf.sevenzipjbinding;

import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import l.AbstractC19530;
import l.C1096;
import l.C14842;
import l.C17665;
import l.C24015;
import l.C4260;
import l.C9905;
import net.sf.sevenzipjbinding.impl.OutArchiveImpl;

/* JADX INFO: loaded from: classes.dex */
public class SevenZip {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile ExtractMemoryUsageProvider f77892;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile String f77893;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final CountDownLatch f77894 = new CountDownLatch(1);

    @FunctionalInterface
    public interface ExtractMemoryUsageProvider {
        long getExtractMemoryUsage();
    }

    public static native void nativeCreateArchive(OutArchiveImpl outArchiveImpl, ArchiveFormat archiveFormat);

    public static native long nativeCreateUltraDeflateCompressor();

    public static native void nativeDestroyUltraDeflateCompressor(long j);

    public static native byte[] nativeFinishUltraDeflateCompressor(long j);

    public static native byte[] nativeFlushUltraDeflateCompressor(long j);

    public static native int nativeGetVersionBuild();

    public static native String nativeGetVersionCopyright();

    public static native String nativeGetVersionDate();

    public static native int nativeGetVersionMajor();

    public static native int nativeGetVersionMinor();

    public static native String nativeGetVersionVersion();

    public static native String nativeInitSevenZipLibrary();

    public static native IInArchive nativeOpenArchive(ArchiveFormat archiveFormat, IInStream iInStream, IArchiveOpenCallback iArchiveOpenCallback);

    public static native boolean nativeUltraDeflateCompress(ISequentialInStream iSequentialInStream, ISequentialOutStream iSequentialOutStream);

    public static native byte[] nativeWriteUltraDeflateCompressor(long j, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52888(ExtractMemoryUsageProvider extractMemoryUsageProvider) {
        f77892 = extractMemoryUsageProvider;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m52892() {
        ExtractMemoryUsageProvider extractMemoryUsageProvider = f77892;
        if (extractMemoryUsageProvider == null) {
            return -1L;
        }
        long extractMemoryUsage = extractMemoryUsageProvider.getExtractMemoryUsage();
        if (extractMemoryUsage >= 0) {
            return extractMemoryUsage;
        }
        throw new IllegalArgumentException("Invalid extraction memory usage");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IInArchive m52886(C4260 c4260, AbstractC19530 abstractC19530) {
        if (c4260 == null) {
            throw new NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
        }
        return nativeOpenArchive(null, c4260, abstractC19530);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m52895() {
        try {
            try {
                String strNativeInitSevenZipLibrary = nativeInitSevenZipLibrary();
                if (strNativeInitSevenZipLibrary != null) {
                    throw new C9905("Error initializing 7-Zip-JBinding: ".concat(strNativeInitSevenZipLibrary));
                }
                if (NativeXZInputStream.m52879()) {
                    C1096.m3769(new C17665(0));
                }
                if (NativeXZOutputStream.m52883()) {
                    C1096.m3768(new C14842());
                }
                f77894.countDown();
            } catch (Exception e) {
                f77893 = e.getMessage();
                throw e;
            }
        } catch (Throwable th) {
            f77894.countDown();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52890() {
        f77894.await();
        if (f77893 != null) {
            throw new C9905(f77893);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OutputStream m52885(OutputStream outputStream) {
        return new C24015(outputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static IOutCreateArchive7z m52894() {
        ArchiveFormat archiveFormat = ArchiveFormat.SEVEN_ZIP;
        if (!archiveFormat.isOutArchiveSupported()) {
            throw new IllegalStateException("Archive format '" + archiveFormat + "' doesn't support archive creation.");
        }
        try {
            OutArchiveImpl outArchiveImpl = (OutArchiveImpl) archiveFormat.getOutArchiveImplementation().newInstance();
            nativeCreateArchive(outArchiveImpl, archiveFormat);
            return (IOutCreateArchive7z) outArchiveImpl;
        } catch (Exception unused) {
            throw new IllegalStateException("Internal error: Can't create new instance of the class " + archiveFormat.getOutArchiveImplementation() + " using default constructor.");
        }
    }
}
