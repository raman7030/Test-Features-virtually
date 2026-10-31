.class public final Ll/ܺ۬ᩳ;
.super Ljava/lang/Object;
.source "R6OT"

# interfaces
.implements Ll/ۤ۬ᩳ;


# instance fields
.field public final ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public ۙ:Ljava/io/IOException;

.field public ۤ:I

.field public final ۫:Ll/ۤ۬ᩳ;

.field public ۬:J

.field public ᩶:Z

.field public ᩸:Z

.field public ᩹:[B


# direct methods
.method public constructor <init>(Ll/ۤ۬ᩳ;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 18
    iput-object p1, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    return-void
.end method

.method private ܽ()V
    .locals 3

    .line 45
    iget-boolean v0, p0, Ll/ܺ۬ᩳ;->᩶:Z

    if-nez v0, :cond_1

    .line 46
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Buffered recovery append requires reopening"

    iget-object v2, p0, Ll/ܺ۬ᩳ;->ۙ:Ljava/io/IOException;

    invoke-direct {v0, v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 45
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Recovery file is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܽ(J[BII)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    int-to-long v2, p4

    sub-long/2addr v0, v2

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    if-ltz p3, :cond_0

    if-ltz p4, :cond_0

    .line 127
    array-length p0, p2

    sub-int/2addr p0, p4

    if-gt p3, p0, :cond_0

    return-void

    .line 128
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "Invalid recovery I/O range"

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ᩳ()V
    .locals 5

    .line 60
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ܽ()V

    .line 61
    iget v0, p0, Ll/ܺ۬ᩳ;->ۤ:I

    if-nez v0, :cond_0

    return-void

    .line 63
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    iget-wide v2, p0, Ll/ܺ۬ᩳ;->۬:J

    iget-object v4, p0, Ll/ܺ۬ᩳ;->᩹:[B

    invoke-interface {v1, v2, v3, v0, v4}, Ll/ۤ۬ᩳ;->֫(JI[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    iget-wide v0, p0, Ll/ܺ۬ᩳ;->۬:J

    iget v2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܺ۬ᩳ;->۬:J

    const/4 v0, 0x0

    .line 69
    iput v0, p0, Ll/ܺ۬ᩳ;->ۤ:I

    return-void

    :catch_0
    move-exception v0

    .line 65
    iput-object v0, p0, Ll/ܺ۬ᩳ;->ۙ:Ljava/io/IOException;

    .line 66
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 181
    iget-object v0, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    iget-object v1, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 183
    :try_start_0
    iget-boolean v2, p0, Ll/ܺ۬ᩳ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 185
    :try_start_1
    iget-object v5, p0, Ll/ܺ۬ᩳ;->ۙ:Ljava/io/IOException;

    if-nez v5, :cond_1

    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ᩳ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    :cond_1
    :try_start_2
    iput-object v3, p0, Ll/ܺ۬ᩳ;->᩹:[B

    .line 188
    iput v4, p0, Ll/ܺ۬ᩳ;->ۤ:I

    .line 189
    iput-boolean v4, p0, Ll/ܺ۬ᩳ;->᩸:Z

    .line 190
    iput-boolean v2, p0, Ll/ܺ۬ᩳ;->᩶:Z

    .line 191
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 194
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v5

    .line 187
    :try_start_3
    iput-object v3, p0, Ll/ܺ۬ᩳ;->᩹:[B

    .line 188
    iput v4, p0, Ll/ܺ۬ᩳ;->ۤ:I

    .line 189
    iput-boolean v4, p0, Ll/ܺ۬ᩳ;->᩸:Z

    .line 190
    iput-boolean v2, p0, Ll/ܺ۬ᩳ;->᩶:Z

    .line 191
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 192
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    .line 194
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 195
    throw v0
.end method

.method public final flush()V
    .locals 2

    .line 51
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 53
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ᩳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 56
    throw v1
.end method

.method public final length()J
    .locals 7

    .line 132
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 134
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ܽ()V

    .line 135
    iget v1, p0, Ll/ܺ۬ᩳ;->ۤ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    if-nez v1, :cond_0

    :try_start_1
    invoke-interface {v2}, Ll/ۤ۬ᩳ;->length()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ll/ۤ۬ᩳ;->length()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ܺ۬ᩳ;->۬:J

    iget v5, p0, Ll/ܺ۬ᩳ;->ۤ:I

    int-to-long v5, v5

    add-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-wide v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 138
    throw v1
.end method

.method public final truncate(J)V
    .locals 7

    .line 142
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 144
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ۬ᩳ;->᩶:Z

    if-nez v1, :cond_3

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_2

    .line 146
    iget-object v1, p0, Ll/ܺ۬ᩳ;->ۙ:Ljava/io/IOException;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 148
    :try_start_1
    iput v3, p0, Ll/ܺ۬ᩳ;->ۤ:I

    .line 149
    invoke-interface {v2, p1, p2}, Ll/ۤ۬ᩳ;->truncate(J)V

    goto :goto_0

    .line 150
    :cond_0
    iget v1, p0, Ll/ܺ۬ᩳ;->ۤ:I

    if-eqz v1, :cond_1

    iget-wide v4, p0, Ll/ܺ۬ᩳ;->۬:J

    cmp-long v6, p1, v4

    if-ltz v6, :cond_1

    int-to-long v1, v1

    sub-long/2addr p1, v4

    .line 151
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    goto :goto_0

    .line 153
    :cond_1
    invoke-interface {v2, p1, p2}, Ll/ۤ۬ᩳ;->truncate(J)V

    .line 154
    iput v3, p0, Ll/ܺ۬ᩳ;->ۤ:I

    .line 155
    iget-wide v1, p0, Ll/ܺ۬ᩳ;->۬:J

    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܺ۬ᩳ;->۬:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 145
    :cond_2
    :try_start_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative recovery length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 144
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery file is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 158
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 159
    throw p1
.end method

.method public final ֫()V
    .locals 4

    .line 35
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 37
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ᩳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iput-object v1, p0, Ll/ܺ۬ᩳ;->᩹:[B

    iput v2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    iput-boolean v2, p0, Ll/ܺ۬ᩳ;->᩸:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v3

    .line 38
    :try_start_2
    iput-object v1, p0, Ll/ܺ۬ᩳ;->᩹:[B

    iput v2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    iput-boolean v2, p0, Ll/ܺ۬ᩳ;->᩸:Z

    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 41
    throw v1
.end method

.method public final ֫(JI[B)V
    .locals 8

    .line 73
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 75
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ܽ()V

    const/4 v1, 0x0

    .line 76
    invoke-static {p1, p2, p4, v1, p3}, Ll/ܺ۬ᩳ;->ܽ(J[BII)V

    .line 77
    iget-object v2, p0, Ll/ܺ۬ᩳ;->᩹:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    if-nez v2, :cond_0

    .line 78
    :try_start_1
    invoke-interface {v3, p1, p2, p3, p4}, Ll/ۤ۬ᩳ;->֫(JI[B)V

    goto :goto_1

    .line 81
    :cond_0
    iget-wide v4, p0, Ll/ܺ۬ᩳ;->۬:J

    iget v2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    int-to-long v6, v2

    add-long/2addr v4, v6

    cmp-long v2, p1, v4

    if-eqz v2, :cond_1

    .line 83
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ᩳ()V

    .line 84
    invoke-interface {v3, p1, p2, p3, p4}, Ll/ۤ۬ᩳ;->֫(JI[B)V

    .line 85
    invoke-interface {v3}, Ll/ۤ۬ᩳ;->length()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܺ۬ᩳ;->۬:J

    goto :goto_1

    :cond_1
    :goto_0
    if-lez p3, :cond_2

    .line 89
    iget-object p1, p0, Ll/ܺ۬ᩳ;->᩹:[B

    array-length p1, p1

    iget p2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    sub-int/2addr p1, p2

    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 90
    iget-object p2, p0, Ll/ܺ۬ᩳ;->᩹:[B

    iget v2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    invoke-static {p4, v1, p2, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    iget p2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ܺ۬ᩳ;->ۤ:I

    add-int/2addr v1, p1

    sub-int/2addr p3, p1

    .line 94
    iget-object p1, p0, Ll/ܺ۬ᩳ;->᩹:[B

    array-length p1, p1

    if-ne p2, p1, :cond_1

    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ᩳ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 97
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 98
    throw p1
.end method

.method public final ֫(J[B)V
    .locals 2

    .line 22
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 24
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ܽ()V

    .line 25
    iget-boolean v1, p0, Ll/ܺ۬ᩳ;->᩸:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Ll/ܺ۬ᩳ;->᩸:Z

    .line 27
    iput-object p3, p0, Ll/ܺ۬ᩳ;->᩹:[B

    .line 28
    iput-wide p1, p0, Ll/ܺ۬ᩳ;->۬:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    .line 25
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Recovery append batch is already active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 31
    throw p1
.end method

.method public final ֫(J[BII)V
    .locals 15

    move-object v1, p0

    move/from16 v0, p5

    .line 103
    iget-object v8, v1, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 105
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ܽ()V

    .line 106
    invoke-static/range {p1 .. p5}, Ll/ܺ۬ᩳ;->ܽ(J[BII)V

    .line 107
    iget v2, v1, Ll/ܺ۬ᩳ;->ۤ:I

    if-eqz v2, :cond_2

    iget-wide v3, v1, Ll/ܺ۬ᩳ;->۬:J

    int-to-long v5, v2

    add-long/2addr v5, v3

    cmp-long v2, p1, v5

    if-gez v2, :cond_2

    int-to-long v5, v0

    add-long v5, v5, p1

    cmp-long v2, v5, v3

    if-gtz v2, :cond_0

    goto :goto_1

    :cond_0
    cmp-long v2, p1, v3

    if-gez v2, :cond_1

    sub-long v3, v3, p1

    long-to-int v9, v3

    .line 113
    iget-object v2, v1, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    move-wide/from16 v3, p1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move v7, v9

    invoke-interface/range {v2 .. v7}, Ll/ۤ۬ᩳ;->֫(J[BII)V

    int-to-long v2, v9

    add-long v2, v2, p1

    add-int v4, p4, v9

    sub-int/2addr v0, v9

    goto :goto_0

    :cond_1
    move-wide/from16 v2, p1

    move/from16 v4, p4

    :goto_0
    int-to-long v5, v0

    .line 118
    iget-wide v9, v1, Ll/ܺ۬ᩳ;->۬:J

    iget v7, v1, Ll/ܺ۬ᩳ;->ۤ:I

    int-to-long v11, v7

    add-long/2addr v9, v11

    sub-long/2addr v9, v2

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    .line 119
    iget-object v5, v1, Ll/ܺ۬ᩳ;->᩹:[B

    iget-wide v9, v1, Ll/ܺ۬ᩳ;->۬:J

    sub-long v9, v2, v9

    long-to-int v7, v9

    move-object/from16 v12, p3

    invoke-static {v5, v7, v12, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ge v6, v0, :cond_3

    .line 120
    iget-object v9, v1, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    int-to-long v10, v6

    add-long/2addr v10, v2

    add-int v13, v4, v6

    sub-int v14, v0, v6

    move-object/from16 v12, p3

    invoke-interface/range {v9 .. v14}, Ll/ۤ۬ᩳ;->֫(J[BII)V

    goto :goto_2

    :cond_2
    :goto_1
    move-object/from16 v12, p3

    .line 108
    iget-object v2, v1, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    move-wide/from16 v3, p1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    invoke-interface/range {v2 .. v7}, Ll/ۤ۬ᩳ;->֫(J[BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :cond_3
    :goto_2
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 123
    throw v0
.end method

.method public final ۘ֫()V
    .locals 2

    .line 172
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 174
    :try_start_0
    iget-object v1, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    invoke-interface {v1}, Ll/ۤ۬ᩳ;->ۘ֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 177
    throw v1
.end method

.method public final ܺ()V
    .locals 2

    .line 163
    iget-object v0, p0, Ll/ܺ۬ᩳ;->ۗ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    .line 165
    :try_start_0
    invoke-direct {p0}, Ll/ܺ۬ᩳ;->ᩳ()V

    iget-object v1, p0, Ll/ܺ۬ᩳ;->۫:Ll/ۤ۬ᩳ;

    invoke-interface {v1}, Ll/ۤ۬ᩳ;->ܺ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    .line 168
    throw v1
.end method
