.class public abstract Ll/ᩴ۠۠;
.super Ljava/lang/Object;
.source "37P4"


# virtual methods
.method public ֫(Ljava/util/Collection;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ۠۠;

    .line 72
    invoke-interface {v0, p0, p2}, Ll/ۘ۠۠;->֫(Ll/ᩴ۠۠;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public abstract ֫(Ll/ۡ۠۠;Ll/ۢ۠۠;Ll/ۢ۠۠;Ljava/lang/Object;)V
.end method

.method public abstract ֫(Ll/ۢ۠۠;Ljava/lang/Object;)V
.end method
