.class public final Ll/ܺ᩸᩻;
.super Ll/֫ۜܳ;
.source "698A"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    .line 31
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "trash"

    .line 32
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "local"

    .line 33
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    const v0, 0x7f1205c2

    .line 34
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 3

    .line 39
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 40
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 41
    sget v1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v1, Ll/֨۠ۢ;

    const-class v2, Ll/ۡ᩺ܳ;

    invoke-direct {v1, v2}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 42
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->ܽ(Ljava/util/List;)V

    .line 43
    invoke-virtual {v1, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    const-string v2, "ARG_MSG_FROM"

    .line 44
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ARG_MSG_TO"

    .line 45
    invoke-virtual {v0}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "targetPath"

    .line 46
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-virtual {v1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    .line 21
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "trash"

    .line 25
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "local"

    .line 26
    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
