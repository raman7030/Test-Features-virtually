.class public final synthetic Ll/᩺᩵ᩳ;
.super Ljava/lang/Object;
.source "G6MK"

# interfaces
.implements Ljava/util/concurrent/Executor;


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "SessionRecoveryDiagnostics"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
