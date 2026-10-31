.class public final Ll/᩻۫;
.super Ljava/lang/Object;
.source "Z3CI"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public ܽ:Ll/ܳ۫;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    move-object v0, p0

    .line 74
    monitor-enter v0

    .line 75
    :try_start_0
    iget-boolean v1, p0, Ll/᩻۫;->ۧ:Z

    if-eqz v1, :cond_0

    .line 76
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 78
    iput-boolean v1, p0, Ll/᩻۫;->ۧ:Z

    .line 79
    iput-boolean v1, p0, Ll/᩻۫;->֫:Z

    .line 80
    iget-object v1, p0, Ll/᩻۫;->ܽ:Ll/ܳ۫;

    .line 82
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 86
    :try_start_1
    invoke-interface {v1}, Ll/ܳ۫;->֫()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v0, p0

    .line 92
    monitor-enter v0

    .line 93
    :try_start_2
    iput-boolean v2, p0, Ll/᩻۫;->֫:Z

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 95
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    throw v1

    :catchall_1
    move-exception v1

    .line 95
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :cond_1
    :goto_0
    move-object v0, p0

    .line 92
    monitor-enter v0

    .line 93
    :try_start_4
    iput-boolean v2, p0, Ll/᩻۫;->֫:Z

    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 95
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v1

    :catchall_3
    move-exception v1

    .line 82
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw v1
.end method

.method public final ֫(Ll/ܳ۫;)V
    .locals 2

    move-object v0, p0

    .line 116
    monitor-enter v0

    .line 155
    :catch_0
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/᩻۫;->֫:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 157
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 119
    :cond_0
    :try_start_2
    iget-object v1, p0, Ll/᩻۫;->ܽ:Ll/ܳ۫;

    if-ne v1, p1, :cond_1

    .line 120
    monitor-exit v0

    goto :goto_1

    .line 122
    :cond_1
    iput-object p1, p0, Ll/᩻۫;->ܽ:Ll/ܳ۫;

    .line 123
    iget-boolean v1, p0, Ll/᩻۫;->ۧ:Z

    if-eqz v1, :cond_2

    .line 126
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    invoke-interface {p1}, Ll/ܳ۫;->֫()V

    return-void

    .line 124
    :cond_2
    :try_start_3
    monitor-exit v0

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 126
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
