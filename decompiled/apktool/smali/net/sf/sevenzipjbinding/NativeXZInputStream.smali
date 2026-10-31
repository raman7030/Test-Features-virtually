.class public final Lnet/sf/sevenzipjbinding/NativeXZInputStream;
.super Ljava/io/InputStream;
.source "NativeXZInputStream.java"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۛ:I

.field public final ۤ:[B

.field public ۨ:I

.field public ۫:J

.field public ۬:Ljava/io/InputStream;

.field public final ܰ:[B

.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:[B

.field public ᩺:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 6

    .line 44
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/high16 v0, 0x10000

    new-array v1, v0, [B

    .line 25
    iput-object v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩹:[B

    new-array v0, v0, [B

    .line 26
    iput-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۤ:[B

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 27
    iput-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ܰ:[B

    const-string v0, "inputStream"

    .line 45
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    .line 46
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->nativeCreate()J

    move-result-wide v2

    iput-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۫:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    .line 53
    :try_start_0
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, 0x0

    const/16 v2, 0xc

    invoke-virtual {v0, v1, p1, v2}, Ljava/io/DataInputStream;->readFully([BII)V

    .line 54
    invoke-static {v1}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->nativeValidateHeader([B)V

    .line 55
    iput v2, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 59
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->֫()V

    .line 61
    throw p1

    .line 48
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Failed to create native XZ decoder"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native nativeCreate()J
.end method

.method public static native nativeDecode(J[BIIZ[BII)J
.end method

.method public static native nativeDestroy(J)V
.end method

.method public static native nativeGetApiVersion()I
.end method

.method public static native nativeValidateHeader([B)V
.end method

.method private ֫()V
    .locals 5

    .line 267
    iget-wide v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 268
    invoke-static {v0, v1}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->nativeDestroy(J)V

    .line 269
    iput-wide v2, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۫:J

    :cond_0
    return-void
.end method

.method public static ܽ()Z
    .locals 3

    const/4 v0, 0x0

    .line 69
    :try_start_0
    invoke-static {}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->nativeGetApiVersion()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v2

    :catch_0
    :cond_0
    return v0
.end method

.method private ܿ(II[B)I
    .locals 16

    move-object/from16 v0, p0

    .line 181
    :cond_0
    :goto_0
    iget-boolean v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩸:Z

    if-nez v1, :cond_e

    .line 182
    iget v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۗ:I

    iget v2, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_3

    iget-boolean v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩶:Z

    if-nez v1, :cond_3

    .line 216
    iput v3, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۗ:I

    .line 217
    iget-object v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    iget-object v2, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩹:[B

    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    iput v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    if-gez v1, :cond_1

    .line 219
    iput v3, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    .line 220
    iput-boolean v4, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩶:Z

    goto :goto_1

    :cond_1
    if-nez v1, :cond_3

    .line 222
    iget-object v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    if-gez v1, :cond_2

    .line 224
    iput-boolean v4, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩶:Z

    goto :goto_1

    :cond_2
    int-to-byte v1, v1

    .line 226
    aput-byte v1, v2, v3

    .line 227
    iput v4, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    .line 186
    :cond_3
    :goto_1
    iget v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۗ:I

    .line 236
    iget v2, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    sub-int/2addr v2, v1

    .line 237
    iget-wide v5, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۫:J

    iget-object v7, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩹:[B

    iget-boolean v10, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩶:Z

    move v8, v1

    move v9, v2

    move-object/from16 v11, p3

    move/from16 v12, p1

    move/from16 v13, p2

    invoke-static/range {v5 .. v13}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->nativeDecode(J[BIIZ[BII)J

    move-result-wide v5

    const-wide/high16 v7, -0x4000000000000L

    and-long/2addr v7, v5

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-nez v11, :cond_d

    const-wide/32 v7, 0xffffff

    const/4 v11, -0x1

    and-long v12, v5, v7

    long-to-int v13, v12

    const/16 v12, 0x18

    ushr-long v14, v5, v12

    and-long/2addr v7, v14

    long-to-int v8, v7

    if-gt v13, v2, :cond_c

    move/from16 v2, p2

    if-gt v8, v2, :cond_c

    .line 250
    iget v7, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۗ:I

    add-int/2addr v7, v13

    iput v7, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۗ:I

    const-wide/high16 v12, 0x1000000000000L

    and-long/2addr v12, v5

    cmp-long v14, v12, v9

    if-eqz v14, :cond_4

    const/4 v12, 0x1

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    :goto_2
    const-wide/high16 v13, 0x2000000000000L

    and-long/2addr v5, v13

    cmp-long v13, v5, v9

    if-eqz v13, :cond_5

    const/4 v3, 0x1

    :cond_5
    if-eqz v12, :cond_7

    .line 254
    iget v5, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    if-ne v7, v5, :cond_6

    goto :goto_3

    .line 255
    :cond_6
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Native XZ decoder requested input before consuming the current buffer"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_3
    if-lez v8, :cond_8

    return v8

    .line 192
    :cond_8
    iget-boolean v5, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩶:Z

    if-eqz v5, :cond_a

    iget v5, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    if-ne v7, v5, :cond_a

    if-eqz v12, :cond_a

    if-eqz v3, :cond_9

    .line 196
    iput-boolean v4, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩸:Z

    .line 197
    invoke-direct/range {p0 .. p0}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->֫()V

    return v11

    .line 194
    :cond_9
    new-instance v1, Ljava/io/EOFException;

    const-string v2, "Unexpected end of XZ input"

    invoke-direct {v1, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    if-ne v7, v1, :cond_0

    if-eqz v12, :cond_b

    .line 202
    iget v1, v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۙ:I

    if-ne v7, v1, :cond_b

    goto/16 :goto_0

    .line 205
    :cond_b
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Native XZ decoder made no progress"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 247
    :cond_c
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid native XZ decoder result size"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 241
    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid native XZ decoder result flags"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    const/4 v1, -0x1

    return v1
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 261
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩺:Ljava/io/IOException;

    if-nez v0, :cond_0

    .line 143
    iget v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۛ:I

    iget v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I

    sub-int/2addr v0, v1

    return v0

    .line 141
    :cond_0
    throw v0

    .line 262
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 2

    .line 151
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 156
    iput-object v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    .line 158
    :try_start_0
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 161
    throw v1
.end method

.method public final read()I
    .locals 3

    const/4 v0, 0x1

    .line 77
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ܰ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->read([BII)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 6

    if-ltz p2, :cond_a

    if-ltz p3, :cond_a

    add-int v0, p2, p3

    if-ltz v0, :cond_a

    .line 82
    array-length v1, p1

    if-gt v0, v1, :cond_a

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 261
    :cond_0
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->۬:Ljava/io/InputStream;

    if-eqz v1, :cond_9

    .line 89
    iget-object v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩺:Ljava/io/IOException;

    if-nez v1, :cond_8

    .line 92
    iget-boolean v1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩸:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-lez p3, :cond_6

    .line 99
    :try_start_0
    iget v3, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I

    iget v4, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۛ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۤ:[B

    if-ne v3, v4, :cond_3

    const/high16 v3, 0x10000

    if-lt p3, v3, :cond_2

    .line 102
    :try_start_1
    invoke-direct {p0, p2, v3, p1}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ܿ(II[B)I

    move-result v3

    if-gez v3, :cond_4

    goto :goto_1

    .line 168
    :cond_2
    iput v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I

    .line 169
    array-length v3, v5

    invoke-direct {p0, v0, v3, v5}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ܿ(II[B)I

    move-result v3

    iput v3, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۛ:I

    if-gez v3, :cond_3

    .line 171
    iput v0, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۛ:I

    goto :goto_1

    .line 116
    :cond_3
    iget v3, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۛ:I

    iget v4, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I

    sub-int/2addr v3, v4

    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 117
    iget v4, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I

    invoke-static {v5, v4, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 118
    iget v4, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I

    add-int/2addr v4, v3

    iput v4, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->ۨ:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_4
    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    add-int/2addr v1, v3

    goto :goto_0

    :catch_0
    move-exception p1

    .line 124
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩺:Ljava/io/IOException;

    .line 125
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->֫()V

    if-eqz v1, :cond_5

    goto :goto_1

    .line 127
    :cond_5
    throw p1

    :cond_6
    :goto_1
    if-nez v1, :cond_7

    .line 131
    iget-boolean p1, p0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;->᩸:Z

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    move v2, v1

    :goto_2
    return v2

    .line 90
    :cond_8
    throw v1

    .line 262
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_a
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
