.class public final Ll/ۡܰᩴ;
.super Ll/᩻ܽ᩵;
.source "N673"


# instance fields
.field public b:Z

.field public final c:Ll/ܿۨᩴ;

.field public final synthetic d:Ll/᩸ܿ᩵;


# direct methods
.method public constructor <init>(Ll/᩸ܿ᩵;Ll/֡ᩳ᩵;)V
    .locals 1

    .line 394
    iput-object p1, p0, Ll/ۡܰᩴ;->d:Ll/᩸ܿ᩵;

    invoke-direct {p0, p2}, Ll/᩻ܽ᩵;-><init>(Ll/֡ᩳ᩵;)V

    .line 399
    iget-object p1, p0, Ll/᩻ܽ᩵;->a:Ll/֡ᩳ᩵;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Ll/ܿۨᩴ;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Ll/ܿۨᩴ;-><init>(Ljava/util/function/Consumer;I)V

    iput-object p2, p0, Ll/ۡܰᩴ;->c:Ll/ܿۨᩴ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 408
    iget-object v0, p0, Ll/ۡܰᩴ;->d:Ll/᩸ܿ᩵;

    iget-object v0, v0, Ll/᩸ܿ᩵;->t:Ljava/lang/Object;

    check-cast v0, Ll/ܿ֨ᩴ;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴۧ᩵;

    if-eqz p1, :cond_2

    .line 410
    :try_start_0
    iget-boolean v0, p0, Ll/ۡܰᩴ;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ll/ۡܰᩴ;->c:Ll/ܿۨᩴ;

    if-nez v0, :cond_0

    .line 411
    :try_start_1
    invoke-interface {p1}, Ll/ᩴۧ᩵;->sequential()Ll/ᩴۧ᩵;

    move-result-object v0

    invoke-interface {v0, v1}, Ll/ᩴۧ᩵;->forEach(Ljava/util/function/LongConsumer;)V

    goto :goto_1

    .line 414
    :cond_0
    invoke-interface {p1}, Ll/ᩴۧ᩵;->sequential()Ll/ᩴۧ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩴۧ᩵;->spliterator()Ll/֡۫ᩴ;

    move-result-object v0

    .line 415
    :cond_1
    iget-object v2, p0, Ll/᩻ܽ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v2}, Ll/֡ᩳ᩵;->f()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v0, v1}, Ll/֡۫ᩴ;->tryAdvance(Ljava/util/function/LongConsumer;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_1

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 408
    :try_start_2
    invoke-interface {p1}, Ll/۫ۨᩴ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 418
    invoke-interface {p1}, Ll/۫ۨᩴ;->close()V

    :cond_3
    return-void
.end method

.method public final c(J)V
    .locals 2

    .line 403
    iget-object p1, p0, Ll/᩻ܽ᩵;->a:Ll/֡ᩳ᩵;

    const-wide/16 v0, -0x1

    invoke-interface {p1, v0, v1}, Ll/֡ᩳ᩵;->c(J)V

    return-void
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x1

    .line 423
    iput-boolean v0, p0, Ll/ۡܰᩴ;->b:Z

    .line 424
    iget-object v0, p0, Ll/᩻ܽ᩵;->a:Ll/֡ᩳ᩵;

    invoke-interface {v0}, Ll/֡ᩳ᩵;->f()Z

    move-result v0

    return v0
.end method
