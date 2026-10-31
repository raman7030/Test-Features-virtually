.class public final Ll/ۘܶ۠;
.super Ljava/lang/Object;
.source "A41S"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:Ll/ۖܶ۠;


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۘܶ۠;->᩸:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 214
    iget-object v0, p0, Ll/ۘܶ۠;->᩸:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 216
    iget-object v0, p0, Ll/ۘܶ۠;->᩸:Ll/ۖܶ۠;

    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 217
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/ۘܶ۠;->᩸:Ll/ۖܶ۠;

    return-object v1

    .line 215
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 221
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
