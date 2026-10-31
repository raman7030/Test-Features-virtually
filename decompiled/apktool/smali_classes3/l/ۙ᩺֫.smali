.class public final Ll/ۙ᩺֫;
.super Ll/ۤ᩺֫;
.source "U7MS"


# instance fields
.field public final ֡:Ll/ܳ۬ܺ;

.field public final ֨:J

.field public final ۖ:I

.field public final ۘ:Z

.field public final ۚ:Ll/᩶᩺֫;

.field public final ۜ:Z

.field public final ۠:J

.field public final ۡ:J

.field public final ۢ:Ll/ܳ۬ܺ;

.field public final ܳ:Z

.field public final ܶ:J

.field public final ܺ:J

.field public final ܿ:J

.field public final ᩳ:I

.field public final ᩴ:Ll/᩵ᩴ֫;

.field public final ᩵:Ll/ۢ۬ܺ;

.field public final ᩷:Z

.field public final ᩸:Ll/ܳ۬ܺ;

.field public final ᩹:I

.field public final ᩻:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLl/᩵ᩴ֫;Ljava/util/List;Ljava/util/List;Ll/᩶᩺֫;Ljava/util/Map;Ljava/util/List;)V
    .locals 10

    move-object v0, p0

    move-wide v1, p4

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p18

    .line 1362
    invoke-direct {p0, p2, p3, v5}, Ll/ۤ᩺֫;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    move v3, p1

    .line 1363
    iput v3, v0, Ll/ۙ᩺֫;->ۖ:I

    move-wide/from16 v3, p7

    .line 1364
    iput-wide v3, v0, Ll/ۙ᩺֫;->۠:J

    move/from16 v3, p6

    .line 1365
    iput-boolean v3, v0, Ll/ۙ᩺֫;->ۘ:Z

    move/from16 v3, p9

    .line 1366
    iput-boolean v3, v0, Ll/ۙ᩺֫;->ܳ:Z

    move/from16 v3, p10

    .line 1367
    iput v3, v0, Ll/ۙ᩺֫;->ᩳ:I

    move-wide/from16 v3, p11

    .line 1368
    iput-wide v3, v0, Ll/ۙ᩺֫;->ۡ:J

    move/from16 v3, p13

    .line 1369
    iput v3, v0, Ll/ۙ᩺֫;->᩹:I

    move-wide/from16 v3, p14

    .line 1370
    iput-wide v3, v0, Ll/ۙ᩺֫;->ܶ:J

    move-wide/from16 v3, p16

    .line 1371
    iput-wide v3, v0, Ll/ۙ᩺֫;->ܺ:J

    move/from16 v3, p19

    .line 1372
    iput-boolean v3, v0, Ll/ۙ᩺֫;->᩻:Z

    move/from16 v3, p20

    .line 1373
    iput-boolean v3, v0, Ll/ۙ᩺֫;->᩷:Z

    move-object/from16 v3, p21

    .line 1374
    iput-object v3, v0, Ll/ۙ᩺֫;->ᩴ:Ll/᩵ᩴ֫;

    .line 1375
    invoke-static/range {p22 .. p22}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v3

    iput-object v3, v0, Ll/ۙ᩺֫;->֡:Ll/ܳ۬ܺ;

    .line 1376
    invoke-static/range {p23 .. p23}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v3

    iput-object v3, v0, Ll/ۙ᩺֫;->᩸:Ll/ܳ۬ܺ;

    .line 1377
    invoke-static/range {p25 .. p25}, Ll/ۢ۬ܺ;->copyOf(Ljava/util/Map;)Ll/ۢ۬ܺ;

    move-result-object v3

    iput-object v3, v0, Ll/ۙ᩺֫;->᩵:Ll/ۢ۬ܺ;

    .line 1378
    invoke-static/range {p26 .. p26}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v3

    iput-object v3, v0, Ll/ۙ᩺֫;->ۢ:Ll/ܳ۬ܺ;

    .line 1379
    invoke-interface/range {p23 .. p23}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const-wide/16 v4, 0x0

    if-nez v3, :cond_0

    .line 1380
    invoke-static/range {p23 .. p23}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۠᩺֫;

    .line 1381
    iget-wide v6, v3, Ll/᩹᩺֫;->ۨ:J

    iget-wide v8, v3, Ll/᩹᩺֫;->ۙ:J

    add-long/2addr v6, v8

    iput-wide v6, v0, Ll/ۙ᩺֫;->ܿ:J

    goto :goto_0

    .line 1382
    :cond_0
    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 1383
    invoke-static/range {p22 .. p22}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩺֫;

    .line 1384
    iget-wide v6, v3, Ll/᩹᩺֫;->ۨ:J

    iget-wide v8, v3, Ll/᩹᩺֫;->ۙ:J

    add-long/2addr v6, v8

    iput-wide v6, v0, Ll/ۙ᩺֫;->ܿ:J

    goto :goto_0

    .line 1386
    :cond_1
    iput-wide v4, v0, Ll/ۙ᩺֫;->ܿ:J

    :goto_0
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v6

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    cmp-long v3, v1, v4

    if-ltz v3, :cond_3

    .line 1395
    iget-wide v6, v0, Ll/ۙ᩺֫;->ܿ:J

    invoke-static {v6, v7, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    goto :goto_1

    .line 1396
    :cond_3
    iget-wide v6, v0, Ll/ۙ᩺֫;->ܿ:J

    add-long/2addr v6, v1

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    :goto_1
    iput-wide v6, v0, Ll/ۙ᩺֫;->֨:J

    cmp-long v3, v1, v4

    if-ltz v3, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    .line 1397
    :goto_2
    iput-boolean v1, v0, Ll/ۙ᩺֫;->ۜ:Z

    move-object/from16 v1, p24

    .line 1398
    iput-object v1, v0, Ll/ۙ᩺֫;->ۚ:Ll/᩶᩺֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
