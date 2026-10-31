.class public abstract Ll/ᩴᩳܽ;
.super Ljava/lang/Object;
.source "P9QS"

# interfaces
.implements Ll/ۖ᩻ܽ;


# instance fields
.field public ᩸:I

.field public ᩹:Ll/ܺۢᩴ;


# direct methods
.method public constructor <init>(ILl/ܺۢᩴ;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Ll/ᩴᩳܽ;->᩸:I

    .line 13
    iput-object p2, p0, Ll/ᩴᩳܽ;->᩹:Ll/ܺۢᩴ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 4

    .line 28
    check-cast p1, Ll/ۖ᩻ܽ;

    .line 18
    iget v0, p0, Ll/ᩴᩳܽ;->᩸:I

    .line 29
    invoke-interface {p1}, Ll/ۖ᩻ܽ;->ܺ()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 33
    invoke-interface {p1}, Ll/ۖ᩻ܽ;->ۙ֫()Ll/֨ۡᩴ;

    move-result-object p1

    .line 34
    iget-object v0, p0, Ll/ᩴᩳܽ;->᩹:Ll/ܺۢᩴ;

    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    .line 37
    :goto_0
    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 38
    invoke-virtual {v0, v1}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v2

    invoke-interface {p1, v1}, Ll/֨ۡᩴ;->getInt(I)I

    move-result v3

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 39
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    return-void

    .line 35
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 30
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۙ֫()Ll/֨ۡᩴ;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ᩴᩳܽ;->᩹:Ll/ܺۢᩴ;

    return-object v0
.end method

.method public final ܺ()I
    .locals 1

    .line 18
    iget v0, p0, Ll/ᩴᩳܽ;->᩸:I

    return v0
.end method
