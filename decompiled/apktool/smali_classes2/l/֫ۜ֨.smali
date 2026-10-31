.class public final Ll/֫ۜ֨;
.super Ljava/io/InputStream;
.source "G1S8"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:Z

.field public ۙ:Ljava/io/DataInputStream;

.field public ۛ:Z

.field public ۤ:Z

.field public ۨ:Ll/֨᩷֨;

.field public ۫:Ll/᩷᩷֨;

.field public ۬:Ll/᩺ۜ֨;

.field public ܰ:I

.field public ᩶:Ljava/io/IOException;

.field public final ᩸:Ll/ۘ᩻֨;

.field public ᩹:Z

.field public final ᩺:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;ILl/ۘ᩻֨;)V
    .locals 2

    .line 160
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Ll/֫ۜ֨;->ܰ:I

    .line 50
    iput-boolean v0, p0, Ll/֫ۜ֨;->ۗ:Z

    const/4 v1, 0x1

    .line 52
    iput-boolean v1, p0, Ll/֫ۜ֨;->ۤ:Z

    .line 53
    iput-boolean v1, p0, Ll/֫ۜ֨;->ۛ:Z

    .line 54
    iput-boolean v0, p0, Ll/֫ۜ֨;->᩹:Z

    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Ll/֫ۜ֨;->᩶:Ljava/io/IOException;

    new-array v0, v1, [B

    .line 58
    iput-object v0, p0, Ll/֫ۜ֨;->᩺:[B

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    iput-object p3, p0, Ll/֫ۜ֨;->᩸:Ll/ۘ᩻֨;

    .line 167
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    .line 168
    new-instance p1, Ll/֨᩷֨;

    invoke-direct {p1, p3}, Ll/֨᩷֨;-><init>(Ll/ۘ᩻֨;)V

    iput-object p1, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    .line 169
    new-instance p1, Ll/᩺ۜ֨;

    invoke-static {p2}, Ll/֫ۜ֨;->֫(I)I

    move-result p2

    invoke-direct {p1, p2, p3}, Ll/᩺ۜ֨;-><init>(ILl/ۘ᩻֨;)V

    iput-object p1, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    return-void
.end method

.method public static ֫(I)I
    .locals 2

    const/16 v0, 0x1000

    if-lt p0, v0, :cond_0

    const v0, 0x7ffffff0

    if-gt p0, v0, :cond_0

    add-int/lit8 p0, p0, 0xf

    and-int/lit8 p0, p0, -0x10

    return p0

    .line 79
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported dictionary size "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 79
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫()V
    .locals 11

    .line 279
    iget-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 282
    iput-boolean v1, p0, Ll/֫ۜ֨;->᩹:Z

    .line 373
    iget-object v0, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    if-eqz v0, :cond_0

    .line 374
    iget-object v1, p0, Ll/֫ۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-virtual {v0, v1}, Ll/᩺ۜ֨;->֫(Ll/ۘ᩻֨;)V

    const/4 v0, 0x0

    .line 375
    iput-object v0, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    .line 377
    iget-object v2, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    invoke-virtual {v2, v1}, Ll/֨᩷֨;->֫(Ll/ۘ᩻֨;)V

    .line 378
    iput-object v0, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    :cond_0
    return-void

    :cond_1
    const/16 v2, 0xe0

    const/4 v3, 0x0

    if-ge v0, v2, :cond_4

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 291
    :cond_2
    iget-boolean v4, p0, Ll/֫ۜ֨;->ۤ:Z

    if-nez v4, :cond_3

    goto :goto_1

    .line 292
    :cond_3
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    .line 288
    :cond_4
    :goto_0
    iput-boolean v1, p0, Ll/֫ۜ֨;->ۛ:Z

    .line 289
    iput-boolean v3, p0, Ll/֫ۜ֨;->ۤ:Z

    .line 290
    iget-object v4, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    invoke-virtual {v4}, Ll/᩺ۜ֨;->ܿ()V

    :goto_1
    const/16 v4, 0x80

    if-lt v0, v4, :cond_a

    .line 296
    iput-boolean v1, p0, Ll/֫ۜ֨;->ۗ:Z

    and-int/lit8 v4, v0, 0x1f

    shl-int/lit8 v4, v4, 0x10

    .line 298
    iput v4, p0, Ll/֫ۜ֨;->ܰ:I

    .line 299
    iget-object v5, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v5}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v5

    add-int/2addr v5, v1

    add-int/2addr v5, v4

    iput v5, p0, Ll/֫ۜ֨;->ܰ:I

    .line 301
    iget-object v4, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    add-int/2addr v4, v1

    const/16 v1, 0xc0

    if-lt v0, v1, :cond_7

    .line 304
    iput-boolean v3, p0, Ll/֫ۜ֨;->ۛ:Z

    .line 326
    iget-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    if-gt v0, v2, :cond_6

    .line 331
    div-int/lit8 v10, v0, 0x2d

    mul-int/lit8 v1, v10, 0x2d

    sub-int/2addr v0, v1

    .line 333
    div-int/lit8 v9, v0, 0x9

    mul-int/lit8 v1, v9, 0x9

    sub-int v8, v0, v1

    add-int v0, v8, v9

    const/4 v1, 0x4

    if-gt v0, v1, :cond_5

    .line 339
    new-instance v0, Ll/᩷᩷֨;

    iget-object v6, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    iget-object v7, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Ll/᩷᩷֨;-><init>(Ll/᩺ۜ֨;Ll/ۚ᩷֨;III)V

    iput-object v0, p0, Ll/֫ۜ֨;->۫:Ll/᩷᩷֨;

    goto :goto_2

    .line 337
    :cond_5
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    .line 329
    :cond_6
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    .line 307
    :cond_7
    iget-boolean v1, p0, Ll/֫ۜ֨;->ۛ:Z

    if-nez v1, :cond_9

    const/16 v1, 0xa0

    if-lt v0, v1, :cond_8

    .line 311
    iget-object v0, p0, Ll/֫ۜ֨;->۫:Ll/᩷᩷֨;

    invoke-virtual {v0}, Ll/᩷᩷֨;->֫()V

    .line 314
    :cond_8
    :goto_2
    iget-object v0, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    iget-object v1, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v0, v4, v1}, Ll/֨᩷֨;->֫(ILjava/io/DataInputStream;)V

    return-void

    .line 308
    :cond_9
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    :cond_a
    const/4 v2, 0x2

    if-gt v0, v2, :cond_b

    .line 320
    iput-boolean v3, p0, Ll/֫ۜ֨;->ۗ:Z

    .line 321
    iget-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Ll/֫ۜ֨;->ܰ:I

    return-void

    .line 317
    :cond_b
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0
.end method

.method public static ۧ(I)I
    .locals 0

    .line 74
    invoke-static {p0}, Ll/֫ۜ֨;->֫(I)I

    move-result p0

    div-int/lit16 p0, p0, 0x400

    add-int/lit8 p0, p0, 0x68

    return p0
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 362
    iget-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    if-eqz v0, :cond_2

    .line 365
    iget-object v1, p0, Ll/֫ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_1

    .line 368
    iget-boolean v1, p0, Ll/֫ۜ֨;->ۗ:Z

    if-eqz v1, :cond_0

    iget v0, p0, Ll/֫ۜ֨;->ܰ:I

    return v0

    .line 369
    :cond_0
    iget v1, p0, Ll/֫ۜ֨;->ܰ:I

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    .line 366
    :cond_1
    throw v1

    .line 363
    :cond_2
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 363
    throw v0
.end method

.method public final close()V
    .locals 3

    .line 390
    iget-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    if-eqz v0, :cond_1

    .line 373
    iget-object v0, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 374
    iget-object v2, p0, Ll/֫ۜ֨;->᩸:Ll/ۘ᩻֨;

    invoke-virtual {v0, v2}, Ll/᩺ۜ֨;->֫(Ll/ۘ᩻֨;)V

    .line 375
    iput-object v1, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    .line 377
    iget-object v0, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    invoke-virtual {v0, v2}, Ll/֨᩷֨;->֫(Ll/ۘ᩻֨;)V

    .line 378
    iput-object v1, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    .line 394
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 396
    iput-object v1, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    .line 397
    throw v0

    :cond_1
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 196
    iget-object v1, p0, Ll/֫ۜ֨;->᩺:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/֫ۜ֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 4

    if-ltz p2, :cond_8

    if-ltz p3, :cond_8

    add-int v0, p2, p3

    if-ltz v0, :cond_8

    .line 225
    array-length v1, p1

    if-gt v0, v1, :cond_8

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 231
    :cond_0
    iget-object v1, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    if-eqz v1, :cond_7

    .line 234
    iget-object v1, p0, Ll/֫ۜ֨;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_6

    .line 237
    iget-boolean v1, p0, Ll/֫ۜ֨;->᩹:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-lez p3, :cond_5

    .line 244
    :try_start_0
    iget v1, p0, Ll/֫ۜ֨;->ܰ:I

    if-nez v1, :cond_2

    .line 245
    invoke-direct {p0}, Ll/֫ۜ֨;->֫()V

    .line 246
    iget-boolean v1, p0, Ll/֫ۜ֨;->᩹:Z

    if-eqz v1, :cond_2

    if-nez v0, :cond_5

    :goto_1
    const/4 p1, -0x1

    return p1

    .line 250
    :cond_2
    iget v1, p0, Ll/֫ۜ֨;->ܰ:I

    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 252
    iget-boolean v2, p0, Ll/֫ۜ֨;->ۗ:Z

    if-nez v2, :cond_3

    .line 253
    iget-object v2, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    iget-object v3, p0, Ll/֫ۜ֨;->ۙ:Ljava/io/DataInputStream;

    invoke-virtual {v2, v1, v3}, Ll/᩺ۜ֨;->֫(ILjava/io/DataInputStream;)V

    goto :goto_2

    .line 255
    :cond_3
    iget-object v2, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    invoke-virtual {v2, v1}, Ll/᩺ۜ֨;->ۧ(I)V

    .line 256
    iget-object v1, p0, Ll/֫ۜ֨;->۫:Ll/᩷᩷֨;

    invoke-virtual {v1}, Ll/᩷᩷֨;->ۧ()V

    .line 259
    :goto_2
    iget-object v1, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    invoke-virtual {v1, p2, p1}, Ll/᩺ۜ֨;->֫(I[B)I

    move-result v1

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    add-int/2addr v0, v1

    .line 263
    iget v2, p0, Ll/֫ۜ֨;->ܰ:I

    sub-int/2addr v2, v1

    iput v2, p0, Ll/֫ۜ֨;->ܰ:I

    if-nez v2, :cond_1

    .line 266
    iget-object v1, p0, Ll/֫ۜ֨;->ۨ:Ll/֨᩷֨;

    invoke-virtual {v1}, Ll/֨᩷֨;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/֫ۜ֨;->۬:Ll/᩺ۜ֨;

    invoke-virtual {v1}, Ll/᩺ۜ֨;->ۧ()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    .line 267
    :cond_4
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 273
    iput-object p1, p0, Ll/֫ۜ֨;->᩶:Ljava/io/IOException;

    .line 274
    throw p1

    :cond_5
    return v0

    .line 235
    :cond_6
    throw v1

    .line 232
    :cond_7
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 232
    throw p1

    .line 226
    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
