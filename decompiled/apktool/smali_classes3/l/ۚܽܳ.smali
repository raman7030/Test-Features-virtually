.class public final Ll/ۚܽܳ;
.super Ljava/lang/Object;
.source "M70O"

# interfaces
.implements Ll/ۙ֫ܳ;
.implements Ll/ۖܽܳ;


# instance fields
.field public final ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۙ:Ll/ܺ֡ܿ;

.field public final ۤ:I

.field public volatile ۫:Z

.field public final ۬:Ll/֫ۧܳ;

.field public final ᩶:Ljava/util/function/BooleanSupplier;

.field public final ᩸:Ljava/nio/channels/FileChannel;

.field public final ᩹:Ll/ܿܽܳ;


# direct methods
.method public constructor <init>(Ll/ܺ֡ܿ;Ll/֫ۧܳ;Ljava/nio/channels/FileChannel;Ll/ܿܽܳ;Ljava/util/function/BooleanSupplier;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/ۚܽܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    iput-object p1, p0, Ll/ۚܽܳ;->ۙ:Ll/ܺ֡ܿ;

    .line 36
    iput-object p2, p0, Ll/ۚܽܳ;->۬:Ll/֫ۧܳ;

    .line 37
    invoke-virtual {p2}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide p1

    const-wide/32 v0, 0x7fffffff

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Ll/ۚܽܳ;->ۤ:I

    .line 38
    iput-object p3, p0, Ll/ۚܽܳ;->᩸:Ljava/nio/channels/FileChannel;

    .line 39
    iput-object p4, p0, Ll/ۚܽܳ;->᩹:Ll/ܿܽܳ;

    .line 40
    iput-object p5, p0, Ll/ۚܽܳ;->᩶:Ljava/util/function/BooleanSupplier;

    return-void
.end method

.method public static ֫(Ll/ܺ֡ܿ;)Ll/ۚܽܳ;
    .locals 2

    .line 47
    new-instance v0, Ll/֡ܽܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 54
    invoke-static {p0, v0, v1}, Ll/ۚܽܳ;->֫(Ll/ܺ֡ܿ;Ljava/util/function/BooleanSupplier;Z)Ll/ۚܽܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܺ֡ܿ;Ljava/util/function/BooleanSupplier;Z)Ll/ۚܽܳ;
    .locals 9

    .line 64
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    invoke-interface {p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 24
    new-instance v0, Ll/֫ۧܳ;

    invoke-virtual {p0}, Ll/ܺ֡ܿ;->᩺֫()J

    move-result-wide v1

    invoke-virtual {p0}, Ll/ܺ֡ܿ;->ۛ֫()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Ll/֫ۧܳ;-><init>(JJ)V

    if-nez p2, :cond_1

    .line 70
    invoke-virtual {v0}, Ll/֫ۧܳ;->ۧ()J

    move-result-wide v1

    const-wide/32 v3, 0x7fffffff

    cmp-long p2, v1, v3

    if-gtz p2, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Only files smaller than 2 GB can be opened"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 77
    :try_start_0
    invoke-static {}, Ll/ܳܽܳ;->ۧ()Ll/ܿܽܳ;

    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_6

    .line 78
    :try_start_1
    invoke-virtual {p0}, Ll/ܺ֡ܿ;->ۜۧ()Ljava/nio/channels/FileChannel;

    move-result-object v8

    invoke-static {v8}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .line 24
    :try_start_2
    new-instance v3, Ll/֫ۧܳ;

    invoke-virtual {p0}, Ll/ܺ֡ܿ;->᩺֫()J

    move-result-wide v1

    invoke-virtual {p0}, Ll/ܺ֡ܿ;->ۛ֫()J

    move-result-wide v4

    invoke-direct {v3, v1, v2, v4, v5}, Ll/֫ۧܳ;-><init>(JJ)V

    .line 80
    invoke-virtual {v0, v3}, Ll/֫ۧܳ;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 83
    new-instance p2, Ll/ۚܽܳ;

    move-object v1, p2

    move-object v2, p0

    move-object v4, v8

    move-object v5, v7

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Ll/ۚܽܳ;-><init>(Ll/ܺ֡ܿ;Ll/֫ۧܳ;Ljava/nio/channels/FileChannel;Ll/ܿܽܳ;Ljava/util/function/BooleanSupplier;)V

    return-object p2

    .line 81
    :cond_2
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    :goto_1
    move-object p2, v8

    goto :goto_3

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    goto :goto_3

    :catch_5
    move-exception p0

    goto :goto_3

    :catch_6
    move-exception p0

    goto :goto_2

    :catch_7
    move-exception p0

    goto :goto_2

    :catch_8
    move-exception p0

    :goto_2
    move-object v7, p2

    :goto_3
    if-eqz p2, :cond_5

    .line 87
    :try_start_3
    invoke-virtual {p2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p1

    if-eq p1, p0, :cond_4

    .line 91
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p0

    if-eqz v7, :cond_3

    .line 95
    invoke-virtual {v7}, Ll/ܿܽܳ;->close()V

    .line 97
    :cond_3
    throw p0

    :cond_4
    :goto_4
    if-eqz v7, :cond_6

    goto :goto_6

    :cond_5
    :goto_5
    if-eqz v7, :cond_6

    .line 95
    :goto_6
    invoke-virtual {v7}, Ll/ܿܽܳ;->close()V

    .line 98
    :cond_6
    throw p0

    .line 67
    :cond_7
    new-instance p0, Ll/ۚᩳܳ;

    invoke-direct {p0}, Ll/ۚᩳܳ;-><init>()V

    throw p0
.end method

.method public static ۧ(Ll/ܺ֡ܿ;)Ll/ۚܽܳ;
    .locals 2

    .line 59
    new-instance v0, Ll/֡ܽܳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Ll/ۚܽܳ;->֫(Ll/ܺ֡ܿ;Ljava/util/function/BooleanSupplier;Z)Ll/ۚܽܳ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 170
    iget-object v0, p0, Ll/ۚܽܳ;->᩹:Ll/ܿܽܳ;

    iget-object v1, p0, Ll/ۚܽܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v2

    if-nez v2, :cond_0

    .line 173
    :try_start_0
    iget-object v1, p0, Ll/ۚܽܳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    invoke-virtual {v0}, Ll/ܿܽܳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ܿܽܳ;->close()V

    .line 176
    throw v1

    :cond_0
    if-ltz v2, :cond_1

    return-void

    .line 178
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 179
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "NormalFileSource already closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 109
    iget v0, p0, Ll/ۚܽܳ;->ۤ:I

    return v0
.end method

.method public final ֫()Ll/֫ۧܳ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۚܽܳ;->۬:Ll/֫ۧܳ;

    return-object v0
.end method

.method public final ֫(I[BII)V
    .locals 2

    .line 109
    iget v0, p0, Ll/ۚܽܳ;->ۤ:I

    .line 114
    invoke-static {v0, p1, p4}, Ll/ۡܽܳ;->ܽ(III)V

    .line 115
    array-length v0, p2

    invoke-static {v0, p3, p4}, Ll/ۡܽܳ;->ۧ(III)V

    .line 116
    iget-object v0, p0, Ll/ۚܽܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_4

    .line 119
    invoke-static {p2, p3, p4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p2

    int-to-long p3, p1

    .line 121
    :goto_0
    invoke-virtual {p2}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 122
    iget-object p1, p0, Ll/ۚܽܳ;->᩸:Ljava/nio/channels/FileChannel;

    invoke-virtual {p1, p2, p3, p4}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result p1

    if-gez p1, :cond_1

    .line 124
    invoke-virtual {p0}, Ll/ۚܽܳ;->۫()Z

    move-result p1

    if-nez p1, :cond_0

    .line 125
    new-instance p1, Ll/ۚᩳܳ;

    invoke-direct {p1}, Ll/ۚᩳܳ;-><init>()V

    throw p1

    .line 127
    :cond_0
    new-instance p1, Ll/ۚᩳܳ;

    new-instance p2, Ljava/io/EOFException;

    const-string p3, "Unexpected end of source file"

    invoke-direct {p2, p3}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ۚᩳܳ;-><init>(Ljava/io/IOException;)V

    throw p1

    :cond_1
    if-nez p1, :cond_2

    .line 130
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_2
    int-to-long v0, p1

    add-long/2addr p3, v0

    goto :goto_0

    :cond_3
    return-void

    .line 117
    :cond_4
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method

.method public final ۡ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 152
    iput-boolean v0, p0, Ll/ۚܽܳ;->۫:Z

    return-void
.end method

.method public final ۫()Z
    .locals 2

    .line 144
    iget-boolean v0, p0, Ll/ۚܽܳ;->۫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۚܽܳ;->۬:Ll/֫ۧܳ;

    iget-object v1, p0, Ll/ۚܽܳ;->ۙ:Ll/ܺ֡ܿ;

    invoke-virtual {v0, v1}, Ll/֫ۧܳ;->֫(Ll/ܺ֡ܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚܽܳ;->᩶:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩺ۧ()Ll/ᩴܽܳ;
    .locals 3

    .line 158
    :cond_0
    iget-object v0, p0, Ll/ۚܽܳ;->ۗ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_1

    add-int/lit8 v2, v1, 0x1

    .line 162
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 160
    :cond_1
    new-instance v0, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {v0}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw v0
.end method
