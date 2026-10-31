.class public final Ll/᩺ۜܺ;
.super Ljava/lang/Object;
.source "JBHC"


# instance fields
.field public final ֫:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/᩺ۜܺ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛۜܺ;)V
    .locals 4

    .line 63
    invoke-virtual {p1}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object p1

    .line 64
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۜܺ;

    .line 47
    invoke-virtual {v0}, Ll/ۖۜܺ;->֫()Ll/ۘۜܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘۜܺ;->֫()Ljava/lang/String;

    move-result-object v1

    .line 48
    iget-object v2, p0, Ll/᩺ۜܺ;->֫:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨۜܺ;

    if-nez v3, :cond_0

    .line 51
    new-instance v3, Ll/ۨۜܺ;

    invoke-direct {v3, v0, v1}, Ll/ۨۜܺ;-><init>(Ll/ۖۜܺ;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v3, v0}, Ll/ۨۜܺ;->֫(Ll/ۖۜܺ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 4

    .line 75
    iget-object v0, p0, Ll/᩺ۜܺ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    const-string v2, "\nstatistics:\n"

    .line 79
    invoke-virtual {p1, v1, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 81
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 83
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۜܺ;

    .line 84
    invoke-static {v2}, Ll/ۨۜܺ;->֫(Ll/ۨۜܺ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨۜܺ;

    .line 88
    invoke-virtual {v1, p1}, Ll/ۨۜܺ;->֫(Ll/ᩳᩴܺ;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method
