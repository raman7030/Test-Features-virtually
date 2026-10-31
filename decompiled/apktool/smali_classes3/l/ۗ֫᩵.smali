.class public final Ll/ۗ֫᩵;
.super Ll/ܿܰᩴ;
.source "N673"


# instance fields
.field public final j:Ll/۫ܰᩴ;

.field public final k:Z


# direct methods
.method public constructor <init>(Ll/ۗ֫᩵;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 295
    invoke-direct {p0, p1, p2}, Ll/ܿܰᩴ;-><init>(Ll/ܿܰᩴ;Ll/ܶ۫ᩴ;)V

    .line 296
    iget-boolean p2, p1, Ll/ۗ֫᩵;->k:Z

    iput-boolean p2, p0, Ll/ۗ֫᩵;->k:Z

    .line 297
    iget-object p1, p1, Ll/ۗ֫᩵;->j:Ll/۫ܰᩴ;

    iput-object p1, p0, Ll/ۗ֫᩵;->j:Ll/۫ܰᩴ;

    return-void
.end method

.method public constructor <init>(Ll/۫ܰᩴ;ZLl/۫᩺ᩴ;Ll/ܶ۫ᩴ;)V
    .locals 0

    .line 289
    invoke-direct {p0, p3, p4}, Ll/ܿܰᩴ;-><init>(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    .line 290
    iput-boolean p2, p0, Ll/ۗ֫᩵;->k:Z

    .line 291
    iput-object p1, p0, Ll/ۗ֫᩵;->j:Ll/۫ܰᩴ;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 319
    iget-object v0, p0, Ll/۬ܰᩴ;->a:Ll/ۡ᩺ᩴ;

    iget-object v1, p0, Ll/ۗ֫᩵;->j:Ll/۫ܰᩴ;

    iget-object v1, v1, Ll/۫ܰᩴ;->d:Ljava/util/function/Supplier;

    invoke-interface {v1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ᩳ᩵;

    iget-object v2, p0, Ll/۬ܰᩴ;->b:Ll/ܶ۫ᩴ;

    invoke-virtual {v0, v2, v1}, Ll/ۡ᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    invoke-interface {v1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    .line 320
    iget-boolean v1, p0, Ll/ۗ֫᩵;->k:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    if-eqz v0, :cond_7

    .line 152
    iget-object v1, p0, Ll/ܿܰᩴ;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_0
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_7

    move-object v1, p0

    :goto_0
    if-eqz v1, :cond_4

    .line 286
    invoke-virtual {v1}, Ljava/util/concurrent/CountedCompleter;->getCompleter()Ljava/util/concurrent/CountedCompleter;

    move-result-object v3

    check-cast v3, Ll/۬ܰᩴ;

    if-eqz v3, :cond_3

    .line 358
    iget-object v4, v3, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    if-eq v4, v1, :cond_3

    .line 314
    invoke-virtual {p0}, Ll/ܿܰᩴ;->g()V

    return-object v0

    :cond_3
    move-object v1, v3

    goto :goto_0

    .line 152
    :cond_4
    iget-object v1, p0, Ll/ܿܰᩴ;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_5
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    :goto_1
    return-object v0

    :cond_7
    :goto_2
    return-object v2
.end method

.method public final c(Ll/ܶ۫ᩴ;)Ll/۬ܰᩴ;
    .locals 1

    .line 302
    new-instance v0, Ll/ۗ֫᩵;

    invoke-direct {v0, p0, p1}, Ll/ۗ֫᩵;-><init>(Ll/ۗ֫᩵;Ll/ܶ۫ᩴ;)V

    return-object v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    .line 307
    iget-object v0, p0, Ll/ۗ֫᩵;->j:Ll/۫ܰᩴ;

    iget-object v0, v0, Ll/۫ܰᩴ;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 6

    .line 337
    iget-boolean v0, p0, Ll/ۗ֫᩵;->k:Z

    if-eqz v0, :cond_5

    .line 338
    iget-object v0, p0, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    check-cast v0, Ll/ۗ֫᩵;

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    if-eq v0, v2, :cond_5

    .line 340
    invoke-virtual {v0}, Ll/ܿܰᩴ;->i()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 341
    iget-object v3, p0, Ll/ۗ֫᩵;->j:Ll/۫ܰᩴ;

    iget-object v3, v3, Ll/۫ܰᩴ;->c:Ljava/util/function/Predicate;

    invoke-interface {v3, v2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 342
    invoke-virtual {p0, v2}, Ll/ܿܰᩴ;->d(Ljava/lang/Object;)V

    move-object v0, p0

    :goto_1
    if-eqz v0, :cond_1

    .line 286
    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->getCompleter()Ljava/util/concurrent/CountedCompleter;

    move-result-object v3

    check-cast v3, Ll/۬ܰᩴ;

    if-eqz v3, :cond_0

    .line 358
    iget-object v4, v3, Ll/۬ܰᩴ;->d:Ll/۬ܰᩴ;

    if-eq v4, v0, :cond_0

    .line 314
    invoke-virtual {p0}, Ll/ܿܰᩴ;->g()V

    goto :goto_2

    :cond_0
    move-object v0, v3

    goto :goto_1

    .line 152
    :cond_1
    iget-object v3, p0, Ll/ܿܰᩴ;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    :cond_2
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_2

    .line 339
    :cond_4
    iget-object v2, p0, Ll/۬ܰᩴ;->e:Ll/۬ܰᩴ;

    check-cast v2, Ll/ۗ֫᩵;

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_0

    .line 348
    :cond_5
    :goto_2
    invoke-super {p0, p1}, Ll/۬ܰᩴ;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
