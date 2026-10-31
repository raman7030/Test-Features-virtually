.class public final Ll/ۙᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"


# static fields
.field private static final ܰ᩺᩺:[S


# instance fields
.field public final ֫:J

.field public final ۖ:I

.field public ۜ:Z

.field public final ۡ:Landroid/content/pm/PackageInfo;

.field public final ۢ:I

.field public ۧ:Ll/ۗᩴ᩷;

.field public final ܳ:Ll/֡᩻;

.field public final ܺ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:Ll/֡᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙᩴ᩷;->ܰ᩺᩺:[S

    return-void

    :array_0
    .array-data 2
        0x1afs
        -0x1c1as
        -0x1c1as
        -0x1c1as
        -0x1c1as
        -0x1c1as
        -0x1c1as
        -0x1c6bs
        -0x1c6as
        -0x1c76s
        -0x1c71s
        -0x1c6es
        -0x1c13s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/pm/PackageInfo;)V
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const v21, 0x33a53ee4

    sget v22, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v23, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget-object v24, Ll/ۙᩴ᩷;->ܰ᩺᩺:[S

    const/16 v25, 0x0

    aget-short v2, v24, v25

    mul-int/lit16 v3, v2, 0x4c7a

    mul-int v2, v2, v2

    const v4, 0x5b62a89

    add-int/2addr v2, v4

    sub-int/2addr v2, v3

    if-gez v2, :cond_0

    const v2, 0xad41

    goto :goto_0

    :cond_0
    const v2, 0xe3c6

    .line 1145
    :goto_0
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073f\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    xor-int v4, v3, v23

    mul-int/lit16 v4, v4, -0x7eb5

    const v27, -0x6daebe6a

    xor-int v4, v4, v27

    const v27, 0x6066623d

    xor-int v3, v3, v27

    move-wide/from16 v26, v7

    move-object v13, v10

    move-object v6, v15

    move-wide/from16 v24, v18

    move-object/from16 v10, v20

    const/4 v9, 0x0

    move v7, v4

    move-object v8, v5

    move-object v5, v14

    move-wide/from16 v19, v16

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    move v4, v3

    move-wide v14, v11

    const/4 v3, 0x0

    const/4 v12, 0x0

    :goto_1
    xor-int v11, v21, v23

    mul-int/lit16 v11, v11, -0x2099

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v7, v11

    xor-int v21, v4, v7

    sparse-switch v21, :sswitch_data_0

    .line 1159
    aget-object v4, v8, v3

    .line 1160
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v24

    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_5

    goto :goto_3

    .line 1032
    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v4, :cond_2

    :cond_1
    :goto_2
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    goto/16 :goto_10

    :cond_2
    const-string v4, "\u05a8\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v23, v4

    mul-int/lit8 v4, v4, 0x55

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0x45fb

    const v11, -0x30f107d4

    xor-int/2addr v7, v11

    const v11, 0x65787c2d

    goto/16 :goto_6

    .line 856
    :sswitch_1
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-nez v4, :cond_1

    :goto_3
    move-wide/from16 v28, v17

    move/from16 v17, v2

    move-object/from16 v2, v16

    move/from16 v16, v3

    :goto_4
    move-wide/from16 v3, v28

    goto/16 :goto_e

    .line 651
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    const-string v4, "\u06d6\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v23

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0x72d9

    const v11, -0xb52b72e

    xor-int/2addr v7, v11

    const v11, 0x3d515d30

    goto/16 :goto_6

    .line 219
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto :goto_3

    .line 1106
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    .line 1169
    :sswitch_5
    new-instance v1, Ll/֡᩻;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {v1, v2}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, v0, Ll/ۙᩴ᩷;->᩻:Ll/֡᩻;

    return-void

    .line 1168
    :sswitch_6
    new-instance v4, Ll/֡᩻;

    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v7, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {v4, v7}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object v4, v0, Ll/ۙᩴ᩷;->ܳ:Ll/֡᩻;

    .line 99
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_4

    :goto_5
    move-object v4, v6

    goto/16 :goto_8

    :cond_4
    const-string v4, "\u06db\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int v4, v4, v23

    mul-int/lit8 v4, v4, 0x45

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0x4579

    const v11, -0x2daf5db

    xor-int/2addr v7, v11

    const v11, -0x6280ba0b

    goto/16 :goto_6

    :sswitch_7
    add-long v19, v19, v24

    add-int/lit8 v3, v3, 0x1

    move-object v4, v6

    goto/16 :goto_9

    :cond_5
    const-string v4, "\u1a75\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v23

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, -0x643b

    const v11, 0x5c4f50fa

    xor-int/2addr v7, v11

    const v11, 0x599d5a21

    goto/16 :goto_6

    .line 1164
    :sswitch_8
    invoke-static {v14, v15}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Ll/ۙᩴ᩷;->᩷:Ljava/lang/String;

    move-object v4, v6

    goto/16 :goto_7

    :sswitch_9
    const/4 v4, 0x4

    const/16 v7, 0x9

    invoke-static {v10, v4, v7, v2}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 847
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    const-string v4, "\u073a\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v23

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, -0x2a75

    const v11, 0x7a38204d

    xor-int/2addr v7, v11

    const v11, 0x5293e0a2

    goto :goto_6

    .line 1164
    :sswitch_a
    iget-wide v10, v0, Ll/ۙᩴ᩷;->֫:J

    invoke-static {v10, v11}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v10, Ll/ۙᩴ᩷;->ܰ᩺᩺:[S

    .line 928
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string v4, "\u1a78\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v23

    mul-int/lit8 v4, v4, 0x33

    xor-int v7, v4, v22

    mul-int/lit16 v7, v7, 0x371d

    const v11, 0x6d446337

    xor-int/2addr v7, v11

    const v11, 0x73418eb6

    goto :goto_6

    .line 1164
    :sswitch_b
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v6, v4}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v6, v13}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 805
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v4, "\u073a\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v22

    xor-int v7, v4, v23

    mul-int/lit16 v7, v7, -0x6557

    const v11, 0x3ee737a5

    xor-int/2addr v7, v11

    const v11, 0x38a1c317

    :goto_6
    xor-int/2addr v4, v11

    goto/16 :goto_1

    :sswitch_c
    move-object v4, v6

    .line 1166
    iget-wide v6, v0, Ll/ۙᩴ᩷;->֫:J

    invoke-static {v6, v7}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, Ll/ۙᩴ᩷;->᩷:Ljava/lang/String;

    :goto_7
    const-string v6, "\u06ec\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v22, v6

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, -0x3595

    const v11, 0x395ef0f4

    xor-int/2addr v7, v11

    const v11, -0x67277fef

    goto/16 :goto_a

    :sswitch_d
    move-object v4, v6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-static {v5, v6}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5, v13}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 415
    sget v6, Ll/ۛ;->᩺᩻֫:I

    if-ltz v6, :cond_9

    :goto_8
    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    goto/16 :goto_c

    :cond_9
    const-string v6, "\u073f\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, 0x148d

    const v11, 0xe0922a7

    xor-int/2addr v7, v11

    const v11, -0x11ba75dd

    goto/16 :goto_a

    :sswitch_e
    move-object v4, v6

    if-ge v3, v12, :cond_a

    const-string v6, "\u0730\u0730"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, 0x43f3

    const v11, 0x632cf167

    xor-int/2addr v7, v11

    const v11, -0x3570211d    # -4714353.5f

    goto :goto_a

    :cond_a
    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move-wide/from16 v14, v19

    goto/16 :goto_b

    :sswitch_f
    move-object v4, v6

    .line 1160
    sget-object v6, Ll/ۙᩴ᩷;->ܰ᩺᩺:[S

    const/4 v7, 0x1

    const/4 v11, 0x3

    invoke-static {v6, v7, v11, v2}, Ll/֫᩹;->᩻۟ۤ([SIII)Ljava/lang/String;

    move-result-object v13

    cmp-long v6, v14, v26

    if-eqz v6, :cond_b

    const-string v6, "\u1a7a\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, 0x2bb1

    const v11, -0x68912df0

    xor-int/2addr v7, v11

    const v11, -0x372cda03

    goto :goto_a

    :cond_b
    const-string v6, "\u1a78\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    xor-int v7, v6, v23

    mul-int/lit16 v7, v7, -0x2f13

    const v11, -0x548bcd8c

    xor-int/2addr v7, v11

    const v11, -0x7b992da6

    goto :goto_a

    :sswitch_10
    move-object v4, v6

    .line 1159
    array-length v3, v8

    const/4 v6, 0x0

    move v12, v3

    move-wide/from16 v19, v26

    const/4 v3, 0x0

    :goto_9
    const-string v6, "\u1a7a\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v23

    xor-int v7, v6, v22

    mul-int/lit16 v7, v7, -0x739b

    const v11, -0x6fff3064

    xor-int/2addr v7, v11

    const v11, -0x7ee20387

    :goto_a
    xor-int/2addr v6, v11

    move/from16 v28, v6

    move-object v6, v4

    move/from16 v4, v28

    goto/16 :goto_1

    :sswitch_11
    move-object v4, v6

    move-wide/from16 v6, v17

    .line 1155
    iput-wide v6, v0, Ll/ۙᩴ᩷;->֫:J

    move-object/from16 v11, v16

    .line 1157
    iget-object v8, v11, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    const-wide/16 v26, 0x0

    if-eqz v8, :cond_c

    const-string v16, "\u05a1\u06e8"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v23

    mul-int/lit8 v16, v16, -0x31

    xor-int v9, v16, v22

    mul-int/lit16 v9, v9, 0x7ebd

    const v18, 0x61ae6819

    xor-int v9, v9, v18

    const v18, -0x50f373f9

    xor-int v16, v16, v18

    move-wide/from16 v17, v6

    move v7, v9

    const/4 v9, 0x0

    move-object v6, v4

    move/from16 v4, v16

    goto/16 :goto_12

    :cond_c
    move-wide/from16 v14, v26

    const/4 v9, 0x0

    :goto_b
    const-string v16, "\u1a7a\u1a78"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v22

    move/from16 v17, v2

    xor-int v2, v16, v23

    mul-int/lit16 v2, v2, -0x1b3b

    const v18, 0x16c548ee

    xor-int v2, v2, v18

    const v18, 0x1c0451c6

    xor-int v16, v16, v18

    move-wide/from16 v28, v6

    move v7, v2

    move-object v6, v4

    move/from16 v4, v16

    move/from16 v2, v17

    move-wide/from16 v17, v28

    goto/16 :goto_12

    :sswitch_12
    move/from16 v17, v2

    move-object v4, v6

    move-object/from16 v11, v16

    .line 1154
    iget-object v2, v11, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 1155
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v6

    .line 444
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v2

    if-eqz v2, :cond_d

    move/from16 v16, v3

    move-object v2, v11

    goto/16 :goto_d

    :cond_d
    const-string v2, "\u1a78\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    move/from16 v16, v3

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, 0x11df

    const v18, 0x5d84ce83

    xor-int v3, v3, v18

    const v18, 0x5ee4dab9

    goto/16 :goto_11

    :sswitch_13
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    .line 1151
    iget v2, v11, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    iput v2, v0, Ll/ۙᩴ᩷;->ۖ:I

    .line 1152
    invoke-static {v11}, Ll/ᩴܶۡ;->֫(Landroid/content/pm/ApplicationInfo;)I

    move-result v2

    iput v2, v0, Ll/ۙᩴ᩷;->ۢ:I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v2

    if-gtz v2, :cond_e

    :goto_c
    const-string v2, "\u06d6\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, -0x4553

    const v18, 0x6a1235ca

    xor-int v3, v3, v18

    const v18, 0x17c0f470

    goto/16 :goto_11

    :cond_e
    const-string v2, "\u06df\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v23

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, -0x201d

    const v18, 0x75c8e664

    xor-int v3, v3, v18

    const v18, 0x14e46086

    goto/16 :goto_11

    :sswitch_14
    move/from16 v16, v3

    move-object v4, v6

    move-wide/from16 v6, v17

    move/from16 v17, v2

    .line 1149
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v2}, Ll/ۗۚ;->ܶۚ᩻(Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_f

    :goto_d
    move-wide/from16 v28, v6

    move-object v6, v4

    goto/16 :goto_4

    :goto_e
    const-string v7, "\u06e2\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int v7, v7, v22

    mul-int/lit8 v7, v7, 0x35

    xor-int v11, v7, v23

    mul-int/lit16 v11, v11, -0x6d0d

    const v18, 0x382ef05

    xor-int v11, v11, v18

    const v18, 0x3907b566

    xor-int v7, v7, v18

    move/from16 v28, v16

    move-object/from16 v16, v2

    move/from16 v2, v17

    move-wide/from16 v17, v3

    move v4, v7

    move v7, v11

    goto :goto_f

    :cond_f
    const-string v3, "\u06d8\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v22

    mul-int/lit8 v3, v3, -0x23

    xor-int v11, v3, v23

    mul-int/lit16 v11, v11, 0x29e1

    const v18, -0x61ee9b52

    xor-int v11, v11, v18

    const v18, -0x5c7a3acd

    xor-int v3, v3, v18

    move/from16 v28, v16

    move-object/from16 v16, v2

    move/from16 v2, v17

    move-wide/from16 v17, v6

    move v7, v11

    move-object v6, v4

    move v4, v3

    :goto_f
    move/from16 v3, v28

    goto/16 :goto_1

    :sswitch_15
    move-object v4, v6

    move-object/from16 v11, v16

    move-wide/from16 v6, v17

    move/from16 v17, v2

    move/from16 v16, v3

    .line 1146
    iput-object v1, v0, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    .line 1147
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v2, v0, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    .line 914
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-gtz v2, :cond_10

    :goto_10
    const-string v2, "\u06df\u06ec"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v22

    mul-int/lit8 v2, v2, 0x51

    xor-int v3, v2, v23

    mul-int/lit16 v3, v3, -0x1435

    const v18, 0x7e249f18

    xor-int v3, v3, v18

    const v18, 0x10ccad54

    goto :goto_11

    :cond_10
    const-string v2, "\u06d6\u1a73"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v23, v2

    mul-int/lit8 v2, v2, -0x5f

    xor-int v3, v2, v22

    mul-int/lit16 v3, v3, 0x50fb

    const v18, 0x4af7c0a

    xor-int v3, v3, v18

    const v18, 0x73b4ef9e

    :goto_11
    xor-int v2, v2, v18

    move-object/from16 v28, v4

    move v4, v2

    move/from16 v2, v17

    move-wide/from16 v17, v6

    move v7, v3

    move-object/from16 v6, v28

    move/from16 v3, v16

    :goto_12
    move-object/from16 v16, v11

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7e5b82ff -> :sswitch_2
        -0x7d7a8bad -> :sswitch_8
        -0x7515075b -> :sswitch_1
        -0x71555c96 -> :sswitch_13
        -0x630c4231 -> :sswitch_b
        -0x5ba447a5 -> :sswitch_f
        -0x5a831467 -> :sswitch_9
        -0x539740db -> :sswitch_b
        -0x4fc63f4b -> :sswitch_d
        -0x4ec10b86 -> :sswitch_9
        -0x4b55947c -> :sswitch_14
        -0x42362251 -> :sswitch_2
        -0x36fb496a -> :sswitch_15
        -0x33829cdf -> :sswitch_e
        -0x317f00a9 -> :sswitch_c
        -0x2ac2e88e -> :sswitch_e
        -0x2776f64b -> :sswitch_a
        -0x25e6bab9 -> :sswitch_c
        -0x21379a6a -> :sswitch_10
        -0x17859878 -> :sswitch_14
        -0x159ec8c7 -> :sswitch_d
        -0x11ba546c -> :sswitch_4
        0x6b0a278 -> :sswitch_8
        0xcfd1046 -> :sswitch_a
        0xdbdb0b5 -> :sswitch_7
        0x13b5150e -> :sswitch_12
        0x1547e258 -> :sswitch_5
        0x1d8934f2 -> :sswitch_3
        0x239c04ca -> :sswitch_0
        0x285b37d0 -> :sswitch_f
        0x2d63a449 -> :sswitch_0
        0x30a92711 -> :sswitch_5
        0x40c71f6c -> :sswitch_12
        0x4a4523b7 -> :sswitch_10
        0x543aac95 -> :sswitch_15
        0x549a2c47 -> :sswitch_6
        0x550ed638 -> :sswitch_6
        0x573b93e3 -> :sswitch_7
        0x5a44e66e -> :sswitch_4
        0x63ffecfd -> :sswitch_11
        0x69722223 -> :sswitch_3
        0x6abbc8f6 -> :sswitch_11
        0x74cf1a4a -> :sswitch_13
        0x7d945b69 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3735d9f1

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    const-string v4, "\u06df\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x358b

    const v6, -0x1bbb1284

    xor-int/2addr v5, v6

    const v6, -0x6885ec68

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x236b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 611
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_4

    goto/16 :goto_1

    .line 76
    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    :sswitch_1
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v4, :cond_7

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_1

    .line 388
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    const/4 v0, 0x0

    return-object v0

    .line 1174
    :sswitch_5
    iput-object v0, p0, Ll/ۙᩴ᩷;->ܽ:Ljava/lang/String;

    goto/16 :goto_5

    :sswitch_6
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a7b\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2787

    const v6, -0x6915c599

    xor-int/2addr v5, v6

    const v6, 0x4f8c1e1e    # 4.701568E9f

    goto :goto_0

    .line 587
    :sswitch_7
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u073d\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5dab

    const v6, -0xb5b5408

    xor-int/2addr v5, v6

    const v6, 0x68acc6f6

    goto :goto_0

    .line 1002
    :sswitch_8
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e7\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x8c1

    const v6, 0x5952568e

    xor-int/2addr v5, v6

    const v6, 0x633ba3de

    goto/16 :goto_0

    .line 1113
    :sswitch_9
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u06e2\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d1d

    const v6, 0x2b8d6574

    xor-int/2addr v5, v6

    const v6, 0x73d1b389

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a78\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x64cd

    const v6, 0x78e5d324

    xor-int/2addr v5, v6

    const v6, 0x4b8aa900    # 1.8174464E7f

    goto/16 :goto_0

    .line 130
    :sswitch_a
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_5

    :goto_1
    const-string v4, "\u06db\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x979

    const v6, 0x3cf105cc

    xor-int/2addr v5, v6

    const v6, 0x2296bf29

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e7\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6fff

    const v6, 0xdfb1418

    xor-int/2addr v5, v6

    const v6, -0x582042a

    goto/16 :goto_0

    .line 86
    :sswitch_b
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u0733\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5155

    const v6, 0x507888be

    xor-int/2addr v5, v6

    const v6, -0x6beff111

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x641d

    const v6, -0x355e5dab    # -5296426.5f

    xor-int/2addr v5, v6

    const v6, 0x58fc9369

    goto/16 :goto_0

    .line 617
    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u06d6\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4081

    const v6, -0x27dfb226

    xor-int/2addr v5, v6

    const v6, -0x55625ea2    # -2.8000773E-13f

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a75\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x507d

    const v6, 0x85b1fd5

    xor-int/2addr v5, v6

    const v6, -0x41ff005f

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u06e1\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x24d7

    const v6, -0x4557ec8f

    xor-int/2addr v5, v6

    const v6, 0x2fd0ad12

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a75\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1b67

    const v6, -0x631ae2c4

    xor-int/2addr v5, v6

    const v6, 0x6ca70591

    goto/16 :goto_0

    .line 1174
    :sswitch_e
    iget-object v0, p0, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    invoke-static {v0}, Ll/ۙܶۡ;->֫(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v0

    .line 324
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_c

    :cond_b
    const-string v4, "\u05a1\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7af

    const v6, 0x540e7b6f

    xor-int/2addr v5, v6

    const v6, -0x20ac33b2

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4aff

    const v6, -0x6427326c

    xor-int/2addr v5, v6

    const v6, -0x2a3ea90f

    goto/16 :goto_0

    .line 1176
    :sswitch_f
    iget-object v0, p0, Ll/ۙᩴ᩷;->ܽ:Ljava/lang/String;

    return-object v0

    .line 1173
    :sswitch_10
    iget-object v4, p0, Ll/ۙᩴ᩷;->ܽ:Ljava/lang/String;

    if-nez v4, :cond_d

    const-string v4, "\u05ab\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2f8b

    const v6, -0x5b280de

    xor-int/2addr v5, v6

    const v6, 0x2f9fa198

    goto/16 :goto_0

    :cond_d
    :goto_5
    const-string v4, "\u0736\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5c1d

    const v6, -0x59abc100

    xor-int/2addr v5, v6

    const v6, 0x3fe1b2ee    # 1.763273f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77252444 -> :sswitch_2
        -0x6b102c71 -> :sswitch_5
        -0x65278efe -> :sswitch_1
        -0x636dacac -> :sswitch_0
        -0x5b89a010 -> :sswitch_7
        -0x44943bbc -> :sswitch_4
        -0x37f9057c -> :sswitch_6
        -0x3549b35f -> :sswitch_b
        -0x331ea6a7 -> :sswitch_6
        -0x1f59ba61 -> :sswitch_a
        -0x1f3de2f0 -> :sswitch_f
        -0x178c6f18 -> :sswitch_10
        -0xf6050ca -> :sswitch_c
        -0xf0cd882 -> :sswitch_3
        -0x6175829 -> :sswitch_1
        0x924c9cc -> :sswitch_e
        0x97c33ec -> :sswitch_7
        0xae2e543 -> :sswitch_d
        0x16b2009d -> :sswitch_10
        0x17c0ae16 -> :sswitch_5
        0x26a799aa -> :sswitch_8
        0x36f9688a -> :sswitch_4
        0x3e4b5a82 -> :sswitch_a
        0x3f4dd059 -> :sswitch_d
        0x408c787b -> :sswitch_3
        0x41c4c7f2 -> :sswitch_0
        0x48613e16 -> :sswitch_f
        0x4a1fe053 -> :sswitch_c
        0x556ab170 -> :sswitch_8
        0x59ffa3af -> :sswitch_9
        0x6d324c9f -> :sswitch_9
        0x758d9b2d -> :sswitch_e
        0x75be2c7a -> :sswitch_2
        0x7fc83a34 -> :sswitch_b
    .end sparse-switch
.end method

.method public final ֫(Z)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x7ce09634

    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v9, "\u073d\u06e1"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x29f3

    const v11, 0x5cdf2858

    xor-int/2addr v10, v11

    const v11, 0x3f0fd403

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x2bc3

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    return-void

    .line 336
    :sswitch_0
    sget v9, Ll/ۗ᩵;->֫۠۟:I

    if-gez v9, :cond_8

    goto/16 :goto_4

    .line 965
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v9, Ll/֡۬;->۠֡᩶:I

    if-lez v9, :cond_d

    goto/16 :goto_4

    :sswitch_2
    sget v9, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v9, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v9, "\u05a8\u06e8"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x62d5

    const v11, -0x3f454530

    xor-int/2addr v10, v11

    const v11, 0x6d75c362

    goto :goto_0

    .line 518
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto/16 :goto_4

    .line 786
    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    return-void

    :sswitch_5
    add-int/2addr v4, v5

    .line 1183
    iput v4, v3, Ll/ۗᩴ᩷;->ۧ:I

    return-void

    :sswitch_6
    const/4 v5, 0x1

    sget v9, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v9, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v9, "\u06e7\u06e1"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x4f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x49e3

    const v11, 0x1e548d04

    xor-int/2addr v10, v11

    const v11, 0x19099c9f

    goto :goto_0

    :sswitch_7
    iget-object v3, p0, Ll/ۙᩴ᩷;->ۧ:Ll/ۗᩴ᩷;

    iget v4, v3, Ll/ۗᩴ᩷;->ۧ:I

    .line 714
    sget v9, Ll/᩺;->ۙۛܶ:I

    if-gtz v9, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v9, "\u06e7\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x270d

    const v11, 0x2ba4a580

    xor-int/2addr v10, v11

    const v11, 0x5c750fc5

    goto :goto_0

    :sswitch_8
    add-int v9, v1, v2

    .line 1185
    iput v9, v0, Ll/ۗᩴ᩷;->ۧ:I

    goto/16 :goto_1

    :sswitch_9
    const/4 v2, -0x1

    .line 827
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v9

    if-ltz v9, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v9, "\u06d8\u06d6"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5ec9

    const v11, 0x71c7361e

    xor-int/2addr v10, v11

    const v11, -0x35f5357a    # -2273953.5f

    goto/16 :goto_0

    .line 1185
    :sswitch_a
    iget-object v0, p0, Ll/ۙᩴ᩷;->ۧ:Ll/ۗᩴ᩷;

    iget v1, v0, Ll/ۗᩴ᩷;->ۧ:I

    .line 269
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v9

    if-eqz v9, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v9, "\u06e4\u1a76"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3725

    const v11, -0x1de2122e

    xor-int/2addr v10, v11

    const v11, 0x1e2d4d33

    goto/16 :goto_0

    .line 1181
    :sswitch_b
    iput-boolean p1, p0, Ll/ۙᩴ᩷;->ܿ:Z

    if-eqz p1, :cond_5

    const-string v9, "\u06dc\u05a8"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x3b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xcd9

    const v11, 0x4b0abf91    # 9093009.0f

    xor-int/2addr v10, v11

    const v11, -0x11019ee0

    goto/16 :goto_0

    :cond_5
    const-string v9, "\u1a7b\u06df"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7b45

    const v11, -0x2979578a

    xor-int/2addr v10, v11

    const v11, 0x7640aad

    goto/16 :goto_0

    .line 1180
    :sswitch_c
    iget-boolean v9, p0, Ll/ۙᩴ᩷;->ܿ:Z

    if-eq v9, p1, :cond_6

    const-string v9, "\u1a7b\u073d"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x1d

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x9dd

    const v11, -0x6c9037f6

    xor-int/2addr v10, v11

    const v11, 0x3ccad793

    goto/16 :goto_0

    :cond_6
    :goto_1
    const-string v9, "\u0736\u06d6"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x41

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5b7b

    const v11, 0x7ae4cee6

    xor-int/2addr v10, v11

    const v11, 0x4cdaaac9    # 1.14644552E8f

    goto/16 :goto_0

    .line 661
    :sswitch_d
    sget v9, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v9, :cond_7

    goto :goto_3

    :cond_7
    const-string v9, "\u06d9\u1a7a"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1b3

    const v11, -0x1ec552e1

    xor-int/2addr v10, v11

    const v11, 0x5a5258e6

    goto/16 :goto_0

    .line 458
    :sswitch_e
    sget v9, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v9, :cond_9

    :cond_8
    :goto_2
    const-string v9, "\u06dc\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x2b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x13b7

    const v11, 0x4e76c6a5

    xor-int/2addr v10, v11

    const v11, -0x59ec86d8

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u1a74\u1a7b"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x3f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4a0b

    const v11, -0x739ccad5

    xor-int/2addr v10, v11

    const v11, -0x6869596f

    goto/16 :goto_0

    .line 1084
    :sswitch_f
    sget-boolean v9, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v9, :cond_a

    goto :goto_3

    :cond_a
    const-string v9, "\u06e0\u1a78"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x67

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2ea7

    const v11, 0x43f20d61

    xor-int/2addr v10, v11

    const v11, -0x7b8f7c7c

    goto/16 :goto_0

    .line 867
    :sswitch_10
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v9

    if-nez v9, :cond_b

    :goto_3
    const-string v9, "\u06e0\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x73bb

    const v11, -0x246ad6ce

    xor-int/2addr v10, v11

    const v11, -0x492e59dc

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06eb\u073f"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xc03

    const v11, -0x7336d10f

    xor-int/2addr v10, v11

    const v11, 0x598a4a89

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v9, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v9, :cond_c

    :goto_4
    const-string v9, "\u06e0\u05a8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x31

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3cab

    const v11, 0x7ba41396

    xor-int/2addr v10, v11

    const v11, -0x7cf2c047

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u05a8\u05ab"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x17f7

    const v11, 0x60330eaa

    xor-int/2addr v10, v11

    const v11, -0x17c36e82

    goto/16 :goto_0

    .line 720
    :sswitch_12
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v9

    if-gtz v9, :cond_e

    :cond_d
    :goto_5
    const-string v9, "\u1a7b\u06da"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5425

    const v11, -0x1dd1cde4

    xor-int/2addr v10, v11

    const v11, -0x42a09227

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06d9\u06ec"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x33

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x745b

    const v11, 0x3ad8703a

    xor-int/2addr v10, v11

    const v11, -0x69885daf    # -2.0003719E-25f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b3c56b4 -> :sswitch_1
        -0x7a4e69bc -> :sswitch_5
        -0x7829bd72 -> :sswitch_9
        -0x7363d5ed -> :sswitch_8
        -0x590b3318 -> :sswitch_12
        -0x4dcad959 -> :sswitch_f
        -0x4a6c7262 -> :sswitch_9
        -0x410a4126 -> :sswitch_10
        -0x3b283955 -> :sswitch_11
        -0x39e43e94 -> :sswitch_12
        -0x2c8d42b0 -> :sswitch_2
        -0x1fe7188c -> :sswitch_0
        -0x1e53df03 -> :sswitch_0
        -0x1b4ce0a2 -> :sswitch_6
        -0x17f29344 -> :sswitch_a
        -0x16017caa -> :sswitch_b
        -0x146a333f -> :sswitch_2
        -0x1415858e -> :sswitch_1
        -0x125b8dd8 -> :sswitch_4
        -0x1145ca27 -> :sswitch_7
        -0xab0da17 -> :sswitch_d
        -0x66e9b4e -> :sswitch_e
        -0x5e0d072 -> :sswitch_4
        0xbdf8ea -> :sswitch_c
        0xabc650c -> :sswitch_6
        0xc9b2c80 -> :sswitch_c
        0xf430d9a -> :sswitch_f
        0x15cf3652 -> :sswitch_7
        0x19230022 -> :sswitch_b
        0x212d0fbd -> :sswitch_3
        0x3bbcef85 -> :sswitch_3
        0x51aeabce -> :sswitch_a
        0x53f1efd7 -> :sswitch_8
        0x5b8ef813 -> :sswitch_10
        0x63fe6d26 -> :sswitch_5
        0x66e0399e -> :sswitch_11
        0x70b4c615 -> :sswitch_e
        0x73a53e49 -> :sswitch_d
    .end sparse-switch
.end method
