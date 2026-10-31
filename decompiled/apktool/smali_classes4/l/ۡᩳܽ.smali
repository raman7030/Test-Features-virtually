.class public abstract Ll/ۡᩳܽ;
.super Ljava/lang/Object;
.source "64N8"

# interfaces
.implements Ll/ۢ᩻ܽ;


# instance fields
.field public ᩸:Ll/ۤܽܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    sget-object v0, Ll/ۤܽܽ;->ۙ:Ll/ۤܽܽ;

    iput-object v0, p0, Ll/ۡᩳܽ;->᩸:Ll/ۤܽܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 4

    .line 40
    check-cast p1, Ll/ۢ᩻ܽ;

    .line 41
    move-object v0, p0

    check-cast v0, Ll/ۡܿܽ;

    invoke-virtual {v0}, Ll/ۡܿܽ;->ۚ()I

    move-result v1

    invoke-interface {p1}, Ll/ۢ᩻ܽ;->ۚ()I

    move-result v2

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 43
    :goto_0
    invoke-virtual {v0}, Ll/ۡܿܽ;->ۚ()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 38
    invoke-virtual {v0, v1}, Ll/ۡܿܽ;->ۢ(I)Ll/۠ܿܽ;

    move-result-object v2

    .line 44
    invoke-interface {p1, v1}, Ll/ۢ᩻ܽ;->ۢ(I)Ll/ۘ᩻ܽ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/۠ᩳܽ;->֫(Ll/۠᩻ܽ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ۙ()Z
    .locals 3

    .line 31
    invoke-interface {p0}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ܽ;

    .line 32
    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ljava/lang/Iterable;
    .locals 3

    .line 18
    new-instance v0, Ll/ۨᩳܽ;

    invoke-interface {p0}, Ll/ۢ᩻ܽ;->ۚ()I

    move-result v1

    new-instance v2, Ll/ۢᩳܽ;

    invoke-direct {v2, p0}, Ll/ۢᩳܽ;-><init>(Ll/ۡᩳܽ;)V

    invoke-direct {v0, v1, v2}, Ll/ۨᩳܽ;-><init>(ILl/۬ۜᩴ;)V

    return-object v0
.end method

.method public ᩺()Ljava/lang/Iterable;
    .locals 1

    .line 287
    invoke-virtual {p0}, Ll/ۡᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method
