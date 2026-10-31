.class public final synthetic Ll/ۗۜᩴ;
.super Ljava/lang/Object;
.source "OBP8"


# direct methods
.method public static ֫(Ll/۬ۜᩴ;Ljava/lang/Integer;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 123
    invoke-interface {p0, p1}, Ll/۬ۜᩴ;->֫(I)Z

    move-result v0

    .line 124
    invoke-interface {p0, p1, p2}, Ll/۬ۜᩴ;->֫(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/۬ۜᩴ;Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 192
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Ll/۬ۜᩴ;->֫(I)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 139
    invoke-interface {p0, p1}, Ll/۬ۜᩴ;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ll/۬ۜᩴ;->ܽ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-interface {p0, p1}, Ll/۬ۜᩴ;->֫(I)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ܽ(Ll/۬ۜᩴ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 165
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 166
    invoke-interface {p0, p1}, Ll/۬ۜᩴ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0, p1}, Ll/۬ۜᩴ;->remove(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method
