.class public abstract Ll/ۛ֡ᩴ;
.super Ll/ۤ֡ᩴ;
.source "Y1FB"

# interfaces
.implements Ll/ۧۚᩴ;
.implements Ll/۫۬ᩴ;


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2

    .line 977
    iget v0, p0, Ll/ۤ֡ᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۤ֡ᩴ;->᩹:I

    invoke-virtual {p0, v0, p1}, Ll/ۛ֡ᩴ;->֫(ILjava/lang/Object;)V

    const/4 p1, -0x1

    .line 978
    iput p1, p0, Ll/ۤ֡ᩴ;->᩸:I

    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 956
    iget v0, p0, Ll/ۤ֡ᩴ;->᩹:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 967
    iget v0, p0, Ll/ۤ֡ᩴ;->᩹:I

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1

    .line 961
    invoke-virtual {p0}, Ll/ۛ֡ᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 962
    iget v0, p0, Ll/ۤ֡ᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۤ֡ᩴ;->᩹:I

    iput v0, p0, Ll/ۤ֡ᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/ۤ֡ᩴ;->ۧ(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 961
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 972
    iget v0, p0, Ll/ۤ֡ᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 983
    iget v0, p0, Ll/ۤ֡ᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 984
    invoke-virtual {p0, v0, p1}, Ll/ۛ֡ᩴ;->ۧ(ILjava/lang/Object;)V

    return-void

    .line 983
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public abstract ֫(ILjava/lang/Object;)V
.end method

.method public abstract ۧ(ILjava/lang/Object;)V
.end method
