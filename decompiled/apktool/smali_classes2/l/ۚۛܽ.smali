.class public final synthetic Ll/ۚۛܽ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final ۠ۙۡ:[S


# instance fields
.field public final synthetic ᩸:Landroid/widget/CheckBox;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚۛܽ;->۠ۙۡ:[S

    return-void

    :array_0
    .array-data 2
        0x754s
        0x724s
        0x723s
        0x727s
        0x728s
        0x72es
        0x739s
        0x712s
        0x721s
        0x722s
        0x72as
        0x712s
        0x73ds
        0x72cs
        0x739s
        0x725s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۛܽ;->᩸:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x2571c67e

    sget v11, Ll/֡֡;->֫ۤܳ:I

    sget v12, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v13, "\u0730\u05a8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x53

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x27dd

    const v15, -0x1e1b4a47

    xor-int/2addr v14, v15

    const v15, -0x7c7663e3

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x5701

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v13, p0

    .line 596
    iget-object v0, v13, Ll/ۚۛܽ;->᩸:Landroid/widget/CheckBox;

    invoke-static {v0, v2}, Ll/ۖ;->᩹۬ۖ(Ljava/lang/Object;Z)V

    return-void

    .line 282
    :sswitch_0
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v13, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v13, :cond_1

    :cond_0
    move-object/from16 v13, p0

    goto/16 :goto_5

    :cond_1
    const-string v13, "\u073a\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3c41

    const v15, 0x62a1a346

    xor-int/2addr v14, v15

    const v15, -0x336d947a

    goto :goto_0

    :sswitch_1
    sget v13, Ll/֡֡;->֫ۤܳ:I

    if-gez v13, :cond_2

    :goto_2
    move-object/from16 v13, p0

    goto/16 :goto_3

    :cond_2
    move-object/from16 v13, p0

    goto/16 :goto_6

    .line 200
    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v13, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v13, :cond_0

    goto :goto_2

    .line 503
    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto :goto_2

    .line 516
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    return-void

    :sswitch_5
    move-object/from16 v13, p0

    .line 595
    invoke-interface {v0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v2

    invoke-static {v2}, Ll/֫ܺ;->ۚ۬᩻(Ljava/lang/Object;)V

    const/4 v2, 0x0

    sget-boolean v14, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v14, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v14, "\u1a7b\u06e7"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x3389

    const v16, -0x17a20a07

    xor-int v15, v15, v16

    const v16, -0x4a663982

    goto/16 :goto_8

    :sswitch_6
    move-object/from16 v13, p0

    const/16 v1, 0xf

    invoke-static {v8, v9, v1, v7}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 328
    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v14, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v14, "\u073f\u06df"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x61e1

    const v16, -0x3e3d3845

    xor-int v15, v15, v16

    const v16, 0x66a4c4f9

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v13, p0

    const/4 v9, 0x1

    .line 18
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v14

    if-nez v14, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v14, "\u1a79\u1a75"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x79

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x267

    const v16, -0x1bba15b

    xor-int v15, v15, v16

    const v16, -0x57e88492

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v13, p0

    .line 595
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-static {v0}, Ll/֫ܿ;->ܽ᩶ܿ(Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v0

    sget-object v8, Ll/ۚۛܽ;->۠ۙۡ:[S

    .line 7
    sget v14, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v14, :cond_6

    :goto_3
    const-string v14, "\u06e8\u06e4"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x3949

    const v16, 0x16d96399

    xor-int v15, v15, v16

    const v16, -0x7b01cf7f

    goto/16 :goto_8

    :cond_6
    const-string v14, "\u06e2\u06eb"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x5f

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x4065

    const v16, 0x20cb7872

    xor-int v15, v15, v16

    const v16, 0x23581eb2

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v13, p0

    const/16 v7, 0x404a

    goto :goto_4

    :sswitch_a
    move-object/from16 v13, p0

    const/16 v7, 0x74d

    :goto_4
    const-string v14, "\u0736\u05a8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x7b0f

    const v16, 0x48145369

    xor-int v15, v15, v16

    const v16, 0x3faa4be3

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v13, p0

    add-int v14, v4, v6

    mul-int v14, v14, v14

    sub-int/2addr v14, v5

    if-ltz v14, :cond_7

    const-string v14, "\u1a7a\u06da"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x522f

    const v16, -0xfec91a9

    xor-int v15, v15, v16

    const v16, -0x32d53e59    # -1.7905112E8f

    goto/16 :goto_8

    :cond_7
    const-string v14, "\u06ec\u1a7b"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x487

    const v16, 0xb1145d0

    xor-int v15, v15, v16

    const v16, -0x6097d7a6

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v13, p0

    const v5, 0x8e5c

    mul-int v5, v5, v4

    const/16 v6, 0x2397

    .line 280
    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v14, :cond_8

    goto :goto_5

    :cond_8
    const-string v14, "\u06eb\u06d8"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x257

    const v16, -0x7233e4fa

    xor-int v15, v15, v16

    const v16, -0x10e87498

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v13, p0

    const/4 v4, 0x0

    aget-short v4, v3, v4

    sget v14, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v14, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v14, "\u1a77\u06d6"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0xd

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x2cdb

    const v16, -0x2ec3911a

    xor-int v15, v15, v16

    const v16, 0xf1098b5

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v13, p0

    sget-object v3, Ll/ۚۛܽ;->۠ۙۡ:[S

    .line 541
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v14

    if-gtz v14, :cond_a

    goto :goto_6

    :cond_a
    const-string v14, "\u1a76\u073f"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0xd

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x271f

    const v16, 0x15e71c62

    xor-int v15, v15, v16

    const v16, -0x2af276b0

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v13, p0

    .line 234
    sget-boolean v14, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v14, :cond_b

    :goto_5
    const-string v14, "\u06d6\u0730"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7393

    const v16, 0x5557c0b5

    xor-int v15, v15, v16

    const v16, 0x475dc928

    goto/16 :goto_8

    :cond_b
    const-string v14, "\u0733\u06e0"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x2335

    const v16, -0xa4ea1b1

    xor-int v15, v15, v16

    const v16, -0x58f59c11

    goto :goto_8

    :sswitch_10
    move-object/from16 v13, p0

    sget v14, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v14, :cond_c

    :goto_6
    const-string v14, "\u05a8\u06eb"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x7d

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x5833

    const v16, -0x3e73b137

    xor-int v15, v15, v16

    const v16, 0x1011c47d

    goto :goto_8

    :cond_c
    const-string v14, "\u06dc\u06da"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x651b

    const v16, -0x517d344f

    xor-int v15, v15, v16

    const v16, -0x36d332f

    goto :goto_8

    :sswitch_11
    move-object/from16 v13, p0

    .line 117
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v14

    if-eqz v14, :cond_d

    :goto_7
    const-string v14, "\u06e1\u0736"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x75e5

    const v16, -0x74f5de99

    xor-int v15, v15, v16

    const v16, 0x2d4b4174

    goto :goto_8

    :cond_d
    const-string v14, "\u06eb\u06d7"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x55

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x22c5

    const v16, -0xc7c05fb

    xor-int v15, v15, v16

    const v16, 0x58115084    # 6.3909999E14f

    :goto_8
    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa38084 -> :sswitch_0
        -0x6aa25887 -> :sswitch_8
        -0x6a4d2261 -> :sswitch_a
        -0x67c05451 -> :sswitch_1
        -0x6787a916 -> :sswitch_3
        -0x643190e7 -> :sswitch_7
        -0x4b4f9d52 -> :sswitch_0
        -0x4407f087 -> :sswitch_3
        -0x3cf04c66 -> :sswitch_8
        -0x2b59b91d -> :sswitch_b
        -0x248094af -> :sswitch_c
        -0x2242fde7 -> :sswitch_d
        -0x1790836d -> :sswitch_4
        -0x76a3c6c -> :sswitch_7
        -0x4ac7cbe -> :sswitch_d
        -0xa0232a -> :sswitch_5
        0x370ae4 -> :sswitch_f
        0x69326fa -> :sswitch_9
        0x176f9342 -> :sswitch_10
        0x1d0513d2 -> :sswitch_4
        0x1e91b039 -> :sswitch_9
        0x30378cb6 -> :sswitch_1
        0x318ce74c -> :sswitch_a
        0x3a7f9260 -> :sswitch_c
        0x3c73b83f -> :sswitch_6
        0x3fa2dc41 -> :sswitch_2
        0x5aa02ce3 -> :sswitch_11
        0x5baf98a9 -> :sswitch_e
        0x616d6c3d -> :sswitch_2
        0x6a465794 -> :sswitch_11
        0x731c146b -> :sswitch_f
        0x76cf4471 -> :sswitch_5
        0x76eca98a -> :sswitch_b
        0x78733a5b -> :sswitch_10
        0x793c19db -> :sswitch_e
        0x7bbc60a8 -> :sswitch_6
    .end sparse-switch
.end method
