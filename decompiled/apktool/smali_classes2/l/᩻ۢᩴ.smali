.class public final Ll/᩻ۢᩴ;
.super Ljava/lang/Object;
.source "N1QM"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/ܺۢᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(ILl/ܺۢᩴ;)V
    .locals 0

    .line 772
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    .line 773
    iput p1, p0, Ll/᩻ۢᩴ;->᩹:I

    const/4 p1, -0x1

    iput p1, p0, Ll/᩻ۢᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final add(I)V
    .locals 2

    .line 809
    iget v0, p0, Ll/᩻ۢᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩻ۢᩴ;->᩹:I

    iget-object v1, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    invoke-virtual {v1, v0, p1}, Ll/ܺۢᩴ;->add(II)V

    const/4 p1, -0x1

    .line 810
    iput p1, p0, Ll/᩻ۢᩴ;->᩸:I

    return-void
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 772
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/᩻ۢᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

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

    .line 830
    iget-object v0, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    iget-object v1, v0, Ll/ܺۢᩴ;->᩸:[I

    .line 831
    :goto_0
    iget v2, p0, Ll/᩻ۢᩴ;->᩹:I

    iget v3, v0, Ll/ܺۢᩴ;->᩹:I

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 832
    iput v3, p0, Ll/᩻ۢᩴ;->᩹:I

    iput v2, p0, Ll/᩻ۢᩴ;->᩸:I

    aget v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 777
    iget v0, p0, Ll/᩻ۢᩴ;->᩹:I

    iget-object v1, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    iget v1, v1, Ll/ܺۢᩴ;->᩹:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 782
    iget v0, p0, Ll/᩻ۢᩴ;->᩹:I

    if-lez v0, :cond_0

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
    invoke-virtual {p0}, Ll/᩻ۢᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 799
    iget v0, p0, Ll/᩻ۢᩴ;->᩹:I

    return v0
.end method

.method public final nextInt()I
    .locals 3

    .line 787
    invoke-virtual {p0}, Ll/᩻ۢᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 788
    iget-object v0, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    iget-object v0, v0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/᩻ۢᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩻ۢᩴ;->᩹:I

    iput v1, p0, Ll/᩻ۢᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 787
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/᩻ۢᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 804
    iget v0, p0, Ll/᩻ۢᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 3

    .line 821
    iget v0, p0, Ll/᩻ۢᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 822
    iget-object v2, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    invoke-virtual {v2, v0}, Ll/ܺۢᩴ;->ۘ(I)I

    .line 824
    iget v0, p0, Ll/᩻ۢᩴ;->᩸:I

    iget v2, p0, Ll/᩻ۢᩴ;->᩹:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/᩻ۢᩴ;->᩹:I

    .line 825
    :cond_0
    iput v1, p0, Ll/᩻ۢᩴ;->᩸:I

    return-void

    .line 821
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 815
    iget v0, p0, Ll/᩻ۢᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 816
    iget-object v1, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    invoke-virtual {v1, v0, p1}, Ll/ܺۢᩴ;->set(II)I

    return-void

    .line 815
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

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

    .line 793
    invoke-virtual {p0}, Ll/᩻ۢᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 794
    iget-object v0, p0, Ll/᩻ۢᩴ;->᩶:Ll/ܺۢᩴ;

    iget-object v0, v0, Ll/ܺۢᩴ;->᩸:[I

    iget v1, p0, Ll/᩻ۢᩴ;->᩹:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/᩻ۢᩴ;->᩹:I

    iput v1, p0, Ll/᩻ۢᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 793
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
