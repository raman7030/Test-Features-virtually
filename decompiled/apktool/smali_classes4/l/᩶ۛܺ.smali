.class public final Ll/᩶ۛܺ;
.super Ljava/lang/Object;
.source "05O1"


# direct methods
.method public static ֫(Ljava/lang/Iterable;Ljava/util/Comparator;)Z
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    instance-of v0, p0, Ljava/util/SortedSet;

    if-eqz v0, :cond_0

    .line 42
    check-cast p0, Ljava/util/SortedSet;

    .line 55
    invoke-interface {p0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object p0

    if-nez p0, :cond_1

    .line 172
    sget-object p0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    goto :goto_0

    .line 43
    :cond_0
    instance-of v0, p0, Ll/᩹ۛܺ;

    if-eqz v0, :cond_2

    .line 44
    check-cast p0, Ll/᩹ۛܺ;

    invoke-interface {p0}, Ll/᩹ۛܺ;->comparator()Ljava/util/Comparator;

    move-result-object p0

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p1, p0}, Ljava/util/Comparator;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
