.class public final Lnet/sf/sevenzipjbinding/NativeXZOutputStream;
.super Ljava/io/OutputStream;
.source "NativeXZOutputStream.java"


# static fields
.field public static final synthetic ۛ:I

.field public static final ۨ:[B


# instance fields
.field public ۗ:Z

.field public ۙ:Ljava/io/IOException;

.field public final ۤ:[B

.field public final ۫:Ljava/io/OutputStream;

.field public ۬:J

.field public ᩶:Z

.field public final ᩸:[B

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [B

    .line 18
    fill-array-data v0, :array_0

    sput-object v0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۨ:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x3t
        0x37t
        0x7at
        0x58t
        0x5at
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 4

    .line 35
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/high16 v0, 0x100000

    new-array v0, v0, [B

    .line 23
    iput-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩸:[B

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 24
    iput-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۤ:[B

    const-string v0, "outputStream"

    .line 36
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۫:Ljava/io/OutputStream;

    if-ltz p2, :cond_2

    const/16 v0, 0x9

    if-gt p2, v0, :cond_2

    .line 40
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    .line 44
    invoke-static {p2, v0}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeCreate(II)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    .line 50
    :try_start_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ܽ()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 51
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 53
    :goto_0
    invoke-static {v0, v1}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 54
    throw p1

    .line 46
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to create native XZ encoder"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 41
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Native XZ encoder is unavailable"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 38
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Unsupported native XZ compression options"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native nativeCreate(II)J
.end method

.method public static native nativeDestroy(J)V
.end method

.method public static native nativeEncodeChunk(J[BII)[B
.end method

.method public static native nativeFinish(J)[B
.end method

.method public static native nativeGetApiVersion()I
.end method

.method private ֫()V
    .locals 2

    .line 249
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_2

    .line 252
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩶:Z

    if-nez v0, :cond_1

    .line 255
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۗ:Z

    if-nez v0, :cond_0

    return-void

    .line 256
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 253
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 250
    :cond_2
    throw v0
.end method

.method public static ܽ()[B
    .locals 9

    const/16 v0, 0xc

    new-array v0, v0, [B

    .line 265
    sget-object v1, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۨ:[B

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte v2, v0, v3

    const/4 v1, 0x7

    const/4 v4, 0x4

    int-to-byte v5, v4

    aput-byte v5, v0, v1

    .line 269
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v5, 0x2

    .line 270
    invoke-virtual {v1, v0, v3, v5}, Ljava/util/zip/CRC32;->update([BII)V

    .line 271
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v5

    :goto_0
    if-ge v2, v4, :cond_0

    add-int/lit8 v1, v2, 0x8

    mul-int/lit8 v3, v2, 0x8

    ushr-long v7, v5, v3

    long-to-int v3, v7

    int-to-byte v3, v3

    .line 273
    aput-byte v3, v0, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ᩳ()Z
    .locals 3

    const/4 v0, 0x0

    .line 63
    :try_start_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeGetApiVersion()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :catch_0
    :cond_0
    return v0
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 166
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩶:Z

    if-eqz v0, :cond_0

    goto :goto_3

    .line 171
    :cond_0
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 173
    :try_start_0
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->finish()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x1

    .line 179
    iput-boolean v1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩶:Z

    .line 282
    iget-wide v1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    const-wide/16 v3, 0x0

    .line 283
    iput-wide v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    .line 285
    invoke-static {v1, v2}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 182
    :cond_2
    :try_start_1
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۫:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 185
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-eq v1, v2, :cond_4

    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_2

    .line 189
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    if-nez v0, :cond_5

    :goto_3
    return-void

    .line 195
    :cond_5
    throw v0
.end method

.method public final finish()V
    .locals 8

    .line 140
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_c

    .line 143
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۗ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 146
    :cond_0
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩶:Z

    if-nez v0, :cond_b

    const-wide/16 v0, 0x0

    .line 203
    :try_start_0
    iget v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۫:Ljava/io/OutputStream;

    if-nez v2, :cond_1

    goto :goto_0

    .line 206
    :cond_1
    :try_start_1
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩸:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 215
    :try_start_2
    iget-wide v5, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    const/4 v7, 0x0

    invoke-static {v5, v6, v4, v7, v2}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeEncodeChunk(J[BII)[B

    move-result-object v2

    const-string v4, "Invalid native XZ chunk result"

    if-eqz v2, :cond_4

    .line 227
    array-length v5, v2

    if-eqz v5, :cond_4

    .line 230
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 207
    :try_start_3
    iput v7, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    .line 152
    :goto_0
    iget-wide v4, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    invoke-static {v4, v5}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeFinish(J)[B

    move-result-object v2

    const-string v4, "Invalid native XZ footer result"

    if-eqz v2, :cond_3

    .line 227
    array-length v5, v2

    if-eqz v5, :cond_3

    .line 230
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V

    const/4 v2, 0x1

    .line 153
    iput-boolean v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۗ:Z

    .line 282
    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    .line 285
    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    :cond_2
    :goto_1
    return-void

    .line 228
    :cond_3
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_4
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v2

    .line 237
    :try_start_5
    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v3, :cond_5

    .line 238
    iput-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    goto :goto_2

    :cond_5
    if-eq v3, v2, :cond_6

    .line 240
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    :cond_6
    :goto_2
    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_7

    .line 285
    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 219
    :cond_7
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    throw v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v2

    .line 237
    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v3, :cond_8

    .line 238
    iput-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    goto :goto_3

    :cond_8
    if-eq v3, v2, :cond_9

    .line 240
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    :cond_9
    :goto_3
    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_a

    .line 285
    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 157
    :cond_a
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    throw v0

    .line 147
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 141
    :cond_c
    throw v0
.end method

.method public final flush()V
    .locals 8

    .line 126
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->֫()V

    const-wide/16 v0, 0x0

    .line 203
    :try_start_0
    iget v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۫:Ljava/io/OutputStream;

    if-nez v2, :cond_0

    goto :goto_0

    .line 206
    :cond_0
    :try_start_1
    iget-object v4, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩸:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 215
    :try_start_2
    iget-wide v5, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    const/4 v7, 0x0

    invoke-static {v5, v6, v4, v7, v2}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeEncodeChunk(J[BII)[B

    move-result-object v2

    const-string v4, "Invalid native XZ chunk result"

    if-eqz v2, :cond_1

    .line 227
    array-length v5, v2

    if-eqz v5, :cond_1

    .line 230
    invoke-virtual {v3, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 207
    :try_start_3
    iput v7, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    .line 129
    :goto_0
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    .line 228
    :cond_1
    :try_start_4
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v2

    .line 237
    :try_start_5
    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v3, :cond_2

    .line 238
    iput-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    goto :goto_1

    :cond_2
    if-eq v3, v2, :cond_3

    .line 240
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    :cond_3
    :goto_1
    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_4

    .line 285
    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 219
    :cond_4
    iget-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    throw v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v2

    .line 237
    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez v3, :cond_5

    .line 238
    iput-object v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    goto :goto_2

    :cond_5
    if-eq v3, v2, :cond_6

    .line 240
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    :cond_6
    :goto_2
    iget-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_7

    .line 285
    invoke-static {v2, v3}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 132
    :cond_7
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    throw v0
.end method

.method public final write(I)V
    .locals 2

    int-to-byte p1, p1

    .line 87
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۤ:[B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    const/4 p1, 0x1

    .line 88
    invoke-virtual {p0, v0, v1, p1}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 10

    or-int v0, p2, p3

    if-ltz v0, :cond_c

    .line 96
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_c

    .line 99
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->֫()V

    :cond_0
    :goto_0
    if-lez p3, :cond_b

    .line 103
    iget v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    const-wide/16 v1, 0x0

    iget-object v3, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۫:Ljava/io/OutputStream;

    const-string v4, "Invalid native XZ chunk result"

    const/high16 v5, 0x100000

    if-nez v0, :cond_5

    if-lt p3, v5, :cond_5

    .line 215
    :try_start_0
    iget-wide v6, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    invoke-static {v6, v7, p1, p2, v5}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeEncodeChunk(J[BII)[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 227
    array-length v6, v0

    if-eqz v6, :cond_1

    .line 230
    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V

    add-int/2addr p2, v5

    sub-int/2addr p3, v5

    goto :goto_0

    .line 228
    :cond_1
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 237
    iget-object p2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez p2, :cond_2

    .line 238
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    goto :goto_1

    :cond_2
    if-eq p2, p1, :cond_3

    .line 240
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    :cond_3
    :goto_1
    iget-wide p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long p3, p1, v1

    if-eqz p3, :cond_4

    .line 285
    invoke-static {p1, p2}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 219
    :cond_4
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    throw p1

    :cond_5
    sub-int v0, v5, v0

    .line 110
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 111
    iget v6, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    iget-object v7, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩸:[B

    invoke-static {p1, p2, v7, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    iget v6, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    add-int/2addr v6, v0

    iput v6, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    if-ne v6, v5, :cond_0

    if-nez v6, :cond_6

    goto :goto_0

    .line 215
    :cond_6
    :try_start_1
    iget-wide v8, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    const/4 v0, 0x0

    invoke-static {v8, v9, v7, v0, v6}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeEncodeChunk(J[BII)[B

    move-result-object v5

    if-eqz v5, :cond_7

    .line 227
    array-length v6, v5

    if-eqz v6, :cond_7

    .line 230
    invoke-virtual {v3, v5}, Ljava/io/OutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    iput v0, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->᩹:I

    goto :goto_0

    .line 228
    :cond_7
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 237
    iget-object p2, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    if-nez p2, :cond_8

    .line 238
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    goto :goto_2

    :cond_8
    if-eq p2, p1, :cond_9

    .line 240
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 282
    :cond_9
    :goto_2
    iget-wide p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    .line 283
    iput-wide v1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->۬:J

    cmp-long p3, p1, v1

    if-eqz p3, :cond_a

    .line 285
    invoke-static {p1, p2}, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->nativeDestroy(J)V

    .line 219
    :cond_a
    iget-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZOutputStream;->ۙ:Ljava/io/IOException;

    throw p1

    :cond_b
    return-void

    .line 97
    :cond_c
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
