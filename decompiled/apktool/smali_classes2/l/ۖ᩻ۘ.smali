.class public Ll/ۖ᩻ۘ;
.super Ljava/io/PipedInputStream;
.source "2BMB"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 317
    invoke-direct {p0}, Ljava/io/PipedInputStream;-><init>()V

    const v0, 0x8000

    new-array v1, v0, [B

    .line 318
    iput-object v1, p0, Ljava/io/PipedInputStream;->buffer:[B

    .line 319
    iput v0, p0, Ll/ۖ᩻ۘ;->᩸:I

    .line 325
    iput p1, p0, Ll/ۖ᩻ۘ;->᩹:I

    return-void
.end method

.method public constructor <init>(Ljava/io/PipedOutputStream;I)V
    .locals 0

    .line 333
    invoke-direct {p0, p1}, Ljava/io/PipedInputStream;-><init>(Ljava/io/PipedOutputStream;)V

    const/16 p1, 0x400

    .line 309
    iput p1, p0, Ll/ۖ᩻ۘ;->᩸:I

    .line 310
    iput p1, p0, Ll/ۖ᩻ۘ;->᩹:I

    .line 334
    new-array p1, p2, [B

    iput-object p1, p0, Ljava/io/PipedInputStream;->buffer:[B

    .line 335
    iput p2, p0, Ll/ۖ᩻ۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final declared-synchronized ֫()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 345
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 346
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 349
    :try_start_1
    iput v1, p0, Ljava/io/PipedInputStream;->out:I

    .line 350
    iget-object v2, p0, Ljava/io/PipedInputStream;->buffer:[B

    const/4 v3, 0x1

    iput v3, p0, Ljava/io/PipedInputStream;->in:I

    aput-byte v1, v2, v1

    .line 351
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 352
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(I)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 356
    :try_start_0
    iget v1, p0, Ljava/io/PipedInputStream;->out:I

    iget v2, p0, Ljava/io/PipedInputStream;->in:I

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ge v1, v2, :cond_0

    .line 357
    iget-object v1, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v1, v1

    goto :goto_0

    :cond_0
    if-ge v2, v1, :cond_2

    if-ne v2, v3, :cond_1

    .line 360
    iget-object v1, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v1, v1

    goto :goto_1

    :cond_1
    :goto_0
    sub-int/2addr v1, v2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_a

    .line 370
    iget-object v2, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v5, v2

    sub-int/2addr v5, v1

    .line 371
    array-length v1, v2

    :goto_2
    sub-int v2, v1, v5

    if-ge v2, p1, :cond_3

    mul-int/lit8 v1, v1, 0x2

    goto :goto_2

    .line 376
    :cond_3
    iget v2, p0, Ll/ۖ᩻ۘ;->᩹:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-le v1, v2, :cond_4

    move v1, v2

    :cond_4
    sub-int v2, v1, v5

    if-ge v2, p1, :cond_5

    .line 380
    monitor-exit v0

    return-void

    .line 382
    :cond_5
    :try_start_1
    new-array p1, v1, [B

    .line 383
    iget v2, p0, Ljava/io/PipedInputStream;->out:I

    iget v5, p0, Ljava/io/PipedInputStream;->in:I

    if-ge v2, v5, :cond_6

    .line 384
    iget-object v1, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v2, v1

    invoke-static {v1, v4, p1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_6
    if-ge v5, v2, :cond_8

    if-ne v5, v3, :cond_7

    goto :goto_3

    .line 388
    :cond_7
    iget-object v2, p0, Ljava/io/PipedInputStream;->buffer:[B

    invoke-static {v2, v4, p1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 389
    iget-object v2, p0, Ljava/io/PipedInputStream;->buffer:[B

    iget v3, p0, Ljava/io/PipedInputStream;->out:I

    array-length v4, v2

    sub-int/2addr v4, v3

    sub-int v4, v1, v4

    array-length v5, v2

    sub-int/2addr v5, v3

    invoke-static {v2, v3, p1, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 391
    iget-object v2, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v2, v2

    iget v3, p0, Ljava/io/PipedInputStream;->out:I

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    iput v1, p0, Ljava/io/PipedInputStream;->out:I

    goto :goto_3

    :cond_8
    if-ne v5, v2, :cond_9

    .line 394
    iget-object v1, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v2, v1

    invoke-static {v1, v4, p1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 395
    iget-object v1, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length v1, v1

    iput v1, p0, Ljava/io/PipedInputStream;->in:I

    .line 397
    :cond_9
    :goto_3
    iput-object p1, p0, Ljava/io/PipedInputStream;->buffer:[B

    goto :goto_5

    .line 398
    :cond_a
    iget-object p1, p0, Ljava/io/PipedInputStream;->buffer:[B

    array-length p1, p1

    if-ne p1, v1, :cond_c

    iget p1, p0, Ll/ۖ᩻ۘ;->᩸:I

    if-le v1, p1, :cond_c

    .line 399
    div-int/lit8 v1, v1, 0x2

    if-ge v1, p1, :cond_b

    goto :goto_4

    :cond_b
    move p1, v1

    .line 402
    :goto_4
    new-array p1, p1, [B

    .line 403
    iput-object p1, p0, Ljava/io/PipedInputStream;->buffer:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 405
    :cond_c
    :goto_5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
