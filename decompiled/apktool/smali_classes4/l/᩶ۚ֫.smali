.class public final Ll/᩶ۚ֫;
.super Ljava/lang/Object;
.source "93Z4"


# static fields
.field public static final ֫:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 132
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    .line 195
    sget-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 76
    :try_start_0
    invoke-static {p0, v1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 199
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_1

    .line 329
    :cond_0
    sget-object p0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    move-object p0, p1

    :goto_0
    if-eqz p0, :cond_2

    .line 362
    :try_start_0
    instance-of v1, p0, Ljava/net/UnknownHostException;

    if-eqz v1, :cond_1

    const-string p0, "UnknownHostException (no network)"

    .line 338
    monitor-exit v0

    goto :goto_1

    .line 365
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    goto :goto_0

    .line 342
    :cond_2
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const-string p1, "\t"

    const-string v1, "    "

    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    :goto_1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "\n"

    const-string v0, "\n  "

    .line 354
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    :cond_3
    return-void

    :catchall_0
    move-exception p0

    .line 344
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    .line 288
    sget-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 91
    :try_start_0
    invoke-static {p0, v1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    .line 304
    sget-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 91
    :try_start_0
    invoke-static {p0, p1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 308
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    .line 226
    sget-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 81
    :try_start_0
    invoke-static {p0, v1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    .line 273
    sget-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 86
    :try_start_0
    invoke-static {p0, p1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 277
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/dataflow/qual/Pure;
    .end annotation

    .line 257
    sget-object v0, Ll/᩶ۚ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 86
    :try_start_0
    invoke-static {p0, v1}, Ll/᩶ۚ֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
