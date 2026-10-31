.class public final Ll/ۨ᩷۠;
.super Ll/ܿۢ۠;
.source "O44L"


# instance fields
.field public final synthetic ܿ:Ll/ܳۢ۠;


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;Ll/ۛ֡֨;)V
    .locals 0

    .line 472
    iput-object p1, p0, Ll/ۨ᩷۠;->ܿ:Ll/ܳۢ۠;

    .line 473
    invoke-direct {p0, p1, p2}, Ll/ܿۢ۠;-><init>(Ll/ܳۢ۠;Ll/ۛ֡֨;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 495
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "dynamic("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿۢ۠;->ܽ:Ll/ۛ֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()V
    .locals 1

    const-string v0, "this method shouldn\'t be invoked"

    .line 484
    invoke-static {v0}, Ll/۫ۙ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ܽ()Ll/۟᩷۠;
    .locals 5

    .line 487
    iget-object v0, p0, Ll/ܿۢ۠;->ܽ:Ll/ۛ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 488
    iget-object v1, p0, Ll/ۨ᩷۠;->ܿ:Ll/ܳۢ۠;

    iget-object v2, v1, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {v0, v2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v2

    check-cast v2, Ll/ۧ֨֨;

    .line 489
    iget-object v3, v2, Ll/ۧ֨֨;->ۨ:Ll/ۙ֨֨;

    invoke-static {v3}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result v3

    .line 490
    iget-object v4, v1, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    check-cast v0, Ll/ۢ֡֨;

    invoke-virtual {v4, v0, v2}, Ll/֨᩷۠;->֫(Ll/ۢ֡֨;Ll/ۧ֨֨;)V

    .line 491
    invoke-static {v1}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v3

    return-object v0
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 4

    .line 477
    iget-object v0, p0, Ll/ܿۢ۠;->ܽ:Ll/ۛ֡֨;

    iget-object v1, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۜ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 478
    iget-object v1, p0, Ll/ۨ᩷۠;->ܿ:Ll/ܳۢ۠;

    iget-object v2, v1, Ll/ܳۢ۠;->ܳ:Ll/ۛ᩸֨;

    invoke-virtual {v0, v2}, Ll/ۛ֡֨;->ܽ(Ll/ۛ᩸֨;)Ll/ۙ֨֨;

    move-result-object v2

    .line 479
    invoke-static {v2}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result v2

    .line 480
    iget-object v3, v1, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    check-cast v0, Ll/ۡ֡֨;

    invoke-virtual {v3, v0}, Ll/֨᩷۠;->֫(Ll/۠ۢ۠;)V

    .line 481
    invoke-static {v1}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v2

    return-object v0
.end method
