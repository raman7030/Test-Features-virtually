.class public final Ll/ܺۜ᩵;
.super Ljava/lang/Object;
.source "86PR"

# interfaces
.implements Ljava/security/PrivilegedAction;


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 3

    .line 157
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getThreadGroup()Ljava/lang/ThreadGroup;

    move-result-object v0

    .line 158
    :goto_0
    invoke-virtual {v0}, Ljava/lang/ThreadGroup;->getParent()Ljava/lang/ThreadGroup;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 160
    :cond_0
    new-instance v1, Ljava/lang/ThreadGroup;

    const-string v2, "InnocuousFJWorkerThreadGroup"

    invoke-direct {v1, v0, v2}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/String;)V

    return-object v1
.end method
