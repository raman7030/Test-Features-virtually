.class public final Ll/ۛۧ֡;
.super Ljava/lang/Object;
.source "54EF"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۬:Ljava/util/logging/Logger;


# instance fields
.field public final ۗ:Ll/ۤܽ֡;

.field public ۙ:I

.field public final ᩶:Ll/ۧۧ֡;

.field public ᩸:Z

.field public final ᩹:Ll/۫ܽ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    const-class v0, Ll/ᩳۧ֡;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۛۧ֡;->۬:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ll/ۤܽ֡;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    .line 60
    new-instance p1, Ll/۫ܽ֡;

    invoke-direct {p1}, Ll/۫ܽ֡;-><init>()V

    iput-object p1, p0, Ll/ۛۧ֡;->᩹:Ll/۫ܽ֡;

    .line 61
    new-instance v0, Ll/ۧۧ֡;

    invoke-direct {v0, p1}, Ll/ۧۧ֡;-><init>(Ll/۫ܽ֡;)V

    iput-object v0, p0, Ll/ۛۧ֡;->᩶:Ll/ۧۧ֡;

    const/16 p1, 0x4000

    .line 62
    iput p1, p0, Ll/ۛۧ֡;->ۙ:I

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 278
    :try_start_0
    iput-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    .line 279
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {v1}, Ll/ۚᩳ֡;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized flush()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 120
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_0

    .line 121
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {v1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    monitor-exit v0

    return-void

    .line 120
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 122
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫()V
    .locals 5

    const-string v1, ">> CONNECTION "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 66
    :try_start_0
    iget-boolean v2, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v2, :cond_1

    .line 68
    sget-object v2, Ll/ۛۧ֡;->۬:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 69
    sget-object v3, Ll/ᩳۧ֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v3}, Ll/ۨܽ֡;->ۧ()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ll/᩶۟᩵;->֫:[B

    .line 472
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 71
    :cond_0
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    sget-object v2, Ll/ᩳۧ֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v2}, Ll/ۨܽ֡;->ܺ()[B

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 72
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {v1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit v0

    return-void

    .line 66
    :cond_1
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 73
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(IIBB)V
    .locals 4

    .line 266
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v1, Ll/ۛۧ֡;->۬:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v2, p1, p2, p3, p4}, Ll/ᩳۧ֡;->֫(ZIIBB)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 267
    :cond_0
    iget v0, p0, Ll/ۛۧ֡;->ۙ:I

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-gt p2, v0, :cond_2

    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    ushr-int/lit8 v0, p2, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 283
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {v1, v0}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    ushr-int/lit8 v0, p2, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 284
    invoke-interface {v1, v0}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    and-int/lit16 p2, p2, 0xff

    .line 285
    invoke-interface {v1, p2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    and-int/lit16 p2, p3, 0xff

    .line 272
    invoke-interface {v1, p2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    and-int/lit16 p2, p4, 0xff

    .line 273
    invoke-interface {v1, p2}, Ll/ۤܽ֡;->writeByte(I)Ll/ۤܽ֡;

    const p2, 0x7fffffff

    and-int/2addr p1, p2

    .line 274
    invoke-interface {v1, p1}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    return-void

    .line 270
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v2

    const-string p1, "reserved bit set: %s"

    invoke-static {p1, p2}, Ll/ᩳۧ֡;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3

    .line 268
    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p1, p3, v2

    aput-object p2, p3, v1

    const-string p1, "FRAME_SIZE_ERROR length > %d: %d"

    invoke-static {p1, p3}, Ll/ᩳۧ֡;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3
.end method

.method public final declared-synchronized ֫(IIZ)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 211
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_0

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/16 v3, 0x8

    .line 216
    invoke-virtual {p0, v2, v3, v1, p3}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 217
    iget-object p3, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p3, p1}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    .line 218
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    .line 219
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    monitor-exit v0

    return-void

    .line 211
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 220
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(IJ)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 252
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_1

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    cmp-long v4, p2, v1

    if-eqz v4, :cond_0

    const-wide/32 v1, 0x7fffffff

    cmp-long v4, p2, v1

    if-gtz v4, :cond_0

    const/4 v1, 0x4

    const/16 v2, 0x8

    .line 260
    invoke-virtual {p0, p1, v1, v2, v3}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 261
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    long-to-int p3, p2

    invoke-interface {p1, p3}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    .line 262
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    const-string p1, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s"

    .line 255
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    aput-object p2, p3, v3

    .line 254
    invoke-static {p1, p3}, Ll/ᩳۧ֡;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    .line 252
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 254
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(ILl/ܰ֫֡;)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 144
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_1

    .line 145
    iget v1, p2, Ll/ܰ֫֡;->᩸:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x4

    .line 150
    invoke-virtual {p0, p1, v3, v1, v2}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 151
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    iget p2, p2, Ll/ܰ֫֡;->᩸:I

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    .line 152
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v0

    return-void

    .line 145
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 144
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 153
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(ILl/ܰ֫֡;[B)V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 232
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_2

    .line 233
    iget v1, p2, Ll/ܰ֫֡;->᩸:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    .line 234
    array-length v1, p3

    add-int/lit8 v1, v1, 0x8

    const/4 v2, 0x7

    .line 238
    invoke-virtual {p0, v3, v1, v2, v3}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 239
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {v1, p1}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    .line 240
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    iget p2, p2, Ll/ܰ֫֡;->᩸:I

    invoke-interface {p1, p2}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    .line 241
    array-length p1, p3

    if-lez p1, :cond_0

    .line 242
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1, p3}, Ll/ۤܽ֡;->write([B)Ll/ۤܽ֡;

    .line 244
    :cond_0
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    const-string p1, "errorCode.httpCode == -1"

    new-array p2, v3, [Ljava/lang/Object;

    .line 233
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    .line 232
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 245
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ljava/util/ArrayList;IZ)V
    .locals 8

    .line 298
    iget-boolean v0, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v0, :cond_4

    .line 299
    iget-object v0, p0, Ll/ۛۧ֡;->᩶:Ll/ۧۧ֡;

    invoke-virtual {v0, p1}, Ll/ۧۧ֡;->֫(Ljava/util/ArrayList;)V

    .line 301
    iget-object p1, p0, Ll/ۛۧ֡;->᩹:Ll/۫ܽ֡;

    invoke-virtual {p1}, Ll/۫ܽ֡;->size()J

    move-result-wide v0

    .line 302
    iget v2, p0, Ll/ۛۧ֡;->ۙ:I

    int-to-long v2, v2

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    int-to-long v4, v3

    cmp-long v2, v0, v4

    if-nez v2, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    if-eqz p3, :cond_1

    or-int/lit8 p3, v6, 0x1

    int-to-byte v6, p3

    :cond_1
    const/4 p3, 0x1

    .line 306
    invoke-virtual {p0, p2, v3, p3, v6}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 307
    iget-object p3, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p3, p1, v4, v5}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V

    if-lez v2, :cond_3

    sub-long/2addr v0, v4

    :goto_1
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    .line 290
    iget v4, p0, Ll/ۛۧ֡;->ۙ:I

    int-to-long v4, v4

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    int-to-long v6, v5

    sub-long/2addr v0, v6

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    const/4 v2, 0x4

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    const/16 v3, 0x9

    .line 292
    invoke-virtual {p0, p2, v5, v3, v2}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 293
    invoke-interface {p3, p1, v6, v7}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V

    goto :goto_1

    :cond_3
    return-void

    .line 298
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/֫ܽ֡;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 77
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_1

    .line 78
    iget v1, p0, Ll/ۛۧ֡;->ۙ:I

    invoke-virtual {p1, v1}, Ll/֫ܽ֡;->ۧ(I)I

    move-result v1

    iput v1, p0, Ll/ۛۧ֡;->ۙ:I

    .line 79
    invoke-virtual {p1}, Ll/֫ܽ֡;->֫()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 80
    iget-object v1, p0, Ll/ۛۧ֡;->᩶:Ll/ۧۧ֡;

    invoke-virtual {p1}, Ll/֫ܽ֡;->֫()I

    move-result p1

    invoke-virtual {v1, p1}, Ll/ۧۧ֡;->֫(I)V

    :cond_0
    const/4 p1, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 86
    invoke-virtual {p0, v2, v2, p1, v1}, Ll/ۛۧ֡;->֫(IIBB)V

    .line 87
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit v0

    return-void

    .line 77
    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 88
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(ZILl/۫ܽ֡;I)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 170
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    int-to-byte p1, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 178
    :goto_0
    invoke-virtual {p0, p2, p4, v1, p1}, Ll/ۛۧ֡;->֫(IIBB)V

    if-lez p4, :cond_1

    .line 180
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    int-to-long v1, p4

    invoke-interface {p1, p3, v1, v2}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 174
    :cond_1
    monitor-exit v0

    return-void

    .line 170
    :cond_2
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 174
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ljava/util/ArrayList;IZ)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 126
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_0

    .line 127
    invoke-virtual {p0, p1, p2, p3}, Ll/ۛۧ֡;->֫(Ljava/util/ArrayList;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    monitor-exit v0

    return-void

    .line 126
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 128
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ll/֫ܽ֡;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 186
    :try_start_0
    iget-boolean v1, p0, Ll/ۛۧ֡;->᩸:Z

    if-nez v1, :cond_4

    .line 187
    invoke-virtual {p1}, Ll/֫ܽ֡;->ᩳ()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x4

    .line 191
    invoke-virtual {p0, v2, v1, v3, v2}, Ll/ۛۧ֡;->֫(IIBB)V

    :goto_0
    const/16 v1, 0xa

    if-ge v2, v1, :cond_3

    .line 193
    invoke-virtual {p1, v2}, Ll/֫ܽ֡;->ܽ(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    if-ne v2, v3, :cond_1

    const/4 v1, 0x3

    goto :goto_1

    :cond_1
    const/4 v1, 0x7

    if-ne v2, v1, :cond_2

    const/4 v1, 0x4

    goto :goto_1

    :cond_2
    move v1, v2

    .line 200
    :goto_1
    iget-object v4, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {v4, v1}, Ll/ۤܽ֡;->writeShort(I)Ll/ۤܽ֡;

    .line 201
    iget-object v1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-virtual {p1, v2}, Ll/֫ܽ֡;->֫(I)I

    move-result v4

    invoke-interface {v1, v4}, Ll/ۤܽ֡;->writeInt(I)Ll/ۤܽ֡;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 203
    :cond_3
    iget-object p1, p0, Ll/ۛۧ֡;->ۗ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۤܽ֡;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    monitor-exit v0

    return-void

    .line 186
    :cond_4
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 204
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ܽ()I
    .locals 1

    .line 157
    iget v0, p0, Ll/ۛۧ֡;->ۙ:I

    return v0
.end method
