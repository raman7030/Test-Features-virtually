.class public final Ll/۟ۤ᩵;
.super Ljava/lang/Object;
.source "FANM"


# static fields
.field public static final ֫:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 23
    :try_start_0
    const-class v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const-string v1, "setRemoveOnCancelPolicy"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    .line 24
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    sput-object v0, Ll/۟ۤ᩵;->֫:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final ֫(Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 32
    :try_start_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    .line 33
    :cond_1
    sget-object v0, Ll/۟ۤ᩵;->֫:Ljava/lang/reflect/Method;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_1
    return-void
.end method
