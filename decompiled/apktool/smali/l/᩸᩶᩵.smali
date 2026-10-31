.class public final Ll/᩸᩶᩵;
.super Ljava/lang/Object;
.source "JAXP"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 190
    instance-of p1, p1, Ll/᩸᩶᩵;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/4 v0, 0x0

    .line 0
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "0.0..0.0"

    return-object v0
.end method
