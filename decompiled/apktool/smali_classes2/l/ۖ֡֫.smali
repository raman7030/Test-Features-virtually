.class public final Ll/ۖ֡֫;
.super Ljava/lang/Object;
.source "E7TV"


# static fields
.field public static ֫:Landroid/media/AudioManager;


# direct methods
.method public static declared-synchronized ֫(Landroid/content/Context;)Landroid/media/AudioManager;
    .locals 5

    .line 2
    const-class v0, Ll/ۖ֡֫;

    .line 3
    monitor-enter v0

    .line 114
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v1, 0x0

    .line 117
    sput-object v1, Ll/ۖ֡֫;->֫:Landroid/media/AudioManager;

    .line 119
    :cond_0
    sget-object v1, Ll/ۖ֡֫;->֫:Landroid/media/AudioManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 120
    monitor-exit v0

    return-object v1

    .line 122
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 123
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 132
    :cond_2
    new-instance v1, Ll/ܳۚ֫;

    invoke-direct {v1}, Ll/ܳۚ֫;-><init>()V

    .line 133
    invoke-static {}, Ll/ۧ۠᩵;->֫()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Ll/ۤ֨ۡ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0, v1}, Ll/ۤ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 134
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 140
    invoke-virtual {v1}, Ll/ܳۚ֫;->ۧ()V

    .line 141
    sget-object p0, Ll/ۖ֡֫;->֫:Landroid/media/AudioManager;

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    monitor-exit v0

    return-object p0

    :cond_3
    :goto_0
    :try_start_2
    const-string v1, "audio"

    .line 126
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/AudioManager;

    sput-object p0, Ll/ۖ֡֫;->֫:Landroid/media/AudioManager;

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(Landroid/content/Context;Ll/ܳۚ֫;)V
    .locals 1

    const-string v0, "audio"

    .line 137
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/media/AudioManager;

    sput-object p0, Ll/ۖ֡֫;->֫:Landroid/media/AudioManager;

    .line 138
    invoke-virtual {p1}, Ll/ܳۚ֫;->ܿ()Z

    return-void
.end method

.method public static ֫(Landroid/media/AudioManager;Ll/ܺ֡֫;)V
    .locals 2

    .line 179
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 180
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܽ()Landroid/media/AudioFocusRequest;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    return-void

    .line 182
    :cond_0
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܳ()Landroid/media/AudioManager$OnAudioFocusChangeListener;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    return-void
.end method

.method public static ۧ(Landroid/media/AudioManager;Ll/ܺ֡֫;)I
    .locals 2

    .line 157
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 158
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܽ()Landroid/media/AudioFocusRequest;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    move-result p0

    return p0

    .line 161
    :cond_0
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܳ()Landroid/media/AudioManager$OnAudioFocusChangeListener;

    move-result-object v0

    .line 162
    invoke-virtual {p1}, Ll/ܺ֡֫;->ۧ()Ll/ᩳᩴ֫;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x3

    .line 163
    invoke-virtual {p1}, Ll/ܺ֡֫;->ܿ()I

    move-result p1

    .line 160
    invoke-virtual {p0, v0, v1, p1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result p0

    return p0
.end method
