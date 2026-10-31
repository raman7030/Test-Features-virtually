.class public final Ll/ܽۖۧ;
.super Ljava/lang/Object;
.source "N8QB"

# interfaces
.implements Ll/᩻ۖۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:J

.field public final ܽ:J

.field public final ᩳ:Ll/ᩳۢۧ;


# direct methods
.method public constructor <init>(JJJ)V
    .locals 13

    move-object v0, p0

    move-wide v5, p1

    move-wide/from16 v1, p3

    move-wide/from16 v3, p5

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v7, Ll/ᩳۢۧ;

    const/4 v8, 0x1

    new-array v9, v8, [J

    const/4 v10, 0x0

    aput-wide v1, v9, v10

    new-array v8, v8, [J

    const-wide/16 v11, 0x0

    aput-wide v11, v8, v10

    invoke-direct {v7, p1, p2, v9, v8}, Ll/ᩳۢۧ;-><init>(J[J[J)V

    iput-object v7, v0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    .line 41
    iput-wide v1, v0, Ll/ܽۖۧ;->ܽ:J

    .line 42
    iput-wide v3, v0, Ll/ܽۖۧ;->ۧ:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const v9, -0x7fffffff

    cmp-long v10, v5, v7

    if-eqz v10, :cond_1

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x8

    .line 44
    sget-object v7, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    move-wide v5, p1

    .line 45
    invoke-static/range {v1 .. v7}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v1

    cmp-long v3, v1, v11

    if-lez v3, :cond_0

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    long-to-int v9, v1

    .line 48
    :cond_0
    iput v9, v0, Ll/ܽۖۧ;->֫:I

    return-void

    .line 50
    :cond_1
    iput v9, v0, Ll/ܽۖۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫(J)Ll/ۜۢۧ;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۢۧ;->֫(J)Ll/ۜۢۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(JJ)V
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۢۧ;->ܽ(J)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 101
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ᩳۢۧ;->֫(JJ)V

    return-void
.end method

.method public final ۜ()J
    .locals 2

    .line 76
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0}, Ll/ᩳۢۧ;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 61
    iget-wide v0, p0, Ll/ܽۖۧ;->ܽ:J

    return-wide v0
.end method

.method public final ۧ(J)J
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۢۧ;->ۧ(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ܽ(J)Z
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۢۧ;->ܽ(J)Z

    move-result p1

    return p1
.end method

.method public final ܿ()Z
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0}, Ll/ᩳۢۧ;->ܿ()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 66
    iget-wide v0, p0, Ll/ܽۖۧ;->ۧ:J

    return-wide v0
.end method

.method public final ᩳ(J)V
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ܽۖۧ;->ᩳ:Ll/ᩳۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ᩳۢۧ;->ᩳ(J)V

    return-void
.end method

.method public final ᩻()I
    .locals 1

    .line 86
    iget v0, p0, Ll/ܽۖۧ;->֫:I

    return v0
.end method
