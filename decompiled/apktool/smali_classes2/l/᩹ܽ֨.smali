.class public final Ll/᩹ܽ֨;
.super Ll/ܶܽ֨;
.source "17C0"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ܺ()Ljava/lang/String;
    .locals 3

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ll/ܶۨۚ;->᩻ᩳ:Ll/ܶۨۚ;

    const-string v2, ":"

    .line 0
    invoke-static {v1, v0, v2}, Ll/᩸ܳۡ;->֫(Ll/ܶۨۚ;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Ll/ۢܽ֨;->ۜ֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۢܽ֨;->ᩴ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
