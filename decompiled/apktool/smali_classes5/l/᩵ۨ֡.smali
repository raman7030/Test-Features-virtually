.class public final Ll/᩵ۨ֡;
.super Ll/ۘۨ֡;
.source "X99G"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۤ:Ll/ܶ᩵ܿ;

.field public ۫:I

.field public ۬:Ll/᩻ۖܽ;

.field public ᩶:I

.field public ᩹:[B


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 5

    .line 29
    invoke-direct {p0}, Ll/ۘۨ֡;-><init>()V

    const/4 v0, -0x1

    .line 26
    iput v0, p0, Ll/᩵ۨ֡;->ۙ:I

    .line 27
    iput v0, p0, Ll/᩵ۨ֡;->᩶:I

    const-string v0, "r"

    .line 30
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    .line 31
    invoke-virtual {p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iput p1, p0, Ll/᩵ۨ֡;->ۗ:I

    .line 32
    new-array p1, p1, [B

    iput-object p1, p0, Ll/᩵ۨ֡;->᩹:[B

    .line 33
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 34
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    iget-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    invoke-virtual {p1, v0}, Ll/᩻ۖܽ;->readFully([B)V

    const/4 p1, 0x0

    .line 35
    iput p1, p0, Ll/᩵ۨ֡;->۫:I

    return-void

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x0

    .line 327
    iput-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    .line 328
    iget-object v1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    if-eqz v1, :cond_0

    .line 329
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V

    .line 330
    iput-object v0, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    .line 332
    :cond_0
    iget-object v1, p0, Ll/᩵ۨ֡;->ۤ:Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_1

    .line 333
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۫()Z

    .line 334
    iput-object v0, p0, Ll/᩵ۨ֡;->ۤ:Ll/ܶ᩵ܿ;

    :cond_1
    return-void
.end method

.method public final finalize()V
    .locals 0

    .line 340
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 341
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public final length()I
    .locals 1

    .line 322
    iget v0, p0, Ll/᩵ۨ֡;->ۗ:I

    return v0
.end method

.method public final ֫(I)B
    .locals 4

    .line 97
    iget v0, p0, Ll/᩵ۨ֡;->ۙ:I

    .line 98
    iget v1, p0, Ll/᩵ۨ֡;->᩶:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v0, v2, :cond_2

    add-int/lit8 v2, v0, -0x1

    if-gt p1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-lt p1, v1, :cond_1

    sub-int v2, v1, v0

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    .line 112
    iget-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    aget-byte p1, v0, p1

    return p1

    :cond_3
    if-lt p1, v0, :cond_4

    add-int/lit8 v0, p1, 0x1

    if-gt v0, v1, :cond_4

    .line 117
    iget-object v0, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 119
    :try_start_0
    iget-object v1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    iget v2, p0, Ll/᩵ۨ֡;->۫:I

    add-int/2addr v2, p1

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 120
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readByte()B

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 122
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-direct {v1, p1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 124
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 115
    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۬ۛ֡;)V
    .locals 7

    .line 44
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    if-ne v0, p0, :cond_b

    .line 268
    new-instance v0, Ll/ܶۛ֡;

    invoke-direct {v0, p1}, Ll/ܶۛ֡;-><init>(Ll/۬ۛ֡;)V

    .line 50
    invoke-virtual {v0}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠ۛ֡;

    .line 51
    invoke-virtual {v4}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۨ֡;

    .line 52
    invoke-virtual {v5}, Ll/ܽۨ֡;->᩷ۧ()Ll/᩷ۨ֡;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 53
    :cond_2
    iget v6, v5, Ll/᩷ۨ֡;->֫:I

    if-ne v2, v0, :cond_3

    move-object v1, v5

    move v2, v6

    move v3, v2

    goto :goto_0

    :cond_3
    if-ge v6, v2, :cond_4

    move v2, v6

    goto :goto_0

    :cond_4
    if-le v6, v3, :cond_1

    move-object v1, v5

    move v3, v6

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    return-void

    .line 98
    :cond_6
    iget p1, v1, Ll/᩷ۨ֡;->֫:I

    add-int/lit8 p1, p1, 0x10

    .line 491
    invoke-virtual {v1}, Ll/᩷ۨ֡;->֫()I

    move-result v3

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v3, p1

    .line 494
    invoke-virtual {v1}, Ll/᩷ۨ֡;->ۜ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۨ֡;

    .line 496
    invoke-virtual {v1}, Ll/ܺۨ֡;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 497
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 498
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_2

    .line 501
    :cond_7
    check-cast v1, Ll/᩸۟֡;

    invoke-virtual {v1}, Ll/᩸۟֡;->֫()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_1

    .line 75
    :cond_8
    iget p1, p0, Ll/᩵ۨ֡;->ۙ:I

    if-ne p1, v0, :cond_a

    .line 78
    iput v2, p0, Ll/᩵ۨ֡;->ۙ:I

    .line 79
    iput v3, p0, Ll/᩵ۨ֡;->᩶:I

    .line 81
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    if-nez p1, :cond_9

    .line 82
    sget-object p1, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 83
    iget-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    sub-int v1, v3, v2

    invoke-virtual {p1, v0, v2, v1}, Ll/ܶ᩵ܿ;->֫([BII)V

    .line 84
    iput-object p1, p0, Ll/᩵ۨ֡;->ۤ:Ll/ܶ᩵ܿ;

    const-string v0, "r"

    .line 85
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    neg-int p1, v2

    .line 86
    iput p1, p0, Ll/᩵ۨ֡;->۫:I

    .line 88
    :cond_9
    iget-object p1, p0, Ll/᩵ۨ֡;->᩹:[B

    array-length v0, p1

    sub-int v1, v3, v2

    sub-int/2addr v0, v1

    new-array v1, v0, [B

    const/4 v4, 0x0

    .line 89
    invoke-static {p1, v4, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 90
    iget-object p1, p0, Ll/᩵ۨ֡;->᩹:[B

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, v3, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FileDexBuffer.optimize() save memory: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/᩵ۨ֡;->᩹:[B

    array-length v3, v3

    sub-int/2addr v3, v0

    div-int/lit16 v3, v3, 0x400

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "KB"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 92
    iput-object v1, p0, Ll/᩵ۨ֡;->᩹:[B

    return-void

    .line 76
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 45
    :cond_b
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۧ(I)I
    .locals 4

    .line 165
    iget v0, p0, Ll/᩵ۨ֡;->ۙ:I

    .line 166
    iget v1, p0, Ll/᩵ۨ֡;->᩶:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v0, v2, :cond_2

    add-int/lit8 v2, v0, -0x4

    if-gt p1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-lt p1, v1, :cond_1

    sub-int v2, v1, v0

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    .line 180
    iget-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, v0, p1

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v1

    return p1

    :cond_3
    if-lt p1, v0, :cond_5

    add-int/lit8 v0, p1, 0x4

    if-le v0, v1, :cond_4

    goto :goto_2

    .line 191
    :cond_4
    iget-object v0, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 193
    :try_start_0
    iget-object v1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    iget v2, p0, Ll/᩵ۨ֡;->۫:I

    add-int/2addr v2, p1

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 194
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readInt()I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 196
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-direct {v1, p1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 198
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 88
    :cond_5
    :goto_2
    invoke-virtual {p0, p1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    .line 89
    invoke-virtual {p0, v1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 90
    invoke-virtual {p0, v1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    .line 91
    invoke-virtual {p0, p1}, Ll/᩵ۨ֡;->֫(I)B

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    or-int/2addr p1, v0

    return p1
.end method

.method public final ܽ(I)J
    .locals 14

    .line 203
    iget v0, p0, Ll/᩵ۨ֡;->ۙ:I

    .line 204
    iget v1, p0, Ll/᩵ۨ֡;->᩶:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v0, v2, :cond_2

    add-int/lit8 v2, v0, -0x8

    if-gt p1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-lt p1, v1, :cond_1

    sub-int v2, v1, v0

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    const/16 v2, 0x38

    const/16 v4, 0x30

    const/16 v5, 0x28

    const/16 v6, 0x20

    const/16 v7, 0x18

    const-wide/16 v8, 0xff

    if-eqz v3, :cond_3

    .line 218
    iget-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v3, p1, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v1, v3

    add-int/lit8 v3, p1, 0x2

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    int-to-long v10, v1

    add-int/lit8 v1, p1, 0x3

    aget-byte v1, v0, v1

    int-to-long v12, v1

    and-long/2addr v12, v8

    shl-long/2addr v12, v7

    or-long/2addr v10, v12

    add-int/lit8 v1, p1, 0x4

    aget-byte v1, v0, v1

    int-to-long v12, v1

    and-long/2addr v12, v8

    shl-long v6, v12, v6

    or-long/2addr v6, v10

    add-int/lit8 v1, p1, 0x5

    aget-byte v1, v0, v1

    int-to-long v10, v1

    and-long/2addr v10, v8

    shl-long/2addr v10, v5

    or-long v5, v6, v10

    add-int/lit8 v1, p1, 0x6

    aget-byte v1, v0, v1

    int-to-long v10, v1

    and-long v7, v10, v8

    shl-long v3, v7, v4

    or-long/2addr v3, v5

    add-int/lit8 p1, p1, 0x7

    aget-byte p1, v0, p1

    int-to-long v0, p1

    shl-long/2addr v0, v2

    or-long/2addr v0, v3

    return-wide v0

    :cond_3
    if-lt p1, v0, :cond_5

    add-int/lit8 v0, p1, 0x8

    if-le v0, v1, :cond_4

    goto :goto_2

    .line 233
    :cond_4
    iget-object v0, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 235
    :try_start_0
    iget-object v1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    iget v2, p0, Ll/᩵ۨ֡;->۫:I

    add-int/2addr v2, p1

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 236
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    invoke-virtual {p1}, Ll/᩻ۖܽ;->readLong()J

    move-result-wide v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 238
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-direct {v1, p1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 240
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 77
    :cond_5
    :goto_2
    invoke-virtual {p0, p1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v1, p1, 0x1

    .line 78
    invoke-virtual {p0, v1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    .line 79
    invoke-virtual {p0, v1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    int-to-long v0, v0

    add-int/lit8 v3, p1, 0x3

    .line 80
    invoke-virtual {p0, v3}, Ll/᩵ۨ֡;->֫(I)B

    move-result v3

    int-to-long v10, v3

    and-long/2addr v10, v8

    shl-long/2addr v10, v7

    or-long/2addr v0, v10

    add-int/lit8 v3, p1, 0x4

    .line 81
    invoke-virtual {p0, v3}, Ll/᩵ۨ֡;->֫(I)B

    move-result v3

    int-to-long v10, v3

    and-long/2addr v10, v8

    shl-long v6, v10, v6

    or-long/2addr v0, v6

    add-int/lit8 v3, p1, 0x5

    .line 82
    invoke-virtual {p0, v3}, Ll/᩵ۨ֡;->֫(I)B

    move-result v3

    int-to-long v6, v3

    and-long/2addr v6, v8

    shl-long v5, v6, v5

    or-long/2addr v0, v5

    add-int/lit8 v3, p1, 0x6

    .line 83
    invoke-virtual {p0, v3}, Ll/᩵ۨ֡;->֫(I)B

    move-result v3

    int-to-long v5, v3

    and-long/2addr v5, v8

    shl-long v3, v5, v4

    or-long/2addr v0, v3

    add-int/lit8 p1, p1, 0x7

    .line 84
    invoke-virtual {p0, p1}, Ll/᩵ۨ֡;->֫(I)B

    move-result p1

    int-to-long v3, p1

    shl-long v2, v3, v2

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ᩻(I)I
    .locals 4

    .line 129
    iget v0, p0, Ll/᩵ۨ֡;->ۙ:I

    .line 130
    iget v1, p0, Ll/᩵ۨ֡;->᩶:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_2

    add-int/lit8 v2, v0, -0x2

    if-gt p1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-lt p1, v1, :cond_1

    sub-int v2, v1, v0

    sub-int/2addr p1, v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_3

    .line 144
    iget-object v0, p0, Ll/᩵ۨ֡;->᩹:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v1

    return p1

    :cond_3
    if-lt p1, v0, :cond_5

    add-int/lit8 v0, p1, 0x2

    if-le v0, v1, :cond_4

    goto :goto_3

    .line 153
    :cond_4
    iget-object v0, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    monitor-enter v0

    .line 155
    :try_start_0
    iget-object v1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    iget v2, p0, Ll/᩵ۨ֡;->۫:I

    add-int/2addr v2, p1

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 156
    iget-object p1, p0, Ll/᩵ۨ֡;->۬:Ll/᩻ۖܽ;

    .line 129
    invoke-virtual {p1}, Ll/᩻ۖܽ;->ۛۧ()I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-short p1, p1

    .line 156
    :try_start_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    .line 158
    new-instance v1, Ll/ܶ᩵ۚ;

    invoke-direct {v1, p1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;)V

    throw v1

    .line 160
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 95
    :cond_5
    :goto_3
    invoke-virtual {p0, p1}, Ll/᩵ۨ֡;->֫(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p1, p1, 0x1

    .line 96
    invoke-virtual {p0, p1}, Ll/᩵ۨ֡;->֫(I)B

    move-result p1

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v0

    return p1
.end method
