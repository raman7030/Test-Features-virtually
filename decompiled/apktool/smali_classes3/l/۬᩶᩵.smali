.class public final Ll/۬᩶᩵;
.super Ljava/lang/Object;
.source "JAJQ"

# interfaces
.implements Ljava/lang/Iterable;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 115
    instance-of v0, p1, Ll/۬᩶᩵;

    if-eqz v0, :cond_1

    .line 112
    invoke-virtual {p0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    .line 115
    move-object v0, p1

    check-cast v0, Ll/۬᩶᩵;

    .line 112
    invoke-virtual {v0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v0

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    check-cast p1, Ll/۬᩶᩵;

    invoke-virtual {p0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v0

    invoke-virtual {p1}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getLast()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final hashCode()I
    .locals 7

    const-wide/16 v0, 0x1

    .line 112
    invoke-virtual {p0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/16 v0, 0x1f

    int-to-long v0, v0

    .line 119
    invoke-virtual {p0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v2

    invoke-virtual {p0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v4

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    add-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 5

    .line 168
    new-instance v0, Ll/ۗ᩶᩵;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ۗ᩶᩵;-><init>(JJ)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "1.."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۬᩶᩵;->getLast()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
