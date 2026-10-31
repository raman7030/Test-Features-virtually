.class public final synthetic Ll/᩶᩵ۢ;
.super Ljava/lang/Object;
.source "I7BH"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 2
    check-cast p1, Ll/۟᩵ۢ;

    .line 4
    check-cast p2, Ll/۟᩵ۢ;

    .line 1288
    invoke-static {p1}, Ll/۟᩵ۢ;->ۡ(Ll/۟᩵ۢ;)Z

    move-result v0

    invoke-static {p2}, Ll/۟᩵ۢ;->ۡ(Ll/۟᩵ۢ;)Z

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1289
    invoke-static {p1}, Ll/۟᩵ۢ;->ۡ(Ll/۟᩵ۢ;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 1291
    :cond_0
    invoke-static {p1}, Ll/۟᩵ۢ;->ۡ(Ll/۟᩵ۢ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1292
    invoke-static {p1}, Ll/۟᩵ۢ;->ܽ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "keep_both"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 1293
    invoke-static {p2}, Ll/۟᩵ۢ;->ܽ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1

    .line 1298
    :cond_2
    invoke-static {p1}, Ll/۟᩵ۢ;->ܳ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ll/۟᩵ۢ;->ܳ(Ll/۟᩵ۢ;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method
