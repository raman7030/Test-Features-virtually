.class public final Ll/᩶᩹᩻;
.super Ll/֫ۜܳ;
.source "P1ZZ"


# direct methods
.method public static ֫(Ll/᩶᩹᩻;Ll/ۖۢܳ;ILl/ۨۧᩳ;Z)V
    .locals 4

    .line 105
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p0

    .line 106
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    check-cast v0, Ll/ۧۗ᩻;

    .line 107
    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p0

    check-cast p0, Ll/ۧۗ᩻;

    .line 108
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    .line 109
    sget v2, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v2, Ll/֨۠ۢ;

    const-class v3, Ll/᩹᩹᩻;

    invoke-direct {v2, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    const-string v3, "srcZipPath"

    .line 110
    invoke-virtual {v0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "tarZipPath"

    .line 111
    invoke-virtual {p0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "targetPath"

    invoke-virtual {v2, v0, p0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "update"

    .line 113
    invoke-virtual {v2, p2, p0}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    .line 114
    invoke-virtual {v2, v1}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 115
    invoke-virtual {v2, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    .line 116
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p0

    invoke-virtual {v2, p0, p3}, Ll/֨۠ۢ;->֫(Lbin/mt/plus/Main;Ll/ۨۧᩳ;)V

    const-string p0, "keepApkSigBlock"

    .line 117
    invoke-virtual {v2, p0, p4}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 118
    invoke-virtual {v2}, Ll/֨۠ۢ;->֫()I

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 10

    .line 69
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "zip"

    .line 70
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ll/ۧۗ᩻;

    .line 74
    invoke-virtual {v7}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/String;

    .line 75
    invoke-static {v4, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 77
    invoke-virtual {v7}, Ll/ۧۗ᩻;->᩷֫()Z

    move-result v2

    if-eqz v2, :cond_0

    const p1, 0x7f120ab4

    .line 78
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 82
    :cond_0
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

    .line 83
    :cond_1
    invoke-static {}, Ll/ۢ֨ۢ;->᩷()Z

    move-result v2

    if-nez v2, :cond_2

    .line 84
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

    .line 88
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

    .line 89
    new-instance v0, Ll/۠᩹᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v3

    invoke-virtual {v7}, Ll/ۧۗ᩻;->ۜ֫()Z

    move-result v5

    move-object v1, v0

    move-object v2, p0

    move-object v6, v9

    move-object v8, p1

    invoke-direct/range {v1 .. v9}, Ll/۠᩹᩻;-><init>(Ll/᩶᩹᩻;Ll/ܽۢܳ;Ljava/lang/String;ZLjava/lang/String;Ll/ۧۗ᩻;Ll/ۖۢܳ;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v0}, Ll/ۗ۠ܳ;->ᩳ()V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 3

    .line 56
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "zip"

    .line 57
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p1

    check-cast p1, Ll/ۧۗ᩻;

    .line 60
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    check-cast v0, Ll/ۧۗ᩻;

    .line 61
    invoke-virtual {p1}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۧۗ᩻;->ܳ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 62
    invoke-virtual {p1}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->۠()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_1
    return v2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
