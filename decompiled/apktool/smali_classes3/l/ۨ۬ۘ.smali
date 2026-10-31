.class public final Ll/ۨ۬ۘ;
.super Ljava/lang/Object;
.source "I8ZW"


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/ۨ۬ۘ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֫᩺᩵;
    .locals 2

    .line 139
    iget-boolean v0, p0, Ll/ۨ۬ۘ;->֫:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 129
    iput-boolean v0, p0, Ll/ۨ۬ۘ;->֫:Z

    .line 133
    iget-object v0, p0, Ll/ۨ۬ۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 134
    new-instance v1, Ll/᩺۬ۘ;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/᩺۬ۘ;-><init>(Ljava/util/Map;)V

    return-object v1

    .line 135
    :cond_0
    new-instance v0, Ll/ܰ۬ۘ;

    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, Ll/֫᩺᩵;-><init>(I)V

    return-object v0

    .line 140
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Builder has been already built"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/۟۬ۘ;)V
    .locals 4

    .line 145
    invoke-virtual {p1}, Ll/۟۬ۘ;->֫()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 146
    iget-object v2, p0, Ll/ۨ۬ۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 147
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/۟۬ۘ;)V
    .locals 3

    .line 139
    iget-boolean v0, p0, Ll/ۨ۬ۘ;->֫:Z

    if-nez v0, :cond_1

    .line 104
    invoke-virtual {p1}, Ll/۟۬ۘ;->֫()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 105
    iget-object v2, p0, Ll/ۨ۬ۘ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void

    .line 140
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Builder has been already built"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
