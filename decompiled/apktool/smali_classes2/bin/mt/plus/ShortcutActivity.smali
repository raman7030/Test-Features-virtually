.class public Lbin/mt/plus/ShortcutActivity;
.super Ll/֫᩹᩷;
.source "ShortcutActivity.java"


# static fields
.field public static ֡֫:Ljava/lang/Boolean;

.field private static final ۚ֡᩺:[S

.field public static final ᩵֫:Ll/ܶ᩵ܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    const/16 v0, 0x1e6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u06ec\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3957

    const v6, 0x1ac8566b

    xor-int/2addr v5, v6

    const v6, 0x114c3034

    xor-int/2addr v4, v6

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

    const v16, 0x18fec642

    const/16 v17, 0x0

    :goto_0
    xor-int v11, v16, v2

    mul-int/lit16 v11, v11, -0x4cb1

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v5, v11

    xor-int v16, v4, v5

    sparse-switch v16, :sswitch_data_0

    mul-int v4, v8, v12

    sub-int v4, v4, v17

    if-gtz v4, :cond_d

    const-string v4, "\u06e8\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x71ed

    const v11, 0x3d32bffd

    xor-int/2addr v5, v11

    const v11, 0x63b9233d

    goto/16 :goto_6

    .line 281
    :sswitch_0
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u1a73\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x758d

    const v11, -0x46fcf1f

    xor-int/2addr v5, v11

    const v11, 0x2818ec29

    goto/16 :goto_6

    .line 284
    :sswitch_1
    aget-short v8, v0, v7

    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2d87

    const v11, 0x7dc75bd

    xor-int/2addr v5, v11

    const v11, -0x42e8d44c

    goto/16 :goto_6

    :sswitch_2
    const v4, 0xb20e

    goto/16 :goto_1

    .line 281
    :sswitch_3
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v4, :cond_2

    goto/16 :goto_3

    .line 283
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 281
    :sswitch_5
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v4, :cond_8

    goto/16 :goto_4

    :sswitch_6
    const/4 v14, 0x1

    .line 280
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u1a76\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2deb

    const v11, -0x2cc1d78b

    xor-int/2addr v5, v11

    const v11, -0x2bae9575

    goto/16 :goto_6

    :cond_3
    const-string v4, "\u1a77\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1f21

    const v11, 0x34a5a4c0

    xor-int/2addr v5, v11

    const v11, -0x5bac9328

    goto/16 :goto_6

    .line 281
    :sswitch_7
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v4

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x446d

    const v11, -0x2976329b

    xor-int/2addr v5, v11

    const v11, -0x2bf16f8

    goto/16 :goto_6

    :sswitch_8
    mul-int v9, v8, v8

    const v10, 0x61840

    .line 284
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3d33

    const v11, 0x5ffafe04

    xor-int/2addr v5, v11

    const v11, 0x64c428a

    goto/16 :goto_6

    :sswitch_9
    const v4, 0xd3af

    :goto_1
    const-string v5, "\u06e1\u06d9"

    .line 281
    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v2

    xor-int v11, v5, v3

    mul-int/lit16 v11, v11, -0x6d87

    const v13, 0x4894be9e

    xor-int/2addr v11, v13

    const v13, 0x59215ad3

    move v13, v4

    move v4, v5

    move v5, v11

    const v11, 0x59215ad3

    goto/16 :goto_6

    :sswitch_a
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u06db\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x512d

    const v11, 0x32232b0f

    xor-int/2addr v5, v11

    const v11, -0x725265a8

    goto/16 :goto_6

    .line 280
    :sswitch_b
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v4

    if-ltz v4, :cond_7

    const/16 v15, 0x9

    :goto_2
    const-string v4, "\u1a7b\u06d7"

    .line 281
    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5207

    const v11, -0x5af42e51

    xor-int/2addr v5, v11

    const v11, -0x2bbff013

    goto/16 :goto_6

    :cond_7
    const-string v4, "\u0736\u1a73"

    .line 280
    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6ae9

    const v11, 0x265658f1

    xor-int/2addr v5, v11

    const v11, 0x3fe3d599

    xor-int/2addr v4, v11

    const/16 v15, 0x9

    goto/16 :goto_0

    .line 281
    :sswitch_c
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v4, :cond_b

    goto :goto_4

    .line 280
    :sswitch_d
    sget-object v6, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    .line 281
    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06d9\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3b71

    const v11, 0x293ea31e

    xor-int/2addr v5, v11

    const v11, -0x68cb6c7e

    goto/16 :goto_6

    :cond_9
    const-string v4, "\u06e0\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1427

    const v11, -0x5be8e128

    xor-int/2addr v5, v11

    const v11, 0xb29bde1

    goto/16 :goto_6

    :sswitch_e
    add-int v11, v9, v10

    const/16 v12, 0x4f0

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u06e2\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1219

    const v17, -0x7ebf3656

    xor-int v5, v5, v17

    const v17, -0x457fd13

    move/from16 v17, v11

    const v11, -0x457fd13

    goto :goto_6

    .line 282
    :sswitch_f
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    :goto_4
    const-string v4, "\u06d8\u073a"

    .line 281
    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xf2d

    const v11, 0x5ca41f77

    xor-int/2addr v5, v11

    const v11, -0x4ea694c

    goto :goto_6

    .line 280
    :sswitch_10
    invoke-static {v1, v14, v15, v13}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Ll/֫֫;->ۤ۟ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v0

    sput-object v0, Lbin/mt/plus/ShortcutActivity;->᩵֫:Ll/ܶ᩵ܿ;

    return-void

    .line 281
    :sswitch_11
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/4 v7, 0x0

    .line 280
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    move/from16 v11, v17

    :goto_5
    const-string v4, "\u06d9\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc17

    const v17, 0x38df278d

    xor-int v5, v5, v17

    const v17, 0x7995ec8d

    move/from16 v17, v11

    const v11, 0x7995ec8d

    goto :goto_6

    :cond_c
    const-string v4, "\u06eb\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x36af

    const v11, 0x3119edc6

    xor-int/2addr v5, v11

    const v11, 0x52b57913

    goto :goto_6

    :cond_d
    const-string v4, "\u073a\u06ec"

    .line 281
    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1fd7

    const v11, -0x44a41557

    xor-int/2addr v5, v11

    const v11, -0x13bc52b0

    :goto_6
    xor-int/2addr v4, v11

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f50e1ef -> :sswitch_11
        -0x7e98367e -> :sswitch_10
        -0x72f2dc48 -> :sswitch_f
        -0x6bee7fe5 -> :sswitch_e
        -0x60f2c831 -> :sswitch_d
        -0x5dbedf45 -> :sswitch_c
        -0x5ad28b72 -> :sswitch_b
        -0x4e1fd6b7 -> :sswitch_a
        -0x46bd8812 -> :sswitch_9
        -0x44e6d288 -> :sswitch_8
        -0x3f25869c -> :sswitch_d
        -0x3ca9846e -> :sswitch_7
        -0x3c335026 -> :sswitch_7
        -0x3871d342 -> :sswitch_6
        -0x36a3f0a9 -> :sswitch_5
        -0x2b49b2f2 -> :sswitch_8
        -0x2a8ba2f0 -> :sswitch_4
        -0x228e5864 -> :sswitch_11
        -0x1789177f -> :sswitch_5
        -0xfc51ae0 -> :sswitch_3
        -0x5bdff98 -> :sswitch_2
        0x6df2d57 -> :sswitch_6
        0x6f7d4f8 -> :sswitch_1
        0x8d81fa8 -> :sswitch_9
        0xecfb733 -> :sswitch_f
        0x36605bfb -> :sswitch_10
        0x3daba83c -> :sswitch_b
        0x3fe1faa0 -> :sswitch_e
        0x41e56f06 -> :sswitch_2
        0x45b18edb -> :sswitch_c
        0x4db8cbfe -> :sswitch_3
        0x581b9a9d -> :sswitch_0
        0x616a5ef7 -> :sswitch_1
        0x64bbcad9 -> :sswitch_0
        0x6af692fc -> :sswitch_4
        0x6c7eaa96 -> :sswitch_a
    .end sparse-switch

    :array_0
    .array-data 2
        0x5c0s
        -0x4d83s
        -0x4d9as
        -0x4d9fs
        -0x4d84s
        -0x4d86s
        -0x4d93s
        -0x4d85s
        -0x4d86s
        -0x4d83s
        0xe38s
        -0x412bs
        0x69c1s
        -0x6f13s
        -0xffes
        -0xfe7s
        -0xfe7s
        -0xfe6s
        -0xfa5s
        -0xfe7s
        -0xffas
        -0xfeds
        -0xffcs
        -0xfe9s
        -0xffes
        -0xfe1s
        -0xfe7s
        -0xfe8s
        -0xffds
        -0xffas
        -0xfees
        -0xfe9s
        -0xffes
        -0xfeds
        -0xfc6s
        -0xfe9s
        -0xfecs
        -0xfeds
        -0xfe6s
        -0xfe9s
        -0xfebs
        -0xfebs
        -0xfeds
        -0xfe8s
        -0xffes
        -0xfcbs
        -0xfe7s
        -0xfe6s
        -0xfe7s
        -0xffcs
        -0xfc1s
        -0xfebs
        -0xfe7s
        -0xfe8s
        -0xff0s
        -0xfe7s
        -0xfe6s
        -0xfees
        -0xfeds
        -0xffcs
        -0xfcbs
        -0xfe7s
        -0xfe6s
        -0xfe7s
        -0xffcs
        -0xfc1s
        -0xfebs
        -0xfe7s
        -0xfe8s
        0x7335s
        0x6385s
        -0x7e9as
        0x7ac4s
        0x635as
        -0x5a57s
        -0xfe1s
        -0xffbs
        -0xfces
        -0xfe1s
        -0xffcs
        0x10e8s
        -0x54fas
        -0x54e7s
        -0x54f4s
        -0x54e5s
        -0x54f8s
        -0x54e3s
        -0x5500s
        -0x54fas
        -0x54f9s
        -0x54e7s
        -0x54f8s
        -0x54e3s
        -0x54ffs
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54f4s
        -0x54efs
        -0x54e3s
        -0x54e5s
        -0x54f8s
        -0x54f6s
        -0x54e3s
        -0x54bcs
        -0x54f8s
        -0x54e7s
        -0x54fes
        -0x54f4s
        -0x54f3s
        -0x5500s
        -0x54e3s
        -0x54bcs
        -0x54e3s
        -0x54f4s
        -0x54efs
        -0x54e3s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54f8s
        -0x54e7s
        -0x54fes
        -0x54bcs
        -0x54fcs
        -0x54f6s
        -0x54e7s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54fcs
        -0x54e4s
        -0x54e6s
        -0x5500s
        -0x54f6s
        -0x54bcs
        -0x54e7s
        -0x54fbs
        -0x54f8s
        -0x54f0s
        -0x54f4s
        -0x54e5s
        -0x54e7s
        -0x54e5s
        -0x54f4s
        -0x54e1s
        -0x5500s
        -0x54f4s
        -0x54e2s
        -0x54bcs
        -0x54ffs
        -0x54e3s
        -0x54fcs
        -0x54fbs
        -0x54fas
        -0x54e7s
        -0x54f4s
        -0x54f9s
        -0x54bcs
        -0x54f9s
        -0x54e6s
        -0x54fbs
        -0x54fas
        -0x54f6s
        -0x54f8s
        -0x54e3s
        -0x54f4s
        -0x54bcs
        -0x54f6s
        -0x54fbs
        -0x5500s
        -0x54f6s
        -0x54fes
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54f6s
        -0x54fas
        -0x54fbs
        -0x54fas
        -0x54e5s
        -0x54bcs
        -0x54e7s
        -0x5500s
        -0x54f6s
        -0x54fes
        -0x54f4s
        -0x54e5s
        -0x54fbs
        -0x54fas
        -0x54f6s
        -0x54f8s
        -0x54e3s
        -0x54f4s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e3s
        -0x54f4s
        -0x54e5s
        -0x54fcs
        -0x5500s
        -0x54f9s
        -0x54f8s
        -0x54fbs
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e6s
        -0x5500s
        -0x54f2s
        -0x54f9s
        -0x54f8s
        -0x54e3s
        -0x54e4s
        -0x54e5s
        -0x54f4s
        -0x54bcs
        -0x54fes
        -0x54f4s
        -0x54f0s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54f8s
        -0x54f6s
        -0x54e3s
        -0x5500s
        -0x54e1s
        -0x5500s
        -0x54e3s
        -0x54f0s
        -0x54bcs
        -0x54e5s
        -0x54f4s
        -0x54f6s
        -0x54fas
        -0x54e5s
        -0x54f3s
        -0x54f2s
        -0x54fas
        -0x54e3s
        -0x54fas
        -0x54bcs
        -0x54fas
        -0x54e5s
        -0x54bcs
        -0x54fbs
        -0x54fas
        -0x54f6s
        -0x54f8s
        -0x54e3s
        -0x54f4s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e7s
        -0x54fbs
        -0x54e4s
        -0x54f2s
        -0x5500s
        -0x54f9s
        -0x54bcs
        -0x54fcs
        -0x54f8s
        -0x54f9s
        -0x54f8s
        -0x54f2s
        -0x54f4s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e6s
        -0x54e3s
        -0x54e5s
        -0x54f4s
        -0x54f8s
        -0x54fcs
        -0x54bcs
        -0x54fcs
        -0x54f4s
        -0x54f3s
        -0x5500s
        -0x54f8s
        -0x54f2s
        -0x54fas
        -0x54e3s
        -0x54fas
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e6s
        -0x54fcs
        -0x54f8s
        -0x54fbs
        -0x5500s
        -0x54bcs
        -0x54e8s
        -0x54e4s
        -0x54f4s
        -0x54e5s
        -0x54f0s
        -0x54f4s
        -0x54efs
        -0x54f4s
        -0x54f6s
        -0x54bcs
        -0x54e6s
        -0x54f6s
        -0x54e5s
        -0x5500s
        -0x54e7s
        -0x54e3s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e3s
        -0x54e4s
        -0x54e3s
        -0x54fas
        -0x54e5s
        -0x5500s
        -0x54f8s
        -0x54fbs
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e5s
        -0x54f4s
        -0x54fcs
        -0x54fas
        -0x54e3s
        -0x54f4s
        -0x54bcs
        -0x54e7s
        -0x54f8s
        -0x54f0s
        -0x54fbs
        -0x54fas
        -0x54f8s
        -0x54f3s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e5s
        -0x54f4s
        -0x54fcs
        -0x54fas
        -0x54e3s
        -0x54f4s
        -0x54bcs
        -0x54fcs
        -0x54f8s
        -0x54f9s
        -0x54f8s
        -0x54f2s
        -0x54f4s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54f6s
        -0x54fas
        -0x54fcs
        -0x54fcs
        -0x54fas
        -0x54f9s
        -0x54bcs
        -0x54e7s
        -0x54f8s
        -0x54e6s
        -0x54e6s
        -0x54e2s
        -0x54fas
        -0x54e5s
        -0x54f3s
        -0x54e6s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e5s
        -0x54f4s
        -0x54f6s
        -0x54f0s
        -0x54f6s
        -0x54fbs
        -0x54f4s
        -0x54bcs
        -0x54f5s
        -0x5500s
        -0x54f9s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54f8s
        -0x54e7s
        -0x54e7s
        -0x54bcs
        -0x54e7s
        -0x54e5s
        -0x54fas
        -0x54e3s
        -0x54f4s
        -0x54f6s
        -0x54e3s
        -0x54e3s
        -0x54fas
        -0x54fas
        -0x54fbs
        -0x54bcs
        -0x54e3s
        -0x54f4s
        -0x54efs
        -0x54e3s
        -0x54bcs
        -0x54f4s
        -0x54f3s
        -0x5500s
        -0x54e3s
        -0x54fas
        -0x54e5s
        -0x54f8s
        -0x54f9s
        -0x54f3s
        -0x54e5s
        -0x54fas
        -0x5500s
        -0x54f3s
        -0x54b9s
        -0x5500s
        -0x54f9s
        -0x54e3s
        -0x54f4s
        -0x54f9s
        -0x54e3s
        -0x54b9s
        -0x54f8s
        -0x54f6s
        -0x54e3s
        -0x5500s
        -0x54fas
        -0x54f9s
        -0x54b9s
        -0x54c1s
        -0x54e0s
        -0x54d4s
        -0x54c2s
        -0x54e6s
        -0x54ffs
        -0x54fas
        -0x54e5s
        -0x54e3s
        -0x54f6s
        -0x54e4s
        -0x54e3s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ll/֫᩹᩷;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x4b4027a6

    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v5, Ll/֨۬;->۫ۙ᩺:I

    const-string v6, "\u073f\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x463d

    const v8, -0x269c0fd1

    xor-int/2addr v7, v8

    const v8, 0x72296511

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x4821

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 48
    sget v6, Ll/ۛ;->᩺᩻֫:I

    if-ltz v6, :cond_8

    goto/16 :goto_7

    :sswitch_0
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v6, Ll/᩹;->ۤܿܳ:I

    if-eqz v6, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v6

    if-gtz v6, :cond_4

    goto/16 :goto_7

    .line 32
    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget v6, Ll/֡֡;->֫ۤܳ:I

    if-gez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u05a8\u1a74"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1ae1

    const v8, 0x1f6cbc9b

    xor-int/2addr v7, v8

    const v8, -0x6a3cc50f

    goto :goto_0

    .line 8
    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget-boolean v6, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v6, :cond_f

    goto/16 :goto_6

    .line 199
    :sswitch_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_1

    .line 247
    :sswitch_5
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v6

    if-gtz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_1
    const-string v6, "\u06dc\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6f13

    const v8, -0x656cd4de

    xor-int/2addr v7, v8

    const v8, 0x241a1620

    goto :goto_0

    :sswitch_6
    sget-boolean v6, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v6, :cond_9

    goto/16 :goto_3

    :sswitch_7
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    goto/16 :goto_3

    :sswitch_8
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    return-void

    .line 298
    :sswitch_9
    :try_start_0
    invoke-static {v1, v2}, Ll/ۖ;->ۧܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_a
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_b
    return-void

    :sswitch_c
    :try_start_1
    invoke-static {v0}, Ll/ۗ᩺;->ᩴۛۤ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    const-string v6, "\u073f\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4437

    const v8, 0x58efacb5

    xor-int/2addr v7, v8

    const v8, 0x1b275a1

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v6, "\u06e4\u06db"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5249

    const v8, -0x775d44bd

    xor-int/2addr v7, v8

    const v8, -0x7e0c8898

    goto/16 :goto_0

    :sswitch_d
    return-void

    .line 297
    :sswitch_e
    :try_start_2
    sget-object v6, Lbin/mt/plus/ShortcutActivity;->᩵֫:Ll/ܶ᩵ܿ;

    invoke-static {v6}, Ll/֫ۡ;->ᩳܳۙ(Ljava/lang/Object;)V

    .line 298
    invoke-static {v6, p0}, Ll/֫֫;->ۤ۟ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 299
    :try_start_3
    sget-object v6, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v7, 0x64

    invoke-virtual {p1, v6, v7, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 300
    :try_start_4
    invoke-static {v0}, Ll/ۗ᩺;->ᩴۛۤ(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v6, "\u06e8\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3831

    const v8, 0x449afb90

    xor-int/2addr v7, v8

    const v8, 0x4667e78

    goto/16 :goto_0

    :catchall_1
    move-exception v1

    const-string v6, "\u1a7b\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x79cb

    const v8, 0x621a906b

    xor-int/2addr v7, v8

    const v8, -0x5ceec201

    goto/16 :goto_0

    :catch_0
    const-string v6, "\u05a1\u0733"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2db9

    const v8, 0x7e7ee090

    xor-int/2addr v7, v8

    const v8, -0x6effaa01

    goto/16 :goto_0

    .line 30
    :sswitch_f
    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v6, :cond_2

    const-string v6, "\u06d7\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x32c3

    const v8, 0x7304c1a5

    xor-int/2addr v7, v8

    const v8, -0x38677c6b

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06d9\u06dc"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1da5

    const v8, 0x38508aaa

    xor-int/2addr v7, v8

    const v8, 0xd0c4da

    goto/16 :goto_0

    .line 193
    :sswitch_10
    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v6, :cond_3

    :goto_3
    const-string v6, "\u0736\u1a79"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5629

    const v8, 0x6cfaf172

    xor-int/2addr v7, v8

    const v8, 0x1451043e

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u1a73\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x49

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x576d

    const v8, -0x2f329a6

    xor-int/2addr v7, v8

    const v8, 0x1dad30f5

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v6, :cond_5

    :cond_4
    const-string v6, "\u073a\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x27

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1b99

    const v8, -0x254bb9d4

    xor-int/2addr v7, v8

    const v8, -0x24841819

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06db\u06e8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x879

    const v8, -0x338d8368    # -6.3566432E7f

    xor-int/2addr v7, v8

    const v8, 0x70a4535c

    goto/16 :goto_0

    .line 139
    :sswitch_12
    sget v6, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u1a73\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x33dd

    const v8, -0x643442b9

    xor-int/2addr v7, v8

    const v8, -0x46f076b2

    goto/16 :goto_0

    .line 239
    :sswitch_13
    sget v6, Ll/۠;->ܺܺܶ:I

    if-ltz v6, :cond_7

    goto :goto_4

    :cond_7
    const-string v6, "\u05a1\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x746d

    const v8, -0x18ebf522

    xor-int/2addr v7, v8

    const v8, -0x45f6a600

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a75\u06db"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3213

    const v8, -0x77d4f9fe

    xor-int/2addr v7, v8

    const v8, 0xdf2ffb8

    goto/16 :goto_0

    :sswitch_14
    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u06db\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x6d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x56f1

    const v8, -0x2f6d4099

    xor-int/2addr v7, v8

    const v8, -0x53bdab28

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u0733\u06d7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x60b9

    const v8, 0x2717cea5

    xor-int/2addr v7, v8

    const v8, 0x6c77dbf2

    goto/16 :goto_0

    :sswitch_15
    sget v6, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u0736\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x1b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x62c5

    const v8, -0x4cefe5eb

    xor-int/2addr v7, v8

    const v8, 0x1dddd4f6

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073a\u1a7a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x650d

    const v8, 0x52ce813b

    xor-int/2addr v7, v8

    const v8, -0x66c62059

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    :goto_6
    const-string v6, "\u1a75\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x48e9

    const v8, -0x5d74886e

    xor-int/2addr v7, v8

    const v8, 0x2aaa8752

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06d7\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x71d1

    const v8, -0x71e5294e

    xor-int/2addr v7, v8

    const v8, 0x4ad77b

    goto/16 :goto_0

    .line 156
    :sswitch_17
    sget v6, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v6, :cond_10

    :cond_f
    :goto_7
    const-string v6, "\u1a7a\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4425

    const v8, 0x6b0381b2

    xor-int/2addr v7, v8

    const v8, -0x2dca09a3

    goto/16 :goto_0

    :cond_10
    const-string v6, "\u06e8\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x61c5

    const v8, -0x99f541c

    xor-int/2addr v7, v8

    const v8, -0x2d9ae492

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eb43d5d -> :sswitch_c
        -0x7b6a4493 -> :sswitch_16
        -0x72fb5f5f -> :sswitch_3
        -0x714b62b1 -> :sswitch_2
        -0x7119eeac -> :sswitch_f
        -0x6fc55f7e -> :sswitch_15
        -0x6e53e542 -> :sswitch_16
        -0x601eae99 -> :sswitch_5
        -0x5ebd29a2 -> :sswitch_15
        -0x5b9aaa64 -> :sswitch_e
        -0x58d76cd1 -> :sswitch_9
        -0x5469fe77 -> :sswitch_c
        -0x5145db0f -> :sswitch_a
        -0x4f8c8d14 -> :sswitch_a
        -0x4f3a1c71 -> :sswitch_0
        -0x44e8a101 -> :sswitch_12
        -0x43f4e1b6 -> :sswitch_12
        -0x3c97ead3 -> :sswitch_4
        -0x35557a09 -> :sswitch_4
        -0x30e3a14c -> :sswitch_0
        -0x2e339313 -> :sswitch_14
        -0x2d525334 -> :sswitch_f
        -0x2ad453a7 -> :sswitch_7
        -0x2641acf9 -> :sswitch_8
        -0x178933b2 -> :sswitch_9
        -0x152d2043 -> :sswitch_3
        -0x13a82afd -> :sswitch_2
        -0x56904f3 -> :sswitch_6
        0x575c376 -> :sswitch_13
        0xa693275 -> :sswitch_13
        0xce2a540 -> :sswitch_b
        0xf781281 -> :sswitch_d
        0x102f34c1 -> :sswitch_17
        0x16040442 -> :sswitch_11
        0x20e03e7f -> :sswitch_10
        0x222dbb97 -> :sswitch_5
        0x2c9efef5 -> :sswitch_6
        0x3176ca87 -> :sswitch_7
        0x34f0b033 -> :sswitch_1
        0x3ca0e421 -> :sswitch_8
        0x3e085666 -> :sswitch_d
        0x4dbf91c9 -> :sswitch_11
        0x4e343d7f -> :sswitch_14
        0x680d0c98 -> :sswitch_1
        0x71bd2014 -> :sswitch_e
        0x78208ff9 -> :sswitch_10
        0x7aad85a0 -> :sswitch_17
        0x7e3aa98d -> :sswitch_b
    .end sparse-switch
.end method

.method public static ֫(Ll/ۗܺ᩷;Z)V
    .locals 82

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

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const v61, 0x3ba0b683

    sget v62, Ll/֡ᩴ;->ܳۤ֫:I

    sget v63, Ll/ۛ;->᩺᩻֫:I

    const-string v64, "\u06eb\u06eb"

    invoke-static/range {v64 .. v64}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v64

    xor-int v64, v64, v63

    mul-int/lit8 v64, v64, -0x2b

    xor-int v1, v64, v62

    mul-int/lit16 v1, v1, 0x1907

    const v65, -0x148928b8

    xor-int v1, v1, v65

    const v65, 0x535313e

    xor-int v64, v64, v65

    move-object/from16 v27, v12

    move-object v3, v15

    move-object/from16 v15, v17

    move-object/from16 v21, v20

    move-object/from16 v9, v23

    move-object/from16 v26, v25

    move-object/from16 v0, v34

    move-object/from16 v14, v35

    move-object/from16 v12, v38

    move-object/from16 v67, v47

    move-object/from16 v69, v49

    move-object/from16 v72, v52

    move-object/from16 v74, v54

    move-object/from16 v77, v57

    move-object/from16 v79, v59

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v46, 0x0

    const/16 v66, 0x0

    const/16 v68, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v73, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v78, 0x0

    const/16 v80, 0x0

    move-object/from16 v23, v7

    move-object/from16 v17, v16

    move-object/from16 v20, v19

    move-object/from16 v25, v24

    const/16 v16, 0x0

    move-object v7, v6

    move-object/from16 v24, v8

    move-object/from16 v19, v18

    move-object/from16 v8, v22

    const/16 v18, 0x0

    move-object v6, v5

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v13, v61, v62

    mul-int/lit16 v13, v13, 0x64cd

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v1, v13

    xor-int v61, v64, v1

    sparse-switch v61, :sswitch_data_0

    const/4 v1, 0x0

    .line 247
    invoke-virtual {v15, v7, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "\u06e8\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v63

    mul-int/lit8 v1, v1, -0x77

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x2601

    const v47, -0x61477ccb

    xor-int v13, v13, v47

    const v47, -0x53d9e7cd

    goto/16 :goto_f

    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    goto/16 :goto_34

    :cond_1
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move v0, v4

    move-object/from16 v29, v5

    move-object/from16 v4, v24

    move/from16 v5, v28

    move-object/from16 v24, v2

    move-object/from16 v28, v17

    :goto_2
    move/from16 v2, v68

    goto/16 :goto_38

    .line 192
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v1

    if-nez v1, :cond_2

    :goto_3
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v1, v77

    move-object/from16 v38, v0

    move-object/from16 v0, v23

    move/from16 v23, v29

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v78

    goto/16 :goto_2e

    :cond_2
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    goto/16 :goto_39

    .line 266
    :sswitch_2
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_4

    :cond_3
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v1, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    goto/16 :goto_33

    :cond_4
    const-string v1, "\u05a8\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    mul-int/lit8 v1, v1, -0xd

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x50f3

    const v47, 0x2a0b5051

    xor-int v13, v13, v47

    const v47, -0x64370d94

    goto/16 :goto_f

    .line 147
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_3

    goto :goto_4

    .line 95
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v1

    if-eqz v1, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v1, "\u0733\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x2e23

    const v47, -0x6aa22512

    xor-int v13, v13, v47

    const v47, 0x6465c20f

    goto/16 :goto_f

    .line 94
    :sswitch_5
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_6

    goto/16 :goto_1

    :cond_6
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move/from16 v1, v75

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, v74

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v76

    goto/16 :goto_30

    .line 50
    :sswitch_6
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_7

    goto/16 :goto_3

    :cond_7
    :goto_4
    const-string v1, "\u06d6\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x528f

    const v47, 0xf5b6fc9

    xor-int v13, v13, v47

    const v47, -0x2ceeceee

    goto/16 :goto_f

    .line 123
    :sswitch_7
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :sswitch_8
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_3

    .line 217
    :sswitch_9
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    return-void

    .line 202
    :sswitch_a
    invoke-static/range {v39 .. v39}, Ll/ۙ۬;->ۧ(Landroid/graphics/Bitmap;)Ll/ۙ۬;

    move-result-object v1

    invoke-virtual {v12, v1}, Ll/ܰۙ;->֫(Ll/ۙ۬;)V

    goto :goto_5

    .line 204
    :sswitch_b
    invoke-virtual {v12}, Ll/ܰۙ;->֫()Ll/۟ۙ;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_6

    .line 250
    :sswitch_c
    invoke-static/range {v36 .. v36}, Ll/ܽ᩶ܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    move-object v14, v1

    goto/16 :goto_c

    .line 199
    :sswitch_d
    invoke-virtual {v12, v0}, Ll/ܰۙ;->֫(Ljava/lang/CharSequence;)V

    goto/16 :goto_7

    :sswitch_e
    if-eqz v39, :cond_8

    const-string v1, "\u073a\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x4729

    const v47, -0x6c2a8578

    xor-int v13, v13, v47

    const v47, -0x79ef26b5

    goto/16 :goto_f

    :cond_8
    :goto_5
    const-string v1, "\u0736\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v63, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x3827

    const v47, -0x13d9c9bc

    xor-int v13, v13, v47

    const v47, 0x3692a08b

    goto/16 :goto_f

    :sswitch_f
    move-object/from16 v1, v36

    .line 249
    invoke-static {v1, v5}, Ll/ۙۨ;->ܰ᩵۬(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const-string v13, "\u06e1\u06d9"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v62

    mul-int/lit8 v13, v13, 0x67

    move-object/from16 v36, v1

    xor-int v1, v13, v63

    mul-int/lit16 v1, v1, 0x4e85

    const v47, -0x4b9084c5

    xor-int v1, v1, v47

    const v47, -0x161ad56d

    goto/16 :goto_8

    :cond_9
    move-object/from16 v36, v1

    goto/16 :goto_b

    .line 192
    :sswitch_10
    invoke-static/range {v33 .. v33}, Ll/ܽ᩶ܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_d

    :sswitch_11
    if-eqz v39, :cond_a

    goto/16 :goto_9

    :cond_a
    :goto_6
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    goto/16 :goto_29

    .line 197
    :sswitch_12
    new-instance v12, Ll/ܰۙ;

    invoke-direct {v12, v8}, Ll/ܰۙ;-><init>(Ll/۟ۙ;)V

    if-eqz v0, :cond_b

    const-string v1, "\u06e7\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    mul-int/lit8 v1, v1, 0x61

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x73c5

    const v47, 0x532c068

    xor-int v13, v13, v47

    const v47, -0x7c0f4f85

    goto/16 :goto_f

    :cond_b
    :goto_7
    const-string v1, "\u1a74\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x4505

    const v47, 0xdf7443f

    xor-int v13, v13, v47

    const v47, -0x71ae44d

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v18, v37

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    goto/16 :goto_2a

    .line 248
    :sswitch_14
    invoke-static {v15, v6}, Ll/֫᩵;->ܶܰۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v36

    if-eqz v36, :cond_e

    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v62, v1

    mul-int/lit8 v1, v1, -0x37

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, -0x5e47

    const v47, -0x2c8d87ce

    xor-int v13, v13, v47

    const v47, 0x7d937a61

    goto/16 :goto_f

    .line 256
    :sswitch_15
    new-instance v1, Ll/ܰۙ;

    invoke-direct {v1, v3}, Ll/ܰۙ;-><init>(Ll/۟ۙ;)V

    .line 257
    invoke-virtual {v1, v14}, Ll/ܰۙ;->֫(Ljava/lang/CharSequence;)V

    .line 258
    invoke-static/range {v32 .. v32}, Ll/ۙ۬;->ۧ(Landroid/graphics/Bitmap;)Ll/ۙ۬;

    move-result-object v13

    invoke-virtual {v1, v13}, Ll/ܰۙ;->֫(Ll/ۙ۬;)V

    .line 259
    invoke-virtual {v1}, Ll/ܰۙ;->֫()Ll/۟ۙ;

    move-result-object v1

    .line 256
    invoke-static {v2, v1}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_a

    :sswitch_16
    move-object/from16 v1, v33

    .line 191
    invoke-static {v1, v5}, Ll/۠;->ۧ֨ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const-string v13, "\u1a74\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int v13, v13, v62

    mul-int/lit8 v13, v13, 0x57

    move-object/from16 v33, v1

    xor-int v1, v13, v63

    mul-int/lit16 v1, v1, 0x6d65

    const v47, 0x6b31c15c

    xor-int v1, v1, v47

    const v47, -0x77567edd

    :goto_8
    xor-int v64, v13, v47

    goto/16 :goto_0

    :cond_c
    move-object/from16 v33, v1

    goto/16 :goto_e

    :sswitch_17
    if-nez v0, :cond_d

    const-string v1, "\u06e0\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v63, v1

    mul-int/lit8 v1, v1, 0x41

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x2397

    const v47, -0x53894af2

    xor-int v13, v13, v47

    const v47, -0x755b6354

    goto/16 :goto_f

    :cond_d
    :goto_9
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x250f

    const v47, 0x2fcf0e2a

    xor-int v13, v13, v47

    const v47, -0x2acf0b62

    goto/16 :goto_f

    :goto_a
    :sswitch_18
    const-string v1, "\u06d8\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x2ff3

    const v47, 0x50b6a899

    xor-int v13, v13, v47

    const v47, 0x36426a66

    goto/16 :goto_f

    :cond_e
    :goto_b
    move-object/from16 v14, v19

    :goto_c
    const-string v1, "\u1a75\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x6409

    const v47, -0x1e4253f7

    xor-int v13, v13, v47

    const v47, 0x2f9f754b

    goto/16 :goto_f

    .line 190
    :sswitch_19
    invoke-static {v9, v6}, Ll/֫᩵;->ܶܰۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v33

    if-eqz v33, :cond_10

    const-string v1, "\u06df\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v62

    mul-int/lit8 v1, v1, 0x21

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x13ab

    const v47, -0x18ccd2ab

    xor-int v13, v13, v47

    const v47, 0x5e0d086f

    goto/16 :goto_f

    :sswitch_1a
    const/4 v0, 0x0

    :goto_d
    const-string v1, "\u1a7b\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    mul-int/lit8 v1, v1, -0x5b

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x1a53

    const v47, 0x276ac4d

    xor-int v13, v13, v47

    const v47, -0x4dcee803

    goto :goto_f

    .line 242
    :sswitch_1b
    invoke-static/range {v17 .. v17}, Lbin/mt/plus/ShortcutActivity;->ۧ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v32, v1

    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    goto/16 :goto_11

    :sswitch_1c
    if-nez v32, :cond_f

    const-string v1, "\u06e2\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, -0x7d33

    const v47, 0x2b289964

    xor-int v13, v13, v47

    const v47, -0x1aba46be

    goto :goto_f

    :cond_f
    const-string v1, "\u0730\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x4111

    const v47, -0x4c56ae71

    xor-int v13, v13, v47

    const v47, -0x35a07824    # -3662327.0f

    goto :goto_f

    .line 189
    :sswitch_1d
    invoke-virtual {v9, v7, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_10

    const-string v1, "\u073d\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    mul-int/lit8 v1, v1, 0xb

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x47b9

    const v47, 0x346b1943

    xor-int v13, v13, v47

    const v47, -0x51cdfcc2

    goto :goto_f

    :cond_10
    :goto_e
    const-string v1, "\u06e0\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    xor-int v13, v1, v63

    mul-int/lit16 v13, v13, 0x33bb

    const v47, -0x76381b6e

    xor-int v13, v13, v47

    const v47, -0x225b81c

    :goto_f
    xor-int v64, v1, v47

    move v1, v13

    goto/16 :goto_0

    .line 183
    :sswitch_1e
    sget-object v1, Ll/᩶ۖܳ;->ۨ֫:Ll/᩸ۖܳ;

    invoke-virtual {v1}, Ll/᩸ۖܳ;->ܽ()I

    move-result v1

    invoke-static {v1, v10, v11}, Ll/ۛۢۡ;->֫(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_10

    .line 186
    :sswitch_1f
    sget-object v1, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    .line 256
    iget-object v13, v1, Ll/᩶ۖܳ;->֫:Ll/᩸ۖܳ;

    invoke-virtual {v13}, Ll/᩸ۖܳ;->ܽ()I

    move-result v13

    iget-object v1, v1, Ll/᩶ۖܳ;->ܳ:Ll/᩹ۖܳ;

    iget v1, v1, Ll/᩹ۖܳ;->᩶:I

    invoke-static {v13, v1, v11}, Ll/ۛۢۡ;->֫(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    :goto_10
    move-object/from16 v39, v1

    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    move/from16 v4, v34

    goto/16 :goto_13

    .line 210
    :sswitch_20
    invoke-static {v4}, Ll/֫ۡ;->ۜۡ֫(I)V

    return-void

    :sswitch_21
    const/4 v1, 0x1

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move-object/from16 v30, v31

    move/from16 v13, v38

    move/from16 v7, v66

    const/16 v37, 0x1

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    goto/16 :goto_19

    .line 236
    :sswitch_22
    sget-object v1, Ll/᩶ۖܳ;->ۨ֫:Ll/᩸ۖܳ;

    invoke-virtual {v1}, Ll/᩸ۖܳ;->ܽ()I

    move-result v1

    move/from16 v13, v38

    move-object/from16 v38, v0

    move/from16 v0, v46

    invoke-static {v1, v0, v13}, Ll/ۛۢۡ;->֫(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v0, v17

    .line 237
    invoke-static {v0, v1}, Lbin/mt/plus/ShortcutActivity;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    move-object/from16 v31, v1

    move/from16 v17, v4

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v7, v66

    move-object/from16 v29, v5

    move/from16 v5, v28

    goto/16 :goto_18

    :sswitch_23
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    if-nez v30, :cond_11

    const-string v1, "\u0730\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    move/from16 v17, v4

    xor-int v4, v1, v63

    mul-int/lit16 v4, v4, 0x7909

    const v47, -0xa88e4ad

    xor-int v4, v4, v47

    const v47, -0x2d98b438

    goto :goto_14

    :cond_11
    move/from16 v17, v4

    move-object/from16 v32, v30

    :goto_11
    const-string v1, "\u05a1\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v4, v1, v62

    mul-int/lit16 v4, v4, -0x546d

    const v47, -0x2cd573ab

    xor-int v4, v4, v47

    const v47, 0x6ea82245

    goto :goto_14

    .line 264
    :sswitch_24
    invoke-static/range {v35 .. v35}, Ll/֨֫;->ۚ۬᩷(I)V

    return-void

    :sswitch_25
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 178
    sget-object v1, Ll/᩶ۖܳ;->֫ۧ:Ll/᩸ۖܳ;

    invoke-virtual {v1}, Ll/᩸ۖܳ;->ܽ()I

    move-result v1

    move/from16 v4, v34

    invoke-static {v1, v4, v11}, Ll/ۛۢۡ;->֫(IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_12

    :sswitch_26
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    move/from16 v4, v34

    const/4 v1, 0x0

    :goto_12
    move-object/from16 v39, v1

    :goto_13
    const-string v1, "\u073d\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v62

    move/from16 v34, v4

    xor-int v4, v1, v63

    mul-int/lit16 v4, v4, -0xe7b

    const v47, 0x2cd9ca7e    # 6.189992E-12f

    xor-int v4, v4, v47

    const v47, -0x1808d2c4

    :goto_14
    xor-int v64, v1, v47

    move v1, v4

    move/from16 v4, v17

    move-object/from16 v17, v0

    goto/16 :goto_23

    :sswitch_27
    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 181
    invoke-static/range {v26 .. v26}, Ll/᩶ۖܳ;->֫(Ljava/lang/String;)I

    move-result v10

    move/from16 v1, v29

    if-eq v10, v1, :cond_12

    const-string v4, "\u1a79\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    move-object/from16 v29, v5

    xor-int v5, v4, v62

    mul-int/lit16 v5, v5, 0x14cd

    const v47, 0x7d7a1ecb

    xor-int v5, v5, v47

    const v47, 0xcd0f058

    xor-int v64, v4, v47

    move/from16 v4, v17

    goto/16 :goto_17

    :cond_12
    move-object/from16 v29, v5

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v5, v28

    move/from16 v7, v66

    goto :goto_15

    :sswitch_28
    move/from16 v1, v29

    move/from16 v13, v38

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 183
    sget-object v4, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x4b

    move-object/from16 v47, v6

    const/4 v6, 0x5

    move-object/from16 v48, v7

    move/from16 v7, v66

    invoke-static {v4, v5, v6, v7}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v4

    .line 185
    invoke-virtual {v9, v4, v11}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_13

    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v5, v4, v62

    mul-int/lit16 v5, v5, -0x7245

    const v6, 0x1cef32e2

    xor-int/2addr v5, v6

    const v6, 0x2e323057

    goto :goto_16

    :cond_13
    move/from16 v5, v28

    :goto_15
    move-object/from16 v28, v0

    goto/16 :goto_1b

    :sswitch_29
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v17, v4

    if-eqz p1, :cond_14

    const-string v4, "\u0730\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    xor-int v5, v4, v63

    mul-int/lit16 v5, v5, 0x7afd

    const v6, -0x2158d786

    xor-int/2addr v5, v6

    const v6, 0x1d63a50e

    :goto_16
    xor-int v64, v4, v6

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    :goto_17
    move-object/from16 v17, v0

    move-object/from16 v0, v38

    move/from16 v38, v13

    move-object/from16 v81, v29

    move/from16 v29, v1

    move v1, v5

    goto/16 :goto_1d

    :cond_14
    move/from16 v5, v28

    move-object/from16 v28, v0

    goto/16 :goto_1a

    :sswitch_2a
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v17, v4

    .line 229
    sget-object v4, Ll/᩶ۖܳ;->֫ۧ:Ll/᩸ۖܳ;

    invoke-virtual {v4}, Ll/᩸ۖܳ;->ܽ()I

    move-result v4

    move/from16 v5, v28

    invoke-static {v4, v5, v13}, Ll/ۛۢۡ;->֫(IIZ)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 230
    invoke-static {v0, v4}, Lbin/mt/plus/ShortcutActivity;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    move-object/from16 v31, v4

    :goto_18
    const-string v4, "\u1a74\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, 0x32bb

    const v28, -0x798a860a

    xor-int v6, v6, v28

    const v28, -0x7bef820d

    xor-int v64, v4, v28

    move/from16 v28, v5

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v5, v29

    move-object/from16 v7, v48

    move-object/from16 v17, v0

    move/from16 v29, v1

    move v1, v6

    move-object/from16 v0, v38

    move-object/from16 v6, v47

    goto/16 :goto_2c

    :sswitch_2b
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move-object/from16 v0, v17

    move/from16 v5, v28

    move/from16 v17, v4

    .line 234
    invoke-static/range {v21 .. v21}, Ll/᩶ۖܳ;->֫(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v1, :cond_15

    const-string v6, "\u06e8\u06e1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v62

    move-object/from16 v28, v0

    xor-int v0, v6, v63

    mul-int/lit16 v0, v0, 0x590d

    const v46, -0x6d9e0ab

    xor-int v0, v0, v46

    const v46, -0x102fe415

    xor-int v64, v6, v46

    move/from16 v46, v4

    goto/16 :goto_22

    :cond_15
    move-object/from16 v28, v0

    move-object/from16 v0, p0

    move/from16 v46, v4

    goto/16 :goto_1e

    :sswitch_2c
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    const/4 v0, 0x0

    move-object/from16 v30, v0

    move/from16 v37, v18

    :goto_19
    const-string v0, "\u06e7\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v62, v0

    mul-int/lit8 v0, v0, 0x35

    xor-int v4, v0, v63

    mul-int/lit16 v4, v4, -0x585d

    const v6, -0xb510885

    xor-int/2addr v4, v6

    const v6, -0x3d993dd2

    goto/16 :goto_1c

    :sswitch_2d
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz p1, :cond_16

    const-string v0, "\u06e8\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v4, v0, v62

    mul-int/lit16 v4, v4, 0x1877

    const v6, -0x742be1bb

    xor-int/2addr v4, v6

    const v6, -0x684e2217

    goto/16 :goto_1c

    :sswitch_2e
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 264
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v4, 0x48

    const/4 v6, 0x3

    invoke-static {v0, v4, v6, v7}, Ll/֨ۤ;->᩻ᩴ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v4, 0x7d08c737

    xor-int/2addr v0, v4

    .line 269
    invoke-static {v0}, Ll/֨֫;->ۚ۬᩷(I)V

    :cond_16
    :goto_1a
    move-object/from16 v0, p0

    goto/16 :goto_1f

    :sswitch_2f
    return-void

    :sswitch_30
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 176
    invoke-static/range {v25 .. v25}, Ll/᩶ۖܳ;->֫(Ljava/lang/String;)I

    move-result v0

    if-eq v0, v1, :cond_17

    const-string v4, "\u06d8\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    mul-int/lit8 v4, v4, 0xd

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, 0xec3

    const v34, 0x7416c129

    xor-int v6, v6, v34

    const v34, 0x540ffe0

    xor-int v64, v4, v34

    move/from16 v34, v0

    goto/16 :goto_21

    :cond_17
    move/from16 v34, v0

    :goto_1b
    const-string v0, "\u1a73\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v62

    mul-int/lit8 v0, v0, -0x6b

    xor-int v4, v0, v63

    mul-int/lit16 v4, v4, 0x6d03

    const v6, -0x58ddcd79

    xor-int/2addr v4, v6

    const v6, 0x23608342

    goto :goto_1c

    :sswitch_31
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz v26, :cond_18

    const-string v0, "\u06e1\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v4, v0, v63

    mul-int/lit16 v4, v4, -0x6637

    const v6, 0x60f49fb2

    xor-int/2addr v4, v6

    const v6, 0x4cb76444    # 9.6150048E7f

    goto :goto_1c

    :cond_18
    const-string v0, "\u1a7a\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v4, v0, v62

    mul-int/lit16 v4, v4, 0x680f

    const v6, -0x73b923fa

    xor-int/2addr v4, v6

    const v6, -0x3d083a3d

    :goto_1c
    xor-int v64, v0, v6

    move/from16 v66, v7

    move-object/from16 v0, v38

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move/from16 v38, v13

    move-object/from16 v81, v29

    move/from16 v29, v1

    move v1, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move/from16 v28, v5

    :goto_1d
    move-object/from16 v5, v81

    goto/16 :goto_0

    :sswitch_32
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 208
    invoke-static {v0, v2}, Ll/ܽۗ;->ۧ(Ll/ۗܺ᩷;Ljava/util/ArrayList;)Z

    move-result v4

    if-nez v4, :cond_19

    const-string v4, "\u06e7\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, -0x47f5

    const v49, 0x21321a59

    xor-int v6, v6, v49

    const v49, 0xb691de5

    goto/16 :goto_20

    :cond_19
    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v1

    goto/16 :goto_24

    :sswitch_33
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 215
    invoke-static {v2}, Ll/֨ۤ;->᩶ۖۢ(Ljava/lang/Object;)V

    move/from16 v49, v1

    move-object/from16 v6, v23

    move-object/from16 v0, v24

    move-object/from16 v1, v79

    move-object/from16 v24, v2

    move/from16 v2, v80

    goto/16 :goto_2d

    :sswitch_34
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v28, v17

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move/from16 v17, v4

    move-object/from16 v29, v5

    move-object/from16 v0, p0

    .line 227
    invoke-static/range {v20 .. v20}, Ll/᩶ۖܳ;->֫(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v1, :cond_1a

    const-string v5, "\u05a8\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v62

    xor-int v6, v5, v63

    mul-int/lit16 v6, v6, -0x2bdb

    const v49, -0x2137b551

    xor-int v6, v6, v49

    const v49, 0x65494a6c

    xor-int v64, v5, v49

    move/from16 v66, v7

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move/from16 v29, v1

    move v1, v6

    move/from16 v38, v13

    move-object/from16 v6, v47

    move-object/from16 v81, v28

    move/from16 v28, v4

    goto/16 :goto_27

    :cond_1a
    move v5, v4

    goto :goto_1e

    :sswitch_35
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz v21, :cond_1b

    const-string v4, "\u06d9\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, 0x65e3

    const v49, 0x4a80d028    # 4220948.0f

    xor-int v6, v6, v49

    const v49, -0x9d8e158

    goto/16 :goto_20

    :cond_1b
    :goto_1e
    const-string v4, "\u06e4\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    xor-int v6, v4, v63

    mul-int/lit16 v6, v6, 0x18a5

    const v49, 0xce49cfb

    xor-int v6, v6, v49

    const v49, -0x4db59b7a

    goto/16 :goto_20

    :sswitch_36
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 262
    invoke-static {v0, v2}, Ll/ܽۗ;->֫(Ll/ۗܺ᩷;Ljava/util/ArrayList;)Z

    move-result v4

    if-nez v4, :cond_1c

    const-string v4, "\u05a1\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v62

    mul-int/lit8 v4, v4, -0x15

    xor-int v6, v4, v63

    mul-int/lit16 v6, v6, -0x3765

    const v49, -0x63d1581f

    xor-int v6, v6, v49

    const v49, 0x550aa5c

    goto :goto_20

    :cond_1c
    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v1

    move-object/from16 v24, v2

    goto/16 :goto_28

    :sswitch_37
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    if-eqz p1, :cond_1d

    const-string v4, "\u06d9\u06d9"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v63

    mul-int/lit8 v4, v4, -0x43

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, -0x1d4b

    const v49, 0x1be39dab

    xor-int v6, v6, v49

    const v49, 0x523758d5

    goto :goto_20

    :cond_1d
    :goto_1f
    const-string v4, "\u06e1\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    xor-int v6, v4, v62

    mul-int/lit16 v6, v6, 0xa0b

    const v49, -0x73930ef5

    xor-int v6, v6, v49

    const v49, 0x7991fc1c

    :goto_20
    xor-int v64, v4, v49

    :goto_21
    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move/from16 v28, v5

    move/from16 v38, v13

    move-object/from16 v5, v29

    move/from16 v29, v1

    move v1, v6

    goto/16 :goto_41

    :sswitch_38
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v1, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, p0

    move-object/from16 v28, v17

    move/from16 v17, v4

    .line 169
    invoke-static/range {v27 .. v27}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ll/۟ۙ;

    .line 170
    invoke-virtual {v8}, Ll/۟ۙ;->ۧ()Landroid/content/Intent;

    move-result-object v9

    move-object/from16 v4, v24

    .line 171
    invoke-static {v9, v4}, Ll/ۗ᩷;->ܶۤᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v25

    move-object/from16 v6, v23

    .line 172
    invoke-static {v9, v6}, Ll/ۗ᩷;->ܶۤᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v26

    if-eqz v25, :cond_1e

    const-string v23, "\u1a76\u05ab"

    invoke-static/range {v23 .. v23}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v62

    xor-int v0, v23, v63

    mul-int/lit16 v0, v0, 0x29bb

    const v24, -0x79d060f9

    xor-int v0, v0, v24

    const v24, 0x731524b3

    xor-int v64, v23, v24

    move-object/from16 v24, v4

    move-object/from16 v23, v6

    :goto_22
    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move/from16 v28, v5

    move-object/from16 v5, v29

    move/from16 v29, v1

    move v1, v0

    :goto_23
    move-object/from16 v0, v38

    goto/16 :goto_2c

    :cond_1e
    const-string v0, "\u05a8\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x63

    move/from16 v23, v1

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x47ff

    const v24, -0x748ffe6

    xor-int v1, v1, v24

    const v24, -0x9811951

    goto :goto_25

    :sswitch_39
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 207
    invoke-static {v2}, Ll/ۗۚ;->ۧ۫᩺(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    const-string v0, "\u06d8\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x775

    const v24, 0x2f5ae9b8

    xor-int v1, v1, v24

    const v24, -0x15c6aaa

    goto :goto_25

    :cond_1f
    :goto_24
    const-string v0, "\u0730\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x79b

    const v24, 0x53166c05

    xor-int v1, v1, v24

    const v24, 0x39083627

    :goto_25
    xor-int v64, v0, v24

    move-object/from16 v24, v4

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    goto/16 :goto_36

    :sswitch_3a
    move-object/from16 v38, v0

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v7, v66

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 223
    invoke-virtual {v3}, Ll/۟ۙ;->ܽ()Ljava/lang/CharSequence;

    move-result-object v19

    .line 224
    invoke-static {v15, v4}, Ll/ۗ᩷;->ܶۤᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    .line 225
    invoke-static {v15, v6}, Ll/ۗ᩷;->ܶۤᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    const/4 v0, 0x1

    if-eqz v20, :cond_20

    const-string v1, "\u0730\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, 0x70d7

    const v24, 0x4155eb8f    # 13.370009f

    xor-int v13, v13, v24

    const v24, 0x5ebbcfd7

    goto :goto_26

    :cond_20
    const-string v1, "\u0736\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v63

    xor-int v13, v1, v62

    mul-int/lit16 v13, v13, -0x2175

    const v24, 0x186b652f

    xor-int v13, v13, v24

    const v24, -0x22e0290d

    :goto_26
    xor-int v64, v1, v24

    move-object/from16 v24, v4

    move/from16 v66, v7

    move v1, v13

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    const/16 v38, 0x1

    goto/16 :goto_3e

    :sswitch_3b
    move/from16 v17, v4

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    .line 219
    invoke-static/range {v22 .. v22}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/۟ۙ;

    .line 220
    invoke-virtual {v3}, Ll/۟ۙ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 221
    invoke-virtual {v3}, Ll/۟ۙ;->ۧ()Landroid/content/Intent;

    move-result-object v15

    .line 176
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_21

    move-object/from16 v28, v0

    move-object/from16 v24, v2

    move-object/from16 v0, v74

    move/from16 v1, v75

    move/from16 v2, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    goto/16 :goto_30

    :cond_21
    const-string v1, "\u0730\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v62, v1

    mul-int/lit8 v1, v1, 0xd

    move-object/from16 v24, v0

    xor-int v0, v1, v63

    mul-int/lit16 v0, v0, -0x2f9d

    const v28, -0x3b9ae684

    xor-int v0, v0, v28

    const v28, -0x73cdb905

    xor-int v64, v1, v28

    move v1, v0

    move/from16 v28, v5

    move/from16 v66, v7

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move/from16 v38, v13

    move/from16 v29, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v47

    move-object/from16 v81, v24

    move-object/from16 v24, v4

    :goto_27
    move/from16 v4, v17

    move-object/from16 v17, v81

    goto/16 :goto_0

    :sswitch_3c
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 256
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v1, 0x45

    move-object/from16 v24, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, v7}, Ll/֫֫;->ܿ᩶ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7eed1351

    xor-int v35, v0, v1

    if-eqz v18, :cond_22

    const-string v0, "\u1a78\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x545

    const v2, -0x1d579c01

    xor-int/2addr v1, v2

    const v2, -0x685eb92c

    goto/16 :goto_2b

    :cond_22
    :goto_28
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    mul-int/lit8 v0, v0, -0x6b

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x493d

    const v2, -0x4a4534a4

    xor-int/2addr v1, v2

    const v2, -0x5900ab76

    goto/16 :goto_2b

    :sswitch_3d
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 169
    invoke-static/range {v27 .. v27}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    const-string v0, "\u06e1\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v63, v0

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x5cf7

    const v2, 0x6d1070e4

    xor-int/2addr v1, v2

    const v2, 0x3b6e6ee4

    goto/16 :goto_2b

    :cond_23
    const-string v0, "\u06e8\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x67

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x1333

    const v2, 0x7bb4aae0

    xor-int/2addr v1, v2

    const v2, 0x67d6322a

    goto/16 :goto_2b

    :sswitch_3e
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 219
    invoke-static/range {v22 .. v22}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    const-string v0, "\u06da\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v63, v0

    mul-int/lit8 v0, v0, 0x13

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x398f

    const v2, 0x721b122c

    xor-int/2addr v1, v2

    const v2, -0x214cc07d

    goto/16 :goto_2b

    :cond_24
    const-string v0, "\u1a7b\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x689d

    const v2, -0x8818e0a

    xor-int/2addr v1, v2

    const v2, -0x1ec6b6ac

    goto/16 :goto_2b

    :sswitch_3f
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 168
    invoke-static/range {p0 .. p0}, Ll/ܽۗ;->ܿ(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 169
    invoke-static {v0}, Ll/֫ܽ;->֨ۚܿ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v27, v0

    :goto_29
    const-string v0, "\u0730\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x45ef

    const v2, -0x557a61af    # -2.37354E-13f

    xor-int/2addr v1, v2

    const v2, -0x295fadb5

    goto :goto_2b

    :sswitch_40
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    .line 218
    invoke-static/range {p0 .. p0}, Ll/ܽۗ;->֫(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 219
    invoke-static {v0}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v22, v0

    const/16 v18, 0x0

    :goto_2a
    const-string v0, "\u06e2\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v63, v0

    mul-int/lit8 v0, v0, -0x15

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x1bb7

    const v2, 0x2f017e09

    xor-int/2addr v1, v2

    const v2, -0x4fb0223e

    :goto_2b
    xor-int v64, v0, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    goto/16 :goto_3d

    :sswitch_41
    move-object/from16 v24, v2

    move-object/from16 v29, v5

    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v5, v28

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v28, v17

    move/from16 v17, v4

    const/16 v0, 0xf

    move-object/from16 v1, v79

    move/from16 v2, v80

    .line 167
    invoke-static {v1, v2, v0, v7}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v11, 0x0

    if-eqz v16, :cond_25

    const-string v23, "\u1a74\u1a78"

    invoke-static/range {v23 .. v23}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v62

    xor-int v4, v23, v63

    mul-int/lit16 v4, v4, 0x16e5

    const v50, 0x1f8ebd4f

    xor-int v4, v4, v50

    const v50, -0x573c89aa

    xor-int v64, v23, v50

    move-object/from16 v79, v1

    move/from16 v80, v2

    move v1, v4

    move-object/from16 v23, v6

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v2, v24

    move-object/from16 v17, v28

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move-object/from16 v24, v0

    move/from16 v28, v5

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    const/16 v29, -0x1

    :goto_2c
    move/from16 v38, v13

    goto/16 :goto_0

    :cond_25
    const/16 v49, -0x1

    :goto_2d
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v63

    mul-int/lit8 v4, v4, 0x15

    move-object/from16 v23, v0

    xor-int v0, v4, v62

    mul-int/lit16 v0, v0, 0x4a5

    const v50, -0xf770bd0

    xor-int v0, v0, v50

    const v50, -0x7fffef5d

    xor-int v64, v4, v50

    move-object/from16 v79, v1

    move/from16 v80, v2

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v2, v24

    move-object/from16 v17, v28

    move-object/from16 v7, v48

    move v1, v0

    move/from16 v28, v5

    move-object/from16 v24, v23

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move/from16 v29, v49

    move-object/from16 v23, v6

    move/from16 v38, v13

    goto/16 :goto_41

    :sswitch_42
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    const/16 v0, 0xf

    move-object/from16 v1, v77

    move/from16 v2, v78

    invoke-static {v1, v2, v0, v7}, Ll/ۨ;->۟᩹ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    sget-object v79, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v80, 0x36

    .line 262
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v6

    if-gtz v6, :cond_26

    :goto_2e
    const-string v6, "\u1a7b\u06d7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v62

    mul-int/lit8 v6, v6, 0x3d

    move-object/from16 v49, v0

    xor-int v0, v6, v63

    mul-int/lit16 v0, v0, 0x36f3

    const v50, -0x62e39768

    xor-int v0, v0, v50

    const v50, -0x3beb5556

    goto :goto_2f

    :cond_26
    const-string v6, "\u073f\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v62

    move-object/from16 v49, v0

    xor-int v0, v6, v63

    mul-int/lit16 v0, v0, -0x48cb

    const v50, -0x6f1ab96c

    xor-int v0, v0, v50

    const v50, -0x292abd48

    :goto_2f
    xor-int v64, v6, v50

    move-object/from16 v77, v1

    move/from16 v78, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v6, v47

    move-object/from16 v7, v48

    move v1, v0

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move/from16 v28, v5

    move/from16 v38, v13

    move-object/from16 v5, v29

    move/from16 v29, v23

    move-object/from16 v23, v49

    goto/16 :goto_0

    :sswitch_43
    move-object/from16 v47, v6

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move/from16 v1, v75

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v0, v74

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v76

    .line 167
    invoke-static {v0, v1, v2, v7}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v48

    sget-object v77, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v78, 0x27

    .line 20
    sget-boolean v51, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v51, :cond_27

    :goto_30
    const-string v51, "\u1a77\u1a7a"

    invoke-static/range {v51 .. v51}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v51

    xor-int v51, v51, v62

    move-object/from16 v52, v0

    xor-int v0, v51, v63

    mul-int/lit16 v0, v0, -0x4a97

    const v53, 0x72dfa9c4

    xor-int v0, v0, v53

    const v53, 0x65038b4b

    xor-int v64, v51, v53

    move/from16 v75, v1

    move/from16 v76, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move-object/from16 v74, v52

    goto/16 :goto_32

    :cond_27
    move-object/from16 v52, v0

    const-string v0, "\u06da\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x6b

    move/from16 v51, v1

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x3b3f

    const v53, -0x3456bf4f    # -2.218429E7f

    xor-int v1, v1, v53

    const v53, -0x9f8c8a

    xor-int v64, v0, v53

    move/from16 v76, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    goto/16 :goto_3d

    :sswitch_44
    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    const/16 v0, 0x9

    move-object/from16 v1, v72

    move/from16 v2, v73

    .line 167
    invoke-static {v1, v2, v0, v7}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    sget-object v74, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v75, 0x1c

    const/16 v76, 0xb

    .line 116
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v47

    if-gtz v47, :cond_28

    move-object/from16 v47, v0

    move-object/from16 v72, v1

    move/from16 v73, v2

    move-object/from16 v0, v69

    move/from16 v1, v70

    move/from16 v2, v71

    goto/16 :goto_31

    :cond_28
    const-string v47, "\u1a73\u06e1"

    invoke-static/range {v47 .. v47}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v47

    xor-int v47, v47, v63

    move-object/from16 v51, v0

    xor-int v0, v47, v62

    mul-int/lit16 v0, v0, -0x66a1

    const v52, 0x6fb2b50f

    xor-int v0, v0, v52

    const v52, 0x30849611

    xor-int v64, v47, v52

    move-object/from16 v72, v1

    move/from16 v73, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move v1, v0

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move/from16 v28, v5

    move/from16 v38, v13

    move-object/from16 v5, v29

    move/from16 v29, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v51

    goto/16 :goto_0

    :sswitch_45
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v5, v28

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move/from16 v1, v70

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v28, v17

    move-object/from16 v0, v69

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v71

    .line 167
    invoke-static {v0, v1, v2, v7}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v29

    sget-object v72, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v73, 0x13

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v54

    if-ltz v54, :cond_29

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    :goto_31
    const-string v51, "\u06d9\u1a77"

    invoke-static/range {v51 .. v51}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v51

    xor-int v51, v51, v62

    move-object/from16 v54, v0

    xor-int v0, v51, v63

    mul-int/lit16 v0, v0, -0x109

    const v52, -0x3c03e316

    xor-int v0, v0, v52

    const v52, -0x55ddaf13

    xor-int v64, v51, v52

    move/from16 v70, v1

    move/from16 v71, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move-object/from16 v69, v54

    goto/16 :goto_32

    :cond_29
    move-object/from16 v54, v0

    const-string v0, "\u06eb\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    mul-int/lit8 v0, v0, 0x3d

    move/from16 v55, v1

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, 0x459b

    const v56, -0x4062ba2f

    xor-int v1, v1, v56

    const v56, 0x3616ce2a

    xor-int v64, v0, v56

    move/from16 v71, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v69, v54

    move/from16 v70, v55

    goto/16 :goto_3d

    :sswitch_46
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move-object/from16 v4, v24

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v1, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v24, v2

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    xor-int v0, v40, v41

    sget-object v69, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v70, 0xe

    const/16 v71, 0x5

    .line 10
    sget-boolean v2, Ll/֨۫;->۬᩷᩶:Z

    if-nez v2, :cond_2a

    move-object/from16 v55, v1

    move-object/from16 v57, v67

    goto/16 :goto_2

    :cond_2a
    const-string v2, "\u1a77\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v63, v2

    mul-int/lit8 v2, v2, -0x7d

    move/from16 v17, v0

    xor-int v0, v2, v62

    mul-int/lit16 v0, v0, -0x3287

    const v54, -0x29ad1530

    xor-int v0, v0, v54

    const v54, 0x4f82bd4e

    xor-int v64, v2, v54

    move-object/from16 v72, v1

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    :goto_32
    move v1, v0

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    goto/16 :goto_36

    :sswitch_47
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v54, v69

    move-object/from16 v1, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v71

    const/4 v0, 0x3

    move-object/from16 v55, v1

    move/from16 v56, v2

    move-object/from16 v1, v67

    move/from16 v2, v68

    .line 167
    invoke-static {v1, v2, v0, v7}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v40

    const v41, 0x7e2826f6

    .line 227
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_2b

    :goto_33
    const-string v0, "\u0733\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    move-object/from16 v57, v1

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x280f

    const v58, -0x72de3b1c

    xor-int v1, v1, v58

    const v58, -0x7af5aad2

    goto/16 :goto_3a

    :cond_2b
    move-object/from16 v57, v1

    const-string v0, "\u1a76\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x7acf

    const v58, 0x4f7555e3

    xor-int v1, v1, v58

    const v58, -0x18580577

    goto/16 :goto_3a

    :sswitch_48
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    .line 166
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    invoke-static {}, Lbin/mt/plus/ShortcutActivity;->᩵()Z

    move-result v16

    sget-object v67, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v68, 0xb

    .line 33
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_2c

    :goto_34
    const-string v0, "\u06e1\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x75

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x6205

    const v24, 0x1d1b72e5

    xor-int v1, v1, v24

    const v24, -0x4920b925

    goto :goto_35

    :cond_2c
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v63

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0xc13

    const v24, -0x527d6712

    xor-int v1, v1, v24

    const v24, 0x167fd9b4

    :goto_35
    xor-int v64, v0, v24

    move-object/from16 v24, v4

    move/from16 v66, v7

    move/from16 v4, v17

    move-object/from16 v17, v28

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v69, v54

    move-object/from16 v72, v55

    move/from16 v71, v56

    :goto_36
    move/from16 v28, v5

    move/from16 v38, v13

    goto/16 :goto_3f

    :sswitch_49
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move-object/from16 v57, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    const v0, 0xcd55

    const v66, 0xcd55

    goto :goto_37

    :sswitch_4a
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move-object/from16 v57, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    const v0, 0xf076

    const v66, 0xf076

    :goto_37
    const-string v0, "\u06d7\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v62, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x4cd

    const v7, 0x4f8ec49f

    xor-int/2addr v1, v7

    const v7, -0x3702c32a

    xor-int v64, v0, v7

    move/from16 v68, v2

    goto/16 :goto_3b

    :sswitch_4b
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    mul-int v0, v45, v45

    mul-int v1, v44, v44

    const v58, 0x1bbf544

    add-int v1, v1, v58

    add-int/2addr v1, v1

    sub-int/2addr v1, v0

    if-gez v1, :cond_2d

    const-string v0, "\u1a7a\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x53

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, -0x61c3

    const v58, 0x967d43b

    xor-int v1, v1, v58

    const v58, -0x7bd6eaf9

    goto/16 :goto_3a

    :cond_2d
    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v62

    mul-int/lit8 v0, v0, -0x4f

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x2b71

    const v58, 0xd04b4be

    xor-int v1, v1, v58

    const v58, 0x5ac8cb88

    goto/16 :goto_3a

    :sswitch_4c
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    aget-short v0, v42, v43

    add-int/lit16 v1, v0, 0x1512

    .line 192
    sget-boolean v44, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v44, :cond_2e

    move/from16 v44, v0

    move/from16 v45, v1

    move/from16 v0, v17

    move-object/from16 v69, v54

    move/from16 v71, v56

    :goto_38
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v63, v1

    mul-int/lit8 v1, v1, 0x73

    move/from16 v17, v0

    xor-int v0, v1, v62

    mul-int/lit16 v0, v0, 0x6da1

    const v54, 0x5f7425c7

    xor-int v0, v0, v54

    const v54, -0x20525e77

    xor-int v64, v1, v54

    move v1, v0

    move/from16 v68, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v72, v55

    goto/16 :goto_3c

    :cond_2e
    const-string v44, "\u073d\u05a1"

    invoke-static/range {v44 .. v44}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v44

    sub-int v44, v62, v44

    mul-int/lit8 v44, v44, 0x4b

    move/from16 v45, v0

    xor-int v0, v44, v63

    mul-int/lit16 v0, v0, 0x2cad

    const v58, -0x7673141c

    xor-int v0, v0, v58

    const v58, 0x1f721d00

    xor-int v64, v44, v58

    move/from16 v68, v2

    move/from16 v66, v7

    move-object/from16 v2, v24

    move/from16 v44, v45

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v69, v54

    move-object/from16 v72, v55

    move/from16 v71, v56

    move-object/from16 v67, v57

    move/from16 v45, v1

    move-object/from16 v24, v4

    move/from16 v4, v17

    move-object/from16 v17, v28

    move v1, v0

    move/from16 v28, v5

    move-object/from16 v5, v29

    move-object/from16 v0, v38

    move/from16 v38, v13

    goto/16 :goto_40

    :sswitch_4d
    move-object/from16 v47, v6

    move-object/from16 v48, v7

    move-object/from16 v6, v23

    move/from16 v23, v29

    move/from16 v13, v38

    move/from16 v7, v66

    move-object/from16 v57, v67

    move-object/from16 v54, v69

    move/from16 v56, v71

    move-object/from16 v55, v72

    move-object/from16 v52, v74

    move/from16 v51, v75

    move/from16 v53, v76

    move-object/from16 v49, v79

    move/from16 v50, v80

    move-object/from16 v38, v0

    move-object/from16 v29, v5

    move/from16 v5, v28

    move-object/from16 v28, v17

    move/from16 v17, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v2

    move/from16 v2, v68

    sget-object v42, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v43, 0xa

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v0

    if-nez v0, :cond_2f

    :goto_39
    const-string v0, "\u073a\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v62

    xor-int v1, v0, v63

    mul-int/lit16 v1, v1, -0x1f0d

    const v58, -0x60aed557

    xor-int v1, v1, v58

    const v58, 0x14a18a11

    goto :goto_3a

    :cond_2f
    const-string v0, "\u06d7\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v63

    mul-int/lit8 v0, v0, 0x1f

    xor-int v1, v0, v62

    mul-int/lit16 v1, v1, 0x7e97

    const v58, 0x62de9136

    xor-int v1, v1, v58

    const v58, -0x3efeeb9f

    :goto_3a
    xor-int v64, v0, v58

    move/from16 v68, v2

    move/from16 v66, v7

    :goto_3b
    move-object/from16 v2, v24

    move-object/from16 v0, v38

    move-object/from16 v7, v48

    move-object/from16 v79, v49

    move/from16 v80, v50

    move/from16 v75, v51

    move-object/from16 v74, v52

    move/from16 v76, v53

    move-object/from16 v69, v54

    move-object/from16 v72, v55

    move/from16 v71, v56

    :goto_3c
    move-object/from16 v67, v57

    :goto_3d
    move-object/from16 v24, v4

    move/from16 v38, v13

    move/from16 v4, v17

    move-object/from16 v17, v28

    :goto_3e
    move/from16 v28, v5

    :goto_3f
    move-object/from16 v5, v29

    :goto_40
    move/from16 v29, v23

    move-object/from16 v23, v6

    :goto_41
    move-object/from16 v6, v47

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fe8ebc8 -> :sswitch_d
        -0x7ecdecff -> :sswitch_26
        -0x7df897c5 -> :sswitch_34
        -0x7c6049ce -> :sswitch_1c
        -0x7b6740ea -> :sswitch_20
        -0x793e641b -> :sswitch_44
        -0x7894a11c -> :sswitch_31
        -0x786aba43 -> :sswitch_16
        -0x75bde885 -> :sswitch_11
        -0x743286f9 -> :sswitch_49
        -0x72a56ca2 -> :sswitch_2
        -0x6d211aa9 -> :sswitch_14
        -0x6b59ffdc -> :sswitch_2f
        -0x6b2591b5 -> :sswitch_4b
        -0x6967d266 -> :sswitch_f
        -0x684f4863 -> :sswitch_3c
        -0x6844f730 -> :sswitch_6
        -0x678c2404 -> :sswitch_36
        -0x65b3e84d -> :sswitch_24
        -0x65427836 -> :sswitch_19
        -0x645f2e81 -> :sswitch_20
        -0x62e99f10 -> :sswitch_2a
        -0x6115e6da -> :sswitch_25
        -0x60a87913 -> :sswitch_19
        -0x5f0cd210 -> :sswitch_33
        -0x5262d6ee -> :sswitch_13
        -0x5046b136 -> :sswitch_13
        -0x4f9c2658 -> :sswitch_11
        -0x4c73f676 -> :sswitch_34
        -0x4a2a56f3 -> :sswitch_8
        -0x49984e0e -> :sswitch_15
        -0x48705a4e -> :sswitch_b
        -0x48565e06 -> :sswitch_3a
        -0x479188f2 -> :sswitch_2e
        -0x4151c40b -> :sswitch_32
        -0x3d7b7964 -> :sswitch_5
        -0x3cfa1ef5 -> :sswitch_1f
        -0x34d3ef1f -> :sswitch_39
        -0x314f7f12 -> :sswitch_3b
        -0x2b4a5174 -> :sswitch_a
        -0x2ab3b869 -> :sswitch_27
        -0x2a872ea5 -> :sswitch_17
        -0x26f9a0c3 -> :sswitch_42
        -0x25eb481b -> :sswitch_4
        -0x24dd77b3 -> :sswitch_10
        -0x23a2bb6f -> :sswitch_8
        -0x22610b07 -> :sswitch_e
        -0x224f7378 -> :sswitch_43
        -0x1e1b1473 -> :sswitch_1e
        -0x1be10a17 -> :sswitch_1d
        -0x1bdd03ae -> :sswitch_2f
        -0x19a11f7f -> :sswitch_29
        -0x177a5c64 -> :sswitch_0
        -0x15121d17 -> :sswitch_30
        -0x12253e94 -> :sswitch_10
        -0x10b7d9bc -> :sswitch_28
        -0xc88a26f -> :sswitch_30
        -0xa684002 -> :sswitch_40
        -0x9a96f30 -> :sswitch_b
        -0x4b7ceeb -> :sswitch_47
        -0x34dfcac -> :sswitch_2a
        -0x33b1a8c -> :sswitch_4c
        -0x304c5f9 -> :sswitch_6
        -0x2612403 -> :sswitch_5
        0x1c6c27a -> :sswitch_21
        0x1ef6c8d -> :sswitch_43
        0x2ef5792 -> :sswitch_37
        0x3e29819 -> :sswitch_4b
        0x76619a5 -> :sswitch_15
        0xc68dccd -> :sswitch_3d
        0xe2220a1 -> :sswitch_2e
        0xe5982c3 -> :sswitch_36
        0xe957faf -> :sswitch_25
        0x15054301 -> :sswitch_1
        0x15d1759b -> :sswitch_e
        0x160cb834 -> :sswitch_40
        0x16500beb -> :sswitch_39
        0x16d63ec1 -> :sswitch_14
        0x172048a8 -> :sswitch_2d
        0x18346b21 -> :sswitch_1a
        0x1b10d040 -> :sswitch_2b
        0x1c39b5ba -> :sswitch_26
        0x1c48e701 -> :sswitch_17
        0x1c788194 -> :sswitch_1b
        0x1c9a4d59 -> :sswitch_38
        0x1dee7432 -> :sswitch_c
        0x1febc005 -> :sswitch_a
        0x203059b9 -> :sswitch_4a
        0x20316c1d -> :sswitch_37
        0x229ce519 -> :sswitch_23
        0x229de6c7 -> :sswitch_c
        0x22ad46fd -> :sswitch_4d
        0x24d0d741 -> :sswitch_4d
        0x28743053 -> :sswitch_41
        0x295f7c51 -> :sswitch_45
        0x2b7c7e81 -> :sswitch_27
        0x2b910b27 -> :sswitch_48
        0x2bb16b38 -> :sswitch_2c
        0x2fc3d991 -> :sswitch_28
        0x30280ca7 -> :sswitch_35
        0x313bc77d -> :sswitch_3f
        0x33d941fc -> :sswitch_0
        0x376ff3fd -> :sswitch_4a
        0x38070827 -> :sswitch_12
        0x3ac3b448 -> :sswitch_3e
        0x3e26ff18 -> :sswitch_7
        0x404197c5 -> :sswitch_9
        0x41523875 -> :sswitch_33
        0x43ae5a47 -> :sswitch_12
        0x44bc883f -> :sswitch_2
        0x45b41fd5 -> :sswitch_3b
        0x47e5f168 -> :sswitch_1f
        0x49f3008d -> :sswitch_46
        0x4a01ca25 -> :sswitch_31
        0x4a1517ed -> :sswitch_18
        0x4b4d4eee -> :sswitch_2c
        0x4b9c5268 -> :sswitch_1b
        0x4f2e460d -> :sswitch_41
        0x4f5b4be4 -> :sswitch_3d
        0x50cce11f -> :sswitch_1
        0x546aa7e5 -> :sswitch_22
        0x54a3f2e4 -> :sswitch_f
        0x54cd88f4 -> :sswitch_1e
        0x56e96e3f -> :sswitch_16
        0x57c94042 -> :sswitch_23
        0x5b32466e -> :sswitch_2d
        0x5df214cf -> :sswitch_3a
        0x61260f6f -> :sswitch_1c
        0x61d56e7e -> :sswitch_d
        0x61e51f60 -> :sswitch_3
        0x62300aa5 -> :sswitch_45
        0x642163b3 -> :sswitch_1a
        0x6497fc61 -> :sswitch_29
        0x658e20c1 -> :sswitch_35
        0x67588464 -> :sswitch_32
        0x683d9319 -> :sswitch_4
        0x69246754 -> :sswitch_21
        0x6af0f7f1 -> :sswitch_47
        0x6afc5168 -> :sswitch_42
        0x6b74fa04 -> :sswitch_7
        0x6d6f0ecc -> :sswitch_3e
        0x6ddb39fb -> :sswitch_49
        0x6fc5f53c -> :sswitch_44
        0x6fe1d142 -> :sswitch_3
        0x70653774 -> :sswitch_38
        0x70b0b7aa -> :sswitch_48
        0x7110b49d -> :sswitch_2b
        0x7452122d -> :sswitch_9
        0x762b38bd -> :sswitch_22
        0x78c18ad9 -> :sswitch_3c
        0x78c65334 -> :sswitch_4c
        0x7a86214e -> :sswitch_24
        0x7a98b1de -> :sswitch_3f
        0x7cbe9ad2 -> :sswitch_18
        0x7e0c3500 -> :sswitch_1d
        0x7e5f3e0d -> :sswitch_46
    .end sparse-switch
.end method

.method public static ۧ(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x417d94fa

    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    sget v9, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v10, "\u1a73\u06e8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5b3

    const v12, 0x59e5e6e3

    xor-int/2addr v11, v12

    const v12, -0x222940fc

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x7107

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 235
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v10

    if-nez v10, :cond_3

    goto/16 :goto_8

    .line 214
    :sswitch_0
    sget v10, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v10, :cond_a

    goto :goto_2

    :sswitch_1
    sget v10, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v10, :cond_7

    goto/16 :goto_7

    .line 13
    :sswitch_2
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_3

    .line 194
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v10, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v10, :cond_0

    goto :goto_3

    :cond_0
    :goto_2
    const-string v10, "\u06d6\u1a78"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xc67

    const v12, 0x201844c2

    xor-int/2addr v11, v12

    const v12, -0x599f3c0b

    goto :goto_0

    .line 263
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    :goto_3
    const-string v10, "\u1a79\u1a7a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5aa1

    const v12, 0x62fef878

    xor-int/2addr v11, v12

    const v12, -0x359ed7b4    # -3688979.0f

    goto :goto_0

    :sswitch_5
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    const/4 p0, 0x0

    return-object p0

    .line 288
    :sswitch_6
    :try_start_0
    invoke-static {v5, v6}, Ll/ۖ;->ۧܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :sswitch_7
    throw v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :sswitch_8
    :try_start_1
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    const-string v10, "\u06d8\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2f7f

    const v12, 0x81dc383

    xor-int/2addr v11, v12

    const v12, 0x3cfd1bc0

    goto :goto_0

    :catchall_0
    move-exception v6

    const-string v10, "\u06db\u06ec"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0xabf

    const v12, -0x5ee0a77b

    xor-int/2addr v11, v12

    const v12, -0x196106d4

    goto/16 :goto_0

    :sswitch_9
    return-object v4

    :sswitch_a
    return-object v2

    :sswitch_b
    :try_start_2
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۧۧ()Ljava/io/BufferedInputStream;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 289
    :try_start_3
    invoke-static {v3}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 290
    :try_start_4
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const-string v10, "\u06ec\u073f"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x2d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7f5f

    const v12, -0xfbed1c1

    xor-int/2addr v11, v12

    const v12, -0x17b3808e

    goto/16 :goto_0

    :catchall_1
    move-exception v5

    const-string v10, "\u1a73\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x28d9

    const v12, 0x15dcf582

    xor-int/2addr v11, v12

    const v12, 0x3938cbfb

    goto/16 :goto_0

    :catch_0
    const-string v10, "\u1a79\u1a77"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x11df

    const v12, 0x37b27b2e

    xor-int/2addr v11, v12

    const v12, 0x7cda4fcb

    goto/16 :goto_0

    .line 285
    :sswitch_c
    invoke-static {v1}, Ll/֫ܺ;->ܶۖ᩻(Ljava/lang/Object;)Z

    move-result v2

    const/4 v10, 0x0

    if-nez v2, :cond_1

    const-string v2, "\u06ec\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v9

    mul-int/lit8 v2, v2, 0x5b

    xor-int v11, v2, v8

    mul-int/lit16 v11, v11, -0x37fb

    const v12, -0xc924113

    xor-int/2addr v11, v12

    const v12, -0x7d4d2687

    goto :goto_5

    :cond_1
    const-string v2, "\u05a1\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    mul-int/lit8 v2, v2, 0x33

    xor-int v11, v2, v9

    mul-int/lit16 v11, v11, -0x3643

    const v12, 0x11384205

    xor-int/2addr v11, v12

    const v12, -0x55c8145d

    :goto_5
    xor-int/2addr v2, v12

    move-object v13, v10

    move v10, v2

    move-object v2, v13

    goto/16 :goto_1

    .line 284
    :sswitch_d
    invoke-static {v0, p0}, Ll/ۘۗ;->᩸֨᩸(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 270
    sget v10, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v10, :cond_2

    goto/16 :goto_8

    :cond_2
    const-string v10, "\u06ec\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x31

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x9d1

    const v12, 0x1a3a64cf

    xor-int/2addr v11, v12

    const v12, 0x75130498

    goto/16 :goto_0

    :cond_3
    const-string v10, "\u06d7\u0733"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x16f5

    const v12, 0x4c08f01e    # 3.5897464E7f

    xor-int/2addr v11, v12

    const v12, 0x20734c00

    goto/16 :goto_0

    .line 93
    :sswitch_e
    sget v10, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v10, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string v10, "\u06e7\u06d9"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xea3

    const v12, -0x4c5d741a

    xor-int/2addr v11, v12

    const v12, 0x4482564d

    goto/16 :goto_0

    .line 151
    :sswitch_f
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v10

    if-gtz v10, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v10, "\u06db\u073d"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7fff

    const v12, -0x1d0301d9

    xor-int/2addr v11, v12

    const v12, 0x71a0141b

    goto/16 :goto_0

    :sswitch_10
    sget v10, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v10, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v10, "\u1a76\u06e2"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4fb

    const v12, -0x3407b706    # -3.254322E7f

    xor-int/2addr v11, v12

    const v12, 0x181d329d

    goto/16 :goto_0

    .line 203
    :sswitch_11
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v10

    if-ltz v10, :cond_8

    :cond_7
    const-string v10, "\u06da\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x679b

    const v12, 0x38ee733

    xor-int/2addr v11, v12

    const v12, -0x32de18ca

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a7b\u06df"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x37

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1e45

    const v12, -0x24217664

    xor-int/2addr v11, v12

    const v12, 0x25d1c4e1

    goto/16 :goto_0

    .line 8
    :sswitch_12
    sget v10, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v10, :cond_9

    goto :goto_7

    :cond_9
    const-string v10, "\u073f\u073a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2de1

    const v12, -0x44b9ddea

    xor-int/2addr v11, v12

    const v12, 0x2978660c

    goto/16 :goto_0

    .line 249
    :sswitch_13
    sget v10, Ll/֡۬;->۠֡᩶:I

    if-gtz v10, :cond_b

    :cond_a
    :goto_6
    const-string v10, "\u06d7\u06e7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x31

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4ce5

    const v12, -0x6f4f3838

    xor-int/2addr v11, v12

    const v12, -0x7fb293b9

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u1a77\u06d9"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x3b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1b1

    const v12, -0x2350a383

    xor-int/2addr v11, v12

    const v12, -0x3eb179f1

    goto/16 :goto_0

    .line 102
    :sswitch_14
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v10

    if-gtz v10, :cond_d

    :cond_c
    :goto_7
    const-string v10, "\u06e8\u06ec"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x527b

    const v12, -0x3202a135    # -5.31356E8f

    xor-int/2addr v11, v12

    const v12, -0x60a7cd6

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u1a75\u06db"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7af1

    const v12, -0x2f31eb33

    xor-int/2addr v11, v12

    const v12, 0x347c077d

    goto/16 :goto_0

    .line 284
    :sswitch_15
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵֫:Ll/ܶ᩵ܿ;

    .line 227
    sget-boolean v10, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v10, :cond_e

    :goto_8
    const-string v10, "\u073f\u1a78"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x11

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7733

    const v12, 0x58d9a68d

    xor-int/2addr v11, v12

    const v12, 0x71f61769

    goto/16 :goto_0

    :cond_e
    const-string v10, "\u0733\u0730"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x725

    const v12, -0x2f2e79d2

    xor-int/2addr v11, v12

    const v12, -0x77a7da3b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e7dbefd -> :sswitch_a
        -0x78086060 -> :sswitch_8
        -0x76cb9593 -> :sswitch_e
        -0x710bef74 -> :sswitch_f
        -0x6b5bd729 -> :sswitch_12
        -0x6b11d6c5 -> :sswitch_d
        -0x6141beed -> :sswitch_12
        -0x5fe63c6d -> :sswitch_e
        -0x5af9f510 -> :sswitch_7
        -0x529ff361 -> :sswitch_a
        -0x4f7c8188 -> :sswitch_11
        -0x470da319 -> :sswitch_9
        -0x432c0002 -> :sswitch_5
        -0x417f1912 -> :sswitch_2
        -0x347fa3ab -> :sswitch_4
        -0x31a3d39e -> :sswitch_10
        -0x30759cc7 -> :sswitch_1
        -0x2f7f5f14 -> :sswitch_b
        -0x2cd9fff3 -> :sswitch_15
        -0x2bfdc1ec -> :sswitch_a
        -0x177d7629 -> :sswitch_8
        -0x17358702 -> :sswitch_6
        -0x110de9ca -> :sswitch_0
        -0xe35648a -> :sswitch_d
        -0x96c622d -> :sswitch_10
        -0x86971d1 -> :sswitch_13
        -0x6c16f58 -> :sswitch_9
        -0x78f9bf -> :sswitch_c
        0x6a09b36 -> :sswitch_1
        0x7380ca9 -> :sswitch_b
        0xc1ec9fc -> :sswitch_c
        0xf6194b4 -> :sswitch_3
        0xfbf5b60 -> :sswitch_a
        0x11a33c37 -> :sswitch_14
        0x1467ec10 -> :sswitch_11
        0x1c98303e -> :sswitch_2
        0x284c5264 -> :sswitch_3
        0x37272e17 -> :sswitch_6
        0x3f9bd238 -> :sswitch_4
        0x442e7a7e -> :sswitch_15
        0x483ab021 -> :sswitch_0
        0x512dccf5 -> :sswitch_7
        0x539998c2 -> :sswitch_5
        0x545b3521 -> :sswitch_13
        0x55375fa3 -> :sswitch_f
        0x7ea86e71 -> :sswitch_14
    .end sparse-switch
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 1

    .line 307
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->᩵֫:Ll/ܶ᩵ܿ;

    invoke-static {v0, p0}, Ll/֫֫;->ۤ۟ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-static {p0}, Ll/֫᩵;->ܳ᩺۟(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ᩵()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0xd5c5f0

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    const-string v4, "\u05ab\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6d11

    const v6, 0x2913e7ad

    xor-int/2addr v5, v6

    const v6, -0xbad71bd

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x721d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_8

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-nez v4, :cond_b

    goto/16 :goto_1

    .line 275
    :sswitch_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_9

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-lez v4, :cond_5

    goto/16 :goto_2

    .line 274
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto/16 :goto_2

    .line 278
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 v0, 0x0

    return v0

    .line 275
    :sswitch_5
    invoke-static {v0}, Ll/֨᩺;->ܶۗ᩻(Z)Ljava/lang/Boolean;

    move-result-object v4

    sput-object v4, Lbin/mt/plus/ShortcutActivity;->֡֫:Ljava/lang/Boolean;

    goto/16 :goto_6

    :sswitch_6
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06d6\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5e6d

    const v6, -0x1387cac4

    xor-int/2addr v5, v6

    const v6, 0x1ed1fe58

    goto :goto_0

    .line 277
    :sswitch_7
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u0733\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x451d

    const v6, -0x6e21c1a1

    xor-int/2addr v5, v6

    const v6, 0x724c8420

    goto :goto_0

    .line 276
    :sswitch_8
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u0733\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6757

    const v6, 0x2a883cb1

    xor-int/2addr v5, v6

    const v6, -0x1a652825

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06e7\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x595b

    const v6, 0x3e2675d4

    xor-int/2addr v5, v6

    const v6, 0x4d400243    # 2.01335856E8f

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a79\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4793

    const v6, -0x67ce2339

    xor-int/2addr v5, v6

    const v6, 0x2d69dd9f

    goto/16 :goto_0

    .line 278
    :sswitch_b
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u06da\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x342f

    const v6, -0x60caeebf

    xor-int/2addr v5, v6

    const v6, 0x14f6030b

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e0\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x53e1

    const v6, 0x278be82a

    xor-int/2addr v5, v6

    const v6, -0x121ac446

    goto/16 :goto_0

    .line 275
    :sswitch_c
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v4

    if-ltz v4, :cond_7

    :goto_2
    const-string v4, "\u06eb\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x52a9

    const v6, 0x6ce2822f

    xor-int/2addr v5, v6

    const v6, 0x84cf8a1

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a79\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3931

    const v6, 0x3c0ec2a8

    xor-int/2addr v5, v6

    const v6, 0x2c501dfc

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u06e1\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2d7f

    const v6, 0xc1eb281

    xor-int/2addr v5, v6

    const v6, -0x6982a38d

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d6\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x64fd

    const v6, -0x7da9d085

    xor-int/2addr v5, v6

    const v6, 0x7830ef0b

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a74\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5903

    const v6, -0x37fdb23b

    xor-int/2addr v5, v6

    const v6, 0x636c6f79

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06df\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1ca9

    const v6, 0x1171300c

    xor-int/2addr v5, v6

    const v6, -0x2a024555

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۗ;->ܳ(Landroid/content/Context;)Z

    move-result v0

    .line 278
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06ec\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5dd

    const v6, 0x34b0cda9

    xor-int/2addr v5, v6

    const v6, -0x36af873f    # -853900.06f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x16d

    const v6, 0x6e2414bc

    xor-int/2addr v5, v6

    const v6, 0x2a268a4d

    goto/16 :goto_0

    .line 277
    :sswitch_f
    sget-object v0, Lbin/mt/plus/ShortcutActivity;->֡֫:Ljava/lang/Boolean;

    invoke-static {v0}, Ll/ۗۗ;->۫۟ۢ(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 274
    :sswitch_10
    sget-object v4, Lbin/mt/plus/ShortcutActivity;->֡֫:Ljava/lang/Boolean;

    if-nez v4, :cond_d

    const-string v4, "\u0730\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xd65

    const v6, 0x2f49b577

    xor-int/2addr v5, v6

    const v6, 0xde19420

    goto/16 :goto_0

    :cond_d
    :goto_6
    const-string v4, "\u05a1\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3c05

    const v6, -0xf50f28f

    xor-int/2addr v5, v6

    const v6, -0x1eae427c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ae63148 -> :sswitch_2
        -0x75521d6d -> :sswitch_9
        -0x62e4c9b2 -> :sswitch_0
        -0x4f9b25c9 -> :sswitch_2
        -0x4cc3729d -> :sswitch_6
        -0x378c8422 -> :sswitch_4
        -0x3504c900 -> :sswitch_5
        -0x2d3fe4e9 -> :sswitch_5
        -0x2634aae4 -> :sswitch_e
        -0x2397b886 -> :sswitch_d
        -0x229a17f3 -> :sswitch_a
        -0x1e343599 -> :sswitch_c
        -0x14486214 -> :sswitch_6
        -0x12de9f97 -> :sswitch_f
        -0x1187ac9a -> :sswitch_8
        -0x786feb7 -> :sswitch_b
        0x769e462 -> :sswitch_3
        0xb6624ce -> :sswitch_7
        0xf864c68 -> :sswitch_0
        0x101493ec -> :sswitch_c
        0x127a4f82 -> :sswitch_10
        0x1cbcb0ab -> :sswitch_4
        0x1d99821b -> :sswitch_b
        0x25343179 -> :sswitch_3
        0x2693f284 -> :sswitch_1
        0x3b6323bc -> :sswitch_8
        0x49bb1960 -> :sswitch_d
        0x50ab5b51 -> :sswitch_1
        0x55c6039b -> :sswitch_9
        0x5ac6396a -> :sswitch_e
        0x629800f2 -> :sswitch_a
        0x6da9c77a -> :sswitch_10
        0x78aaf748 -> :sswitch_f
        0x7c61ce14 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 47

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

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const v39, -0x53724bb6

    sget v40, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v41, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v42, "\u06e2\u1a74"

    invoke-static/range {v42 .. v42}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v42

    xor-int v42, v42, v40

    xor-int v1, v42, v41

    mul-int/lit16 v1, v1, 0x4e61

    const v44, 0x694cd760

    xor-int v1, v1, v44

    const v44, -0x476bb70c

    xor-int v42, v42, v44

    const/4 v4, 0x0

    const/16 v38, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    :goto_0
    xor-int v5, v39, v41

    mul-int/lit16 v5, v5, 0x57d7

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v39, v42, v1

    sparse-switch v39, :sswitch_data_0

    move/from16 v45, v10

    .line 82
    :try_start_0
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    goto/16 :goto_6

    .line 88
    :sswitch_0
    :try_start_1
    invoke-virtual/range {v43 .. v43}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1, v8}, Lbin/mt/plus/Main;->֫(Landroid/app/Activity;Landroid/os/Bundle;Z)V

    goto :goto_1

    .line 104
    :sswitch_1
    invoke-static {v0, v3}, Ll/֨ۚ᩷;->֫(Lbin/mt/plus/ShortcutActivity;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_1

    .line 93
    :sswitch_2
    :try_start_2
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    invoke-static {v1, v9}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 95
    invoke-static {v1, v6}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    sget-object v5, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object/from16 v42, v2

    const/16 v2, 0x1c4

    move/from16 v45, v10

    const/16 v10, 0x1a

    :try_start_4
    invoke-static {v5, v2, v10, v4}, Ll/ۛ;->᩷ۘ᩹([SIII)Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 97
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    sget-object v2, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x1de

    const/16 v10, 0x8

    invoke-static {v2, v5, v10, v4}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v2

    .line 98
    invoke-virtual {v1, v2, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 99
    invoke-static {v0, v1}, Ll/᩺;->᩶᩹᩵(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_5

    :catch_0
    move-object/from16 v42, v2

    move/from16 v45, v10

    goto/16 :goto_5

    :catch_1
    move-object/from16 v42, v2

    :catch_2
    :goto_1
    move/from16 v45, v10

    goto/16 :goto_9

    :sswitch_3
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v37, :cond_1

    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x5c69

    const v5, -0x4b21f774

    xor-int/2addr v2, v5

    const v5, -0x42b43d93

    goto/16 :goto_4

    :sswitch_4
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v36, :cond_1

    const-string v1, "\u06eb\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x73b

    const v5, -0x479e1365

    xor-int/2addr v2, v5

    const v5, -0x71f81c1c

    goto/16 :goto_4

    :sswitch_5
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v35, :cond_1

    const-string v1, "\u0730\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x4cb9

    const v5, -0x43f34b22

    xor-int/2addr v2, v5

    const v5, 0x5c2228a4

    goto/16 :goto_4

    :sswitch_6
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 108
    :try_start_5
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 109
    invoke-static {v1, v9}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 110
    invoke-static {v1, v6}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 111
    invoke-static {v0, v1}, Ll/᩹;->᩶ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_7
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 134
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/۟ۡۢ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 135
    invoke-static {v1, v9}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 136
    invoke-static {v0, v1}, Ll/᩹;->᩶ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_8
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 139
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/ܶۜۡ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    invoke-static {v1, v9}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 141
    invoke-static {v0, v1}, Ll/᩹;->᩶ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 129
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/᩺ܿ᩷;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    invoke-static {v1, v9}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 131
    invoke-static {v0, v1}, Ll/᩺;->᩶᩹᩵(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 124
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/۟᩸ۢ;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 125
    invoke-static {v1, v9}, Ll/֨֫;->ᩳ᩵ۧ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 126
    invoke-static {v0, v1}, Ll/᩹;->᩶ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_b
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 87
    invoke-static {v3}, Ll/ۘ᩻;->ᩴᩳۚ(Ljava/lang/Object;)Z

    move-result v37
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    const-string v1, "\u06d9\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x3

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x2cc3

    const v5, -0x555c6b92

    xor-int/2addr v2, v5

    const v5, 0x5b3ebe83

    goto/16 :goto_4

    :sswitch_c
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 121
    :try_start_6
    invoke-virtual/range {v43 .. v43}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v0, v1, v8}, Lbin/mt/plus/Main;->֫(Landroid/app/Activity;Landroid/os/Bundle;Z)V

    goto/16 :goto_5

    :sswitch_d
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 103
    invoke-static {v3}, Ll/֨۟;->ۤ᩺᩵(Ljava/lang/Object;)Z

    move-result v36
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    const-string v1, "\u0736\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x1e0f

    const v5, -0x77d28216

    xor-int/2addr v2, v5

    const v5, 0x4dd04b61    # 4.3682512E8f

    goto/16 :goto_4

    :sswitch_e
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 154
    :try_start_7
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :sswitch_f
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 92
    invoke-static {v3}, Ll/֨۟;->ۤ᩺᩵(Ljava/lang/Object;)Z

    move-result v35
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    const-string v1, "\u073a\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x2be9

    const v5, 0x2c54b4c

    xor-int/2addr v2, v5

    const v5, -0x305d0dc8

    goto/16 :goto_4

    :sswitch_10
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 114
    :try_start_8
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/֫᩵᩷;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    invoke-static {v1, v9}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 116
    invoke-static {v0, v1}, Ll/᩺;->᩶᩹᩵(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    goto/16 :goto_5

    :sswitch_11
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v34, :cond_1

    const-string v1, "\u06db\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x1c73

    const v5, 0x1bb4c8c4

    xor-int/2addr v2, v5

    const v5, -0x382d7302

    goto/16 :goto_4

    :sswitch_12
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v33, :cond_1

    const-string v1, "\u06da\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x33fd

    const v5, 0x16594df7

    xor-int/2addr v2, v5

    const v5, -0x15a1e7a5

    goto/16 :goto_4

    :sswitch_13
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v32, :cond_1

    goto/16 :goto_3

    :sswitch_14
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v31, :cond_0

    goto/16 :goto_5

    :sswitch_15
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v30, :cond_0

    goto/16 :goto_5

    :sswitch_16
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v29, :cond_1

    goto/16 :goto_3

    :sswitch_17
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v28, :cond_1

    const-string v1, "\u1a7b\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x11f

    const v5, 0x796abc9b

    xor-int/2addr v2, v5

    const v5, 0x77cd8f1c

    goto/16 :goto_4

    :sswitch_18
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v27, :cond_0

    goto/16 :goto_5

    :sswitch_19
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v26, :cond_0

    goto/16 :goto_5

    :sswitch_1a
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v25, :cond_1

    goto/16 :goto_2

    :sswitch_1b
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v24, :cond_0

    goto/16 :goto_5

    :sswitch_1c
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v23, :cond_1

    const-string v1, "\u06e7\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x831

    const v5, 0x91437a7

    xor-int/2addr v2, v5

    const v5, 0x29ca66b3

    goto/16 :goto_4

    :sswitch_1d
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v22, :cond_1

    goto :goto_2

    :sswitch_1e
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v21, :cond_0

    goto/16 :goto_5

    :sswitch_1f
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v20, :cond_0

    goto/16 :goto_5

    :sswitch_20
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v19, :cond_1

    const-string v1, "\u1a73\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x66af

    const v5, -0x33fb2230    # -3.4830144E7f

    xor-int/2addr v2, v5

    const v5, -0x263fc19e

    goto/16 :goto_4

    :sswitch_21
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v18, :cond_1

    goto :goto_2

    :sswitch_22
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v17, :cond_0

    goto/16 :goto_5

    :sswitch_23
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v16, :cond_1

    :goto_2
    const-string v1, "\u1a7a\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x4b

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x3079

    const v5, -0x866bc2a

    xor-int/2addr v2, v5

    const v5, -0x7b899397

    goto/16 :goto_4

    :sswitch_24
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v15, :cond_1

    :goto_3
    const-string v1, "\u06da\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x4c25

    const v5, -0x6eac3f5f

    xor-int/2addr v2, v5

    const v5, -0x4860a301

    goto/16 :goto_4

    :sswitch_25
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v14, :cond_1

    const-string v1, "\u1a74\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, -0x4aab

    const v5, 0x3e62a264

    xor-int/2addr v2, v5

    const v5, -0xca2cb67

    goto :goto_4

    :sswitch_26
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v13, :cond_0

    goto :goto_5

    :sswitch_27
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-nez v12, :cond_0

    goto :goto_5

    :cond_0
    const-string v1, "\u06d9\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x309f

    const v5, 0x1ca2a4d

    xor-int/2addr v2, v5

    const v5, -0x75427ca2

    goto :goto_4

    :sswitch_28
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v11, :cond_1

    const-string v1, "\u073d\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v40

    mul-int/lit16 v2, v2, 0x619

    const v5, 0x1dfc1151

    xor-int/2addr v2, v5

    const v5, -0x4621d5be

    goto :goto_4

    :sswitch_29
    move-object/from16 v42, v2

    move/from16 v45, v10

    if-eqz v45, :cond_1

    const-string v1, "\u06d7\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x5377

    const v5, -0x20221c7e

    xor-int/2addr v2, v5

    const v5, -0x604341a6

    :goto_4
    xor-int/2addr v1, v5

    move/from16 v10, v45

    move-object/from16 v46, v42

    move/from16 v42, v1

    move v1, v2

    move-object/from16 v2, v46

    goto/16 :goto_0

    :catch_3
    :cond_1
    :goto_5
    move-object/from16 v2, v42

    goto/16 :goto_9

    :sswitch_2a
    move-object/from16 v42, v2

    move/from16 v45, v10

    .line 82
    :try_start_9
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v2, 0x1b4

    const/16 v5, 0x10

    invoke-static {v1, v2, v5, v4}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    move-object/from16 v2, v42

    :try_start_a
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v34
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    const-string v1, "\u06e7\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0xb9f

    const v10, 0x7558c94b

    xor-int/2addr v5, v10

    const v10, -0x32f775ed

    goto/16 :goto_7

    :sswitch_2b
    move/from16 v45, v10

    .line 111
    :try_start_b
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x1a4

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v33
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    const-string v1, "\u06d6\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x27

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x166b

    const v10, 0x4916e658    # 618085.5f

    xor-int/2addr v5, v10

    const v10, -0x5702bdc1

    goto/16 :goto_7

    :sswitch_2c
    move/from16 v45, v10

    .line 136
    :try_start_c
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x194

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v32
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    const-string v1, "\u073d\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x5d

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x32c1

    const v10, -0x657b51f4

    xor-int/2addr v5, v10

    const v10, -0x1c978157

    goto/16 :goto_7

    :sswitch_2d
    move/from16 v45, v10

    :try_start_d
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x17f

    const/16 v10, 0x15

    invoke-static {v1, v5, v10, v4}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v31
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    const-string v1, "\u06db\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x1dc7

    const v10, -0x4acdb28b

    xor-int/2addr v5, v10

    const v10, 0x5f959dde

    goto/16 :goto_7

    :goto_6
    const/16 v5, 0x16d

    const/16 v10, 0x12

    :try_start_e
    invoke-static {v1, v5, v10, v4}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v30
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5

    const-string v1, "\u06eb\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x6b51

    const v10, 0x8c6b67c

    xor-int/2addr v5, v10

    const v10, 0xe74aefa

    goto/16 :goto_7

    :sswitch_2e
    move/from16 v45, v10

    :try_start_f
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x15a

    const/16 v10, 0x13

    invoke-static {v1, v5, v10, v4}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v29
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5

    const-string v1, "\u1a76\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x577b

    const v10, 0x7cb4e6e9

    xor-int/2addr v5, v10

    const v10, 0x252d5cb4

    goto/16 :goto_7

    :sswitch_2f
    move/from16 v45, v10

    :try_start_10
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x14d

    const/16 v10, 0xd

    invoke-static {v1, v5, v10, v4}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v28
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_5

    const-string v1, "\u1a7a\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, 0x2f

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x11d7

    const v10, 0x6b73e19

    xor-int/2addr v5, v10

    const v10, -0x4b50ba4a

    goto/16 :goto_7

    :sswitch_30
    move/from16 v45, v10

    .line 141
    :try_start_11
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x142

    const/16 v10, 0xb

    invoke-static {v1, v5, v10, v4}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v27
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    const-string v1, "\u06e4\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x6843

    const v10, -0x40991a3a

    xor-int/2addr v5, v10

    const v10, 0xf6f7583

    goto/16 :goto_7

    :sswitch_31
    move/from16 v45, v10

    :try_start_12
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x132

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v26
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_5

    const-string v1, "\u06dc\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x77

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x4b07

    const v10, 0x7200d38a

    xor-int/2addr v5, v10

    const v10, 0x73fec54b

    goto/16 :goto_7

    :sswitch_32
    move/from16 v45, v10

    :try_start_13
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x12e

    const/4 v10, 0x4

    invoke-static {v1, v5, v10, v4}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v25
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5

    const-string v1, "\u06eb\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x6d

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x64c7

    const v10, 0x6e1aae

    xor-int/2addr v5, v10

    const v10, 0x79f32e15

    goto/16 :goto_7

    :sswitch_33
    move/from16 v45, v10

    :try_start_14
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x11d

    const/16 v10, 0x11

    invoke-static {v1, v5, v10, v4}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_5

    const-string v1, "\u06da\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x6f

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7491

    const v10, 0x3b10e1a0

    xor-int/2addr v5, v10

    const v10, 0x28703b0f

    goto/16 :goto_7

    :sswitch_34
    move/from16 v45, v10

    :try_start_15
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x10b

    const/16 v10, 0x12

    invoke-static {v1, v5, v10, v4}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v23
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_5

    const-string v1, "\u06ec\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x6767

    const v10, 0xd4eb269

    xor-int/2addr v5, v10

    const v10, 0x253348cb

    goto/16 :goto_7

    :sswitch_35
    move/from16 v45, v10

    .line 131
    :try_start_16
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xfd

    const/16 v10, 0xe

    invoke-static {v1, v5, v10, v4}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5

    const-string v1, "\u06e4\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7681

    const v10, 0x244dda6e

    xor-int/2addr v5, v10

    const v10, 0x2c28ad0

    goto/16 :goto_7

    :sswitch_36
    move/from16 v45, v10

    :try_start_17
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xe9

    const/16 v10, 0x14

    invoke-static {v1, v5, v10, v4}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v21
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_5

    const-string v1, "\u1a77\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x29

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x6819

    const v10, -0x3b630dd5

    xor-int/2addr v5, v10

    const v10, 0x38094a84

    goto/16 :goto_7

    :sswitch_37
    move/from16 v45, v10

    :try_start_18
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xd7

    const/16 v10, 0x12

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v20
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_5

    const-string v1, "\u06e4\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x7365

    const v10, 0x3d280002

    xor-int/2addr v5, v10

    const v10, 0x61b2c2bd

    goto/16 :goto_7

    :sswitch_38
    move/from16 v45, v10

    :try_start_19
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xca

    const/16 v10, 0xd

    invoke-static {v1, v5, v10, v4}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_5

    const-string v1, "\u1a77\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x65

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x49f3

    const v10, 0x38c45e6a

    xor-int/2addr v5, v10

    const v10, 0x29a5e69c

    goto/16 :goto_7

    :sswitch_39
    move/from16 v45, v10

    .line 126
    :try_start_1a
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xc4

    const/4 v10, 0x6

    invoke-static {v1, v5, v10, v4}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v18
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_5

    const-string v1, "\u06e7\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x23

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x6649

    const v10, 0x4c14c6f

    xor-int/2addr v5, v10

    const v10, -0x5b3624a8

    goto/16 :goto_7

    :sswitch_3a
    move/from16 v45, v10

    :try_start_1b
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xb3

    const/16 v10, 0x11

    invoke-static {v1, v5, v10, v4}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v17
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_5

    const-string v1, "\u1a78\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x31

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x3779

    const v10, 0x17af6dc6

    xor-int/2addr v5, v10

    const v10, 0x4eb11f86

    goto/16 :goto_7

    :sswitch_3b
    move/from16 v45, v10

    :try_start_1c
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xa7

    const/16 v10, 0xc

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_5

    const-string v1, "\u06e2\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x4b

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7709

    const v10, -0x2dd6c055

    xor-int/2addr v5, v10

    const v10, -0x55ecca19

    goto/16 :goto_7

    :sswitch_3c
    move/from16 v45, v10

    .line 88
    :try_start_1d
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0xa0

    const/4 v10, 0x7

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_5

    const-string v1, "\u1a76\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0xaad

    const v10, 0x6fd5c949

    xor-int/2addr v5, v10

    const v10, 0x23343ae3

    goto/16 :goto_7

    :sswitch_3d
    move/from16 v45, v10

    .line 121
    :try_start_1e
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x94

    const/16 v10, 0xc

    invoke-static {v1, v5, v10, v4}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_5

    const-string v1, "\u06da\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x151d

    const v10, 0x29d90623

    xor-int/2addr v5, v10

    const v10, -0x77b3872d

    goto/16 :goto_7

    :sswitch_3e
    move/from16 v45, v10

    .line 104
    :try_start_1f
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x83

    const/16 v10, 0x11

    invoke-static {v1, v5, v10, v4}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_5

    const-string v1, "\u06e8\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x6aa5

    const v10, -0xc1b475f

    xor-int/2addr v5, v10

    const v10, 0x33e04b81

    goto/16 :goto_7

    :sswitch_3f
    move/from16 v45, v10

    :try_start_20
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x77

    const/16 v10, 0xc

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_5

    const-string v1, "\u06e8\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x19

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x688d

    const v10, -0x25222d9c

    xor-int/2addr v5, v10

    const v10, -0x19cb10f2

    goto/16 :goto_7

    :sswitch_40
    move/from16 v45, v10

    .line 154
    :try_start_21
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x6e

    const/16 v10, 0x9

    invoke-static {v1, v5, v10, v4}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_5

    const-string v1, "\u06ec\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x49

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x5635

    const v10, 0x778e13e6

    xor-int/2addr v5, v10

    const v10, 0x2c536be3

    goto/16 :goto_7

    :sswitch_41
    move/from16 v45, v10

    .line 99
    :try_start_22
    sget-object v1, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x5e

    const/16 v10, 0x10

    invoke-static {v1, v5, v10, v4}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-static {v2, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_5

    const-string v1, "\u06d6\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x73

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x4215

    const v42, 0x3c1dbd2d

    xor-int v5, v5, v42

    const v42, -0x569dc4a6

    xor-int v42, v1, v42

    move v1, v5

    goto/16 :goto_0

    :sswitch_42
    return-void

    :sswitch_43
    move/from16 v45, v10

    const/high16 v6, 0x4000000

    const-class v7, Ll/ܽ֨ᩳ;

    const/4 v8, 0x1

    const/high16 v9, 0x10000000

    sparse-switch v44, :sswitch_data_1

    goto/16 :goto_9

    :sswitch_44
    const-string v1, "\u1a76\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, -0x13

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x38c9

    const v10, 0x19924c8c

    xor-int/2addr v5, v10

    const v10, 0x2ad623ca

    goto/16 :goto_7

    :sswitch_45
    const-string v1, "\u06dc\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x1d

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x6b0d

    const v10, -0x3d7e869e

    xor-int/2addr v5, v10

    const v10, 0x2036d31a

    goto/16 :goto_7

    :sswitch_46
    const-string v1, "\u06e1\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x2953

    const v10, 0x1cdb9aef

    xor-int/2addr v5, v10

    const v10, 0x548038d7

    goto/16 :goto_7

    :sswitch_47
    const-string v1, "\u073a\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x7d

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x4c1b

    const v10, 0x31297737

    xor-int/2addr v5, v10

    const v10, -0x248675a3

    goto/16 :goto_7

    :sswitch_48
    const-string v1, "\u06ec\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x19cf

    const v10, -0x5d672d2b

    xor-int/2addr v5, v10

    const v10, 0x1d035587

    goto/16 :goto_7

    :sswitch_49
    const-string v1, "\u06ec\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x3779

    const v10, 0x708301ab

    xor-int/2addr v5, v10

    const v10, 0x472190ac

    goto/16 :goto_7

    :sswitch_4a
    const-string v1, "\u06e0\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x19

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0xb43

    const v10, -0x23efe4f0

    xor-int/2addr v5, v10

    const v10, 0x575d336c

    goto/16 :goto_7

    :sswitch_4b
    const-string v1, "\u05a1\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v40, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0xcd

    const v10, -0x4361a9b0

    xor-int/2addr v5, v10

    const v10, -0x2b43b57b

    goto/16 :goto_7

    :sswitch_4c
    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x9

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x5a49

    const v10, -0x4a11828

    xor-int/2addr v5, v10

    const v10, 0x4dabb2f6    # 3.6007904E8f

    goto/16 :goto_7

    :sswitch_4d
    const-string v1, "\u06e4\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x79

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x2f5

    const v10, -0x5fa32867

    xor-int/2addr v5, v10

    const v10, 0x59e255b1

    goto/16 :goto_7

    :sswitch_4e
    const-string v1, "\u06e2\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x4f6d

    const v10, -0x47ed5327

    xor-int/2addr v5, v10

    const v10, -0x5faccedf

    goto/16 :goto_7

    :sswitch_4f
    const-string v1, "\u1a73\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7db1

    const v10, 0xda85766

    xor-int/2addr v5, v10

    const v10, 0x152d1631

    goto/16 :goto_7

    :sswitch_50
    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x6ae3

    const v10, 0x7c74e673

    xor-int/2addr v5, v10

    const v10, -0x20eaebb4

    goto/16 :goto_7

    :sswitch_51
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x49

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x7af9

    const v10, -0x56d04300

    xor-int/2addr v5, v10

    const v10, 0x502e16bc

    goto/16 :goto_7

    :sswitch_52
    const-string v1, "\u1a77\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, -0x11

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x7325

    const v10, 0xcbb8618

    xor-int/2addr v5, v10

    const v10, 0x32e2a4dc

    goto/16 :goto_7

    :sswitch_53
    const-string v1, "\u06d9\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0xe6b

    const v10, 0x7a131ee1

    xor-int/2addr v5, v10

    const v10, 0x2e1e412f

    goto/16 :goto_7

    :sswitch_54
    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x7b

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x3b47

    const v10, 0x1955cc80

    xor-int/2addr v5, v10

    const v10, 0x2b2767a6

    goto/16 :goto_7

    :sswitch_55
    const-string v1, "\u05a1\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x3823

    const v10, -0x74212b4c

    xor-int/2addr v5, v10

    const v10, 0x37628269

    goto/16 :goto_7

    :sswitch_56
    const-string v1, "\u0730\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v40

    mul-int/lit8 v1, v1, -0x57

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x5615

    const v10, -0x6c536ffd

    xor-int/2addr v5, v10

    const v10, 0x251b1e9b

    goto/16 :goto_7

    :sswitch_57
    const-string v1, "\u06dc\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x6e0b

    const v10, 0x397d2a9f

    xor-int/2addr v5, v10

    const v10, -0x46e97be8

    goto/16 :goto_7

    :sswitch_58
    const-string v1, "\u1a76\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x6de5

    const v10, 0x148547f

    xor-int/2addr v5, v10

    const v10, 0x2f128bbd

    goto/16 :goto_7

    :sswitch_59
    const-string v1, "\u05a8\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x61

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x31a5

    const v10, 0x526a35a6

    xor-int/2addr v5, v10

    const v10, -0x258689ad

    goto/16 :goto_7

    :sswitch_5a
    const-string v1, "\u073f\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    mul-int/lit8 v1, v1, 0x5b

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, -0x2545

    const v10, -0x4d1b4399

    xor-int/2addr v5, v10

    const v10, 0x2b44f12e

    goto/16 :goto_7

    :sswitch_5b
    const-string v1, "\u06d8\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x3197

    const v10, 0x3d121c2b

    xor-int/2addr v5, v10

    const v10, -0xb783b35

    goto/16 :goto_7

    :sswitch_5c
    const-string v1, "\u05a8\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, -0x39bb

    const v10, -0x4c5ce1fc

    xor-int/2addr v5, v10

    const v10, -0x1e167675

    goto :goto_7

    :sswitch_5d
    move/from16 v45, v10

    .line 79
    :try_start_23
    invoke-static/range {p0 .. p0}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_5

    const-string v1, "\u073f\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0x4efd

    const v10, 0xa064db

    xor-int/2addr v5, v10

    const v10, -0x27a2b5b8

    goto :goto_7

    :sswitch_5e
    move/from16 v45, v10

    .line 82
    :try_start_24
    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v44
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_5

    const-string v1, "\u06e7\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x3af9

    const v10, 0x166ca604

    xor-int/2addr v5, v10

    const v10, -0x1161c357

    goto :goto_7

    :sswitch_5f
    move/from16 v45, v10

    if-eqz v38, :cond_2

    const-string v1, "\u06d7\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v40

    xor-int v5, v1, v41

    mul-int/lit16 v5, v5, 0xd5

    const v10, 0x5238f56b

    xor-int/2addr v5, v10

    const v10, 0x7fd04b51

    goto :goto_7

    :cond_2
    const-string v1, "\u06e2\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v5, v1, v40

    mul-int/lit16 v5, v5, 0x68e9

    const v10, 0x2a657032

    xor-int/2addr v5, v10

    const v10, 0x24426c3e

    :goto_7
    xor-int v42, v1, v10

    goto :goto_8

    .line 160
    :sswitch_60
    invoke-static/range {p0 .. p0}, Ll/֨۫;->֫ۗۗ(Ljava/lang/Object;)V

    return-void

    :sswitch_61
    move/from16 v45, v10

    .line 75
    :try_start_25
    invoke-static/range {p0 .. p0}, Ll/ۘ᩶;->ܶۖۘ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v1
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_5

    :try_start_26
    sget-object v5, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v10, 0x51

    const/16 v0, 0x9

    invoke-static {v5, v10, v0, v4}, Ll/ۘܿ;->ۢۙۨ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-static {v1, v0}, Ll/֫᩵;->ܶܰۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v5, 0x5a

    const/4 v10, 0x4

    invoke-static {v0, v5, v10, v4}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-static {v1, v0}, Ll/֫᩵;->ܶܰۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 78
    invoke-static {v2}, Ll/֨۟;->ۤ᩺᩵(Ljava/lang/Object;)Z

    move-result v38
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_4

    const-string v0, "\u06e0\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v40

    mul-int/lit8 v0, v0, 0x3

    xor-int v5, v0, v41

    mul-int/lit16 v5, v5, 0x29eb

    const v10, 0x30a29f65

    xor-int/2addr v5, v10

    const v10, -0x429f85df

    xor-int v42, v0, v10

    move-object/from16 v0, p0

    move-object/from16 v43, v1

    :goto_8
    move v1, v5

    goto/16 :goto_c

    :catch_4
    move-object/from16 v43, v1

    :catch_5
    :goto_9
    const-string v0, "\u06d6\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v41

    mul-int/lit8 v0, v0, -0x4d

    xor-int v1, v0, v40

    mul-int/lit16 v1, v1, -0x41bd

    const v5, 0x33416aef

    xor-int/2addr v1, v5

    const v5, -0x6a5560bb

    goto :goto_b

    :sswitch_62
    move/from16 v45, v10

    .line 73
    invoke-super/range {p0 .. p1}, Ll/֫᩹᩷;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "\u06ec\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v41

    xor-int v1, v0, v40

    mul-int/lit16 v1, v1, 0x6091

    const v5, 0x3c89e885

    xor-int/2addr v1, v5

    const v5, -0x530e21c8

    goto :goto_b

    :sswitch_63
    move/from16 v45, v10

    const/16 v0, 0x7df7

    const/16 v4, 0x7df7

    goto :goto_a

    :sswitch_64
    move/from16 v45, v10

    const v0, 0xab69

    const v4, 0xab69

    :goto_a
    const-string v0, "\u1a73\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v40

    xor-int v1, v0, v41

    mul-int/lit16 v1, v1, -0x266d

    const v5, -0x2dcdaa74

    xor-int/2addr v1, v5

    const v5, 0x46913919

    goto :goto_b

    :sswitch_65
    move/from16 v45, v10

    sget-object v0, Lbin/mt/plus/ShortcutActivity;->ۚ֡᩺:[S

    const/16 v1, 0x50

    aget-short v0, v0, v1

    mul-int/lit16 v1, v0, 0x23e0

    add-int/lit16 v0, v0, 0x8f8

    mul-int v0, v0, v0

    sub-int/2addr v0, v1

    if-ltz v0, :cond_3

    const-string v0, "\u1a79\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v41

    xor-int v1, v0, v40

    mul-int/lit16 v1, v1, 0x5689

    const v5, 0x7dcd6b6f

    xor-int/2addr v1, v5

    const v5, 0x581ec575

    :goto_b
    xor-int v42, v0, v5

    move-object/from16 v0, p0

    :goto_c
    move/from16 v10, v45

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06df\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v40

    xor-int v1, v0, v41

    mul-int/lit16 v1, v1, 0x1251

    const v5, -0x4856c36c

    xor-int/2addr v1, v5

    const v5, -0x60c0f322

    goto :goto_b

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ea98375 -> :sswitch_23
        -0x7cb6fe57 -> :sswitch_8
        -0x7c075dfc -> :sswitch_2
        -0x7ae5392e -> :sswitch_4
        -0x7a629687 -> :sswitch_65
        -0x78489f5a -> :sswitch_35
        -0x75431ba2 -> :sswitch_e
        -0x74c9aa36 -> :sswitch_35
        -0x7381f655 -> :sswitch_42
        -0x71f864de -> :sswitch_29
        -0x6e4c2977 -> :sswitch_9
        -0x6d50ed08 -> :sswitch_2e
        -0x6cb09e2a -> :sswitch_2b
        -0x6c0e0c52 -> :sswitch_6
        -0x6bb82000 -> :sswitch_34
        -0x6b49a54f -> :sswitch_2c
        -0x6aca207e -> :sswitch_1f
        -0x69dd129f -> :sswitch_36
        -0x64113a28 -> :sswitch_1b
        -0x61af52f6 -> :sswitch_43
        -0x5f5b71a2 -> :sswitch_40
        -0x5d895643 -> :sswitch_40
        -0x59649e73 -> :sswitch_6
        -0x594f4866 -> :sswitch_61
        -0x5587fc53 -> :sswitch_1a
        -0x5365c087 -> :sswitch_64
        -0x52b00a9d -> :sswitch_c
        -0x4e3b45db -> :sswitch_32
        -0x4c5973d4 -> :sswitch_2e
        -0x4c47366b -> :sswitch_2f
        -0x4ba11d72 -> :sswitch_3a
        -0x46a88f71 -> :sswitch_4
        -0x428e62e7 -> :sswitch_2d
        -0x427749c0 -> :sswitch_0
        -0x4230861b -> :sswitch_1e
        -0x421aaae2 -> :sswitch_12
        -0x41730755 -> :sswitch_2a
        -0x3c33ac1c -> :sswitch_3f
        -0x3c1a7490 -> :sswitch_3a
        -0x3bc8229c -> :sswitch_3c
        -0x3b9ef744 -> :sswitch_30
        -0x3b4d8e6e -> :sswitch_17
        -0x3abf203b -> :sswitch_17
        -0x3ab7b373 -> :sswitch_30
        -0x39da963d -> :sswitch_10
        -0x36c4eb18 -> :sswitch_13
        -0x367585c8 -> :sswitch_b
        -0x34e38db5 -> :sswitch_63
        -0x33c09e76 -> :sswitch_29
        -0x32b50cf0 -> :sswitch_1a
        -0x31664ff6 -> :sswitch_3e
        -0x2f3a8ebe -> :sswitch_5e
        -0x2f272451 -> :sswitch_5d
        -0x2e565b4e -> :sswitch_16
        -0x2dccbc3f -> :sswitch_22
        -0x2af895bc -> :sswitch_31
        -0x27801720 -> :sswitch_19
        -0x247ac25c -> :sswitch_f
        -0x246ce3cd -> :sswitch_5e
        -0x244f9ae5 -> :sswitch_38
        -0x23bc81ab -> :sswitch_10
        -0x2161038c -> :sswitch_e
        -0x1d91947b -> :sswitch_64
        -0x1d89ebdf -> :sswitch_39
        -0x1c43dc66 -> :sswitch_c
        -0x19aca7b3 -> :sswitch_27
        -0x18bdbe7a -> :sswitch_60
        -0x16972f9a -> :sswitch_0
        -0x14b1e8d9 -> :sswitch_2a
        -0x1348fcef -> :sswitch_65
        -0xe363a27 -> :sswitch_37
        -0x9ba680f -> :sswitch_1d
        -0x7bd2c3e -> :sswitch_28
        -0x7053c2b -> :sswitch_27
        -0x4a6cc15 -> :sswitch_33
        -0x417975f -> :sswitch_18
        -0x210711d -> :sswitch_24
        -0x85647c -> :sswitch_34
        -0x5b0825 -> :sswitch_15
        0xa340c1 -> :sswitch_2c
        0x7d9cf9f -> :sswitch_d
        0x8d7d442 -> :sswitch_62
        0x8e10812 -> :sswitch_13
        0x9868936 -> :sswitch_23
        0x11b5dc0f -> :sswitch_5
        0x12b1d349 -> :sswitch_62
        0x1366e036 -> :sswitch_14
        0x15224a27 -> :sswitch_63
        0x156e81ab -> :sswitch_41
        0x1717318f -> :sswitch_31
        0x1a192190 -> :sswitch_43
        0x1af3a9f2 -> :sswitch_20
        0x1ca60b23 -> :sswitch_25
        0x1eb4e570 -> :sswitch_8
        0x23479b88 -> :sswitch_33
        0x24105c74 -> :sswitch_21
        0x26a534e6 -> :sswitch_b
        0x2af4ed05 -> :sswitch_26
        0x2bf33586 -> :sswitch_5d
        0x2d44c4af -> :sswitch_a
        0x2dc468f9 -> :sswitch_28
        0x2f4c6b2c -> :sswitch_1b
        0x304504f1 -> :sswitch_2d
        0x31bd4c2e -> :sswitch_19
        0x32592589 -> :sswitch_1d
        0x339a7f7d -> :sswitch_5f
        0x358748d1 -> :sswitch_7
        0x36e00b0b -> :sswitch_2b
        0x3732507f -> :sswitch_2
        0x37f9b858 -> :sswitch_1f
        0x398f972b -> :sswitch_11
        0x39abb5fb -> :sswitch_37
        0x3a5e15a0 -> :sswitch_14
        0x3b25d495 -> :sswitch_5
        0x410a1302 -> :sswitch_5f
        0x425f4f2e -> :sswitch_16
        0x428e3c4d -> :sswitch_3b
        0x45e370ba -> :sswitch_1
        0x463f2667 -> :sswitch_3b
        0x47ad4cfe -> :sswitch_3f
        0x4d3d8ae6 -> :sswitch_18
        0x4d590ce5 -> :sswitch_f
        0x4d919e7d -> :sswitch_3c
        0x4fba56c1 -> :sswitch_20
        0x51b93acf -> :sswitch_36
        0x5631e7b9 -> :sswitch_39
        0x5876c206 -> :sswitch_61
        0x58ab3c2f -> :sswitch_3
        0x5a57d766 -> :sswitch_15
        0x5b8f313c -> :sswitch_3
        0x5ba8b39c -> :sswitch_41
        0x5f55fb9a -> :sswitch_1e
        0x603dfcec -> :sswitch_21
        0x60cdbe43 -> :sswitch_2f
        0x62af6ec4 -> :sswitch_32
        0x63019199 -> :sswitch_a
        0x658d6eb5 -> :sswitch_60
        0x67666a8b -> :sswitch_3d
        0x67c3334e -> :sswitch_26
        0x696a34cf -> :sswitch_11
        0x6bfb5abf -> :sswitch_1c
        0x6eeaa6a6 -> :sswitch_42
        0x6f4ccd13 -> :sswitch_7
        0x71103138 -> :sswitch_1c
        0x77142dbe -> :sswitch_d
        0x7714a5f0 -> :sswitch_24
        0x79951fad -> :sswitch_12
        0x7a3d0bd8 -> :sswitch_38
        0x7a80ff5e -> :sswitch_1
        0x7b32614a -> :sswitch_3d
        0x7c3d1298 -> :sswitch_22
        0x7ccb6276 -> :sswitch_25
        0x7d2d215a -> :sswitch_3e
        0x7de91fad -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x7e8485e5 -> :sswitch_5c
        -0x71f9d0f0 -> :sswitch_5b
        -0x68b6a4cc -> :sswitch_5a
        -0x5a081a62 -> :sswitch_59
        -0x53fe9d70 -> :sswitch_58
        -0x4b4b8bd8 -> :sswitch_57
        -0x48425cb3 -> :sswitch_56
        -0x42b42fb3 -> :sswitch_55
        -0x4169f0ae -> :sswitch_54
        -0x2ed608ef -> :sswitch_53
        -0x27c93fab -> :sswitch_52
        -0x235ea166 -> :sswitch_51
        -0x2162256e -> :sswitch_50
        -0x1c452636 -> :sswitch_4f
        -0xe96ba94 -> :sswitch_4e
        0x308163 -> :sswitch_4d
        0x17cc60a -> :sswitch_4c
        0x219ed87 -> :sswitch_4b
        0x23178ff3 -> :sswitch_4a
        0x2371f7dc -> :sswitch_49
        0x3e118557 -> :sswitch_48
        0x61697b6b -> :sswitch_47
        0x6696ba18 -> :sswitch_46
        0x6dca5a6e -> :sswitch_45
        0x7e226158 -> :sswitch_44
    .end sparse-switch
.end method
