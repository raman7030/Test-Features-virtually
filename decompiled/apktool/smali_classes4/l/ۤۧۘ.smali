.class public final Ll/ۤۧۘ;
.super Ll/᩺ۧۘ;
.source "29DP"


# virtual methods
.method public final ֫(Ll/ᩳۨۖ;)V
    .locals 2

    .line 46
    :cond_0
    iget-object v0, p0, Ll/ۙۧۘ;->֫:Ll/ۙۧۘ;

    invoke-virtual {v0, p1}, Ll/ۙۧۘ;->ܽ(Ll/۠֫ۘ;)V

    .line 48
    :try_start_0
    invoke-virtual {p1}, Ll/ᩳۨۖ;->ܿ()Ll/ᩳۨۖ;

    move-result-object p1
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    return-void

    :catch_0
    move-exception p1

    .line 50
    new-instance v0, Ll/ۖ۟ۖ;

    const-string v1, "Missing compounded message data"

    .line 43
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    throw v0
.end method

.method public final ֫(Ll/۠֫ۘ;)Z
    .locals 1

    .line 26
    instance-of v0, p1, Ll/ᩳۨۖ;

    if-eqz v0, :cond_0

    .line 40
    check-cast p1, Ll/ᩳۨۖ;

    .line 77
    invoke-virtual {p1}, Ll/۠֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p1

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1}, Ll/᩻ۨۖ;->᩷()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
