.class public final synthetic Ll/۬۬ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static forEachRemaining(Ljava/util/Iterator;Ljava/util/function/Consumer;)V
    .locals 1

    instance-of v0, p0, Ll/۫۬ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/۫۬ᩴ;

    invoke-interface {p0, p1}, Ll/۫۬ᩴ;->forEachRemaining(Ljava/util/function/Consumer;)V

    return-void

    .line 131
    :cond_0
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method
