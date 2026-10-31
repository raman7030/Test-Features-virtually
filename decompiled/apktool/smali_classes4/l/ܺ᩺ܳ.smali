.class public final Ll/ܺ᩺ܳ;
.super Ll/֫ۜܳ;
.source "I254"


# direct methods
.method public static varargs ֫([Ljava/lang/String;)Z
    .locals 4

    .line 371
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 372
    invoke-static {v3}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 4

    .line 68
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 69
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 25
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    .line 26
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll/ۖ᩺ܳ;

    invoke-direct {v3, v0, p1}, Ll/ۖ᩺ܳ;-><init>(Ll/ᩳۜܳ;Ll/ۖۢܳ;)V

    invoke-static {v1, v0, v2, v3}, Ll/᩵᩺ܳ;->֫(Lbin/mt/plus/Main;Ll/ᩳۜܳ;Ljava/lang/String;Ll/ᩴ᩺ܳ;)V

    return-void

    :cond_0
    const v0, 0x7f1205c2

    .line 74
    invoke-static {p1, v0}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Ll/֫ۜܳ;->֫(Ll/ۖۢܳ;ILjava/lang/CharSequence;)Ll/֡ۚۢ;

    return-void
.end method

.method public final ܿ(Ll/ۖۢܳ;)V
    .locals 3

    .line 80
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    const-string v1, "local"

    .line 81
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/lang/String;)V

    .line 82
    sget v1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v1, Ll/֨۠ۢ;

    const-class v2, Ll/ۡ᩺ܳ;

    invoke-direct {v1, v2}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 83
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/֨۠ۢ;->ۧ(Ljava/util/List;)V

    .line 84
    invoke-virtual {v1, p1}, Ll/֨۠ۢ;->ۧ(Ll/ۖۢܳ;)V

    const-string v2, "ARG_MSG_FROM"

    .line 85
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "ARG_MSG_TO"

    .line 86
    invoke-virtual {v0}, Ll/ܽۢܳ;->֡()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "targetPath"

    .line 87
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-virtual {v1}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 3

    .line 56
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ll/ܽۢܳ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "local"

    .line 60
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 61
    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 62
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/ܽۢܳ;->֨()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 63
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result p1

    if-ne p1, v1, :cond_2

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
