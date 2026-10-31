.class public final Ll/ܰ۫ۖ;
.super Ljava/lang/Object;
.source "29H7"


# direct methods
.method public static ֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;
    .locals 4

    .line 75
    invoke-virtual {p0}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    .line 76
    invoke-virtual {p0}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v2

    const/16 p0, 0x20

    shl-long/2addr v2, p0

    or-long/2addr v0, v2

    .line 78
    new-instance p0, Ll/᩺۫ۖ;

    invoke-direct {p0, v0, v1}, Ll/᩺۫ۖ;-><init>(J)V

    return-object p0
.end method

.method public static ֫(Ll/᩺۫ۖ;Ll/ۤܰۖ;)V
    .locals 6

    .line 87
    invoke-virtual {p0}, Ll/᩺۫ۖ;->֫()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 88
    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ۧ(J)V

    const/16 p0, 0x20

    shr-long/2addr v0, p0

    and-long/2addr v0, v2

    .line 89
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    return-void
.end method
