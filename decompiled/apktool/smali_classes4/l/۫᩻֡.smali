.class public final Ll/۫᩻֡;
.super Ll/֨ۜ֡;
.source "ZAUU"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "~"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    iget-object v1, p0, Ll/֨ۜ֡;->ܽ:Ll/᩻᩷֡;

    invoke-virtual {v1}, Ll/᩻᩷֡;->toString()Ljava/lang/String;

    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final ֫(II)Z
    .locals 0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    .line 34
    iget-object p2, p0, Ll/֨ۜ֡;->ܽ:Ll/᩻᩷֡;

    invoke-virtual {p2, p1}, Ll/᩻᩷֡;->ۧ(I)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
