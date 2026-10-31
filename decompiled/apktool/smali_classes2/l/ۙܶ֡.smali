.class public final Ll/ۙܶ֡;
.super Ljava/lang/Object;
.source "C5R9"


# direct methods
.method public static ֫(Ll/ۗ᩵ۚ;J)V
    .locals 5

    const-wide/16 v0, 0x0

    const/16 v2, 0x4c

    const/4 v3, 0x0

    cmp-long v4, p1, v0

    if-gez v4, :cond_0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x3

    const-string v1, "-0x"

    .line 116
    invoke-virtual {p0, v1, v3, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    neg-long v0, p1

    .line 51
    invoke-virtual {p0, v0, v1}, Ll/ۗ᩵ۚ;->ۧ(J)V

    const-wide/32 v0, -0x80000000

    cmp-long v3, p1, v0

    if-gez v3, :cond_1

    .line 53
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(I)V

    return-void

    .line 56
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    const-string v1, "0x"

    .line 116
    invoke-virtual {p0, v1, v3, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 57
    invoke-virtual {p0, p1, p2}, Ll/ۗ᩵ۚ;->ۧ(J)V

    const-wide/32 v0, 0x7fffffff

    cmp-long v3, p1, v0

    if-lez v3, :cond_1

    .line 59
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(I)V

    :cond_1
    return-void
.end method
