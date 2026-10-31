.class public final Ll/ۗܺ֫;
.super Ljava/lang/Object;
.source "L5VY"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۗܺ֫;->֫:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۚܺ֫;
    .locals 1

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Ll/ۗܺ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܺ֫;

    return-object p1
.end method

.method public final ֫()V
    .locals 3

    .line 71
    iget-object v0, p0, Ll/ۗܺ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚܺ֫;

    .line 72
    invoke-virtual {v2}, Ll/ۚܺ֫;->֫()V

    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ۚܺ֫;)V
    .locals 1

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    .line 11
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Ll/ۗܺ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܺ֫;

    if-eqz p1, :cond_0

    .line 45
    invoke-virtual {p1}, Ll/ۚܺ֫;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ۧ()Ljava/util/HashSet;
    .locals 2

    .line 64
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Ll/ۗܺ֫;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method
