.class public final Ll/᩻ۘ֡;
.super Ljava/lang/Object;
.source "SAHW"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ll/᩻ۘ֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 58
    new-instance v0, Ljava/lang/Thread;

    const/4 v1, 0x0

    const-string v2, "commons-pool-evictor"

    invoke-direct {v0, v1, p1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 59
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 60
    new-instance p1, Ll/ܳۘ֡;

    invoke-direct {p1, v0}, Ll/ܳۘ֡;-><init>(Ljava/lang/Thread;)V

    invoke-static {p1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    return-object v0
.end method
