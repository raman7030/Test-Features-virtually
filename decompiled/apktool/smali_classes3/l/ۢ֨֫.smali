.class public final Ll/ۢ֨֫;
.super Ljava/lang/Object;
.source "08QK"


# instance fields
.field public ֫:J

.field public ۧ:J

.field public final ܽ:Ljava/lang/ThreadLocal;

.field public ᩳ:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/ۢ֨֫;->ܽ:Ljava/lang/ThreadLocal;

    .line 87
    invoke-virtual {p0, p1, p2}, Ll/ۢ֨֫;->ᩳ(J)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()J
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 151
    :try_start_0
    iget-wide v1, p0, Ll/ۢ֨֫;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const-wide v3, 0x7ffffffffffffffeL

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    :cond_0
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    :cond_1
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

.method public final declared-synchronized ֫(J)J
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 247
    monitor-exit v0

    return-wide v1

    .line 249
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۢ֨֫;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_2

    .line 251
    iget-wide v1, p0, Ll/ۢ֨֫;->֫:J

    const-wide v3, 0x7ffffffffffffffeL

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 252
    iget-object v1, p0, Ll/ۢ֨֫;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    sub-long/2addr v1, p1

    .line 254
    iput-wide v1, p0, Ll/ۢ֨֫;->ᩳ:J

    .line 256
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 258
    :cond_2
    iput-wide p1, p0, Ll/ۢ֨֫;->ۧ:J

    .line 259
    iget-wide v1, p0, Ll/ۢ֨֫;->ᩳ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-long/2addr p1, v1

    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(JZ)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 118
    :try_start_0
    iget-wide v1, p0, Ll/ۢ֨֫;->֫:J

    const-wide v3, 0x7ffffffffffffffeL

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 119
    invoke-virtual {p0}, Ll/ۢ֨֫;->ᩳ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 120
    monitor-exit v0

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 122
    :try_start_1
    iget-object p3, p0, Ll/ۢ֨֫;->ܽ:Ljava/lang/ThreadLocal;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_2

    .line 127
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ll/ۢ֨֫;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_3

    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 144
    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ()J
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 161
    :try_start_0
    iget-wide v1, p0, Ll/ۢ֨֫;->ۧ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    .line 162
    iget-wide v3, p0, Ll/ۢ֨֫;->ᩳ:J

    add-long/2addr v1, v3

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p0}, Ll/ۢ֨֫;->֫()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :goto_0
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

.method public final declared-synchronized ۧ(J)J
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 198
    monitor-exit v0

    return-wide v1

    .line 200
    :cond_0
    :try_start_0
    iget-wide v4, p0, Ll/ۢ֨֫;->ۧ:J

    cmp-long v3, v4, v1

    if-eqz v3, :cond_1

    .line 298
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v10, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v6, 0x15f90

    const-wide/32 v8, 0xf4240

    invoke-static/range {v4 .. v10}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    const-wide v3, 0x100000000L

    add-long/2addr v3, v1

    const-wide v5, 0x200000000L

    .line 204
    div-long/2addr v3, v5

    const-wide/16 v7, 0x1

    sub-long v7, v3, v7

    mul-long v7, v7, v5

    add-long/2addr v7, p1

    mul-long v3, v3, v5

    add-long/2addr p1, v3

    sub-long v3, v7, v1

    .line 208
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    sub-long v1, p1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    cmp-long v5, v3, v1

    if-gez v5, :cond_1

    move-wide v1, v7

    goto :goto_0

    :cond_1
    move-wide v1, p1

    .line 274
    :goto_0
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v3, 0xf4240

    const-wide/32 v5, 0x15f90

    invoke-static/range {v1 .. v7}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide p1

    .line 212
    invoke-virtual {p0, p1, p2}, Ll/ۢ֨֫;->֫(J)J

    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ܽ()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 171
    :try_start_0
    iget-wide v1, p0, Ll/ۢ֨֫;->ᩳ:J
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

.method public final declared-synchronized ܽ(J)J
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    .line 226
    monitor-exit v0

    return-wide v1

    .line 228
    :cond_0
    :try_start_0
    iget-wide v4, p0, Ll/ۢ֨֫;->ۧ:J

    cmp-long v3, v4, v1

    if-eqz v3, :cond_1

    .line 298
    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v10, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v6, 0x15f90

    const-wide/32 v8, 0xf4240

    invoke-static/range {v4 .. v10}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    const-wide v3, 0x200000000L

    .line 231
    div-long v5, v1, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 232
    invoke-static {v5, v6}, Ljava/lang/Long;->signum(J)I

    mul-long v7, v5, v3

    add-long/2addr v7, p1

    const-wide/16 v9, 0x1

    add-long/2addr v5, v9

    mul-long v5, v5, v3

    add-long/2addr p1, v5

    cmp-long v3, v7, v1

    if-ltz v3, :cond_1

    move-wide v1, v7

    goto :goto_0

    :cond_1
    move-wide v1, p1

    .line 274
    :goto_0
    :try_start_1
    sget-object p1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v3, 0xf4240

    const-wide/32 v5, 0x15f90

    invoke-static/range {v1 .. v7}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide p1

    .line 236
    invoke-virtual {p0, p1, p2}, Ll/ۢ֨֫;->֫(J)J

    move-result-wide p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ᩳ(J)V
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 182
    :try_start_0
    iput-wide p1, p0, Ll/ۢ֨֫;->֫:J

    const-wide v1, 0x7fffffffffffffffL

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, p1, v1

    if-nez v5, :cond_0

    const-wide/16 p1, 0x0

    goto :goto_0

    :cond_0
    move-wide p1, v3

    .line 183
    :goto_0
    iput-wide p1, p0, Ll/ۢ֨֫;->ᩳ:J

    .line 184
    iput-wide v3, p0, Ll/ۢ֨֫;->ۧ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
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

.method public final declared-synchronized ᩳ()Z
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 264
    :try_start_0
    iget-wide v1, p0, Ll/ۢ֨֫;->ᩳ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
