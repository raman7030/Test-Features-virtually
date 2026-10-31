.class public final Ll/ۡ۟ۡ;
.super Ljava/lang/Object;
.source "OAR3"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۛ:[I

.field public static final ۤ:[I

.field public static final ۨ:[S

.field public static final ۫:[I

.field public static final ۬:[I


# instance fields
.field public ۗ:Ll/ܳ۟ۡ;

.field public ۙ:Ll/۬ܰۡ;

.field public final ᩶:Ll/᩻۟ۡ;

.field public ᩸:Z

.field public final ᩹:Ljava/io/InputStream;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x1d

    new-array v0, v0, [S

    .line 39
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡ۟ۡ;->ۨ:[S

    const/16 v0, 0x20

    new-array v1, v0, [I

    .line 65
    fill-array-data v1, :array_1

    sput-object v1, Ll/ۡ۟ۡ;->۫:[I

    const/16 v1, 0x13

    new-array v1, v1, [I

    .line 76
    fill-array-data v1, :array_2

    sput-object v1, Ll/ۡ۟ۡ;->۬:[I

    const/16 v1, 0x120

    new-array v2, v1, [I

    .line 86
    sput-object v2, Ll/ۡ۟ۡ;->ۛ:[I

    const/4 v3, 0x0

    const/16 v4, 0x90

    const/16 v5, 0x8

    .line 87
    invoke-static {v2, v3, v4, v5}, Ljava/util/Arrays;->fill([IIII)V

    const/16 v3, 0x100

    const/16 v6, 0x9

    .line 88
    invoke-static {v2, v4, v3, v6}, Ljava/util/Arrays;->fill([IIII)V

    const/16 v4, 0x118

    const/4 v6, 0x7

    .line 89
    invoke-static {v2, v3, v4, v6}, Ljava/util/Arrays;->fill([IIII)V

    .line 90
    invoke-static {v2, v4, v1, v5}, Ljava/util/Arrays;->fill([IIII)V

    new-array v0, v0, [I

    .line 92
    sput-object v0, Ll/ۡ۟ۡ;->ۤ:[I

    const/4 v1, 0x5

    .line 93
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    return-void

    :array_0
    .array-data 2
        0x60s
        0x80s
        0xa0s
        0xc0s
        0xe0s
        0x100s
        0x120s
        0x140s
        0x161s
        0x1a1s
        0x1e1s
        0x221s
        0x262s
        0x2e2s
        0x362s
        0x3e2s
        0x463s
        0x563s
        0x663s
        0x763s
        0x864s
        0xa64s
        0xc64s
        0xe64s
        0x1065s
        0x1465s
        0x1865s
        0x1c65s
        0x70s
    .end array-data

    nop

    :array_1
    .array-data 4
        0x10
        0x20
        0x30
        0x40
        0x51
        0x71
        0x92
        0xd2
        0x113
        0x193
        0x214
        0x314
        0x415
        0x615
        0x816
        0xc16
        0x1017
        0x1817
        0x2018
        0x3018
        0x4019
        0x6019
        0x801a
        0xc01a
        0x1001b
        0x1801b
        0x2001c
        0x3001c
        0x4001d
        0x6001d
        0x8001e
        0xc001e
    .end array-data

    :array_2
    .array-data 4
        0x10
        0x11
        0x12
        0x0
        0x8
        0x7
        0x9
        0x6
        0xa
        0x5
        0xb
        0x4
        0xc
        0x3
        0xd
        0x2
        0xe
        0x1
        0xf
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v0, Ll/᩻۟ۡ;

    invoke-direct {v0}, Ll/᩻۟ۡ;-><init>()V

    iput-object v0, p0, Ll/ۡ۟ۡ;->᩶:Ll/᩻۟ۡ;

    .line 104
    new-instance v0, Ll/۬ܰۡ;

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-direct {v0, p1}, Ll/۬ܰۡ;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    .line 105
    iput-object p1, p0, Ll/ۡ۟ۡ;->᩹:Ljava/io/InputStream;

    .line 106
    new-instance p1, Ll/᩷۟ۡ;

    .line 175
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ܰۡ;Ll/ܿ۟ۡ;)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡ۟ۡ;->ۧ(Ll/۬ܰۡ;Ll/ܿ۟ۡ;)I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ۡ۟ۡ;I)J
    .locals 0

    .line 538
    iget-object p0, p0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    invoke-static {p0, p1}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ֫(Ll/۬ܰۡ;I)J
    .locals 3

    .line 542
    invoke-virtual {p0, p1}, Ll/۬ܰۡ;->֫(I)J

    move-result-wide p0

    const-wide/16 v0, -0x1

    cmp-long v2, p0, v0

    if-eqz v2, :cond_0

    return-wide p0

    .line 544
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "Truncated Deflate64 Stream"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫(Ll/ۡ۟ۡ;)Ljava/io/InputStream;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ۟ۡ;->᩹:Ljava/io/InputStream;

    return-object p0
.end method

.method public static bridge synthetic ֫()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ۡ۟ۡ;->۫:[I

    return-object v0
.end method

.method public static ۧ(Ll/۬ܰۡ;Ll/ܿ۟ۡ;)I
    .locals 5

    :goto_0
    const/4 v0, -0x1

    if-eqz p1, :cond_1

    .line 354
    iget v1, p1, Ll/ܿ۟ۡ;->ܽ:I

    if-ne v1, v0, :cond_1

    const/4 v0, 0x1

    .line 355
    invoke-static {p0, v0}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 356
    iget-object p1, p1, Ll/ܿ۟ۡ;->ۧ:Ll/ܿ۟ۡ;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Ll/ܿ۟ۡ;->ᩳ:Ll/ܿ۟ۡ;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 358
    iget p0, p1, Ll/ܿ۟ۡ;->ܽ:I

    return p0

    :cond_2
    return v0
.end method

.method public static bridge synthetic ۧ([I)Ll/ܿ۟ۡ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ۡ۟ۡ;->ܽ([I)Ll/ܿ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡ۟ۡ;)Ll/᩻۟ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ۟ۡ;->᩶:Ll/᩻۟ۡ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۡ۟ۡ;)Ll/۬ܰۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    return-object p0
.end method

.method public static ܽ([I)Ll/ܿ۟ۡ;
    .locals 9

    const/16 v0, 0x41

    new-array v0, v0, [I

    .line 468
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    aget v6, p0, v3

    if-ltz v6, :cond_0

    const/16 v7, 0x40

    if-gt v6, v7, :cond_0

    .line 473
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 474
    aget v7, v0, v6

    add-int/2addr v7, v5

    aput v7, v0, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 470
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid code "

    const-string v1, " in literal table"

    .line 0
    invoke-static {v6, v0, v1}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 470
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    add-int/lit8 v1, v4, 0x1

    .line 476
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    .line 479
    new-array v1, v1, [I

    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_1
    if-gt v3, v4, :cond_2

    .line 481
    aget v7, v0, v3

    add-int/2addr v6, v7

    shl-int/2addr v6, v5

    .line 482
    aput v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 443
    :cond_2
    new-instance v0, Ll/ܿ۟ۡ;

    invoke-direct {v0}, Ll/ܿ۟ۡ;-><init>()V

    .line 445
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_7

    .line 446
    aget v3, p0, v2

    if-eqz v3, :cond_6

    add-int/lit8 v3, v3, -0x1

    .line 449
    aget v4, v1, v3

    move-object v7, v0

    move v6, v3

    :goto_3
    if-ltz v6, :cond_5

    shl-int v8, v5, v6

    and-int/2addr v8, v4

    if-nez v8, :cond_3

    .line 452
    invoke-virtual {v7}, Ll/ܿ۟ۡ;->֫()Ll/ܿ۟ۡ;

    move-result-object v7

    goto :goto_4

    :cond_3
    invoke-virtual {v7}, Ll/ܿ۟ۡ;->ۧ()Ll/ܿ۟ۡ;

    move-result-object v7

    :goto_4
    if-eqz v7, :cond_4

    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    .line 454
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "node doesn\'t exist in Huffman tree"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 420
    :cond_5
    iput v2, v7, Ll/ܿ۟ۡ;->ܽ:I

    const/4 v4, 0x0

    .line 421
    iput-object v4, v7, Ll/ܿ۟ۡ;->ۧ:Ll/ܿ۟ۡ;

    .line 422
    iput-object v4, v7, Ll/ܿ۟ۡ;->ᩳ:Ll/ܿ۟ۡ;

    .line 458
    aget v4, v1, v3

    add-int/2addr v4, v5

    aput v4, v1, v3

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    return-object v0
.end method

.method public static bridge synthetic ܽ()[S
    .locals 1

    .line 0
    sget-object v0, Ll/ۡ۟ۡ;->ۨ:[S

    return-object v0
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    invoke-virtual {v0}, Ll/ܳ۟ۡ;->֫()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    .line 111
    new-instance v0, Ll/᩷۟ۡ;

    .line 175
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object v0, p0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    const/4 v0, 0x0

    .line 112
    iput-object v0, p0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    return-void
.end method

.method public final ܿ(II[B)I
    .locals 21

    move-object/from16 v0, p0

    .line 120
    :cond_0
    :goto_0
    iget-boolean v1, v0, Ll/ۡ۟ۡ;->᩸:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    invoke-virtual {v1}, Ll/ܳ۟ۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    return v2

    .line 121
    :cond_2
    :goto_1
    iget-object v1, v0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    invoke-virtual {v1}, Ll/ܳ۟ۡ;->ܽ()Ll/ܺ۟ۡ;

    move-result-object v1

    sget-object v2, Ll/ܺ۟ۡ;->ۙ:Ll/ܺ۟ۡ;

    if-ne v1, v2, :cond_c

    .line 538
    iget-object v1, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v3

    const-wide/16 v5, 0x1

    const/4 v1, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    .line 122
    :goto_2
    iput-boolean v3, v0, Ll/ۡ۟ۡ;->᩸:Z

    .line 538
    iget-object v3, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    const/4 v4, 0x2

    invoke-static {v3, v4}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v7

    long-to-int v3, v7

    const/16 v7, 0x10

    if-eqz v3, :cond_a

    if-eq v3, v2, :cond_9

    if-ne v3, v4, :cond_8

    iget-object v3, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    const/4 v8, 0x5

    invoke-static {v3, v8}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v9

    const-wide/16 v11, 0x101

    add-long/2addr v9, v11

    long-to-int v3, v9

    .line 162
    new-array v3, v3, [I

    .line 538
    iget-object v9, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    invoke-static {v9, v8}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v8

    add-long/2addr v8, v5

    long-to-int v5, v8

    .line 165
    new-array v5, v5, [I

    new-array v6, v4, [[I

    aput-object v3, v6, v1

    aput-object v5, v6, v2

    .line 167
    iget-object v3, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    aget-object v5, v6, v1

    aget-object v2, v6, v2

    const/4 v8, 0x4

    .line 362
    invoke-static {v3, v8}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v8

    const-wide/16 v10, 0x4

    add-long/2addr v8, v10

    long-to-int v9, v8

    const/16 v8, 0x13

    new-array v8, v8, [I

    const/4 v10, 0x0

    :goto_3
    const/4 v11, 0x3

    if-ge v10, v9, :cond_4

    .line 366
    sget-object v12, Ll/ۡ۟ۡ;->۬:[I

    aget v12, v12, v10

    invoke-static {v3, v11}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v13

    long-to-int v11, v13

    aput v11, v8, v12

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 369
    :cond_4
    invoke-static {v8}, Ll/ۡ۟ۡ;->ܽ([I)Ll/ܿ۟ۡ;

    move-result-object v8

    .line 371
    array-length v10, v5

    array-length v12, v2

    add-int/2addr v10, v12

    new-array v12, v10, [I

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, -0x1

    :goto_4
    if-ge v13, v10, :cond_7

    if-lez v14, :cond_5

    add-int/lit8 v16, v13, 0x1

    .line 378
    aput v15, v12, v13

    add-int/lit8 v14, v14, -0x1

    move/from16 v13, v16

    goto :goto_4

    .line 381
    :cond_5
    invoke-static {v3, v8}, Ll/ۡ۟ۡ;->ۧ(Ll/۬ܰۡ;Ll/ܿ۟ۡ;)I

    move-result v9

    if-ge v9, v7, :cond_6

    add-int/lit8 v11, v13, 0x1

    .line 384
    aput v9, v12, v13

    move v15, v9

    move v13, v11

    :goto_5
    move-object v11, v8

    goto :goto_7

    :cond_6
    const-wide/16 v17, 0x3

    packed-switch v9, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    const/4 v9, 0x7

    .line 396
    invoke-static {v3, v9}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v14

    const-wide/16 v17, 0xb

    goto :goto_6

    .line 392
    :pswitch_1
    invoke-static {v3, v11}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v14

    :goto_6
    add-long v14, v14, v17

    long-to-int v9, v14

    const/4 v11, 0x0

    move-object v11, v8

    move v14, v9

    const/4 v15, 0x0

    goto :goto_7

    .line 388
    :pswitch_2
    invoke-static {v3, v4}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v19

    move-object v11, v8

    add-long v7, v19, v17

    long-to-int v8, v7

    move v14, v8

    :goto_7
    const/4 v7, 0x3

    move-object v8, v11

    const/16 v7, 0x10

    const/4 v11, 0x3

    goto :goto_4

    .line 405
    :cond_7
    array-length v3, v5

    invoke-static {v12, v1, v5, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 406
    array-length v3, v5

    array-length v4, v2

    invoke-static {v12, v3, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    new-instance v2, Ll/ۜ۟ۡ;

    sget-object v3, Ll/ܺ۟ۡ;->᩹:Ll/ܺ۟ۡ;

    aget-object v1, v6, v1

    const/4 v4, 0x1

    aget-object v4, v6, v4

    invoke-direct {v2, v0, v3, v1, v4}, Ll/ۜ۟ۡ;-><init>(Ll/ۡ۟ۡ;Ll/ܺ۟ۡ;[I[I)V

    iput-object v2, v0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    goto/16 :goto_0

    .line 136
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Unsupported compression: "

    .line 0
    invoke-static {v3, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 136
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 129
    :cond_9
    new-instance v1, Ll/ۜ۟ۡ;

    sget-object v2, Ll/ܺ۟ۡ;->᩶:Ll/ܺ۟ۡ;

    sget-object v3, Ll/ۡ۟ۡ;->ۛ:[I

    sget-object v4, Ll/ۡ۟ۡ;->ۤ:[I

    invoke-direct {v1, v0, v2, v3, v4}, Ll/ۜ۟ۡ;-><init>(Ll/ۡ۟ۡ;Ll/ܺ۟ۡ;[I[I)V

    iput-object v1, v0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    goto/16 :goto_0

    .line 149
    :cond_a
    iget-object v1, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    invoke-virtual {v1}, Ll/۬ܰۡ;->֫()V

    .line 538
    iget-object v1, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v3

    iget-object v1, v0, Ll/ۡ۟ۡ;->ۙ:Ll/۬ܰۡ;

    invoke-static {v1, v2}, Ll/ۡ۟ۡ;->֫(Ll/۬ܰۡ;I)J

    move-result-wide v1

    const-wide/32 v5, 0xffff

    xor-long v7, v3, v5

    and-long/2addr v5, v7

    cmp-long v7, v5, v1

    if-nez v7, :cond_b

    .line 156
    new-instance v1, Ll/ۢ۟ۡ;

    invoke-direct {v1, v0, v3, v4}, Ll/ۢ۟ۡ;-><init>(Ll/ۡ۟ۡ;J)V

    iput-object v1, v0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    goto/16 :goto_0

    .line 154
    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Illegal LEN / NLEN values"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 139
    :cond_c
    iget-object v1, v0, Ll/ۡ۟ۡ;->ۗ:Ll/ܳ۟ۡ;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual {v1, v4, v2, v3}, Ll/ܳ۟ۡ;->֫([BII)I

    move-result v1

    if-eqz v1, :cond_0

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
