.class public final Ll/ܽ᩷ۧ;
.super Ljava/lang/Object;
.source "88UO"


# instance fields
.field public final ֫:J

.field public final ۜ:J

.field public ۧ:J

.field public ܳ:J

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:J

.field public final ᩻:J


# direct methods
.method public constructor <init>(JJJJJJJ)V
    .locals 0

    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 322
    iput-wide p1, p0, Ll/ܽ᩷ۧ;->᩻:J

    .line 323
    iput-wide p3, p0, Ll/ܽ᩷ۧ;->ۜ:J

    .line 324
    iput-wide p5, p0, Ll/ܽ᩷ۧ;->ܿ:J

    .line 325
    iput-wide p7, p0, Ll/ܽ᩷ۧ;->ܽ:J

    .line 326
    iput-wide p9, p0, Ll/ܽ᩷ۧ;->ᩳ:J

    .line 327
    iput-wide p11, p0, Ll/ܽ᩷ۧ;->ۧ:J

    .line 328
    iput-wide p13, p0, Ll/ܽ᩷ۧ;->֫:J

    .line 330
    invoke-static/range {p3 .. p14}, Ll/ܽ᩷ۧ;->֫(JJJJJJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ܽ᩷ۧ;->ܳ:J

    return-void
.end method

.method public static ֫(JJJJJJ)J
    .locals 7

    const-wide/16 v0, 0x1

    add-long v2, p6, v0

    cmp-long v4, v2, p8

    if-gez v4, :cond_1

    add-long v2, p2, v0

    cmp-long v4, v2, p4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    sub-long v2, p0, p2

    sub-long v4, p8, p6

    long-to-float v4, v4

    sub-long v5, p4, p2

    long-to-float v5, v5

    div-float/2addr v4, v5

    long-to-float v2, v2

    mul-float v2, v2, v4

    float-to-long v2, v2

    const-wide/16 v4, 0x14

    .line 308
    div-long v4, v2, v4

    add-long/2addr v2, p6

    sub-long v2, v2, p10

    sub-long/2addr v2, v4

    sub-long v0, p8, v0

    move-wide p0, v2

    move-wide p2, p6

    move-wide p4, v0

    .line 311
    invoke-static/range {p0 .. p5}, Ll/ۘ֨֫;->֫(JJJ)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    return-wide p6
.end method

.method public static ֫(Ll/ܽ᩷ۧ;)J
    .locals 2

    .line 352
    iget-wide v0, p0, Ll/ܽ᩷ۧ;->ۧ:J

    return-wide v0
.end method

.method public static ֫(Ll/ܽ᩷ۧ;JJ)V
    .locals 13

    move-object v0, p0

    move-wide v5, p1

    .line 374
    iput-wide v5, v0, Ll/ܽ᩷ۧ;->ܽ:J

    move-wide/from16 v9, p3

    .line 375
    iput-wide v9, v0, Ll/ܽ᩷ۧ;->ۧ:J

    .line 385
    iget-wide v1, v0, Ll/ܽ᩷ۧ;->ۜ:J

    iget-wide v3, v0, Ll/ܽ᩷ۧ;->ܿ:J

    iget-wide v7, v0, Ll/ܽ᩷ۧ;->ᩳ:J

    iget-wide v11, v0, Ll/ܽ᩷ۧ;->֫:J

    .line 386
    invoke-static/range {v1 .. v12}, Ll/ܽ᩷ۧ;->֫(JJJJJJ)J

    move-result-wide v1

    iput-wide v1, v0, Ll/ܽ᩷ۧ;->ܳ:J

    return-void
.end method

.method public static ۧ(Ll/ܽ᩷ۧ;)J
    .locals 2

    .line 344
    iget-wide v0, p0, Ll/ܽ᩷ۧ;->ᩳ:J

    return-wide v0
.end method

.method public static ۧ(Ll/ܽ᩷ۧ;JJ)V
    .locals 13

    move-object v0, p0

    move-wide v3, p1

    .line 367
    iput-wide v3, v0, Ll/ܽ᩷ۧ;->ܿ:J

    move-wide/from16 v7, p3

    .line 368
    iput-wide v7, v0, Ll/ܽ᩷ۧ;->ᩳ:J

    .line 385
    iget-wide v1, v0, Ll/ܽ᩷ۧ;->ۜ:J

    iget-wide v5, v0, Ll/ܽ᩷ۧ;->ܽ:J

    iget-wide v9, v0, Ll/ܽ᩷ۧ;->ۧ:J

    iget-wide v11, v0, Ll/ܽ᩷ۧ;->֫:J

    .line 386
    invoke-static/range {v1 .. v12}, Ll/ܽ᩷ۧ;->֫(JJJJJJ)J

    move-result-wide v1

    iput-wide v1, v0, Ll/ܽ᩷ۧ;->ܳ:J

    return-void
.end method

.method public static ܽ(Ll/ܽ᩷ۧ;)J
    .locals 2

    .line 381
    iget-wide v0, p0, Ll/ܽ᩷ۧ;->ܳ:J

    return-wide v0
.end method

.method public static ܿ(Ll/ܽ᩷ۧ;)J
    .locals 2

    .line 357
    iget-wide v0, p0, Ll/ܽ᩷ۧ;->ۜ:J

    return-wide v0
.end method

.method public static ᩳ(Ll/ܽ᩷ۧ;)J
    .locals 2

    .line 362
    iget-wide v0, p0, Ll/ܽ᩷ۧ;->᩻:J

    return-wide v0
.end method
