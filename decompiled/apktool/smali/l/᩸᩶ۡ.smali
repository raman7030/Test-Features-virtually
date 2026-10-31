.class public abstract Ll/᩸᩶ۡ;
.super Ljava/lang/Object;
.source "VBK3"

# interfaces
.implements Ljava/lang/Cloneable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 408
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 411
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 439
    instance-of v0, p1, Ll/᩸᩶ۡ;

    if-eqz v0, :cond_1

    .line 440
    check-cast p1, Ll/᩸᩶ۡ;

    .line 441
    invoke-virtual {p0}, Ll/᩸᩶ۡ;->getX()D

    move-result-wide v0

    invoke-virtual {p1}, Ll/᩸᩶ۡ;->getX()D

    move-result-wide v2

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p0}, Ll/᩸᩶ۡ;->getY()D

    move-result-wide v0

    invoke-virtual {p1}, Ll/᩸᩶ۡ;->getY()D

    move-result-wide v2

    cmpl-double p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 443
    :cond_1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public abstract getX()D
.end method

.method public abstract getY()D
.end method

.method public final hashCode()I
    .locals 6

    .line 421
    invoke-virtual {p0}, Ll/᩸᩶ۡ;->getX()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .line 422
    invoke-virtual {p0}, Ll/᩸᩶ۡ;->getY()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    const-wide/16 v4, 0x1f

    mul-long v2, v2, v4

    xor-long/2addr v0, v2

    long-to-int v2, v0

    const/16 v3, 0x20

    shr-long/2addr v0, v3

    long-to-int v1, v0

    xor-int v0, v2, v1

    return v0
.end method

.method public abstract ֫(DD)V
.end method
