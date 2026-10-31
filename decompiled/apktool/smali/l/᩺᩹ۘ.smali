.class public final Ll/᩺᩹ۘ;
.super Ll/ܽ᩶ۘ;
.source "Q99V"


# virtual methods
.method public final ֫(Ll/ᩴ۟᩵;)Ljava/lang/Object;
    .locals 2

    .line 14
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v1, 0x194

    if-ne v0, v1, :cond_0

    .line 15
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 17
    :cond_0
    invoke-static {p1}, Ll/ܽ᩶ۘ;->ۧ(Ll/ᩴ۟᩵;)V

    .line 18
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method
