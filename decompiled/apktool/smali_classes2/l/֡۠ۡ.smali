.class public final Ll/֡۠ۡ;
.super Ljava/lang/Object;
.source "R5PD"


# static fields
.field private static final ᩺ۨۘ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֡۠ۡ;->᩺ۨۘ:[S

    return-void

    :array_0
    .array-data 2
        0x1c95s
        0x529es
        0x52d6s
        0x52cas
        0x52cbs
        0x52d1s
        0x529cs
        0x8a7s
        0x21f8s
        0x21b0s
        0x21acs
        0x21ads
        0x21b7s
        0x21fas
    .end array-data
.end method

.method public static final ֫(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x532a5f88

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    const-string v4, "\u1a79\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x33db

    const v6, 0x7161e892

    xor-int/2addr v5, v6

    const v6, 0x29d254e1

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x30f7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 8
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_b

    goto/16 :goto_2

    .line 19
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06ec\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3365

    const v6, 0x67ee2fd9

    xor-int/2addr v5, v6

    const v6, 0x304a8ab9

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_3

    .line 50
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_3

    .line 46
    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    return-void

    .line 80
    :sswitch_5
    new-instance v1, Ll/᩵۠ۡ;

    invoke-direct {v1, p0}, Ll/᩵۠ۡ;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 93
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void

    .line 8
    :sswitch_6
    invoke-static {v0}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    .line 23
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06e7\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7e03

    const v6, 0x1bbe05d4

    xor-int/2addr v5, v6

    const v6, 0x1e1826b6

    goto :goto_0

    .line 40
    :sswitch_7
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    const-string v4, "\u1a77\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x27b5

    const v6, 0x7168f1a

    xor-int/2addr v5, v6

    const v6, -0x79eb4276

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e2\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x378f

    const v6, 0x6d68c38f

    xor-int/2addr v5, v6

    const v6, 0x33e59157

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u073d\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x61a7

    const v6, 0x4282fe99

    xor-int/2addr v5, v6

    const v6, 0x536720ff

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u073d\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2ec5

    const v6, -0x3fd28b67

    xor-int/2addr v5, v6

    const v6, 0x1577b585

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06da\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x62dd

    const v6, 0x1fa5a098

    xor-int/2addr v5, v6

    const v6, 0x5b558db4

    goto/16 :goto_0

    .line 52
    :sswitch_a
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u1a7a\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x521d

    const v6, 0x3f364394

    xor-int/2addr v5, v6

    const v6, 0x6abe9b8c

    goto/16 :goto_0

    .line 13
    :sswitch_b
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u1a74\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x23e5

    const v6, 0x3a689c8

    xor-int/2addr v5, v6

    const v6, -0x62174576

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u073a\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5e6d

    const v6, -0x514f8fb8

    xor-int/2addr v5, v6

    const v6, 0x74907b68

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e0\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3363

    const v6, -0xb830066

    xor-int/2addr v5, v6

    const v6, -0x1d2c6df7

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u073f\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1eab

    const v6, -0x16c10c86

    xor-int/2addr v5, v6

    const v6, -0x54fcf742

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0730\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7999

    const v6, 0x3153a7a6

    xor-int/2addr v5, v6

    const v6, -0x2094c5a1

    goto/16 :goto_0

    .line 8
    :sswitch_e
    invoke-static {p0}, Ll/֡ܶ;->᩵ܺ֨(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d6\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x255f

    const v6, -0x1dbc89d2

    xor-int/2addr v5, v6

    const v6, 0x5bb06f66

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e2\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x49d7

    const v6, 0x2312d8ac

    xor-int/2addr v5, v6

    const v6, -0x7c113def

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d4b992c -> :sswitch_8
        -0x79a94947 -> :sswitch_b
        -0x76855433 -> :sswitch_4
        -0x72037c63 -> :sswitch_c
        -0x6dfc124e -> :sswitch_1
        -0x6a38abcf -> :sswitch_a
        -0x5e75814a -> :sswitch_e
        -0x5e688a60 -> :sswitch_d
        -0x3f55da08 -> :sswitch_b
        -0x31b88d2b -> :sswitch_3
        -0x2cf1be48 -> :sswitch_a
        -0x1ea0f954 -> :sswitch_0
        -0x1d42e290 -> :sswitch_6
        -0x1d193a92 -> :sswitch_9
        -0x1b4b213f -> :sswitch_e
        -0x1103c612 -> :sswitch_7
        0x4057758 -> :sswitch_9
        0x420abb0 -> :sswitch_0
        0x7648f5a -> :sswitch_5
        0x29a6c570 -> :sswitch_4
        0x44df123b -> :sswitch_6
        0x46081e23 -> :sswitch_d
        0x5730d2c1 -> :sswitch_c
        0x5daab100 -> :sswitch_2
        0x5e9b1066 -> :sswitch_5
        0x61737cff -> :sswitch_2
        0x62cfd6e8 -> :sswitch_1
        0x64b20f2c -> :sswitch_3
        0x711e8249 -> :sswitch_7
        0x792c0e7c -> :sswitch_8
    .end sparse-switch
.end method

.method public static final ֫(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, -0x56786de6

    sget v14, Ll/֨ۤ;->ܿۖ᩵:I

    sget v15, Ll/ۙۨ;->ۡۗۙ:I

    const-string v16, "\u05ab\u0730"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0x6eeb

    const v18, 0x510efed7

    xor-int v1, v1, v18

    const v18, 0x5b792bff

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v11, v10

    move/from16 v17, v16

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, -0x56786de6

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, -0x1d19

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    aget-short v6, v18, v5

    mul-int v7, v6, v6

    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v1, :cond_8

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_0

    goto :goto_1

    .line 14
    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v1, Ll/۠;->ܺܺܶ:I

    if-gez v1, :cond_a

    goto/16 :goto_4

    :sswitch_2
    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_c

    goto :goto_1

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :goto_1
    const-string v1, "\u06e4\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x783

    const v17, 0x2cf5f679

    xor-int v4, v4, v17

    const v17, -0x5e9e96aa

    goto/16 :goto_5

    .line 2
    :sswitch_4
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    .line 19
    :sswitch_5
    invoke-static/range {p0 .. p0}, Ll/֫ۧ;->۠ᩴۤ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/֨֫;->᩷ۖ֫(Ljava/lang/Object;)Z

    return-void

    .line 18
    :sswitch_6
    invoke-virtual {v3}, Landroid/widget/EditText;->selectAll()V

    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_1

    :cond_0
    const-string v1, "\u06e7\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x1a37

    const v17, -0x37b9ab98

    xor-int v4, v4, v17

    const v17, 0x225e2d7c

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u0730\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x2b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x4f25

    const v17, 0x6e0b1782

    xor-int v4, v4, v17

    const v17, -0x45d1a4aa

    goto/16 :goto_5

    .line 17
    :sswitch_7
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 18
    invoke-static/range {p0 .. p0}, Ll/֫ۧ;->۠ᩴۤ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    .line 16
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u1a74\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x58df

    const v17, -0x73e7a9ed

    xor-int v4, v4, v17

    const v17, -0x38127223

    goto/16 :goto_5

    :sswitch_8
    invoke-static/range {p1 .. p1}, Ll/ۗ᩶;->ۤ᩷᩸(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v2, 0x1

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06dc\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x21c3

    const v17, -0x64bf9f9b

    xor-int v4, v4, v17

    const v17, 0x15c94fe5

    goto/16 :goto_5

    .line 0
    :sswitch_9
    invoke-static {v11, v12, v13, v10}, Ll/֡᩺;->᩸ۜۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u073f\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x7b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x1c43

    const v17, -0x72b89abd

    xor-int v4, v4, v17

    const v17, 0x6aa8d937

    goto/16 :goto_5

    .line 0
    :sswitch_a
    sget-object v11, Ll/֡۠ۡ;->᩺ۨۘ:[S

    const/4 v12, 0x1

    const/4 v13, 0x6

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u1a76\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x51

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x32ab

    const v17, 0x69dfa65d

    xor-int v4, v4, v17

    const v17, 0x3ccfe5ce

    goto/16 :goto_5

    :sswitch_b
    const/16 v1, 0x4ec5

    const/16 v10, 0x4ec5

    goto :goto_2

    :sswitch_c
    const/16 v1, 0x52a2

    const/16 v10, 0x52a2

    :goto_2
    const-string v1, "\u06db\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x4b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x47f

    const v17, 0x446a843e

    xor-int v4, v4, v17

    const v17, -0x5539aa12

    goto/16 :goto_5

    :sswitch_d
    mul-int v1, v6, v9

    sub-int/2addr v1, v8

    if-lez v1, :cond_6

    const-string v1, "\u06d7\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x5475

    const v17, -0x20fdb556

    xor-int v4, v4, v17

    const v17, 0xe5a0cea

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u1a78\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x59

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x5cab

    const v17, 0x2e57360e

    xor-int v4, v4, v17

    const v17, 0x6adddb09

    goto/16 :goto_5

    :sswitch_e
    const v1, 0xcf98a84

    add-int v8, v7, v1

    const/16 v9, 0x7344

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06da\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x6a6b

    const v17, -0x6e6d86e5

    xor-int v4, v4, v17

    const v17, -0x12c0e6c5

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u0730\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x37

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x5387

    const v17, 0xa7b5aa4

    xor-int v4, v4, v17

    const v17, 0x579a8fd9

    goto/16 :goto_5

    :sswitch_f
    const/4 v5, 0x0

    .line 13
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_9

    :goto_3
    const-string v1, "\u1a74\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x13

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x3ae1

    const v17, -0x274067d6

    xor-int v4, v4, v17

    const v17, 0x36934dc5

    goto :goto_5

    :cond_9
    const-string v1, "\u05ab\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x1e07

    const v17, -0x7b3957da

    xor-int v4, v4, v17

    const v17, -0x7c31bae3

    goto :goto_5

    :sswitch_10
    sget-object v18, Ll/֡۠ۡ;->᩺ۨۘ:[S

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v1

    if-ltz v1, :cond_b

    :cond_a
    const-string v1, "\u05ab\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x5ac9

    const v17, 0xf92ccb1

    xor-int v4, v4, v17

    const v17, -0x6d0943a0

    goto :goto_5

    :cond_b
    const-string v1, "\u0733\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x6a55

    const v17, 0x6b963a2a

    xor-int v4, v4, v17

    const v17, -0x5736347f

    goto :goto_5

    :sswitch_11
    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_d

    :cond_c
    :goto_4
    const-string v1, "\u1a79\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x2323

    const v17, -0x7c75a243

    xor-int v4, v4, v17

    const v17, 0x7312343b

    goto :goto_5

    :cond_d
    const-string v1, "\u1a73\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x7

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x5083

    const v17, -0x312c18bd

    xor-int v4, v4, v17

    const v17, 0x768d57b

    :goto_5
    xor-int v17, v1, v17

    move v1, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eb8d34b -> :sswitch_9
        -0x7961270e -> :sswitch_5
        -0x7825941b -> :sswitch_4
        -0x74cdc58b -> :sswitch_b
        -0x718d0cda -> :sswitch_f
        -0x6c75635d -> :sswitch_8
        -0x58159974 -> :sswitch_3
        -0x521c6bfc -> :sswitch_5
        -0x50d92786 -> :sswitch_1
        -0x5097133f -> :sswitch_7
        -0x502b5eee -> :sswitch_9
        -0x4cfd2f1c -> :sswitch_8
        -0x4bb22bc3 -> :sswitch_2
        -0x3a8e186a -> :sswitch_f
        -0x347be33a -> :sswitch_d
        -0x2cb9d732 -> :sswitch_6
        -0x29425517 -> :sswitch_0
        -0x26c98061 -> :sswitch_10
        -0x21fff068 -> :sswitch_1
        -0x17cf07bb -> :sswitch_e
        -0x65036b8 -> :sswitch_10
        -0x196f54a -> :sswitch_3
        0x2750b00d -> :sswitch_a
        0x28e10b9e -> :sswitch_b
        0x2b0a1d58 -> :sswitch_2
        0x2d571ff9 -> :sswitch_d
        0x330d41f2 -> :sswitch_e
        0x33724a5a -> :sswitch_7
        0x395d4d98 -> :sswitch_0
        0x3c992990 -> :sswitch_a
        0x45054b1f -> :sswitch_c
        0x4a96b38b -> :sswitch_6
        0x6107121f -> :sswitch_c
        0x6ed398ee -> :sswitch_4
        0x7668be31 -> :sswitch_11
        0x7dc243da -> :sswitch_11
    .end sparse-switch
.end method

.method public static final ֫(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V
    .locals 21

    move-object/from16 v0, p0

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

    const v15, -0x6b41614e

    sget v16, Ll/ۗ۬;->ۘܳ᩻:I

    sget v17, Ll/ۛ;->᩺᩻֫:I

    const-string v18, "\u06da\u06d7"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    xor-int v1, v18, v16

    mul-int/lit16 v1, v1, -0x1fff

    const v20, -0x268db9a8

    xor-int v1, v1, v20

    const v20, -0x22b7c3de

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x6b41614e

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v18, v16

    mul-int/lit16 v5, v5, -0x114d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto :goto_1

    :sswitch_0
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_c

    goto/16 :goto_3

    .line 11
    :sswitch_1
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v1, :cond_1

    goto/16 :goto_3

    .line 16
    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v1, :cond_9

    :goto_1
    const-string v1, "\u073f\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x5b1d

    const v19, -0x49fa256a

    xor-int v5, v5, v19

    const v19, -0x6d015103

    goto/16 :goto_6

    .line 18
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    return-void

    .line 26
    :sswitch_4
    invoke-static/range {p0 .. p0}, Ll/֡ܶ;->᩵ܺ֨(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/֨֫;->᩷ۖ֫(Ljava/lang/Object;)Z

    return-void

    .line 25
    :sswitch_5
    invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V

    .line 1
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u073f\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x35

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3eb

    const v19, 0xb0994f3

    xor-int v5, v5, v19

    const v19, -0x6ea14569

    goto/16 :goto_6

    .line 24
    :sswitch_6
    invoke-virtual {v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 25
    invoke-static/range {p0 .. p0}, Ll/֫ۧ;->۠ᩴۤ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "\u05a8\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7627

    const v19, -0x4d114d16

    xor-int v5, v5, v19

    const v19, -0x618594a2

    goto/16 :goto_6

    :cond_2
    const-string v1, "\u073a\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x71

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6a4f

    const v19, 0x4ee5c617    # 1.92748224E9f

    xor-int v5, v5, v19

    const v19, 0x16a275af

    goto/16 :goto_6

    .line 0
    :sswitch_7
    invoke-static {v0, v2}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v1

    if-ltz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u1a78\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x3c79

    const v19, -0x7f130bf9

    xor-int v5, v5, v19

    const v19, -0x4a2a3a3f

    goto/16 :goto_6

    .line 0
    :sswitch_8
    invoke-static {v13, v14, v15, v12}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u06e4\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x400d

    const v19, 0x13615c5b

    xor-int v5, v5, v19

    const v19, 0x66224bd9

    goto/16 :goto_6

    :sswitch_9
    sget-object v13, Ll/֡۠ۡ;->᩺ۨۘ:[S

    const/16 v14, 0x8

    const/4 v15, 0x6

    .line 16
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u06db\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x51

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x510f

    const v19, -0x32216a06

    xor-int v5, v5, v19

    const v19, -0x1494c9f9

    goto/16 :goto_6

    :sswitch_a
    const/16 v1, 0x682c

    const/16 v12, 0x682c

    goto :goto_2

    :sswitch_b
    const/16 v1, 0x21c4

    const/16 v12, 0x21c4

    :goto_2
    const-string v1, "\u06db\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x55

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7b37

    const v19, -0x3a97dbd2

    xor-int v5, v5, v19

    const v19, -0x3cee188d

    goto/16 :goto_6

    :sswitch_c
    add-int v1, v10, v11

    sub-int v1, v9, v1

    if-gtz v1, :cond_6

    const-string v1, "\u05a1\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3f35

    const v19, 0x6b41c43a

    xor-int v5, v5, v19

    const v19, 0xc198379

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u1a74\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x57

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x6f53

    const v19, 0x525e9c48

    xor-int v5, v5, v19

    const v19, -0x7bed9f6f

    goto/16 :goto_6

    :sswitch_d
    mul-int v9, v7, v8

    mul-int v10, v7, v7

    const v11, 0x1af8924

    .line 3
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06df\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x29

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x2ba3

    const v19, -0x7043e8cc

    xor-int v5, v5, v19

    const v19, 0x72b592bc

    goto/16 :goto_6

    :sswitch_e
    aget-short v7, v20, v6

    const/16 v8, 0x298c

    .line 21
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u0733\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7b2d

    const v19, 0x384f785

    xor-int v5, v5, v19

    const v19, -0x544427b0

    goto/16 :goto_6

    :sswitch_f
    const/4 v6, 0x7

    .line 11
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_a

    :cond_9
    :goto_3
    const-string v1, "\u06d7\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x4037

    const v19, -0x21430dc

    xor-int v5, v5, v19

    const v19, -0x47609f0

    goto/16 :goto_6

    :cond_a
    const-string v1, "\u073f\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x46a3

    const v19, -0x3eeb2865

    xor-int v5, v5, v19

    const v19, 0x6fa72e08

    goto :goto_6

    :sswitch_10
    sget-object v20, Ll/֡۠ۡ;->᩺ۨۘ:[S

    .line 6
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v1

    if-ltz v1, :cond_b

    :goto_4
    const-string v1, "\u06ec\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x1871

    const v19, -0x7ed2cab3

    xor-int v5, v5, v19

    const v19, -0x1bed4bf5

    goto :goto_6

    :cond_b
    const-string v1, "\u1a78\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x77d

    const v19, 0x1095c204

    xor-int v5, v5, v19

    const v19, 0x17d89321

    goto :goto_6

    .line 11
    :sswitch_11
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u06e4\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x15

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x1ef5

    const v19, -0x3a47e6ad

    xor-int v5, v5, v19

    const v19, 0x1a41567e

    goto :goto_6

    :cond_d
    const-string v1, "\u06d8\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x34b9

    const v19, -0x23a55958

    xor-int v5, v5, v19

    const v19, -0x3d13c79a

    :goto_6
    xor-int v19, v1, v19

    move v1, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74ea48bf -> :sswitch_7
        -0x7294f005 -> :sswitch_4
        -0x6ef9fa5c -> :sswitch_4
        -0x6c193037 -> :sswitch_d
        -0x68502cae -> :sswitch_6
        -0x67cf20fa -> :sswitch_2
        -0x62009cea -> :sswitch_3
        -0x5cc339e1 -> :sswitch_5
        -0x4f78f277 -> :sswitch_3
        -0x3a4d3335 -> :sswitch_b
        -0x32366716 -> :sswitch_a
        -0x31b95b84 -> :sswitch_1
        -0x1f6a44ff -> :sswitch_10
        -0x1ed1e987 -> :sswitch_b
        -0x1cd8042b -> :sswitch_9
        -0xd8fe3e0 -> :sswitch_e
        -0xbc94fe7 -> :sswitch_10
        -0x83f9c28 -> :sswitch_c
        -0x51377e2 -> :sswitch_f
        -0x374b981 -> :sswitch_8
        -0x874229 -> :sswitch_9
        0x317f5f1 -> :sswitch_6
        0x5e037a0 -> :sswitch_5
        0x925655b -> :sswitch_0
        0x13e3e212 -> :sswitch_11
        0x1c2d4f6b -> :sswitch_c
        0x1c56bdba -> :sswitch_8
        0x307fc748 -> :sswitch_11
        0x4017f79f -> :sswitch_f
        0x468c01a2 -> :sswitch_d
        0x4aedd11e -> :sswitch_a
        0x4dde91ed -> :sswitch_e
        0x568f81ae -> :sswitch_0
        0x57b174ca -> :sswitch_7
        0x581976bc -> :sswitch_2
        0x7fa1fc76 -> :sswitch_1
    .end sparse-switch
.end method

.method public static final varargs ֫([Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0xe42fc4d

    sget v7, Ll/ۘۛ;->ۖۚ֡:I

    sget v8, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v9, "\u1a75\u1a7b"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x24b9

    const v11, 0x498270ae    # 1068565.8f

    xor-int/2addr v10, v11

    const v11, -0xc95487f

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x68cb

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    .line 9
    :sswitch_0
    sget-boolean v9, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v9, :cond_6

    goto/16 :goto_3

    .line 10
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget-boolean v9, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v9, :cond_1

    goto/16 :goto_2

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v9, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v9, :cond_c

    goto/16 :goto_2

    .line 8
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto/16 :goto_2

    .line 32
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const/4 p0, 0x0

    return p0

    .line 33
    :sswitch_5
    invoke-static {v5}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    invoke-static {v5}, Ll/֫ۡ;->᩻ۨۖ(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :sswitch_6
    invoke-static {v3}, Ll/֫ۧ;->۠ᩴۤ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v5

    .line 9
    sget v9, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v9, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v9, "\u0736\u073f"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x28e1

    const v11, 0x34c8543

    xor-int/2addr v10, v11

    const v11, -0x791d1fa6

    goto :goto_0

    .line 32
    :sswitch_7
    invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V

    .line 8
    sget v9, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v9, :cond_2

    :cond_1
    const-string v9, "\u073a\u073a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6c6b

    const v11, -0x3ea0cb9e

    xor-int/2addr v10, v11

    const v11, 0x32803ad0

    goto :goto_0

    :cond_2
    const-string v9, "\u1a73\u1a79"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5f43

    const v11, 0x1bd0924b

    xor-int/2addr v10, v11

    const v11, -0x7d0b766f

    goto/16 :goto_0

    .line 32
    :sswitch_8
    invoke-static {v3}, Ll/֡ܶ;->᩵ܺ֨(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    .line 6
    sget v9, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v9, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v9, "\u06da\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x3b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x94d

    const v11, 0x51f63055

    xor-int/2addr v10, v11

    const v11, -0x51c75d45

    goto/16 :goto_0

    .line 30
    :sswitch_9
    aget-object v3, p0, v2

    .line 31
    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v9

    if-eqz v9, :cond_4

    const-string v9, "\u1a78\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x6f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1fe5

    const v11, 0x1ede013f

    xor-int/2addr v10, v11

    const v11, -0x76f6ba00

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u1a79\u1a74"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4dd7

    const v11, 0x309d333b

    xor-int/2addr v10, v11

    const v11, -0x6027de72

    goto/16 :goto_0

    :sswitch_a
    return v1

    :sswitch_b
    if-ge v2, v0, :cond_5

    const-string v9, "\u1a77\u1a73"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2275

    const v11, -0x691e1155

    xor-int/2addr v10, v11

    const v11, -0x1a32ad7b

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u06eb\u073f"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x9

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x90b

    const v11, -0x39c9e9bf

    xor-int/2addr v10, v11

    const v11, 0x12c5a929

    goto/16 :goto_0

    :sswitch_c
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    const-string v9, "\u0730\u1a77"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1fd9

    const v11, -0x7b4188f5

    xor-int/2addr v10, v11

    const v11, 0x18b0ad63    # 4.567001E-24f

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v9, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v9, :cond_7

    :cond_6
    const-string v9, "\u1a79\u06db"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7731

    const v11, -0x33c2c7d6    # -4.9602728E7f

    xor-int/2addr v10, v11

    const v11, 0x3a641cd1

    goto/16 :goto_0

    :cond_7
    const-string v9, "\u06eb\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x4f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x514d

    const v11, 0x472b4f38

    xor-int/2addr v10, v11

    const v11, -0x400a5f3a

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v9

    if-ltz v9, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v9, "\u1a76\u06da"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7dab

    const v11, 0x449d92b2

    xor-int/2addr v10, v11

    const v11, -0x4686f2d7

    goto/16 :goto_0

    .line 22
    :sswitch_f
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v9

    if-gtz v9, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v9, "\u06d8\u06ec"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2ed9

    const v11, 0x72971a63

    xor-int/2addr v10, v11

    const v11, -0x37427dd6

    goto/16 :goto_0

    :sswitch_10
    sget v9, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v9, :cond_a

    goto :goto_3

    :cond_a
    const-string v9, "\u05ab\u1a7b"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x7d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7ea5

    const v11, 0x5a0ee802

    xor-int/2addr v10, v11

    const v11, -0x73fad58

    goto/16 :goto_0

    .line 14
    :sswitch_11
    sget v9, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v9, :cond_b

    :goto_2
    const-string v9, "\u06e1\u0736"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x37b5

    const v11, 0x32239f92

    xor-int/2addr v10, v11

    const v11, -0x1b92a720

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06da\u06eb"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x242b

    const v11, -0x40e8f9cf

    xor-int/2addr v10, v11

    const v11, 0x14a747b7

    goto/16 :goto_0

    :sswitch_12
    sget-boolean v9, Ll/֨۫;->۬᩷᩶:Z

    if-nez v9, :cond_d

    :cond_c
    :goto_3
    const-string v9, "\u06e4\u06e1"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x5

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2f0f

    const v11, 0x420d2947

    xor-int/2addr v10, v11

    const v11, 0x1f6012a3

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u1a7a\u06da"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4d75

    const v11, 0x3bbedb1c

    xor-int/2addr v10, v11

    const v11, -0x74eb2c4e

    goto/16 :goto_0

    .line 30
    :sswitch_13
    array-length v0, p0

    sget v9, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v9, :cond_e

    :goto_4
    const-string v9, "\u06e7\u1a76"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3a77

    const v11, -0x32cc4b98

    xor-int/2addr v10, v11

    const v11, -0x186cd576

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u05a1\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x285d

    const v11, -0x4689a51d

    xor-int/2addr v10, v11

    const v11, 0xeb3369d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f6778c9 -> :sswitch_0
        -0x7d4b3390 -> :sswitch_4
        -0x7ce8ab44 -> :sswitch_9
        -0x715700da -> :sswitch_10
        -0x69c2cb0c -> :sswitch_d
        -0x60303a64 -> :sswitch_c
        -0x583dcb2a -> :sswitch_7
        -0x54b9584c -> :sswitch_9
        -0x519bee25 -> :sswitch_e
        -0x425ea555 -> :sswitch_6
        -0x41e1e8c7 -> :sswitch_a
        -0x404c201e -> :sswitch_3
        -0x2e059dc7 -> :sswitch_12
        -0x27a22284 -> :sswitch_5
        -0x1dbbf4e7 -> :sswitch_12
        -0x194500be -> :sswitch_4
        -0x12315f09 -> :sswitch_11
        -0xe5c3cd4 -> :sswitch_11
        -0xc880cfb -> :sswitch_1
        0x77b9722 -> :sswitch_13
        0xb642f95 -> :sswitch_0
        0x10ac9cfe -> :sswitch_8
        0x14d54429 -> :sswitch_c
        0x17cbde3b -> :sswitch_8
        0x1a7ef16d -> :sswitch_7
        0x1f9e0c57 -> :sswitch_13
        0x25488dee -> :sswitch_2
        0x415aafc8 -> :sswitch_b
        0x467ac56d -> :sswitch_a
        0x4db5c388 -> :sswitch_f
        0x54599575 -> :sswitch_2
        0x54cce51f -> :sswitch_e
        0x558dc37d -> :sswitch_d
        0x5cbe6fb6 -> :sswitch_1
        0x69d3858d -> :sswitch_f
        0x6a15f3e3 -> :sswitch_5
        0x6e003287 -> :sswitch_6
        0x727ed403 -> :sswitch_10
        0x74980639 -> :sswitch_3
        0x7e691cc1 -> :sswitch_b
    .end sparse-switch
.end method
