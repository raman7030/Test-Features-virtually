.class public final Ll/᩷۟ۡ;
.super Ll/ܳ۟ۡ;
.source "OAR3"


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫([BII)I
    .locals 0

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 247
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot read in this state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ܺ۟ۡ;
    .locals 1

    .line 239
    sget-object v0, Ll/ܺ۟ۡ;->ۙ:Ll/ܺ۟ۡ;

    return-object v0
.end method
