.class public final Ll/ۢܽ᩵;
.super Ll/ܰۧ᩵;
.source "N673"

# interfaces
.implements Ljava/util/function/IntConsumer;
.implements Ll/ᩴ۫ᩴ;


# instance fields
.field public b:I

.field public c:Ll/᩵ܳ᩵;


# virtual methods
.method public final accept(I)V
    .locals 2

    .line 445
    iget v0, p0, Ll/ܰۧ᩵;->a:I

    if-nez v0, :cond_0

    .line 446
    iput p1, p0, Ll/ۢܽ᩵;->b:I

    add-int/lit8 v0, v0, 0x1

    .line 447
    iput v0, p0, Ll/ܰۧ᩵;->a:I

    return-void

    :cond_0
    if-lez v0, :cond_2

    .line 450
    iget-object v0, p0, Ll/ۢܽ᩵;->c:Ll/᩵ܳ᩵;

    if-nez v0, :cond_1

    .line 451
    new-instance v0, Ll/᩵ܳ᩵;

    .line 752
    invoke-direct {v0}, Ll/ۖܰᩴ;-><init>()V

    .line 451
    iput-object v0, p0, Ll/ۢܽ᩵;->c:Ll/᩵ܳ᩵;

    .line 452
    iget v1, p0, Ll/ۢܽ᩵;->b:I

    invoke-virtual {v0, v1}, Ll/᩵ܳ᩵;->accept(I)V

    .line 453
    iget v0, p0, Ll/ܰۧ᩵;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܰۧ᩵;->a:I

    .line 456
    :cond_1
    iget-object v0, p0, Ll/ۢܽ᩵;->c:Ll/᩵ܳ᩵;

    invoke-virtual {v0, p1}, Ll/᩵ܳ᩵;->accept(I)V

    return-void

    .line 459
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 415
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ۢܽ᩵;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->a(Ll/ᩴ۫ᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 2

    .line 497
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    iget v0, p0, Ll/ܰۧ᩵;->a:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 500
    iget v0, p0, Ll/ۢܽ᩵;->b:I

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    const/4 p1, -0x1

    .line 501
    iput p1, p0, Ll/ܰۧ᩵;->a:I

    :cond_0
    return-void
.end method

.method public final bridge synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 0

    .line 415
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ۢܽ᩵;->tryAdvance(Ljava/util/function/IntConsumer;)Z

    move-result p1

    return p1
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ۘ۫ᩴ;->b(Ll/ᩴ۫ᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public final tryAdvance(Ljava/util/function/IntConsumer;)Z
    .locals 2

    .line 483
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    iget v0, p0, Ll/ܰۧ᩵;->a:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 486
    iget v0, p0, Ll/ۢܽ᩵;->b:I

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    const/4 p1, -0x1

    .line 487
    iput p1, p0, Ll/ܰۧ᩵;->a:I

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic trySplit()Ll/֨۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic trySplit()Ll/ᩴ۫ᩴ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
