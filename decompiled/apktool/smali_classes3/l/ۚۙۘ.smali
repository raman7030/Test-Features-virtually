.class public final Ll/ۚۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 6

    .line 311
    check-cast p2, Ll/ۡۚ֡;

    .line 316
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v0

    const-class v1, Ll/ۡۚ֡;

    invoke-interface {v0, v1}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 318
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    return-void

    .line 322
    :cond_0
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v1

    .line 324
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 327
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 328
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v2

    const v3, 0xfffc

    invoke-virtual {v2, v3}, Ll/ᩳۙۘ;->append(C)V

    .line 331
    :cond_1
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܽ()Ll/ᩴ᩶ۘ;

    move-result-object v2

    .line 333
    invoke-virtual {p2}, Ll/֡ۚ֡;->ᩳ()Ll/֡ۚ֡;

    move-result-object v3

    .line 334
    instance-of v3, v3, Ll/ۖۚ֡;

    .line 337
    invoke-virtual {v2}, Ll/ᩴ᩶ۘ;->ۧ()Ll/ۧ᩺ۘ;

    move-result-object v4

    .line 338
    invoke-virtual {p2}, Ll/ۡۚ֡;->᩷()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v4

    .line 345
    sget-object v5, Ll/ܶۨۘ;->֫:Ll/ۨ᩶ۘ;

    invoke-virtual {v5, v4, p2}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 346
    sget-object p2, Ll/ܶۨۘ;->ܽ:Ll/ۨ᩶ۘ;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p2, v4, v3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 347
    sget-object p2, Ll/ܶۨۘ;->ۧ:Ll/ۨ᩶ۘ;

    const/4 v3, 0x0

    invoke-virtual {p2, v4, v3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 349
    invoke-interface {v0, v2, v4}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ll/ۗ᩶ۘ;->֫(ILjava/lang/Object;)V

    return-void
.end method
