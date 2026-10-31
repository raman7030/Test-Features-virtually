.class public final synthetic Ll/ܺ֫ۖ;
.super Ljava/lang/Object;
.source "OBBK"

# interfaces
.implements Ll/ᩴܶܺ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 2

    .line 2
    check-cast p1, Ll/ۨ᩹۠;

    .line 168
    invoke-interface {p1}, Ll/ۨ᩹۠;->֫()Ll/ۛ᩹۠;

    move-result-object v0

    sget-object v1, Ll/ۛ᩹۠;->᩹:Ll/ۛ᩹۠;

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 171
    :cond_0
    invoke-interface {p1}, Ll/ۨ᩹۠;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "compiler.err.invalid.meth.decl.ret.type.req"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
