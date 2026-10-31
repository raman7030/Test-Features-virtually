.class public final Ll/֨ۤۖ;
.super Ljava/lang/Object;
.source "19KT"

# interfaces
.implements Ll/᩵ۤۖ;
.implements Ll/ᩴۤۖ;


# virtual methods
.method public final ֫(Ll/ۤܰۖ;)Ll/֡ۤۖ;
    .locals 2

    .line 536
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    long-to-int p1, v0

    .line 537
    new-instance v0, Ll/ۜۛۖ;

    invoke-direct {v0, p1}, Ll/ۜۛۖ;-><init>(I)V

    return-object v0
.end method

.method public final ֫()Ll/ۧۤۖ;
    .locals 1

    .line 189
    sget-object v0, Ll/ۧۤۖ;->᩶֫:Ll/ۧۤۖ;

    return-object v0
.end method

.method public final ֫(Ll/ۡۛۖ;Ll/֡֫ۘ;)V
    .locals 4

    .line 186
    check-cast p1, Ll/ۜۛۖ;

    .line 199
    invoke-virtual {p1}, Ll/ۜۛۖ;->֫()I

    move-result p1

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    return-void
.end method
