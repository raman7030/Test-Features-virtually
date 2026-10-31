.class public Lbin/mt/plus/Features3;
.super Ljava/lang/Object;
.source "Features3.java"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "mt3"

    .line 10
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native delete(Ljava/lang/String;[B)Z
.end method

.method public static native lastModified0([B)J
.end method

.method public static native length(I)J
.end method

.method public static native listGarbledFileNames(Ljava/lang/String;)[[B
.end method

.method public static native newStringUTF([B)Ljava/lang/String;
.end method

.method public static native read(I[BII)I
.end method

.method public static native readlink0([B)[B
.end method

.method public static native receiveFdResponse(I)J
.end method

.method public static native rename(Ljava/lang/String;[BLjava/lang/String;)Z
.end method

.method public static native seek(IJ)V
.end method

.method public static native startMTIO(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native stat0([B[J)I
.end method

.method public static native sync(I)V
.end method

.method public static native tell(I)J
.end method

.method public static native truncate(IJ)V
.end method

.method public static native write(I[BII)V
.end method

.method public static ֫(Ljava/lang/String;)J
    .locals 3

    .line 41
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0}, Lbin/mt/plus/Features3;->lastModified0([B)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    .line 44
    new-instance v1, Ljava/io/IOException;

    const-string v2, ": "

    .line 0
    invoke-static {p0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 44
    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 31
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0}, Lbin/mt/plus/Features3;->readlink0([B)[B

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 32
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method

.method public static ܽ(Ljava/lang/String;)[J
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [J

    .line 53
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0, v0}, Lbin/mt/plus/Features3;->stat0([B[J)I

    move-result p0

    if-nez p0, :cond_0

    return-object v0

    .line 55
    :cond_0
    new-instance v0, Landroid/system/ErrnoException;

    const-string v1, "stat"

    invoke-direct {v0, v1, p0}, Landroid/system/ErrnoException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method
