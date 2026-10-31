.class public final Ll/ۖܰۢ;
.super Ljava/lang/Object;
.source "N6PY"


# instance fields
.field public final ֫:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۖܰۢ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 253
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۖܰۢ;->֫:J

    sub-long/2addr v0, v2

    const-wide v2, 0x12a05f200L

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    .line 254
    :cond_0
    sget-object v0, Ll/֡ܰۢ;->ۙ:Ll/֡ܰۢ;

    const-string v1, "Formatting interrupted or time limit exceeded"

    invoke-static {v0, v1}, Ll/ۚܰۢ;->֫(Ll/֡ܰۢ;Ljava/lang/String;)Ll/ᩴܰۢ;

    move-result-object v0

    throw v0
.end method
