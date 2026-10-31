.class public Lcom/amazonaws/logging/LogFactory;
.super Ljava/lang/Object;
.source "LogFactory.java"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/amazonaws/logging/LogFactory;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized ֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;
    .locals 4

    const-class v0, Lcom/amazonaws/logging/LogFactory;

    monitor-enter v0

    .line 43
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x17

    if-le v1, v2, :cond_0

    const-string v1, "LogFactory"

    .line 85
    invoke-static {v1}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object v1

    const-string v3, "Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels"

    invoke-interface {v1, v3}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 87
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 43
    :cond_0
    invoke-static {p0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;
    .locals 6

    const-class v0, Lcom/amazonaws/logging/LogFactory;

    monitor-enter v0

    .line 84
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x17

    if-le v1, v3, :cond_0

    const-string v1, "LogFactory"

    .line 85
    invoke-static {v1}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/String;)Lcom/amazonaws/logging/Log;

    move-result-object v1

    const-string v4, "Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels"

    invoke-interface {v1, v4}, Lcom/amazonaws/logging/Log;->ᩳ(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 55
    :cond_0
    sget-object v1, Lcom/amazonaws/logging/LogFactory;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amazonaws/logging/Log;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 57
    monitor-exit v0

    return-object v1

    .line 31
    :cond_1
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 32
    array-length v3, v1

    :goto_0
    if-ge v2, v3, :cond_3

    aget-object v4, v1, v2

    .line 33
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "org.junit."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 61
    new-instance v1, Lcom/amazonaws/logging/ConsoleLog;

    invoke-direct {v1, p0}, Lcom/amazonaws/logging/ConsoleLog;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 63
    :cond_3
    new-instance v1, Lcom/amazonaws/logging/AndroidLog;

    invoke-direct {v1, p0}, Lcom/amazonaws/logging/AndroidLog;-><init>(Ljava/lang/String;)V

    .line 65
    :goto_1
    sget-object v2, Lcom/amazonaws/logging/LogFactory;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method
