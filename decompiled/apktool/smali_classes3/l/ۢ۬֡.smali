.class public abstract Ll/ۢ۬֡;
.super Ljava/lang/Object;
.source "G683"

# interfaces
.implements Ll/ۚ֫ۚ;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 40
    instance-of v0, p1, Ll/ۚ֫ۚ;

    if-eqz v0, :cond_0

    .line 41
    check-cast p1, Ll/ۚ֫ۚ;

    .line 42
    invoke-interface {p0}, Ll/ۚ֫ۚ;->֫()I

    move-result v0

    invoke-interface {p1}, Ll/ۚ֫ۚ;->֫()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 43
    invoke-interface {p0}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v0

    invoke-interface {p1}, Ll/ۚ֫ۚ;->ܽ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 44
    invoke-interface {p0}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Ll/ۚ֫ۚ;->ۧ()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
