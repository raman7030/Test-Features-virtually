.class public final Ll/ۘۤܳ;
.super Ljava/lang/Object;
.source "57TP"


# instance fields
.field public volatile ֫:Z

.field public volatile ۧ:Z

.field public final ܽ:Ljava/lang/Object;

.field public volatile ܿ:Ljava/lang/Object;

.field public volatile ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 222
    iput-boolean v0, p0, Ll/ۘۤܳ;->ۧ:Z

    .line 223
    iput-boolean v0, p0, Ll/ۘۤܳ;->֫:Z

    .line 224
    iput-boolean v0, p0, Ll/ۘۤܳ;->ᩳ:Z

    .line 225
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۘۤܳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 255
    iget-object v0, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 256
    :try_start_0
    iput-boolean v1, p0, Ll/ۘۤܳ;->֫:Z

    .line 257
    iget-object v1, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 258
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 2

    .line 234
    iget-object v0, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 235
    :try_start_0
    iget-boolean v1, p0, Ll/ۘۤܳ;->֫:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ۘۤܳ;->ᩳ:Z

    if-nez v1, :cond_0

    .line 236
    iput-object p1, p0, Ll/ۘۤܳ;->ܿ:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 237
    iput-boolean p1, p0, Ll/ۘۤܳ;->ۧ:Z

    .line 238
    iget-object v1, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 239
    monitor-exit v0

    return p1

    :cond_0
    const/4 p1, 0x0

    .line 241
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 242
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۧ()V
    .locals 2

    .line 262
    iget-object v0, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 263
    :try_start_0
    iput-boolean v1, p0, Ll/ۘۤܳ;->ᩳ:Z

    .line 264
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 2

    .line 246
    iget-object v0, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 247
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Ll/ۘۤܳ;->ۧ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ۘۤܳ;->֫:Z

    if-nez v1, :cond_0

    .line 248
    iget-object v1, p0, Ll/ۘۤܳ;->ܽ:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    goto :goto_0

    .line 250
    :cond_0
    iget-boolean v1, p0, Ll/ۘۤܳ;->ۧ:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۘۤܳ;->ܿ:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 251
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
