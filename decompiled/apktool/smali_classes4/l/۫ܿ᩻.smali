.class public final Ll/۫ܿ᩻;
.super Ll/֫ۜܳ;
.source "98AW"


# direct methods
.method public static ֫(Ll/۫ܿ᩻;Ll/ۖۢܳ;IILl/ۨۧᩳ;Z)V
    .locals 3

    .line 101
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p0

    const-string v0, "net"

    .line 102
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v0, "zip"

    .line 103
    invoke-virtual {p0, v0}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 104
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/۬ܿ᩻;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 105
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 106
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    .line 330
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->֫(Ll/ܽ᩷ܳ;)V

    .line 108
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->᩹()Ll/ܰܺܳ;

    move-result-object v1

    const-string v2, "ARG_STATELESS_VISITOR2"

    .line 355
    invoke-virtual {v1}, Ll/ܰܺܳ;->֫()[B

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;[B)V

    const-string v1, "ARG_MSG_FROM"

    .line 109
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const v1, 0x7f12052f

    .line 110
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ARG_MSG_TO"

    invoke-virtual {v0, v2, v1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "targetPath"

    .line 111
    invoke-virtual {p0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "level"

    .line 112
    invoke-virtual {v0, p2, p0}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    const-string p0, "update"

    .line 113
    invoke-virtual {v0, p3, p0}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 114
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p0

    invoke-virtual {v0, p0, p4}, Ll/֨۠ۢ;->֫(Lbin/mt/plus/Main;Ll/ۨۧᩳ;)V

    const-string p0, "keepApkSigBlock"

    .line 115
    invoke-virtual {v0, p0, p5}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 116
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 10

    .line 67
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 68
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    const-string v1, "zip"

    .line 69
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ll/ۧۗ᩻;

    .line 71
    invoke-virtual {v7}, Ll/ۧۗ᩻;->᩷֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7f120ab4

    .line 72
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 75
    :cond_0
    invoke-virtual {v7}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 76
    invoke-static {v4, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 77
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 78
    :cond_1
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v2

    if-nez v2, :cond_2

    .line 79
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v4, v1, v0

    const v2, 0x7f120b8d

    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 516
    invoke-virtual {p1, v1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    .line 82
    :cond_2
    :goto_0
    invoke-virtual {v7}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v1}, Ll/᩹ۨۡ;->֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    move-object v9, v0

    .line 83
    new-instance v1, Ll/᩹ܿ᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v3

    invoke-virtual {v7}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v5

    move-object v2, p0

    move-object v6, v9

    move-object v8, p1

    invoke-direct/range {v1 .. v9}, Ll/᩹ܿ᩻;-><init>(Ll/۫ܿ᩻;Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;Ll/ۧۗ᩻;Ll/ۖۢܳ;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    .line 60
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "net"

    .line 61
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "zip"

    .line 62
    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
