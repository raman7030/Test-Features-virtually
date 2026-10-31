.class public final Ll/۬ۤ֫;
.super Ll/֨֡֫;
.source "Y8J8"


# instance fields
.field public final ֡:J

.field public final ֨:F

.field public ۖ:[B

.field public ۘ:I

.field public ۚ:I

.field public final ۠:S

.field public ۡ:Z

.field public ۢ:[B

.field public ܶ:J

.field public final ܺ:J

.field public ᩴ:I

.field public final ᩵:I

.field public ᩷:I

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 231
    invoke-direct {p0}, Ll/֨֡֫;-><init>()V

    const/4 v0, 0x0

    .line 158
    iput v0, p0, Ll/۬ۤ֫;->ۚ:I

    .line 172
    iput v0, p0, Ll/۬ۤ֫;->ᩴ:I

    .line 179
    iput v0, p0, Ll/۬ۤ֫;->ۘ:I

    const-wide/32 v0, 0x186a0

    .line 233
    iput-wide v0, p0, Ll/۬ۤ֫;->֡:J

    const v0, 0x3e4ccccd    # 0.2f

    .line 234
    iput v0, p0, Ll/۬ۤ֫;->֨:F

    const-wide/32 v0, 0x1e8480

    .line 235
    iput-wide v0, p0, Ll/۬ۤ֫;->ܺ:J

    const/16 v0, 0xa

    .line 236
    iput v0, p0, Ll/۬ۤ֫;->᩵:I

    const/16 v0, 0x400

    .line 237
    iput-short v0, p0, Ll/۬ۤ֫;->۠:S

    .line 238
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iput-object v0, p0, Ll/۬ۤ֫;->ۖ:[B

    .line 239
    iput-object v0, p0, Ll/۬ۤ֫;->ۢ:[B

    return-void
.end method

.method private ֫(II)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    .line 558
    :cond_0
    iget v0, p0, Ll/۬ۤ֫;->ۘ:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lt v0, p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    .line 562
    iget v3, p0, Ll/۬ۤ֫;->ᩴ:I

    iget v4, p0, Ll/۬ۤ֫;->ۘ:I

    add-int v5, v3, v4

    iget-object v6, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v7, v6

    if-gt v5, v7, :cond_2

    sub-int/2addr v5, p1

    .line 565
    iget-object v3, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v6, v5, v3, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 573
    :cond_2
    array-length v5, v6

    sub-int/2addr v5, v3

    sub-int/2addr v4, v5

    if-lt v4, p1, :cond_3

    sub-int/2addr v4, p1

    .line 577
    iget-object v3, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v6, v4, v3, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    :cond_3
    sub-int v3, p1, v4

    .line 585
    array-length v5, v6

    sub-int/2addr v5, v3

    iget-object v7, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v6, v5, v7, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 594
    iget-object v5, p0, Ll/۬ۤ֫;->ۖ:[B

    iget-object v6, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v5, v2, v6, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 603
    :cond_4
    iget v3, p0, Ll/۬ۤ֫;->ᩴ:I

    add-int v4, v3, p1

    iget-object v5, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v6, v5

    if-gt v4, v6, :cond_5

    .line 605
    iget-object v4, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v5, v3, v4, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1

    .line 613
    :cond_5
    array-length v4, v5

    sub-int/2addr v4, v3

    .line 615
    iget-object v6, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v5, v3, v6, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v3, p1, v4

    .line 622
    iget-object v5, p0, Ll/۬ۤ֫;->ۖ:[B

    iget-object v6, p0, Ll/۬ۤ֫;->ۢ:[B

    invoke-static {v5, v2, v6, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 631
    :goto_1
    iget v3, p0, Ll/۬ۤ֫;->᩷:I

    rem-int v3, p1, v3

    if-nez v3, :cond_6

    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "sizeToOutput is not aligned to frame size: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 634
    iget v3, p0, Ll/۬ۤ֫;->ᩴ:I

    iget-object v4, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v4, v4

    if-ge v3, v4, :cond_7

    const/4 v3, 0x1

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 636
    iget-object v3, p0, Ll/۬ۤ֫;->ۢ:[B

    .line 536
    iget v4, p0, Ll/۬ۤ֫;->᩷:I

    rem-int v4, p1, v4

    if-nez v4, :cond_8

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "byteOutput size is not aligned to frame size "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    const/4 v1, 0x3

    if-ne p2, v1, :cond_9

    goto :goto_8

    :cond_9
    const/4 v1, 0x0

    :goto_5
    if-ge v1, p1, :cond_e

    add-int/lit8 v4, v1, 0x1

    .line 649
    aget-byte v5, v3, v4

    .line 650
    aget-byte v6, v3, v1

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v5, v6

    .line 654
    iget v6, p0, Ll/۬ۤ֫;->᩵:I

    if-nez p2, :cond_a

    add-int/lit8 v7, p1, -0x1

    add-int/lit8 v6, v6, -0x64

    mul-int/lit16 v8, v1, 0x3e8

    .line 670
    div-int/2addr v8, v7

    mul-int v8, v8, v6

    div-int/lit16 v8, v8, 0x3e8

    add-int/lit8 v6, v8, 0x64

    goto :goto_6

    :cond_a
    if-ne p2, v0, :cond_b

    add-int/lit8 v7, p1, -0x1

    rsub-int/lit8 v8, v6, 0x64

    mul-int/lit16 v9, v1, 0x3e8

    mul-int v9, v9, v8

    .line 676
    div-int/2addr v9, v7

    div-int/lit16 v9, v9, 0x3e8

    add-int/2addr v6, v9

    :cond_b
    :goto_6
    mul-int v5, v5, v6

    .line 664
    div-int/lit8 v5, v5, 0x64

    const/16 v6, 0x7fff

    if-lt v5, v6, :cond_c

    const/4 v5, -0x1

    .line 691
    aput-byte v5, v3, v1

    const/16 v5, 0x7f

    .line 692
    aput-byte v5, v3, v4

    goto :goto_7

    :cond_c
    const/16 v6, -0x8000

    if-gt v5, v6, :cond_d

    .line 694
    aput-byte v2, v3, v1

    const/16 v5, -0x80

    .line 695
    aput-byte v5, v3, v4

    goto :goto_7

    :cond_d
    and-int/lit16 v6, v5, 0xff

    int-to-byte v6, v6

    .line 697
    aput-byte v6, v3, v1

    shr-int/lit8 v5, v5, 0x8

    int-to-byte v5, v5

    .line 698
    aput-byte v5, v3, v4

    :goto_7
    add-int/lit8 v1, v1, 0x2

    goto :goto_5

    .line 540
    :cond_e
    :goto_8
    invoke-virtual {p0, p1}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2, v3, v2, p1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method

.method private ۧ(I)I
    .locals 4

    .line 713
    iget-object v0, p0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v0, v0, Ll/ᩴ֡֫;->ᩳ:I

    int-to-long v0, v0

    iget-wide v2, p0, Ll/۬ۤ֫;->ܺ:J

    mul-long v2, v2, v0

    const-wide/32 v0, 0xf4240

    div-long/2addr v2, v0

    long-to-int v0, v2

    .line 508
    iget v1, p0, Ll/۬ۤ֫;->ۚ:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/۬ۤ֫;->᩷:I

    mul-int v0, v0, v1

    iget-object v1, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v1, v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 512
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    int-to-float p1, p1

    .line 514
    iget v1, p0, Ll/۬ۤ֫;->֨:F

    mul-float p1, p1, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr p1, v1

    int-to-float v0, v0

    .line 515
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    float-to-int p1, p1

    .line 523
    iget v0, p0, Ll/۬ۤ֫;->᩷:I

    div-int/2addr p1, v0

    mul-int p1, p1, v0

    return p1
.end method

.method private ۧ(Z)V
    .locals 7

    .line 432
    iget v0, p0, Ll/۬ۤ֫;->ۘ:I

    .line 437
    iget-object v1, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v2, v1

    if-eq v0, v2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 439
    :cond_1
    :goto_0
    iget v2, p0, Ll/۬ۤ֫;->ۚ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-nez v2, :cond_4

    if-eqz p1, :cond_2

    const/4 p1, 0x3

    .line 445
    invoke-direct {p0, v0, p1}, Ll/۬ۤ֫;->֫(II)V

    move p1, v0

    goto :goto_2

    .line 448
    :cond_2
    array-length p1, v1

    div-int/2addr p1, v5

    if-lt v0, p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 452
    iget-object p1, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length p1, p1

    div-int/2addr p1, v5

    .line 453
    invoke-direct {p0, p1, v3}, Ll/۬ۤ֫;->֫(II)V

    :goto_2
    move v1, p1

    goto :goto_3

    :cond_4
    if-eqz p1, :cond_5

    .line 459
    array-length p1, v1

    div-int/2addr p1, v5

    sub-int p1, v0, p1

    .line 462
    array-length v1, v1

    div-int/2addr v1, v5

    add-int/2addr v1, p1

    .line 464
    invoke-direct {p0, p1}, Ll/۬ۤ֫;->ۧ(I)I

    move-result p1

    .line 469
    iget-object v2, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v2, v2

    div-int/2addr v2, v5

    add-int/2addr p1, v2

    .line 470
    invoke-direct {p0, p1, v5}, Ll/۬ۤ֫;->֫(II)V

    move v6, v1

    move v1, p1

    move p1, v6

    goto :goto_3

    .line 475
    :cond_5
    array-length p1, v1

    div-int/2addr p1, v5

    sub-int p1, v0, p1

    .line 477
    invoke-direct {p0, p1}, Ll/۬ۤ֫;->ۧ(I)I

    move-result v1

    .line 478
    invoke-direct {p0, v1, v4}, Ll/۬ۤ֫;->֫(II)V

    .line 481
    :goto_3
    iget v2, p0, Ll/۬ۤ֫;->᩷:I

    rem-int v2, p1, v2

    if-nez v2, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "bytesConsumed is not aligned to frame size: %s"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    if-lt v0, v1, :cond_7

    const/4 v3, 0x1

    .line 485
    :cond_7
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    .line 487
    iget v0, p0, Ll/۬ۤ֫;->ۘ:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/۬ۤ֫;->ۘ:I

    .line 488
    iget v0, p0, Ll/۬ۤ֫;->ᩴ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/۬ۤ֫;->ᩴ:I

    .line 490
    iget-object v2, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v2, v2

    rem-int/2addr v0, v2

    iput v0, p0, Ll/۬ۤ֫;->ᩴ:I

    .line 492
    iget v0, p0, Ll/۬ۤ֫;->ۚ:I

    iget v2, p0, Ll/۬ۤ֫;->᩷:I

    div-int v3, v1, v2

    add-int/2addr v3, v0

    iput v3, p0, Ll/۬ۤ֫;->ۚ:I

    .line 493
    iget-wide v3, p0, Ll/۬ۤ֫;->ܶ:J

    sub-int/2addr p1, v1

    div-int/2addr p1, v2

    int-to-long v0, p1

    add-long/2addr v3, v0

    iput-wide v3, p0, Ll/۬ۤ֫;->ܶ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 10

    .line 280
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Ll/֨֡֫;->֫()Z

    move-result v0

    if-nez v0, :cond_d

    .line 281
    iget v0, p0, Ll/۬ۤ֫;->᩸:I

    iget-short v1, p0, Ll/۬ۤ֫;->۠:S

    const/4 v2, 0x1

    if-eqz v0, :cond_9

    if-ne v0, v2, :cond_8

    .line 383
    iget v0, p0, Ll/۬ۤ֫;->ᩴ:I

    iget-object v3, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v3, v3

    const/4 v4, 0x0

    if-ge v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 385
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    .line 722
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v2

    :goto_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v5

    if-ge v3, v5, :cond_2

    .line 723
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    add-int/lit8 v6, v3, -0x1

    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v5, v6

    .line 751
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-le v5, v1, :cond_1

    .line 725
    iget v1, p0, Ll/۬ۤ֫;->᩷:I

    div-int/2addr v3, v1

    mul-int v3, v3, v1

    goto :goto_3

    :cond_1
    add-int/lit8 v3, v3, 0x2

    goto :goto_2

    .line 728
    :cond_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    .line 387
    :goto_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    sub-int v1, v3, v1

    .line 391
    iget v5, p0, Ll/۬ۤ֫;->ᩴ:I

    iget v6, p0, Ll/۬ۤ֫;->ۘ:I

    add-int v7, v5, v6

    iget-object v8, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v9, v8

    if-ge v7, v9, :cond_3

    .line 393
    array-length v5, v8

    goto :goto_4

    .line 399
    :cond_3
    array-length v7, v8

    sub-int/2addr v7, v5

    sub-int v7, v6, v7

    :goto_4
    sub-int/2addr v5, v7

    if-ge v3, v0, :cond_4

    const/4 v3, 0x1

    goto :goto_5

    :cond_4
    const/4 v3, 0x0

    .line 406
    :goto_5
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 407
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v8

    add-int/2addr v8, v6

    invoke-virtual {p1, v8}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 408
    iget-object v8, p0, Ll/۬ۤ֫;->ۖ:[B

    invoke-virtual {p1, v8, v7, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 409
    iget v7, p0, Ll/۬ۤ֫;->ۘ:I

    add-int/2addr v7, v6

    iput v7, p0, Ll/۬ۤ֫;->ۘ:I

    .line 411
    iget-object v6, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v6, v6

    if-gt v7, v6, :cond_5

    const/4 v6, 0x1

    goto :goto_6

    :cond_5
    const/4 v6, 0x0

    :goto_6
    invoke-static {v6}, Ll/᩺֡֫;->ۧ(Z)V

    if-eqz v3, :cond_6

    if-ge v1, v5, :cond_6

    goto :goto_7

    :cond_6
    const/4 v2, 0x0

    .line 419
    :goto_7
    invoke-direct {p0, v2}, Ll/۬ۤ֫;->ۧ(Z)V

    if-eqz v2, :cond_7

    .line 422
    iput v4, p0, Ll/۬ۤ֫;->᩸:I

    .line 423
    iput v4, p0, Ll/۬ۤ֫;->ۚ:I

    .line 427
    :cond_7
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    goto/16 :goto_0

    .line 289
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 337
    :cond_9
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    .line 340
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    iget-object v4, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v4, v4

    add-int/2addr v3, v4

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 737
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    sub-int/2addr v3, v2

    :goto_8
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v4

    if-lt v3, v4, :cond_b

    .line 738
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    add-int/lit8 v5, v3, -0x1

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v4, v5

    .line 751
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-le v4, v1, :cond_a

    .line 740
    iget v1, p0, Ll/۬ۤ֫;->᩷:I

    div-int/2addr v3, v1

    mul-int v3, v3, v1

    add-int/2addr v3, v1

    goto :goto_9

    :cond_a
    add-int/lit8 v3, v3, -0x2

    goto :goto_8

    .line 743
    :cond_b
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    .line 342
    :goto_9
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-ne v3, v1, :cond_c

    .line 344
    iput v2, p0, Ll/۬ۤ֫;->᩸:I

    goto :goto_a

    .line 346
    :cond_c
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 706
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 351
    :goto_a
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 250
    iput-boolean p1, p0, Ll/۬ۤ֫;->ۡ:Z

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x0

    .line 327
    iput-boolean v0, p0, Ll/۬ۤ֫;->ۡ:Z

    .line 328
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iput-object v0, p0, Ll/۬ۤ֫;->ۖ:[B

    .line 329
    iput-object v0, p0, Ll/۬ۤ֫;->ۢ:[B

    return-void
.end method

.method public final ۧ(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
    .locals 2

    .line 264
    iget v0, p1, Ll/ᩴ֡֫;->ܽ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 267
    iget v0, p1, Ll/ᩴ֡֫;->ᩳ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 268
    sget-object p1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    :cond_0
    return-object p1

    .line 265
    :cond_1
    new-instance v0, Ll/᩵֡֫;

    invoke-direct {v0, p1}, Ll/᩵֡֫;-><init>(Ll/ᩴ֡֫;)V

    throw v0
.end method

.method public final ܳ()V
    .locals 6

    .line 308
    invoke-virtual {p0}, Ll/۬ۤ֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v1, v0, Ll/ᩴ֡֫;->ۧ:I

    mul-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/۬ۤ֫;->᩷:I

    .line 713
    iget v0, v0, Ll/ᩴ֡֫;->ᩳ:I

    int-to-long v2, v0

    iget-wide v4, p0, Ll/۬ۤ֫;->֡:J

    mul-long v4, v4, v2

    const-wide/32 v2, 0xf4240

    div-long/2addr v4, v2

    long-to-int v0, v4

    .line 312
    div-int/lit8 v0, v0, 0x2

    .line 523
    div-int/2addr v0, v1

    mul-int v0, v0, v1

    mul-int/lit8 v0, v0, 0x2

    .line 313
    iget-object v1, p0, Ll/۬ۤ֫;->ۖ:[B

    array-length v1, v1

    if-eq v1, v0, :cond_0

    .line 314
    new-array v1, v0, [B

    iput-object v1, p0, Ll/۬ۤ֫;->ۖ:[B

    .line 315
    new-array v0, v0, [B

    iput-object v0, p0, Ll/۬ۤ֫;->ۢ:[B

    :cond_0
    const/4 v0, 0x0

    .line 318
    iput v0, p0, Ll/۬ۤ֫;->᩸:I

    const-wide/16 v1, 0x0

    .line 319
    iput-wide v1, p0, Ll/۬ۤ֫;->ܶ:J

    .line 320
    iput v0, p0, Ll/۬ۤ֫;->ۚ:I

    .line 321
    iput v0, p0, Ll/۬ۤ֫;->ᩴ:I

    .line 322
    iput v0, p0, Ll/۬ۤ֫;->ۘ:I

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 275
    invoke-super {p0}, Ll/֨֡֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/۬ۤ֫;->ۡ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()J
    .locals 2

    .line 258
    iget-wide v0, p0, Ll/۬ۤ֫;->ܶ:J

    return-wide v0
.end method

.method public final ᩻()V
    .locals 1

    .line 298
    iget v0, p0, Ll/۬ۤ֫;->ۘ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    .line 301
    invoke-direct {p0, v0}, Ll/۬ۤ֫;->ۧ(Z)V

    const/4 v0, 0x0

    .line 302
    iput v0, p0, Ll/۬ۤ֫;->ۚ:I

    :cond_0
    return-void
.end method
