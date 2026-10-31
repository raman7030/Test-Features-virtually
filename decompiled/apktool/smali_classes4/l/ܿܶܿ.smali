.class public final Ll/ܿܶܿ;
.super Ljava/lang/RuntimeException;
.source "O99Y"


# static fields
.field public static final ᩸:Ll/ܿܶܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 6
    new-instance v0, Ll/ܿܶܿ;

    const-string v1, "Permission denied"

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    sput-object v0, Ll/ܿܶܿ;->᩸:Ll/ܿܶܿ;

    return-void
.end method


# virtual methods
.method public final declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    new-array v1, v1, [Ljava/lang/StackTraceElement;

    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
