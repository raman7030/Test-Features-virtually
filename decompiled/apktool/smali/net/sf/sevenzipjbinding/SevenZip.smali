.class public Lnet/sf/sevenzipjbinding/SevenZip;
.super Ljava/lang/Object;
.source "SevenZip.java"


# static fields
.field public static volatile ֫:Lnet/sf/sevenzipjbinding/SevenZip$ExtractMemoryUsageProvider;

.field public static volatile ۧ:Ljava/lang/String;

.field public static final ܽ:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sput-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->ܽ:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native nativeCreateArchive(Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;Lnet/sf/sevenzipjbinding/ArchiveFormat;)V
.end method

.method public static native nativeCreateUltraDeflateCompressor()J
.end method

.method public static native nativeDestroyUltraDeflateCompressor(J)V
.end method

.method public static native nativeFinishUltraDeflateCompressor(J)[B
.end method

.method public static native nativeFlushUltraDeflateCompressor(J)[B
.end method

.method public static native nativeGetVersionBuild()I
.end method

.method public static native nativeGetVersionCopyright()Ljava/lang/String;
.end method

.method public static native nativeGetVersionDate()Ljava/lang/String;
.end method

.method public static native nativeGetVersionMajor()I
.end method

.method public static native nativeGetVersionMinor()I
.end method

.method public static native nativeGetVersionVersion()Ljava/lang/String;
.end method

.method public static native nativeInitSevenZipLibrary()Ljava/lang/String;
.end method

.method public static native nativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;
.end method

.method public static native nativeUltraDeflateCompress(Lnet/sf/sevenzipjbinding/ISequentialInStream;Lnet/sf/sevenzipjbinding/ISequentialOutStream;)Z
.end method

.method public static native nativeWriteUltraDeflateCompressor(J[BII)[B
.end method

.method public static bridge synthetic ֫()J
    .locals 2

    .line 0
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeCreateUltraDeflateCompressor()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(Ljava/io/OutputStream;)Ljava/io/OutputStream;
    .locals 1

    .line 285
    new-instance v0, Ll/᩻᩺᩵;

    invoke-direct {v0, p0}, Ll/᩻᩺᩵;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method

.method public static ֫(Ll/ۘ᩺᩵;Ll/᩵ܳᩳ;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 185
    invoke-static {v0, p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeOpenArchive(Lnet/sf/sevenzipjbinding/ArchiveFormat;Lnet/sf/sevenzipjbinding/IInStream;Lnet/sf/sevenzipjbinding/IArchiveOpenCallback;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0

    return-object p0

    .line 183
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SevenZip.callNativeOpenArchive(...): inStream parameter is null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(J)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeDestroyUltraDeflateCompressor(J)V

    return-void
.end method

.method public static ֫(Lnet/sf/sevenzipjbinding/SevenZip$ExtractMemoryUsageProvider;)V
    .locals 0

    .line 98
    sput-object p0, Lnet/sf/sevenzipjbinding/SevenZip;->֫:Lnet/sf/sevenzipjbinding/SevenZip$ExtractMemoryUsageProvider;

    return-void
.end method

.method public static bridge synthetic ֫(J[BII)[B
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeWriteUltraDeflateCompressor(J[BII)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ()V
    .locals 2

    .line 268
    sget-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->ܽ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 269
    sget-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->ۧ:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 270
    :cond_0
    new-instance v0, Ll/ۢ᩺᩵;

    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->ۧ:Ljava/lang/String;

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 270
    throw v0
.end method

.method public static bridge synthetic ۧ(J)[B
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeFinishUltraDeflateCompressor(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static ܽ()J
    .locals 5

    .line 103
    sget-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->֫:Lnet/sf/sevenzipjbinding/SevenZip$ExtractMemoryUsageProvider;

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 107
    :cond_0
    invoke-interface {v0}, Lnet/sf/sevenzipjbinding/SevenZip$ExtractMemoryUsageProvider;->getExtractMemoryUsage()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    return-wide v0

    .line 109
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid extraction memory usage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܽ(J)[B
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeFlushUltraDeflateCompressor(J)[B

    move-result-object p0

    return-object p0
.end method

.method public static ܿ()Lnet/sf/sevenzipjbinding/IOutCreateArchive7z;
    .locals 4

    .line 325
    sget-object v0, Lnet/sf/sevenzipjbinding/ArchiveFormat;->SEVEN_ZIP:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    .line 380
    invoke-virtual {v0}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->isOutArchiveSupported()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 386
    :try_start_0
    invoke-virtual {v0}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->getOutArchiveImplementation()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    invoke-static {v1, v0}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeCreateArchive(Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;Lnet/sf/sevenzipjbinding/ArchiveFormat;)V

    .line 325
    check-cast v1, Lnet/sf/sevenzipjbinding/IOutCreateArchive7z;

    return-object v1

    .line 388
    :catch_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Internal error: Can\'t create new instance of the class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    invoke-virtual {v0}, Lnet/sf/sevenzipjbinding/ArchiveFormat;->getOutArchiveImplementation()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " using default constructor."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 381
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Archive format \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\' doesn\'t support archive creation."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ᩳ()V
    .locals 3

    const-string v0, "Error initializing 7-Zip-JBinding: "

    .line 223
    :try_start_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->nativeInitSevenZipLibrary()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 228
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    new-instance v0, Ll/ܿ᩺᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܿ᩺᩵;-><init>(I)V

    invoke-static {v0}, Ll/֨ۨۡ;->֫(Ll/ܿ᩺᩵;)V

    .line 231
    :cond_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    new-instance v0, Ll/ܳ᩺᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/֨ۨۡ;->֫(Ll/ۚۨۡ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 255
    :cond_1
    sget-object v0, Lnet/sf/sevenzipjbinding/SevenZip;->ܽ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    .line 225
    :cond_2
    :try_start_1
    new-instance v2, Ll/ۢ᩺᩵;

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 225
    throw v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 252
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->ۧ:Ljava/lang/String;

    .line 253
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 255
    :goto_0
    sget-object v1, Lnet/sf/sevenzipjbinding/SevenZip;->ܽ:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 256
    throw v0
.end method
