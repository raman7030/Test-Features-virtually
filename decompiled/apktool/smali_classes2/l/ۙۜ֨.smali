.class public abstract Ll/ۙۜ֨;
.super Ljava/lang/Object;
.source "P1RZ"


# instance fields
.field public ֫:J

.field public ۧ:J

.field public final ܽ:Ll/ۖۜ֨;

.field public ܿ:J

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۖۜ֨;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 12
    iput-wide v0, p0, Ll/ۙۜ֨;->֫:J

    .line 13
    iput-wide v0, p0, Ll/ۙۜ֨;->ܿ:J

    .line 14
    iput-wide v0, p0, Ll/ۙۜ֨;->ۧ:J

    .line 15
    iput-wide v0, p0, Ll/ۙۜ֨;->ᩳ:J

    .line 18
    iput-object p1, p0, Ll/ۙۜ֨;->ܽ:Ll/ۖۜ֨;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 4

    .line 23
    iget-wide v0, p0, Ll/ۙۜ֨;->ᩳ:J

    invoke-static {v0, v1}, Ll/֨ۧܺ;->֫(J)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ۙۜ֨;->ۧ:J

    add-long/2addr v0, v2

    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x3

    and-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public ֫(JJ)V
    .locals 6

    .line 40
    iget-wide v0, p0, Ll/ۙۜ֨;->֫:J

    const-wide/16 v2, 0x3

    add-long/2addr v2, p1

    const-wide/16 v4, -0x4

    and-long/2addr v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۙۜ֨;->֫:J

    .line 41
    iget-wide v0, p0, Ll/ۙۜ֨;->ܿ:J

    add-long/2addr v0, p3

    iput-wide v0, p0, Ll/ۙۜ֨;->ܿ:J

    .line 42
    iget-wide v0, p0, Ll/ۙۜ֨;->ۧ:J

    invoke-static {p1, p2}, Ll/֨ۧܺ;->֫(J)I

    move-result p1

    .line 43
    invoke-static {p3, p4}, Ll/֨ۧܺ;->֫(J)I

    move-result p2

    add-int/2addr p2, p1

    int-to-long p1, p2

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۙۜ֨;->ۧ:J

    .line 44
    iget-wide p1, p0, Ll/ۙۜ֨;->ᩳ:J

    const-wide/16 p3, 0x1

    add-long/2addr p1, p3

    iput-wide p1, p0, Ll/ۙۜ֨;->ᩳ:J

    .line 46
    iget-wide p1, p0, Ll/ۙۜ֨;->֫:J

    const-wide/16 p3, 0x0

    cmp-long v0, p1, p3

    if-ltz v0, :cond_0

    iget-wide p1, p0, Ll/ۙۜ֨;->ܿ:J

    cmp-long v0, p1, p3

    if-ltz v0, :cond_0

    .line 47
    invoke-virtual {p0}, Ll/ۙۜ֨;->ۧ()J

    move-result-wide p1

    const-wide v0, 0x400000000L

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 48
    invoke-virtual {p0}, Ll/ۙۜ֨;->ܽ()J

    move-result-wide p1

    cmp-long v0, p1, p3

    if-ltz v0, :cond_0

    return-void

    .line 49
    :cond_0
    iget-object p1, p0, Ll/ۙۜ֨;->ܽ:Ll/ۖۜ֨;

    throw p1
.end method

.method public ۧ()J
    .locals 4

    .line 23
    iget-wide v0, p0, Ll/ۙۜ֨;->ᩳ:J

    invoke-static {v0, v1}, Ll/֨ۧܺ;->֫(J)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ۙۜ֨;->ۧ:J

    add-long/2addr v0, v2

    const-wide/16 v2, 0x7

    add-long/2addr v0, v2

    const-wide/16 v2, -0x4

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public abstract ܽ()J
.end method
