.class public final Ll/ۨ᩶ܽ;
.super Ljava/lang/Object;
.source "B4HK"


# instance fields
.field public ֫:I


# virtual methods
.method public final ֫()I
    .locals 1

    .line 184
    iget v0, p0, Ll/ۨ᩶ܽ;->֫:I

    return v0
.end method

.method public final declared-synchronized ֫(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 180
    :try_start_0
    iget v1, p0, Ll/ۨ᩶ܽ;->֫:I

    add-int/2addr v1, p1

    iput v1, p0, Ll/ۨ᩶ܽ;->֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
