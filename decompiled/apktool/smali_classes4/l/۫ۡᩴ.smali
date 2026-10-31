.class public final Ll/۫ۡᩴ;
.super Ljava/lang/Object;
.source "DC36"

# interfaces
.implements Ll/ۜۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/ۛۡᩴ;

.field public ۙ:I

.field public ۬:Ll/ܺۢᩴ;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۛۡᩴ;)V
    .locals 1

    .line 512
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۡᩴ;->ۗ:Ll/ۛۡᩴ;

    .line 517
    iget v0, p1, Ll/ۛۡᩴ;->۫:I

    iput v0, p0, Ll/۫ۡᩴ;->ۙ:I

    const/4 v0, -0x1

    .line 523
    iput v0, p0, Ll/۫ۡᩴ;->᩹:I

    .line 525
    iget v0, p1, Ll/ۛۡᩴ;->ۤ:I

    iput v0, p0, Ll/۫ۡᩴ;->᩸:I

    .line 527
    iget-boolean p1, p1, Ll/ۛۡᩴ;->᩸:Z

    iput-boolean p1, p0, Ll/۫ۡᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 512
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/۫ۡᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 3

    .line 609
    iget-object v0, p0, Ll/۫ۡᩴ;->ۗ:Ll/ۛۡᩴ;

    iget-object v1, v0, Ll/ۛۡᩴ;->᩶:[I

    .line 610
    iget-boolean v2, p0, Ll/۫ۡᩴ;->᩶:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 611
    iput-boolean v2, p0, Ll/۫ۡᩴ;->᩶:Z

    .line 612
    iget v0, v0, Ll/ۛۡᩴ;->۫:I

    iput v0, p0, Ll/۫ۡᩴ;->᩹:I

    .line 613
    aget v0, v1, v0

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 614
    iget v0, p0, Ll/۫ۡᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۫ۡᩴ;->᩸:I

    .line 616
    :cond_0
    :goto_0
    iget v0, p0, Ll/۫ۡᩴ;->᩸:I

    if-eqz v0, :cond_2

    .line 617
    iget v0, p0, Ll/۫ۡᩴ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۫ۡᩴ;->ۙ:I

    if-gez v0, :cond_1

    const/high16 v2, -0x80000000

    .line 619
    iput v2, p0, Ll/۫ۡᩴ;->᩹:I

    .line 620
    iget-object v2, p0, Ll/۫ۡᩴ;->۬:Ll/ܺۢᩴ;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 621
    iget v0, p0, Ll/۫ۡᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۫ۡᩴ;->᩸:I

    goto :goto_0

    .line 622
    :cond_1
    aget v2, v1, v0

    if-eqz v2, :cond_0

    .line 623
    iput v0, p0, Ll/۫ۡᩴ;->᩹:I

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 624
    iget v0, p0, Ll/۫ۡᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۫ۡᩴ;->᩸:I

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 536
    iget v0, p0, Ll/۫ۡᩴ;->᩸:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/۫ۡᩴ;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 28
    invoke-virtual {p0}, Ll/۫ۡᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextInt()I
    .locals 3

    .line 541
    invoke-virtual {p0}, Ll/۫ۡᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 542
    iget v0, p0, Ll/۫ۡᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۫ۡᩴ;->᩸:I

    .line 543
    iget-object v0, p0, Ll/۫ۡᩴ;->ۗ:Ll/ۛۡᩴ;

    iget-object v1, v0, Ll/ۛۡᩴ;->᩶:[I

    .line 544
    iget-boolean v2, p0, Ll/۫ۡᩴ;->᩶:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 545
    iput-boolean v2, p0, Ll/۫ۡᩴ;->᩶:Z

    .line 546
    iget v0, v0, Ll/ۛۡᩴ;->۫:I

    iput v0, p0, Ll/۫ۡᩴ;->᩹:I

    .line 547
    aget v0, v1, v0

    return v0

    .line 550
    :cond_0
    iget v0, p0, Ll/۫ۡᩴ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۫ۡᩴ;->ۙ:I

    if-gez v0, :cond_1

    const/high16 v1, -0x80000000

    .line 552
    iput v1, p0, Ll/۫ۡᩴ;->᩹:I

    .line 553
    iget-object v1, p0, Ll/۫ۡᩴ;->۬:Ll/ܺۢᩴ;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v0

    return v0

    .line 555
    :cond_1
    aget v2, v1, v0

    if-eqz v2, :cond_0

    iput v0, p0, Ll/۫ۡᩴ;->᩹:I

    return v2

    .line 541
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 9

    .line 591
    iget v0, p0, Ll/۫ۡᩴ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 592
    iget-object v2, p0, Ll/۫ۡᩴ;->ۗ:Ll/ۛۡᩴ;

    iget v3, v2, Ll/ۛۡᩴ;->۫:I

    const/4 v4, 0x0

    if-ne v0, v3, :cond_0

    .line 593
    iput-boolean v4, v2, Ll/ۛۡᩴ;->᩸:Z

    .line 594
    iget-object v0, v2, Ll/ۛۡᩴ;->᩶:[I

    aput v4, v0, v3

    goto :goto_2

    .line 595
    :cond_0
    iget v3, p0, Ll/۫ۡᩴ;->ۙ:I

    if-ltz v3, :cond_7

    .line 569
    iget-object v5, v2, Ll/ۛۡᩴ;->᩶:[I

    :goto_0
    add-int/lit8 v3, v0, 0x1

    .line 571
    iget v6, v2, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v3, v6

    .line 573
    :goto_1
    aget v6, v5, v3

    if-nez v6, :cond_1

    .line 574
    aput v4, v5, v0

    .line 602
    :goto_2
    iget v0, v2, Ll/ۛۡᩴ;->ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll/ۛۡᩴ;->ۤ:I

    .line 603
    iput v1, p0, Ll/۫ۡᩴ;->᩹:I

    return-void

    .line 577
    :cond_1
    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v7

    iget v8, v2, Ll/ۛۡᩴ;->ۙ:I

    and-int/2addr v7, v8

    if-gt v0, v3, :cond_2

    if-ge v0, v7, :cond_3

    if-le v7, v3, :cond_6

    goto :goto_3

    :cond_2
    if-lt v0, v7, :cond_6

    if-le v7, v3, :cond_6

    :cond_3
    :goto_3
    if-ge v3, v0, :cond_5

    .line 582
    iget-object v7, p0, Ll/۫ۡᩴ;->۬:Ll/ܺۢᩴ;

    if-nez v7, :cond_4

    new-instance v7, Ll/ܺۢᩴ;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Ll/ܺۢᩴ;-><init>(I)V

    iput-object v7, p0, Ll/۫ۡᩴ;->۬:Ll/ܺۢᩴ;

    .line 583
    :cond_4
    iget-object v7, p0, Ll/۫ۡᩴ;->۬:Ll/ܺۢᩴ;

    aget v8, v5, v3

    invoke-virtual {v7, v8}, Ll/ܺۢᩴ;->add(I)Z

    .line 585
    :cond_5
    aput v6, v5, v0

    move v0, v3

    goto :goto_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v8

    goto :goto_1

    .line 598
    :cond_7
    iget-object v0, p0, Ll/۫ۡᩴ;->۬:Ll/ܺۢᩴ;

    neg-int v3, v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ۛۡᩴ;->remove(I)Z

    .line 599
    iput v1, p0, Ll/۫ۡᩴ;->᩹:I

    return-void

    .line 591
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
