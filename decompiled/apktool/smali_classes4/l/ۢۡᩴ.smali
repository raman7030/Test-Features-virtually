.class public abstract Ll/ۢۡᩴ;
.super Ll/᩷ۡᩴ;
.source "11LW"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# virtual methods
.method public add(I)V
    .locals 2

    .line 1026
    iget v0, p0, Ll/᩷ۡᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩷ۡᩴ;->᩹:I

    invoke-virtual {p0, v0, p1}, Ll/ۢۡᩴ;->֫(II)V

    const/4 p1, -0x1

    .line 1027
    iput p1, p0, Ll/᩷ۡᩴ;->᩸:I

    return-void
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1005
    iget v0, p0, Ll/᩷ۡᩴ;->᩹:I

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
    invoke-virtual {p0}, Ll/ۢۡᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1016
    iget v0, p0, Ll/᩷ۡᩴ;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-interface {p0}, Ll/ܶۡᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1021
    iget v0, p0, Ll/᩷ۡᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 1032
    iget v0, p0, Ll/᩷ۡᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1033
    invoke-virtual {p0, v0, p1}, Ll/ۢۡᩴ;->ۧ(II)V

    return-void

    .line 1032
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public abstract ֫(II)V
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public ۖ֫()I
    .locals 1

    .line 1010
    invoke-virtual {p0}, Ll/ۢۡᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1011
    iget v0, p0, Ll/᩷ۡᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩷ۡᩴ;->᩹:I

    iput v0, p0, Ll/᩷ۡᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/᩷ۡᩴ;->ۧ(I)I

    move-result v0

    return v0

    .line 1010
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public abstract ۧ(II)V
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
