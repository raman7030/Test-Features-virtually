.class public final Ll/ܳۚۢ;
.super Ljava/io/InputStream;
.source "M7AP"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:I

.field public final ۙ:[B

.field public ۫:I

.field public ۬:I

.field public final ᩶:Ljava/lang/CharSequence;

.field public final ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>([BLjava/lang/CharSequence;)V
    .locals 1

    .line 538
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    .line 529
    iput-object v0, p0, Ll/ܳۚۢ;->ۙ:[B

    .line 539
    iput-object p1, p0, Ll/ܳۚۢ;->᩸:[B

    .line 540
    iput-object p2, p0, Ll/ܳۚۢ;->᩶:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 546
    invoke-virtual {p0, v1, v2, v0}, Ll/ܳۚۢ;->read([BII)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 547
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 11

    if-eqz p1, :cond_c

    if-ltz p2, :cond_b

    if-ltz p3, :cond_b

    .line 555
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_b

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-lez p3, :cond_9

    .line 563
    iget v3, p0, Ll/ܳۚۢ;->᩹:I

    iget-object v4, p0, Ll/ܳۚۢ;->᩸:[B

    array-length v5, v4

    if-ge v3, v5, :cond_1

    .line 564
    array-length v2, v4

    sub-int/2addr v2, v3

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 565
    iget v3, p0, Ll/ܳۚۢ;->᩹:I

    invoke-static {v4, v3, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 566
    iget v3, p0, Ll/ܳۚۢ;->᩹:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܳۚۢ;->᩹:I

    goto/16 :goto_3

    .line 572
    :cond_1
    iget v3, p0, Ll/ܳۚۢ;->۬:I

    iget v4, p0, Ll/ܳۚۢ;->ۗ:I

    iget-object v5, p0, Ll/ܳۚۢ;->ۙ:[B

    if-lt v3, v4, :cond_8

    .line 589
    iput v0, p0, Ll/ܳۚۢ;->۬:I

    .line 590
    iput v0, p0, Ll/ܳۚۢ;->ۗ:I

    .line 591
    :goto_1
    iget v3, p0, Ll/ܳۚۢ;->۫:I

    iget-object v4, p0, Ll/ܳۚۢ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v3, v6, :cond_7

    iget v3, p0, Ll/ܳۚۢ;->ۗ:I

    array-length v6, v5

    add-int/lit8 v6, v6, -0x4

    if-gt v3, v6, :cond_7

    .line 592
    iget v3, p0, Ll/ܳۚۢ;->۫:I

    add-int/lit8 v6, v3, 0x1

    iput v6, p0, Ll/ܳۚۢ;->۫:I

    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v6, 0x80

    if-ge v3, v6, :cond_2

    .line 602
    iget v4, p0, Ll/ܳۚۢ;->ۗ:I

    add-int/lit8 v6, v4, 0x1

    iput v6, p0, Ll/ܳۚۢ;->ۗ:I

    int-to-byte v3, v3

    aput-byte v3, v5, v4

    goto :goto_1

    :cond_2
    const/16 v7, 0x800

    if-ge v3, v7, :cond_3

    .line 604
    iget v4, p0, Ll/ܳۚۢ;->ۗ:I

    add-int/lit8 v7, v4, 0x1

    iput v7, p0, Ll/ܳۚۢ;->ۗ:I

    shr-int/lit8 v8, v3, 0x6

    and-int/lit8 v8, v8, 0x1f

    or-int/lit16 v8, v8, 0xc0

    int-to-byte v8, v8

    aput-byte v8, v5, v4

    add-int/lit8 v4, v4, 0x2

    .line 605
    iput v4, p0, Ll/ܳۚۢ;->ۗ:I

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v6

    int-to-byte v3, v3

    aput-byte v3, v5, v7

    goto :goto_1

    .line 606
    :cond_3
    invoke-static {v3}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v7

    const/16 v8, 0x3f

    if-eqz v7, :cond_6

    .line 608
    iget v7, p0, Ll/ܳۚۢ;->۫:I

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v7, v9, :cond_4

    .line 609
    iget v7, p0, Ll/ܳۚۢ;->۫:I

    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    .line 610
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-static {v4}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 611
    invoke-static {v3, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v3

    goto :goto_2

    :cond_4
    const/4 v3, -0x1

    :goto_2
    if-gez v3, :cond_5

    .line 615
    iget v3, p0, Ll/ܳۚۢ;->ۗ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ܳۚۢ;->ۗ:I

    aput-byte v8, v5, v3

    goto :goto_1

    .line 617
    :cond_5
    iget v4, p0, Ll/ܳۚۢ;->ۗ:I

    add-int/lit8 v7, v4, 0x1

    iput v7, p0, Ll/ܳۚۢ;->ۗ:I

    shr-int/lit8 v9, v3, 0x12

    or-int/lit16 v9, v9, 0xf0

    int-to-byte v9, v9

    aput-byte v9, v5, v4

    add-int/lit8 v9, v4, 0x2

    .line 618
    iput v9, p0, Ll/ܳۚۢ;->ۗ:I

    shr-int/lit8 v10, v3, 0xc

    and-int/2addr v10, v8

    or-int/2addr v10, v6

    int-to-byte v10, v10

    aput-byte v10, v5, v7

    add-int/lit8 v7, v4, 0x3

    .line 619
    iput v7, p0, Ll/ܳۚۢ;->ۗ:I

    shr-int/lit8 v10, v3, 0x6

    and-int/2addr v8, v10

    or-int/2addr v8, v6

    int-to-byte v8, v8

    aput-byte v8, v5, v9

    add-int/lit8 v4, v4, 0x4

    .line 620
    iput v4, p0, Ll/ܳۚۢ;->ۗ:I

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v6

    int-to-byte v3, v3

    aput-byte v3, v5, v7

    .line 621
    iget v3, p0, Ll/ܳۚۢ;->۫:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Ll/ܳۚۢ;->۫:I

    goto/16 :goto_1

    .line 624
    :cond_6
    iget v4, p0, Ll/ܳۚۢ;->ۗ:I

    add-int/lit8 v7, v4, 0x1

    iput v7, p0, Ll/ܳۚۢ;->ۗ:I

    shr-int/lit8 v9, v3, 0xc

    and-int/lit8 v9, v9, 0xf

    or-int/lit16 v9, v9, 0xe0

    int-to-byte v9, v9

    aput-byte v9, v5, v4

    add-int/lit8 v9, v4, 0x2

    .line 625
    iput v9, p0, Ll/ܳۚۢ;->ۗ:I

    shr-int/lit8 v10, v3, 0x6

    and-int/2addr v8, v10

    or-int/2addr v8, v6

    int-to-byte v8, v8

    aput-byte v8, v5, v7

    add-int/lit8 v4, v4, 0x3

    .line 626
    iput v4, p0, Ll/ܳۚۢ;->ۗ:I

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v6

    int-to-byte v3, v3

    aput-byte v3, v5, v9

    goto/16 :goto_1

    .line 594
    :cond_7
    iget v3, p0, Ll/ܳۚۢ;->ۗ:I

    if-lez v3, :cond_9

    .line 575
    :cond_8
    iget v2, p0, Ll/ܳۚۢ;->ۗ:I

    iget v3, p0, Ll/ܳۚۢ;->۬:I

    sub-int/2addr v2, v3

    invoke-static {p3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 576
    iget v3, p0, Ll/ܳۚۢ;->۬:I

    invoke-static {v5, v3, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 577
    iget v3, p0, Ll/ܳۚۢ;->۬:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ܳۚۢ;->۬:I

    :goto_3
    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_9
    if-nez v1, :cond_a

    return v2

    :cond_a
    return v1

    .line 556
    :cond_b
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 553
    :cond_c
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "buffer"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
