.class public final Ll/᩹ܰܿ;
.super Ljava/lang/Object;
.source "95HF"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field public static final ۛ:Ljava/math/BigInteger;

.field public static final ۤ:Ljava/math/BigInteger;

.field public static final ۨ:Ljava/math/BigInteger;


# instance fields
.field public final ۗ:Z

.field public ۙ:Z

.field public final ۫:Landroid/widget/TextView;

.field public final ۬:I

.field public ᩶:Z

.field public final ᩸:Landroid/widget/EditText;

.field public ᩹:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-wide v0, 0x7fffffffffffffffL

    .line 501
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/᩹ܰܿ;->ۤ:Ljava/math/BigInteger;

    const-wide/high16 v0, -0x8000000000000000L

    .line 502
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/᩹ܰܿ;->ۨ:Ljava/math/BigInteger;

    .line 503
    new-instance v0, Ljava/math/BigInteger;

    const-string v1, "FFFFFFFFFFFFFFFF"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/᩹ܰܿ;->ۛ:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;IZ)V
    .locals 1

    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 328
    iput-boolean v0, p0, Ll/᩹ܰܿ;->᩶:Z

    .line 331
    iput-object p1, p0, Ll/᩹ܰܿ;->᩸:Landroid/widget/EditText;

    .line 332
    iput-object p2, p0, Ll/᩹ܰܿ;->۫:Landroid/widget/TextView;

    .line 333
    iput p3, p0, Ll/᩹ܰܿ;->۬:I

    .line 334
    iput-boolean p4, p0, Ll/᩹ܰܿ;->ۗ:Z

    .line 336
    invoke-virtual {p0}, Ll/᩹ܰܿ;->ۧ()V

    .line 337
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 567
    invoke-virtual {p0}, Ll/᩹ܰܿ;->ۧ()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 7

    .line 385
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩹ܰܿ;->᩹:[B

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x3

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 386
    iget-object v1, p0, Ll/᩹ܰܿ;->᩹:[B

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    .line 387
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v3

    const-string v5, "%02X "

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 389
    :cond_0
    iget-object v1, p0, Ll/᩹ܰܿ;->۫:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(IJ)V
    .locals 7

    .line 426
    new-array v0, p1, [B

    iput-object v0, p0, Ll/᩹ܰܿ;->᩹:[B

    .line 427
    iget-boolean v0, p0, Ll/᩹ܰܿ;->ۗ:Z

    const/16 v1, 0x8

    const-wide/16 v2, 0xff

    if-eqz v0, :cond_0

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 429
    iget-object v0, p0, Ll/᩹ܰܿ;->᩹:[B

    and-long v4, p2, v2

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v0, p1

    ushr-long/2addr p2, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_1

    .line 434
    iget-object v4, p0, Ll/᩹ܰܿ;->᩹:[B

    and-long v5, p2, v2

    long-to-int v6, v5

    int-to-byte v5, v6

    aput-byte v5, v4, v0

    ushr-long/2addr p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 438
    :cond_1
    invoke-virtual {p0}, Ll/᩹ܰܿ;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 12

    .line 349
    iget-object v0, p0, Ll/᩹ܰܿ;->᩸:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 350
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩹ܰܿ;->۫:Landroid/widget/TextView;

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 351
    iput-object v0, p0, Ll/᩹ܰܿ;->᩹:[B

    .line 352
    iput-boolean v2, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 353
    iput-boolean v4, p0, Ll/᩹ܰܿ;->᩶:Z

    const v0, 0x7f120304

    .line 354
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    .line 357
    :cond_0
    iput-boolean v2, p0, Ll/᩹ܰܿ;->᩶:Z

    .line 358
    iput-boolean v2, p0, Ll/᩹ܰܿ;->ۙ:Z

    const v1, 0x7f0a0527

    const-wide/16 v5, 0xff

    const v7, 0x7f12030d

    const v8, 0x7f120b48

    .line 359
    iget v9, p0, Ll/᩹ܰܿ;->۬:I

    if-ne v9, v1, :cond_3

    .line 395
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v9, -0x80

    cmp-long v11, v0, v9

    if-ltz v11, :cond_2

    const-wide/16 v9, 0x7f

    cmp-long v11, v0, v9

    if-lez v11, :cond_1

    goto :goto_0

    :cond_1
    and-long/2addr v0, v5

    long-to-int v1, v0

    int-to-byte v0, v1

    new-array v1, v4, [B

    aput-byte v0, v1, v2

    .line 401
    iput-object v1, p0, Ll/᩹ܰܿ;->᩹:[B

    .line 402
    invoke-virtual {p0}, Ll/᩹ܰܿ;->֫()V

    goto/16 :goto_8

    .line 397
    :cond_2
    :goto_0
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 398
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    .line 404
    :catch_0
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 405
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_3
    const v1, 0x7f0a065f

    const-wide/16 v10, 0x0

    if-ne v9, v1, :cond_6

    .line 411
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v9, v0, v10

    if-ltz v9, :cond_5

    cmp-long v9, v0, v5

    if-lez v9, :cond_4

    goto :goto_1

    :cond_4
    and-long/2addr v0, v5

    long-to-int v1, v0

    int-to-byte v0, v1

    new-array v1, v4, [B

    aput-byte v0, v1, v2

    .line 417
    iput-object v1, p0, Ll/᩹ܰܿ;->᩹:[B

    .line 418
    invoke-virtual {p0}, Ll/᩹ܰܿ;->֫()V

    goto/16 :goto_8

    .line 413
    :cond_5
    :goto_1
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 414
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_8

    .line 420
    :catch_1
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 421
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_6
    const v1, 0x7f0a052a

    const/4 v2, 0x2

    if-ne v9, v1, :cond_9

    .line 443
    :try_start_2
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v5, -0x8000

    cmp-long v9, v0, v5

    if-ltz v9, :cond_8

    const-wide/16 v5, 0x7fff

    cmp-long v9, v0, v5

    if-lez v9, :cond_7

    goto :goto_2

    .line 449
    :cond_7
    invoke-virtual {p0, v2, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V

    goto/16 :goto_8

    .line 445
    :cond_8
    :goto_2
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 446
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_8

    .line 451
    :catch_2
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 452
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_9
    const v1, 0x7f0a0662

    if-ne v9, v1, :cond_c

    .line 458
    :try_start_3
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v5, v0, v10

    if-ltz v5, :cond_b

    const-wide/32 v5, 0xffff

    cmp-long v9, v0, v5

    if-lez v9, :cond_a

    goto :goto_3

    .line 464
    :cond_a
    invoke-virtual {p0, v2, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V

    goto/16 :goto_8

    .line 460
    :cond_b
    :goto_3
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 461
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_8

    .line 466
    :catch_3
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 467
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_c
    const v1, 0x7f0a0528

    const/4 v2, 0x4

    if-ne v9, v1, :cond_f

    .line 473
    :try_start_4
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v5, -0x80000000

    cmp-long v9, v0, v5

    if-ltz v9, :cond_e

    const-wide/32 v5, 0x7fffffff

    cmp-long v9, v0, v5

    if-lez v9, :cond_d

    goto :goto_4

    .line 479
    :cond_d
    invoke-virtual {p0, v2, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V

    goto/16 :goto_8

    .line 475
    :cond_e
    :goto_4
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 476
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_8

    .line 481
    :catch_4
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 482
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_f
    const v1, 0x7f0a0660

    if-ne v9, v1, :cond_12

    .line 488
    :try_start_5
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v5, v0, v10

    if-ltz v5, :cond_11

    const-wide v5, 0xffffffffL

    cmp-long v9, v0, v5

    if-lez v9, :cond_10

    goto :goto_5

    .line 494
    :cond_10
    invoke-virtual {p0, v2, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V

    goto/16 :goto_8

    .line 490
    :cond_11
    :goto_5
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 491
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    goto/16 :goto_8

    .line 496
    :catch_5
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 497
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_12
    const v1, 0x7f0a0529

    const/16 v5, 0x8

    if-ne v9, v1, :cond_15

    .line 507
    :try_start_6
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 508
    sget-object v0, Ll/᩹ܰܿ;->ۨ:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_14

    sget-object v0, Ll/᩹ܰܿ;->ۤ:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_13

    goto :goto_6

    .line 513
    :cond_13
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V

    goto/16 :goto_8

    .line 509
    :cond_14
    :goto_6
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 510
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_8

    .line 515
    :catch_6
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 516
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_8

    :cond_15
    const v1, 0x7f0a0661

    if-ne v9, v1, :cond_18

    .line 522
    :try_start_7
    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 523
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-ltz v0, :cond_17

    sget-object v0, Ll/᩹ܰܿ;->ۛ:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-lez v0, :cond_16

    goto :goto_7

    .line 528
    :cond_16
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V

    goto :goto_8

    .line 524
    :cond_17
    :goto_7
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 525
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_8

    .line 530
    :catch_7
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 531
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_8

    :cond_18
    const v1, 0x7f0a025c

    if-ne v9, v1, :cond_19

    .line 537
    :try_start_8
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    .line 538
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0, v2, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    .line 540
    :catch_8
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 541
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    goto :goto_8

    :cond_19
    const v1, 0x7f0a025b

    if-ne v9, v1, :cond_1a

    .line 547
    :try_start_9
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 548
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v5, v0, v1}, Ll/᩹ܰܿ;->֫(IJ)V
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_8

    .line 550
    :catch_9
    iput-boolean v4, p0, Ll/᩹ܰܿ;->ۙ:Z

    .line 551
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(I)V

    :goto_8
    return-void

    .line 380
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
