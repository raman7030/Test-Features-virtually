.class public final synthetic Ll/᩵ۡܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ܽܿܽ:[S


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

    sput-object v0, Ll/᩵ۡܳ;->ܽܿܽ:[S

    return-void

    :array_0
    .array-data 2
        0x1cafs
        0x6e37s
        0x6e38s
        0x6e32s
        0x6e24s
        0x6e39s
        0x6e3fs
        0x6e32s
        0x6e78s
        0x6e3fs
        0x6e38s
        0x6e22s
        0x6e33s
        0x6e38s
        0x6e22s
        0x6e78s
        0x6e37s
        0x6e35s
        0x6e22s
        0x6e3fs
        0x6e39s
        0x6e38s
        0x6e78s
        0x6e00s
        0x6e1fs
        0x6e13s
        0x6e01s
        0x6e32s
        0x6e33s
        0x6e2es
        0x6e10s
        0x6e3fs
        0x6e3as
        0x6e33s
        0x6e25s
        0x6e24s
        0x6e33s
        0x6e25s
        0x6e39s
        0x6e23s
        0x6e24s
        0x6e35s
        0x6e33s
        0x6e25s
        0x6e78s
        0x6e37s
        0x6e24s
        0x6e25s
        0x6e35s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll/ܽۢܳ;Ljava/lang/Class;Ll/ᩳۜܳ;)V
    .locals 6

    const v0, -0x20e22f8c

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6bb3

    const v5, 0x7a052f3f

    xor-int/2addr v4, v5

    const v5, 0xcdc5522

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x506b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_8

    goto/16 :goto_1

    .line 2
    :sswitch_1
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x780d

    const v5, -0x19088b4c

    xor-int/2addr v4, v5

    const v5, -0x72a3a4ad

    goto :goto_0

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_6

    goto/16 :goto_4

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/᩵ۡܳ;->᩶:Ljava/lang/Class;

    iput-object p4, p0, Ll/᩵ۡܳ;->ۙ:Ll/ᩳۜܳ;

    return-void

    :sswitch_6
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e8\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x42a7

    const v5, -0x66e9077c

    xor-int/2addr v4, v5

    const v5, 0x37ae4621

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06e7\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ed3

    const v5, -0x3a0e7fa7

    xor-int/2addr v4, v5

    const v5, -0x6ffffc48

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x170b

    const v5, 0x346a085f

    xor-int/2addr v4, v5

    const v5, -0x1102e44d

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4efd

    const v5, 0x2bdb35aa

    xor-int/2addr v4, v5

    const v5, -0x66019b8c

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e1\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4b83

    const v5, 0x3f7e24fd

    xor-int/2addr v4, v5

    const v5, -0x60eefd4c

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06dc\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4cab

    const v5, -0x5bdb4da2

    xor-int/2addr v4, v5

    const v5, -0x59dd40a3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a77\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x947

    const v5, 0x717154f1

    xor-int/2addr v4, v5

    const v5, 0x51bc3e04

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x49bf

    const v5, -0x2f1bc692

    xor-int/2addr v4, v5

    const v5, -0x4e1be79c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a75\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x714f

    const v5, -0x13a796d1

    xor-int/2addr v4, v5

    const v5, -0x30e1213b

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u05ab\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e59

    const v5, 0x295fda8d

    xor-int/2addr v4, v5

    const v5, -0x2e986cb9

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_b

    :goto_3
    const-string v3, "\u06e7\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x64c5

    const v5, -0x38d86200    # -42910.0f

    xor-int/2addr v4, v5

    const v5, -0x7d19849b

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05ab\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22e1

    const v5, -0x45e2f493

    xor-int/2addr v4, v5

    const v5, 0x6a4705f0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩵ۡܳ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/᩵ۡܳ;->᩹:Ll/ܽۢܳ;

    .line 4
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u06d6\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x8eb

    const v5, 0x3802eaf1

    xor-int/2addr v4, v5

    const v5, -0x68d329b6

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x34a3

    const v5, -0x38a07081

    xor-int/2addr v4, v5

    const v5, 0x5429c4cf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ba4c34f -> :sswitch_3
        -0x6d9d606f -> :sswitch_9
        -0x6a1a71d0 -> :sswitch_8
        -0x605d53b4 -> :sswitch_a
        -0x54aaacbb -> :sswitch_0
        -0x51ecfcc2 -> :sswitch_d
        -0x50da2627 -> :sswitch_2
        -0x41926bdd -> :sswitch_c
        -0x3f117cf9 -> :sswitch_4
        -0x3a2d803b -> :sswitch_5
        -0x1c7b4216 -> :sswitch_5
        -0xce1823c -> :sswitch_b
        -0x3ddd806 -> :sswitch_7
        -0x1c1e8ad -> :sswitch_2
        0x13b22ea0 -> :sswitch_7
        0x148fb35c -> :sswitch_1
        0x1624e3bd -> :sswitch_6
        0x1b37b75a -> :sswitch_a
        0x2ea63151 -> :sswitch_e
        0x3be9221f -> :sswitch_6
        0x43062a6c -> :sswitch_4
        0x44381af8 -> :sswitch_9
        0x517bddd0 -> :sswitch_b
        0x56cc87c3 -> :sswitch_0
        0x57edc6e6 -> :sswitch_8
        0x5be043eb -> :sswitch_c
        0x65cee223 -> :sswitch_1
        0x6d1df4ad -> :sswitch_e
        0x7653d27a -> :sswitch_d
        0x7eb3581f -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 28

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

    const/16 v20, 0x0

    const v21, 0x56a12d63

    sget v22, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v23, Ll/֡֡;->֫ۤܳ:I

    const-string v24, "\u06d7\u0733"

    invoke-static/range {v24 .. v24}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v24

    sub-int v24, v23, v24

    mul-int/lit8 v24, v24, -0x6f

    xor-int v1, v24, v22

    mul-int/lit16 v1, v1, -0x158d

    const v26, 0x3c8ad783

    xor-int v1, v1, v26

    const v26, 0x22801bb5

    xor-int v24, v24, v26

    move-object v3, v2

    move-object/from16 v18, v9

    move-object/from16 v10, v17

    move-object/from16 v13, v20

    move/from16 v25, v24

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v24, 0x56a12d63

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v15, v24, v22

    mul-int/lit16 v15, v15, 0x329b

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v24, v25, v1

    sparse-switch v24, :sswitch_data_0

    sget-object v18, Ll/᩵ۡܳ;->ܽܿܽ:[S

    const/16 v19, 0x0

    .line 225
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_f

    goto/16 :goto_7

    .line 835
    :sswitch_0
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-gez v1, :cond_7

    goto/16 :goto_7

    .line 737
    :sswitch_1
    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v1, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v1, "\u06d7\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0x2df5

    const v25, -0x3de893c4

    xor-int v15, v15, v25

    const v25, -0x3d345864

    goto/16 :goto_8

    .line 1032
    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_e

    goto/16 :goto_5

    .line 599
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    return-void

    :sswitch_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_3

    .line 1174
    :sswitch_6
    invoke-virtual {v8}, Ll/ۤۢܳ;->֫()V

    .line 1175
    invoke-virtual {v8}, Ll/ۤۢܳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ۗۗ;->ۡۜᩳ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_1

    :sswitch_7
    const/16 v1, 0x23

    const/16 v15, 0xe

    .line 1172
    invoke-static {v13, v1, v15, v4}, Ll/ۘܿ;->ۢۙۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_1
    const-string v1, "\u06e1\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x4d

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, 0xfe5

    const v25, -0x7c96a2a7

    xor-int v15, v15, v25

    const v25, 0x5146aef

    goto/16 :goto_8

    :cond_1
    const-string v1, "\u06eb\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0x815

    const v25, 0x6f3e43a8

    xor-int v15, v15, v25

    const v25, 0x237a1335

    goto/16 :goto_8

    .line 1171
    :sswitch_8
    invoke-static {v3, v5}, Ll/ۗ᩺;->᩸۬۬(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Ll/ۤۢܳ;

    .line 1172
    invoke-virtual {v8}, Ll/ۤۢܳ;->ᩳ()Ljava/lang/String;

    move-result-object v9

    sget-object v13, Ll/᩵ۡܳ;->ܽܿܽ:[S

    .line 71
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u06e4\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x6485

    const v25, 0x7b9f717e

    xor-int v15, v15, v25

    const v25, -0x1a2acd42

    goto/16 :goto_8

    :sswitch_9
    const/16 v1, 0x7d0

    .line 216
    iget-object v2, v0, Ll/᩵ۡܳ;->ۙ:Ll/ᩳۜܳ;

    invoke-static {v2, v1}, Ll/ۢۘܳ;->֫(Ll/ᩳۜܳ;I)V

    .line 1182
    invoke-static {v6}, Ll/᩺;->ܳᩳۙ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    invoke-static {v1, v14}, Ll/ۘܿ;->ᩳ᩸֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 1180
    :sswitch_a
    invoke-virtual {v2}, Ll/ۤۜܽ;->ۘ()[B

    move-result-object v1

    invoke-virtual {v14, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v1

    if-gtz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x5

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0x5257

    const v25, -0xc9c7bbf

    xor-int v15, v15, v25

    const v25, 0x82f9eb9

    goto/16 :goto_8

    .line 1179
    :sswitch_b
    sget-object v1, Ll/᩵ۡܳ;->ܽܿܽ:[S

    const/16 v7, 0x1b

    const/16 v15, 0x8

    invoke-static {v1, v7, v15, v4}, Ll/ۖۘ;->۠ܶܿ([SIII)Ljava/lang/String;

    move-result-object v7

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u06e7\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x45fb

    const v25, 0x4472894a

    xor-int v15, v15, v25

    const v25, -0x522d48f9

    goto/16 :goto_8

    .line 1178
    :sswitch_c
    invoke-static {v10, v11, v12, v4}, Ll/֡۬;->ۢܳ᩸([SIII)Ljava/lang/String;

    move-result-object v1

    .line 1179
    invoke-virtual {v14, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06d9\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, 0x4d87

    const v25, -0x54cf7da8

    xor-int v15, v15, v25

    const v25, 0x12dedf8

    goto/16 :goto_8

    .line 1178
    :sswitch_d
    sget-object v10, Ll/᩵ۡܳ;->ܽܿܽ:[S

    const/4 v11, 0x1

    const/16 v12, 0x1a

    .line 227
    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_6

    goto :goto_2

    :cond_6
    const-string v1, "\u05a1\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0x3f

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, 0x3c17

    const v25, 0x5e6a4e76

    xor-int v15, v15, v25

    const v25, 0x421d1a04

    goto/16 :goto_8

    .line 1177
    :sswitch_e
    new-instance v14, Landroid/content/Intent;

    iget-object v6, v0, Ll/᩵ۡܳ;->᩹:Ll/ܽۢܳ;

    invoke-static {v6}, Ll/᩺;->ܳᩳۙ(Ljava/lang/Object;)Lbin/mt/plus/Main;

    move-result-object v1

    iget-object v15, v0, Ll/᩵ۡܳ;->᩶:Ljava/lang/Class;

    .line 458
    sget v25, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v25, :cond_8

    :cond_7
    :goto_2
    const-string v1, "\u06d6\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x57

    xor-int v14, v1, v22

    mul-int/lit16 v14, v14, -0x2b95

    const v15, 0x106f9be4

    xor-int/2addr v14, v15

    const v15, 0x89fec8d

    xor-int v25, v1, v15

    move v1, v14

    const/4 v14, 0x0

    goto/16 :goto_0

    .line 1177
    :cond_8
    invoke-direct {v14, v1, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 1178
    invoke-static {v14, v1}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v1, "\u06df\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x5

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x5661

    const v25, -0x669ffcce

    xor-int v15, v15, v25

    const v25, 0x3131eaeb

    goto/16 :goto_8

    .line 1170
    :sswitch_f
    iget-object v3, v0, Ll/᩵ۡܳ;->᩸:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/ۗ᩵;->ۡᩴۙ(Ljava/lang/Object;)I

    move-result v1

    if-ge v5, v1, :cond_a

    const-string v1, "\u073d\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v23, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x13fd

    const v25, -0x6a279f94

    xor-int v15, v15, v25

    const v25, -0x40ca61d7

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u1a76\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x3c55

    const v25, -0x3436704c    # -2.6419048E7f

    xor-int v15, v15, v25

    const v25, -0x4b634df9

    goto/16 :goto_8

    .line 1169
    :sswitch_10
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    const/4 v2, 0x0

    move-object v2, v1

    const/4 v5, 0x0

    :goto_3
    const-string v1, "\u05a8\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, 0x50f

    const v25, 0x4a376665    # 3004825.2f

    xor-int v15, v15, v25

    const v25, 0x46fd0d19

    goto/16 :goto_8

    :sswitch_11
    const/16 v1, 0x6a76

    const/16 v4, 0x6a76

    goto :goto_4

    :sswitch_12
    const/16 v1, 0x6e56

    const/16 v4, 0x6e56

    :goto_4
    const-string v1, "\u05ab\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v23, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x44d5

    const v25, -0x6de197f6

    xor-int v15, v15, v25

    const v25, -0x2bec9b8f

    goto/16 :goto_8

    :sswitch_13
    add-int v1, v27, v16

    sub-int v1, v1, v26

    if-gez v1, :cond_b

    const-string v1, "\u1a76\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0xe81

    const v25, 0x6369bd24

    xor-int v15, v15, v25

    const v25, 0x36d77ce2

    goto/16 :goto_8

    :cond_b
    const-string v1, "\u06e7\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0x6dff

    const v25, -0x6e5deca2

    xor-int v15, v15, v25

    const v25, 0x10fad781

    goto/16 :goto_8

    :sswitch_14
    mul-int v26, v20, v21

    mul-int v27, v20, v20

    const v16, 0x1a39c1

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_c

    :goto_5
    const-string v1, "\u1a7b\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x3dd7

    const v25, 0x29a89972

    xor-int v15, v15, v25

    const v25, -0x34810f78    # -1.670772E7f

    goto/16 :goto_8

    :cond_c
    const-string v1, "\u06e2\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x2f

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x545f

    const v25, 0x6e189ae0

    xor-int v15, v15, v25

    const v25, -0x295ae6e1

    goto :goto_8

    :sswitch_15
    aget-short v20, v18, v19

    const/16 v21, 0xa3e

    .line 268
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_d

    :goto_6
    const-string v1, "\u0736\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0xd

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0x5605

    const v25, -0x6095a672

    xor-int v15, v15, v25

    const v25, 0x5b3b219a

    goto :goto_8

    :cond_d
    const-string v1, "\u06d6\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, -0x49

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x561d

    const v25, -0x2bf867c2

    xor-int v15, v15, v25

    const v25, -0x54cb7cc6

    goto :goto_8

    :cond_e
    :goto_7
    const-string v1, "\u1a78\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x49

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x577b

    const v25, -0x5b34477e

    xor-int v15, v15, v25

    const v25, 0x2103ae01

    goto :goto_8

    :cond_f
    const-string v1, "\u06df\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x15

    xor-int v15, v1, v23

    mul-int/lit16 v15, v15, -0x4acf

    const v25, 0x2f936367

    xor-int v15, v15, v25

    const v25, 0x432fbade

    :goto_8
    xor-int v25, v1, v25

    move v1, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x64eb0882 -> :sswitch_1
        -0x6418166c -> :sswitch_12
        -0x4f317775 -> :sswitch_4
        -0x4c20e1be -> :sswitch_f
        -0x3e7b4f3e -> :sswitch_9
        -0x3c091750 -> :sswitch_11
        -0x3427a529 -> :sswitch_f
        -0x2b8c2981 -> :sswitch_2
        -0x2b36dfa6 -> :sswitch_1
        -0x29a7c6b7 -> :sswitch_6
        -0x29824424 -> :sswitch_0
        -0x2841fab8 -> :sswitch_e
        -0x24efba51 -> :sswitch_7
        -0x233959fa -> :sswitch_8
        -0x21f3c8bf -> :sswitch_d
        -0x211f6f48 -> :sswitch_10
        -0x1a27029e -> :sswitch_12
        -0x117a0f14 -> :sswitch_c
        -0xbf0138f -> :sswitch_b
        -0x9261599 -> :sswitch_b
        0xb74cd3f -> :sswitch_c
        0x14214fe8 -> :sswitch_10
        0x155c086e -> :sswitch_d
        0x1970f383 -> :sswitch_7
        0x1e381ced -> :sswitch_0
        0x20574033 -> :sswitch_14
        0x286b5172 -> :sswitch_15
        0x28df46fa -> :sswitch_a
        0x2a6353ed -> :sswitch_3
        0x2b9b2e76 -> :sswitch_3
        0x37d8d612 -> :sswitch_4
        0x37e9a7e9 -> :sswitch_2
        0x41d0616f -> :sswitch_5
        0x4748ba9c -> :sswitch_6
        0x483a94cb -> :sswitch_e
        0x4b22283d -> :sswitch_13
        0x517771e8 -> :sswitch_a
        0x5428d9f3 -> :sswitch_11
        0x56081bcd -> :sswitch_8
        0x58e65fdd -> :sswitch_15
        0x59200e33 -> :sswitch_9
        0x5d9674a1 -> :sswitch_5
        0x5f922ff5 -> :sswitch_14
        0x63d36ef6 -> :sswitch_13
    .end sparse-switch
.end method
