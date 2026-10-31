.class public final Ll/ᩳۛ᩵;
.super Ll/ۗۗ᩵;
.source "VANM"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ll/ܿ۬᩵;


# instance fields
.field public volatile runningWorkers:I

.field public final ۗ:I

.field public final ۙ:Ll/ۗۗ᩵;

.field public final ۫:Ljava/lang/Object;

.field public final ۬:Ll/ۢۛ᩵;

.field public final synthetic ᩶:Ll/ܿ۬᩵;


# direct methods
.method public constructor <init>(Ll/ۗۗ᩵;I)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ll/ۗۗ᩵;-><init>()V

    .line 17
    iput-object p1, p0, Ll/ᩳۛ᩵;->ۙ:Ll/ۗۗ᩵;

    .line 18
    iput p2, p0, Ll/ᩳۛ᩵;->ۗ:I

    .line 19
    instance-of p2, p1, Ll/ܿ۬᩵;

    if-eqz p2, :cond_0

    check-cast p1, Ll/ܿ۬᩵;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {}, Ll/ᩳ۬᩵;->֫()Ll/ܿ۬᩵;

    move-result-object p1

    :cond_1
    iput-object p1, p0, Ll/ᩳۛ᩵;->᩶:Ll/ܿ۬᩵;

    .line 24
    new-instance p1, Ll/ۢۛ᩵;

    invoke-direct {p1}, Ll/ۢۛ᩵;-><init>()V

    iput-object p1, p0, Ll/ᩳۛ᩵;->۬:Ll/ۢۛ᩵;

    .line 27
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۛ᩵;->۫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :goto_0
    const/4 v0, 0x0

    .line 39
    :cond_0
    iget-object v1, p0, Ll/ᩳۛ᩵;->۬:Ll/ۢۛ᩵;

    invoke-virtual {v1}, Ll/ۢۛ᩵;->ܽ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    .line 42
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 44
    sget-object v2, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    invoke-static {v1, v2}, Ll/ۛۗ᩵;->֫(Ljava/lang/Throwable;Ll/ܳ᩸᩵;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 47
    iget-object v1, p0, Ll/ᩳۛ᩵;->ۙ:Ll/ۗۗ᩵;

    invoke-virtual {v1}, Ll/ۗۗ᩵;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 50
    iget-object v0, p0, Ll/ᩳۛ᩵;->ۙ:Ll/ۗۗ᩵;

    invoke-virtual {v0, p0, p0}, Ll/ۗۗ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V

    return-void

    .line 56
    :cond_1
    iget-object v0, p0, Ll/ᩳۛ᩵;->۫:Ljava/lang/Object;

    .line 20
    monitor-enter v0

    .line 57
    :try_start_1
    iget v1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    .line 58
    iget-object v1, p0, Ll/ᩳۛ᩵;->۬:Ll/ۢۛ᩵;

    invoke-virtual {v1}, Ll/ۢۛ᩵;->ۧ()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_2

    monitor-exit v0

    return-void

    .line 59
    :cond_2
    :try_start_2
    iget v1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    .line 61
    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V
    .locals 1

    .line 100
    iget-object p1, p0, Ll/ᩳۛ᩵;->۬:Ll/ۢۛ᩵;

    invoke-virtual {p1, p2}, Ll/ۢۛ᩵;->֫(Ljava/lang/Runnable;)Z

    .line 101
    iget p1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    iget p2, p0, Ll/ᩳۛ᩵;->ۗ:I

    if-lt p1, p2, :cond_0

    return-void

    .line 92
    :cond_0
    iget-object p1, p0, Ll/ᩳۛ᩵;->۫:Ljava/lang/Object;

    move-object v0, p1

    .line 20
    monitor-enter v0

    .line 93
    :try_start_0
    iget p1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    iget p2, p0, Ll/ᩳۛ᩵;->ۗ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt p1, p2, :cond_1

    monitor-exit v0

    return-void

    .line 94
    :cond_1
    :try_start_1
    iget p1, p0, Ll/ᩳۛ᩵;->runningWorkers:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩳۛ᩵;->runningWorkers:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    monitor-exit v0

    .line 67
    iget-object p1, p0, Ll/ᩳۛ᩵;->ۙ:Ll/ۗۗ᩵;

    invoke-virtual {p1, p0, p0}, Ll/ۗۗ᩵;->֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    .line 95
    monitor-exit v0

    throw p1
.end method
