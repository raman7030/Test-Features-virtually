.class public final Ll/᩷ۢᩴ;
.super Ll/ۢۡᩴ;
.source "N1QM"


# instance fields
.field public final synthetic ᩶:Ll/ۡۢᩴ;


# direct methods
.method public constructor <init>(Ll/ۡۢᩴ;I)V
    .locals 0

    .line 465
    iput-object p1, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    .line 972
    invoke-direct {p0, p2}, Ll/᩷ۡᩴ;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 462
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/᩷ۢᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 6

    .line 508
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    iget-object v1, v0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v1, v1, Ll/ܺۢᩴ;->᩸:[I

    .line 509
    iget v2, v0, Ll/۫ܿᩴ;->᩶:I

    iget v3, v0, Ll/۫ܿᩴ;->᩸:I

    sub-int/2addr v2, v3

    .line 510
    :goto_0
    iget v3, p0, Ll/᩷ۡᩴ;->᩹:I

    if-ge v3, v2, :cond_0

    .line 511
    iget v4, v0, Ll/۫ܿᩴ;->᩸:I

    add-int/lit8 v5, v3, 0x1

    iput v5, p0, Ll/᩷ۡᩴ;->᩹:I

    iput v3, p0, Ll/᩷ۡᩴ;->᩸:I

    add-int/2addr v4, v3

    aget v3, v1, v4

    invoke-interface {p1, v3}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final nextInt()I
    .locals 4

    .line 496
    invoke-virtual {p0}, Ll/᩷ۡᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    iget-object v1, v0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v1, v1, Ll/ܺۢᩴ;->᩸:[I

    iget v0, v0, Ll/۫ܿᩴ;->᩸:I

    iget v2, p0, Ll/᩷ۡᩴ;->᩹:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/᩷ۡᩴ;->᩹:I

    iput v2, p0, Ll/᩷ۡᩴ;->᩸:I

    add-int/2addr v0, v2

    aget v0, v1, v0

    return v0

    .line 496
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ֫()I
    .locals 2

    .line 491
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    iget v1, v0, Ll/۫ܿᩴ;->᩶:I

    iget v0, v0, Ll/۫ܿᩴ;->᩸:I

    sub-int/2addr v1, v0

    return v1
.end method

.method public final ֫(II)V
    .locals 1

    .line 476
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۫ܿᩴ;->add(II)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 3

    .line 502
    invoke-virtual {p0}, Ll/ۢۡᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 503
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    iget-object v1, v0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v1, v1, Ll/ܺۢᩴ;->᩸:[I

    iget v0, v0, Ll/۫ܿᩴ;->᩸:I

    iget v2, p0, Ll/᩷ۡᩴ;->᩹:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/᩷ۡᩴ;->᩹:I

    iput v2, p0, Ll/᩷ۡᩴ;->᩸:I

    add-int/2addr v0, v2

    aget v0, v1, v0

    return v0

    .line 502
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۧ(I)I
    .locals 2

    .line 471
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    iget-object v1, v0, Ll/ۡۢᩴ;->ۙ:Ll/ܺۢᩴ;

    iget-object v1, v1, Ll/ܺۢᩴ;->᩸:[I

    iget v0, v0, Ll/۫ܿᩴ;->᩸:I

    add-int/2addr v0, p1

    aget p1, v1, v0

    return p1
.end method

.method public final ۧ(II)V
    .locals 1

    .line 481
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۫ܿᩴ;->set(II)I

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 486
    iget-object v0, p0, Ll/᩷ۢᩴ;->᩶:Ll/ۡۢᩴ;

    invoke-virtual {v0, p1}, Ll/۫ܿᩴ;->ۘ(I)I

    return-void
.end method
