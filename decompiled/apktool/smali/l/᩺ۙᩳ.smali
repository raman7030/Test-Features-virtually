.class public final Ll/᩺ۙᩳ;
.super Ljava/lang/Object;
.source "O6S3"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:J

.field public final ۙ:Ll/᩸۬ᩳ;

.field public ۬:J

.field public final ᩶:Ll/۟ۙᩳ;

.field public ᩸:Z

.field public ᩹:Ll/ܰۙᩳ;


# direct methods
.method public constructor <init>(Ll/۟ۙᩳ;Ll/᩸۬ᩳ;Ll/ܰۙᩳ;)V
    .locals 2

    .line 436
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 433
    iput-wide v0, p0, Ll/᩺ۙᩳ;->۬:J

    iput-wide v0, p0, Ll/᩺ۙᩳ;->ۗ:J

    .line 436
    iput-object p1, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    iput-object p2, p0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    iput-object p3, p0, Ll/᩺ۙᩳ;->᩹:Ll/ܰۙᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ۙᩳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩺ۙᩳ;->ۗ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ۙᩳ;Ll/ܰۙᩳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۙᩳ;->᩹:Ll/ܰۙᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ۙᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺ۙᩳ;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۙᩳ;)Ll/ܰۙᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۙᩳ;->᩹:Ll/ܰۙᩳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۙᩳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/᩺ۙᩳ;->۬:J

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩺ۙᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩺ۙᩳ;->ۗ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/᩺ۙᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩺ۙᩳ;->۬:J

    return-wide v0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 453
    iget-object v0, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    monitor-enter v0

    .line 454
    :try_start_0
    iget-boolean v1, p0, Ll/᩺ۙᩳ;->᩸:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 455
    iput-boolean v1, p0, Ll/᩺ۙᩳ;->᩸:Z

    .line 456
    iget-object v2, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v2}, Ll/۟ۙᩳ;->ᩳ(Ll/۟ۙᩳ;)V

    .line 457
    iget-object v2, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v2}, Ll/۟ۙᩳ;->ܽ(Ll/۟ۙᩳ;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v2}, Ll/۟ۙᩳ;->ۧ(Ll/۟ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v2}, Ll/۟ۙᩳ;->ۧ(Ll/۟ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v2

    iget-object v2, v2, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    iget-object v3, p0, Ll/᩺ۙᩳ;->᩹:Ll/ܰۙᩳ;

    iget-object v3, v3, Ll/ܰۙᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 458
    :cond_2
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    .line 459
    iget-object v0, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    iget-object v1, p0, Ll/᩺ۙᩳ;->᩹:Ll/ܰۙᩳ;

    iget-object v2, p0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    .line 263
    invoke-virtual {v2}, Ll/᩸۬ᩳ;->ۘ()Ll/ۗ᩻᩵;

    move-result-object v3

    new-instance v4, Ll/ܺܳۜ;

    invoke-direct {v4, v0, v1, v2}, Ll/ܺܳۜ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 460
    :cond_3
    iget-object v0, p0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    invoke-virtual {v0}, Ll/᩸۬ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    .line 458
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܽ֫()Ll/᩸۬ᩳ;
    .locals 3

    .line 440
    iget-object v0, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    monitor-enter v0

    .line 441
    :try_start_0
    iget-boolean v1, p0, Ll/᩺ۙᩳ;->᩸:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v1}, Ll/۟ۙᩳ;->֫(Ll/۟ۙᩳ;)Ll/᩺ۙᩳ;

    move-result-object v1

    if-ne v1, p0, :cond_0

    iget-object v1, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v1}, Ll/۟ۙᩳ;->ܽ(Ll/۟ۙᩳ;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v1}, Ll/۟ۙᩳ;->ۧ(Ll/۟ۙᩳ;)Ll/ܰۙᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/᩺ۙᩳ;->᩹:Ll/ܰۙᩳ;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 444
    iput-boolean v1, p0, Ll/᩺ۙᩳ;->᩸:Z

    .line 445
    iget-object v1, p0, Ll/᩺ۙᩳ;->᩶:Ll/۟ۙᩳ;

    invoke-static {v1}, Ll/۟ۙᩳ;->ᩳ(Ll/۟ۙᩳ;)V

    .line 446
    iget-object v1, p0, Ll/᩺ۙᩳ;->ۙ:Ll/᩸۬ᩳ;

    monitor-exit v0

    return-object v1

    .line 442
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Recovery candidate has not been durably published"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 447
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
