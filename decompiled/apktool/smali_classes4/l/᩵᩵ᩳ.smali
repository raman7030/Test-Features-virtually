.class public final Ll/᩵᩵ᩳ;
.super Ljava/lang/Object;
.source "16SF"


# instance fields
.field public final ֡:Ll/۟᩺ᩳ;

.field public ֨:Ll/ۗ᩻᩵;

.field public ֫:Z

.field public ۖ:Ll/ۗ᩻᩵;

.field public ۗ:Ll/ۗ᩻᩵;

.field public final ۘ:Ll/֫᩵ᩳ;

.field public ۙ:Z

.field public ۚ:Ll/ۨ᩵ᩳ;

.field public ۜ:Ll/᩹ᩴᩳ;

.field public ۠:Ll/֫֡ᩳ;

.field public final ۡ:Ll/᩹ܶᩳ;

.field public ۢ:Ljava/lang/Throwable;

.field public ۧ:Z

.field public ۫:I

.field public ۬:Z

.field public final ܳ:Ll/ۗ᩻᩵;

.field public ܶ:Ll/᩸ۨᩳ;

.field public final ܺ:Ll/ܶ᩺ᩳ;

.field public volatile ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩴ:Landroid/os/Handler;

.field public final ᩵:Ll/ᩴ᩵ᩳ;

.field public final ᩶:Ll/۫ۨᩳ;

.field public ᩷:Ljava/util/concurrent/Executor;

.field public final ᩸:I

.field public ᩹:Z

.field public volatile ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ᩴ᩵ᩳ;I)V
    .locals 2

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    .line 34
    new-instance v0, Ll/ۗ᩻᩵;

    invoke-direct {v0}, Ll/ۗ᩻᩵;-><init>()V

    iput-object v0, p0, Ll/᩵᩵ᩳ;->ܳ:Ll/ۗ᩻᩵;

    .line 36
    new-instance v0, Ll/֫᩵ᩳ;

    invoke-direct {v0}, Ll/֫᩵ᩳ;-><init>()V

    iput-object v0, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    const-string v0, "waiting_directory"

    .line 46
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Ll/᩵᩵ᩳ;->֫:Z

    .line 58
    iput-object p1, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    iget-object v0, p1, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object p1, p1, Ll/᩹ܶᩳ;->ܰ:Ll/ܶ᩺ᩳ;

    iput-object p1, p0, Ll/᩵᩵ᩳ;->ܺ:Ll/ܶ᩺ᩳ;

    .line 59
    iput-object p2, p0, Ll/᩵᩵ᩳ;->᩵:Ll/ᩴ᩵ᩳ;

    iput p3, p0, Ll/᩵᩵ᩳ;->᩸:I

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩵ᩳ;->֡:Ll/۟᩺ᩳ;

    return-void
.end method

.method public static ֫(Ll/᩵᩵ᩳ;)V
    .locals 7

    const/4 v1, 0x0

    .line 222
    iput-boolean v1, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    .line 223
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_16

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    move-object v0, p0

    .line 224
    monitor-enter v0

    .line 225
    :try_start_0
    iget v2, p0, Ll/᩵᩵ᩳ;->۫:I

    const/4 v3, 0x2

    const-wide/16 v4, 0xa

    const/4 v6, 0x1

    if-eq v2, v3, :cond_2

    .line 226
    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-eqz v1, :cond_1

    .line 227
    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    invoke-virtual {v1}, Ll/֫᩵ᩳ;->cancel()V

    .line 228
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    .line 229
    iget-object v1, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    new-instance v2, Ll/ܿ᩵ᩳ;

    invoke-direct {v2, p0}, Ll/ܿ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 231
    :cond_1
    monitor-exit v0

    return-void

    .line 233
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 234
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_3

    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    .line 235
    :cond_3
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-eqz v0, :cond_5

    .line 236
    :cond_4
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    invoke-virtual {v0}, Ll/֫᩵ᩳ;->cancel()V

    .line 237
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    invoke-virtual {v0}, Ll/֫᩵ᩳ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_5

    .line 238
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    .line 239
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    new-instance v1, Ll/ܿ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ܿ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 243
    :cond_5
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۤ֫()Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 245
    :cond_6
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/᩵᩵ᩳ;->֨:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_8

    .line 246
    invoke-virtual {v0}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "waiting_persistence"

    .line 247
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    .line 248
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    .line 249
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    new-instance v1, Ll/ܿ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ܿ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 252
    :cond_7
    :try_start_1
    iget-object v0, p0, Ll/᩵᩵ᩳ;->֨:Ll/ۗ᩻᩵;

    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 253
    iput-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 255
    :cond_8
    :goto_0
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-eqz v0, :cond_a

    :cond_9
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܶ()V

    .line 256
    :cond_a
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_b

    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ۧ:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->֫:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v3, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    iget-object v2, v2, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v2, v2, Ll/ۛᩴᩳ;->ۤ:Ll/ۗܰᩳ;

    .line 257
    invoke-virtual {v0, v3, v2}, Ll/۫ۨᩳ;->֫(Ll/ۙ֫ܿ;Ll/ۗܰᩳ;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    goto :goto_1

    :cond_b
    const/4 v0, 0x0

    .line 258
    :goto_1
    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۗۧ()Z

    move-result v2

    if-eqz v2, :cond_c

    if-nez v0, :cond_c

    const-string v0, "waiting_layout"

    .line 259
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    .line 260
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    .line 261
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    new-instance v1, Ll/ܿ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ܿ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_4

    .line 264
    :cond_c
    iget-boolean v2, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v2, :cond_10

    iget-object v2, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-eqz v2, :cond_d

    goto :goto_2

    .line 265
    :cond_d
    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ۧ:Z

    if-eqz v1, :cond_e

    goto/16 :goto_4

    .line 266
    :cond_e
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ۧ:Z

    const-string v1, "restoring_view_state"

    .line 267
    iput-object v1, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    .line 269
    :try_start_2
    iget-object v1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->֫֫()V

    .line 270
    iget-object v1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧ֫()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 273
    :try_start_3
    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    iget-object v2, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget v3, p0, Ll/᩵᩵ᩳ;->᩸:I

    iget-object v4, p0, Ll/᩵᩵ᩳ;->ܶ:Ll/᩸ۨᩳ;

    invoke-virtual {v1, v2, v3, v4}, Ll/᩹ܶᩳ;->֫(Ll/ۨ᩵ᩳ;ILl/᩸ۨᩳ;)Ll/ۗ᩻᩵;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 275
    :try_start_4
    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ܰ()V

    if-eqz v0, :cond_f

    .line 279
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v2, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v0, v2}, Ll/۫ۨᩳ;->ܽ(Ll/۟᩺ᩳ;)Ll/ۗ᩻᩵;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩵ᩳ;->ۗ:Ll/ۗ᩻᩵;

    .line 280
    new-instance v2, Ll/᩷᩵ᩳ;

    invoke-direct {v2, p0}, Ll/᩷᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v0, v2}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    .line 292
    :cond_f
    iput-object v1, p0, Ll/᩵᩵ᩳ;->ۖ:Ll/ۗ᩻᩵;

    .line 293
    new-instance v0, Ll/ۢ᩵ᩳ;

    invoke-direct {v0, p0}, Ll/ۢ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    .line 275
    iget-object v1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܰ()V

    .line 276
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    .line 309
    iget-object v1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ܰ()V

    .line 310
    iput-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    goto :goto_4

    :cond_10
    :goto_2
    const-string v0, "releasing_failed_session"

    .line 315
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    .line 316
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    .line 317
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۗ:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_11

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 318
    :cond_11
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-nez v0, :cond_12

    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v2, "Fragment session loading was canceled"

    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 320
    :cond_12
    :try_start_5
    iget-object v2, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    if-eqz v2, :cond_13

    iget-object v3, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v2, v2, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v3, v2}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 321
    :cond_13
    iget-boolean v2, p0, Ll/᩵᩵ᩳ;->ۙ:Z

    if-eqz v2, :cond_14

    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    iget-object v3, p0, Ll/᩵᩵ᩳ;->֡:Ll/۟᩺ᩳ;

    if-ne v2, v3, :cond_14

    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v2, v3}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;)V

    .line 322
    :cond_14
    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v2, v1}, Ll/۫ۨᩳ;->ۢ(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 332
    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    if-nez v1, :cond_15

    const/4 v1, 0x0

    invoke-static {v1}, Ll/ۗ᩻᩵;->ᩳ(Ljava/lang/Object;)Ll/ۗ᩻᩵;

    move-result-object v1

    goto :goto_3

    :cond_15
    invoke-virtual {v1}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v1

    .line 333
    :goto_3
    new-instance v2, Ll/ܽ᩵ᩳ;

    invoke-direct {v2, p0, v0}, Ll/ܽ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    goto :goto_4

    :catchall_3
    move-exception v2

    .line 324
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 326
    iput-boolean v6, p0, Ll/᩵᩵ᩳ;->᩹:Z

    .line 327
    iget-object v2, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    iget-object v3, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    invoke-virtual {v2, p0, v3, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩵᩵ᩳ;Ll/ۨ᩵ᩳ;Z)V

    .line 328
    iget-object v1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/᩵᩵ᩳ;->ܶ:Ll/᩸ۨᩳ;

    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->֫(Ll/᩸ۨᩳ;)V

    .line 329
    iget-object p0, p0, Ll/᩵᩵ᩳ;->ܳ:Ll/ۗ᩻᩵;

    invoke-virtual {p0, v0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_4
    move-exception p0

    .line 233
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    throw p0

    :cond_16
    :goto_4
    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;)V
    .locals 2

    .line 295
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_7

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    .line 296
    iput-object p1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 297
    :cond_1
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܳ()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v1, v1, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    if-eq p1, v1, :cond_3

    :cond_2
    iput-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    .line 298
    :cond_3
    iget-boolean p1, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez p1, :cond_6

    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-eqz p1, :cond_4

    goto :goto_0

    .line 300
    :cond_4
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    invoke-virtual {p1}, Ll/֫᩵ᩳ;->ۧ()V

    .line 301
    iput-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    .line 302
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۗ:Ll/ۗ᩻᩵;

    if-eqz p1, :cond_5

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 303
    :cond_5
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    invoke-virtual {p1, p0, v1, v0}, Ll/᩹ܶᩳ;->֫(Ll/᩵᩵ᩳ;Ll/ۨ᩵ᩳ;Z)V

    .line 304
    iget-object p1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v0, p0, Ll/᩵᩵ᩳ;->ܶ:Ll/᩸ۨᩳ;

    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->֫(Ll/᩸ۨᩳ;)V

    .line 305
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ܳ:Ll/ۗ᩻᩵;

    iget-object p0, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    invoke-virtual {p1, p0}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;)V

    return-void

    .line 298
    :cond_6
    :goto_0
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    :cond_7
    :goto_1
    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 3

    .line 334
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 337
    :cond_0
    :try_start_0
    iget-boolean p1, p0, Ll/᩵᩵ᩳ;->ۙ:Z

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p1

    iget-object v1, p0, Ll/᩵᩵ᩳ;->֡:Ll/۟᩺ᩳ;

    if-ne p1, v1, :cond_1

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 338
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 339
    iput-boolean p1, p0, Ll/᩵᩵ᩳ;->᩹:Z

    .line 340
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۜ:Ll/᩹ᩴᩳ;

    if-eqz p1, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ll/᩹ᩴᩳ;->֫(Ljava/lang/Throwable;)V

    .line 341
    :cond_2
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    const/4 v2, 0x0

    invoke-virtual {p1, p0, v1, v2}, Ll/᩹ܶᩳ;->֫(Ll/᩵᩵ᩳ;Ll/ۨ᩵ᩳ;Z)V

    .line 342
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ܶ:Ll/᩸ۨᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->֫(Ll/᩸ۨᩳ;)V

    .line 343
    iget-object p0, p0, Ll/᩵᩵ᩳ;->ܳ:Ll/ۗ᩻᩵;

    invoke-virtual {p0, p2}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 109
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 110
    invoke-virtual {p0, p2}, Ll/᩵᩵ᩳ;->֫(Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    move-object v0, p0

    .line 112
    monitor-enter v0

    const/4 p2, 0x2

    :try_start_0
    iput p2, p0, Ll/᩵᩵ᩳ;->۫:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    iput-object p1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 114
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    return-void

    :catchall_0
    move-exception p0

    .line 112
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Z)V
    .locals 1

    .line 185
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-nez v0, :cond_1

    iput-object p1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    :cond_1
    if-eqz p2, :cond_2

    .line 187
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez p1, :cond_2

    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܿ()V

    return-void

    .line 188
    :cond_2
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static ֫(Ll/᩵᩵ᩳ;Z)V
    .locals 3

    move-object v0, p0

    .line 160
    monitor-enter v0

    .line 161
    :try_start_0
    iget v1, p0, Ll/᩵᩵ᩳ;->۫:I

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 162
    iput v1, p0, Ll/᩵᩵ᩳ;->۫:I

    .line 163
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p1, :cond_1

    const-string v0, "opening_session"

    goto :goto_0

    :cond_1
    const-string v0, "preparing_layout"

    .line 165
    :goto_0
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    .line 167
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_6

    .line 168
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_5

    if-eqz p1, :cond_2

    .line 170
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩵:Ll/ᩴ᩵ᩳ;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    invoke-interface {v0, v1}, Ll/ᩴ᩵ᩳ;->֫(Ll/ܿۖ᩷;)Ll/ۨ᩵ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    .line 171
    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۜ:Ll/᩹ᩴᩳ;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ll/ۨ᩵ᩳ;->֫(Ll/᩹ᩴᩳ;)V

    goto :goto_1

    .line 173
    :cond_2
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v1, v1, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    new-instance v2, Ll/ۡ᩵ᩳ;

    invoke-direct {v2, p0}, Ll/ۡ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    invoke-virtual {v0, v1, v2}, Ll/۫ۨᩳ;->֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ljava/lang/CharSequence;

    .line 175
    :cond_3
    :goto_1
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Fragment session loading was canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_5
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Fragment session loading was canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 167
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Session preparation requires a background executor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 177
    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-eqz v1, :cond_7

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-nez v1, :cond_7

    .line 178
    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Fragment session loading was canceled"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 179
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_7
    :goto_2
    move-object v1, v0

    :goto_3
    move-object v0, p0

    .line 183
    monitor-enter v0

    const/4 v2, 0x2

    :try_start_2
    iput v2, p0, Ll/᩵᩵ᩳ;->۫:I

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 184
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    new-instance v2, Ll/ܺ᩵ᩳ;

    invoke-direct {v2, p0, v1, p1}, Ll/ܺ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Z)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_1
    move-exception p0

    .line 183
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0

    :catchall_2
    move-exception p0

    .line 163
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p0
.end method

.method private ֫(Z)V
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, "queued_open"

    goto :goto_0

    :cond_0
    const-string v0, "queued_layout"

    .line 146
    :goto_0
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    move-object v0, p0

    .line 147
    monitor-enter v0

    .line 148
    :try_start_0
    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    const/4 v2, 0x2

    if-eqz v1, :cond_1

    iput v2, p0, Ll/᩵᩵ᩳ;->۫:I

    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 149
    iput v1, p0, Ll/᩵᩵ᩳ;->۫:I

    .line 150
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 151
    :try_start_1
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩷:Ljava/util/concurrent/Executor;

    new-instance v1, Ll/ܳ᩵ᩳ;

    invoke-direct {v1, p0, p1}, Ll/ܳ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    move-object v0, p0

    .line 153
    monitor-enter v0

    :try_start_2
    iput v2, p0, Ll/᩵᩵ᩳ;->۫:I

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    iput-object p1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 155
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    return-void

    :catchall_0
    move-exception p1

    .line 153
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 150
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public static ۜ(Ll/᩵᩵ᩳ;)Ljava/lang/String;
    .locals 3

    move-object v0, p0

    .line 92
    monitor-enter v0

    :try_start_0
    iget v1, p0, Ll/᩵᩵ᩳ;->۫:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "stage="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nworkerState="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\napplyingState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ۧ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ncleaning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ncanceled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\ndirectoryReady="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۜ:Ll/᩹ᩴᩳ;

    if-eqz v1, :cond_1

    .line 95
    invoke-virtual {v1}, Ll/᩹ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\npersistence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->֨:Ll/ۗ᩻᩵;

    if-nez v1, :cond_2

    const-string v1, "absent"

    goto :goto_2

    .line 101
    :cond_2
    invoke-virtual {v1}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v1, "pending"

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ll/ۗ᩻᩵;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "failed"

    goto :goto_2

    :cond_4
    const-string v1, "done"

    .line 96
    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nrestoration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۖ:Ll/ۗ᩻᩵;

    if-nez v1, :cond_5

    const-string v1, "absent"

    goto :goto_3

    .line 101
    :cond_5
    invoke-virtual {v1}, Ll/ۗ᩻᩵;->isDone()Z

    move-result v2

    if-nez v2, :cond_6

    const-string v1, "pending"

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Ll/ۗ᩻᩵;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "failed"

    goto :goto_3

    :cond_7
    const-string v1, "done"

    .line 96
    :goto_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nfailure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 97
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۗ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 92
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic ۧ(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;)V
    .locals 1

    .line 281
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_3

    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    .line 284
    :cond_1
    iget-object p1, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v0, v0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->ۧ(Ll/ۙ֫ܿ;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    .line 285
    iput-boolean p1, p0, Ll/᩵᩵ᩳ;->۬:Z

    .line 286
    iget-object p1, p0, Ll/᩵᩵ᩳ;->۠:Ll/֫֡ᩳ;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/֫֡ᩳ;->ۧ()V

    .line 287
    :cond_2
    iget-object p1, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    invoke-virtual {p1, p0}, Ll/᩹ܶᩳ;->֫(Ll/᩵᩵ᩳ;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic ۧ(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 333
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    new-instance v1, Ll/ᩳ᩵ᩳ;

    invoke-direct {v1, p0, p2, p1}, Ll/ᩳ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 108
    new-instance v0, Ll/ۖ᩵ᩳ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۖ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;Ljava/lang/Throwable;Ljava/util/concurrent/Executor;)V

    .line 117
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-virtual {v0}, Ll/ۖ᩵ᩳ;->run()V

    return-void

    .line 118
    :cond_0
    iget-object p0, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۧ(Ll/᩵᩵ᩳ;)Z
    .locals 0

    .line 173
    iget-boolean p0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    return p0
.end method

.method private ܳ()Z
    .locals 3

    .line 212
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    iget-boolean v1, v0, Ll/᩹ܶᩳ;->۬֫:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Ll/᩹ܶᩳ;->ܰ:Ll/ܶ᩺ᩳ;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ܺ:Ll/ܶ᩺ᩳ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ܳ(Ll/᩵᩵ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵᩵ᩳ;->۬:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/᩵᩵ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    return p0
.end method

.method private ܿ()V
    .locals 5

    const-string v0, "configuring_view"

    .line 130
    iput-object v0, p0, Ll/᩵᩵ᩳ;->᩻:Ljava/lang/String;

    .line 131
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 132
    :cond_0
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    if-nez v0, :cond_2

    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 134
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩵ᩳ;->ܽ()Ll/ۗ᩻᩵;

    move-result-object v0

    iput-object v0, p0, Ll/᩵᩵ᩳ;->֨:Ll/ۗ᩻᩵;

    .line 135
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v1, v1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v0, v0, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v0}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ۛᩴᩳ;->֫(Ll/᩻۬ᩳ;)V

    .line 136
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ܺ:Ll/ܶ᩺ᩳ;

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ۚ:Ll/ۨ᩵ᩳ;

    iget-object v2, v1, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object v2, v2, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object v3, v2, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    iget-object v2, v2, Ll/ۛᩴᩳ;->۬:Ll/ۙܰᩳ;

    iget-object v1, v1, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    iget-object v4, p0, Ll/᩵᩵ᩳ;->ܶ:Ll/᩸ۨᩳ;

    invoke-virtual {v0, v3, v2, v1, v4}, Ll/ܶ᩺ᩳ;->֫(Ll/ۗ֫ܿ;Ll/ۙܰᩳ;Ll/ۙ֫ܿ;Ll/᩸ۨᩳ;)V

    const/4 v0, 0x0

    .line 137
    invoke-direct {p0, v0}, Ll/᩵᩵ᩳ;->֫(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v0, p0

    .line 139
    monitor-enter v0

    const/4 v2, 0x2

    :try_start_1
    iput v2, p0, Ll/᩵᩵ᩳ;->۫:I

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    iput-object v1, p0, Ll/᩵᩵ᩳ;->ۢ:Ljava/lang/Throwable;

    .line 141
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    return-void

    :catchall_1
    move-exception v1

    .line 139
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 132
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/᩵᩵ᩳ;->֫()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/᩵᩵ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩵᩵ᩳ;)Ll/᩹ܶᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩵᩵ᩳ;->ۡ:Ll/᩹ܶᩳ;

    return-object p0
.end method

.method private ᩻()V
    .locals 2

    .line 216
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 217
    iput-boolean v0, p0, Ll/᩵᩵ᩳ;->ᩳ:Z

    .line 218
    new-instance v0, Ll/ܿ᩵ᩳ;

    invoke-direct {v0, p0}, Ll/ܿ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ᩴ:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩵᩵ᩳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܳ()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 194
    iget-object v0, p0, Ll/᩵᩵ᩳ;->۠:Ll/֫֡ᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/֫֡ᩳ;->ۧ()V

    .line 195
    :cond_0
    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->᩹:Z

    if-nez v0, :cond_5

    iget-boolean v0, p0, Ll/᩵᩵ᩳ;->ܿ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 196
    iput-boolean v0, p0, Ll/᩵᩵ᩳ;->ܽ:Z

    .line 197
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۘ:Ll/֫᩵ᩳ;

    invoke-virtual {v0}, Ll/֫᩵ᩳ;->cancel()V

    move-object v0, p0

    .line 198
    monitor-enter v0

    :try_start_0
    iget v1, p0, Ll/᩵᩵ᩳ;->۫:I

    if-nez v1, :cond_2

    const/4 v1, 0x2

    iput v1, p0, Ll/᩵᩵ᩳ;->۫:I

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩶:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܶ()V

    .line 200
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۖ:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 201
    :cond_3
    iget-object v0, p0, Ll/᩵᩵ᩳ;->ۗ:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->cancel(Z)Z

    .line 202
    :cond_4
    invoke-direct {p0}, Ll/᩵᩵ᩳ;->᩻()V

    return-void

    :catchall_0
    move-exception v1

    .line 198
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_5
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/᩷۠ᩴ;)V
    .locals 3

    .line 70
    new-instance v0, Ll/֫֡ᩳ;

    new-instance v1, Ll/ۘ᩵ᩳ;

    invoke-direct {v1, p0}, Ll/ۘ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;)V

    new-instance v2, Ll/᩻᩵ᩳ;

    invoke-direct {v2, p2, p1}, Ll/᩻᩵ᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Ll/֫֡ᩳ;-><init>(Ll/ۘ᩵ᩳ;Ll/᩻᩵ᩳ;)V

    iput-object v0, p0, Ll/᩵᩵ᩳ;->۠:Ll/֫֡ᩳ;

    .line 87
    invoke-virtual {v0}, Ll/֫֡ᩳ;->֫()V

    return-void
.end method

.method public final ֫(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 123
    iput-object p1, p0, Ll/᩵᩵ᩳ;->᩷:Ljava/util/concurrent/Executor;

    .line 124
    iget-object p1, p0, Ll/᩵᩵ᩳ;->᩵:Ll/ᩴ᩵ᩳ;

    if-nez p1, :cond_0

    invoke-direct {p0}, Ll/᩵᩵ᩳ;->ܿ()V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 125
    invoke-direct {p0, p1}, Ll/᩵᩵ᩳ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/᩹ᩴᩳ;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 106
    iput-object p1, p0, Ll/᩵᩵ᩳ;->ۜ:Ll/᩹ᩴᩳ;

    .line 107
    invoke-virtual {p1}, Ll/᩹ᩴᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p1

    new-instance v0, Ll/ۧ᩵ᩳ;

    invoke-direct {v0, p0, p2}, Ll/ۧ᩵ᩳ;-><init>(Ll/᩵᩵ᩳ;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v0}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x1

    .line 207
    iput-boolean v0, p0, Ll/᩵᩵ᩳ;->ۙ:Z

    .line 208
    invoke-virtual {p0}, Ll/᩵᩵ᩳ;->֫()V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩵᩵ᩳ;->᩵:Ll/ᩴ᩵ᩳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Ll/ۗ᩻᩵;
    .locals 2

    .line 66
    new-instance v0, Ll/ۜ᩵ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/᩵᩵ᩳ;->ܳ:Ll/ۗ᩻᩵;

    invoke-virtual {v1, v0}, Ll/ۗ᩻᩵;->ۧ(Ll/᩸ۜ᩵;)Ll/ۗ᩻᩵;

    move-result-object v0

    return-object v0
.end method
