.class public final Ll/ܽᩴۡ;
.super Ljava/lang/Object;
.source "96NX"


# static fields
.field private static final ۡᩴ᩻:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x48

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    return-void

    :array_0
    .array-data 2
        0x16f0s
        0x6f41s
        0x6f53s
        0x6f44s
        0x6f5es
        0x6f41s
        0x6f5as
        0x6f52s
        0x6f58s
        0x3a7s
        -0x1584s
        -0x1586s
        -0x1594s
        -0x1585s
        -0x15aas
        -0x1599s
        -0x1598s
        -0x159cs
        -0x1594s
        -0x1584s
        -0x1586s
        -0x1594s
        -0x1585s
        -0x15aas
        -0x159cs
        -0x1598s
        -0x1596s
        -0x159fs
        -0x15c5s
        -0x15b6s
        -0x1598s
        -0x1599s
        -0x1599s
        -0x159as
        -0x1583s
        -0x15d7s
        -0x1586s
        -0x1598s
        -0x1581s
        -0x1594s
        -0x15d7s
        -0x159bs
        -0x159as
        -0x1596s
        -0x1598s
        -0x159bs
        -0x15d7s
        -0x159bs
        -0x159as
        -0x1592s
        -0x15a0s
        -0x1599s
        -0x15d7s
        -0x15a0s
        -0x1593s
        -0x1594s
        -0x1599s
        -0x1583s
        -0x15a0s
        -0x1583s
        -0x1590s
        0xd03s
        0x7316s
        0x7310s
        0x7306s
        0x7311s
        0x733cs
        0x730es
        0x7302s
        0x7300s
        0x730bs
        0x7351s
    .end array-data
.end method

.method public static ֫()Ljava/lang/String;
    .locals 26

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

    const v19, -0x7c01171c

    sget v20, Ll/ۖ;->᩹۟ۘ:I

    sget v21, Ll/֨۬;->۫ۙ᩺:I

    const-string v22, "\u05a8\u06d8"

    invoke-static/range {v22 .. v22}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v21

    xor-int v0, v22, v20

    mul-int/lit16 v0, v0, -0x3f45

    const v24, -0x5622ab54

    xor-int v0, v0, v24

    const v24, -0xa8bcbe3

    xor-int v22, v22, v24

    move-object/from16 v18, v3

    move-object/from16 v24, v4

    move-object/from16 v14, v16

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    :goto_0
    xor-int v4, v19, v20

    mul-int/lit16 v4, v4, 0x7ed3

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v19, v22, v0

    sparse-switch v19, :sswitch_data_0

    move-object/from16 v22, v1

    move-object/from16 v4, v24

    sget-object v0, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    const/4 v1, 0x0

    aget-short v17, v0, v1

    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_e

    goto/16 :goto_c

    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v0, :cond_1

    :cond_0
    move-object/from16 v22, v1

    move/from16 v0, v17

    move-object/from16 v4, v24

    goto/16 :goto_b

    :cond_1
    move-object/from16 v4, v24

    goto/16 :goto_4

    .line 19
    :sswitch_1
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v0, :cond_2

    :goto_1
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    goto/16 :goto_c

    :cond_2
    const-string v0, "\u0730\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x21

    xor-int v4, v0, v20

    mul-int/lit16 v4, v4, 0x128d

    const v22, 0x33db926a

    xor-int v4, v4, v22

    const v22, -0x148395b6

    goto/16 :goto_3

    .line 45
    :sswitch_2
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_0

    goto :goto_1

    .line 24
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto :goto_1

    .line 41
    :sswitch_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v11

    :sswitch_6
    return-object v12

    .line 53
    :sswitch_7
    :try_start_0
    invoke-virtual {v1, v11}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v0, "\u06d7\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x7b

    xor-int v4, v0, v20

    mul-int/lit16 v4, v4, -0x3e8d

    const v22, 0x1ee7d43f

    xor-int v4, v4, v22

    const v22, -0x16524947

    goto/16 :goto_3

    .line 44
    :sswitch_8
    :try_start_1
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֡ۧ()Ljava/lang/String;

    move-result-object v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    const-string v0, "\u06e2\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, 0x1769

    const v22, -0x3bc28978

    xor-int v4, v4, v22

    const v22, -0x47c8ee20

    goto/16 :goto_3

    :catch_1
    move-object/from16 v4, v24

    goto/16 :goto_7

    .line 51
    :sswitch_9
    invoke-static {v8, v9, v10}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0xb

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x3677

    const v22, 0x511e8954

    xor-int v4, v4, v22

    const v22, -0x2cbee51c

    goto :goto_3

    .line 50
    :sswitch_a
    invoke-static {v6, v7}, Ll/֡ܶ;->᩵ܿᩳ(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->֫([B)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/16 v10, 0x10

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u06d9\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v4, v0, v21

    mul-int/lit16 v4, v4, -0x2b01

    const v22, -0x4074ae81

    xor-int v4, v4, v22

    const v22, -0x314c9ff9

    goto :goto_3

    .line 48
    :sswitch_b
    invoke-static {v14, v13, v3, v15}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v2, v5, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 50
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_4

    :goto_2
    move-object/from16 v22, v1

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v4, v0, v20

    mul-int/lit16 v4, v4, 0x1523

    const v22, -0x55249279

    xor-int v4, v4, v22

    const v22, -0x3f508281

    :goto_3
    xor-int v22, v0, v22

    move v0, v4

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v4, v24

    .line 48
    invoke-static {v2, v4}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v5, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    sget-object v14, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    const/4 v13, 0x1

    const/16 v3, 0x8

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v0

    if-gtz v0, :cond_5

    :goto_4
    const-string v0, "\u1a75\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x25

    move-object/from16 v22, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x638b

    const v24, 0x15702b2c

    xor-int v1, v1, v24

    const v24, -0x7c08d5e9

    goto/16 :goto_d

    :cond_5
    move-object/from16 v22, v1

    const-string v0, "\u06d6\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x15

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x5f4f

    const v24, -0x4f56fef4

    xor-int v1, v1, v24

    const v24, 0x653d8ead

    goto/16 :goto_d

    :sswitch_d
    move-object/from16 v22, v1

    sget-object v0, Landroid/os/Build;->TAGS:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v24, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 42
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v0, "\u06d9\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x566f

    const v4, 0x735f51ab

    xor-int/2addr v1, v4

    const v4, -0xe007f1d

    :goto_5
    xor-int/2addr v0, v4

    goto/16 :goto_e

    :sswitch_e
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    .line 48
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_c

    :cond_7
    const-string v0, "\u073f\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x4f

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x4d1d

    const v24, -0x63db44f9

    xor-int v1, v1, v24

    const v24, -0x41319e25

    goto/16 :goto_d

    :sswitch_f
    move-object/from16 v22, v1

    move-object/from16 v0, v18

    move-object/from16 v4, v24

    .line 48
    invoke-static {v2, v0}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v1, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_8

    move-object/from16 v18, v0

    move/from16 v0, v17

    goto/16 :goto_b

    :cond_8
    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    move-object/from16 v18, v0

    xor-int v0, v1, v21

    mul-int/lit16 v0, v0, -0x1c2d

    const v24, -0x208136a6

    xor-int v0, v0, v24

    const v24, 0x3c828969

    goto/16 :goto_9

    :sswitch_10
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v18, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 32
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_9

    :goto_6
    move-object/from16 v24, v4

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u06d8\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x37

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x367

    const v24, -0x263b5e18

    xor-int v1, v1, v24

    const v24, 0x43ce0399

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v4, v24

    .line 40
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 41
    sget-object v1, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    invoke-static {v1, v0}, Ll/֫֫;->ۤ۟ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 42
    invoke-static {v1}, Ll/ۗ۬;->ۨ᩹ۘ(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "\u05a8\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x3f

    move-object/from16 v22, v1

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x481b

    const v24, 0x14f897a

    xor-int v1, v1, v24

    const v24, 0x79926ceb

    goto/16 :goto_d

    :cond_a
    move-object/from16 v22, v1

    :goto_7
    const-string v0, "\u06da\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x7

    move-object/from16 v22, v1

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x18a5

    const v24, -0x1c2a9e02

    xor-int v1, v1, v24

    const v24, 0x3997ac1

    goto/16 :goto_d

    :sswitch_12
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    .line 40
    invoke-static {}, Ll/ۙ᩸᩷;->֫()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    mul-int/lit16 v0, v0, 0x141

    .line 9
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_b

    move/from16 v23, v0

    goto :goto_6

    :goto_8
    const-string v0, "\u05ab\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x79

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x3453

    const v4, 0x638fcb62

    xor-int/2addr v1, v4

    const v4, -0x5c06ba23

    goto/16 :goto_5

    :cond_b
    const-string v1, "\u073f\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    move/from16 v23, v0

    xor-int v0, v1, v20

    mul-int/lit16 v0, v0, 0x24b5

    const v24, -0x5f4cdc4

    xor-int v0, v0, v24

    const v24, -0x36f2ddea

    :goto_9
    xor-int v1, v1, v24

    move-object/from16 v24, v4

    move-object/from16 v25, v22

    move/from16 v22, v1

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    const v0, 0xfa8f

    const v15, 0xfa8f

    goto :goto_a

    :sswitch_14
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    const/16 v0, 0x6f37

    const/16 v15, 0x6f37

    :goto_a
    const-string v0, "\u06e4\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x306f

    const v24, -0x77fb5e5a

    xor-int v1, v1, v24

    const v24, -0x5317b1d5

    goto/16 :goto_d

    :sswitch_15
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    mul-int v0, v17, v17

    const v1, 0x4662de1

    add-int/2addr v0, v1

    sub-int v0, v0, v16

    if-ltz v0, :cond_c

    const-string v0, "\u0736\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x14cf

    const v24, -0x7f3e0779

    xor-int v1, v1, v24

    const v24, -0x5409f73b

    goto/16 :goto_d

    :cond_c
    const-string v0, "\u06e2\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x22c3

    const v24, 0x6f7b53db

    xor-int v1, v1, v24

    const v24, 0x1ea6d247

    goto :goto_d

    :sswitch_16
    move-object/from16 v22, v1

    move-object/from16 v4, v24

    move/from16 v0, v17

    mul-int/lit16 v1, v0, 0x431e

    .line 47
    sget v16, Ll/֡֡;->֫ۤܳ:I

    if-ltz v16, :cond_d

    move/from16 v16, v1

    :goto_b
    const-string v1, "\u1a78\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x4d

    move/from16 v17, v0

    xor-int v0, v1, v20

    mul-int/lit16 v0, v0, -0x989

    const v24, 0x6507e81e

    xor-int v0, v0, v24

    const v24, 0x1ee158f5

    goto/16 :goto_9

    :cond_d
    move/from16 v17, v0

    const-string v0, "\u06da\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    move/from16 v16, v1

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x6bff

    const v24, -0x7d6d30b1

    xor-int v1, v1, v24

    const v24, -0x5bbf8301

    goto :goto_d

    :goto_c
    const-string v0, "\u073a\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x3a7d

    const v24, -0x71b8e4a1

    xor-int v1, v1, v24

    const v24, -0x47372109

    goto :goto_d

    :cond_e
    const-string v0, "\u06da\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x41

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x54d1

    const v24, 0x3ce14db6

    xor-int v1, v1, v24

    const v24, 0xa22f37a

    :goto_d
    xor-int v0, v0, v24

    move-object/from16 v24, v4

    :goto_e
    move-object/from16 v25, v22

    move/from16 v22, v0

    move v0, v1

    :goto_f
    move-object/from16 v1, v25

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e272eec -> :sswitch_a
        -0x71b1927b -> :sswitch_3
        -0x707c3273 -> :sswitch_9
        -0x6f51a309 -> :sswitch_b
        -0x5f32966a -> :sswitch_14
        -0x58ccb2eb -> :sswitch_f
        -0x533b5ff8 -> :sswitch_15
        -0x53215f26 -> :sswitch_2
        -0x51c9ed39 -> :sswitch_1
        -0x46dbb96e -> :sswitch_5
        -0x42349a52 -> :sswitch_13
        -0x3e763da1 -> :sswitch_11
        -0x399ef848 -> :sswitch_7
        -0x383b1ae0 -> :sswitch_10
        -0x37d7be6c -> :sswitch_a
        -0x357b49e8 -> :sswitch_11
        -0x305517f4 -> :sswitch_4
        -0x282a4010 -> :sswitch_b
        -0x24e315ae -> :sswitch_16
        -0x243b7dbc -> :sswitch_14
        -0x1fcc3301 -> :sswitch_8
        -0x1fcb16e6 -> :sswitch_d
        -0x1a68b10b -> :sswitch_0
        -0x1a2b4c8d -> :sswitch_e
        -0xda2a7eb -> :sswitch_2
        -0x54b2852 -> :sswitch_c
        0x1b01f4e -> :sswitch_5
        0xdbd40ff -> :sswitch_f
        0x156baf40 -> :sswitch_1
        0x16223a5b -> :sswitch_13
        0x1a101c63 -> :sswitch_10
        0x25e2503f -> :sswitch_e
        0x28a9d7b8 -> :sswitch_c
        0x34e91304 -> :sswitch_16
        0x39ec4b96 -> :sswitch_15
        0x4a9e4f61 -> :sswitch_3
        0x53106da8 -> :sswitch_6
        0x5998d6f7 -> :sswitch_0
        0x61617213 -> :sswitch_6
        0x619eb436 -> :sswitch_4
        0x61c37f01 -> :sswitch_8
        0x67e65b36 -> :sswitch_d
        0x68e44c15 -> :sswitch_12
        0x6dbaa34c -> :sswitch_9
        0x75be1e78 -> :sswitch_12
        0x7a118614 -> :sswitch_7
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 24

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

    const v16, 0x476f63b1

    sget v17, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v18, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v19, "\u05ab\u1a79"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v18

    mul-int/lit8 v19, v19, -0x4f

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, -0x4df

    const v21, 0x73ddd1cb

    xor-int v0, v0, v21

    const v21, 0x56b73139

    xor-int v19, v19, v21

    move-object/from16 v16, v3

    move-object v12, v11

    move-object v14, v13

    move/from16 v20, v19

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const v19, 0x476f63b1

    const/16 v21, 0x0

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v5, v19, v17

    mul-int/lit16 v5, v5, 0x1e91

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    move/from16 v20, v6

    .line 27
    sget-object v14, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    const/16 v15, 0x13

    const/16 v4, 0xa

    .line 26
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_6

    goto :goto_5

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v5, p0

    move/from16 v20, v6

    goto/16 :goto_b

    .line 26
    :sswitch_1
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_1

    goto :goto_3

    :cond_1
    move-object/from16 v5, p0

    :goto_1
    move-object/from16 v20, v1

    goto/16 :goto_e

    :sswitch_2
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string v0, "\u05a1\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x3f

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x32f7

    const v20, 0x5a5b816

    xor-int v5, v5, v20

    const v20, -0x5ae2ae97

    goto :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_3
    const-string v0, "\u1a79\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x45

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x16d

    const v20, -0x689a1aa

    xor-int v5, v5, v20

    const v20, 0x2840fb4c

    :goto_4
    xor-int v20, v0, v20

    goto/16 :goto_7

    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    :sswitch_5
    return-void

    .line 29
    :sswitch_6
    new-instance v0, Ljava/io/IOException;

    sget-object v5, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    move/from16 v20, v6

    const/16 v6, 0x1d

    .line 28
    sget v22, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v22, :cond_3

    :goto_5
    move-object/from16 v5, p0

    goto/16 :goto_8

    :cond_3
    const/16 v1, 0x20

    .line 29
    invoke-static {v5, v6, v1, v11}, Ll/֨۬;->֨ۧ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_7
    move/from16 v20, v6

    .line 28
    invoke-static {}, Ll/ܽᩴۡ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v0}, Ll/ۘۘ;->᩷ܳᩴ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->commit()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x1f8f

    const v6, 0x49fc8ca0    # 2068884.0f

    xor-int/2addr v5, v6

    const v6, 0x4466a90d

    goto :goto_6

    :cond_4
    const-string v0, "\u06e4\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x4b9d

    const v6, -0x46fe60e2

    xor-int/2addr v5, v6

    const v6, -0x216d1da6

    goto :goto_6

    :sswitch_8
    move/from16 v20, v6

    .line 27
    invoke-static {v14, v15, v4, v11}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v0

    if-ltz v0, :cond_5

    move-object/from16 v5, p0

    move/from16 v6, v20

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u06df\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x71

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0x6d4f

    const v6, -0x7697895b

    xor-int/2addr v5, v6

    const v6, 0x4fb5ff5c

    goto :goto_6

    :cond_6
    const-string v0, "\u06e2\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0xbd1

    const v6, 0x43c42612

    xor-int/2addr v5, v6

    const v6, -0x1f5e9b70

    :goto_6
    xor-int/2addr v0, v6

    move/from16 v6, v20

    move/from16 v20, v0

    :goto_7
    move v0, v5

    goto/16 :goto_0

    :sswitch_9
    move/from16 v20, v6

    const/16 v0, 0x9

    .line 27
    invoke-static {v12, v13, v0, v11}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, p0

    invoke-static {v1, v0, v5}, Ll/ۘۘ;->᩷ܳᩴ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v2

    .line 23
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_7

    :goto_8
    move/from16 v6, v20

    :goto_9
    move-object/from16 v20, v1

    goto/16 :goto_d

    :cond_7
    const-string v0, "\u06e7\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v17

    mul-int/lit16 v6, v6, -0x1369

    const v22, -0x22397d8c

    xor-int v6, v6, v22

    const v22, 0x55c17a8b

    goto/16 :goto_c

    :sswitch_a
    move-object/from16 v5, p0

    move/from16 v20, v6

    const/16 v13, 0xa

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    const-string v0, "\u06da\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x43

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, 0x3fdb

    const v22, 0x1262617a

    xor-int v6, v6, v22

    const v22, -0x7b3cf126

    goto/16 :goto_c

    :sswitch_b
    move-object/from16 v5, p0

    move/from16 v20, v6

    .line 27
    sget-object v0, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    invoke-static {v0}, Ll/֫ܿ;->ܽ᩶ܿ(Ljava/lang/Object;)Ll/۬ۤۡ;

    move-result-object v1

    sget-object v12, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    .line 11
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_9

    goto/16 :goto_b

    :cond_9
    const-string v0, "\u1a73\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x3b

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x5b45

    const v22, 0x6aeb503f

    xor-int v6, v6, v22

    const v22, 0x90a7ea0

    goto/16 :goto_c

    :sswitch_c
    move-object/from16 v5, p0

    move/from16 v20, v6

    const v0, 0xabbe

    const v11, 0xabbe

    goto :goto_a

    :sswitch_d
    move-object/from16 v5, p0

    move/from16 v20, v6

    const v0, 0xea09

    const v11, 0xea09

    :goto_a
    const-string v0, "\u06eb\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v6, v0, v17

    mul-int/lit16 v6, v6, -0x31c3

    const v22, -0x32197b3c

    xor-int v6, v6, v22

    const v22, 0x110f300e

    goto/16 :goto_c

    :sswitch_e
    move-object/from16 v5, p0

    move/from16 v20, v6

    add-int v0, v9, v10

    add-int/2addr v0, v0

    sub-int v0, v8, v0

    if-gtz v0, :cond_a

    const-string v0, "\u1a74\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x3d

    xor-int v6, v0, v17

    mul-int/lit16 v6, v6, 0x55a1

    const v22, 0x7cc9d578

    xor-int v6, v6, v22

    const v22, -0x32f8d38c    # -1.4173984E8f

    goto :goto_c

    :cond_a
    const-string v0, "\u06d9\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, 0x63dd

    const v22, -0x20a1145d

    xor-int v6, v6, v22

    const v22, 0x3ee10ab0

    goto :goto_c

    :sswitch_f
    move-object/from16 v5, p0

    move/from16 v20, v6

    mul-int v8, v7, v7

    mul-int v9, v20, v20

    const v10, 0x161e900

    .line 2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v0

    if-ltz v0, :cond_b

    :goto_b
    const-string v0, "\u06e1\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x1f

    xor-int v6, v0, v17

    mul-int/lit16 v6, v6, 0x272b

    const v22, -0x50c7db7a

    xor-int v6, v6, v22

    const v22, -0x3031def0

    goto :goto_c

    :cond_b
    const-string v0, "\u05a1\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7d

    xor-int v6, v0, v18

    mul-int/lit16 v6, v6, -0x3bbd

    const v22, -0x11375b9b

    xor-int v6, v6, v22

    const v22, -0x7cc6672c

    :goto_c
    xor-int v0, v0, v22

    move/from16 v23, v20

    move/from16 v20, v0

    move v0, v6

    move/from16 v6, v23

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v5, p0

    move/from16 v20, v6

    add-int/lit16 v7, v6, 0x12d0

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_c

    goto/16 :goto_9

    :cond_c
    const-string v0, "\u06dc\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x77

    move-object/from16 v20, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x428f

    const v22, -0x25a749cf

    xor-int v1, v1, v22

    const v22, 0x68fc53db

    goto :goto_f

    :sswitch_11
    move-object/from16 v5, p0

    move-object/from16 v20, v1

    aget-short v6, v16, v21

    .line 22
    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_d

    :goto_d
    const-string v0, "\u1a74\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x991

    const v22, -0x7925b3f

    xor-int v1, v1, v22

    const v22, 0x1441f3a1

    goto :goto_f

    :cond_d
    const-string v0, "\u1a77\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x2f

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1f01

    const v22, -0x7f355e02

    xor-int v1, v1, v22

    const v22, 0x7788d3db

    goto :goto_f

    :sswitch_12
    move-object/from16 v5, p0

    move-object/from16 v20, v1

    sget-object v16, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    const/16 v21, 0x9

    .line 13
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_e

    :goto_e
    const-string v0, "\u05a8\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x7e1d

    const v22, 0x7dafea87

    xor-int v1, v1, v22

    const v22, 0x5da891c2

    goto :goto_f

    :cond_e
    const-string v0, "\u06ec\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0xd53

    const v22, -0x7bc75891

    xor-int v1, v1, v22

    const v22, -0x34113973    # -3.1296794E7f

    :goto_f
    xor-int v0, v0, v22

    move-object/from16 v23, v20

    move/from16 v20, v0

    move v0, v1

    move-object/from16 v1, v23

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f866ef5 -> :sswitch_1
        -0x7d41c00d -> :sswitch_d
        -0x770bed12 -> :sswitch_b
        -0x74d5c5e6 -> :sswitch_e
        -0x6c189605 -> :sswitch_9
        -0x6bb098ae -> :sswitch_10
        -0x63dbc2ad -> :sswitch_6
        -0x57757d7a -> :sswitch_2
        -0x53646879 -> :sswitch_9
        -0x4ebb6201 -> :sswitch_5
        -0x48d71026 -> :sswitch_7
        -0x426ee8a0 -> :sswitch_2
        -0x41ca2028 -> :sswitch_3
        -0x3b7d90bc -> :sswitch_a
        -0x343cf4a6 -> :sswitch_c
        -0x32e900c7 -> :sswitch_e
        -0x32530084 -> :sswitch_10
        -0x2a0f3554 -> :sswitch_5
        -0x1e9f984e -> :sswitch_0
        -0x195b9937 -> :sswitch_11
        -0x1433d665 -> :sswitch_d
        -0xbf6fb68 -> :sswitch_3
        0x4b71ecb -> :sswitch_f
        0x1583650e -> :sswitch_8
        0x187a6071 -> :sswitch_b
        0x2687febe -> :sswitch_7
        0x2c4a85f4 -> :sswitch_12
        0x35e3da93 -> :sswitch_f
        0x3a6151e5 -> :sswitch_4
        0x3eccc1d0 -> :sswitch_11
        0x4769c18d -> :sswitch_6
        0x4c8d620f -> :sswitch_0
        0x5118d068 -> :sswitch_c
        0x5aa3c9c1 -> :sswitch_4
        0x6a5089c8 -> :sswitch_1
        0x6da3e21d -> :sswitch_8
        0x713223a5 -> :sswitch_12
        0x77c57b8d -> :sswitch_a
    .end sparse-switch
.end method

.method public static ۧ()Z
    .locals 19

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

    const v13, 0x518ff8dc

    sget v14, Ll/֨۬;->۫ۙ᩺:I

    sget v15, Ll/ۨ;->᩺᩷ۚ:I

    const-string v16, "\u1a7a\u06d9"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v14, v16

    mul-int/lit8 v16, v16, -0x23

    xor-int v0, v16, v15

    mul-int/lit16 v0, v0, 0x5abb

    const v18, -0x4406878b

    xor-int v0, v0, v18

    const v18, 0x40ec5b4c

    xor-int v16, v16, v18

    move-object/from16 v18, v4

    move-object v11, v10

    move/from16 v17, v16

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, 0x518ff8dc

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v5, v16, v15

    mul-int/lit16 v5, v5, 0x74d9

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    .line 36
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_0

    goto/16 :goto_2

    .line 38
    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_c

    goto :goto_1

    .line 34
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v0, "\u06e7\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x18e5

    const v17, 0x3ad36bcc

    xor-int v5, v5, v17

    const v17, 0x5adc8104

    goto/16 :goto_6

    .line 36
    :sswitch_2
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto :goto_2

    .line 38
    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    const/4 v0, 0x0

    return v0

    .line 34
    :sswitch_4
    invoke-static {v2, v3, v4}, Ll/֨۟;->ܰ֨ܳ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    :sswitch_5
    invoke-static {v11, v12, v13, v10}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    .line 36
    sget v0, Ll/֡۬;->۠֡᩶:I

    if-gtz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v0, "\u0733\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x7285

    const v17, 0x1db48f6e

    xor-int v5, v5, v17

    const v17, 0x4458b03d

    goto/16 :goto_6

    :sswitch_6
    const/16 v12, 0x3e

    const/16 v13, 0xa

    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v0, "\u1a74\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x593b

    const v17, -0x7742c276

    xor-int v5, v5, v17

    const v17, 0xcd02428

    goto/16 :goto_6

    .line 34
    :sswitch_7
    sget-object v11, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    .line 36
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_3

    :goto_2
    const-string v0, "\u0730\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x31

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x61bb

    const v17, 0x4c9899be    # 8.000664E7f

    xor-int v5, v5, v17

    const v17, -0x860c38c

    goto/16 :goto_6

    :cond_3
    const-string v0, "\u06e2\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x54b5

    const v17, -0x532d6a42

    xor-int v5, v5, v17

    const v17, -0xf45ac21

    goto/16 :goto_6

    .line 34
    :sswitch_8
    invoke-static {}, Ll/ܽᩴۡ;->֫()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۙ᩸᩷;->᩻:Ll/۫ۤۡ;

    .line 38
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v0, "\u1a78\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x1645

    const v17, 0x4d45ecd8    # 2.07539584E8f

    xor-int v5, v5, v17

    const v17, 0x6170f9ff

    goto/16 :goto_6

    :sswitch_9
    const v0, 0xdc0a

    const v10, 0xdc0a

    goto :goto_3

    :sswitch_a
    const/16 v0, 0x7363

    const/16 v10, 0x7363

    :goto_3
    const-string v0, "\u05ab\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x711d

    const v17, 0x1fa64986

    xor-int v5, v5, v17

    const v17, 0x6e40bdc9

    goto/16 :goto_6

    :sswitch_b
    mul-int v0, v9, v9

    sub-int/2addr v0, v8

    if-gez v0, :cond_5

    const-string v0, "\u06dc\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x55

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x4513

    const v17, 0x59fbb18b

    xor-int v5, v5, v17

    const v17, -0x48982156

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u1a7a\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x4fd1

    const v17, -0x38847f11

    xor-int v5, v5, v17

    const v17, 0x40a085fa

    goto/16 :goto_6

    :sswitch_c
    add-int/lit16 v9, v7, 0x2c43

    .line 37
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u0736\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x1f5d

    const v17, 0x18a080f0

    xor-int v5, v5, v17

    const v17, -0x55bd34f4

    goto/16 :goto_6

    :sswitch_d
    const v0, 0xb10c

    mul-int v8, v7, v0

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_7

    :goto_4
    const-string v0, "\u1a73\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x6109

    const v17, 0x5cf3563b

    xor-int v5, v5, v17

    const v17, -0x6e053228

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06d6\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x7e9b

    const v17, 0x502f688d

    xor-int v5, v5, v17

    const v17, -0x7f73b81a

    goto/16 :goto_6

    :sswitch_e
    aget-short v7, v18, v6

    .line 35
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u1a7a\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x25

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x25ef

    const v17, -0x256d6475

    xor-int v5, v5, v17

    const v17, 0x66c0f2f0

    goto/16 :goto_6

    :sswitch_f
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_a

    :cond_9
    const-string v0, "\u05ab\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x75

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x4d85

    const v17, 0x78f48ef6

    xor-int v5, v5, v17

    const v17, -0x6e8c6215

    goto :goto_6

    :cond_a
    const-string v0, "\u1a77\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x59

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x50f1

    const v17, 0x10c17c17

    xor-int v5, v5, v17

    const v17, -0x4e6b4206

    goto :goto_6

    :sswitch_10
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "\u06e0\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, 0x5887

    const v17, -0x4c4069e2

    xor-int v5, v5, v17

    const v17, 0x51bed084

    goto :goto_6

    :sswitch_11
    sget-object v18, Ll/ܽᩴۡ;->ۡᩴ᩻:[S

    const/16 v6, 0x3d

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u06d6\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v15

    mul-int/lit16 v5, v5, -0x1cd7

    const v17, -0x7f526d6e

    xor-int v5, v5, v17

    const v17, 0x1ec531ce

    goto :goto_6

    :cond_d
    const-string v0, "\u06d9\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x61

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x5541

    const v17, -0x4943101

    xor-int v5, v5, v17

    const v17, 0x3ea2bb8a

    :goto_6
    xor-int v17, v0, v17

    move v0, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c60e003 -> :sswitch_10
        -0x7719cd12 -> :sswitch_5
        -0x71098514 -> :sswitch_2
        -0x6977b2d7 -> :sswitch_11
        -0x65d007a9 -> :sswitch_7
        -0x5ea7f3cf -> :sswitch_9
        -0x5d39c93a -> :sswitch_b
        -0x4f8120ce -> :sswitch_3
        -0x4aa66fc3 -> :sswitch_7
        -0x3ef6c635 -> :sswitch_e
        -0x39378220 -> :sswitch_9
        -0x2706b26f -> :sswitch_5
        -0x22139f01 -> :sswitch_d
        0x106635f -> :sswitch_11
        0x13932f40 -> :sswitch_1
        0x1641ed26 -> :sswitch_1
        0x1d901c94 -> :sswitch_b
        0x204b07f9 -> :sswitch_a
        0x25ddfe32 -> :sswitch_6
        0x2a006d77 -> :sswitch_4
        0x2baf2db7 -> :sswitch_6
        0x40859f3b -> :sswitch_0
        0x45d3d1ce -> :sswitch_0
        0x466aab47 -> :sswitch_c
        0x4827cd0f -> :sswitch_a
        0x4c18ed1b -> :sswitch_8
        0x4cdc51fb -> :sswitch_4
        0x54a6ba11 -> :sswitch_c
        0x593a0b1f -> :sswitch_f
        0x5af1e91d -> :sswitch_10
        0x5c5a5958 -> :sswitch_d
        0x640f9980 -> :sswitch_2
        0x66c4702f -> :sswitch_8
        0x6bde0530 -> :sswitch_3
        0x6da53910 -> :sswitch_f
        0x725383dd -> :sswitch_e
    .end sparse-switch
.end method
