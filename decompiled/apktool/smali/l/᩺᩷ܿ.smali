.class public final Ll/᩺᩷ܿ;
.super Ljava/lang/Object;
.source "S6VI"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(II)V
    .locals 7

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    if-lt p2, v0, :cond_0

    const/4 v1, 0x4

    if-gt p2, v1, :cond_0

    .line 19
    iput p1, p0, Ll/᩺᩷ܿ;->ᩳ:I

    .line 20
    iput p2, p0, Ll/᩺᩷ܿ;->ܽ:I

    mul-int/lit8 p2, p2, 0x2

    int-to-long v1, p1

    int-to-long p1, p2

    add-long v3, v1, p1

    const-wide/16 v5, 0x1

    sub-long/2addr v3, v5

    .line 22
    div-long/2addr v3, p1

    const-wide/32 p1, 0x10000

    .line 23
    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v3, 0x2000

    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Ll/᩺᩷ܿ;->ۧ:I

    int-to-long v3, p2

    add-long/2addr v1, v3

    sub-long/2addr v1, v5

    int-to-long p1, p2

    .line 25
    div-long/2addr v1, p1

    long-to-int p1, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/᩺᩷ܿ;->֫:I

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax chunk plan"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 6

    .line 34
    iget v0, p0, Ll/᩺᩷ܿ;->֫:I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    .line 35
    iget v0, p0, Ll/᩺᩷ܿ;->ᩳ:I

    int-to-long v0, v0

    int-to-long v2, p1

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iget p1, p0, Ll/᩺᩷ܿ;->ۧ:I

    int-to-long v4, p1

    mul-long v2, v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method
