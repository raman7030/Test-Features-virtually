package net.p069sf.sevenzipjbinding;

import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import net.p069sf.sevenzipjbinding.impl.OutArchiveImpl;
import p067l.AbstractC20930;
import p067l.C11783;
import p067l.C16475;
import p067l.C19158;
import p067l.C25193;
import p067l.C3410;
import p067l.C6418;

/* JADX INFO: loaded from: classes.dex */
public class SevenZip {

    /* JADX INFO: renamed from: ֫ */
    public static volatile ExtractMemoryUsageProvider f80656;

    /* JADX INFO: renamed from: ۧ */
    public static volatile String f80657;

    /* JADX INFO: renamed from: ܽ */
    public static final CountDownLatch f80658 = new CountDownLatch(1);

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

    /* JADX INFO: renamed from: ֫ */
    public static void m55294(ExtractMemoryUsageProvider extractMemoryUsageProvider) {
        f80656 = extractMemoryUsageProvider;
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m55298() {
        ExtractMemoryUsageProvider extractMemoryUsageProvider = f80656;
        if (extractMemoryUsageProvider == null) {
            return -1L;
        }
        long extractMemoryUsage = extractMemoryUsageProvider.getExtractMemoryUsage();
        if (extractMemoryUsage >= 0) {
            return extractMemoryUsage;
        }
        throw new IllegalArgumentException("Invalid extraction memory usage");
    }

    /* JADX INFO: renamed from: ֫ */
    public static IInArchive m55292(C6418 c6418, AbstractC20930 abstractC20930) {
        if (c6418 == null) {
            throw new NullPointerException("SevenZip.callNativeOpenArchive(...): inStream parameter is null");
        }
        return nativeOpenArchive(null, c6418, abstractC20930);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m55301() {
        try {
            try {
                String strNativeInitSevenZipLibrary = nativeInitSevenZipLibrary();
                if (strNativeInitSevenZipLibrary != null) {
                    throw new C11783("Error initializing 7-Zip-JBinding: ".concat(strNativeInitSevenZipLibrary));
                }
                if (NativeXZInputStream.m55285()) {
                    C3410.m6042(new C19158(0));
                }
                if (NativeXZOutputStream.m55289()) {
                    C3410.m6041(new C16475());
                }
                f80658.countDown();
            } catch (Exception e) {
                f80657 = e.getMessage();
                throw e;
            }
        } catch (Throwable th) {
            f80658.countDown();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m55296() {
        f80658.await();
        if (f80657 != null) {
            throw new C11783(f80657);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static OutputStream m55291(OutputStream outputStream) {
        return new C25193(outputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܿ */
    public static IOutCreateArchive7z m55300() {
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
