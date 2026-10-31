.class public abstract Ll/ۡۨܺ;
.super Ll/ۢۨܺ;
.source "85J6"

# interfaces
.implements Ljava/util/ListIterator;


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 69
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    .line 43
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    .line 54
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    .line 49
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢۨܺ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۢۨܺ;->᩸:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    .line 59
    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 64
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
