.class public final Ll/۠ܰۘ;
.super Ljava/lang/Object;
.source "YCK3"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۙ:Ll/᩹ܰۘ;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Ll/۬ܰۘ;


# direct methods
.method public constructor <init>(Ll/᩹ܰۘ;)V
    .locals 0

    .line 245
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ܰۘ;->ۙ:Ll/᩹ܰۘ;

    const/4 p1, -0x1

    .line 247
    iput p1, p0, Ll/۠ܰۘ;->᩸:I

    const/4 p1, 0x0

    iput p1, p0, Ll/۠ܰۘ;->᩶:I

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 6

    .line 283
    iget-object v0, p0, Ll/۠ܰۘ;->ۙ:Ll/᩹ܰۘ;

    iget-object v1, v0, Ll/᩹ܰۘ;->᩸:Ll/ۨܰۘ;

    iget v1, v1, Ll/ۨܰۘ;->ۙ:I

    .line 284
    :goto_0
    iget v2, p0, Ll/۠ܰۘ;->᩶:I

    if-ge v2, v1, :cond_0

    .line 285
    new-instance v3, Ll/۬ܰۘ;

    iget-object v4, v0, Ll/᩹ܰۘ;->᩸:Ll/ۨܰۘ;

    add-int/lit8 v5, v2, 0x1

    iput v5, p0, Ll/۠ܰۘ;->᩶:I

    iput v2, p0, Ll/۠ܰۘ;->᩸:I

    invoke-direct {v3, v4, v2}, Ll/۬ܰۘ;-><init>(Ll/ۨܰۘ;I)V

    iput-object v3, p0, Ll/۠ܰۘ;->᩹:Ll/۬ܰۘ;

    .line 286
    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 251
    iget v0, p0, Ll/۠ܰۘ;->᩶:I

    iget-object v1, p0, Ll/۠ܰۘ;->ۙ:Ll/᩹ܰۘ;

    iget-object v1, v1, Ll/᩹ܰۘ;->᩸:Ll/ۨܰۘ;

    iget v1, v1, Ll/ۨܰۘ;->ۙ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 257
    invoke-virtual {p0}, Ll/۠ܰۘ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    new-instance v0, Ll/۬ܰۘ;

    iget-object v1, p0, Ll/۠ܰۘ;->ۙ:Ll/᩹ܰۘ;

    iget-object v1, v1, Ll/᩹ܰۘ;->᩸:Ll/ۨܰۘ;

    iget v2, p0, Ll/۠ܰۘ;->᩶:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/۠ܰۘ;->᩶:I

    iput v2, p0, Ll/۠ܰۘ;->᩸:I

    invoke-direct {v0, v1, v2}, Ll/۬ܰۘ;-><init>(Ll/ۨܰۘ;I)V

    iput-object v0, p0, Ll/۠ܰۘ;->᩹:Ll/۬ܰۘ;

    return-object v0

    .line 257
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 6

    .line 263
    iget v0, p0, Ll/۠ܰۘ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 264
    iput v1, p0, Ll/۠ܰۘ;->᩸:I

    .line 265
    iget-object v0, p0, Ll/۠ܰۘ;->ۙ:Ll/᩹ܰۘ;

    iget-object v2, v0, Ll/᩹ܰۘ;->᩸:Ll/ۨܰۘ;

    iget v3, v2, Ll/ۨܰۘ;->ۙ:I

    add-int/lit8 v4, v3, -0x1

    iput v4, v2, Ll/ۨܰۘ;->ۙ:I

    iget v4, p0, Ll/۠ܰۘ;->᩶:I

    add-int/lit8 v5, v4, -0x1

    iput v5, p0, Ll/۠ܰۘ;->᩶:I

    sub-int/2addr v3, v4

    .line 266
    iget-object v2, v2, Ll/ۨܰۘ;->᩹:[C

    invoke-static {v2, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 267
    iget-object v0, v0, Ll/᩹ܰۘ;->᩸:Ll/ۨܰۘ;

    iget-object v0, v0, Ll/ۨܰۘ;->ۗ:[C

    iget v2, p0, Ll/۠ܰۘ;->᩶:I

    add-int/lit8 v4, v2, 0x1

    invoke-static {v0, v4, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 268
    iget-object v0, p0, Ll/۠ܰۘ;->᩹:Ll/۬ܰۘ;

    iput v1, v0, Ll/۬ܰۘ;->᩸:I

    return-void

    .line 263
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
