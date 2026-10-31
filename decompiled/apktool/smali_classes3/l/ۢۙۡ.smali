.class public final Ll/ۢۙۡ;
.super Ll/ۖ᩹ۢ;
.source "Q1UG"

# interfaces
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ۧ:Ll/ᩳۙۡ;

.field public final ܽ:Ll/֨ۙۡ;


# direct methods
.method public constructor <init>(Ll/֨ۙۡ;Ll/ᩳۙۡ;)V
    .locals 1

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 21
    iput-object p1, p0, Ll/ۢۙۡ;->ܽ:Ll/֨ۙۡ;

    .line 22
    iput-object p2, p0, Ll/ۢۙۡ;->ۧ:Ll/ᩳۙۡ;

    return-void
.end method

.method public static ۧ(Ll/۫ۗۡ;)Ljava/lang/String;
    .locals 0

    .line 107
    invoke-static {p0}, Ll/ܺۙۡ;->ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩴ۬ۡ;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۫ۗۡ;)V
    .locals 5

    .line 29
    invoke-virtual {p1}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {v0}, Ll/᩺ۤۡ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    iget-object v1, p0, Ll/ۢۙۡ;->ۧ:Ll/ᩳۙۡ;

    sget-object v2, Ll/ۧۙۡ;->ۧ:Ll/ܽۙۡ;

    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_1

    .line 78
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 79
    invoke-virtual {v1, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_1
    invoke-static {p1}, Ll/ۢۙۡ;->ۧ(Ll/۫ۗۡ;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 59
    iget-object v1, p0, Ll/ۢۙۡ;->ܽ:Ll/֨ۙۡ;

    invoke-virtual {v1}, Ll/֨ۙۡ;->ۧ()V

    .line 62
    :cond_2
    invoke-virtual {v1}, Ll/֨ۙۡ;->֫()Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 67
    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    invoke-static {p1}, Ll/ܺۙۡ;->ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;

    move-result-object p1

    invoke-interface {p1, v2}, Ll/ᩴ۬ۡ;->֫(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method
