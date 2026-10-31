.class public final Ll/ۖ֡ᩴ;
.super Ll/ۛ֡ᩴ;
.source "C1NC"

# interfaces
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/ᩴ֡ᩴ;


# direct methods
.method public constructor <init>(Ll/ᩴ֡ᩴ;I)V
    .locals 0

    .line 509
    iput-object p1, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    .line 923
    invoke-direct {p0, p2}, Ll/ۤ֡ᩴ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 6

    .line 552
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    iget-object v1, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v1, v1, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    .line 553
    iget v2, v0, Ll/ܽᩴᩴ;->᩶:I

    iget v3, v0, Ll/ܽᩴᩴ;->᩸:I

    sub-int/2addr v2, v3

    .line 554
    :goto_0
    iget v3, p0, Ll/ۤ֡ᩴ;->᩹:I

    if-ge v3, v2, :cond_0

    .line 555
    iget v4, v0, Ll/ܽᩴᩴ;->᩸:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Ll/ۤ֡ᩴ;->᩹:I

    iput v3, p0, Ll/ۤ֡ᩴ;->᩸:I

    add-int/2addr v4, v3

    aget-object v3, v1, v4

    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 540
    invoke-virtual {p0}, Ll/ۤ֡ᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 541
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    iget-object v1, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v1, v1, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v0, v0, Ll/ܽᩴᩴ;->᩸:I

    iget v2, p0, Ll/ۤ֡ᩴ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۤ֡ᩴ;->᩹:I

    iput v2, p0, Ll/ۤ֡ᩴ;->᩸:I

    add-int/2addr v0, v2

    aget-object v0, v1, v0

    return-object v0

    .line 540
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 546
    invoke-virtual {p0}, Ll/ۛ֡ᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    iget-object v1, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v1, v1, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v0, v0, Ll/ܽᩴᩴ;->᩸:I

    iget v2, p0, Ll/ۤ֡ᩴ;->᩹:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۤ֡ᩴ;->᩹:I

    iput v2, p0, Ll/ۤ֡ᩴ;->᩸:I

    add-int/2addr v0, v2

    aget-object v0, v1, v0

    return-object v0

    .line 546
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ֫()I
    .locals 2

    .line 535
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    iget v1, v0, Ll/ܽᩴᩴ;->᩶:I

    iget v0, v0, Ll/ܽᩴᩴ;->᩸:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 520
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ܽᩴᩴ;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(I)Ljava/lang/Object;
    .locals 2

    .line 515
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    iget-object v1, v0, Ll/ᩴ֡ᩴ;->ۙ:Ll/᩵֡ᩴ;

    iget-object v1, v1, Ll/᩵֡ᩴ;->᩸:[Ljava/lang/Object;

    iget v0, v0, Ll/ܽᩴᩴ;->᩸:I

    add-int/2addr v0, p1

    aget-object p1, v1, v0

    return-object p1
.end method

.method public final ۧ(ILjava/lang/Object;)V
    .locals 1

    .line 525
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ܽᩴᩴ;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 530
    iget-object v0, p0, Ll/ۖ֡ᩴ;->᩶:Ll/ᩴ֡ᩴ;

    invoke-virtual {v0, p1}, Ll/ܽᩴᩴ;->remove(I)Ljava/lang/Object;

    return-void
.end method
