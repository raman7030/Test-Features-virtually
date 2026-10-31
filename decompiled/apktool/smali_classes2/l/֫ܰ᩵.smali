.class public final Ll/֫ܰ᩵;
.super Ljava/lang/Object;
.source "H4E0"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 281
    iput v0, p0, Ll/֫ܰ᩵;->֫:I

    .line 282
    iput v0, p0, Ll/֫ܰ᩵;->ۧ:I

    .line 283
    iput v0, p0, Ll/֫ܰ᩵;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۧܰ᩵;
    .locals 1

    .line 370
    new-instance v0, Ll/ۧܰ᩵;

    invoke-direct {v0, p0}, Ll/ۧܰ᩵;-><init>(Ll/֫ܰ᩵;)V

    return-object v0
.end method

.method public final ۧ()V
    .locals 5

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x3

    int-to-long v1, v1

    .line 309
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7fffffff

    goto :goto_0

    :cond_0
    long-to-int v0, v0

    .line 312
    :goto_0
    iput v0, p0, Ll/֫ܰ᩵;->֫:I

    return-void
.end method

.method public final ܽ()V
    .locals 5

    .line 2
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x3

    int-to-long v1, v1

    .line 342
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7fffffff

    goto :goto_0

    :cond_0
    long-to-int v0, v0

    .line 345
    :goto_0
    iput v0, p0, Ll/֫ܰ᩵;->ܽ:I

    return-void
.end method
