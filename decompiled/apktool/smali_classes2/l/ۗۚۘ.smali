.class public final Ll/ۗۚۘ;
.super Ll/᩷֨ۘ;
.source "88A4"


# direct methods
.method public constructor <init>(Ll/ۢ֨ۘ;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Ll/᩷֨ۘ;-><init>(Ll/ۢ֨ۘ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۗۚۘ;Ll/ۤۚۘ;[Ll/᩹ۚۘ;)Ll/ۨۚۘ;
    .locals 0

    .line 60
    invoke-virtual {p0, p1, p2}, Ll/᩷֨ۘ;->֫(Ll/ۤۚۘ;[Ll/᩹ۚۘ;)Ll/ۨۚۘ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    if-eqz p1, :cond_1

    const-string v0, "\\\\"

    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 136
    :goto_0
    new-instance v0, Ll/᩶ۚۘ;

    .line 55
    new-instance v1, Ll/᩻֨ۘ;

    .line 49
    invoke-direct {v1}, Ll/ۜ֨ۘ;-><init>()V

    .line 56
    invoke-virtual {v1, p1}, Ll/ۜ֨ۘ;->֫(Ljava/lang/String;)V

    .line 136
    invoke-direct {v0, p0, v1}, Ll/᩶ۚۘ;-><init>(Ll/ۗۚۘ;Ll/᩻֨ۘ;)V

    invoke-virtual {v0}, Ll/ۙۚۘ;->֫()V

    invoke-virtual {v0}, Ll/ۙۚۘ;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    .line 133
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Server name must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
