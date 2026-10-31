.class public final Ll/ۛܿ֫;
.super Ljava/lang/Object;
.source "057Y"


# instance fields
.field public final ֫:[B

.field public final ۧ:J

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(II[B)V
    .locals 6

    const-wide/16 v1, -0x1

    move-object v0, p0

    move-object v3, p3

    move v4, p1

    move v5, p2

    .line 3257
    invoke-direct/range {v0 .. v5}, Ll/ۛܿ֫;-><init>(J[BII)V

    return-void
.end method

.method public constructor <init>(J[BII)V
    .locals 0

    .line 3260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3261
    iput p4, p0, Ll/ۛܿ֫;->ܽ:I

    .line 3262
    iput p5, p0, Ll/ۛܿ֫;->ᩳ:I

    .line 3263
    iput-wide p1, p0, Ll/ۛܿ֫;->ۧ:J

    .line 3264
    iput-object p3, p0, Ll/ۛܿ֫;->֫:[B

    return-void
.end method

.method public static ֫(ILjava/nio/ByteOrder;)Ll/ۛܿ֫;
    .locals 2

    .line 3278
    filled-new-array {p0}, [I

    move-result-object p0

    .line 3269
    invoke-static {}, Ll/۟ܿ֫;->ܳ()[I

    move-result-object v0

    const/4 v1, 0x3

    aget v0, v0, v1

    new-array v0, v0, [B

    .line 3268
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 3270
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    .line 3271
    aget p0, p0, p1

    int-to-short p0, p0

    .line 3272
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 3274
    new-instance p0, Ll/ۛܿ֫;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, v1, v0, p1}, Ll/ۛܿ֫;-><init>(II[B)V

    return-object p0
.end method

.method public static ֫(JLjava/nio/ByteOrder;)Ll/ۛܿ֫;
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    .line 3283
    invoke-static {}, Ll/۟ܿ֫;->ܳ()[I

    move-result-object p0

    const/4 p1, 0x4

    aget p0, p0, p1

    new-array p0, p0, [B

    .line 3282
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 3284
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3285
    aget-wide v2, v1, v2

    long-to-int p2, v2

    .line 3286
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 3288
    new-instance p2, Ll/ۛܿ֫;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    invoke-direct {p2, p1, v0, p0}, Ll/ۛܿ֫;-><init>(II[B)V

    return-object p2
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۛܿ֫;
    .locals 3

    const-string v0, "\u0000"

    .line 3316
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Ll/۟ܿ֫;->᩻()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    .line 3317
    new-instance v0, Ll/ۛܿ֫;

    const/4 v1, 0x2

    array-length v2, p0

    invoke-direct {v0, v1, v2, p0}, Ll/ۛܿ֫;-><init>(II[B)V

    return-object v0
.end method

.method public static ֫(Ll/᩺ܿ֫;Ljava/nio/ByteOrder;)Ll/ۛܿ֫;
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ll/᩺ܿ֫;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    .line 3322
    invoke-static {}, Ll/۟ܿ֫;->ܳ()[I

    move-result-object p0

    const/4 v3, 0x5

    aget p0, p0, v3

    new-array p0, p0, [B

    .line 3321
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 3323
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 3324
    aget-object p1, v1, v2

    .line 3325
    iget-wide v1, p1, Ll/᩺ܿ֫;->ۧ:J

    long-to-int v2, v1

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 3326
    iget-wide v1, p1, Ll/᩺ܿ֫;->֫:J

    long-to-int p1, v1

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 3328
    new-instance p1, Ll/ۛܿ֫;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    invoke-direct {p1, v3, v0, p0}, Ll/ۛܿ֫;-><init>(II[B)V

    return-object p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 3358
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ll/۟ܿ֫;->ۜ()[Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ll/ۛܿ֫;->ܽ:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data length:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۛܿ֫;->֫:[B

    array-length v1, v1

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/nio/ByteOrder;)D
    .locals 4

    .line 3484
    invoke-virtual {p0, p1}, Ll/ۛܿ֫;->ᩳ(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 3488
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3489
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0

    .line 3491
    :cond_0
    instance-of v0, p1, [J

    const-string v1, "There are more than one component"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    .line 3492
    check-cast p1, [J

    .line 3493
    array-length v0, p1

    if-ne v0, v3, :cond_1

    .line 3494
    aget-wide v0, p1, v2

    long-to-double v0, v0

    return-wide v0

    .line 3496
    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3498
    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    .line 3499
    check-cast p1, [I

    .line 3500
    array-length v0, p1

    if-ne v0, v3, :cond_3

    .line 3501
    aget p1, p1, v2

    int-to-double v0, p1

    return-wide v0

    .line 3503
    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3505
    :cond_4
    instance-of v0, p1, [D

    if-eqz v0, :cond_6

    .line 3506
    check-cast p1, [D

    .line 3507
    array-length v0, p1

    if-ne v0, v3, :cond_5

    .line 3508
    aget-wide v0, p1, v2

    return-wide v0

    .line 3510
    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3512
    :cond_6
    instance-of v0, p1, [Ll/᩺ܿ֫;

    if-eqz v0, :cond_8

    .line 3513
    check-cast p1, [Ll/᩺ܿ֫;

    .line 3514
    array-length v0, p1

    if-ne v0, v3, :cond_7

    .line 3515
    aget-object p1, p1, v2

    .line 3243
    iget-wide v0, p1, Ll/᩺ܿ֫;->ۧ:J

    long-to-double v0, v0

    iget-wide v2, p1, Ll/᩺ܿ֫;->֫:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0

    .line 3517
    :cond_7
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3519
    :cond_8
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3486
    :cond_9
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/nio/ByteOrder;)I
    .locals 4

    .line 3523
    invoke-virtual {p0, p1}, Ll/ۛܿ֫;->ᩳ(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 3527
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3528
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 3530
    :cond_0
    instance-of v0, p1, [J

    const-string v1, "There are more than one component"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    .line 3531
    check-cast p1, [J

    .line 3532
    array-length v0, p1

    if-ne v0, v3, :cond_1

    .line 3533
    aget-wide v0, p1, v2

    long-to-int p1, v0

    return p1

    .line 3535
    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3537
    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    .line 3538
    check-cast p1, [I

    .line 3539
    array-length v0, p1

    if-ne v0, v3, :cond_3

    .line 3540
    aget p1, p1, v2

    return p1

    .line 3542
    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3544
    :cond_4
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3525
    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ljava/nio/ByteOrder;)Ljava/lang/String;
    .locals 6

    .line 3548
    invoke-virtual {p0, p1}, Ll/ۛܿ֫;->ᩳ(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    move-result-object p1

    if-nez p1, :cond_0

    goto/16 :goto_4

    .line 3552
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 3553
    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 3556
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 3557
    instance-of v1, p1, [J

    const-string v2, ","

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    .line 3558
    check-cast p1, [J

    .line 3559
    :cond_2
    :goto_0
    array-length v1, p1

    if-ge v3, v1, :cond_3

    .line 3560
    aget-wide v4, p1, v3

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    .line 3561
    array-length v1, p1

    if-eq v3, v1, :cond_2

    .line 3562
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 3565
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3567
    :cond_4
    instance-of v1, p1, [I

    if-eqz v1, :cond_7

    .line 3568
    check-cast p1, [I

    .line 3569
    :cond_5
    :goto_1
    array-length v1, p1

    if-ge v3, v1, :cond_6

    .line 3570
    aget v1, p1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    .line 3571
    array-length v1, p1

    if-eq v3, v1, :cond_5

    .line 3572
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 3575
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3577
    :cond_7
    instance-of v1, p1, [D

    if-eqz v1, :cond_a

    .line 3578
    check-cast p1, [D

    .line 3579
    :cond_8
    :goto_2
    array-length v1, p1

    if-ge v3, v1, :cond_9

    .line 3580
    aget-wide v4, p1, v3

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    .line 3581
    array-length v1, p1

    if-eq v3, v1, :cond_8

    .line 3582
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 3585
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 3587
    :cond_a
    instance-of v1, p1, [Ll/᩺ܿ֫;

    if-eqz v1, :cond_d

    .line 3588
    check-cast p1, [Ll/᩺ܿ֫;

    .line 3589
    :cond_b
    :goto_3
    array-length v1, p1

    if-ge v3, v1, :cond_c

    .line 3590
    aget-object v1, p1, v3

    iget-wide v4, v1, Ll/᩺ܿ֫;->ۧ:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    .line 3591
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 3592
    aget-object v1, p1, v3

    iget-wide v4, v1, Ll/᩺ܿ֫;->֫:J

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    .line 3593
    array-length v1, p1

    if-eq v3, v1, :cond_b

    .line 3594
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 3597
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩳ(Ljava/nio/ByteOrder;)Ljava/io/Serializable;
    .locals 11

    .line 3362
    iget-object v0, p0, Ll/ۛܿ֫;->֫:[B

    const/4 v1, 0x0

    .line 3364
    :try_start_0
    new-instance v2, Ll/ۤܿ֫;

    invoke-direct {v2, v0}, Ll/ۤܿ֫;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_e
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3365
    :try_start_1
    invoke-virtual {v2, p1}, Ll/ۤܿ֫;->֫(Ljava/nio/ByteOrder;)V

    .line 3366
    iget p1, p0, Ll/ۛܿ֫;->ܽ:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide v3, 0xffffffffL

    const/4 v5, 0x0

    iget v6, p0, Ll/ۛܿ֫;->ᩳ:I

    packed-switch p1, :pswitch_data_0

    .line 3475
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_b

    goto/16 :goto_d

    .line 3460
    :pswitch_0
    :try_start_3
    new-array p1, v6, [D

    :goto_0
    if-ge v5, v6, :cond_0

    .line 3462
    invoke-virtual {v2}, Ll/ۤܿ֫;->readDouble()D

    move-result-wide v3

    aput-wide v3, p1, v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_c
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3475
    :cond_0
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return-object p1

    .line 3453
    :pswitch_1
    :try_start_5
    new-array p1, v6, [D

    :goto_1
    if-ge v5, v6, :cond_1

    .line 3455
    invoke-virtual {v2}, Ll/ۤܿ֫;->readFloat()F

    move-result v0

    float-to-double v3, v0

    aput-wide v3, p1, v5
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_c
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 3475
    :cond_1
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    return-object p1

    .line 3444
    :pswitch_2
    :try_start_7
    new-array p1, v6, [Ll/᩺ܿ֫;

    :goto_2
    if-ge v5, v6, :cond_2

    .line 3446
    invoke-virtual {v2}, Ll/ۤܿ֫;->readInt()I

    move-result v0

    int-to-long v3, v0

    .line 3447
    invoke-virtual {v2}, Ll/ۤܿ֫;->readInt()I

    move-result v0

    int-to-long v7, v0

    .line 3448
    new-instance v0, Ll/᩺ܿ֫;

    invoke-direct {v0, v3, v4, v7, v8}, Ll/᩺ܿ֫;-><init>(JJ)V

    aput-object v0, p1, v5
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_c
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 3475
    :cond_2
    :try_start_8
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    return-object p1

    .line 3437
    :pswitch_3
    :try_start_9
    new-array p1, v6, [I

    :goto_3
    if-ge v5, v6, :cond_3

    .line 3439
    invoke-virtual {v2}, Ll/ۤܿ֫;->readInt()I

    move-result v0

    aput v0, p1, v5
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_c
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 3475
    :cond_3
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    :catch_3
    return-object p1

    .line 3430
    :pswitch_4
    :try_start_b
    new-array p1, v6, [I

    :goto_4
    if-ge v5, v6, :cond_4

    .line 3432
    invoke-virtual {v2}, Ll/ۤܿ֫;->readShort()S

    move-result v0

    aput v0, p1, v5
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_c
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 3475
    :cond_4
    :try_start_c
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4

    :catch_4
    return-object p1

    .line 3421
    :pswitch_5
    :try_start_d
    new-array p1, v6, [Ll/᩺ܿ֫;

    :goto_5
    if-ge v5, v6, :cond_5

    .line 8233
    invoke-virtual {v2}, Ll/ۤܿ֫;->readInt()I

    move-result v0

    int-to-long v7, v0

    and-long/2addr v7, v3

    invoke-virtual {v2}, Ll/ۤܿ֫;->readInt()I

    move-result v0

    int-to-long v9, v0

    and-long/2addr v9, v3

    .line 3425
    new-instance v0, Ll/᩺ܿ֫;

    invoke-direct {v0, v7, v8, v9, v10}, Ll/᩺ܿ֫;-><init>(JJ)V

    aput-object v0, p1, v5
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_c
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 3475
    :cond_5
    :try_start_e
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_5

    :catch_5
    return-object p1

    .line 3414
    :pswitch_6
    :try_start_f
    new-array p1, v6, [J

    :goto_6
    if-ge v5, v6, :cond_6

    .line 8233
    invoke-virtual {v2}, Ll/ۤܿ֫;->readInt()I

    move-result v0

    int-to-long v7, v0

    and-long/2addr v7, v3

    .line 3416
    aput-wide v7, p1, v5
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_c
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    .line 3475
    :cond_6
    :try_start_10
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_6

    :catch_6
    return-object p1

    .line 3407
    :pswitch_7
    :try_start_11
    new-array p1, v6, [I

    :goto_7
    if-ge v5, v6, :cond_7

    .line 3409
    invoke-virtual {v2}, Ll/ۤܿ֫;->readUnsignedShort()I

    move-result v0

    aput v0, p1, v5
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_c
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    .line 3475
    :cond_7
    :try_start_12
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_7

    :catch_7
    return-object p1

    .line 3378
    :pswitch_8
    :try_start_13
    invoke-static {}, Ll/۟ܿ֫;->᩷()[B

    move-result-object p1

    array-length p1, p1

    if-lt v6, p1, :cond_a

    const/4 p1, 0x0

    .line 3380
    :goto_8
    invoke-static {}, Ll/۟ܿ֫;->᩷()[B

    move-result-object v3

    array-length v3, v3

    if-ge p1, v3, :cond_9

    .line 3381
    aget-byte v3, v0, p1

    invoke-static {}, Ll/۟ܿ֫;->᩷()[B

    move-result-object v4

    aget-byte v4, v4, p1

    if-eq v3, v4, :cond_8

    goto :goto_9

    :cond_8
    add-int/lit8 p1, p1, 0x1

    goto :goto_8

    .line 3387
    :cond_9
    invoke-static {}, Ll/۟ܿ֫;->᩷()[B

    move-result-object p1

    array-length v5, p1

    .line 3391
    :cond_a
    :goto_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_a
    if-ge v5, v6, :cond_d

    .line 3393
    aget-byte v3, v0, v5

    if-nez v3, :cond_b

    goto :goto_c

    :cond_b
    const/16 v4, 0x20

    if-lt v3, v4, :cond_c

    int-to-char v3, v3

    .line 3398
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_b

    :cond_c
    const/16 v3, 0x3f

    .line 3400
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_b
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    .line 3404
    :cond_d
    :goto_c
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_c
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 3475
    :try_start_14
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_8

    :catch_8
    return-object p1

    .line 3370
    :pswitch_9
    :try_start_15
    array-length p1, v0

    const/4 v3, 0x1

    if-ne p1, v3, :cond_e

    aget-byte p1, v0, v5

    if-ltz p1, :cond_e

    if-gt p1, v3, :cond_e

    .line 3371
    new-instance v0, Ljava/lang/String;

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    new-array v3, v3, [C

    aput-char p1, v3, v5

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_c
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    .line 3475
    :try_start_16
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_9

    :catch_9
    return-object v0

    .line 3373
    :cond_e
    :try_start_17
    new-instance p1, Ljava/lang/String;

    invoke-static {}, Ll/۟ܿ֫;->᩻()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {p1, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_c
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    .line 3475
    :try_start_18
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_a

    :catch_a
    return-object p1

    :catch_b
    :goto_d
    return-object v1

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_e

    :catch_c
    nop

    goto :goto_f

    :catchall_1
    move-exception p1

    :goto_e
    if-eqz v1, :cond_f

    :try_start_19
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_d

    .line 3480
    :catch_d
    :cond_f
    throw p1

    :catch_e
    move-object v2, v1

    :goto_f
    if-eqz v2, :cond_10

    .line 3475
    :try_start_1a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_f

    :catch_f
    :cond_10
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
