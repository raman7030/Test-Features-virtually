.class public abstract Ll/ܽۢۘ;
.super Ljava/lang/Object;
.source "Q7XB"


# instance fields
.field public ֫:[B

.field public ۧ:[B

.field public ܳ:Ll/ۖ᩷ۘ;

.field public ܽ:[B

.field public ܿ:Ll/۟ۢۘ;

.field public ᩳ:Ljava/lang/String;

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 67
    iput-object v0, p0, Ll/ܽۢۘ;->ܳ:Ll/ۖ᩷ۘ;

    .line 68
    iput-object v0, p0, Ll/ܽۢۘ;->ۧ:[B

    .line 69
    iput-object v0, p0, Ll/ܽۢۘ;->֫:[B

    .line 70
    iput-object v0, p0, Ll/ܽۢۘ;->ܽ:[B

    const/4 v0, 0x0

    .line 88
    iput v0, p0, Ll/ܽۢۘ;->᩻:I

    const-string v0, ""

    .line 89
    iput-object v0, p0, Ll/ܽۢۘ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(I)[B
    .locals 5

    ushr-int/lit8 v0, p0, 0x18

    int-to-byte v0, v0

    ushr-int/lit8 v1, p0, 0x10

    int-to-byte v1, v1

    ushr-int/lit8 v2, p0, 0x8

    int-to-byte v2, v2

    int-to-byte p0, p0

    const/4 v3, 0x4

    new-array v3, v3, [B

    const/4 v4, 0x0

    aput-byte v0, v3, v4

    const/4 v0, 0x1

    aput-byte v1, v3, v0

    const/4 v0, 0x2

    aput-byte v2, v3, v0

    const/4 v0, 0x3

    aput-byte p0, v3, v0

    return-object v3
.end method

.method public static ֫([B)[B
    .locals 9

    .line 251
    array-length v0, p0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    return-object p0

    :cond_0
    const/4 v1, 0x0

    .line 258
    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x8

    if-ge v3, v5, :cond_1

    ushr-int v5, v2, v3

    and-int/lit8 v5, v5, 0x1

    or-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    xor-int/lit8 v2, v4, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_1
    if-ge v3, v0, :cond_3

    .line 269
    aget-byte v5, p0, v3

    and-int/lit16 v6, v5, 0x80

    const/4 v7, 0x7

    ushr-int/2addr v6, v7

    xor-int/lit8 v6, v6, 0x1

    and-int/2addr v2, v6

    add-int/2addr v4, v2

    and-int/lit8 v5, v5, 0x7f

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v7, :cond_2

    ushr-int v8, v5, v6

    and-int/lit8 v8, v8, 0x1

    xor-int/lit8 v8, v8, 0x1

    and-int/2addr v2, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    sub-int/2addr v0, v4

    .line 285
    new-array v2, v0, [B

    .line 286
    new-array v3, v4, [B

    .line 287
    invoke-static {p0, v1, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 288
    invoke-static {p0, v4, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 289
    invoke-static {p0}, Ll/᩵ۡۘ;->ۧ([B)V

    return-object v2
.end method

.method public static ֫([BZ)[B
    .locals 6

    const/4 v0, 0x0

    .line 490
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0x80

    ushr-int/lit8 v1, v1, 0x7

    .line 491
    array-length v2, p0

    add-int/2addr v2, v1

    add-int/lit8 v3, v2, 0x4

    .line 492
    new-array v3, v3, [B

    xor-int/lit8 v4, v1, 0x1

    .line 494
    new-array v4, v4, [B

    ushr-int/lit8 v4, v2, 0x18

    int-to-byte v4, v4

    .line 495
    aput-byte v4, v3, v0

    ushr-int/lit8 v4, v2, 0x10

    int-to-byte v4, v4

    const/4 v5, 0x1

    .line 496
    aput-byte v4, v3, v5

    ushr-int/lit8 v4, v2, 0x8

    int-to-byte v4, v4

    const/4 v5, 0x2

    .line 497
    aput-byte v4, v3, v5

    const/4 v4, 0x3

    int-to-byte v5, v2

    .line 498
    aput-byte v5, v3, v4

    add-int/lit8 v4, v1, 0x4

    sub-int/2addr v2, v1

    .line 499
    invoke-static {p0, v0, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p1, :cond_0

    .line 501
    invoke-static {p0}, Ll/᩵ۡۘ;->ۧ([B)V

    :cond_0
    return-object v3
.end method

.method public static ۧ([BZ)[B
    .locals 5

    .line 511
    array-length v0, p0

    add-int/lit8 v1, v0, 0x4

    .line 512
    new-array v1, v1, [B

    ushr-int/lit8 v2, v0, 0x18

    int-to-byte v2, v2

    const/4 v3, 0x0

    .line 513
    aput-byte v2, v1, v3

    ushr-int/lit8 v2, v0, 0x10

    int-to-byte v2, v2

    const/4 v4, 0x1

    .line 514
    aput-byte v2, v1, v4

    ushr-int/lit8 v2, v0, 0x8

    int-to-byte v2, v2

    const/4 v4, 0x2

    .line 515
    aput-byte v2, v1, v4

    const/4 v2, 0x3

    int-to-byte v4, v0

    .line 516
    aput-byte v4, v1, v2

    const/4 v2, 0x4

    .line 517
    invoke-static {p0, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p1, :cond_0

    .line 519
    invoke-static {p0}, Ll/᩵ۡۘ;->ۧ([B)V

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ܽۢۘ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public abstract ֫(Ll/۟ۢۘ;[B[B[B[B)V
.end method

.method public final ֫(Ljava/lang/String;[B[BI)Z
    .locals 10

    const-string v0, "ssh-rsa"

    .line 299
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const v2, 0xff00

    const/high16 v3, 0xff0000

    const/high16 v4, -0x1000000

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    .line 304
    iput v5, p0, Ll/ܽۢۘ;->᩻:I

    .line 305
    iput-object p1, p0, Ll/ܽۢۘ;->ᩳ:Ljava/lang/String;

    add-int/lit8 p1, p4, 0x1

    .line 307
    aget-byte v0, p2, p4

    shl-int/lit8 v0, v0, 0x18

    and-int/2addr v0, v4

    add-int/lit8 v6, p4, 0x2

    aget-byte p1, p2, p1

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p1, v3

    or-int/2addr p1, v0

    add-int/lit8 v0, p4, 0x3

    aget-byte v6, p2, v6

    shl-int/lit8 v6, v6, 0x8

    and-int/2addr v6, v2

    or-int/2addr p1, v6

    add-int/lit8 p4, p4, 0x4

    aget-byte v0, p2, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    .line 309
    new-array v0, p1, [B

    .line 310
    invoke-static {p2, p4, v0, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, p1

    add-int/lit8 p1, p4, 0x1

    .line 313
    aget-byte v6, p2, p4

    shl-int/lit8 v6, v6, 0x18

    and-int/2addr v4, v6

    add-int/lit8 v6, p4, 0x2

    aget-byte p1, p2, p1

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p1, v3

    or-int/2addr p1, v4

    add-int/lit8 v3, p4, 0x3

    aget-byte v4, p2, v6

    shl-int/lit8 v4, v4, 0x8

    and-int/2addr v2, v4

    or-int/2addr p1, v2

    add-int/lit8 p4, p4, 0x4

    aget-byte v2, p2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr p1, v2

    .line 315
    new-array v2, p1, [B

    .line 316
    invoke-static {p2, p4, v2, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 321
    new-instance p1, Ll/ܺ᩻ۘ;

    invoke-direct {p1, p3}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 322
    invoke-virtual {p1}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    sget-object p2, Ll/᩵ۡۘ;->ܽ:[B

    .line 409
    array-length p2, p1

    sget-object p4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p1, v5, p2, p4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 324
    :try_start_0
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 325
    invoke-virtual {p1, v3}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ll/ۜۡۘ;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 326
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۡۘ;

    .line 327
    invoke-interface {p1}, Ll/ᩳۡۘ;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 331
    invoke-interface {p1, v0, v2}, Ll/ۜۡۘ;->֫([B[B)V

    .line 332
    iget-object p2, p0, Ll/ܽۢۘ;->֫:[B

    invoke-interface {p1, p2}, Ll/ᩳۡۘ;->update([B)V

    .line 333
    invoke-interface {p1, p3}, Ll/ᩳۡۘ;->verify([B)Z

    move-result p1

    .line 335
    iget-object p2, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p2, p2, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p2

    .line 335
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p1

    :catch_0
    move-exception p1

    .line 329
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 329
    throw p2

    :cond_0
    const-string v0, "ssh-dss"

    .line 338
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x1

    if-eqz v0, :cond_1

    .line 345
    iput v6, p0, Ll/ܽۢۘ;->᩻:I

    .line 346
    iput-object p1, p0, Ll/ܽۢۘ;->ᩳ:Ljava/lang/String;

    add-int/lit8 p1, p4, 0x1

    .line 348
    aget-byte v0, p2, p4

    shl-int/lit8 v0, v0, 0x18

    and-int/2addr v0, v4

    add-int/lit8 v6, p4, 0x2

    aget-byte p1, p2, p1

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p1, v3

    or-int/2addr p1, v0

    add-int/lit8 v0, p4, 0x3

    aget-byte v6, p2, v6

    shl-int/lit8 v6, v6, 0x8

    and-int/2addr v6, v2

    or-int/2addr p1, v6

    add-int/lit8 p4, p4, 0x4

    aget-byte v0, p2, v0

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    .line 350
    new-array v0, p1, [B

    .line 351
    invoke-static {p2, p4, v0, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, p1

    add-int/lit8 p1, p4, 0x1

    .line 354
    aget-byte v6, p2, p4

    shl-int/lit8 v6, v6, 0x18

    and-int/2addr v6, v4

    add-int/lit8 v7, p4, 0x2

    aget-byte p1, p2, p1

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p1, v3

    or-int/2addr p1, v6

    add-int/lit8 v6, p4, 0x3

    aget-byte v7, p2, v7

    shl-int/lit8 v7, v7, 0x8

    and-int/2addr v7, v2

    or-int/2addr p1, v7

    add-int/lit8 p4, p4, 0x4

    aget-byte v6, p2, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr p1, v6

    .line 356
    new-array v6, p1, [B

    .line 357
    invoke-static {p2, p4, v6, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, p1

    add-int/lit8 p1, p4, 0x1

    .line 360
    aget-byte v7, p2, p4

    shl-int/lit8 v7, v7, 0x18

    and-int/2addr v7, v4

    add-int/lit8 v8, p4, 0x2

    aget-byte p1, p2, p1

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p1, v3

    or-int/2addr p1, v7

    add-int/lit8 v7, p4, 0x3

    aget-byte v8, p2, v8

    shl-int/lit8 v8, v8, 0x8

    and-int/2addr v8, v2

    or-int/2addr p1, v8

    add-int/lit8 p4, p4, 0x4

    aget-byte v7, p2, v7

    and-int/lit16 v7, v7, 0xff

    or-int/2addr p1, v7

    .line 362
    new-array v7, p1, [B

    .line 363
    invoke-static {p2, p4, v7, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, p1

    add-int/lit8 p1, p4, 0x1

    .line 366
    aget-byte v8, p2, p4

    shl-int/lit8 v8, v8, 0x18

    and-int/2addr v4, v8

    add-int/lit8 v8, p4, 0x2

    aget-byte p1, p2, p1

    shl-int/lit8 p1, p1, 0x10

    and-int/2addr p1, v3

    or-int/2addr p1, v4

    add-int/lit8 v3, p4, 0x3

    aget-byte v4, p2, v8

    shl-int/lit8 v4, v4, 0x8

    and-int/2addr v2, v4

    or-int/2addr p1, v2

    add-int/lit8 p4, p4, 0x4

    aget-byte v2, p2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr p1, v2

    .line 368
    new-array v2, p1, [B

    .line 369
    invoke-static {p2, p4, v2, v5, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 375
    :try_start_1
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    const-string p2, "signature.dss"

    .line 376
    invoke-virtual {p1, p2}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ll/ܿۡۘ;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 377
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿۡۘ;

    .line 378
    invoke-interface {p1}, Ll/ᩳۡۘ;->init()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 382
    invoke-interface {p1, v2, v0, v6, v7}, Ll/ܿۡۘ;->ۧ([B[B[B[B)V

    .line 383
    iget-object p2, p0, Ll/ܽۢۘ;->֫:[B

    invoke-interface {p1, p2}, Ll/ᩳۡۘ;->update([B)V

    .line 384
    invoke-interface {p1, p3}, Ll/ᩳۡۘ;->verify([B)Z

    move-result p1

    .line 386
    iget-object p2, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p2, p2, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p2

    .line 386
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p1

    :catch_1
    move-exception p1

    .line 380
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 380
    throw p2

    :cond_1
    const-string v0, "ecdsa-sha2-nistp256"

    .line 389
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "ecdsa-sha2-nistp384"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "ecdsa-sha2-nistp521"

    .line 390
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v0, "ssh-ed25519"

    .line 435
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "ssh-ed448"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 468
    :cond_3
    iget-object p1, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p1, p1, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p1}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p1

    .line 468
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v5

    :cond_4
    :goto_0
    const/4 v0, 0x3

    .line 439
    iput v0, p0, Ll/ܽۢۘ;->᩻:I

    .line 440
    iput-object p1, p0, Ll/ܽۢۘ;->ᩳ:Ljava/lang/String;

    add-int/lit8 v0, p4, 0x1

    .line 442
    aget-byte v6, p2, p4

    shl-int/lit8 v6, v6, 0x18

    and-int/2addr v4, v6

    add-int/lit8 v6, p4, 0x2

    aget-byte v0, p2, v0

    shl-int/lit8 v0, v0, 0x10

    and-int/2addr v0, v3

    or-int/2addr v0, v4

    add-int/lit8 v3, p4, 0x3

    aget-byte v4, p2, v6

    shl-int/lit8 v4, v4, 0x8

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    add-int/lit8 p4, p4, 0x4

    aget-byte v2, p2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v0, v2

    .line 444
    new-array v2, v0, [B

    .line 445
    invoke-static {p2, p4, v2, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 450
    :try_start_2
    iget-object p2, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 451
    invoke-virtual {p2, p1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ll/᩻ۡۘ;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 452
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۡۘ;

    .line 453
    invoke-interface {p1}, Ll/ᩳۡۘ;->init()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/LinkageError; {:try_start_2 .. :try_end_2} :catch_2

    .line 458
    invoke-interface {p1, v2}, Ll/᩻ۡۘ;->ۧ([B)V

    .line 460
    iget-object p2, p0, Ll/ܽۢۘ;->֫:[B

    invoke-interface {p1, p2}, Ll/ᩳۡۘ;->update([B)V

    .line 462
    invoke-interface {p1, p3}, Ll/ᩳۡۘ;->verify([B)Z

    move-result p1

    .line 464
    iget-object p2, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p2, p2, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p2

    .line 464
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p1

    :catch_2
    move-exception p1

    goto :goto_1

    :catch_3
    move-exception p1

    .line 455
    :goto_1
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 455
    throw p2

    :cond_5
    :goto_2
    const/4 v0, 0x2

    .line 396
    iput v0, p0, Ll/ܽۢۘ;->᩻:I

    .line 397
    iput-object p1, p0, Ll/ܽۢۘ;->ᩳ:Ljava/lang/String;

    add-int/lit8 v7, p4, 0x1

    .line 399
    aget-byte v8, p2, p4

    shl-int/lit8 v8, v8, 0x18

    and-int/2addr v8, v4

    add-int/lit8 v9, p4, 0x2

    aget-byte v7, p2, v7

    shl-int/lit8 v7, v7, 0x10

    and-int/2addr v7, v3

    or-int/2addr v7, v8

    add-int/lit8 v8, p4, 0x3

    aget-byte v9, p2, v9

    shl-int/lit8 v9, v9, 0x8

    and-int/2addr v9, v2

    or-int/2addr v7, v9

    add-int/lit8 p4, p4, 0x4

    aget-byte v8, p2, v8

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v7, v8

    .line 401
    new-array v8, v7, [B

    .line 402
    invoke-static {p2, p4, v8, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, v7

    add-int/lit8 v7, p4, 0x1

    .line 404
    aget-byte v8, p2, p4

    shl-int/lit8 v8, v8, 0x18

    and-int/2addr v4, v8

    add-int/lit8 v8, p4, 0x2

    aget-byte v7, p2, v7

    shl-int/lit8 v7, v7, 0x10

    and-int/2addr v3, v7

    or-int/2addr v3, v4

    add-int/lit8 v4, p4, 0x3

    aget-byte v7, p2, v8

    shl-int/lit8 v7, v7, 0x8

    and-int/2addr v2, v7

    or-int/2addr v2, v3

    aget-byte v3, p2, v4

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    add-int/lit8 p4, p4, 0x5

    sub-int/2addr v2, v6

    .line 407
    div-int/2addr v2, v0

    new-array v0, v2, [B

    .line 408
    invoke-static {p2, p4, v0, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p4, v2

    .line 411
    new-array v3, v2, [B

    .line 412
    invoke-static {p2, p4, v3, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 418
    :try_start_3
    iget-object p2, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 419
    invoke-virtual {p2, p1}, Ll/۟ۢۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ll/ܳۡۘ;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    .line 420
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۡۘ;

    .line 421
    invoke-interface {p1}, Ll/ᩳۡۘ;->init()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 426
    invoke-interface {p1, v0, v3}, Ll/ܳۡۘ;->֫([B[B)V

    .line 428
    iget-object p2, p0, Ll/ܽۢۘ;->֫:[B

    invoke-interface {p1, p2}, Ll/ᩳۡۘ;->update([B)V

    .line 430
    invoke-interface {p1, p3}, Ll/ᩳۡۘ;->verify([B)Z

    move-result p1

    .line 432
    iget-object p2, p0, Ll/ܽۢۘ;->ܿ:Ll/۟ۢۘ;

    .line 3560
    iget-object p2, p2, Ll/۟ۢۘ;->ܳ֫:Ll/᩶᩷ۘ;

    invoke-virtual {p2}, Ll/᩶᩷ۘ;->ܽ()Ll/ۚۢۘ;

    move-result-object p2

    .line 432
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p1

    :catch_4
    move-exception p1

    .line 423
    new-instance p2, Ll/۫᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 43
    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 423
    throw p2
.end method

.method public abstract ֫(Ll/ܺ᩻ۘ;)Z
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 92
    iget v0, p0, Ll/ܽۢۘ;->᩻:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-string v0, "DSA"

    return-object v0

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "RSA"

    return-object v0

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    const-string v0, "EDDSA"

    return-object v0

    :cond_2
    const-string v0, "ECDSA"

    return-object v0
.end method

.method public abstract ܽ()I
.end method
