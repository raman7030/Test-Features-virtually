.class public final Ll/ܳ֡;
.super Ljava/lang/Object;
.source "A1CD"


# static fields
.field public static ֨:[D


# instance fields
.field public ֡:D

.field public ֫:Z

.field public ۖ:D

.field public ۘ:Z

.field public ۚ:D

.field public ۜ:[D

.field public ۡ:D

.field public ۢ:D

.field public ۧ:D

.field public ܳ:D

.field public ܺ:D

.field public ܽ:D

.field public ܿ:D

.field public ᩳ:D

.field public ᩴ:D

.field public ᩵:D

.field public ᩷:D

.field public ᩻:D


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5b

    new-array v0, v0, [D

    .line 194
    sput-object v0, Ll/ܳ֡;->֨:[D

    return-void
.end method

.method public constructor <init>(IDDDDDD)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    .line 212
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v14, 0x0

    .line 209
    iput-boolean v14, v0, Ll/ܳ֡;->֫:Z

    const/4 v15, 0x1

    if-ne v1, v15, :cond_0

    const/4 v14, 0x1

    .line 213
    :cond_0
    iput-boolean v14, v0, Ll/ܳ֡;->ۘ:Z

    .line 214
    iput-wide v2, v0, Ll/ܳ֡;->ۢ:D

    .line 215
    iput-wide v4, v0, Ll/ܳ֡;->ۡ:D

    sub-double v2, v4, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    div-double/2addr v4, v2

    .line 216
    iput-wide v4, v0, Ll/ܳ֡;->᩷:D

    move-wide/from16 p2, v2

    const/4 v2, 0x3

    if-ne v2, v1, :cond_1

    .line 218
    iput-boolean v15, v0, Ll/ܳ֡;->֫:Z

    :cond_1
    sub-double v1, v10, v6

    move-wide/from16 p4, v4

    sub-double v3, v12, v8

    .line 222
    iget-boolean v5, v0, Ll/ܳ֡;->֫:Z

    if-nez v5, :cond_d

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v15

    const-wide v17, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v5, v15, v17

    if-ltz v5, :cond_d

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v15

    cmpg-double v5, v15, v17

    if-gez v5, :cond_2

    goto/16 :goto_8

    :cond_2
    const/16 v5, 0x65

    new-array v5, v5, [D

    .line 234
    iput-object v5, v0, Ll/ܳ֡;->ۜ:[D

    if-eqz v14, :cond_3

    const/4 v15, -0x1

    goto :goto_0

    :cond_3
    const/4 v15, 0x1

    :goto_0
    int-to-double v10, v15

    mul-double v10, v10, v1

    .line 235
    iput-wide v10, v0, Ll/ܳ֡;->ᩳ:D

    if-eqz v14, :cond_4

    const/4 v10, 0x1

    goto :goto_1

    :cond_4
    const/4 v10, -0x1

    :goto_1
    int-to-double v10, v10

    mul-double v3, v3, v10

    .line 236
    iput-wide v3, v0, Ll/ܳ֡;->ܿ:D

    if-eqz v14, :cond_5

    move-wide/from16 v6, p10

    .line 237
    :cond_5
    iput-wide v6, v0, Ll/ܳ֡;->ܳ:D

    if-eqz v14, :cond_6

    move-wide v3, v8

    goto :goto_2

    :cond_6
    move-wide v3, v12

    .line 238
    :goto_2
    iput-wide v3, v0, Ll/ܳ֡;->᩻:D

    sub-double v3, v8, v12

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    :goto_3
    const/16 v13, 0x5b

    const/16 v14, 0x5a

    .line 311
    sget-object v15, Ll/ܳ֡;->֨:[D

    if-ge v6, v13, :cond_8

    const-wide v16, 0x4056800000000000L    # 90.0

    move-wide/from16 p3, v7

    int-to-double v7, v6

    mul-double v7, v7, v16

    int-to-double v13, v14

    div-double/2addr v7, v13

    .line 312
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    .line 313
    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    .line 314
    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double v13, v13, v1

    mul-double v7, v7, v3

    if-lez v6, :cond_7

    sub-double v9, v13, v9

    sub-double v11, v7, v11

    .line 318
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v9

    add-double v9, p3, v9

    .line 319
    aput-wide v9, v15, v6

    goto :goto_4

    :cond_7
    move-wide/from16 v9, p3

    :goto_4
    add-int/lit8 v6, v6, 0x1

    move-wide v11, v7

    move-wide v7, v9

    move-wide v9, v13

    goto :goto_3

    .line 325
    :cond_8
    iput-wide v7, v0, Ll/ܳ֡;->ۧ:D

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v13, :cond_9

    .line 328
    aget-wide v2, v15, v1

    div-double/2addr v2, v7

    aput-wide v2, v15, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_9
    const/16 v1, 0x65

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v1, :cond_c

    int-to-double v3, v2

    const/16 v6, 0x64

    int-to-double v6, v6

    div-double/2addr v3, v6

    .line 332
    invoke-static {v15, v3, v4}, Ljava/util/Arrays;->binarySearch([DD)I

    move-result v6

    if-ltz v6, :cond_a

    .line 334
    div-int/lit8 v6, v6, 0x5a

    int-to-double v3, v6

    aput-wide v3, v5, v2

    const-wide/16 v7, 0x0

    goto :goto_7

    :cond_a
    const/4 v7, -0x1

    if-ne v6, v7, :cond_b

    const-wide/16 v7, 0x0

    .line 336
    aput-wide v7, v5, v2

    goto :goto_7

    :cond_b
    const-wide/16 v7, 0x0

    neg-int v6, v6

    add-int/lit8 v9, v6, -0x2

    add-int/lit8 v6, v6, -0x1

    int-to-double v10, v9

    .line 341
    aget-wide v12, v15, v9

    sub-double/2addr v3, v12

    aget-wide v16, v15, v6

    sub-double v16, v16, v12

    div-double v3, v3, v16

    add-double/2addr v3, v10

    int-to-double v9, v14

    div-double/2addr v3, v9

    .line 343
    aput-wide v3, v5, v2

    :goto_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 240
    :cond_c
    iget-wide v1, v0, Ll/ܳ֡;->ۧ:D

    iget-wide v3, v0, Ll/ܳ֡;->᩷:D

    mul-double v1, v1, v3

    iput-wide v1, v0, Ll/ܳ֡;->ܽ:D

    return-void

    :cond_d
    :goto_8
    const/4 v5, 0x1

    .line 223
    iput-boolean v5, v0, Ll/ܳ֡;->֫:Z

    .line 224
    iput-wide v6, v0, Ll/ܳ֡;->ᩴ:D

    move-wide/from16 v5, p10

    .line 225
    iput-wide v5, v0, Ll/ܳ֡;->᩵:D

    .line 226
    iput-wide v8, v0, Ll/ܳ֡;->֡:D

    .line 227
    iput-wide v12, v0, Ll/ܳ֡;->ۚ:D

    .line 228
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    iput-wide v5, v0, Ll/ܳ֡;->ۧ:D

    mul-double v5, v5, p4

    .line 229
    iput-wide v5, v0, Ll/ܳ֡;->ܽ:D

    div-double v1, v1, p2

    .line 230
    iput-wide v1, v0, Ll/ܳ֡;->ܳ:D

    div-double v3, v3, p2

    .line 231
    iput-wide v3, v0, Ll/ܳ֡;->᩻:D

    return-void
.end method


# virtual methods
.method public final ֫()D
    .locals 6

    .line 260
    iget-wide v0, p0, Ll/ܳ֡;->ᩳ:D

    iget-wide v2, p0, Ll/ܳ֡;->ܺ:D

    mul-double v0, v0, v2

    .line 261
    iget-wide v2, p0, Ll/ܳ֡;->ܿ:D

    neg-double v2, v2

    iget-wide v4, p0, Ll/ܳ֡;->ۖ:D

    mul-double v2, v2, v4

    .line 262
    iget-wide v4, p0, Ll/ܳ֡;->ܽ:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v2

    div-double/2addr v4, v2

    .line 263
    iget-boolean v2, p0, Ll/ܳ֡;->ۘ:Z

    if-eqz v2, :cond_0

    neg-double v0, v0

    mul-double v0, v0, v4

    return-wide v0

    :cond_0
    mul-double v0, v0, v4

    return-wide v0
.end method

.method public final ֫(D)D
    .locals 4

    .line 274
    iget-wide v0, p0, Ll/ܳ֡;->ۢ:D

    sub-double/2addr p1, v0

    iget-wide v0, p0, Ll/ܳ֡;->᩷:D

    mul-double p1, p1, v0

    .line 275
    iget-wide v0, p0, Ll/ܳ֡;->᩵:D

    iget-wide v2, p0, Ll/ܳ֡;->ᩴ:D

    sub-double/2addr v0, v2

    mul-double v0, v0, p1

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public final ۧ(D)D
    .locals 4

    .line 279
    iget-wide v0, p0, Ll/ܳ֡;->ۢ:D

    sub-double/2addr p1, v0

    iget-wide v0, p0, Ll/ܳ֡;->᩷:D

    mul-double p1, p1, v0

    .line 280
    iget-wide v0, p0, Ll/ܳ֡;->ۚ:D

    iget-wide v2, p0, Ll/ܳ֡;->֡:D

    sub-double/2addr v0, v2

    mul-double v0, v0, p1

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public final ܽ(D)V
    .locals 6

    .line 244
    iget-boolean v0, p0, Ll/ܳ֡;->ۘ:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/ܳ֡;->ۡ:D

    sub-double/2addr v0, p1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Ll/ܳ֡;->ۢ:D

    sub-double v0, p1, v0

    :goto_0
    iget-wide p1, p0, Ll/ܳ֡;->᩷:D

    mul-double v0, v0, p1

    const-wide/16 p1, 0x0

    cmpg-double v2, v0, p1

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    cmpl-double v2, v0, p1

    if-ltz v2, :cond_2

    goto :goto_1

    .line 298
    :cond_2
    iget-object p1, p0, Ll/ܳ֡;->ۜ:[D

    array-length p2, p1

    add-int/lit8 p2, p2, -0x1

    int-to-double v2, p2

    mul-double v0, v0, v2

    double-to-int p2, v0

    int-to-double v2, p2

    sub-double/2addr v0, v2

    .line 303
    aget-wide v2, p1, p2

    add-int/lit8 p2, p2, 0x1

    aget-wide v4, p1, p2

    sub-double/2addr v4, v2

    mul-double v4, v4, v0

    add-double p1, v4, v2

    :goto_1
    const-wide v0, 0x3ff921fb54442d18L    # 1.5707963267948966

    mul-double p1, p1, v0

    .line 247
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    iput-wide v0, p0, Ll/ܳ֡;->ۖ:D

    .line 248
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    iput-wide p1, p0, Ll/ܳ֡;->ܺ:D

    return-void
.end method
