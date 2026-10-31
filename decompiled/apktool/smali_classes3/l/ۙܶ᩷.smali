.class public final synthetic Ll/ۙܶ᩷;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Ll/ܽۨ;
.implements Ll/۟ܶۧ;
.implements Lcom/google/android/material/canvas/CanvasCompat$CanvasOperation;


# static fields
.field private static final ᩺ܶ۠:[S


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙܶ᩷;->᩺ܶ۠:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x181es
        -0x360es
        -0x3602s
        -0x6cb3s
        0x5525s
        0x55fbs
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, 0x19357863

    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    .line 0
    iput p1, p0, Ll/ۙܶ᩷;->᩸:I

    iput-object p2, p0, Ll/ۙܶ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06e2\u05a8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x5253

    const v3, 0x64d150c4

    xor-int/2addr p2, v3

    const v3, -0x74e77fab

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x6393

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez p1, :cond_1

    goto :goto_1

    .line 3
    :sswitch_0
    sget p1, Ll/ۨ;->᩺᩷ۚ:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06eb\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2a33

    const v3, -0x44f00e85

    xor-int/2addr p2, v3

    const v3, 0x5aae0246

    goto :goto_0

    :cond_1
    const-string p1, "\u06dc\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x1b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x44a3

    const v3, -0x39872b08

    xor-int/2addr p2, v3

    const v3, -0x55b3c37d

    goto :goto_0

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget p1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u06db\u0730"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x7d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4751

    const v3, 0x57062650

    xor-int/2addr p2, v3

    const v3, 0x29a72862

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    :goto_1
    const-string p1, "\u05ab\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x7f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x292d

    const v3, 0x46834965

    xor-int/2addr p2, v3

    const v3, -0x3de35036

    goto :goto_0

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz p1, :cond_3

    const-string p1, "\u0730\u06e0"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6687

    const v3, -0xfe0b4c1

    xor-int/2addr p2, v3

    const v3, -0x55472795

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e2\u06eb"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x75

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x207f

    const v3, -0x2a947866

    xor-int/2addr p2, v3

    const v3, 0x7142556

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x773e9a4d -> :sswitch_0
        -0x5ffdcca4 -> :sswitch_4
        -0x5e0b123e -> :sswitch_2
        -0x5e05e2e3 -> :sswitch_5
        -0x4e8e3280 -> :sswitch_1
        -0x2641ce57 -> :sswitch_0
        -0x1c6565c0 -> :sswitch_3
        0x7b435aa -> :sswitch_4
        0x8af457c -> :sswitch_1
        0x2410ed78 -> :sswitch_5
        0x27747952 -> :sswitch_3
        0x5fccafda -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 21

    move-object/from16 v0, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v14, 0x526cf7e

    sget v15, Ll/ۘۛ;->ۖۚ֡:I

    sget v16, Ll/ۛ;->᩺᩻֫:I

    const-string v17, "\u1a7a\u06e1"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    add-int v17, v17, v16

    mul-int/lit8 v17, v17, -0x6f

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x7895

    const v19, -0x4563f15e

    xor-int v1, v1, v19

    const v19, 0x4d6d67b4    # 2.4893728E8f

    xor-int v17, v17, v19

    const/16 v18, 0x0

    :goto_0
    xor-int/2addr v14, v15

    mul-int/lit16 v14, v14, 0x2f73

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v1, v14

    xor-int v14, v17, v1

    sparse-switch v14, :sswitch_data_0

    move/from16 v17, v14

    .line 107
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_c

    goto/16 :goto_8

    .line 175
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move/from16 v17, v14

    goto/16 :goto_7

    :cond_1
    move/from16 v17, v14

    goto/16 :goto_8

    .line 11
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v1

    if-gez v1, :cond_0

    goto :goto_1

    .line 156
    :sswitch_2
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_2

    move-object/from16 v1, p0

    move/from16 v17, v14

    goto/16 :goto_6

    :cond_2
    :goto_1
    const-string v1, "\u073f\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x6b

    move/from16 v17, v14

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x39bf

    const v19, 0x10b28d91

    xor-int v14, v14, v19

    const v19, -0x729bb788

    goto/16 :goto_4

    :sswitch_3
    move/from16 v17, v14

    .line 127
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-object/from16 v1, p0

    goto/16 :goto_6

    .line 165
    :sswitch_4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    const/4 v0, 0x0

    return-object v0

    .line 178
    :sswitch_5
    iput v13, v12, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 179
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    return-object v0

    :sswitch_6
    move-object/from16 v1, p1

    move/from16 v17, v14

    .line 177
    invoke-virtual {v1, v6, v11, v7, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    invoke-static {v2}, Ll/۠;->۠ۘۨ(Ljava/lang/Object;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    iget v13, v3, Ll/ۧ۬;->ᩳ:I

    .line 132
    sget-boolean v14, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v14, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v14, "\u0733\u05a1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v15

    xor-int v1, v14, v16

    mul-int/lit16 v1, v1, 0x2407

    const v19, 0x319db3a6

    xor-int v1, v1, v19

    const v19, -0x1167c968

    xor-int v14, v14, v19

    :goto_2
    move/from16 v20, v17

    move/from16 v17, v14

    goto/16 :goto_5

    :sswitch_7
    move/from16 v17, v14

    .line 177
    invoke-static {v8, v9}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v10

    const/4 v11, 0x0

    .line 49
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u073f\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x3943

    const v19, -0x1ca95702

    xor-int v14, v14, v19

    const v19, -0x29ba4e26

    goto/16 :goto_4

    :sswitch_8
    move/from16 v17, v14

    .line 177
    iget v7, v3, Ll/ۧ۬;->ܽ:I

    iget v8, v3, Ll/ۧ۬;->֫:I

    iget v9, v5, Ll/ۧ۬;->֫:I

    .line 112
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_5

    goto :goto_3

    :cond_5
    const-string v1, "\u1a79\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x23

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x701f

    const v19, -0x750fa0c8

    xor-int v14, v14, v19

    const v19, -0x75622014

    goto/16 :goto_4

    :sswitch_9
    move/from16 v17, v14

    .line 175
    invoke-virtual {v0, v4}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v5

    .line 177
    iget v6, v3, Ll/ۧ۬;->ۧ:I

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u06ec\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x48fd

    const v19, 0x3651e710

    xor-int v14, v14, v19

    const v19, 0x7a5853d

    goto :goto_4

    :sswitch_a
    move/from16 v17, v14

    const/4 v1, 0x7

    .line 174
    invoke-virtual {v0, v1}, Ll/᩸ܰ;->֫(I)Ll/ۧ۬;

    move-result-object v3

    const/16 v4, 0x8

    .line 28
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_7

    :goto_3
    const-string v1, "\u06d9\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x162f

    const v19, 0x45a3e9c

    xor-int v14, v14, v19

    const v19, 0x1d18a8dc

    goto :goto_4

    :cond_7
    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x7613

    const v19, 0x7128031e

    xor-int v14, v14, v19

    const v19, -0x592aaf32

    goto :goto_4

    :sswitch_b
    move/from16 v17, v14

    .line 4
    move-object/from16 v2, v18

    check-cast v2, Landroid/view/View;

    .line 6
    sget v1, Ll/ۜ᩸᩷;->ۡۧ:I

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06d9\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x4261

    const v19, -0x49048c3e

    xor-int v14, v14, v19

    const v19, -0x31570d50

    :goto_4
    xor-int v1, v1, v19

    move/from16 v20, v17

    move/from16 v17, v1

    move v1, v14

    :goto_5
    move/from16 v14, v20

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v1, p0

    move/from16 v17, v14

    .line 2
    iget-object v14, v1, Ll/ۙܶ᩷;->᩹:Ljava/lang/Object;

    .line 58
    sget v18, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v18, :cond_9

    move-object/from16 v18, v14

    :goto_6
    const-string v14, "\u1a73\u1a73"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v16, v14

    mul-int/lit8 v14, v14, -0x61

    xor-int v0, v14, v15

    mul-int/lit16 v0, v0, -0x4c19

    const v19, 0x76783ef8

    xor-int v0, v0, v19

    const v19, 0x395313fe

    xor-int v14, v14, v19

    move v1, v0

    move-object/from16 v0, p2

    goto/16 :goto_2

    :cond_9
    const-string v0, "\u06e1\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x38a7

    const v18, 0x233ea963

    xor-int v1, v1, v18

    const v18, -0x7c73324f

    xor-int v0, v0, v18

    move-object/from16 v18, v14

    goto/16 :goto_a

    :sswitch_d
    move/from16 v17, v14

    .line 29
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u06d7\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x47

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x49e7

    const v14, -0x11cf9e8b

    xor-int/2addr v1, v14

    const v14, 0x7d574933

    goto :goto_9

    :sswitch_e
    move/from16 v17, v14

    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_b

    :goto_7
    const-string v0, "\u1a75\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x2e7

    const v14, 0x4f52e7ab

    xor-int/2addr v1, v14

    const v14, -0x16c2cac2

    goto :goto_9

    :cond_b
    const-string v0, "\u06e7\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x2d

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x1619

    const v14, 0x59a1f80d

    xor-int/2addr v1, v14

    const v14, -0xb56bd7d

    goto :goto_9

    :goto_8
    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2519

    const v14, 0x2a520ffa

    xor-int/2addr v1, v14

    const v14, 0x62c8b1a6

    goto :goto_9

    :cond_c
    const-string v0, "\u06e0\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x2445

    const v14, -0x57349222

    xor-int/2addr v1, v14

    const v14, 0x6dc67ab2

    :goto_9
    xor-int/2addr v0, v14

    :goto_a
    move/from16 v14, v17

    move/from16 v17, v0

    move-object/from16 v0, p2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f0e7912 -> :sswitch_e
        -0x7abf9931 -> :sswitch_7
        -0x77fae7bd -> :sswitch_9
        -0x77be654d -> :sswitch_5
        -0x7114ffc1 -> :sswitch_3
        -0x6c06eeeb -> :sswitch_c
        -0x4e8972c5 -> :sswitch_4
        -0x482e717b -> :sswitch_c
        -0x3ff0dd9c -> :sswitch_9
        -0x3fc95663 -> :sswitch_0
        -0x21e0b123 -> :sswitch_b
        -0x1f69b0d8 -> :sswitch_d
        -0x1964918f -> :sswitch_5
        -0x1296e946 -> :sswitch_8
        -0x123b6cfd -> :sswitch_7
        -0xfd0ac6b -> :sswitch_0
        0x4092e7a -> :sswitch_2
        0x4111ed0 -> :sswitch_1
        0xab8ae13 -> :sswitch_1
        0x1aae9df7 -> :sswitch_a
        0x239f0990 -> :sswitch_a
        0x260e6297 -> :sswitch_4
        0x3b726a94 -> :sswitch_6
        0x43086d41 -> :sswitch_d
        0x4b6741be -> :sswitch_3
        0x4c75ae70 -> :sswitch_8
        0x56967196 -> :sswitch_2
        0x60fa52ed -> :sswitch_e
        0x66757aab -> :sswitch_6
        0x7acc888d -> :sswitch_b
    .end sparse-switch
.end method

.method public run(Landroid/graphics/Canvas;)V
    .locals 6

    const v0, -0x1862bf7a

    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v2, Ll/᩺;->ۙۛܶ:I

    const-string v3, "\u05a1\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1193

    const v5, 0x461c54ba    # 10005.182f

    xor-int/2addr v4, v5

    const v5, 0x67c53cc2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3595

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_9

    goto/16 :goto_1

    .line 4
    :sswitch_2
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_6

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ۙܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    invoke-static {v0, p1}, Lcom/google/android/material/navigation/NavigationView;->$r8$lambda$AHFKJHmjzrzMxPjc--xxWf1dl_U(Lcom/google/android/material/navigation/NavigationView;Landroid/graphics/Canvas;)V

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/ۙܶ᩷;->᩹:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/MaskableFrameLayout;

    invoke-static {v0, p1}, Lcom/google/android/material/carousel/MaskableFrameLayout;->$r8$lambda$kUSPnzaO2bap3ZjIEG78-cwlgmg(Lcom/google/android/material/carousel/MaskableFrameLayout;Landroid/graphics/Canvas;)V

    return-void

    :sswitch_7
    iget v3, p0, Ll/ۙܶ᩷;->᩸:I

    packed-switch v3, :pswitch_data_0

    const-string v3, "\u073d\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x31e5

    const v5, 0x50ef94c9

    xor-int/2addr v4, v5

    const v5, -0x479b85bb

    goto :goto_0

    :pswitch_0
    const-string v3, "\u0736\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4bfd

    const v5, 0x18dc43e0

    xor-int/2addr v4, v5

    const v5, 0x6cf40b6c

    goto :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_0

    const-string v3, "\u06ec\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3c79

    const v5, 0xe3285a8

    xor-int/2addr v4, v5

    const v5, 0x65185f13

    goto/16 :goto_0

    :cond_0
    const-string v3, "\u06df\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7311

    const v5, 0x3be311c2

    xor-int/2addr v4, v5

    const v5, 0xe435e

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x162b

    const v5, -0x64814f98

    xor-int/2addr v4, v5

    const v5, -0x3f95a964

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06eb\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3abf

    const v5, 0x59ce530c

    xor-int/2addr v4, v5

    const v5, 0x39229871

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_3

    :goto_1
    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a3d

    const v5, -0x50fe5793

    xor-int/2addr v4, v5

    const v5, -0x343abcf5    # -2.585551E7f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a75\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x49ed

    const v5, 0x24b9d5c4

    xor-int/2addr v4, v5

    const v5, 0x40ca03c9

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06d7\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e1d

    const v5, 0x5f3c891e

    xor-int/2addr v4, v5

    const v5, -0x649193e

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5e07

    const v5, -0x6783921a

    xor-int/2addr v4, v5

    const v5, -0x45806f10

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06eb\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1529

    const v5, 0x6e7a6214

    xor-int/2addr v4, v5

    const v5, 0x65bd4f26

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e8\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3053

    const v5, -0x61c27d87

    xor-int/2addr v4, v5

    const v5, 0x53f7c351

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06e8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x48cf

    const v5, -0x6c62abd2

    xor-int/2addr v4, v5

    const v5, -0x6a005d76

    goto/16 :goto_0

    .line 1
    :sswitch_f
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06eb\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6681

    const v5, 0x5f085aa9

    xor-int/2addr v4, v5

    const v5, 0x5bb45207

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6c21

    const v5, 0x6977f2c9

    xor-int/2addr v4, v5

    const v5, 0x7466811

    goto/16 :goto_0

    :sswitch_10
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a74\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x482f

    const v5, -0x174ba01a

    xor-int/2addr v4, v5

    const v5, -0x3a4ec642

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7b\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6ac3

    const v5, -0x3d9b5e28

    xor-int/2addr v4, v5

    const v5, 0x716a3479

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cf9cb5c -> :sswitch_d
        -0x75d9c09b -> :sswitch_3
        -0x74158bf9 -> :sswitch_e
        -0x6fc5a716 -> :sswitch_0
        -0x69aa8fd9 -> :sswitch_1
        -0x66def5ca -> :sswitch_9
        -0x6629c8c1 -> :sswitch_6
        -0x65dd04d1 -> :sswitch_6
        -0x4a141dac -> :sswitch_9
        -0x368cbff8 -> :sswitch_0
        -0x345022b7 -> :sswitch_d
        -0x33b0e2b8 -> :sswitch_f
        -0x331d4391 -> :sswitch_5
        -0x226d19ad -> :sswitch_1
        -0x216909b9 -> :sswitch_2
        -0xd9803e0 -> :sswitch_e
        0x1b77a8d5 -> :sswitch_b
        0x26daefe2 -> :sswitch_f
        0x2b22c68d -> :sswitch_4
        0x354856fe -> :sswitch_8
        0x35ed9e55 -> :sswitch_7
        0x3e3b0e9c -> :sswitch_5
        0x3e89a05f -> :sswitch_c
        0x3ee4a2ec -> :sswitch_4
        0x4f5dba8f -> :sswitch_b
        0x505e9489 -> :sswitch_3
        0x5226f2d3 -> :sswitch_10
        0x563ae1a2 -> :sswitch_a
        0x58cdcb3d -> :sswitch_8
        0x5e08de47 -> :sswitch_a
        0x5e9d14fe -> :sswitch_c
        0x6afef767 -> :sswitch_10
        0x72cde533 -> :sswitch_7
        0x7385bdaf -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 28

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x6e78622f

    sget v23, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v24, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v25, "\u06ec\u06d8"

    invoke-static/range {v25 .. v25}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v25

    sub-int v25, v23, v25

    mul-int/lit8 v25, v25, -0x39

    xor-int v0, v25, v24

    mul-int/lit16 v0, v0, -0x2155

    const v26, -0x204c5e23

    xor-int v0, v0, v26

    const v26, 0x2ee58c42

    xor-int v25, v25, v26

    move-object/from16 v21, v1

    move-object/from16 v26, v2

    move-object v7, v6

    move-object/from16 p1, v10

    move-object/from16 v12, v17

    move-object/from16 v15, v20

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v6, v5

    move-object v10, v9

    const/4 v5, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v3, v22, v24

    mul-int/lit16 v3, v3, 0x1ebb

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v22, v25, v0

    sparse-switch v22, :sswitch_data_0

    .line 31
    aget-object v0, v6, v8

    invoke-static {v7, v0}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 5
    :sswitch_0
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v0, p0

    goto/16 :goto_9

    :cond_1
    :goto_2
    move-object/from16 v0, p1

    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    goto/16 :goto_e

    :sswitch_1
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u0736\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x4edd

    const v25, 0x52f306a0

    xor-int v3, v3, v25

    const v25, 0x29694ee4

    goto/16 :goto_7

    .line 34
    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v0, :cond_0

    :goto_3
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    :goto_4
    move-object/from16 v21, v1

    goto/16 :goto_b

    .line 31
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_6

    .line 34
    :sswitch_6
    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7e75a98a

    xor-int/2addr v0, v1

    invoke-static {v9, v0}, Ll/֡۬;->ܶ۟᩵(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_7
    const/4 v0, 0x3

    invoke-static {v15, v2, v0, v11}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v10

    .line 29
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v0

    if-ltz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u05a8\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, 0x2f3

    const v25, 0x15b08f15

    xor-int v3, v3, v25

    const v25, -0x578c5694

    goto/16 :goto_7

    .line 34
    :sswitch_8
    invoke-virtual {v1}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v9

    sget-object v15, Ll/ۙܶ᩷;->᩺ܶ۠:[S

    const/4 v2, 0x3

    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "\u06e8\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x6cf

    const v25, -0x6c82750

    xor-int v3, v3, v25

    const v25, 0xca9f1ba

    goto/16 :goto_7

    :sswitch_9
    invoke-static {v12, v13, v14, v11}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-static {v0, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 34
    :sswitch_a
    sget-object v12, Ll/ۙܶ᩷;->᩺ܶ۠:[S

    const/4 v13, 0x1

    const/4 v14, 0x2

    .line 7
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    goto/16 :goto_c

    :cond_5
    const-string v0, "\u073a\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, -0x3d

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, 0x2b61

    const v25, -0x78fe15f1    # -9.773665E-35f

    xor-int v3, v3, v25

    const v25, 0x7fb12049

    goto/16 :goto_7

    :sswitch_b
    const/4 v0, 0x1

    shl-int/2addr v0, v8

    and-int/2addr v0, v5

    if-eqz v0, :cond_6

    const-string v0, "\u06eb\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x15

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x271

    const v25, 0x4d5c21d

    xor-int v3, v3, v25

    const v25, 0x6c2942ae

    goto/16 :goto_7

    :cond_6
    :goto_5
    const-string v0, "\u0733\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, 0x4fa1

    const v25, -0x8760ba8

    xor-int v3, v3, v25

    const v25, -0x1e5e8729

    goto/16 :goto_7

    .line 34
    :sswitch_c
    invoke-static {v7}, Ll/ۗۚ;->ۧ۫᩺(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "\u073d\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x3027

    const v25, -0x1eee0d44

    xor-int v3, v3, v25

    const v25, 0x2268dc03

    goto :goto_7

    :cond_7
    const-string v0, "\u073d\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    mul-int/lit8 v0, v0, 0x23

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, 0x2ae7

    const v25, -0x7de0bce0

    xor-int v3, v3, v25

    const v25, -0x5491644a

    goto :goto_7

    :sswitch_d
    const/4 v0, 0x3

    if-ge v8, v0, :cond_8

    const-string v0, "\u073a\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x25

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x2ccb

    const v25, 0x472139ce

    xor-int v3, v3, v25

    const v25, -0x1ddbe6c4

    goto :goto_7

    :cond_8
    const-string v0, "\u06db\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x7b

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x1321

    const v25, 0x585b117d

    xor-int v3, v3, v25

    const v25, 0x12688fed

    goto :goto_7

    .line 28
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v0

    move v8, v4

    :goto_6
    const-string v0, "\u1a75\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v24

    mul-int/lit8 v0, v0, -0x57

    xor-int v3, v0, v23

    mul-int/lit16 v3, v3, 0x1545

    const v25, 0x157b7fcc

    xor-int v3, v3, v25

    const v25, -0x65fdb595

    :goto_7
    xor-int v25, v0, v25

    goto :goto_8

    :sswitch_f
    move-object/from16 v0, v21

    move-object/from16 v3, v26

    .line 26
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 27
    invoke-virtual {v1}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Ll/۠᩸᩷;->֫(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v6

    .line 8
    sget v21, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v21, :cond_9

    move-object/from16 v25, v0

    goto/16 :goto_4

    :cond_9
    const-string v21, "\u05a8\u06d7"

    invoke-static/range {v21 .. v21}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v24

    move-object/from16 v25, v0

    xor-int v0, v21, v23

    mul-int/lit16 v0, v0, -0x322b

    const v26, -0x51503df9

    xor-int v0, v0, v26

    const v26, -0x2e49484e

    xor-int v21, v21, v26

    move-object/from16 v26, v3

    move-object/from16 v27, v25

    move/from16 v25, v21

    goto/16 :goto_11

    :sswitch_10
    move-object/from16 v25, v21

    .line 26
    invoke-virtual {v1}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v26

    const/4 v4, 0x0

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v0

    if-gtz v0, :cond_a

    move-object/from16 v0, p0

    move-object/from16 v21, v25

    goto :goto_9

    :cond_a
    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x5857

    const v21, -0x1581c657

    xor-int v3, v3, v21

    const v21, 0x376eea40

    xor-int v0, v0, v21

    move-object/from16 v21, v25

    move/from16 v25, v0

    :goto_8
    move v0, v3

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v0, p0

    move-object/from16 v3, v26

    .line 2
    iget-object v1, v0, Ll/ۙܶ᩷;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v1, Ll/ۤۗ᩷;

    .line 26
    invoke-virtual {v1}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v21

    sget v25, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v25, :cond_b

    move-object/from16 v26, v3

    :goto_9
    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v23

    xor-int v0, v3, v24

    mul-int/lit16 v0, v0, -0x40f7

    const v25, 0x6ea15767

    xor-int v0, v0, v25

    const v25, 0x5918d3db

    xor-int v25, v3, v25

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u1a73\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    mul-int/lit8 v0, v0, 0x6d

    move-object/from16 v25, v1

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x22ef

    const v26, -0x6749a53

    xor-int v1, v1, v26

    const v26, 0x2c214ba5

    xor-int v0, v0, v26

    move-object/from16 v26, v3

    move-object/from16 v27, v25

    move/from16 v25, v0

    move v0, v1

    move-object/from16 v1, v27

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    const v0, 0x82d3

    const v11, 0x82d3

    goto :goto_a

    :sswitch_13
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    const v0, 0xc9de

    const v11, 0xc9de

    :goto_a
    const-string v0, "\u06e4\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, -0x53

    move-object/from16 v21, v1

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x295d

    const v26, 0x1841be19

    xor-int v1, v1, v26

    const v26, 0x4ff0d0e0

    goto/16 :goto_d

    :sswitch_14
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    add-int/lit8 v0, v16, 0x1

    sub-int v0, v20, v0

    if-ltz v0, :cond_c

    const-string v0, "\u0733\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x45

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, 0x5447

    const v26, -0x4db02da2

    xor-int v1, v1, v26

    const v26, -0x2594014d

    goto/16 :goto_d

    :cond_c
    const-string v0, "\u06db\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x73c5

    const v26, 0x36bd0df4

    xor-int v1, v1, v26

    const v26, -0x14325fa9

    goto/16 :goto_d

    :sswitch_15
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    mul-int v20, v19, v19

    mul-int/lit8 v16, v18, 0x2

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_b
    const-string v0, "\u0733\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x5af

    const v26, -0x5adb5032

    xor-int v1, v1, v26

    const v26, -0x58a9ccc2

    goto/16 :goto_d

    :cond_d
    const-string v0, "\u06e7\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, -0x3ffb

    const v26, 0x359b8db6

    xor-int v1, v1, v26

    const v26, -0x32a5f36a    # -2.2864112E8f

    goto :goto_d

    :sswitch_16
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    aget-short v18, p1, v17

    add-int/lit8 v19, v18, 0x1

    .line 16
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_e

    goto :goto_c

    :cond_e
    const-string v0, "\u06d6\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x3369

    const v26, 0x46ba2c3e

    xor-int v1, v1, v26

    const v26, -0x2d0f8517

    goto :goto_d

    :sswitch_17
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    const/16 v17, 0x0

    .line 23
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v0

    if-ltz v0, :cond_f

    :goto_c
    const-string v0, "\u06e4\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, 0x57

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x310d

    const v26, 0x273da1f4

    xor-int v1, v1, v26

    const v26, -0xa588b6b

    goto :goto_d

    :cond_f
    const-string v0, "\u06ec\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v24

    mul-int/lit16 v1, v1, -0x406b

    const v26, 0x663cf6b8

    xor-int v1, v1, v26

    const v26, 0x72640461

    :goto_d
    xor-int v0, v0, v26

    move-object/from16 v26, v3

    move-object/from16 v27, v25

    move/from16 v25, v0

    move v0, v1

    goto :goto_10

    :sswitch_18
    move-object/from16 v25, v21

    move-object/from16 v3, v26

    move-object/from16 v21, v1

    sget-object v0, Ll/ۙܶ᩷;->᩺ܶ۠:[S

    .line 34
    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_10

    :goto_e
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, -0x41

    move-object/from16 p1, v0

    xor-int v0, v1, v23

    mul-int/lit16 v0, v0, -0x7071

    const v26, 0x54013a10

    xor-int v0, v0, v26

    const v26, -0x7ad8b0e8

    goto :goto_f

    :cond_10
    const-string v1, "\u0736\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x73

    move-object/from16 p1, v0

    xor-int v0, v1, v23

    mul-int/lit16 v0, v0, -0x555

    const v26, -0x5de1035e

    xor-int v0, v0, v26

    const v26, -0x5f95d3c7

    :goto_f
    xor-int v1, v1, v26

    move-object/from16 v26, v3

    move-object/from16 v27, v25

    move/from16 v25, v1

    :goto_10
    move-object/from16 v1, v21

    :goto_11
    move-object/from16 v21, v27

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b9e866f -> :sswitch_0
        -0x7aca5e16 -> :sswitch_a
        -0x62da2321 -> :sswitch_17
        -0x616cffe4 -> :sswitch_16
        -0x5904c38d -> :sswitch_c
        -0x56e839b7 -> :sswitch_12
        -0x5485584a -> :sswitch_9
        -0x53b084ca -> :sswitch_18
        -0x51f3f65c -> :sswitch_1
        -0x4c1901ab -> :sswitch_d
        -0x4a100215 -> :sswitch_3
        -0x4763e02d -> :sswitch_6
        -0x46f20c0e -> :sswitch_16
        -0x3a61be6b -> :sswitch_2
        -0x37e2c425 -> :sswitch_10
        -0x372ef6b5 -> :sswitch_c
        -0x31602c5b -> :sswitch_8
        -0x28299f05 -> :sswitch_11
        -0x2465db4f -> :sswitch_f
        -0x22e605a6 -> :sswitch_1
        -0x222c3cea -> :sswitch_b
        -0x1fa120f6 -> :sswitch_7
        -0x17d7dd29 -> :sswitch_11
        -0x1661f641 -> :sswitch_5
        -0x85f21dd -> :sswitch_14
        -0x578db4e -> :sswitch_13
        -0x50ee8b1 -> :sswitch_17
        0x4bdec47 -> :sswitch_3
        0x53732f9 -> :sswitch_7
        0xdd3f623 -> :sswitch_15
        0xe95579e -> :sswitch_e
        0x121e2b5e -> :sswitch_18
        0x1411819f -> :sswitch_d
        0x19034ba3 -> :sswitch_2
        0x2117d005 -> :sswitch_0
        0x21ad24d5 -> :sswitch_14
        0x22f3deab -> :sswitch_15
        0x2a8fa158 -> :sswitch_a
        0x34ee2d90 -> :sswitch_12
        0x3e82d771 -> :sswitch_5
        0x44488a62 -> :sswitch_13
        0x4a50ca5b -> :sswitch_b
        0x4ea109b8 -> :sswitch_4
        0x5a5e2096 -> :sswitch_9
        0x64a7d6c5 -> :sswitch_10
        0x665946c4 -> :sswitch_8
        0x74c3c8da -> :sswitch_f
        0x775049e1 -> :sswitch_6
        0x78759c9a -> :sswitch_4
        0x7f0ee415 -> :sswitch_e
    .end sparse-switch
.end method
