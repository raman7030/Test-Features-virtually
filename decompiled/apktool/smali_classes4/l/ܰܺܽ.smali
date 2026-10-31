.class public final Ll/ܰܺܽ;
.super Ll/ۤܺܽ;
.source "S5VI"

# interfaces
.implements Ljava/lang/Iterable;


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 34
    new-instance v0, Ll/᩺ܺܽ;

    invoke-direct {v0, p0}, Ll/᩺ܺܽ;-><init>(Ll/ܰܺܽ;)V

    return-object v0
.end method

.method public final ֫(I)Ll/ۨܺܽ;
    .locals 7

    .line 12
    new-instance v0, Ll/ۨܺܽ;

    .line 88
    iget-object v1, p0, Ll/ۤܺܽ;->ۗ:Ll/ۙܺܽ;

    iget-object v2, v1, Ll/ۙܺܽ;->ܽ:[Ll/ۤܺܽ;

    iget v3, p0, Ll/ۤܺܽ;->᩹:I

    aget-object v2, v2, v3

    .line 12
    check-cast v2, Ll/ۛܺܽ;

    int-to-long v3, p1

    iget-wide v5, p0, Ll/ۤܺܽ;->᩸:J

    mul-long v3, v3, v5

    iget-wide v5, p0, Ll/ۤܺܽ;->ۙ:J

    add-long/2addr v3, v5

    long-to-int p1, v3

    invoke-direct {v0, v1, v2, p1}, Ll/ۨܺܽ;-><init>(Ll/ۙܺܽ;Ll/ۛܺܽ;I)V

    return-object v0
.end method
