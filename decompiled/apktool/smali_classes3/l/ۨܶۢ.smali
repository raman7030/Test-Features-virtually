.class public final Ll/ۨܶۢ;
.super Ljava/lang/Object;
.source "81T3"


# instance fields
.field public final ֫:[B

.field public ۧ:I

.field public ܽ:Z

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Ll/ۨܶۢ;->ܽ:Z

    const v0, 0xa000

    new-array v0, v0, [B

    .line 14
    iput-object v0, p0, Ll/ۨܶۢ;->֫:[B

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫([BZ)I
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 23
    :catch_0
    :goto_0
    :try_start_0
    iget v1, p0, Ll/ۨܶۢ;->ᩳ:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    iget-boolean v3, p0, Ll/ۨܶۢ;->ܽ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_1

    if-eqz p2, :cond_0

    .line 26
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 31
    :cond_0
    monitor-exit v0

    return v2

    .line 34
    :cond_1
    :try_start_2
    iget-boolean p2, p0, Ll/ۨܶۢ;->ܽ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p2, :cond_2

    monitor-exit v0

    const/4 p1, -0x1

    return p1

    .line 37
    :cond_2
    :try_start_3
    iget-object p2, p0, Ll/ۨܶۢ;->֫:[B

    array-length p2, p2

    if-ne p2, v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    .line 39
    :goto_1
    array-length v3, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_2
    if-lez v3, :cond_5

    .line 41
    iget v6, p0, Ll/ۨܶۢ;->ᩳ:I

    if-lez v6, :cond_5

    .line 42
    iget v7, p0, Ll/ۨܶۢ;->ۧ:I

    sub-int v7, p2, v7

    invoke-static {v7, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 43
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 44
    iget-object v7, p0, Ll/ۨܶۢ;->֫:[B

    iget v8, p0, Ll/ۨܶۢ;->ۧ:I

    invoke-static {v7, v8, p1, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    iget v7, p0, Ll/ۨܶۢ;->ۧ:I

    add-int/2addr v7, v6

    iput v7, p0, Ll/ۨܶۢ;->ۧ:I

    if-lt v7, p2, :cond_4

    .line 46
    iput v2, p0, Ll/ۨܶۢ;->ۧ:I

    .line 47
    :cond_4
    iget v7, p0, Ll/ۨܶۢ;->ᩳ:I

    sub-int/2addr v7, v6

    iput v7, p0, Ll/ۨܶۢ;->ᩳ:I

    sub-int/2addr v3, v6

    add-int/2addr v5, v6

    add-int/2addr v4, v6

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 53
    :cond_6
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 18
    :try_start_0
    iput-boolean v1, p0, Ll/ۨܶۢ;->ܽ:Z

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(I[B)Z
    .locals 9

    .line 62
    array-length v0, p2

    if-gt p1, v0, :cond_8

    if-lez p1, :cond_7

    .line 68
    iget-object v0, p0, Ll/ۨܶۢ;->֫:[B

    array-length v1, v0

    move-object v0, p0

    .line 70
    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    const/4 v4, 0x1

    if-lez p1, :cond_6

    .line 72
    :catch_0
    :goto_1
    :try_start_0
    iget v5, p0, Ll/ۨܶۢ;->ᩳ:I

    if-ne v1, v5, :cond_1

    iget-boolean v6, p0, Ll/ۨܶۢ;->ܽ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_1

    .line 74
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 79
    :cond_1
    :try_start_2
    iget-boolean v6, p0, Ll/ۨܶۢ;->ܽ:Z

    if-nez v6, :cond_2

    monitor-exit v0

    return v2

    :cond_2
    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    sub-int v5, v1, v5

    .line 81
    invoke-static {p1, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr p1, v5

    :goto_3
    if-lez v5, :cond_5

    .line 85
    iget v6, p0, Ll/ۨܶۢ;->ۧ:I

    iget v7, p0, Ll/ۨܶۢ;->ᩳ:I

    add-int/2addr v7, v6

    if-lt v7, v1, :cond_4

    sub-int/2addr v7, v1

    sub-int/2addr v6, v7

    goto :goto_4

    :cond_4
    sub-int v6, v1, v7

    .line 99
    :goto_4
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 100
    iget-object v8, p0, Ll/ۨܶۢ;->֫:[B

    invoke-static {p2, v3, v8, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    sub-int/2addr v5, v6

    .line 103
    iget v7, p0, Ll/ۨܶۢ;->ᩳ:I

    add-int/2addr v7, v6

    iput v7, p0, Ll/ۨܶۢ;->ᩳ:I

    goto :goto_3

    :cond_5
    if-eqz v4, :cond_0

    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    .line 107
    :cond_6
    monitor-exit v0

    return v4

    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 65
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length <= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 63
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "length + offset > buffer.length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
