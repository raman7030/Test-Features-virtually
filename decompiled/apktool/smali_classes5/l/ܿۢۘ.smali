.class public final Ll/ܿۢۘ;
.super Ll/ᩳۢۘ;
.source "I7YM"


# static fields
.field public static final ۚ:[B


# instance fields
.field public ֡:[B

.field public ۖ:[B

.field public ۘ:[B

.field public ᩴ:[B

.field public ᩵:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "-----BEGIN DSA PRIVATE KEY-----"

    .line 77
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v0, "-----END DSA PRIVATE KEY-----"

    .line 78
    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ(Ljava/lang/String;)[B

    const-string v0, "ssh-dss"

    .line 397
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 393
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 329
    sput-object v0, Ll/ܿۢۘ;->ۚ:[B

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;)V
    .locals 7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 42
    invoke-direct/range {v0 .. v6}, Ll/ܿۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B[B)V

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;[B[B[B[B[B)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/ᩳۢۘ;-><init>(Ll/᩹᩷ۘ;)V

    .line 48
    iput-object p2, p0, Ll/ܿۢۘ;->ۘ:[B

    .line 49
    iput-object p3, p0, Ll/ܿۢۘ;->ᩴ:[B

    .line 50
    iput-object p4, p0, Ll/ܿۢۘ;->ۖ:[B

    .line 51
    iput-object p5, p0, Ll/ܿۢۘ;->֡:[B

    .line 52
    iput-object p6, p0, Ll/ܿۢۘ;->᩵:[B

    if-eqz p2, :cond_0

    .line 54
    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, p2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;
    .locals 8

    const/4 v0, 0x7

    const-string v1, "invalid key format"

    .line 408
    invoke-virtual {p1, v0, v1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    const/4 v0, 0x1

    .line 410
    aget-object v3, p1, v0

    const/4 v0, 0x2

    .line 411
    aget-object v4, p1, v0

    const/4 v0, 0x3

    .line 412
    aget-object v5, p1, v0

    const/4 v0, 0x4

    .line 413
    aget-object v6, p1, v0

    const/4 v0, 0x5

    .line 414
    aget-object v7, p1, v0

    .line 415
    new-instance v0, Ll/ܿۢۘ;

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Ll/ܿۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B[B[B[B)V

    const/4 p0, 0x6

    .line 416
    aget-object p0, p1, p0

    invoke-static {p0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    const/4 p0, 0x0

    .line 417
    iput p0, v0, Ll/ᩳۢۘ;->ۡ:I

    return-object v0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 442
    iget-object v0, p0, Ll/ܿۢۘ;->᩵:[B

    invoke-static {v0}, Ll/᩵ۡۘ;->ۧ([B)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;[B)[B
    .locals 0

    .line 371
    invoke-virtual {p0, p2}, Ll/ܿۢۘ;->ۧ([B)[B

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()[B
    .locals 4

    .line 919
    iget-boolean v0, p0, Ll/ᩳۢۘ;->ܽ:Z

    if-nez v0, :cond_0

    .line 426
    new-instance v0, Ll/ܺ᩻ۘ;

    invoke-direct {v0}, Ll/ܺ᩻ۘ;-><init>()V

    .line 427
    sget-object v1, Ll/ܿۢۘ;->ۚ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 428
    iget-object v1, p0, Ll/ܿۢۘ;->ۘ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 429
    iget-object v1, p0, Ll/ܿۢۘ;->ᩴ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 430
    iget-object v1, p0, Ll/ܿۢۘ;->ۖ:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 431
    iget-object v1, p0, Ll/ܿۢۘ;->֡:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 432
    iget-object v1, p0, Ll/ܿۢۘ;->᩵:[B

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 433
    iget-object v1, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 397
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v1, v2}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 433
    invoke-virtual {v0, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 434
    invoke-virtual {v0}, Ll/ܺ᩻ۘ;->ᩳ()I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 435
    invoke-virtual {v0, v3, v1, v2}, Ll/ܺ᩻ۘ;->֫(II[B)V

    return-object v2

    .line 424
    :cond_0
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "key is encrypted."

    .line 39
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 424
    throw v0
.end method

.method public final ۧ([B)[B
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "signature.dss"

    .line 350
    invoke-static {v1}, Ll/᩶᩷ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ll/ܿۡۘ;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 351
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۡۘ;

    .line 352
    invoke-interface {v1}, Ll/ᩳۡۘ;->init()V

    .line 353
    iget-object v2, p0, Ll/ܿۢۘ;->᩵:[B

    iget-object v3, p0, Ll/ܿۢۘ;->ۘ:[B

    iget-object v4, p0, Ll/ܿۢۘ;->ᩴ:[B

    iget-object v5, p0, Ll/ܿۢۘ;->ۖ:[B

    invoke-interface {v1, v2, v3, v4, v5}, Ll/ܿۡۘ;->֫([B[B[B[B)V

    .line 355
    invoke-interface {v1, p1}, Ll/ᩳۡۘ;->update([B)V

    .line 356
    invoke-interface {v1}, Ll/ᩳۡۘ;->sign()[B

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [[B

    .line 359
    sget-object v2, Ll/ܿۢۘ;->ۚ:[B

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    .line 360
    invoke-static {v1}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object p1

    iget-object p1, p1, Ll/ܺ᩻ۘ;->֫:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 362
    :catch_0
    iget-object p1, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 362
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method

.method public final ܳ()[B
    .locals 5

    const/4 v0, 0x1

    .line 92
    invoke-static {v0}, Ll/ᩳۢۘ;->֫(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    iget-object v2, p0, Ll/ܿۢۘ;->ۘ:[B

    array-length v2, v2

    .line 93
    invoke-static {v2}, Ll/ᩳۢۘ;->֫(I)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/ܿۢۘ;->ۘ:[B

    array-length v2, v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    iget-object v2, p0, Ll/ܿۢۘ;->ᩴ:[B

    array-length v2, v2

    .line 94
    invoke-static {v2}, Ll/ᩳۢۘ;->֫(I)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/ܿۢۘ;->ᩴ:[B

    array-length v2, v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    iget-object v2, p0, Ll/ܿۢۘ;->ۖ:[B

    array-length v2, v2

    .line 95
    invoke-static {v2}, Ll/ᩳۢۘ;->֫(I)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/ܿۢۘ;->ۖ:[B

    array-length v2, v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    iget-object v2, p0, Ll/ܿۢۘ;->֡:[B

    array-length v2, v2

    .line 96
    invoke-static {v2}, Ll/ᩳۢۘ;->֫(I)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/ܿۢۘ;->֡:[B

    array-length v2, v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    iget-object v2, p0, Ll/ܿۢۘ;->᩵:[B

    array-length v2, v2

    .line 97
    invoke-static {v2}, Ll/ᩳۢۘ;->֫(I)I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Ll/ܿۢۘ;->᩵:[B

    array-length v2, v2

    add-int/2addr v1, v2

    .line 99
    invoke-static {v1}, Ll/ᩳۢۘ;->֫(I)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    .line 101
    new-array v2, v2, [B

    const/4 v3, 0x0

    const/16 v4, 0x30

    .line 713
    aput-byte v4, v2, v3

    .line 714
    invoke-static {v0, v1, v2}, Ll/ᩳۢۘ;->ۧ(II[B)I

    move-result v1

    new-array v0, v0, [B

    .line 104
    invoke-static {v1, v2, v0}, Ll/ᩳۢۘ;->֫(I[B[B)I

    move-result v0

    .line 105
    iget-object v1, p0, Ll/ܿۢۘ;->ۘ:[B

    invoke-static {v0, v2, v1}, Ll/ᩳۢۘ;->֫(I[B[B)I

    move-result v0

    .line 106
    iget-object v1, p0, Ll/ܿۢۘ;->ᩴ:[B

    invoke-static {v0, v2, v1}, Ll/ᩳۢۘ;->֫(I[B[B)I

    move-result v0

    .line 107
    iget-object v1, p0, Ll/ܿۢۘ;->ۖ:[B

    invoke-static {v0, v2, v1}, Ll/ᩳۢۘ;->֫(I[B[B)I

    move-result v0

    .line 108
    iget-object v1, p0, Ll/ܿۢۘ;->֡:[B

    invoke-static {v0, v2, v1}, Ll/ᩳۢۘ;->֫(I[B[B)I

    move-result v0

    .line 109
    iget-object v1, p0, Ll/ܿۢۘ;->᩵:[B

    invoke-static {v0, v2, v1}, Ll/ᩳۢۘ;->֫(I[B[B)I

    return-object v2
.end method

.method public final ܽ([B)Z
    .locals 8

    .line 155
    iget-object v0, p0, Ll/ᩳۢۘ;->ܿ:Ll/᩹᩷ۘ;

    const/4 v1, 0x0

    :try_start_0
    iget v2, p0, Ll/ᩳۢۘ;->ۡ:I

    const/16 v3, 0x30

    const/4 v4, 0x1

    if-ne v2, v4, :cond_2

    .line 156
    aget-byte v2, p1, v1

    if-eq v2, v3, :cond_1

    .line 157
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 158
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    .line 159
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->ۘ:[B

    .line 160
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->ۖ:[B

    .line 161
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->ᩴ:[B

    .line 162
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->֡:[B

    .line 163
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܳ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->᩵:[B

    .line 164
    iget-object p1, p0, Ll/ܿۢۘ;->ۘ:[B

    if-eqz p1, :cond_0

    .line 165
    new-instance p1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ܿۢۘ;->ۘ:[B

    invoke-direct {p1, v2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    :cond_0
    return v4

    :cond_1
    return v1

    :cond_2
    const/4 v5, 0x2

    if-eq v2, v5, :cond_11

    const/4 v6, 0x5

    if-ne v2, v6, :cond_3

    goto/16 :goto_7

    :cond_3
    const/4 v6, 0x4

    if-ne v2, v6, :cond_5

    .line 188
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 189
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result p1

    .line 190
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܽ()I

    move-result v3

    if-ne p1, v3, :cond_4

    .line 196
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    .line 197
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->ۘ:[B

    .line 198
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->ᩴ:[B

    .line 199
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->ۖ:[B

    .line 200
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->֡:[B

    .line 201
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->ܿ()[B

    move-result-object p1

    iput-object p1, p0, Ll/ܿۢۘ;->᩵:[B

    .line 202
    invoke-virtual {v2}, Ll/ܺ᩻ۘ;->᩷()[B

    move-result-object p1

    .line 409
    array-length v2, p1

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 405
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, p1, v1, v2, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 202
    iput-object v5, p0, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    .line 203
    new-instance p1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ܿۢۘ;->ۘ:[B

    invoke-direct {p1, v2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    return v4

    .line 192
    :cond_4
    new-instance p1, Ll/۫᩷ۘ;

    const-string v2, "check failed"

    .line 39
    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 192
    throw p1

    .line 211
    :cond_5
    aget-byte v2, p1, v1

    if-eq v2, v3, :cond_6

    return v1

    .line 214
    :cond_6
    aget-byte v2, p1, v4

    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_7

    and-int/lit8 v2, v2, 0x7f

    const/4 v3, 0x2

    :goto_0
    add-int/lit8 v6, v2, -0x1

    if-lez v2, :cond_8

    add-int/lit8 v2, v3, 0x1

    .line 219
    aget-byte v3, p1, v3

    move v3, v2

    move v2, v6

    goto :goto_0

    :cond_7
    const/4 v3, 0x2

    .line 223
    :cond_8
    aget-byte v2, p1, v3

    if-eq v2, v5, :cond_9

    return v1

    :cond_9
    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v5

    .line 226
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_a

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_1
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_a

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 231
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_1

    :cond_a
    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v5

    .line 237
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_b

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_2
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_b

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 242
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_2

    .line 245
    :cond_b
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ܿۢۘ;->ۘ:[B

    .line 246
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v5

    .line 250
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_c

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_3
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_c

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 255
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_3

    .line 258
    :cond_c
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ܿۢۘ;->ᩴ:[B

    .line 259
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v5

    .line 263
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_d

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_4
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_d

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 268
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_4

    .line 271
    :cond_d
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ܿۢۘ;->ۖ:[B

    .line 272
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v5

    .line 276
    aget-byte v2, p1, v2

    and-int/lit16 v6, v2, 0xff

    and-int/lit16 v7, v2, 0x80

    if-eqz v7, :cond_e

    and-int/lit8 v2, v2, 0x7f

    const/4 v6, 0x0

    :goto_5
    add-int/lit8 v7, v2, -0x1

    if-lez v2, :cond_e

    shl-int/lit8 v2, v6, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 281
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v6

    move v6, v2

    move v2, v7

    goto :goto_5

    .line 284
    :cond_e
    new-array v2, v6, [B

    iput-object v2, p0, Ll/ܿۢۘ;->֡:[B

    .line 285
    invoke-static {p1, v3, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v6

    add-int/lit8 v2, v3, 0x1

    add-int/2addr v3, v5

    .line 289
    aget-byte v2, p1, v2

    and-int/lit16 v5, v2, 0xff

    and-int/lit16 v6, v2, 0x80

    if-eqz v6, :cond_f

    and-int/lit8 v2, v2, 0x7f

    const/4 v5, 0x0

    :goto_6
    add-int/lit8 v6, v2, -0x1

    if-lez v2, :cond_f

    shl-int/lit8 v2, v5, 0x8

    add-int/lit8 v5, v3, 0x1

    .line 294
    aget-byte v3, p1, v3

    and-int/lit16 v3, v3, 0xff

    add-int/2addr v2, v3

    move v3, v5

    move v5, v2

    move v2, v6

    goto :goto_6

    .line 297
    :cond_f
    new-array v2, v5, [B

    iput-object v2, p0, Ll/ܿۢۘ;->᩵:[B

    .line 298
    invoke-static {p1, v3, v2, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 301
    iget-object p1, p0, Ll/ܿۢۘ;->ۘ:[B

    if-eqz p1, :cond_10

    .line 302
    new-instance p1, Ljava/math/BigInteger;

    iget-object v2, p0, Ll/ܿۢۘ;->ۘ:[B

    invoke-direct {p1, v2}, Ljava/math/BigInteger;-><init>([B)V

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    :cond_10
    return v4

    .line 170
    :cond_11
    :goto_7
    new-instance v2, Ll/ܺ᩻ۘ;

    invoke-direct {v2, p1}, Ll/ܺ᩻ۘ;-><init>([B)V

    .line 171
    array-length p1, p1

    invoke-virtual {v2, p1}, Ll/ܺ᩻ۘ;->ܽ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string p1, ""

    .line 174
    invoke-virtual {v2, v4, p1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    .line 175
    aget-object p1, p1, v1

    iput-object p1, p0, Ll/ܿۢۘ;->᩵:[B
    :try_end_1
    .catch Ll/۫᩷ۘ; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return v4

    .line 177
    :catch_0
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return v1

    .line 304
    :catch_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    sget-object p1, Ll/᩶᩷ۘ;->ܳ:Ll/ۚۢۘ;

    .line 304
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method public final ܿ()[B
    .locals 7

    .line 314
    invoke-super {p0}, Ll/ᩳۢۘ;->ܿ()[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 318
    :cond_0
    iget-object v0, p0, Ll/ܿۢۘ;->ۘ:[B

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 323
    :cond_1
    iget-object v1, p0, Ll/ܿۢۘ;->ᩴ:[B

    .line 324
    iget-object v2, p0, Ll/ܿۢۘ;->ۖ:[B

    .line 325
    iget-object v3, p0, Ll/ܿۢۘ;->֡:[B

    const/4 v4, 0x5

    new-array v4, v4, [[B

    sget-object v5, Ll/ܿۢۘ;->ۚ:[B

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    aput-object v0, v4, v5

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v2, v4, v0

    const/4 v0, 0x4

    aput-object v3, v4, v0

    .line 326
    invoke-static {v4}, Ll/ܺ᩻ۘ;->֫([[B)Ll/ܺ᩻ۘ;

    move-result-object v0

    iget-object v0, v0, Ll/ܺ᩻ۘ;->֫:[B

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 333
    sget-object v0, Ll/ܿۢۘ;->ۚ:[B

    return-object v0
.end method
