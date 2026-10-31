.class public final Ll/ۘۢۘ;
.super Ll/ᩳۢۘ;
.source "B7ZX"


# static fields
.field public static final ܶ:[B


# instance fields
.field public ֡:[B

.field public ֨:[B

.field public ۖ:[B

.field public ۘ:[B

.field public ۚ:[B

.field public ۠:[B

.field public ᩴ:[B

.field public ᩵:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "-----BEGIN RSA PRIVATE KEY-----"

    .line 82
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v0, "-----END RSA PRIVATE KEY-----"

    .line 83
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v0, "ssh-rsa"

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 408
    sput-object v0, Ll/ۘۢۘ;->ܶ:[B

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, v0, v0, v0}, Ll/ۘۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B)V

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;[B[B[B)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Ll/ᩳۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    .line 50
    iput-object p2, p0, Ll/ۘۢۘ;->᩵:[B

    .line 51
    iput-object p3, p0, Ll/ۘۢۘ;->֨:[B

    .line 52
    iput-object p4, p0, Ll/ۘۢۘ;->ۚ:[B

    if-eqz p2, :cond_0

    .line 54
    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;
    .locals 4

    const/16 v0, 0x8

    const-string v1, "invalid key format"

    .line 485
    invoke-virtual {p1, v0, v1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    const/4 v0, 0x1

    .line 487
    aget-object v0, p1, v0

    const/4 v1, 0x2

    .line 488
    aget-object v1, p1, v1

    const/4 v2, 0x3

    .line 489
    aget-object v2, p1, v2

    .line 490
    new-instance v3, Ll/ۘۢۘ;

    invoke-direct {v3, p0, v0, v1, v2}, Ll/ۘۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B)V

    const/4 p0, 0x4

    .line 491
    aget-object p0, p1, p0

    iput-object p0, v3, Ll/ۘۢۘ;->ۖ:[B

    const/4 p0, 0x5

    .line 492
    aget-object p0, p1, p0

    iput-object p0, v3, Ll/ۘۢۘ;->֡:[B

    const/4 p0, 0x6

    .line 493
    aget-object p0, p1, p0

    iput-object p0, v3, Ll/ۘۢۘ;->۠:[B

    const/4 p0, 0x7

    .line 494
    aget-object p0, p1, p0

    invoke-static {p0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v3, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    const/4 p0, 0x0

    .line 495
    iput p0, v3, Ll/ᩳۢۘ;->ۡ:I

    return-object v3
.end method

.method private ۜ()V
    .locals 3

    .line 527
    iget-object v0, p0, Ll/ۘۢۘ;->ᩴ:[B

    if-nez v0, :cond_0

    .line 528
    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Ll/ۘۢۘ;->ۚ:[B

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    new-instance v1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ۘۢۘ;->۠:[B

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>([B)V

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 529
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/ۘۢۘ;->ᩴ:[B

    :cond_0
    return-void
.end method

.method private ܳ()[B
    .locals 3

    .line 535
    iget-object v0, p0, Ll/ۘۢۘ;->ۖ:[B

    if-nez v0, :cond_0

    .line 536
    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Ll/ۘۢۘ;->۠:[B

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    new-instance v1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ۘۢۘ;->֡:[B

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->modInverse(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/ۘۢۘ;->ۖ:[B

    .line 538
    :cond_0
    iget-object v0, p0, Ll/ۘۢۘ;->ۖ:[B

    return-object v0
.end method

.method private ᩻()V
    .locals 3

    .line 519
    iget-object v0, p0, Ll/ۘۢۘ;->ۘ:[B

    if-nez v0, :cond_0

    .line 520
    new-instance v0, Ljava/math/BigInteger;

    iget-object v1, p0, Ll/ۘۢۘ;->ۚ:[B

    invoke-direct {v0, v1}, Ljava/math/BigInteger;-><init>([B)V

    new-instance v1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ۘۢۘ;->֡:[B

    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>([B)V

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 521
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/ۘۢۘ;->ۘ:[B

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 544
    iget-object v0, p0, Ll/ۘۢۘ;->ۚ:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)[B
    .locals 4

    const/4 v0, 0x0

    .line 434
    :try_start_0
    invoke-static {p1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ۜۡۘ;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 435
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۡۘ;

    .line 436
    invoke-interface {v1}, Ll/ᩳۡۘ;->init()V

    .line 437
    iget-object v2, p0, Ll/ۘۢۘ;->ۚ:[B

    iget-object v3, p0, Ll/ۘۢۘ;->᩵:[B

    invoke-interface {v1, v2, v3}, Ll/ۜۡۘ;->ۧ([B[B)V

    .line 439
    invoke-interface {v1, p2}, Ll/ᩳۡۘ;->update([B)V

    .line 440
    invoke-interface {v1}, Ll/ᩳۡۘ;->sign()[B

    move-result-object p2

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [[B

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    .line 444
    invoke-static {v1}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object p1

    iget-object p1, p1, Ll/ܺ᩻ۘ;->֫:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 446
    :catch_0
    iget-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 446
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ۧ()[B
    .locals 4

    .line 919
    iget-boolean v0, p0, Ll/ᩳۢۘ;->ܽ:Z

    if-nez v0, :cond_0

    .line 504
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0}, Ll/ܺ᩻ۘ;-><init>()V

    .line 505
    sget-object v1, Ll/ۘۢۘ;->ܶ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 506
    iget-object v1, p0, Ll/ۘۢۘ;->᩵:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 507
    iget-object v1, p0, Ll/ۘۢۘ;->֨:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 508
    iget-object v1, p0, Ll/ۘۢۘ;->ۚ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 509
    invoke-direct {p0}, Ll/ۘۢۘ;->ܳ()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 510
    iget-object v1, p0, Ll/ۘۢۘ;->֡:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 511
    iget-object v1, p0, Ll/ۘۢۘ;->۠:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 512
    iget-object v1, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 512
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 513
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 514
    invoke-virtual {v0, v3, v1, v2}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-object v2

    .line 502
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "key is encrypted."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 502
    throw v0
.end method

.method public final ۧ([B)[B
    .locals 1

    const-string v0, "ssh-rsa"

    .line 427
    invoke-virtual {p0, v0, p1}, Ll/ۘۢۘ;->֫(Ljava/lang/String;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ܽ([B)Z
    .locals 8

    .line 169
    iget-object v0, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    const/4 v1, 0x0

    .line 172
    :try_start_0
    iget v2, p0, Ll/ᩳۢۘ;->ۡ:I

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq v2, v4, :cond_13

    const/4 v6, 0x5

    if-ne v2, v6, :cond_0

    goto/16 :goto_a

    :cond_0
    if-ne v2, v5, :cond_3

    .line 196
    aget-byte v2, p1, v1

    const/16 v3, 0x30

    if-eq v2, v3, :cond_2

    .line 197
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 198
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->֨:[B

    .line 199
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->ۚ:[B

    .line 200
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->᩵:[B

    .line 201
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    .line 202
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->֡:[B

    .line 203
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->۠:[B

    .line 204
    iget-object p1, p0, Ll/ۘۢۘ;->᩵:[B

    if-eqz p1, :cond_1

    .line 205
    new-instance p1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ۘۢۘ;->᩵:[B

    invoke-direct {p1, v2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    .line 208
    :cond_1
    invoke-direct {p0}, Ll/ۘۢۘ;->᩻()V

    .line 209
    invoke-direct {p0}, Ll/ۘۢۘ;->ۜ()V

    .line 210
    invoke-direct {p0}, Ll/ۘۢۘ;->ܳ()[B

    return v5

    .line 214
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    :cond_3
    if-ne v2, v3, :cond_5

    .line 222
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 223
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 224
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v3

    if-ne p1, v3, :cond_4

    .line 229
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    .line 230
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->᩵:[B

    .line 231
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->֨:[B

    .line 232
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->ۚ:[B

    .line 233
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->ۖ:[B

    .line 234
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->֡:[B

    .line 235
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘۢۘ;->۠:[B

    .line 236
    new-instance p1, Ljava/math/BigInteger;

    iget-object v3, p0, Ll/ۘۢۘ;->᩵:[B

    invoke-direct {p1, v3}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    .line 237
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 409
    array-length v2, p1

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p1, v1, v2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 237
    iput-object v4, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 239
    invoke-direct {p0}, Ll/ۘۢۘ;->᩻()V

    .line 240
    invoke-direct {p0}, Ll/ۘۢۘ;->ۜ()V

    return v5

    .line 226
    :cond_4
    new-instance p1, Ll/۫᩷ۘ;

    const-string v2, "check failed"

    .line 39
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 226
    throw p1

    .line 254
    :cond_5
    aget-byte v2, p1, v5

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_6

    and-int/lit8 v2, v2, 0x7f

    const/4 v3, 0x2

    :goto_0
    add-int/lit8 v6, v2, -0x1

    if-lez v2, :cond_7

    add-int/lit8 v2, v3, 0x1

    .line 259
    aget-byte v3, p1, v3

    move v3, v2

    move v2, v6

    goto :goto_0

    :cond_6
    const/4 v3, 0x2

    .line 263
    :cond_7
    aget-byte v2, p1, v3

    if-eq v2, v4, :cond_8

    goto/16 :goto_b

    :cond_8
    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 266
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_9

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_9

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 271
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_1

    :cond_9
    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 277
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_a

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_2
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_a

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 282
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_2

    .line 285
    :cond_a
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->᩵:[B

    .line 286
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 290
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_b

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_3
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_b

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 295
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_3

    .line 298
    :cond_b
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->֨:[B

    .line 299
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 303
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_c

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_4
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_c

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 308
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_4

    .line 311
    :cond_c
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->ۚ:[B

    .line 312
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 316
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_d

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_5
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_d

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 321
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_5

    .line 324
    :cond_d
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->֡:[B

    .line 325
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 329
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_e

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_6
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_e

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 334
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_6

    .line 337
    :cond_e
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->۠:[B

    .line 338
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 342
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_f

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_7
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_f

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 347
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_7

    .line 350
    :cond_f
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->ۘ:[B

    .line 351
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 355
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_10

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_8
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_10

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 360
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_8

    .line 363
    :cond_10
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ۘۢۘ;->ᩴ:[B

    .line 364
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v4

    .line 368
    aget-byte v2, p1, v2

    and-int/lit16 v4, v2, 0xff

    and-int/lit16 v6, v2, 0x80

    if-eqz v6, :cond_11

    and-int/lit8 v2, v2, 0x7f

    const/4 v4, 0x0

    :goto_9
    add-int/lit8 v6, v2, -0x1

    if-lez v2, :cond_11

    shl-int/lit8 v2, v4, 0x8

    add-int/lit8 v4, v3, 0x1

    .line 373
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v4

    move v4, v2

    move v2, v6

    goto :goto_9

    .line 376
    :cond_11
    new-array v2, v4, [B

    iput-object v2, p0, Ll/ۘۢۘ;->ۖ:[B

    .line 377
    invoke-static {p1, v3, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 380
    iget-object p1, p0, Ll/ۘۢۘ;->᩵:[B

    if-eqz p1, :cond_12

    .line 381
    new-instance p1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ۘۢۘ;->᩵:[B

    invoke-direct {p1, v2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    :cond_12
    return v5

    .line 173
    :cond_13
    :goto_a
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 174
    array-length p1, p1

    invoke-virtual {v2, p1}, Ll/ܺ᩻ۘ;->ܽ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string p1, ""

    .line 177
    invoke-virtual {v2, v3, p1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    .line 178
    aget-object v2, p1, v1

    iput-object v2, p0, Ll/ۘۢۘ;->ۚ:[B

    .line 179
    aget-object v2, p1, v5

    iput-object v2, p0, Ll/ۘۢۘ;->֡:[B

    .line 180
    aget-object v2, p1, v4

    iput-object v2, p0, Ll/ۘۢۘ;->۠:[B

    const/4 v2, 0x3

    .line 181
    aget-object p1, p1, v2

    iput-object p1, p0, Ll/ۘۢۘ;->ۖ:[B
    :try_end_1
    .catch Ll/۫᩷ۘ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 189
    :try_start_2
    invoke-direct {p0}, Ll/ۘۢۘ;->᩻()V

    .line 190
    invoke-direct {p0}, Ll/ۘۢۘ;->ۜ()V

    return v5

    .line 183
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_b
    return v1

    .line 385
    :catch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method public final ܿ()[B
    .locals 5

    .line 395
    invoke-super {p0}, Ll/ᩳۢۘ;->ܿ()[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 399
    :cond_0
    iget-object v0, p0, Ll/ۘۢۘ;->֨:[B

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 404
    :cond_1
    iget-object v1, p0, Ll/ۘۢۘ;->᩵:[B

    const/4 v2, 0x3

    new-array v2, v2, [[B

    sget-object v3, Ll/ۘۢۘ;->ܶ:[B

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    .line 405
    invoke-static {v2}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܺ᩻ۘ;->֫:[B

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 412
    sget-object v0, Ll/ۘۢۘ;->ܶ:[B

    return-object v0
.end method
