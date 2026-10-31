.class public Ll/ۜۖ᩷;
.super Landroid/content/BroadcastReceiver;
.source "C14K"


# static fields
.field private static final ۛᩴ۟:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    return-void

    :array_0
    .array-data 2
        0x62as
        -0x1342s
        -0x134fs
        -0x134cs
        -0x1353s
        -0x1341s
        -0x134es
        -0x1344s
        -0x1351s
        -0x1347s
        -0x1350s
        -0x1357s
        -0x130ds
        -0x1342s
        -0x134fs
        -0x134cs
        -0x1353s
        -0x1353s
        -0x1348s
        -0x1351s
        -0x130ds
        -0x1352s
        -0x1348s
        -0x1357s
        -0x1350s
        -0x1357s
        -0x130ds
        -0x1342s
        -0x134fs
        -0x134cs
        -0x1353s
        -0x1353s
        -0x1348s
        -0x1351s
        -0x130ds
        -0x1346s
        -0x1348s
        -0x1357s
        -0x1357s
        -0x1348s
        -0x135bs
        -0x1357s
        -0x136ds
        -0x134es
        -0x1303s
        -0x1357s
        -0x1348s
        -0x135bs
        -0x1357s
        -0x1303s
        -0x134cs
        -0x1352s
        -0x1303s
        -0x1353s
        -0x1351s
        -0x134es
        -0x1355s
        -0x134cs
        -0x1347s
        -0x1348s
        -0x1347s
        -0x130ds
        -0x1303s
        -0x1378s
        -0x1352s
        -0x1348s
        -0x1303s
        -0x1310s
        -0x1348s
        -0x1303s
        -0x1357s
        -0x1348s
        -0x135bs
        -0x1357s
        -0x1303s
        -0x1301s
        -0x1357s
        -0x1348s
        -0x135bs
        -0x1357s
        -0x1303s
        -0x1357s
        -0x134es
        -0x1303s
        -0x1341s
        -0x1348s
        -0x1303s
        -0x1353s
        -0x1344s
        -0x1352s
        -0x1357s
        -0x1348s
        -0x1347s
        -0x1301s
        -0x60abs
        -0x4d6as
        -0x67aas
        -0x1329s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 25

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

    const v18, -0x3ea84bc7

    sget v19, Ll/ۖ;->᩹۟ۘ:I

    sget v20, Ll/֡᩺;->ᩴ᩹ۛ:I

    const-string v21, "\u05a1\u0730"

    invoke-static/range {v21 .. v21}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, -0x42dd

    const v23, 0xc730401

    xor-int v1, v1, v23

    const v23, -0x37e79651

    xor-int v21, v21, v23

    move-object v5, v4

    move-object/from16 v13, v16

    move/from16 v22, v21

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, -0x3ea84bc7

    const/16 v23, 0x0

    move-object v4, v3

    move-object/from16 v16, v10

    move-object v3, v2

    move-object v10, v9

    const/4 v2, 0x0

    move-object v9, v8

    move-object v8, v7

    const/4 v7, 0x0

    :goto_0
    xor-int v12, v21, v20

    mul-int/lit16 v12, v12, 0x5a1f

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v1, v12

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    .line 34
    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7eaf9b49

    xor-int/2addr v1, v2

    .line 35
    invoke-static {v1}, Ll/ۘܿ;->ۛ֫᩹(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    .line 15
    :sswitch_0
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v1, :cond_1

    :cond_0
    move-object/from16 v0, p1

    move-object v1, v2

    move-object/from16 v2, p2

    goto/16 :goto_c

    :cond_1
    move-object v1, v2

    move/from16 v22, v15

    :goto_1
    move-object/from16 v2, p2

    goto/16 :goto_e

    .line 24
    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v1

    if-gtz v1, :cond_2

    :goto_2
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    goto/16 :goto_9

    :cond_2
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    goto/16 :goto_8

    :sswitch_2
    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v1, :cond_0

    goto :goto_2

    .line 29
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto :goto_2

    .line 7
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    return-void

    .line 43
    :sswitch_5
    invoke-virtual {v0, v7}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    sget-object v12, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    move/from16 v22, v15

    const/16 v15, 0x61

    .line 17
    sget v24, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v24, :cond_3

    move-object v1, v2

    goto :goto_1

    :cond_3
    move-object/from16 v24, v2

    const/4 v2, 0x1

    .line 44
    invoke-static {v12, v15, v2, v11}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v12

    if-eqz v12, :cond_4

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    :goto_3
    move/from16 v15, v22

    move-object/from16 v1, v24

    goto/16 :goto_c

    .line 44
    :cond_4
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    :sswitch_6
    move-object/from16 v24, v2

    move/from16 v22, v15

    .line 46
    invoke-virtual {v0, v6}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    const-string v1, ""

    .line 47
    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    move-object/from16 v2, p2

    goto/16 :goto_6

    :sswitch_7
    move-object/from16 v24, v2

    move/from16 v22, v15

    const/4 v1, 0x3

    .line 34
    invoke-static {v13, v14, v1, v11}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v10

    .line 12
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v1

    if-nez v1, :cond_5

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v1, v24

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u06df\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x4fdf

    const v12, -0x76b9849d

    xor-int/2addr v2, v12

    const v12, -0x7a635c07

    goto :goto_4

    :sswitch_8
    move-object/from16 v24, v2

    move/from16 v22, v15

    .line 33
    invoke-virtual {v3, v8}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-virtual {v0, v7}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    sget-object v13, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    const/16 v14, 0x5e

    .line 41
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_6

    move-object/from16 v2, p2

    move-object/from16 v1, v24

    goto/16 :goto_e

    :cond_6
    const-string v1, "\u1a78\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x50b1

    const v12, -0x1bc1225e

    xor-int/2addr v2, v12

    const v12, -0x365b0e28    # -1351227.0f

    :goto_4
    xor-int/2addr v1, v12

    move/from16 v15, v22

    move/from16 v22, v1

    move v1, v2

    move-object/from16 v2, v24

    goto/16 :goto_0

    .line 37
    :sswitch_9
    invoke-virtual {v0, v6}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    sget-object v1, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    const/16 v2, 0x2a

    const/16 v3, 0x34

    invoke-static {v1, v2, v3, v11}, Ll/֡ᩴ;->۫ۘ᩺([SIII)Ljava/lang/String;

    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/content/BroadcastReceiver;->setResultData(Ljava/lang/String;)V

    return-void

    :sswitch_a
    move-object/from16 v24, v2

    move/from16 v22, v15

    .line 41
    invoke-virtual {v3}, Landroid/text/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    if-eqz v9, :cond_7

    const-string v1, "\u06e2\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x35

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0x3c35

    const v12, -0x210a2bd9

    xor-int/2addr v2, v12

    const v12, -0x452df62b

    goto :goto_4

    :cond_7
    const-string v1, "\u06e1\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v20

    mul-int/lit16 v2, v2, -0xcb9

    const v12, 0x4b0125b1    # 8463793.0f

    xor-int/2addr v2, v12

    const v12, 0x6b1a00e2

    goto :goto_4

    :sswitch_b
    return-void

    :sswitch_c
    move-object/from16 v24, v2

    move/from16 v22, v15

    .line 23
    sget-object v1, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    const/16 v2, 0x26

    const/4 v8, 0x4

    invoke-static {v1, v2, v8, v11}, Ll/֨۬;->֨ۧ۟([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p2

    .line 31
    invoke-static {v2, v1}, Ll/ۗ᩷;->ܶۤᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_8

    const-string v1, "\u1a77\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x51

    xor-int v12, v1, v19

    mul-int/lit16 v12, v12, -0x77bb

    const v15, -0x3041483e

    xor-int/2addr v12, v15

    const v15, 0x15c63bf2

    goto :goto_5

    :cond_8
    const-string v1, "\u05a1\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x1d

    xor-int v12, v1, v19

    mul-int/lit16 v12, v12, 0x2f93

    const v15, 0x2cbea909

    xor-int/2addr v12, v15

    const v15, 0x2d562edd

    :goto_5
    xor-int/2addr v1, v15

    move/from16 v15, v22

    move-object/from16 v2, v24

    move/from16 v22, v1

    goto/16 :goto_d

    :sswitch_d
    move-object/from16 v24, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    .line 40
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    sget-object v12, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    const/16 v15, 0x18

    const/16 v0, 0xe

    invoke-static {v12, v15, v0, v11}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {v0, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "\u06d7\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x5

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x466f

    const v12, 0x3c71c133

    xor-int/2addr v1, v12

    const v12, -0x43e41ed1

    goto/16 :goto_7

    :cond_9
    :goto_6
    const-string v0, "\u05a1\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x239

    const v12, 0x167cf55b

    xor-int/2addr v1, v12

    const v12, 0x1e79a77e

    goto :goto_7

    :sswitch_e
    move-object/from16 v24, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    .line 23
    invoke-static {v5, v4}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x0

    const/4 v7, -0x1

    if-eqz v0, :cond_a

    const-string v0, "\u06d9\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x2341

    const v12, 0x743a4cb4

    xor-int/2addr v1, v12

    const v12, -0x5b6ac1e7

    goto :goto_7

    :cond_a
    const-string v0, "\u06ec\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, 0x445

    const v12, 0x53706e2f

    xor-int/2addr v1, v12

    const v12, 0x39163064

    goto :goto_7

    :sswitch_f
    move-object/from16 v24, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    .line 30
    sget-object v0, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    const/16 v1, 0xa

    const/16 v5, 0xe

    invoke-static {v0, v1, v5, v11}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 7
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_b

    move-object/from16 v0, p1

    goto/16 :goto_3

    :cond_b
    const-string v0, "\u1a73\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x638f

    const v12, -0x103cb552

    xor-int/2addr v1, v12

    const v12, 0x7893811e

    :goto_7
    xor-int/2addr v0, v12

    move/from16 v15, v22

    move-object/from16 v2, v24

    goto/16 :goto_10

    :sswitch_10
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    .line 29
    invoke-static {v0, v1}, Ll/֨۫;->᩵۫ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/text/ClipboardManager;

    .line 30
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 13
    sget v12, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v12, :cond_c

    :goto_8
    const-string v12, "\u1a73\u06da"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v20

    xor-int v15, v12, v19

    mul-int/lit16 v15, v15, -0x324d

    const v24, 0x126cf358

    xor-int v15, v15, v24

    const v24, 0x6e3b4f7d

    goto/16 :goto_b

    :cond_c
    const-string v12, "\u05ab\u05a8"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v19

    xor-int v15, v12, v20

    mul-int/lit16 v15, v15, 0x5587

    const v24, -0x2893d42d

    xor-int v15, v15, v24

    const v24, -0x6cacd312

    goto/16 :goto_b

    :sswitch_11
    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v22, v15

    .line 0
    sget-object v1, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    const/4 v12, 0x1

    const/16 v15, 0x9

    invoke-static {v1, v12, v15, v11}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 5
    sget v12, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v12, :cond_d

    :goto_9
    const-string v12, "\u1a73\u06ec"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v20

    xor-int v15, v12, v19

    mul-int/lit16 v15, v15, 0x37dd

    const v24, 0x7e385af8

    xor-int v15, v15, v24

    const v24, 0x2076cfd9

    goto/16 :goto_b

    :cond_d
    const-string v12, "\u073d\u06e7"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v20, v12

    mul-int/lit8 v12, v12, -0x33

    xor-int v15, v12, v19

    mul-int/lit16 v15, v15, -0x738b

    const v24, -0x59839473

    xor-int v15, v15, v24

    const v24, 0x7270ebc2

    goto :goto_b

    :sswitch_12
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    const v11, 0xd25b

    goto :goto_a

    :sswitch_13
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    const v11, 0xecdd

    :goto_a
    const-string v12, "\u05ab\u1a73"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v20, v12

    mul-int/lit8 v12, v12, 0x7b

    xor-int v15, v12, v19

    mul-int/lit16 v15, v15, 0x167

    const v24, 0x8666668

    xor-int v15, v15, v24

    const v24, 0x7356449d

    goto :goto_b

    :sswitch_14
    move-object/from16 v0, p1

    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    add-int v15, v23, v22

    mul-int v15, v15, v15

    sub-int v12, v18, v15

    if-lez v12, :cond_e

    const-string v12, "\u06e0\u06e7"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v19

    mul-int/lit8 v12, v12, 0x71

    xor-int v15, v12, v20

    mul-int/lit16 v15, v15, 0x452d

    const v24, 0x5d93e1d

    xor-int v15, v15, v24

    const v24, -0x4b3bf430

    goto :goto_b

    :cond_e
    const-string v12, "\u06dc\u1a77"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v19

    xor-int v15, v12, v20

    mul-int/lit16 v15, v15, 0x6363

    const v24, 0x59541875

    xor-int v15, v15, v24

    const v24, -0x455a344f

    :goto_b
    xor-int v12, v12, v24

    move-object/from16 v0, p0

    move-object v2, v1

    move v1, v15

    move/from16 v15, v22

    move/from16 v22, v12

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p1

    move-object v1, v2

    move-object/from16 v2, p2

    mul-int v12, v23, v17

    add-int/lit8 v18, v12, 0x1

    const/4 v15, 0x1

    .line 31
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v12

    if-ltz v12, :cond_f

    :goto_c
    const-string v12, "\u06e2\u05a8"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v19, v12

    mul-int/lit8 v12, v12, 0x59

    xor-int v0, v12, v20

    mul-int/lit16 v0, v0, -0x63c1

    const v22, -0x49c2e775

    xor-int v0, v0, v22

    const v22, 0x2b624a4b

    xor-int v22, v12, v22

    move-object v2, v1

    move v1, v0

    goto/16 :goto_11

    :cond_f
    const-string v0, "\u1a7a\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, 0x56b7

    const v22, -0x2714e83

    xor-int v12, v12, v22

    const v22, 0x68fb4a53

    xor-int v22, v0, v22

    move-object/from16 v0, p0

    move-object v2, v1

    :goto_d
    move v1, v12

    goto/16 :goto_0

    :sswitch_16
    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    const/4 v0, 0x0

    aget-short v23, v16, v0

    const/16 v17, 0x2

    .line 28
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_10

    const-string v0, "\u06e8\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v20, v0

    mul-int/lit8 v0, v0, 0x49

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, -0x893

    const v15, 0x661ad12d

    xor-int/2addr v12, v15

    const v15, 0x6589510a

    goto :goto_f

    :cond_10
    const-string v0, "\u06d7\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v12, v0, v19

    mul-int/lit16 v12, v12, 0x1991

    const v15, 0x1b1f81dd

    xor-int/2addr v12, v15

    const v15, -0x39c9b38d

    goto :goto_f

    :sswitch_17
    move-object v1, v2

    move/from16 v22, v15

    move-object/from16 v2, p2

    sget-object v16, Ll/ۜۖ᩷;->ۛᩴ۟:[S

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_11

    :goto_e
    const-string v0, "\u1a7b\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v20

    mul-int/lit16 v12, v12, 0x509f

    const v15, -0x59758ce8

    xor-int/2addr v12, v15

    const v15, -0x3517c589    # -7609659.5f

    goto :goto_f

    :cond_11
    const-string v0, "\u06d9\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v12, v0, v20

    mul-int/lit16 v12, v12, 0x6323

    const v15, 0x6291400    # 3.180006E-35f

    xor-int/2addr v12, v15

    const v15, 0x404fa4c0

    :goto_f
    xor-int/2addr v0, v15

    move-object v2, v1

    move v1, v12

    move/from16 v15, v22

    :goto_10
    move/from16 v22, v0

    :goto_11
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d4bf3fb -> :sswitch_a
        -0x7b545d57 -> :sswitch_7
        -0x741e0811 -> :sswitch_a
        -0x66e639a8 -> :sswitch_16
        -0x6282cbc8 -> :sswitch_15
        -0x5a572195 -> :sswitch_3
        -0x51c510e3 -> :sswitch_4
        -0x4de97867 -> :sswitch_13
        -0x4db3a9d2 -> :sswitch_6
        -0x4430ba20 -> :sswitch_5
        -0x40f9107a -> :sswitch_8
        -0x38d01c60 -> :sswitch_b
        -0x325cac98 -> :sswitch_9
        -0x31e6757f -> :sswitch_14
        -0x2c9fb1f8 -> :sswitch_9
        -0x2be4cbcb -> :sswitch_10
        -0x275f5df7 -> :sswitch_e
        -0x25944974 -> :sswitch_f
        -0x253971b2 -> :sswitch_1
        -0x1fbf9ed2 -> :sswitch_d
        -0x1f889059 -> :sswitch_2
        -0x1924141d -> :sswitch_3
        -0x17d43e70 -> :sswitch_14
        -0xe39c2d5 -> :sswitch_0
        0x2a7a3c0 -> :sswitch_12
        0x10f14696 -> :sswitch_7
        0x114e5026 -> :sswitch_17
        0x13bd8d94 -> :sswitch_1
        0x13c7b908 -> :sswitch_8
        0x15ef27f8 -> :sswitch_e
        0x2650c368 -> :sswitch_6
        0x2adafdec -> :sswitch_c
        0x2cf62e2a -> :sswitch_11
        0x2f6bc53d -> :sswitch_10
        0x32485335 -> :sswitch_c
        0x3d2978ff -> :sswitch_4
        0x46308990 -> :sswitch_b
        0x48798fc4 -> :sswitch_15
        0x491d751b -> :sswitch_17
        0x4a051595 -> :sswitch_f
        0x5bdd5541 -> :sswitch_12
        0x5d263b77 -> :sswitch_16
        0x60ad1d15 -> :sswitch_11
        0x62f8587f -> :sswitch_5
        0x63f3a88c -> :sswitch_13
        0x652b5ccb -> :sswitch_2
        0x6dcea572 -> :sswitch_d
        0x7cf8cffd -> :sswitch_0
    .end sparse-switch
.end method
