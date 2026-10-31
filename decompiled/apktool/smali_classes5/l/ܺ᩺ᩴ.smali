.class public final Ll/ܺ᩺ᩴ;
.super Ll/᩹᩺ᩴ;
.source "N673"


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 823
    iget-wide v0, p0, Ll/᩹᩺ᩴ;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹᩺ᩴ;->b:J

    return-void
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 812
    iget-wide v0, p0, Ll/᩹᩺ᩴ;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final i(Ll/ᩳܿ᩵;)V
    .locals 4

    .line 820
    check-cast p1, Ll/᩹᩺ᩴ;

    .line 817
    iget-wide v0, p0, Ll/᩹᩺ᩴ;->b:J

    iget-wide v2, p1, Ll/᩹᩺ᩴ;->b:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹᩺ᩴ;->b:J

    return-void
.end method
