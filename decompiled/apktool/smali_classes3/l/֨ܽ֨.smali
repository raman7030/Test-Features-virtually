.class public final Ll/֨ܽ֨;
.super Ll/ۢܽ֨;
.source "87EI"


# instance fields
.field public ۗ֫:S

.field public ۙ֫:Ljava/lang/String;

.field public ۬֫:S


# virtual methods
.method public final ۧ(II)V
    .locals 5

    const/4 p2, 0x1

    .line 260
    invoke-virtual {p0, p2}, Ll/ۢܽ֨;->ᩳ(I)V

    if-nez p1, :cond_0

    .line 50
    invoke-virtual {p0}, Ll/֨ܽ֨;->ܺ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    .line 52
    :cond_0
    iget-object p1, p0, Ll/֨ܽ֨;->ۙ֫:Ljava/lang/String;

    iget-short v0, p0, Ll/֨ܽ֨;->ۗ֫:S

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    iget-short v1, p0, Ll/֨ܽ֨;->۬֫:S

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "line"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    aput-object v0, v2, p2

    const/4 p2, 0x2

    aput-object v1, v2, p2

    .line 19
    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 3

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ll/ܶۨۚ;->ۧᩳ:Ll/ܶۨۚ;

    const-string v2, ":"

    .line 0
    invoke-static {v1, v0, v2}, Ll/᩸ܳۡ;->֫(Ll/ܶۨۚ;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Ll/ۢܽ֨;->ܿ֫:Z

    return v0
.end method

.method public final ᩳ(II)V
    .locals 0

    .line 70
    invoke-virtual {p0, p1, p2}, Ll/֨ܽ֨;->ۧ(II)V

    return-void
.end method
