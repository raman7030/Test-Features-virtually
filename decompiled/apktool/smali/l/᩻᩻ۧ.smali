.class public final Ll/᩻᩻ۧ;
.super Landroid/view/Surface;
.source "N8TR"


# static fields
.field public static ۗ:Z

.field public static ۙ:I


# instance fields
.field public ᩶:Z

.field public final ᩸:Z

.field public final ᩹:Ll/ܳ᩻ۧ;


# direct methods
.method public constructor <init>(Ll/ܳ᩻ۧ;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    .line 97
    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 98
    iput-object p1, p0, Ll/᩻᩻ۧ;->᩹:Ll/ܳ᩻ۧ;

    .line 99
    iput-boolean p3, p0, Ll/᩻᩻ۧ;->᩸:Z

    return-void
.end method

.method public static ֫(Landroid/content/Context;Z)Ll/᩻᩻ۧ;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 90
    invoke-static {p0}, Ll/᩻᩻ۧ;->֫(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 91
    new-instance p0, Ll/ܳ᩻ۧ;

    const-string v1, "ExoPlayer:PlaceholderSurface"

    .line 150
    invoke-direct {p0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    .line 92
    sget v0, Ll/᩻᩻ۧ;->ۙ:I

    :cond_2
    invoke-virtual {p0, v0}, Ll/ܳ᩻ۧ;->֫(I)Ll/᩻᩻ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized ֫(Landroid/content/Context;)Z
    .locals 5

    .line 2
    const-class v0, Ll/᩻᩻ۧ;

    .line 3
    monitor-enter v0

    .line 61
    :try_start_0
    sget-boolean v1, Ll/᩻᩻ۧ;->ۗ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    .line 119
    :try_start_1
    invoke-static {p0}, Ll/ۘۚ֫;->֫(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 120
    invoke-static {}, Ll/ۘۚ֫;->ܽ()Z

    move-result p0
    :try_end_1
    .catch Ll/ۖۚ֫; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    goto :goto_0

    :catch_0
    move-exception p0

    .line 133
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Failed to determine secure mode due to GL error: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;)V

    :cond_1
    const/4 p0, 0x0

    .line 62
    :goto_0
    sput p0, Ll/᩻᩻ۧ;->ۙ:I

    .line 63
    sput-boolean v3, Ll/᩻᩻ۧ;->ۗ:Z

    .line 65
    :cond_2
    sget p0, Ll/᩻᩻ۧ;->ۙ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p0, :cond_3

    const/4 v2, 0x1

    :cond_3
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method


# virtual methods
.method public final release()V
    .locals 2

    .line 104
    invoke-super {p0}, Landroid/view/Surface;->release()V

    .line 109
    iget-object v0, p0, Ll/᩻᩻ۧ;->᩹:Ll/ܳ᩻ۧ;

    monitor-enter v0

    .line 110
    :try_start_0
    iget-boolean v1, p0, Ll/᩻᩻ۧ;->᩶:Z

    if-nez v1, :cond_0

    .line 111
    iget-object v1, p0, Ll/᩻᩻ۧ;->᩹:Ll/ܳ᩻ۧ;

    invoke-virtual {v1}, Ll/ܳ᩻ۧ;->֫()V

    const/4 v1, 0x1

    .line 112
    iput-boolean v1, p0, Ll/᩻᩻ۧ;->᩶:Z

    .line 114
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
