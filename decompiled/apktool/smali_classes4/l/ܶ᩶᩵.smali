.class public final Ll/ܶ᩶᩵;
.super Ljava/lang/Object;
.source "JAXP"


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 109
    instance-of p1, p1, Ll/ܶ᩶᩵;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 7

    const-wide/16 v0, 0x0

    .line 0
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    const/16 v4, 0x20

    ushr-long v5, v2, v4

    xor-long/2addr v2, v5

    long-to-int v3, v2

    mul-int/lit8 v3, v3, 0x1f

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    ushr-long v4, v0, v4

    xor-long/2addr v0, v4

    long-to-int v1, v0

    add-int/2addr v3, v1

    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "0.0..0.0"

    return-object v0
.end method
