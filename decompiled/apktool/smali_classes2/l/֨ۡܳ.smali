.class public final synthetic Ll/֨ۡܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۤۜۤ:[S


# instance fields
.field public final synthetic ۙ:Ll/ᩳۜܳ;

.field public final synthetic ᩶:Ljava/lang/Class;

.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֨ۡܳ;->ۤۜۤ:[S

    return-void

    :array_0
    .array-data 2
        0xff5s
        0x29d9s
        0x29d6s
        0x29dcs
        0x29cas
        0x29d7s
        0x29d1s
        0x29dcs
        0x2996s
        0x29d1s
        0x29d6s
        0x29ccs
        0x29dds
        0x29d6s
        0x29ccs
        0x2996s
        0x29d9s
        0x29dbs
        0x29ccs
        0x29d1s
        0x29d7s
        0x29d6s
        0x2996s
        0x29ees
        0x29f1s
        0x29fds
        0x29efs
        0x29dcs
        0x29dds
        0x29c0s
        0x29fes
        0x29d1s
        0x29d4s
        0x29dds
        0x29cbs
        0x29cas
        0x29dds
        0x29cbs
        0x29d7s
        0x29cds
        0x29cas
        0x29dbs
        0x29dds
        0x29cbs
        0x2996s
        0x29d9s
        0x29cas
        0x29cbs
        0x29dbs
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/ܽۢܳ;Ljava/lang/Class;Ll/ᩳۜܳ;)V
    .locals 6

    const v0, 0x574b7671

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۛ;->᩺᩻֫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3d35

    const v5, 0x2f66cd88

    xor-int/2addr v4, v5

    const v5, -0x78b6418d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1b4b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v3, :cond_8

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v3

    if-ltz v3, :cond_6

    goto :goto_1

    .line 0
    :sswitch_1
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-gez v3, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_1
    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5971

    const v5, 0x271f9f05

    xor-int/2addr v4, v5

    const v5, -0x23919ea8

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    iput-object p3, p0, Ll/֨ۡܳ;->᩶:Ljava/lang/Class;

    iput-object p4, p0, Ll/֨ۡܳ;->ۙ:Ll/ᩳۜܳ;

    return-void

    :sswitch_5
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u1a73\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4a61

    const v5, 0x495b3514    # 897873.25f

    xor-int/2addr v4, v5

    const v5, 0x59ff745f

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u0733\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb0b

    const v5, 0x4230ca3f

    xor-int/2addr v4, v5

    const v5, 0x6729d56a

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x24c9

    const v5, -0x59991188

    xor-int/2addr v4, v5

    const v5, -0x59de2db1

    goto/16 :goto_0

    .line 4
    :sswitch_8
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x44f1

    const v5, -0x1e272527    # -5.000333E20f

    xor-int/2addr v4, v5

    const v5, 0x186791ee

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_4

    :goto_2
    const-string v3, "\u06d7\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x50a3

    const v5, 0x99f1efd

    xor-int/2addr v4, v5

    const v5, -0x77c1fa0d

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7127

    const v5, -0x7f239fda

    xor-int/2addr v4, v5

    const v5, 0x20714bf4

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x58db

    const v5, -0x65a58f3a

    xor-int/2addr v4, v5

    const v5, -0x12bdaba1

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_7

    :cond_6
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x53df

    const v5, -0x68e3ee21

    xor-int/2addr v4, v5

    const v5, -0x54d3b04d

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0733\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x47df

    const v5, -0x1bd87d23

    xor-int/2addr v4, v5

    const v5, 0x1cbbee1f

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u073f\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45bd

    const v5, -0x1404adcb

    xor-int/2addr v4, v5

    const v5, -0x5428c18

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06eb\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30a7

    const v5, -0x6908fec9

    xor-int/2addr v4, v5

    const v5, 0x151f47d3

    goto/16 :goto_0

    .line 2
    :sswitch_d
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2577

    const v5, 0x3e0d7fbb

    xor-int/2addr v4, v5

    const v5, -0x1ece3adb

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/֨ۡܳ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/֨ۡܳ;->᩹:Ll/ܽۢܳ;

    .line 3
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a7b\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x769b

    const v5, 0x2685d260

    xor-int/2addr v4, v5

    const v5, -0x6323feae

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77d3

    const v5, 0x1cf7785f

    xor-int/2addr v4, v5

    const v5, -0x1b76625a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7728d2a5 -> :sswitch_4
        -0x76ec6f69 -> :sswitch_7
        -0x7577457e -> :sswitch_5
        -0x74f5b2c8 -> :sswitch_6
        -0x6a0c5163 -> :sswitch_3
        -0x4ca52d78 -> :sswitch_5
        -0x4b349134 -> :sswitch_4
        -0x33a139eb -> :sswitch_a
        -0x2eb3fc57 -> :sswitch_c
        -0x21b1bad1 -> :sswitch_d
        -0xfafc138 -> :sswitch_1
        -0x8a75d75 -> :sswitch_0
        -0x5afd295 -> :sswitch_7
        0x822a0e4 -> :sswitch_a
        0xc937622 -> :sswitch_c
        0x171c0100 -> :sswitch_1
        0x18caf5df -> :sswitch_2
        0x1cdcbc8e -> :sswitch_8
        0x246e878d -> :sswitch_8
        0x2472a735 -> :sswitch_d
        0x2d918179 -> :sswitch_9
        0x33e1cca0 -> :sswitch_6
        0x3e5896bf -> :sswitch_3
        0x42d0d0e3 -> :sswitch_e
        0x444a7cb3 -> :sswitch_9
        0x4d9a9cee -> :sswitch_0
        0x5bc044e2 -> :sswitch_b
        0x669258a6 -> :sswitch_e
        0x6f0d5b9e -> :sswitch_b
        0x6fdd6a42 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 27

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const v20, -0x66c56eeb

    sget v21, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v22, Ll/֡᩶;->ܳܶ۠:I

    const-string v23, "\u0733\u06e7"

    invoke-static/range {v23 .. v23}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v23

    sub-int v23, v22, v23

    mul-int/lit8 v23, v23, 0x5d

    xor-int v1, v23, v21

    mul-int/lit16 v1, v1, -0x2641

    const v25, -0x2acac5e4

    xor-int v1, v1, v25

    const v25, 0x5dc3fcee

    xor-int v23, v23, v25

    move-object v3, v2

    move-object/from16 v17, v9

    move-object/from16 v10, v16

    move-object/from16 v14, v19

    move/from16 v24, v23

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, -0x66c56eeb

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v15, v23, v21

    mul-int/lit16 v15, v15, 0x7257

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v23, v24, v1

    sparse-switch v23, :sswitch_data_0

    add-int v1, v25, v19

    mul-int v20, v1, v1

    const v26, 0x88f4

    .line 13
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_b

    goto/16 :goto_6

    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_7

    goto/16 :goto_6

    .line 932
    :sswitch_1
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_c

    goto/16 :goto_2

    .line 913
    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v1, :cond_e

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    return-void

    :sswitch_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_4

    .line 1241
    :sswitch_6
    invoke-virtual {v8}, Ll/ۤۢܳ;->֫()V

    .line 1242
    invoke-virtual {v8}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ۘᩴ;->ܳۚۚ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_7
    const/16 v1, 0x23

    const/16 v15, 0xe

    .line 1239
    invoke-static {v14, v1, v15, v4}, Ll/ۘ᩶;->᩻ۤܶ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x6d

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x8fb

    const v24, 0x17df6cf9

    xor-int v15, v15, v24

    const v24, -0x6e8b2676

    goto/16 :goto_8

    :cond_0
    const-string v1, "\u06e4\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x251b

    const v24, 0x124b4de7

    xor-int v15, v15, v24

    const v24, -0x26ea1250

    goto/16 :goto_8

    .line 1238
    :sswitch_8
    invoke-static {v3, v5}, Ll/ۗ᩺;->᩸۬۬(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ll/ۤۢܳ;

    .line 1239
    invoke-virtual {v8}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v9

    sget-object v14, Ll/֨ۡܳ;->ۤۜۤ:[S

    .line 455
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_1

    goto/16 :goto_7

    :cond_1
    const-string v1, "\u06db\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x75ab

    const v24, 0x7218c70c

    xor-int v15, v15, v24

    const v24, 0x329b7c79

    goto/16 :goto_8

    :sswitch_9
    const/16 v1, 0x7d0

    .line 216
    iget-object v2, v0, Ll/֨ۡܳ;->ۙ:Ll/ᩳۜܳ;

    invoke-static {v2, v1}, Ll/ۢۘܳ;->֫(Ll/ᩳۜܳ;I)V

    .line 1249
    invoke-static {v6}, Ll/᩹;->ܳ֨ۛ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-static {v1, v12}, Ll/ۘܿ;->ᩳ᩸֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1247
    :sswitch_a
    invoke-virtual {v2}, Ll/ۤۜܽ;->ۘ()[B

    move-result-object v1

    invoke-virtual {v12, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v1, "\u06dc\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x3d

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x7cb1

    const v24, -0x15860948

    xor-int v15, v15, v24

    const v24, 0x6eaf5b00

    goto/16 :goto_8

    .line 1246
    :sswitch_b
    sget-object v1, Ll/֨ۡܳ;->ۤۜۤ:[S

    const/16 v7, 0x1b

    const/16 v15, 0x8

    invoke-static {v1, v7, v15, v4}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v7

    .line 1148
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v1

    if-gtz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u06e2\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x73

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x1aaf

    const v24, 0x75b52fd6

    xor-int v15, v15, v24

    const v24, 0xa2b8067

    goto/16 :goto_8

    .line 1245
    :sswitch_c
    invoke-static {v10, v11, v13, v4}, Ll/ۘۛ;->ۚ᩻֫([SIII)Ljava/lang/String;

    move-result-object v1

    .line 1246
    invoke-virtual {v12, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1184
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_4

    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x63

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x3ed1

    const v24, 0x208150b

    xor-int v15, v15, v24

    const v24, 0x7cf43eaa

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u06e2\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x2261

    const v24, -0x736b064f

    xor-int v15, v15, v24

    const v24, 0x68c0d275

    goto/16 :goto_8

    .line 1245
    :sswitch_d
    sget-object v10, Ll/֨ۡܳ;->ۤۜۤ:[S

    const/4 v11, 0x1

    const/16 v13, 0x1a

    .line 165
    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_5

    :goto_2
    const-string v1, "\u1a78\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x6f

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0xbb3

    const v24, 0x61049f62

    xor-int v15, v15, v24

    const v24, -0x6141435d

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u06e1\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x2775

    const v24, 0x832544a

    xor-int v15, v15, v24

    const v24, -0x259aa1e0

    goto/16 :goto_8

    .line 1244
    :sswitch_e
    new-instance v12, Landroid/content/Intent;

    iget-object v6, v0, Ll/֨ۡܳ;->᩹:Ll/ܽۢܳ;

    invoke-static {v6}, Ll/᩹;->ܳ֨ۛ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    iget-object v15, v0, Ll/֨ۡܳ;->᩶:Ljava/lang/Class;

    .line 1049
    sget v24, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v24, :cond_6

    goto :goto_3

    .line 1244
    :cond_6
    invoke-direct {v12, v1, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 1245
    invoke-static {v12, v1}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget-boolean v1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v1, :cond_8

    :cond_7
    :goto_3
    const-string v1, "\u073f\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x2f

    xor-int v12, v1, v22

    mul-int/lit16 v12, v12, 0x794b

    const v15, -0x1ac51d9e

    xor-int/2addr v12, v15

    const v15, -0x6953226f

    xor-int v24, v1, v15

    move v1, v12

    const/4 v12, 0x0

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u073f\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x19ed

    const v24, 0x65546e81

    xor-int v15, v15, v24

    const v24, 0x4ba6d6b5    # 2.1867882E7f

    goto/16 :goto_8

    .line 1237
    :sswitch_f
    iget-object v3, v0, Ll/֨ۡܳ;->᩸:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/ۗ᩵;->ۡᩴۙ(Ljava/lang/Object;)I

    move-result v1

    if-ge v5, v1, :cond_9

    const-string v1, "\u05a8\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x53f9

    const v24, 0x6ee781e2

    xor-int v15, v15, v24

    const v24, -0x21fc460c

    goto/16 :goto_8

    :cond_9
    const-string v1, "\u1a76\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x452d

    const v24, 0x48dc1107

    xor-int v15, v15, v24

    const v24, 0x2c56751f

    goto/16 :goto_8

    .line 1236
    :sswitch_10
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    const/4 v2, 0x0

    move-object v2, v1

    const/4 v5, 0x0

    :goto_4
    const-string v1, "\u06da\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x659

    const v24, -0x5a319b1

    xor-int v15, v15, v24

    const v24, -0x11dc467a

    goto/16 :goto_8

    :sswitch_11
    const/16 v1, 0x2f3

    const/16 v4, 0x2f3

    goto :goto_5

    :sswitch_12
    const/16 v1, 0x29b8

    const/16 v4, 0x29b8

    :goto_5
    const-string v1, "\u05a1\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0x1b

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0xb9

    const v24, 0x2d6ee249

    xor-int v15, v15, v24

    const v24, -0x611c8559

    goto/16 :goto_8

    :sswitch_13
    mul-int v1, v25, v26

    sub-int v1, v20, v1

    if-gez v1, :cond_a

    const-string v1, "\u073f\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x4ecf

    const v24, 0x5fa778dc

    xor-int v15, v15, v24

    const v24, -0x585af0f7    # -4.5813E-15f

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u06e4\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x9

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x2b9b

    const v24, -0x24365d5b

    xor-int v15, v15, v24

    const v24, 0x7776c7f2

    goto/16 :goto_8

    :cond_b
    const-string v1, "\u1a74\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x6e0f

    const v24, -0x14c98d1

    xor-int v15, v15, v24

    const v24, -0x7279fc7

    goto :goto_8

    :sswitch_14
    aget-short v25, v17, v18

    const/16 v19, 0x223d

    .line 1201
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u1a78\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x39ad

    const v24, -0x49bbe073

    xor-int v15, v15, v24

    const v24, 0x8231720

    goto :goto_8

    :cond_d
    const-string v1, "\u05a1\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x35

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x24f1

    const v24, -0x4db44d0d

    xor-int v15, v15, v24

    const v24, -0x124cbfb8

    goto :goto_8

    :sswitch_15
    sget-object v17, Ll/֨ۡܳ;->ۤۜۤ:[S

    const/16 v18, 0x0

    .line 976
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_f

    :cond_e
    :goto_7
    const-string v1, "\u06d8\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x6169

    const v24, 0x49e40e19

    xor-int v15, v15, v24

    const v24, -0x25c99049

    goto :goto_8

    :cond_f
    const-string v1, "\u1a79\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x34dd

    const v24, 0x6498bae8

    xor-int v15, v15, v24

    const v24, 0x6636d252

    :goto_8
    xor-int v24, v1, v24

    move v1, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c5a217c -> :sswitch_6
        -0x6e31ed64 -> :sswitch_0
        -0x6aa7a4bd -> :sswitch_d
        -0x650930a1 -> :sswitch_f
        -0x5d944bca -> :sswitch_13
        -0x53cf543c -> :sswitch_15
        -0x4594d851 -> :sswitch_14
        -0x4137c783 -> :sswitch_11
        -0x3fdab321 -> :sswitch_1
        -0x3ee2060f -> :sswitch_13
        -0x3846b7ee -> :sswitch_7
        -0x36ac0419 -> :sswitch_a
        -0x3502dc75 -> :sswitch_e
        -0x311fedb7 -> :sswitch_5
        -0x2f1d88ef -> :sswitch_7
        -0x2d3a9b25 -> :sswitch_15
        -0x15e8c1a8 -> :sswitch_2
        -0x14637d8e -> :sswitch_a
        -0xe756024 -> :sswitch_10
        -0xd537729 -> :sswitch_5
        -0xcd44472 -> :sswitch_9
        -0x72d3f32 -> :sswitch_9
        -0x243fcb3 -> :sswitch_8
        0x1116c2ea -> :sswitch_d
        0x16c84a98 -> :sswitch_12
        0x1b01b8b2 -> :sswitch_f
        0x1eccc361 -> :sswitch_12
        0x2bda50e6 -> :sswitch_0
        0x2f146e33 -> :sswitch_3
        0x2f475897 -> :sswitch_c
        0x3270d2eb -> :sswitch_b
        0x32b9bc4f -> :sswitch_4
        0x36b4f044 -> :sswitch_3
        0x3c85720a -> :sswitch_14
        0x46821bcd -> :sswitch_b
        0x47425106 -> :sswitch_c
        0x51ada052 -> :sswitch_6
        0x528732e4 -> :sswitch_11
        0x5290c3de -> :sswitch_2
        0x561af411 -> :sswitch_8
        0x5999d1d2 -> :sswitch_4
        0x5c854c19 -> :sswitch_10
        0x6868ad98 -> :sswitch_1
        0x76e5a3ab -> :sswitch_e
    .end sparse-switch
.end method
