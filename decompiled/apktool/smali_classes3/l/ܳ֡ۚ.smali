.class public final Ll/ܳ֡ۚ;
.super Ljava/lang/IllegalArgumentException;
.source "C3HZ"


# static fields
.field public static final ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    const-class v0, Ll/ܿ֡ۚ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܳ֡ۚ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 21
    :try_start_0
    invoke-super {p0}, Ljava/lang/IllegalArgumentException;->fillInStackTrace()Ljava/lang/Throwable;

    .line 23
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v1, v5

    .line 26
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ll/ܳ֡ۚ;->᩸:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    new-array v1, v4, [Ljava/lang/StackTraceElement;

    .line 30
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/StackTraceElement;

    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
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
