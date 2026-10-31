.class public final Ll/᩻ܰۜ;
.super Ljava/lang/Object;
.source "G6MJ"


# instance fields
.field public final ֫:J

.field public final ۧ:Landroid/graphics/RectF;

.field public final ܳ:J

.field public final ܽ:I

.field public final ܿ:Landroid/graphics/RectF;

.field public final ᩳ:I

.field public final ᩻:F


# direct methods
.method public constructor <init>(JJIIII)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move/from16 v5, p7

    move/from16 v6, p8

    .line 81
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput v5, v0, Ll/᩻ܰۜ;->ᩳ:I

    .line 83
    iput-wide v1, v0, Ll/᩻ܰۜ;->֫:J

    .line 84
    iput-wide v3, v0, Ll/᩻ܰۜ;->ܳ:J

    .line 85
    iput v6, v0, Ll/᩻ܰۜ;->ܽ:I

    const/high16 v7, 0x3f800000    # 1.0f

    .line 86
    invoke-static {v7, v5}, Ljava/lang/Math;->scalb(FI)F

    move-result v5

    iput v5, v0, Ll/᩻ܰۜ;->᩻:F

    long-to-double v1, v1

    int-to-double v6, v6

    mul-double v1, v1, v6

    long-to-double v3, v3

    mul-double v3, v3, v6

    .line 88
    new-instance v8, Landroid/graphics/RectF;

    float-to-double v9, v5

    div-double v11, v1, v9

    double-to-float v5, v11

    div-double v11, v3, v9

    double-to-float v11, v11

    move/from16 v12, p5

    int-to-double v12, v12

    add-double v14, v1, v6

    move-wide/from16 p1, v1

    div-double v1, v14, v9

    .line 89
    invoke-static {v12, v13, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    double-to-float v1, v1

    move/from16 v2, p6

    move-wide/from16 p3, v12

    int-to-double v12, v2

    add-double/2addr v6, v3

    move-wide/from16 p7, v14

    div-double v14, v6, v9

    .line 90
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(DD)D

    move-result-wide v14

    double-to-float v2, v14

    invoke-direct {v8, v5, v11, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v8, v0, Ll/᩻ܰۜ;->ۧ:Landroid/graphics/RectF;

    .line 91
    new-instance v1, Landroid/graphics/RectF;

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    sub-double v16, p1, v14

    div-double v14, v16, v9

    move-object/from16 p5, v1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v14

    double-to-float v2, v14

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v14

    div-double/2addr v3, v9

    .line 92
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    double-to-float v0, v0

    add-double v3, p7, v14

    div-double/2addr v3, v9

    move-wide/from16 v14, p3

    .line 93
    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    double-to-float v1, v3

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v6, v3

    div-double/2addr v6, v9

    .line 94
    invoke-static {v12, v13, v6, v7}, Ljava/lang/Math;->min(DD)D

    move-result-wide v3

    double-to-float v3, v3

    move-object/from16 v4, p5

    invoke-direct {v4, v2, v0, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v0, p0

    iput-object v4, v0, Ll/᩻ܰۜ;->ܿ:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 103
    instance-of v0, p1, Ll/᩻ܰۜ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 104
    :cond_0
    check-cast p1, Ll/᩻ܰۜ;

    .line 105
    iget v0, p0, Ll/᩻ܰۜ;->ᩳ:I

    iget v2, p1, Ll/᩻ܰۜ;->ᩳ:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/᩻ܰۜ;->ܽ:I

    iget v2, p1, Ll/᩻ܰۜ;->ܽ:I

    if-ne v0, v2, :cond_1

    iget-wide v2, p0, Ll/᩻ܰۜ;->֫:J

    iget-wide v4, p1, Ll/᩻ܰۜ;->֫:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Ll/᩻ܰۜ;->ܳ:J

    iget-wide v4, p1, Ll/᩻ܰۜ;->ܳ:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 109
    iget v0, p0, Ll/᩻ܰۜ;->ᩳ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩻ܰۜ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-wide v1, p0, Ll/᩻ܰۜ;->֫:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/᩻ܰۜ;->ܳ:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    return v0
.end method
