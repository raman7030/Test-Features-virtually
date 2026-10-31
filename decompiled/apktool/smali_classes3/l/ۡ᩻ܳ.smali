.class public final Ll/ۡ᩻ܳ;
.super Ljava/lang/Object;
.source "X202"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۡ᩻ܳ;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ll/ۖۢܳ;)Ll/֫ۜܳ;
    .locals 2

    .line 21
    invoke-virtual {p0}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    .line 22
    invoke-virtual {p0}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p0

    .line 24
    sget-object v1, Ll/ۡ᩻ܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ۗ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {p0}, Ll/ܽ᩷ܳ;->ۗ()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۢ᩻ܳ;

    if-eqz p0, :cond_0

    .line 28
    invoke-interface {p0}, Ll/ۢ᩻ܳ;->create()Ll/֫ۜܳ;

    move-result-object p0

    return-object p0

    .line 32
    :cond_0
    invoke-static {}, Ll/᩹ۚܳ;->᩻()Ll/᩹ۚܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۢ᩻ܳ;)V
    .locals 2

    .line 12
    sget-object v0, Ll/ۡ᩻ܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_0

    .line 14
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :cond_0
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
