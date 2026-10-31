.class public final synthetic Ll/ܳۗۜ;
.super Ljava/lang/Object;
.source "274A"

# interfaces
.implements Ll/ۨܶ֫;


# virtual methods
.method public final ֫(Ll/ۗ۠֫;)Ljava/lang/String;
    .locals 1

    .line 107
    iget-object p1, p1, Ll/ۗ۠֫;->ܿ:Ljava/lang/String;

    if-eqz p1, :cond_0

    return-object p1

    .line 108
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Media cache key is missing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
