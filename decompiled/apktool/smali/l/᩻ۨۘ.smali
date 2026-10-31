.class public final Ll/᩻ۨۘ;
.super Ljava/lang/Object;
.source "P8ZS"


# instance fields
.field public ֫:Ll/ۚۨۘ;

.field public ۧ:Ljava/util/concurrent/ExecutorService;

.field public ܽ:Z

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/᩻ۨۘ;->ܿ:Ljava/util/HashMap;

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/᩻ۨۘ;->ᩳ:Ljava/util/HashMap;

    .line 34
    invoke-static {}, Ll/۟ۨۘ;->ۧ()Ll/۟ۨۘ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩻ۨۘ;->֫(Ll/۫ۨۘ;)V

    .line 32
    new-instance v0, Ll/ܿ᩺ۘ;

    .line 36
    invoke-direct {v0}, Ll/۫ۨۘ;-><init>()V

    .line 35
    invoke-virtual {p0, v0}, Ll/᩻ۨۘ;->֫(Ll/۫ۨۘ;)V

    .line 39
    invoke-static {}, Ll/ܳ᩺ۘ;->֫()Ll/ܳ᩺ۘ;

    move-result-object v0

    .line 114
    iget-boolean v1, p0, Ll/᩻ۨۘ;->ܽ:Z

    const-string v2, "ImagesPlugin has already been configured and cannot be modified any further"

    if-nez v1, :cond_3

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "image/svg+xml"

    .line 81
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 64
    iget-object v4, p0, Ll/᩻ۨۘ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, Ll/ᩳ᩺ۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 43
    invoke-static {}, Ll/ܽ᩺ۘ;->֫()Ll/ܽ᩺ۘ;

    move-result-object v0

    .line 114
    iget-boolean v1, p0, Ll/᩻ۨۘ;->ܽ:Z

    if-nez v1, :cond_1

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "image/gif"

    .line 77
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 64
    iget-object v3, p0, Ll/᩻ۨۘ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 115
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 30
    :cond_2
    new-instance v0, Ll/ۚۨۘ;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۚۨۘ;-><init>(Landroid/content/res/Resources;)V

    .line 46
    iput-object v0, p0, Ll/᩻ۨۘ;->֫:Ll/ۚۨۘ;

    return-void

    .line 115
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/۫ۨۘ;)V
    .locals 3

    .line 114
    iget-boolean v0, p0, Ll/᩻ۨۘ;->ܽ:Z

    if-nez v0, :cond_1

    .line 56
    invoke-virtual {p1}, Ll/۫ۨۘ;->֫()Ljava/util/Collection;

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

    .line 57
    iget-object v2, p0, Ll/᩻ۨۘ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void

    .line 115
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ImagesPlugin has already been configured and cannot be modified any further"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
