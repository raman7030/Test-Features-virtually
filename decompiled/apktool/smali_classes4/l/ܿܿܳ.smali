.class public final Ll/ܿܿܳ;
.super Ljava/lang/Object;
.source "K6ZG"


# instance fields
.field public final ֫:Ll/᩻ܿܳ;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩻ܿܳ;)V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Ll/ܿܿܳ;->֫:Ll/᩻ܿܳ;

    return-void
.end method

.method public static ֫(Ll/ܿܿܳ;Ljava/lang/String;)V
    .locals 1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 143
    :try_start_0
    iput-object p1, p0, Ll/ܿܿܳ;->ۧ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public declared-synchronized update(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Ll/ۙᩳ;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 150
    :try_start_0
    iget-object v1, p0, Ll/ܿܿܳ;->ۧ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ܿܿܳ;->֫:Ll/᩻ܿܳ;

    invoke-virtual {p1, p2}, Ll/᩻ܿܳ;->֫(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
