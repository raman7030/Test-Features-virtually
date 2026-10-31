.class public final Ll/᩺ۘۘ;
.super Ljava/lang/Thread;
.source "O8D0"


# instance fields
.field public volatile ᩸:Z

.field public final synthetic ᩹:Ll/۟ۘۘ;


# direct methods
.method public constructor <init>(Ll/۟ۘۘ;)V
    .locals 1

    .line 287
    iput-object p1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 284
    iput-boolean v0, p0, Ll/᩺ۘۘ;->᩸:Z

    .line 293
    invoke-static {p1}, Ll/۟ۘۘ;->֫(Ll/۟ۘۘ;)Ll/۬ۘۘ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۘۘ;->֫()Ll/۫ۘۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    const-string v0, "JSyn synthesis thread in finally code."

    .line 305
    sget-object v1, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    const-string v2, "JSyn synthesis thread starting."

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 325
    :try_start_0
    iget-object v1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    new-instance v2, Ll/ۤۘۘ;

    invoke-direct {v2}, Ll/ۤۘۘ;-><init>()V

    invoke-static {v1, v2}, Ll/۟ۘۘ;->֫(Ll/۟ۘۘ;Ll/ۤۘۘ;)V

    .line 326
    :cond_0
    :goto_0
    iget-boolean v1, p0, Ll/᩺ۘۘ;->᩸:Z

    if-eqz v1, :cond_1

    .line 334
    iget-object v1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    invoke-static {v1}, Ll/۟ۘۘ;->ۧ(Ll/۟ۘۘ;)Ll/ۤۘۘ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 335
    iget-object v1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    invoke-static {v1}, Ll/۟ۘۘ;->ܽ(Ll/۟ۘۘ;)V

    .line 336
    iget-object v1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    invoke-virtual {v1}, Ll/۟ۘۘ;->ۧ()V

    .line 337
    iget-object v1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    invoke-static {v1}, Ll/۟ۘۘ;->ۧ(Ll/۟ۘۘ;)Ll/ۤۘۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۤۘۘ;->֫()V

    .line 344
    iget-object v1, p0, Ll/᩺ۘۘ;->᩹:Ll/۟ۘۘ;

    invoke-virtual {v1}, Ll/۟ۘۘ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x2

    .line 345
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v1, 0x0

    .line 351
    :try_start_1
    iput-boolean v1, p0, Ll/᩺ۘۘ;->᩸:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 354
    :cond_1
    sget-object v1, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    .line 363
    sget-object v0, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    const-string v1, "JSyn synthesis thread exiting."

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    return-void

    :catchall_1
    move-exception v1

    .line 354
    sget-object v2, Ll/۟ۘۘ;->֨:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    .line 362
    throw v1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 299
    iput-boolean v0, p0, Ll/᩺ۘۘ;->᩸:Z

    .line 300
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
