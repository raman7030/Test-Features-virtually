.class public abstract Ll/ܶᩳᩴ;
.super Ll/۠ᩳᩴ;
.source "MO8"

# interfaces
.implements Ll/ۗᩳᩴ;
.implements Ll/۫۬ᩴ;


# virtual methods
.method public add(F)V
    .locals 2

    .line 1113
    iget v0, p0, Ll/۠ᩳᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/۠ᩳᩴ;->᩹:I

    invoke-virtual {p0, p1, v0}, Ll/ܶᩳᩴ;->֫(FI)V

    const/4 p1, -0x1

    .line 1114
    iput p1, p0, Ll/۠ᩳᩴ;->᩸:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 92
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-interface {p0, p1}, Ll/ۗᩳᩴ;->add(F)V

    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1092
    iget v0, p0, Ll/۠ᩳᩴ;->᩹:I

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
    invoke-interface {p0}, Ll/֨ᩳᩴ;->nextFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1103
    iget v0, p0, Ll/۠ᩳᩴ;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-interface {p0}, Ll/ۗᩳᩴ;->᩹()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1108
    iget v0, p0, Ll/۠ᩳᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 31
    check-cast p1, Ljava/lang/Float;

    .line 81
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ll/ܶᩳᩴ;->ܽ(F)V

    return-void
.end method

.method public abstract ֫(FI)V
.end method

.method public abstract ۧ(FI)V
.end method

.method public final ܽ(F)V
    .locals 2

    .line 1119
    iget v0, p0, Ll/۠ᩳᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1120
    invoke-virtual {p0, p1, v0}, Ll/ܶᩳᩴ;->ۧ(FI)V

    return-void

    .line 1119
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public ᩹()F
    .locals 1

    .line 1097
    invoke-virtual {p0}, Ll/ܶᩳᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1098
    iget v0, p0, Ll/۠ᩳᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/۠ᩳᩴ;->᩹:I

    iput v0, p0, Ll/۠ᩳᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/۠ᩳᩴ;->ۧ(I)F

    move-result v0

    return v0

    .line 1097
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
