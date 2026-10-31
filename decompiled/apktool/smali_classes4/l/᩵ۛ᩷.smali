.class public final Ll/᩵ۛ᩷;
.super Ljava/lang/Object;
.source "Y4UF"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0xbc394bL

.field public static final ᩺:I


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public ۛ:Z

.field public ۤ:Ljava/lang/String;

.field public ۨ:I

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/String;

.field public ᩶:Ljava/lang/String;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 58
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    const/high16 v1, 0x41400000    # 12.0f

    .line 59
    invoke-static {v1}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 60
    sget-object v1, Ll/ۧ᩸ۡ;->ܿ:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    const-string v2, "\u6211"

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    div-float/2addr v1, v0

    float-to-int v0, v1

    const/16 v1, 0x1e

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Ll/᩵ۛ᩷;->᩺:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 79
    iput-boolean v0, p0, Ll/᩵ۛ᩷;->ۛ:Z

    .line 106
    iput p1, p0, Ll/᩵ۛ᩷;->ۨ:I

    return-void
.end method

.method private ֫()Ljava/lang/String;
    .locals 3

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    iget v1, p0, Ll/᩵ۛ᩷;->ۗ:I

    const/16 v2, 0x5b

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 167
    iget v1, p0, Ll/᩵ۛ᩷;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    const/16 v2, 0x5d

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 168
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۘ֫ۚ;)Ljava/lang/String;
    .locals 5

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ".field "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    invoke-interface {p0}, Ll/ۘ֫ۚ;->ܽ()I

    move-result v1

    invoke-static {v1}, Ll/ܺۗ֡;->᩻(I)[Ll/ܺۗ֡;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 364
    invoke-virtual {v4}, Ll/ܺۗ֡;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 366
    :cond_0
    invoke-interface {p0}, Ll/ᩴܽۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    .line 367
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 368
    invoke-interface {p0}, Ll/ᩴܽۚ;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " = "

    .line 369
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(II)Ll/᩵ۛ᩷;
    .locals 2

    .line 82
    new-instance v0, Ll/᩵ۛ᩷;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll/᩵ۛ᩷;-><init>(I)V

    const-string v1, ""

    .line 83
    iput-object v1, v0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    const/4 v1, 0x0

    .line 84
    iput v1, v0, Ll/᩵ۛ᩷;->ۗ:I

    .line 85
    iput v1, v0, Ll/᩵ۛ᩷;->ۙ:I

    .line 86
    iput p0, v0, Ll/᩵ۛ᩷;->᩸:I

    .line 87
    iput p1, v0, Ll/᩵ۛ᩷;->᩹:I

    return-object v0
.end method

.method private ֫(Ll/۫ۨᩳ;Ll/۟᩸ᩳ;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 400
    iget v3, v0, Ll/᩵ۛ᩷;->ۨ:I

    const/16 v4, 0x22

    const/4 v5, 0x0

    const/4 v6, -0x1

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_6

    :pswitch_0
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 546
    :goto_0
    iget v7, v0, Ll/᩵ۛ᩷;->᩸:I

    if-ge v3, v7, :cond_0

    const/16 v7, 0xa

    .line 547
    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->length()I

    move-result v8

    invoke-virtual {v2, v7, v4, v8}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v7

    if-eq v7, v6, :cond_0

    add-int/lit8 v4, v7, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 554
    :cond_0
    iget v2, v0, Ll/᩵ۛ᩷;->᩹:I

    add-int/2addr v4, v2

    .line 555
    invoke-virtual {v1, v4}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 556
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩺ܽ()V

    .line 557
    invoke-virtual {v1, v4, v5}, Ll/۫ۨᩳ;->֫(IZ)Z

    return-void

    .line 522
    :pswitch_1
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v3

    iget-object v6, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v7, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    .line 523
    invoke-virtual {v3, v6, v7}, Ll/᩶ᩳۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩸ᩳۢ;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 524
    iget v3, v3, Ll/᩸ᩳۢ;->֫:I

    .line 525
    new-instance v6, Ll/ۤᩳۢ;

    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->length()I

    move-result v7

    invoke-direct {v6, v3, v7, v2}, Ll/ۤᩳۢ;-><init>(IILjava/lang/CharSequence;)V

    .line 526
    invoke-virtual {v6}, Ll/ۤᩳۢ;->ۜ()V

    .line 527
    invoke-virtual {v6}, Ll/ۤᩳۢ;->ܳ()C

    move-result v7

    const/16 v8, 0x3d

    if-ne v7, v8, :cond_2

    .line 528
    invoke-virtual {v6}, Ll/ۤᩳۢ;->ۜ()V

    .line 529
    invoke-virtual {v6}, Ll/ۤᩳۢ;->ۧ()I

    move-result v3

    .line 530
    invoke-virtual {v6}, Ll/ۤᩳۢ;->֫()I

    move-result v6

    sub-int v7, v6, v3

    const/4 v8, 0x2

    if-lt v7, v8, :cond_1

    .line 531
    invoke-virtual {v2, v3}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v7

    if-ne v7, v4, :cond_1

    add-int/lit8 v7, v6, -0x1

    invoke-virtual {v2, v7}, Ll/۟᩸ᩳ;->charAt(I)C

    move-result v2

    if-ne v2, v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v6, v6, -0x1

    .line 535
    :cond_1
    invoke-virtual {v1, v3, v6}, Ll/۫ۨᩳ;->᩷(II)V

    goto :goto_1

    .line 537
    :cond_2
    invoke-virtual {v1, v3}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 539
    :goto_1
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩺ܽ()V

    .line 540
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result v2

    invoke-virtual {v1, v2, v5}, Ll/۫ۨᩳ;->ۧ(IZ)V

    return-void

    .line 515
    :pswitch_2
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v2

    .line 516
    invoke-virtual {v2, v1}, Ll/᩶ᩳۢ;->֫(Ll/۫ۨᩳ;)V

    iget-object v1, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v3, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    iget v4, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v5, v0, Ll/᩵ۛ᩷;->᩹:I

    .line 517
    invoke-virtual {v2, v1, v4, v5, v3}, Ll/᩶ᩳۢ;->֫(Ljava/lang/String;IILjava/lang/String;)V

    return-void

    .line 500
    :pswitch_3
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v2

    iget-object v3, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v4, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    .line 501
    invoke-virtual {v2, v3, v4}, Ll/᩶ᩳۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩸ᩳۢ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 503
    iget v2, v2, Ll/᩸ᩳۢ;->ۧ:I

    iget v3, v0, Ll/᩵ۛ᩷;->᩸:I

    add-int/2addr v3, v2

    .line 504
    iget v4, v0, Ll/᩵ۛ᩷;->᩹:I

    add-int/2addr v2, v4

    .line 505
    invoke-virtual {v1, v3, v2}, Ll/۫ۨᩳ;->᩷(II)V

    .line 506
    invoke-virtual {v1, v3, v5}, Ll/۫ۨᩳ;->ۧ(IZ)V

    goto :goto_2

    .line 508
    :cond_3
    invoke-virtual {v1, v5}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1357
    invoke-virtual {v1, v5, v5}, Ll/۫ۨᩳ;->֫(IZ)Z

    .line 511
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩺ܽ()V

    return-void

    .line 493
    :pswitch_4
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v6

    .line 494
    invoke-virtual {v6, v1}, Ll/᩶ᩳۢ;->֫(Ll/۫ۨᩳ;)V

    iget-object v7, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v9, v0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    iget-object v10, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    iget v8, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v11, v0, Ll/᩵ۛ᩷;->᩹:I

    .line 495
    invoke-virtual/range {v6 .. v11}, Ll/᩶ᩳۢ;->ۧ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 486
    :pswitch_5
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v12

    .line 487
    invoke-virtual {v12, v1}, Ll/᩶ᩳۢ;->֫(Ll/۫ۨᩳ;)V

    iget-object v13, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v15, v0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    iget-object v1, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    iget v14, v0, Ll/᩵ۛ᩷;->᩸:I

    const/16 v17, -0x1

    move-object/from16 v16, v1

    .line 488
    invoke-virtual/range {v12 .. v17}, Ll/᩶ᩳۢ;->ۧ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 479
    :pswitch_6
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v2

    .line 480
    invoke-virtual {v2, v1}, Ll/᩶ᩳۢ;->֫(Ll/۫ۨᩳ;)V

    iget-object v3, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v5, v0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    iget-object v6, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    iget v4, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v7, v0, Ll/᩵ۛ᩷;->᩹:I

    .line 481
    invoke-virtual/range {v2 .. v7}, Ll/᩶ᩳۢ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    return-void

    .line 464
    :pswitch_7
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v2

    iget-object v3, v0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    iget-object v4, v0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    iget-object v6, v0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    .line 465
    invoke-virtual {v2, v3, v4, v6}, Ll/᩶ᩳۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/᩸ᩳۢ;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 467
    iget v2, v2, Ll/᩸ᩳۢ;->ۧ:I

    iget v3, v0, Ll/᩵ۛ᩷;->᩸:I

    add-int/2addr v3, v2

    .line 468
    iget v4, v0, Ll/᩵ۛ᩷;->᩹:I

    add-int/2addr v2, v4

    .line 469
    invoke-virtual {v1, v3, v2}, Ll/۫ۨᩳ;->᩷(II)V

    .line 470
    invoke-virtual {v1, v3, v5}, Ll/۫ۨᩳ;->ۧ(IZ)V

    goto :goto_3

    .line 472
    :cond_4
    invoke-virtual {v1, v5}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1357
    invoke-virtual {v1, v5, v5}, Ll/۫ۨᩳ;->֫(IZ)Z

    .line 475
    :goto_3
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩺ܽ()V

    return-void

    .line 458
    :pswitch_8
    invoke-static/range {p2 .. p2}, Ll/᩶ᩳۢ;->֫(Ljava/lang/CharSequence;)Ll/᩶ᩳۢ;

    move-result-object v2

    .line 459
    invoke-virtual {v2, v1}, Ll/᩶ᩳۢ;->֫(Ll/۫ۨᩳ;)V

    iget v1, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v3, v0, Ll/᩵ۛ᩷;->᩹:I

    .line 460
    invoke-virtual {v2, v1, v3}, Ll/᩶ᩳۢ;->֫(II)V

    return-void

    :pswitch_9
    const-string v3, ".source"

    .line 444
    invoke-static {v2, v3}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v3

    if-eq v3, v6, :cond_f

    .line 446
    invoke-virtual/range {p2 .. p2}, Ll/۟᩸ᩳ;->length()I

    move-result v7

    invoke-virtual {v2, v4, v3, v7}, Ll/۟᩸ᩳ;->indexOf(CII)I

    move-result v2

    if-eq v2, v6, :cond_f

    .line 448
    iget v3, v0, Ll/᩵ۛ᩷;->ۗ:I

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, -0x8

    .line 449
    iget v4, v0, Ll/᩵ۛ᩷;->ۙ:I

    add-int/2addr v2, v4

    add-int/lit8 v2, v2, -0x8

    .line 450
    invoke-virtual {v1, v3, v2}, Ll/۫ۨᩳ;->᩷(II)V

    .line 451
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩺ܽ()V

    .line 452
    invoke-virtual {v1, v3, v5}, Ll/۫ۨᩳ;->ۧ(IZ)V

    return-void

    .line 402
    :pswitch_a
    iget v3, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v4, v0, Ll/᩵ۛ᩷;->᩹:I

    if-gt v3, v4, :cond_f

    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v3

    if-gt v4, v3, :cond_f

    .line 403
    iget-object v3, v0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    iget v4, v0, Ll/᩵ۛ᩷;->ۗ:I

    iget v7, v0, Ll/᩵ۛ᩷;->ۙ:I

    invoke-virtual {v3, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 405
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_e

    iget v4, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v7, v0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v2, v4, v7}, Ll/۟᩸ᩳ;->subSequence(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    .line 406
    iget v4, v0, Ll/᩵ۛ᩷;->᩸:I

    add-int/lit8 v7, v4, 0x1

    .line 36
    invoke-static {v5, v7, v2, v3}, Ll/ۘ۫ۡ;->֫(IILjava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v7

    .line 408
    invoke-static {v2, v3, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v2

    const/16 v8, 0x32

    if-eq v7, v6, :cond_5

    sub-int v9, v4, v7

    if-le v9, v8, :cond_6

    :cond_5
    const/4 v9, -0x1

    :cond_6
    if-eq v2, v6, :cond_7

    sub-int v4, v2, v4

    if-le v4, v8, :cond_8

    :cond_7
    const/4 v4, -0x1

    :cond_8
    if-eq v9, v6, :cond_9

    if-eq v4, v6, :cond_9

    if-ge v9, v4, :cond_b

    goto :goto_4

    :cond_9
    if-eq v9, v6, :cond_a

    goto :goto_4

    :cond_a
    if-eq v4, v6, :cond_c

    :cond_b
    move v7, v2

    goto :goto_4

    :cond_c
    const/4 v7, -0x1

    :goto_4
    if-eq v7, v6, :cond_d

    .line 432
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, v7

    invoke-virtual {v1, v7, v2}, Ll/۫ۨᩳ;->᩷(II)V

    goto :goto_5

    .line 434
    :cond_d
    iget v2, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v3, v0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v1, v2, v3}, Ll/۫ۨᩳ;->᩷(II)V

    goto :goto_5

    .line 437
    :cond_e
    iget v2, v0, Ll/᩵ۛ᩷;->᩸:I

    iget v3, v0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v1, v2, v3}, Ll/۫ۨᩳ;->᩷(II)V

    .line 439
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ll/۫ۨᩳ;->᩺ܽ()V

    .line 1674
    invoke-virtual {v1, v5}, Ll/۫ۨᩳ;->ۧ(Z)V

    :cond_f
    :goto_6
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 7

    .line 136
    iget v0, p0, Ll/᩵ۛ᩷;->ۨ:I

    const-string v1, ", "

    const-string v2, " ("

    const-string v3, "("

    const-string v4, " "

    const-string v5, ")"

    const-string v6, " -> "

    packed-switch v0, :pswitch_data_0

    const-string v1, "UNKNOWN_TYPE: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 158
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "TYPE_LINE_COL: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩹:I

    .line 0
    invoke-static {v1, v5, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 156
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_FIELD_VALUE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 154
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_FIELD_ANNOTATION: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 152
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_FIELD_NAME: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 150
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_METHOD_INSTRUCTION_IN: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 148
    :pswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_METHOD_INSTRUCTION: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 146
    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_METHOD_ANNOTATION: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 144
    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_METHOD_NAME: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 142
    :pswitch_8
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_CLASS_ANNOTATION: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩹:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 140
    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TYPE_SOURCE_FILE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 138
    :pswitch_a
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "TYPE_EXACT: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Ll/᩵ۛ᩷;->֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/᩵ۛ᩷;->᩸:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩵ۛ᩷;->᩹:I

    .line 0
    invoke-static {v1, v5, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(IILjava/lang/CharSequence;)V
    .locals 6

    add-int/lit8 v0, p1, -0x1

    .line 374
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_0
    const/4 v1, 0x0

    const/16 v2, 0xd

    const/16 v3, 0xa

    if-ltz v0, :cond_2

    .line 375
    invoke-interface {p3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-eq v4, v3, :cond_1

    if-ne v4, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 383
    :goto_2
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    .line 384
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_3
    if-ge v1, v4, :cond_5

    .line 385
    invoke-interface {p3, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eq v5, v3, :cond_4

    if-ne v5, v2, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    move v4, v1

    :cond_5
    :goto_5
    if-ge v0, p1, :cond_6

    .line 175
    invoke-interface {p3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_6

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 178
    :cond_6
    sget v1, Ll/᩵ۛ᩷;->᩺:I

    if-le p2, v4, :cond_7

    move p2, v4

    goto :goto_6

    :cond_7
    sub-int v2, v4, p2

    if-le v2, v1, :cond_8

    add-int v4, p2, v1

    :cond_8
    :goto_6
    sub-int v2, p1, v0

    add-int/lit8 v3, v1, -0x5

    if-le v2, v3, :cond_a

    sub-int v0, p2, p1

    if-lt v0, v1, :cond_9

    move v0, p1

    goto :goto_7

    :cond_9
    sub-int/2addr v1, v0

    sub-int v0, p1, v1

    :goto_7
    add-int/lit8 p1, p1, 0x1

    sub-int/2addr p1, v0

    .line 192
    iput p1, p0, Ll/᩵ۛ᩷;->ۗ:I

    add-int/lit8 p2, p2, 0x1

    sub-int/2addr p2, v0

    .line 193
    iput p2, p0, Ll/᩵ۛ᩷;->ۙ:I

    .line 194
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "\u2026"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    return-void

    .line 196
    :cond_a
    iput v2, p0, Ll/᩵ۛ᩷;->ۗ:I

    sub-int/2addr p2, v0

    .line 197
    iput p2, p0, Ll/᩵ۛ᩷;->ۙ:I

    .line 198
    invoke-interface {p3, v0, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    return-void
.end method

.method public final ֫(IILjava/lang/String;)V
    .locals 2

    .line 208
    sget v0, Ll/᩵ۛ᩷;->᩺:I

    add-int/lit8 v1, v0, -0x5

    if-le p1, v1, :cond_2

    sub-int v1, p2, p1

    if-lt v1, v0, :cond_0

    .line 211
    invoke-virtual {p3, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    const/4 p1, 0x0

    move p2, v1

    goto :goto_0

    :cond_0
    sub-int/2addr v0, v1

    sub-int v0, p1, v0

    if-lez v0, :cond_1

    .line 217
    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    sub-int/2addr p1, v0

    sub-int/2addr p2, v0

    :cond_1
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 222
    iput p1, p0, Ll/᩵ۛ᩷;->ۗ:I

    add-int/lit8 p2, p2, 0x1

    .line 223
    iput p2, p0, Ll/᩵ۛ᩷;->ۙ:I

    const-string p1, "\u2026"

    .line 0
    invoke-static {p1, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 224
    iput-object p1, p0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    return-void

    .line 226
    :cond_2
    iput p1, p0, Ll/᩵ۛ᩷;->ۗ:I

    .line 227
    iput p2, p0, Ll/᩵ۛ᩷;->ۙ:I

    .line 228
    iput-object p3, p0, Ll/᩵ۛ᩷;->۬:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ۘ֫ۚ;Ll/ۤܽۚ;)V
    .locals 3

    .line 293
    new-instance v0, Ll/ۨۖܽ;

    invoke-direct {v0}, Ll/ۨۖܽ;-><init>()V

    .line 295
    :try_start_0
    new-instance v1, Ll/ۗ᩵ۚ;

    new-instance v2, Ll/᩺ۖܽ;

    invoke-direct {v2, v0}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    invoke-direct {v1, v2}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    invoke-static {v1, p2}, Ll/ۨ۠֡;->֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 299
    :goto_0
    invoke-static {p1}, Ll/᩵ۛ᩷;->֫(Ll/ۘ֫ۚ;)Ljava/lang/String;

    move-result-object p2

    .line 301
    invoke-interface {p1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x6

    if-eq p1, v1, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    const-string p1, "{... "

    .line 0
    invoke-static {p2, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 314
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    .line 315
    invoke-virtual {v0}, Ll/ۨۖܽ;->length()I

    move-result v1

    add-int/2addr v1, p2

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 316
    invoke-virtual {v0}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ...}"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, v1, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    goto :goto_1

    .line 307
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    .line 308
    invoke-virtual {v0}, Ll/ۨۖܽ;->length()I

    move-result v1

    add-int/2addr v1, p1

    .line 309
    invoke-virtual {v0}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۘ֫ۚ;Ll/۫ۘܽ;)V
    .locals 4

    .line 278
    invoke-interface {p1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const/16 v1, 0x17

    if-ne v0, v1, :cond_0

    .line 279
    invoke-interface {p1}, Ll/ۘ֫ۚ;->ۚ֫()Ll/ۤܽۚ;

    move-result-object v0

    check-cast v0, Ll/ܿᩳۚ;

    invoke-interface {v0}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Ll/ܰ᩵ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 281
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ll/᩵ۛ᩷;->֫(Ll/ۘ֫ۚ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 282
    invoke-virtual {p2}, Ll/۫ۘܽ;->start()I

    move-result v2

    const/4 v3, 0x0

    .line 25
    invoke-static {v2, v3, v3, v0}, Ll/ۗۛ᩷;->֫(IIILjava/lang/String;)I

    move-result v2

    .line 283
    invoke-virtual {p2}, Ll/۫ۘܽ;->end()I

    move-result v3

    invoke-virtual {p2}, Ll/۫ۘܽ;->start()I

    move-result p2

    invoke-static {v3, p2, v2, v0}, Ll/ۗۛ᩷;->֫(IIILjava/lang/String;)I

    move-result p2

    const-string v0, "\""

    .line 0
    invoke-static {p1, v1, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 284
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, p2

    invoke-virtual {p0, v1, p1, v0}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    return-void

    .line 286
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ll/᩵ۛ᩷;->֫(Ll/ۘ֫ۚ;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "{..."

    .line 0
    invoke-static {v0, p1, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 287
    invoke-virtual {p2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object p2

    const-string v0, "...}"

    .line 0
    invoke-static {p1, p2, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 288
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p0, v1, p2, v0}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/ۢ֫ۚ;Ll/ۤܽۚ;)V
    .locals 3

    .line 248
    new-instance v0, Ll/ۨۖܽ;

    invoke-direct {v0}, Ll/ۨۖܽ;-><init>()V

    .line 250
    :try_start_0
    new-instance v1, Ll/ۗ᩵ۚ;

    new-instance v2, Ll/᩺ۖܽ;

    invoke-direct {v2, v0}, Ll/᩺ۖܽ;-><init>(Ll/ۨۖܽ;)V

    invoke-direct {v1, v2}, Ll/ۗ᩵ۚ;-><init>(Ljava/io/Writer;)V

    invoke-static {v1, p2}, Ll/ۨ۠֡;->֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 254
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 255
    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x6

    if-eq p1, v1, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    const-string p1, "{... "

    .line 0
    invoke-static {p2, p1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 268
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    .line 269
    invoke-virtual {v0}, Ll/ۨۖܽ;->length()I

    move-result v1

    add-int/2addr v1, p2

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 270
    invoke-virtual {v0}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ...}"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, v1, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    goto :goto_1

    .line 261
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    .line 262
    invoke-virtual {v0}, Ll/ۨۖܽ;->length()I

    move-result v1

    add-int/2addr v1, p1

    .line 263
    invoke-virtual {v0}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v1, p2}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۢ֫ۚ;Ll/۫ۘܽ;)V
    .locals 4

    .line 233
    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const/16 v1, 0x17

    if-ne v0, v1, :cond_0

    .line 234
    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    check-cast v0, Ll/ܿᩳۚ;

    invoke-interface {v0}, Ll/ܿᩳۚ;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Ll/ܰ᩵ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 236
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " = \""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 237
    invoke-virtual {p2}, Ll/۫ۘܽ;->start()I

    move-result v2

    const/4 v3, 0x0

    .line 25
    invoke-static {v2, v3, v3, v0}, Ll/ۗۛ᩷;->֫(IIILjava/lang/String;)I

    move-result v2

    .line 238
    invoke-virtual {p2}, Ll/۫ۘܽ;->end()I

    move-result v3

    invoke-virtual {p2}, Ll/۫ۘܽ;->start()I

    move-result p2

    invoke-static {v3, p2, v2, v0}, Ll/ۗۛ᩷;->֫(IIILjava/lang/String;)I

    move-result p2

    const-string v0, "\""

    .line 0
    invoke-static {p1, v1, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 239
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, p2

    invoke-virtual {p0, v1, p1, v0}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    return-void

    .line 241
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " = {..."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 242
    invoke-virtual {p2}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object p2

    const-string v0, "...}"

    .line 0
    invoke-static {p1, p2, v0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 243
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {p0, v1, p2, v0}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    return-void
.end method

.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 1

    .line 393
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object v0

    .line 394
    :try_start_0
    invoke-direct {p0, p1, v0}, Ll/᩵ۛ᩷;->֫(Ll/۫ۨᩳ;Ll/۟᩸ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 393
    :try_start_1
    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ֫(Ll/ᩴ֫ۚ;II)V
    .locals 6

    const-string v0, ".method "

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 346
    invoke-interface {p1}, Ll/ᩴ֫ۚ;->ܽ()I

    move-result v1

    invoke-static {v1}, Ll/ܺۗ֡;->ۜ(I)[Ll/ܺۗ֡;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    .line 347
    invoke-virtual {v5}, Ll/ܺۗ֡;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 349
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/2addr v1, p2

    .line 350
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    add-int/2addr p2, p3

    .line 351
    invoke-interface {p1}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "("

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    invoke-interface {p1}, Ll/ᩴ֫ۚ;->getParameters()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object p3

    .line 375
    invoke-virtual {p3, v3}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object p3

    .line 353
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡֫ۚ;

    .line 354
    invoke-interface {v2}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string p3, ")"

    .line 356
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۚܽۚ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, p2, p1}, Ll/᩵ۛ᩷;->֫(IILjava/lang/String;)V

    return-void
.end method
