.class public final synthetic Ll/ۙۗ᩻;
.super Ljava/lang/Object;
.source "D7B1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۧ۬᩻;

.field public final synthetic ᩹:Ljava/util/concurrent/FutureTask;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ۬᩻;Ljava/util/concurrent/FutureTask;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۗ᩻;->᩸:Ll/ۧ۬᩻;

    iput-object p2, p0, Ll/ۙۗ᩻;->᩹:Ljava/util/concurrent/FutureTask;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۙۗ᩻;->᩹:Ljava/util/concurrent/FutureTask;

    .line 185
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۗ᩻;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 190
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "Unable to load workspaces"

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1}, Ll/ܰۗ᩻;->֫(Ljava/lang/Exception;)Ll/ܰۗ᩻;

    move-result-object v0

    .line 193
    :goto_0
    new-instance v1, Ll/ۤۗ᩻;

    iget-object v2, p0, Ll/ۙۗ᩻;->᩸:Ll/ۧ۬᩻;

    invoke-direct {v1, v2, v0}, Ll/ۤۗ᩻;-><init>(Ll/ۧ۬᩻;Ll/ܰۗ᩻;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 187
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    return-void
.end method
