.class public final Ll/֡ܽᩴ;
.super Ljava/lang/Object;
.source "H32"

# interfaces
.implements Ll/ۗᩳᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public ᩸:Ll/ۗᩳᩴ;

.field public final synthetic ᩹:Ll/֨ܽᩴ;


# direct methods
.method public constructor <init>(Ll/֨ܽᩴ;Ll/ۗᩳᩴ;)V
    .locals 0

    .line 698
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܽᩴ;->᩹:Ll/֨ܽᩴ;

    .line 699
    iput-object p2, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    return-void
.end method


# virtual methods
.method public final add(F)V
    .locals 1

    .line 736
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0, p1}, Ll/ۗᩳᩴ;->add(F)V

    return-void
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/֡ܽᩴ;->add(F)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 29
    check-cast p1, Ll/ۘᩳᩴ;

    invoke-virtual {p0, p1}, Ll/֡ܽᩴ;->ܽ(Ll/ۘᩳᩴ;)V

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

    .line 714
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/֡ܽᩴ;->᩹:Ll/֨ܽᩴ;

    iget v1, v1, Ll/֨ܽᩴ;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 719
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    iget-object v1, p0, Ll/֡ܽᩴ;->᩹:Ll/֨ܽᩴ;

    iget v1, v1, Ll/֨ܽᩴ;->᩸:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/֡ܽᩴ;->nextFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final nextFloat()F
    .locals 1

    .line 724
    invoke-virtual {p0}, Ll/֡ܽᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 725
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ll/֨ᩳᩴ;->nextFloat()F

    move-result v0

    return v0

    .line 724
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 2

    .line 704
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/֡ܽᩴ;->᩹:Ll/֨ܽᩴ;

    iget v1, v1, Ll/֨ܽᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/֡ܽᩴ;->᩹()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 2

    .line 709
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    iget-object v1, p0, Ll/֡ܽᩴ;->᩹:Ll/֨ܽᩴ;

    iget v1, v1, Ll/֨ܽᩴ;->᩸:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 746
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ll/ۗᩳᩴ;->remove()V

    return-void
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/֡ܽᩴ;->ܽ(F)V

    return-void
.end method

.method public final ܽ(F)V
    .locals 1

    .line 741
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0, p1}, Ll/ۗᩳᩴ;->ܽ(F)V

    return-void
.end method

.method public final ܽ(Ll/ۘᩳᩴ;)V
    .locals 1

    .line 62
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    :goto_0
    invoke-virtual {p0}, Ll/֡ܽᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p0}, Ll/֡ܽᩴ;->nextFloat()F

    move-result v0

    invoke-interface {p1, v0}, Ll/ۘᩳᩴ;->֫(F)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩹()F
    .locals 1

    .line 730
    invoke-virtual {p0}, Ll/֡ܽᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 731
    iget-object v0, p0, Ll/֡ܽᩴ;->᩸:Ll/ۗᩳᩴ;

    invoke-interface {v0}, Ll/ۗᩳᩴ;->᩹()F

    move-result v0

    return v0

    .line 730
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
