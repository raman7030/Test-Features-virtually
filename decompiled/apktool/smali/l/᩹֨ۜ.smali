.class public final synthetic Ll/᩹֨ۜ;
.super Ljava/lang/Object;
.source "K74T"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 4

    .line 2
    check-cast p1, Ll/۬᩺֫;

    .line 501
    iget-object p1, p1, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    iget v0, p1, Ll/۠ᩴ֫;->᩷֫:I

    .line 502
    iget p1, p1, Ll/۠ᩴ֫;->۠:I

    if-lez v0, :cond_0

    if-lez p1, :cond_0

    int-to-long v0, v0

    int-to-long v2, p1

    mul-long v0, v0, v2

    return-wide v0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method
