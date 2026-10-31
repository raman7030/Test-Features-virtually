.class public final Ll/ۚ᩸᩻;
.super Ll/֫ۜܳ;
.source "S97M"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    const-string v0, "trash"

    .line 41
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 45
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f1207e5

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const v0, 0x7f1207e4

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const v1, 0x7f1207e3

    .line 49
    invoke-virtual {p0, p1, v1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 55
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 57
    check-cast v2, Ll/۫᩸᩻;

    invoke-virtual {v2}, Ll/۫᩸᩻;->ܽ()Ll/᩸֡ܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 59
    :cond_0
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v2, Ll/֡᩸᩻;

    invoke-direct {v0, v2}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 60
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    const-string p1, "infos"

    .line 61
    invoke-virtual {v0, p1, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 62
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "trash"

    .line 35
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x1

    if-gt p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
