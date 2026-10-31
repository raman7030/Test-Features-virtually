.class public final Ll/ۛۖܽ;
.super Ljava/lang/Object;
.source "2APZ"


# static fields
.field public static final ֫:Ll/֡ۛۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ll/֡ۛۡ;

    sget v1, Ll/ܿ᩸ۡ;->֫:I

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/ۛۖܽ;->֫:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫(II[B)I
    .locals 8

    const/16 v0, 0x80

    const/4 v1, 0x2

    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    add-int/lit8 p1, p0, 0x1

    .line 448
    aget-byte p0, p2, p0

    .line 449
    aget-byte p1, p2, p1

    const/16 p2, -0x20

    if-ne p0, p2, :cond_0

    and-int/lit16 p0, p1, 0xe0

    if-eq p0, v0, :cond_7

    .line 451
    :cond_0
    invoke-static {p1}, Ll/ۛۖܽ;->֫(I)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_0

    :cond_1
    const/4 v3, 0x4

    if-ne p1, v3, :cond_8

    add-int/lit8 p1, p0, 0x1

    .line 453
    aget-byte v3, p2, p0

    and-int/lit16 v3, v3, 0xff

    add-int/2addr p0, v1

    .line 454
    aget-byte p1, p2, p1

    and-int/lit16 v4, p1, 0xff

    const/16 v5, 0xf4

    if-gt v3, v5, :cond_7

    const/16 v6, 0xf0

    if-ne v3, v6, :cond_2

    const/16 v7, 0x90

    if-lt v4, v7, :cond_7

    const/16 v7, 0xbf

    if-gt v4, v7, :cond_7

    :cond_2
    if-ne v3, v5, :cond_3

    and-int/2addr p1, v6

    if-ne p1, v0, :cond_7

    .line 458
    :cond_3
    invoke-static {v4}, Ll/ۛۖܽ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 460
    :cond_4
    aget-byte p0, p2, p0

    invoke-static {p0}, Ll/ۛۖܽ;->֫(I)Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_5
    return v1

    :cond_6
    return v2

    :cond_7
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)I
    .locals 7

    .line 341
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    .line 342
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x80

    if-ge v3, v4, :cond_0

    goto :goto_2

    :cond_0
    const/16 v4, 0x800

    if-ge v3, v4, :cond_1

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    .line 347
    :cond_1
    sget v4, Ll/֫᩻᩵;->֫:I

    const v4, 0xd800

    if-lt v3, v4, :cond_4

    const v4, 0xe000

    if-ge v3, v4, :cond_4

    add-int/lit8 v4, v1, 0x1

    if-ge v4, v0, :cond_2

    .line 350
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 351
    invoke-static {v3}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 352
    invoke-static {v3, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v3

    goto :goto_1

    :cond_2
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_3

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x4

    move v1, v4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x3

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return v2
.end method

.method public static ֫(Ljava/lang/String;Z)J
    .locals 12

    .line 373
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_6

    .line 374
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x80

    const-wide/16 v6, 0x1

    if-ge v4, v5, :cond_0

    goto :goto_2

    :cond_0
    const/16 v5, 0x800

    if-ge v4, v5, :cond_1

    const-wide/16 v4, 0x2

    add-long/2addr v1, v4

    goto :goto_3

    .line 379
    :cond_1
    sget v5, Ll/֫᩻᩵;->֫:I

    const v5, 0xd800

    const-wide/16 v8, 0x3

    if-lt v4, v5, :cond_5

    const v5, 0xe000

    if-ge v4, v5, :cond_5

    add-int/lit8 v5, v3, 0x1

    if-ge v5, v0, :cond_2

    .line 382
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v10

    .line 383
    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-static {v10}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 384
    invoke-static {v4, v10}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v4

    goto :goto_1

    :cond_2
    const/4 v4, -0x1

    :goto_1
    if-gez v4, :cond_4

    if-eqz p1, :cond_3

    move-wide v6, v8

    :cond_3
    :goto_2
    add-long/2addr v1, v6

    goto :goto_3

    :cond_4
    const-wide/16 v3, 0x4

    add-long/2addr v1, v3

    move v3, v5

    goto :goto_3

    :cond_5
    add-long/2addr v1, v8

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    return-wide v1
.end method

.method public static ֫(Ljava/io/BufferedOutputStream;I)V
    .locals 1

    and-int/lit16 v0, p1, 0xff

    .line 401
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 402
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 403
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    .line 404
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public static ֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V
    .locals 8

    .line 240
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    .line 241
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_0

    int-to-byte v2, v2

    .line 243
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    goto/16 :goto_2

    :cond_0
    const/16 v4, 0x800

    if-ge v2, v4, :cond_1

    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x1f

    or-int/lit16 v4, v4, 0xc0

    .line 245
    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    .line 246
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    goto :goto_2

    .line 247
    :cond_1
    sget v4, Ll/֫᩻᩵;->֫:I

    const v4, 0xd800

    const/16 v5, 0x3f

    if-lt v2, v4, :cond_4

    const v4, 0xe000

    if-ge v2, v4, :cond_4

    add-int/lit8 v4, v1, 0x1

    if-ge v4, v0, :cond_2

    .line 250
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    .line 251
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 252
    invoke-static {v2, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, -0x1

    :goto_1
    if-gez v2, :cond_3

    .line 318
    invoke-virtual {p0, v5}, Ljava/io/OutputStream;->write(I)V

    goto :goto_2

    :cond_3
    shr-int/lit8 v1, v2, 0x12

    or-int/lit16 v1, v1, 0xf0

    .line 258
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v1, v2, 0xc

    and-int/2addr v1, v5

    or-int/2addr v1, v3

    .line 259
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v1, v2, 0x6

    and-int/2addr v1, v5

    or-int/2addr v1, v3

    .line 260
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v1, v2, 0x3f

    or-int/2addr v1, v3

    .line 261
    invoke-virtual {p0, v1}, Ljava/io/OutputStream;->write(I)V

    move v1, v4

    goto :goto_2

    :cond_4
    shr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0xf

    or-int/lit16 v4, v4, 0xe0

    .line 265
    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V

    shr-int/lit8 v4, v2, 0x6

    and-int/2addr v4, v5

    or-int/2addr v4, v3

    .line 266
    invoke-virtual {p0, v4}, Ljava/io/OutputStream;->write(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    .line 267
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write(I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;[BII)V
    .locals 8

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_12

    add-int/lit8 v0, p2, 0x1

    .line 25
    aget-byte v1, p1, p2

    if-ltz v1, :cond_0

    int-to-char p2, v1

    .line 27
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :cond_0
    shr-int/lit8 v2, v1, 0x5

    const/4 v3, -0x2

    const v4, 0xfffd

    if-ne v2, v3, :cond_3

    and-int/lit8 v2, v1, 0x1e

    if-eqz v2, :cond_3

    if-ge v0, p3, :cond_2

    add-int/lit8 p2, p2, 0x2

    .line 30
    aget-byte v2, p1, v0

    .line 31
    invoke-static {v2}, Ll/ۛۖܽ;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 32
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :cond_1
    shl-int/lit8 v0, v1, 0x6

    xor-int/2addr v0, v2

    xor-int/lit16 v0, v0, 0xf80

    int-to-char v0, v0

    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_3
    shr-int/lit8 v2, v1, 0x4

    const/16 v5, 0x80

    if-ne v2, v3, :cond_9

    add-int/lit8 v2, p2, 0x2

    if-ge v2, p3, :cond_5

    .line 45
    aget-byte v0, p1, v0

    add-int/lit8 v3, p2, 0x3

    .line 46
    aget-byte v2, p1, v2

    .line 47
    invoke-static {v1, v0, v2}, Ll/ۛۖܽ;->֫(III)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 48
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v0, 0x3

    .line 50
    invoke-static {p2, v0, p1}, Ll/ۛۖܽ;->֫(II[B)I

    move-result v0

    goto/16 :goto_2

    :cond_4
    shl-int/lit8 p2, v1, 0xc

    shl-int/lit8 v0, v0, 0x6

    xor-int/2addr p2, v0

    const v0, -0x1e080

    xor-int/2addr v0, v2

    xor-int/2addr p2, v0

    int-to-char p2, p2

    .line 61
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move p2, v3

    goto :goto_0

    :cond_5
    if-ge v0, p3, :cond_8

    .line 66
    aget-byte p2, p1, v0

    const/16 v2, -0x20

    if-ne v1, v2, :cond_6

    and-int/lit16 v1, p2, 0xe0

    if-eq v1, v5, :cond_7

    :cond_6
    and-int/lit16 p2, p2, 0xc0

    if-eq p2, v5, :cond_8

    .line 67
    :cond_7
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_4

    .line 70
    :cond_8
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_9
    shr-int/lit8 v2, v1, 0x3

    if-ne v2, v3, :cond_11

    add-int/lit8 v2, p2, 0x3

    if-ge v2, p3, :cond_d

    add-int/lit8 v3, p2, 0x2

    .line 74
    aget-byte v0, p1, v0

    .line 75
    aget-byte v3, p1, v3

    add-int/lit8 v6, p2, 0x4

    .line 76
    aget-byte v2, p1, v2

    shl-int/lit8 v1, v1, 0x12

    shl-int/lit8 v7, v0, 0xc

    xor-int/2addr v1, v7

    shl-int/lit8 v7, v3, 0x6

    xor-int/2addr v1, v7

    const v7, 0x381f80

    xor-int/2addr v7, v2

    xor-int/2addr v1, v7

    and-int/lit16 v0, v0, 0xc0

    if-ne v0, v5, :cond_c

    and-int/lit16 v0, v3, 0xc0

    if-ne v0, v5, :cond_c

    and-int/lit16 v0, v2, 0xc0

    if-eq v0, v5, :cond_a

    goto :goto_1

    .line 86
    :cond_a
    invoke-static {v1}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_1

    .line 91
    :cond_b
    sget p2, Ll/֫᩻᩵;->֫:I

    ushr-int/lit8 p2, v1, 0xa

    const v0, 0xd7c0

    add-int/2addr p2, v0

    int-to-char p2, p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit16 p2, v1, 0x3ff

    const v0, 0xdc00

    add-int/2addr p2, v0

    int-to-char p2, p2

    .line 92
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move p2, v6

    goto/16 :goto_0

    .line 87
    :cond_c
    :goto_1
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v0, 0x4

    .line 89
    invoke-static {p2, v0, p1}, Ll/ۛۖܽ;->֫(II[B)I

    move-result v0

    :goto_2
    add-int/2addr p2, v0

    goto/16 :goto_0

    :cond_d
    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0xf4

    if-gt v1, v2, :cond_10

    if-ge v0, p3, :cond_e

    .line 97
    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xff

    .line 98
    invoke-static {v1, v2}, Ll/ۛۖܽ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_3

    :cond_e
    add-int/lit8 p2, p2, 0x2

    .line 103
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ge p2, p3, :cond_12

    .line 104
    aget-byte v0, p1, p2

    and-int/lit16 v0, v0, 0xc0

    if-eq v0, v5, :cond_f

    goto/16 :goto_0

    :cond_f
    return-void

    .line 99
    :cond_10
    :goto_3
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 109
    :cond_11
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_4
    move p2, v0

    goto/16 :goto_0

    :cond_12
    return-void
.end method

.method public static ֫(Ll/֫᩷ܽ;Ljava/lang/CharSequence;Z)V
    .locals 8

    .line 280
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_6

    .line 281
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_0

    int-to-byte v2, v2

    .line 283
    invoke-interface {p0, v2}, Ll/֫᩷ܽ;->writeByte(I)V

    goto/16 :goto_2

    :cond_0
    const/16 v4, 0x800

    if-ge v2, v4, :cond_1

    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x1f

    or-int/lit16 v4, v4, 0xc0

    .line 285
    invoke-interface {p0, v4}, Ll/֫᩷ܽ;->writeByte(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    .line 286
    invoke-interface {p0, v2}, Ll/֫᩷ܽ;->writeByte(I)V

    goto/16 :goto_2

    .line 287
    :cond_1
    sget v4, Ll/֫᩻᩵;->֫:I

    const v4, 0xd800

    const/16 v5, 0x3f

    if-lt v2, v4, :cond_5

    const v4, 0xe000

    if-ge v2, v4, :cond_5

    add-int/lit8 v4, v1, 0x1

    if-ge v4, v0, :cond_2

    .line 290
    invoke-interface {p1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    .line 291
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 292
    invoke-static {v2, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, -0x1

    :goto_1
    if-gez v2, :cond_4

    if-eqz p2, :cond_3

    const/16 v2, 0xef

    .line 324
    invoke-interface {p0, v2}, Ll/֫᩷ܽ;->writeByte(I)V

    const/16 v2, 0xbf

    .line 325
    invoke-interface {p0, v2}, Ll/֫᩷ܽ;->writeByte(I)V

    const/16 v2, 0xbd

    .line 326
    invoke-interface {p0, v2}, Ll/֫᩷ܽ;->writeByte(I)V

    goto :goto_2

    .line 328
    :cond_3
    invoke-interface {p0, v5}, Ll/֫᩷ܽ;->writeByte(I)V

    goto :goto_2

    :cond_4
    shr-int/lit8 v1, v2, 0x12

    or-int/lit16 v1, v1, 0xf0

    .line 298
    invoke-interface {p0, v1}, Ll/֫᩷ܽ;->writeByte(I)V

    shr-int/lit8 v1, v2, 0xc

    and-int/2addr v1, v5

    or-int/2addr v1, v3

    .line 299
    invoke-interface {p0, v1}, Ll/֫᩷ܽ;->writeByte(I)V

    shr-int/lit8 v1, v2, 0x6

    and-int/2addr v1, v5

    or-int/2addr v1, v3

    .line 300
    invoke-interface {p0, v1}, Ll/֫᩷ܽ;->writeByte(I)V

    and-int/lit8 v1, v2, 0x3f

    or-int/2addr v1, v3

    .line 301
    invoke-interface {p0, v1}, Ll/֫᩷ܽ;->writeByte(I)V

    move v1, v4

    goto :goto_2

    :cond_5
    shr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0xf

    or-int/lit16 v4, v4, 0xe0

    .line 305
    invoke-interface {p0, v4}, Ll/֫᩷ܽ;->writeByte(I)V

    shr-int/lit8 v4, v2, 0x6

    and-int/2addr v4, v5

    or-int/2addr v4, v3

    .line 306
    invoke-interface {p0, v4}, Ll/֫᩷ܽ;->writeByte(I)V

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    .line 307
    invoke-interface {p0, v2}, Ll/֫᩷ܽ;->writeByte(I)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public static ֫([BILl/᩺ۖܽ;)V
    .locals 13

    .line 115
    sget-object v0, Ll/ۛۖܽ;->֫:Ll/֡ۛۡ;

    invoke-virtual {v0}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [C

    if-nez v1, :cond_0

    const/16 v1, 0x400

    new-array v1, v1, [C

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, p1, :cond_15

    const/16 v5, 0x3fc

    if-lt v4, v5, :cond_1

    .line 124
    invoke-virtual {p2, v1, v2, v4}, Ll/᩺ۖܽ;->write([CII)V

    const/4 v4, 0x0

    :cond_1
    add-int/lit8 v5, v3, 0x1

    .line 127
    aget-byte v6, p0, v3

    if-ltz v6, :cond_2

    add-int/lit8 v3, v4, 0x1

    int-to-char v6, v6

    .line 129
    aput-char v6, v1, v4

    :goto_1
    move v4, v3

    goto/16 :goto_8

    :cond_2
    shr-int/lit8 v7, v6, 0x5

    const/4 v8, -0x2

    const v9, 0xfffd

    if-ne v7, v8, :cond_5

    and-int/lit8 v7, v6, 0x1e

    if-eqz v7, :cond_5

    if-ge v5, p1, :cond_4

    add-int/lit8 v3, v3, 0x2

    .line 132
    aget-byte v7, p0, v5

    .line 133
    invoke-static {v7}, Ll/ۛۖܽ;->֫(I)Z

    move-result v8

    if-eqz v8, :cond_3

    add-int/lit8 v3, v4, 0x1

    .line 134
    aput-char v9, v1, v4

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v4, 0x1

    shl-int/lit8 v6, v6, 0x6

    xor-int/2addr v6, v7

    xor-int/lit16 v6, v6, 0xf80

    int-to-char v6, v6

    .line 137
    aput-char v6, v1, v4

    :goto_2
    move v4, v5

    goto :goto_0

    :cond_4
    add-int/lit8 p0, v4, 0x1

    .line 143
    aput-char v9, v1, v4

    :goto_3
    move v4, p0

    goto/16 :goto_9

    :cond_5
    shr-int/lit8 v7, v6, 0x4

    const/16 v10, 0x80

    if-ne v7, v8, :cond_c

    add-int/lit8 v7, v3, 0x2

    if-ge v7, p1, :cond_8

    .line 147
    aget-byte v5, p0, v5

    add-int/lit8 v8, v3, 0x3

    .line 148
    aget-byte v7, p0, v7

    .line 149
    invoke-static {v6, v5, v7}, Ll/ۛۖܽ;->֫(III)Z

    move-result v10

    if-eqz v10, :cond_6

    add-int/lit8 v5, v4, 0x1

    .line 150
    aput-char v9, v1, v4

    const/4 v4, 0x3

    .line 152
    invoke-static {v3, v4, p0}, Ll/ۛۖܽ;->֫(II[B)I

    move-result v4

    goto/16 :goto_6

    :cond_6
    shl-int/lit8 v3, v6, 0xc

    shl-int/lit8 v5, v5, 0x6

    xor-int/2addr v3, v5

    const v5, -0x1e080

    xor-int/2addr v5, v7

    xor-int/2addr v3, v5

    int-to-char v3, v3

    .line 160
    sget v5, Ll/֫᩻᩵;->֫:I

    const v5, 0xd800

    if-lt v3, v5, :cond_7

    const v5, 0xe000

    if-ge v3, v5, :cond_7

    add-int/lit8 v3, v4, 0x1

    .line 161
    aput-char v9, v1, v4

    move v4, v3

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v4, 0x1

    .line 163
    aput-char v3, v1, v4

    move v4, v5

    :goto_4
    move v3, v8

    goto/16 :goto_0

    :cond_8
    if-ge v5, p1, :cond_b

    .line 168
    aget-byte v3, p0, v5

    const/16 v7, -0x20

    if-ne v6, v7, :cond_9

    and-int/lit16 v6, v3, 0xe0

    if-eq v6, v10, :cond_a

    :cond_9
    and-int/lit16 v3, v3, 0xc0

    if-eq v3, v10, :cond_b

    :cond_a
    add-int/lit8 v3, v4, 0x1

    .line 169
    aput-char v9, v1, v4

    goto/16 :goto_1

    :cond_b
    add-int/lit8 p0, v4, 0x1

    .line 172
    aput-char v9, v1, v4

    goto :goto_3

    :cond_c
    shr-int/lit8 v7, v6, 0x3

    if-ne v7, v8, :cond_14

    add-int/lit8 v7, v3, 0x3

    if-ge v7, p1, :cond_10

    add-int/lit8 v8, v3, 0x2

    .line 176
    aget-byte v5, p0, v5

    .line 177
    aget-byte v8, p0, v8

    add-int/lit8 v11, v3, 0x4

    .line 178
    aget-byte v7, p0, v7

    shl-int/lit8 v6, v6, 0x12

    shl-int/lit8 v12, v5, 0xc

    xor-int/2addr v6, v12

    shl-int/lit8 v12, v8, 0x6

    xor-int/2addr v6, v12

    const v12, 0x381f80

    xor-int/2addr v12, v7

    xor-int/2addr v6, v12

    and-int/lit16 v5, v5, 0xc0

    if-ne v5, v10, :cond_f

    and-int/lit16 v5, v8, 0xc0

    if-ne v5, v10, :cond_f

    and-int/lit16 v5, v7, 0xc0

    if-eq v5, v10, :cond_d

    goto :goto_5

    .line 188
    :cond_d
    invoke-static {v6}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_5

    :cond_e
    add-int/lit8 v3, v4, 0x1

    .line 193
    sget v5, Ll/֫᩻᩵;->֫:I

    ushr-int/lit8 v5, v6, 0xa

    const v7, 0xd7c0

    add-int/2addr v5, v7

    int-to-char v5, v5

    aput-char v5, v1, v4

    add-int/lit8 v4, v4, 0x2

    and-int/lit16 v5, v6, 0x3ff

    const v6, 0xdc00

    add-int/2addr v5, v6

    int-to-char v5, v5

    .line 194
    aput-char v5, v1, v3

    move v3, v11

    goto/16 :goto_0

    :cond_f
    :goto_5
    add-int/lit8 v5, v4, 0x1

    .line 189
    aput-char v9, v1, v4

    const/4 v4, 0x4

    .line 191
    invoke-static {v3, v4, p0}, Ll/ۛۖܽ;->֫(II[B)I

    move-result v4

    :goto_6
    add-int/2addr v3, v4

    goto/16 :goto_2

    :cond_10
    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0xf4

    if-gt v6, v7, :cond_13

    if-ge v5, p1, :cond_11

    .line 199
    aget-byte v7, p0, v5

    and-int/lit16 v7, v7, 0xff

    .line 200
    invoke-static {v6, v7}, Ll/ۛۖܽ;->֫(II)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_7

    :cond_11
    add-int/lit8 v3, v3, 0x2

    add-int/lit8 v5, v4, 0x1

    .line 205
    aput-char v9, v1, v4

    if-ge v3, p1, :cond_12

    .line 206
    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xc0

    if-eq v4, v10, :cond_12

    goto/16 :goto_2

    :cond_12
    move v4, v5

    goto :goto_9

    :cond_13
    :goto_7
    add-int/lit8 v3, v4, 0x1

    .line 201
    aput-char v9, v1, v4

    goto/16 :goto_1

    :cond_14
    add-int/lit8 v3, v4, 0x1

    .line 211
    aput-char v9, v1, v4

    goto/16 :goto_1

    :goto_8
    move v3, v5

    goto/16 :goto_0

    :cond_15
    :goto_9
    if-lez v4, :cond_16

    .line 215
    invoke-virtual {p2, v1, v2, v4}, Ll/᩺ۖܽ;->write([CII)V

    .line 217
    :cond_16
    invoke-virtual {v0, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(I)Z
    .locals 1

    and-int/lit16 p0, p0, 0xc0

    const/16 v0, 0x80

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(II)Z
    .locals 2

    const/16 v0, 0xf0

    if-ne p0, v0, :cond_0

    const/16 v0, 0x90

    if-lt p1, v0, :cond_2

    const/16 v0, 0xbf

    if-gt p1, v0, :cond_2

    :cond_0
    const/16 v0, 0xf4

    const/16 v1, 0x80

    if-ne p0, v0, :cond_1

    and-int/lit16 p0, p1, 0xf0

    if-ne p0, v1, :cond_2

    :cond_1
    and-int/lit16 p0, p1, 0xc0

    if-eq p0, v1, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(III)Z
    .locals 2

    const/16 v0, -0x20

    const/16 v1, 0x80

    if-ne p0, v0, :cond_0

    and-int/lit16 p0, p1, 0xe0

    if-eq p0, v1, :cond_2

    :cond_0
    and-int/lit16 p0, p1, 0xc0

    if-ne p0, v1, :cond_2

    and-int/lit16 p0, p2, 0xc0

    if-eq p0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
