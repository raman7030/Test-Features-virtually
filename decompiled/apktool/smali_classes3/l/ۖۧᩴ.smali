.class public abstract Ll/ۖۧᩴ;
.super Ll/ۢܰۘ;
.source "TCH0"


# instance fields
.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 956
    iput p1, p0, Ll/ۖۧᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1005
    iget v0, p0, Ll/ۖۧᩴ;->᩹:I

    invoke-virtual {p0}, Ll/ۖۧᩴ;->֫()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public remove()V
    .locals 3

    .line 1016
    iget v0, p0, Ll/ۖۧᩴ;->᩸:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 1017
    invoke-virtual {p0, v0}, Ll/ۖۧᩴ;->ܽ(I)V

    .line 1019
    iget v0, p0, Ll/ۖۧᩴ;->᩸:I

    iget v2, p0, Ll/ۖۧᩴ;->᩹:I

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Ll/ۖۧᩴ;->᩹:I

    .line 1020
    :cond_0
    iput v1, p0, Ll/ۖۧᩴ;->᩸:I

    return-void

    .line 1016
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public ֡ۧ()C
    .locals 2

    .line 1010
    invoke-virtual {p0}, Ll/ۖۧᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1011
    iget v0, p0, Ll/ۖۧᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۖۧᩴ;->᩹:I

    iput v0, p0, Ll/ۖۧᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/ۖۧᩴ;->ۧ(I)C

    move-result v0

    return v0

    .line 1010
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public abstract ֫()I
.end method

.method public abstract ۧ(I)C
.end method

.method public ۧ(Ll/᩻ۧᩴ;)V
    .locals 2

    .line 1025
    :goto_0
    iget v0, p0, Ll/ۖۧᩴ;->᩹:I

    invoke-virtual {p0}, Ll/ۖۧᩴ;->֫()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1026
    iget v0, p0, Ll/ۖۧᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۖۧᩴ;->᩹:I

    iput v0, p0, Ll/ۖۧᩴ;->᩸:I

    invoke-virtual {p0, v0}, Ll/ۖۧᩴ;->ۧ(I)C

    move-result v0

    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract ܽ(I)V
.end method
