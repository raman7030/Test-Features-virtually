.class public final Ll/ܶ᩺ۡ;
.super Ljava/lang/Object;
.source "38C6"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/Integer;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MTUnixExtraData{link=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    iget-object v1, p0, Ll/ܶ᩺ۡ;->ۧ:Ljava/lang/Integer;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toOctalString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 26
    iput-object p1, p0, Ll/ܶ᩺ۡ;->ۧ:Ljava/lang/Integer;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 22
    iput-object p1, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫([B)V
    .locals 3

    .line 38
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    .line 39
    invoke-virtual {v0}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    and-int/lit8 v1, p1, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 41
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    goto :goto_0

    .line 43
    :cond_0
    iput-object v2, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    .line 47
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۛۧ()I

    move-result p1

    and-int/lit16 p1, p1, 0xfff

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩺ۡ;->ۧ:Ljava/lang/Integer;

    return-void

    .line 49
    :cond_1
    iput-object v2, p0, Ll/ܶ᩺ۡ;->ۧ:Ljava/lang/Integer;

    return-void
.end method

.method public final ֫()[B
    .locals 3

    .line 54
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 56
    invoke-virtual {p0}, Ll/ܶ᩺ۡ;->ܿ()Z

    move-result v1

    .line 59
    invoke-virtual {p0}, Ll/ܶ᩺ۡ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_0

    or-int/lit8 v1, v1, 0x2

    .line 62
    :cond_0
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 63
    invoke-virtual {p0}, Ll/ܶ᩺ۡ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 18
    iget-object v1, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    .line 64
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 66
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩺ۡ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 68
    invoke-virtual {p0}, Ll/ܶ᩺ۡ;->ܽ()I

    move-result v1

    and-int/lit16 v1, v1, 0xfff

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 70
    :cond_2
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ܶ᩺ۡ;->ۧ:Ljava/lang/Integer;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 14
    iget-object v0, p0, Ll/ܶ᩺ۡ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ܶ᩺ۡ;->ۧ:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
