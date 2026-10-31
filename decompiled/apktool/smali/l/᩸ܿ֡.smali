.class public final Ll/᩸ܿ֡;
.super Ll/۠ܿ֡;
.source "M67K"


# direct methods
.method public constructor <init>(Ll/ۛ᩸ۘ;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Ll/۠ܿ֡;-><init>(Ll/ۛ᩸ۘ;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final ܿ()Ll/ᩴܿ֡;
    .locals 2

    .line 58
    invoke-virtual {p0}, Ll/۠ܿ֡;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜܿ֡;

    .line 59
    iget-object v1, p0, Ll/۠ܿ֡;->֫:Ll/ۛ᩸ۘ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    new-instance v1, Ll/ᩴܿ֡;

    invoke-direct {v1, v0}, Ll/ᩴܿ֡;-><init>(Ll/ۜܿ֡;)V

    return-object v1
.end method
