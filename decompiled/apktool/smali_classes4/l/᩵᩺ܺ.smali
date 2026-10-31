.class public final Ll/᩵᩺ܺ;
.super Ljava/lang/Object;
.source "E2OW"


# direct methods
.method public static ֫(D)J
    .locals 3

    .line 64
    invoke-static {p0, p1}, Ll/᩵᩺ܺ;->ۧ(D)Z

    move-result v0

    const-string v1, "not a normal value"

    invoke-static {v1, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/String;Z)V

    .line 65
    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    move-result v0

    .line 66
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p0

    const-wide v1, 0xfffffffffffffL

    and-long/2addr p0, v1

    const/16 v1, -0x3ff

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    shl-long/2addr p0, v0

    return-wide p0

    :cond_0
    const-wide/high16 v0, 0x10000000000000L

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static ۧ(D)Z
    .locals 0

    .line 72
    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    move-result p0

    const/16 p1, 0x3ff

    if-gt p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
