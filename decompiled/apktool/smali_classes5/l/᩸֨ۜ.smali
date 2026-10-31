.class public final synthetic Ll/᩸֨ۜ;
.super Ljava/lang/Object;
.source "K74T"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 2

    .line 2
    check-cast p1, Ll/۬᩺֫;

    .line 493
    iget-object p1, p1, Ll/۬᩺֫;->ܽ:Ll/۠ᩴ֫;

    .line 494
    iget v0, p1, Ll/۠ᩴ֫;->ܽ:I

    if-lez v0, :cond_0

    int-to-long v0, v0

    return-wide v0

    .line 497
    :cond_0
    iget p1, p1, Ll/۠ᩴ֫;->ۨ:I

    if-lez p1, :cond_1

    int-to-long v0, p1

    return-wide v0

    :cond_1
    const-wide v0, 0x7fffffffffffffffL

    return-wide v0
.end method
