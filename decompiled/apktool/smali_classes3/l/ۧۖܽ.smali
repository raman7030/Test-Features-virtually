.class public Ll/ۧۖܽ;
.super Landroid/graphics/Paint;
.source "FAIR"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Landroid/graphics/Paint;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized getNativeInstance()J
    .locals 3
    .annotation build Ll/ۙᩳ;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 23
    :try_start_0
    invoke-super {p0}, Landroid/graphics/Paint;->getNativeInstance()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
