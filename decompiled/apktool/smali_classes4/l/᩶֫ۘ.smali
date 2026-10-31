.class public final Ll/᩶֫ۘ;
.super Ljava/lang/Object;
.source "79J1"


# instance fields
.field public ֫:Ll/ۙ֫ۘ;

.field public ۧ:Ll/᩹᩺ۖ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 323
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 324
    new-instance v0, Ll/ۙ֫ۘ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۙ֫ۘ;-><init>(I)V

    iput-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    .line 325
    invoke-static {v0}, Ll/ۙ֫ۘ;->ᩳ(Ll/ۙ֫ۘ;)Ljava/util/Random;

    move-result-object v0

    .line 38
    new-instance v1, Ll/᩹᩺ۖ;

    invoke-direct {v1, v0}, Ll/᩹᩺ۖ;-><init>(Ljava/util/Random;)V

    .line 325
    iput-object v1, p0, Ll/᩶֫ۘ;->ۧ:Ll/᩹᩺ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۙ֫ۘ;
    .locals 2

    .line 502
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 510
    invoke-static {v0}, Ll/ۙ֫ۘ;->ܿ(Ll/ۙ֫ۘ;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-static {v1}, Ll/᩹ۛۖ;->֫(Ljava/util/Set;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 511
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Signing cannot be disabled when using SMB3.x dialects"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 518
    :cond_1
    :goto_0
    invoke-static {v0}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-static {v1}, Ll/᩹ۛۖ;->֫(Ljava/util/Set;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 519
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "If encryption is advertised, at least one dialect should be SMB3.x compatible"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 522
    :cond_3
    :goto_1
    iget-object v1, p0, Ll/᩶֫ۘ;->ۧ:Ll/᩹᩺ۖ;

    invoke-virtual {v1}, Ll/᩹᩺ۖ;->֫()Ll/᩶᩺ۖ;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;Ll/᩶᩺ۖ;)V

    .line 524
    new-instance v1, Ll/ۙ֫ۘ;

    invoke-direct {v1, v0}, Ll/ۙ֫ۘ;-><init>(Ll/ۙ֫ۘ;)V

    return-object v1

    .line 503
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "At least one SMB dialect should be specified"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 3

    .line 394
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0}, Ll/ۙ֫ۘ;->ۧ(Ll/ۙ֫ۘ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 395
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܰۖ;

    if-eqz v1, :cond_0

    .line 399
    invoke-static {v0}, Ll/ۙ֫ۘ;->ۧ(Ll/ۙ֫ۘ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 397
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Authenticator may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/util/UUID;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 380
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;Ljava/util/UUID;)V

    return-void

    .line 378
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Client GUID may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/util/concurrent/TimeUnit;)V
    .locals 4

    const-wide/16 v0, 0x0

    .line 492
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    .line 497
    iget-object p1, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    long-to-int v1, v0

    invoke-static {p1, v1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;I)V

    return-void

    .line 494
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Socket timeout should be less than 2147483647ms"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫۫;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 476
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;Ll/֫۫;)V

    return-void

    .line 474
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Transport layer factory may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۖ֫ۘ;)V
    .locals 1

    .line 345
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;Ll/ۖ֫ۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩷۟ۖ;)V
    .locals 1

    .line 353
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;Ll/᩷۟ۖ;)V

    return-void
.end method

.method public final ֫(Ll/᩸֫ۘ;)V
    .locals 0

    .line 541
    iget-object p1, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 549
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;Z)V

    return-void
.end method

.method public final varargs ֫([Ll/᩹ۛۖ;)V
    .locals 3

    .line 358
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 366
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 367
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ۛۖ;

    if-eqz v1, :cond_0

    .line 371
    invoke-static {v0}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;)Ljava/util/EnumSet;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 369
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dialect may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void

    .line 363
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dialects may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()V
    .locals 1

    .line 426
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0}, Ll/ۙ֫ۘ;->᩻(Ll/ۙ֫ۘ;)V

    .line 439
    invoke-static {v0}, Ll/ۙ֫ۘ;->᩷(Ll/ۙ֫ۘ;)V

    .line 452
    invoke-static {v0}, Ll/ۙ֫ۘ;->ۜ(Ll/ۙ֫ۘ;)V

    return-void
.end method

.method public final ۧ(Ljava/util/concurrent/TimeUnit;)V
    .locals 5

    const-wide/16 v0, 0x3c

    .line 431
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    iget-object v4, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v4, v2, v3}, Ll/ۙ֫ۘ;->֫(Ll/ۙ֫ۘ;J)V

    .line 444
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v4, v2, v3}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;J)V

    .line 457
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-static {v4, v0, v1}, Ll/ۙ֫ۘ;->ۧ(Ll/ۙ֫ۘ;J)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 533
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->ܽ(Ll/ۙ֫ۘ;Z)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 405
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 528
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 410
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0, p1}, Ll/ۙ֫ۘ;->ۧ(Ll/ۙ֫ۘ;Z)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 418
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-static {v0}, Ll/ۙ֫ۘ;->ܳ(Ll/ۙ֫ۘ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 557
    iget-object v0, p0, Ll/᩶֫ۘ;->֫:Ll/ۙ֫ۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
