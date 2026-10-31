.class public final Ll/᩺ۢᩴ;
.super Ljava/lang/Object;
.source "K9S0"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/۟ۢᩴ;


# direct methods
.method public constructor <init>(Ll/۟ۢᩴ;I)V
    .locals 0

    .line 475
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    .line 476
    iget p1, p1, Ll/۟ۢᩴ;->᩹:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/᩺ۢᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final add(I)V
    .locals 0

    .line 520
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 475
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/᩺ۢᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 4

    .line 512
    iget-object v0, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget-object v1, v0, Ll/۟ۢᩴ;->᩸:[I

    .line 513
    :goto_0
    iget v2, p0, Ll/᩺ۢᩴ;->᩸:I

    iget v3, v0, Ll/۟ۢᩴ;->ۙ:I

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 514
    iput v3, p0, Ll/᩺ۢᩴ;->᩸:I

    aget v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 480
    iget v0, p0, Ll/᩺ۢᩴ;->᩸:I

    iget-object v1, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget v1, v1, Ll/۟ۢᩴ;->ۙ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 485
    iget v0, p0, Ll/᩺ۢᩴ;->᩸:I

    iget-object v1, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget v1, v1, Ll/۟ۢᩴ;->᩹:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/᩺ۢᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 2

    .line 502
    iget v0, p0, Ll/᩺ۢᩴ;->᩸:I

    iget-object v1, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget v1, v1, Ll/۟ۢᩴ;->᩹:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final nextInt()I
    .locals 3

    .line 490
    invoke-virtual {p0}, Ll/᩺ۢᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 491
    iget-object v0, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget-object v0, v0, Ll/۟ۢᩴ;->᩸:[I

    iget v1, p0, Ll/᩺ۢᩴ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩺ۢᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 490
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/᩺ۢᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 2

    .line 507
    iget v0, p0, Ll/᩺ۢᩴ;->᩸:I

    iget-object v1, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget v1, v1, Ll/۟ۢᩴ;->᩹:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 530
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 525
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 2

    .line 496
    invoke-virtual {p0}, Ll/᩺ۢᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    iget-object v0, p0, Ll/᩺ۢᩴ;->᩹:Ll/۟ۢᩴ;

    iget-object v0, v0, Ll/۟ۢᩴ;->᩸:[I

    iget v1, p0, Ll/᩺ۢᩴ;->᩸:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/᩺ۢᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 496
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
