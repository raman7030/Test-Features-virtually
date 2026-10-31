.class public final Ll/۬֡֡;
.super Ljava/lang/Object;
.source "F6LO"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬֡֡;->֫:Ljava/util/ArrayList;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/۬֡֡;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;)V
    .locals 2

    .line 39
    new-instance v0, Ll/᩵ܺ֡;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/᩵ܺ֡;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/۬֡֡;->֫:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ֫(Ll/ۚ֨֡;)V
    .locals 3

    .line 20
    iget-object v0, p0, Ll/۬֡֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-interface {p1}, Ll/ۚ֨֡;->ۧ()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 23
    iget-object v2, p0, Ll/۬֡֡;->ۧ:Ljava/util/HashMap;

    invoke-static {v2, v1, p1}, Ll/ܰ۬ᩴ;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/֡ۚ֡;)V
    .locals 2

    .line 35
    new-instance v0, Ll/۫᩻ܳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Ll/۫᩻ܳ;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/۬֡֡;->֫:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ܽ(Ll/֡ۚ֡;)V
    .locals 2

    .line 28
    iget-object v0, p0, Ll/۬֡֡;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ֨֡;

    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0, p1}, Ll/ۚ֨֡;->֫(Ll/֡ۚ֡;)V

    :cond_0
    return-void
.end method
