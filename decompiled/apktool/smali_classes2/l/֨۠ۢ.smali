.class public final Ll/֨۠ۢ;
.super Ljava/lang/Object;
.source "CAJ3"


# instance fields
.field public final ֫:Landroid/os/Bundle;

.field public ۧ:Z

.field public final ܽ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 273
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    .line 277
    iput-object p1, p0, Ll/֨۠ۢ;->ܽ:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 5

    .line 445
    iget-boolean v0, p0, Ll/֨۠ۢ;->ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 125
    :cond_0
    sget-object v0, Ll/ۘ۠ۢ;->ۢ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    .line 127
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    .line 128
    new-instance v2, Landroid/content/Intent;

    const-class v3, Ll/ۡܶۢ;

    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "TaskClass"

    .line 129
    iget-object v4, p0, Ll/֨۠ۢ;->ܽ:Ljava/lang/Class;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v3, "TaskId"

    .line 130
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v3, "TaskArgument"

    .line 131
    iget-object v4, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 132
    invoke-static {v1, v2}, Ll/֨ۙ;->֫(Landroid/content/Context;Landroid/content/Intent;)V

    return v0
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 1

    .line 406
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public final ֫(JLjava/lang/String;)V
    .locals 1

    .line 412
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    invoke-virtual {v0, p3, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    return-void
.end method

.method public final ֫(Lbin/mt/plus/Main;Ll/ۨۧᩳ;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "ARG_SIGNATURE_OPTIONS"

    .line 319
    invoke-virtual {p2}, Ll/ۨۧᩳ;->֫()[B

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 546
    :try_start_1
    invoke-virtual {p1, v0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    const/4 p1, 0x1

    .line 322
    iput-boolean p1, p0, Ll/֨۠ۢ;->ۧ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 324
    :goto_0
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۬ܿᩳ;->֡()V

    return-void

    :goto_1
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/۬ܿᩳ;->֡()V

    .line 325
    throw p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/io/Serializable;)V
    .locals 1

    .line 440
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 283
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 1

    .line 418
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)V
    .locals 4

    .line 424
    array-length v0, p2

    const v1, 0xc800

    iget-object v2, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    if-le v0, v1, :cond_0

    .line 425
    sget-object v0, Ll/ܽ֡ܿ;->ۢ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 787
    :try_start_0
    array-length v1, p2

    const/4 v3, 0x0

    invoke-virtual {v0, p2, v3, v1}, Ll/ܶ᩵ܿ;->֫([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 431
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    .line 429
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 433
    :cond_0
    invoke-virtual {v2, p1, p2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 4

    .line 394
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 395
    array-length v1, p2

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 396
    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p2, v2

    .line 397
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 399
    :cond_0
    invoke-virtual {v0}, Ll/ۤۜܽ;->ۖ()[B

    move-result-object p2

    .line 400
    invoke-virtual {p0, p1, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 2

    .line 288
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/֫ۧ֨;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/֫ۧ֨;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩵۠ۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const-string v0, "ARG_PATHS"

    .line 289
    invoke-virtual {p0, v0, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۖۢܳ;)V
    .locals 3

    .line 376
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    const-string v1, "ARG_CURRENT_WINDOW_LEFT"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 377
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢܳ;->᩺()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 379
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ARG_ANOTHER_WINDOW_DIGEST"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܽۢܳ;)V
    .locals 3

    .line 368
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    const-string v1, "ARG_CURRENT_WINDOW_LEFT"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 369
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩺()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    const-string v1, "ARG_CURRENT_WINDOW_DIGEST"

    .line 371
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ܽ᩷ܳ;)V
    .locals 1

    .line 335
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object p1

    const-string v0, "ARG_STATELESS_VISITOR"

    .line 340
    invoke-virtual {p1}, Ll/ܰܺܳ;->֫()[B

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    return-void
.end method

.method public final ۧ()I
    .locals 6

    .line 455
    iget-boolean v0, p0, Ll/֨۠ۢ;->ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 458
    :cond_0
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    iget-object v1, p0, Ll/֨۠ۢ;->ܽ:Ljava/lang/Class;

    .line 140
    sget-object v2, Ll/ۘ۠ۢ;->ۢ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v2

    .line 143
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ۠ۢ;

    .line 144
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const-string v4, "TaskId"

    .line 145
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v4, "TaskArgument"

    .line 146
    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 147
    invoke-virtual {v1, v3}, Ll/ۘ۠ۢ;->֫(Landroid/content/Intent;)V

    .line 160
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v3, Ll/۠۠ۢ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v4, v1, v5}, Ll/۠۠ۢ;-><init>(Ll/ۡܶۢ;Ll/ۘ۠ۢ;I)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception v0

    .line 151
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ۧ(Ljava/util/List;)V
    .locals 2

    .line 303
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ᩴۚܳ;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ᩴۚܳ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۚ۠ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۚ۠ۢ;-><init>(I)V

    .line 309
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const-string v0, "ARG_PATHS"

    .line 310
    invoke-virtual {p0, v0, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ll/ۖۢܳ;)V
    .locals 3

    .line 384
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    const-string v1, "ARG_CURRENT_WINDOW_LEFT"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 385
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢܳ;->᩺()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 387
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ARG_CURRENT_WINDOW_DIGEST"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ARG_ANOTHER_WINDOW_DIGEST"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ljava/util/List;)V
    .locals 2

    .line 294
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۧۨ᩷;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/ۧۨ᩷;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/֡۠ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/֡۠ۢ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const-string v0, "ARG_PATHS"

    .line 295
    invoke-virtual {p0, v0, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    .line 360
    iget-object v0, p0, Ll/֨۠ۢ;->֫:Landroid/os/Bundle;

    const-string v1, "ARG_CURRENT_WINDOW_LEFT"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 361
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢܳ;->᩺()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 363
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ARG_CURRENT_WINDOW_DIGEST"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
