.class public abstract Ll/ۗܶᩳ;
.super Ljava/lang/Object;
.source "29AZ"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 38
    move-object v0, p0

    check-cast v0, Ll/ۙܶᩳ;

    .line 58
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 3

    .line 44
    move-object v0, p0

    check-cast v0, Ll/ۙܶᩳ;

    .line 58
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const-string v0, ""

    return-object v0

    .line 46
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
