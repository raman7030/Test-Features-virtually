.class public final Ll/ܰۘ᩵;
.super Ljava/lang/Object;
.source "79ZP"

# interfaces
.implements Ll/ܳۚ᩵;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ᩶:I

.field public ᩸:Ljava/lang/String;

.field public ᩹:Ljava/lang/String;


# virtual methods
.method public final getAttributes()I
    .locals 1

    const/16 v0, 0x11

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ܰۘ᩵;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 2

    .line 58
    iget v0, p0, Ll/ܰۘ᩵;->᩶:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    return v0

    :cond_0
    const/4 v0, 0x4

    return v0
.end method

.method public final length()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 105
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ServerInfo1[name="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܰۘ᩵;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",versionMajor="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܰۘ᩵;->ۙ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",versionMinor="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܰۘ᩵;->ۗ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",type=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܰۘ᩵;->᩶:I

    const/16 v3, 0x8

    const-string v4, ",commentOrMasterBrowser="

    .line 0
    invoke-static {v2, v3, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 107
    iget-object v2, p0, Ll/ܰۘ᩵;->᩸:Ljava/lang/String;

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 107
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۚ()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
