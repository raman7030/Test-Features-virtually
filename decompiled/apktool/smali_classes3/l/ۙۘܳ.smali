.class public final synthetic Ll/ۙۘܳ;
.super Ljava/lang/Object;
.source "OAYY"

# interfaces
.implements Ll/֨ۡ֫;


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ljava/util/List;

    .line 74
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/ۚ۫ܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۚ۫ܿ;-><init>(I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
