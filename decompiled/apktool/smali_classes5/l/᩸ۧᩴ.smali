.class public final Ll/᩸ۧᩴ;
.super Ljava/lang/Object;
.source "0C1E"

# interfaces
.implements Ll/ܺۧᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۗ:Ll/᩶ۧᩴ;

.field public ۙ:I

.field public ۬:Ll/᩹֫ᩴ;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩶ۧᩴ;)V
    .locals 1

    .line 478
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۧᩴ;->ۗ:Ll/᩶ۧᩴ;

    .line 483
    iget v0, p1, Ll/᩶ۧᩴ;->۫:I

    iput v0, p0, Ll/᩸ۧᩴ;->ۙ:I

    const/4 v0, -0x1

    .line 489
    iput v0, p0, Ll/᩸ۧᩴ;->᩹:I

    .line 491
    iget v0, p1, Ll/᩶ۧᩴ;->ۤ:I

    iput v0, p0, Ll/᩸ۧᩴ;->᩸:I

    .line 493
    iget-boolean p1, p1, Ll/᩶ۧᩴ;->᩸:Z

    iput-boolean p1, p0, Ll/᩸ۧᩴ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 478
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/᩸ۧᩴ;->ۧ(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۧᩴ;->֫(Ll/ܺۧᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 502
    iget v0, p0, Ll/᩸ۧᩴ;->᩸:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/᩸ۧᩴ;->֡ۧ()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 9

    .line 557
    iget v0, p0, Ll/᩸ۧᩴ;->᩹:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 558
    iget-object v2, p0, Ll/᩸ۧᩴ;->ۗ:Ll/᩶ۧᩴ;

    iget v3, v2, Ll/᩶ۧᩴ;->۫:I

    const/4 v4, 0x0

    if-ne v0, v3, :cond_0

    .line 559
    iput-boolean v4, v2, Ll/᩶ۧᩴ;->᩸:Z

    .line 560
    iget-object v0, v2, Ll/᩶ۧᩴ;->᩶:[C

    aput-char v4, v0, v3

    goto :goto_2

    .line 561
    :cond_0
    iget v3, p0, Ll/᩸ۧᩴ;->ۙ:I

    if-ltz v3, :cond_7

    .line 535
    iget-object v5, v2, Ll/᩶ۧᩴ;->᩶:[C

    :goto_0
    add-int/lit8 v3, v0, 0x1

    .line 537
    iget v6, v2, Ll/᩶ۧᩴ;->ۙ:I

    and-int/2addr v3, v6

    .line 539
    :goto_1
    aget-char v6, v5, v3

    if-nez v6, :cond_1

    .line 540
    aput-char v4, v5, v0

    .line 568
    :goto_2
    iget v0, v2, Ll/᩶ۧᩴ;->ۤ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, v2, Ll/᩶ۧᩴ;->ۤ:I

    .line 569
    iput v1, p0, Ll/᩸ۧᩴ;->᩹:I

    return-void

    .line 543
    :cond_1
    invoke-static {v6}, Ll/ܰۛۡ;->֫(I)I

    move-result v7

    iget v8, v2, Ll/᩶ۧᩴ;->ۙ:I

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

    .line 548
    iget-object v7, p0, Ll/᩸ۧᩴ;->۬:Ll/᩹֫ᩴ;

    if-nez v7, :cond_4

    new-instance v7, Ll/᩹֫ᩴ;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Ll/᩹֫ᩴ;-><init>(I)V

    iput-object v7, p0, Ll/᩸ۧᩴ;->۬:Ll/᩹֫ᩴ;

    .line 549
    :cond_4
    iget-object v7, p0, Ll/᩸ۧᩴ;->۬:Ll/᩹֫ᩴ;

    aget-char v8, v5, v3

    invoke-virtual {v7, v8}, Ll/᩹֫ᩴ;->ۧ(C)Z

    .line 551
    :cond_5
    aput-char v6, v5, v0

    move v0, v3

    goto :goto_0

    :cond_6
    add-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v8

    goto :goto_1

    .line 564
    :cond_7
    iget-object v0, p0, Ll/᩸ۧᩴ;->۬:Ll/᩹֫ᩴ;

    neg-int v3, v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ll/᩹֫ᩴ;->getChar(I)C

    move-result v0

    invoke-virtual {v2, v0}, Ll/᩶ۧᩴ;->֫(C)Z

    .line 565
    iput v1, p0, Ll/᩸ۧᩴ;->᩹:I

    return-void

    .line 557
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ֡ۧ()C
    .locals 3

    .line 507
    invoke-virtual {p0}, Ll/᩸ۧᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 508
    iget v0, p0, Ll/᩸ۧᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩸ۧᩴ;->᩸:I

    .line 509
    iget-object v0, p0, Ll/᩸ۧᩴ;->ۗ:Ll/᩶ۧᩴ;

    iget-object v1, v0, Ll/᩶ۧᩴ;->᩶:[C

    .line 510
    iget-boolean v2, p0, Ll/᩸ۧᩴ;->᩶:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 511
    iput-boolean v2, p0, Ll/᩸ۧᩴ;->᩶:Z

    .line 512
    iget v0, v0, Ll/᩶ۧᩴ;->۫:I

    iput v0, p0, Ll/᩸ۧᩴ;->᩹:I

    .line 513
    aget-char v0, v1, v0

    return v0

    .line 516
    :cond_0
    iget v0, p0, Ll/᩸ۧᩴ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩸ۧᩴ;->ۙ:I

    if-gez v0, :cond_1

    const/high16 v1, -0x80000000

    .line 518
    iput v1, p0, Ll/᩸ۧᩴ;->᩹:I

    .line 519
    iget-object v1, p0, Ll/᩸ۧᩴ;->۬:Ll/᩹֫ᩴ;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Ll/᩹֫ᩴ;->getChar(I)C

    move-result v0

    return v0

    .line 521
    :cond_1
    aget-char v2, v1, v0

    if-eqz v2, :cond_0

    iput v0, p0, Ll/᩸ۧᩴ;->᩹:I

    return v2

    .line 507
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۧ(Ll/᩻ۧᩴ;)V
    .locals 3

    .line 575
    iget-object v0, p0, Ll/᩸ۧᩴ;->ۗ:Ll/᩶ۧᩴ;

    iget-object v1, v0, Ll/᩶ۧᩴ;->᩶:[C

    .line 576
    iget-boolean v2, p0, Ll/᩸ۧᩴ;->᩶:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 577
    iput-boolean v2, p0, Ll/᩸ۧᩴ;->᩶:Z

    .line 578
    iget v0, v0, Ll/᩶ۧᩴ;->۫:I

    iput v0, p0, Ll/᩸ۧᩴ;->᩹:I

    .line 579
    aget-char v0, v1, v0

    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    .line 580
    iget v0, p0, Ll/᩸ۧᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩸ۧᩴ;->᩸:I

    .line 582
    :cond_0
    :goto_0
    iget v0, p0, Ll/᩸ۧᩴ;->᩸:I

    if-eqz v0, :cond_2

    .line 583
    iget v0, p0, Ll/᩸ۧᩴ;->ۙ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩸ۧᩴ;->ۙ:I

    if-gez v0, :cond_1

    const/high16 v2, -0x80000000

    .line 585
    iput v2, p0, Ll/᩸ۧᩴ;->᩹:I

    .line 586
    iget-object v2, p0, Ll/᩸ۧᩴ;->۬:Ll/᩹֫ᩴ;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ll/᩹֫ᩴ;->getChar(I)C

    move-result v0

    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    .line 587
    iget v0, p0, Ll/᩸ۧᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩸ۧᩴ;->᩸:I

    goto :goto_0

    .line 588
    :cond_1
    aget-char v2, v1, v0

    if-eqz v2, :cond_0

    .line 589
    iput v0, p0, Ll/᩸ۧᩴ;->᩹:I

    invoke-interface {p1, v2}, Ll/᩻ۧᩴ;->ܽ(C)V

    .line 590
    iget v0, p0, Ll/᩸ۧᩴ;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩸ۧᩴ;->᩸:I

    goto :goto_0

    :cond_2
    return-void
.end method
