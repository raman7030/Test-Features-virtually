.class public final Ll/ܺۚᩴ;
.super Ljava/lang/Object;
.source "0C59"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/ۘۚᩴ;

.field public ۙ:I

.field public ۬:Ll/᩵֡ᩴ;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۘۚᩴ;)V
    .locals 1

    .line 536
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۚᩴ;->ۗ:Ll/ۘۚᩴ;

    .line 541
    iget v0, p1, Ll/ۘۚᩴ;->۫:I

    iput v0, p0, Ll/ܺۚᩴ;->ۙ:I

    const/4 v0, -0x1

    .line 547
    iput v0, p0, Ll/ܺۚᩴ;->᩹:I

    .line 549
    iget v0, p1, Ll/ۘۚᩴ;->ۤ:I

    iput v0, p0, Ll/ܺۚᩴ;->᩸:I

    .line 551
    iget-boolean p1, p1, Ll/ۘۚᩴ;->᩸:Z

    iput-boolean p1, p0, Ll/ܺۚᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 3

    .line 633
    iget-object v0, p0, Ll/ܺۚᩴ;->ۗ:Ll/ۘۚᩴ;

    iget-object v1, v0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 634
    iget-boolean v2, p0, Ll/ܺۚᩴ;->᩶:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 635
    iput-boolean v2, p0, Ll/ܺۚᩴ;->᩶:Z

    .line 636
    iget v0, v0, Ll/ۘۚᩴ;->۫:I

    iput v0, p0, Ll/ܺۚᩴ;->᩹:I

    .line 637
    aget-object v0, v1, v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 638
    iget v0, p0, Ll/ܺۚᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺۚᩴ;->᩸:I

    .line 640
    :cond_0
    :goto_0
    iget v0, p0, Ll/ܺۚᩴ;->᩸:I

    if-eqz v0, :cond_2

    .line 641
    iget v0, p0, Ll/ܺۚᩴ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺۚᩴ;->ۙ:I

    if-gez v0, :cond_1

    const/high16 v2, -0x80000000

    .line 643
    iput v2, p0, Ll/ܺۚᩴ;->᩹:I

    .line 644
    iget-object v2, p0, Ll/ܺۚᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 645
    iget v0, p0, Ll/ܺۚᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺۚᩴ;->᩸:I

    goto :goto_0

    .line 646
    :cond_1
    aget-object v2, v1, v0

    if-eqz v2, :cond_0

    .line 647
    iput v0, p0, Ll/ܺۚᩴ;->᩹:I

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 648
    iget v0, p0, Ll/ܺۚᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺۚᩴ;->᩸:I

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 560
    iget v0, p0, Ll/ܺۚᩴ;->᩸:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 565
    invoke-virtual {p0}, Ll/ܺۚᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 566
    iget v0, p0, Ll/ܺۚᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺۚᩴ;->᩸:I

    .line 567
    iget-object v0, p0, Ll/ܺۚᩴ;->ۗ:Ll/ۘۚᩴ;

    iget-object v1, v0, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    .line 568
    iget-boolean v2, p0, Ll/ܺۚᩴ;->᩶:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 569
    iput-boolean v2, p0, Ll/ܺۚᩴ;->᩶:Z

    .line 570
    iget v0, v0, Ll/ۘۚᩴ;->۫:I

    iput v0, p0, Ll/ܺۚᩴ;->᩹:I

    .line 571
    aget-object v0, v1, v0

    return-object v0

    .line 574
    :cond_0
    iget v0, p0, Ll/ܺۚᩴ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺۚᩴ;->ۙ:I

    if-gez v0, :cond_1

    const/high16 v1, -0x80000000

    .line 576
    iput v1, p0, Ll/ܺۚᩴ;->᩹:I

    .line 577
    iget-object v1, p0, Ll/ܺۚᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ll/᩵֡ᩴ;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 579
    :cond_1
    aget-object v2, v1, v0

    if-eqz v2, :cond_0

    iput v0, p0, Ll/ܺۚᩴ;->᩹:I

    return-object v2

    .line 565
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 9

    .line 615
    iget v0, p0, Ll/ܺۚᩴ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 616
    iget-object v2, p0, Ll/ܺۚᩴ;->ۗ:Ll/ۘۚᩴ;

    iget v3, v2, Ll/ۘۚᩴ;->۫:I

    const/4 v4, 0x0

    if-ne v0, v3, :cond_0

    const/4 v0, 0x0

    .line 617
    iput-boolean v0, v2, Ll/ۘۚᩴ;->᩸:Z

    .line 618
    iget-object v0, v2, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    aput-object v4, v0, v3

    goto :goto_2

    .line 619
    :cond_0
    iget v3, p0, Ll/ܺۚᩴ;->ۙ:I

    if-ltz v3, :cond_7

    .line 593
    iget-object v5, v2, Ll/ۘۚᩴ;->᩶:[Ljava/lang/Object;

    :goto_0
    add-int/lit8 v3, v0, 0x1

    .line 595
    iget v6, v2, Ll/ۘۚᩴ;->ۙ:I

    and-int/2addr v3, v6

    .line 597
    :goto_1
    aget-object v6, v5, v3

    if-nez v6, :cond_1

    .line 598
    aput-object v4, v5, v0

    .line 626
    :goto_2
    iget v0, v2, Ll/ۘۚᩴ;->ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll/ۘۚᩴ;->ۤ:I

    .line 627
    iput v1, p0, Ll/ܺۚᩴ;->᩹:I

    return-void

    .line 601
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v7

    invoke-static {v7}, Ll/ܰۛۡ;->֫(I)I

    move-result v7

    iget v8, v2, Ll/ۘۚᩴ;->ۙ:I

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

    .line 606
    iget-object v7, p0, Ll/ܺۚᩴ;->۬:Ll/᩵֡ᩴ;

    if-nez v7, :cond_4

    new-instance v7, Ll/᩵֡ᩴ;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Ll/᩵֡ᩴ;-><init>(I)V

    iput-object v7, p0, Ll/ܺۚᩴ;->۬:Ll/᩵֡ᩴ;

    .line 607
    :cond_4
    iget-object v7, p0, Ll/ܺۚᩴ;->۬:Ll/᩵֡ᩴ;

    aget-object v8, v5, v3

    invoke-virtual {v7, v8}, Ll/᩵֡ᩴ;->add(Ljava/lang/Object;)Z

    .line 609
    :cond_5
    aput-object v6, v5, v0

    move v0, v3

    goto :goto_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v8

    goto :goto_1

    .line 622
    :cond_7
    iget-object v0, p0, Ll/ܺۚᩴ;->۬:Ll/᩵֡ᩴ;

    neg-int v3, v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3, v4}, Ll/᩵֡ᩴ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۘۚᩴ;->remove(Ljava/lang/Object;)Z

    .line 623
    iput v1, p0, Ll/ܺۚᩴ;->᩹:I

    return-void

    .line 615
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
