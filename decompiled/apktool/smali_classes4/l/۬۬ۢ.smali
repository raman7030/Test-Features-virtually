.class public final Ll/۬۬ۢ;
.super Ll/֫ܳ֡;
.source "46PA"


# instance fields
.field public ܳ:J

.field public final ܿ:J


# direct methods
.method public constructor <init>(Ll/֡ۙۢ;I)V
    .locals 2

    .line 128
    invoke-direct {p0, p1}, Ll/֫ܳ֡;-><init>(Ll/᩻ܳ֡;)V

    int-to-long p1, p2

    const-wide/16 v0, 0x3e8

    mul-long p1, p1, v0

    const-wide/32 v0, 0x1e8480

    .line 129
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۬۬ۢ;->ܿ:J

    return-void
.end method


# virtual methods
.method public final ᩳ(I)Ll/֡ܳ֡;
    .locals 5

    .line 133
    iget-wide v0, p0, Ll/۬۬ۢ;->ܳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/۬۬ۢ;->ܳ:J

    const-wide/16 v2, 0x3ff

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 134
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 135
    iget-wide v0, p0, Ll/۬۬ۢ;->ܳ:J

    iget-wide v2, p0, Ll/۬۬ۢ;->ܿ:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parser work exceeds formatter limit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 137
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/֫ܳ֡;->ᩳ(I)Ll/֡ܳ֡;

    move-result-object p1

    return-object p1
.end method
