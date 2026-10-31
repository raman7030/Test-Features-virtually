.class public final synthetic Ll/᩷ۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۖۖۛ:[S


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ۘۡ;->ۖۖۛ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1db8s
        -0x6ec6s
        -0x7af6s
        0x7e77s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x4951b05c

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    sget v2, Ll/֡۬;->۠֡᩶:I

    .line 0
    iput p1, p0, Ll/᩷ۘۡ;->᩸:I

    iput-object p2, p0, Ll/᩷ۘۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a78\u06e2"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6333

    const v3, 0x5eed4650

    xor-int/2addr p2, v3

    const v3, -0x3c91af90

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4e25

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget p1, Ll/ۨ;->᩺᩷ۚ:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a79\u06d6"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x5

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1de1

    const v3, 0xca4ccc9

    xor-int/2addr p2, v3

    const v3, 0x3ca45a6b

    goto :goto_0

    .line 2
    :sswitch_1
    sget p1, Ll/ۖ;->᩹۟ۘ:I

    if-gez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u1a74\u073f"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x3f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0xe43

    const v3, 0x3f0b14a9

    xor-int/2addr p2, v3

    const v3, -0x5377799d

    goto :goto_0

    .line 3
    :sswitch_2
    sget-boolean p1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06da\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x58eb

    const v3, -0x754b198e

    xor-int/2addr p2, v3

    const v3, -0xe622ba3

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :goto_2
    const-string p1, "\u1a75\u06e8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x511d

    const v3, 0xfe0c6ee

    xor-int/2addr p2, v3

    const v3, 0x3110a7c4

    goto :goto_0

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u0736\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2fd

    const v3, 0xdb7f9d3

    xor-int/2addr p2, v3

    const v3, 0x8ba3aac

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a77\u073f"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x34a1

    const v3, -0x1c051787

    xor-int/2addr p2, v3

    const v3, 0xa486336

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75edd152 -> :sswitch_3
        -0x7596db7c -> :sswitch_1
        -0x726e9c57 -> :sswitch_2
        -0x2e1fe306 -> :sswitch_0
        -0x2e13af11 -> :sswitch_0
        -0x17baef0f -> :sswitch_4
        0x19f6283c -> :sswitch_2
        0x1a3be73c -> :sswitch_5
        0x28cb833c -> :sswitch_3
        0x3552d33b -> :sswitch_5
        0x400c221d -> :sswitch_1
        0x45bc3403 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
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

    const v15, 0x7abbece6

    sget v16, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v17, Ll/֡֡;->֫ۤܳ:I

    const-string v18, "\u06df\u1a73"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v17

    mul-int/lit8 v18, v18, 0x11

    xor-int v1, v18, v16

    mul-int/lit16 v1, v1, 0x5829

    const v20, -0x7b49fcb2

    xor-int v1, v1, v20

    const v20, -0x6a7143da

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x7abbece6

    :goto_0
    xor-int v5, v18, v16

    mul-int/lit16 v5, v5, -0x1bfd

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int/2addr v1, v9

    if-ltz v1, :cond_4

    const-string v1, "\u06d9\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x5833

    const v19, 0x3c6fb0ea

    xor-int v5, v5, v19

    const v19, -0x43b14e17

    goto/16 :goto_6

    .line 12
    :sswitch_0
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v1, :cond_b

    goto/16 :goto_3

    .line 200
    :sswitch_1
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_5

    goto/16 :goto_5

    .line 302
    :sswitch_2
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_7

    goto/16 :goto_5

    .line 83
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_5

    .line 38
    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    return-void

    .line 7
    :sswitch_5
    iget-object v1, v0, Ll/᩷ۘۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/ۗ᩵ۡ;

    .line 12
    invoke-static {v1}, Ll/ۗ᩵ۡ;->ܽ(Ll/ۗ᩵ۡ;)V

    return-void

    :sswitch_6
    xor-int v1, v3, v4

    .line 335
    invoke-virtual {v2, v1}, Landroid/view/Window;->setWindowAnimations(I)V

    return-void

    .line 17
    :sswitch_7
    invoke-static {v13, v14, v15, v12}, Ll/ۘۘ;->᩻ۙܿ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7e889c0b

    .line 173
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x33

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x3d85

    const v19, -0x7856d259

    xor-int v5, v5, v19

    const v19, 0x6e6607d

    goto/16 :goto_6

    :sswitch_8
    const/4 v14, 0x1

    const/4 v15, 0x3

    .line 164
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v1, "\u1a78\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6d1

    const v19, 0x7f17b5c0

    xor-int v5, v5, v19

    const v19, -0x23ed08b3

    goto/16 :goto_6

    .line 17
    :sswitch_9
    sget-object v13, Ll/᩷ۘۡ;->ۖۖۛ:[S

    .line 207
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v1

    if-gtz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u05ab\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x2d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x203b

    const v19, -0x6a935ae1

    xor-int v5, v5, v19

    const v19, 0x584d1234

    goto/16 :goto_6

    .line 15
    :sswitch_a
    iget-object v1, v0, Ll/᩷ۘۡ;->᩹:Ljava/lang/Object;

    .line 17
    move-object v2, v1

    check-cast v2, Landroid/view/Window;

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v1, "\u05ab\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x949

    const v19, 0x1b5027d3

    xor-int v5, v5, v19

    const v19, 0x401ec9c2

    goto/16 :goto_6

    .line 2
    :sswitch_b
    iget v1, v0, Ll/᩷ۘۡ;->᩸:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u05a8\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x4ee5

    const v19, -0x1497dd80

    xor-int v5, v5, v19

    const v19, -0x50978ee2

    goto/16 :goto_6

    :pswitch_0
    const-string v1, "\u06db\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x16fb

    const v19, 0x1970ae02

    xor-int v5, v5, v19

    const v19, -0x1c732f66

    goto/16 :goto_6

    :sswitch_c
    const/16 v1, 0x2cd6

    const/16 v12, 0x2cd6

    goto :goto_1

    :sswitch_d
    const v1, 0xf842

    const v12, 0xf842

    :goto_1
    const-string v1, "\u06d6\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x4499

    const v19, 0x6751c2a2

    xor-int v5, v5, v19

    const v19, 0x37efb3f

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u1a79\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x39

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6ac7

    const v19, -0x6984a53d

    xor-int v5, v5, v19

    const v19, 0x587cfe50

    goto/16 :goto_6

    :sswitch_e
    const v11, 0x249ca90

    .line 185
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v1

    if-gtz v1, :cond_6

    :cond_5
    :goto_2
    const-string v1, "\u1a75\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x7d27

    const v19, -0x64d2cd19

    xor-int v5, v5, v19

    const v19, -0x76e99738

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06d8\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x1d49

    const v19, 0xe936468

    xor-int v5, v5, v19

    const v19, 0x6d22da90

    goto/16 :goto_6

    :sswitch_f
    mul-int v9, v8, v8

    mul-int v10, v7, v7

    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_8

    :cond_7
    :goto_3
    const-string v1, "\u0730\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x3477

    const v19, 0x54a21fc4

    xor-int v5, v5, v19

    const v19, 0xf2dc845

    goto/16 :goto_6

    :cond_8
    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6651

    const v19, 0x77eb0949

    xor-int v5, v5, v19

    const v19, 0x3955538

    goto/16 :goto_6

    :sswitch_10
    add-int/lit16 v8, v7, 0x1834

    .line 159
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_9

    const-string v1, "\u1a77\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x65

    xor-int v5, v1, v16

    mul-int/lit8 v5, v5, 0x71

    const v19, -0x1e769ac4

    xor-int v5, v5, v19

    const v19, -0x3d312fd3

    goto/16 :goto_6

    :cond_9
    const-string v1, "\u06eb\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x35e1

    const v19, 0x110ecbc3

    xor-int v5, v5, v19

    const v19, 0x397d4aef

    goto/16 :goto_6

    :sswitch_11
    aget-short v7, v20, v6

    .line 188
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u06da\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x77

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x360d

    const v19, -0x2cf20989

    xor-int v5, v5, v19

    const v19, 0x4030c1d1

    goto :goto_6

    :sswitch_12
    const/4 v6, 0x0

    .line 215
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x2f4d

    const v19, -0x1530a

    xor-int v5, v5, v19

    const v19, 0x283ded20

    goto :goto_6

    :cond_c
    const-string v1, "\u0733\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0xa63

    const v19, -0x976c57

    xor-int v5, v5, v19

    const v19, -0x9b4c74d

    goto :goto_6

    :sswitch_13
    sget-object v20, Ll/᩷ۘۡ;->ۖۖۛ:[S

    .line 9
    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_d

    :goto_5
    const-string v1, "\u06e7\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x5b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5469

    const v19, 0x1e8e0f0f

    xor-int v5, v5, v19

    const v19, 0x72353a94

    goto :goto_6

    :cond_d
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x7c09

    const v19, -0x3a70beb7

    xor-int v5, v5, v19

    const v19, -0x3bffa165

    :goto_6
    xor-int v19, v1, v19

    move v1, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6910fe97 -> :sswitch_0
        -0x671f6f69 -> :sswitch_7
        -0x6634ff0b -> :sswitch_e
        -0x5fa496cf -> :sswitch_6
        -0x5c666ccc -> :sswitch_1
        -0x50ce6b51 -> :sswitch_1
        -0x4d26a0ec -> :sswitch_f
        -0x4c23aa73 -> :sswitch_5
        -0x4be52fdf -> :sswitch_a
        -0x43449de7 -> :sswitch_9
        -0x4327739f -> :sswitch_4
        -0x2c65f0e1 -> :sswitch_8
        -0x2b1b97ba -> :sswitch_6
        -0x284498b3 -> :sswitch_3
        -0x21598bbb -> :sswitch_0
        -0x1882658a -> :sswitch_c
        -0x16842b51 -> :sswitch_5
        -0x162ac614 -> :sswitch_2
        -0xc77cf4e -> :sswitch_3
        -0x8c97fd5 -> :sswitch_c
        -0x68dde31 -> :sswitch_b
        -0xcf6bf3 -> :sswitch_e
        0x2b19b9e -> :sswitch_2
        0x199d76bc -> :sswitch_d
        0x20b4a504 -> :sswitch_7
        0x25f11e11 -> :sswitch_12
        0x2ae74767 -> :sswitch_4
        0x2df567f4 -> :sswitch_13
        0x2fa3f0f0 -> :sswitch_10
        0x3116494c -> :sswitch_10
        0x32e2a71a -> :sswitch_b
        0x37eaa294 -> :sswitch_d
        0x3aeddabc -> :sswitch_11
        0x4fa44a21 -> :sswitch_12
        0x52886489 -> :sswitch_13
        0x5c0e2f0d -> :sswitch_9
        0x6828c392 -> :sswitch_a
        0x68d10fce -> :sswitch_11
        0x6d628667 -> :sswitch_f
        0x7e5b43e0 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
