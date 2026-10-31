.class public final Ll/᩹ܽ֫;
.super Ljava/lang/Object;
.source "EB34"


# instance fields
.field public ֫:D

.field public ۜ:D

.field public ۢ:D

.field public ۧ:D

.field public ܳ:Z

.field public ܽ:D

.field public ܿ:D

.field public ᩳ:D

.field public ᩷:D

.field public final ᩻:Ll/ᩴܽ֫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x4097700000000000L    # 1500.0

    .line 83
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹ܽ֫;->ۜ:D

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 85
    iput-wide v0, p0, Ll/᩹ܽ֫;->ۧ:D

    const/4 v0, 0x0

    .line 91
    iput-boolean v0, p0, Ll/᩹ܽ֫;->ܳ:Z

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 104
    iput-wide v0, p0, Ll/᩹ܽ֫;->ܽ:D

    .line 107
    new-instance v0, Ll/ᩴܽ֫;

    .line 323
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object v0, p0, Ll/᩹ܽ֫;->᩻:Ll/ᩴܽ֫;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 2

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x4097700000000000L    # 1500.0

    .line 83
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹ܽ֫;->ۜ:D

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 85
    iput-wide v0, p0, Ll/᩹ܽ֫;->ۧ:D

    const/4 v0, 0x0

    .line 91
    iput-boolean v0, p0, Ll/᩹ܽ֫;->ܳ:Z

    .line 107
    new-instance v0, Ll/ᩴܽ֫;

    .line 323
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object v0, p0, Ll/᩹ܽ֫;->᩻:Ll/ᩴܽ֫;

    float-to-double v0, p1

    .line 123
    iput-wide v0, p0, Ll/᩹ܽ֫;->ܽ:D

    return-void
.end method


# virtual methods
.method public final ֫()F
    .locals 2

    .line 206
    iget-wide v0, p0, Ll/᩹ܽ֫;->ܽ:D

    double-to-float v0, v0

    return v0
.end method

.method public final ֫(DDJ)Ll/ᩴܽ֫;
    .locals 16

    move-object/from16 v0, p0

    .line 247
    iget-boolean v1, v0, Ll/᩹ܽ֫;->ܳ:Z

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    if-eqz v1, :cond_0

    goto :goto_1

    .line 251
    :cond_0
    iget-wide v4, v0, Ll/᩹ܽ֫;->ܽ:D

    const-wide v6, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpl-double v1, v4, v6

    if-eqz v1, :cond_5

    .line 256
    iget-wide v4, v0, Ll/᩹ܽ֫;->ۧ:D

    cmpl-double v1, v4, v2

    if-lez v1, :cond_1

    neg-double v6, v4

    .line 258
    iget-wide v8, v0, Ll/᩹ܽ֫;->ۜ:D

    mul-double v6, v6, v8

    mul-double v4, v4, v4

    sub-double/2addr v4, v2

    .line 259
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double v4, v4, v8

    add-double/2addr v4, v6

    iput-wide v4, v0, Ll/᩹ܽ֫;->ܿ:D

    .line 260
    iget-wide v4, v0, Ll/᩹ܽ֫;->ۧ:D

    neg-double v6, v4

    iget-wide v8, v0, Ll/᩹ܽ֫;->ۜ:D

    mul-double v6, v6, v8

    mul-double v4, v4, v4

    sub-double/2addr v4, v2

    .line 261
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double v4, v4, v8

    sub-double/2addr v6, v4

    iput-wide v6, v0, Ll/᩹ܽ֫;->ᩳ:D

    goto :goto_0

    :cond_1
    const-wide/16 v6, 0x0

    cmpl-double v1, v4, v6

    if-ltz v1, :cond_2

    cmpg-double v1, v4, v2

    if-gez v1, :cond_2

    .line 264
    iget-wide v6, v0, Ll/᩹ܽ֫;->ۜ:D

    mul-double v4, v4, v4

    sub-double v4, v2, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    mul-double v4, v4, v6

    iput-wide v4, v0, Ll/᩹ܽ֫;->֫:D

    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 267
    iput-boolean v1, v0, Ll/᩹ܽ֫;->ܳ:Z

    :goto_1
    move-wide/from16 v4, p5

    long-to-double v4, v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    .line 279
    iget-wide v6, v0, Ll/᩹ܽ֫;->ܽ:D

    sub-double v6, p1, v6

    .line 282
    iget-wide v8, v0, Ll/᩹ܽ֫;->ۧ:D

    const-wide v10, 0x4005bf0a8b145769L    # Math.E

    cmpl-double v1, v8, v2

    if-lez v1, :cond_3

    .line 284
    iget-wide v1, v0, Ll/᩹ܽ֫;->ᩳ:D

    mul-double v8, v1, v6

    sub-double v8, v8, p3

    iget-wide v12, v0, Ll/᩹ܽ֫;->ܿ:D

    sub-double v12, v1, v12

    div-double/2addr v8, v12

    sub-double/2addr v6, v8

    mul-double v1, v1, v4

    .line 288
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double v1, v1, v6

    iget-wide v12, v0, Ll/᩹ܽ֫;->ܿ:D

    mul-double v12, v12, v4

    .line 289
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    mul-double v12, v12, v8

    add-double/2addr v12, v1

    .line 290
    iget-wide v1, v0, Ll/᩹ܽ֫;->ᩳ:D

    mul-double v6, v6, v1

    mul-double v1, v1, v4

    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double v1, v1, v6

    iget-wide v6, v0, Ll/᩹ܽ֫;->ܿ:D

    mul-double v8, v8, v6

    mul-double v6, v6, v4

    .line 291
    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    mul-double v3, v3, v8

    add-double/2addr v3, v1

    goto/16 :goto_2

    :cond_3
    if-nez v1, :cond_4

    .line 295
    iget-wide v1, v0, Ll/᩹ܽ֫;->ۜ:D

    mul-double v8, v1, v6

    add-double v8, v8, p3

    mul-double v12, v8, v4

    add-double/2addr v12, v6

    neg-double v1, v1

    mul-double v1, v1, v4

    .line 296
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    mul-double v1, v1, v12

    .line 297
    iget-wide v6, v0, Ll/᩹ܽ֫;->ۜ:D

    neg-double v6, v6

    mul-double v6, v6, v4

    invoke-static {v10, v11, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    mul-double v6, v6, v12

    iget-wide v12, v0, Ll/᩹ܽ֫;->ۜ:D

    neg-double v12, v12

    mul-double v6, v6, v12

    mul-double v12, v12, v4

    .line 298
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    mul-double v3, v3, v8

    add-double/2addr v3, v6

    move-wide v12, v1

    goto :goto_2

    .line 302
    :cond_4
    iget-wide v12, v0, Ll/᩹ܽ֫;->֫:D

    div-double/2addr v2, v12

    iget-wide v12, v0, Ll/᩹ܽ֫;->ۜ:D

    mul-double v14, v8, v12

    mul-double v14, v14, v6

    add-double v14, v14, p3

    mul-double v14, v14, v2

    neg-double v1, v8

    mul-double v1, v1, v12

    mul-double v1, v1, v4

    .line 304
    invoke-static {v10, v11, v1, v2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    iget-wide v8, v0, Ll/᩹ܽ֫;->֫:D

    mul-double v8, v8, v4

    .line 305
    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double v8, v8, v6

    iget-wide v10, v0, Ll/᩹ܽ֫;->֫:D

    mul-double v10, v10, v4

    .line 306
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double v10, v10, v14

    add-double/2addr v10, v8

    mul-double v12, v10, v1

    .line 307
    iget-wide v1, v0, Ll/᩹ܽ֫;->ۜ:D

    neg-double v8, v1

    mul-double v8, v8, v12

    iget-wide v10, v0, Ll/᩹ܽ֫;->ۧ:D

    mul-double v8, v8, v10

    neg-double v10, v10

    mul-double v10, v10, v1

    mul-double v10, v10, v4

    const-wide v1, 0x4005bf0a8b145769L    # Math.E

    .line 308
    invoke-static {v1, v2, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    iget-wide v10, v0, Ll/᩹ܽ֫;->֫:D

    move-wide/from16 p1, v12

    neg-double v12, v10

    mul-double v12, v12, v6

    mul-double v10, v10, v4

    .line 309
    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    mul-double v6, v6, v12

    iget-wide v10, v0, Ll/᩹ܽ֫;->֫:D

    mul-double v14, v14, v10

    mul-double v10, v10, v4

    .line 310
    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double v3, v3, v14

    add-double/2addr v3, v6

    mul-double v3, v3, v1

    add-double/2addr v3, v8

    move-wide/from16 v12, p1

    .line 313
    :goto_2
    iget-wide v1, v0, Ll/᩹ܽ֫;->ܽ:D

    add-double/2addr v12, v1

    double-to-float v1, v12

    iget-object v2, v0, Ll/᩹ܽ֫;->᩻:Ll/ᩴܽ֫;

    iput v1, v2, Ll/ᩴܽ֫;->֫:F

    double-to-float v1, v3

    .line 314
    iput v1, v2, Ll/ᩴܽ֫;->ۧ:F

    return-object v2

    .line 252
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Error: Final position of the spring must be set before the animation starts"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(D)V
    .locals 2

    .line 329
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide p1

    iput-wide p1, p0, Ll/᩹ܽ֫;->᩷:D

    const-wide v0, 0x404f400000000000L    # 62.5

    mul-double p1, p1, v0

    .line 330
    iput-wide p1, p0, Ll/᩹ܽ֫;->ۢ:D

    return-void
.end method

.method public final ֫(F)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    float-to-double v0, p1

    .line 174
    iput-wide v0, p0, Ll/᩹ܽ֫;->ۧ:D

    const/4 p1, 0x0

    .line 176
    iput-boolean p1, p0, Ll/᩹ܽ֫;->ܳ:Z

    return-void

    .line 172
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Damping ratio must be non-negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(FF)Z
    .locals 4

    .line 232
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    float-to-double v0, p2

    iget-wide v2, p0, Ll/᩹ܽ֫;->ۢ:D

    cmpg-double p2, v0, v2

    if-gez p2, :cond_0

    .line 206
    iget-wide v0, p0, Ll/᩹ܽ֫;->ܽ:D

    double-to-float p2, v0

    sub-float/2addr p1, p2

    .line 233
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    float-to-double p1, p1

    iget-wide v0, p0, Ll/᩹ܽ֫;->᩷:D

    cmpg-double v2, p1, v0

    if-gez v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(F)V
    .locals 2

    float-to-double v0, p1

    .line 196
    iput-wide v0, p0, Ll/᩹ܽ֫;->ܽ:D

    return-void
.end method

.method public final ܽ(F)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_0

    float-to-double v0, p1

    .line 140
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹ܽ֫;->ۜ:D

    const/4 p1, 0x0

    .line 142
    iput-boolean p1, p0, Ll/᩹ܽ֫;->ܳ:Z

    return-void

    .line 138
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Spring stiffness constant must be positive."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
