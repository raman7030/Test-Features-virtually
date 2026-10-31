.class public final Ll/᩹ۛ᩷;
.super Ljava/lang/Object;
.source "A1E3"


# instance fields
.field public ֫:I

.field public ۧ:I


# virtual methods
.method public final declared-synchronized ֫(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 189
    :try_start_0
    iget v1, p0, Ll/᩹ۛ᩷;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩹ۛ᩷;->֫:I

    .line 190
    iget v1, p0, Ll/᩹ۛ᩷;->ۧ:I

    add-int/2addr v1, p1

    iput v1, p0, Ll/᩹ۛ᩷;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
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
