.class public final synthetic Ll/۬ܰܺ;
.super Ljava/lang/Object;
.source "L2X9"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic ᩸:Ljava/util/concurrent/Executor;

.field public final synthetic ᩹:Ll/ܿܰܺ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Ll/ܿܰܺ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ܰܺ;->᩸:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll/۬ܰܺ;->᩹:Ll/ܿܰܺ;

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/۬ܰܺ;->᩸:Ljava/util/concurrent/Executor;

    .line 1068
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 1070
    iget-object v0, p0, Ll/۬ܰܺ;->᩹:Ll/ܿܰܺ;

    invoke-virtual {v0, p1}, Ll/ܿܰܺ;->֫(Ljava/lang/Throwable;)Z

    return-void
.end method
