.class public final Ll/ۨܶ᩷;
.super Ll/ۗ۬ۡ;
.source "12B7"


# static fields
.field private static final ֫ܽᩳ:[S


# instance fields
.field public final synthetic ᩸:Ll/ۜ᩸᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨܶ᩷;->֫ܽᩳ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xa5as
        0x4845s
        0x4841s
        0x4850s
        -0x29b0s
        -0x3efas
        0x2cf8s
    .end array-data
.end method

.method public constructor <init>(Ll/ۜ᩸᩷;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    iput-object p1, p0, Ll/ۨܶ᩷;->᩸:Ll/ۜ᩸᩷;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 22

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

    const v16, -0x19df4303

    sget v17, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v18, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v19, "\u06da\u1a7a"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, 0x7421

    const v21, 0x11a06443

    xor-int v0, v0, v21

    const v21, 0x3c5bf5e8

    xor-int v19, v19, v21

    move-object v5, v4

    move-object/from16 v16, v7

    move-object v13, v12

    move-object v15, v14

    move/from16 v20, v19

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, -0x19df4303

    const/16 v21, 0x0

    move-object v4, v3

    move-object v7, v6

    const/4 v6, 0x0

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v9, v19, v17

    mul-int/lit16 v9, v9, -0x66b7

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v0, v9

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    .line 223
    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v6, 0x7d699754

    xor-int/2addr v6, v0

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v0

    if-gtz v0, :cond_1

    goto/16 :goto_5

    .line 23
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v0, :cond_6

    goto :goto_1

    .line 197
    :sswitch_1
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v0, "\u06d9\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x7f

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x456f

    const v20, -0x1d30e951

    xor-int v9, v9, v20

    const v20, -0x33f6a115    # -3.6010924E7f

    goto/16 :goto_6

    .line 169
    :sswitch_2
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_c

    goto/16 :goto_4

    .line 212
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    return-void

    .line 224
    :sswitch_5
    invoke-static {v1, v6}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ll/ۘۛ;->ۜۧܽ(Ljava/lang/Object;I)V

    return-void

    :cond_1
    const-string v0, "\u1a76\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x3363

    const v20, 0x69b3a057

    xor-int v9, v9, v20

    const v20, 0x194ec901

    goto/16 :goto_6

    :sswitch_6
    const/4 v0, 0x3

    .line 223
    invoke-static {v15, v8, v0, v12}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v7

    .line 151
    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u06e0\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x63

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x41bd

    const v20, 0x4c40f710    # 5.058464E7f

    xor-int v9, v9, v20

    const v20, -0x70e7efc8

    goto/16 :goto_6

    .line 223
    :sswitch_7
    invoke-static {v2, v5, v4}, Ll/֡ᩴ;->ۧ᩷ۜ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-static {v0}, Ll/۟;->ۚ᩹ܰ(Ljava/lang/Object;)V

    sget-object v15, Ll/ۨܶ᩷;->֫ܽᩳ:[S

    const/4 v8, 0x4

    .line 207
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u05a1\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x4fc7

    const v20, -0x6960885f

    xor-int v9, v9, v20

    const v20, 0x1f4a3f7d

    goto/16 :goto_6

    :sswitch_8
    const/4 v0, 0x3

    .line 223
    invoke-static {v13, v14, v0, v12}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v5

    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "\u0733\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x49

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x29b5

    const v20, 0x4ef5f7ff

    xor-int v9, v9, v20

    const v20, 0x179f6ad5

    goto/16 :goto_6

    :sswitch_9
    invoke-static {v3}, Ll/ܿ᩸᩷;->ᩳ(Ll/ܿ᩸᩷;)Ljava/lang/String;

    move-result-object v4

    sget-object v13, Ll/ۨܶ᩷;->֫ܽᩳ:[S

    const/4 v14, 0x1

    .line 166
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v0

    if-gtz v0, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "\u06e8\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x7c53

    const v20, 0x4a4bfabe    # 3341999.5f

    xor-int v9, v9, v20

    const v20, -0x1a125924

    goto/16 :goto_6

    .line 223
    :sswitch_a
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-static {v0}, Ll/֨ᩴ;->۬᩶ᩳ(Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v2

    invoke-static {v1}, Ll/ۜ᩸᩷;->ᩳ(Ll/ۜ᩸᩷;)Ll/ܿ᩸᩷;

    move-result-object v3

    .line 189
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_7

    :cond_6
    const-string v0, "\u05a1\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x43

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x5d33

    const v20, -0x4115f7fb

    xor-int v9, v9, v20

    const v20, -0x746e544

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u1a79\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x11

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x46c7

    const v20, -0x751a69fe

    xor-int v9, v9, v20

    const v20, 0x33186cf6

    goto/16 :goto_6

    :sswitch_b
    move-object/from16 v0, p0

    .line 221
    iget-object v1, v0, Ll/ۨܶ᩷;->᩸:Ll/ۜ᩸᩷;

    invoke-static {v1}, Ll/ۜ᩸᩷;->ᩳ(Ll/ۜ᩸᩷;)Ll/ܿ᩸᩷;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Ll/ܿ᩸᩷;->ۧ(Ll/ܿ᩸᩷;Ljava/lang/String;)V

    .line 91
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_8

    :goto_2
    const-string v0, "\u1a75\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x116f

    const v20, 0x39dc3354    # 4.1999912E-4f

    xor-int v9, v9, v20

    const v20, -0x7b1cf889

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u0730\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x675f

    const v20, -0x2824b14

    xor-int v9, v9, v20

    const v20, -0x16eb3e74

    goto/16 :goto_6

    :sswitch_c
    const v0, 0x8447

    const v12, 0x8447

    goto :goto_3

    :sswitch_d
    const/16 v0, 0x4833

    const/16 v12, 0x4833

    :goto_3
    const-string v0, "\u06e0\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x7fd3

    const v20, -0x14503370

    xor-int v9, v9, v20

    const v20, 0x74ca5685

    goto/16 :goto_6

    :sswitch_e
    const v0, 0xd319b84

    add-int/2addr v0, v11

    mul-int/lit16 v9, v10, 0x743c

    sub-int/2addr v9, v0

    if-gtz v9, :cond_9

    const-string v0, "\u06eb\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x1b

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x3d67

    const v20, 0x6358d25

    xor-int v9, v9, v20

    const v20, -0x64a82d6b

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06e1\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x6573

    const v20, 0x5d7cbfdc

    xor-int v9, v9, v20

    const v20, 0x73f55d6e

    goto/16 :goto_6

    :sswitch_f
    aget-short v10, v16, v21

    mul-int v11, v10, v10

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v0

    if-gtz v0, :cond_a

    :goto_4
    const-string v0, "\u0730\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x3e9

    const v20, -0x6bdc52d9

    xor-int v9, v9, v20

    const v20, -0x1f3ce7eb

    goto :goto_6

    :cond_a
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit8 v9, v9, -0x65

    const v20, 0x5e8d4b44

    xor-int v9, v9, v20

    const v20, -0x7dfdcbff

    goto :goto_6

    :sswitch_10
    const/16 v21, 0x0

    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "\u06ec\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x1d

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x3fa5

    const v20, -0x477be763

    xor-int v9, v9, v20

    const v20, -0x6b7e5a4

    goto :goto_6

    :sswitch_11
    sget-object v16, Ll/ۨܶ᩷;->֫ܽᩳ:[S

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u05a8\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x5

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x5c15

    const v20, -0x2d833c15

    xor-int v9, v9, v20

    const v20, 0x78606cd5

    goto :goto_6

    :cond_d
    const-string v0, "\u1a79\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x1727

    const v20, 0x452102a4

    xor-int v9, v9, v20

    const v20, 0x3203babb

    :goto_6
    xor-int v20, v0, v20

    move v0, v9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fb2b36f -> :sswitch_b
        -0x777fbbda -> :sswitch_11
        -0x7049acb5 -> :sswitch_9
        -0x6c26daf2 -> :sswitch_0
        -0x6beec61e -> :sswitch_3
        -0x6bdd3082 -> :sswitch_10
        -0x6558595f -> :sswitch_d
        -0x60fd8b8f -> :sswitch_c
        -0x4a1890de -> :sswitch_f
        -0x4366200c -> :sswitch_2
        -0x40356b6b -> :sswitch_b
        -0x2f531188 -> :sswitch_11
        -0x2dee8cbb -> :sswitch_f
        -0x21088b4c -> :sswitch_10
        -0x1cdc75f9 -> :sswitch_8
        -0x1432b43b -> :sswitch_6
        -0x7ee7b72 -> :sswitch_1
        0x693d3c6 -> :sswitch_a
        0x91a8815 -> :sswitch_8
        0xc9e3411 -> :sswitch_5
        0x1146483a -> :sswitch_4
        0x14443c4c -> :sswitch_4
        0x2a130b35 -> :sswitch_d
        0x2b3f5449 -> :sswitch_2
        0x352c59ec -> :sswitch_6
        0x413cbb8e -> :sswitch_3
        0x44ded51b -> :sswitch_c
        0x480043ac -> :sswitch_a
        0x52e90936 -> :sswitch_7
        0x6817c906 -> :sswitch_0
        0x6e82aa99 -> :sswitch_9
        0x737c24e7 -> :sswitch_e
        0x7685290c -> :sswitch_e
        0x785be7cf -> :sswitch_5
        0x79fd2b51 -> :sswitch_1
        0x7a5e01d8 -> :sswitch_7
    .end sparse-switch
.end method
