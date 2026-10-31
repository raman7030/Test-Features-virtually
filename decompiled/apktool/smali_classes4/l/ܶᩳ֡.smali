.class public Ll/ܶᩳ֡;
.super Ljava/lang/Object;
.source "A4ET"


# static fields
.field public static final ᩳ:Ll/ܶᩳ֡;


# instance fields
.field public ֫:J

.field public ۧ:Z

.field public ܽ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ll/۠ᩳ֡;

    .line 69
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    sput-object v0, Ll/ܶᩳ֡;->ᩳ:Ll/ܶᩳ֡;

    return-void
.end method


# virtual methods
.method public ֫()Ll/ܶᩳ֡;
    .locals 1

    const/4 v0, 0x0

    .line 134
    iput-boolean v0, p0, Ll/ܶᩳ֡;->ۧ:Z

    return-object p0
.end method

.method public ֫(J)Ll/ܶᩳ֡;
    .locals 1

    const/4 v0, 0x1

    .line 114
    iput-boolean v0, p0, Ll/ܶᩳ֡;->ۧ:Z

    .line 115
    iput-wide p1, p0, Ll/ܶᩳ֡;->֫:J

    return-object p0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 9

    .line 192
    :try_start_0
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ᩳ()Z

    move-result v0

    .line 193
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ܳ()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    if-nez v0, :cond_0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V

    return-void

    .line 202
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    if-eqz v0, :cond_1

    cmp-long v7, v1, v3

    if-eqz v7, :cond_1

    .line 204
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ܽ()J

    move-result-wide v7

    sub-long/2addr v7, v5

    .line 205
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 207
    invoke-virtual {p0}, Ll/ܶᩳ֡;->ܽ()J

    move-result-wide v0

    sub-long v1, v0, v5

    :cond_2
    :goto_0
    cmp-long v0, v1, v3

    if-lez v0, :cond_3

    const-wide/32 v3, 0xf4240

    .line 215
    div-long v7, v1, v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    invoke-static {v7, v8}, Ljava/lang/Long;->signum(J)I

    mul-long v3, v3, v7

    sub-long v3, v1, v3

    long-to-int v0, v3

    :try_start_1
    invoke-virtual {p1, v7, v8, v0}, Ljava/lang/Object;->wait(JI)V

    .line 217
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long/2addr v3, v5

    :cond_3
    cmp-long p1, v3, v1

    if-gez p1, :cond_4

    return-void

    .line 222
    :cond_4
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string v0, "timeout"

    invoke-direct {p1, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 225
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 226
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string v0, "interrupted"

    invoke-direct {p1, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۧ()Ll/ܶᩳ֡;
    .locals 2

    const-wide/16 v0, 0x0

    .line 128
    iput-wide v0, p0, Ll/ܶᩳ֡;->ܽ:J

    return-object p0
.end method

.method public ۧ(J)Ll/ܶᩳ֡;
    .locals 4

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܶᩳ֡;->ܽ:J

    return-object p0

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unit == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 81
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "timeout < 0: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 81
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ܳ()J
    .locals 2

    .line 89
    iget-wide v0, p0, Ll/ܶᩳ֡;->ܽ:J

    return-wide v0
.end method

.method public ܽ()J
    .locals 2

    .line 104
    iget-boolean v0, p0, Ll/ܶᩳ֡;->ۧ:Z

    if-eqz v0, :cond_0

    .line 105
    iget-wide v0, p0, Ll/ܶᩳ֡;->֫:J

    return-wide v0

    .line 104
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No deadline"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ܿ()V
    .locals 5

    .line 144
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 149
    iget-boolean v0, p0, Ll/ܶᩳ֡;->ۧ:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Ll/ܶᩳ֡;->֫:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    goto :goto_0

    .line 150
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "deadline reached"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    .line 145
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 146
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "interrupted"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ᩳ()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Ll/ܶᩳ֡;->ۧ:Z

    return v0
.end method
