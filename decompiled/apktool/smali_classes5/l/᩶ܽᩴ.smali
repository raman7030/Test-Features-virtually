.class public final Ll/᩶ܽᩴ;
.super Ljava/lang/Object;
.source "HBSC"

# interfaces
.implements Ll/ۗᩳᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/ۤܽᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۤܽᩴ;I)V
    .locals 0

    .line 738
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    .line 739
    iput p2, p0, Ll/᩶ܽᩴ;->᩹:I

    const/4 p1, -0x1

    iput p1, p0, Ll/᩶ܽᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final add(F)V
    .locals 2

    .line 775
    iget v0, p0, Ll/᩶ܽᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩶ܽᩴ;->᩹:I

    iget-object v1, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    invoke-virtual {v1, p1, v0}, Ll/ۤܽᩴ;->ۧ(FI)V

    const/4 p1, -0x1

    .line 776
    iput p1, p0, Ll/᩶ܽᩴ;->᩸:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ܽᩴ;->add(F)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 738
    check-cast p1, Ll/ۘᩳᩴ;

    invoke-virtual {p0, p1}, Ll/᩶ܽᩴ;->ܽ(Ll/ۘᩳᩴ;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚᩳᩴ;->֫(Ll/֨ᩳᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 743
    iget v0, p0, Ll/᩶ܽᩴ;->᩹:I

    iget-object v1, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    iget v1, v1, Ll/ۤܽᩴ;->᩹:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 748
    iget v0, p0, Ll/᩶ܽᩴ;->᩹:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/᩶ܽᩴ;->nextFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final nextFloat()F
    .locals 3

    .line 753
    invoke-virtual {p0}, Ll/᩶ܽᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 754
    iget-object v0, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    iget-object v0, v0, Ll/ۤܽᩴ;->᩸:[F

    iget v1, p0, Ll/᩶ܽᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩶ܽᩴ;->᩹:I

    iput v1, p0, Ll/᩶ܽᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 753
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 765
    iget v0, p0, Ll/᩶ܽᩴ;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/᩶ܽᩴ;->᩹()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 770
    iget v0, p0, Ll/᩶ܽᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 787
    iget v0, p0, Ll/᩶ܽᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 788
    iget-object v2, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    invoke-virtual {v2, v0}, Ll/ۤܽᩴ;->ܺ(I)F

    .line 790
    iget v0, p0, Ll/᩶ܽᩴ;->᩸:I

    iget v2, p0, Ll/᩶ܽᩴ;->᩹:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/᩶ܽᩴ;->᩹:I

    .line 791
    :cond_0
    iput v1, p0, Ll/᩶ܽᩴ;->᩸:I

    return-void

    .line 787
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩶ܽᩴ;->ܽ(F)V

    return-void
.end method

.method public final ܽ(F)V
    .locals 2

    .line 781
    iget v0, p0, Ll/᩶ܽᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 782
    iget-object v1, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    invoke-virtual {v1, p1, v0}, Ll/ۤܽᩴ;->֫(FI)F

    return-void

    .line 781
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ܽ(Ll/ۘᩳᩴ;)V
    .locals 4

    .line 796
    iget-object v0, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    iget-object v1, v0, Ll/ۤܽᩴ;->᩸:[F

    .line 797
    :goto_0
    iget v2, p0, Ll/᩶ܽᩴ;->᩹:I

    iget v3, v0, Ll/ۤܽᩴ;->᩹:I

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 798
    iput v3, p0, Ll/᩶ܽᩴ;->᩹:I

    iput v2, p0, Ll/᩶ܽᩴ;->᩸:I

    aget v2, v1, v2

    invoke-interface {p1, v2}, Ll/ۘᩳᩴ;->֫(F)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩹()F
    .locals 2

    .line 759
    invoke-virtual {p0}, Ll/᩶ܽᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 760
    iget-object v0, p0, Ll/᩶ܽᩴ;->᩶:Ll/ۤܽᩴ;

    iget-object v0, v0, Ll/ۤܽᩴ;->᩸:[F

    iget v1, p0, Ll/᩶ܽᩴ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/᩶ܽᩴ;->᩹:I

    iput v1, p0, Ll/᩶ܽᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 759
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
