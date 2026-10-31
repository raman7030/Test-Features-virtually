.class public final Ll/֡۠ܽ;
.super Ljava/lang/RuntimeException;
.source "X6W3"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Regex execution memory limit exceeded"

    const/4 v1, 0x0

    .line 2852
    invoke-direct {p0, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 2859
    monitor-exit v0

    return-object p0
.end method
