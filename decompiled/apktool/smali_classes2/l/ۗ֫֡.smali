.class public final Ll/ۗ֫֡;
.super Ljava/lang/Object;
.source "A4E9"

# interfaces
.implements Ll/ۚᩳ֡;


# instance fields
.field public final ᩶:Ll/۟ܽ֡;

.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۨ֫֡;


# direct methods
.method public constructor <init>(Ll/ۨ֫֡;)V
    .locals 1

    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ֫֡;->᩹:Ll/ۨ֫֡;

    .line 318
    new-instance v0, Ll/۟ܽ֡;

    iget-object p1, p1, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۚᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۟ܽ֡;-><init>(Ll/ܶᩳ֡;)V

    iput-object v0, p0, Ll/ۗ֫֡;->᩶:Ll/۟ܽ֡;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 344
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ֫֡;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 345
    :try_start_1
    iput-boolean v1, p0, Ll/ۗ֫֡;->᩸:Z

    .line 346
    iget-object v1, p0, Ll/ۗ֫֡;->᩹:Ll/ۨ֫֡;

    iget-object v1, v1, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    const-string v2, "0\r\n\r\n"

    invoke-interface {v1, v2}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 347
    iget-object v1, p0, Ll/ۗ֫֡;->᩶:Ll/۟ܽ֡;

    .line 268
    invoke-virtual {v1}, Ll/۟ܽ֡;->᩻()Ll/ܶᩳ֡;

    move-result-object v2

    .line 269
    invoke-virtual {v1}, Ll/۟ܽ֡;->ۜ()V

    .line 270
    invoke-virtual {v2}, Ll/ܶᩳ֡;->֫()Ll/ܶᩳ֡;

    .line 271
    invoke-virtual {v2}, Ll/ܶᩳ֡;->ۧ()Ll/ܶᩳ֡;

    .line 348
    iget-object v1, p0, Ll/ۗ֫֡;->᩹:Ll/ۨ֫֡;

    const/4 v2, 0x3

    iput v2, v1, Ll/ۨ֫֡;->ܿ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 349
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

.method public final declared-synchronized flush()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 339
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ֫֡;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 340
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۗ֫֡;->᩹:Ll/ۨ֫֡;

    iget-object v1, v1, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    invoke-interface {v1}, Ll/ۤܽ֡;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 341
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

.method public final ֫(Ll/۫ܽ֡;J)V
    .locals 4

    .line 329
    iget-object v0, p0, Ll/ۗ֫֡;->᩹:Ll/ۨ֫֡;

    iget-object v0, v0, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    iget-boolean v1, p0, Ll/ۗ֫֡;->᩸:Z

    if-nez v1, :cond_1

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-nez v3, :cond_0

    return-void

    .line 332
    :cond_0
    invoke-interface {v0, p2, p3}, Ll/ۤܽ֡;->ۡ(J)Ll/ۤܽ֡;

    const-string v1, "\r\n"

    .line 333
    invoke-interface {v0, v1}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    .line 334
    invoke-interface {v0, p1, p2, p3}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V

    .line 335
    invoke-interface {v0, v1}, Ll/ۤܽ֡;->ܽ(Ljava/lang/String;)Ll/ۤܽ֡;

    return-void

    .line 329
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 325
    iget-object v0, p0, Ll/ۗ֫֡;->᩶:Ll/۟ܽ֡;

    return-object v0
.end method
