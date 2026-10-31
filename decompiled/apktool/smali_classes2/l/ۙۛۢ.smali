.class public final Ll/ۙۛۢ;
.super Ljava/lang/Object;
.source "M6O6"


# instance fields
.field public final ֫:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۙۛۢ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 186
    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    .line 187
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۙۛۢ;->֫:J

    sub-long/2addr v0, v2

    const-wide v2, 0x12a05f200L

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    :cond_0
    sget-object v0, Ll/᩵ۤۢ;->᩶:Ll/᩵ۤۢ;

    const-string v1, "Formatting time limit exceeded"

    invoke-static {v0, v1}, Ll/۫ۛۢ;->֫(Ll/᩵ۤۢ;Ljava/lang/String;)Ll/֡ۤۢ;

    move-result-object v0

    throw v0
.end method
