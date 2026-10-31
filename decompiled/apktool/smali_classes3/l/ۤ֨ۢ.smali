.class public final Ll/ۤ֨ۢ;
.super Ljava/lang/Object;
.source "B9B2"


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static ֫()Ll/ۗ֨ۢ;
    .locals 1

    .line 85
    :try_start_0
    invoke-static {}, Ll/᩺᩶۠;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    .line 263
    sget-object v0, Ll/ۗ֨ۢ;->᩹:Ll/ۗ֨ۢ;

    return-object v0

    .line 265
    :cond_0
    sget-object v0, Ll/ۗ֨ۢ;->ۙ:Ll/ۗ֨ۢ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 77
    :catch_0
    invoke-static {}, Ll/᩺᩶۠;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    sget-object v0, Ll/ۗ֨ۢ;->ۙ:Ll/ۗ֨ۢ;

    goto :goto_0

    :cond_1
    sget-object v0, Ll/ۗ֨ۢ;->᩶:Ll/ۗ֨ۢ;

    :goto_0
    return-object v0
.end method

.method public static ֫(ZLl/ܳ֨ۢ;)Z
    .locals 12

    .line 69
    invoke-static {}, Ll/᩺᩶۠;->ܳ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p0, :cond_1

    .line 201
    sget-object v0, Ll/۬֨ۢ;->᩹:Ll/۬֨ۢ;

    iget-wide v2, p1, Ll/ܳ֨ۢ;->᩸:J

    invoke-static {v2, v3, v0}, Ll/ۢ֨ۢ;->֫(JLl/۬֨ۢ;)V

    :cond_1
    if-nez p0, :cond_2

    .line 77
    invoke-static {}, Ll/᩺᩶۠;->᩻()Z

    move-result p0

    goto :goto_0

    .line 235
    :cond_2
    invoke-static {}, Ll/ۤ֨ۢ;->ۧ()Z

    move-result p0

    :goto_0
    if-nez p0, :cond_3

    :goto_1
    return v1

    :cond_3
    if-eqz p1, :cond_4

    .line 207
    sget-object p0, Ll/۬֨ۢ;->᩶:Ll/۬֨ۢ;

    iget-wide v2, p1, Ll/ܳ֨ۢ;->᩸:J

    invoke-static {v2, v3, p0}, Ll/ۢ֨ۢ;->֫(JLl/۬֨ۢ;)V

    .line 209
    :cond_4
    invoke-static {}, Ll/ۤ֨ۢ;->֫()Ll/ۗ֨ۢ;

    move-result-object p0

    .line 210
    sget-object p1, Ll/ۗ֨ۢ;->᩹:Ll/ۗ֨ۢ;

    const/4 v0, 0x1

    if-ne p0, p1, :cond_5

    return v0

    .line 213
    :cond_5
    new-instance p0, Ll/ۙ֨ۢ;

    invoke-direct {p0}, Ll/ۙ֨ۢ;-><init>()V

    .line 109
    invoke-static {p0}, Ll/᩺᩶۠;->֫(Ll/ۛ᩶۠;)V

    const/16 p1, 0x5348

    .line 101
    :try_start_0
    invoke-static {p1}, Ll/᩺᩶۠;->ܽ(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_7

    .line 279
    :catch_0
    :try_start_1
    invoke-static {}, Ll/ۤ֨ۢ;->ۧ()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_6

    goto :goto_3

    .line 101
    :cond_6
    :try_start_2
    invoke-static {p1}, Ll/᩺᩶۠;->ܽ(I)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    const/4 p1, 0x1

    goto :goto_4

    :catch_1
    :goto_3
    const/4 p1, 0x0

    :goto_4
    if-nez p1, :cond_7

    .line 117
    invoke-static {p0}, Ll/᩺᩶۠;->ۧ(Ll/ۛ᩶۠;)V

    return v1

    .line 321
    :cond_7
    :try_start_3
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    const-wide/16 v4, 0x2710

    const-wide/16 v6, 0x0

    .line 295
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-long/2addr v4, v2

    .line 297
    :cond_8
    invoke-virtual {p0}, Ll/ۙ֨ۢ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_5

    .line 300
    :cond_9
    invoke-virtual {p0}, Ll/ۙ֨ۢ;->֫()Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_6

    .line 303
    :cond_a
    invoke-static {}, Ll/ۤ֨ۢ;->֫()Ll/ۗ֨ۢ;

    move-result-object p1

    .line 304
    sget-object v0, Ll/ۗ֨ۢ;->᩹:Ll/ۗ֨ۢ;

    if-ne p1, v0, :cond_b

    :goto_5
    const/4 v1, 0x1

    goto :goto_6

    .line 321
    :cond_b
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    sub-long v2, v4, v2

    cmp-long p1, v2, v6

    if-gtz p1, :cond_c

    goto :goto_6

    :cond_c
    const-wide/16 v8, 0x1

    const-wide/16 v10, 0xc8

    .line 311
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    invoke-static {v8, v9, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Ll/ۙ֨ۢ;->֫(J)Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p1, :cond_8

    .line 117
    :goto_6
    invoke-static {p0}, Ll/᩺᩶۠;->ۧ(Ll/ۛ᩶۠;)V

    return v1

    :goto_7
    invoke-static {p0}, Ll/᩺᩶۠;->ۧ(Ll/ۛ᩶۠;)V

    .line 222
    throw p1
.end method

.method public static ۧ()Z
    .locals 11

    .line 321
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    .line 242
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-long/2addr v4, v0

    .line 77
    :goto_0
    invoke-static {}, Ll/᩺᩶۠;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 321
    :cond_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sub-long v0, v4, v0

    const/4 v6, 0x0

    cmp-long v7, v0, v2

    if-gtz v7, :cond_1

    return v6

    :cond_1
    const-wide/16 v7, 0x1

    const-wide/16 v9, 0xc8

    .line 251
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 329
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 332
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return v6
.end method
