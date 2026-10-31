.class public final Ll/ۚ۬ᩳ;
.super Ljava/lang/Object;
.source "56UC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/֨۬ᩳ;

.field public ᩸:Z

.field public final ᩹:J


# direct methods
.method public constructor <init>(Ll/֨۬ᩳ;J)V
    .locals 1

    .line 401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 399
    iput-boolean v0, p0, Ll/ۚ۬ᩳ;->᩸:Z

    .line 402
    iput-object p1, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    .line 403
    iput-wide p2, p0, Ll/ۚ۬ᩳ;->᩹:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚ۬ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚ۬ᩳ;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚ۬ᩳ;)Ll/֨۬ᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۚ۬ᩳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ۚ۬ᩳ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 6

    .line 416
    iget-object v0, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    monitor-enter v0

    .line 417
    :try_start_0
    iget-boolean v1, p0, Ll/ۚ۬ᩳ;->᩸:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 418
    iput-boolean v1, p0, Ll/ۚ۬ᩳ;->᩸:Z

    .line 419
    iget-object v1, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    invoke-static {v1}, Ll/֨۬ᩳ;->֫(Ll/֨۬ᩳ;)J

    move-result-wide v2

    iget-wide v4, p0, Ll/ۚ۬ᩳ;->᩹:J

    sub-long/2addr v2, v4

    invoke-static {v1, v2, v3}, Ll/֨۬ᩳ;->֫(Ll/֨۬ᩳ;J)V

    .line 420
    iget-object v1, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 422
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

.method public final ۧ(J)Ll/ۚ۬ᩳ;
    .locals 2

    .line 408
    iget-object v0, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    monitor-enter v0

    .line 409
    :try_start_0
    iget-boolean v1, p0, Ll/ۚ۬ᩳ;->᩸:Z

    if-eqz v1, :cond_0

    .line 410
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 411
    iget-object v0, p0, Ll/ۚ۬ᩳ;->᩶:Ll/֨۬ᩳ;

    .line 145
    invoke-virtual {v0, p1, p2}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p1

    return-object p1

    .line 409
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Workspace reservation is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 410
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
