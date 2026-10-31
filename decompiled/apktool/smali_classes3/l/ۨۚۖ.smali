.class public final Ll/ۨۚۖ;
.super Ljava/lang/Object;
.source "P9QN"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/ۨۚۖ;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۨۚۖ;->ۧ:Ljava/util/logging/Logger;

    .line 1430
    sget-object v0, Ll/۬ۚۖ;->᩹:Ll/۬ۚۖ;

    .line 1433
    sget v0, Ll/ܽ֨ۖ;->֫:I

    .line 32
    sget v0, Ll/ۧ֨ۖ;->֫:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(B)I
    .locals 2

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_1
    add-int/lit8 p0, p0, -0x37

    return p0
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2476
    invoke-static {p0, v0, v1}, Ll/ۨۚۖ;->֫(Ljava/lang/String;ZZ)J

    move-result-wide v0

    long-to-int p0, v0

    return p0
.end method

.method public static ֫(Ljava/lang/String;ZZ)J
    .locals 7

    const-string v0, "-"

    const/4 v1, 0x0

    .line 2513
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    const/4 v0, 0x1

    goto :goto_0

    .line 2515
    :cond_0
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string p2, "Number must be positive: "

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v2, "0x"

    .line 2522
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v2

    const/16 v3, 0x10

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x2

    const/16 v2, 0x10

    goto :goto_1

    :cond_2
    const-string v2, "0"

    .line 2525
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x8

    goto :goto_1

    :cond_3
    const/16 v2, 0xa

    .line 2529
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 2532
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, "Number out of range for 32-bit unsigned integer: "

    const-string v6, "Number out of range for 32-bit signed integer: "

    if-ge v4, v3, :cond_9

    .line 2534
    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    if-eqz v0, :cond_4

    neg-long v1, v1

    :cond_4
    if-nez p2, :cond_8

    if-eqz p1, :cond_6

    const-wide/32 p1, 0x7fffffff

    cmp-long v0, v1, p1

    if-gtz v0, :cond_5

    const-wide/32 p1, -0x80000000

    cmp-long v0, v1, p1

    if-ltz v0, :cond_5

    goto :goto_2

    .line 2545
    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const-wide p1, 0x100000000L

    cmp-long v0, v1, p1

    if-gez v0, :cond_7

    const-wide/16 p1, 0x0

    cmp-long v0, v1, p1

    if-ltz v0, :cond_7

    goto :goto_2

    .line 2550
    :cond_7
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    return-wide v1

    .line 2556
    :cond_9
    new-instance v3, Ljava/math/BigInteger;

    invoke-direct {v3, v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    if-eqz v0, :cond_a

    .line 2558
    invoke-virtual {v3}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v3

    :cond_a
    if-nez p2, :cond_e

    if-eqz p1, :cond_c

    .line 2564
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    const/16 p2, 0x1f

    if-gt p1, p2, :cond_b

    goto :goto_3

    .line 2565
    :cond_b
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2569
    :cond_c
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    const/16 p2, 0x20

    if-gt p1, p2, :cond_d

    goto :goto_3

    .line 2570
    :cond_d
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-virtual {v5, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    if-eqz p1, :cond_10

    .line 2576
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    const/16 p2, 0x3f

    if-gt p1, p2, :cond_f

    goto :goto_3

    .line 2577
    :cond_f
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string p2, "Number out of range for 64-bit signed integer: "

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 2581
    :cond_10
    invoke-virtual {v3}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    const/16 p2, 0x40

    if-gt p1, p2, :cond_11

    .line 2588
    :goto_3
    invoke-virtual {v3}, Ljava/math/BigInteger;->longValue()J

    move-result-wide p0

    return-wide p0

    .line 2582
    :cond_11
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string p2, "Number out of range for 64-bit unsigned integer: "

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫()Ljava/util/logging/Logger;
    .locals 1

    .line 34
    sget-object v0, Ll/ۨۚۖ;->ۧ:Ljava/util/logging/Logger;

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)J
    .locals 2

    const/4 v0, 0x1

    .line 2495
    invoke-static {p0, v0, v0}, Ll/ۨۚۖ;->֫(Ljava/lang/String;ZZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۧ(B)Z
    .locals 1

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v0, 0x39

    if-le p0, v0, :cond_2

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p0, :cond_1

    const/16 v0, 0x66

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p0, :cond_3

    const/16 v0, 0x46

    if-gt p0, v0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 2486
    invoke-static {p0, v0, v0}, Ll/ۨۚۖ;->֫(Ljava/lang/String;ZZ)J

    move-result-wide v0

    long-to-int p0, v0

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)Ll/ۛۜۖ;
    .locals 14

    .line 2241
    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۛۜۖ;->֫(Ljava/lang/String;)Ll/ۛۜۖ;

    move-result-object p0

    .line 2249
    move-object v0, p0

    check-cast v0, Ll/۫ۜۖ;

    .line 1398
    iget-object v0, v0, Ll/۫ۜۖ;->ۙ:[B

    array-length v1, v0

    .line 2249
    new-array v2, v1, [B

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 1398
    :goto_0
    array-length v6, v0

    if-ge v4, v6, :cond_1b

    .line 1388
    aget-byte v6, v0, v4

    const/16 v7, 0x5c

    const/4 v8, 0x1

    if-ne v6, v7, :cond_1a

    add-int/lit8 v6, v4, 0x1

    .line 1398
    array-length v9, v0

    if-ge v6, v9, :cond_19

    .line 1388
    aget-byte v9, v0, v6

    const/16 v10, 0x30

    if-gt v10, v9, :cond_2

    const/16 v11, 0x37

    if-gt v9, v11, :cond_2

    .line 2259
    invoke-static {v9}, Ll/ۨۚۖ;->֫(B)I

    move-result v7

    add-int/lit8 v4, v4, 0x2

    .line 1398
    array-length v9, v0

    if-ge v4, v9, :cond_0

    .line 1388
    aget-byte v9, v0, v4

    if-gt v10, v9, :cond_0

    if-gt v9, v11, :cond_0

    mul-int/lit8 v7, v7, 0x8

    .line 2262
    invoke-static {v9}, Ll/ۨۚۖ;->֫(B)I

    move-result v6

    add-int/2addr v7, v6

    move v6, v4

    :cond_0
    add-int/lit8 v4, v6, 0x1

    .line 1398
    array-length v9, v0

    if-ge v4, v9, :cond_1

    .line 1388
    aget-byte v9, v0, v4

    if-gt v10, v9, :cond_1

    if-gt v9, v11, :cond_1

    mul-int/lit8 v7, v7, 0x8

    .line 2266
    invoke-static {v9}, Ll/ۨۚۖ;->֫(B)I

    move-result v6

    add-int/2addr v7, v6

    move v6, v4

    :cond_1
    add-int/lit8 v4, v5, 0x1

    int-to-byte v7, v7

    .line 2269
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :cond_2
    const/16 v10, 0x22

    if-eq v9, v10, :cond_18

    const/16 v10, 0x27

    if-eq v9, v10, :cond_17

    const/16 v11, 0x3f

    if-eq v9, v11, :cond_16

    const/16 v11, 0x55

    if-eq v9, v11, :cond_f

    if-eq v9, v7, :cond_e

    const/16 v7, 0x66

    const/16 v11, 0xc

    if-eq v9, v7, :cond_d

    const/16 v7, 0x6e

    if-eq v9, v7, :cond_c

    const/16 v7, 0x72

    if-eq v9, v7, :cond_b

    const/16 v7, 0x78

    if-eq v9, v7, :cond_8

    const/16 v7, 0x61

    if-eq v9, v7, :cond_7

    const/16 v7, 0x62

    const/16 v12, 0x8

    if-eq v9, v7, :cond_6

    packed-switch v9, :pswitch_data_0

    .line 2394
    new-instance p0, Ll/ۗۚۖ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid escape sequence: \'\\"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v1, v9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2420
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2394
    throw p0

    :pswitch_0
    add-int/lit8 v4, v5, 0x1

    const/16 v7, 0xb

    .line 2291
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :pswitch_1
    add-int/lit8 v6, v4, 0x2

    add-int/lit8 v7, v4, 0x5

    .line 1398
    array-length v9, v0

    if-ge v7, v9, :cond_5

    .line 1388
    aget-byte v9, v0, v6

    .line 2327
    invoke-static {v9}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v9

    if-eqz v9, :cond_5

    add-int/lit8 v9, v4, 0x3

    .line 1388
    aget-byte v10, v0, v9

    .line 2328
    invoke-static {v10}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v10

    if-eqz v10, :cond_5

    add-int/lit8 v4, v4, 0x4

    .line 1388
    aget-byte v10, v0, v4

    .line 2329
    invoke-static {v10}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 1388
    aget-byte v10, v0, v7

    .line 2330
    invoke-static {v10}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 1388
    aget-byte v6, v0, v6

    .line 2333
    invoke-static {v6}, Ll/ۨۚۖ;->֫(B)I

    move-result v6

    shl-int/2addr v6, v11

    .line 1388
    aget-byte v9, v0, v9

    .line 2334
    invoke-static {v9}, Ll/ۨۚۖ;->֫(B)I

    move-result v9

    shl-int/2addr v9, v12

    or-int/2addr v6, v9

    .line 1388
    aget-byte v4, v0, v4

    .line 2335
    invoke-static {v4}, Ll/ۨۚۖ;->֫(B)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    or-int/2addr v4, v6

    .line 1388
    aget-byte v6, v0, v7

    .line 2336
    invoke-static {v6}, Ll/ۨۚۖ;->֫(B)I

    move-result v6

    or-int/2addr v4, v6

    int-to-char v4, v4

    const v6, 0xd800

    if-lt v4, v6, :cond_4

    const v6, 0xdfff

    if-le v4, v6, :cond_3

    goto :goto_1

    .line 2339
    :cond_3
    new-instance p0, Ll/ۗۚۖ;

    const-string v0, "Invalid escape sequence: \'\\u\' refers to a surrogate"

    .line 2420
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2339
    throw p0

    .line 2342
    :cond_4
    :goto_1
    invoke-static {v4}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    .line 2343
    array-length v6, v4

    invoke-static {v4, v3, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2344
    array-length v4, v4

    goto/16 :goto_4

    .line 2347
    :cond_5
    new-instance p0, Ll/ۗۚۖ;

    const-string v0, "Invalid escape sequence: \'\\u\' with too few hex chars"

    .line 2420
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2347
    throw p0

    :pswitch_2
    add-int/lit8 v4, v5, 0x1

    const/16 v7, 0x9

    .line 2288
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :cond_6
    add-int/lit8 v4, v5, 0x1

    .line 2276
    aput-byte v12, v2, v5

    goto/16 :goto_5

    :cond_7
    add-int/lit8 v4, v5, 0x1

    const/4 v7, 0x7

    .line 2273
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :cond_8
    add-int/lit8 v6, v4, 0x2

    .line 1398
    array-length v7, v0

    if-ge v6, v7, :cond_a

    .line 1388
    aget-byte v7, v0, v6

    .line 2309
    invoke-static {v7}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 1388
    aget-byte v7, v0, v6

    .line 2311
    invoke-static {v7}, Ll/ۨۚۖ;->֫(B)I

    move-result v7

    add-int/lit8 v4, v4, 0x3

    .line 1398
    array-length v9, v0

    if-ge v4, v9, :cond_9

    .line 1388
    aget-byte v9, v0, v4

    .line 2316
    invoke-static {v9}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v9

    if-eqz v9, :cond_9

    mul-int/lit8 v7, v7, 0x10

    .line 1388
    aget-byte v6, v0, v4

    .line 2318
    invoke-static {v6}, Ll/ۨۚۖ;->֫(B)I

    move-result v6

    add-int/2addr v7, v6

    move v6, v4

    :cond_9
    add-int/lit8 v4, v5, 0x1

    int-to-byte v7, v7

    .line 2320
    aput-byte v7, v2, v5

    goto/16 :goto_5

    .line 2313
    :cond_a
    new-instance p0, Ll/ۗۚۖ;

    const-string v0, "Invalid escape sequence: \'\\x\' with no digits"

    .line 2420
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2313
    throw p0

    :cond_b
    add-int/lit8 v4, v5, 0x1

    const/16 v7, 0xd

    .line 2285
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :cond_c
    add-int/lit8 v4, v5, 0x1

    const/16 v7, 0xa

    .line 2282
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :cond_d
    add-int/lit8 v4, v5, 0x1

    .line 2279
    aput-byte v11, v2, v5

    goto/16 :goto_5

    :cond_e
    add-int/lit8 v4, v5, 0x1

    .line 2294
    aput-byte v7, v2, v5

    goto/16 :goto_5

    :cond_f
    add-int/lit8 v6, v4, 0x2

    add-int/lit8 v7, v4, 0x9

    .line 1398
    array-length v9, v0

    const-string v10, "Invalid escape sequence: \'\\U\' with too few hex chars"

    if-ge v7, v9, :cond_15

    const/4 v9, 0x0

    move v11, v6

    :goto_2
    add-int/lit8 v12, v4, 0xa

    if-ge v11, v12, :cond_11

    .line 1388
    aget-byte v12, v0, v11

    .line 2362
    invoke-static {v12}, Ll/ۨۚۖ;->ۧ(B)Z

    move-result v13

    if-eqz v13, :cond_10

    shl-int/lit8 v9, v9, 0x4

    .line 2366
    invoke-static {v12}, Ll/ۨۚۖ;->֫(B)I

    move-result v12

    or-int/2addr v9, v12

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 2363
    :cond_10
    new-instance p0, Ll/ۗۚۖ;

    .line 2420
    invoke-direct {p0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2363
    throw p0

    .line 2368
    :cond_11
    invoke-static {v9}, Ljava/lang/Character;->isValidCodePoint(I)Z

    move-result v4

    const-string v10, "Invalid escape sequence: \'\\U"

    if-eqz v4, :cond_14

    .line 2374
    invoke-static {v9}, Ljava/lang/Character$UnicodeBlock;->of(I)Ljava/lang/Character$UnicodeBlock;

    move-result-object v4

    if-eqz v4, :cond_13

    .line 2375
    sget-object v11, Ljava/lang/Character$UnicodeBlock;->LOW_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    .line 2376
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    sget-object v11, Ljava/lang/Character$UnicodeBlock;->HIGH_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    .line 2377
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    sget-object v11, Ljava/lang/Character$UnicodeBlock;->HIGH_PRIVATE_USE_SURROGATES:Ljava/lang/Character$UnicodeBlock;

    .line 2378
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_3

    .line 2380
    :cond_12
    new-instance v0, Ll/ۗۚۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2382
    invoke-virtual {p0, v6, v12}, Ll/ۛۜۖ;->ۧ(II)Ll/ۛۜۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' refers to a surrogate code unit"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2420
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2382
    throw v0

    .line 2386
    :cond_13
    :goto_3
    filled-new-array {v9}, [I

    move-result-object v4

    .line 2387
    new-instance v6, Ljava/lang/String;

    invoke-direct {v6, v4, v3, v8}, Ljava/lang/String;-><init>([III)V

    sget-object v4, Ll/ܰᩴۖ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {v6, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    .line 2388
    array-length v6, v4

    invoke-static {v4, v3, v2, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2389
    array-length v4, v4

    :goto_4
    add-int/2addr v5, v4

    move v4, v7

    goto :goto_6

    .line 2369
    :cond_14
    new-instance v0, Ll/ۗۚۖ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2371
    invoke-virtual {p0, v6, v12}, Ll/ۛۜۖ;->ۧ(II)Ll/ۛۜۖ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۛۜۖ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' is not a valid code point value"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 2420
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2371
    throw v0

    .line 2356
    :cond_15
    new-instance p0, Ll/ۗۚۖ;

    .line 2420
    invoke-direct {p0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2356
    throw p0

    :cond_16
    add-int/lit8 v4, v5, 0x1

    .line 2303
    aput-byte v11, v2, v5

    goto :goto_5

    :cond_17
    add-int/lit8 v4, v5, 0x1

    .line 2297
    aput-byte v10, v2, v5

    goto :goto_5

    :cond_18
    add-int/lit8 v4, v5, 0x1

    .line 2300
    aput-byte v10, v2, v5

    :goto_5
    move v5, v4

    move v4, v6

    goto :goto_6

    .line 2399
    :cond_19
    new-instance p0, Ll/ۗۚۖ;

    const-string v0, "Invalid escape sequence: \'\\\' at end of string."

    .line 2420
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 2399
    throw p0

    :cond_1a
    add-int/lit8 v7, v5, 0x1

    .line 2403
    aput-byte v6, v2, v5

    move v5, v7

    :goto_6
    add-int/2addr v4, v8

    goto/16 :goto_0

    :cond_1b
    if-ne v1, v5, :cond_1c

    .line 439
    new-instance p0, Ll/۫ۜۖ;

    invoke-direct {p0, v2}, Ll/۫ۜۖ;-><init>([B)V

    return-object p0

    .line 2409
    :cond_1c
    invoke-static {v3, v5, v2}, Ll/ۛۜۖ;->֫(II[B)Ll/ۛۜۖ;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x74
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ᩳ(Ljava/lang/String;)J
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 2505
    invoke-static {p0, v0, v1}, Ll/ۨۚۖ;->֫(Ljava/lang/String;ZZ)J

    move-result-wide v0

    return-wide v0
.end method
