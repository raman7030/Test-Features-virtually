.class public final Ll/᩺ᩴܺ;
.super Ll/ۛᩴܺ;
.source "2B8B"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴܺ;->ܽ:Ljava/util/HashMap;

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴܺ;->֫:Ljava/util/HashMap;

    .line 35
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴܺ;->ۧ:Ljava/util/HashMap;

    .line 38
    iput-object p2, p0, Ll/᩺ᩴܺ;->ᩳ:Ljava/lang/String;

    .line 39
    iput-object p1, p0, Ll/᩺ᩴܺ;->ܿ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫᩵ܺ;
    .locals 11

    .line 56
    iget-object v0, p0, Ll/᩺ᩴܺ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 57
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    move-object v10, v0

    goto :goto_1

    .line 59
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 60
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 61
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ll/۟ᩴܺ;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-direct {v4, v2}, Ll/۟ᩴܺ;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v10, v1

    .line 65
    :goto_1
    new-instance v0, Ll/֫᩵ܺ;

    iget-object v8, p0, Ll/᩺ᩴܺ;->ܽ:Ljava/util/HashMap;

    iget-object v9, p0, Ll/᩺ᩴܺ;->֫:Ljava/util/HashMap;

    iget-object v6, p0, Ll/᩺ᩴܺ;->ܿ:Ljava/lang/String;

    iget-object v7, p0, Ll/᩺ᩴܺ;->ᩳ:Ljava/lang/String;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Ll/֫᩵ܺ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/Map;)V

    return-object v0
.end method

.method public final ֫(Ll/ܳ᩵ܺ;)Ll/᩺ᩴܺ;
    .locals 2

    .line 44
    invoke-virtual {p1}, Ll/ܳ᩵ܺ;->֫()Z

    move-result v0

    iget-object v1, p1, Ll/ܳ᩵ܺ;->֫:Ll/ܿ᩵ܺ;

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Ll/᩺ᩴܺ;->ܽ:Ljava/util/HashMap;

    check-cast v1, Ll/ܽ᩵ܺ;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 47
    :cond_0
    iget-object v0, p0, Ll/᩺ᩴܺ;->֫:Ljava/util/HashMap;

    check-cast v1, Ll/ۧ᩵ܺ;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(Ll/᩷᩵ܺ;Ll/ܽ᩵ܺ;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 78
    new-instance v0, Ll/᩻ۛ᩷;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/᩻ۛ᩷;-><init>(I)V

    .line 79
    iget-object v1, p0, Ll/᩺ᩴܺ;->ۧ:Ljava/util/HashMap;

    invoke-static {v1, p4, v0}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v1, Ll/ܰᩴܺ;

    invoke-direct {v1, p1, p2, p3, p4}, Ll/ܰᩴܺ;-><init>(Ll/᩷᩵ܺ;Ll/ܽ᩵ܺ;Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
