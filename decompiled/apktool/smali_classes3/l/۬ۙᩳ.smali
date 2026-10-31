.class public final Ll/۬ۙᩳ;
.super Ljava/lang/Object;
.source "K6UK"


# static fields
.field public static final ܿ:Ll/۬ۙᩳ;


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:J

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 387
    new-instance v0, Ll/۬ۙᩳ;

    invoke-direct {v0}, Ll/۬ۙᩳ;-><init>()V

    sput-object v0, Ll/۬ۙᩳ;->ܿ:Ll/۬ۙᩳ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 391
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 394
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x15e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    iput-wide v1, p0, Ll/۬ۙᩳ;->֫:J

    const-wide/16 v1, 0x7d0

    .line 395
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬ۙᩳ;->ܽ:J

    const-wide/32 v0, 0x40000

    .line 396
    iput-wide v0, p0, Ll/۬ۙᩳ;->ۧ:J

    const/16 v0, 0x100

    .line 397
    iput v0, p0, Ll/۬ۙᩳ;->ᩳ:I

    return-void
.end method
