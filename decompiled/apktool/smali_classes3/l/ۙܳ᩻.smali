.class public final Ll/ۙܳ᩻;
.super Ll/֫ۜܳ;
.source "O8BF"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    .line 48
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 49
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 50
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    const v0, 0x7f120613

    .line 51
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    .line 52
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    const-string v0, "network_transfer_warn"

    const v1, 0x7f1206bb

    invoke-static {v1, p1, v0}, Ll/ۧۛܿ;->ۧ(ILl/ۗܺ᩷;Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 4

    .line 57
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 58
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 60
    sget v1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v1, Ll/֨۠ۢ;

    const-class v2, Ll/᩶ܳ᩻;

    invoke-direct {v1, v2}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 61
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 62
    invoke-virtual {v1, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    .line 330
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->֫(Ll/ܽ᩷ܳ;)V

    .line 64
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢܳ;->᩹()Ll/ܰܺܳ;

    move-result-object v2

    const-string v3, "ARG_STATELESS_VISITOR2"

    .line 355
    invoke-virtual {v2}, Ll/ܰܺܳ;->֫()[B

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    const-string v2, "ARG_MSG_FROM"

    .line 65
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ARG_MSG_TO"

    .line 66
    invoke-virtual {v0}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "targetPath"

    .line 67
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "streamMode"

    const/4 v0, 0x1

    .line 70
    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 71
    invoke-virtual {v1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 3

    .line 35
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 36
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 37
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 38
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 39
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v1

    check-cast v1, Ll/ۗۢ᩻;

    .line 40
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩹()Ll/ܰܺܳ;

    move-result-object v0

    check-cast v0, Ll/ۗۢ᩻;

    .line 41
    iget-object v1, v1, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    iget v1, v1, Ll/ۗ᩻᩻;->᩶:I

    iget-object v0, v0, Ll/ۗۢ᩻;->᩹:Ll/ۗ᩻᩻;

    iget v0, v0, Ll/ۗ᩻᩻;->᩶:I

    if-ne v1, v0, :cond_0

    invoke-virtual {p1}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
