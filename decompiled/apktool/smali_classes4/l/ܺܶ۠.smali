.class public final Ll/ܺܶ۠;
.super Ljava/lang/Object;
.source "L42O"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ll/ۖܶ۠;


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 465
    iget-object v0, p0, Ll/ܺܶ۠;->᩸:Ll/ۖܶ۠;

    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 468
    iget-object v0, p0, Ll/ܺܶ۠;->᩸:Ll/ۖܶ۠;

    iget-object v1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    if-eqz v1, :cond_0

    .line 470
    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 471
    iput-object v1, p0, Ll/ܺܶ۠;->᩸:Ll/ۖܶ۠;

    return-object v0

    .line 469
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 475
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
