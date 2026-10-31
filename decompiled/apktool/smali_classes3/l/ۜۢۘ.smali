.class public final Ll/ۜۢۘ;
.super Ll/ᩳۢۘ;
.source "U7Z7"


# static fields
.field public static ֡:[Ljava/lang/String;

.field public static ֨:[[B

.field public static ۚ:[Ljava/lang/String;


# instance fields
.field public ۖ:[B

.field public ۘ:[B

.field public ᩴ:[B

.field public ᩵:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/16 v0, 0xa

    new-array v0, v0, [B

    .line 33
    fill-array-data v0, :array_0

    const/4 v1, 0x7

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    const/4 v3, 0x3

    new-array v3, v3, [[B

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, Ll/ۜۢۘ;->֨:[[B

    const-string v0, "nistp384"

    const-string v1, "nistp521"

    const-string v2, "nistp256"

    .line 40
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۜۢۘ;->ۚ:[Ljava/lang/String;

    .line 42
    invoke-static {v0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܳۢۘ;

    invoke-direct {v1, v4}, Ll/ܳۢۘ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩻ۢۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    sput-object v0, Ll/ۜۢۘ;->֡:[Ljava/lang/String;

    const-string v0, "-----BEGIN EC PRIVATE KEY-----"

    .line 102
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v0, "-----END EC PRIVATE KEY-----"

    .line 103
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    return-void

    nop

    :array_0
    .array-data 1
        0x6t
        0x8t
        0x2at
        -0x7at
        0x48t
        -0x32t
        0x3dt
        0x3t
        0x1t
        0x7t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x6t
        0x5t
        0x2bt
        -0x7ft
        0x4t
        0x0t
        0x22t
    .end array-data

    :array_2
    .array-data 1
        0x6t
        0x5t
        0x2bt
        -0x7ft
        0x4t
        0x0t
        0x23t
    .end array-data
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 52
    invoke-direct/range {v0 .. v5}, Ll/ۜۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B)V

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;[B)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 56
    invoke-direct/range {v0 .. v5}, Ll/ۜۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B)V

    if-eqz p2, :cond_1

    const/16 p1, 0x8

    new-array v0, p1, [B

    const/16 v1, 0xb

    const/4 v2, 0x0

    .line 60
    invoke-static {p2, v1, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 397
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string p2, "nistp384"

    invoke-static {p2, p1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 61
    invoke-static {v0, p2}, Ll/᩵ۡۘ;->֫([B[B)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 63
    iput-object v0, p0, Ll/ۜۢۘ;->ۖ:[B

    :cond_0
    const-string p2, "nistp521"

    .line 397
    invoke-static {p2, p1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 65
    invoke-static {v0, p1}, Ll/᩵ۡۘ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 67
    iput-object v0, p0, Ll/ۜۢۘ;->ۖ:[B

    :cond_1
    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;[B[B[B[B)V
    .locals 1

    .line 74
    invoke-direct {p0, p1}, Ll/ᩳۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    .line 44
    sget-object p1, Ll/ۜۢۘ;->ۚ:[Ljava/lang/String;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 44
    iput-object p1, p0, Ll/ۜۢۘ;->ۖ:[B

    if-eqz p2, :cond_0

    .line 76
    iput-object p2, p0, Ll/ۜۢۘ;->ۖ:[B

    .line 77
    :cond_0
    iput-object p3, p0, Ll/ۜۢۘ;->ᩴ:[B

    .line 78
    iput-object p4, p0, Ll/ۜۢۘ;->᩵:[B

    .line 79
    iput-object p5, p0, Ll/ۜۢۘ;->ۘ:[B

    return-void
.end method

.method public static ֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;
    .locals 8

    const/4 v0, 0x5

    const-string v1, "invalid key format"

    .line 466
    invoke-virtual {p1, v0, v1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    const/4 v0, 0x1

    .line 468
    aget-object v3, p1, v0

    const/4 v1, 0x2

    .line 469
    aget-object v1, p1, v1

    invoke-static {v1}, Ll/ۜۢۘ;->ᩳ([B)[[B

    move-result-object v1

    const/4 v7, 0x0

    .line 470
    aget-object v4, v1, v7

    .line 471
    aget-object v5, v1, v0

    const/4 v0, 0x3

    .line 473
    aget-object v6, p1, v0

    .line 474
    new-instance v0, Ll/ۜۢۘ;

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Ll/ۜۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B)V

    const/4 p0, 0x4

    .line 475
    aget-object p0, p1, p0

    invoke-static {p0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 476
    iput v7, v0, Ll/ᩳۢۘ;->ۡ:I

    return-object v0
.end method

.method public static ᩳ([B)[[B
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 506
    :goto_0
    aget-byte v2, p0, v1

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 510
    array-length v3, p0

    sub-int/2addr v3, v1

    const/4 v4, 0x2

    div-int/2addr v3, v4

    new-array v5, v3, [B

    .line 511
    array-length v6, p0

    sub-int/2addr v6, v1

    div-int/2addr v6, v4

    new-array v7, v6, [B

    .line 513
    invoke-static {p0, v1, v5, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v3

    .line 514
    invoke-static {p0, v1, v7, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array p0, v4, [[B

    aput-object v5, p0, v0

    aput-object v7, p0, v2

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 524
    iget-object v0, p0, Ll/ۜۢۘ;->ۘ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)[B
    .locals 0

    .line 427
    invoke-virtual {p0, p2}, Ll/ۜۢۘ;->ۧ([B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()[B
    .locals 9

    .line 919
    iget-boolean v0, p0, Ll/ᩳۢۘ;->ܽ:Z

    if-nez v0, :cond_0

    .line 485
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0}, Ll/ܺ᩻ۘ;-><init>()V

    .line 486
    iget-object v1, p0, Ll/ۜۢۘ;->ۖ:[B

    invoke-static {v1}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ecdsa-sha2-"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 486
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 487
    iget-object v1, p0, Ll/ۜۢۘ;->ۖ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 488
    iget-object v1, p0, Ll/ۜۢۘ;->ᩴ:[B

    iget-object v3, p0, Ll/ۜۢۘ;->᩵:[B

    .line 497
    array-length v4, v1

    const/4 v5, 0x1

    add-int/2addr v4, v5

    array-length v6, v3

    add-int/2addr v4, v6

    new-array v6, v4, [B

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 498
    aput-byte v7, v6, v8

    .line 499
    array-length v7, v1

    invoke-static {v1, v8, v6, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 500
    array-length v1, v1

    add-int/2addr v1, v5

    array-length v5, v3

    invoke-static {v3, v8, v6, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    invoke-virtual {v0, v8, v4, v6}, Ll/ܺ᩻ۘ;->ܽ(II[B)V

    .line 489
    iget-object v1, p0, Ll/ۜۢۘ;->ۘ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 490
    iget-object v1, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 397
    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 490
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 491
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v1

    new-array v2, v1, [B

    .line 492
    invoke-virtual {v0, v8, v1, v2}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-object v2

    .line 483
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "key is encrypted."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 483
    throw v0
.end method

.method public final ۧ([B)[B
    .locals 5

    const-string v0, "ecdsa-sha2-"

    const/4 v1, 0x0

    .line 399
    :try_start_0
    iget-object v2, p0, Ll/ۜۢۘ;->ۖ:[B

    .line 400
    invoke-static {v2}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ll/ܳۡۘ;

    .line 401
    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 402
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۡۘ;

    .line 403
    invoke-interface {v2}, Ll/ᩳۡۘ;->init()V

    .line 405
    iget-object v3, p0, Ll/ۜۢۘ;->ۘ:[B

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 406
    :try_start_1
    invoke-interface {v2, v3}, Ll/ܳۡۘ;->֫([B)V

    .line 408
    invoke-interface {v2, p1}, Ll/ᩳۡۘ;->update([B)V

    .line 409
    invoke-interface {v2}, Ll/ᩳۡۘ;->sign()[B

    move-result-object p1

    .line 412
    iget-object v2, p0, Ll/ۜۢۘ;->ۖ:[B

    invoke-static {v2}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [[B

    const/4 v4, 0x0

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object p1, v2, v0

    .line 414
    invoke-static {v2}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object p1

    iget-object p1, p1, Ll/ܺ᩻ۘ;->֫:[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 420
    invoke-static {v3}, Ll/᩵ۡۘ;->ۧ([B)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-object v3, v1

    .line 416
    :catch_1
    :try_start_2
    iget-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 416
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 420
    invoke-static {v3}, Ll/᩵ۡۘ;->ۧ([B)V

    return-object v1

    :catchall_1
    move-exception p1

    move-object v1, v3

    :goto_0
    invoke-static {v1}, Ll/᩵ۡۘ;->ۧ([B)V

    .line 421
    throw p1
.end method

.method public final ܳ()[B
    .locals 14

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    .line 121
    iget-object v3, p0, Ll/ۜۢۘ;->ᩴ:[B

    array-length v4, v3

    const/16 v5, 0x40

    const/16 v6, 0x30

    const/4 v7, 0x2

    if-lt v4, v5, :cond_0

    const/4 v4, 0x2

    goto :goto_0

    :cond_0
    array-length v4, v3

    if-lt v4, v6, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    sget-object v5, Ll/ۜۢۘ;->֨:[[B

    aget-object v4, v5, v4

    .line 123
    iget-object v5, p0, Ll/ۜۢۘ;->᩵:[B

    .line 497
    array-length v8, v3

    add-int/2addr v8, v0

    array-length v9, v5

    add-int/2addr v8, v9

    new-array v9, v8, [B

    const/4 v10, 0x4

    .line 498
    aput-byte v10, v9, v2

    .line 499
    array-length v11, v3

    invoke-static {v3, v2, v9, v0, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 500
    array-length v3, v3

    add-int/2addr v3, v0

    array-length v11, v5

    invoke-static {v5, v2, v9, v3, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v8, 0x1

    and-int/lit16 v5, v3, 0x80

    const/4 v11, 0x3

    if-nez v5, :cond_2

    const/4 v5, 0x3

    goto :goto_1

    :cond_2
    const/4 v5, 0x4

    :goto_1
    add-int v12, v8, v5

    .line 126
    new-array v13, v12, [B

    .line 127
    invoke-static {v9, v2, v13, v5, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 128
    aput-byte v11, v13, v2

    if-ne v5, v11, :cond_3

    int-to-byte v3, v3

    .line 130
    aput-byte v3, v13, v0

    goto :goto_2

    :cond_3
    const/16 v5, -0x7f

    .line 132
    aput-byte v5, v13, v0

    int-to-byte v3, v3

    .line 133
    aput-byte v3, v13, v7

    .line 137
    :goto_2
    invoke-static {v0}, Ll/ᩳۢۘ;->֫(I)I

    move-result v3

    add-int/2addr v3, v11

    iget-object v5, p0, Ll/ۜۢۘ;->ۘ:[B

    array-length v5, v5

    invoke-static {v5}, Ll/ᩳۢۘ;->֫(I)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v5, p0, Ll/ۜۢۘ;->ۘ:[B

    array-length v5, v5

    add-int/2addr v3, v5

    add-int/2addr v3, v0

    array-length v5, v4

    .line 138
    invoke-static {v5}, Ll/ᩳۢۘ;->֫(I)I

    move-result v5

    add-int/2addr v3, v5

    array-length v5, v4

    add-int/2addr v3, v5

    add-int/2addr v3, v0

    .line 139
    invoke-static {v12}, Ll/ᩳۢۘ;->֫(I)I

    move-result v5

    add-int/2addr v3, v5

    add-int/2addr v3, v12

    .line 141
    invoke-static {v3}, Ll/ᩳۢۘ;->֫(I)I

    move-result v5

    add-int/2addr v5, v0

    add-int/2addr v5, v3

    .line 143
    new-array v5, v5, [B

    .line 713
    aput-byte v6, v5, v2

    .line 714
    invoke-static {v0, v3, v5}, Ll/ᩳۢۘ;->ۧ(II[B)I

    move-result v0

    .line 146
    invoke-static {v0, v5, v1}, Ll/ᩳۢۘ;->֫(I[B[B)I

    move-result v0

    .line 147
    iget-object v1, p0, Ll/ۜۢۘ;->ۘ:[B

    add-int/lit8 v3, v0, 0x1

    .line 727
    aput-byte v10, v5, v0

    .line 728
    array-length v0, v1

    invoke-static {v3, v0, v5}, Ll/ᩳۢۘ;->ۧ(II[B)I

    move-result v0

    .line 729
    array-length v3, v1

    invoke-static {v1, v2, v5, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 730
    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0x1

    const/16 v3, -0x60

    .line 735
    aput-byte v3, v5, v0

    .line 736
    array-length v0, v4

    invoke-static {v1, v0, v5}, Ll/ᩳۢۘ;->ۧ(II[B)I

    move-result v0

    .line 737
    array-length v1, v4

    invoke-static {v4, v2, v5, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 738
    array-length v1, v4

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0x1

    const/16 v3, -0x5f

    .line 735
    aput-byte v3, v5, v0

    .line 736
    invoke-static {v1, v12, v5}, Ll/ᩳۢۘ;->ۧ(II[B)I

    move-result v0

    .line 737
    invoke-static {v13, v2, v5, v0, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v5
.end method

.method public final ܽ([B)Z
    .locals 12

    .line 188
    iget-object v0, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    const-string v1, "key type "

    const-string v2, "unknown curve name "

    const-string v3, "unknown key type "

    const/4 v4, 0x0

    :try_start_0
    iget v5, p0, Ll/ᩳۢۘ;->ۡ:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    return v4

    :cond_0
    const/16 v7, 0x40

    const/4 v8, 0x2

    if-eq v5, v8, :cond_17

    const/4 v9, 0x5

    if-ne v5, v9, :cond_1

    goto/16 :goto_a

    .line 212
    :cond_1
    sget-object v9, Ll/ۜۢۘ;->ۚ:[Ljava/lang/String;

    const/4 v10, 0x4

    if-ne v5, v10, :cond_a

    .line 213
    :try_start_1
    new-instance v5, Ll/ܺ᩻ۘ;

    invoke-direct {v5, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 214
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 215
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v7

    if-ne p1, v7, :cond_9

    .line 220
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 409
    array-length v7, p1

    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v11, Ljava/lang/String;

    invoke-direct {v11, p1, v4, v7, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 221
    sget-object p1, Ll/ۜۢۘ;->֡:[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 225
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۜۢۘ;->ۖ:[B

    .line 226
    invoke-static {p1}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object p1

    .line 227
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 231
    invoke-virtual {v11, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 236
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x2003373f

    if-eq v1, v2, :cond_4

    const v2, 0x20033b5b

    if-eq v1, v2, :cond_3

    const v2, 0x20034220

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "nistp521"

    goto :goto_0

    :cond_3
    const-string v1, "nistp384"

    goto :goto_0

    :cond_4
    const-string v1, "nistp256"

    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    :goto_1
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 250
    aget-byte v1, p1, v4

    if-ne v1, v10, :cond_5

    .line 253
    invoke-static {p1}, Ll/ۜۢۘ;->ᩳ([B)[[B

    move-result-object p1

    .line 254
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object v1

    iput-object v1, p0, Ll/ۜۢۘ;->ۘ:[B

    .line 255
    invoke-virtual {v5}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object v1

    .line 409
    array-length v2, v1

    .line 405
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v1, v4, v2, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 255
    iput-object v3, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 256
    aget-object v1, p1, v4

    iput-object v1, p0, Ll/ۜۢۘ;->ᩴ:[B

    .line 257
    aget-object p1, p1, v6

    iput-object p1, p0, Ll/ۜۢۘ;->᩵:[B

    return v6

    .line 251
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "only uncompressed ECPoint supported"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 232
    :cond_6
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " does not match curve name "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 228
    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 222
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 217
    :cond_9
    new-instance p1, Ll/۫᩷ۘ;

    const-string v1, "check failed"

    .line 39
    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 217
    throw p1

    .line 265
    :cond_a
    aget-byte v1, p1, v4

    const/16 v2, 0x30

    if-eq v1, v2, :cond_b

    return v4

    .line 268
    :cond_b
    aget-byte v1, p1, v6

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_c

    and-int/lit8 v1, v1, 0x7f

    const/4 v2, 0x2

    :goto_2
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_d

    add-int/lit8 v1, v2, 0x1

    .line 273
    aget-byte v2, p1, v2

    move v2, v1

    move v1, v3

    goto :goto_2

    :cond_c
    const/4 v2, 0x2

    .line 277
    :cond_d
    aget-byte v1, p1, v2

    if-eq v1, v8, :cond_e

    return v4

    :cond_e
    add-int/lit8 v1, v2, 0x1

    add-int/2addr v2, v8

    .line 281
    aget-byte v1, p1, v1

    and-int/lit16 v3, v1, 0xff

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_f

    and-int/lit8 v1, v1, 0x7f

    const/4 v3, 0x0

    :goto_3
    add-int/lit8 v5, v1, -0x1

    if-lez v1, :cond_f

    shl-int/lit8 v1, v3, 0x8

    add-int/lit8 v3, v2, 0x1

    .line 286
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    move v2, v3

    move v3, v1

    move v1, v5

    goto :goto_3

    :cond_f
    add-int/2addr v2, v3

    add-int/lit8 v1, v2, 0x1

    add-int/2addr v2, v8

    .line 293
    aget-byte v1, p1, v1

    and-int/lit16 v3, v1, 0xff

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_10

    and-int/lit8 v1, v1, 0x7f

    const/4 v3, 0x0

    :goto_4
    add-int/lit8 v5, v1, -0x1

    if-lez v1, :cond_10

    shl-int/lit8 v1, v3, 0x8

    add-int/lit8 v3, v2, 0x1

    .line 298
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    move v2, v3

    move v3, v1

    move v1, v5

    goto :goto_4

    .line 302
    :cond_10
    new-array v1, v3, [B

    iput-object v1, p0, Ll/ۜۢۘ;->ۘ:[B

    .line 303
    invoke-static {p1, v2, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v3

    add-int/lit8 v1, v2, 0x1

    add-int/2addr v2, v8

    .line 309
    aget-byte v1, p1, v1

    and-int/lit16 v3, v1, 0xff

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_11

    and-int/lit8 v1, v1, 0x7f

    const/4 v3, 0x0

    :goto_5
    add-int/lit8 v5, v1, -0x1

    if-lez v1, :cond_11

    shl-int/lit8 v1, v3, 0x8

    add-int/lit8 v3, v2, 0x1

    .line 314
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    move v2, v3

    move v3, v1

    move v1, v5

    goto :goto_5

    .line 318
    :cond_11
    new-array v1, v3, [B

    .line 319
    invoke-static {p1, v2, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v2, v3

    const/4 v3, 0x0

    .line 322
    :goto_6
    sget-object v5, Ll/ۜۢۘ;->֨:[[B

    const/4 v10, 0x3

    if-ge v3, v10, :cond_13

    .line 323
    aget-object v5, v5, v3

    invoke-static {v5, v1}, Ll/᩵ۡۘ;->֫([B[B)Z

    move-result v5

    if-eqz v5, :cond_12

    .line 324
    aget-object v1, v9, v3

    .line 397
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v1, v3}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 324
    iput-object v1, p0, Ll/ۜۢۘ;->ۖ:[B

    goto :goto_7

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_13
    :goto_7
    add-int/lit8 v1, v2, 0x1

    add-int/2addr v2, v8

    .line 331
    aget-byte v1, p1, v1

    and-int/lit16 v3, v1, 0xff

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_14

    and-int/lit8 v1, v1, 0x7f

    const/4 v3, 0x0

    :goto_8
    add-int/lit8 v5, v1, -0x1

    if-lez v1, :cond_14

    shl-int/lit8 v1, v3, 0x8

    add-int/lit8 v3, v2, 0x1

    .line 336
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    add-int/2addr v1, v2

    move v2, v3

    move v3, v1

    move v1, v5

    goto :goto_8

    .line 340
    :cond_14
    new-array v1, v3, [B

    .line 341
    invoke-static {p1, v2, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 344
    invoke-static {v1}, Ll/ۜۢۘ;->ᩳ([B)[[B

    move-result-object p1

    .line 345
    aget-object v1, p1, v4

    iput-object v1, p0, Ll/ۜۢۘ;->ᩴ:[B

    .line 346
    aget-object p1, p1, v6

    iput-object p1, p0, Ll/ۜۢۘ;->᩵:[B

    .line 348
    iget-object p1, p0, Ll/ۜۢۘ;->ۘ:[B

    if-eqz p1, :cond_16

    .line 349
    array-length v1, p1

    if-lt v1, v7, :cond_15

    goto :goto_9

    :cond_15
    array-length p1, p1

    :cond_16
    :goto_9
    return v6

    .line 194
    :cond_17
    :goto_a
    new-instance v1, Ll/ܺ᩻ۘ;

    invoke-direct {v1, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 195
    array-length p1, p1

    invoke-virtual {v1, p1}, Ll/ܺ᩻ۘ;->ܽ(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    const-string p1, ""

    .line 198
    invoke-virtual {v1, v6, p1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    .line 199
    aget-object p1, p1, v4

    iput-object p1, p0, Ll/ۜۢۘ;->ۘ:[B

    .line 200
    array-length v1, p1

    if-lt v1, v7, :cond_18

    goto :goto_b

    :cond_18
    array-length p1, p1
    :try_end_2
    .catch Ll/۫᩷ۘ; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_b
    return v6

    .line 202
    :catch_0
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return v4

    .line 351
    :catch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v4
.end method

.method public final ܿ()[B
    .locals 7

    .line 361
    invoke-super {p0}, Ll/ᩳۢۘ;->ܿ()[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 366
    :cond_0
    iget-object v0, p0, Ll/ۜۢۘ;->ᩴ:[B

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 370
    :cond_1
    iget-object v0, p0, Ll/ۜۢۘ;->ۖ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ecdsa-sha2-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 371
    iget-object v1, p0, Ll/ۜۢۘ;->ۖ:[B

    .line 372
    iget-object v2, p0, Ll/ۜۢۘ;->ᩴ:[B

    array-length v3, v2

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iget-object v5, p0, Ll/ۜۢۘ;->᩵:[B

    array-length v5, v5

    add-int/2addr v3, v5

    new-array v3, v3, [B

    const/4 v5, 0x3

    new-array v5, v5, [[B

    const/4 v6, 0x0

    aput-object v0, v5, v6

    aput-object v1, v5, v4

    const/4 v0, 0x2

    aput-object v3, v5, v0

    .line 373
    aget-object v1, v5, v0

    const/4 v3, 0x4

    aput-byte v3, v1, v6

    .line 374
    array-length v3, v2

    invoke-static {v2, v6, v1, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 375
    iget-object v1, p0, Ll/ۜۢۘ;->᩵:[B

    aget-object v0, v5, v0

    iget-object v2, p0, Ll/ۜۢۘ;->ᩴ:[B

    array-length v2, v2

    add-int/2addr v2, v4

    array-length v3, v1

    invoke-static {v1, v6, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 377
    invoke-static {v5}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܺ᩻ۘ;->֫:[B

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 2

    .line 382
    iget-object v0, p0, Ll/ۜۢۘ;->ۖ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ecdsa-sha2-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0, v1}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method
