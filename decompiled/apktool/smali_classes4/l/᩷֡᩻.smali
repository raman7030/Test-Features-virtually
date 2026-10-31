.class public final Ll/᩷֡᩻;
.super Ljava/lang/Object;
.source "67G0"


# direct methods
.method public static ֫(Ljava/lang/Exception;)Ll/ۜ֡᩻;
    .locals 3

    .line 56
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩷֡᩻;->֫(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 21
    new-instance p0, Ll/ۜ֡᩻;

    sget-object v0, Ll/ܺ֡᩻;->᩹:Ll/ܺ֡᩻;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, v1}, Ll/ۜ֡᩻;-><init>(Ll/ܺ֡᩻;Ljava/lang/Throwable;Z)V

    return-object p0

    .line 49
    :cond_0
    new-instance v0, Ll/ۜ֡᩻;

    sget-object v2, Ll/ܺ֡᩻;->ۗ:Ll/ܺ֡᩻;

    invoke-direct {v0, v2, p0, v1}, Ll/ۜ֡᩻;-><init>(Ll/ܺ֡᩻;Ljava/lang/Throwable;Z)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Throwable;)Z
    .locals 1

    .line 66
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0}, Ll/᩷֡᩻;->ۧ(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ljava/lang/Throwable;Ljava/util/Set;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 70
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 73
    :cond_0
    instance-of v1, p0, Ll/ۖۛۖ;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    .line 76
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object v1

    array-length v3, v1

    :goto_0
    if-ge v0, v3, :cond_3

    aget-object v4, v1, v0

    .line 77
    invoke-static {v4, p1}, Ll/᩷֡᩻;->֫(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0, p1}, Ll/᩷֡᩻;->֫(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result p0

    return p0

    :cond_4
    :goto_1
    return v0
.end method

.method public static ۧ(Ljava/lang/Throwable;Ljava/util/Set;)Z
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 85
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 88
    :cond_0
    instance-of v1, p0, Ll/֨ۨۖ;

    if-eqz v1, :cond_2

    move-object v1, p0

    check-cast v1, Ll/֨ۨۖ;

    .line 89
    invoke-virtual {v1}, Ll/֨ۨۖ;->֫()Ll/᩺ۛۖ;

    move-result-object v2

    .line 90
    sget-object v3, Ll/᩺ۛۖ;->ᩳ֫:Ll/᩺ۛۖ;

    if-ne v2, v3, :cond_1

    .line 91
    invoke-virtual {v1}, Ll/֨ۨۖ;->ۧ()J

    move-result-wide v3

    sget-object v5, Ll/۟۫ۖ;->᩶:Ll/۟۫ۖ;

    invoke-virtual {v5}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_1

    goto :goto_1

    .line 94
    :cond_1
    sget-object v3, Ll/᩺ۛۖ;->ܰ:Ll/᩺ۛۖ;

    if-ne v2, v3, :cond_2

    .line 95
    invoke-virtual {v1}, Ll/֨ۨۖ;->ۧ()J

    move-result-wide v1

    .line 111
    sget-object v3, Ll/۟۫ۖ;->ۧۧ:Ll/۟۫ۖ;

    invoke-virtual {v3}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    sget-object v3, Ll/۟۫ۖ;->ۚ֫:Ll/۟۫ۖ;

    .line 112
    invoke-virtual {v3}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-eqz v5, :cond_3

    sget-object v3, Ll/۟۫ۖ;->۟֫:Ll/۟۫ۖ;

    .line 113
    invoke-virtual {v3}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_2

    goto :goto_1

    .line 99
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object v1

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_5

    aget-object v3, v1, v0

    .line 100
    invoke-static {v3, p1}, Ll/᩷֡᩻;->ۧ(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 104
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0, p1}, Ll/᩷֡᩻;->ۧ(Ljava/lang/Throwable;Ljava/util/Set;)Z

    move-result p0

    return p0

    :cond_6
    :goto_2
    return v0
.end method
