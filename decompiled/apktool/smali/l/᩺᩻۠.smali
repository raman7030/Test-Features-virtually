.class public final Ll/᩺᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 4

    .line 851
    iget-object p1, p2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_0

    move-object p2, p1

    .line 853
    :cond_0
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/32 v2, 0x20000

    or-long/2addr v0, v2

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    return-void
.end method
