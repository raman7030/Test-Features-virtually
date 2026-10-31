.class public final Ll/ۨ۠ۧ;
.super Ljava/lang/Object;
.source "V2SC"


# static fields
.field public static final ܳ:Ll/ۤ۠ۧ;


# instance fields
.field public final ֫:Ll/ۛ۠ۧ;

.field public final ۧ:Ll/ۖ᩵;

.field public final ܽ:Ljava/util/List;

.field public final ܿ:Landroid/util/SparseBooleanArray;

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 960
    new-instance v0, Ll/۬۠ۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۨ۠ۧ;->ܳ:Ll/ۤ۠ۧ;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 5

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p1, p0, Ll/ۨ۠ۧ;->ܽ:Ljava/util/List;

    .line 160
    iput-object p2, p0, Ll/ۨ۠ۧ;->ᩳ:Ljava/util/List;

    .line 162
    new-instance p2, Landroid/util/SparseBooleanArray;

    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p2, p0, Ll/ۨ۠ۧ;->ܿ:Landroid/util/SparseBooleanArray;

    .line 163
    new-instance p2, Ll/ۖ᩵;

    invoke-direct {p2}, Ll/ۖ᩵;-><init>()V

    iput-object p2, p0, Ll/ۨ۠ۧ;->ۧ:Ll/ۖ᩵;

    .line 429
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/high16 v0, -0x80000000

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_1

    .line 430
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ۠ۧ;

    .line 431
    invoke-virtual {v3}, Ll/ۛ۠ۧ;->ۧ()I

    move-result v4

    if-le v4, v0, :cond_0

    .line 433
    invoke-virtual {v3}, Ll/ۛ۠ۧ;->ۧ()I

    move-result v0

    move-object v1, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 165
    :cond_1
    iput-object v1, p0, Ll/ۨ۠ۧ;->֫:Ll/ۛ۠ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺۠ۧ;)Ll/ۛ۠ۧ;
    .locals 2

    .line 316
    iget-object v0, p0, Ll/ۨ۠ۧ;->ۧ:Ll/ۖ᩵;

    const/4 v1, 0x0

    .line 369
    invoke-virtual {v0, p1, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 316
    check-cast p1, Ll/ۛ۠ۧ;

    return-object p1
.end method

.method public final ֫()V
    .locals 24

    move-object/from16 v0, p0

    .line 355
    iget-object v1, v0, Ll/ۨ۠ۧ;->ᩳ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    iget-object v4, v0, Ll/ۨ۠ۧ;->ܿ:Landroid/util/SparseBooleanArray;

    if-ge v3, v2, :cond_d

    .line 356
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺۠ۧ;

    .line 242
    iget-object v6, v5, Ll/᩺۠ۧ;->ܽ:[F

    iget-object v7, v5, Ll/᩺۠ۧ;->ۧ:[F

    array-length v8, v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v8, :cond_1

    .line 243
    aget v12, v6, v10

    cmpl-float v13, v12, v9

    if-lez v13, :cond_0

    add-float/2addr v11, v12

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    cmpl-float v8, v11, v9

    if-eqz v8, :cond_3

    .line 249
    array-length v8, v6

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v8, :cond_3

    .line 250
    aget v12, v6, v10

    cmpl-float v13, v12, v9

    if-lez v13, :cond_2

    div-float/2addr v12, v11

    .line 251
    aput v12, v6, v10

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 378
    :cond_3
    iget-object v6, v0, Ll/ۨ۠ۧ;->ܽ:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_3
    const/4 v12, 0x1

    if-ge v10, v8, :cond_b

    .line 379
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۛ۠ۧ;

    .line 394
    invoke-virtual {v13}, Ll/ۛ۠ۧ;->֫()[F

    move-result-object v14

    .line 395
    aget v12, v14, v12

    const/4 v15, 0x0

    move-object/from16 v16, v1

    .line 139
    iget-object v1, v5, Ll/᩺۠ۧ;->֫:[F

    aget v17, v7, v15

    cmpl-float v17, v12, v17

    if-ltz v17, :cond_9

    const/16 v17, 0x2

    .line 155
    aget v18, v7, v17

    cmpg-float v12, v12, v18

    if-gtz v12, :cond_9

    .line 395
    aget v12, v14, v17

    .line 163
    aget v14, v1, v15

    cmpl-float v14, v12, v14

    if-ltz v14, :cond_9

    .line 179
    aget v14, v1, v17

    cmpg-float v12, v12, v14

    if-gtz v12, :cond_9

    .line 397
    invoke-virtual {v13}, Ll/ۛ۠ۧ;->ܽ()I

    move-result v14

    invoke-virtual {v4, v14}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v14

    if-nez v14, :cond_9

    .line 401
    invoke-virtual {v13}, Ll/ۛ۠ۧ;->֫()[F

    move-result-object v14

    const/16 v18, 0x1

    .line 407
    iget-object v12, v0, Ll/ۨ۠ۧ;->֫:Ll/ۛ۠ۧ;

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Ll/ۛ۠ۧ;->ۧ()I

    move-result v12

    goto :goto_4

    :cond_4
    const/4 v12, 0x1

    :goto_4
    move/from16 v20, v2

    .line 192
    iget-object v2, v5, Ll/᩺۠ۧ;->ܽ:[F

    aget v15, v2, v15

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    cmpl-float v22, v15, v19

    if-lez v22, :cond_5

    .line 410
    aget v22, v14, v18

    .line 147
    aget v23, v7, v18

    sub-float v22, v22, v23

    .line 411
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    move-result v22

    sub-float v22, v21, v22

    mul-float v22, v22, v15

    goto :goto_5

    :cond_5
    const/16 v22, 0x0

    .line 205
    :goto_5
    aget v15, v2, v18

    const/16 v19, 0x0

    cmpl-float v23, v15, v19

    if-lez v23, :cond_6

    .line 414
    aget v14, v14, v17

    .line 171
    aget v1, v1, v18

    sub-float/2addr v14, v1

    .line 415
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    move-result v1

    sub-float v21, v21, v1

    mul-float v21, v21, v15

    goto :goto_6

    :cond_6
    const/16 v21, 0x0

    .line 216
    :goto_6
    aget v1, v2, v17

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_7

    .line 419
    invoke-virtual {v13}, Ll/ۛ۠ۧ;->ۧ()I

    move-result v2

    int-to-float v2, v2

    int-to-float v12, v12

    div-float/2addr v2, v12

    mul-float v2, v2, v1

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    add-float v22, v22, v21

    add-float v22, v22, v2

    if-eqz v9, :cond_8

    cmpl-float v1, v22, v11

    if-lez v1, :cond_a

    :cond_8
    move-object v9, v13

    move/from16 v11, v22

    goto :goto_8

    :cond_9
    move/from16 v20, v2

    :cond_a
    :goto_8
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v16

    move/from16 v2, v20

    goto/16 :goto_3

    :cond_b
    move-object/from16 v16, v1

    move/from16 v20, v2

    if-eqz v9, :cond_c

    .line 369
    invoke-virtual {v9}, Ll/ۛ۠ۧ;->ܽ()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v4, v1, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 358
    :cond_c
    iget-object v1, v0, Ll/ۨ۠ۧ;->ۧ:Ll/ۖ᩵;

    invoke-virtual {v1, v5, v9}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, v16

    move/from16 v2, v20

    goto/16 :goto_0

    .line 361
    :cond_d
    invoke-virtual {v4}, Landroid/util/SparseBooleanArray;->clear()V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ۨ۠ۧ;->֫:Ll/ۛ۠ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۛ۠ۧ;->ܽ()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ۛ۠ۧ;
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ۨ۠ۧ;->֫:Ll/ۛ۠ۧ;

    return-object v0
.end method
