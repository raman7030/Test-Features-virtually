.class public final Ll/ۙۛۡ;
.super Ljava/lang/Object;
.source "OAHP"


# direct methods
.method public static ֫(Z)Ljava/util/Map;
    .locals 1

    if-eqz p0, :cond_0

    .line 53
    new-instance p0, Ll/ۢ֡ᩴ;

    new-instance v0, Ll/᩶ۛۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, v0}, Ll/ۢ֡ᩴ;-><init>(Ll/ۡ᩺ۘ;)V

    return-object p0

    .line 65
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0
.end method

.method public static ۧ(Z)Ljava/util/Set;
    .locals 1

    if-eqz p0, :cond_0

    .line 35
    new-instance p0, Ll/ۜۚᩴ;

    new-instance v0, Ll/᩹ۛۡ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, v0}, Ll/ۜۚᩴ;-><init>(Ll/ۡ᩺ۘ;)V

    return-object p0

    .line 47
    :cond_0
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    return-object p0
.end method
