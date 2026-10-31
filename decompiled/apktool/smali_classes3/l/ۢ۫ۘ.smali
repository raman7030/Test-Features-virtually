.class public final Ll/ۢ۫ۘ;
.super Ljava/util/ArrayList;
.source "XBJ6"


# virtual methods
.method public final ܽ()Z
    .locals 1

    .line 20
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
