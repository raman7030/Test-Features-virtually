.class public final Ll/ᩴ᩻᩵;
.super Ll/ۘ᩻᩵;
.source "I6PU"


# instance fields
.field public final ۛ:J

.field public volatile ۟:Ljava/lang/Thread;

.field public ۨ:Z

.field public ܰ:J

.field public final ᩺:Z


# direct methods
.method public constructor <init>(JJZ)V
    .locals 1

    .line 1835
    invoke-direct {p0}, Ll/ۘ᩻᩵;-><init>()V

    .line 1836
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    .line 1837
    iput-boolean p5, p0, Ll/ᩴ᩻᩵;->᩺:Z

    .line 1838
    iput-wide p1, p0, Ll/ᩴ᩻᩵;->ܰ:J

    .line 1839
    iput-wide p3, p0, Ll/ᩴ᩻᩵;->ۛ:J

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 1

    .line 1843
    iget-object p1, p0, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1844
    iput-object v0, p0, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    .line 1845
    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-object v0
.end method

.method public final ۜ()Z
    .locals 8

    .line 1850
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1851
    iput-boolean v1, p0, Ll/ᩴ᩻᩵;->ۨ:Z

    .line 1852
    :cond_0
    iget-boolean v0, p0, Ll/ᩴ᩻᩵;->ۨ:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ᩴ᩻᩵;->᩺:Z

    if-nez v0, :cond_3

    :cond_1
    iget-wide v2, p0, Ll/ᩴ᩻᩵;->ۛ:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_2

    iget-wide v6, p0, Ll/ᩴ᩻᩵;->ܰ:J

    cmp-long v0, v6, v4

    if-lez v0, :cond_3

    .line 1855
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long/2addr v2, v6

    iput-wide v2, p0, Ll/ᩴ᩻᩵;->ܰ:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_3

    :cond_2
    iget-object v0, p0, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    if-nez v0, :cond_4

    :cond_3
    return v1

    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 1867
    iget-object v0, p0, Ll/ᩴ᩻᩵;->۟:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
