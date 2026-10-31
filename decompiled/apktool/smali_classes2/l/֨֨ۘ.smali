.class public final Ll/֨֨ۘ;
.super Ljava/lang/Object;
.source "U8CE"


# static fields
.field public static ֫:D


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    const-wide v0, 0x407b800000000000L    # 440.0

    .line 29
    sput-wide v0, Ll/֨֨ۘ;->֫:D

    return-void
.end method

.method public static ֫(D)D
    .locals 2

    .line 49
    sget-wide v0, Ll/֨֨ۘ;->֫:D

    div-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    mul-double p0, p0, v0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    div-double/2addr p0, v0

    const-wide v0, 0x4051400000000000L    # 69.0

    add-double/2addr p0, v0

    return-wide p0
.end method

.method public static ۧ(D)D
    .locals 2

    const-wide v0, 0x4051400000000000L    # 69.0

    sub-double/2addr p0, v0

    const-wide v0, 0x3fb5555555555555L    # 0.08333333333333333

    mul-double p0, p0, v0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 57
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    sget-wide v0, Ll/֨֨ۘ;->֫:D

    mul-double p0, p0, v0

    return-wide p0
.end method
