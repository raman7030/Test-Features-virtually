.class public final Ll/ܶ۫ۡ;
.super Ljava/lang/Object;
.source "05B9"


# instance fields
.field public final ֫:I

.field public ۧ:J


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, Ll/ܶ۫ۡ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 18
    iget v0, p0, Ll/ܶ۫ۡ;->֫:I

    int-to-long v0, v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Ll/ܶ۫ۡ;->ۧ:J

    sub-long/2addr v2, v4

    sub-long/2addr v0, v2

    long-to-int v1, v0

    if-lez v1, :cond_0

    int-to-long v0, v1

    .line 20
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܶ۫ۡ;->ۧ:J

    return-void
.end method
