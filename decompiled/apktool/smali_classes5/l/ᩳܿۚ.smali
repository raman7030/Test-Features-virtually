.class public Ll/ᩳܿۚ;
.super Ljava/lang/Object;
.source "55CR"

# interfaces
.implements Ll/ܿܿۚ;
.implements Ll/۫ܽۚ;


# instance fields
.field public final ᩸:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-wide p1, p0, Ll/ᩳܿۚ;->᩸:D

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 43
    check-cast p1, Ll/ۤܽۚ;

    const/16 v0, 0x11

    .line 61
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 63
    :cond_0
    check-cast p1, Ll/۫ܽۚ;

    invoke-interface {p1}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v0

    iget-wide v2, p0, Ll/ᩳܿۚ;->᩸:D

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 52
    instance-of v0, p1, Ll/۫ܽۚ;

    if-eqz v0, :cond_0

    .line 53
    iget-wide v0, p0, Ll/ᩳܿۚ;->᩸:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    check-cast p1, Ll/۫ܽۚ;

    .line 54
    invoke-interface {p1}, Ll/۫ܽۚ;->getValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getValue()D
    .locals 2

    .line 53
    iget-wide v0, p0, Ll/ᩳܿۚ;->᩸:D

    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    .line 53
    iget-wide v0, p0, Ll/ᩳܿۚ;->᩸:D

    .line 46
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public final ۖ()I
    .locals 1

    const/16 v0, 0x11

    return v0
.end method
