.class public final Ll/ۤ᩹;
.super Ll/֫᩶;
.source "268P"


# instance fields
.field public ۜ:Z

.field public ܳ:Z

.field public final ܿ:Landroid/os/PowerManager$WakeLock;

.field public final ᩳ:Landroid/content/Context;

.field public final ᩻:Landroid/os/PowerManager$WakeLock;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;Landroid/content/ComponentName;)V
    .locals 3

    .line 167
    invoke-direct {p0, p2}, Ll/֫᩶;-><init>(Landroid/content/ComponentName;)V

    .line 168
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩹;->ᩳ:Landroid/content/Context;

    const-string v0, "power"

    .line 172
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":launch"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 173
    invoke-virtual {p1, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩹;->ܿ:Landroid/os/PowerManager$WakeLock;

    const/4 v2, 0x0

    .line 175
    invoke-virtual {v0, v2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":run"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 176
    invoke-virtual {p1, v1, p2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩹;->᩻:Landroid/os/PowerManager$WakeLock;

    .line 178
    invoke-virtual {p1, v2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    move-object v0, p0

    .line 228
    monitor-enter v0

    .line 229
    :try_start_0
    iget-boolean v1, p0, Ll/ۤ᩹;->ۜ:Z

    if-eqz v1, :cond_1

    .line 232
    iget-boolean v1, p0, Ll/ۤ᩹;->ܳ:Z

    if-eqz v1, :cond_0

    .line 233
    iget-object v1, p0, Ll/ۤ᩹;->ܿ:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v2, 0xea60

    invoke-virtual {v1, v2, v3}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    :cond_0
    const/4 v1, 0x0

    .line 235
    iput-boolean v1, p0, Ll/ۤ᩹;->ۜ:Z

    .line 236
    iget-object v1, p0, Ll/ۤ᩹;->᩻:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 238
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(Landroid/content/Intent;)V
    .locals 3

    .line 183
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 184
    iget-object p1, p0, Ll/֫᩶;->֫:Landroid/content/ComponentName;

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 186
    iget-object p1, p0, Ll/ۤ᩹;->ᩳ:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_1

    move-object v0, p0

    .line 187
    monitor-enter v0

    .line 188
    :try_start_0
    iget-boolean p1, p0, Ll/ۤ᩹;->ܳ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 189
    iput-boolean p1, p0, Ll/ۤ᩹;->ܳ:Z

    .line 190
    iget-boolean p1, p0, Ll/ۤ᩹;->ۜ:Z

    if-nez p1, :cond_0

    .line 196
    iget-object p1, p0, Ll/ۤ᩹;->ܿ:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v1, 0xea60

    invoke-virtual {p1, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 199
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 4

    move-object v0, p0

    .line 214
    monitor-enter v0

    .line 216
    :try_start_0
    iget-boolean v1, p0, Ll/ۤ᩹;->ۜ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 217
    iput-boolean v1, p0, Ll/ۤ᩹;->ۜ:Z

    .line 220
    iget-object v1, p0, Ll/ۤ᩹;->᩻:Landroid/os/PowerManager$WakeLock;

    const-wide/32 v2, 0x927c0

    invoke-virtual {v1, v2, v3}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 221
    iget-object v1, p0, Ll/ۤ᩹;->ܿ:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 223
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 2

    move-object v0, p0

    .line 205
    monitor-enter v0

    const/4 v1, 0x0

    .line 208
    :try_start_0
    iput-boolean v1, p0, Ll/ۤ᩹;->ܳ:Z

    .line 209
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
