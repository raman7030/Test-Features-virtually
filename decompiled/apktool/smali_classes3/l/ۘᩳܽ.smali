.class public abstract Ll/ۘᩳܽ;
.super Ljava/lang/Object;
.source "K9QQ"

# interfaces
.implements Ll/ܺ᩻ܽ;


# instance fields
.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/ۘᩳܽ;->᩹:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Ll/ۘᩳܽ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۘᩳܽ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 3

    .line 34
    check-cast p1, Ll/ܺ᩻ܽ;

    .line 20
    iget-object v0, p0, Ll/ۘᩳܽ;->᩹:Ljava/lang/String;

    .line 35
    invoke-interface {p1}, Ll/ܺ᩻ܽ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 25
    iget-object v0, p0, Ll/ۘᩳܽ;->᩸:Ljava/lang/String;

    .line 37
    invoke-interface {p1}, Ll/ܺ᩻ܽ;->ᩴۧ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    invoke-interface {p0}, Ll/ܺ᩻ܽ;->۠()I

    move-result v0

    invoke-interface {p1}, Ll/ܺ᩻ܽ;->۠()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 41
    :goto_0
    invoke-interface {p0}, Ll/ܺ᩻ܽ;->۠()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 42
    invoke-interface {p0, v0}, Ll/ܺ᩻ܽ;->ۘ(I)Ll/ۖ᩻ܽ;

    move-result-object v1

    invoke-interface {p1, v0}, Ll/ܺ᩻ܽ;->ۘ(I)Ll/ۖ᩻ܽ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/۠᩻ܽ;->֫(Ll/۠᩻ܽ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 38
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 36
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public ܶ֫()Ljava/lang/Iterable;
    .locals 1

    .line 71
    invoke-virtual {p0}, Ll/ۘᩳܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/lang/Iterable;
    .locals 3

    .line 29
    new-instance v0, Ll/ۨᩳܽ;

    invoke-interface {p0}, Ll/ܺ᩻ܽ;->۠()I

    move-result v1

    new-instance v2, Ll/ۖᩳܽ;

    invoke-direct {v2, p0}, Ll/ۖᩳܽ;-><init>(Ll/ۘᩳܽ;)V

    invoke-direct {v0, v1, v2}, Ll/ۨᩳܽ;-><init>(ILl/۬ۜᩴ;)V

    return-object v0
.end method

.method public final ᩴۧ()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۘᩳܽ;->᩸:Ljava/lang/String;

    return-object v0
.end method
