.class public final Ll/۬ۚ᩷;
.super Ll/۬ᩴܺ;
.source "UAQE"


# static fields
.field private static final ܰܳۨ:[S


# instance fields
.field public final ֫:Ljava/io/InputStream;

.field public final ۧ:J

.field public final ܽ:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۚ᩷;->ܰܳۨ:[S

    return-void

    :array_0
    .array-data 2
        0x21c8s
        0x739es
        0x7399s
        0x7382s
        0x73d0s
        0x7382s
        0x7398s
        0x73d0s
        0x7387s
        0x738es
        0x7385s
        0x738cs
        0x739fs
        0x7383s
        0x73d0s
        0x73b0s
        0x73b6s
        0x73d6s
        0x73c7s
        0x73cbs
    .end array-data
.end method

.method public constructor <init>(Landroid/net/Uri;Ljava/io/InputStream;J)V
    .locals 0

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬ۚ᩷;->ܽ:Landroid/net/Uri;

    iput-object p2, p0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    iput-wide p3, p0, Ll/۬ۚ᩷;->ۧ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ۚ᩷;)Ljava/io/InputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬ۚ᩷;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ۚ᩷;->ܽ:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const v3, -0x6ba59ea3

    sget v4, Ll/ۛ;->᩺᩻֫:I

    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v6, "\u06d9\u06da"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4df5

    const v8, -0x175f1252

    xor-int/2addr v7, v8

    const v8, 0x4ce6f23c    # 1.21082336E8f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x5b45

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 109
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 p1, 0x0

    return p1

    .line 131
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v6

    if-gtz v6, :cond_9

    goto/16 :goto_3

    .line 166
    :sswitch_1
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v6, Ll/֡۬;->۠֡᩶:I

    if-lez v6, :cond_c

    goto/16 :goto_1

    .line 163
    :sswitch_2
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v6, :cond_4

    goto/16 :goto_1

    .line 194
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    goto/16 :goto_1

    :sswitch_4
    const/4 p1, 0x1

    return p1

    .line 198
    :sswitch_5
    iget-object v6, p0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    iget-object v7, v0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    invoke-static {v6, v7}, Ll/ۘۘ;->ܺ᩻ۛ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u06d7\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xe93

    const v8, 0x19fe6377

    xor-int/2addr v7, v8

    const v8, 0x2bf875aa

    goto :goto_0

    :sswitch_6
    iget-object v6, p0, Ll/۬ۚ᩷;->ܽ:Landroid/net/Uri;

    iget-object v7, v0, Ll/۬ۚ᩷;->ܽ:Landroid/net/Uri;

    invoke-static {v6, v7}, Ll/ۘۘ;->ܺ᩻ۛ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string v6, "\u0733\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6fd1

    const v8, -0x74046b5b

    xor-int/2addr v7, v8

    const v8, 0x1ec71c15

    goto :goto_0

    :sswitch_7
    iget-wide v6, v0, Ll/۬ۚ᩷;->ۧ:J

    cmp-long v8, v1, v6

    if-nez v8, :cond_1

    const-string v6, "\u073d\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5f3d

    const v8, -0x7b79fd8e

    xor-int/2addr v7, v8

    const v8, 0x5c40b808

    goto/16 :goto_0

    :sswitch_8
    move-object v0, p1

    check-cast v0, Ll/۬ۚ᩷;

    iget-wide v1, p0, Ll/۬ۚ᩷;->ۧ:J

    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v6, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v6, "\u1a74\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x29

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xd3b

    const v8, -0x6c2707e0

    xor-int/2addr v7, v8

    const v8, -0x24a62c40

    goto/16 :goto_0

    :sswitch_9
    const/4 p1, 0x0

    return p1

    :sswitch_a
    instance-of v6, p1, Ll/۬ۚ᩷;

    if-eqz v6, :cond_1

    const-string v6, "\u06d6\u1a74"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xa6f

    const v8, -0xcd9a1b4

    xor-int/2addr v7, v8

    const v8, 0x33f62933

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u05a8\u06e2"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1a5b

    const v8, -0xf7fcbdb

    xor-int/2addr v7, v8

    const v8, -0x274f4875

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v6, "\u1a7b\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xd

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4339

    const v8, 0x56fd1b19

    xor-int/2addr v7, v8

    const v8, -0x3581f5d2    # -4162187.5f

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v6, "\u1a7a\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4427

    const v8, 0x81e1236

    xor-int/2addr v7, v8

    const v8, 0x3c99679b

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_5

    :cond_4
    const-string v6, "\u06d6\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7e55

    const v8, -0x7158849f

    xor-int/2addr v7, v8

    const v8, -0x756fff1d

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u1a7b\u1a78"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2847

    const v8, -0x16272b29

    xor-int/2addr v7, v8

    const v8, 0x520ed984

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_1

    :cond_6
    const-string v6, "\u06d6\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7b51

    const v8, 0x2d9789d3

    xor-int/2addr v7, v8

    const v8, -0x630cf594

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v6

    if-nez v6, :cond_7

    :goto_1
    const-string v6, "\u1a78\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x53

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x63e9

    const v8, -0x2f4cb6d3

    xor-int/2addr v7, v8

    const v8, 0x2971e858

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u073d\u06e0"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x9

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7607

    const v8, -0x2b2fd313

    xor-int/2addr v7, v8

    const v8, 0x39356624

    goto/16 :goto_0

    .line 141
    :sswitch_10
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_8

    :goto_2
    const-string v6, "\u1a74\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x37

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1553

    const v8, 0x20116de7

    xor-int/2addr v7, v8

    const v8, 0x672e790a

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a7a\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x537f

    const v8, -0x59426fec

    xor-int/2addr v7, v8

    const v8, -0x58d4d2e2

    goto/16 :goto_0

    .line 40
    :sswitch_11
    sget v6, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v6, :cond_a

    :cond_9
    const-string v6, "\u1a74\u073a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2949

    const v8, -0x26a27c92

    xor-int/2addr v7, v8

    const v8, 0x24bb08ec

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a78\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5d97

    const v8, 0x4218bb4e

    xor-int/2addr v7, v8

    const v8, -0x7f245f77

    goto/16 :goto_0

    :sswitch_12
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_b

    goto :goto_3

    :cond_b
    const-string v6, "\u06e7\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x78ed

    const v8, 0x60b0434e

    xor-int/2addr v7, v8

    const v8, 0x702211b6

    goto/16 :goto_0

    .line 166
    :sswitch_13
    sget v6, Ll/ۛ;->᩺᩻֫:I

    if-ltz v6, :cond_d

    :cond_c
    :goto_3
    const-string v6, "\u06eb\u06da"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x8ed

    const v8, 0x337a3a9a

    xor-int/2addr v7, v8

    const v8, -0x33b619b2    # -5.2926776E7f

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e0\u06ec"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1867

    const v8, 0x25bf54f

    xor-int/2addr v7, v8

    const v8, 0x482de8bf

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d3622bf -> :sswitch_3
        -0x6c8241ee -> :sswitch_c
        -0x6c5f270a -> :sswitch_d
        -0x68ebbbd7 -> :sswitch_12
        -0x5bd9080a -> :sswitch_10
        -0x597f5689 -> :sswitch_4
        -0x563fc93d -> :sswitch_1
        -0x4fc2c39a -> :sswitch_0
        -0x42086511 -> :sswitch_13
        -0x3ff56aa2 -> :sswitch_e
        -0x3e249f05 -> :sswitch_a
        -0x3483cd03 -> :sswitch_11
        -0x2ec7a49b -> :sswitch_6
        -0x2e528397 -> :sswitch_b
        -0x29f7a26b -> :sswitch_1
        -0x2635ac3b -> :sswitch_6
        -0x213e18c6 -> :sswitch_8
        -0x208a6c50 -> :sswitch_c
        -0x1c353d92 -> :sswitch_12
        -0x12c3453e -> :sswitch_4
        -0x2a53082 -> :sswitch_11
        0xab1e23 -> :sswitch_f
        0x4e9f20b -> :sswitch_3
        0xb806569 -> :sswitch_9
        0x24787391 -> :sswitch_2
        0x2a506748 -> :sswitch_f
        0x3292a816 -> :sswitch_8
        0x38735fc3 -> :sswitch_7
        0x3a0abbc2 -> :sswitch_b
        0x41313e68 -> :sswitch_2
        0x4a38c024 -> :sswitch_13
        0x55c804d8 -> :sswitch_9
        0x6caa6f3e -> :sswitch_a
        0x6defbaed -> :sswitch_10
        0x6ee009ea -> :sswitch_0
        0x6fb7d7d9 -> :sswitch_5
        0x70867cc9 -> :sswitch_5
        0x71c4c45f -> :sswitch_d
        0x76b1c276 -> :sswitch_e
        0x7cedbd69 -> :sswitch_7
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 21

    move-object/from16 v0, p0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v14, 0x11591cfd

    sget v15, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v16, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v17, "\u06da\u06db"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, -0xe35

    const v19, -0x3139de0c

    xor-int v1, v1, v19

    const v19, -0x15d5dfba

    xor-int v17, v17, v19

    const/16 v18, 0x0

    :goto_0
    xor-int v14, v14, v16

    mul-int/lit16 v14, v14, -0x530b

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v1, v14

    xor-int v14, v17, v1

    sparse-switch v14, :sswitch_data_0

    .line 198
    invoke-static {v13}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    return v1

    .line 151
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_0

    goto :goto_1

    :cond_0
    move/from16 v17, v14

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_1

    move/from16 v17, v14

    goto/16 :goto_2

    :cond_1
    :goto_1
    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    move/from16 v17, v14

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, -0x7c0b

    const v19, -0x29e53e82

    xor-int v14, v14, v19

    const v19, -0x88cf97f

    goto/16 :goto_6

    :sswitch_2
    move/from16 v17, v14

    .line 88
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_2

    :sswitch_3
    move/from16 v17, v14

    .line 77
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto :goto_2

    .line 105
    :sswitch_4
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    move/from16 v17, v14

    mul-int v12, v10, v11

    .line 198
    iget-object v13, v0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    .line 105
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x1f

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x38d7

    const v19, -0x1a715114

    xor-int v14, v14, v19

    const v19, -0x5fc13cba

    goto/16 :goto_6

    :sswitch_6
    move/from16 v17, v14

    const/16 v11, 0x1f

    .line 53
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v1

    if-gtz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06da\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x45

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x45b3

    const v19, -0x7787bca0

    xor-int v14, v14, v19

    const v19, 0x502a6d77

    goto/16 :goto_6

    :sswitch_7
    move/from16 v17, v14

    add-int v10, v9, v8

    .line 12
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v1

    if-ltz v1, :cond_4

    :goto_2
    const-string v1, "\u1a73\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x4bd9

    const v19, -0x59187ba4

    xor-int v14, v14, v19

    const v19, -0x3f09315a

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u073a\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit8 v14, v14, 0x59

    const v19, 0x20c2973f

    xor-int v14, v14, v19

    const v19, -0x5b18df5b

    goto/16 :goto_6

    :sswitch_8
    move/from16 v17, v14

    .line 198
    iget-object v1, v0, Ll/۬ۚ᩷;->ܽ:Landroid/net/Uri;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v9

    .line 83
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u1a74\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, -0x2475

    const v19, 0xe305e6

    xor-int v14, v14, v19

    const v19, 0xc59e3b2

    goto/16 :goto_6

    :sswitch_9
    move/from16 v17, v14

    mul-int v8, v6, v7

    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a79\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x71

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x61cb

    const v19, -0x16b3ceec

    xor-int v14, v14, v19

    const v19, -0x34d473c0    # -1.124256E7f

    goto/16 :goto_6

    :sswitch_a
    move/from16 v17, v14

    long-to-int v6, v4

    const/16 v7, 0x1f

    .line 18
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u1a79\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, -0x13b

    const v19, 0x94563a2

    xor-int v14, v14, v19

    const v19, -0x3bd1989b

    goto/16 :goto_6

    :sswitch_b
    move/from16 v17, v14

    ushr-long v4, v2, v18

    xor-long/2addr v4, v2

    .line 191
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_8

    :goto_3
    const-string v1, "\u06e8\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x5a83

    const v19, -0x7e16ddff

    xor-int v14, v14, v19

    const v19, 0x676a370

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u1a7a\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, -0x1f63

    const v19, -0xf3cda2a

    xor-int v14, v14, v19

    const v19, -0x3a0109

    goto/16 :goto_6

    :sswitch_c
    move/from16 v17, v14

    .line 0
    iget-wide v2, v0, Ll/۬ۚ᩷;->ۧ:J

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_9

    :goto_4
    const-string v1, "\u1a78\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x6b

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x2bc3

    const v19, -0x75abd350

    xor-int v14, v14, v19

    const v19, -0x3bd3e51f

    goto :goto_6

    :cond_9
    const-string v1, "\u1a7a\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x5

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0x7551

    const v19, -0x591e682f

    xor-int v14, v14, v19

    const v19, 0x3b27234f

    goto :goto_6

    :sswitch_d
    move/from16 v17, v14

    .line 22
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u06e2\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, 0xac3

    const v19, -0x215ad51

    xor-int v14, v14, v19

    const v19, -0x238f6a0d

    goto :goto_6

    :sswitch_e
    move/from16 v17, v14

    const/16 v18, 0x20

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_5
    const-string v1, "\u06e0\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x61

    xor-int v14, v1, v15

    mul-int/lit16 v14, v14, -0xda7

    const v19, 0x6413ce5d

    xor-int v14, v14, v19

    const v19, 0x70950c0a

    goto :goto_6

    :cond_c
    const-string v1, "\u06e2\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v14, v1, v16

    mul-int/lit16 v14, v14, 0x3493

    const v19, -0x2f43f0a6

    xor-int v14, v14, v19

    const v19, 0x925ea19

    :goto_6
    xor-int v1, v1, v19

    move/from16 v20, v17

    move/from16 v17, v1

    move v1, v14

    move/from16 v14, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e91fba2 -> :sswitch_c
        -0x744dbd33 -> :sswitch_3
        -0x686a5f5a -> :sswitch_0
        -0x675dba5f -> :sswitch_e
        -0x6739168f -> :sswitch_d
        -0x6087a110 -> :sswitch_b
        -0x5be938c3 -> :sswitch_8
        -0x5726c2a4 -> :sswitch_7
        -0x3fafb540 -> :sswitch_1
        -0x3cd3933b -> :sswitch_1
        -0x2c8670bb -> :sswitch_7
        -0x37acb8a -> :sswitch_3
        0x1b02e5a -> :sswitch_d
        0x31bb0a6 -> :sswitch_0
        0x3531fb5 -> :sswitch_c
        0x7794f31 -> :sswitch_9
        0xf644304 -> :sswitch_b
        0x1197a20f -> :sswitch_4
        0x1b0e0b34 -> :sswitch_9
        0x1bfa5da7 -> :sswitch_5
        0x28536c97 -> :sswitch_2
        0x2f878b85 -> :sswitch_2
        0x350418b3 -> :sswitch_6
        0x4957b882 -> :sswitch_a
        0x50908d52 -> :sswitch_8
        0x51162b48 -> :sswitch_4
        0x6e251a6c -> :sswitch_a
        0x74bf7eee -> :sswitch_5
        0x7520cac1 -> :sswitch_6
        0x7bc9242d -> :sswitch_e
    .end sparse-switch
.end method

.method public final length()J
    .locals 2

    .line 198
    iget-wide v0, p0, Ll/۬ۚ᩷;->ۧ:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 32

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

    const v25, -0x76f41783

    sget v26, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v27, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v28, "\u06e0\u1a75"

    invoke-static/range {v28 .. v28}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v28

    add-int v28, v28, v26

    mul-int/lit8 v28, v28, -0x5f

    xor-int v1, v28, v27

    mul-int/lit16 v1, v1, 0x4d71

    const v30, -0x33648245    # -8.1522136E7f

    xor-int v1, v1, v30

    const v30, -0x6ed7e404

    xor-int v28, v28, v30

    move-object/from16 v21, v6

    move-object/from16 v16, v12

    move-object/from16 v22, v17

    move-object/from16 v14, v18

    move-object/from16 v2, v20

    move-object/from16 v13, v23

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    :goto_0
    xor-int v4, v25, v27

    mul-int/lit16 v4, v4, -0x335d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v25, v28, v1

    sparse-switch v25, :sswitch_data_0

    move-object/from16 v28, v14

    .line 198
    invoke-static {v8, v10}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-object v1, v3, v9

    invoke-static {v8, v1}, Ll/ۘۛ;->ܺ᩸ᩳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v1, v11

    sub-int/2addr v1, v5

    if-eq v9, v1, :cond_3

    const-string v1, "\u1a78\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v27

    mul-int/lit8 v1, v1, 0x33

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, -0xa9f

    const v14, 0x2e6dda25

    xor-int/2addr v4, v14

    const v14, 0x43e5b909

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v1, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    goto/16 :goto_9

    :cond_1
    move-object/from16 v28, v14

    goto/16 :goto_4

    .line 72
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v1, Ll/᩺;->ۙۛܶ:I

    if-lez v1, :cond_0

    :goto_1
    move-object v4, v14

    move/from16 v1, v18

    move-object/from16 v14, v23

    goto/16 :goto_15

    .line 175
    :sswitch_2
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    move/from16 v0, v18

    move/from16 v18, v20

    goto/16 :goto_d

    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    goto :goto_1

    .line 19
    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const/4 v0, 0x0

    return-object v0

    .line 198
    :sswitch_5
    sget-object v1, Ll/۬ۚ᩷;->ܰܳۨ:[S

    const/16 v4, 0x12

    move-object/from16 v28, v14

    const/4 v14, 0x2

    invoke-static {v1, v4, v14, v12}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_2

    :sswitch_6
    move-object/from16 v28, v14

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v4, v28

    goto/16 :goto_6

    :cond_3
    :goto_2
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    mul-int/lit8 v1, v1, 0x27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, -0x3543

    const v14, 0x3fa7d499

    xor-int/2addr v4, v14

    const v14, -0xba2cc74

    goto/16 :goto_5

    :sswitch_7
    move-object/from16 v28, v14

    const/4 v1, 0x1

    invoke-static {v13, v7, v1, v12}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v10

    .line 16
    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_4

    move-object/from16 v14, v23

    move/from16 v1, v24

    move-object/from16 v4, v28

    :goto_3
    move/from16 v24, v0

    move-object/from16 v23, v2

    move-object/from16 v0, p0

    goto/16 :goto_b

    :cond_4
    const-string v1, "\u1a7a\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v26

    mul-int/lit8 v1, v1, -0x4d

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, 0x6d03

    const v14, 0x7179e1f4

    xor-int/2addr v4, v14

    const v14, -0xd4272f3

    goto/16 :goto_5

    :sswitch_8
    move-object/from16 v28, v14

    .line 198
    aget-object v1, v11, v9

    invoke-static {v8, v1}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v13, Ll/۬ۚ᩷;->ܰܳۨ:[S

    const/16 v7, 0x11

    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_5

    :goto_4
    const-string v1, "\u1a73\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v27

    mul-int/lit8 v1, v1, -0x65

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, -0x6139

    const v14, 0xa604216

    xor-int/2addr v4, v14

    const v14, -0x72123716

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x3a39

    const v14, 0x47940ff9

    xor-int/2addr v4, v14

    const v14, -0x6844d366

    goto :goto_5

    :sswitch_9
    invoke-static {v2, v0, v6, v12}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_a
    move-object/from16 v28, v14

    sget-object v2, Ll/۬ۚ᩷;->ܰܳۨ:[S

    const/16 v0, 0x10

    const/4 v6, 0x1

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_6

    move/from16 v1, v18

    move-object/from16 v14, v23

    move-object/from16 v4, v28

    goto/16 :goto_15

    :cond_6
    const-string v1, "\u06e8\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x74b

    const v14, -0x402dd1

    xor-int/2addr v4, v14

    const v14, -0x30687901

    goto :goto_5

    :sswitch_b
    move-object/from16 v28, v14

    array-length v1, v11

    if-ge v9, v1, :cond_7

    const-string v1, "\u1a73\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, 0x2b

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, -0x619d

    const v14, -0x5ad222ed

    xor-int/2addr v4, v14

    const v14, 0x5e43e4ce

    goto :goto_5

    :cond_7
    const-string v1, "\u06d6\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v26, v1

    mul-int/lit8 v1, v1, -0x37

    xor-int v4, v1, v27

    mul-int/lit16 v4, v4, 0x295d

    const v14, -0xad0a8c5

    xor-int/2addr v4, v14

    const v14, -0x4fed1487

    :goto_5
    xor-int/2addr v1, v14

    move-object/from16 v14, v28

    move/from16 v28, v1

    goto :goto_7

    :sswitch_c
    move-object/from16 v28, v14

    const/4 v1, 0x1

    move-object/from16 v4, v28

    invoke-static {v4, v15, v1, v12}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    const-class v9, Ll/۬ۚ᩷;

    invoke-static {v9, v8, v1}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    move/from16 v9, v24

    :goto_6
    const-string v1, "\u06e0\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v14, v1, v27

    mul-int/lit16 v14, v14, 0x30d1

    const v28, 0x1977d69a

    xor-int v14, v14, v28

    const v28, -0x101dd32d    # -1.399956E29f

    xor-int v28, v1, v28

    move v1, v14

    goto/16 :goto_13

    .line 198
    :sswitch_d
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Ll/۬ۚ᩷;->ܰܳۨ:[S

    const/16 v15, 0xf

    .line 45
    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_8

    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v1, v24

    goto/16 :goto_3

    :cond_8
    const-string v1, "\u06d9\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    xor-int v4, v1, v26

    mul-int/lit16 v4, v4, 0x5527

    const v28, 0x264c93d6

    xor-int v4, v4, v28

    const v28, -0x2d6ba818

    xor-int v28, v1, v28

    :goto_7
    move v1, v4

    goto/16 :goto_0

    :sswitch_e
    move-object v4, v14

    move/from16 v1, v24

    .line 198
    new-array v11, v1, [Ljava/lang/String;

    move/from16 v24, v0

    move-object/from16 v14, v23

    goto :goto_8

    :sswitch_f
    move-object v4, v14

    move/from16 v1, v24

    sget-object v11, Ll/۬ۚ᩷;->ܰܳۨ:[S

    const/16 v14, 0xe

    move/from16 v24, v0

    const/4 v0, 0x1

    invoke-static {v11, v14, v0, v12}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, v23

    invoke-static {v14, v0}, Ll/֨ᩴ;->ۡᩴ᩷(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v0

    move-object v11, v0

    :goto_8
    const-string v0, "\u073f\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v27

    mul-int/lit8 v0, v0, -0x69

    move-object/from16 v23, v2

    xor-int v2, v0, v26

    mul-int/lit16 v2, v2, 0x35e5

    const v28, 0x285412bf

    xor-int v2, v2, v28

    const v28, -0x51d095e9

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v23, v2

    move-object v4, v14

    move/from16 v1, v24

    move/from16 v24, v0

    const/4 v0, 0x1

    const/16 v2, 0xd

    move-object/from16 v14, v22

    invoke-static {v14, v0, v2, v12}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_9

    const-string v2, "\u1a74\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    mul-int/lit8 v2, v2, 0x55

    move-object/from16 v22, v0

    xor-int v0, v2, v27

    mul-int/lit16 v0, v0, 0x25b5

    const v28, 0x33918f6f

    xor-int v0, v0, v28

    const v28, 0x76ff7690

    xor-int v28, v2, v28

    move-object/from16 v2, v23

    move-object/from16 v23, v22

    move-object/from16 v22, v14

    move-object v14, v4

    move/from16 v31, v1

    move v1, v0

    goto/16 :goto_17

    :cond_9
    move-object/from16 v22, v0

    const-string v0, "\u073a\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    mul-int/lit8 v0, v0, 0x33

    xor-int v2, v0, v27

    mul-int/lit16 v2, v2, -0x747f

    const v28, -0x2589b79c

    xor-int v2, v2, v28

    const v28, 0x486501ad

    xor-int v28, v0, v28

    move/from16 v0, v24

    move/from16 v24, v1

    move v1, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v22

    move-object/from16 v22, v14

    goto/16 :goto_13

    :sswitch_11
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v1, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    aput-object v21, v3, v5

    const/4 v0, 0x2

    aput-object v29, v3, v0

    sget-object v22, Ll/۬ۚ᩷;->ܰܳۨ:[S

    .line 105
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_a

    :goto_9
    const-string v0, "\u073f\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v2, v0, v26

    mul-int/lit16 v2, v2, -0x2dc9

    const v28, 0x2be18e6e

    xor-int v2, v2, v28

    const v28, 0x71577b54

    goto :goto_a

    :cond_a
    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v27, v0

    mul-int/lit8 v0, v0, -0x25

    xor-int v2, v0, v26

    mul-int/lit16 v2, v2, -0x37cd

    const v28, 0x2e804273

    xor-int v2, v2, v28

    const v28, -0x400296b4

    :goto_a
    xor-int v28, v0, v28

    move/from16 v0, v24

    move/from16 v24, v1

    goto/16 :goto_10

    :sswitch_12
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v1, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    move-object/from16 v0, p0

    .line 198
    iget-object v2, v0, Ll/۬ۚ᩷;->ܽ:Landroid/net/Uri;

    aput-object v2, v3, v1

    iget-object v2, v0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    sget v21, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v21, :cond_b

    move-object/from16 v21, v2

    const/4 v5, 0x1

    :goto_b
    const-string v2, "\u1a75\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v26

    move/from16 v28, v1

    xor-int v1, v2, v27

    mul-int/lit16 v1, v1, -0x213d

    const v30, -0x4406d552

    xor-int v1, v1, v30

    const v30, 0x3ff65bf

    xor-int v2, v2, v30

    move/from16 v0, v24

    move/from16 v24, v28

    move/from16 v28, v2

    goto/16 :goto_11

    :cond_b
    move/from16 v28, v1

    const-string v1, "\u1a79\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v5, v1, v27

    mul-int/lit16 v5, v5, -0x57ad

    const v30, 0x71742e05

    xor-int v5, v5, v30

    const v30, 0x4d533afb    # 2.2149112E8f

    xor-int v1, v1, v30

    move-object/from16 v21, v2

    move-object/from16 v2, v23

    move/from16 v0, v24

    move/from16 v24, v28

    move/from16 v28, v1

    move v1, v5

    move-object/from16 v23, v14

    const/4 v5, 0x1

    goto/16 :goto_13

    :sswitch_13
    move/from16 v24, v0

    move-object v4, v14

    move-object/from16 v14, v23

    move-object/from16 v0, p0

    move-object/from16 v23, v2

    move/from16 v2, v20

    new-array v3, v2, [Ljava/lang/Object;

    .line 68
    sget-boolean v20, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v20, :cond_c

    move/from16 v20, v2

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v0, v24

    const/16 v24, 0x0

    goto/16 :goto_15

    :cond_c
    const-string v20, "\u0733\u0733"

    invoke-static/range {v20 .. v20}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v20

    sub-int v20, v27, v20

    mul-int/lit8 v20, v20, -0xb

    xor-int v1, v20, v26

    mul-int/lit16 v1, v1, -0x6deb

    const v30, -0x59276518    # -1.5029998E-15f

    xor-int v1, v1, v30

    const v30, -0x49e4e054

    xor-int v20, v20, v30

    move/from16 v28, v20

    move/from16 v0, v24

    const/16 v24, 0x0

    move/from16 v20, v2

    goto/16 :goto_11

    :sswitch_14
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    move-object/from16 v0, p0

    .line 198
    iget-wide v1, v0, Ll/۬ۚ᩷;->ۧ:J

    invoke-static {v1, v2}, Ll/ۘᩴ;->᩵᩺ܳ(J)Ljava/lang/Long;

    move-result-object v29

    const/16 v20, 0x3

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v1

    if-gtz v1, :cond_d

    move/from16 v1, v18

    goto/16 :goto_14

    :cond_d
    const-string v1, "\u0733\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v27

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v26

    mul-int/lit16 v2, v2, -0x3f6b

    const v30, 0x3508461d

    xor-int v2, v2, v30

    const v30, 0x3713aafc

    xor-int v1, v1, v30

    goto/16 :goto_f

    :sswitch_15
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    move/from16 v2, v20

    move-object/from16 v0, p0

    const/16 v1, 0x37fc

    const/16 v12, 0x37fc

    goto :goto_c

    :sswitch_16
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    move/from16 v2, v20

    move-object/from16 v0, p0

    const/16 v1, 0x73eb

    const/16 v12, 0x73eb

    :goto_c
    const-string v1, "\u0733\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v0, v1, v27

    mul-int/lit16 v0, v0, -0x25ab

    const v20, -0x17c3fb98

    xor-int v0, v0, v20

    const v20, 0x44d2cf7c

    xor-int v1, v1, v20

    move/from16 v20, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v14

    move-object v14, v4

    move/from16 v31, v1

    move v1, v0

    move/from16 v0, v24

    move/from16 v24, v28

    move/from16 v28, v31

    goto/16 :goto_0

    :sswitch_17
    move-object v4, v14

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    move/from16 v2, v20

    const v0, 0x7785a99

    add-int v0, v19, v0

    move/from16 v1, v18

    move/from16 v18, v2

    mul-int/lit16 v2, v1, 0x5776

    sub-int/2addr v0, v2

    if-gez v0, :cond_e

    const-string v0, "\u06d9\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v26

    xor-int v2, v0, v27

    mul-int/lit16 v2, v2, -0x48e7

    const v20, -0x7417ac12

    xor-int v2, v2, v20

    const v20, -0x68d75c71

    goto/16 :goto_16

    :cond_e
    const-string v0, "\u06da\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v2, v0, v26

    mul-int/lit16 v2, v2, -0x4d43

    const v20, -0xc61211d

    xor-int v2, v2, v20

    const v20, 0x70690ac8

    goto/16 :goto_16

    :sswitch_18
    move-object v4, v14

    move/from16 v18, v20

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    aget-short v0, v16, v17

    mul-int v19, v0, v0

    .line 58
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_f

    :goto_d
    const-string v1, "\u05a8\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, -0x799d

    const v20, 0x1ff7784c

    xor-int v2, v2, v20

    const v20, -0x71a09188

    goto :goto_e

    :cond_f
    const-string v1, "\u06e0\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v26

    xor-int v2, v1, v27

    mul-int/lit16 v2, v2, 0x1143

    const v20, 0x62b9cf11

    xor-int v2, v2, v20

    const v20, -0x35a3c404    # -3608319.0f

    :goto_e
    xor-int v1, v1, v20

    move/from16 v20, v18

    move/from16 v18, v0

    :goto_f
    move/from16 v0, v24

    move/from16 v24, v28

    move/from16 v28, v1

    :goto_10
    move v1, v2

    :goto_11
    move-object/from16 v2, v23

    :goto_12
    move-object/from16 v23, v14

    :goto_13
    move-object v14, v4

    goto/16 :goto_0

    :sswitch_19
    move-object v4, v14

    move/from16 v1, v18

    move/from16 v18, v20

    move-object/from16 v14, v23

    move/from16 v28, v24

    move/from16 v24, v0

    move-object/from16 v23, v2

    sget-object v16, Ll/۬ۚ᩷;->ܰܳۨ:[S

    const/16 v17, 0x0

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_10

    move/from16 v20, v18

    :goto_14
    move-object/from16 v2, v23

    move/from16 v0, v24

    move/from16 v24, v28

    :goto_15
    const-string v18, "\u1a76\u073d"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v26

    move/from16 v23, v0

    xor-int v0, v18, v27

    mul-int/lit16 v0, v0, 0x147b

    const v28, 0x40816683

    xor-int v0, v0, v28

    const v28, -0x3a2ddcf0

    xor-int v28, v18, v28

    move/from16 v18, v1

    move v1, v0

    move/from16 v0, v23

    goto :goto_12

    :cond_10
    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v27

    xor-int v2, v0, v26

    mul-int/lit16 v2, v2, -0x2c97

    const v20, -0x35d29da6    # -2840726.5f

    xor-int v2, v2, v20

    const v20, 0x73e7889f

    :goto_16
    xor-int v0, v0, v20

    move/from16 v20, v18

    move/from16 v18, v1

    move v1, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v14

    move-object v14, v4

    move/from16 v31, v28

    move/from16 v28, v0

    :goto_17
    move/from16 v0, v24

    move/from16 v24, v31

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fa4d96d -> :sswitch_5
        -0x7948e2e2 -> :sswitch_c
        -0x760fc86f -> :sswitch_5
        -0x724cb98f -> :sswitch_0
        -0x6f7fee99 -> :sswitch_9
        -0x6925c482 -> :sswitch_f
        -0x65786084 -> :sswitch_e
        -0x644b06f5 -> :sswitch_9
        -0x625a2bfb -> :sswitch_c
        -0x60eac6c0 -> :sswitch_19
        -0x60c8ea64 -> :sswitch_13
        -0x5ee625ea -> :sswitch_4
        -0x5e9b82f2 -> :sswitch_19
        -0x5b50138c -> :sswitch_0
        -0x4e4e98e8 -> :sswitch_10
        -0x4badd2d2 -> :sswitch_7
        -0x47029844 -> :sswitch_8
        -0x3ce0903c -> :sswitch_11
        -0x3c67ab5f -> :sswitch_7
        -0x3562cc88 -> :sswitch_14
        -0x30e2317f -> :sswitch_a
        -0x2cd2204b -> :sswitch_d
        -0x2b653791 -> :sswitch_12
        -0x2915732f -> :sswitch_1
        -0x26e7db72 -> :sswitch_b
        -0x22dd77bb -> :sswitch_a
        -0x1d3cd24f -> :sswitch_12
        -0x1bf2fbe9 -> :sswitch_3
        -0x1ae4dba7 -> :sswitch_11
        -0x17568ac7 -> :sswitch_13
        -0x1312cb26 -> :sswitch_16
        -0xb928100 -> :sswitch_8
        -0x6b2c9ea -> :sswitch_15
        0x10c255 -> :sswitch_3
        0x10d4b150 -> :sswitch_18
        0x118a62a9 -> :sswitch_f
        0x196762a0 -> :sswitch_15
        0x244a75c2 -> :sswitch_16
        0x24a56a16 -> :sswitch_6
        0x2574392a -> :sswitch_2
        0x27c71729 -> :sswitch_18
        0x414437ff -> :sswitch_1
        0x42990dd1 -> :sswitch_d
        0x4413fde3 -> :sswitch_17
        0x49a76ee6 -> :sswitch_e
        0x4b9e028a -> :sswitch_4
        0x524081ff -> :sswitch_14
        0x5e0cde24 -> :sswitch_6
        0x61add959 -> :sswitch_b
        0x6907fbba -> :sswitch_10
        0x7a486a8a -> :sswitch_17
        0x7bf08401 -> :sswitch_2
    .end sparse-switch
.end method

.method public final ֫()Ljava/io/InputStream;
    .locals 1

    .line 198
    iget-object v0, p0, Ll/۬ۚ᩷;->֫:Ljava/io/InputStream;

    return-object v0
.end method
