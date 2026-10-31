.class public final Ll/ᩴܽ;
.super Ljava/lang/Object;
.source "G9LE"


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public final ۧ:Ljava/lang/Object;

.field public final ܽ:Ljava/util/ArrayList;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll/ۗۧ;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ᩴܽ;->֫:Ljava/util/concurrent/Executor;

    .line 56
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܽ;->ۧ:Ljava/lang/Object;

    .line 77
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ᩴܽ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 152
    iget-object v0, p0, Ll/ᩴܽ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 153
    :try_start_0
    iput-boolean v1, p0, Ll/ᩴܽ;->ᩳ:Z

    .line 154
    iget-object v1, p0, Ll/ᩴܽ;->ܽ:Ljava/util/ArrayList;

    .line 192
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫᩹᩵;

    .line 154
    invoke-interface {v2}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    goto :goto_0

    .line 155
    :cond_0
    iget-object v1, p0, Ll/ᩴܽ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 156
    sget-object v1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۧ()Z
    .locals 2

    .line 73
    iget-object v0, p0, Ll/ᩴܽ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll/ᩴܽ;->ᩳ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
