.class public final Ll/ۢۗᩳ;
.super Ljava/lang/Object;
.source "86UT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Ll/ۖۗᩳ;

.field public ۙ:Ll/ۚۙᩳ;

.field public final ۛ:J

.field public final ۤ:Ljava/io/IOException;

.field public ۨ:[B

.field public final ۫:Ljava/io/IOException;

.field public final ۬:Ll/ۡۗᩳ;

.field public ܰ:Ll/ۨ᩹ᩳ;

.field public ᩶:Ll/ۖۙᩳ;

.field public final ᩸:Ll/᩻ۗᩳ;

.field public final ᩹:J

.field public final ᩺:J


# direct methods
.method public constructor <init>(Ll/ۡۗᩳ;Ll/ۨ᩹ᩳ;Ll/ۖۗᩳ;Ll/ۖۙᩳ;Ll/ۚۙᩳ;Ll/᩻ۗᩳ;JLjava/io/IOException;Ljava/io/IOException;)V
    .locals 1

    .line 329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 330
    invoke-static {p1}, Ll/ۡۗᩳ;->֫(Ll/ۡۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩺ۧ()V

    .line 331
    iput-object p1, p0, Ll/ۢۗᩳ;->۬:Ll/ۡۗᩳ;

    .line 332
    iput-object p2, p0, Ll/ۢۗᩳ;->ܰ:Ll/ۨ᩹ᩳ;

    .line 333
    iput-object p3, p0, Ll/ۢۗᩳ;->ۗ:Ll/ۖۗᩳ;

    .line 334
    iput-object p4, p0, Ll/ۢۗᩳ;->᩶:Ll/ۖۙᩳ;

    .line 335
    iput-object p5, p0, Ll/ۢۗᩳ;->ۙ:Ll/ۚۙᩳ;

    .line 336
    iget-object p1, p3, Ll/ۖۗᩳ;->᩸:[B

    iput-object p1, p0, Ll/ۢۗᩳ;->ۨ:[B

    .line 337
    iput-object p6, p0, Ll/ۢۗᩳ;->᩸:Ll/᩻ۗᩳ;

    .line 338
    iget-wide p1, p6, Ll/᩻ۗᩳ;->ۢ:J

    iput-wide p1, p0, Ll/ۢۗᩳ;->ۛ:J

    .line 339
    iget-wide p1, p6, Ll/᩻ۗᩳ;->ۖ:J

    iput-wide p1, p0, Ll/ۢۗᩳ;->᩺:J

    .line 340
    iput-wide p7, p0, Ll/ۢۗᩳ;->᩹:J

    .line 341
    iput-object p9, p0, Ll/ۢۗᩳ;->ۤ:Ljava/io/IOException;

    .line 342
    iput-object p10, p0, Ll/ۢۗᩳ;->۫:Ljava/io/IOException;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۗᩳ;)Ll/᩻ۗᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۗᩳ;->᩸:Ll/᩻ۗᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۢۗᩳ;)Ll/ۡۗᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۗᩳ;->۬:Ll/ۡۗᩳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    move-object v0, p0

    .line 353
    monitor-enter v0

    .line 354
    :try_start_0
    iget-object v1, p0, Ll/ۢۗᩳ;->ۗ:Ll/ۖۗᩳ;

    if-nez v1, :cond_0

    .line 355
    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 356
    iput-object v2, p0, Ll/ۢۗᩳ;->ۗ:Ll/ۖۗᩳ;

    .line 357
    iput-object v2, p0, Ll/ۢۗᩳ;->ۨ:[B

    .line 358
    iput-object v2, p0, Ll/ۢۗᩳ;->ܰ:Ll/ۨ᩹ᩳ;

    .line 359
    iput-object v2, p0, Ll/ۢۗᩳ;->᩶:Ll/ۖۙᩳ;

    .line 360
    iput-object v2, p0, Ll/ۢۗᩳ;->ۙ:Ll/ۚۙᩳ;

    .line 361
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 362
    :try_start_1
    invoke-virtual {v1}, Ll/ۖۗᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Ll/ۢۗᩳ;->۬:Ll/ۡۗᩳ;

    invoke-static {v0}, Ll/ۡۗᩳ;->֫(Ll/ۡۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->᩻()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/ۢۗᩳ;->۬:Ll/ۡۗᩳ;

    invoke-static {v1}, Ll/ۡۗᩳ;->֫(Ll/ۡۗᩳ;)Ll/᩸۬ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸۬ᩳ;->᩻()V

    throw v0

    :catchall_1
    move-exception v1

    .line 361
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final declared-synchronized ֫()Ll/ۖۗᩳ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 346
    :try_start_0
    iget-object v1, p0, Ll/ۢۗᩳ;->ۗ:Ll/ۖۗᩳ;

    if-eqz v1, :cond_0

    .line 347
    invoke-virtual {v1}, Ll/ۖۗᩳ;->᩺ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 346
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovered state is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 347
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()[B
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 325
    :try_start_0
    iget-object v1, p0, Ll/ۢۗᩳ;->ۗ:Ll/ۖۗᩳ;

    if-eqz v1, :cond_0

    .line 322
    iget-object v1, p0, Ll/ۢۗᩳ;->ۨ:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 325
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovered state is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 322
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩳ()Ll/ۨ᩹ᩳ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 325
    :try_start_0
    iget-object v1, p0, Ll/ۢۗᩳ;->ۗ:Ll/ۖۗᩳ;

    if-eqz v1, :cond_0

    .line 321
    iget-object v1, p0, Ll/ۢۗᩳ;->ܰ:Ll/ۨ᩹ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 325
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovered state is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 321
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
