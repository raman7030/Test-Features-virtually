.class public Ll/ۢۢۡ;
.super Landroid/widget/ListView;
.source "J5HS"


# static fields
.field private static final ۟᩸᩺:[S


# instance fields
.field public ֫֫:Ll/ܳ᩸ۡ;

.field public ۖ֫:F

.field public ۗ:F

.field public ۘ֫:Ljava/util/ArrayList;

.field public ۙ:F

.field public ۛ:F

.field public ۜ֫:Z

.field public ۟:J

.field public ۡ֫:I

.field public ۢ֫:Z

.field public ۤ:I

.field public ۧ֫:Z

.field public ۨ:F

.field public ۫:I

.field public ۬:Ll/۬ۧ֫;

.field public ܰ:Z

.field public ܳ֫:Landroid/widget/AdapterView$OnItemLongClickListener;

.field public ܺ֫:I

.field public final ܽ֫:Ll/ۜۢۡ;

.field public ܿ֫:Z

.field public ᩳ֫:Z

.field public ᩴ֫:Z

.field public ᩶:J

.field public ᩷֫:J

.field public ᩸:Landroid/view/View$OnTouchListener;

.field public final ᩹:Landroid/database/DataSetObserver;

.field public ᩺:I

.field public ᩻֫:Landroid/widget/AbsListView$OnScrollListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const/16 v0, 0x2e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۢۢۡ;->۟᩸᩺:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x13872cf3

    sget v9, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v10, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v11, "\u06d6\u073a"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3025

    const v13, 0x481546a7

    xor-int/2addr v12, v13

    const v13, -0x60161506

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x2953

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 5
    sget v11, Ll/۟;->ۗۤۛ:I

    if-eqz v11, :cond_10

    goto/16 :goto_6

    .line 33
    :sswitch_0
    sget v11, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    const-string v11, "\u073d\u0730"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x39

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x625b

    const v13, 0x4bbaf2fe    # 2.4503804E7f

    xor-int/2addr v12, v13

    const v13, -0x62c9ef3f

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v11

    if-nez v11, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_1
    const-string v11, "\u0736\u06e8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x63

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x1db

    const v13, -0x31d5bcec

    xor-int/2addr v12, v13

    const v13, 0x1fb98c9e

    goto :goto_0

    :sswitch_2
    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v11, "\u06d6\u05a1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x31

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x726f

    const v13, -0x787b4463

    xor-int/2addr v12, v13

    const v13, 0x420127e

    goto :goto_0

    .line 0
    :sswitch_3
    :try_start_0
    sget-object v11, Ll/ۢۢۡ;->۟᩸᩺:[S

    const/4 v12, 0x1

    const/16 v13, 0x1e

    invoke-static {v11, v12, v13, v7}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 44
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 45
    sput-boolean v0, Ll/ۖܰۡ;->֫:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v11, "\u073f\u06e8"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x1c59

    const v13, 0x9663590

    xor-int/2addr v12, v13

    const v13, 0x68b30c53

    goto/16 :goto_0

    .line 13
    :sswitch_4
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_5
    mul-int v11, v3, v6

    sub-int/2addr v11, v5

    if-lez v11, :cond_3

    const-string v11, "\u0736\u073f"

    .line 45
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x4c41

    const v13, 0x48dedebb

    xor-int/2addr v12, v13

    const v13, 0x509586fe

    goto/16 :goto_0

    :cond_3
    const-string v11, "\u06d7\u05ab"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x73

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7c89

    const v13, -0x567ce48f

    xor-int/2addr v12, v13

    const v13, -0x5acc6adf

    goto/16 :goto_0

    .line 33
    :sswitch_6
    sget-object v1, Ll/ۢۢۡ;->۟᩸᩺:[S

    const/4 v2, 0x0

    .line 19
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v11

    if-eqz v11, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v11, "\u05ab\u1a79"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x29

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x785f

    const v13, -0x74cccc91

    xor-int/2addr v12, v13

    const v13, 0x554604d7

    goto/16 :goto_0

    .line 13
    :sswitch_7
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v11, Ll/֡᩶;->ܳܶ۠:I

    if-lez v11, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v11, "\u1a73\u06e1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x482b

    const v13, 0x6598535c

    xor-int/2addr v12, v13

    const v13, 0x4aeb75e7    # 7715571.5f

    goto/16 :goto_0

    .line 45
    :sswitch_8
    :try_start_1
    sget-object v11, Ll/ۢۢۡ;->۟᩸᩺:[S

    const/16 v12, 0x1f

    const/16 v13, 0xf

    invoke-static {v11, v12, v13, v7}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v11

    .line 49
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 50
    sput-boolean v0, Ll/ۖܰۡ;->֫:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const-string v11, "\u06d9\u06da"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x345d

    const v13, -0x3fe512ab

    xor-int/2addr v12, v13

    const v13, 0xbcd02fe

    goto/16 :goto_0

    :sswitch_9
    const v7, 0xe25a

    goto/16 :goto_2

    :sswitch_a
    const/4 v0, 0x1

    const-string v11, "\u05a1\u06db"

    .line 45
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x59

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x24a9

    const v13, 0x60875942

    xor-int/2addr v12, v13

    const v13, 0x3ba94690

    goto/16 :goto_0

    .line 13
    :sswitch_b
    sget v11, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v11, :cond_8

    goto/16 :goto_5

    .line 28
    :sswitch_c
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v11, Ll/۟;->ۗۤۛ:I

    if-eqz v11, :cond_c

    goto :goto_3

    .line 47
    :sswitch_d
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v11

    if-lez v11, :cond_f

    goto/16 :goto_5

    :sswitch_e
    mul-int v5, v4, v4

    const v6, 0xe1b4

    .line 28
    sget-boolean v11, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v11, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v11, "\u06e7\u06e1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x47

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x77d3

    const v13, -0x7c77c846

    xor-int/2addr v12, v13

    const v13, 0x23b012f

    goto/16 :goto_0

    .line 1
    :sswitch_f
    aget-short v3, v1, v2

    .line 23
    sget v11, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v11, :cond_7

    goto :goto_4

    :cond_7
    const-string v11, "\u06d9\u1a78"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x35

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x183b

    const v13, -0x50f113ec

    xor-int/2addr v12, v13

    const v13, 0x3966a653

    goto/16 :goto_0

    :sswitch_10
    const/16 v7, 0x57e3

    :goto_2
    const-string v11, "\u1a76\u1a78"

    .line 45
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x49e3

    const v13, 0x353bcf18

    xor-int/2addr v12, v13

    const v13, 0x48f995c7

    goto/16 :goto_0

    :sswitch_11
    return-void

    .line 5
    :sswitch_12
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget-boolean v11, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v11, :cond_a

    :cond_8
    :goto_3
    const-string v11, "\u0730\u06e1"

    .line 13
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x4d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x5e57

    const v13, -0x4e392326

    xor-int/2addr v12, v13

    const v13, 0x3eca908b

    goto/16 :goto_0

    .line 33
    :sswitch_13
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_4

    :cond_9
    const-string v11, "\u1a77\u06eb"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x3733

    const v13, 0x6ae801a0

    xor-int/2addr v12, v13

    const v13, 0x2abb97a0

    goto/16 :goto_0

    .line 17
    :sswitch_14
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    :goto_4
    const-string v11, "\u1a77\u06e4"

    .line 33
    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x7321

    const v13, -0x73d9091f

    xor-int/2addr v12, v13

    const v13, 0x61e95b3d

    goto/16 :goto_0

    :cond_b
    const-string v11, "\u1a7a\u06d8"

    .line 17
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x7

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x7847

    const v13, -0x5d0ce8c9

    xor-int/2addr v12, v13

    const v13, 0x76e4a5f5

    goto/16 :goto_0

    .line 13
    :sswitch_15
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    :goto_5
    const-string v11, "\u1a75\u0733"

    .line 28
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x57

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0xbc5

    const v13, 0x18b146eb

    xor-int/2addr v12, v13

    const v13, 0x19ae9700

    goto/16 :goto_0

    .line 39
    :sswitch_16
    sget v11, Ll/۟;->ۗۤۛ:I

    if-eqz v11, :cond_d

    :cond_c
    const-string v11, "\u06e1\u06d9"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x11

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x620d

    const v13, 0x17a5ec53

    xor-int/2addr v12, v13

    const v13, 0xabc57b0

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u06d8\u05a1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x4a85

    const v13, 0x33a95e96

    xor-int/2addr v12, v13

    const v13, 0x3ca92119

    goto/16 :goto_0

    :sswitch_17
    add-int/lit16 v4, v3, 0x386d

    .line 1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v11

    if-nez v11, :cond_e

    const-string v11, "\u1a76\u05a8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2175

    const v13, -0x1f95ae8c

    xor-int/2addr v12, v13

    const v13, 0x49bb8e2a    # 1536453.2f

    goto/16 :goto_0

    :cond_e
    const-string v11, "\u06d9\u1a79"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x5c23

    const v13, -0x118abf64

    xor-int/2addr v12, v13

    const v13, 0x185e9ac4

    goto/16 :goto_0

    :cond_f
    :goto_6
    const-string v11, "\u0730\u05a1"

    .line 19
    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x3b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x4fa9

    const v13, -0x4e1bef4b

    xor-int/2addr v12, v13

    const v13, 0x675fbc8a

    goto/16 :goto_0

    :cond_10
    const-string v11, "\u05ab\u06e2"

    .line 17
    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x35

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x5b71

    const v13, -0x79eb8110

    xor-int/2addr v12, v13

    const v13, 0x218186fb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ca8a409 -> :sswitch_17
        -0x7b42b022 -> :sswitch_16
        -0x6b92c81e -> :sswitch_15
        -0x692a47d0 -> :sswitch_14
        -0x64f74177 -> :sswitch_14
        -0x612e8357 -> :sswitch_13
        -0x5ebc7803 -> :sswitch_12
        -0x5dc38a98 -> :sswitch_13
        -0x5b3a900c -> :sswitch_11
        -0x592b0dfc -> :sswitch_10
        -0x549b79a1 -> :sswitch_f
        -0x5429ca0c -> :sswitch_11
        -0x48a93dd1 -> :sswitch_e
        -0x311d29a5 -> :sswitch_d
        -0x29b60d8e -> :sswitch_c
        -0x1a1f06fe -> :sswitch_b
        -0x180d92d2 -> :sswitch_a
        -0x1043eddf -> :sswitch_e
        -0x3c4cbe2 -> :sswitch_16
        -0x6229e4 -> :sswitch_9
        0x84883a6 -> :sswitch_c
        0x9592677 -> :sswitch_8
        0xfce73b1 -> :sswitch_7
        0x1c2b5638 -> :sswitch_6
        0x25dacbaa -> :sswitch_5
        0x28527a75 -> :sswitch_12
        0x2fa59572 -> :sswitch_4
        0x30e187f5 -> :sswitch_6
        0x3149cbff -> :sswitch_3
        0x38cba686 -> :sswitch_5
        0x3e60d49d -> :sswitch_7
        0x403d03d0 -> :sswitch_f
        0x4531bef7 -> :sswitch_10
        0x458898d3 -> :sswitch_2
        0x4a19092e -> :sswitch_8
        0x4b526159 -> :sswitch_2
        0x4da480e7 -> :sswitch_15
        0x5c6cdc0e -> :sswitch_1
        0x5d43357d -> :sswitch_0
        0x654385c3 -> :sswitch_4
        0x65b562b6 -> :sswitch_b
        0x661f546f -> :sswitch_d
        0x6acca52d -> :sswitch_1
        0x6f106616 -> :sswitch_17
        0x6fbcbd1e -> :sswitch_0
        0x797e6da8 -> :sswitch_9
        0x7b2b3d7a -> :sswitch_a
        0x7f6a3d59 -> :sswitch_3
    .end sparse-switch

    :array_0
    .array-data 2
        0x1e5cs
        0x5780s
        0x578cs
        0x578es
        0x57cds
        0x5780s
        0x5782s
        0x578es
        0x5786s
        0x578fs
        0x57cds
        0x5791s
        0x5796s
        0x578ds
        0x5797s
        0x578as
        0x578es
        0x5786s
        0x57cds
        0x57ads
        0x5782s
        0x5797s
        0x578as
        0x5795s
        0x5786s
        0x57a6s
        0x578ds
        0x5784s
        0x578as
        0x578ds
        0x5786s
        0x578es
        0x5797s
        0x579bs
        0x57cds
        0x57ads
        0x5782s
        0x5797s
        0x578as
        0x5795s
        0x5786s
        0x57a4s
        0x5796s
        0x5782s
        0x5791s
        0x5787s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x80839d6

    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    const/4 v3, 0x0

    .line 87
    invoke-direct {p0, p1, p2, v3}, Ll/ۢۢۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u073a\u05a8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2523

    const v3, 0x54c58473

    xor-int/2addr p2, v3

    const v3, -0x6da65cd7

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x2173

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 79
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget p1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz p1, :cond_2

    goto :goto_1

    .line 33
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget p1, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06dc\u05a1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x7b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x45cf

    const v3, 0x3a2df28f

    xor-int/2addr p2, v3

    const v3, -0x424383a1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget p1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u0730\u06d7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7a15

    const v3, -0x59118ffb

    xor-int/2addr p2, v3

    const v3, -0x3473e81

    goto :goto_0

    :cond_2
    const-string p1, "\u1a7b\u0733"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x2f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x4c41

    const v3, -0x4e15684b

    xor-int/2addr p2, v3

    const v3, 0x18e8801c    # 6.009995E-24f

    goto :goto_0

    .line 77
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    :goto_1
    const-string p1, "\u06da\u073a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1c87

    const v3, -0x3737be21

    xor-int/2addr p2, v3

    const v3, -0xb2abb76

    goto :goto_0

    .line 37
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz p1, :cond_3

    const-string p1, "\u06d7\u06d7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x50c9

    const v3, -0x61465db0

    xor-int/2addr p2, v3

    const v3, 0x2d9da1d1

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a73\u05a1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x10a7

    const v3, 0x5e18c92e

    xor-int/2addr p2, v3

    const v3, -0x6378708b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x759b99ed -> :sswitch_1
        -0x4fdfe111 -> :sswitch_5
        -0x4471bb88 -> :sswitch_1
        -0x43884f8f -> :sswitch_5
        -0x4102116d -> :sswitch_4
        -0x331c6160 -> :sswitch_0
        0x1f745bd -> :sswitch_3
        0xfe42359 -> :sswitch_0
        0x19838ef4 -> :sswitch_4
        0x47cd817b -> :sswitch_3
        0x4b47b2ac -> :sswitch_2
        0x6fa15f00 -> :sswitch_2
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x345e5bad

    sget v9, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v10, Ll/֡᩺;->ᩴ᩹ۛ:I

    .line 112
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "\u05a1\u1a76"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x6eef

    const v11, -0x40765f6c

    xor-int/2addr p3, v11

    const v11, -0x60559106

    :goto_0
    xor-int/2addr p2, v11

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0x6c53

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr p3, v8

    xor-int v8, p2, p3

    sparse-switch v8, :sswitch_data_0

    .line 235
    iput v4, p0, Ll/ۢۢۡ;->ܺ֫:I

    .line 113
    invoke-virtual {p0, v2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 114
    invoke-virtual {p0, v2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 115
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1a

    if-lt p2, p3, :cond_7

    const-string p2, "\u073f\u1a77"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x2d47

    const v11, 0x13048235

    xor-int/2addr p3, v11

    const v11, -0x4aa35e1a

    goto :goto_0

    .line 119
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget p2, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz p2, :cond_d

    goto/16 :goto_8

    .line 70
    :sswitch_1
    sget p2, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez p2, :cond_2

    goto/16 :goto_6

    .line 192
    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget p2, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez p2, :cond_b

    goto/16 :goto_8

    .line 116
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_8

    .line 157
    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 149
    :sswitch_5
    new-instance p2, Ll/᩷ۢۡ;

    invoke-direct {p2, p0}, Ll/᩷ۢۡ;-><init>(Ll/ۢۢۡ;)V

    invoke-virtual {p0, p2}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_2

    .line 155
    :sswitch_6
    iput v7, p0, Ll/ۢۢۡ;->ۛ:F

    .line 158
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ۢۢۡ;->ۡ֫:I

    return-void

    :sswitch_7
    mul-float p2, v5, v6

    .line 154
    iput p2, p0, Ll/ۢۢۡ;->ۨ:F

    const/high16 p2, 0x42400000    # 48.0f

    mul-float v7, v5, p2

    sget p2, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz p2, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string p2, "\u0736\u073f"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v10, p2

    mul-int/lit8 p2, p2, 0x17

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x3aff

    const v11, -0x512b6a82

    xor-int/2addr p3, v11

    const v11, -0x2bd882ef

    goto/16 :goto_0

    :sswitch_8
    const p2, 0x39777777

    .line 153
    iput p2, p0, Ll/ۢۢۡ;->᩺:I

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const-string p2, "\u0733\u05a8"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x1571

    const v11, 0x66245982

    xor-int/2addr p3, v11

    const v11, -0x65ea849d

    goto/16 :goto_0

    :sswitch_9
    const p2, -0x22888889

    .line 152
    iput p2, p0, Ll/ۢۢۡ;->ۤ:I

    .line 54
    sget p2, Ll/֡֡;->֫ۤܳ:I

    if-ltz p2, :cond_3

    :cond_2
    :goto_1
    const-string p2, "\u0736\u1a77"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x1e23

    const v11, -0x5a2b9d8d

    xor-int/2addr p3, v11

    const v11, -0x3b495b4

    goto/16 :goto_0

    :cond_3
    const-string p2, "\u0736\u06eb"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x39db

    const v11, -0x133dee01

    xor-int/2addr p3, v11

    const v11, 0x2df4b535

    goto/16 :goto_0

    .line 150
    :sswitch_a
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    .line 151
    iget v5, p2, Landroid/util/DisplayMetrics;->density:F

    sget p2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz p2, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string p2, "\u06d6\u1a78"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x2527

    const v11, -0x374c34f0    # -368216.5f

    xor-int/2addr p3, v11

    const v11, -0x37e82aa7

    goto/16 :goto_0

    .line 208
    :sswitch_b
    iput-boolean v4, p0, Ll/ۢۢۡ;->ᩳ֫:Z

    goto :goto_3

    .line 147
    :sswitch_c
    invoke-super {p0, v2}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 148
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-nez p2, :cond_5

    const-string p2, "\u06eb\u06d9"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x1ff1

    const v11, 0x5320a05c

    xor-int/2addr p3, v11

    const v11, 0x137426c9

    goto/16 :goto_0

    :cond_5
    :goto_2
    const-string p2, "\u0736\u06d9"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x41ad

    const v11, -0x1870813b

    xor-int/2addr p3, v11

    const v11, -0x36182cd4    # -1899109.5f

    goto/16 :goto_0

    .line 116
    :sswitch_d
    invoke-virtual {p0, v2}, Landroid/widget/ListView;->setDefaultFocusHighlightEnabled(Z)V

    goto :goto_4

    .line 118
    :sswitch_e
    new-instance p2, Ll/ܳۢۡ;

    invoke-direct {p2, p0}, Ll/ܳۢۡ;-><init>(Ll/ۢۢۡ;)V

    invoke-super {p0, p2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 144
    invoke-super {p0}, Landroid/widget/ListView;->isFastScrollEnabled()Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "\u06da\u06dc"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x153f

    const v11, 0x295c3aec

    xor-int/2addr p3, v11

    const v11, -0x6c0a052f

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string p2, "\u1a7b\u06e8"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    mul-int/lit8 p2, p2, 0x39

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x805

    const v11, -0x4905c28d

    xor-int/2addr p3, v11

    const v11, 0x20e5667d

    goto/16 :goto_0

    :cond_7
    :goto_4
    const-string p2, "\u0730\u1a73"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v9

    mul-int/lit8 p2, p2, 0xd

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x929

    const v11, 0x6ed89bdf

    xor-int/2addr p3, v11

    const v11, 0x3558026

    goto/16 :goto_0

    .line 211
    :sswitch_f
    iput-object v3, p0, Ll/ۢۢۡ;->᩹:Landroid/database/DataSetObserver;

    const/4 v4, 0x1

    sget p2, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz p2, :cond_8

    goto :goto_5

    :cond_8
    const-string p2, "\u1a73\u1a73"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0x51

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0x14e5

    const v11, -0x734522ab

    xor-int/2addr p3, v11

    const v11, 0x1f06fee3

    goto/16 :goto_0

    .line 161
    :sswitch_10
    iput-wide v0, p0, Ll/ۢۢۡ;->᩶:J

    .line 211
    new-instance v3, Ll/᩻ۢۡ;

    invoke-direct {v3, p0}, Ll/᩻ۢۡ;-><init>(Ll/ۢۢۡ;)V

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result p2

    if-ltz p2, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string p2, "\u05a8\u06e0"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    mul-int/lit8 p2, p2, 0xd

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x1df7

    const v11, 0x12dfcad0

    xor-int/2addr p3, v11

    const v11, 0x177eb8f0

    goto/16 :goto_0

    :sswitch_11
    const/4 v2, 0x0

    .line 79
    iput-boolean v2, p0, Ll/ۢۢۡ;->ܰ:Z

    .line 110
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result p2

    if-gtz p2, :cond_a

    :goto_5
    const-string p2, "\u06db\u06e2"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v9, p2

    mul-int/lit8 p2, p2, -0x27

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x3dd

    const v11, -0x3797cfd3

    xor-int/2addr p3, v11

    const v11, -0x6918dd1d

    goto/16 :goto_0

    :cond_a
    const-string p2, "\u073a\u06e7"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, 0x26cd

    const v11, 0x4ecc09f4

    xor-int/2addr p3, v11

    const v11, -0x2db0e89c

    goto/16 :goto_0

    .line 76
    :sswitch_12
    new-instance p2, Ll/ۜۢۡ;

    invoke-direct {p2, p0}, Ll/ۜۢۡ;-><init>(Ll/ۢۢۡ;)V

    iput-object p2, p0, Ll/ۢۢۡ;->ܽ֫:Ll/ۜۢۡ;

    .line 195
    sget p2, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p2, :cond_c

    :cond_b
    :goto_6
    const-string p2, "\u06e7\u06d6"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v10

    mul-int/lit8 p2, p2, -0x2d

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, -0xb4b

    const v11, -0x315a0e00

    xor-int/2addr p3, v11

    const v11, 0x57cc458e

    goto/16 :goto_0

    :cond_c
    const-string p2, "\u05a8\u0730"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x44f1

    const v11, 0x6c977de0

    xor-int/2addr p3, v11

    const v11, -0xebe0f59

    goto/16 :goto_0

    :sswitch_13
    const-wide/16 v0, 0x0

    .line 69
    iput-wide v0, p0, Ll/ۢۢۡ;->᩷֫:J

    .line 73
    new-instance p2, Ll/ܳ᩸ۡ;

    const/4 p3, 0x3

    .line 94
    sget v11, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v11, :cond_e

    :cond_d
    :goto_7
    const-string p2, "\u06dc\u1a76"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v10

    xor-int p3, p2, v9

    mul-int/lit16 p3, p3, 0x19a5

    const v11, 0x583a8366

    xor-int/2addr p3, v11

    const v11, 0x5621742b

    goto/16 :goto_0

    .line 20
    :cond_e
    invoke-direct {p2, p3}, Ll/ܳ᩸ۡ;-><init>(I)V

    .line 73
    iput-object p2, p0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    .line 97
    sget p2, Ll/ۗ᩵;->֫۠۟:I

    if-ltz p2, :cond_f

    :goto_8
    const-string p2, "\u05ab\u06e7"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v9

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x4819

    const v11, 0x6e83bed9

    xor-int/2addr p3, v11

    const v11, -0x249440f

    goto/16 :goto_0

    :cond_f
    const-string p2, "\u06d7\u06e8"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v9

    mul-int/lit8 p2, p2, 0x21

    xor-int p3, p2, v10

    mul-int/lit16 p3, p3, -0x7d91

    const v11, 0x686c541d

    xor-int/2addr p3, v11

    const v11, 0x245759f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e89f218 -> :sswitch_2
        -0x7993aa42 -> :sswitch_10
        -0x70161e47 -> :sswitch_4
        -0x64590729 -> :sswitch_c
        -0x63cb60f4 -> :sswitch_9
        -0x62c41e66 -> :sswitch_5
        -0x5c44b6a3 -> :sswitch_8
        -0x5797cb86 -> :sswitch_2
        -0x566a56a6 -> :sswitch_4
        -0x53c222f6 -> :sswitch_3
        -0x47abb54d -> :sswitch_0
        -0x451894a8 -> :sswitch_6
        -0x40388a37 -> :sswitch_c
        -0x38297a5c -> :sswitch_b
        -0x31c9c47f -> :sswitch_7
        -0x27917ed4 -> :sswitch_1
        -0x250eee49 -> :sswitch_12
        -0x2415fe46 -> :sswitch_1
        -0x13cb1b45 -> :sswitch_f
        -0xe09ece6 -> :sswitch_5
        -0x14e40b4 -> :sswitch_e
        0x11e5bc12 -> :sswitch_13
        0x1654a985 -> :sswitch_3
        0x1aa68872 -> :sswitch_7
        0x1d21e19d -> :sswitch_6
        0x283ad0b7 -> :sswitch_13
        0x2d750511 -> :sswitch_f
        0x3550fd11 -> :sswitch_10
        0x3b1340e3 -> :sswitch_d
        0x42660950 -> :sswitch_11
        0x427a9c3c -> :sswitch_a
        0x45620914 -> :sswitch_9
        0x468e7f14 -> :sswitch_e
        0x47a82f52 -> :sswitch_a
        0x4a74c3d0 -> :sswitch_b
        0x4ada6719 -> :sswitch_8
        0x4bd8c7f4 -> :sswitch_d
        0x5c70e751 -> :sswitch_12
        0x60861619 -> :sswitch_0
        0x7f0e5c32 -> :sswitch_11
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/ۢۢۡ;)Ll/ۜۢۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢۡ;->ܽ֫:Ll/ۜۢۡ;

    return-object p0
.end method

.method private ֫(Landroid/view/MotionEvent;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0x10618627

    sget v7, Ll/֡۬;->۠֡᩶:I

    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v9, "\u073d\u06eb"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x3f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3951

    const v11, 0x4e632397    # 9.5269011E8f

    xor-int/2addr v10, v11

    const v11, -0x69eb363a

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x1f8b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    sget v9, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v9, :cond_4

    goto :goto_2

    .line 26
    :sswitch_0
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget v9, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v9, :cond_c

    goto :goto_2

    .line 337
    :sswitch_1
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v9

    if-nez v9, :cond_1

    goto/16 :goto_4

    .line 130
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_4

    .line 338
    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    return-void

    .line 429
    :sswitch_4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    invoke-interface {v9, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 423
    :sswitch_6
    iget v9, p0, Ll/ۢۢۡ;->۫:I

    invoke-virtual {v3, v2, v9}, Ll/۬ۧ֫;->֫(II)V

    goto/16 :goto_3

    .line 427
    :sswitch_7
    invoke-static {p0}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    .line 428
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    if-eqz v9, :cond_0

    const-string v9, "\u06df\u06db"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x78df

    const v11, 0x12b91d0f

    xor-int/2addr v10, v11

    const v11, -0x10ebc861

    goto :goto_0

    :cond_0
    :goto_1
    const-string v9, "\u06ec\u05a8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x51

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6e81

    const v11, -0x72db26db

    xor-int/2addr v10, v11

    const v11, -0x75f71539

    goto :goto_0

    .line 426
    :sswitch_8
    invoke-static {}, Ll/ۗۚ;->ᩴۧ᩺()J

    move-result-wide v9

    iput-wide v9, p0, Ll/ۢۢۡ;->᩷֫:J

    .line 186
    sget v9, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v9, :cond_2

    :cond_1
    :goto_2
    const-string v9, "\u1a7a\u06eb"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x35

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4d2d

    const v11, -0x4162775c

    xor-int/2addr v10, v11

    const v11, -0x6589ade5

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u06e7\u073d"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x35a1

    const v11, -0x11bf35f

    xor-int/2addr v10, v11

    const v11, 0x6dd5fa13

    goto/16 :goto_0

    :sswitch_9
    sub-float v9, v4, v5

    .line 425
    iput v9, p0, Ll/ۢۢۡ;->ۖ֫:F

    .line 136
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v9

    if-gtz v9, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v9, "\u1a7b\u1a78"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x9

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3dd7

    const v11, -0x74c1595f

    xor-int/2addr v10, v11

    const v11, -0x11685c27

    goto/16 :goto_0

    .line 425
    :sswitch_a
    iget v5, p0, Ll/ۢۢۡ;->ۗ:F

    .line 198
    sget v9, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v9, :cond_5

    :cond_4
    const-string v9, "\u06d6\u1a73"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7a15

    const v11, 0x193a861

    xor-int/2addr v10, v11

    const v11, -0x42226dc9

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u073f\u06d6"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6251

    const v11, 0xed80bc1

    xor-int/2addr v10, v11

    const v11, 0xfd1dc04

    goto/16 :goto_0

    .line 425
    :sswitch_b
    iget-object v4, p0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    iget v4, v4, Ll/ܳ᩸ۡ;->ܿ:F

    sget-boolean v9, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v9, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v9, "\u0733\u06e0"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x69

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4fb

    const v11, -0x55366bc2

    xor-int/2addr v10, v11

    const v11, -0xe71ee48

    goto/16 :goto_0

    :sswitch_c
    const/4 v2, 0x1

    .line 421
    iput-boolean v2, p0, Ll/ۢۢۡ;->ᩴ֫:Z

    .line 422
    iget-object v3, p0, Ll/ۢۢۡ;->۬:Ll/۬ۧ֫;

    if-eqz v3, :cond_7

    const-string v9, "\u06ec\u06d7"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x55d1

    const v11, -0x3309948c

    xor-int/2addr v10, v11

    const v11, -0x59c7c978

    goto/16 :goto_0

    :cond_7
    :goto_3
    const-string v9, "\u1a76\u1a75"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x28a3

    const v11, -0x758d4b17

    xor-int/2addr v10, v11

    const v11, -0x295b4dbb

    goto/16 :goto_0

    .line 420
    :sswitch_d
    iput-boolean v1, p0, Ll/ۢۢۡ;->ۜ֫:Z

    sget-boolean v9, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v9, :cond_8

    :goto_4
    const-string v9, "\u1a74\u05ab"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x33cd

    const v11, 0x393267cc

    xor-int/2addr v10, v11

    const v11, -0xfb8e7f3

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06df\u0730"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x1b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7d99

    const v11, -0x62902c35

    xor-int/2addr v10, v11

    const v11, 0x6a0e678f

    goto/16 :goto_0

    .line 419
    :sswitch_e
    invoke-direct {p0, p1}, Ll/ۢۢۡ;->ۧ(Landroid/view/MotionEvent;)V

    const/4 v1, 0x0

    .line 413
    sget v9, Ll/֡۬;->۠֡᩶:I

    if-gtz v9, :cond_9

    goto :goto_5

    :cond_9
    const-string v9, "\u06e4\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x813

    const v11, -0x27f1d56a

    xor-int/2addr v10, v11

    const v11, 0xea31b62

    goto/16 :goto_0

    .line 418
    :sswitch_f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v9

    iput v9, p0, Ll/ۢۢۡ;->ۗ:F

    .line 378
    sget v9, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v9, :cond_a

    goto :goto_6

    :cond_a
    const-string v9, "\u1a73\u06e2"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3ecf

    const v11, -0x2ca8ef79

    xor-int/2addr v10, v11

    const v11, -0x4c827108

    goto/16 :goto_0

    .line 417
    :sswitch_10
    iput v0, p0, Ll/ۢۢۡ;->ۙ:F

    .line 10
    sget v9, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v9, :cond_b

    goto :goto_5

    :cond_b
    const-string v9, "\u06e7\u06dc"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x539f

    const v11, 0x334ebf63

    xor-int/2addr v10, v11

    const v11, -0x4309b087

    goto/16 :goto_0

    .line 417
    :sswitch_11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 397
    sget v9, Ll/۟;->ۗۤۛ:I

    if-eqz v9, :cond_d

    :cond_c
    :goto_5
    const-string v9, "\u0733\u1a79"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x31

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0xd75

    const v11, -0x1bfc832

    xor-int/2addr v10, v11

    const v11, -0x7d92c48

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06dc\u06e8"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x57

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x72af

    const v11, -0x2ff19da1

    xor-int/2addr v10, v11

    const v11, 0x70d33063

    goto/16 :goto_0

    :sswitch_12
    sget v9, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v9, :cond_e

    :goto_6
    const-string v9, "\u1a7a\u06dc"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x69

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7607

    const v11, -0x10f4b51

    xor-int/2addr v10, v11

    const v11, 0xd36164f

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06df\u05a8"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0xf

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7ee9

    const v11, 0xec81f7

    xor-int/2addr v10, v11

    const v11, -0x469178d8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ab6f6ff -> :sswitch_12
        -0x7a2d3e61 -> :sswitch_1
        -0x78b1ea45 -> :sswitch_1
        -0x68bd088c -> :sswitch_5
        -0x5f2672a8 -> :sswitch_9
        -0x5e548ecb -> :sswitch_d
        -0x5be22f53 -> :sswitch_f
        -0x5b1853f8 -> :sswitch_11
        -0x5ac9c095 -> :sswitch_0
        -0x412c571e -> :sswitch_6
        -0x3d226ef2 -> :sswitch_7
        -0x3651ce54 -> :sswitch_a
        -0x2f4d894b -> :sswitch_8
        -0x17509d45 -> :sswitch_3
        -0xef48695 -> :sswitch_8
        -0x8c3e78a -> :sswitch_10
        -0x7e4a44a -> :sswitch_11
        -0x10b4e79 -> :sswitch_6
        0x1b380d1 -> :sswitch_4
        0xbed9e37 -> :sswitch_0
        0x11ff7d4e -> :sswitch_e
        0x1492ae6c -> :sswitch_2
        0x1596c2a9 -> :sswitch_c
        0x1c76021c -> :sswitch_e
        0x29a5da30 -> :sswitch_3
        0x3528527f -> :sswitch_c
        0x397c653d -> :sswitch_d
        0x3d44b619 -> :sswitch_b
        0x3dfeb24b -> :sswitch_10
        0x401c5a68 -> :sswitch_4
        0x4a1e100a -> :sswitch_9
        0x4bbc11a9 -> :sswitch_a
        0x4be7adaf -> :sswitch_f
        0x59abf6a5 -> :sswitch_2
        0x6335e9c9 -> :sswitch_5
        0x6cc312cc -> :sswitch_12
        0x6eec67cb -> :sswitch_7
        0x79af4ad1 -> :sswitch_b
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/ۢۢۡ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۢۢۡ;->۟:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢۢۡ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ۢۢۡ;->ܰ:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ۢۢۡ;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x1b3a395d

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v5, "\u1a79\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2ef3

    const v7, 0x6e7e4dcf

    xor-int/2addr v6, v7

    const v7, 0x450c1da1

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x4c45

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 753
    iget-object v0, p0, Ll/ۢۢۡ;->᩸:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_2

    const-string v5, "\u1a7b\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xdfb

    const v7, 0x2647a66f

    xor-int/2addr v6, v7

    const v7, -0x13fe7aa7

    goto :goto_0

    .line 359
    :sswitch_0
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v5, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v5

    if-gez v5, :cond_b

    goto/16 :goto_6

    .line 560
    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-gez v5, :cond_e

    goto/16 :goto_2

    .line 175
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto/16 :goto_2

    .line 409
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    .line 757
    :sswitch_6
    invoke-static {v1}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    .line 758
    invoke-interface {v5, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u1a76\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x40df

    const v7, -0x1f0a05e7

    xor-int/2addr v6, v7

    const v7, 0x71c28e25

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x0

    return p0

    .line 757
    :sswitch_8
    invoke-static {v1}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u0736\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1871

    const v7, -0x6c4fab65

    xor-int/2addr v6, v7

    const v7, 0x151cf4f5

    goto/16 :goto_0

    :cond_0
    const-string v5, "\u05ab\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x23f

    const v7, -0x13c798db

    xor-int/2addr v6, v7

    const v7, 0x3f082d7e

    goto/16 :goto_0

    .line 755
    :sswitch_9
    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 757
    :sswitch_a
    iget-object v1, p0, Ll/ۢۢۡ;->ۘ֫:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    const-string v5, "\u06e2\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x19

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1bd5

    const v7, -0x72f2c401

    xor-int/2addr v6, v7

    const v7, -0xa3bde8b

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v5, "\u06e0\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x431b

    const v7, 0x2c092254

    xor-int/2addr v6, v7

    const v7, 0x2c1c9e1a

    goto/16 :goto_0

    .line 59
    :sswitch_b
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u1a76\u06d8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3565

    const v7, 0x4ca99a5c    # 8.89208E7f

    xor-int/2addr v6, v7

    const v7, -0x292a5f53

    goto/16 :goto_0

    .line 747
    :sswitch_c
    sget-boolean v5, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v5, :cond_4

    :goto_2
    const-string v5, "\u06d7\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7849

    const v7, -0x4c2dda0b

    xor-int/2addr v6, v7

    const v7, -0x47edc685

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u0730\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x25

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x31f7

    const v7, 0x1b02ef3b

    xor-int/2addr v6, v7

    const v7, -0x4f75d0b8

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06dc\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x23cb

    const v7, 0xf96558c

    xor-int/2addr v6, v7

    const v7, 0x4030b72b

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u073f\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3853

    const v7, -0x6d8f335d

    xor-int/2addr v6, v7

    const v7, -0x5e24c30b

    goto/16 :goto_0

    .line 284
    :sswitch_f
    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u1a76\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x691

    const v7, 0x73dc6e26

    xor-int/2addr v6, v7

    const v7, -0x5992126f

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06e0\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6449

    const v7, -0x23378106

    xor-int/2addr v6, v7

    const v7, -0x5c15aa9c

    goto/16 :goto_0

    .line 117
    :sswitch_11
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a7b\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4945

    const v7, -0x9378eee

    xor-int/2addr v6, v7

    const v7, 0x28bcbe3b

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06dc\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x435f

    const v7, 0x1dc53a66

    xor-int/2addr v6, v7

    const v7, 0x509bfdc5

    goto/16 :goto_0

    .line 336
    :sswitch_12
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u1a7a\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2527

    const v7, -0x2f19e15e

    xor-int/2addr v6, v7

    const v7, 0x231f086c

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a73\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xc25

    const v7, -0x3763ad0e

    xor-int/2addr v6, v7

    const v7, -0x5a07883c

    goto/16 :goto_0

    :sswitch_13
    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_d

    :goto_5
    const-string v5, "\u073d\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2d2d

    const v7, 0x42856163

    xor-int/2addr v6, v7

    const v7, -0xf7dc87a    # -3.224014E29f

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06db\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4e25

    const v7, -0x637ec809

    xor-int/2addr v6, v7

    const v7, 0x6a814ed0

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v5

    if-gtz v5, :cond_f

    :cond_e
    :goto_6
    const-string v5, "\u0736\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4331

    const v7, -0x2f76c24c

    xor-int/2addr v6, v7

    const v7, 0x4ef7d71e

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06d6\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x251f

    const v7, 0x6f8a343

    xor-int/2addr v6, v7

    const v7, -0x1a5a7dbc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71dd1a99 -> :sswitch_3
        -0x71124065 -> :sswitch_8
        -0x709466ab -> :sswitch_10
        -0x6eaa903a -> :sswitch_11
        -0x65d38f81 -> :sswitch_14
        -0x5c3557ab -> :sswitch_8
        -0x56b7d8d5 -> :sswitch_0
        -0x5531d803 -> :sswitch_5
        -0x4955f17c -> :sswitch_12
        -0x4570a457 -> :sswitch_c
        -0x37288948 -> :sswitch_13
        -0x35c0a70b -> :sswitch_6
        -0x236eb303 -> :sswitch_e
        -0x166da4c1 -> :sswitch_1
        -0x1002bddf -> :sswitch_5
        -0xd644fb5 -> :sswitch_e
        -0xd5ab499 -> :sswitch_2
        -0xcc0ebe3 -> :sswitch_a
        -0xa217692 -> :sswitch_c
        -0x8b5e69f -> :sswitch_10
        -0xef6ffe -> :sswitch_b
        0x64a5989 -> :sswitch_7
        0x110f90ef -> :sswitch_11
        0x21950a33 -> :sswitch_4
        0x22ea8ea8 -> :sswitch_b
        0x24446756 -> :sswitch_a
        0x2819eb0d -> :sswitch_f
        0x2fa186cf -> :sswitch_0
        0x3386ab78 -> :sswitch_3
        0x4a230f0a -> :sswitch_1
        0x550fc854 -> :sswitch_4
        0x57374338 -> :sswitch_6
        0x5959f1d1 -> :sswitch_7
        0x5c82e2d9 -> :sswitch_12
        0x608df534 -> :sswitch_14
        0x68444cf7 -> :sswitch_9
        0x6a00b4af -> :sswitch_9
        0x6c90e3f9 -> :sswitch_13
        0x72538525 -> :sswitch_f
        0x7906f6f4 -> :sswitch_d
        0x7b1f09fd -> :sswitch_2
        0x7ef88d8b -> :sswitch_d
    .end sparse-switch
.end method

.method public static ֫(Ll/ۢۢۡ;Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x1c57a879

    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    sget v7, Ll/֡۬;->۠֡᩶:I

    const-string v8, "\u06e7\u06e0"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x59

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x8b

    const v10, -0x4e147978

    xor-int/2addr v9, v10

    const v10, -0x2e7fea8a

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x1dab

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v8

    if-eqz v8, :cond_9

    goto/16 :goto_5

    .line 259
    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v8

    if-gtz v8, :cond_4

    goto :goto_1

    .line 90
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v8, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v8, :cond_c

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    :goto_1
    const-string v8, "\u06e7\u0733"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x73

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3b15

    const v10, -0x40340fcd

    xor-int/2addr v9, v10

    const v10, 0x7cbbacd2

    goto :goto_0

    .line 376
    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    const/4 v0, 0x0

    return v0

    .line 384
    :sswitch_4
    iput-boolean v3, v0, Ll/ۢۢۡ;->ܿ֫:Z

    .line 385
    iput-boolean v2, v0, Ll/ۢۢۡ;->ۜ֫:Z

    goto :goto_2

    :sswitch_5
    return v4

    :sswitch_6
    const/4 v4, 0x1

    goto :goto_3

    :sswitch_7
    if-eqz v4, :cond_0

    const-string v8, "\u06df\u06d7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x7b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5d5f

    const v10, -0x139ae09f

    xor-int/2addr v9, v10

    const v10, 0x6ab2f481

    goto :goto_0

    :cond_0
    :goto_2
    const-string v8, "\u073d\u06ec"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x65

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x649b

    const v10, -0x2415ace

    xor-int/2addr v9, v10

    const v10, -0x55492bf4

    goto :goto_0

    :sswitch_8
    move-object v10, v1

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    move-wide/from16 v14, p4

    .line 590
    invoke-interface/range {v10 .. v15}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "\u1a73\u1a73"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x69

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4d6b

    const v10, -0x11fcb426

    xor-int/2addr v9, v10

    const v10, -0x31932d23

    goto/16 :goto_0

    :sswitch_9
    const/4 v4, 0x0

    :goto_3
    const-string v8, "\u06ec\u06e1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2faf

    const v10, -0x2d48c4b6

    xor-int/2addr v9, v10

    const v10, 0x61b77223

    goto/16 :goto_0

    .line 589
    :sswitch_a
    iget-object v1, v0, Ll/ۢۢۡ;->ܳ֫:Landroid/widget/AdapterView$OnItemLongClickListener;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    const-string v8, "\u06d6\u06e4"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3ef1

    const v10, 0x5cadf5ed

    xor-int/2addr v9, v10

    const v10, -0x3dc00d24

    goto/16 :goto_0

    :cond_1
    const-string v8, "\u06d8\u0730"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x22bd

    const v10, -0x2f17df00

    xor-int/2addr v9, v10

    const v10, -0x8ff6b85

    goto/16 :goto_0

    .line 559
    :sswitch_b
    sget-boolean v8, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v8, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v8, "\u06d7\u1a73"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x62bb

    const v10, -0x5f0744b

    xor-int/2addr v9, v10

    const v10, -0x3af8f862

    goto/16 :goto_0

    .line 454
    :sswitch_c
    sget v8, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v8, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v8, "\u06dc\u073d"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4ced

    const v10, 0x5b740dc9

    xor-int/2addr v9, v10

    const v10, -0x14be817f

    goto/16 :goto_0

    .line 156
    :sswitch_d
    sget v8, Ll/֡۬;->۠֡᩶:I

    if-gtz v8, :cond_5

    :cond_4
    const-string v8, "\u06d7\u1a76"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x69

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x297d

    const v10, 0x48cd3a63

    xor-int/2addr v9, v10

    const v10, 0x6c509236

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u06e7\u06e2"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x33

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0xb29

    const v10, -0x53f17520

    xor-int/2addr v9, v10

    const v10, -0x3c7f0afa

    goto/16 :goto_0

    .line 131
    :sswitch_e
    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v8, :cond_6

    goto :goto_4

    :cond_6
    const-string v8, "\u05a8\u06e1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x4d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x144f

    const v10, 0x2750af8b

    xor-int/2addr v9, v10

    const v10, -0x3b65573d

    goto/16 :goto_0

    .line 454
    :sswitch_f
    sget-boolean v8, Ll/֨۫;->۬᩷᩶:Z

    if-nez v8, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v8, "\u1a77\u06dc"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x2f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4801

    const v10, -0x50ce1261

    xor-int/2addr v9, v10

    const v10, -0x45cd2e

    goto/16 :goto_0

    .line 373
    :sswitch_10
    sget v8, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v8, :cond_8

    goto :goto_4

    :cond_8
    const-string v8, "\u1a7a\u073a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x6f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7ad5

    const v10, 0x1fb7fcb9

    xor-int/2addr v9, v10

    const v10, 0x5a72ff1c

    goto/16 :goto_0

    .line 93
    :sswitch_11
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v8

    if-ltz v8, :cond_a

    :cond_9
    :goto_4
    const-string v8, "\u073d\u073a"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x79

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3779

    const v10, -0x77b8687d

    xor-int/2addr v9, v10

    const v10, 0x4062b7e4

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06e2\u05ab"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x19bb

    const v10, 0x14cdec1c

    xor-int/2addr v9, v10

    const v10, -0x104639de

    goto/16 :goto_0

    :sswitch_12
    sget v8, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v8, :cond_b

    goto :goto_5

    :cond_b
    const-string v8, "\u1a78\u0733"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x79dd

    const v10, -0x7fc37ed6

    xor-int/2addr v9, v10

    const v10, 0x53b4a0bb

    goto/16 :goto_0

    .line 472
    :sswitch_13
    sget v8, Ll/᩹;->ۤܿܳ:I

    if-eqz v8, :cond_d

    :cond_c
    :goto_5
    const-string v8, "\u06df\u06df"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x7f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3305

    const v10, 0x552c49b2

    xor-int/2addr v9, v10

    const v10, -0x480bdb8d

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u1a7a\u0736"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x6b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x23cf

    const v10, 0x3637fb73

    xor-int/2addr v9, v10

    const v10, -0x5f1606e3

    goto/16 :goto_0

    .line 175
    :sswitch_14
    sget v8, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v8, :cond_e

    :goto_6
    const-string v8, "\u06e4\u06da"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x13

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x37ff

    const v10, 0x1208e228

    xor-int/2addr v9, v10

    const v10, -0x1973a4f6

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06e4\u06e1"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x73

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1fb5

    const v10, -0x46768eeb

    xor-int/2addr v9, v10

    const v10, 0x4e31cc30    # 7.4573722E8f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e4106ca -> :sswitch_5
        -0x7409f5e7 -> :sswitch_f
        -0x73c3c1c0 -> :sswitch_b
        -0x6ae4118d -> :sswitch_f
        -0x4eae1e1c -> :sswitch_2
        -0x4df0127d -> :sswitch_3
        -0x459d96e5 -> :sswitch_d
        -0x4398d6e3 -> :sswitch_3
        -0x42d0310a -> :sswitch_1
        -0x29c12af8 -> :sswitch_11
        -0x1fb98f86 -> :sswitch_8
        -0x18814e76 -> :sswitch_a
        -0x165a2a6a -> :sswitch_a
        -0x13e545a2 -> :sswitch_8
        -0x1014f3de -> :sswitch_9
        -0xbe90d29 -> :sswitch_1
        -0x8ada1d6 -> :sswitch_10
        0x19babd6 -> :sswitch_10
        0x377bc4c -> :sswitch_e
        0x5fa11c1 -> :sswitch_4
        0x84a8dea -> :sswitch_6
        0xb5933f0 -> :sswitch_13
        0x11599e7b -> :sswitch_6
        0x1db59aaf -> :sswitch_c
        0x2661fb3e -> :sswitch_14
        0x2bc4b157 -> :sswitch_c
        0x30bf41bf -> :sswitch_4
        0x3132ebc0 -> :sswitch_d
        0x32d40eef -> :sswitch_13
        0x363c975c -> :sswitch_12
        0x43cef73e -> :sswitch_7
        0x4a8ad223 -> :sswitch_0
        0x51ce1cfb -> :sswitch_2
        0x549ad1ef -> :sswitch_e
        0x5b14ac61 -> :sswitch_b
        0x5d53f5f6 -> :sswitch_12
        0x69889530 -> :sswitch_0
        0x6dcd5d50 -> :sswitch_7
        0x71cec368 -> :sswitch_11
        0x75864ca2 -> :sswitch_5
        0x7b22b4f1 -> :sswitch_9
        0x7b9707bc -> :sswitch_14
    .end sparse-switch
.end method

.method public static bridge synthetic ۧ(Ll/ۢۢۡ;)Landroid/widget/AbsListView$OnScrollListener;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢۡ;->᩻֫:Landroid/widget/AbsListView$OnScrollListener;

    return-object p0
.end method

.method private ۧ(Landroid/view/MotionEvent;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x5ad3e286

    sget v9, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v10, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v11, "\u06ec\u073f"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x435

    const v13, 0x5990df9a

    xor-int/2addr v12, v13

    const v13, -0x9cca09

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x56a9

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    shl-int v6, v4, v5

    const/4 v7, 0x3

    .line 309
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v11

    if-gtz v11, :cond_3

    goto/16 :goto_4

    .line 224
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v11, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v11, :cond_8

    goto/16 :goto_5

    .line 170
    :sswitch_1
    sget-boolean v11, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v11, :cond_b

    goto :goto_1

    .line 383
    :sswitch_2
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v11

    if-eqz v11, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_1
    const-string v11, "\u05ab\u1a78"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x4b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x5383

    const v13, -0x2e4f2b60

    xor-int/2addr v12, v13

    const v13, 0x8998f6b

    goto :goto_0

    .line 407
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    return-void

    :sswitch_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 405
    :sswitch_6
    invoke-static {p0, v2}, Ll/ۗۗ;->۠᩹᩻(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v0}, Landroid/view/View;->setPressed(Z)V

    sget-boolean v11, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v11, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v11, "\u1a7a\u1a7a"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4919

    const v13, -0x62caec75

    xor-int/2addr v12, v13

    const v13, -0x73fba25b

    goto :goto_0

    .line 409
    :sswitch_7
    invoke-super {p0, v3}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 410
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    return-void

    :sswitch_8
    or-int v11, v6, v7

    .line 408
    invoke-virtual {v3, v11}, Landroid/view/MotionEvent;->setAction(I)V

    .line 220
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v11

    if-gtz v11, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v11, "\u06d9\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0xb

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x321

    const v13, -0x1798e10c

    xor-int/2addr v12, v13

    const v13, 0x149e5be1

    goto/16 :goto_0

    :cond_3
    const-string v11, "\u06df\u06eb"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x55

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x4943

    const v13, 0x70e6b0a7

    xor-int/2addr v12, v13

    const v13, 0x6184ced7

    goto/16 :goto_0

    :sswitch_9
    const/16 v5, 0x8

    .line 320
    sget-boolean v11, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v11, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v11, "\u073f\u06e1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x5b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x3555

    const v13, 0x7b2c2ba8

    xor-int/2addr v12, v13

    const v13, 0x1531ea41

    goto/16 :goto_0

    .line 407
    :sswitch_a
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 408
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    .line 352
    sget v11, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v11, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v11, "\u05ab\u0736"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x775b

    const v13, 0x6b0fd7fa

    xor-int/2addr v12, v13

    const v13, 0x56e9cbae

    goto/16 :goto_0

    :sswitch_b
    if-ge v2, v1, :cond_6

    const-string v11, "\u1a78\u06e0"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x6f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6d07

    const v13, 0x2a1388e0

    xor-int/2addr v12, v13

    const v13, 0x52a7ea4e

    goto/16 :goto_0

    :cond_6
    const-string v11, "\u1a7b\u06e1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2603

    const v13, -0x6039726f

    xor-int/2addr v12, v13

    const v13, 0x3a7348b1

    goto/16 :goto_0

    .line 403
    :sswitch_c
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 404
    invoke-static {p0}, Ll/֨۬;->۟ܰۚ(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    :goto_2
    const-string v11, "\u06d6\u06da"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x31

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x26e5

    const v13, 0x3ac33033

    xor-int/2addr v12, v13

    const v13, 0x61a67516

    goto/16 :goto_0

    :sswitch_d
    const/4 v0, 0x0

    .line 185
    sget v11, Ll/۟;->ۗۤۛ:I

    if-eqz v11, :cond_7

    goto :goto_3

    :cond_7
    const-string v11, "\u06e8\u06e4"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x74e7

    const v13, -0x595eb2fd

    xor-int/2addr v12, v13

    const v13, -0x2870c6e4

    goto/16 :goto_0

    .line 402
    :sswitch_e
    invoke-virtual {p0}, Landroid/view/View;->cancelLongPress()V

    .line 334
    sget v11, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v11, :cond_9

    :cond_8
    :goto_3
    const-string v11, "\u073f\u06e4"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x610f

    const v13, 0x3be2a9ae    # 0.0069172f

    xor-int/2addr v12, v13

    const v13, -0x770b8d5d

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u06e4\u05a8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2793

    const v13, -0x73539e82

    xor-int/2addr v12, v13

    const v13, 0x5e0ba75d

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v11, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v11, :cond_a

    :goto_4
    const-string v11, "\u06e7\u073d"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x4b

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x507

    const v13, 0x24ffdec3

    xor-int/2addr v12, v13

    const v13, 0x18767a7f

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u1a74\u1a74"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2c99

    const v13, 0x4c60cad2    # 5.8927944E7f

    xor-int/2addr v12, v13

    const v13, -0x445aef1b

    goto/16 :goto_0

    .line 401
    :sswitch_10
    sget-boolean v11, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v11, :cond_c

    :cond_b
    :goto_5
    const-string v11, "\u073a\u06e8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x6d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x7d2f

    const v13, 0x324c38cb

    xor-int/2addr v12, v13

    const v13, 0x341390e9

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u073d\u06dc"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x50fb

    const v13, -0x7c49a219

    xor-int/2addr v12, v13

    const v13, 0x16c448cc

    goto/16 :goto_0

    .line 135
    :sswitch_11
    sget v11, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v11, :cond_d

    :goto_6
    const-string v11, "\u1a7a\u06e2"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x2f

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x17ed

    const v13, -0x567bc72c

    xor-int/2addr v12, v13

    const v13, -0x6a3e3181

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u06ec\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x61

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7775

    const v13, 0x1aae4b4f

    xor-int/2addr v12, v13

    const v13, -0x6755facf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x796cf106 -> :sswitch_1
        -0x7454a91f -> :sswitch_4
        -0x74480dca -> :sswitch_6
        -0x6a873aa4 -> :sswitch_a
        -0x4f62ff1c -> :sswitch_a
        -0x4d037697 -> :sswitch_d
        -0x4cfb8cb4 -> :sswitch_2
        -0x47fd8664 -> :sswitch_2
        -0x4633e628 -> :sswitch_f
        -0x45e177cb -> :sswitch_9
        -0x3a5e0526 -> :sswitch_d
        -0x37182ba0 -> :sswitch_7
        -0x2c14ac0c -> :sswitch_8
        -0x2040c57c -> :sswitch_0
        -0x1ec55357 -> :sswitch_b
        -0x9df85a1 -> :sswitch_9
        0x14aee84e -> :sswitch_e
        0x1b9e73bd -> :sswitch_11
        0x3a2f95c7 -> :sswitch_7
        0x3b781090 -> :sswitch_c
        0x3cf45a08 -> :sswitch_3
        0x3f7c53b1 -> :sswitch_b
        0x4920ca8c -> :sswitch_4
        0x4a80d5cb -> :sswitch_f
        0x4b5a55bd -> :sswitch_6
        0x506b5e0f -> :sswitch_11
        0x522619dc -> :sswitch_c
        0x52eded32 -> :sswitch_10
        0x53343681 -> :sswitch_e
        0x5f3af5b8 -> :sswitch_0
        0x60f0e795 -> :sswitch_5
        0x64036056 -> :sswitch_1
        0x64f023ca -> :sswitch_3
        0x7a490635 -> :sswitch_10
        0x7c1fb83c -> :sswitch_8
        0x7ed515bd -> :sswitch_5
    .end sparse-switch
.end method

.method private ܳ()Z
    .locals 12

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const v6, -0x7a540285

    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v8, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v9, "\u06dc\u073d"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x5f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x517d

    const v11, -0x3bee75b6

    xor-int/2addr v10, v11

    const v11, -0x2adfb999

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x6095

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 19
    sget v9, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v9, :cond_7

    goto/16 :goto_1

    .line 86
    :sswitch_0
    sget-boolean v9, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v9, :cond_8

    goto/16 :goto_3

    .line 25
    :sswitch_1
    sget v9, Ll/۠;->ܺܺܶ:I

    if-gez v9, :cond_1

    goto/16 :goto_1

    .line 40
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget-boolean v9, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v9, :cond_6

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v0, 0x1

    return v0

    :sswitch_6
    const-wide/16 v9, 0x1f4

    cmp-long v11, v4, v9

    if-gez v11, :cond_d

    const-string v9, "\u06da\u1a79"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1fdd

    const v11, 0x2a4b27c0

    xor-int/2addr v10, v11

    const v11, -0x22ea543f

    goto :goto_0

    :sswitch_7
    sub-long v4, v0, v2

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v9

    if-gtz v9, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v9, "\u1a74\u1a73"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x69

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x56a9

    const v11, 0x1fea2865

    xor-int/2addr v10, v11

    const v11, -0x36899120    # -1009390.0f

    goto :goto_0

    :sswitch_8
    sget-boolean v9, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v9, :cond_2

    :cond_1
    const-string v9, "\u05a1\u06e2"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x67

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x48a7

    const v11, 0x17d714fc

    xor-int/2addr v10, v11

    const v11, 0x33ea6e05

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u06d8\u06df"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1a23

    const v11, -0x65d4f6da

    xor-int/2addr v10, v11

    const v11, 0x14b185cf

    goto/16 :goto_0

    .line 56
    :sswitch_9
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v9

    if-nez v9, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v9, "\u1a7b\u0733"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x33

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3f15

    const v11, -0x268bd14b

    xor-int/2addr v10, v11

    const v11, -0x4ae37bcb

    goto/16 :goto_0

    :sswitch_a
    sget v9, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v9, :cond_4

    goto :goto_1

    :cond_4
    const-string v9, "\u05ab\u1a78"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x55

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x29f7

    const v11, 0x1784a675

    xor-int/2addr v10, v11

    const v11, 0x612f3567

    goto/16 :goto_0

    .line 75
    :sswitch_b
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v9

    if-gtz v9, :cond_5

    goto :goto_1

    :cond_5
    const-string v9, "\u0733\u06dc"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x29

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x380d

    const v11, 0x23819694

    xor-int/2addr v10, v11

    const v11, -0x1534f183

    goto/16 :goto_0

    :cond_6
    :goto_1
    const-string v9, "\u073f\u06db"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x59

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1e3d

    const v11, 0x5fe396dc

    xor-int/2addr v10, v11

    const v11, 0x6e0e012e

    goto/16 :goto_0

    :cond_7
    const-string v9, "\u1a75\u06ec"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2085

    const v11, -0x5ca20e8f

    xor-int/2addr v10, v11

    const v11, -0x188a67f9

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v9

    if-gtz v9, :cond_9

    :cond_8
    const-string v9, "\u1a73\u0736"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7d9d

    const v11, -0x25ae539e

    xor-int/2addr v10, v11

    const v11, 0x2218c34e

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u1a75\u06e7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2f53

    const v11, -0x6834697e

    xor-int/2addr v10, v11

    const v11, -0x517c2aa3

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v9

    if-gtz v9, :cond_a

    :goto_2
    const-string v9, "\u06e1\u06db"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7381

    const v11, 0x57bdbc22

    xor-int/2addr v10, v11

    const v11, -0x3be07fcc

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u1a7b\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x13

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x48f

    const v11, -0x78f09b74

    xor-int/2addr v10, v11

    const v11, 0x4e161dd2    # 6.2963418E8f

    goto/16 :goto_0

    .line 62
    :sswitch_e
    sget v9, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v9, :cond_b

    goto :goto_3

    :cond_b
    const-string v9, "\u06d7\u0733"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x64df

    const v11, 0x16ee492f

    xor-int/2addr v10, v11

    const v11, -0x771aedd6

    goto/16 :goto_0

    .line 92
    :sswitch_f
    invoke-static {}, Ll/ۗۚ;->ᩴۧ᩺()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۢۢۡ;->۟:J

    .line 50
    sget v9, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v9, :cond_c

    :goto_3
    const-string v9, "\u06e0\u073f"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3af5

    const v11, 0x495c390c    # 902032.75f

    xor-int/2addr v10, v11

    const v11, 0x75d31d80

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u1a78\u1a77"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x7f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x173b

    const v11, 0x6b773f40

    xor-int/2addr v10, v11

    const v11, 0x64883d45

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    return v0

    .line 91
    :sswitch_11
    iget-boolean v9, p0, Ll/ۢۢۡ;->ܰ:Z

    if-eqz v9, :cond_d

    const-string v9, "\u06e7\u06d8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x52a5

    const v11, 0x3f47444c

    xor-int/2addr v10, v11

    const v11, 0x2abc740d

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u073d\u05ab"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5c7f

    const v11, -0x5199980c

    xor-int/2addr v10, v11

    const v11, -0x4a34c82b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d293977 -> :sswitch_0
        -0x64fdfdcf -> :sswitch_d
        -0x60ea6964 -> :sswitch_7
        -0x5ee79f78 -> :sswitch_f
        -0x5640cfc7 -> :sswitch_1
        -0x517c5b2e -> :sswitch_f
        -0x50472278 -> :sswitch_6
        -0x3ea18b65 -> :sswitch_c
        -0x34e36326 -> :sswitch_c
        -0x30e37777 -> :sswitch_6
        -0x2c865637 -> :sswitch_3
        -0x2a9e7340 -> :sswitch_8
        -0x29951f18 -> :sswitch_4
        -0x26e7a951 -> :sswitch_2
        -0x21d3ac4f -> :sswitch_d
        -0x1cfdb484 -> :sswitch_10
        -0xe0cd4c4 -> :sswitch_0
        -0xd7e6f72 -> :sswitch_5
        -0xca59253 -> :sswitch_a
        -0xb13990b -> :sswitch_10
        -0x51a9173 -> :sswitch_a
        -0x4c3164e -> :sswitch_11
        0x2db3c6 -> :sswitch_8
        0x18161941 -> :sswitch_b
        0x1a08d5c6 -> :sswitch_3
        0x21930c6e -> :sswitch_e
        0x231a5b78 -> :sswitch_4
        0x34132e6a -> :sswitch_e
        0x3a70172b -> :sswitch_1
        0x3cd691b2 -> :sswitch_9
        0x3db1e7e1 -> :sswitch_2
        0x49294952 -> :sswitch_11
        0x512149c5 -> :sswitch_9
        0x56b18d4a -> :sswitch_5
        0x60c23be6 -> :sswitch_7
        0x6cd26b44 -> :sswitch_b
    .end sparse-switch
.end method

.method public static ܽ(Ll/ۢۢۡ;)V
    .locals 10

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const v4, 0x58140136

    sget v5, Ll/֡۬;->۠֡᩶:I

    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v7, "\u1a76\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x86b

    const v9, -0x74cb7377

    xor-int/2addr v8, v9

    const v9, -0x2b9af293

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x37db

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 0
    sget v7, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v7, :cond_4

    goto/16 :goto_4

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v7

    if-gtz v7, :cond_7

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget-boolean v7, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v7, :cond_b

    goto/16 :goto_1

    .line 94
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v7, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v7, :cond_5

    goto/16 :goto_1

    .line 104
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto :goto_1

    .line 164
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    :sswitch_5
    add-long/2addr v0, v2

    .line 179
    iput-wide v0, p0, Ll/ۢۢۡ;->᩶:J

    return-void

    :sswitch_6
    const-wide/16 v2, 0x1f4

    .line 62
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v7

    if-ltz v7, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v7, "\u06eb\u06eb"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4bdd

    const v9, -0x61217b7c

    xor-int/2addr v8, v9

    const v9, -0x60a5d80a

    goto :goto_0

    .line 37
    :sswitch_7
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v7

    if-ltz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v7, "\u1a76\u06df"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x79ed

    const v9, -0x770bc0e1    # -1.47000555E-33f

    xor-int/2addr v8, v9

    const v9, 0x14915a

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v7

    if-gtz v7, :cond_2

    goto :goto_2

    :cond_2
    const-string v7, "\u073a\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x59d5

    const v9, 0xb703d8d

    xor-int/2addr v8, v9

    const v9, 0x742a121b

    goto/16 :goto_0

    :sswitch_9
    sget v7, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v7, :cond_3

    :goto_1
    const-string v7, "\u05ab\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0xcf3

    const v9, -0x178ec446

    xor-int/2addr v8, v9

    const v9, -0x79c7c502

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u0736\u06e8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x51

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0xabb

    const v9, 0x4a34899b    # 2957926.8f

    xor-int/2addr v8, v9

    const v9, 0xd0df289

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06e8\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1fe7

    const v9, -0x666a801f

    xor-int/2addr v8, v9

    const v9, -0x6dcc5109

    goto/16 :goto_0

    .line 153
    :sswitch_a
    sget-boolean v7, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v7, :cond_6

    :cond_5
    :goto_2
    const-string v7, "\u06ec\u1a79"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x5f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x42db

    const v9, -0x3835c442

    xor-int/2addr v8, v9

    const v9, -0x7b538457

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u1a76\u1a73"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xf

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7b1

    const v9, -0x7034c085

    xor-int/2addr v8, v9

    const v9, -0x6f40d580

    goto/16 :goto_0

    .line 133
    :sswitch_b
    sget v7, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v7, :cond_8

    :cond_7
    const-string v7, "\u1a77\u06e7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7201

    const v9, -0x6ff939f7

    xor-int/2addr v8, v9

    const v9, 0x15f5acf2

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06dc\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x21

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x596b

    const v9, 0x5b4167d6

    xor-int/2addr v8, v9

    const v9, 0x15d51c5c

    goto/16 :goto_0

    .line 134
    :sswitch_c
    sget v7, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v7, :cond_9

    goto :goto_4

    :cond_9
    const-string v7, "\u06d9\u073d"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7793

    const v9, -0x240141fe

    xor-int/2addr v8, v9

    const v9, -0x40e53304

    goto/16 :goto_0

    .line 91
    :sswitch_d
    sget v7, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v7, :cond_a

    :goto_3
    const-string v7, "\u0736\u1a76"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x61

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3cb9

    const v9, -0x1cd529e8

    xor-int/2addr v8, v9

    const v9, 0x7b3fd55b

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06e7\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x21

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x545d

    const v9, -0x6d2cdf3a

    xor-int/2addr v8, v9

    const v9, -0x5037d38a

    goto/16 :goto_0

    .line 179
    :sswitch_e
    invoke-static {}, Ll/ۗ᩺;->ᩳۗۚ()J

    move-result-wide v0

    .line 162
    sget v7, Ll/۠;->ܺܺܶ:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u06e7\u06df"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x69

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x74ad

    const v9, 0x5804bddb

    xor-int/2addr v8, v9

    const v9, 0x60d3004a

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u073f\u06dc"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x25

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x46ef

    const v9, -0xc332e8f

    xor-int/2addr v8, v9

    const v9, 0x33b0461a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x784e4669 -> :sswitch_5
        -0x711338b5 -> :sswitch_0
        -0x6efe525e -> :sswitch_7
        -0x6d30a500 -> :sswitch_e
        -0x66477654 -> :sswitch_6
        -0x62db7ced -> :sswitch_c
        -0x612c309d -> :sswitch_4
        -0x606ea7d7 -> :sswitch_8
        -0x580eab87 -> :sswitch_b
        -0x566d9dd4 -> :sswitch_d
        -0x53caf029 -> :sswitch_6
        -0x4250e46e -> :sswitch_7
        -0x3d19baa9 -> :sswitch_8
        -0x33728ab1 -> :sswitch_e
        -0x28800af4 -> :sswitch_2
        -0x252bc3b0 -> :sswitch_4
        -0x1635fe9e -> :sswitch_2
        -0xfe99001 -> :sswitch_a
        -0xe03d518 -> :sswitch_c
        0xd1dd4a3 -> :sswitch_1
        0x30d2137b -> :sswitch_d
        0x328b7fe4 -> :sswitch_0
        0x3baa8354 -> :sswitch_b
        0x4b9c93f2 -> :sswitch_a
        0x541827b4 -> :sswitch_3
        0x57429487 -> :sswitch_9
        0x6cb2ee3e -> :sswitch_5
        0x7cb6c8fe -> :sswitch_3
        0x7f92fa4c -> :sswitch_9
        0x7ff8b10b -> :sswitch_1
    .end sparse-switch
.end method

.method private ܽ(Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x705eb8b9

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v4, Ll/᩺;->ۙۛܶ:I

    const-string v5, "\u073f\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7f39

    const v7, -0xfe7bdb5

    xor-int/2addr v6, v7

    const v7, 0xb0a957d

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x3d85

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 132
    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v5, :cond_c

    goto/16 :goto_4

    .line 222
    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_5

    .line 145
    :sswitch_1
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v5, :cond_e

    goto/16 :goto_4

    .line 105
    :sswitch_2
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_4

    .line 349
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    const/4 p1, 0x0

    return p1

    :sswitch_4
    const/4 p1, 0x1

    return p1

    .line 444
    :sswitch_5
    invoke-static {v1}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    .line 445
    invoke-interface {v5, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "\u0733\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x577f

    const v7, 0x4f06126d

    xor-int/2addr v6, v7

    const v7, -0x3a1c35ea

    goto :goto_0

    .line 444
    :sswitch_6
    invoke-static {v1}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u06e4\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3bc5

    const v7, 0x55a373a2

    xor-int/2addr v6, v7

    const v7, 0x2d805321

    goto :goto_0

    .line 442
    :sswitch_7
    invoke-interface {v0, p0, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 444
    :sswitch_8
    iget-object v1, p0, Ll/ۢۢۡ;->ۘ֫:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    const-string v5, "\u06e4\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x71d

    const v7, -0x50b025ae

    xor-int/2addr v6, v7

    const v7, 0x33e26c47

    goto/16 :goto_0

    .line 440
    :sswitch_9
    iget-object v0, p0, Ll/ۢۢۡ;->᩸:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_1

    const-string v5, "\u05a1\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5719

    const v7, 0x9604bbf

    xor-int/2addr v6, v7

    const v7, 0x63a75bff

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u06e7\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5647

    const v7, -0x9391807

    xor-int/2addr v6, v7

    const v7, -0x4174870f

    goto/16 :goto_0

    .line 437
    :sswitch_a
    iget-object v5, p0, Ll/ۢۢۡ;->ۘ֫:Ljava/util/ArrayList;

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u06eb\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x20f1

    const v7, -0x2e23a782

    xor-int/2addr v6, v7

    const v7, -0x59ed9273

    goto/16 :goto_0

    :sswitch_b
    const/4 p1, 0x0

    return p1

    :sswitch_c
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "\u1a7b\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b3f

    const v7, -0x289cc1b7

    xor-int/2addr v6, v7

    const v7, 0x2deaf0a8

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5229

    const v7, 0x68a27187

    xor-int/2addr v6, v7

    const v7, 0x6690651a

    goto/16 :goto_0

    .line 103
    :sswitch_d
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v5, "\u073a\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2169

    const v7, -0x4362a181

    xor-int/2addr v6, v7

    const v7, -0x374c34cd

    goto/16 :goto_0

    .line 366
    :sswitch_e
    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u073f\u06dc"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa7

    const v7, -0x7c6ed5d3

    xor-int/2addr v6, v7

    const v7, -0x6c1948cf

    goto/16 :goto_0

    .line 352
    :sswitch_f
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u06e2\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x26eb

    const v7, 0x6c680100

    xor-int/2addr v6, v7

    const v7, 0x56986d74

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06eb\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1b5b

    const v7, 0x6c92be8

    xor-int/2addr v6, v7

    const v7, 0x7bfee1ef

    goto/16 :goto_0

    .line 137
    :sswitch_11
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v5

    if-ltz v5, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v5, "\u06d8\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x52f

    const v7, 0x468fce31

    xor-int/2addr v6, v7

    const v7, -0x6a10fbe0

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u0733\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5b9b

    const v7, -0x2da574e7

    xor-int/2addr v6, v7

    const v7, -0x4a2d7ae2

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e0\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2b53

    const v7, -0x67e7e66f

    xor-int/2addr v6, v7

    const v7, 0x7b4b5477

    goto/16 :goto_0

    .line 352
    :sswitch_13
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v5

    if-gtz v5, :cond_b

    :goto_4
    const-string v5, "\u05ab\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x46d

    const v7, 0x12aba8de

    xor-int/2addr v6, v7

    const v7, -0x7a961d06

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a73\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x246d

    const v7, 0x75b85464

    xor-int/2addr v6, v7

    const v7, -0xb6af6e0

    goto/16 :goto_0

    .line 290
    :sswitch_14
    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u1a76\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x775

    const v7, 0x7ddb221a

    xor-int/2addr v6, v7

    const v7, -0x1e0b74bc

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05ab\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1b25

    const v7, -0x3f9f5177

    xor-int/2addr v6, v7

    const v7, -0x4a0d3e9

    goto/16 :goto_0

    .line 301
    :sswitch_15
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_f

    :cond_e
    const-string v5, "\u06db\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6ba7

    const v7, -0x480e9738

    xor-int/2addr v6, v7

    const v7, 0x27af6728

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e0\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2e83

    const v7, -0x7c322d03

    xor-int/2addr v6, v7

    const v7, 0x3472e7b8

    goto/16 :goto_0

    .line 74
    :sswitch_16
    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v5, :cond_10

    :goto_6
    const-string v5, "\u1a74\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x19

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6069

    const v7, -0x7cd899ca

    xor-int/2addr v6, v7

    const v7, -0x731aad2e

    goto/16 :goto_0

    :cond_10
    const-string v5, "\u06e1\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2ca1

    const v7, -0x62e0626a

    xor-int/2addr v6, v7

    const v7, 0x1494be75

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x684382a6 -> :sswitch_11
        -0x63a19f1b -> :sswitch_e
        -0x5ff327c4 -> :sswitch_10
        -0x5e93e244 -> :sswitch_a
        -0x54c2134a -> :sswitch_6
        -0x487c77fa -> :sswitch_7
        -0x46820c41 -> :sswitch_e
        -0x45138911 -> :sswitch_d
        -0x441a23b8 -> :sswitch_d
        -0x3e8acb1c -> :sswitch_12
        -0x38edcb4d -> :sswitch_b
        -0x374f91e3 -> :sswitch_5
        -0x277a36c2 -> :sswitch_14
        -0x20eababc -> :sswitch_6
        -0x204c6e04 -> :sswitch_c
        -0x1da5d81a -> :sswitch_4
        -0x15c96bbe -> :sswitch_0
        -0xcf5bbc5 -> :sswitch_5
        -0x5bef094 -> :sswitch_1
        -0x4ca0707 -> :sswitch_2
        -0x2afc855 -> :sswitch_c
        0x14a6396 -> :sswitch_a
        0x3f440e5 -> :sswitch_f
        0x10253592 -> :sswitch_14
        0x11497b45 -> :sswitch_3
        0x195b11f0 -> :sswitch_9
        0x2004d6b1 -> :sswitch_15
        0x235ad9f0 -> :sswitch_8
        0x26fe5f21 -> :sswitch_10
        0x2914d97e -> :sswitch_4
        0x2af11536 -> :sswitch_8
        0x2d71bc46 -> :sswitch_3
        0x3066c0d3 -> :sswitch_0
        0x31e116c5 -> :sswitch_13
        0x35c882fd -> :sswitch_11
        0x3ee97440 -> :sswitch_16
        0x40068a58 -> :sswitch_9
        0x46eb520b -> :sswitch_b
        0x4c536659 -> :sswitch_13
        0x4e1d3a6c -> :sswitch_f
        0x555e5513 -> :sswitch_15
        0x5644e93c -> :sswitch_7
        0x592589cf -> :sswitch_1
        0x685e2461 -> :sswitch_2
        0x7394a424 -> :sswitch_12
        0x7a8471d0 -> :sswitch_16
    .end sparse-switch
.end method

.method private ܿ()Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x38d185f1

    sget v8, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v9, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v10, "\u06e0\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7069

    const v12, 0x3e6a3bb5

    xor-int/2addr v11, v12

    const v12, 0x6d0c4b09

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x75b

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    sget v10, Ll/᩹;->ۤܿܳ:I

    if-eqz v10, :cond_9

    goto/16 :goto_6

    .line 18
    :sswitch_0
    sget-boolean v10, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v10, :cond_0

    goto :goto_1

    :cond_0
    const-string v10, "\u06d9\u073a"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x652b

    const v12, 0x19a61223

    xor-int/2addr v11, v12

    const v12, -0x192967eb

    goto :goto_0

    .line 53
    :sswitch_1
    sget-boolean v10, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v10, :cond_5

    goto :goto_1

    .line 183
    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v10

    if-nez v10, :cond_1

    goto/16 :goto_7

    :cond_1
    const-string v10, "\u06eb\u06db"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7d97

    const v12, -0x12c642cf

    xor-int/2addr v11, v12

    const v12, -0x5eaa8d98

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string v10, "\u06e4\u06d7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x6f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x126f

    const v12, 0x44605fbb

    xor-int/2addr v11, v12

    const v12, 0x14adbd47

    goto :goto_0

    :sswitch_4
    sget v10, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v10, :cond_3

    goto/16 :goto_7

    :cond_3
    :goto_2
    const-string v10, "\u06e8\u05a1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x71

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1ebb

    const v12, -0x5a7ca23a

    xor-int/2addr v11, v12

    const v12, -0x62762188

    goto/16 :goto_0

    .line 204
    :sswitch_5
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget-boolean v10, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v10, :cond_10

    goto :goto_3

    .line 222
    :sswitch_6
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    :goto_3
    const-string v10, "\u06da\u06df"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x152f

    const v12, 0x774218ce

    xor-int/2addr v11, v12

    const v12, 0x724f7589

    goto/16 :goto_0

    .line 338
    :sswitch_7
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    const/4 v0, 0x0

    return v0

    .line 363
    :sswitch_8
    iget-boolean v10, p0, Ll/ۢۢۡ;->ۜ֫:Z

    if-eqz v10, :cond_12

    goto/16 :goto_4

    :sswitch_9
    iget-boolean v10, p0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-nez v10, :cond_7

    const-string v10, "\u06d9\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x69

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x78e5

    const v12, 0x45b32b3

    xor-int/2addr v11, v12

    const v12, -0x5c201a76

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x1

    return v0

    :sswitch_b
    div-float v10, v4, v6

    const/high16 v11, 0x40600000    # 3.5f

    cmpl-float v10, v10, v11

    if-lez v10, :cond_12

    goto/16 :goto_5

    :sswitch_c
    int-to-float v6, v5

    .line 259
    sget v10, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v10, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v10, "\u1a74\u06d9"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4c6b

    const v12, -0x392c876d

    xor-int/2addr v11, v12

    const v12, 0x6f50e8a6

    goto/16 :goto_0

    :sswitch_d
    int-to-float v4, v2

    .line 353
    invoke-virtual {p0}, Ll/ۢۢۡ;->֫()I

    move-result v5

    .line 76
    sget v10, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v10, :cond_6

    :cond_5
    const-string v10, "\u073d\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x23

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1ec5

    const v12, 0xe7469ee

    xor-int/2addr v11, v12

    const v12, -0x5a2cdf85

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u06e0\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x24a1

    const v12, -0xec27552

    xor-int/2addr v11, v12

    const v12, -0xdd3cc7c

    goto/16 :goto_0

    .line 363
    :sswitch_e
    iget-boolean v10, p0, Ll/ۢۢۡ;->ۧ֫:Z

    if-nez v10, :cond_7

    const-string v10, "\u073d\u06d7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2c17

    const v12, -0x5e85f753

    xor-int/2addr v11, v12

    const v12, -0x6417f9b2

    goto/16 :goto_0

    :cond_7
    :goto_4
    const-string v10, "\u1a7a\u1a75"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x25

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3f11

    const v12, -0x5a2e1cb4

    xor-int/2addr v11, v12

    const v12, 0x3466550b

    goto/16 :goto_0

    .line 351
    :sswitch_f
    iget-boolean v10, p0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-nez v10, :cond_8

    const-string v10, "\u1a74\u1a78"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x19d3

    const v12, 0x19a61d5

    xor-int/2addr v11, v12

    const v12, 0x10326b37

    goto/16 :goto_0

    :cond_8
    :goto_5
    const-string v10, "\u06e0\u1a74"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x35

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x66f

    const v12, 0x169f6c4c

    xor-int/2addr v11, v12

    const v12, 0x2584d1b3

    goto/16 :goto_0

    :sswitch_10
    sub-int v10, v2, v3

    if-lez v10, :cond_12

    const-string v10, "\u1a7a\u073d"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x11

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6981

    const v12, 0x69a1a665

    xor-int/2addr v11, v12

    const v12, 0x2c2e20c2

    goto/16 :goto_0

    .line 349
    :sswitch_11
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v2

    .line 350
    invoke-static {p0}, Ll/ۘۛ;->ۛ֡ۘ(Ljava/lang/Object;)I

    move-result v3

    if-lez v3, :cond_12

    const-string v10, "\u1a7b\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x784d

    const v12, -0x4d8f5cdf

    xor-int/2addr v11, v12

    const v12, 0xad5c52d

    goto/16 :goto_0

    .line 370
    :sswitch_12
    iget v10, v0, Ll/ܳ᩸ۡ;->֫:F

    iget v11, v0, Ll/ܳ᩸ۡ;->ܿ:F

    cmpl-float v10, v10, v11

    if-lez v10, :cond_12

    const-string v10, "\u06e4\u06db"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0xd

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5edb

    const v12, 0x5926f9a6

    xor-int/2addr v11, v12

    const v12, -0x49ab501a

    goto/16 :goto_0

    :sswitch_13
    iget v10, v0, Ll/ܳ᩸ۡ;->ۧ:F

    cmpl-float v10, v1, v10

    if-lez v10, :cond_12

    const-string v10, "\u0736\u06d6"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x33

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7337

    const v12, -0x24238639

    xor-int/2addr v11, v12

    const v12, -0x28083233

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a73\u06eb"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x997

    const v12, -0x1a10b9eb

    xor-int/2addr v11, v12

    const v12, -0x7ba3c23c

    goto/16 :goto_0

    .line 108
    :sswitch_14
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v10

    if-nez v10, :cond_a

    :goto_6
    const-string v10, "\u1a7a\u06e0"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2fff

    const v12, -0x75d04c80

    xor-int/2addr v11, v12

    const v12, -0x1f4fad06

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u06d7\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5f1b

    const v12, 0x228716f

    xor-int/2addr v11, v12

    const v12, 0x460fbe16

    goto/16 :goto_0

    :sswitch_15
    sget v10, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v10, :cond_b

    goto/16 :goto_7

    :cond_b
    const-string v10, "\u0730\u06d9"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x8d

    const v12, -0xf971c4c

    xor-int/2addr v11, v12

    const v12, -0x289911b8

    goto/16 :goto_0

    .line 197
    :sswitch_16
    sget-boolean v10, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v10, :cond_c

    goto/16 :goto_7

    :cond_c
    const-string v10, "\u06d7\u06db"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x65

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x782f

    const v12, -0x457e7749

    xor-int/2addr v11, v12

    const v12, -0x133f08ca

    goto/16 :goto_0

    .line 268
    :sswitch_17
    sget v10, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v10, :cond_d

    goto :goto_7

    :cond_d
    const-string v10, "\u0736\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x2f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1be7

    const v12, -0x31490ec5

    xor-int/2addr v11, v12

    const v12, 0x1a58bb6b

    goto/16 :goto_0

    .line 363
    :sswitch_18
    sget v10, Ll/᩺;->ۙۛܶ:I

    if-gtz v10, :cond_e

    goto :goto_7

    :cond_e
    const-string v10, "\u05a8\u05a8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x1d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7c45

    const v12, 0x39b4887d

    xor-int/2addr v11, v12

    const v12, 0x1ceda945

    goto/16 :goto_0

    :sswitch_19
    sget-boolean v10, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v10, :cond_f

    goto :goto_7

    :cond_f
    const-string v10, "\u06d8\u06d7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x611f

    const v12, -0x3233e179

    xor-int/2addr v11, v12

    const v12, 0x3440fba9

    goto/16 :goto_0

    .line 370
    :sswitch_1a
    iget-object v0, p0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    iget v1, v0, Ll/ܳ᩸ۡ;->ᩳ:F

    .line 286
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v10

    if-eqz v10, :cond_11

    :cond_10
    :goto_7
    const-string v10, "\u0730\u06db"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x7

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6887

    const v12, -0x7c2d6c8

    xor-int/2addr v11, v12

    const v12, 0x60957f8e

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u06d9\u05ab"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6c95

    const v12, 0x32093cf4

    xor-int/2addr v11, v12

    const v12, 0x3a99f9c0

    goto/16 :goto_0

    :sswitch_1b
    const/4 v0, 0x0

    return v0

    .line 360
    :sswitch_1c
    iget-boolean v10, p0, Ll/ۢۢۡ;->ᩳ֫:Z

    if-eqz v10, :cond_12

    const-string v10, "\u06d9\u06ec"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x516d

    const v12, 0x65522faa

    xor-int/2addr v11, v12

    const v12, -0x343be17a    # -2.570574E7f

    goto/16 :goto_0

    :cond_12
    const-string v10, "\u06e4\u06e4"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x49

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xc2b

    const v12, 0x2542a119

    xor-int/2addr v11, v12

    const v12, -0x2e557223

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f178191 -> :sswitch_17
        -0x6f7e74f3 -> :sswitch_4
        -0x6d8e11c1 -> :sswitch_1b
        -0x6caf0191 -> :sswitch_9
        -0x69b78df9 -> :sswitch_18
        -0x59f0b3b1 -> :sswitch_c
        -0x58a8e54f -> :sswitch_0
        -0x52442107 -> :sswitch_18
        -0x45453ce8 -> :sswitch_f
        -0x42e2e17b -> :sswitch_12
        -0x3a106ed5 -> :sswitch_5
        -0x355e52ed -> :sswitch_11
        -0x2c407ef4 -> :sswitch_1b
        -0x252dc77f -> :sswitch_2
        -0x2380245a -> :sswitch_7
        -0x216a28f9 -> :sswitch_14
        -0x1bf7120e -> :sswitch_15
        -0x17b344eb -> :sswitch_d
        -0x14f1fa9a -> :sswitch_12
        -0x1289f67f -> :sswitch_1a
        -0xd7654fa -> :sswitch_2
        -0xb08a4cf -> :sswitch_1c
        -0x9caf55d -> :sswitch_1c
        -0x63d3291 -> :sswitch_10
        0x2267258 -> :sswitch_b
        0xeef35ae -> :sswitch_3
        0x1da4f8b3 -> :sswitch_13
        0x21592d6f -> :sswitch_15
        0x2565dde6 -> :sswitch_13
        0x266c0afb -> :sswitch_7
        0x312c4686 -> :sswitch_8
        0x32f9735e -> :sswitch_a
        0x37dc8f03 -> :sswitch_4
        0x38ae5097 -> :sswitch_3
        0x39b1bae6 -> :sswitch_d
        0x3b26a692 -> :sswitch_e
        0x466a5968 -> :sswitch_5
        0x4928ec07 -> :sswitch_6
        0x4e9df44e -> :sswitch_14
        0x4fe32681 -> :sswitch_10
        0x4ffbf7fd -> :sswitch_c
        0x523f3a1a -> :sswitch_1a
        0x5548c992 -> :sswitch_6
        0x5ed8c59f -> :sswitch_16
        0x5f4eb199 -> :sswitch_16
        0x5f871cfc -> :sswitch_9
        0x649330d5 -> :sswitch_1
        0x6794663e -> :sswitch_11
        0x6b0c4d80 -> :sswitch_17
        0x6eba8405 -> :sswitch_19
        0x7484c054 -> :sswitch_e
        0x749dd1f3 -> :sswitch_8
        0x754dc976 -> :sswitch_f
        0x758032d9 -> :sswitch_a
        0x794896f3 -> :sswitch_0
        0x7abb2743 -> :sswitch_19
        0x7e4e1f36 -> :sswitch_b
        0x7f2dbc3b -> :sswitch_1
    .end sparse-switch
.end method

.method public static bridge synthetic ܿ(Ll/ۢۢۡ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۢۢۡ;->ܳ()Z

    move-result p0

    return p0
.end method

.method private ᩳ(Landroid/view/MotionEvent;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2e3fee3e

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x62f3

    const v6, 0x24c17e10

    xor-int/2addr v5, v6

    const v6, -0x2c299865

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x23c5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 392
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1395

    const v6, 0x71b7bf5a

    xor-int/2addr v5, v6

    const v6, 0x56d3cbc6

    goto :goto_0

    .line 225
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v4

    if-gez v4, :cond_8

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u073d\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7547

    const v6, -0x308a7ccc

    xor-int/2addr v5, v6

    const v6, -0x56e5110a

    goto :goto_0

    .line 393
    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v4, Ll/᩺;->ۙۛܶ:I

    if-lez v4, :cond_d

    goto/16 :goto_2

    .line 173
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto/16 :goto_2

    .line 247
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    :sswitch_5
    return-void

    :sswitch_6
    const/4 v4, 0x3

    if-ne v0, v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u0733\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2885

    const v6, 0x16ba2710

    xor-int/2addr v5, v6

    const v6, -0x48a4dde6

    goto :goto_0

    :sswitch_7
    const/4 v4, 0x1

    if-eq v0, v4, :cond_2

    const-string v4, "\u1a75\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7871

    const v6, 0x477a02b

    xor-int/2addr v5, v6

    const v6, 0x4fd4fd44

    goto/16 :goto_0

    :sswitch_8
    const/4 p1, 0x0

    .line 394
    iput-boolean p1, p0, Ll/ۢۢۡ;->ܿ֫:Z

    return-void

    :cond_2
    :goto_1
    const-string v4, "\u0736\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3911

    const v6, -0x2c59cc3c

    xor-int/2addr v5, v6

    const v6, -0x153ccadb

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v4

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u1a75\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6923

    const v6, 0x4ff1cc86

    xor-int/2addr v5, v6

    const v6, -0x2e38676f

    goto/16 :goto_0

    .line 169
    :sswitch_a
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u1a7a\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1c77

    const v6, -0x64ed1bd

    xor-int/2addr v5, v6

    const v6, 0x32c17c11

    goto/16 :goto_0

    .line 364
    :sswitch_b
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u0733\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3799

    const v6, -0x24cef93b

    xor-int/2addr v5, v6

    const v6, -0x765fd9bb

    goto/16 :goto_0

    .line 234
    :sswitch_c
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v4, "\u05a8\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d1b

    const v6, -0x41f9ede0

    xor-int/2addr v5, v6

    const v6, 0x4bef7c68    # 3.1389904E7f

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06e0\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x650d

    const v6, 0x5feffbdc

    xor-int/2addr v5, v6

    const v6, 0x2f5d4460

    goto/16 :goto_0

    .line 179
    :sswitch_e
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_9

    :cond_8
    const-string v4, "\u06e0\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xbd1

    const v6, 0x729012cb

    xor-int/2addr v5, v6

    const v6, -0x1024dc40

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1b45

    const v6, 0x5e175b5c

    xor-int/2addr v5, v6

    const v6, -0x46f79149

    goto/16 :goto_0

    .line 57
    :sswitch_f
    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u073f\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7a79

    const v6, -0x53c76885

    xor-int/2addr v5, v6

    const v6, -0x33c745c4    # -4.84252E7f

    goto/16 :goto_0

    .line 214
    :sswitch_10
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_b

    :goto_2
    const-string v4, "\u1a75\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x18d3

    const v6, 0x86cb805

    xor-int/2addr v5, v6

    const v6, -0x29c974f5

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u073d\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe61

    const v6, -0x4c34c438

    xor-int/2addr v5, v6

    const v6, 0x5049a1f2

    goto/16 :goto_0

    .line 96
    :sswitch_11
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_c

    :goto_3
    const-string v4, "\u06d6\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x14f7

    const v6, 0x18e19fc1

    xor-int/2addr v5, v6

    const v6, 0x4936bfd2    # 748541.1f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a73\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x76df

    const v6, 0x34b7023b

    xor-int/2addr v5, v6

    const v6, 0x4822aff7

    goto/16 :goto_0

    .line 136
    :sswitch_12
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_e

    :cond_d
    :goto_4
    const-string v4, "\u06d6\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x592b

    const v6, -0x691e232b

    xor-int/2addr v5, v6

    const v6, -0x3d1e52f5

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u1a77\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xb63

    const v6, 0x631838af

    xor-int/2addr v5, v6

    const v6, -0x2f843d04

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eb7a92e -> :sswitch_9
        -0x7aaa1d1a -> :sswitch_9
        -0x6507b631 -> :sswitch_6
        -0x62e3bde0 -> :sswitch_0
        -0x6255f3dc -> :sswitch_3
        -0x5c65f3c1 -> :sswitch_1
        -0x5b89ae6d -> :sswitch_11
        -0x4a65858e -> :sswitch_c
        -0x3d81d9b5 -> :sswitch_0
        -0x3a850370 -> :sswitch_10
        -0x3085221c -> :sswitch_b
        -0x2e138b92 -> :sswitch_7
        -0x20e14b2d -> :sswitch_e
        -0x1c88c035 -> :sswitch_d
        -0x1aa2e263 -> :sswitch_f
        -0x672bd59 -> :sswitch_e
        -0x53c170e -> :sswitch_6
        -0x2ca31e4 -> :sswitch_10
        0x452de82 -> :sswitch_11
        0x7fcf629 -> :sswitch_12
        0x13a14226 -> :sswitch_f
        0x1404a20d -> :sswitch_4
        0x160284b3 -> :sswitch_8
        0x16cb50e6 -> :sswitch_3
        0x17208698 -> :sswitch_a
        0x1c0e4f06 -> :sswitch_2
        0x2a254ab4 -> :sswitch_7
        0x31c178a3 -> :sswitch_c
        0x3bf1d8a6 -> :sswitch_1
        0x3f94649e -> :sswitch_5
        0x588952a6 -> :sswitch_2
        0x5d8ae713 -> :sswitch_a
        0x5fd7886e -> :sswitch_8
        0x6371fc87 -> :sswitch_5
        0x6b4133c6 -> :sswitch_4
        0x6d22aec1 -> :sswitch_d
        0x6ea7fa4c -> :sswitch_b
        0x7b14cc17 -> :sswitch_12
    .end sparse-switch
.end method

.method public static ᩳ(Ll/ۢۢۡ;)Z
    .locals 11

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const v5, -0x48bd7f58

    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v8, "\u06d7\u06e7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xc21

    const v10, -0x1000bea3

    xor-int/2addr v9, v10

    const v10, -0x4b711aba

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x526d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 108
    sget v8, Ll/۟;->ۗۤۛ:I

    if-eqz v8, :cond_9

    goto/16 :goto_1

    .line 80
    :sswitch_0
    sget-boolean v8, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v8, :cond_a

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v8, Ll/֨᩺;->ۨ֨۬:I

    if-lez v8, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v8, "\u06d8\u06e0"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x61

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x68e9

    const v10, -0x80f1025

    xor-int/2addr v9, v10

    const v10, -0x44008928

    goto :goto_0

    .line 51
    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v8, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v8, :cond_8

    goto/16 :goto_3

    .line 104
    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_3

    .line 123
    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    const/4 p0, 0x0

    return p0

    .line 169
    :sswitch_5
    iput-wide v3, p0, Ll/ۢۢۡ;->᩶:J

    return v2

    :sswitch_6
    const/4 p0, 0x0

    return p0

    :sswitch_7
    return v2

    .line 168
    :sswitch_8
    invoke-static {}, Ll/ۗۚ;->ᩴۧ᩺()J

    move-result-wide v8

    cmp-long v10, v8, v0

    if-lez v10, :cond_1

    const-string v8, "\u1a78\u06e1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x71f3

    const v10, 0x69cdf525

    xor-int/2addr v9, v10

    const v10, 0x15b3ece7

    goto :goto_0

    :cond_1
    const-string v8, "\u1a79\u06d7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2cd1

    const v10, 0x2c9147a3

    xor-int/2addr v9, v10

    const v10, -0x5f3daa82

    goto :goto_0

    :sswitch_9
    const-wide/16 v3, 0x0

    cmp-long v8, v0, v3

    if-nez v8, :cond_2

    const-string v8, "\u06d6\u06df"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x370b

    const v10, 0x871adc8

    xor-int/2addr v9, v10

    const v10, -0x743cab26

    goto/16 :goto_0

    :cond_2
    const-string v8, "\u1a77\u073a"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2959

    const v10, 0x21f41deb

    xor-int/2addr v9, v10

    const v10, 0x111ca40d

    goto/16 :goto_0

    :sswitch_a
    const/4 v2, 0x1

    .line 23
    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v8, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v8, "\u1a7a\u1a76"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2b31

    const v10, 0x2ed98a81

    xor-int/2addr v9, v10

    const v10, 0x3eaebcdf

    goto/16 :goto_0

    :sswitch_b
    sget v8, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v8, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v8, "\u06e7\u1a75"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6565

    const v10, 0x410c47a0

    xor-int/2addr v9, v10

    const v10, -0x399c5a00    # -14569.5f

    goto/16 :goto_0

    .line 57
    :sswitch_c
    sget v8, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v8, :cond_5

    goto :goto_1

    :cond_5
    const-string v8, "\u05a1\u1a73"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x7b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7efb

    const v10, -0x381790e1

    xor-int/2addr v9, v10

    const v10, 0x74ea4272

    goto/16 :goto_0

    :sswitch_d
    sget v8, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v8, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v8, "\u1a73\u1a79"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x5b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5047

    const v10, -0x5f15386d

    xor-int/2addr v9, v10

    const v10, 0x53ead99b

    goto/16 :goto_0

    .line 118
    :sswitch_e
    sget v8, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v8, :cond_7

    goto :goto_2

    :cond_7
    const-string v8, "\u05a1\u06d7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x37

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4361

    const v10, -0x16957e11

    xor-int/2addr v9, v10

    const v10, -0x6d617143    # -1.000639E-27f

    goto/16 :goto_0

    :cond_8
    :goto_1
    const-string v8, "\u06eb\u1a75"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x2f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5a7b

    const v10, 0x4777eef7

    xor-int/2addr v9, v10

    const v10, 0x1e509421

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06da\u06d7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3d2b

    const v10, -0x616a8e2

    xor-int/2addr v9, v10

    const v10, -0x4b49f141

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v8, :cond_b

    :cond_a
    const-string v8, "\u06dc\u06da"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x25

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4c27

    const v10, 0x5365a8b7

    xor-int/2addr v9, v10

    const v10, -0x44397575

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u1a7b\u06eb"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6a2b

    const v10, -0x60b14800

    xor-int/2addr v9, v10

    const v10, -0x2e62d372

    goto/16 :goto_0

    .line 115
    :sswitch_10
    sget-boolean v8, Ll/֨۫;->۬᩷᩶:Z

    if-nez v8, :cond_c

    :goto_2
    const-string v8, "\u073a\u1a78"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x29c3

    const v10, -0x30697817

    xor-int/2addr v9, v10

    const v10, -0x2f1206c8

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u06db\u06df"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2ec9

    const v10, 0x717c70ab

    xor-int/2addr v9, v10

    const v10, -0x719b000b

    goto/16 :goto_0

    .line 140
    :sswitch_11
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_3

    :cond_d
    const-string v8, "\u06d7\u06e8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5669

    const v10, 0x13d88674

    xor-int/2addr v9, v10

    const v10, -0x4f2c6120

    goto/16 :goto_0

    .line 164
    :sswitch_12
    iget-wide v0, p0, Ll/ۢۢۡ;->᩶:J

    .line 109
    sget v8, Ll/᩹;->ۤܿܳ:I

    if-eqz v8, :cond_e

    :goto_3
    const-string v8, "\u1a75\u06db"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x41

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2f93

    const v10, 0x5ad8fb89

    xor-int/2addr v9, v10

    const v10, -0x1d646989

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u073d\u06d9"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x6f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5761

    const v10, -0x2ef9334

    xor-int/2addr v9, v10

    const v10, 0x2754da6e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6f553337 -> :sswitch_a
        -0x698d5420 -> :sswitch_b
        -0x65fad179 -> :sswitch_d
        -0x60530eff -> :sswitch_4
        -0x5db21da3 -> :sswitch_2
        -0x533e3091 -> :sswitch_11
        -0x4ef83115 -> :sswitch_0
        -0x3957aa12 -> :sswitch_4
        -0x37b7cadc -> :sswitch_d
        -0x30d00ed8 -> :sswitch_1
        -0x2e294243 -> :sswitch_1
        -0x2aa3e7d1 -> :sswitch_e
        -0x2a9b0de5 -> :sswitch_12
        -0x275241ca -> :sswitch_f
        -0x19e5214a -> :sswitch_10
        -0x15d6bc42 -> :sswitch_7
        -0x9f70b59 -> :sswitch_6
        -0x5327447 -> :sswitch_11
        -0x3594984 -> :sswitch_12
        -0x100a178 -> :sswitch_2
        0x3bdf51d -> :sswitch_a
        0x7f4c8c3 -> :sswitch_f
        0xe80f440 -> :sswitch_3
        0x1c5cede9 -> :sswitch_7
        0x379a05a6 -> :sswitch_0
        0x3828670f -> :sswitch_b
        0x3d8ecf23 -> :sswitch_8
        0x41bc23b3 -> :sswitch_3
        0x41f68401 -> :sswitch_5
        0x47d60509 -> :sswitch_8
        0x4e85c9b0 -> :sswitch_6
        0x5f473e4e -> :sswitch_9
        0x615f1858 -> :sswitch_c
        0x682b18f2 -> :sswitch_e
        0x745a1a23 -> :sswitch_5
        0x7a85d531 -> :sswitch_10
        0x7ab94777 -> :sswitch_c
        0x7f54ff65 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x149ada73

    sget v8, Ll/֨۬;->۫ۙ᩺:I

    sget v9, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v10, "\u06db\u1a74"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6c33

    const v12, 0x4f1664f7

    xor-int/2addr v11, v12

    const v12, 0x7f2ff9c

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0xcb7

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 311
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v10, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v10, :cond_1

    goto/16 :goto_b

    :sswitch_0
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v10, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v10, :cond_19

    goto/16 :goto_8

    :sswitch_1
    sget v10, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v10, :cond_0

    goto/16 :goto_9

    :cond_0
    const-string v10, "\u1a78\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xa2d

    const v12, -0x6777f73c

    xor-int/2addr v11, v12

    const v12, -0x2e0e5637

    goto :goto_0

    .line 406
    :sswitch_2
    sget-boolean v10, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v10, :cond_e

    goto :goto_2

    .line 373
    :sswitch_3
    sget v10, Ll/֡᩶;->ܳܶ۠:I

    if-lez v10, :cond_14

    goto/16 :goto_a

    .line 470
    :sswitch_4
    sget v10, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v10, :cond_12

    :cond_1
    :goto_2
    const-string v10, "\u06d6\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0xf

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7217

    const v12, -0x67e81d1f

    xor-int/2addr v11, v12

    const v12, -0x7e09aeb6

    goto :goto_0

    .line 319
    :sswitch_5
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v10, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v10, :cond_16

    goto :goto_3

    .line 71
    :sswitch_6
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v10, Ll/֨᩺;->ۨ֨۬:I

    if-lez v10, :cond_10

    goto :goto_3

    :sswitch_7
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    :goto_3
    const-string v10, "\u06e2\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xbb7

    const v12, 0x426383b8

    xor-int/2addr v11, v12

    const v12, -0x2997e573

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 p1, 0x0

    return p1

    :sswitch_9
    return v6

    :sswitch_a
    return v2

    .line 465
    :sswitch_b
    iput-boolean v2, p0, Ll/ۢۢۡ;->ۢ֫:Z

    .line 466
    invoke-direct {p0, p1}, Ll/ۢۢۡ;->֫(Landroid/view/MotionEvent;)V

    return v2

    :sswitch_c
    if-ne v0, v3, :cond_3

    goto :goto_4

    .line 472
    :sswitch_d
    iput-boolean v1, p0, Ll/ۢۢۡ;->ۢ֫:Z

    return v2

    :sswitch_e
    if-ne v0, v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u073f\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7623

    const v12, -0x170117a8

    xor-int/2addr v11, v12

    const v12, -0xa6ec6e5

    goto/16 :goto_0

    .line 478
    :sswitch_f
    iput-boolean v1, p0, Ll/ۢۢۡ;->ۢ֫:Z

    return v6

    :sswitch_10
    if-ne v0, v3, :cond_3

    goto/16 :goto_6

    .line 483
    :sswitch_11
    invoke-direct {p0, p1}, Ll/ۢۢۡ;->ᩳ(Landroid/view/MotionEvent;)V

    return v2

    .line 462
    :sswitch_12
    invoke-direct {p0, p1}, Ll/ۢۢۡ;->ܽ(Landroid/view/MotionEvent;)Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    const-string v10, "\u0730\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x33a1

    const v12, -0x4fdd7f2f

    xor-int/2addr v11, v12

    const v12, 0x5ba47782

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u06e1\u06d9"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6b31

    const v12, 0x72376e5e

    xor-int/2addr v11, v12

    const v12, 0x373f752d

    goto/16 :goto_0

    :sswitch_13
    if-eq v0, v2, :cond_5

    const-string v10, "\u073d\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6f9f

    const v12, -0x673c46f6

    xor-int/2addr v11, v12

    const v12, 0x29197c2d

    goto/16 :goto_0

    :cond_5
    :goto_4
    const-string v10, "\u06d9\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x71fb

    const v12, -0x348c68e

    xor-int/2addr v11, v12

    const v12, -0x48692eb5

    goto/16 :goto_0

    .line 476
    :sswitch_14
    invoke-virtual {p0, p1}, Ll/ۢۢۡ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v6

    if-eq v0, v2, :cond_6

    const-string v10, "\u1a79\u06d9"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x637f

    const v12, 0x4ebbb8df

    xor-int/2addr v11, v12

    const v12, -0x7c5a0253

    goto/16 :goto_0

    :cond_6
    :goto_5
    const-string v10, "\u06e1\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xbf9

    const v12, -0xf5cbd24

    xor-int/2addr v11, v12

    const v12, -0x5e4e71e0

    goto/16 :goto_0

    :sswitch_15
    if-eq v0, v2, :cond_7

    const-string v10, "\u06e7\u1a76"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x64e9

    const v12, -0x6a6ac40

    xor-int/2addr v11, v12

    const v12, 0x6cbce517

    goto/16 :goto_0

    :cond_7
    :goto_6
    const-string v10, "\u05a1\u1a76"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4a67

    const v12, 0x23d2bb6e

    xor-int/2addr v11, v12

    const v12, -0x4aa0f7cd

    goto/16 :goto_0

    .line 377
    :sswitch_16
    iget-object v10, p0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    invoke-virtual {v10, v4, v5}, Ll/ܳ᩸ۡ;->ۧ(FF)Z

    move-result v10

    if-eqz v10, :cond_a

    const-string v10, "\u05ab\u1a78"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6037

    const v12, -0x777d5528

    xor-int/2addr v11, v12

    const v12, 0x3fa2d69c

    goto/16 :goto_0

    :sswitch_17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 406
    sget v10, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v10, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v10, "\u073f\u1a76"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x719

    const v12, -0x376f5ffd

    xor-int/2addr v11, v12

    const v12, -0x1d253e48

    goto/16 :goto_0

    .line 487
    :sswitch_18
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 470
    :sswitch_19
    invoke-direct {p0, p1}, Ll/ۢۢۡ;->ܽ(Landroid/view/MotionEvent;)Z

    move-result v10

    if-eqz v10, :cond_9

    const-string v10, "\u1a77\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1291

    const v12, -0x3a2efc0a

    xor-int/2addr v11, v12

    const v12, 0x4db5889a    # 3.80703552E8f

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a79\u073d"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x47

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2b0b

    const v12, -0x237755d9

    xor-int/2addr v11, v12

    const v12, 0x7ab48a04

    goto/16 :goto_0

    .line 481
    :sswitch_1a
    iget-boolean v10, p0, Ll/ۢۢۡ;->ܿ֫:Z

    if-eqz v10, :cond_a

    const-string v10, "\u1a7a\u0736"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4dad

    const v12, 0x361065a6

    xor-int/2addr v11, v12

    const v12, -0x4b3495d9

    goto/16 :goto_0

    .line 459
    :sswitch_1b
    invoke-direct {p0, p1}, Ll/ۢۢۡ;->ᩳ(Landroid/view/MotionEvent;)V

    .line 460
    iput-boolean v1, p0, Ll/ۢۢۡ;->ۢ֫:Z

    .line 377
    invoke-direct {p0}, Ll/ۢۢۡ;->ܿ()Z

    move-result v10

    if-eqz v10, :cond_a

    const-string v10, "\u05a8\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6ed1

    const v12, -0x10f7c839

    xor-int/2addr v11, v12

    const v12, -0x34cad014    # -1.1874284E7f

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u1a78\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x13

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2ab1

    const v12, 0x300c2b4a

    xor-int/2addr v11, v12

    const v12, -0x552e5143

    goto/16 :goto_0

    .line 469
    :sswitch_1c
    iget-boolean v3, p0, Ll/ۢۢۡ;->ۢ֫:Z

    const/4 v10, 0x3

    if-eqz v3, :cond_b

    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v9

    mul-int/lit8 v3, v3, -0x3f

    xor-int v11, v3, v8

    mul-int/lit16 v11, v11, 0x64f5

    const v12, 0x2ed073fa

    xor-int/2addr v11, v12

    const v12, 0x6f8bcff2

    goto :goto_7

    :cond_b
    const-string v3, "\u073d\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v9

    xor-int v11, v3, v8

    mul-int/lit16 v11, v11, 0x4d05

    const v12, 0x7bee536c

    xor-int/2addr v11, v12

    const v12, -0x58556b26

    :goto_7
    xor-int/2addr v3, v12

    move v10, v3

    const/4 v3, 0x3

    goto/16 :goto_1

    :sswitch_1d
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_c

    const-string v10, "\u06d7\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x373f

    const v12, -0x65d4b7a7

    xor-int/2addr v11, v12

    const v12, 0x6a539236

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u06d8\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x5529

    const v12, 0x353b72b1

    xor-int/2addr v11, v12

    const v12, 0x205b3d76

    goto/16 :goto_0

    .line 457
    :sswitch_1e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 430
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v10

    if-eqz v10, :cond_d

    goto/16 :goto_c

    :cond_d
    const-string v10, "\u06df\u06e0"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x149

    const v12, -0x275f1f00

    xor-int/2addr v11, v12

    const v12, -0x4f2cfc25

    goto/16 :goto_0

    .line 109
    :sswitch_1f
    sget v10, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v10, :cond_f

    :cond_e
    :goto_8
    const-string v10, "\u1a75\u06e7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1723

    const v12, -0x6012a0ec

    xor-int/2addr v11, v12

    const v12, -0x9f38078

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u06d9\u06eb"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x4f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4dc3

    const v12, -0x5b0f2056

    xor-int/2addr v11, v12

    const v12, 0x4720d776

    goto/16 :goto_0

    :sswitch_20
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v10

    if-eqz v10, :cond_11

    :cond_10
    :goto_9
    const-string v10, "\u06da\u06df"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1e71

    const v12, -0x19080bf6

    xor-int/2addr v11, v12

    const v12, -0x15e32fb

    goto/16 :goto_0

    :cond_11
    const-string v10, "\u1a79\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x2b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6041

    const v12, -0x45116e3c

    xor-int/2addr v11, v12

    const v12, -0x2d327cc6

    goto/16 :goto_0

    .line 423
    :sswitch_21
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v10

    if-nez v10, :cond_13

    :cond_12
    :goto_a
    const-string v10, "\u1a74\u06da"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3d9b

    const v12, -0x2a15915b

    xor-int/2addr v11, v12

    const v12, 0x4bae2dc1    # 2.2829954E7f

    goto/16 :goto_0

    :cond_13
    const-string v10, "\u1a7b\u1a75"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x49

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x71c5

    const v12, -0x2141b38e

    xor-int/2addr v11, v12

    const v12, -0x75b5cc3a

    goto/16 :goto_0

    .line 268
    :sswitch_22
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v10

    if-eqz v10, :cond_15

    :cond_14
    const-string v10, "\u06eb\u0733"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x61

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5307

    const v12, 0x6abc3be

    xor-int/2addr v11, v12

    const v12, -0x7f48034f

    goto/16 :goto_0

    :cond_15
    const-string v10, "\u1a7b\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x61

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x37c3

    const v12, -0x457fc1f6

    xor-int/2addr v11, v12

    const v12, 0x571da46f

    goto/16 :goto_0

    .line 427
    :sswitch_23
    sget v10, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v10, :cond_17

    :cond_16
    :goto_b
    const-string v10, "\u06d6\u073f"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2f1

    const v12, -0x33c3565b    # -4.9456788E7f

    xor-int/2addr v11, v12

    const v12, -0x66056569

    goto/16 :goto_0

    :cond_17
    const-string v10, "\u06e7\u073a"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2335

    const v12, 0x2ca8e990

    xor-int/2addr v11, v12

    const v12, -0x3ff8eeea

    goto/16 :goto_0

    .line 445
    :sswitch_24
    sget v10, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v10, :cond_18

    goto :goto_c

    :cond_18
    const-string v10, "\u06ec\u06d6"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7b27

    const v12, 0x1cc60540

    xor-int/2addr v11, v12

    const v12, -0x41da5923

    goto/16 :goto_0

    .line 398
    :sswitch_25
    sget-boolean v10, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v10, :cond_1a

    :cond_19
    const-string v10, "\u1a77\u06e2"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1829

    const v12, 0x3c7ad147

    xor-int/2addr v11, v12

    const v12, -0x2e77b04b

    goto/16 :goto_0

    :cond_1a
    const-string v10, "\u06e8\u06d7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3c0d

    const v12, -0x5ce9f758

    xor-int/2addr v11, v12

    const v12, -0x572b2c20

    goto/16 :goto_0

    :sswitch_26
    sget v10, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v10, :cond_1b

    :goto_c
    const-string v10, "\u0730\u06d8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x17

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x17b7

    const v12, 0x4da8b534    # 3.53805952E8f

    xor-int/2addr v11, v12

    const v12, 0x19d41cef

    goto/16 :goto_0

    :cond_1b
    const-string v10, "\u1a77\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x5d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x740b

    const v12, 0x46c9ead8

    xor-int/2addr v11, v12

    const v12, -0x54214cf3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ee26378 -> :sswitch_10
        -0x74dd3e1b -> :sswitch_e
        -0x73f99712 -> :sswitch_1a
        -0x72c2b86d -> :sswitch_0
        -0x723fb9eb -> :sswitch_d
        -0x6fd0eaca -> :sswitch_21
        -0x6f3f903c -> :sswitch_22
        -0x6e88ef81 -> :sswitch_1b
        -0x6e81b98a -> :sswitch_6
        -0x667fc21b -> :sswitch_11
        -0x63eae869 -> :sswitch_18
        -0x63e3377e -> :sswitch_e
        -0x6292712c -> :sswitch_13
        -0x6229b7d5 -> :sswitch_9
        -0x5f8dd8d4 -> :sswitch_6
        -0x5c84c5c8 -> :sswitch_13
        -0x547bd8c5 -> :sswitch_b
        -0x53300bb4 -> :sswitch_2
        -0x4c3d3667 -> :sswitch_10
        -0x47a8200e -> :sswitch_1d
        -0x422438f2 -> :sswitch_11
        -0x40ad78fe -> :sswitch_1f
        -0x404c1a49 -> :sswitch_0
        -0x3c4e614d -> :sswitch_17
        -0x377c3413 -> :sswitch_22
        -0x32f0e2ff -> :sswitch_2
        -0x3205901f -> :sswitch_1c
        -0x31af9739 -> :sswitch_c
        -0x299c81c1 -> :sswitch_4
        -0x26f08cca -> :sswitch_1
        -0x25ff5c87 -> :sswitch_21
        -0x211339bd -> :sswitch_8
        -0x1f6dd599 -> :sswitch_1c
        -0x1c0c6d13 -> :sswitch_1d
        -0x15ac676b -> :sswitch_26
        -0x157d1fda -> :sswitch_19
        -0xbfbf715 -> :sswitch_c
        -0x577d025 -> :sswitch_14
        -0x5658dc5 -> :sswitch_5
        -0x2ddb0c1 -> :sswitch_24
        -0xb0e902 -> :sswitch_1f
        0x8d82ed8 -> :sswitch_18
        0xb292355 -> :sswitch_8
        0xe6ad025 -> :sswitch_b
        0xf7bb35f -> :sswitch_16
        0x10ad74f9 -> :sswitch_15
        0x13009fb0 -> :sswitch_7
        0x13b53bd4 -> :sswitch_1e
        0x1826f275 -> :sswitch_25
        0x1830570b -> :sswitch_9
        0x1baecd6a -> :sswitch_3
        0x210c0638 -> :sswitch_14
        0x31f9b1ef -> :sswitch_26
        0x3230d7c0 -> :sswitch_1e
        0x37261b79 -> :sswitch_12
        0x389803e2 -> :sswitch_f
        0x3ae0fc42 -> :sswitch_24
        0x3d07d1ab -> :sswitch_17
        0x4512ec21 -> :sswitch_4
        0x48548700 -> :sswitch_20
        0x4a0be7f6 -> :sswitch_1a
        0x4ad218c0 -> :sswitch_3
        0x4c10dbcb -> :sswitch_f
        0x4d0b37f5 -> :sswitch_25
        0x4ebf8ae4 -> :sswitch_1
        0x5320890e -> :sswitch_a
        0x5384f247 -> :sswitch_23
        0x5969d82b -> :sswitch_15
        0x5a37b605 -> :sswitch_d
        0x5b01c348 -> :sswitch_20
        0x5ec85635 -> :sswitch_16
        0x5f90c110 -> :sswitch_19
        0x62d74eb6 -> :sswitch_1b
        0x67051f85 -> :sswitch_23
        0x6d858fa5 -> :sswitch_5
        0x705fd123 -> :sswitch_a
        0x70880997 -> :sswitch_7
        0x74d2cedc -> :sswitch_12
    .end sparse-switch
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 44

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, -0x28d1bec6

    sget v34, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v35, Ll/ۙۨ;->ۡۗۙ:I

    const-string v36, "\u05ab\u05a8"

    invoke-static/range {v36 .. v36}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v36

    add-int v36, v36, v34

    mul-int/lit8 v36, v36, 0x1d

    xor-int v1, v36, v35

    mul-int/lit16 v1, v1, -0x3ba7

    const v38, 0x1e239873

    xor-int v1, v1, v38

    const v38, -0x6e3c48f5

    xor-int v36, v36, v38

    move-object v3, v2

    move-object v15, v10

    move/from16 v37, v36

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v16, -0x28d1bec6

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    :goto_0
    xor-int v11, v16, v35

    mul-int/lit16 v11, v11, 0x36e5

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v1, v37, v1

    sparse-switch v1, :sswitch_data_0

    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    .line 303
    iget v9, v0, Ll/ۢۢۡ;->ۤ:I

    :goto_1
    move/from16 v26, v9

    goto/16 :goto_a

    .line 161
    :sswitch_0
    sget v11, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v11, :cond_1

    move/from16 v37, v1

    :cond_0
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    goto/16 :goto_12

    :cond_1
    const-string v11, "\u06ec\u06e2"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v34

    mul-int/lit8 v11, v11, -0x15

    move/from16 v37, v1

    xor-int v1, v11, v35

    mul-int/lit16 v1, v1, -0x1cc1

    const v16, 0x1e5df23

    xor-int v1, v1, v16

    const v16, 0x5e706697

    xor-int v11, v11, v16

    move/from16 v16, v37

    move/from16 v37, v11

    goto :goto_0

    :sswitch_1
    move/from16 v37, v1

    .line 187
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    goto/16 :goto_11

    :sswitch_2
    move/from16 v37, v1

    .line 65
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_3

    goto :goto_2

    :cond_3
    move-object/from16 v40, v3

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    goto/16 :goto_4

    :sswitch_3
    move/from16 v37, v1

    .line 11
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v1

    if-gez v1, :cond_5

    :cond_4
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    goto/16 :goto_15

    :cond_5
    :goto_2
    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v11, v1, v35

    mul-int/lit16 v11, v11, 0x184f

    const v16, 0x13ce3659

    xor-int v11, v11, v16

    const v16, -0x29286617

    xor-int v1, v1, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v1, v11

    goto/16 :goto_0

    :sswitch_4
    move/from16 v37, v1

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v1

    if-gez v1, :cond_0

    :goto_3
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    goto/16 :goto_8

    :sswitch_5
    move/from16 v37, v1

    .line 145
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    goto/16 :goto_6

    :cond_7
    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    goto/16 :goto_10

    :sswitch_6
    move/from16 v37, v1

    .line 10
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_4

    goto :goto_3

    :sswitch_7
    move/from16 v37, v1

    .line 149
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v1, :cond_6

    goto :goto_3

    :sswitch_8
    move/from16 v37, v1

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto :goto_3

    :sswitch_9
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    return-void

    :sswitch_a
    move/from16 v37, v1

    float-to-int v1, v9

    sub-float v11, v4, v21

    int-to-float v1, v1

    move/from16 v39, v9

    add-float v9, v1, v31

    .line 311
    invoke-virtual {v3, v11, v1, v4, v9}, Ll/ܳ᩸ۡ;->֫(FFFF)V

    move-object/from16 v40, v3

    move/from16 v3, v38

    move-object/from16 v11, p1

    move v3, v12

    move/from16 v12, v24

    move/from16 v41, v13

    move v13, v1

    move v1, v14

    move v14, v4

    move-object/from16 v42, v15

    move v15, v9

    move-object/from16 v16, v42

    .line 312
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    move-object/from16 v15, v42

    goto/16 :goto_1c

    :sswitch_b
    move/from16 v37, v1

    move-object/from16 v40, v3

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    .line 309
    invoke-static {v8, v10}, Ll/֨۫;->ۗܺܶ(II)I

    move-result v9

    int-to-float v9, v9

    mul-float v9, v9, v32

    .line 295
    sget v11, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v11, :cond_8

    :goto_4
    const-string v11, "\u073f\u06ec"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, -0x404b

    const v13, 0xae39a4c

    xor-int/2addr v12, v13

    const v13, -0x21fe18aa

    goto :goto_5

    :cond_8
    const-string v11, "\u1a78\u1a75"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v34, v11

    mul-int/lit8 v11, v11, 0x5b

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x4ad3

    const v13, 0x48400de3

    xor-int/2addr v12, v13

    const v13, -0x6b2bab0a

    :goto_5
    xor-int/2addr v11, v13

    move v14, v1

    move v1, v12

    move/from16 v16, v37

    move/from16 v13, v41

    goto/16 :goto_e

    :sswitch_c
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    sub-float v9, v25, v31

    int-to-float v10, v8

    div-float v32, v9, v10

    .line 309
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v10

    sget v9, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v9, :cond_9

    :goto_6
    const-string v9, "\u073d\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v35, v9

    mul-int/lit8 v9, v9, 0x7b

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, 0x6def

    const v12, -0x6ee9e109

    xor-int/2addr v11, v12

    const v12, -0x1916c691

    goto :goto_7

    :cond_9
    const-string v9, "\u06e0\u06d8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v34

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, 0x522b

    const v12, -0x19aa51d8

    xor-int/2addr v11, v12

    const v12, -0x2a66c859

    :goto_7
    xor-int/2addr v9, v12

    move v14, v1

    move v12, v3

    move v1, v11

    move/from16 v16, v37

    move-object/from16 v3, v40

    move/from16 v13, v41

    move-object/from16 v15, v42

    goto/16 :goto_c

    :sswitch_d
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move-object/from16 v42, v15

    float-to-int v9, v2

    shl-int/lit8 v9, v9, 0x18

    or-int v9, v27, v9

    .line 307
    invoke-virtual {v15, v9}, Landroid/graphics/Paint;->setColor(I)V

    .line 308
    iget v9, v0, Ll/ۢۢۡ;->ۛ:F

    .line 53
    sget v11, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v11, :cond_a

    move/from16 v31, v9

    goto/16 :goto_9

    :cond_a
    const-string v11, "\u0736\u06e1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v35, v11

    mul-int/lit8 v11, v11, 0x41

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, 0xaf9

    const v13, -0x52e80ccb

    xor-int/2addr v12, v13

    const v13, -0x4cfdaada

    xor-int/2addr v11, v13

    move v14, v1

    move/from16 v31, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    move/from16 v13, v41

    goto/16 :goto_14

    :sswitch_e
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    and-int v2, v28, v29

    int-to-float v2, v2

    mul-float v2, v2, v6

    sget v9, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v9, :cond_b

    :goto_8
    const-string v9, "\u06dc\u06e1"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, 0x1d9b

    const v12, 0x54200d17

    xor-int/2addr v11, v12

    const v12, -0x704deb7c

    goto/16 :goto_b

    :cond_b
    const-string v9, "\u073a\u06d6"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, 0x463f

    const v12, 0x7c6bf572

    xor-int/2addr v11, v12

    const v12, 0x3b420ba9    # 0.0029609f

    goto :goto_b

    :sswitch_f
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    and-int v27, v26, v18

    ushr-int/lit8 v28, v26, 0x18

    const/16 v29, 0xff

    .line 266
    sget-boolean v9, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v9, :cond_c

    :goto_9
    const-string v9, "\u06e8\u1a75"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    mul-int/lit8 v9, v9, 0x23

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x65ef

    const v12, -0x2666fa8a

    xor-int/2addr v11, v12

    const v12, 0x5bdfe667

    goto :goto_b

    :cond_c
    const-string v9, "\u05a1\u1a78"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v34

    xor-int v11, v9, v35

    mul-int/lit16 v11, v11, -0x2fab

    const v12, 0x7165cf8a

    xor-int/2addr v11, v12

    const v12, -0x31630c49

    goto :goto_b

    :sswitch_10
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    .line 303
    sget v9, Ll/᩹֡᩷;->֫:I

    goto/16 :goto_1

    :goto_a
    const-string v9, "\u06db\u073a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v35

    mul-int/lit8 v9, v9, -0x9

    xor-int v11, v9, v34

    mul-int/lit16 v11, v11, -0x2a01

    const v12, 0x6166ca7e

    xor-int/2addr v11, v12

    const v12, -0x2fbe9acf

    :goto_b
    xor-int/2addr v9, v12

    move v14, v1

    move v12, v3

    move v1, v11

    move/from16 v16, v37

    move-object/from16 v3, v40

    move/from16 v13, v41

    :goto_c
    move/from16 v37, v9

    goto/16 :goto_28

    :sswitch_11
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    int-to-float v6, v3

    const/high16 v9, 0x43960000    # 300.0f

    div-float/2addr v6, v9

    sub-float v6, v5, v6

    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    goto/16 :goto_22

    :sswitch_12
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    int-to-float v9, v7

    move/from16 v14, v36

    int-to-float v11, v14

    div-float/2addr v9, v11

    const/high16 v11, 0x40600000    # 3.5f

    cmpl-float v9, v9, v11

    if-lez v9, :cond_d

    move/from16 v36, v14

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v13, v41

    move v14, v1

    goto/16 :goto_17

    :cond_d
    move/from16 v16, v1

    move/from16 v36, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move/from16 v9, v41

    move v14, v2

    goto/16 :goto_20

    :sswitch_13
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v41, v13

    move v1, v14

    move/from16 v14, v36

    int-to-float v4, v1

    sub-float v24, v4, v22

    move/from16 v9, v41

    int-to-float v13, v9

    const/16 v16, 0x0

    move-object/from16 v11, p1

    move/from16 v12, v24

    move/from16 v25, v13

    move/from16 v13, v16

    move v14, v4

    move-object/from16 v42, v15

    move/from16 v15, v25

    move-object/from16 v16, v42

    .line 301
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 303
    iget-boolean v11, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-eqz v11, :cond_e

    const-string v11, "\u06eb\u1a76"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v34, v11

    mul-int/lit8 v11, v11, -0x73

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, 0x7733

    const v13, 0x5bade21a

    xor-int/2addr v12, v13

    const v13, 0x24ee86a3

    goto :goto_d

    :cond_e
    const-string v11, "\u0733\u1a73"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    mul-int/lit8 v11, v11, -0x1f

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, 0x4011

    const v13, 0x3bfd6a8a

    xor-int/2addr v12, v13

    const v13, -0x34c19361    # -1.2479647E7f

    :goto_d
    xor-int/2addr v11, v13

    move v14, v1

    move v13, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    :goto_e
    move-object/from16 v15, v42

    goto/16 :goto_14

    :sswitch_14
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move-object/from16 v42, v15

    .line 299
    iget v11, v0, Ll/ۢۢۡ;->ۨ:F

    mul-float v22, v11, v6

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v12

    if-eqz v12, :cond_f

    move/from16 v21, v11

    move-object/from16 v15, v42

    goto/16 :goto_12

    :cond_f
    const-string v12, "\u05a1\u06db"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v35

    xor-int v13, v12, v34

    mul-int/lit16 v13, v13, 0x4035

    const v14, -0x3482df66    # -1.6588954E7f

    xor-int/2addr v13, v14

    const v14, 0x43954101

    xor-int/2addr v12, v14

    move v14, v1

    move/from16 v21, v11

    move v1, v13

    move/from16 v16, v37

    move-object/from16 v15, v42

    :goto_f
    move v13, v9

    move/from16 v37, v12

    goto/16 :goto_1d

    :sswitch_15
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move-object/from16 v42, v15

    shl-int/lit8 v11, v20, 0x18

    or-int v11, v11, v19

    .line 298
    invoke-virtual {v15, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 135
    sget-boolean v11, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v11, :cond_10

    :goto_10
    const-string v11, "\u06d9\u06db"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    xor-int v12, v11, v34

    mul-int/lit16 v12, v12, -0x665b

    const v13, -0x4cbf5322

    xor-int/2addr v12, v13

    const v13, -0x3f638dad

    goto/16 :goto_13

    :cond_10
    const-string v11, "\u06eb\u1a73"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    mul-int/lit8 v11, v11, 0x21

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x3585

    const v13, 0x54152b12

    xor-int/2addr v12, v13

    const v13, -0x119c8808

    goto/16 :goto_13

    :sswitch_16
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    and-int/lit16 v12, v11, 0xff

    int-to-float v12, v12

    mul-float v12, v12, v6

    float-to-int v12, v12

    .line 225
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v13

    if-eqz v13, :cond_11

    move/from16 v20, v12

    :goto_11
    const-string v12, "\u06ec\u1a73"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v35, v12

    mul-int/lit8 v12, v12, -0x55

    xor-int v13, v12, v34

    mul-int/lit16 v13, v13, 0x71c3

    const v14, 0x7d9d2a52

    xor-int/2addr v13, v14

    const v14, 0x5f0fad7f

    goto/16 :goto_16

    :cond_11
    const-string v13, "\u06d7\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x1675

    const v16, 0x1ee40217

    xor-int v14, v14, v16

    const v16, -0x267f799a

    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v20, v12

    goto/16 :goto_1b

    :sswitch_17
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    and-int v19, v17, v18

    ushr-int/lit8 v38, v17, 0x18

    .line 306
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v11

    if-eqz v11, :cond_12

    :goto_12
    const-string v11, "\u05a8\u06e8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x10f3

    const v13, 0x2b40fd89

    xor-int/2addr v12, v13

    const v13, 0x4b52fa6

    goto :goto_13

    :cond_12
    const-string v11, "\u06e8\u0730"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v34

    mul-int/lit8 v11, v11, -0x35

    xor-int v12, v11, v35

    mul-int/lit16 v12, v12, -0x3a83

    const v13, -0x1976a43c

    xor-int/2addr v12, v13

    const v13, 0x71a38635

    :goto_13
    xor-int/2addr v11, v13

    move v14, v1

    move v13, v9

    move v1, v12

    move/from16 v16, v37

    move/from16 v9, v39

    :goto_14
    move v12, v3

    move/from16 v37, v11

    goto/16 :goto_1e

    :sswitch_18
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    const/4 v12, 0x1

    .line 293
    iput-boolean v12, v0, Ll/ۢۢۡ;->ۧ֫:Z

    .line 294
    iget v12, v0, Ll/ۢۢۡ;->᩺:I

    const v18, 0xffffff

    .line 63
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v13

    if-nez v13, :cond_13

    move/from16 v17, v12

    :goto_15
    const-string v12, "\u06e4\u06dc"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v34, v12

    mul-int/lit8 v12, v12, 0x7

    xor-int v13, v12, v35

    mul-int/lit16 v13, v13, -0x5699

    const v14, -0x56f2ab5b

    xor-int/2addr v13, v14

    const v14, 0x3014dfe8

    :goto_16
    xor-int/2addr v12, v14

    move v14, v1

    move/from16 v38, v11

    move v1, v13

    move/from16 v16, v37

    goto/16 :goto_f

    :cond_13
    const-string v13, "\u1a79\u06df"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x30cd

    const v16, -0x4465698c

    xor-int v14, v14, v16

    const v16, -0x3dd59a44

    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v17, v12

    goto/16 :goto_1b

    :sswitch_19
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    .line 326
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    move/from16 v12, v33

    goto/16 :goto_19

    :sswitch_1a
    return-void

    :sswitch_1b
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v9, v13

    move v1, v14

    move/from16 v11, v38

    move/from16 v12, v33

    add-int/lit16 v3, v12, -0x5dc

    const/16 v13, 0x12c

    if-ge v3, v13, :cond_14

    const-string v13, "\u1a7b\u05a1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, 0x2ee1

    const v16, -0xd153e0f

    xor-int v14, v14, v16

    const v16, 0x4263466

    goto/16 :goto_1a

    :cond_14
    move/from16 v16, v1

    move v14, v2

    move/from16 v33, v12

    move/from16 v13, v30

    goto/16 :goto_1f

    :sswitch_1c
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move/from16 v12, v33

    move/from16 v11, v38

    .line 289
    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    .line 290
    invoke-static/range {p0 .. p0}, Ll/ۘۨ;->᩶᩸ܶ(Ljava/lang/Object;)I

    move-result v14

    .line 291
    invoke-static/range {p0 .. p0}, Ll/ۨ;->ۢ᩺ۙ(Ljava/lang/Object;)I

    move-result v13

    .line 292
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-nez v1, :cond_15

    const-string v1, "\u1a76\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x5b

    xor-int v9, v1, v35

    mul-int/lit16 v9, v9, 0x7a6b

    const v16, 0x7b812115

    xor-int v9, v9, v16

    const v16, 0x696984ef

    goto :goto_18

    :cond_15
    :goto_17
    const-string v1, "\u06d6\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v9, v1, v35

    mul-int/lit16 v9, v9, -0x8d5

    const v16, -0x537664d0

    xor-int v9, v9, v16

    const v16, -0x47c4dafe

    :goto_18
    xor-int v1, v1, v16

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v16, v37

    move/from16 v37, v1

    move v12, v3

    move v1, v9

    move/from16 v9, v39

    goto/16 :goto_1e

    :sswitch_1d
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    .line 325
    iget-boolean v13, v0, Ll/ۢۢۡ;->ۧ֫:Z

    if-eqz v13, :cond_16

    const-string v13, "\u1a7b\u06ec"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x1f29

    const v16, 0x1f2b2f9e

    xor-int v14, v14, v16

    const v16, 0x712297c4

    goto/16 :goto_1a

    :cond_16
    :goto_19
    const-string v13, "\u06d7\u073a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v34

    mul-int/lit8 v13, v13, -0x31

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, -0x2da1

    const v16, 0x68d5f8ef

    xor-int v14, v14, v16

    const v16, 0x18c9da72

    goto/16 :goto_1a

    :sswitch_1e
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    const/16 v13, 0x5dc

    if-gt v12, v13, :cond_17

    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    goto/16 :goto_21

    :cond_17
    const-string v13, "\u1a79\u073a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v35

    xor-int v14, v13, v34

    mul-int/lit16 v14, v14, -0x3bdf

    const v16, 0xefbac54

    xor-int v14, v14, v16

    const v16, -0x618a50a7

    goto :goto_1a

    :sswitch_1f
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    const/4 v6, 0x0

    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    goto/16 :goto_22

    :sswitch_20
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v12, v33

    move/from16 v11, v38

    if-lez v8, :cond_18

    const-string v13, "\u073a\u1a74"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v34, v13

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v35

    mul-int/lit16 v14, v14, 0x2601

    const v16, -0x28435568

    xor-int v14, v14, v16

    const v16, 0x40b1e1b2

    :goto_1a
    xor-int v13, v13, v16

    move/from16 v38, v11

    move/from16 v33, v12

    :goto_1b
    move/from16 v16, v37

    move v12, v3

    move/from16 v37, v13

    move-object/from16 v3, v40

    move v13, v9

    move/from16 v9, v39

    move/from16 v43, v14

    move v14, v1

    move/from16 v1, v43

    goto/16 :goto_0

    :cond_18
    move/from16 v16, v1

    move v14, v2

    move/from16 v13, v30

    goto/16 :goto_20

    :sswitch_21
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move v1, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    .line 341
    iput-boolean v13, v0, Ll/ۢۢۡ;->ۧ֫:Z

    .line 342
    invoke-virtual/range {v40 .. v40}, Ll/ܳ᩸ۡ;->֫()V

    :goto_1c
    const-string v14, "\u0733\u06e0"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int v14, v14, v35

    move/from16 v16, v1

    xor-int v1, v14, v34

    mul-int/lit16 v1, v1, 0x3331

    const v30, 0x721a9afe

    xor-int v1, v1, v30

    const v30, -0x793f2589

    xor-int v14, v14, v30

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v30, v13

    move v12, v3

    move v13, v9

    move/from16 v9, v39

    move-object/from16 v3, v40

    move/from16 v43, v37

    move/from16 v37, v14

    goto/16 :goto_25

    :sswitch_22
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v11, v38

    .line 269
    invoke-static {}, Ll/ۗ᩺;->ᩳۗۚ()J

    move-result-wide v41

    move v14, v2

    iget-wide v1, v0, Ll/ۢۢۡ;->᩷֫:J

    sub-long v1, v41, v1

    long-to-int v2, v1

    if-ltz v2, :cond_19

    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, -0x6f

    xor-int v12, v1, v34

    mul-int/lit16 v12, v12, -0x75b7

    const v30, -0x109258d2

    xor-int v12, v12, v30

    const v30, -0x7d2bb83

    xor-int v1, v1, v30

    move/from16 v33, v2

    move/from16 v38, v11

    move/from16 v30, v13

    move v2, v14

    move/from16 v14, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v13, v9

    move v1, v12

    :goto_1d
    move/from16 v9, v39

    move v12, v3

    :goto_1e
    move-object/from16 v3, v40

    goto/16 :goto_0

    :cond_19
    move/from16 v33, v2

    :goto_1f
    move v12, v3

    const-string v1, "\u06d9\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x5f

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, -0x48a1

    const v3, 0x772d5f23

    xor-int/2addr v2, v3

    const v3, 0x4b98a3b3    # 2.0006758E7f

    xor-int/2addr v1, v3

    move/from16 v38, v11

    move/from16 v30, v13

    move-object/from16 v3, v40

    move v13, v9

    move/from16 v9, v39

    goto/16 :goto_24

    :sswitch_23
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    .line 284
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v7

    .line 285
    invoke-static/range {p0 .. p0}, Ll/֨۬;->۟ܰۚ(Ljava/lang/Object;)I

    move-result v1

    sub-int v8, v7, v1

    .line 287
    invoke-virtual/range {p0 .. p0}, Ll/ۢۢۡ;->֫()I

    move-result v36

    if-lez v1, :cond_1a

    const-string v1, "\u1a7b\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x7d

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x2e0d

    const v30, 0x6042972c

    xor-int v2, v2, v30

    const v30, -0x7c4f7357

    goto/16 :goto_23

    :cond_1a
    :goto_20
    const-string v1, "\u1a77\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x6b

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, -0x12b3

    const v30, -0x18731c0e

    xor-int v2, v2, v30

    const v30, -0x7c133ab8

    goto/16 :goto_23

    :sswitch_24
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    .line 266
    invoke-direct/range {p0 .. p0}, Ll/ۢۢۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto/16 :goto_21

    :cond_1b
    const-string v1, "\u0736\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, -0x5b33

    const v30, -0x2c2b0d4a

    xor-int v2, v2, v30

    const v30, 0x27cca527

    goto/16 :goto_23

    :sswitch_25
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    cmpg-float v1, v6, v23

    if-gtz v1, :cond_1c

    move/from16 v30, v13

    move-object/from16 v2, v40

    goto/16 :goto_26

    :cond_1c
    const-string v1, "\u1a75\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0x7627

    const v30, 0x4a61b662    # 3698072.5f

    xor-int v2, v2, v30

    const v30, 0x4070a9b3

    goto :goto_23

    :sswitch_26
    move/from16 v37, v1

    move-object/from16 v40, v3

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v13, v30

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    const/16 v23, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    if-nez v1, :cond_1d

    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x7b

    xor-int v2, v1, v35

    mul-int/lit16 v2, v2, 0x6c13

    const v30, -0x6495afbe

    xor-int v2, v2, v30

    const v30, -0x3eedcd93

    goto :goto_23

    :cond_1d
    :goto_21
    move v6, v5

    :goto_22
    const-string v1, "\u06e8\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v2, v1, v34

    mul-int/lit16 v2, v2, 0x4bb9

    const v30, 0x443cd587

    xor-int v2, v2, v30

    const v30, 0x5f3889db

    :goto_23
    xor-int v1, v1, v30

    move/from16 v38, v11

    move/from16 v33, v12

    move/from16 v30, v13

    move v12, v3

    move v13, v9

    move/from16 v9, v39

    move-object/from16 v3, v40

    :goto_24
    move/from16 v43, v37

    move/from16 v37, v1

    move v1, v2

    move v2, v14

    :goto_25
    move/from16 v14, v16

    move/from16 v16, v43

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v40, v3

    move/from16 v13, v30

    .line 341
    iput-boolean v13, v0, Ll/ۢۢۡ;->ۧ֫:Z

    .line 342
    invoke-virtual/range {v40 .. v40}, Ll/ܳ᩸ۡ;->֫()V

    return-void

    :sswitch_28
    move/from16 v37, v1

    move/from16 v39, v9

    move v3, v12

    move v9, v13

    move/from16 v16, v14

    move/from16 v12, v33

    move/from16 v11, v38

    move v14, v2

    .line 260
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->draw(Landroid/graphics/Canvas;)V

    .line 261
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩳ֫:Z

    const/16 v30, 0x0

    iget-object v2, v0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    if-nez v1, :cond_1e

    :goto_26
    const-string v1, "\u06e4\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v13, v1, v34

    mul-int/lit16 v13, v13, -0x716f

    const v33, 0x1772adbb

    xor-int v13, v13, v33

    const v33, -0x23de36de

    :goto_27
    xor-int v1, v1, v33

    move/from16 v38, v11

    move/from16 v33, v12

    move v12, v3

    move-object v3, v2

    move v2, v14

    move/from16 v14, v16

    move/from16 v16, v37

    move/from16 v37, v1

    move v1, v13

    move v13, v9

    :goto_28
    move/from16 v9, v39

    goto/16 :goto_0

    :cond_1e
    const-string v1, "\u1a75\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, 0x27

    xor-int v13, v1, v35

    mul-int/lit16 v13, v13, -0x30b7

    const v33, 0x7946bffe

    xor-int v13, v13, v33

    const v33, -0x6fb60177

    goto :goto_27

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a031c39 -> :sswitch_3
        -0x77cec2c3 -> :sswitch_23
        -0x75057c05 -> :sswitch_5
        -0x7136c827 -> :sswitch_28
        -0x70fd2016 -> :sswitch_1c
        -0x6b98a7c7 -> :sswitch_20
        -0x5f841d46 -> :sswitch_1d
        -0x5f2b11a1 -> :sswitch_19
        -0x59a5cf4f -> :sswitch_25
        -0x56f6ee3f -> :sswitch_9
        -0x5632481a -> :sswitch_1e
        -0x49d1c193 -> :sswitch_14
        -0x4751b50e -> :sswitch_13
        -0x4732b588 -> :sswitch_1b
        -0x3e2109d6 -> :sswitch_11
        -0x333bfcfb -> :sswitch_1e
        -0x331e6976 -> :sswitch_21
        -0x3275b173 -> :sswitch_10
        -0x31c37583 -> :sswitch_23
        -0x2bc88f95 -> :sswitch_7
        -0x258dd890 -> :sswitch_1a
        -0x1c4f7d56 -> :sswitch_f
        -0x1b6d7f06 -> :sswitch_17
        -0x19d8884f -> :sswitch_6
        -0x1880126c -> :sswitch_2
        -0x13882c18 -> :sswitch_28
        -0x74521e5 -> :sswitch_3
        -0x727c2ae -> :sswitch_16
        -0x6e122cc -> :sswitch_6
        -0x688e575 -> :sswitch_5
        -0x28e67b6 -> :sswitch_1
        -0xc47daa -> :sswitch_15
        0x256096 -> :sswitch_a
        0x1779ed5 -> :sswitch_22
        0x1ede83b -> :sswitch_7
        0x399b452 -> :sswitch_12
        0x5c2d4ac -> :sswitch_21
        0xd00d666 -> :sswitch_1
        0xe232ee4 -> :sswitch_27
        0xe72ee9e -> :sswitch_9
        0x1048b2e0 -> :sswitch_0
        0x1df933b5 -> :sswitch_d
        0x1e133090 -> :sswitch_1b
        0x1eb5d2a8 -> :sswitch_14
        0x1fe498ce -> :sswitch_c
        0x229ed020 -> :sswitch_11
        0x2707b761 -> :sswitch_1a
        0x2bcb6194 -> :sswitch_1d
        0x2c09d72e -> :sswitch_15
        0x2c0b3355 -> :sswitch_a
        0x2e048cc3 -> :sswitch_1c
        0x2f784d5d -> :sswitch_b
        0x34f262f8 -> :sswitch_d
        0x360df829 -> :sswitch_10
        0x3674e5d9 -> :sswitch_18
        0x3c6fed6f -> :sswitch_26
        0x3d24f54f -> :sswitch_24
        0x3dda6bac -> :sswitch_0
        0x3ec2fb34 -> :sswitch_26
        0x40d3215d -> :sswitch_e
        0x43beedd5 -> :sswitch_27
        0x4a05e3c2 -> :sswitch_20
        0x4d16a52c -> :sswitch_4
        0x510f6560 -> :sswitch_18
        0x579a72d5 -> :sswitch_19
        0x5898580b -> :sswitch_4
        0x5ab713ce -> :sswitch_1f
        0x5bd6f642 -> :sswitch_b
        0x5dee2400 -> :sswitch_22
        0x5e861efd -> :sswitch_24
        0x652e2a9b -> :sswitch_13
        0x667b58b3 -> :sswitch_c
        0x6776c725 -> :sswitch_e
        0x67d5431d -> :sswitch_16
        0x6b7cd578 -> :sswitch_12
        0x6e8f62af -> :sswitch_17
        0x732dabb8 -> :sswitch_f
        0x78d6e86b -> :sswitch_8
        0x79838a50 -> :sswitch_25
        0x7bcb7b30 -> :sswitch_1f
        0x7ce0bcec -> :sswitch_2
        0x7d3dd40d -> :sswitch_8
    .end sparse-switch
.end method

.method public final isFastScrollEnabled()Z
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ۢۢۡ;->ᩳ֫:Z

    return v0
.end method

.method public final layoutChildren()V
    .locals 6

    const v0, -0x6d3bc7e1

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v3, "\u06e1\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7573

    const v5, -0x48b364d4

    xor-int/2addr v4, v5

    const v5, -0xde46972

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1f59

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 333
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v3, :cond_b

    goto/16 :goto_4

    .line 63
    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v3, :cond_5

    goto :goto_1

    .line 376
    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_9

    goto :goto_1

    .line 592
    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    :goto_1
    const-string v3, "\u06df\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x618b

    const v5, -0x43631a3e

    xor-int/2addr v4, v5

    const v5, 0x559df2ae

    goto :goto_0

    .line 138
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    :sswitch_4
    return-void

    .line 734
    :sswitch_5
    :try_start_0
    invoke-super {p0}, Landroid/widget/ListView;->layoutChildren()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const-string v3, "\u06db\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x242f

    const v5, -0x7400b20c

    xor-int/2addr v4, v5

    const v5, 0x5e061634

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u06da\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d73

    const v5, -0x19ddf852

    xor-int/2addr v4, v5

    const v5, 0x8e3837f

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e0\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1fa1

    const v5, -0x4014242a

    xor-int/2addr v4, v5

    const v5, 0x12c1e769

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073a\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x205d

    const v5, -0x46efbe66

    xor-int/2addr v4, v5

    const v5, 0xef4c110

    goto/16 :goto_0

    .line 645
    :sswitch_9
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_3

    :goto_2
    const-string v3, "\u0733\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x873

    const v5, 0x62e031c2

    xor-int/2addr v4, v5

    const v5, -0x27b8cabe

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x54d1

    const v5, -0x1fe623fb

    xor-int/2addr v4, v5

    const v5, 0x1c41b962

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06eb\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b4f

    const v5, -0x59b57c0

    xor-int/2addr v4, v5

    const v5, 0x4dc619

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    :goto_3
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6fcb

    const v5, 0x775063ab

    xor-int/2addr v4, v5

    const v5, 0x10de263b

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e1\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4eb3

    const v5, -0x77414f39

    xor-int/2addr v4, v5

    const v5, -0x6f31ca40

    goto/16 :goto_0

    .line 406
    :sswitch_c
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06e4\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4f2b

    const v5, 0x428cbce6

    xor-int/2addr v4, v5

    const v5, -0x44c20af8

    goto/16 :goto_0

    .line 615
    :sswitch_d
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5171

    const v5, 0x21d893

    xor-int/2addr v4, v5

    const v5, -0x21033d39

    goto/16 :goto_0

    .line 610
    :sswitch_e
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a7b\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x49c9

    const v5, -0x1555b021

    xor-int/2addr v4, v5

    const v5, 0x252614ec

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x725f

    const v5, -0x97d4b86

    xor-int/2addr v4, v5

    const v5, -0x7367d59e

    goto/16 :goto_0

    .line 148
    :sswitch_f
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d7\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x532d

    const v5, -0x6a7f353

    xor-int/2addr v4, v5

    const v5, 0x7ada59ad

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14b

    const v5, -0x6f42639e

    xor-int/2addr v4, v5

    const v5, -0x5c6b07a6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cafd931 -> :sswitch_9
        -0x730e4e76 -> :sswitch_0
        -0x6e380ecb -> :sswitch_f
        -0x6de44553 -> :sswitch_e
        -0x63c66ec4 -> :sswitch_0
        -0x5954ecb0 -> :sswitch_3
        -0x57756486 -> :sswitch_e
        -0x4c81c439 -> :sswitch_3
        -0x418c77d8 -> :sswitch_a
        -0x41899530 -> :sswitch_d
        -0x3f9352e5 -> :sswitch_5
        -0x3cfc6f90 -> :sswitch_f
        -0x3c39f6be -> :sswitch_2
        -0x2b028dfb -> :sswitch_1
        -0x1951c3ef -> :sswitch_9
        -0xe256cb2 -> :sswitch_1
        -0xbdde290 -> :sswitch_6
        -0x55d85a4 -> :sswitch_8
        -0x3aeb28a -> :sswitch_5
        -0x1af081a -> :sswitch_4
        -0x127ec65 -> :sswitch_4
        0x44b351a -> :sswitch_c
        0x72c1a77 -> :sswitch_7
        0x11b7d13b -> :sswitch_b
        0x1fa454ad -> :sswitch_d
        0x204947a3 -> :sswitch_7
        0x249ce0f6 -> :sswitch_a
        0x2f480075 -> :sswitch_2
        0x33abc4e9 -> :sswitch_6
        0x47e8dce1 -> :sswitch_8
        0x687108c5 -> :sswitch_c
        0x74a3294d -> :sswitch_b
    .end sparse-switch
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 23

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

    const/4 v15, 0x0

    const v16, -0x2a963c2b

    sget v17, Ll/֡᩶;->ܳܶ۠:I

    sget v18, Ll/۠;->ܺܺܶ:I

    const-string v19, "\u06e2\u073d"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, 0x5d

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, 0x6a81

    const v21, -0x630a91d

    xor-int v1, v1, v21

    const v21, -0x1f592536

    xor-int v19, v19, v21

    move-object v4, v3

    move-object v15, v14

    move/from16 v20, v19

    const/4 v2, 0x0

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

    const/16 v16, 0x0

    const v19, -0x2a963c2b

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v18

    mul-int/lit16 v3, v3, -0x658d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    .line 130
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v1, :cond_3

    :cond_0
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_b

    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-gez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_a

    .line 16
    :sswitch_1
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-gez v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u1a79\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x15

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x17b5

    const v20, 0x21da2b74

    xor-int v3, v3, v20

    const v20, 0x7f16b758

    goto/16 :goto_6

    :cond_3
    const-string v1, "\u1a79\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x6249

    const v20, 0x561fad3

    xor-int v3, v3, v20

    const v20, -0x7f2c615f

    goto/16 :goto_6

    .line 324
    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_e

    .line 562
    :sswitch_3
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v1, :cond_0

    goto :goto_2

    .line 369
    :sswitch_4
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_9

    goto :goto_2

    :sswitch_5
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto :goto_2

    .line 289
    :sswitch_6
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    const/4 v1, 0x0

    return v1

    .line 671
    :sswitch_7
    iget v1, v0, Ll/ۢۢۡ;->۫:I

    invoke-virtual {v15, v2, v1}, Ll/۬ۧ֫;->֫(II)V

    goto/16 :goto_3

    .line 674
    :sswitch_8
    invoke-static/range {p0 .. p0}, Ll/֫᩹;->᩵֫ۛ(Ljava/lang/Object;)V

    .line 675
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return v2

    .line 673
    :sswitch_9
    iput v5, v0, Ll/ۢۢۡ;->ۖ֫:F

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u073d\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x23

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0xef9

    const v20, 0x1b6257ff

    xor-int v3, v3, v20

    const v20, -0x40544ca3

    goto/16 :goto_6

    :sswitch_a
    iget v1, v4, Ll/ܳ᩸ۡ;->ܿ:F

    iget v3, v0, Ll/ۢۢۡ;->ۗ:F

    sub-float v5, v1, v3

    .line 200
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_6

    :goto_2
    const-string v1, "\u06e4\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x3b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x499f

    const v20, -0x7e465d3

    xor-int v3, v3, v20

    const v20, -0x6a0221a8

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06db\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0xb9f

    const v20, -0x6e4b8d14

    xor-int v3, v3, v20

    const v20, -0xa2f050d

    goto/16 :goto_6

    .line 667
    :sswitch_b
    iput-boolean v6, v0, Ll/ۢۢۡ;->ۜ֫:Z

    .line 668
    iput-boolean v2, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    .line 669
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->ۧ(Landroid/view/MotionEvent;)V

    .line 670
    iget-object v15, v0, Ll/ۢۢۡ;->۬:Ll/۬ۧ֫;

    if-eqz v15, :cond_7

    const-string v1, "\u1a79\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x1f11

    const v20, 0x66f114f

    xor-int v3, v3, v20

    const v20, -0x72ecad8b

    goto/16 :goto_6

    :cond_7
    :goto_3
    const-string v1, "\u1a76\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1359

    const v20, -0x387129ba

    xor-int v3, v3, v20

    const v20, 0x5b918553

    goto/16 :goto_6

    :sswitch_c
    mul-int v1, v14, v14

    int-to-float v1, v1

    cmpl-float v1, v13, v1

    if-lez v1, :cond_8

    const-string v1, "\u06e0\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x3667

    const v20, -0x2b0d9f09

    xor-int v3, v3, v20

    const v20, 0x70d4bb10

    goto/16 :goto_6

    :cond_8
    move/from16 v20, v5

    move/from16 v3, v21

    goto/16 :goto_9

    :sswitch_d
    mul-float v1, v11, v11

    add-float v13, v1, v12

    .line 665
    iget v14, v0, Ll/ۢۢۡ;->ۡ֫:I

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_a

    :cond_9
    :goto_4
    const-string v1, "\u06ec\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x71

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4fd

    const v20, 0x1b5bf55d

    xor-int v3, v3, v20

    const v20, 0x6496517e

    goto/16 :goto_6

    :cond_a
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x3f

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x7ddd

    const v20, -0x28c92921

    xor-int v3, v3, v20

    const v20, 0x37b3d18a

    goto/16 :goto_6

    .line 664
    :sswitch_e
    iget v1, v0, Ll/ۢۢۡ;->ۗ:F

    sub-float v11, v10, v1

    mul-float v12, v9, v9

    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    const-string v1, "\u1a78\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x4b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x605d

    const v20, -0x49da6209

    xor-int v3, v3, v20

    const v20, -0xb4cca01

    goto/16 :goto_6

    :sswitch_f
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    .line 39
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v1

    if-gtz v1, :cond_c

    goto/16 :goto_1

    :cond_c
    const-string v1, "\u06e2\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0xb0d

    const v20, -0x32cb2005

    xor-int v3, v3, v20

    const v20, -0x5d8f37d1

    goto :goto_6

    :sswitch_10
    sub-float v9, v7, v8

    .line 45
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_d

    :goto_5
    const-string v1, "\u1a76\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x65

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x3bcf

    const v20, -0x78b74e6b

    xor-int v3, v3, v20

    const v20, 0x172eef33

    goto :goto_6

    :cond_d
    const-string v1, "\u1a7a\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x79f9

    const v20, -0x7cc22e3

    xor-int v3, v3, v20

    const v20, -0x6d81823f

    goto :goto_6

    .line 663
    :sswitch_11
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    iget v8, v0, Ll/ۢۢۡ;->ۙ:F

    .line 489
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_1

    :cond_e
    const-string v1, "\u1a76\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x6f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x2cd9

    const v20, 0x9f79588

    xor-int v3, v3, v20

    const v20, -0x997e526

    :goto_6
    xor-int v20, v1, v20

    goto/16 :goto_d

    :sswitch_12
    const/4 v1, 0x3

    move/from16 v3, v21

    if-eq v3, v1, :cond_f

    goto :goto_7

    :cond_f
    move/from16 v20, v5

    goto/16 :goto_8

    :sswitch_13
    move/from16 v3, v21

    .line 662
    iget-boolean v1, v0, Ll/ۢۢۡ;->ۜ֫:Z

    if-eqz v1, :cond_10

    const-string v1, "\u073d\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1f

    move/from16 v20, v5

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x23c7

    const v21, 0x692e155

    xor-int v5, v5, v21

    const v21, -0x779746fb

    goto/16 :goto_f

    :cond_10
    :goto_7
    move/from16 v20, v5

    goto/16 :goto_9

    .line 653
    :sswitch_14
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->֫(Landroid/view/MotionEvent;)V

    .line 654
    iput-boolean v2, v0, Ll/ۢۢۡ;->ۢ֫:Z

    return v2

    :sswitch_15
    move/from16 v20, v5

    move/from16 v3, v21

    .line 658
    iput-boolean v2, v0, Ll/ۢۢۡ;->ۜ֫:Z

    goto/16 :goto_9

    :sswitch_16
    move/from16 v20, v5

    move/from16 v3, v21

    const/4 v1, 0x2

    if-eq v3, v1, :cond_11

    const-string v1, "\u1a79\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x625f

    const v21, 0x79eba835

    xor-int v5, v5, v21

    const v21, -0x346d454b    # -1.9232106E7f

    goto/16 :goto_f

    :cond_11
    const-string v1, "\u05a8\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x15

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x201

    const v21, -0x2bd43e8b

    xor-int v5, v5, v21

    const v21, 0x5b7f9321

    goto/16 :goto_f

    :sswitch_17
    move/from16 v20, v5

    move/from16 v3, v21

    .line 682
    iput-boolean v6, v0, Ll/ۢۢۡ;->ۜ֫:Z

    goto/16 :goto_9

    :sswitch_18
    move/from16 v20, v5

    move/from16 v3, v21

    .line 652
    iget v1, v0, Ll/ۢۢۡ;->ۙ:F

    iget v5, v0, Ll/ۢۢۡ;->ۗ:F

    invoke-virtual {v4, v1, v5}, Ll/ܳ᩸ۡ;->ۧ(FF)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x33

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x269d

    const v21, 0x21fa712e

    xor-int v5, v5, v21

    const v21, -0x17b4935f

    goto/16 :goto_f

    :cond_12
    const-string v1, "\u0733\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2b8d

    const v21, 0x3cdb966d

    xor-int v5, v5, v21

    const v21, 0x54d12ddc

    goto/16 :goto_f

    .line 686
    :sswitch_19
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_1a
    move/from16 v20, v5

    move/from16 v3, v21

    const/4 v6, 0x0

    if-eq v3, v2, :cond_13

    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x6a97

    const v21, -0x3bf1771a

    xor-int v5, v5, v21

    const v21, -0x125dd051

    goto/16 :goto_f

    :cond_13
    :goto_8
    const-string v1, "\u06dc\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x73

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x5209

    const v21, -0x492025c6

    xor-int v5, v5, v21

    const v21, 0x367401ff    # 3.6359995E-6f

    goto/16 :goto_f

    :sswitch_1b
    move/from16 v20, v5

    move/from16 v1, v16

    move/from16 v3, v21

    .line 650
    iput v1, v0, Ll/ۢۢۡ;->ۗ:F

    .line 651
    iget v5, v0, Ll/ۢۢۡ;->ۙ:F

    invoke-virtual {v4, v5, v1}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v5

    if-eqz v5, :cond_14

    const-string v5, "\u1a73\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v17

    move/from16 v16, v1

    xor-int v1, v5, v18

    mul-int/lit16 v1, v1, 0x7cb1

    const v21, 0x681cd31e

    xor-int v1, v1, v21

    const v21, -0x73408593

    xor-int v5, v5, v21

    move/from16 v21, v3

    move/from16 v22, v20

    move/from16 v20, v5

    goto/16 :goto_10

    :cond_14
    move/from16 v16, v1

    :goto_9
    const-string v1, "\u1a77\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x47

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2931

    const v21, -0x414ca9e

    xor-int v5, v5, v21

    const v21, 0x10d3bda8

    goto/16 :goto_f

    :sswitch_1c
    move/from16 v20, v5

    move/from16 v3, v21

    .line 650
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v16

    .line 551
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v1

    if-ltz v1, :cond_15

    :goto_a
    const-string v1, "\u1a77\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x32b3

    const v21, -0x5d803930

    xor-int v5, v5, v21

    const v21, 0x66aaf38d

    goto/16 :goto_f

    :cond_15
    const-string v1, "\u06ec\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x4127

    const v21, 0x71c11c29

    xor-int v5, v5, v21

    const v21, 0x276de5a1

    goto/16 :goto_f

    :sswitch_1d
    move/from16 v20, v5

    move/from16 v3, v21

    .line 649
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/ۢۢۡ;->ۙ:F

    .line 618
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_16

    :goto_b
    const-string v1, "\u06d9\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0xbeb

    const v21, 0x681a8ffd

    xor-int v5, v5, v21

    const v21, 0x1bc72218

    goto/16 :goto_f

    :cond_16
    const-string v1, "\u1a73\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x17

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x350d

    const v21, 0xdd4d0f9

    xor-int v5, v5, v21

    const v21, 0x8d48877

    goto/16 :goto_f

    .line 644
    :sswitch_1e
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_1f
    move/from16 v20, v5

    .line 647
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v21

    iget-object v4, v0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    if-eqz v21, :cond_17

    const-string v1, "\u073f\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x177f

    const v5, 0x5b19f47a

    xor-int/2addr v3, v5

    const v5, -0x52af67fb

    goto :goto_c

    :cond_17
    const-string v1, "\u06eb\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x45

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x5fbd

    const v5, 0x77076815

    xor-int/2addr v3, v5

    const v5, 0x768f7d20

    :goto_c
    xor-int/2addr v1, v5

    move/from16 v5, v20

    move/from16 v20, v1

    :goto_d
    move v1, v3

    goto/16 :goto_0

    :sswitch_20
    return v2

    :sswitch_21
    move/from16 v20, v5

    move/from16 v3, v21

    .line 643
    invoke-direct/range {p0 .. p0}, Ll/ۢۢۡ;->ܿ()Z

    move-result v1

    if-nez v1, :cond_18

    const-string v1, "\u06df\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, -0x67c3

    const v21, -0x15a74096

    xor-int v5, v5, v21

    const v21, 0x25f27692

    goto/16 :goto_f

    :cond_18
    const-string v1, "\u06ec\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x7453

    const v21, 0x30eae93c

    xor-int v5, v5, v21

    const v21, 0x22f9c092

    goto :goto_f

    :sswitch_22
    move/from16 v20, v5

    move/from16 v3, v21

    .line 638
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_19

    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x3d

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x1d3

    const v21, 0x24a6b11

    xor-int v5, v5, v21

    const v21, -0x360af133

    goto :goto_f

    :cond_19
    const-string v1, "\u06d8\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x3f

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x3885

    const v21, -0x24523b28

    xor-int v5, v5, v21

    const v21, 0x655870ca

    goto :goto_f

    :sswitch_23
    move/from16 v20, v5

    move/from16 v3, v21

    .line 453
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_1a

    :goto_e
    const-string v1, "\u1a77\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x6d9d

    const v21, -0x6cda576

    xor-int v5, v5, v21

    const v21, 0x731f793d

    goto :goto_f

    :cond_1a
    const-string v1, "\u06e1\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x45

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x76fd

    const v21, 0x5da14c5c

    xor-int v5, v5, v21

    const v21, -0x11f3f80f

    :goto_f
    xor-int v1, v1, v21

    move/from16 v21, v3

    move/from16 v22, v20

    move/from16 v20, v1

    move v1, v5

    :goto_10
    move/from16 v5, v22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72d2e274 -> :sswitch_19
        -0x6f5d1d6d -> :sswitch_7
        -0x6cf627fa -> :sswitch_1f
        -0x6ce04192 -> :sswitch_23
        -0x6bc0c3ca -> :sswitch_22
        -0x684886a4 -> :sswitch_6
        -0x6736499c -> :sswitch_18
        -0x6381c3d5 -> :sswitch_e
        -0x60182859 -> :sswitch_22
        -0x52f38e45 -> :sswitch_15
        -0x50d1fd04 -> :sswitch_21
        -0x509f04b5 -> :sswitch_9
        -0x48ede5d4 -> :sswitch_16
        -0x488e5b55 -> :sswitch_f
        -0x3edb6e31 -> :sswitch_b
        -0x3c315777 -> :sswitch_13
        -0x3a8eb42c -> :sswitch_4
        -0x373256e8 -> :sswitch_f
        -0x325eae71 -> :sswitch_6
        -0x2bdba9c0 -> :sswitch_d
        -0x2a1c46aa -> :sswitch_16
        -0x29f3535b -> :sswitch_18
        -0x285f79b3 -> :sswitch_7
        -0x259fb59a -> :sswitch_2
        -0x249a393a -> :sswitch_9
        -0x22dc72ec -> :sswitch_21
        -0x215c438c -> :sswitch_10
        -0x1de3072b -> :sswitch_17
        -0x1b80ce70 -> :sswitch_0
        -0x1adef16b -> :sswitch_15
        -0x1a2379cd -> :sswitch_1d
        -0x193ce07a -> :sswitch_12
        -0x1685f30d -> :sswitch_a
        -0x159d84cf -> :sswitch_a
        -0x139e53ac -> :sswitch_10
        -0x1380eae5 -> :sswitch_8
        -0x81f6f36 -> :sswitch_1a
        -0xa2cbfc -> :sswitch_1b
        0x6017550 -> :sswitch_3
        0x6df04fb -> :sswitch_14
        0xbc77557 -> :sswitch_1c
        0x12a40d83 -> :sswitch_23
        0x15b8b02c -> :sswitch_1f
        0x1dd34d35 -> :sswitch_2
        0x2238e59c -> :sswitch_0
        0x26009fd2 -> :sswitch_17
        0x26ba7227 -> :sswitch_11
        0x29acade2 -> :sswitch_3
        0x2b51557b -> :sswitch_4
        0x2b644ac8 -> :sswitch_1a
        0x2db126ee -> :sswitch_13
        0x358bc99b -> :sswitch_20
        0x372b9e6e -> :sswitch_1
        0x3923ed97 -> :sswitch_1e
        0x3b397266 -> :sswitch_5
        0x4085455c -> :sswitch_1
        0x456b37b7 -> :sswitch_b
        0x4a622a0e -> :sswitch_19
        0x4d9f0b66 -> :sswitch_e
        0x552c540a -> :sswitch_20
        0x55550d1c -> :sswitch_14
        0x5604a880 -> :sswitch_1c
        0x573a5dc2 -> :sswitch_d
        0x633967c6 -> :sswitch_5
        0x66eea558 -> :sswitch_c
        0x699443e4 -> :sswitch_8
        0x6f0cb843 -> :sswitch_1b
        0x73e0409a -> :sswitch_11
        0x74707d26 -> :sswitch_c
        0x7a6130e9 -> :sswitch_12
        0x7f42420f -> :sswitch_1e
        0x7f505386 -> :sswitch_1d
    .end sparse-switch
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    const v0, -0x38b9cb72

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v3, "\u06eb\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x64b3

    const v5, 0xe747aa3

    xor-int/2addr v4, v5

    const v5, 0x4cf24fde    # 1.27041264E8f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7b2d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 252
    invoke-super/range {p0 .. p5}, Landroid/widget/ListView;->onLayout(ZIIII)V

    if-eqz p1, :cond_0

    const-string v3, "\u06d8\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7315

    const v5, -0x340fb9fc    # -3.1493128E7f

    xor-int/2addr v4, v5

    const v5, -0x15f2ab2d

    goto :goto_0

    .line 42
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_b

    goto/16 :goto_6

    :sswitch_1
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_6

    goto/16 :goto_6

    .line 90
    :sswitch_2
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v3, :cond_8

    goto/16 :goto_6

    .line 181
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    goto/16 :goto_6

    .line 56
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    return-void

    :sswitch_5
    const/4 v3, 0x1

    .line 254
    iput v3, p0, Ll/ۢۢۡ;->ܺ֫:I

    goto :goto_1

    :sswitch_6
    return-void

    :cond_0
    :goto_1
    const-string v3, "\u0733\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2a25

    const v5, 0x68e8430e

    xor-int/2addr v4, v5

    const v5, 0x10562565

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u06d8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a7b

    const v5, 0x77442904

    xor-int/2addr v4, v5

    const v5, -0xc4f16a9

    goto :goto_0

    .line 135
    :sswitch_8
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_2

    :goto_2
    const-string v3, "\u0733\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4bbf

    const v5, 0x1e099ed6

    xor-int/2addr v4, v5

    const v5, -0x62a2cf5c

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x25ef

    const v5, 0x471bdcd1

    xor-int/2addr v4, v5

    const v5, 0x64dd6741

    goto/16 :goto_0

    .line 109
    :sswitch_9
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v3, "\u1a77\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4421

    const v5, 0x6f0353d

    xor-int/2addr v4, v5

    const v5, -0x4a062dcf

    goto/16 :goto_0

    .line 183
    :sswitch_a
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06db\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2f0b

    const v5, -0x4a84f054

    xor-int/2addr v4, v5

    const v5, -0x2b8ad988

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_4

    :cond_5
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5a69

    const v5, 0x27c33129

    xor-int/2addr v4, v5

    const v5, 0x83cd55e

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u073f\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x69bf

    const v5, -0x6c4423f9

    xor-int/2addr v4, v5

    const v5, -0x4abcd4c5

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a75\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x56e3

    const v5, 0x98d1f85

    xor-int/2addr v4, v5

    const v5, -0x47c9f36c

    goto/16 :goto_0

    .line 76
    :sswitch_d
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5205

    const v5, -0x5e75d7dd

    xor-int/2addr v4, v5

    const v5, 0x933e622

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x471d

    const v5, -0x57e474c2

    xor-int/2addr v4, v5

    const v5, -0x1291aa53    # -4.610063E27f

    goto/16 :goto_0

    .line 99
    :sswitch_e
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06d6\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c0d

    const v5, 0x6ad0b8d5

    xor-int/2addr v4, v5

    const v5, 0x101b031e

    goto/16 :goto_0

    .line 100
    :sswitch_f
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06e8\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x31f3

    const v5, 0xe6c3494

    xor-int/2addr v4, v5

    const v5, -0x10500606

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d41

    const v5, -0x573e3c42

    xor-int/2addr v4, v5

    const v5, -0x65bfc3ca

    goto/16 :goto_0

    .line 213
    :sswitch_10
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_d

    :goto_6
    const-string v3, "\u05ab\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x34d1

    const v5, 0x57dbfc8d

    xor-int/2addr v4, v5

    const v5, -0x7c72a206

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5013

    const v5, -0x53c7bd96

    xor-int/2addr v4, v5

    const v5, 0x1d6cb707

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6977a992 -> :sswitch_b
        -0x692e5f63 -> :sswitch_e
        -0x59c473f3 -> :sswitch_3
        -0x58c8d2f0 -> :sswitch_a
        -0x52cf09e0 -> :sswitch_4
        -0x4b025924 -> :sswitch_e
        -0x48e63cee -> :sswitch_f
        -0x18388548 -> :sswitch_b
        -0x1641ecaa -> :sswitch_9
        -0x15aa0598 -> :sswitch_7
        0x969cd84 -> :sswitch_0
        0xd6af2d2 -> :sswitch_d
        0xd845965 -> :sswitch_c
        0xf90ce4a -> :sswitch_10
        0x1216b1c6 -> :sswitch_7
        0x1ae45fb1 -> :sswitch_a
        0x23b69964 -> :sswitch_6
        0x32557f2a -> :sswitch_0
        0x3c5da97f -> :sswitch_6
        0x3ea6b83a -> :sswitch_d
        0x40a7929a -> :sswitch_1
        0x426638db -> :sswitch_c
        0x45050c67 -> :sswitch_5
        0x4cc6df79 -> :sswitch_8
        0x54196f6c -> :sswitch_4
        0x59f60a06 -> :sswitch_2
        0x5dfb3dcf -> :sswitch_8
        0x7273490c -> :sswitch_10
        0x74eb9b90 -> :sswitch_1
        0x78d99697 -> :sswitch_2
        0x7a910ea1 -> :sswitch_f
        0x7b7d7ea9 -> :sswitch_9
        0x7d9cedf5 -> :sswitch_5
        0x7e1ae6ed -> :sswitch_3
    .end sparse-switch
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 34

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const v28, -0x1b4e5478

    sget v29, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v30, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v31, "\u1a77\u0733"

    invoke-static/range {v31 .. v31}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v31

    xor-int v31, v31, v30

    mul-int/lit8 v31, v31, 0x27

    xor-int v1, v31, v29

    mul-int/lit16 v1, v1, 0x44a5

    const v33, 0x2838b810

    xor-int v1, v1, v33

    const v33, 0x7041d677

    xor-int v31, v31, v33

    move-object/from16 v27, v4

    move-object v7, v6

    move-object v12, v11

    move-object/from16 v2, v24

    move/from16 v32, v31

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const v31, -0x1b4e5478

    const/16 v33, 0x0

    move-object v11, v10

    move-object v10, v9

    const/4 v9, 0x0

    :goto_0
    xor-int v4, v31, v29

    mul-int/lit16 v4, v4, 0x1581

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v31, v32, v1

    sparse-switch v31, :sswitch_data_0

    move-object v4, v2

    move/from16 v32, v33

    .line 494
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->ᩳ(Landroid/view/MotionEvent;)V

    .line 495
    iput-boolean v3, v0, Ll/ۢۢۡ;->ܰ:Z

    .line 496
    iput-boolean v3, v0, Ll/ۢۢۡ;->ۜ֫:Z

    .line 498
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-eqz v1, :cond_22

    const-string v1, "\u1a75\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x6c39

    const v33, 0x235f1fea

    xor-int v2, v2, v33

    const v33, -0x66d87e45

    goto/16 :goto_18

    .line 293
    :sswitch_0
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v1

    if-lez v1, :cond_11

    :cond_0
    :goto_1
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_1c

    .line 421
    :sswitch_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    move-object v4, v2

    goto/16 :goto_e

    .line 466
    :sswitch_2
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "\u05a8\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x6933

    const v32, 0x33379d7e

    xor-int v4, v4, v32

    const v32, 0x716d9ab0

    goto/16 :goto_c

    .line 51
    :sswitch_3
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_0

    goto/16 :goto_5

    .line 493
    :sswitch_4
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_e

    goto/16 :goto_5

    .line 94
    :sswitch_5
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_3

    goto/16 :goto_a

    :cond_3
    :goto_2
    const-string v1, "\u1a78\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x2d33

    const v32, -0x31c161d6    # -7.9950912E8f

    xor-int v4, v4, v32

    const v32, -0x583e678

    goto/16 :goto_c

    .line 141
    :sswitch_6
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v1

    if-ltz v1, :cond_5

    goto/16 :goto_a

    .line 442
    :sswitch_7
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v1, :cond_b

    goto/16 :goto_a

    .line 545
    :sswitch_8
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    goto/16 :goto_a

    .line 245
    :sswitch_9
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    const/4 v1, 0x0

    return v1

    .line 551
    :sswitch_a
    invoke-virtual {v0, v9}, Ll/ۢۢۡ;->setSelection(I)V

    goto :goto_3

    :sswitch_b
    return v8

    .line 550
    :sswitch_c
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    if-eq v9, v1, :cond_4

    const-string v1, "\u05a1\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x39

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x5e35

    const v32, -0x193dc0d5

    xor-int v4, v4, v32

    const v32, -0x485d6773

    goto/16 :goto_c

    :cond_4
    :goto_3
    const-string v1, "\u06e4\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x19b7

    const v32, -0x5e466cd8

    xor-int v4, v4, v32

    const v32, 0x2bdf2dd6

    goto/16 :goto_c

    .line 547
    :sswitch_d
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    sub-int/2addr v1, v8

    goto :goto_4

    :sswitch_e
    int-to-float v1, v5

    mul-float v1, v1, v26

    float-to-int v1, v1

    :goto_4
    move v9, v1

    const-string v1, "\u073a\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, -0x77

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x11fd

    const v32, 0x1141ce28

    xor-int v4, v4, v32

    const v32, -0x338b0b26    # -6.4213864E7f

    goto/16 :goto_c

    .line 549
    :sswitch_f
    invoke-virtual/range {p0 .. p0}, Landroid/widget/AdapterView;->getCount()I

    move-result v1

    invoke-static/range {p0 .. p0}, Ll/֨۬;->۟ܰۚ(Ljava/lang/Object;)I

    move-result v4

    sub-int v5, v1, v4

    .line 376
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v1

    if-gtz v1, :cond_6

    :cond_5
    :goto_5
    const-string v1, "\u1a77\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x7067

    const v32, 0x1ba417e7

    xor-int v4, v4, v32

    const v32, 0x3f1fc1b3

    goto/16 :goto_c

    :cond_6
    const-string v1, "\u06d7\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x47

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x6999

    const v32, -0x63e0f5fb

    xor-int v4, v4, v32

    const v32, -0x2255630d

    goto/16 :goto_c

    .line 532
    :sswitch_10
    iget v1, v0, Ll/ۢۢۡ;->۫:I

    invoke-virtual {v2, v8, v1}, Ll/۬ۧ֫;->֫(II)V

    goto/16 :goto_6

    .line 535
    :sswitch_11
    invoke-static/range {p0 .. p0}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    .line 536
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_b

    .line 534
    :sswitch_12
    iget v1, v7, Ll/ܳ᩸ۡ;->ܿ:F

    iget v4, v0, Ll/ۢۢۡ;->ۗ:F

    sub-float/2addr v1, v4

    iput v1, v0, Ll/ۢۢۡ;->ۖ֫:F

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u073d\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x3f89

    const v32, 0x5c5a3da3

    xor-int v4, v4, v32

    const v32, -0x2d1b8b82

    goto/16 :goto_c

    :sswitch_13
    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v26, 0x3f800000    # 1.0f

    goto/16 :goto_7

    :sswitch_14
    cmpl-float v1, v26, v18

    if-nez v1, :cond_8

    const-string v1, "\u05a8\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x16e9

    const v32, 0x56cd70da

    xor-int v4, v4, v32

    const v32, -0x32328c6f    # -4.3086288E8f

    goto/16 :goto_c

    :cond_8
    const-string v1, "\u0730\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x53

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x5601

    const v32, 0x24e799b4

    xor-int v4, v4, v32

    const v32, 0xc800869

    goto/16 :goto_c

    .line 528
    :sswitch_15
    iput-boolean v3, v0, Ll/ۢۢۡ;->ۜ֫:Z

    .line 529
    iput-boolean v8, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    .line 530
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->ۧ(Landroid/view/MotionEvent;)V

    .line 531
    iget-object v2, v0, Ll/ۢۢۡ;->۬:Ll/۬ۧ֫;

    if-eqz v2, :cond_9

    const-string v1, "\u06e7\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, 0x7f

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x3229

    const v32, 0x7b2953b0

    xor-int v4, v4, v32

    const v32, -0x45e1e424

    goto/16 :goto_c

    :cond_9
    :goto_6
    const-string v1, "\u06eb\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x2459

    const v32, -0xd67e2f1

    xor-int v4, v4, v32

    const v32, 0x24629c46

    goto/16 :goto_c

    :sswitch_16
    const/4 v1, 0x0

    const/16 v26, 0x0

    goto :goto_7

    :sswitch_17
    cmpl-float v1, v17, v18

    if-lez v1, :cond_a

    const-string v1, "\u073d\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x30ff

    const v32, 0x175f041c

    xor-int v4, v4, v32

    const v32, -0x67d7e414

    goto/16 :goto_c

    :cond_a
    move/from16 v26, v17

    :goto_7
    const-string v1, "\u06da\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x11

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x510d

    const v32, -0x4d87c013

    xor-int v4, v4, v32

    const v32, -0x516329f7

    goto/16 :goto_c

    :sswitch_18
    mul-int v1, v24, v24

    int-to-float v1, v1

    cmpl-float v1, v23, v1

    if-lez v1, :cond_14

    const-string v1, "\u1a73\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x6b

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x5e0d

    const v32, -0x5c800bb6

    xor-int v4, v4, v32

    const v32, -0x3e933591

    goto/16 :goto_c

    :sswitch_19
    mul-float v1, v21, v21

    add-float v23, v1, v22

    .line 527
    iget v1, v0, Ll/ۢۢۡ;->ۡ֫:I

    .line 537
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_c

    move/from16 v24, v1

    :cond_b
    const-string v1, "\u1a7a\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, -0xf

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x74f7

    const v32, -0x62976279

    xor-int v4, v4, v32

    const v32, 0x39d572b6

    goto/16 :goto_c

    :cond_c
    const-string v4, "\u1a78\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v30, v4

    mul-int/lit8 v4, v4, 0x69

    move/from16 v24, v1

    xor-int v1, v4, v29

    mul-int/lit16 v1, v1, -0x2de1

    const v32, -0x63cf69

    xor-int v1, v1, v32

    const v32, 0x470b1394

    goto/16 :goto_9

    .line 526
    :sswitch_1a
    iget v1, v0, Ll/ۢۢۡ;->ۗ:F

    sub-float v21, v20, v1

    mul-float v22, v19, v19

    .line 516
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_d

    :goto_8
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_12

    :cond_d
    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x41

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x5833

    const v32, -0x2888a200

    xor-int v4, v4, v32

    const v32, -0x32c5d08

    goto/16 :goto_c

    .line 525
    :sswitch_1b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget v4, v0, Ll/ۢۢۡ;->ۙ:F

    sub-float v19, v1, v4

    .line 526
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v20

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    const-string v1, "\u05ab\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x7e79

    const v32, 0x19ed0e07

    xor-int v4, v4, v32

    const v32, 0x4a4fe8ca    # 3406386.5f

    goto/16 :goto_c

    :cond_f
    const-string v1, "\u1a78\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x41

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, -0x4cf7

    const v32, 0x3de03ac5

    xor-int v4, v4, v32

    const v32, 0x266a8082

    goto/16 :goto_c

    :sswitch_1c
    sub-float v1, v15, v16

    div-float v17, v13, v1

    const/4 v1, 0x0

    const/high16 v18, 0x3f800000    # 1.0f

    cmpg-float v1, v17, v1

    if-gez v1, :cond_10

    const-string v1, "\u06d8\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v4, v1, v30

    mul-int/lit16 v4, v4, 0x515

    const v32, 0x45ade008

    xor-int v4, v4, v32

    const v32, -0x7940a7e6

    goto/16 :goto_c

    :cond_10
    const-string v1, "\u06e8\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x5d

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x3ccd

    const v32, -0x4d11428a

    xor-int v4, v4, v32

    const v32, -0x61a6705d

    goto/16 :goto_c

    :sswitch_1d
    int-to-float v15, v14

    .line 540
    iget v1, v0, Ll/ۢۢۡ;->ۛ:F

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_12

    move/from16 v16, v1

    :cond_11
    const-string v1, "\u1a75\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x61e7

    const v32, 0x6b8a36f4

    xor-int v4, v4, v32

    const v32, -0x7f342f90

    goto/16 :goto_c

    :cond_12
    const-string v4, "\u06dc\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v29

    move/from16 v16, v1

    xor-int v1, v4, v30

    mul-int/lit16 v1, v1, -0x27e5

    const v32, 0x2041e50c

    xor-int v1, v1, v32

    const v32, -0x5a2ffa5e

    :goto_9
    xor-int v32, v4, v32

    goto/16 :goto_0

    :sswitch_1e
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v4, v0, Ll/ۢۢۡ;->ۖ֫:F

    add-float v13, v1, v4

    invoke-static/range {p0 .. p0}, Ll/ۨ;->ۢ᩺ۙ(Ljava/lang/Object;)I

    move-result v14

    .line 299
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_13

    :goto_a
    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, 0x4297

    const v32, 0x69f734b0

    xor-int v4, v4, v32

    const v32, 0x20739eb4

    goto :goto_c

    :cond_13
    const-string v1, "\u0730\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x5b

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x6939

    const v32, -0x266797b9

    xor-int v4, v4, v32

    const v32, 0x7df8c39b

    goto :goto_c

    .line 568
    :sswitch_1f
    invoke-interface {v12, v0, v3}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    move-object v4, v2

    goto/16 :goto_d

    .line 569
    :sswitch_20
    invoke-static/range {p0 .. p0}, Ll/֡᩶;->ᩳ۠ۖ(Ljava/lang/Object;)V

    return v8

    .line 524
    :sswitch_21
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-nez v1, :cond_14

    const-string v1, "\u06d9\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x7115

    const v32, -0x1cb2bd51

    xor-int v4, v4, v32

    const v32, 0x14e068ae

    goto :goto_c

    :cond_14
    :goto_b
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_10

    .line 539
    :sswitch_22
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-eqz v1, :cond_15

    const-string v1, "\u06d6\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v4, v1, v29

    mul-int/lit16 v4, v4, -0x594f

    const v32, 0xf6fa9bd

    xor-int v4, v4, v32

    const v32, -0x3e074d52

    :goto_c
    xor-int v32, v1, v32

    move v1, v4

    goto/16 :goto_0

    :cond_15
    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_15

    .line 562
    :sswitch_23
    iget v1, v0, Ll/ۢۢۡ;->۫:I

    invoke-virtual {v10, v3, v1}, Ll/۬ۧ֫;->֫(II)V

    move-object v4, v2

    move/from16 v32, v33

    goto/16 :goto_11

    :sswitch_24
    move-object v4, v2

    const-wide/16 v1, 0x5dc

    .line 566
    invoke-virtual {v11, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 567
    iget-object v12, v0, Ll/ۢۢۡ;->᩻֫:Landroid/widget/AbsListView$OnScrollListener;

    if-eqz v12, :cond_16

    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0xa5d

    const v32, 0x5bcf4bed

    xor-int v2, v2, v32

    const v32, -0xb5dfc53

    goto :goto_f

    :cond_16
    :goto_d
    const-string v1, "\u1a7a\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, 0x71

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x907

    const v32, -0x1509743d

    xor-int v2, v2, v32

    const v32, 0x58fa5d87

    goto :goto_f

    :sswitch_25
    move-object v4, v2

    .line 564
    invoke-static {}, Ll/ۗ᩺;->ᩳۗۚ()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۢۢۡ;->᩷֫:J

    .line 565
    iget-object v11, v0, Ll/ۢۢۡ;->ܽ֫:Ll/ۜۢۡ;

    invoke-static {v11, v3}, Ll/۠;->ܺ᩸ۙ(Ljava/lang/Object;I)V

    .line 447
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v1

    if-eqz v1, :cond_17

    :goto_e
    const-string v1, "\u06d8\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x5cc5

    const v32, -0x1c88038f

    xor-int v2, v2, v32

    const v32, 0x7e1cf241

    goto :goto_f

    :cond_17
    const-string v1, "\u1a74\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v30, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x5b99

    const v32, 0x12d1a3e

    xor-int v2, v2, v32

    const v32, 0x37a6602c

    :goto_f
    xor-int v32, v1, v32

    goto/16 :goto_19

    :sswitch_26
    move-object v4, v2

    move/from16 v1, v33

    move/from16 v32, v1

    if-eq v6, v1, :cond_1c

    goto/16 :goto_15

    :sswitch_27
    move-object v4, v2

    move/from16 v1, v33

    .line 524
    iget-boolean v2, v0, Ll/ۢۢۡ;->ۜ֫:Z

    if-eqz v2, :cond_18

    const-string v2, "\u0730\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    move/from16 v32, v1

    xor-int v1, v2, v29

    mul-int/lit16 v1, v1, 0x1a8b

    const v33, 0x32474680

    xor-int v1, v1, v33

    const v33, -0x7a2ebb8f

    goto/16 :goto_14

    :cond_18
    move/from16 v32, v1

    :goto_10
    const-string v1, "\u06eb\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x59

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x59e1

    const v33, 0x778ac651

    xor-int v2, v2, v33

    const v33, -0x5b53a2f2

    goto/16 :goto_18

    :sswitch_28
    move-object v4, v2

    move/from16 v32, v33

    .line 560
    iput-boolean v3, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    .line 561
    iget-object v10, v0, Ll/ۢۢۡ;->۬:Ll/۬ۧ֫;

    if-eqz v10, :cond_19

    const-string v1, "\u06d6\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x373b

    const v33, 0x1413eec6

    xor-int v2, v2, v33

    const v33, -0x26da8d2f

    goto/16 :goto_18

    :cond_19
    :goto_11
    const-string v1, "\u06d7\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x3d

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x4e37

    const v33, -0x1a9aa995

    xor-int v2, v2, v33

    const v33, 0xf51427

    goto/16 :goto_18

    .line 516
    :sswitch_29
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->֫(Landroid/view/MotionEvent;)V

    return v8

    :sswitch_2a
    move-object v4, v2

    move/from16 v32, v33

    .line 520
    iput-boolean v8, v0, Ll/ۢۢۡ;->ۜ֫:Z

    goto/16 :goto_15

    :sswitch_2b
    move-object v4, v2

    move/from16 v32, v33

    const/4 v1, 0x2

    if-eq v6, v1, :cond_1a

    const-string v1, "\u0733\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x7ed

    const v33, 0x7279c31a

    xor-int v2, v2, v33

    const v33, -0x72fffba

    goto/16 :goto_18

    :cond_1a
    const-string v1, "\u05ab\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0x75

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x3423

    const v33, -0x7b877263

    xor-int v2, v2, v33

    const v33, -0x517764f9

    goto/16 :goto_18

    :sswitch_2c
    move-object v4, v2

    move/from16 v32, v33

    .line 557
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->ᩳ(Landroid/view/MotionEvent;)V

    .line 558
    iput-boolean v3, v0, Ll/ۢۢۡ;->ۜ֫:Z

    .line 559
    iget-boolean v1, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-eqz v1, :cond_21

    const-string v1, "\u073d\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x7cd7

    const v33, -0x131c0358

    xor-int v2, v2, v33

    const v33, -0x52122b8a

    goto/16 :goto_18

    :sswitch_2d
    move-object v4, v2

    move/from16 v32, v33

    .line 515
    iget v1, v0, Ll/ۢۢۡ;->ۙ:F

    iget v2, v0, Ll/ۢۢۡ;->ۗ:F

    invoke-virtual {v7, v1, v2}, Ll/ܳ᩸ۡ;->ۧ(FF)Z

    move-result v1

    if-eqz v1, :cond_1b

    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v29

    mul-int/lit8 v1, v1, 0x49

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x7ea7

    const v33, -0x7a165629

    xor-int v2, v2, v33

    const v33, 0x1de69f35

    goto/16 :goto_18

    :cond_1b
    const-string v1, "\u06e0\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, 0x45

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x18a5

    const v33, -0x23b3118d

    xor-int v2, v2, v33

    const v33, 0x186360d4

    goto/16 :goto_18

    :sswitch_2e
    move-object v4, v2

    move/from16 v32, v33

    if-eq v6, v8, :cond_1c

    const-string v1, "\u073f\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, -0x615b

    const v33, 0x6a3e74c3

    xor-int v2, v2, v33

    const v33, 0x1f7b8473

    goto/16 :goto_18

    :cond_1c
    const-string v1, "\u1a7a\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x69

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x1f15

    const v33, -0x56debd2f

    xor-int v2, v2, v33

    const v33, 0x3819b7c3

    goto/16 :goto_18

    :sswitch_2f
    move-object v4, v2

    move/from16 v1, v28

    move/from16 v32, v33

    .line 513
    iput v1, v0, Ll/ۢۢۡ;->ۗ:F

    .line 514
    iget v2, v0, Ll/ۢۢۡ;->ۙ:F

    invoke-virtual {v7, v2, v1}, Ll/ܳ᩸ۡ;->֫(FF)Z

    move-result v2

    if-eqz v2, :cond_1d

    const-string v2, "\u06e2\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v29

    move/from16 v28, v1

    xor-int v1, v2, v30

    mul-int/lit16 v1, v1, -0x5a69

    const v33, -0x13245d85

    xor-int v1, v1, v33

    const v33, 0x42297584

    goto/16 :goto_14

    :cond_1d
    move/from16 v28, v1

    goto/16 :goto_15

    :sswitch_30
    move-object v4, v2

    move/from16 v32, v33

    .line 512
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Ll/ۢۢۡ;->ۙ:F

    .line 513
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v28

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v1

    if-eqz v1, :cond_1e

    :goto_12
    const-string v1, "\u06d9\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x542d

    const v33, 0x67eb232b

    xor-int v2, v2, v33

    const v33, -0x3a8da04c

    goto/16 :goto_18

    :cond_1e
    const-string v1, "\u1a77\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x34db

    const v33, -0x4b88e502

    xor-int v2, v2, v33

    const v33, -0x2ffa2026

    goto/16 :goto_18

    :sswitch_31
    move-object v4, v2

    move/from16 v32, v33

    .line 501
    iget v1, v0, Ll/ۢۢۡ;->۫:I

    move-object/from16 v2, v27

    invoke-virtual {v2, v3, v1}, Ll/۬ۧ֫;->֫(II)V

    move/from16 v2, v25

    goto/16 :goto_1b

    :sswitch_32
    move-object v4, v2

    move-object/from16 v2, v27

    move/from16 v32, v33

    .line 510
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v6

    iget-object v7, v0, Ll/ۢۢۡ;->֫֫:Ll/ܳ᩸ۡ;

    if-eqz v6, :cond_1f

    const-string v1, "\u06d6\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v29, v1

    mul-int/lit8 v1, v1, -0x79

    xor-int v8, v1, v30

    mul-int/lit16 v8, v8, -0x75f9

    const v33, 0x613e736

    xor-int v8, v8, v33

    const v33, 0xc538cc5

    goto :goto_13

    :cond_1f
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v8, v1, v29

    mul-int/lit16 v8, v8, 0x2585

    const v33, 0x6dccdd7a

    xor-int v8, v8, v33

    const v33, 0x17ac26fd

    :goto_13
    xor-int v1, v1, v33

    move-object/from16 v27, v2

    move-object v2, v4

    move/from16 v33, v32

    move/from16 v32, v1

    move v1, v8

    const/4 v8, 0x1

    goto/16 :goto_0

    .line 575
    :sswitch_33
    invoke-super/range {p0 .. p1}, Landroid/widget/ListView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    return v1

    :sswitch_34
    move-object v4, v2

    move/from16 v32, v33

    .line 499
    iput-boolean v3, v0, Ll/ۢۢۡ;->ᩴ֫:Z

    .line 500
    iget-object v1, v0, Ll/ۢۢۡ;->۬:Ll/۬ۧ֫;

    if-eqz v1, :cond_20

    const-string v2, "\u1a79\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v29

    mul-int/lit8 v2, v2, 0x33

    move-object/from16 v27, v1

    xor-int v1, v2, v30

    mul-int/lit16 v1, v1, -0x2311

    const v33, 0x6efb1824

    xor-int v1, v1, v33

    const v33, -0xbcaf81f

    :goto_14
    xor-int v2, v2, v33

    move/from16 v33, v32

    move/from16 v32, v2

    goto/16 :goto_1a

    :cond_20
    move-object/from16 v27, v1

    goto :goto_16

    :sswitch_35
    move-object v4, v2

    move-object/from16 v2, v27

    move/from16 v32, v33

    .line 506
    invoke-direct/range {p0 .. p1}, Ll/ۢۢۡ;->ᩳ(Landroid/view/MotionEvent;)V

    const-wide/16 v1, 0x0

    .line 507
    iput-wide v1, v0, Ll/ۢۢۡ;->᩶:J

    goto :goto_17

    :sswitch_36
    move-object v4, v2

    move/from16 v32, v33

    .line 509
    invoke-direct/range {p0 .. p0}, Ll/ۢۢۡ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_21

    const-string v1, "\u06e4\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0xcb3

    const v33, -0x2f77fe09

    xor-int v2, v2, v33

    const v33, -0x7e3f46e2

    goto :goto_18

    :cond_21
    :goto_15
    const-string v1, "\u1a74\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v30

    mul-int/lit8 v1, v1, -0x29

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, -0x5e19

    const v33, 0x794638b0

    xor-int v2, v2, v33

    const v33, 0x493f28b6    # 782987.4f

    goto :goto_18

    :cond_22
    :goto_16
    move/from16 v2, v25

    move/from16 v33, v32

    goto :goto_1b

    :sswitch_37
    move-object v4, v2

    move/from16 v32, v33

    .line 505
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-nez v1, :cond_23

    const-string v1, "\u06d8\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v2, v1, v29

    mul-int/lit16 v2, v2, 0x61b9

    const v33, -0x18832854

    xor-int v2, v2, v33

    const v33, 0x132367d1

    goto :goto_18

    :cond_23
    :goto_17
    const-string v1, "\u0736\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v29

    mul-int/lit8 v1, v1, -0x73

    xor-int v2, v1, v30

    mul-int/lit16 v2, v2, 0x455d

    const v33, -0x6271495f

    xor-int v2, v2, v33

    const v33, -0x616f7ca4

    :goto_18
    xor-int v1, v1, v33

    move/from16 v33, v32

    move/from16 v32, v1

    :goto_19
    move v1, v2

    goto :goto_1a

    :sswitch_38
    move-object v4, v2

    const/4 v3, 0x0

    const/4 v1, 0x3

    move/from16 v2, v25

    if-ne v2, v1, :cond_24

    const-string v25, "\u1a76\u0736"

    invoke-static/range {v25 .. v25}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v25

    xor-int v25, v25, v30

    xor-int v1, v25, v29

    mul-int/lit16 v1, v1, 0x3fb1

    const v33, -0x5bc107af

    xor-int v1, v1, v33

    const v33, 0x1e04c01f

    xor-int v25, v25, v33

    move/from16 v32, v25

    const/16 v33, 0x3

    move/from16 v25, v2

    :goto_1a
    move-object v2, v4

    goto/16 :goto_0

    :cond_24
    const/16 v33, 0x3

    :goto_1b
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v30

    xor-int v0, v1, v29

    mul-int/lit16 v0, v0, -0x388f

    const v25, 0x2885a949

    xor-int v0, v0, v25

    const v25, -0x7a7d96a7

    xor-int v32, v1, v25

    move v1, v0

    move/from16 v25, v2

    move-object v2, v4

    goto :goto_1e

    :sswitch_39
    move-object v4, v2

    move/from16 v32, v33

    .line 493
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v25

    .line 308
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-eqz v0, :cond_25

    :goto_1c
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v30, v0

    mul-int/lit8 v0, v0, -0x27

    xor-int v1, v0, v29

    mul-int/lit16 v1, v1, -0x342d

    const v2, -0x6f0314bb

    xor-int/2addr v1, v2

    const v2, -0x207d50dd

    goto :goto_1d

    :cond_25
    const-string v0, "\u0730\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v29

    mul-int/lit8 v0, v0, 0x4f

    xor-int v1, v0, v30

    mul-int/lit16 v1, v1, -0x2ad

    const v2, 0x27b31948

    xor-int/2addr v1, v2

    const v2, 0x723344b0

    :goto_1d
    xor-int/2addr v0, v2

    move-object v2, v4

    move/from16 v33, v32

    move/from16 v32, v0

    :goto_1e
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b8940f7 -> :sswitch_1a
        -0x7a8022dd -> :sswitch_38
        -0x7938c815 -> :sswitch_11
        -0x72f9f3d4 -> :sswitch_23
        -0x71f3fb96 -> :sswitch_7
        -0x706b9442 -> :sswitch_28
        -0x6eaeeac4 -> :sswitch_0
        -0x69ea1739 -> :sswitch_13
        -0x6498e844 -> :sswitch_20
        -0x5fda7106 -> :sswitch_19
        -0x5f0dfeed -> :sswitch_26
        -0x5d4e4cee -> :sswitch_1
        -0x5c240e12 -> :sswitch_10
        -0x5bf12424 -> :sswitch_2
        -0x5981372d -> :sswitch_11
        -0x58cce3d3 -> :sswitch_2e
        -0x58571aa4 -> :sswitch_21
        -0x582f233e -> :sswitch_22
        -0x5807f530 -> :sswitch_37
        -0x57b47105 -> :sswitch_15
        -0x568d1f67 -> :sswitch_36
        -0x5573d293 -> :sswitch_36
        -0x556c4024 -> :sswitch_1b
        -0x55431889 -> :sswitch_0
        -0x5212256d -> :sswitch_10
        -0x512f1fb6 -> :sswitch_29
        -0x4ddfe42f -> :sswitch_6
        -0x49b0ee3c -> :sswitch_14
        -0x46308ba4 -> :sswitch_1c
        -0x45ae46a6 -> :sswitch_13
        -0x45823d89 -> :sswitch_33
        -0x453825c9 -> :sswitch_1a
        -0x3c0505bd -> :sswitch_23
        -0x39c0c5bd -> :sswitch_d
        -0x32f8e113 -> :sswitch_34
        -0x318c1030 -> :sswitch_3
        -0x316569ac -> :sswitch_1e
        -0x30f68181 -> :sswitch_2f
        -0x30a580b9 -> :sswitch_37
        -0x2bac7a37 -> :sswitch_34
        -0x2a1c3e05 -> :sswitch_32
        -0x27f98576 -> :sswitch_6
        -0x276583b4 -> :sswitch_7
        -0x255641c1 -> :sswitch_26
        -0x246a100c -> :sswitch_30
        -0x2214c8f6 -> :sswitch_38
        -0x1c7ece1e -> :sswitch_1e
        -0x1c71ad5b -> :sswitch_29
        -0x1c2b5ac5 -> :sswitch_2c
        -0x1be0b8d4 -> :sswitch_39
        -0x1a93f561 -> :sswitch_a
        -0x183cec7d -> :sswitch_17
        -0x1770c70a -> :sswitch_15
        -0x148f2920 -> :sswitch_2b
        -0x10ea03ec -> :sswitch_f
        -0xe8ebe0a -> :sswitch_22
        -0xe4a7800 -> :sswitch_1f
        -0xe358e1c -> :sswitch_19
        -0xe0cb175 -> :sswitch_1c
        -0xd803692 -> :sswitch_2f
        -0xd75353e -> :sswitch_21
        -0xc90b23d -> :sswitch_31
        -0x72ba1f7 -> :sswitch_8
        -0x1f6165 -> :sswitch_32
        0x1ca25cd -> :sswitch_24
        0x20a215f -> :sswitch_9
        0x20affe6 -> :sswitch_27
        0x3b217ef -> :sswitch_2c
        0x6b19755 -> :sswitch_1
        0x85a16fc -> :sswitch_24
        0xc8051b8 -> :sswitch_25
        0xdf2637c -> :sswitch_1f
        0x10deba2a -> :sswitch_18
        0x160a0df1 -> :sswitch_2d
        0x1c9ec0d8 -> :sswitch_2
        0x1e6cfa71 -> :sswitch_5
        0x1f8631b3 -> :sswitch_4
        0x21f8b3d1 -> :sswitch_f
        0x2212d3e9 -> :sswitch_16
        0x2281fa49 -> :sswitch_27
        0x23e8c93d -> :sswitch_1d
        0x286d8608 -> :sswitch_8
        0x30e4ec5b -> :sswitch_39
        0x315ad125 -> :sswitch_35
        0x33334190 -> :sswitch_33
        0x35d5a27b -> :sswitch_30
        0x3677b490 -> :sswitch_c
        0x3699ebd8 -> :sswitch_1b
        0x378ba280 -> :sswitch_31
        0x37dd419a -> :sswitch_2e
        0x38d38e1b -> :sswitch_14
        0x3a96ee05 -> :sswitch_3
        0x3bd0227c -> :sswitch_2a
        0x3cbe7281 -> :sswitch_1d
        0x3f6f0d91 -> :sswitch_2d
        0x462b08fe -> :sswitch_b
        0x4a398735 -> :sswitch_d
        0x4b58c60d -> :sswitch_2b
        0x50285156 -> :sswitch_16
        0x5293589e -> :sswitch_2a
        0x53078791 -> :sswitch_12
        0x535ae09e -> :sswitch_17
        0x61a8332b -> :sswitch_9
        0x62986631 -> :sswitch_c
        0x63c0cdf8 -> :sswitch_e
        0x657afbdc -> :sswitch_18
        0x6600c3cd -> :sswitch_5
        0x684a903f -> :sswitch_28
        0x7041e46c -> :sswitch_12
        0x724a1e53 -> :sswitch_4
        0x74ac01e3 -> :sswitch_a
        0x778d3b5a -> :sswitch_e
        0x7ab47ea1 -> :sswitch_20
        0x7c5eb5c2 -> :sswitch_25
        0x7e157762 -> :sswitch_35
        0x7ffc5595 -> :sswitch_b
    .end sparse-switch
.end method

.method public final bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 39
    check-cast p1, Landroid/widget/ListAdapter;

    invoke-virtual {p0, p1}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public final setAdapter(Landroid/widget/ListAdapter;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x4b36dab1

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    const-string v5, "\u06dc\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2239

    const v7, -0x41d7f188

    xor-int/2addr v6, v7

    const v7, -0x5ba26ace

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x442b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v5, :cond_3

    goto/16 :goto_4

    :sswitch_0
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v5, :cond_4

    goto/16 :goto_3

    .line 133
    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v5

    if-lez v5, :cond_6

    goto/16 :goto_5

    .line 184
    :sswitch_2
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v5, :cond_8

    goto/16 :goto_5

    .line 103
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    return-void

    .line 231
    :sswitch_5
    invoke-interface {p1, v1}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_1

    :sswitch_6
    return-void

    .line 227
    :sswitch_7
    invoke-interface {v0, v1}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_2

    .line 229
    :sswitch_8
    invoke-super {p0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    if-eqz p1, :cond_0

    const-string v5, "\u1a75\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6ef9

    const v7, 0x378b3c29

    xor-int/2addr v6, v7

    const v7, -0x3c6d0abd

    goto :goto_0

    :cond_0
    :goto_1
    const-string v5, "\u06e1\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1347

    const v7, -0x64d1f826

    xor-int/2addr v6, v7

    const v7, 0x64b9bc69

    goto :goto_0

    .line 225
    :sswitch_9
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 226
    iget-object v1, p0, Ll/ۢۢۡ;->᩹:Landroid/database/DataSetObserver;

    if-eqz v0, :cond_1

    const-string v5, "\u0730\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5eb3

    const v7, 0x584ee1ea

    xor-int/2addr v6, v7

    const v7, 0x48661ada

    goto/16 :goto_0

    :cond_1
    :goto_2
    const-string v5, "\u1a7a\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2dd9

    const v7, -0x34f4872c    # -9140436.0f

    xor-int/2addr v6, v7

    const v7, 0x719dc0b

    goto/16 :goto_0

    .line 113
    :sswitch_a
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06df\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x51f5

    const v7, 0x634f16e2

    xor-int/2addr v6, v7

    const v7, -0x6502dfa4

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x6f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6799

    const v7, -0x7be16aab

    xor-int/2addr v6, v7

    const v7, 0x54990019

    goto/16 :goto_0

    .line 45
    :sswitch_b
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v5

    if-eqz v5, :cond_5

    :cond_4
    const-string v5, "\u06e2\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7831

    const v7, 0x3137b3e

    xor-int/2addr v6, v7

    const v7, -0x17c73855

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06da\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2cb7

    const v7, -0x53df12ff

    xor-int/2addr v6, v7

    const v7, 0x3b1b4e06

    goto/16 :goto_0

    .line 180
    :sswitch_c
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v5

    if-ltz v5, :cond_7

    :cond_6
    :goto_3
    const-string v5, "\u073a\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x78ed

    const v7, 0x45fc277c

    xor-int/2addr v6, v7

    const v7, -0x79ce3df3

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a77\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x17f3

    const v7, 0x40d6b2bf

    xor-int/2addr v6, v7

    const v7, -0x32578ff5

    goto/16 :goto_0

    .line 91
    :sswitch_d
    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_9

    :cond_8
    const-string v5, "\u0736\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4cad

    const v7, -0x79464d79

    xor-int/2addr v6, v7

    const v7, 0x2e7a7150

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05a1\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x492f

    const v7, 0x45f784d

    xor-int/2addr v6, v7

    const v7, 0x662162a

    goto/16 :goto_0

    .line 126
    :sswitch_e
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v5, "\u06e8\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5691

    const v7, -0x28556cb6

    xor-int/2addr v6, v7

    const v7, -0x6eb68ae0

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v5, :cond_b

    :goto_4
    const-string v5, "\u1a7a\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5fe1

    const v7, -0x5348a391

    xor-int/2addr v6, v7

    const v7, 0x149c7db2

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d8\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x167

    const v7, 0x4befcdc6    # 3.1431564E7f

    xor-int/2addr v6, v7

    const v7, 0x4ee35a56

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_c

    goto :goto_5

    :cond_c
    const-string v5, "\u06df\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x489f

    const v7, 0x33333dde

    xor-int/2addr v6, v7

    const v7, 0x7e1fa16a

    goto/16 :goto_0

    :sswitch_11
    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_d

    goto :goto_5

    :cond_d
    const-string v5, "\u06da\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2193

    const v7, 0x5ceb7bde

    xor-int/2addr v6, v7

    const v7, 0xe58748b

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v5

    if-nez v5, :cond_e

    :goto_5
    const-string v5, "\u0730\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x74fb

    const v7, -0x215f9942

    xor-int/2addr v6, v7

    const v7, 0x17ee0913

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06ec\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3cef

    const v7, -0x404529d6

    xor-int/2addr v6, v7

    const v7, -0x534233

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79fc4192 -> :sswitch_10
        -0x79f2cfcc -> :sswitch_4
        -0x77b1feef -> :sswitch_c
        -0x6fa69e93 -> :sswitch_9
        -0x6a4d0891 -> :sswitch_6
        -0x59de79bf -> :sswitch_3
        -0x52b0c39d -> :sswitch_1
        -0x4aa5efb6 -> :sswitch_1
        -0x421915d2 -> :sswitch_c
        -0x3fc21158 -> :sswitch_7
        -0x32c5b149 -> :sswitch_8
        -0x2dfc8719 -> :sswitch_3
        -0x2d393ccd -> :sswitch_b
        -0x2a1baf8e -> :sswitch_9
        -0x26dc9a95 -> :sswitch_12
        -0x19521c1c -> :sswitch_6
        -0x18f4b220 -> :sswitch_a
        -0x150706f0 -> :sswitch_e
        -0xd711771 -> :sswitch_4
        -0x9bb9498 -> :sswitch_f
        0xaa5a9b -> :sswitch_d
        0x3c391ca -> :sswitch_7
        0xe6a3495 -> :sswitch_2
        0x17b84276 -> :sswitch_12
        0x1c09fc1f -> :sswitch_11
        0x1e18d18f -> :sswitch_0
        0x346434ec -> :sswitch_b
        0x3e213c92 -> :sswitch_e
        0x4b84aa82 -> :sswitch_a
        0x571b94e4 -> :sswitch_0
        0x58c8b40a -> :sswitch_5
        0x5a930e93 -> :sswitch_10
        0x5eafae3c -> :sswitch_d
        0x689c1a23 -> :sswitch_2
        0x68cbb245 -> :sswitch_8
        0x6e4f93eb -> :sswitch_11
        0x72c86a90 -> :sswitch_5
        0x7a3f356e -> :sswitch_f
    .end sparse-switch
.end method

.method public final setFastScrollEnabled(Z)V
    .locals 0

    .line 208
    iput-boolean p1, p0, Ll/ۢۢۡ;->ᩳ֫:Z

    return-void
.end method

.method public final setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V
    .locals 6

    const v0, -0x64cbfc35

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4355

    const v5, 0x1dccfab4

    xor-int/2addr v4, v5

    const v5, -0x40f86bcb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x2f3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 474
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_6

    goto/16 :goto_3

    .line 367
    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-lez v3, :cond_b

    goto :goto_1

    .line 455
    :sswitch_1
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_8

    goto :goto_1

    .line 532
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v3

    if-lez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u06ec\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x55d7

    const v5, -0x65b0790c

    xor-int/2addr v4, v5

    const v5, -0x25992bca

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 585
    invoke-super {p0, p1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 588
    :sswitch_6
    new-instance p1, Ll/ᩳۢۡ;

    invoke-direct {p1, p0}, Ll/ᩳۢۡ;-><init>(Ll/ۢۢۡ;)V

    invoke-super {p0, p1}, Landroid/widget/ListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void

    .line 583
    :sswitch_7
    iput-object p1, p0, Ll/ۢۢۡ;->ܳ֫:Landroid/widget/AdapterView$OnItemLongClickListener;

    if-nez p1, :cond_1

    const-string v3, "\u06eb\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x47bf

    const v5, -0x334c6582    # -9.4163952E7f

    xor-int/2addr v4, v5

    const v5, 0x2c3a5852

    goto :goto_0

    :cond_1
    const-string v3, "\u073d\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x19cd

    const v5, 0x5220904

    xor-int/2addr v4, v5

    const v5, -0x5f82a906

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x788b

    const v5, 0x33a91e9b

    xor-int/2addr v4, v5

    const v5, -0x10a9e14f

    goto/16 :goto_0

    .line 369
    :sswitch_9
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a78\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x21ed

    const v5, -0x1e6e401b

    xor-int/2addr v4, v5

    const v5, -0x60802dd3

    goto/16 :goto_0

    .line 124
    :sswitch_a
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4557

    const v5, -0x3cdd44a7

    xor-int/2addr v4, v5

    const v5, 0x32cd7c58

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_5

    :goto_2
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7bc1

    const v5, 0x28898c56

    xor-int/2addr v4, v5

    const v5, -0x68f94a45

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e1\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a6d

    const v5, 0x54bf4777

    xor-int/2addr v4, v5

    const v5, -0x65e45354

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06da\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x567b

    const v5, -0x3c6a8aca

    xor-int/2addr v4, v5

    const v5, -0x10ffca32

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u06d8\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7225

    const v5, -0x20590f00

    xor-int/2addr v4, v5

    const v5, 0x6d22a36b

    goto/16 :goto_0

    .line 279
    :sswitch_d
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_9

    :cond_8
    const-string v3, "\u073f\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ef7

    const v5, 0x35cd1862

    xor-int/2addr v4, v5

    const v5, -0x4c2ea72a

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a77\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x40c9

    const v5, -0x5d26141e

    xor-int/2addr v4, v5

    const v5, 0x18f92ecc

    goto/16 :goto_0

    .line 333
    :sswitch_e
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06e0\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xe09

    const v5, -0x65be0f11

    xor-int/2addr v4, v5

    const v5, 0xdb851cf

    goto/16 :goto_0

    .line 322
    :sswitch_f
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06e8\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x503b

    const v5, -0x3cc782a

    xor-int/2addr v4, v5

    const v5, 0x2ea33399

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b43

    const v5, 0x1fdcbb30    # 9.34833E-20f

    xor-int/2addr v4, v5

    const v5, -0x20e09f83

    goto/16 :goto_0

    .line 200
    :sswitch_10
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_d

    :goto_4
    const-string v3, "\u1a74\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7abd

    const v5, -0x711a5a12

    xor-int/2addr v4, v5

    const v5, -0x66fb5218

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e7\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x839

    const v5, 0xe5c8cc

    xor-int/2addr v4, v5

    const v5, 0x4e084ce9    # 5.7168544E8f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78a1c84f -> :sswitch_2
        -0x76dbfe36 -> :sswitch_e
        -0x700abe1e -> :sswitch_3
        -0x5828b7c4 -> :sswitch_5
        -0x5714656f -> :sswitch_f
        -0x506c635b -> :sswitch_1
        -0x440c6e42 -> :sswitch_0
        -0x35d30011 -> :sswitch_6
        -0x2958520f -> :sswitch_a
        -0x241d0c8c -> :sswitch_9
        -0x14a45425 -> :sswitch_d
        -0xaa4638a -> :sswitch_c
        0x6b47fea -> :sswitch_10
        0x9e3c847 -> :sswitch_b
        0xa34df86 -> :sswitch_7
        0xd825197 -> :sswitch_7
        0x121e889d -> :sswitch_2
        0x392a33b8 -> :sswitch_4
        0x3ccdd715 -> :sswitch_f
        0x47d3b25c -> :sswitch_8
        0x481a5060 -> :sswitch_e
        0x4ddc3841 -> :sswitch_6
        0x50270a84 -> :sswitch_3
        0x5d4b9c3b -> :sswitch_10
        0x66171672 -> :sswitch_5
        0x687938d1 -> :sswitch_9
        0x6c2b0af3 -> :sswitch_c
        0x70577050 -> :sswitch_1
        0x76782152 -> :sswitch_b
        0x76b6d030 -> :sswitch_d
        0x799fcf48 -> :sswitch_8
        0x7aa7e7cf -> :sswitch_4
        0x7cf85059 -> :sswitch_a
        0x7fe4c57c -> :sswitch_0
    .end sparse-switch
.end method

.method public final setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V
    .locals 0

    .line 632
    iput-object p1, p0, Ll/ۢۢۡ;->᩻֫:Landroid/widget/AbsListView$OnScrollListener;

    return-void
.end method

.method public final setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 745
    iput-object p1, p0, Ll/ۢۢۡ;->᩸:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method public final setSelection(I)V
    .locals 6

    const v0, -0x23ca5a88

    sget v1, Ll/᩺;->ۙۛܶ:I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    const-string v3, "\u1a7a\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x35f3

    const v5, -0x26d88ef9

    xor-int/2addr v4, v5

    const v5, 0x7da5ee5f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3df9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 107
    invoke-super {p0, p1}, Landroid/widget/ListView;->setSelection(I)V

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    .line 15
    :sswitch_0
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u0733\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x363

    const v5, 0x514a5e72

    xor-int/2addr v4, v5

    const v5, 0x45588a97

    goto :goto_0

    .line 25
    :sswitch_1
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    .line 39
    :sswitch_2
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v3, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 108
    iput-boolean p1, p0, Ll/ۢۢۡ;->ܰ:Z

    return-void

    :cond_1
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b2f

    const v5, -0x2ef84827

    xor-int/2addr v4, v5

    const v5, 0x4715c258

    goto :goto_0

    .line 7
    :sswitch_6
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06e8\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x21b3

    const v5, -0x488465ea

    xor-int/2addr v4, v5

    const v5, 0x61cac9b4

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x35f1

    const v5, 0x3871c983

    xor-int/2addr v4, v5

    const v5, 0x418b1b83

    goto/16 :goto_0

    .line 90
    :sswitch_8
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u1a76\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d1

    const v5, -0x4d6971c

    xor-int/2addr v4, v5

    const v5, -0x2b1fd6af

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e7\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7cd3

    const v5, -0x7fce114d

    xor-int/2addr v4, v5

    const v5, -0x38e3b48

    goto/16 :goto_0

    .line 59
    :sswitch_9
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u073f\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x438d

    const v5, -0x235ad337

    xor-int/2addr v4, v5

    const v5, 0x20c13452

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_7

    :goto_2
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x46cb

    const v5, 0x44ed04d2

    xor-int/2addr v4, v5

    const v5, -0x393a167d

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1515

    const v5, 0xed895c6

    xor-int/2addr v4, v5

    const v5, -0x1cd8e162

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u1a74\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3449

    const v5, -0x26e92561

    xor-int/2addr v4, v5

    const v5, -0x9e97f69

    goto/16 :goto_0

    .line 17
    :sswitch_c
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    const-string v3, "\u05ab\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7a4b

    const v5, 0x76aafc64

    xor-int/2addr v4, v5

    const v5, 0x547cdd23

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a8\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ae3

    const v5, 0x6be43292

    xor-int/2addr v4, v5

    const v5, 0x6f0c37e0

    goto/16 :goto_0

    .line 21
    :sswitch_d
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x973

    const v5, 0x4d68a018

    xor-int/2addr v4, v5

    const v5, 0x72044ea1

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a0b

    const v5, 0x466a055e

    xor-int/2addr v4, v5

    const v5, -0x573bb858

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06db\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3951

    const v5, 0x3e3711b3

    xor-int/2addr v4, v5

    const v5, -0x59114508

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d059d47 -> :sswitch_d
        -0x76105af4 -> :sswitch_b
        -0x6332f04c -> :sswitch_d
        -0x4ae86ba9 -> :sswitch_e
        -0x44830550 -> :sswitch_8
        -0x4438f99f -> :sswitch_c
        -0x4335b027 -> :sswitch_9
        -0x3c09436a -> :sswitch_a
        -0x317a18a0 -> :sswitch_7
        -0x26fac72d -> :sswitch_b
        -0x2660a4e7 -> :sswitch_0
        -0x224f8303 -> :sswitch_7
        -0xf1e99e7 -> :sswitch_4
        -0x8e8f73b -> :sswitch_6
        0x34fd87d -> :sswitch_6
        0x6241af2 -> :sswitch_9
        0xf4f8712 -> :sswitch_3
        0x1931b1ee -> :sswitch_1
        0x2831e645 -> :sswitch_a
        0x28c3ce6e -> :sswitch_1
        0x32afc646 -> :sswitch_2
        0x36231dde -> :sswitch_0
        0x3add7a38 -> :sswitch_4
        0x3f06df41 -> :sswitch_e
        0x3f572764 -> :sswitch_5
        0x46271f28 -> :sswitch_c
        0x477203b8 -> :sswitch_5
        0x50408800 -> :sswitch_2
        0x5a636e0d -> :sswitch_8
        0x619f6e96 -> :sswitch_3
    .end sparse-switch
.end method

.method public final showContextMenuForChild(Landroid/view/View;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x68df60aa

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    const-string v4, "\u05a8\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x72f3

    const v6, -0x2aa09c5d

    xor-int/2addr v5, v6

    const v6, 0x7f5e1f6a

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x4af9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_2

    goto/16 :goto_4

    .line 125
    :sswitch_0
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v4

    if-lez v4, :cond_7

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v4

    if-gtz v4, :cond_c

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_a

    goto/16 :goto_3

    .line 469
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v4, 0x0

    .line 385
    iput-boolean v4, p0, Ll/ۢۢۡ;->ۜ֫:Z

    goto :goto_1

    :sswitch_6
    const/4 v4, 0x1

    .line 384
    iput-boolean v4, p0, Ll/ۢۢۡ;->ܿ֫:Z

    .line 348
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u06d6\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x24b

    const v6, -0xa9694ab

    xor-int/2addr v5, v6

    const v6, -0x530bc6c3

    goto :goto_0

    :cond_0
    const-string v4, "\u073a\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x40ff

    const v6, -0x5e35ee1e

    xor-int/2addr v5, v6

    const v6, 0x791a6ef

    goto :goto_0

    :sswitch_7
    return v0

    .line 603
    :sswitch_8
    invoke-super {p0, p1}, Landroid/widget/ListView;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v4, "\u1a7b\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x67dd

    const v6, 0x3fb4e41b

    xor-int/2addr v5, v6

    const v6, -0x7f9ccd7c

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u1a78\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c91

    const v6, -0x765e89eb

    xor-int/2addr v5, v6

    const v6, 0x25d29c9b

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06db\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d2f

    const v6, 0x3b480080

    xor-int/2addr v5, v6

    const v6, 0x74db2e6a

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06d8\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1759

    const v6, -0x4d4d3aa9

    xor-int/2addr v5, v6

    const v6, 0x6682a0c

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u073f\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b63

    const v6, -0x16abaa68

    xor-int/2addr v5, v6

    const v6, -0x42875086

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u1a77\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7ca1

    const v6, -0x5e60b843

    xor-int/2addr v5, v6

    const v6, -0x2bc4f2ee

    goto/16 :goto_0

    .line 102
    :sswitch_c
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u0736\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x318b

    const v6, -0x7ef4a6d5

    xor-int/2addr v5, v6

    const v6, -0x6afeb954

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u06e7\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x505

    const v6, 0x6aea4903

    xor-int/2addr v5, v6

    const v6, 0x2c4795

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u073a\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x72bb

    const v6, -0x2423ab39

    xor-int/2addr v5, v6

    const v6, 0x58b7defc

    goto/16 :goto_0

    .line 162
    :sswitch_e
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_9

    :goto_3
    const-string v4, "\u06da\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x13ef

    const v6, 0x5a44a6e8

    xor-int/2addr v5, v6

    const v6, -0x17c08c22

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e2\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5527

    const v6, 0x518da497

    xor-int/2addr v5, v6

    const v6, -0x251023b8

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v4

    if-gtz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u073f\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6c8d

    const v6, 0x5b74e51a

    xor-int/2addr v5, v6

    const v6, 0x3b704462

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e7\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2f41

    const v6, -0x176dd81a

    xor-int/2addr v5, v6

    const v6, -0x782df96

    goto/16 :goto_0

    .line 409
    :sswitch_10
    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v4, :cond_d

    :cond_c
    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x79f1

    const v6, 0x3df73247

    xor-int/2addr v5, v6

    const v6, -0x52ab2bed

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a74\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4b35

    const v6, 0x189d4b00

    xor-int/2addr v5, v6

    const v6, 0x6f105869

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ab9f9d4 -> :sswitch_5
        -0x77a2c593 -> :sswitch_0
        -0x71abcb53 -> :sswitch_f
        -0x719b076c -> :sswitch_3
        -0x6c2b6974 -> :sswitch_c
        -0x678a7946 -> :sswitch_7
        -0x540ab970 -> :sswitch_4
        -0x50414725 -> :sswitch_5
        -0x501d8a20 -> :sswitch_0
        -0x4e447e35 -> :sswitch_a
        -0x4e0c04bd -> :sswitch_d
        -0x4ac71334 -> :sswitch_1
        -0x49cc6692 -> :sswitch_a
        -0x4448d8cf -> :sswitch_e
        -0x41b830c6 -> :sswitch_6
        -0x3e3051d1 -> :sswitch_8
        -0x293498c8 -> :sswitch_b
        -0x1c999b1e -> :sswitch_10
        -0x1936f7cb -> :sswitch_f
        -0x190c5578 -> :sswitch_3
        -0x11612b37 -> :sswitch_2
        0x602f363 -> :sswitch_6
        0x87561ff -> :sswitch_b
        0xa6b4342 -> :sswitch_4
        0xaa16f30 -> :sswitch_1
        0x1098326d -> :sswitch_9
        0x2db4691a -> :sswitch_e
        0x2f909303 -> :sswitch_c
        0x3108e90e -> :sswitch_8
        0x3a3958a8 -> :sswitch_9
        0x53a0165c -> :sswitch_2
        0x6714a951 -> :sswitch_7
        0x6ffb5bf1 -> :sswitch_d
        0x72accf61 -> :sswitch_10
    .end sparse-switch
.end method

.method public final showContextMenuForChild(Landroid/view/View;FF)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x144edc67

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    const-string v4, "\u0733\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x13d5

    const v6, 0x26e79fe

    xor-int/2addr v5, v6

    const v6, 0x31754b97

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x68f1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_7

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_8

    goto/16 :goto_3

    .line 83
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v4

    if-lez v4, :cond_5

    goto :goto_1

    .line 238
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-lez v4, :cond_c

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    :goto_1
    const-string v4, "\u1a74\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3931

    const v6, 0x5a11e8b3

    xor-int/2addr v5, v6

    const v6, 0x44d81a32

    goto :goto_0

    .line 49
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v4, 0x1

    .line 384
    iput-boolean v4, p0, Ll/ۢۢۡ;->ܿ֫:Z

    const/4 v4, 0x0

    .line 385
    iput-boolean v4, p0, Ll/ۢۢۡ;->ۜ֫:Z

    goto :goto_2

    :sswitch_6
    return v0

    .line 615
    :sswitch_7
    invoke-super {p0, p1, p2, p3}, Landroid/widget/ListView;->showContextMenuForChild(Landroid/view/View;FF)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v4, "\u06d8\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1e61

    const v6, -0xb207320

    xor-int/2addr v5, v6

    const v6, 0x34e1c9cc

    goto :goto_0

    :cond_0
    :goto_2
    const-string v4, "\u0733\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa3b

    const v6, -0x7f17b9dd

    xor-int/2addr v5, v6

    const v6, 0x133f5cb5

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u1a76\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1891

    const v6, -0x1b648ca4

    xor-int/2addr v5, v6

    const v6, -0x259c6ad9

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u073d\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x66b9

    const v6, 0x5cd1de7d

    xor-int/2addr v5, v6

    const v6, 0x1b7d62f1

    goto/16 :goto_0

    .line 388
    :sswitch_a
    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x658f

    const v6, 0x3c1c0099

    xor-int/2addr v5, v6

    const v6, 0x7104edfc

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u073d\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x711f

    const v6, 0x5e25523b

    xor-int/2addr v5, v6

    const v6, 0x15084293

    goto/16 :goto_0

    .line 270
    :sswitch_c
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_6

    :cond_5
    :goto_3
    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1c5

    const v6, -0x186a8a2e

    xor-int/2addr v5, v6

    const v6, 0x4584a197

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e0\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1145

    const v6, 0x2758de71

    xor-int/2addr v5, v6

    const v6, 0x57bacd6a

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06da\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6707

    const v6, 0x72b6c6f1

    xor-int/2addr v5, v6

    const v6, 0x738a5393

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_4
    const-string v4, "\u06eb\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2c13

    const v6, -0x5ea048ce

    xor-int/2addr v5, v6

    const v6, -0x43642337

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a73\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6bc5

    const v6, 0x66cac55d

    xor-int/2addr v5, v6

    const v6, 0x72a3c7c5

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_a

    goto :goto_6

    :cond_a
    const-string v4, "\u1a7a\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2849

    const v6, 0x7cb7e8b0

    xor-int/2addr v5, v6

    const v6, 0x146f34e7

    goto/16 :goto_0

    .line 252
    :sswitch_f
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_b

    :goto_5
    const-string v4, "\u1a74\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x58cd

    const v6, -0x6e4d042f

    xor-int/2addr v5, v6

    const v6, 0x1f479e13

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06e7\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1c0d

    const v6, 0x73bfea25

    xor-int/2addr v5, v6

    const v6, 0x1f030d8c

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_6
    const-string v4, "\u06dc\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7e29

    const v6, -0x12623551

    xor-int/2addr v5, v6

    const v6, -0x4b2ce50d

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06db\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x49a3

    const v6, 0x5932ee9

    xor-int/2addr v5, v6

    const v6, -0x44ae5d3a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7434323d -> :sswitch_c
        -0x71026f27 -> :sswitch_6
        -0x6e8f6c92 -> :sswitch_1
        -0x64a1f8d1 -> :sswitch_8
        -0x4a6f5966 -> :sswitch_f
        -0x49cbedd6 -> :sswitch_d
        -0x43461917 -> :sswitch_7
        -0x37190ba9 -> :sswitch_5
        -0x33bc9419 -> :sswitch_a
        -0x2ff98cf7 -> :sswitch_1
        -0x26c0dd75 -> :sswitch_f
        -0x23d0e919 -> :sswitch_c
        -0x1d180ade -> :sswitch_2
        -0x1b49ba52 -> :sswitch_b
        -0x14278224 -> :sswitch_10
        -0x13e039be -> :sswitch_7
        0x66fdc0e -> :sswitch_e
        0xb9bd2d6 -> :sswitch_3
        0x128c45ee -> :sswitch_9
        0x1356710e -> :sswitch_10
        0x17b0623a -> :sswitch_b
        0x1a460d56 -> :sswitch_4
        0x22026b63 -> :sswitch_4
        0x252472d6 -> :sswitch_9
        0x346cd8b8 -> :sswitch_a
        0x34d96680 -> :sswitch_2
        0x404fdfeb -> :sswitch_d
        0x4b6700d4 -> :sswitch_0
        0x4f5e2155 -> :sswitch_8
        0x60c2b428 -> :sswitch_5
        0x6979d23f -> :sswitch_0
        0x6c55f939 -> :sswitch_3
        0x75e6f254 -> :sswitch_6
        0x79da99b3 -> :sswitch_e
    .end sparse-switch
.end method

.method public final ֫()I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x72c947f7

    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    sget v6, Ll/֨᩺;->ۨ֨۬:I

    const-string v7, "\u0730\u0730"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x29

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7871

    const v9, -0x39d9a7ea

    xor-int/2addr v8, v9

    const v9, 0x11c7374f

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x1f95

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 25
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v7

    if-lez v7, :cond_0

    goto/16 :goto_3

    .line 74
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v7, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v7, :cond_d

    goto/16 :goto_4

    .line 116
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v7, Ll/᩺;->ۙۛܶ:I

    if-lez v7, :cond_a

    :cond_0
    const-string v7, "\u05a1\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x31

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2833

    const v9, -0x1de95977

    xor-int/2addr v8, v9

    const v9, 0x24d73856

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto/16 :goto_3

    .line 240
    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    const/4 v0, 0x0

    return v0

    .line 242
    :sswitch_4
    invoke-static {p0}, Ll/֨ۡ;->۠ۡۜ(Ljava/lang/Object;)I

    move-result v2

    div-int/2addr v2, v3

    invoke-static {v0, v2}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v2

    goto :goto_2

    .line 246
    :sswitch_5
    iput v2, p0, Ll/ۢۢۡ;->ܺ֫:I

    goto :goto_1

    .line 247
    :sswitch_6
    iget v0, p0, Ll/ۢۢۡ;->ܺ֫:I

    return v0

    :sswitch_7
    const/4 v3, 0x0

    .line 240
    invoke-static {p0, v3}, Ll/ۗۗ;->۠᩹᩻(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Ll/ۨ;->ۢ᩺ۙ(Ljava/lang/Object;)I

    move-result v3

    if-le v3, v1, :cond_2

    const-string v7, "\u06e0\u1a78"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x79

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5b73

    const v9, 0x157da627

    xor-int/2addr v8, v9

    const v9, 0x4b6c39a6    # 1.5481254E7f

    goto :goto_0

    .line 245
    :sswitch_8
    iget v7, p0, Ll/ۢۢۡ;->ܺ֫:I

    if-le v2, v7, :cond_1

    const-string v7, "\u06d7\u0733"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x1d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6735

    const v9, -0x5c49a27

    xor-int/2addr v8, v9

    const v9, 0x5c2c0e71

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v7, "\u1a76\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5fe5

    const v9, -0x136621ab

    xor-int/2addr v8, v9

    const v9, 0x1a320ad8

    goto/16 :goto_0

    :sswitch_9
    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    const-string v7, "\u06e8\u1a76"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x33ed

    const v9, 0x57ac52f1

    xor-int/2addr v8, v9

    const v9, -0x1009d9a3

    goto/16 :goto_0

    :cond_2
    move v2, v0

    :goto_2
    const-string v7, "\u06d9\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x41

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7235

    const v9, -0x1a606bfa

    xor-int/2addr v8, v9

    const v9, 0x361a6e96

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v7

    if-ltz v7, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v7, "\u06e2\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5c5

    const v9, -0x53c9746b

    xor-int/2addr v8, v9

    const v9, 0xb917138

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v7

    if-ltz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u073a\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x11

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x32c1

    const v9, -0x3659a973

    xor-int/2addr v8, v9

    const v9, -0x5f3dd28f

    goto/16 :goto_0

    .line 148
    :sswitch_c
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v7

    if-ltz v7, :cond_5

    goto :goto_3

    :cond_5
    const-string v7, "\u06e1\u0736"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xe91

    const v9, 0x1ad8dc19

    xor-int/2addr v8, v9

    const v9, 0x6ea9cdde

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v7, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v7, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v7, "\u1a76\u1a77"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5441

    const v9, -0x50488a24

    xor-int/2addr v8, v9

    const v9, -0x6837039d

    goto/16 :goto_0

    .line 95
    :sswitch_e
    sget v7, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v7, :cond_7

    goto :goto_4

    :cond_7
    const-string v7, "\u06e7\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x79

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6d77

    const v9, -0x6b62bb7c

    xor-int/2addr v8, v9

    const v9, 0x46841043

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/۠;->ܺܺܶ:I

    if-ltz v7, :cond_8

    :goto_3
    const-string v7, "\u06e7\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2b3

    const v9, 0x3cee97ba

    xor-int/2addr v8, v9

    const v9, -0x185233cb

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u06da\u0736"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x68d7

    const v9, -0x6944170

    xor-int/2addr v8, v9

    const v9, 0x5bbe4cd7

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v7

    if-eqz v7, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v7, "\u1a79\u05ab"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x21

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x484b

    const v9, -0x574bbc6d

    xor-int/2addr v8, v9

    const v9, -0x3ba13e7d

    goto/16 :goto_0

    .line 16
    :sswitch_11
    sget v7, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v7, :cond_b

    :cond_a
    :goto_4
    const-string v7, "\u073f\u073f"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5291

    const v9, 0x1563720d

    xor-int/2addr v8, v9

    const v9, -0x26a71798

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u073d\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x5d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2f09

    const v9, -0x562d1ba8

    xor-int/2addr v8, v9

    const v9, 0x53cfcfa8

    goto/16 :goto_0

    .line 197
    :sswitch_12
    sget v7, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v7, :cond_c

    :goto_5
    const-string v7, "\u06d9\u06d9"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x1d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7f1

    const v9, 0x1f61930e

    xor-int/2addr v8, v9

    const v9, 0x3d59a633

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u1a78\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x62b1

    const v9, 0x1ab7232d

    xor-int/2addr v8, v9

    const v9, -0x15cae465

    goto/16 :goto_0

    .line 238
    :sswitch_13
    invoke-static {p0}, Ll/ۘۛ;->ۛ֡ۘ(Ljava/lang/Object;)I

    move-result v0

    .line 19
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v7

    if-eqz v7, :cond_e

    :cond_d
    :goto_6
    const-string v7, "\u1a75\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x1d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x33c1

    const v9, -0x4c0d4598

    xor-int/2addr v8, v9

    const v9, -0x2dea75f

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u073a\u05ab"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x21

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3e3b

    const v9, -0x7c7dde70

    xor-int/2addr v8, v9

    const v9, 0x652c87dd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d7fae8f -> :sswitch_b
        -0x7916579c -> :sswitch_9
        -0x72f283be -> :sswitch_3
        -0x6f79d98f -> :sswitch_4
        -0x6ab80b21 -> :sswitch_4
        -0x68b6cb34 -> :sswitch_6
        -0x685b7906 -> :sswitch_0
        -0x5b98348f -> :sswitch_3
        -0x560370f1 -> :sswitch_11
        -0x53c3f2b9 -> :sswitch_7
        -0x51e365cf -> :sswitch_11
        -0x4dd77f85 -> :sswitch_d
        -0x3fe31297 -> :sswitch_10
        -0x37017926 -> :sswitch_2
        -0x355b1405 -> :sswitch_13
        -0x29396dde -> :sswitch_e
        -0x2255e16f -> :sswitch_8
        -0xdf8604e -> :sswitch_b
        -0xcc9e61d -> :sswitch_1
        -0xc4828f1 -> :sswitch_10
        -0x7420968 -> :sswitch_f
        -0x428eb08 -> :sswitch_1
        -0x3d1215a -> :sswitch_d
        -0x3467bef -> :sswitch_12
        0xb6d8d2b -> :sswitch_c
        0xe31e289 -> :sswitch_5
        0x1ab3b7cb -> :sswitch_c
        0x1ce87160 -> :sswitch_13
        0x20ab14e5 -> :sswitch_a
        0x211ad92b -> :sswitch_a
        0x21a5b6c1 -> :sswitch_7
        0x39e33f3b -> :sswitch_e
        0x46068e06 -> :sswitch_8
        0x470f3c6b -> :sswitch_2
        0x4ae7caab -> :sswitch_5
        0x59b87c05 -> :sswitch_12
        0x5bd930ee -> :sswitch_f
        0x5c2ad7e9 -> :sswitch_9
        0x6d63de19 -> :sswitch_6
        0x6f444daf -> :sswitch_0
    .end sparse-switch
.end method

.method public final ֫(Landroid/view/View$OnTouchListener;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x17e1b249

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    const-string v4, "\u06eb\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5c61

    const v6, -0x2720ddd4

    xor-int/2addr v5, v6

    const v6, 0xbba488d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0xbb3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 80
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_4

    goto/16 :goto_5

    .line 355
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v4, Ll/᩹;->ۤܿܳ:I

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u05a8\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x68e9

    const v6, -0x8af4626

    xor-int/2addr v5, v6

    const v6, 0x26c782b9

    goto :goto_0

    .line 439
    :sswitch_1
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_c

    goto :goto_1

    .line 559
    :sswitch_2
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v4, :cond_9

    goto :goto_1

    .line 740
    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    :goto_1
    const-string v4, "\u1a73\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x31c3

    const v6, 0x5186138c

    xor-int/2addr v5, v6

    const v6, -0x2bcbeed5

    goto :goto_0

    .line 336
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    return-void

    .line 752
    :sswitch_5
    new-instance v4, Ll/ܿۢۡ;

    invoke-direct {v4, p0}, Ll/ܿۢۡ;-><init>(Ll/ۢۢۡ;)V

    invoke-super {p0, v4}, Landroid/widget/ListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_2

    .line 751
    :sswitch_6
    iput-object v0, p0, Ll/ۢۢۡ;->ۘ֫:Ljava/util/ArrayList;

    .line 444
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06e7\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2feb

    const v6, 0xe41809b

    xor-int/2addr v5, v6

    const v6, 0x2acc4718

    goto :goto_0

    .line 751
    :sswitch_7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 707
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u06eb\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6bb7

    const v6, -0x7143ccb3

    xor-int/2addr v5, v6

    const v6, 0x2c3d6f22

    goto/16 :goto_0

    .line 765
    :sswitch_8
    iget-object v0, p0, Ll/ۢۢۡ;->ۘ֫:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    .line 750
    :sswitch_9
    iget-object v4, p0, Ll/ۢۢۡ;->ۘ֫:Ljava/util/ArrayList;

    if-nez v4, :cond_3

    const-string v4, "\u06da\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3173

    const v6, 0x5c8b5d54

    xor-int/2addr v5, v6

    const v6, -0xef809c1

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v4, "\u06df\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x674d

    const v6, -0x139225b

    xor-int/2addr v5, v6

    const v6, -0x196979b7

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06ec\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6acd

    const v6, 0x24399ed2    # 4.0250006E-17f

    xor-int/2addr v5, v6

    const v6, 0x6bc53974

    goto/16 :goto_0

    .line 246
    :sswitch_a
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v4, "\u073d\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x51db

    const v6, -0x7ddce462

    xor-int/2addr v5, v6

    const v6, 0x66d30eaa

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06df\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1287

    const v6, -0x17cc803c

    xor-int/2addr v5, v6

    const v6, 0x2af17f98

    goto/16 :goto_0

    .line 333
    :sswitch_c
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_7

    :goto_3
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fa5

    const v6, -0x17f40ab4

    xor-int/2addr v5, v6

    const v6, -0x2ad6ed45

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06da\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3aa9

    const v6, -0x1107d845

    xor-int/2addr v5, v6

    const v6, -0x59ee748

    goto/16 :goto_0

    .line 195
    :sswitch_d
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v4

    if-gtz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u1a7a\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x52a9

    const v6, 0x1176c921

    xor-int/2addr v5, v6

    const v6, 0x1c511634

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u06d7\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x38bb

    const v6, 0x72210456

    xor-int/2addr v5, v6

    const v6, 0x6367e572

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d6\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ee5

    const v6, -0x58536195

    xor-int/2addr v5, v6

    const v6, -0x42735d03

    goto/16 :goto_0

    .line 662
    :sswitch_f
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_b

    goto :goto_5

    :cond_b
    const-string v4, "\u06df\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xbf1

    const v6, -0x2267ded0

    xor-int/2addr v5, v6

    const v6, 0x1fe23bf9

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u05a8\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1bfd

    const v6, -0x2960055

    xor-int/2addr v5, v6

    const v6, 0x1724aa08

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u073f\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5da7

    const v6, -0x1e621f77

    xor-int/2addr v5, v6

    const v6, -0x47cdfa56

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78cdc2fd -> :sswitch_9
        -0x71cd7e45 -> :sswitch_2
        -0x706f34c3 -> :sswitch_3
        -0x6f9a0a0a -> :sswitch_d
        -0x6c406f73 -> :sswitch_0
        -0x6176c34f -> :sswitch_f
        -0x5f1532eb -> :sswitch_7
        -0x4c7a1239 -> :sswitch_6
        -0x47de1015 -> :sswitch_b
        -0x3a64e0d4 -> :sswitch_a
        -0x39f99a6e -> :sswitch_a
        -0x37ad3903 -> :sswitch_c
        -0x35cf41e8 -> :sswitch_1
        -0x21ecc9a7 -> :sswitch_2
        -0x1cdc0103 -> :sswitch_8
        -0x11b03237 -> :sswitch_e
        -0x100d3bc3 -> :sswitch_4
        -0xd737e72 -> :sswitch_4
        -0xceaeaab -> :sswitch_e
        0xa866caf -> :sswitch_6
        0x1214a354 -> :sswitch_8
        0x2d0166a0 -> :sswitch_10
        0x322075fc -> :sswitch_b
        0x3ae9f4f7 -> :sswitch_c
        0x3d957da3 -> :sswitch_7
        0x4fd5314f -> :sswitch_10
        0x517b8d4d -> :sswitch_d
        0x544399af -> :sswitch_5
        0x5eb71b0b -> :sswitch_f
        0x5ef430cc -> :sswitch_0
        0x60ff722d -> :sswitch_5
        0x6691758b -> :sswitch_1
        0x6762cf1e -> :sswitch_3
        0x7111495a -> :sswitch_9
    .end sparse-switch
.end method

.method public final ֫(Ll/۬ۧ֫;)V
    .locals 6

    const v0, -0x87fa817

    sget v1, Ll/֡᩶;->ܳܶ۠:I

    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3377

    const v5, 0x147a10cd

    xor-int/2addr v4, v5

    const v5, 0x67167104

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x538d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 251
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_2

    .line 111
    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a75\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71f1

    const v5, -0x4ec5f658

    xor-int/2addr v4, v5

    const v5, -0x425d9129

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, "\u1a77\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2fd3

    const v5, -0x59bad5d9

    xor-int/2addr v4, v5

    const v5, 0x2027e2d3    # 1.42205E-19f

    goto :goto_0

    :sswitch_1
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_8

    goto/16 :goto_4

    .line 543
    :sswitch_2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto/16 :goto_4

    .line 523
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    return-void

    :sswitch_4
    const p1, 0x800005

    .line 627
    iput p1, p0, Ll/ۢۢۡ;->۫:I

    return-void

    .line 626
    :sswitch_5
    iput-object p1, p0, Ll/ۢۢۡ;->۬:Ll/۬ۧ֫;

    .line 555
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06e2\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x79af

    const v5, 0x1585a5f9

    xor-int/2addr v4, v5

    const v5, -0x6679d2c5

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a73\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x279b

    const v5, -0x77499292

    xor-int/2addr v4, v5

    const v5, 0x6adf860f

    goto/16 :goto_0

    .line 70
    :sswitch_7
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06da\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xd1b

    const v5, 0x4841031a

    xor-int/2addr v4, v5

    const v5, 0x5ee83e5

    goto/16 :goto_0

    .line 171
    :sswitch_8
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06e2\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f39

    const v5, -0xd88dafe

    xor-int/2addr v4, v5

    const v5, 0x773c39ea

    goto/16 :goto_0

    .line 217
    :sswitch_9
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a7a\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4df5

    const v5, 0x3104c29

    xor-int/2addr v4, v5

    const v5, -0x3f20e39

    goto/16 :goto_0

    .line 356
    :sswitch_a
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a7b\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x100f

    const v5, -0xc7bb3ed

    xor-int/2addr v4, v5

    const v5, 0x3cbecb2e    # 0.023290243f

    goto/16 :goto_0

    .line 198
    :sswitch_b
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u1a79\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5f5f

    const v5, 0xbe8e998

    xor-int/2addr v4, v5

    const v5, -0x4a525905

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e7\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x780d

    const v5, 0x4cb6d3a

    xor-int/2addr v4, v5

    const v5, 0x53dbbe2a

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u06da\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1003

    const v5, 0xf3730a0

    xor-int/2addr v4, v5

    const v5, -0x79e2f521

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0736\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x3b

    const v5, -0x61d873f1

    xor-int/2addr v4, v5

    const v5, 0x24f73125

    goto/16 :goto_0

    .line 322
    :sswitch_d
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u06e4\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xd7f

    const v5, -0x736e1fd7

    xor-int/2addr v4, v5

    const v5, -0x2dc3e737

    goto/16 :goto_0

    .line 121
    :sswitch_e
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a2d

    const v5, 0x35aedd5a

    xor-int/2addr v4, v5

    const v5, 0x3589e580

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6fd3

    const v5, 0x369efd12

    xor-int/2addr v4, v5

    const v5, -0x16a51983

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x707ca899 -> :sswitch_d
        -0x5e81c211 -> :sswitch_c
        -0x5d5ba6d3 -> :sswitch_e
        -0x59dc684d -> :sswitch_0
        -0x5542a828 -> :sswitch_2
        -0x53ae4f57 -> :sswitch_2
        -0x4ebe7885 -> :sswitch_c
        -0x4522577d -> :sswitch_9
        -0x3c20fc5f -> :sswitch_d
        -0x390b79e2 -> :sswitch_7
        -0x3577009d -> :sswitch_8
        -0x31246787 -> :sswitch_e
        -0x2183b3eb -> :sswitch_1
        -0x1f3b5326 -> :sswitch_0
        -0x1df1eb80 -> :sswitch_3
        -0xd1a9404 -> :sswitch_8
        -0xa0461d -> :sswitch_4
        0x2b9048e -> :sswitch_7
        0x96b8d8d -> :sswitch_a
        0x306c539c -> :sswitch_5
        0x32accce4 -> :sswitch_4
        0x528f067e -> :sswitch_6
        0x53507791 -> :sswitch_3
        0x5acacb6b -> :sswitch_1
        0x5d19d67c -> :sswitch_b
        0x5f5eb73f -> :sswitch_6
        0x6a506e80 -> :sswitch_5
        0x717d2d11 -> :sswitch_a
        0x793a39cb -> :sswitch_b
        0x7b3b1258 -> :sswitch_9
    .end sparse-switch
.end method

.method public final ۧ()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Ll/ۢۢۡ;->ᩴ֫:Z

    return v0
.end method

.method public final ܽ()Z
    .locals 6

    const v0, 0x243f2064

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v3, "\u06d6\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c01

    const v5, 0x1020338

    xor-int/2addr v4, v5

    const v5, 0x4ad84a66    # 7087411.0f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x2925

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 55
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_a

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    .line 13
    :sswitch_1
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v3, :cond_9

    goto/16 :goto_5

    .line 59
    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v3

    if-gtz v3, :cond_d

    goto/16 :goto_2

    .line 18
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto/16 :goto_2

    .line 11
    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v0, 0x0

    return v0

    .line 98
    :sswitch_6
    iget-boolean v3, p0, Ll/ۢۢۡ;->ᩴ֫:Z

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2ba9

    const v5, -0xfec18d

    xor-int/2addr v4, v5

    const v5, -0x2d9fec6f

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x1

    return v0

    :sswitch_8
    invoke-direct {p0}, Ll/ۢۢۡ;->ܳ()Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x30d5

    const v5, 0x83c9e3

    xor-int/2addr v4, v5

    const v5, -0x68878b61

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6de1

    const v5, 0x389e7ce0

    xor-int/2addr v4, v5

    const v5, 0x3ac25c19

    goto/16 :goto_0

    .line 31
    :sswitch_9
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b1f

    const v5, -0xa69c6bf

    xor-int/2addr v4, v5

    const v5, 0x4b7dfb2

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x54b7

    const v5, 0x59de605f

    xor-int/2addr v4, v5

    const v5, -0x5ae528f4

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0733\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ebd

    const v5, 0x57cc228e

    xor-int/2addr v4, v5

    const v5, -0x2c626716

    goto/16 :goto_0

    .line 96
    :sswitch_b
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a78\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1649

    const v5, 0x4591ca74

    xor-int/2addr v4, v5

    const v5, 0x4e5a062

    goto/16 :goto_0

    .line 66
    :sswitch_c
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06e8\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xc65

    const v5, -0x598571af

    xor-int/2addr v4, v5

    const v5, -0x39137e28

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_7

    :goto_2
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5627

    const v5, -0x625b03e7

    xor-int/2addr v4, v5

    const v5, -0x45d9f7b7

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e8\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5897

    const v5, 0x7ed6dd8

    xor-int/2addr v4, v5

    const v5, 0x7e87feeb

    goto/16 :goto_0

    .line 40
    :sswitch_e
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6259

    const v5, 0x1b7adb2f

    xor-int/2addr v4, v5

    const v5, -0x15ca9a57

    goto/16 :goto_0

    :cond_9
    :goto_3
    const-string v3, "\u06e1\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31ff

    const v5, 0xe6a9452

    xor-int/2addr v4, v5

    const v5, 0x6af1ac

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5669

    const v5, 0x5e606050

    xor-int/2addr v4, v5

    const v5, 0x35df737c

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_b

    goto :goto_5

    :cond_b
    const-string v3, "\u1a78\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xccb

    const v5, 0x54e5f7d6

    xor-int/2addr v4, v5

    const v5, 0x21551b6d

    goto/16 :goto_0

    :sswitch_10
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u05a1\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44bf

    const v5, -0x52f1a0a

    xor-int/2addr v4, v5

    const v5, -0x65bcd028

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0730\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e5d

    const v5, 0x1491763b

    xor-int/2addr v4, v5

    const v5, -0x3bfa469a

    goto/16 :goto_0

    :sswitch_11
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_e

    :cond_d
    :goto_5
    const-string v3, "\u1a79\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e3

    const v5, 0x75fdd176

    xor-int/2addr v4, v5

    const v5, 0x19790a8f

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u1a74\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3531

    const v5, -0x94af947

    xor-int/2addr v4, v5

    const v5, 0x77a7f107

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f68e16b -> :sswitch_6
        -0x78997ccf -> :sswitch_5
        -0x6e1caa5b -> :sswitch_d
        -0x6955e8ab -> :sswitch_7
        -0x652b012b -> :sswitch_e
        -0x628fd20d -> :sswitch_4
        -0x5f274ee0 -> :sswitch_d
        -0x5affd9d5 -> :sswitch_2
        -0x59779c8f -> :sswitch_1
        -0x5443ad24 -> :sswitch_8
        -0x5315c9f0 -> :sswitch_c
        -0x4e6b5336 -> :sswitch_2
        -0x4a9c1ffb -> :sswitch_c
        -0x498d78d9 -> :sswitch_3
        -0x390f4711 -> :sswitch_9
        -0x2aa01cd6 -> :sswitch_a
        -0x1f1b2761 -> :sswitch_0
        -0x1a2fd964 -> :sswitch_11
        -0x15e806ce -> :sswitch_7
        -0x9ad2d86 -> :sswitch_4
        -0x5a6f0c9 -> :sswitch_3
        -0x32ece59 -> :sswitch_b
        0x22472a9 -> :sswitch_9
        0x3070024 -> :sswitch_0
        0x10752aa6 -> :sswitch_f
        0x12d05265 -> :sswitch_a
        0x158de054 -> :sswitch_1
        0x2062e51d -> :sswitch_10
        0x2a6d169e -> :sswitch_e
        0x2b2b19b3 -> :sswitch_5
        0x4522bcf9 -> :sswitch_f
        0x46790813 -> :sswitch_b
        0x46e43bb6 -> :sswitch_6
        0x47e12b14 -> :sswitch_10
        0x72ab7af4 -> :sswitch_11
        0x751604c1 -> :sswitch_8
    .end sparse-switch
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 198
    iput v0, p0, Ll/ۢۢۡ;->᩺:I

    return-void
.end method
