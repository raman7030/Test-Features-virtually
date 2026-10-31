.class public final Ll/ۛܽ᩻;
.super Ll/֫ۜܳ;
.source "B942"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 6

    .line 31
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    .line 32
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v1

    .line 33
    instance-of v2, v1, Ll/ܿۜ᩻;

    if-eqz v2, :cond_0

    .line 34
    new-instance v2, Ll/ۗ᩹᩷;

    invoke-direct {v2, v0}, Ll/ۗ᩹᩷;-><init>(Ll/ۗܺ᩷;)V

    .line 35
    move-object v0, v1

    check-cast v0, Ll/ܺۘܳ;

    invoke-virtual {v0}, Ll/ܺۘܳ;->᩺()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۗ᩹᩷;->֫(Ljava/lang/String;)V

    new-instance v3, Ll/ۨ᩹᩷;

    sget-object v4, Ll/ۘۘܳ;->ۧ:Ll/ۘۘܳ;

    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-static {v1}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v1

    .line 36
    invoke-direct {v3, v1}, Ll/ۨ᩹᩷;-><init>(Ll/᩶ۖܳ;)V

    invoke-virtual {v2, v3}, Ll/ۗ᩹᩷;->֫(Ll/ۨ᩹᩷;)V

    const-string v1, "open-ns"

    .line 37
    invoke-virtual {v2, v1}, Ll/ۗ᩹᩷;->ۧ(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۗ᩹᩷;->ܽ(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v2}, Ll/ۗ᩹᩷;->֫()V

    .line 40
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object p1

    check-cast p1, Ll/ۚۡ᩻;

    invoke-virtual {p1}, Ll/ۚۡ᩻;->ܳ֫()I

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۗ᩹᩷;->֫(I)V

    .line 41
    invoke-virtual {v0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result p1

    invoke-virtual {v2, p1}, Ll/ۗ᩹᩷;->֫(Z)V

    .line 42
    invoke-virtual {v2}, Ll/ۗ᩹᩷;->ۧ()V

    return-void

    .line 45
    :cond_0
    invoke-interface {v1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    const-string v2, "locate"

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz p1, :cond_1

    new-array p1, v4, [Ljava/lang/String;

    const-string v4, "goto"

    aput-object v4, p1, v3

    aput-object v2, p1, v5

    goto :goto_0

    :cond_1
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/String;

    aput-object v2, p1, v3

    const-string v2, "locate-click"

    aput-object v2, p1, v5

    const-string v2, "edit-text"

    aput-object v2, p1, v4

    const/4 v2, 0x3

    const-string v3, "exec-script"

    aput-object v3, p1, v2

    const/4 v2, 0x4

    const-string v3, "preview-html"

    aput-object v3, p1, v2

    .line 50
    :goto_0
    new-instance v2, Ll/ۗ᩹᩷;

    invoke-direct {v2, v0}, Ll/ۗ᩹᩷;-><init>(Ll/ۗܺ᩷;)V

    .line 51
    invoke-interface {v1}, Ll/ᩳۜܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ۗ᩹᩷;->֫(Ljava/lang/String;)V

    new-instance v0, Ll/ۨ᩹᩷;

    sget-object v3, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    .line 52
    invoke-virtual {v3, v1}, Ll/᩷ۧ᩻;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object v3

    invoke-direct {v0, v3}, Ll/ۨ᩹᩷;-><init>(Ll/᩶ۖܳ;)V

    invoke-virtual {v2, v0}, Ll/ۗ᩹᩷;->֫(Ll/ۨ᩹᩷;)V

    .line 53
    invoke-virtual {v2, p1}, Ll/ۗ᩹᩷;->֫([Ljava/lang/String;)V

    .line 54
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ۗ᩹᩷;->ܽ(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v2}, Ll/ۗ᩹᩷;->֫()V

    .line 56
    invoke-virtual {v2}, Ll/ۗ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 23
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "net"

    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
