.class public final Ll/֡᩵ۧ;
.super Ljava/lang/Object;
.source "98J9"


# direct methods
.method public static ֫(Ll/ۚ᩵ۧ;[Ljava/lang/String;Ljava/util/Map;)Ll/ۚ᩵ۧ;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p0, :cond_3

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    array-length v2, p1

    if-ne v2, v1, :cond_1

    .line 59
    aget-object p0, p1, v0

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۚ᩵ۧ;

    return-object p0

    .line 60
    :cond_1
    array-length v2, p1

    if-le v2, v1, :cond_5

    .line 62
    new-instance p0, Ll/ۚ᩵ۧ;

    invoke-direct {p0}, Ll/ۚ᩵ۧ;-><init>()V

    .line 63
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_2

    aget-object v2, p1, v0

    .line 64
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ᩵ۧ;

    invoke-virtual {p0, v2}, Ll/ۚ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p0

    :cond_3
    if-eqz p1, :cond_4

    .line 69
    array-length v2, p1

    if-ne v2, v1, :cond_4

    .line 71
    aget-object p1, p1, v0

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩵ۧ;

    invoke-virtual {p0, p1}, Ll/ۚ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)V

    return-object p0

    :cond_4
    if-eqz p1, :cond_5

    .line 72
    array-length v2, p1

    if-le v2, v1, :cond_5

    .line 74
    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_5

    aget-object v2, p1, v0

    .line 75
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ᩵ۧ;

    invoke-virtual {p0, v2}, Ll/ۚ᩵ۧ;->֫(Ll/ۚ᩵ۧ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-object p0
.end method
