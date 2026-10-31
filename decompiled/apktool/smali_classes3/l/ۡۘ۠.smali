.class public final Ll/ۡۘ۠;
.super Ljava/lang/Object;
.source "W7S0"


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܺۘ۠;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iget-object p1, p1, Ll/ܺۘ۠;->ۧ:Ll/᩹ܶ۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۡۘ۠;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;)Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۡۘ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢۘ۠;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    .line 72
    :cond_0
    iget-object p1, p1, Ll/ۢۘ۠;->֫:Ll/ۚۘ۠;

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    .line 78
    :cond_1
    invoke-interface {p1}, Ll/ۚۘ۠;->getText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/ۚۘ۠;)V
    .locals 1

    .line 93
    new-instance v0, Ll/ۢۘ۠;

    invoke-direct {v0, p2}, Ll/ۢۘ۠;-><init>(Ll/ۚۘ۠;)V

    iget-object p2, p0, Ll/ۡۘ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۢۚ۠;)Z
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۡۘ۠;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
