.class public final Ll/ۢۨ᩵;
.super Ljava/lang/Object;
.source "LAYC"


# static fields
.field public static final ֫:Ll/᩻ۨ᩵;

.field public static final ۧ:I

.field public static final ܳ:J

.field public static final ܽ:J

.field public static final ܿ:Ll/᩻ۨ᩵;

.field public static final ᩳ:I

.field public static ᩻:Ll/ᩳۨ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const-wide/16 v3, 0x1

    const-wide v5, 0x7fffffffffffffffL

    const-string v0, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v1, 0x186a0

    .line 44
    invoke-static/range {v0 .. v6}, Ll/᩸ۛ᩵;->֫(Ljava/lang/String;JJJ)J

    move-result-wide v0

    .line 17
    sput-wide v0, Ll/ۢۨ᩵;->ܳ:J

    .line 30
    invoke-static {}, Ll/᩸ۛ᩵;->֫()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    const/4 v0, 0x2

    :cond_0
    const/16 v1, 0x8

    const-string v2, "kotlinx.coroutines.scheduler.core.pool.size"

    .line 28
    invoke-static {v0, v1, v2}, Ll/᩸ۛ᩵;->֫(IILjava/lang/String;)I

    move-result v0

    sput v0, Ll/ۢۨ᩵;->ۧ:I

    const v0, 0x1ffffe

    const/4 v1, 0x4

    const-string v2, "kotlinx.coroutines.scheduler.max.pool.size"

    .line 36
    invoke-static {v0, v1, v2}, Ll/᩸ۛ᩵;->֫(IILjava/lang/String;)I

    move-result v0

    sput v0, Ll/ۢۨ᩵;->ᩳ:I

    .line 43
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    const-wide v6, 0x7fffffffffffffffL

    const-string v1, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v2, 0x3c

    .line 44
    invoke-static/range {v1 .. v7}, Ll/᩸ۛ᩵;->֫(Ljava/lang/String;JJJ)J

    move-result-wide v1

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۢۨ᩵;->ܽ:J

    .line 48
    sget-object v0, Ll/ᩳۨ᩵;->ۧ:Ll/ᩳۨ᩵;

    sput-object v0, Ll/ۢۨ᩵;->᩻:Ll/ᩳۨ᩵;

    .line 72
    new-instance v0, Ll/ۜۨ᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۜۨ᩵;-><init>(I)V

    sput-object v0, Ll/ۢۨ᩵;->ܿ:Ll/᩻ۨ᩵;

    .line 75
    new-instance v0, Ll/ۜۨ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۜۨ᩵;-><init>(I)V

    sput-object v0, Ll/ۢۨ᩵;->֫:Ll/᩻ۨ᩵;

    return-void
.end method
