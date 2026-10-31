.class public final synthetic Ll/ۜ֨ۜ;
.super Ljava/lang/Object;
.source "O741"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۡ֨ۜ;

.field public final synthetic ᩹:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ֨ۜ;Landroid/net/Uri;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ֨ۜ;->᩸:Ll/ۡ֨ۜ;

    iput-object p2, p0, Ll/ۜ֨ۜ;->᩹:Landroid/net/Uri;

    iput-wide p3, p0, Ll/ۜ֨ۜ;->᩶:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget-object v1, p0, Ll/ۜ֨ۜ;->᩸:Ll/ۡ֨ۜ;

    .line 4
    iget-object v2, p0, Ll/ۜ֨ۜ;->᩹:Landroid/net/Uri;

    .line 6
    iget-wide v3, p0, Ll/ۜ֨ۜ;->᩶:J

    move-object v0, v1

    .line 330
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 332
    :try_start_1
    invoke-static {v1}, Ll/ۡ֨ۜ;->֫(Ll/ۡ֨ۜ;)Z

    move-result v5

    .line 333
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    if-nez v5, :cond_0

    .line 335
    :try_start_2
    invoke-static {v1}, Ll/ۡ֨ۜ;->ᩳ(Ll/ۡ֨ۜ;)Ll/᩸۠֫;

    move-result-object v0

    new-instance v5, Ll/ۙ۠֫;

    invoke-direct {v5}, Ll/ۙ۠֫;-><init>()V

    .line 336
    invoke-virtual {v5, v2}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    .line 337
    invoke-virtual {v5, v3, v4}, Ll/ۙ۠֫;->ۧ(J)V

    const-wide/16 v2, 0x1

    .line 338
    invoke-virtual {v5, v2, v3}, Ll/ۙ۠֫;->֫(J)V

    .line 339
    invoke-virtual {v5}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v2

    .line 335
    invoke-interface {v0, v2}, Ll/᩸۠֫;->֫(Ll/ۗ۠֫;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 345
    :cond_0
    :try_start_3
    invoke-static {v1}, Ll/ۡ֨ۜ;->ᩳ(Ll/ۡ֨ۜ;)Ll/᩸۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    move-object v2, v0

    move-object v0, v1

    .line 353
    monitor-enter v0

    .line 354
    :try_start_4
    invoke-static {v1, v2}, Ll/ۡ֨ۜ;->֫(Ll/ۡ֨ۜ;Ljava/lang/Throwable;)V

    .line 355
    invoke-static {v1}, Ll/ۡ֨ۜ;->ܳ(Ll/ۡ֨ۜ;)V

    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 357
    monitor-exit v0

    goto :goto_2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1

    :catchall_2
    move-exception v2

    .line 333
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    .line 345
    :try_start_7
    invoke-static {v1}, Ll/ۡ֨ۜ;->ᩳ(Ll/ۡ֨ۜ;)Ll/᩸۠֫;

    move-result-object v0

    invoke-interface {v0}, Ll/᩸۠֫;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_1

    :catchall_4
    move-exception v0

    .line 350
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    move-object v0, v1

    .line 353
    monitor-enter v0

    .line 354
    :try_start_8
    invoke-static {v1, v2}, Ll/ۡ֨ۜ;->֫(Ll/ۡ֨ۜ;Ljava/lang/Throwable;)V

    .line 355
    invoke-static {v1}, Ll/ۡ֨ۜ;->ܳ(Ll/ۡ֨ۜ;)V

    .line 356
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 357
    monitor-exit v0

    :goto_2
    return-void

    :catchall_5
    move-exception v1

    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw v1
.end method
