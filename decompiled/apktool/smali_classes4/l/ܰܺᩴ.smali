.class public final Ll/ܰܺᩴ;
.super Ljava/lang/Object;
.source "GQL"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۙ:Ll/ۧۖᩴ;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Ll/ܳۖᩴ;


# direct methods
.method public constructor <init>(Ll/ۧۖᩴ;)V
    .locals 0

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰܺᩴ;->ۙ:Ll/ۧۖᩴ;

    const/4 p1, -0x1

    .line 228
    iput p1, p0, Ll/ܰܺᩴ;->᩸:I

    const/4 p1, 0x0

    iput p1, p0, Ll/ܰܺᩴ;->᩶:I

    return-void
.end method


# virtual methods
.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 6

    .line 265
    iget-object v0, p0, Ll/ܰܺᩴ;->ۙ:Ll/ۧۖᩴ;

    iget-object v1, v0, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget v1, v1, Ll/ۢۖᩴ;->ۙ:I

    .line 266
    :goto_0
    iget v2, p0, Ll/ܰܺᩴ;->᩶:I

    if-ge v2, v1, :cond_0

    .line 267
    new-instance v3, Ll/ܳۖᩴ;

    iget-object v4, v0, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    add-int/lit8 v5, v2, 0x1

    iput v5, p0, Ll/ܰܺᩴ;->᩶:I

    iput v2, p0, Ll/ܰܺᩴ;->᩸:I

    invoke-direct {v3, v4, v2}, Ll/ܳۖᩴ;-><init>(Ll/ۢۖᩴ;I)V

    iput-object v3, p0, Ll/ܰܺᩴ;->᩹:Ll/ܳۖᩴ;

    .line 268
    invoke-interface {p1, v3}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 232
    iget v0, p0, Ll/ܰܺᩴ;->᩶:I

    iget-object v1, p0, Ll/ܰܺᩴ;->ۙ:Ll/ۧۖᩴ;

    iget-object v1, v1, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget v1, v1, Ll/ۢۖᩴ;->ۙ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 238
    invoke-virtual {p0}, Ll/ܰܺᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    new-instance v0, Ll/ܳۖᩴ;

    iget-object v1, p0, Ll/ܰܺᩴ;->ۙ:Ll/ۧۖᩴ;

    iget-object v1, v1, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget v2, p0, Ll/ܰܺᩴ;->᩶:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ܰܺᩴ;->᩶:I

    iput v2, p0, Ll/ܰܺᩴ;->᩸:I

    invoke-direct {v0, v1, v2}, Ll/ܳۖᩴ;-><init>(Ll/ۢۖᩴ;I)V

    iput-object v0, p0, Ll/ܰܺᩴ;->᩹:Ll/ܳۖᩴ;

    return-object v0

    .line 238
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 6

    .line 244
    iget v0, p0, Ll/ܰܺᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 245
    iput v1, p0, Ll/ܰܺᩴ;->᩸:I

    .line 246
    iget-object v0, p0, Ll/ܰܺᩴ;->ۙ:Ll/ۧۖᩴ;

    iget-object v2, v0, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget v3, v2, Ll/ۢۖᩴ;->ۙ:I

    add-int/lit8 v4, v3, -0x1

    iput v4, v2, Ll/ۢۖᩴ;->ۙ:I

    iget v4, p0, Ll/ܰܺᩴ;->᩶:I

    add-int/lit8 v5, v4, -0x1

    iput v5, p0, Ll/ܰܺᩴ;->᩶:I

    sub-int/2addr v3, v4

    .line 247
    iget-object v2, v2, Ll/ۢۖᩴ;->᩹:[J

    invoke-static {v2, v4, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 248
    iget-object v2, v0, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget-object v2, v2, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    iget v4, p0, Ll/ܰܺᩴ;->᩶:I

    add-int/lit8 v5, v4, 0x1

    invoke-static {v2, v5, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 249
    iget-object v2, p0, Ll/ܰܺᩴ;->᩹:Ll/ܳۖᩴ;

    iput v1, v2, Ll/ܳۖᩴ;->᩸:I

    .line 250
    iget-object v0, v0, Ll/ۧۖᩴ;->᩸:Ll/ۢۖᩴ;

    iget-object v1, v0, Ll/ۢۖᩴ;->ۗ:[Ljava/lang/Object;

    iget v0, v0, Ll/ۢۖᩴ;->ۙ:I

    const/4 v2, 0x0

    aput-object v2, v1, v0

    return-void

    .line 244
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
