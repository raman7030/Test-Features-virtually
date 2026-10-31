.class public final Ll/ܽۚ֡;
.super Ljava/lang/Object;
.source "P6LQ"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۧ:Ljava/lang/Class;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܽۚ֡;->֫:Ljava/util/LinkedHashMap;

    .line 22
    const-class v0, Ll/ۘۚ֡;

    iput-object v0, p0, Ll/ܽۚ֡;->ۧ:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Class;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ܽۚ֡;->ۧ:Ljava/lang/Class;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 55
    invoke-static {p1}, Ll/۫֡֡;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 56
    iget-object v0, p0, Ll/ܽۚ֡;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ll/ۘۚ֡;)V
    .locals 1

    .line 43
    invoke-static {p1}, Ll/۫֡֡;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    iget-object v0, p0, Ll/ܽۚ֡;->֫:Ljava/util/LinkedHashMap;

    invoke-static {v0, p1, p2}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ܽۚ֡;)V
    .locals 3

    .line 30
    iget-object p1, p1, Ll/ܽۚ֡;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Ll/ܽۚ֡;->֫:Ljava/util/LinkedHashMap;

    invoke-static {v2, v1, v0}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
