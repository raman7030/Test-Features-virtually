.class public final Ll/ۛܽᩴ;
.super Ljava/lang/Object;
.source "S6E"

# interfaces
.implements Ll/֨ᩳᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ᩶:Ll/᩺ܽᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/᩺ܽᩴ;)V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛܽᩴ;->᩶:Ll/᩺ܽᩴ;

    const/4 p1, -0x1

    .line 214
    iput p1, p0, Ll/ۛܽᩴ;->᩸:I

    const/4 p1, 0x0

    iput p1, p0, Ll/ۛܽᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 213
    check-cast p1, Ll/ۘᩳᩴ;

    invoke-virtual {p0, p1}, Ll/ۛܽᩴ;->ܽ(Ll/ۘᩳᩴ;)V

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

    .line 218
    iget v0, p0, Ll/ۛܽᩴ;->᩹:I

    iget-object v1, p0, Ll/ۛܽᩴ;->᩶:Ll/᩺ܽᩴ;

    iget v1, v1, Ll/᩺ܽᩴ;->᩹:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/ۛܽᩴ;->nextFloat()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public final nextFloat()F
    .locals 3

    .line 223
    invoke-virtual {p0}, Ll/ۛܽᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    iget-object v0, p0, Ll/ۛܽᩴ;->᩶:Ll/᩺ܽᩴ;

    iget-object v0, v0, Ll/᩺ܽᩴ;->᩸:[F

    iget v1, p0, Ll/ۛܽᩴ;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۛܽᩴ;->᩹:I

    iput v1, p0, Ll/ۛܽᩴ;->᩸:I

    aget v0, v0, v1

    return v0

    .line 223
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 4

    .line 229
    iget v0, p0, Ll/ۛܽᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 230
    iput v1, p0, Ll/ۛܽᩴ;->᩸:I

    .line 231
    iget-object v0, p0, Ll/ۛܽᩴ;->᩶:Ll/᩺ܽᩴ;

    iget v1, v0, Ll/᩺ܽᩴ;->᩹:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, Ll/᩺ܽᩴ;->᩹:I

    iget v2, p0, Ll/ۛܽᩴ;->᩹:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, Ll/ۛܽᩴ;->᩹:I

    sub-int/2addr v1, v2

    .line 232
    iget-object v0, v0, Ll/᩺ܽᩴ;->᩸:[F

    invoke-static {v0, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 229
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final ܽ(Ll/ۘᩳᩴ;)V
    .locals 4

    .line 246
    iget-object v0, p0, Ll/ۛܽᩴ;->᩶:Ll/᩺ܽᩴ;

    iget-object v1, v0, Ll/᩺ܽᩴ;->᩸:[F

    .line 247
    :goto_0
    iget v2, p0, Ll/ۛܽᩴ;->᩹:I

    iget v3, v0, Ll/᩺ܽᩴ;->᩹:I

    if-ge v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۛܽᩴ;->᩹:I

    aget v2, v1, v2

    invoke-interface {p1, v2}, Ll/ۘᩳᩴ;->֫(F)V

    goto :goto_0

    :cond_0
    return-void
.end method
