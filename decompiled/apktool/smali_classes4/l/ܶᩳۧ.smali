.class public final synthetic Ll/ܶᩳۧ;
.super Ljava/lang/Object;
.source "18UV"

# interfaces
.implements Ll/ܽܿۧ;


# instance fields
.field public final synthetic ֫:Ll/᩺ᩳۧ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:[I

.field public final synthetic ᩳ:Landroid/graphics/Point;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ᩳۧ;Ljava/lang/String;[ILandroid/graphics/Point;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶᩳۧ;->֫:Ll/᩺ᩳۧ;

    iput-object p2, p0, Ll/ܶᩳۧ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܶᩳۧ;->ܽ:[I

    iput-object p4, p0, Ll/ܶᩳۧ;->ᩳ:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/۬᩵֫;[I)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    .line 2811
    iget-object v1, v0, Ll/ܶᩳۧ;->ܽ:[I

    aget v11, v1, p1

    .line 3579
    iget-object v12, v0, Ll/ܶᩳۧ;->֫:Ll/᩺ᩳۧ;

    iget-object v1, v0, Ll/ܶᩳۧ;->ᩳ:Landroid/graphics/Point;

    if-eqz v1, :cond_0

    iget v2, v1, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    iget v2, v12, Ll/ۨ᩵֫;->ۨ:I

    :goto_0
    if-eqz v1, :cond_1

    .line 3581
    iget v1, v1, Landroid/graphics/Point;->y:I

    goto :goto_1

    :cond_1
    iget v1, v12, Ll/ۨ᩵֫;->ۤ:I

    .line 3582
    :goto_1
    iget-boolean v3, v12, Ll/ۨ᩵֫;->ۛ:Z

    const v4, 0x7fffffff

    if-eq v2, v4, :cond_9

    if-ne v1, v4, :cond_2

    goto/16 :goto_7

    :cond_2
    const/4 v4, 0x0

    const v5, 0x7fffffff

    .line 3436
    :goto_2
    iget v6, v10, Ll/۬᩵֫;->ᩳ:I

    if-ge v4, v6, :cond_8

    .line 3437
    invoke-virtual {v10, v4}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v6

    .line 3440
    iget v7, v6, Ll/۠ᩴ֫;->᩷֫:I

    iget v8, v6, Ll/۠ᩴ֫;->۠:I

    if-lez v7, :cond_7

    if-lez v8, :cond_7

    if-eqz v3, :cond_5

    if-le v7, v8, :cond_3

    const/4 v9, 0x1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    :goto_3
    if-le v2, v1, :cond_4

    const/4 v13, 0x1

    goto :goto_4

    :cond_4
    const/4 v13, 0x0

    :goto_4
    if-eq v9, v13, :cond_5

    move v13, v1

    move v9, v2

    goto :goto_5

    :cond_5
    move v9, v1

    move v13, v2

    :goto_5
    mul-int v14, v7, v9

    mul-int v15, v8, v13

    if-lt v14, v15, :cond_6

    .line 228
    new-instance v9, Landroid/graphics/Point;

    invoke-static {v15, v7}, Ll/ۘ֨֫;->֫(II)I

    move-result v7

    invoke-direct {v9, v13, v7}, Landroid/graphics/Point;-><init>(II)V

    goto :goto_6

    .line 231
    :cond_6
    new-instance v7, Landroid/graphics/Point;

    invoke-static {v14, v8}, Ll/ۘ֨֫;->֫(II)I

    move-result v13

    invoke-direct {v7, v13, v9}, Landroid/graphics/Point;-><init>(II)V

    move-object v9, v7

    .line 3444
    :goto_6
    iget v6, v6, Ll/۠ᩴ֫;->᩷֫:I

    mul-int v7, v6, v8

    .line 3445
    iget v13, v9, Landroid/graphics/Point;->x:I

    int-to-float v13, v13

    const v14, 0x3f7ae148    # 0.98f

    mul-float v13, v13, v14

    float-to-int v13, v13

    if-lt v6, v13, :cond_7

    iget v6, v9, Landroid/graphics/Point;->y:I

    int-to-float v6, v6

    mul-float v6, v6, v14

    float-to-int v6, v6

    if-lt v8, v6, :cond_7

    if-ge v7, v5, :cond_7

    move v5, v7

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    move v13, v5

    goto :goto_8

    :cond_9
    :goto_7
    const v5, 0x7fffffff

    const v13, 0x7fffffff

    .line 3585
    :goto_8
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v14, Ll/֫۬ܺ;

    invoke-direct {v14}, Ll/֫۬ܺ;-><init>()V

    const/4 v1, 0x0

    const/4 v15, 0x0

    .line 3586
    :goto_9
    iget v1, v10, Ll/۬᩵֫;->ᩳ:I

    if-ge v15, v1, :cond_e

    .line 3587
    invoke-virtual {v10, v15}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v1

    .line 1319
    iget v2, v1, Ll/۠ᩴ֫;->᩷֫:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_b

    iget v1, v1, Ll/۠ᩴ֫;->۠:I

    if-ne v1, v3, :cond_a

    goto :goto_a

    :cond_a
    mul-int v2, v2, v1

    goto :goto_b

    :cond_b
    :goto_a
    const/4 v2, -0x1

    :goto_b
    const v1, 0x7fffffff

    if-eq v13, v1, :cond_d

    if-eq v2, v3, :cond_c

    if-gt v2, v13, :cond_c

    goto :goto_c

    :cond_c
    const/4 v1, 0x0

    const/4 v9, 0x0

    goto :goto_d

    :cond_d
    :goto_c
    const/4 v1, 0x1

    const/4 v9, 0x1

    .line 3591
    :goto_d
    new-instance v8, Ll/᩻ܿۧ;

    aget v6, p3, v15

    iget-object v7, v0, Ll/ܶᩳۧ;->ۧ:Ljava/lang/String;

    move-object v1, v8

    move/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v15

    move-object v5, v12

    move-object v0, v8

    move v8, v11

    invoke-direct/range {v1 .. v9}, Ll/᩻ܿۧ;-><init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;ILjava/lang/String;IZ)V

    invoke-virtual {v14, v0}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    goto :goto_9

    .line 3602
    :cond_e
    invoke-virtual {v14}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method
