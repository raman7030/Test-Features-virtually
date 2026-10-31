.class public final Ll/ۤܿ᩻;
.super Ll/֫ۜܳ;
.source "OAIH"


# direct methods
.method public static ֫(Ll/ۗۢ᩻;Ll/֡۬ܳ;)Z
    .locals 3

    .line 433
    invoke-virtual {p1}, Ll/֡۬ܳ;->᩶()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨۬ܳ;

    .line 434
    invoke-virtual {v1}, Ll/֨۬ܳ;->ۘ()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 437
    :cond_1
    invoke-virtual {v1}, Ll/֨۬ܳ;->֫()Ll/֡۬ܳ;

    move-result-object v1

    .line 438
    invoke-static {p0, v1}, Ll/ۤܿ᩻;->֫(Ll/ۗۢ᩻;Ll/֡۬ܳ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 443
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Ll/֨۬ܳ;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 445
    invoke-virtual {p0, p1}, Ll/ۗۢ᩻;->ۢ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 199
    invoke-virtual {p0, p1, v0}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v1

    .line 446
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 447
    invoke-virtual {p0, p1, v0}, Ll/ۗۢ᩻;->ۧ(Ljava/lang/String;Z)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_3
    :goto_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    .line 57
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 58
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "local"

    .line 59
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    const v0, 0x7f1205d0

    .line 60
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 3

    .line 65
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 66
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "local"

    .line 67
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 68
    sget v1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v1, Ll/֨۠ۢ;

    const-class v2, Ll/ܶܿ᩻;

    invoke-direct {v1, v2}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 69
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 70
    invoke-virtual {v1, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    .line 330
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->֫(Ll/ܽ᩷ܳ;)V

    const-string v2, "ARG_MSG_FROM"

    .line 72
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ARG_MSG_TO"

    .line 73
    invoke-virtual {v0}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "targetPath"

    .line 74
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "moveMode"

    const/4 v0, 0x0

    .line 75
    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 76
    invoke-virtual {v1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    .line 49
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 50
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "local"

    .line 51
    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 52
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
